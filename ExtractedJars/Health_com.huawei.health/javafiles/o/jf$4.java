// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.TimerTask;

// Referenced classes of package o:
//			jf

class jf$4 extends TimerTask
{

	public void run()
	{
		try
		{
			if(jf.f(c))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field jf c>
	//*   2    4:invokestatic    #29  <Method boolean jf.f(jf)>
	//*   3    7:ifeq            41
			{
				jf.e(c, b);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field jf c>
	//    6   14:aload_0         
	//    7   15:getfield        #18  <Field int b>
	//    8   18:invokestatic    #32  <Method void jf.e(jf, int)>
				if(!c.b())
	//*   9   21:aload_0         
	//*  10   22:getfield        #16  <Field jf c>
	//*  11   25:invokevirtual   #35  <Method boolean jf.b()>
	//*  12   28:ifne            48
					jf.p(c);
	//   13   31:aload_0         
	//   14   32:getfield        #16  <Field jf c>
	//   15   35:invokestatic    #39  <Method void jf.p(jf)>
				break MISSING_BLOCK_LABEL_48;
	//   16   38:goto            48
			}
		}
	//*  17   41:aload_0         
	//*  18   42:getfield        #16  <Field jf c>
	//*  19   45:invokestatic    #39  <Method void jf.p(jf)>
	//*  20   48:return          
		catch(Throwable throwable)
	//*  21   49:astore_1        
		{
			throwable.printStackTrace();
	//   22   50:aload_1         
	//   23   51:invokevirtual   #42  <Method void Throwable.printStackTrace()>
			return;
	//   24   54:return          
		}
		jf.p(c);
	}

	final int b;
	final jf c;

	jf$4(jf jf1, int i)
	{
		c = jf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field jf c>
		b = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #18  <Field int b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void TimerTask()>
	//    8   14:return          
	}
}
