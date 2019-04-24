// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.common.a;

import java.io.FilterInputStream;
import java.io.InputStream;

// Referenced classes of package com.startapp.common.a:
//			d

static class d$a extends FilterInputStream
{

	public long skip(long l)
	{
		long l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_3        
		do
		{
			long l2;
label0:
			{
label1:
				{
					if(l1 < l)
	//*   2    2:lload_3         
	//*   3    3:lload_1         
	//*   4    4:lcmp            
	//*   5    5:ifge            38
					{
						long l3 = in.skip(l - l1);
	//    6    8:aload_0         
	//    7    9:getfield        #18  <Field InputStream in>
	//    8   12:lload_1         
	//    9   13:lload_3         
	//   10   14:lsub            
	//   11   15:invokevirtual   #22  <Method long InputStream.skip(long)>
	//   12   18:lstore          7
						l2 = l3;
	//   13   20:lload           7
	//   14   22:lstore          5
						if(l3 != 0L)
							break label0;
	//   15   24:lload           7
	//   16   26:lconst_0        
	//   17   27:lcmp            
	//   18   28:ifne            43
						if(read() >= 0)
							break label1;
	//   19   31:aload_0         
	//   20   32:invokevirtual   #26  <Method int read()>
	//   21   35:ifge            40
					}
					return l1;
	//   22   38:lload_3         
	//   23   39:lreturn         
				}
				l2 = 1L;
	//   24   40:lconst_1        
	//   25   41:lstore          5
			}
			l1 = l2 + l1;
	//   26   43:lload           5
	//   27   45:lload_3         
	//   28   46:ladd            
	//   29   47:lstore_3        
		} while(true);
	//   30   48:goto            2
	}

	public d$a(InputStream inputstream)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void FilterInputStream(InputStream)>
	//    3    5:return          
	}
}
