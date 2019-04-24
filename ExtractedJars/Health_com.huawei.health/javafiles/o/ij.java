// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;

final class ij
	implements Serializable
{

	ij()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		m = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #27  <Field byte m>
		b = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #29  <Field int b>
		c = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #31  <Field int c>
		e = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #33  <Field int e>
		a = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #35  <Field int a>
		d = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #37  <Field int d>
		i = 0;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #39  <Field short i>
		f = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #41  <Field byte f>
		k = 0;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #43  <Field byte k>
		g = 0L;
	//   29   49:aload_0         
	//   30   50:lconst_0        
	//   31   51:putfield        #45  <Field long g>
		h = 0L;
	//   32   54:aload_0         
	//   33   55:lconst_0        
	//   34   56:putfield        #47  <Field long h>
	//   35   59:return          
	}

	protected final Boolean a(DataOutputStream dataoutputstream)
	{
		Boolean boolean1 = Boolean.valueOf(false);
	//    0    0:iconst_0        
	//    1    1:invokestatic    #57  <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:astore_2        
		if(dataoutputstream == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return boolean1;
	//    5    9:aload_2         
	//    6   10:areturn         
		try
		{
			dataoutputstream.writeByte(((int) (m)));
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #27  <Field byte m>
	//   10   16:invokevirtual   #63  <Method void DataOutputStream.writeByte(int)>
			dataoutputstream.writeInt(b);
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #29  <Field int b>
	//   14   24:invokevirtual   #66  <Method void DataOutputStream.writeInt(int)>
			dataoutputstream.writeInt(c);
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #31  <Field int c>
	//   18   32:invokevirtual   #66  <Method void DataOutputStream.writeInt(int)>
			dataoutputstream.writeInt(e);
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:getfield        #33  <Field int e>
	//   22   40:invokevirtual   #66  <Method void DataOutputStream.writeInt(int)>
			dataoutputstream.writeInt(a);
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #35  <Field int a>
	//   26   48:invokevirtual   #66  <Method void DataOutputStream.writeInt(int)>
			dataoutputstream.writeInt(d);
	//   27   51:aload_1         
	//   28   52:aload_0         
	//   29   53:getfield        #37  <Field int d>
	//   30   56:invokevirtual   #66  <Method void DataOutputStream.writeInt(int)>
			dataoutputstream.writeShort(((int) (i)));
	//   31   59:aload_1         
	//   32   60:aload_0         
	//   33   61:getfield        #39  <Field short i>
	//   34   64:invokevirtual   #69  <Method void DataOutputStream.writeShort(int)>
			dataoutputstream.writeByte(((int) (f)));
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:getfield        #41  <Field byte f>
	//   38   72:invokevirtual   #63  <Method void DataOutputStream.writeByte(int)>
			dataoutputstream.writeByte(((int) (k)));
	//   39   75:aload_1         
	//   40   76:aload_0         
	//   41   77:getfield        #43  <Field byte k>
	//   42   80:invokevirtual   #63  <Method void DataOutputStream.writeByte(int)>
			dataoutputstream.writeLong(g);
	//   43   83:aload_1         
	//   44   84:aload_0         
	//   45   85:getfield        #45  <Field long g>
	//   46   88:invokevirtual   #73  <Method void DataOutputStream.writeLong(long)>
			dataoutputstream.writeLong(h);
	//   47   91:aload_1         
	//   48   92:aload_0         
	//   49   93:getfield        #47  <Field long h>
	//   50   96:invokevirtual   #73  <Method void DataOutputStream.writeLong(long)>
		}
	//*  51   99:iconst_1        
	//*  52  100:invokestatic    #57  <Method Boolean Boolean.valueOf(boolean)>
	//*  53  103:areturn         
		// Misplaced declaration of an exception variable
		catch(DataOutputStream dataoutputstream)
	//*  54  104:astore_1        
		{
			return boolean1;
	//   55  105:aload_2         
	//   56  106:areturn         
		}
		return Boolean.valueOf(true);
	}

	protected int a;
	protected int b;
	protected int c;
	protected int d;
	protected int e;
	protected byte f;
	protected long g;
	protected long h;
	protected short i;
	protected byte k;
	private byte m;
}
