package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new modularization.ui_components.test.DataBinderMapperImpl());
  }
}
