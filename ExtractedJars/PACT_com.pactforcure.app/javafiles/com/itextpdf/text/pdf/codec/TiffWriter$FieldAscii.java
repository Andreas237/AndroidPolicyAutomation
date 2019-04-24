// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;


// Referenced classes of package com.itextpdf.text.pdf.codec:
//			TiffWriter

public static class TiffWriter$FieldAscii extends TiffWriter.FieldBase
{

	public TiffWriter$FieldAscii(int i, String s)
	{
		super(i, 2, s.getBytes().length + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:aload_2         
	//    4    4:invokevirtual   #15  <Method byte[] String.getBytes()>
	//    5    7:arraylength     
	//    6    8:iconst_1        
	//    7    9:iadd            
	//    8   10:invokespecial   #18  <Method void TiffWriter$FieldBase(int, int, int)>
		s = ((String) (s.getBytes()));
	//    9   13:aload_2         
	//   10   14:invokevirtual   #15  <Method byte[] String.getBytes()>
	//   11   17:astore_2        
		data = new byte[s.length + 1];
	//   12   18:aload_0         
	//   13   19:aload_2         
	//   14   20:arraylength     
	//   15   21:iconst_1        
	//   16   22:iadd            
	//   17   23:newarray        byte[]
	//   18   25:putfield        #22  <Field byte[] data>
		System.arraycopy(((Object) (s)), 0, ((Object) (data)), 0, s.length);
	//   19   28:aload_2         
	//   20   29:iconst_0        
	//   21   30:aload_0         
	//   22   31:getfield        #22  <Field byte[] data>
	//   23   34:iconst_0        
	//   24   35:aload_2         
	//   25   36:arraylength     
	//   26   37:invokestatic    #28  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   27   40:return          
	}
}
