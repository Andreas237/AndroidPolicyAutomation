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
		int i = parcel.readInt();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int Parcel.readInt()>
	//    2    4:istore_2        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		if(i != 1)
	//*   5    7:iload_2         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          15
	//*   8   12:goto            17
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_3        
		return new ObservableBoolean(flag);
	//   11   17:new             #9   <Class ObservableBoolean>
	//   12   20:dup             
	//   13   21:iload_3         
	//   14   22:invokespecial   #25  <Method void ObservableBoolean(boolean)>
	//   15   25:areturn         
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
