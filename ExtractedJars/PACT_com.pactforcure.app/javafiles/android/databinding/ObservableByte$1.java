// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;

// Referenced classes of package android.databinding:
//			ObservableByte

static final class ObservableByte$1
	implements android.os.r
{

	public ObservableByte createFromParcel(Parcel parcel)
	{
		return new ObservableByte(parcel.readByte());
	//    0    0:new             #9   <Class ObservableByte>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method byte Parcel.readByte()>
	//    4    8:invokespecial   #25  <Method void ObservableByte(byte)>
	//    5   11:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method ObservableByte createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ObservableByte[] newArray(int i)
	{
		return new ObservableByte[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ObservableByte[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method ObservableByte[] newArray(int)>
	//    3    5:areturn         
	}

	ObservableByte$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
