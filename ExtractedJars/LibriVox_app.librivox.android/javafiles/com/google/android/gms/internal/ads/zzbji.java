// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aip, awo, akh, awp

public final class zzbji extends AbstractSafeParcelable
{

	zzbji(int i, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field akh b>
		c = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #30  <Field byte[] c>
		b();
	//   11   19:aload_0         
	//   12   20:invokespecial   #32  <Method void b()>
	//   13   23:return          
	}

	private final void b()
	{
		if(b == null && c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field akh b>
	//*   2    4:ifnonnull       15
	//*   3    7:aload_0         
	//*   4    8:getfield        #30  <Field byte[] c>
	//*   5   11:ifnull          15
			return;
	//    6   14:return          
		if(b != null && c == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #28  <Field akh b>
	//*   9   19:ifnull          30
	//*  10   22:aload_0         
	//*  11   23:getfield        #30  <Field byte[] c>
	//*  12   26:ifnonnull       30
			return;
	//   13   29:return          
		if(b != null && c != null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #28  <Field akh b>
	//*  16   34:ifnull          57
	//*  17   37:aload_0         
	//*  18   38:getfield        #30  <Field byte[] c>
	//*  19   41:ifnonnull       47
	//*  20   44:goto            57
			throw new IllegalStateException("Invalid internal representation - full");
	//   21   47:new             #34  <Class IllegalStateException>
	//   22   50:dup             
	//   23   51:ldc1            #36  <String "Invalid internal representation - full">
	//   24   53:invokespecial   #39  <Method void IllegalStateException(String)>
	//   25   56:athrow          
		if(b == null && c == null)
	//*  26   57:aload_0         
	//*  27   58:getfield        #28  <Field akh b>
	//*  28   61:ifnonnull       81
	//*  29   64:aload_0         
	//*  30   65:getfield        #30  <Field byte[] c>
	//*  31   68:ifnonnull       81
			throw new IllegalStateException("Invalid internal representation - empty");
	//   32   71:new             #34  <Class IllegalStateException>
	//   33   74:dup             
	//   34   75:ldc1            #41  <String "Invalid internal representation - empty">
	//   35   77:invokespecial   #39  <Method void IllegalStateException(String)>
	//   36   80:athrow          
		else
			throw new IllegalStateException("Impossible");
	//   37   81:new             #34  <Class IllegalStateException>
	//   38   84:dup             
	//   39   85:ldc1            #43  <String "Impossible">
	//   40   87:invokespecial   #39  <Method void IllegalStateException(String)>
	//   41   90:athrow          
	}

	public final akh a()
	{
		boolean flag;
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field akh b>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		if(!flag)
	//*   8   14:iload_1         
	//*   9   15:ifne            59
			try
			{
				byte abyte0[] = c;
	//   10   18:aload_0         
	//   11   19:getfield        #30  <Field byte[] c>
	//   12   22:astore_2        
				b = (akh)awp.a(((awp) (new akh())), abyte0);
	//   13   23:aload_0         
	//   14   24:new             #48  <Class akh>
	//   15   27:dup             
	//   16   28:invokespecial   #49  <Method void akh()>
	//   17   31:aload_2         
	//   18   32:invokestatic    #54  <Method awp awp.a(awp, byte[])>
	//   19   35:checkcast       #48  <Class akh>
	//   20   38:putfield        #28  <Field akh b>
				c = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #30  <Field byte[] c>
			}
	//*  24   46:goto            59
			catch(awo awo1)
	//*  25   49:astore_2        
			{
				throw new IllegalStateException(((Throwable) (awo1)));
	//   26   50:new             #34  <Class IllegalStateException>
	//   27   53:dup             
	//   28   54:aload_2         
	//   29   55:invokespecial   #57  <Method void IllegalStateException(Throwable)>
	//   30   58:athrow          
			}
		b();
	//   31   59:aload_0         
	//   32   60:invokespecial   #32  <Method void b()>
		return b;
	//   33   63:aload_0         
	//   34   64:getfield        #28  <Field akh b>
	//   35   67:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #64  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int a>
	//    7   11:invokestatic    #67  <Method void c.a(Parcel, int, int)>
		byte abyte0[] = c;
	//    8   14:aload_0         
	//    9   15:getfield        #30  <Field byte[] c>
	//   10   18:astore_3        
		if(abyte0 == null)
	//*  11   19:aload_3         
	//*  12   20:ifnull          26
	//*  13   23:goto            34
			abyte0 = awp.a(((awp) (b)));
	//   14   26:aload_0         
	//   15   27:getfield        #28  <Field akh b>
	//   16   30:invokestatic    #70  <Method byte[] awp.a(awp)>
	//   17   33:astore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, abyte0, false);
	//   18   34:aload_1         
	//   19   35:iconst_2        
	//   20   36:aload_3         
	//   21   37:iconst_0        
	//   22   38:invokestatic    #73  <Method void c.a(Parcel, int, byte[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   23   41:aload_1         
	//   24   42:iload_2         
	//   25   43:invokestatic    #75  <Method void c.a(Parcel, int)>
	//   26   46:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new aip();
	private final int a;
	private akh b;
	private byte c[];

	static 
	{
	//    0    0:new             #16  <Class aip>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void aip()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
