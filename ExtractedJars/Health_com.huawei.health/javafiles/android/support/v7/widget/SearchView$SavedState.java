// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.v7.widget:
//			SearchView

static class SearchView$SavedState extends AbsSavedState
{

	public String toString()
	{
		return (new StringBuilder()).append("SearchView.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" isIconified=").append(isIconified).append("}").toString();
	//    0    0:new             #52  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void StringBuilder()>
	//    3    7:ldc1            #55  <String "SearchView.SavedState{">
	//    4    9:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokestatic    #65  <Method int System.identityHashCode(Object)>
	//    7   16:invokestatic    #71  <Method String Integer.toHexString(int)>
	//    8   19:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #73  <String " isIconified=">
	//   10   24:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #45  <Field boolean isIconified>
	//   13   31:invokevirtual   #76  <Method StringBuilder StringBuilder.append(boolean)>
	//   14   34:ldc1            #78  <String "}">
	//   15   36:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   17   42:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #84  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeValue(((Object) (Boolean.valueOf(isIconified))));
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field boolean isIconified>
	//    7   11:invokestatic    #88  <Method Boolean Boolean.valueOf(boolean)>
	//    8   14:invokevirtual   #92  <Method void Parcel.writeValue(Object)>
	//    9   17:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

		public SearchView.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return new SearchView.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class SearchView$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void SearchView$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #25  <Method SearchView$SavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public SearchView.SavedState[] newArray(int i)
		{
			return new SearchView.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       SearchView.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method SearchView$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
);
	boolean isIconified;

	static 
	{
	//    0    0:new             #9   <Class SearchView$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void SearchView$SavedState$1()>
	//    3    7:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    4   10:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   5   13:return          
	}

	public SearchView$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
		isIconified = ((Boolean)parcel.readValue(((ClassLoader) (null)))).booleanValue();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aconst_null     
	//    7    9:invokevirtual   #37  <Method Object Parcel.readValue(ClassLoader)>
	//    8   12:checkcast       #39  <Class Boolean>
	//    9   15:invokevirtual   #43  <Method boolean Boolean.booleanValue()>
	//   10   18:putfield        #45  <Field boolean isIconified>
	//   11   21:return          
	}

	SearchView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
