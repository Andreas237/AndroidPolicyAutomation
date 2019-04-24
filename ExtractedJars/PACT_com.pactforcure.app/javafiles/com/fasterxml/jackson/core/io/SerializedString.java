// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.*;
import java.nio.ByteBuffer;

// Referenced classes of package com.fasterxml.jackson.core.io:
//			JsonStringEncoder

public class SerializedString
	implements SerializableString, Serializable
{

	public SerializedString(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		if(s == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			throw new IllegalStateException("Null String illegal for SerializedString");
	//    4    8:new             #23  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #25  <String "Null String illegal for SerializedString">
	//    7   14:invokespecial   #27  <Method void IllegalStateException(String)>
	//    8   17:athrow          
		} else
		{
			_value = s;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #29  <Field String _value>
			return;
	//   12   23:return          
		}
	}

	private void readObject(ObjectInputStream objectinputstream)
		throws IOException
	{
		_jdkSerializeValue = objectinputstream.readUTF();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method String ObjectInputStream.readUTF()>
	//    3    5:putfield        #42  <Field String _jdkSerializeValue>
	//    4    8:return          
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
		throws IOException
	{
		objectoutputstream.writeUTF(_value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field String _value>
	//    3    5:invokevirtual   #50  <Method void ObjectOutputStream.writeUTF(String)>
	//    4    8:return          
	}

	public int appendQuoted(char ac[], int i)
	{
		char ac2[] = _quotedChars;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field char[] _quotedChars>
	//    2    4:astore          5
		char ac1[] = ac2;
	//    3    6:aload           5
	//    4    8:astore          4
		if(ac2 == null)
	//*   5   10:aload           5
	//*   6   12:ifnonnull       33
		{
			ac1 = JsonStringEncoder.getInstance().quoteAsString(_value);
	//    7   15:invokestatic    #60  <Method JsonStringEncoder JsonStringEncoder.getInstance()>
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field String _value>
	//   10   22:invokevirtual   #64  <Method char[] JsonStringEncoder.quoteAsString(String)>
	//   11   25:astore          4
			_quotedChars = ac1;
	//   12   27:aload_0         
	//   13   28:aload           4
	//   14   30:putfield        #54  <Field char[] _quotedChars>
		}
		int j = ac1.length;
	//   15   33:aload           4
	//   16   35:arraylength     
	//   17   36:istore_3        
		if(i + j > ac.length)
	//*  18   37:iload_2         
	//*  19   38:iload_3         
	//*  20   39:iadd            
	//*  21   40:aload_1         
	//*  22   41:arraylength     
	//*  23   42:icmple          47
		{
			return -1;
	//   24   45:iconst_m1       
	//   25   46:ireturn         
		} else
		{
			System.arraycopy(((Object) (ac1)), 0, ((Object) (ac)), i, j);
	//   26   47:aload           4
	//   27   49:iconst_0        
	//   28   50:aload_1         
	//   29   51:iload_2         
	//   30   52:iload_3         
	//   31   53:invokestatic    #70  <Method void System.arraycopy(Object, int, Object, int, int)>
			return j;
	//   32   56:iload_3         
	//   33   57:ireturn         
		}
	}

	public int appendQuotedUTF8(byte abyte0[], int i)
	{
		byte abyte2[] = _quotedUTF8Ref;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field byte[] _quotedUTF8Ref>
	//    2    4:astore          5
		byte abyte1[] = abyte2;
	//    3    6:aload           5
	//    4    8:astore          4
		if(abyte2 == null)
	//*   5   10:aload           5
	//*   6   12:ifnonnull       33
		{
			abyte1 = JsonStringEncoder.getInstance().quoteAsUTF8(_value);
	//    7   15:invokestatic    #60  <Method JsonStringEncoder JsonStringEncoder.getInstance()>
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field String _value>
	//   10   22:invokevirtual   #78  <Method byte[] JsonStringEncoder.quoteAsUTF8(String)>
	//   11   25:astore          4
			_quotedUTF8Ref = abyte1;
	//   12   27:aload_0         
	//   13   28:aload           4
	//   14   30:putfield        #74  <Field byte[] _quotedUTF8Ref>
		}
		int j = abyte1.length;
	//   15   33:aload           4
	//   16   35:arraylength     
	//   17   36:istore_3        
		if(i + j > abyte0.length)
	//*  18   37:iload_2         
	//*  19   38:iload_3         
	//*  20   39:iadd            
	//*  21   40:aload_1         
	//*  22   41:arraylength     
	//*  23   42:icmple          47
		{
			return -1;
	//   24   45:iconst_m1       
	//   25   46:ireturn         
		} else
		{
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), i, j);
	//   26   47:aload           4
	//   27   49:iconst_0        
	//   28   50:aload_1         
	//   29   51:iload_2         
	//   30   52:iload_3         
	//   31   53:invokestatic    #70  <Method void System.arraycopy(Object, int, Object, int, int)>
			return j;
	//   32   56:iload_3         
	//   33   57:ireturn         
		}
	}

	public int appendUnquoted(char ac[], int i)
	{
		String s = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String _value>
	//    2    4:astore          4
		int j = s.length();
	//    3    6:aload           4
	//    4    8:invokevirtual   #85  <Method int String.length()>
	//    5   11:istore_3        
		if(i + j > ac.length)
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:iadd            
	//*   9   15:aload_1         
	//*  10   16:arraylength     
	//*  11   17:icmple          22
		{
			return -1;
	//   12   20:iconst_m1       
	//   13   21:ireturn         
		} else
		{
			s.getChars(0, j, ac, i);
	//   14   22:aload           4
	//   15   24:iconst_0        
	//   16   25:iload_3         
	//   17   26:aload_1         
	//   18   27:iload_2         
	//   19   28:invokevirtual   #89  <Method void String.getChars(int, int, char[], int)>
			return j;
	//   20   31:iload_3         
	//   21   32:ireturn         
		}
	}

	public int appendUnquotedUTF8(byte abyte0[], int i)
	{
		byte abyte2[] = _unquotedUTF8Ref;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field byte[] _unquotedUTF8Ref>
	//    2    4:astore          5
		byte abyte1[] = abyte2;
	//    3    6:aload           5
	//    4    8:astore          4
		if(abyte2 == null)
	//*   5   10:aload           5
	//*   6   12:ifnonnull       33
		{
			abyte1 = JsonStringEncoder.getInstance().encodeAsUTF8(_value);
	//    7   15:invokestatic    #60  <Method JsonStringEncoder JsonStringEncoder.getInstance()>
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field String _value>
	//   10   22:invokevirtual   #95  <Method byte[] JsonStringEncoder.encodeAsUTF8(String)>
	//   11   25:astore          4
			_unquotedUTF8Ref = abyte1;
	//   12   27:aload_0         
	//   13   28:aload           4
	//   14   30:putfield        #92  <Field byte[] _unquotedUTF8Ref>
		}
		int j = abyte1.length;
	//   15   33:aload           4
	//   16   35:arraylength     
	//   17   36:istore_3        
		if(i + j > abyte0.length)
	//*  18   37:iload_2         
	//*  19   38:iload_3         
	//*  20   39:iadd            
	//*  21   40:aload_1         
	//*  22   41:arraylength     
	//*  23   42:icmple          47
		{
			return -1;
	//   24   45:iconst_m1       
	//   25   46:ireturn         
		} else
		{
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), i, j);
	//   26   47:aload           4
	//   27   49:iconst_0        
	//   28   50:aload_1         
	//   29   51:iload_2         
	//   30   52:iload_3         
	//   31   53:invokestatic    #70  <Method void System.arraycopy(Object, int, Object, int, int)>
			return j;
	//   32   56:iload_3         
	//   33   57:ireturn         
		}
	}

	public final char[] asQuotedChars()
	{
		char ac1[] = _quotedChars;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field char[] _quotedChars>
	//    2    4:astore_2        
		char ac[] = ac1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(ac1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       27
		{
			ac = JsonStringEncoder.getInstance().quoteAsString(_value);
	//    7   11:invokestatic    #60  <Method JsonStringEncoder JsonStringEncoder.getInstance()>
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field String _value>
	//   10   18:invokevirtual   #64  <Method char[] JsonStringEncoder.quoteAsString(String)>
	//   11   21:astore_1        
			_quotedChars = ac;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #54  <Field char[] _quotedChars>
		}
		return ac;
	//   15   27:aload_1         
	//   16   28:areturn         
	}

	public final byte[] asQuotedUTF8()
	{
		byte abyte1[] = _quotedUTF8Ref;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field byte[] _quotedUTF8Ref>
	//    2    4:astore_2        
		byte abyte0[] = abyte1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(abyte1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       27
		{
			abyte0 = JsonStringEncoder.getInstance().quoteAsUTF8(_value);
	//    7   11:invokestatic    #60  <Method JsonStringEncoder JsonStringEncoder.getInstance()>
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field String _value>
	//   10   18:invokevirtual   #78  <Method byte[] JsonStringEncoder.quoteAsUTF8(String)>
	//   11   21:astore_1        
			_quotedUTF8Ref = abyte0;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #74  <Field byte[] _quotedUTF8Ref>
		}
		return abyte0;
	//   15   27:aload_1         
	//   16   28:areturn         
	}

	public final byte[] asUnquotedUTF8()
	{
		byte abyte1[] = _unquotedUTF8Ref;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field byte[] _unquotedUTF8Ref>
	//    2    4:astore_2        
		byte abyte0[] = abyte1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(abyte1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       27
		{
			abyte0 = JsonStringEncoder.getInstance().encodeAsUTF8(_value);
	//    7   11:invokestatic    #60  <Method JsonStringEncoder JsonStringEncoder.getInstance()>
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field String _value>
	//   10   18:invokevirtual   #95  <Method byte[] JsonStringEncoder.encodeAsUTF8(String)>
	//   11   21:astore_1        
			_unquotedUTF8Ref = abyte0;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #92  <Field byte[] _unquotedUTF8Ref>
		}
		return abyte0;
	//   15   27:aload_1         
	//   16   28:areturn         
	}

	public final int charLength()
	{
		return _value.length();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String _value>
	//    2    4:invokevirtual   #85  <Method int String.length()>
	//    3    7:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null || obj.getClass() != ((Object)this).getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #107 <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #107 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
		{
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		} else
		{
			obj = ((Object) ((SerializedString)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class SerializedString>
	//   16   28:astore_1        
			return _value.equals(((Object) (((SerializedString) (obj))._value)));
	//   17   29:aload_0         
	//   18   30:getfield        #29  <Field String _value>
	//   19   33:aload_1         
	//   20   34:getfield        #29  <Field String _value>
	//   21   37:invokevirtual   #109 <Method boolean String.equals(Object)>
	//   22   40:ireturn         
		}
	}

	public final String getValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String _value>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		return _value.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String _value>
	//    2    4:invokevirtual   #113 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public int putQuotedUTF8(ByteBuffer bytebuffer)
	{
		byte abyte1[] = _quotedUTF8Ref;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field byte[] _quotedUTF8Ref>
	//    2    4:astore          4
		byte abyte0[] = abyte1;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(abyte1 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       30
		{
			abyte0 = JsonStringEncoder.getInstance().quoteAsUTF8(_value);
	//    7   14:invokestatic    #60  <Method JsonStringEncoder JsonStringEncoder.getInstance()>
	//    8   17:aload_0         
	//    9   18:getfield        #29  <Field String _value>
	//   10   21:invokevirtual   #78  <Method byte[] JsonStringEncoder.quoteAsUTF8(String)>
	//   11   24:astore_3        
			_quotedUTF8Ref = abyte0;
	//   12   25:aload_0         
	//   13   26:aload_3         
	//   14   27:putfield        #74  <Field byte[] _quotedUTF8Ref>
		}
		int i = abyte0.length;
	//   15   30:aload_3         
	//   16   31:arraylength     
	//   17   32:istore_2        
		if(i > bytebuffer.remaining())
	//*  18   33:iload_2         
	//*  19   34:aload_1         
	//*  20   35:invokevirtual   #120 <Method int ByteBuffer.remaining()>
	//*  21   38:icmple          43
		{
			return -1;
	//   22   41:iconst_m1       
	//   23   42:ireturn         
		} else
		{
			bytebuffer.put(abyte0, 0, i);
	//   24   43:aload_1         
	//   25   44:aload_3         
	//   26   45:iconst_0        
	//   27   46:iload_2         
	//   28   47:invokevirtual   #124 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   29   50:pop             
			return i;
	//   30   51:iload_2         
	//   31   52:ireturn         
		}
	}

	public int putUnquotedUTF8(ByteBuffer bytebuffer)
	{
		byte abyte1[] = _unquotedUTF8Ref;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field byte[] _unquotedUTF8Ref>
	//    2    4:astore          4
		byte abyte0[] = abyte1;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(abyte1 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       30
		{
			abyte0 = JsonStringEncoder.getInstance().encodeAsUTF8(_value);
	//    7   14:invokestatic    #60  <Method JsonStringEncoder JsonStringEncoder.getInstance()>
	//    8   17:aload_0         
	//    9   18:getfield        #29  <Field String _value>
	//   10   21:invokevirtual   #95  <Method byte[] JsonStringEncoder.encodeAsUTF8(String)>
	//   11   24:astore_3        
			_unquotedUTF8Ref = abyte0;
	//   12   25:aload_0         
	//   13   26:aload_3         
	//   14   27:putfield        #92  <Field byte[] _unquotedUTF8Ref>
		}
		int i = abyte0.length;
	//   15   30:aload_3         
	//   16   31:arraylength     
	//   17   32:istore_2        
		if(i > bytebuffer.remaining())
	//*  18   33:iload_2         
	//*  19   34:aload_1         
	//*  20   35:invokevirtual   #120 <Method int ByteBuffer.remaining()>
	//*  21   38:icmple          43
		{
			return -1;
	//   22   41:iconst_m1       
	//   23   42:ireturn         
		} else
		{
			bytebuffer.put(abyte0, 0, i);
	//   24   43:aload_1         
	//   25   44:aload_3         
	//   26   45:iconst_0        
	//   27   46:iload_2         
	//   28   47:invokevirtual   #124 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   29   50:pop             
			return i;
	//   30   51:iload_2         
	//   31   52:ireturn         
		}
	}

	protected Object readResolve()
	{
		return ((Object) (new SerializedString(_jdkSerializeValue)));
	//    0    0:new             #2   <Class SerializedString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field String _jdkSerializeValue>
	//    4    8:invokespecial   #128 <Method void SerializedString(String)>
	//    5   11:areturn         
	}

	public final String toString()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String _value>
	//    2    4:areturn         
	}

	public int writeQuotedUTF8(OutputStream outputstream)
		throws IOException
	{
		byte abyte1[] = _quotedUTF8Ref;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field byte[] _quotedUTF8Ref>
	//    2    4:astore          4
		byte abyte0[] = abyte1;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(abyte1 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       30
		{
			abyte0 = JsonStringEncoder.getInstance().quoteAsUTF8(_value);
	//    7   14:invokestatic    #60  <Method JsonStringEncoder JsonStringEncoder.getInstance()>
	//    8   17:aload_0         
	//    9   18:getfield        #29  <Field String _value>
	//   10   21:invokevirtual   #78  <Method byte[] JsonStringEncoder.quoteAsUTF8(String)>
	//   11   24:astore_3        
			_quotedUTF8Ref = abyte0;
	//   12   25:aload_0         
	//   13   26:aload_3         
	//   14   27:putfield        #74  <Field byte[] _quotedUTF8Ref>
		}
		int i = abyte0.length;
	//   15   30:aload_3         
	//   16   31:arraylength     
	//   17   32:istore_2        
		outputstream.write(abyte0, 0, i);
	//   18   33:aload_1         
	//   19   34:aload_3         
	//   20   35:iconst_0        
	//   21   36:iload_2         
	//   22   37:invokevirtual   #137 <Method void OutputStream.write(byte[], int, int)>
		return i;
	//   23   40:iload_2         
	//   24   41:ireturn         
	}

	public int writeUnquotedUTF8(OutputStream outputstream)
		throws IOException
	{
		byte abyte1[] = _unquotedUTF8Ref;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field byte[] _unquotedUTF8Ref>
	//    2    4:astore          4
		byte abyte0[] = abyte1;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(abyte1 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       30
		{
			abyte0 = JsonStringEncoder.getInstance().encodeAsUTF8(_value);
	//    7   14:invokestatic    #60  <Method JsonStringEncoder JsonStringEncoder.getInstance()>
	//    8   17:aload_0         
	//    9   18:getfield        #29  <Field String _value>
	//   10   21:invokevirtual   #95  <Method byte[] JsonStringEncoder.encodeAsUTF8(String)>
	//   11   24:astore_3        
			_unquotedUTF8Ref = abyte0;
	//   12   25:aload_0         
	//   13   26:aload_3         
	//   14   27:putfield        #92  <Field byte[] _unquotedUTF8Ref>
		}
		int i = abyte0.length;
	//   15   30:aload_3         
	//   16   31:arraylength     
	//   17   32:istore_2        
		outputstream.write(abyte0, 0, i);
	//   18   33:aload_1         
	//   19   34:aload_3         
	//   20   35:iconst_0        
	//   21   36:iload_2         
	//   22   37:invokevirtual   #137 <Method void OutputStream.write(byte[], int, int)>
		return i;
	//   23   40:iload_2         
	//   24   41:ireturn         
	}

	protected transient String _jdkSerializeValue;
	protected char _quotedChars[];
	protected byte _quotedUTF8Ref[];
	protected byte _unquotedUTF8Ref[];
	protected final String _value;
}
