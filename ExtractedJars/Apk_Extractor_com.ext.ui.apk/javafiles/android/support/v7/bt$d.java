// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.util.Iterator;

// Referenced classes of package android.support.v7:
//			bt

private class bt$d
	implements Iterator
{

	public java.util.ntry a()
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean c>
	//*   2    4:ifeq            28
		{
			c = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #26  <Field boolean c>
			b = bt.a(a);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field bt a>
	//    9   17:invokestatic    #34  <Method bt$c bt.a(bt)>
	//   10   20:putfield        #36  <Field bt$c b>
		} else
	//*  11   23:aload_0         
	//*  12   24:getfield        #36  <Field bt$c b>
	//*  13   27:areturn         
		{
			bt$c bt$c1;
			if(b != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #36  <Field bt$c b>
	//*  16   32:ifnull          51
				bt$c1 = b.c;
	//   17   35:aload_0         
	//   18   36:getfield        #36  <Field bt$c b>
	//   19   39:getfield        #40  <Field bt$c bt$c.c>
	//   20   42:astore_1        
			else
	//*  21   43:aload_0         
	//*  22   44:aload_1         
	//*  23   45:putfield        #36  <Field bt$c b>
	//*  24   48:goto            23
				bt$c1 = null;
	//   25   51:aconst_null     
	//   26   52:astore_1        
			b = bt$c1;
		}
		return ((java.util.ntry) (b));
	//*  27   53:goto            43
	}

	public boolean hasNext()
	{
		if(!c) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field boolean c>
	//    2    4:ifeq            21
_L1:
		if(bt.a(a) == null) goto _L4; else goto _L3
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field bt a>
	//    5   11:invokestatic    #34  <Method bt$c bt.a(bt)>
	//    6   14:ifnull          19
_L3:
		return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
_L4:
		return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
_L2:
		if(b == null || b.c == null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #36  <Field bt$c b>
	//*  13   25:ifnull          38
	//*  14   28:aload_0         
	//*  15   29:getfield        #36  <Field bt$c b>
	//*  16   32:getfield        #40  <Field bt$c bt$c.c>
	//*  17   35:ifnonnull       17
			return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
	}

	public Object next()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method java.util.Map$Entry a()>
	//    2    4:areturn         
	}

	final bt a;
	private bt$c b;
	private boolean c;

	private bt$d(bt bt1)
	{
		a = bt1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field bt a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		c = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #26  <Field boolean c>
	//    8   14:return          
	}

	bt$d(bt bt1, bt$1 bt$1)
	{
		this(bt1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void bt$d(bt)>
	//    3    5:return          
	}
}
