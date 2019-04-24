// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.v7.widget:
//			Toolbar

public static class Toolbar$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(expandedMenuItemId);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field int expandedMenuItemId>
	//    7   11:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		if(isOverflowOpen)
	//*   8   14:aload_0         
	//*   9   15:getfield        #39  <Field boolean isOverflowOpen>
	//*  10   18:ifeq            29
			i = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		else
	//*  13   23:aload_1         
	//*  14   24:iload_2         
	//*  15   25:invokevirtual   #50  <Method void Parcel.writeInt(int)>
	//*  16   28:return          
			i = 0;
	//   17   29:iconst_0        
	//   18   30:istore_2        
		parcel.writeInt(i);
	//*  19   31:goto            23
	}

	public static final android.os.Parcelable$Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public Toolbar.SavedState createFromParcel(Parcel parcel)
		{
			return new Toolbar.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class Toolbar$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public Toolbar.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return new Toolbar.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class Toolbar$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #26  <Method Toolbar$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #29  <Method Toolbar$SavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public Toolbar.SavedState[] newArray(int i)
		{
			return new Toolbar.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Toolbar.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #34  <Method Toolbar$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	int expandedMenuItemId;
	boolean isOverflowOpen;

	static 
	{
	//    0    0:new             #9   <Class Toolbar$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Toolbar$SavedState$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public Toolbar$SavedState(Parcel parcel)
	{
		this(parcel, ((ClassLoader) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #28  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
	//    4    6:return          
	}

	public Toolbar$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void AbsSavedState(Parcel, ClassLoader)>
		expandedMenuItemId = parcel.readInt();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #35  <Method int Parcel.readInt()>
	//    7   11:putfield        #37  <Field int expandedMenuItemId>
		boolean flag;
		if(parcel.readInt() != 0)
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #35  <Method int Parcel.readInt()>
	//*  10   18:ifeq            29
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_3        
		else
	//*  13   23:aload_0         
	//*  14   24:iload_3         
	//*  15   25:putfield        #39  <Field boolean isOverflowOpen>
	//*  16   28:return          
			flag = false;
	//   17   29:iconst_0        
	//   18   30:istore_3        
		isOverflowOpen = flag;
	//*  19   31:goto            23
	}

	public Toolbar$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
