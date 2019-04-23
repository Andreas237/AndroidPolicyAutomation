// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zztv

public final class bro
	implements android.os.Parcelable.Creator
{

	public bro()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int i = a.b(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method int a.b(Parcel)>
	//    2    4:istore_2        
		ParcelFileDescriptor parcelfiledescriptor = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		while(parcel.dataPosition() < i) 
	//*   5    8:aload_1         
	//*   6    9:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*   7   12:iload_2         
	//*   8   13:icmpge          53
		{
			int j = a.a(parcel);
	//    9   16:aload_1         
	//   10   17:invokestatic    #28  <Method int a.a(Parcel)>
	//   11   20:istore_3        
			if(a.a(j) != 2)
	//*  12   21:iload_3         
	//*  13   22:invokestatic    #31  <Method int a.a(int)>
	//*  14   25:iconst_2        
	//*  15   26:icmpeq          37
				a.b(parcel, j);
	//   16   29:aload_1         
	//   17   30:iload_3         
	//   18   31:invokestatic    #34  <Method void a.b(Parcel, int)>
			else
	//*  19   34:goto            8
				parcelfiledescriptor = (ParcelFileDescriptor)a.a(parcel, j, ParcelFileDescriptor.CREATOR);
	//   20   37:aload_1         
	//   21   38:iload_3         
	//   22   39:getstatic       #40  <Field android.os.Parcelable$Creator ParcelFileDescriptor.CREATOR>
	//   23   42:invokestatic    #43  <Method android.os.Parcelable a.a(Parcel, int, android.os.Parcelable$Creator)>
	//   24   45:checkcast       #36  <Class ParcelFileDescriptor>
	//   25   48:astore          4
		}
	//*  26   50:goto            8
		a.E(parcel, i);
	//   27   53:aload_1         
	//   28   54:iload_2         
	//   29   55:invokestatic    #46  <Method void a.E(Parcel, int)>
		return ((Object) (new zztv(parcelfiledescriptor)));
	//   30   58:new             #48  <Class zztv>
	//   31   61:dup             
	//   32   62:aload           4
	//   33   64:invokespecial   #51  <Method void zztv(ParcelFileDescriptor)>
	//   34   67:areturn         
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zztv[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zztv[]
	//    2    4:areturn         
	}
}
