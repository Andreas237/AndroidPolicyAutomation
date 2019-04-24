// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

static class ActionMenuPresenter$SavedState
	implements Parcelable
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(openSubMenuId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field int openSubMenuId>
	//    3    5:invokevirtual   #41  <Method void Parcel.writeInt(int)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ActionMenuPresenter.SavedState createFromParcel(Parcel parcel)
		{
			return new ActionMenuPresenter.SavedState(parcel);
		//    0    0:new             #9   <Class ActionMenuPresenter$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void ActionMenuPresenter$SavedState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method ActionMenuPresenter$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ActionMenuPresenter.SavedState[] newArray(int i)
		{
			return new ActionMenuPresenter.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ActionMenuPresenter.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method ActionMenuPresenter$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public int openSubMenuId;

	static 
	{
	//    0    0:new             #11  <Class ActionMenuPresenter$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ActionMenuPresenter$SavedState$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	ActionMenuPresenter$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	ActionMenuPresenter$SavedState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		openSubMenuId = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method int Parcel.readInt()>
	//    5    9:putfield        #34  <Field int openSubMenuId>
	//    6   12:return          
	}
}
