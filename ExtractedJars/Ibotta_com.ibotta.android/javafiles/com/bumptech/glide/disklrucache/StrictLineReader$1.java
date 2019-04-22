// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

// Referenced classes of package com.bumptech.glide.disklrucache:
//			StrictLineReader

class StrictLineReader$1 extends ByteArrayOutputStream
{

	public String toString()
	{
		int i;
		if(count > 0 && buf[count - 1] == 13)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field int count>
	//*   2    4:ifle            33
	//*   3    7:aload_0         
	//*   4    8:getfield        #30  <Field byte[] buf>
	//*   5   11:aload_0         
	//*   6   12:getfield        #26  <Field int count>
	//*   7   15:iconst_1        
	//*   8   16:isub            
	//*   9   17:baload          
	//*  10   18:bipush          13
	//*  11   20:icmpne          33
			i = count - 1;
	//   12   23:aload_0         
	//   13   24:getfield        #26  <Field int count>
	//   14   27:iconst_1        
	//   15   28:isub            
	//   16   29:istore_1        
		else
	//*  17   30:goto            38
			i = count;
	//   18   33:aload_0         
	//   19   34:getfield        #26  <Field int count>
	//   20   37:istore_1        
		String s;
		try
		{
			s = new String(buf, 0, i, StrictLineReader.access$000(StrictLineReader.this).name());
	//   21   38:new             #32  <Class String>
	//   22   41:dup             
	//   23   42:aload_0         
	//   24   43:getfield        #30  <Field byte[] buf>
	//   25   46:iconst_0        
	//   26   47:iload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #15  <Field StrictLineReader this$0>
	//   29   52:invokestatic    #36  <Method Charset StrictLineReader.access$000(StrictLineReader)>
	//   30   55:invokevirtual   #41  <Method String Charset.name()>
	//   31   58:invokespecial   #44  <Method void String(byte[], int, int, String)>
	//   32   61:astore_2        
		}
	//*  33   62:aload_2         
	//*  34   63:areturn         
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  35   64:astore_2        
		{
			throw new AssertionError(((Object) (unsupportedencodingexception)));
	//   36   65:new             #46  <Class AssertionError>
	//   37   68:dup             
	//   38   69:aload_2         
	//   39   70:invokespecial   #49  <Method void AssertionError(Object)>
	//   40   73:athrow          
		}
		return s;
	}

	final StrictLineReader this$0;

	StrictLineReader$1(int i)
	{
		this$0 = StrictLineReader.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field StrictLineReader this$0>
		super(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #18  <Method void ByteArrayOutputStream(int)>
	//    6   10:return          
	}
}
