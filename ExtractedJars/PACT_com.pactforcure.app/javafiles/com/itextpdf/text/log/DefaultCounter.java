// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.log;

import com.itextpdf.text.Version;
import com.itextpdf.text.pdf.codec.Base64;
import java.io.PrintStream;

// Referenced classes of package com.itextpdf.text.log:
//			Counter

public class DefaultCounter
	implements Counter
{

	public DefaultCounter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		count = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field int count>
		level = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #34  <Field int level>
	//    8   14:aload_0         
	//    9   15:iconst_3        
	//   10   16:newarray        int[]
	//   11   18:dup             
	//   12   19:iconst_0        
	//   13   20:sipush          10000
	//   14   23:iastore         
	//   15   24:dup             
	//   16   25:iconst_1        
	//   17   26:sipush          5000
	//   18   29:iastore         
	//   19   30:dup             
	//   20   31:iconst_2        
	//   21   32:sipush          1000
	//   22   35:iastore         
	//   23   36:putfield        #36  <Field int[] repeat>
		repeat_level = 10000;
	//   24   39:aload_0         
	//   25   40:sipush          10000
	//   26   43:putfield        #38  <Field int repeat_level>
	//   27   46:return          
	}

	private void plusOne()
	{
		int i = count;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int count>
	//    2    4:istore_1        
		count = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #32  <Field int count>
		if(i > repeat_level)
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #38  <Field int repeat_level>
	//*  11   17:icmple          75
		{
			if(Version.isAGPLVersion())
	//*  12   20:invokestatic    #45  <Method boolean Version.isAGPLVersion()>
	//*  13   23:ifeq            70
			{
				level = level + 1;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #34  <Field int level>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #34  <Field int level>
				if(level == 1)
	//*  20   36:aload_0         
	//*  21   37:getfield        #34  <Field int level>
	//*  22   40:iconst_1        
	//*  23   41:icmpne          76
					repeat_level = repeat[1];
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #36  <Field int[] repeat>
	//   27   49:iconst_1        
	//   28   50:iaload          
	//   29   51:putfield        #38  <Field int repeat_level>
				else
	//*  30   54:getstatic       #51  <Field PrintStream System.out>
	//*  31   57:new             #53  <Class String>
	//*  32   60:dup             
	//*  33   61:getstatic       #26  <Field byte[] message>
	//*  34   64:invokespecial   #56  <Method void String(byte[])>
	//*  35   67:invokevirtual   #62  <Method void PrintStream.println(String)>
	//*  36   70:aload_0         
	//*  37   71:iconst_0        
	//*  38   72:putfield        #32  <Field int count>
	//*  39   75:return          
					repeat_level = repeat[2];
	//   40   76:aload_0         
	//   41   77:aload_0         
	//   42   78:getfield        #36  <Field int[] repeat>
	//   43   81:iconst_2        
	//   44   82:iaload          
	//   45   83:putfield        #38  <Field int repeat_level>
				System.out.println(new String(message));
			}
			count = 0;
		}
	//*  46   86:goto            54
	}

	public Counter getCounter(Class class1)
	{
		return ((Counter) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public void read(long l)
	{
		plusOne();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void plusOne()>
	//    2    4:return          
	}

	public void written(long l)
	{
		plusOne();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void plusOne()>
	//    2    4:return          
	}

	private static byte message[] = Base64.decode("DQoNCllvdSBhcmUgdXNpbmcgaVRleHQgdW5kZXIgdGhlIEFHUEwuDQoNCklmIHRoaXMgaXMgeW91ciBpbnRlbnRpb24sIHlvdSBoYXZlIHB1Ymxpc2hlZCB5b3VyIG93biBzb3VyY2UgY29kZSBhcyBBR1BMIHNvZnR3YXJlIHRvby4NClBsZWFzZSBsZXQgdXMga25vdyB3aGVyZSB0byBmaW5kIHlvdXIgc291cmNlIGNvZGUgYnkgc2VuZGluZyBhIG1haWwgdG8gYWdwbEBpdGV4dHBkZi5jb20NCldlJ2QgYmUgaG9ub3JlZCB0byBhZGQgaXQgdG8gb3VyIGxpc3Qgb2YgQUdQTCBwcm9qZWN0cyBidWlsdCBvbiB0b3Agb2YgaVRleHQgb3IgaVRleHRTaGFycA0KYW5kIHdlJ2xsIGV4cGxhaW4gaG93IHRvIHJlbW92ZSB0aGlzIG1lc3NhZ2UgZnJvbSB5b3VyIGVycm9yIGxvZ3MuDQoNCklmIHRoaXMgd2Fzbid0IHlvdXIgaW50ZW50aW9uLCB5b3UgYXJlIHByb2JhYmx5IHVzaW5nIGlUZXh0IGluIGEgbm9uLWZyZWUgZW52aXJvbm1lbnQuDQpJbiB0aGlzIGNhc2UsIHBsZWFzZSBjb250YWN0IHVzIGJ5IGZpbGxpbmcgb3V0IHRoaXMgZm9ybTogaHR0cDovL2l0ZXh0cGRmLmNvbS9zYWxlcw0KSWYgeW91IGFyZSBhIGN1c3RvbWVyLCB3ZSdsbCBleHBsYWluIGhvdyB0byBpbnN0YWxsIHlvdXIgbGljZW5zZSBrZXkgdG8gYXZvaWQgdGhpcyBtZXNzYWdlLg0KSWYgeW91J3JlIG5vdCBhIGN1c3RvbWVyLCB3ZSdsbCBleHBsYWluIHRoZSBiZW5lZml0cyBvZiBiZWNvbWluZyBhIGN1c3RvbWVyLg0KDQo=");
	private int count;
	private int level;
	private final int repeat[] = {
		10000, 5000, 1000
	};
	private int repeat_level;

	static 
	{
	//    0    0:ldc1            #18  <String "DQoNCllvdSBhcmUgdXNpbmcgaVRleHQgdW5kZXIgdGhlIEFHUEwuDQoNCklmIHRoaXMgaXMgeW91ciBpbnRlbnRpb24sIHlvdSBoYXZlIHB1Ymxpc2hlZCB5b3VyIG93biBzb3VyY2UgY29kZSBhcyBBR1BMIHNvZnR3YXJlIHRvby4NClBsZWFzZSBsZXQgdXMga25vdyB3aGVyZSB0byBmaW5kIHlvdXIgc291cmNlIGNvZGUgYnkgc2VuZGluZyBhIG1haWwgdG8gYWdwbEBpdGV4dHBkZi5jb20NCldlJ2QgYmUgaG9ub3JlZCB0byBhZGQgaXQgdG8gb3VyIGxpc3Qgb2YgQUdQTCBwcm9qZWN0cyBidWlsdCBvbiB0b3Agb2YgaVRleHQgb3IgaVRleHRTaGFycA0KYW5kIHdlJ2xsIGV4cGxhaW4gaG93IHRvIHJlbW92ZSB0aGlzIG1lc3NhZ2UgZnJvbSB5b3VyIGVycm9yIGxvZ3MuDQoNCklmIHRoaXMgd2Fzbid0IHlvdXIgaW50ZW50aW9uLCB5b3UgYXJlIHByb2JhYmx5IHVzaW5nIGlUZXh0IGluIGEgbm9uLWZyZWUgZW52aXJvbm1lbnQuDQpJbiB0aGlzIGNhc2UsIHBsZWFzZSBjb250YWN0IHVzIGJ5IGZpbGxpbmcgb3V0IHRoaXMgZm9ybTogaHR0cDovL2l0ZXh0cGRmLmNvbS9zYWxlcw0KSWYgeW91IGFyZSBhIGN1c3RvbWVyLCB3ZSdsbCBleHBsYWluIGhvdyB0byBpbnN0YWxsIHlvdXIgbGljZW5zZSBrZXkgdG8gYXZvaWQgdGhpcyBtZXNzYWdlLg0KSWYgeW91J3JlIG5vdCBhIGN1c3RvbWVyLCB3ZSdsbCBleHBsYWluIHRoZSBiZW5lZml0cyBvZiBiZWNvbWluZyBhIGN1c3RvbWVyLg0KDQo=">
	//    1    2:invokestatic    #24  <Method byte[] Base64.decode(String)>
	//    2    5:putstatic       #26  <Field byte[] message>
	//*   3    8:return          
	}
}
