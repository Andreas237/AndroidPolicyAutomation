// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;

// Referenced classes of package android.databinding:
//			ObservableChar

static final class ObservableChar$1
	implements android.os.r
{

	public ObservableChar createFromParcel(Parcel parcel)
	{
		return new ObservableChar((char)parcel.readInt());
	//    0    0:new             #9   <Class ObservableChar>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method int Parcel.readInt()>
	//    4    8:int2char        
	//    5    9:invokespecial   #25  <Method void ObservableChar(char)>
	//    6   12:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method ObservableChar createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ObservableChar[] newArray(int i)
	{
		return new ObservableChar[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ObservableChar[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method ObservableChar[] newArray(int)>
	//    3    5:areturn         
	}

	ObservableChar$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
