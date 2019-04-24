// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.os.Handler;

// Referenced classes of package android.support.v7:
//			cg, ch

class cg$c
	implements Runnable
{

	public void run()
	{
		if(b.a(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field cg b>
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field cg$b a>
	//*   4    8:invokevirtual   #29  <Method boolean cg.a(cg$b)>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		try
		{
			Object obj = ((Object) (cg.a(b, a.a)));
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field cg b>
	//    9   19:aload_0         
	//   10   20:getfield        #22  <Field cg$b a>
	//   11   23:getfield        #34  <Field String cg$b.a>
	//   12   26:invokestatic    #37  <Method android.graphics.Bitmap cg.a(cg, String)>
	//   13   29:astore_1        
			b.b.a(a.a, ((android.graphics.Bitmap) (obj)));
	//   14   30:aload_0         
	//   15   31:getfield        #17  <Field cg b>
	//   16   34:getfield        #40  <Field ch cg.b>
	//   17   37:aload_0         
	//   18   38:getfield        #22  <Field cg$b a>
	//   19   41:getfield        #34  <Field String cg$b.a>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #45  <Method void ch.a(String, android.graphics.Bitmap)>
			if(!b.a(a))
	//*  22   48:aload_0         
	//*  23   49:getfield        #17  <Field cg b>
	//*  24   52:aload_0         
	//*  25   53:getfield        #22  <Field cg$b a>
	//*  26   56:invokevirtual   #29  <Method boolean cg.a(cg$b)>
	//*  27   59:ifne            97
			{
				obj = ((Object) (new cg$a(b, ((android.graphics.Bitmap) (obj)), a)));
	//   28   62:new             #47  <Class cg$a>
	//   29   65:dup             
	//   30   66:aload_0         
	//   31   67:getfield        #17  <Field cg b>
	//   32   70:aload_1         
	//   33   71:aload_0         
	//   34   72:getfield        #22  <Field cg$b a>
	//   35   75:invokespecial   #50  <Method void cg$a(cg, android.graphics.Bitmap, cg$b)>
	//   36   78:astore_1        
				b.e.post(((Runnable) (obj)));
	//   37   79:aload_0         
	//   38   80:getfield        #17  <Field cg b>
	//   39   83:getfield        #54  <Field Handler cg.e>
	//   40   86:aload_1         
	//   41   87:invokevirtual   #60  <Method boolean Handler.post(Runnable)>
	//   42   90:pop             
				return;
	//   43   91:return          
			}
		}
		catch(Throwable throwable)
	//*  44   92:astore_1        
		{
			throwable.printStackTrace();
	//   45   93:aload_1         
	//   46   94:invokevirtual   #63  <Method void Throwable.printStackTrace()>
		}
		return;
	//   47   97:return          
	}

	cg$b a;
	final cg b;

	cg$c(cg cg1, cg$b cg$b1)
	{
		b = cg1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field cg b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		a = cg$b1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field cg$b a>
	//    8   14:return          
	}
}
