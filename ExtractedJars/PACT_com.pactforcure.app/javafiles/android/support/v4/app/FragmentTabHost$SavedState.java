// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//			FragmentTabHost

static class FragmentTabHost$SavedState extends android.view.View.BaseSavedState
{

	public String toString()
	{
		return (new StringBuilder()).append("FragmentTabHost.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" curTab=").append(curTab).append("}").toString();
	//    0    0:new             #39  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void StringBuilder()>
	//    3    7:ldc1            #42  <String "FragmentTabHost.SavedState{">
	//    4    9:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokestatic    #52  <Method int System.identityHashCode(Object)>
	//    7   16:invokestatic    #58  <Method String Integer.toHexString(int)>
	//    8   19:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #60  <String " curTab=">
	//   10   24:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #33  <Field String curTab>
	//   13   31:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:ldc1            #62  <String "}">
	//   15   36:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   17   42:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #68  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
		parcel.writeString(curTab);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field String curTab>
	//    7   11:invokevirtual   #72  <Method void Parcel.writeString(String)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public FragmentTabHost.SavedState createFromParcel(Parcel parcel)
		{
			return new FragmentTabHost.SavedState(parcel);
		//    0    0:new             #9   <Class FragmentTabHost$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void FragmentTabHost$SavedState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method FragmentTabHost$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public FragmentTabHost.SavedState[] newArray(int i)
		{
			return new FragmentTabHost.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       FragmentTabHost.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method FragmentTabHost$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	String curTab;

	static 
	{
	//    0    0:new             #9   <Class FragmentTabHost$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void FragmentTabHost$SavedState$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	FragmentTabHost$SavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void android.view.View$BaseSavedState(Parcel)>
		curTab = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #31  <Method String Parcel.readString()>
	//    6   10:putfield        #33  <Field String curTab>
	//    7   13:return          
	}

	FragmentTabHost$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void android.view.View$BaseSavedState(Parcelable)>
	//    3    5:return          
	}
}
