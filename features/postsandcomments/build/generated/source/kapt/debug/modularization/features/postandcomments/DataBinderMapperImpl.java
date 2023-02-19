package modularization.features.postandcomments;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import modularization.features.postandcomments.databinding.CardItemBindingImpl;
import modularization.features.postandcomments.databinding.FragmentGetUserSelectBindingImpl;
import modularization.features.postandcomments.databinding.FragmentUserPostsCommentsBindingImpl;
import modularization.features.postandcomments.databinding.PostWithCommentsItemBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CARDITEM = 1;

  private static final int LAYOUT_FRAGMENTGETUSERSELECT = 2;

  private static final int LAYOUT_FRAGMENTUSERPOSTSCOMMENTS = 3;

  private static final int LAYOUT_POSTWITHCOMMENTSITEM = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(modularization.features.postandcomments.R.layout.card_item, LAYOUT_CARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(modularization.features.postandcomments.R.layout.fragment_get_user_select, LAYOUT_FRAGMENTGETUSERSELECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(modularization.features.postandcomments.R.layout.fragment_user_posts_comments, LAYOUT_FRAGMENTUSERPOSTSCOMMENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(modularization.features.postandcomments.R.layout.post_with_comments_item, LAYOUT_POSTWITHCOMMENTSITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CARDITEM: {
          if ("layout/card_item_0".equals(tag)) {
            return new CardItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for card_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGETUSERSELECT: {
          if ("layout/fragment_get_user_select_0".equals(tag)) {
            return new FragmentGetUserSelectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_get_user_select is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSERPOSTSCOMMENTS: {
          if ("layout/fragment_user_posts_comments_0".equals(tag)) {
            return new FragmentUserPostsCommentsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user_posts_comments is invalid. Received: " + tag);
        }
        case  LAYOUT_POSTWITHCOMMENTSITEM: {
          if ("layout/post_with_comments_item_0".equals(tag)) {
            return new PostWithCommentsItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for post_with_comments_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(5);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.nz.anand.mvvmlibrary.DataBinderMapperImpl());
    result.add(new com.nz.anand.network.DataBinderMapperImpl());
    result.add(new com.nz.anand.technicalassessment.libraries.actions.DataBinderMapperImpl());
    result.add(new modularization.ui_components.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "usersViewModel");
      sKeys.put(2, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/card_item_0", modularization.features.postandcomments.R.layout.card_item);
      sKeys.put("layout/fragment_get_user_select_0", modularization.features.postandcomments.R.layout.fragment_get_user_select);
      sKeys.put("layout/fragment_user_posts_comments_0", modularization.features.postandcomments.R.layout.fragment_user_posts_comments);
      sKeys.put("layout/post_with_comments_item_0", modularization.features.postandcomments.R.layout.post_with_comments_item);
    }
  }
}
