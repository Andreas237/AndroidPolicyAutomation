// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.Parcel;

// Referenced classes of package o:
//			nz

static final class nz$2
	implements android.os.lable.Creator
{

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (e(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method nz e(Parcel)>
	//    3    5:areturn         
	}

	public nz[] d(int i)
	{
		return new nz[i];
	//    0    0:iload_1         
	//    1    1:anewarray       nz[]
	//    2    4:areturn         
	}

	public nz e(Parcel parcel)
	{
		nz nz1 = new nz(0.0F, 0.0F);
	//    0    0:new             #9   <Class nz>
	//    1    3:dup             
	//    2    4:fconst_0        
	//    3    5:fconst_0        
	//    4    6:invokespecial   #25  <Method void nz(float, float)>
	//    5    9:astore_2        
		nz1.c(parcel);
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #29  <Method void nz.c(Parcel)>
		return nz1;
	//    9   15:aload_2         
	//   10   16:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (d(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method nz[] d(int)>
	//    3    5:areturn         
	}

	nz$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
