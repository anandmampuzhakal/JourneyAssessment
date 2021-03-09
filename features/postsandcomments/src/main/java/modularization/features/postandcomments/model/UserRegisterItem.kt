package modularization.features.postandcomments.model

import android.os.Parcelable
import androidx.databinding.ObservableField
import kotlinx.parcelize.Parcelize

@Parcelize
class UserRegisterItem(val numberInWords: ObservableField<String> = ObservableField("0")
) : Parcelable