// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.Log;
import java.io.File;
import java.util.ArrayDeque;

// Referenced classes of package o:
//			did

public class dij
	implements did
{

	dij(did did1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		b = new ArrayDeque(16);
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayDeque>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:invokespecial   #21  <Method void ArrayDeque(int)>
	//    7   14:putfield        #23  <Field ArrayDeque b>
		d = did1;
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:putfield        #25  <Field did d>
	//   11   22:return          
	}

	private boolean c(String s, boolean flag)
	{
		if(b.size() >= 16 && b.poll() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ArrayDeque b>
	//*   2    4:invokevirtual   #32  <Method int ArrayDeque.size()>
	//*   3    7:bipush          16
	//*   4    9:icmplt          32
	//*   5   12:aload_0         
	//*   6   13:getfield        #23  <Field ArrayDeque b>
	//*   7   16:invokevirtual   #36  <Method Object ArrayDeque.poll()>
	//*   8   19:ifnonnull       32
		{
			Log.w("LogUtil_WriterWrapper", "  writeDelayStr failed,poll error,be carefull");
	//    9   22:ldc1            #38  <String "LogUtil_WriterWrapper">
	//   10   24:ldc1            #40  <String "  writeDelayStr failed,poll error,be carefull">
	//   11   26:invokestatic    #46  <Method int Log.w(String, String)>
	//   12   29:pop             
			return false;
	//   13   30:iconst_0        
	//   14   31:ireturn         
		} else
		{
			return b.offer(((Object) (s)));
	//   15   32:aload_0         
	//   16   33:getfield        #23  <Field ArrayDeque b>
	//   17   36:aload_1         
	//   18   37:invokevirtual   #50  <Method boolean ArrayDeque.offer(Object)>
	//   19   40:ireturn         
		}
	}

	private boolean e(File file, boolean flag)
	{
		do
		{
			String s = (String)b.peek();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ArrayDeque b>
	//    2    4:invokevirtual   #55  <Method Object ArrayDeque.peek()>
	//    3    7:checkcast       #57  <Class String>
	//    4   10:astore_3        
			if(s != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          63
			{
				if(d.a(file, s, flag))
	//*   7   15:aload_0         
	//*   8   16:getfield        #25  <Field did d>
	//*   9   19:aload_1         
	//*  10   20:aload_3         
	//*  11   21:iload_2         
	//*  12   22:invokeinterface #61  <Method boolean did.a(File, String, boolean)>
	//*  13   27:ifeq            53
				{
					if(b.poll() == null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #23  <Field ArrayDeque b>
	//*  16   34:invokevirtual   #36  <Method Object ArrayDeque.poll()>
	//*  17   37:ifnull          43
	//*  18   40:goto            0
					{
						Log.w("LogUtil_WriterWrapper", "  writeDelayStr failed,poll error,be carefull");
	//   19   43:ldc1            #38  <String "LogUtil_WriterWrapper">
	//   20   45:ldc1            #40  <String "  writeDelayStr failed,poll error,be carefull">
	//   21   47:invokestatic    #46  <Method int Log.w(String, String)>
	//   22   50:pop             
						return false;
	//   23   51:iconst_0        
	//   24   52:ireturn         
					}
				} else
				{
					Log.w("LogUtil_WriterWrapper", "  writeDelayStr failed,restore for further try");
	//   25   53:ldc1            #38  <String "LogUtil_WriterWrapper">
	//   26   55:ldc1            #63  <String "  writeDelayStr failed,restore for further try">
	//   27   57:invokestatic    #46  <Method int Log.w(String, String)>
	//   28   60:pop             
					return false;
	//   29   61:iconst_0        
	//   30   62:ireturn         
				}
			} else
			{
				return true;
	//   31   63:iconst_1        
	//   32   64:ireturn         
			}
		} while(true);
	}

	public void a()
	{
		b.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ArrayDeque b>
	//    2    4:invokevirtual   #66  <Method void ArrayDeque.clear()>
	//    3    7:return          
	}

	public boolean a(File file, String s, boolean flag)
	{
		e(file, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #68  <Method boolean e(File, boolean)>
	//    4    6:pop             
		boolean flag1;
		if(b.isEmpty())
	//*   5    7:aload_0         
	//*   6    8:getfield        #23  <Field ArrayDeque b>
	//*   7   11:invokevirtual   #72  <Method boolean ArrayDeque.isEmpty()>
	//*   8   14:ifeq            47
		{
			boolean flag2 = d.a(file, s, flag);
	//    9   17:aload_0         
	//   10   18:getfield        #25  <Field did d>
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:iload_3         
	//   14   24:invokeinterface #61  <Method boolean did.a(File, String, boolean)>
	//   15   29:istore          5
			flag1 = flag2;
	//   16   31:iload           5
	//   17   33:istore          4
			if(!flag2)
	//*  18   35:iload           5
	//*  19   37:ifne            55
				return c(s, flag);
	//   20   40:aload_0         
	//   21   41:aload_2         
	//   22   42:iload_3         
	//   23   43:invokespecial   #74  <Method boolean c(String, boolean)>
	//   24   46:ireturn         
		} else
		{
			flag1 = c(s, flag);
	//   25   47:aload_0         
	//   26   48:aload_2         
	//   27   49:iload_3         
	//   28   50:invokespecial   #74  <Method boolean c(String, boolean)>
	//   29   53:istore          4
		}
		return flag1;
	//   30   55:iload           4
	//   31   57:ireturn         
	}

	public void b(File file, boolean flag)
	{
		e(file, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #68  <Method boolean e(File, boolean)>
	//    4    6:pop             
	//    5    7:return          
	}

	private ArrayDeque b;
	private did d;
}
