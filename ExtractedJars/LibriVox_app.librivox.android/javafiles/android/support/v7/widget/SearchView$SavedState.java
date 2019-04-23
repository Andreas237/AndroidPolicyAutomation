// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;

class SearchView$SavedState extends AbsSavedState
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("SearchView.SavedState{");
	//    4    8:aload_1         
	//    5    9:ldc1            #45  <String "SearchView.SavedState{">
	//    6   11:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokestatic    #55  <Method int System.identityHashCode(Object)>
	//   11   20:invokestatic    #61  <Method String Integer.toHexString(int)>
	//   12   23:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(" isIconified=");
	//   14   27:aload_1         
	//   15   28:ldc1            #63  <String " isIconified=">
	//   16   30:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(isIconified);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #35  <Field boolean isIconified>
	//   21   39:invokevirtual   #66  <Method StringBuilder StringBuilder.append(boolean)>
	//   22   42:pop             
		stringbuilder.append("}");
	//   23   43:aload_1         
	//   24   44:ldc1            #68  <String "}">
	//   25   46:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		return stringbuilder.toString();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   29   54:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #74  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeValue(((Object) (Boolean.valueOf(isIconified))));
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field boolean isIconified>
	//    7   11:invokestatic    #78  <Method Boolean Boolean.valueOf(boolean)>
	//    8   14:invokevirtual   #82  <Method void Parcel.writeValue(Object)>
	//    9   17:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new _cls1();
	boolean isIconified;

	static 
	{
		class _cls1
			implements android.os.Parcelable.ClassLoaderCreator
		{

			public SearchView.SavedState createFromParcel(Parcel parcel)
			{
				return new SearchView.SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #15  <Class SearchView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #18  <Method void SearchView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SearchView.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SearchView.SavedState(parcel, classloader);
			//    0    0:new             #15  <Class SearchView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #18  <Method void SearchView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #22  <Method SearchView$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
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

			_cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #10  <Method void Object()>
			//    2    4:return          
			}
		}

	//    0    0:new             #12  <Class SearchView$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void SearchView$SavedState$1()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public SearchView$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AbsSavedState(Parcel, ClassLoader)>
		isIconified = ((Boolean)parcel.readValue(((ClassLoader) (null)))).booleanValue();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aconst_null     
	//    7    9:invokevirtual   #27  <Method Object Parcel.readValue(ClassLoader)>
	//    8   12:checkcast       #29  <Class Boolean>
	//    9   15:invokevirtual   #33  <Method boolean Boolean.booleanValue()>
	//   10   18:putfield        #35  <Field boolean isIconified>
	//   11   21:return          
	}

	SearchView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
