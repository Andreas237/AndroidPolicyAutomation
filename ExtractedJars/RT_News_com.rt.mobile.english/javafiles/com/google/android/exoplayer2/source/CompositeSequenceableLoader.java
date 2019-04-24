// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;


// Referenced classes of package com.google.android.exoplayer2.source:
//			SequenceableLoader

public class CompositeSequenceableLoader
	implements SequenceableLoader
{

	public CompositeSequenceableLoader(SequenceableLoader asequenceableloader[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		loaders = asequenceableloader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SequenceableLoader[] loaders>
	//    5    9:return          
	}

	public boolean continueLoading(long l)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          12
		do
		{
			long l1 = getNextLoadPositionUs();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method long getNextLoadPositionUs()>
	//    4    7:lstore          8
			if(l1 == 0x0L)
	//*   5    9:lload           8
	//*   6   11:ldc2w           #23  <Long 0x0L>
	//*   7   14:lcmp            
	//*   8   15:ifne            21
				return flag1;
	//    9   18:iload           12
	//   10   20:ireturn         
			SequenceableLoader asequenceableloader[] = loaders;
	//   11   21:aload_0         
	//   12   22:getfield        #15  <Field SequenceableLoader[] loaders>
	//   13   25:astore          14
			int i1 = asequenceableloader.length;
	//   14   27:aload           14
	//   15   29:arraylength     
	//   16   30:istore          7
			int i = 0;
	//   17   32:iconst_0        
	//   18   33:istore_3        
			int j;
			int k;
			for(j = i; i < i1; j = k)
	//*  19   34:iload_3         
	//*  20   35:istore          4
	//*  21   37:iload_3         
	//*  22   38:iload           7
	//*  23   40:icmpge          124
			{
label0:
				{
					SequenceableLoader sequenceableloader = asequenceableloader[i];
	//   24   43:aload           14
	//   25   45:iload_3         
	//   26   46:aaload          
	//   27   47:astore          15
					long l2 = sequenceableloader.getNextLoadPositionUs();
	//   28   49:aload           15
	//   29   51:invokeinterface #25  <Method long SequenceableLoader.getNextLoadPositionUs()>
	//   30   56:lstore          10
					boolean flag;
					if(l2 != 0x0L && l2 <= l)
	//*  31   58:lload           10
	//*  32   60:ldc2w           #23  <Long 0x0L>
	//*  33   63:lcmp            
	//*  34   64:ifeq            80
	//*  35   67:lload           10
	//*  36   69:lload_1         
	//*  37   70:lcmp            
	//*  38   71:ifgt            80
						flag = true;
	//   39   74:iconst_1        
	//   40   75:istore          6
					else
	//*  41   77:goto            83
						flag = false;
	//   42   80:iconst_0        
	//   43   81:istore          6
					if(l2 != l1)
	//*  44   83:lload           10
	//*  45   85:lload           8
	//*  46   87:lcmp            
	//*  47   88:ifeq            100
					{
						k = j;
	//   48   91:iload           4
	//   49   93:istore          5
						if(!flag)
							break label0;
	//   50   95:iload           6
	//   51   97:ifeq            113
					}
					k = j | sequenceableloader.continueLoading(l);
	//   52  100:iload           4
	//   53  102:aload           15
	//   54  104:lload_1         
	//   55  105:invokeinterface #27  <Method boolean SequenceableLoader.continueLoading(long)>
	//   56  110:ior             
	//   57  111:istore          5
				}
				i++;
	//   58  113:iload_3         
	//   59  114:iconst_1        
	//   60  115:iadd            
	//   61  116:istore_3        
			}

	//   62  117:iload           5
	//   63  119:istore          4
	//*  64  121:goto            37
			boolean flag2 = ((boolean) (flag1 | j));
	//   65  124:iload           12
	//   66  126:iload           4
	//   67  128:ior             
	//   68  129:istore          13
			flag1 = flag2;
	//   69  131:iload           13
	//   70  133:istore          12
			if(j == 0)
	//*  71  135:iload           4
	//*  72  137:ifne            3
				return flag2;
	//   73  140:iload           13
	//   74  142:ireturn         
		} while(true);
	}

	public final long getBufferedPositionUs()
	{
		SequenceableLoader asequenceableloader[] = loaders;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SequenceableLoader[] loaders>
	//    2    4:astore          9
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_1        
		int j = asequenceableloader.length;
	//    5    8:aload           9
	//    6   10:arraylength     
	//    7   11:istore_2        
		long l;
		long l1;
		for(l = 0xffffffffL; i < j; l = l1)
	//*   8   12:ldc2w           #29  <Long 0xffffffffL>
	//*   9   15:lstore_3        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          62
		{
			long l3 = asequenceableloader[i].getBufferedPositionUs();
	//   13   21:aload           9
	//   14   23:iload_1         
	//   15   24:aaload          
	//   16   25:invokeinterface #32  <Method long SequenceableLoader.getBufferedPositionUs()>
	//   17   30:lstore          7
			l1 = l;
	//   18   32:lload_3         
	//   19   33:lstore          5
			if(l3 != 0x0L)
	//*  20   35:lload           7
	//*  21   37:ldc2w           #23  <Long 0x0L>
	//*  22   40:lcmp            
	//*  23   41:ifeq            52
				l1 = Math.min(l, l3);
	//   24   44:lload_3         
	//   25   45:lload           7
	//   26   47:invokestatic    #38  <Method long Math.min(long, long)>
	//   27   50:lstore          5
			i++;
	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_1        
		}

	//   32   56:lload           5
	//   33   58:lstore_3        
	//*  34   59:goto            16
		long l2 = l;
	//   35   62:lload_3         
	//   36   63:lstore          5
		if(l == 0xffffffffL)
	//*  37   65:lload_3         
	//*  38   66:ldc2w           #29  <Long 0xffffffffL>
	//*  39   69:lcmp            
	//*  40   70:ifne            78
			l2 = 0x0L;
	//   41   73:ldc2w           #23  <Long 0x0L>
	//   42   76:lstore          5
		return l2;
	//   43   78:lload           5
	//   44   80:lreturn         
	}

	public final long getNextLoadPositionUs()
	{
		SequenceableLoader asequenceableloader[] = loaders;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SequenceableLoader[] loaders>
	//    2    4:astore          9
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_1        
		int j = asequenceableloader.length;
	//    5    8:aload           9
	//    6   10:arraylength     
	//    7   11:istore_2        
		long l;
		long l1;
		for(l = 0xffffffffL; i < j; l = l1)
	//*   8   12:ldc2w           #29  <Long 0xffffffffL>
	//*   9   15:lstore_3        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          62
		{
			long l3 = asequenceableloader[i].getNextLoadPositionUs();
	//   13   21:aload           9
	//   14   23:iload_1         
	//   15   24:aaload          
	//   16   25:invokeinterface #25  <Method long SequenceableLoader.getNextLoadPositionUs()>
	//   17   30:lstore          7
			l1 = l;
	//   18   32:lload_3         
	//   19   33:lstore          5
			if(l3 != 0x0L)
	//*  20   35:lload           7
	//*  21   37:ldc2w           #23  <Long 0x0L>
	//*  22   40:lcmp            
	//*  23   41:ifeq            52
				l1 = Math.min(l, l3);
	//   24   44:lload_3         
	//   25   45:lload           7
	//   26   47:invokestatic    #38  <Method long Math.min(long, long)>
	//   27   50:lstore          5
			i++;
	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_1        
		}

	//   32   56:lload           5
	//   33   58:lstore_3        
	//*  34   59:goto            16
		long l2 = l;
	//   35   62:lload_3         
	//   36   63:lstore          5
		if(l == 0xffffffffL)
	//*  37   65:lload_3         
	//*  38   66:ldc2w           #29  <Long 0xffffffffL>
	//*  39   69:lcmp            
	//*  40   70:ifne            78
			l2 = 0x0L;
	//   41   73:ldc2w           #23  <Long 0x0L>
	//   42   76:lstore          5
		return l2;
	//   43   78:lload           5
	//   44   80:lreturn         
	}

	public final void reevaluateBuffer(long l)
	{
		SequenceableLoader asequenceableloader[] = loaders;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SequenceableLoader[] loaders>
	//    2    4:astore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		for(int j = asequenceableloader.length; i < j; i++)
	//*   5    8:aload           5
	//*   6   10:arraylength     
	//*   7   11:istore          4
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          36
			asequenceableloader[i].reevaluateBuffer(l);
	//   11   19:aload           5
	//   12   21:iload_3         
	//   13   22:aaload          
	//   14   23:lload_1         
	//   15   24:invokeinterface #42  <Method void SequenceableLoader.reevaluateBuffer(long)>

	//   16   29:iload_3         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:istore_3        
	//*  20   33:goto            13
	//   21   36:return          
	}

	protected final SequenceableLoader loaders[];
}
