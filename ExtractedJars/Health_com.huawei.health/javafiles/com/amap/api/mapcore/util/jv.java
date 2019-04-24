// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.amap.api.mapcore.util:
//			kb

public class jv extends kb
{

	public jv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void kb()>
		a = new ByteArrayOutputStream();
	//    2    4:aload_0         
	//    3    5:new             #12  <Class ByteArrayOutputStream>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void ByteArrayOutputStream()>
	//    6   12:putfield        #15  <Field ByteArrayOutputStream a>
	//    7   15:return          
	}

	public jv(kb kb1)
	{
		super(kb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void kb(kb)>
		a = new ByteArrayOutputStream();
	//    3    5:aload_0         
	//    4    6:new             #12  <Class ByteArrayOutputStream>
	//    5    9:dup             
	//    6   10:invokespecial   #13  <Method void ByteArrayOutputStream()>
	//    7   13:putfield        #15  <Field ByteArrayOutputStream a>
	//    8   16:return          
	}

	protected byte[] a(byte abyte0[])
	{
		abyte0 = a.toByteArray();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ByteArrayOutputStream a>
	//    2    4:invokevirtual   #26  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//    3    7:astore_1        
		try
		{
			a.close();
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field ByteArrayOutputStream a>
	//    6   12:invokevirtual   #29  <Method void ByteArrayOutputStream.close()>
		}
	//*   7   15:goto            23
		catch(IOException ioexception)
	//*   8   18:astore_2        
		{
			ioexception.printStackTrace();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #32  <Method void IOException.printStackTrace()>
		}
		a = new ByteArrayOutputStream();
	//   11   23:aload_0         
	//   12   24:new             #12  <Class ByteArrayOutputStream>
	//   13   27:dup             
	//   14   28:invokespecial   #13  <Method void ByteArrayOutputStream()>
	//   15   31:putfield        #15  <Field ByteArrayOutputStream a>
		return abyte0;
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public void b(byte abyte0[])
	{
		try
		{
			a.write(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ByteArrayOutputStream a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method void ByteArrayOutputStream.write(byte[])>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   5    9:astore_1        
		{
			((Throwable) (abyte0)).printStackTrace();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #40  <Method void Throwable.printStackTrace()>
		}
	//    8   14:return          
	}

	ByteArrayOutputStream a;
}
