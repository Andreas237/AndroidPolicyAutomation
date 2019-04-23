// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bhj, bnf, bhh, bgu, 
//			bfw, bfx, bhi

final class bha
{

	public bha(bfw bfw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class bhj>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void bhj()>
	//    6   12:putfield        #30  <Field bhj a>
		b = bfw1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #32  <Field bfw b>
	//   10   20:return          
	}

	public final void a()
	{
		bhj bhj1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field bhj a>
	//    2    4:astore_1        
		bhj1.e = 0;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:putfield        #35  <Field int bhj.e>
		bhj1.s = 0L;
	//    6   10:aload_1         
	//    7   11:lconst_0        
	//    8   12:putfield        #39  <Field long bhj.s>
		bhj1.m = false;
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:putfield        #43  <Field boolean bhj.m>
		bhj1.r = false;
	//   12   20:aload_1         
	//   13   21:iconst_0        
	//   14   22:putfield        #46  <Field boolean bhj.r>
		bhj1.o = null;
	//   15   25:aload_1         
	//   16   26:aconst_null     
	//   17   27:putfield        #49  <Field bhi bhj.o>
		e = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #50  <Field int e>
		g = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #52  <Field int g>
		f = 0;
	//   24   40:aload_0         
	//   25   41:iconst_0        
	//   26   42:putfield        #54  <Field int f>
		h = null;
	//   27   45:aload_0         
	//   28   46:aconst_null     
	//   29   47:putfield        #56  <Field bfx h>
		i = null;
	//   30   50:aload_0         
	//   31   51:aconst_null     
	//   32   52:putfield        #58  <Field bhi i>
	//   33   55:return          
	}

	public final void a(bhh bhh1, bgu bgu1)
	{
		c = (bhh)bnf.a(((Object) (bhh1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #64  <Method Object bnf.a(Object)>
	//    3    5:checkcast       #66  <Class bhh>
	//    4    8:putfield        #68  <Field bhh c>
		d = (bgu)bnf.a(((Object) (bgu1)));
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:invokestatic    #64  <Method Object bnf.a(Object)>
	//    8   16:checkcast       #70  <Class bgu>
	//    9   19:putfield        #72  <Field bgu d>
		b.a(bhh1.f);
	//   10   22:aload_0         
	//   11   23:getfield        #32  <Field bfw b>
	//   12   26:aload_1         
	//   13   27:getfield        #75  <Field zzfs bhh.f>
	//   14   30:invokeinterface #80  <Method void bfw.a(zzfs)>
		a();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #82  <Method void a()>
	//   17   39:return          
	}

	public final bhj a = new bhj();
	public final bfw b;
	public bhh c;
	public bgu d;
	public int e;
	public int f;
	public int g;
	public bfx h;
	public bhi i;
}
