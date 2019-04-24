// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;

// Referenced classes of package android.databinding:
//			ObservableBoolean

static final class ObservableBoolean$1
	implements android.os.Parcelable.Creator
{

	public ObservableBoolean createFromParcel(Parcel parcel)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(parcel.readInt() != 1)
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #22  <Method int Parcel.readInt()>
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
	//*   6   10:new             #9   <Class ObservableBoolean>
	//*   7   13:dup             
	//*   8   14:iload_2         
	//*   9   15:invokespecial   #25  <Method void ObservableBoolean(boolean)>
	//*  10   18:areturn         
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore_2        
		return new ObservableBoolean(flag);
	//*  13   21:goto            10
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method ObservableBoolean createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ObservableBoolean[] newArray(int i)
	{
		return new ObservableBoolean[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ObservableBoolean[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method ObservableBoolean[] newArray(int)>
	//    3    5:areturn         
	}

	ObservableBoolean$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
