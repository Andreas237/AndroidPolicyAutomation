// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import android.os.Parcel;

// Referenced classes of package androidx.versionedparcelable:
//			ParcelImpl

static final class ParcelImpl$1
	implements android.os.eator
{

	public ParcelImpl createFromParcel(Parcel parcel)
	{
		return new ParcelImpl(parcel);
	//    0    0:new             #9   <Class ParcelImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void ParcelImpl(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method ParcelImpl createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ParcelImpl[] newArray(int i)
	{
		return new ParcelImpl[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ParcelImpl[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #27  <Method ParcelImpl[] newArray(int)>
	//    3    5:areturn         
	}

	ParcelImpl$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
