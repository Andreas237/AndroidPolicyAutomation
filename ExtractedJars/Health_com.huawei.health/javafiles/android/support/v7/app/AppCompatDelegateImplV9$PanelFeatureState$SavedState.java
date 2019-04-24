// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.os.*;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

static class AppCompatDelegateImplV9$PanelFeatureState$SavedState
	implements Parcelable
{

	static AppCompatDelegateImplV9$PanelFeatureState$SavedState readFromParcel(Parcel parcel, ClassLoader classloader)
	{
		AppCompatDelegateImplV9$PanelFeatureState$SavedState appcompatdelegateimplv9$panelfeaturestate$savedstate = new AppCompatDelegateImplV9$PanelFeatureState$SavedState();
	//    0    0:new             #2   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState()>
	//    3    7:astore_3        
		appcompatdelegateimplv9$panelfeaturestate$savedstate.featureId = parcel.readInt();
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #47  <Method int Parcel.readInt()>
	//    7   13:putfield        #49  <Field int featureId>
		boolean flag;
		if(parcel.readInt() == 1)
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #47  <Method int Parcel.readInt()>
	//*  10   20:iconst_1        
	//*  11   21:icmpne          29
			flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_2        
		else
	//*  14   26:goto            31
			flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_2        
		appcompatdelegateimplv9$panelfeaturestate$savedstate.isOpen = flag;
	//   17   31:aload_3         
	//   18   32:iload_2         
	//   19   33:putfield        #51  <Field boolean isOpen>
		if(appcompatdelegateimplv9$panelfeaturestate$savedstate.isOpen)
	//*  20   36:aload_3         
	//*  21   37:getfield        #51  <Field boolean isOpen>
	//*  22   40:ifeq            52
			appcompatdelegateimplv9$panelfeaturestate$savedstate.menuState = parcel.readBundle(classloader);
	//   23   43:aload_3         
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #55  <Method Bundle Parcel.readBundle(ClassLoader)>
	//   27   49:putfield        #57  <Field Bundle menuState>
		return appcompatdelegateimplv9$panelfeaturestate$savedstate;
	//   28   52:aload_3         
	//   29   53:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(featureId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field int featureId>
	//    3    5:invokevirtual   #64  <Method void Parcel.writeInt(int)>
		if(isOpen)
	//*   4    8:aload_0         
	//*   5    9:getfield        #51  <Field boolean isOpen>
	//*   6   12:ifeq            20
			i = 1;
	//    7   15:iconst_1        
	//    8   16:istore_2        
		else
	//*   9   17:goto            22
			i = 0;
	//   10   20:iconst_0        
	//   11   21:istore_2        
		parcel.writeInt(i);
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:invokevirtual   #64  <Method void Parcel.writeInt(int)>
		if(isOpen)
	//*  15   27:aload_0         
	//*  16   28:getfield        #51  <Field boolean isOpen>
	//*  17   31:ifeq            42
			parcel.writeBundle(menuState);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #57  <Field Bundle menuState>
	//   21   39:invokevirtual   #68  <Method void Parcel.writeBundle(Bundle)>
	//   22   42:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

		public AppCompatDelegateImplV9.PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return AppCompatDelegateImplV9.PanelFeatureState.SavedState.readFromParcel(parcel, classloader);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #25  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #28  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public AppCompatDelegateImplV9.PanelFeatureState.SavedState[] newArray(int i)
		{
			return new AppCompatDelegateImplV9.PanelFeatureState.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       AppCompatDelegateImplV9.PanelFeatureState.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
);
	int featureId;
	boolean isOpen;
	Bundle menuState;

	static 
	{
	//    0    0:new             #14  <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState$1()>
	//    3    7:invokestatic    #34  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    4   10:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   5   13:return          
	}

	AppCompatDelegateImplV9$PanelFeatureState$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}
}
