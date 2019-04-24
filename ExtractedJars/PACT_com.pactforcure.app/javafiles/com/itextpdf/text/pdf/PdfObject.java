// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfEncodings, PdfWriter, PRIndirectReference

public abstract class PdfObject
	implements Serializable
{

	protected PdfObject(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #47  <Field int type>
	//    5    9:return          
	}

	protected PdfObject(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #47  <Field int type>
		bytes = PdfEncodings.convertToBytes(s, ((String) (null)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aconst_null     
	//    8   12:invokestatic    #55  <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//    9   15:putfield        #57  <Field byte[] bytes>
	//   10   18:return          
	}

	protected PdfObject(int i, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		bytes = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #57  <Field byte[] bytes>
		type = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #47  <Field int type>
	//    8   14:return          
	}

	public boolean canBeInObjStm()
	{
		switch(type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int type>
		{
	//*   2    4:tableswitch     1 8: default 52
	//	               1 54
	//	               2 54
	//	               3 54
	//	               4 54
	//	               5 54
	//	               6 54
	//	               7 52
	//	               8 54
		case 7: // '\007'
		default:
			return false;
	//    3   52:iconst_0        
	//    4   53:ireturn         

		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 8: // '\b'
			return true;
	//    5   54:iconst_1        
	//    6   55:ireturn         
		}
	}

	public byte[] getBytes()
	{
		return bytes;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field byte[] bytes>
	//    2    4:areturn         
	}

	public PRIndirectReference getIndRef()
	{
		return indRef;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field PRIndirectReference indRef>
	//    2    4:areturn         
	}

	public boolean isArray()
	{
		return type == 5;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int type>
	//    2    4:iconst_5        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isBoolean()
	{
		return type == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int type>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isDictionary()
	{
		return type == 6;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int type>
	//    2    4:bipush          6
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public boolean isIndirect()
	{
		return type == 10;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int type>
	//    2    4:bipush          10
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public boolean isName()
	{
		return type == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int type>
	//    2    4:iconst_4        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isNull()
	{
		return type == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int type>
	//    2    4:bipush          8
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public boolean isNumber()
	{
		return type == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int type>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isStream()
	{
		return type == 7;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int type>
	//    2    4:bipush          7
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public boolean isString()
	{
		return type == 3;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int type>
	//    2    4:iconst_3        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public int length()
	{
		return toString().length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method String toString()>
	//    2    4:invokevirtual   #85  <Method int String.length()>
	//    3    7:ireturn         
	}

	protected void setContent(String s)
	{
		bytes = PdfEncodings.convertToBytes(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #55  <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//    4    6:putfield        #57  <Field byte[] bytes>
	//    5    9:return          
	}

	public void setIndRef(PRIndirectReference prindirectreference)
	{
		indRef = prindirectreference;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field PRIndirectReference indRef>
	//    3    5:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		if(bytes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field byte[] bytes>
	//*   2    4:ifnull          22
		{
			PdfWriter.checkPdfIsoConformance(pdfwriter, 11, ((Object) (this)));
	//    3    7:aload_1         
	//    4    8:bipush          11
	//    5   10:aload_0         
	//    6   11:invokestatic    #99  <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			outputstream.write(bytes);
	//    7   14:aload_2         
	//    8   15:aload_0         
	//    9   16:getfield        #57  <Field byte[] bytes>
	//   10   19:invokevirtual   #105 <Method void OutputStream.write(byte[])>
		}
	//   11   22:return          
	}

	public String toString()
	{
		if(bytes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field byte[] bytes>
	//*   2    4:ifnonnull       12
			return super.toString();
	//    3    7:aload_0         
	//    4    8:invokespecial   #107 <Method String Object.toString()>
	//    5   11:areturn         
		else
			return PdfEncodings.convertToString(bytes, ((String) (null)));
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field byte[] bytes>
	//    8   16:aconst_null     
	//    9   17:invokestatic    #111 <Method String PdfEncodings.convertToString(byte[], String)>
	//   10   20:areturn         
	}

	public int type()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int type>
	//    2    4:ireturn         
	}

	public static final int ARRAY = 5;
	public static final int BOOLEAN = 1;
	public static final int DICTIONARY = 6;
	public static final int INDIRECT = 10;
	public static final int NAME = 4;
	public static final String NOTHING = "";
	public static final int NULL = 8;
	public static final int NUMBER = 2;
	public static final int STREAM = 7;
	public static final int STRING = 3;
	public static final String TEXT_PDFDOCENCODING = "PDF";
	public static final String TEXT_UNICODE = "UnicodeBig";
	protected byte bytes[];
	protected PRIndirectReference indRef;
	protected int type;
}
