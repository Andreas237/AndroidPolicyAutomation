// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android.core:
//			CodedOutputStream

final class ByteString
{
	static final class CodedBuilder
	{

		public ByteString build()
		{
			output.checkNoSpaceLeft();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field CodedOutputStream output>
		//    2    4:invokevirtual   #35  <Method void CodedOutputStream.checkNoSpaceLeft()>
			return new ByteString(buffer);
		//    3    7:new             #6   <Class ByteString>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:getfield        #18  <Field byte[] buffer>
		//    7   15:aconst_null     
		//    8   16:invokespecial   #38  <Method void ByteString(byte[], ByteString$1)>
		//    9   19:areturn         
		}

		public CodedOutputStream getCodedOutput()
		{
			return output;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field CodedOutputStream output>
		//    2    4:areturn         
		}

		private final byte buffer[];
		private final CodedOutputStream output;

		private CodedBuilder(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			buffer = new byte[i];
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:newarray        byte[]
		//    5    8:putfield        #18  <Field byte[] buffer>
			output = CodedOutputStream.newInstance(buffer);
		//    6   11:aload_0         
		//    7   12:aload_0         
		//    8   13:getfield        #18  <Field byte[] buffer>
		//    9   16:invokestatic    #24  <Method CodedOutputStream CodedOutputStream.newInstance(byte[])>
		//   10   19:putfield        #26  <Field CodedOutputStream output>
		//   11   22:return          
		}

	}

	static final class Output extends FilterOutputStream
	{

		public ByteString toByteString()
		{
			return new ByteString(bout.toByteArray());
		//    0    0:new             #6   <Class ByteString>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #16  <Field ByteArrayOutputStream bout>
		//    4    8:invokevirtual   #28  <Method byte[] ByteArrayOutputStream.toByteArray()>
		//    5   11:aconst_null     
		//    6   12:invokespecial   #31  <Method void ByteString(byte[], ByteString$1)>
		//    7   15:areturn         
		}

		private final ByteArrayOutputStream bout;

		private Output(ByteArrayOutputStream bytearrayoutputstream)
		{
			super(((java.io.OutputStream) (bytearrayoutputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void FilterOutputStream(java.io.OutputStream)>
			bout = bytearrayoutputstream;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #16  <Field ByteArrayOutputStream bout>
		//    6   10:return          
		}

	}


	private ByteString(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		hash = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field int hash>
		bytes = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #33  <Field byte[] bytes>
	//    8   14:return          
	}


	public static ByteString copyFrom(String s, String s1)
		throws UnsupportedEncodingException
	{
		return new ByteString(s.getBytes(s1));
	//    0    0:new             #2   <Class ByteString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #44  <Method byte[] String.getBytes(String)>
	//    5    9:invokespecial   #24  <Method void ByteString(byte[])>
	//    6   12:areturn         
	}

	public static ByteString copyFrom(ByteBuffer bytebuffer)
	{
		return copyFrom(bytebuffer, bytebuffer.remaining());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #52  <Method int ByteBuffer.remaining()>
	//    3    5:invokestatic    #55  <Method ByteString copyFrom(ByteBuffer, int)>
	//    4    8:areturn         
	}

	public static ByteString copyFrom(ByteBuffer bytebuffer, int i)
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore_2        
		bytebuffer.get(abyte0);
	//    3    4:aload_0         
	//    4    5:aload_2         
	//    5    6:invokevirtual   #59  <Method ByteBuffer ByteBuffer.get(byte[])>
	//    6    9:pop             
		return new ByteString(abyte0);
	//    7   10:new             #2   <Class ByteString>
	//    8   13:dup             
	//    9   14:aload_2         
	//   10   15:invokespecial   #24  <Method void ByteString(byte[])>
	//   11   18:areturn         
	}

	public static ByteString copyFrom(List list)
	{
		if(list.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #65  <Method int List.size()>
	//*   2    6:ifne            13
			return EMPTY;
	//    3    9:getstatic       #26  <Field ByteString EMPTY>
	//    4   12:areturn         
		if(list.size() == 1)
	//*   5   13:aload_0         
	//*   6   14:invokeinterface #65  <Method int List.size()>
	//*   7   19:iconst_1        
	//*   8   20:icmpne          34
			return (ByteString)list.get(0);
	//    9   23:aload_0         
	//   10   24:iconst_0        
	//   11   25:invokeinterface #68  <Method Object List.get(int)>
	//   12   30:checkcast       #2   <Class ByteString>
	//   13   33:areturn         
		Iterator iterator = list.iterator();
	//   14   34:aload_0         
	//   15   35:invokeinterface #72  <Method Iterator List.iterator()>
	//   16   40:astore_2        
		int i;
		for(i = 0; iterator.hasNext(); i += ((ByteString)iterator.next()).size());
	//   17   41:iconst_0        
	//   18   42:istore_1        
	//   19   43:aload_2         
	//   20   44:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//   21   49:ifeq            70
	//   22   52:iload_1         
	//   23   53:aload_2         
	//   24   54:invokeinterface #82  <Method Object Iterator.next()>
	//   25   59:checkcast       #2   <Class ByteString>
	//   26   62:invokevirtual   #83  <Method int size()>
	//   27   65:iadd            
	//   28   66:istore_1        
	//*  29   67:goto            43
		byte abyte0[] = new byte[i];
	//   30   70:iload_1         
	//   31   71:newarray        byte[]
	//   32   73:astore_2        
		list = ((List) (list.iterator()));
	//   33   74:aload_0         
	//   34   75:invokeinterface #72  <Method Iterator List.iterator()>
	//   35   80:astore_0        
		ByteString bytestring;
		for(int j = 0; ((Iterator) (list)).hasNext(); j += bytestring.size())
	//*  36   81:iconst_0        
	//*  37   82:istore_1        
	//*  38   83:aload_0         
	//*  39   84:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*  40   89:ifeq            126
		{
			bytestring = (ByteString)((Iterator) (list)).next();
	//   41   92:aload_0         
	//   42   93:invokeinterface #82  <Method Object Iterator.next()>
	//   43   98:checkcast       #2   <Class ByteString>
	//   44  101:astore_3        
			System.arraycopy(((Object) (bytestring.bytes)), 0, ((Object) (abyte0)), j, bytestring.size());
	//   45  102:aload_3         
	//   46  103:getfield        #33  <Field byte[] bytes>
	//   47  106:iconst_0        
	//   48  107:aload_2         
	//   49  108:iload_1         
	//   50  109:aload_3         
	//   51  110:invokevirtual   #83  <Method int size()>
	//   52  113:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
		}

	//   53  116:iload_1         
	//   54  117:aload_3         
	//   55  118:invokevirtual   #83  <Method int size()>
	//   56  121:iadd            
	//   57  122:istore_1        
	//*  58  123:goto            83
		return new ByteString(abyte0);
	//   59  126:new             #2   <Class ByteString>
	//   60  129:dup             
	//   61  130:aload_2         
	//   62  131:invokespecial   #24  <Method void ByteString(byte[])>
	//   63  134:areturn         
	}

	public static ByteString copyFrom(byte abyte0[])
	{
		return copyFrom(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #95  <Method ByteString copyFrom(byte[], int, int)>
	//    5    7:areturn         
	}

	public static ByteString copyFrom(byte abyte0[], int i, int j)
	{
		byte abyte1[] = new byte[j];
	//    0    0:iload_2         
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte1)), 0, j);
	//    3    4:aload_0         
	//    4    5:iload_1         
	//    5    6:aload_3         
	//    6    7:iconst_0        
	//    7    8:iload_2         
	//    8    9:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
		return new ByteString(abyte1);
	//    9   12:new             #2   <Class ByteString>
	//   10   15:dup             
	//   11   16:aload_3         
	//   12   17:invokespecial   #24  <Method void ByteString(byte[])>
	//   13   20:areturn         
	}

	public static ByteString copyFromUtf8(String s)
	{
		try
		{
			s = ((String) (new ByteString(s.getBytes("UTF-8"))));
	//    0    0:new             #2   <Class ByteString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #99  <String "UTF-8">
	//    4    7:invokevirtual   #44  <Method byte[] String.getBytes(String)>
	//    5   10:invokespecial   #24  <Method void ByteString(byte[])>
	//    6   13:astore_0        
		}
	//*   7   14:aload_0         
	//*   8   15:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   16:astore_0        
		{
			throw new RuntimeException("UTF-8 not supported.", ((Throwable) (s)));
	//   10   17:new             #101 <Class RuntimeException>
	//   11   20:dup             
	//   12   21:ldc1            #103 <String "UTF-8 not supported.">
	//   13   23:aload_0         
	//   14   24:invokespecial   #106 <Method void RuntimeException(String, Throwable)>
	//   15   27:athrow          
		}
		return ((ByteString) (s));
	}

	static CodedBuilder newCodedBuilder(int i)
	{
		return new CodedBuilder(i);
	//    0    0:new             #8   <Class ByteString$CodedBuilder>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #111 <Method void ByteString$CodedBuilder(int, ByteString$1)>
	//    5    9:areturn         
	}

	public static Output newOutput()
	{
		return newOutput(32);
	//    0    0:bipush          32
	//    1    2:invokestatic    #116 <Method ByteString$Output newOutput(int)>
	//    2    5:areturn         
	}

	public static Output newOutput(int i)
	{
		return new Output(new ByteArrayOutputStream(i));
	//    0    0:new             #11  <Class ByteString$Output>
	//    1    3:dup             
	//    2    4:new             #118 <Class ByteArrayOutputStream>
	//    3    7:dup             
	//    4    8:iload_0         
	//    5    9:invokespecial   #121 <Method void ByteArrayOutputStream(int)>
	//    6   12:aconst_null     
	//    7   13:invokespecial   #124 <Method void ByteString$Output(ByteArrayOutputStream, ByteString$1)>
	//    8   16:areturn         
	}

	public ByteBuffer asReadOnlyByteBuffer()
	{
		return ByteBuffer.wrap(bytes).asReadOnlyBuffer();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field byte[] bytes>
	//    2    4:invokestatic    #129 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    3    7:invokevirtual   #132 <Method ByteBuffer ByteBuffer.asReadOnlyBuffer()>
	//    4   10:areturn         
	}

	public byte byteAt(int i)
	{
		return bytes[i];
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field byte[] bytes>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:ireturn         
	}

	public void copyTo(ByteBuffer bytebuffer)
	{
		bytebuffer.put(bytes, 0, bytes.length);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field byte[] bytes>
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field byte[] bytes>
	//    6   10:arraylength     
	//    7   11:invokevirtual   #140 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//    8   14:pop             
	//    9   15:return          
	}

	public void copyTo(byte abyte0[], int i)
	{
		System.arraycopy(((Object) (bytes)), 0, ((Object) (abyte0)), i, bytes.length);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field byte[] bytes>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field byte[] bytes>
	//    7   11:arraylength     
	//    8   12:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
	//    9   15:return          
	}

	public void copyTo(byte abyte0[], int i, int j, int k)
	{
		System.arraycopy(((Object) (bytes)), i, ((Object) (abyte0)), j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field byte[] bytes>
	//    2    4:iload_2         
	//    3    5:aload_1         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
	//    7   12:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof ByteString))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ByteString>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		ByteString bytestring = (ByteString)obj;
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ByteString>
	//   12   20:astore          4
		int j = bytes.length;
	//   13   22:aload_0         
	//   14   23:getfield        #33  <Field byte[] bytes>
	//   15   26:arraylength     
	//   16   27:istore_3        
		if(j != bytestring.bytes.length)
	//*  17   28:iload_3         
	//*  18   29:aload           4
	//*  19   31:getfield        #33  <Field byte[] bytes>
	//*  20   34:arraylength     
	//*  21   35:icmpeq          40
			return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
		obj = ((Object) (bytes));
	//   24   40:aload_0         
	//   25   41:getfield        #33  <Field byte[] bytes>
	//   26   44:astore_1        
		byte abyte0[] = bytestring.bytes;
	//   27   45:aload           4
	//   28   47:getfield        #33  <Field byte[] bytes>
	//   29   50:astore          4
		for(int i = 0; i < j; i++)
	//*  30   52:iconst_0        
	//*  31   53:istore_2        
	//*  32   54:iload_2         
	//*  33   55:iload_3         
	//*  34   56:icmpge          78
			if(obj[i] != abyte0[i])
	//*  35   59:aload_1         
	//*  36   60:iload_2         
	//*  37   61:baload          
	//*  38   62:aload           4
	//*  39   64:iload_2         
	//*  40   65:baload          
	//*  41   66:icmpeq          71
				return false;
	//   42   69:iconst_0        
	//   43   70:ireturn         

	//   44   71:iload_2         
	//   45   72:iconst_1        
	//   46   73:iadd            
	//   47   74:istore_2        
	//*  48   75:goto            54
		return true;
	//   49   78:iconst_1        
	//   50   79:ireturn         
	}

	public int hashCode()
	{
		int j = hash;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int hash>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            63
		{
			byte abyte0[] = bytes;
	//    7   11:aload_0         
	//    8   12:getfield        #33  <Field byte[] bytes>
	//    9   15:astore          4
			int l = bytes.length;
	//   10   17:aload_0         
	//   11   18:getfield        #33  <Field byte[] bytes>
	//   12   21:arraylength     
	//   13   22:istore_3        
			int k = 0;
	//   14   23:iconst_0        
	//   15   24:istore_2        
			i = l;
	//   16   25:iload_3         
	//   17   26:istore_1        
			for(; k < l; k++)
	//*  18   27:iload_2         
	//*  19   28:iload_3         
	//*  20   29:icmpge          49
				i = i * 31 + abyte0[k];
	//   21   32:iload_1         
	//   22   33:bipush          31
	//   23   35:imul            
	//   24   36:aload           4
	//   25   38:iload_2         
	//   26   39:baload          
	//   27   40:iadd            
	//   28   41:istore_1        

	//   29   42:iload_2         
	//   30   43:iconst_1        
	//   31   44:iadd            
	//   32   45:istore_2        
	//*  33   46:goto            27
			if(i == 0)
	//*  34   49:iload_1         
	//*  35   50:ifne            58
				i = 1;
	//   36   53:iconst_1        
	//   37   54:istore_1        
	//*  38   55:goto            58
			hash = i;
	//   39   58:aload_0         
	//   40   59:iload_1         
	//   41   60:putfield        #31  <Field int hash>
		}
		return i;
	//   42   63:iload_1         
	//   43   64:ireturn         
	}

	public boolean isEmpty()
	{
		return bytes.length == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field byte[] bytes>
	//    2    4:arraylength     
	//    3    5:ifne            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public InputStream newInput()
	{
		return ((InputStream) (new ByteArrayInputStream(bytes)));
	//    0    0:new             #150 <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field byte[] bytes>
	//    4    8:invokespecial   #151 <Method void ByteArrayInputStream(byte[])>
	//    5   11:areturn         
	}

	public int size()
	{
		return bytes.length;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field byte[] bytes>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public byte[] toByteArray()
	{
		int i = bytes.length;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field byte[] bytes>
	//    2    4:arraylength     
	//    3    5:istore_1        
		byte abyte0[] = new byte[i];
	//    4    6:iload_1         
	//    5    7:newarray        byte[]
	//    6    9:astore_2        
		System.arraycopy(((Object) (bytes)), 0, ((Object) (abyte0)), 0, i);
	//    7   10:aload_0         
	//    8   11:getfield        #33  <Field byte[] bytes>
	//    9   14:iconst_0        
	//   10   15:aload_2         
	//   11   16:iconst_0        
	//   12   17:iload_1         
	//   13   18:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte0;
	//   14   21:aload_2         
	//   15   22:areturn         
	}

	public String toString(String s)
		throws UnsupportedEncodingException
	{
		return new String(bytes, s);
	//    0    0:new             #40  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field byte[] bytes>
	//    4    8:aload_1         
	//    5    9:invokespecial   #158 <Method void String(byte[], String)>
	//    6   12:areturn         
	}

	public String toStringUtf8()
	{
		String s;
		try
		{
			s = new String(bytes, "UTF-8");
	//    0    0:new             #40  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field byte[] bytes>
	//    4    8:ldc1            #99  <String "UTF-8">
	//    5   10:invokespecial   #158 <Method void String(byte[], String)>
	//    6   13:astore_1        
		}
	//*   7   14:aload_1         
	//*   8   15:areturn         
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*   9   16:astore_1        
		{
			throw new RuntimeException("UTF-8 not supported?", ((Throwable) (unsupportedencodingexception)));
	//   10   17:new             #101 <Class RuntimeException>
	//   11   20:dup             
	//   12   21:ldc1            #162 <String "UTF-8 not supported?">
	//   13   23:aload_1         
	//   14   24:invokespecial   #106 <Method void RuntimeException(String, Throwable)>
	//   15   27:athrow          
		}
		return s;
	}

	public static final ByteString EMPTY = new ByteString(new byte[0]);
	private final byte bytes[];
	private volatile int hash;

	static 
	{
	//    0    0:new             #2   <Class ByteString>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:newarray        byte[]
	//    4    7:invokespecial   #24  <Method void ByteString(byte[])>
	//    5   10:putstatic       #26  <Field ByteString EMPTY>
	//*   6   13:return          
	}
}
