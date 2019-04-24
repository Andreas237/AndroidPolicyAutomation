// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.f;

import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.f.a.b;
import com.baidu.android.pushservice.g.c;

// Referenced classes of package com.baidu.android.pushservice.f:
//			n

class n$1 extends c
{

	public void a()
	{
		if(!com.baidu.android.pushservice.f.n.a(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field n a>
	//*   2    4:invokestatic    #24  <Method boolean com.baidu.android.pushservice.f.n.a(n)>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		long l = System.currentTimeMillis();
	//    5   11:invokestatic    #30  <Method long System.currentTimeMillis()>
	//    6   14:lstore_3        
		int i = (int)((l / 60000L) % 5L);
	//    7   15:lload_3         
	//    8   16:ldc2w           #31  <Long 60000L>
	//    9   19:ldiv            
	//   10   20:ldc2w           #33  <Long 5L>
	//   11   23:lrem            
	//   12   24:l2i             
	//   13   25:istore_1        
		int j = (int)(l / 1000L);
	//   14   26:lload_3         
	//   15   27:ldc2w           #35  <Long 1000L>
	//   16   30:ldiv            
	//   17   31:l2i             
	//   18   32:istore_2        
		if(i == 0 && j % 60 < 15)
	//*  19   33:iload_1         
	//*  20   34:ifne            117
	//*  21   37:iload_2         
	//*  22   38:bipush          60
	//*  23   40:irem            
	//*  24   41:bipush          15
	//*  25   43:icmpge          117
		{
			long l1 = (long)(Math.random() * 60D * 1000D);
	//   26   46:invokestatic    #42  <Method double Math.random()>
	//   27   49:ldc2w           #43  <Double 60D>
	//   28   52:dmul            
	//   29   53:ldc2w           #45  <Double 1000D>
	//   30   56:dmul            
	//   31   57:d2l             
	//   32   58:lstore_3        
			try
			{
				Thread.sleep(l1);
	//   33   59:lload_3         
	//   34   60:invokestatic    #52  <Method void Thread.sleep(long)>
			}
	//*  35   63:goto            103
			catch(InterruptedException interruptedexception)
	//*  36   66:astore          5
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   37   68:new             #54  <Class StringBuilder>
	//   38   71:dup             
	//   39   72:invokespecial   #56  <Method void StringBuilder()>
	//   40   75:astore          6
				stringbuilder.append("InterruptedException: ");
	//   41   77:aload           6
	//   42   79:ldc1            #58  <String "InterruptedException: ">
	//   43   81:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
				stringbuilder.append(((Object) (interruptedexception)));
	//   45   85:aload           6
	//   46   87:aload           5
	//   47   89:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   48   92:pop             
				com.baidu.android.pushservice.e.a.e("StatisticPoster", stringbuilder.toString());
	//   49   93:ldc1            #67  <String "StatisticPoster">
	//   50   95:aload           6
	//   51   97:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   52  100:invokestatic    #77  <Method void a.e(String, String)>
			}
			if(!b.d(com.baidu.android.pushservice.f.n.b(a)))
	//*  53  103:aload_0         
	//*  54  104:getfield        #15  <Field n a>
	//*  55  107:invokestatic    #80  <Method android.content.Context com.baidu.android.pushservice.f.n.b(n)>
	//*  56  110:invokestatic    #86  <Method boolean b.d(android.content.Context)>
	//*  57  113:ifne            117
				return;
	//   58  116:return          
		}
		a.c();
	//   59  117:aload_0         
	//   60  118:getfield        #15  <Field n a>
	//   61  121:invokevirtual   #89  <Method void com.baidu.android.pushservice.f.n.c()>
	//   62  124:return          
	}

	final n a;

	n$1(n n1, String s, short word0)
	{
		a = n1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field n a>
		super(s, word0);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #18  <Method void c(String, short)>
	//    7   11:return          
	}
}
