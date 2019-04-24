// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;
import java.util.ArrayList;

// Referenced classes of package o:
//			il, im

final class io
	implements Serializable
{

	io()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		c = 8;
	//    2    4:aload_0         
	//    3    5:bipush          8
	//    4    7:putfield        #17  <Field byte c>
		a = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #19  <Field byte a>
		b = new ArrayList();
	//    8   15:aload_0         
	//    9   16:new             #21  <Class ArrayList>
	//   10   19:dup             
	//   11   20:invokespecial   #22  <Method void ArrayList()>
	//   12   23:putfield        #24  <Field ArrayList b>
	//   13   26:return          
	}

	protected final Boolean c(DataOutputStream dataoutputstream)
	{
		int i;
		il il1;
		try
		{
			dataoutputstream.writeByte(((int) (c)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field byte c>
	//    3    5:invokevirtual   #34  <Method void DataOutputStream.writeByte(int)>
			dataoutputstream.writeByte(((int) (a)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field byte a>
	//    7   13:invokevirtual   #34  <Method void DataOutputStream.writeByte(int)>
		}
	//*   8   16:iconst_0        
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:aload_0         
	//*  12   20:getfield        #19  <Field byte a>
	//*  13   23:icmpge          77
	//*  14   26:aload_0         
	//*  15   27:getfield        #24  <Field ArrayList b>
	//*  16   30:iload_2         
	//*  17   31:invokevirtual   #38  <Method Object ArrayList.get(int)>
	//*  18   34:checkcast       #40  <Class il>
	//*  19   37:astore_3        
	//*  20   38:aload_1         
	//*  21   39:aload_3         
	//*  22   40:getfield        #43  <Field byte[] il.b>
	//*  23   43:invokevirtual   #47  <Method void DataOutputStream.write(byte[])>
	//*  24   46:aload_1         
	//*  25   47:aload_3         
	//*  26   48:getfield        #50  <Field short il.c>
	//*  27   51:invokevirtual   #53  <Method void DataOutputStream.writeShort(int)>
	//*  28   54:aload_1         
	//*  29   55:aload_3         
	//*  30   56:getfield        #56  <Field byte[] il.d>
	//*  31   59:aload_3         
	//*  32   60:getfield        #56  <Field byte[] il.d>
	//*  33   63:arraylength     
	//*  34   64:invokestatic    #61  <Method byte[] im.d(byte[], int)>
	//*  35   67:invokevirtual   #47  <Method void DataOutputStream.write(byte[])>
	//*  36   70:iload_2         
	//*  37   71:iconst_1        
	//*  38   72:iadd            
	//*  39   73:istore_2        
	//*  40   74:goto            18
	//*  41   77:iconst_1        
	//*  42   78:invokestatic    #67  <Method Boolean Boolean.valueOf(boolean)>
	//*  43   81:areturn         
		// Misplaced declaration of an exception variable
		catch(DataOutputStream dataoutputstream)
	//*  44   82:astore_1        
		{
			return Boolean.valueOf(false);
	//   45   83:iconst_0        
	//   46   84:invokestatic    #67  <Method Boolean Boolean.valueOf(boolean)>
	//   47   87:areturn         
		}
		i = 0;
		if(i >= a)
			break; /* Loop/switch isn't completed */
		il1 = (il)b.get(i);
		dataoutputstream.write(il1.b);
		dataoutputstream.writeShort(((int) (il1.c)));
		dataoutputstream.write(im.d(il1.d, il1.d.length));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_18;
_L1:
		return Boolean.valueOf(true);
	}

	protected byte a;
	protected ArrayList b;
	private byte c;
}
