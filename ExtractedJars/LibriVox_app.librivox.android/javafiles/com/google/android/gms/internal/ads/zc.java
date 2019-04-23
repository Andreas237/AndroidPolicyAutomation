// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			boq, zd, zz, ny, 
//			bwq, bmq, abo

public final class zc extends boq
{

	public zc(String s, abo abo1)
	{
		this(s, ((Map) (null)), abo1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #15  <Method void zc(String, Map, abo)>
	//    5    7:return          
	}

	private zc(String s, Map map, abo abo1)
	{
		super(0, s, ((bxr) (new zd(abo1))));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:new             #18  <Class zd>
	//    4    6:dup             
	//    5    7:aload_3         
	//    6    8:invokespecial   #21  <Method void zd(abo)>
	//    7   11:invokespecial   #24  <Method void boq(int, String, bxr)>
		b = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #26  <Field Map b>
		a = abo1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #28  <Field abo a>
		c = new zz();
	//   14   24:aload_0         
	//   15   25:new             #30  <Class zz>
	//   16   28:dup             
	//   17   29:invokespecial   #33  <Method void zz()>
	//   18   32:putfield        #35  <Field zz c>
		c.a(s, "GET", ((Map) (null)), ((byte []) (null)));
	//   19   35:aload_0         
	//   20   36:getfield        #35  <Field zz c>
	//   21   39:aload_1         
	//   22   40:ldc1            #37  <String "GET">
	//   23   42:aconst_null     
	//   24   43:aconst_null     
	//   25   44:invokevirtual   #40  <Method void zz.a(String, String, Map, byte[])>
	//   26   47:return          
	}

	protected final bwq a(bmq bmq1)
	{
		return bwq.a(((Object) (bmq1)), ny.a(bmq1));
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:invokestatic    #46  <Method azi ny.a(bmq)>
	//    3    5:invokestatic    #51  <Method bwq bwq.a(Object, azi)>
	//    4    8:areturn         
	}

	protected final void a(Object obj)
	{
		obj = ((Object) ((bmq)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #54  <Class bmq>
	//    2    4:astore_1        
		c.a(((bmq) (obj)).c, ((bmq) (obj)).a);
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field zz c>
	//    5    9:aload_1         
	//    6   10:getfield        #56  <Field Map bmq.c>
	//    7   13:aload_1         
	//    8   14:getfield        #59  <Field int bmq.a>
	//    9   17:invokevirtual   #62  <Method void zz.a(Map, int)>
		zz zz1 = c;
	//   10   20:aload_0         
	//   11   21:getfield        #35  <Field zz c>
	//   12   24:astore_2        
		byte abyte0[] = ((bmq) (obj)).b;
	//   13   25:aload_1         
	//   14   26:getfield        #65  <Field byte[] bmq.b>
	//   15   29:astore_3        
		if(zz.c() && abyte0 != null)
	//*  16   30:invokestatic    #68  <Method boolean zz.c()>
	//*  17   33:ifeq            45
	//*  18   36:aload_3         
	//*  19   37:ifnull          45
			zz1.a(abyte0);
	//   20   40:aload_2         
	//   21   41:aload_3         
	//   22   42:invokevirtual   #71  <Method void zz.a(byte[])>
		a.b(obj);
	//   23   45:aload_0         
	//   24   46:getfield        #28  <Field abo a>
	//   25   49:aload_1         
	//   26   50:invokevirtual   #75  <Method void abo.b(Object)>
	//   27   53:return          
	}

	private final abo a;
	private final Map b;
	private final zz c;
}
