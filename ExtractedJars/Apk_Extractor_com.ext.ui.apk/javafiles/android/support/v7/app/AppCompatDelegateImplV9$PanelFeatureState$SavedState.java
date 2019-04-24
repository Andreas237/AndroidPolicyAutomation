// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.os.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

private static class AppCompatDelegateImplV9$PanelFeatureState$SavedState
	implements Parcelable
{

	static AppCompatDelegateImplV9$PanelFeatureState$SavedState readFromParcel(Parcel parcel, ClassLoader classloader)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		AppCompatDelegateImplV9$PanelFeatureState$SavedState appcompatdelegateimplv9$panelfeaturestate$savedstate = new AppCompatDelegateImplV9$PanelFeatureState$SavedState();
	//    2    2:new             #2   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
	//    3    5:dup             
	//    4    6:invokespecial   #35  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState()>
	//    5    9:astore_3        
		appcompatdelegateimplv9$panelfeaturestate$savedstate.featureId = parcel.readInt();
	//    6   10:aload_3         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #41  <Method int Parcel.readInt()>
	//    9   15:putfield        #43  <Field int featureId>
		if(parcel.readInt() != 1)
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #41  <Method int Parcel.readInt()>
	//*  12   22:iconst_1        
	//*  13   23:icmpne          49
	//*  14   26:aload_3         
	//*  15   27:iload_2         
	//*  16   28:putfield        #45  <Field boolean isOpen>
	//*  17   31:aload_3         
	//*  18   32:getfield        #45  <Field boolean isOpen>
	//*  19   35:ifeq            47
	//*  20   38:aload_3         
	//*  21   39:aload_0         
	//*  22   40:aload_1         
	//*  23   41:invokevirtual   #49  <Method Bundle Parcel.readBundle(ClassLoader)>
	//*  24   44:putfield        #51  <Field Bundle menuState>
	//*  25   47:aload_3         
	//*  26   48:areturn         
			flag = false;
	//   27   49:iconst_0        
	//   28   50:istore_2        
		appcompatdelegateimplv9$panelfeaturestate$savedstate.isOpen = flag;
		if(appcompatdelegateimplv9$panelfeaturestate$savedstate.isOpen)
			appcompatdelegateimplv9$panelfeaturestate$savedstate.menuState = parcel.readBundle(classloader);
		return appcompatdelegateimplv9$panelfeaturestate$savedstate;
	//*  29   51:goto            26
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
	//    2    2:getfield        #43  <Field int featureId>
	//    3    5:invokevirtual   #58  <Method void Parcel.writeInt(int)>
		if(isOpen)
	//*   4    8:aload_0         
	//*   5    9:getfield        #45  <Field boolean isOpen>
	//*   6   12:ifeq            38
			i = 1;
	//    7   15:iconst_1        
	//    8   16:istore_2        
		else
	//*   9   17:aload_1         
	//*  10   18:iload_2         
	//*  11   19:invokevirtual   #58  <Method void Parcel.writeInt(int)>
	//*  12   22:aload_0         
	//*  13   23:getfield        #45  <Field boolean isOpen>
	//*  14   26:ifeq            37
	//*  15   29:aload_1         
	//*  16   30:aload_0         
	//*  17   31:getfield        #51  <Field Bundle menuState>
	//*  18   34:invokevirtual   #62  <Method void Parcel.writeBundle(Bundle)>
	//*  19   37:return          
			i = 0;
	//   20   38:iconst_0        
	//   21   39:istore_2        
		parcel.writeInt(i);
		if(isOpen)
			parcel.writeBundle(menuState);
	//*  22   40:goto            17
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public AppCompatDelegateImplV9.PanelFeatureState.SavedState createFromParcel(Parcel parcel)
		{
			return AppCompatDelegateImplV9.PanelFeatureState.SavedState.readFromParcel(parcel, ((ClassLoader) (null)));
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:invokestatic    #26  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
		//    3    5:areturn         
		}

		public AppCompatDelegateImplV9.PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return AppCompatDelegateImplV9.PanelFeatureState.SavedState.readFromParcel(parcel, classloader);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #26  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #29  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #32  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState createFromParcel(Parcel, ClassLoader)>
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
		//    2    2:invokevirtual   #37  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	int featureId;
	boolean isOpen;
	Bundle menuState;

	static 
	{
	//    0    0:new             #14  <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState$1()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	AppCompatDelegateImplV9$PanelFeatureState$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}
}
