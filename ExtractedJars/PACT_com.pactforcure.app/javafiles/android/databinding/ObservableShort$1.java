// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;

// Referenced classes of package android.databinding:
//			ObservableShort

static final class ObservableShort$1
	implements android.os.
{

	public ObservableShort createFromParcel(Parcel parcel)
	{
		return new ObservableShort((short)parcel.readInt());
	//    0    0:new             #9   <Class ObservableShort>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method int Parcel.readInt()>
	//    4    8:int2short       
	//    5    9:invokespecial   #25  <Method void ObservableShort(short)>
	//    6   12:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method ObservableShort createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ObservableShort[] newArray(int i)
	{
		return new ObservableShort[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ObservableShort[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method ObservableShort[] newArray(int)>
	//    3    5:areturn         
	}

	ObservableShort$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
