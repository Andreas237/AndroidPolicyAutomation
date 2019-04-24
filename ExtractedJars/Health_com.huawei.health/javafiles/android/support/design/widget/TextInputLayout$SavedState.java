// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;
import android.text.TextUtils;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

static class TextInputLayout$SavedState extends AbsSavedState
{

	public String toString()
	{
		return (new StringBuilder()).append("TextInputLayout.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" error=").append(((Object) (error))).append("}").toString();
	//    0    0:new             #53  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void StringBuilder()>
	//    3    7:ldc1            #56  <String "TextInputLayout.SavedState{">
	//    4    9:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokestatic    #66  <Method int System.identityHashCode(Object)>
	//    7   16:invokestatic    #72  <Method String Integer.toHexString(int)>
	//    8   19:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #74  <String " error=">
	//   10   24:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #46  <Field CharSequence error>
	//   13   31:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
	//   14   34:ldc1            #79  <String "}">
	//   15   36:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   17   42:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #85  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		TextUtils.writeToParcel(error, parcel, i);
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field CharSequence error>
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokestatic    #88  <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
	//    9   15:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

		public TextInputLayout.SavedState b(Parcel parcel, ClassLoader classloader)
		{
			return new TextInputLayout.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class TextInputLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void TextInputLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public TextInputLayout.SavedState[] b(int i)
		{
			return new TextInputLayout.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       TextInputLayout.SavedState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (b(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #27  <Method TextInputLayout$SavedState b(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (b(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #31  <Method TextInputLayout$SavedState[] b(int)>
		//    3    5:areturn         
		}

	}
);
	CharSequence error;

	static 
	{
	//    0    0:new             #9   <Class TextInputLayout$SavedState$2>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void TextInputLayout$SavedState$2()>
	//    3    7:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    4   10:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   5   13:return          
	}

	TextInputLayout$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
		error = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//    4    6:aload_0         
	//    5    7:getstatic       #36  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//    6   10:aload_1         
	//    7   11:invokeinterface #42  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//    8   16:checkcast       #44  <Class CharSequence>
	//    9   19:putfield        #46  <Field CharSequence error>
	//   10   22:return          
	}

	TextInputLayout$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
