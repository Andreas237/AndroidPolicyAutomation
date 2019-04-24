// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfWriter, OutputStreamCounter, PdfObject, PdfIndirectObject, 
//			PdfIndirectReference, ByteBuffer, PdfStream, PdfName, 
//			PdfNumber, PdfArray

public static class PdfWriter$PdfBody
{
	public static class PdfCrossReference
		implements Comparable
	{

		public int compareTo(PdfCrossReference pdfcrossreference)
		{
			if(refnum < pdfcrossreference.refnum)
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field int refnum>
		//*   2    4:aload_1         
		//*   3    5:getfield        #30  <Field int refnum>
		//*   4    8:icmpge          13
				return -1;
		//    5   11:iconst_m1       
		//    6   12:ireturn         
			return refnum != pdfcrossreference.refnum ? 1 : 0;
		//    7   13:aload_0         
		//    8   14:getfield        #30  <Field int refnum>
		//    9   17:aload_1         
		//   10   18:getfield        #30  <Field int refnum>
		//   11   21:icmpne          26
		//   12   24:iconst_0        
		//   13   25:ireturn         
		//   14   26:iconst_1        
		//   15   27:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((PdfCrossReference)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class PdfWriter$PdfBody$PdfCrossReference>
		//    3    5:invokevirtual   #40  <Method int compareTo(PdfWriter$PdfBody$PdfCrossReference)>
		//    4    8:ireturn         
		}

		public boolean equals(Object obj)
		{
			boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			boolean flag = flag1;
		//    2    2:iload_3         
		//    3    3:istore_2        
			if(obj instanceof PdfCrossReference)
		//*   4    4:aload_1         
		//*   5    5:instanceof      #2   <Class PdfWriter$PdfBody$PdfCrossReference>
		//*   6    8:ifeq            31
			{
				obj = ((Object) ((PdfCrossReference)obj));
		//    7   11:aload_1         
		//    8   12:checkcast       #2   <Class PdfWriter$PdfBody$PdfCrossReference>
		//    9   15:astore_1        
				flag = flag1;
		//   10   16:iload_3         
		//   11   17:istore_2        
				if(refnum == ((PdfCrossReference) (obj)).refnum)
		//*  12   18:aload_0         
		//*  13   19:getfield        #30  <Field int refnum>
		//*  14   22:aload_1         
		//*  15   23:getfield        #30  <Field int refnum>
		//*  16   26:icmpne          31
					flag = true;
		//   17   29:iconst_1        
		//   18   30:istore_2        
			}
			return flag;
		//   19   31:iload_2         
		//   20   32:ireturn         
		}

		public int getRefnum()
		{
			return refnum;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int refnum>
		//    2    4:ireturn         
		}

		public int hashCode()
		{
			return refnum;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int refnum>
		//    2    4:ireturn         
		}

		public void toPdf(int i, OutputStream outputstream)
			throws IOException
		{
			outputstream.write(((int) ((byte)type)));
		//    0    0:aload_2         
		//    1    1:aload_0         
		//    2    2:getfield        #26  <Field int type>
		//    3    5:int2byte        
		//    4    6:invokevirtual   #55  <Method void OutputStream.write(int)>
			do
			{
				i--;
		//    5    9:iload_1         
		//    6   10:iconst_1        
		//    7   11:isub            
		//    8   12:istore_1        
				if(i >= 0)
		//*   9   13:iload_1         
		//*  10   14:iflt            39
				{
					outputstream.write(((int) ((byte)(int)(offset >>> i * 8 & 255L))));
		//   11   17:aload_2         
		//   12   18:aload_0         
		//   13   19:getfield        #28  <Field long offset>
		//   14   22:iload_1         
		//   15   23:bipush          8
		//   16   25:imul            
		//   17   26:lushr           
		//   18   27:ldc2w           #56  <Long 255L>
		//   19   30:land            
		//   20   31:l2i             
		//   21   32:int2byte        
		//   22   33:invokevirtual   #55  <Method void OutputStream.write(int)>
				} else
		//*  23   36:goto            9
				{
					outputstream.write(((int) ((byte)(generation >>> 8 & 0xff))));
		//   24   39:aload_2         
		//   25   40:aload_0         
		//   26   41:getfield        #32  <Field int generation>
		//   27   44:bipush          8
		//   28   46:iushr           
		//   29   47:sipush          255
		//   30   50:iand            
		//   31   51:int2byte        
		//   32   52:invokevirtual   #55  <Method void OutputStream.write(int)>
					outputstream.write(((int) ((byte)(generation & 0xff))));
		//   33   55:aload_2         
		//   34   56:aload_0         
		//   35   57:getfield        #32  <Field int generation>
		//   36   60:sipush          255
		//   37   63:iand            
		//   38   64:int2byte        
		//   39   65:invokevirtual   #55  <Method void OutputStream.write(int)>
					return;
		//   40   68:return          
				}
			} while(true);
		}

		public void toPdf(OutputStream outputstream)
			throws IOException
		{
			StringBuffer stringbuffer = (new StringBuffer("0000000000")).append(offset);
		//    0    0:new             #61  <Class StringBuffer>
		//    1    3:dup             
		//    2    4:ldc1            #63  <String "0000000000">
		//    3    6:invokespecial   #66  <Method void StringBuffer(String)>
		//    4    9:aload_0         
		//    5   10:getfield        #28  <Field long offset>
		//    6   13:invokevirtual   #70  <Method StringBuffer StringBuffer.append(long)>
		//    7   16:astore_3        
			stringbuffer.delete(0, stringbuffer.length() - 10);
		//    8   17:aload_3         
		//    9   18:iconst_0        
		//   10   19:aload_3         
		//   11   20:invokevirtual   #73  <Method int StringBuffer.length()>
		//   12   23:bipush          10
		//   13   25:isub            
		//   14   26:invokevirtual   #77  <Method StringBuffer StringBuffer.delete(int, int)>
		//   15   29:pop             
			Object obj = ((Object) ((new StringBuffer("00000")).append(generation)));
		//   16   30:new             #61  <Class StringBuffer>
		//   17   33:dup             
		//   18   34:ldc1            #79  <String "00000">
		//   19   36:invokespecial   #66  <Method void StringBuffer(String)>
		//   20   39:aload_0         
		//   21   40:getfield        #32  <Field int generation>
		//   22   43:invokevirtual   #82  <Method StringBuffer StringBuffer.append(int)>
		//   23   46:astore_2        
			((StringBuffer) (obj)).delete(0, ((StringBuffer) (obj)).length() - 5);
		//   24   47:aload_2         
		//   25   48:iconst_0        
		//   26   49:aload_2         
		//   27   50:invokevirtual   #73  <Method int StringBuffer.length()>
		//   28   53:iconst_5        
		//   29   54:isub            
		//   30   55:invokevirtual   #77  <Method StringBuffer StringBuffer.delete(int, int)>
		//   31   58:pop             
			StringBuffer stringbuffer1 = stringbuffer.append(' ').append(((StringBuffer) (obj)));
		//   32   59:aload_3         
		//   33   60:bipush          32
		//   34   62:invokevirtual   #85  <Method StringBuffer StringBuffer.append(char)>
		//   35   65:aload_2         
		//   36   66:invokevirtual   #88  <Method StringBuffer StringBuffer.append(StringBuffer)>
		//   37   69:astore          4
			if(generation == 65535)
		//*  38   71:aload_0         
		//*  39   72:getfield        #32  <Field int generation>
		//*  40   75:ldc1            #89  <Int 65535>
		//*  41   77:icmpne          102
				obj = " f \n";
		//   42   80:ldc1            #91  <String " f \n">
		//   43   82:astore_2        
			else
		//*  44   83:aload           4
		//*  45   85:aload_2         
		//*  46   86:invokevirtual   #94  <Method StringBuffer StringBuffer.append(String)>
		//*  47   89:pop             
		//*  48   90:aload_1         
		//*  49   91:aload_3         
		//*  50   92:invokevirtual   #98  <Method String StringBuffer.toString()>
		//*  51   95:invokestatic    #104 <Method byte[] DocWriter.getISOBytes(String)>
		//*  52   98:invokevirtual   #107 <Method void OutputStream.write(byte[])>
		//*  53  101:return          
				obj = " n \n";
		//   54  102:ldc1            #109 <String " n \n">
		//   55  104:astore_2        
			stringbuffer1.append(((String) (obj)));
			outputstream.write(DocWriter.getISOBytes(stringbuffer.toString()));
		//*  56  105:goto            83
		}

		private final int generation;
		private final long offset;
		private final int refnum;
		private final int type;

		public PdfCrossReference(int i, int j, long l, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			type = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #26  <Field int type>
			offset = l;
		//    5    9:aload_0         
		//    6   10:lload_3         
		//    7   11:putfield        #28  <Field long offset>
			refnum = j;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #30  <Field int refnum>
			generation = k;
		//   11   19:aload_0         
		//   12   20:iload           5
		//   13   22:putfield        #32  <Field int generation>
		//   14   25:return          
		}

		public PdfCrossReference(int i, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			type = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #26  <Field int type>
			offset = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #28  <Field long offset>
			refnum = i;
		//    8   14:aload_0         
		//    9   15:iload_1         
		//   10   16:putfield        #30  <Field int refnum>
			generation = 0;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #32  <Field int generation>
		//   14   24:return          
		}

		public PdfCrossReference(int i, long l, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			type = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #26  <Field int type>
			offset = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #28  <Field long offset>
			refnum = i;
		//    8   14:aload_0         
		//    9   15:iload_1         
		//   10   16:putfield        #30  <Field int refnum>
			generation = j;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #32  <Field int generation>
		//   14   25:return          
		}
	}


	PdfIndirectObject add(PdfObject pdfobject)
		throws IOException
	{
		return add(pdfobject, getIndirectReferenceNumber());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #70  <Method int getIndirectReferenceNumber()>
	//    4    6:invokevirtual   #73  <Method PdfIndirectObject add(PdfObject, int)>
	//    5    9:areturn         
	}

	PdfIndirectObject add(PdfObject pdfobject, int i)
		throws IOException
	{
		return add(pdfobject, i, 0, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_1        
	//    5    5:invokevirtual   #77  <Method PdfIndirectObject add(PdfObject, int, int, boolean)>
	//    6    8:areturn         
	}

	protected PdfIndirectObject add(PdfObject pdfobject, int i, int j, boolean flag)
		throws IOException
	{
		if(flag && pdfobject.canBeInObjStm() && writer.isFullCompression())
	//*   0    0:iload           4
	//*   1    2:ifeq            78
	//*   2    5:aload_1         
	//*   3    6:invokevirtual   #83  <Method boolean PdfObject.canBeInObjStm()>
	//*   4    9:ifeq            78
	//*   5   12:aload_0         
	//*   6   13:getfield        #62  <Field PdfWriter writer>
	//*   7   16:invokevirtual   #86  <Method boolean PdfWriter.isFullCompression()>
	//*   8   19:ifeq            78
		{
			PdfCrossReference pdfcrossreference = addToObjStm(pdfobject, i);
	//    9   22:aload_0         
	//   10   23:aload_1         
	//   11   24:iload_2         
	//   12   25:invokevirtual   #90  <Method PdfWriter$PdfBody$PdfCrossReference addToObjStm(PdfObject, int)>
	//   13   28:astore          5
			pdfobject = ((PdfObject) (new PdfIndirectObject(i, pdfobject, writer)));
	//   14   30:new             #92  <Class PdfIndirectObject>
	//   15   33:dup             
	//   16   34:iload_2         
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #62  <Field PdfWriter writer>
	//   20   40:invokespecial   #95  <Method void PdfIndirectObject(int, PdfObject, PdfWriter)>
	//   21   43:astore_1        
			if(!xrefs.add(((Object) (pdfcrossreference))))
	//*  22   44:aload_0         
	//*  23   45:getfield        #38  <Field TreeSet xrefs>
	//*  24   48:aload           5
	//*  25   50:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
	//*  26   53:ifne            76
			{
				xrefs.remove(((Object) (pdfcrossreference)));
	//   27   56:aload_0         
	//   28   57:getfield        #38  <Field TreeSet xrefs>
	//   29   60:aload           5
	//   30   62:invokevirtual   #98  <Method boolean TreeSet.remove(Object)>
	//   31   65:pop             
				xrefs.add(((Object) (pdfcrossreference)));
	//   32   66:aload_0         
	//   33   67:getfield        #38  <Field TreeSet xrefs>
	//   34   70:aload           5
	//   35   72:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
	//   36   75:pop             
			}
			return ((PdfIndirectObject) (pdfobject));
	//   37   76:aload_1         
	//   38   77:areturn         
		}
		if(writer.isFullCompression())
	//*  39   78:aload_0         
	//*  40   79:getfield        #62  <Field PdfWriter writer>
	//*  41   82:invokevirtual   #86  <Method boolean PdfWriter.isFullCompression()>
	//*  42   85:ifeq            110
		{
			pdfobject = ((PdfObject) (new PdfIndirectObject(i, pdfobject, writer)));
	//   43   88:new             #92  <Class PdfIndirectObject>
	//   44   91:dup             
	//   45   92:iload_2         
	//   46   93:aload_1         
	//   47   94:aload_0         
	//   48   95:getfield        #62  <Field PdfWriter writer>
	//   49   98:invokespecial   #95  <Method void PdfIndirectObject(int, PdfObject, PdfWriter)>
	//   50  101:astore_1        
			write(((PdfIndirectObject) (pdfobject)), i);
	//   51  102:aload_0         
	//   52  103:aload_1         
	//   53  104:iload_2         
	//   54  105:invokevirtual   #102 <Method void write(PdfIndirectObject, int)>
			return ((PdfIndirectObject) (pdfobject));
	//   55  108:aload_1         
	//   56  109:areturn         
		} else
		{
			pdfobject = ((PdfObject) (new PdfIndirectObject(i, j, pdfobject, writer)));
	//   57  110:new             #92  <Class PdfIndirectObject>
	//   58  113:dup             
	//   59  114:iload_2         
	//   60  115:iload_3         
	//   61  116:aload_1         
	//   62  117:aload_0         
	//   63  118:getfield        #62  <Field PdfWriter writer>
	//   64  121:invokespecial   #105 <Method void PdfIndirectObject(int, int, PdfObject, PdfWriter)>
	//   65  124:astore_1        
			write(((PdfIndirectObject) (pdfobject)), i, j);
	//   66  125:aload_0         
	//   67  126:aload_1         
	//   68  127:iload_2         
	//   69  128:iload_3         
	//   70  129:invokevirtual   #108 <Method void write(PdfIndirectObject, int, int)>
			return ((PdfIndirectObject) (pdfobject));
	//   71  132:aload_1         
	//   72  133:areturn         
		}
	}

	PdfIndirectObject add(PdfObject pdfobject, PdfIndirectReference pdfindirectreference)
		throws IOException
	{
		return add(pdfobject, pdfindirectreference, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #112 <Method PdfIndirectObject add(PdfObject, PdfIndirectReference, boolean)>
	//    5    7:areturn         
	}

	PdfIndirectObject add(PdfObject pdfobject, PdfIndirectReference pdfindirectreference, boolean flag)
		throws IOException
	{
		return add(pdfobject, pdfindirectreference.getNumber(), pdfindirectreference.getGeneration(), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #117 <Method int PdfIndirectReference.getNumber()>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #120 <Method int PdfIndirectReference.getGeneration()>
	//    6   10:iload_3         
	//    7   11:invokevirtual   #77  <Method PdfIndirectObject add(PdfObject, int, int, boolean)>
	//    8   14:areturn         
	}

	PdfIndirectObject add(PdfObject pdfobject, boolean flag)
		throws IOException
	{
		return add(pdfobject, getIndirectReferenceNumber(), 0, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #70  <Method int getIndirectReferenceNumber()>
	//    4    6:iconst_0        
	//    5    7:iload_2         
	//    6    8:invokevirtual   #77  <Method PdfIndirectObject add(PdfObject, int, int, boolean)>
	//    7   11:areturn         
	}

	protected PdfCrossReference addToObjStm(PdfObject pdfobject, int i)
		throws IOException
	{
		if(numObj >= 200)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int numObj>
	//*   2    4:sipush          200
	//*   3    7:icmplt          14
			flushObjStm();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #124 <Method void flushObjStm()>
		if(index == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #126 <Field ByteBuffer index>
	//*   8   18:ifnonnull       56
		{
			index = new ByteBuffer();
	//    9   21:aload_0         
	//   10   22:new             #128 <Class ByteBuffer>
	//   11   25:dup             
	//   12   26:invokespecial   #129 <Method void ByteBuffer()>
	//   13   29:putfield        #126 <Field ByteBuffer index>
			streamObjects = new ByteBuffer();
	//   14   32:aload_0         
	//   15   33:new             #128 <Class ByteBuffer>
	//   16   36:dup             
	//   17   37:invokespecial   #129 <Method void ByteBuffer()>
	//   18   40:putfield        #131 <Field ByteBuffer streamObjects>
			currentObjNum = getIndirectReferenceNumber();
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:invokevirtual   #70  <Method int getIndirectReferenceNumber()>
	//   22   48:putfield        #133 <Field int currentObjNum>
			numObj = 0;
	//   23   51:aload_0         
	//   24   52:iconst_0        
	//   25   53:putfield        #33  <Field int numObj>
		}
		int j = streamObjects.size();
	//   26   56:aload_0         
	//   27   57:getfield        #131 <Field ByteBuffer streamObjects>
	//   28   60:invokevirtual   #136 <Method int ByteBuffer.size()>
	//   29   63:istore_3        
		int k = numObj;
	//   30   64:aload_0         
	//   31   65:getfield        #33  <Field int numObj>
	//   32   68:istore          4
		numObj = k + 1;
	//   33   70:aload_0         
	//   34   71:iload           4
	//   35   73:iconst_1        
	//   36   74:iadd            
	//   37   75:putfield        #33  <Field int numObj>
		PdfEncryption pdfencryption = writer.crypto;
	//   38   78:aload_0         
	//   39   79:getfield        #62  <Field PdfWriter writer>
	//   40   82:getfield        #140 <Field PdfEncryption PdfWriter.crypto>
	//   41   85:astore          5
		writer.crypto = null;
	//   42   87:aload_0         
	//   43   88:getfield        #62  <Field PdfWriter writer>
	//   44   91:aconst_null     
	//   45   92:putfield        #140 <Field PdfEncryption PdfWriter.crypto>
		pdfobject.toPdf(writer, ((OutputStream) (streamObjects)));
	//   46   95:aload_1         
	//   47   96:aload_0         
	//   48   97:getfield        #62  <Field PdfWriter writer>
	//   49  100:aload_0         
	//   50  101:getfield        #131 <Field ByteBuffer streamObjects>
	//   51  104:invokevirtual   #144 <Method void PdfObject.toPdf(PdfWriter, OutputStream)>
		writer.crypto = pdfencryption;
	//   52  107:aload_0         
	//   53  108:getfield        #62  <Field PdfWriter writer>
	//   54  111:aload           5
	//   55  113:putfield        #140 <Field PdfEncryption PdfWriter.crypto>
		streamObjects.append(' ');
	//   56  116:aload_0         
	//   57  117:getfield        #131 <Field ByteBuffer streamObjects>
	//   58  120:bipush          32
	//   59  122:invokevirtual   #148 <Method ByteBuffer ByteBuffer.append(char)>
	//   60  125:pop             
		index.append(i).append(' ').append(j).append(' ');
	//   61  126:aload_0         
	//   62  127:getfield        #126 <Field ByteBuffer index>
	//   63  130:iload_2         
	//   64  131:invokevirtual   #151 <Method ByteBuffer ByteBuffer.append(int)>
	//   65  134:bipush          32
	//   66  136:invokevirtual   #148 <Method ByteBuffer ByteBuffer.append(char)>
	//   67  139:iload_3         
	//   68  140:invokevirtual   #151 <Method ByteBuffer ByteBuffer.append(int)>
	//   69  143:bipush          32
	//   70  145:invokevirtual   #148 <Method ByteBuffer ByteBuffer.append(char)>
	//   71  148:pop             
		return new PdfCrossReference(2, i, currentObjNum, k);
	//   72  149:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
	//   73  152:dup             
	//   74  153:iconst_2        
	//   75  154:iload_2         
	//   76  155:aload_0         
	//   77  156:getfield        #133 <Field int currentObjNum>
	//   78  159:i2l             
	//   79  160:iload           4
	//   80  162:invokespecial   #154 <Method void PdfWriter$PdfBody$PdfCrossReference(int, int, long, int)>
	//   81  165:areturn         
	}

	public void flushObjStm()
		throws IOException
	{
		if(numObj == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int numObj>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			int i = index.size();
	//    4    8:aload_0         
	//    5    9:getfield        #126 <Field ByteBuffer index>
	//    6   12:invokevirtual   #136 <Method int ByteBuffer.size()>
	//    7   15:istore_1        
			index.append(streamObjects);
	//    8   16:aload_0         
	//    9   17:getfield        #126 <Field ByteBuffer index>
	//   10   20:aload_0         
	//   11   21:getfield        #131 <Field ByteBuffer streamObjects>
	//   12   24:invokevirtual   #157 <Method ByteBuffer ByteBuffer.append(ByteBuffer)>
	//   13   27:pop             
			PdfStream pdfstream = new PdfStream(index.toByteArray());
	//   14   28:new             #159 <Class PdfStream>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:getfield        #126 <Field ByteBuffer index>
	//   18   36:invokevirtual   #163 <Method byte[] ByteBuffer.toByteArray()>
	//   19   39:invokespecial   #166 <Method void PdfStream(byte[])>
	//   20   42:astore_2        
			pdfstream.flateCompress(writer.getCompressionLevel());
	//   21   43:aload_2         
	//   22   44:aload_0         
	//   23   45:getfield        #62  <Field PdfWriter writer>
	//   24   48:invokevirtual   #169 <Method int PdfWriter.getCompressionLevel()>
	//   25   51:invokevirtual   #173 <Method void PdfStream.flateCompress(int)>
			pdfstream.put(PdfName.TYPE, ((PdfObject) (PdfName.OBJSTM)));
	//   26   54:aload_2         
	//   27   55:getstatic       #179 <Field PdfName PdfName.TYPE>
	//   28   58:getstatic       #182 <Field PdfName PdfName.OBJSTM>
	//   29   61:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			pdfstream.put(PdfName.N, ((PdfObject) (new PdfNumber(numObj))));
	//   30   64:aload_2         
	//   31   65:getstatic       #189 <Field PdfName PdfName.N>
	//   32   68:new             #191 <Class PdfNumber>
	//   33   71:dup             
	//   34   72:aload_0         
	//   35   73:getfield        #33  <Field int numObj>
	//   36   76:invokespecial   #193 <Method void PdfNumber(int)>
	//   37   79:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			pdfstream.put(PdfName.FIRST, ((PdfObject) (new PdfNumber(i))));
	//   38   82:aload_2         
	//   39   83:getstatic       #196 <Field PdfName PdfName.FIRST>
	//   40   86:new             #191 <Class PdfNumber>
	//   41   89:dup             
	//   42   90:iload_1         
	//   43   91:invokespecial   #193 <Method void PdfNumber(int)>
	//   44   94:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			add(((PdfObject) (pdfstream)), currentObjNum);
	//   45   97:aload_0         
	//   46   98:aload_2         
	//   47   99:aload_0         
	//   48  100:getfield        #133 <Field int currentObjNum>
	//   49  103:invokevirtual   #73  <Method PdfIndirectObject add(PdfObject, int)>
	//   50  106:pop             
			index = null;
	//   51  107:aload_0         
	//   52  108:aconst_null     
	//   53  109:putfield        #126 <Field ByteBuffer index>
			streamObjects = null;
	//   54  112:aload_0         
	//   55  113:aconst_null     
	//   56  114:putfield        #131 <Field ByteBuffer streamObjects>
			numObj = 0;
	//   57  117:aload_0         
	//   58  118:iconst_0        
	//   59  119:putfield        #33  <Field int numObj>
			return;
	//   60  122:return          
		}
	}

	protected int getIndirectReferenceNumber()
	{
		int i = refnum;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int refnum>
	//    2    4:istore_1        
		refnum = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #60  <Field int refnum>
		xrefs.add(((Object) (new PdfCrossReference(i, 0L, 65535))));
	//    8   12:aload_0         
	//    9   13:getfield        #38  <Field TreeSet xrefs>
	//   10   16:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
	//   11   19:dup             
	//   12   20:iload_1         
	//   13   21:lconst_0        
	//   14   22:ldc1            #39  <Int 65535>
	//   15   24:invokespecial   #42  <Method void PdfWriter$PdfBody$PdfCrossReference(int, long, int)>
	//   16   27:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
	//   17   30:pop             
		return i;
	//   18   31:iload_1         
	//   19   32:ireturn         
	}

	public PdfIndirectReference getPdfIndirectReference()
	{
		return new PdfIndirectReference(0, getIndirectReferenceNumber());
	//    0    0:new             #114 <Class PdfIndirectReference>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:invokevirtual   #70  <Method int getIndirectReferenceNumber()>
	//    5    9:invokespecial   #201 <Method void PdfIndirectReference(int, int)>
	//    6   12:areturn         
	}

	public long offset()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field long position>
	//    2    4:lreturn         
	}

	void setRefnum(int i)
	{
		refnum = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field int refnum>
	//    3    5:return          
	}

	public int size()
	{
		return Math.max(((PdfCrossReference)xrefs.last()).getRefnum() + 1, refnum);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field TreeSet xrefs>
	//    2    4:invokevirtual   #207 <Method Object TreeSet.last()>
	//    3    7:checkcast       #9   <Class PdfWriter$PdfBody$PdfCrossReference>
	//    4   10:invokevirtual   #210 <Method int PdfWriter$PdfBody$PdfCrossReference.getRefnum()>
	//    5   13:iconst_1        
	//    6   14:iadd            
	//    7   15:aload_0         
	//    8   16:getfield        #60  <Field int refnum>
	//    9   19:invokestatic    #216 <Method int Math.max(int, int)>
	//   10   22:ireturn         
	}

	protected void write(PdfIndirectObject pdfindirectobject, int i)
		throws IOException
	{
		PdfCrossReference pdfcrossreference = new PdfCrossReference(i, position);
	//    0    0:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field long position>
	//    5    9:invokespecial   #219 <Method void PdfWriter$PdfBody$PdfCrossReference(int, long)>
	//    6   12:astore_3        
		if(!xrefs.add(((Object) (pdfcrossreference))))
	//*   7   13:aload_0         
	//*   8   14:getfield        #38  <Field TreeSet xrefs>
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
	//*  11   21:ifne            42
		{
			xrefs.remove(((Object) (pdfcrossreference)));
	//   12   24:aload_0         
	//   13   25:getfield        #38  <Field TreeSet xrefs>
	//   14   28:aload_3         
	//   15   29:invokevirtual   #98  <Method boolean TreeSet.remove(Object)>
	//   16   32:pop             
			xrefs.add(((Object) (pdfcrossreference)));
	//   17   33:aload_0         
	//   18   34:getfield        #38  <Field TreeSet xrefs>
	//   19   37:aload_3         
	//   20   38:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
	//   21   41:pop             
		}
		pdfindirectobject.writeTo(((OutputStream) (writer.getOs())));
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:getfield        #62  <Field PdfWriter writer>
	//   25   47:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
	//   26   50:invokevirtual   #223 <Method void PdfIndirectObject.writeTo(OutputStream)>
		position = writer.getOs().getCounter();
	//   27   53:aload_0         
	//   28   54:aload_0         
	//   29   55:getfield        #62  <Field PdfWriter writer>
	//   30   58:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
	//   31   61:invokevirtual   #56  <Method long OutputStreamCounter.getCounter()>
	//   32   64:putfield        #58  <Field long position>
	//   33   67:return          
	}

	protected void write(PdfIndirectObject pdfindirectobject, int i, int j)
		throws IOException
	{
		PdfCrossReference pdfcrossreference = new PdfCrossReference(i, position, j);
	//    0    0:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field long position>
	//    5    9:iload_3         
	//    6   10:invokespecial   #42  <Method void PdfWriter$PdfBody$PdfCrossReference(int, long, int)>
	//    7   13:astore          4
		if(!xrefs.add(((Object) (pdfcrossreference))))
	//*   8   15:aload_0         
	//*   9   16:getfield        #38  <Field TreeSet xrefs>
	//*  10   19:aload           4
	//*  11   21:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
	//*  12   24:ifne            47
		{
			xrefs.remove(((Object) (pdfcrossreference)));
	//   13   27:aload_0         
	//   14   28:getfield        #38  <Field TreeSet xrefs>
	//   15   31:aload           4
	//   16   33:invokevirtual   #98  <Method boolean TreeSet.remove(Object)>
	//   17   36:pop             
			xrefs.add(((Object) (pdfcrossreference)));
	//   18   37:aload_0         
	//   19   38:getfield        #38  <Field TreeSet xrefs>
	//   20   41:aload           4
	//   21   43:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
	//   22   46:pop             
		}
		pdfindirectobject.writeTo(((OutputStream) (writer.getOs())));
	//   23   47:aload_1         
	//   24   48:aload_0         
	//   25   49:getfield        #62  <Field PdfWriter writer>
	//   26   52:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
	//   27   55:invokevirtual   #223 <Method void PdfIndirectObject.writeTo(OutputStream)>
		position = writer.getOs().getCounter();
	//   28   58:aload_0         
	//   29   59:aload_0         
	//   30   60:getfield        #62  <Field PdfWriter writer>
	//   31   63:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
	//   32   66:invokevirtual   #56  <Method long OutputStreamCounter.getCounter()>
	//   33   69:putfield        #58  <Field long position>
	//   34   72:return          
	}

	public void writeCrossReferenceTable(OutputStream outputstream, PdfIndirectReference pdfindirectreference, PdfIndirectReference pdfindirectreference1, PdfIndirectReference pdfindirectreference2, PdfObject pdfobject, long l)
		throws IOException
	{
		int j1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          9
		if(writer.isFullCompression())
	//*   2    3:aload_0         
	//*   3    4:getfield        #62  <Field PdfWriter writer>
	//*   4    7:invokevirtual   #86  <Method boolean PdfWriter.isFullCompression()>
	//*   5   10:ifeq            44
		{
			flushObjStm();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #124 <Method void flushObjStm()>
			j1 = getIndirectReferenceNumber();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #70  <Method int getIndirectReferenceNumber()>
	//   10   21:istore          9
			xrefs.add(((Object) (new PdfCrossReference(j1, position))));
	//   11   23:aload_0         
	//   12   24:getfield        #38  <Field TreeSet xrefs>
	//   13   27:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
	//   14   30:dup             
	//   15   31:iload           9
	//   16   33:aload_0         
	//   17   34:getfield        #58  <Field long position>
	//   18   37:invokespecial   #219 <Method void PdfWriter$PdfBody$PdfCrossReference(int, long)>
	//   19   40:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
	//   20   43:pop             
		}
		int l1 = ((PdfCrossReference)xrefs.first()).getRefnum();
	//   21   44:aload_0         
	//   22   45:getfield        #38  <Field TreeSet xrefs>
	//   23   48:invokevirtual   #228 <Method Object TreeSet.first()>
	//   24   51:checkcast       #9   <Class PdfWriter$PdfBody$PdfCrossReference>
	//   25   54:invokevirtual   #210 <Method int PdfWriter$PdfBody$PdfCrossReference.getRefnum()>
	//   26   57:istore          10
		int i = 0;
	//   27   59:iconst_0        
	//   28   60:istore          8
		ArrayList arraylist = new ArrayList();
	//   29   62:new             #230 <Class ArrayList>
	//   30   65:dup             
	//   31   66:invokespecial   #231 <Method void ArrayList()>
	//   32   69:astore          13
		for(Iterator iterator = xrefs.iterator(); iterator.hasNext();)
	//*  33   71:aload_0         
	//*  34   72:getfield        #38  <Field TreeSet xrefs>
	//*  35   75:invokevirtual   #235 <Method Iterator TreeSet.iterator()>
	//*  36   78:astore          14
	//*  37   80:aload           14
	//*  38   82:invokeinterface #240 <Method boolean Iterator.hasNext()>
	//*  39   87:ifeq            159
		{
			PdfCrossReference pdfcrossreference = (PdfCrossReference)iterator.next();
	//   40   90:aload           14
	//   41   92:invokeinterface #243 <Method Object Iterator.next()>
	//   42   97:checkcast       #9   <Class PdfWriter$PdfBody$PdfCrossReference>
	//   43  100:astore          15
			if(l1 + i == pdfcrossreference.getRefnum())
	//*  44  102:iload           10
	//*  45  104:iload           8
	//*  46  106:iadd            
	//*  47  107:aload           15
	//*  48  109:invokevirtual   #210 <Method int PdfWriter$PdfBody$PdfCrossReference.getRefnum()>
	//*  49  112:icmpne          124
			{
				i++;
	//   50  115:iload           8
	//   51  117:iconst_1        
	//   52  118:iadd            
	//   53  119:istore          8
			} else
	//*  54  121:goto            80
			{
				arraylist.add(((Object) (Integer.valueOf(l1))));
	//   55  124:aload           13
	//   56  126:iload           10
	//   57  128:invokestatic    #249 <Method Integer Integer.valueOf(int)>
	//   58  131:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
	//   59  134:pop             
				arraylist.add(((Object) (Integer.valueOf(i))));
	//   60  135:aload           13
	//   61  137:iload           8
	//   62  139:invokestatic    #249 <Method Integer Integer.valueOf(int)>
	//   63  142:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
	//   64  145:pop             
				l1 = pdfcrossreference.getRefnum();
	//   65  146:aload           15
	//   66  148:invokevirtual   #210 <Method int PdfWriter$PdfBody$PdfCrossReference.getRefnum()>
	//   67  151:istore          10
				i = 1;
	//   68  153:iconst_1        
	//   69  154:istore          8
			}
		}

	//*  70  156:goto            80
		arraylist.add(((Object) (Integer.valueOf(l1))));
	//   71  159:aload           13
	//   72  161:iload           10
	//   73  163:invokestatic    #249 <Method Integer Integer.valueOf(int)>
	//   74  166:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
	//   75  169:pop             
		arraylist.add(((Object) (Integer.valueOf(i))));
	//   76  170:aload           13
	//   77  172:iload           8
	//   78  174:invokestatic    #249 <Method Integer Integer.valueOf(int)>
	//   79  177:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
	//   80  180:pop             
		if(writer.isFullCompression())
	//*  81  181:aload_0         
	//*  82  182:getfield        #62  <Field PdfWriter writer>
	//*  83  185:invokevirtual   #86  <Method boolean PdfWriter.isFullCompression()>
	//*  84  188:ifeq            543
		{
			int j = 5;
	//   85  191:iconst_5        
	//   86  192:istore          8
			long l2 = 0x0L;
	//   87  194:ldc2w           #251 <Long 0x0L>
	//   88  197:lstore          11
			do
			{
				if(j <= 1 || (position & l2) != 0L)
	//*  89  199:iload           8
	//*  90  201:iconst_1        
	//*  91  202:icmple          217
	//*  92  205:aload_0         
	//*  93  206:getfield        #58  <Field long position>
	//*  94  209:lload           11
	//*  95  211:land            
	//*  96  212:lconst_0        
	//*  97  213:lcmp            
	//*  98  214:ifeq            263
				{
					outputstream = ((OutputStream) (new ByteBuffer()));
	//   99  217:new             #128 <Class ByteBuffer>
	//  100  220:dup             
	//  101  221:invokespecial   #129 <Method void ByteBuffer()>
	//  102  224:astore_1        
					for(Iterator iterator1 = xrefs.iterator(); iterator1.hasNext(); ((PdfCrossReference)iterator1.next()).toPdf(j, outputstream));
	//  103  225:aload_0         
	//  104  226:getfield        #38  <Field TreeSet xrefs>
	//  105  229:invokevirtual   #235 <Method Iterator TreeSet.iterator()>
	//  106  232:astore          14
	//  107  234:aload           14
	//  108  236:invokeinterface #240 <Method boolean Iterator.hasNext()>
	//  109  241:ifeq            279
	//  110  244:aload           14
	//  111  246:invokeinterface #243 <Method Object Iterator.next()>
	//  112  251:checkcast       #9   <Class PdfWriter$PdfBody$PdfCrossReference>
	//  113  254:iload           8
	//  114  256:aload_1         
	//  115  257:invokevirtual   #255 <Method void PdfWriter$PdfBody$PdfCrossReference.toPdf(int, OutputStream)>
					break;
	//  116  260:goto            234
				}
				l2 >>>= 8;
	//  117  263:lload           11
	//  118  265:bipush          8
	//  119  267:lushr           
	//  120  268:lstore          11
				j--;
	//  121  270:iload           8
	//  122  272:iconst_1        
	//  123  273:isub            
	//  124  274:istore          8
			} while(true);
	//  125  276:goto            199
			outputstream = ((OutputStream) (new PdfStream(((ByteBuffer) (outputstream)).toByteArray())));
	//  126  279:new             #159 <Class PdfStream>
	//  127  282:dup             
	//  128  283:aload_1         
	//  129  284:invokevirtual   #163 <Method byte[] ByteBuffer.toByteArray()>
	//  130  287:invokespecial   #166 <Method void PdfStream(byte[])>
	//  131  290:astore_1        
			((PdfStream) (outputstream)).flateCompress(writer.getCompressionLevel());
	//  132  291:aload_1         
	//  133  292:aload_0         
	//  134  293:getfield        #62  <Field PdfWriter writer>
	//  135  296:invokevirtual   #169 <Method int PdfWriter.getCompressionLevel()>
	//  136  299:invokevirtual   #173 <Method void PdfStream.flateCompress(int)>
			((PdfStream) (outputstream)).put(PdfName.SIZE, ((PdfObject) (new PdfNumber(size()))));
	//  137  302:aload_1         
	//  138  303:getstatic       #258 <Field PdfName PdfName.SIZE>
	//  139  306:new             #191 <Class PdfNumber>
	//  140  309:dup             
	//  141  310:aload_0         
	//  142  311:invokevirtual   #259 <Method int size()>
	//  143  314:invokespecial   #193 <Method void PdfNumber(int)>
	//  144  317:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			((PdfStream) (outputstream)).put(PdfName.ROOT, ((PdfObject) (pdfindirectreference)));
	//  145  320:aload_1         
	//  146  321:getstatic       #262 <Field PdfName PdfName.ROOT>
	//  147  324:aload_2         
	//  148  325:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			if(pdfindirectreference1 != null)
	//* 149  328:aload_3         
	//* 150  329:ifnull          340
				((PdfStream) (outputstream)).put(PdfName.INFO, ((PdfObject) (pdfindirectreference1)));
	//  151  332:aload_1         
	//  152  333:getstatic       #265 <Field PdfName PdfName.INFO>
	//  153  336:aload_3         
	//  154  337:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			if(pdfindirectreference2 != null)
	//* 155  340:aload           4
	//* 156  342:ifnull          354
				((PdfStream) (outputstream)).put(PdfName.ENCRYPT, ((PdfObject) (pdfindirectreference2)));
	//  157  345:aload_1         
	//  158  346:getstatic       #268 <Field PdfName PdfName.ENCRYPT>
	//  159  349:aload           4
	//  160  351:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			if(pdfobject != null)
	//* 161  354:aload           5
	//* 162  356:ifnull          368
				((PdfStream) (outputstream)).put(PdfName.ID, pdfobject);
	//  163  359:aload_1         
	//  164  360:getstatic       #271 <Field PdfName PdfName.ID>
	//  165  363:aload           5
	//  166  365:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			((PdfStream) (outputstream)).put(PdfName.W, ((PdfObject) (new PdfArray(new int[] {
				1, j, 2
			}))));
	//  167  368:aload_1         
	//  168  369:getstatic       #274 <Field PdfName PdfName.W>
	//  169  372:new             #276 <Class PdfArray>
	//  170  375:dup             
	//  171  376:iconst_3        
	//  172  377:newarray        int[]
	//  173  379:dup             
	//  174  380:iconst_0        
	//  175  381:iconst_1        
	//  176  382:iastore         
	//  177  383:dup             
	//  178  384:iconst_1        
	//  179  385:iload           8
	//  180  387:iastore         
	//  181  388:dup             
	//  182  389:iconst_2        
	//  183  390:iconst_2        
	//  184  391:iastore         
	//  185  392:invokespecial   #279 <Method void PdfArray(int[])>
	//  186  395:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			((PdfStream) (outputstream)).put(PdfName.TYPE, ((PdfObject) (PdfName.XREF)));
	//  187  398:aload_1         
	//  188  399:getstatic       #179 <Field PdfName PdfName.TYPE>
	//  189  402:getstatic       #282 <Field PdfName PdfName.XREF>
	//  190  405:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			pdfindirectreference = ((PdfIndirectReference) (new PdfArray()));
	//  191  408:new             #276 <Class PdfArray>
	//  192  411:dup             
	//  193  412:invokespecial   #283 <Method void PdfArray()>
	//  194  415:astore_2        
			for(int k = 0; k < arraylist.size(); k++)
	//* 195  416:iconst_0        
	//* 196  417:istore          8
	//* 197  419:iload           8
	//* 198  421:aload           13
	//* 199  423:invokevirtual   #284 <Method int ArrayList.size()>
	//* 200  426:icmpge          463
				((PdfArray) (pdfindirectreference)).add(((PdfObject) (new PdfNumber(((Integer)arraylist.get(k)).intValue()))));
	//  201  429:aload_2         
	//  202  430:new             #191 <Class PdfNumber>
	//  203  433:dup             
	//  204  434:aload           13
	//  205  436:iload           8
	//  206  438:invokevirtual   #288 <Method Object ArrayList.get(int)>
	//  207  441:checkcast       #245 <Class Integer>
	//  208  444:invokevirtual   #291 <Method int Integer.intValue()>
	//  209  447:invokespecial   #193 <Method void PdfNumber(int)>
	//  210  450:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//  211  453:pop             

	//  212  454:iload           8
	//  213  456:iconst_1        
	//  214  457:iadd            
	//  215  458:istore          8
	//* 216  460:goto            419
			((PdfStream) (outputstream)).put(PdfName.INDEX, ((PdfObject) (pdfindirectreference)));
	//  217  463:aload_1         
	//  218  464:getstatic       #297 <Field PdfName PdfName.INDEX>
	//  219  467:aload_2         
	//  220  468:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			if(l > 0L)
	//* 221  471:lload           6
	//* 222  473:lconst_0        
	//* 223  474:lcmp            
	//* 224  475:ifle            494
				((PdfStream) (outputstream)).put(PdfName.PREV, ((PdfObject) (new PdfNumber(l))));
	//  225  478:aload_1         
	//  226  479:getstatic       #300 <Field PdfName PdfName.PREV>
	//  227  482:new             #191 <Class PdfNumber>
	//  228  485:dup             
	//  229  486:lload           6
	//  230  488:invokespecial   #303 <Method void PdfNumber(long)>
	//  231  491:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
			pdfindirectreference = ((PdfIndirectReference) (writer.crypto));
	//  232  494:aload_0         
	//  233  495:getfield        #62  <Field PdfWriter writer>
	//  234  498:getfield        #140 <Field PdfEncryption PdfWriter.crypto>
	//  235  501:astore_2        
			writer.crypto = null;
	//  236  502:aload_0         
	//  237  503:getfield        #62  <Field PdfWriter writer>
	//  238  506:aconst_null     
	//  239  507:putfield        #140 <Field PdfEncryption PdfWriter.crypto>
			(new PdfIndirectObject(j1, ((PdfObject) (outputstream)), writer)).writeTo(((OutputStream) (writer.getOs())));
	//  240  510:new             #92  <Class PdfIndirectObject>
	//  241  513:dup             
	//  242  514:iload           9
	//  243  516:aload_1         
	//  244  517:aload_0         
	//  245  518:getfield        #62  <Field PdfWriter writer>
	//  246  521:invokespecial   #95  <Method void PdfIndirectObject(int, PdfObject, PdfWriter)>
	//  247  524:aload_0         
	//  248  525:getfield        #62  <Field PdfWriter writer>
	//  249  528:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
	//  250  531:invokevirtual   #223 <Method void PdfIndirectObject.writeTo(OutputStream)>
			writer.crypto = ((PdfEncryption) (pdfindirectreference));
	//  251  534:aload_0         
	//  252  535:getfield        #62  <Field PdfWriter writer>
	//  253  538:aload_2         
	//  254  539:putfield        #140 <Field PdfEncryption PdfWriter.crypto>
		} else
	//* 255  542:return          
		{
			outputstream.write(DocWriter.getISOBytes("xref\n"));
	//  256  543:aload_1         
	//  257  544:ldc2            #305 <String "xref\n">
	//  258  547:invokestatic    #311 <Method byte[] DocWriter.getISOBytes(String)>
	//  259  550:invokevirtual   #315 <Method void OutputStream.write(byte[])>
			pdfindirectreference = ((PdfIndirectReference) (xrefs.iterator()));
	//  260  553:aload_0         
	//  261  554:getfield        #38  <Field TreeSet xrefs>
	//  262  557:invokevirtual   #235 <Method Iterator TreeSet.iterator()>
	//  263  560:astore_2        
			int i1 = 0;
	//  264  561:iconst_0        
	//  265  562:istore          8
			while(i1 < arraylist.size()) 
	//* 266  564:iload           8
	//* 267  566:aload           13
	//* 268  568:invokevirtual   #284 <Method int ArrayList.size()>
	//* 269  571:icmpge          542
			{
				int i2 = ((Integer)arraylist.get(i1)).intValue();
	//  270  574:aload           13
	//  271  576:iload           8
	//  272  578:invokevirtual   #288 <Method Object ArrayList.get(int)>
	//  273  581:checkcast       #245 <Class Integer>
	//  274  584:invokevirtual   #291 <Method int Integer.intValue()>
	//  275  587:istore          10
				int k1 = ((Integer)arraylist.get(i1 + 1)).intValue();
	//  276  589:aload           13
	//  277  591:iload           8
	//  278  593:iconst_1        
	//  279  594:iadd            
	//  280  595:invokevirtual   #288 <Method Object ArrayList.get(int)>
	//  281  598:checkcast       #245 <Class Integer>
	//  282  601:invokevirtual   #291 <Method int Integer.intValue()>
	//  283  604:istore          9
				outputstream.write(DocWriter.getISOBytes(String.valueOf(i2)));
	//  284  606:aload_1         
	//  285  607:iload           10
	//  286  609:invokestatic    #320 <Method String String.valueOf(int)>
	//  287  612:invokestatic    #311 <Method byte[] DocWriter.getISOBytes(String)>
	//  288  615:invokevirtual   #315 <Method void OutputStream.write(byte[])>
				outputstream.write(DocWriter.getISOBytes(" "));
	//  289  618:aload_1         
	//  290  619:ldc2            #322 <String " ">
	//  291  622:invokestatic    #311 <Method byte[] DocWriter.getISOBytes(String)>
	//  292  625:invokevirtual   #315 <Method void OutputStream.write(byte[])>
				outputstream.write(DocWriter.getISOBytes(String.valueOf(k1)));
	//  293  628:aload_1         
	//  294  629:iload           9
	//  295  631:invokestatic    #320 <Method String String.valueOf(int)>
	//  296  634:invokestatic    #311 <Method byte[] DocWriter.getISOBytes(String)>
	//  297  637:invokevirtual   #315 <Method void OutputStream.write(byte[])>
				outputstream.write(10);
	//  298  640:aload_1         
	//  299  641:bipush          10
	//  300  643:invokevirtual   #324 <Method void OutputStream.write(int)>
				for(; k1 > 0; k1--)
	//* 301  646:iload           9
	//* 302  648:ifle            673
					((PdfCrossReference)((Iterator) (pdfindirectreference)).next()).toPdf(outputstream);
	//  303  651:aload_2         
	//  304  652:invokeinterface #243 <Method Object Iterator.next()>
	//  305  657:checkcast       #9   <Class PdfWriter$PdfBody$PdfCrossReference>
	//  306  660:aload_1         
	//  307  661:invokevirtual   #326 <Method void PdfWriter$PdfBody$PdfCrossReference.toPdf(OutputStream)>

	//  308  664:iload           9
	//  309  666:iconst_1        
	//  310  667:isub            
	//  311  668:istore          9
	//* 312  670:goto            646
				i1 += 2;
	//  313  673:iload           8
	//  314  675:iconst_2        
	//  315  676:iadd            
	//  316  677:istore          8
			}
		}
	//* 317  679:goto            564
	}

	private static final int OBJSINSTREAM = 200;
	protected int currentObjNum;
	protected ByteBuffer index;
	protected int numObj;
	protected long position;
	protected int refnum;
	protected ByteBuffer streamObjects;
	protected final PdfWriter writer;
	protected final TreeSet xrefs = new TreeSet();

	protected PdfWriter$PdfBody(PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		numObj = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #33  <Field int numObj>
	//    5    9:aload_0         
	//    6   10:new             #35  <Class TreeSet>
	//    7   13:dup             
	//    8   14:invokespecial   #36  <Method void TreeSet()>
	//    9   17:putfield        #38  <Field TreeSet xrefs>
		xrefs.add(((Object) (new PdfCrossReference(0, 0L, 65535))));
	//   10   20:aload_0         
	//   11   21:getfield        #38  <Field TreeSet xrefs>
	//   12   24:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:lconst_0        
	//   16   30:ldc1            #39  <Int 65535>
	//   17   32:invokespecial   #42  <Method void PdfWriter$PdfBody$PdfCrossReference(int, long, int)>
	//   18   35:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
	//   19   38:pop             
		position = pdfwriter.getOs().getCounter();
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
	//   23   44:invokevirtual   #56  <Method long OutputStreamCounter.getCounter()>
	//   24   47:putfield        #58  <Field long position>
		refnum = 1;
	//   25   50:aload_0         
	//   26   51:iconst_1        
	//   27   52:putfield        #60  <Field int refnum>
		writer = pdfwriter;
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:putfield        #62  <Field PdfWriter writer>
	//   31   60:return          
	}
}
