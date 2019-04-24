// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.text.TextUtils;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

static class TextInputLayout$SavedState extends AbsSavedState
{

	public String toString()
	{
		return (new StringBuilder()).append("TextInputLayout.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" error=").append(((Object) (error))).append("}").toString();
	//    0    0:new             #57  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void StringBuilder()>
	//    3    7:ldc1            #60  <String "TextInputLayout.SavedState{">
	//    4    9:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokestatic    #70  <Method int System.identityHashCode(Object)>
	//    7   16:invokestatic    #76  <Method String Integer.toHexString(int)>
	//    8   19:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #78  <String " error=">
	//   10   24:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #42  <Field CharSequence error>
	//   13   31:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
	//   14   34:ldc1            #83  <String "}">
	//   15   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   17   42:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #89  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		TextUtils.writeToParcel(error, parcel, i);
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field CharSequence error>
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokestatic    #92  <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		if(isPasswordToggledVisible)
	//*   9   15:aload_0         
	//*  10   16:getfield        #50  <Field boolean isPasswordToggledVisible>
	//*  11   19:ifeq            30
			i = 1;
	//   12   22:iconst_1        
	//   13   23:istore_2        
		else
	//*  14   24:aload_1         
	//*  15   25:iload_2         
	//*  16   26:invokevirtual   #96  <Method void Parcel.writeInt(int)>
	//*  17   29:return          
			i = 0;
	//   18   30:iconst_0        
	//   19   31:istore_2        
		parcel.writeInt(i);
	//*  20   32:goto            24
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public TextInputLayout.SavedState createFromParcel(Parcel parcel)
		{
			return new TextInputLayout.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class TextInputLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void TextInputLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public TextInputLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return new TextInputLayout.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class TextInputLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void TextInputLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #26  <Method TextInputLayout$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #29  <Method TextInputLayout$SavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public TextInputLayout.SavedState[] newArray(int i)
		{
			return new TextInputLayout.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       TextInputLayout.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #34  <Method TextInputLayout$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	CharSequence error;
	boolean isPasswordToggledVisible;

	static 
	{
	//    0    0:new             #9   <Class TextInputLayout$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void TextInputLayout$SavedState$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	TextInputLayout$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void AbsSavedState(Parcel, ClassLoader)>
		error = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//    4    6:aload_0         
	//    5    7:getstatic       #32  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//    6   10:aload_1         
	//    7   11:invokeinterface #38  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//    8   16:checkcast       #40  <Class CharSequence>
	//    9   19:putfield        #42  <Field CharSequence error>
		boolean flag;
		if(parcel.readInt() == 1)
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #48  <Method int Parcel.readInt()>
	//*  12   26:iconst_1        
	//*  13   27:icmpne          38
			flag = true;
	//   14   30:iconst_1        
	//   15   31:istore_3        
		else
	//*  16   32:aload_0         
	//*  17   33:iload_3         
	//*  18   34:putfield        #50  <Field boolean isPasswordToggledVisible>
	//*  19   37:return          
			flag = false;
	//   20   38:iconst_0        
	//   21   39:istore_3        
		isPasswordToggledVisible = flag;
	//*  22   40:goto            32
	}

	TextInputLayout$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
