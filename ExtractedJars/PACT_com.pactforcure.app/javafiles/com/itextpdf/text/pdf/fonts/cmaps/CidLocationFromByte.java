// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import com.itextpdf.text.io.RandomAccessSourceFactory;
import com.itextpdf.text.pdf.PRTokeniser;
import com.itextpdf.text.pdf.RandomAccessFileOrArray;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf.fonts.cmaps:
//			CidLocation

public class CidLocationFromByte
	implements CidLocation
{

	public CidLocationFromByte(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		data = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field byte[] data>
	//    5    9:return          
	}

	public PRTokeniser getLocation(String s)
		throws IOException
	{
		return new PRTokeniser(new RandomAccessFileOrArray((new RandomAccessSourceFactory()).createSource(data)));
	//    0    0:new             #22  <Class PRTokeniser>
	//    1    3:dup             
	//    2    4:new             #24  <Class RandomAccessFileOrArray>
	//    3    7:dup             
	//    4    8:new             #26  <Class RandomAccessSourceFactory>
	//    5   11:dup             
	//    6   12:invokespecial   #27  <Method void RandomAccessSourceFactory()>
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field byte[] data>
	//    9   19:invokevirtual   #31  <Method com.itextpdf.text.io.RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//   10   22:invokespecial   #34  <Method void RandomAccessFileOrArray(com.itextpdf.text.io.RandomAccessSource)>
	//   11   25:invokespecial   #37  <Method void PRTokeniser(RandomAccessFileOrArray)>
	//   12   28:areturn         
	}

	private byte data[];
}
