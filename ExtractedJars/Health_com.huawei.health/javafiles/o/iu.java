// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;

final class iu
	implements Serializable
{

	iu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		h = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #22  <Field byte h>
		d = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field int d>
		a = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field int a>
		b = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #28  <Field short b>
		c = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #30  <Field short c>
		e = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #32  <Field int e>
		g = 0;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #34  <Field byte g>
	//   23   39:return          
	}

	protected final Boolean e(DataOutputStream dataoutputstream)
	{
		try
		{
			dataoutputstream.writeByte(((int) (h)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field byte h>
	//    3    5:invokevirtual   #44  <Method void DataOutputStream.writeByte(int)>
			dataoutputstream.writeInt(d);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field int d>
	//    7   13:invokevirtual   #47  <Method void DataOutputStream.writeInt(int)>
			dataoutputstream.writeInt(a);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #26  <Field int a>
	//   11   21:invokevirtual   #47  <Method void DataOutputStream.writeInt(int)>
			dataoutputstream.writeShort(((int) (b)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #28  <Field short b>
	//   15   29:invokevirtual   #50  <Method void DataOutputStream.writeShort(int)>
			dataoutputstream.writeShort(((int) (c)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #30  <Field short c>
	//   19   37:invokevirtual   #50  <Method void DataOutputStream.writeShort(int)>
			dataoutputstream.writeInt(e);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #32  <Field int e>
	//   23   45:invokevirtual   #47  <Method void DataOutputStream.writeInt(int)>
			dataoutputstream.writeByte(((int) (g)));
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #34  <Field byte g>
	//   27   53:invokevirtual   #44  <Method void DataOutputStream.writeByte(int)>
		}
	//*  28   56:iconst_1        
	//*  29   57:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
	//*  30   60:areturn         
		// Misplaced declaration of an exception variable
		catch(DataOutputStream dataoutputstream)
	//*  31   61:astore_1        
		{
			return Boolean.valueOf(false);
	//   32   62:iconst_0        
	//   33   63:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
	//   34   66:areturn         
		}
		return Boolean.valueOf(true);
	}

	protected int a;
	protected short b;
	protected short c;
	protected int d;
	protected int e;
	protected byte g;
	private byte h;
}
