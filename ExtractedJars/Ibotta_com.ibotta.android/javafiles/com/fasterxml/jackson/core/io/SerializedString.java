// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import java.io.*;
import java.nio.ByteBuffer;

public class SerializedString
	implements SerializableString, Serializable
{

	public SerializedString(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		if(s != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
		{
			_value = s;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #27  <Field String _value>
			return;
	//    7   13:return          
		} else
		{
			throw new IllegalStateException("Null String illegal for SerializedString");
	//    8   14:new             #29  <Class IllegalStateException>
	//    9   17:dup             
	//   10   18:ldc1            #31  <String "Null String illegal for SerializedString">
	//   11   20:invokespecial   #33  <Method void IllegalStateException(String)>
	//   12   23:athrow          
		}
	}

	private void readObject(ObjectInputStream objectinputstream)
		throws IOException
	{
		_jdkSerializeValue = objectinputstream.readUTF();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method String ObjectInputStream.readUTF()>
	//    3    5:putfield        #46  <Field String _jdkSerializeValue>
	//    4    8:return          
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
		throws IOException
	{
		objectoutputstream.writeUTF(_value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field String _value>
	//    3    5:invokevirtual   #54  <Method void ObjectOutputStream.writeUTF(String)>
	//    4    8:return          
	}

	public int appendQuoted(char ac[], int i)
	{
		char ac2[] = _quotedChars;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field char[] _quotedChars>
	//    2    4:astore          5
		char ac1[] = ac2;
	//    3    6:aload           5
	//    4    8:astore          4
		if(ac2 == null)
	//*   5   10:aload           5
	//*   6   12:ifnonnull       30
		{
			ac1 = BufferRecyclers.quoteAsJsonText(_value);
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field String _value>
	//    9   19:invokestatic    #64  <Method char[] BufferRecyclers.quoteAsJsonText(String)>
	//   10   22:astore          4
			_quotedChars = ac1;
	//   11   24:aload_0         
	//   12   25:aload           4
	//   13   27:putfield        #58  <Field char[] _quotedChars>
		}
		int j = ac1.length;
	//   14   30:aload           4
	//   15   32:arraylength     
	//   16   33:istore_3        
		if(i + j > ac.length)
	//*  17   34:iload_2         
	//*  18   35:iload_3         
	//*  19   36:iadd            
	//*  20   37:aload_1         
	//*  21   38:arraylength     
	//*  22   39:icmple          44
		{
			return -1;
	//   23   42:iconst_m1       
	//   24   43:ireturn         
		} else
		{
			System.arraycopy(((Object) (ac1)), 0, ((Object) (ac)), i, j);
	//   25   44:aload           4
	//   26   46:iconst_0        
	//   27   47:aload_1         
	//   28   48:iload_2         
	//   29   49:iload_3         
	//   30   50:invokestatic    #70  <Method void System.arraycopy(Object, int, Object, int, int)>
			return j;
	//   31   53:iload_3         
	//   32   54:ireturn         
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
	//*   6   12:ifnonnull       30
		{
			abyte1 = BufferRecyclers.quoteAsJsonUTF8(_value);
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field String _value>
	//    9   19:invokestatic    #78  <Method byte[] BufferRecyclers.quoteAsJsonUTF8(String)>
	//   10   22:astore          4
			_quotedUTF8Ref = abyte1;
	//   11   24:aload_0         
	//   12   25:aload           4
	//   13   27:putfield        #74  <Field byte[] _quotedUTF8Ref>
		}
		int j = abyte1.length;
	//   14   30:aload           4
	//   15   32:arraylength     
	//   16   33:istore_3        
		if(i + j > abyte0.length)
	//*  17   34:iload_2         
	//*  18   35:iload_3         
	//*  19   36:iadd            
	//*  20   37:aload_1         
	//*  21   38:arraylength     
	//*  22   39:icmple          44
		{
			return -1;
	//   23   42:iconst_m1       
	//   24   43:ireturn         
		} else
		{
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), i, j);
	//   25   44:aload           4
	//   26   46:iconst_0        
	//   27   47:aload_1         
	//   28   48:iload_2         
	//   29   49:iload_3         
	//   30   50:invokestatic    #70  <Method void System.arraycopy(Object, int, Object, int, int)>
			return j;
	//   31   53:iload_3         
	//   32   54:ireturn         
		}
	}

	public int appendUnquoted(char ac[], int i)
	{
		String s = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String _value>
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
	//*   6   12:ifnonnull       30
		{
			abyte1 = BufferRecyclers.encodeAsUTF8(_value);
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field String _value>
	//    9   19:invokestatic    #95  <Method byte[] BufferRecyclers.encodeAsUTF8(String)>
	//   10   22:astore          4
			_unquotedUTF8Ref = abyte1;
	//   11   24:aload_0         
	//   12   25:aload           4
	//   13   27:putfield        #92  <Field byte[] _unquotedUTF8Ref>
		}
		int j = abyte1.length;
	//   14   30:aload           4
	//   15   32:arraylength     
	//   16   33:istore_3        
		if(i + j > abyte0.length)
	//*  17   34:iload_2         
	//*  18   35:iload_3         
	//*  19   36:iadd            
	//*  20   37:aload_1         
	//*  21   38:arraylength     
	//*  22   39:icmple          44
		{
			return -1;
	//   23   42:iconst_m1       
	//   24   43:ireturn         
		} else
		{
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), i, j);
	//   25   44:aload           4
	//   26   46:iconst_0        
	//   27   47:aload_1         
	//   28   48:iload_2         
	//   29   49:iload_3         
	//   30   50:invokestatic    #70  <Method void System.arraycopy(Object, int, Object, int, int)>
			return j;
	//   31   53:iload_3         
	//   32   54:ireturn         
		}
	}

	public final char[] asQuotedChars()
	{
		char ac1[] = _quotedChars;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field char[] _quotedChars>
	//    2    4:astore_2        
		char ac[] = ac1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(ac1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       24
		{
			ac = BufferRecyclers.quoteAsJsonText(_value);
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field String _value>
	//    9   15:invokestatic    #64  <Method char[] BufferRecyclers.quoteAsJsonText(String)>
	//   10   18:astore_1        
			_quotedChars = ac;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #58  <Field char[] _quotedChars>
		}
		return ac;
	//   14   24:aload_1         
	//   15   25:areturn         
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
	//*   6    8:ifnonnull       24
		{
			abyte0 = BufferRecyclers.quoteAsJsonUTF8(_value);
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field String _value>
	//    9   15:invokestatic    #78  <Method byte[] BufferRecyclers.quoteAsJsonUTF8(String)>
	//   10   18:astore_1        
			_quotedUTF8Ref = abyte0;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #74  <Field byte[] _quotedUTF8Ref>
		}
		return abyte0;
	//   14   24:aload_1         
	//   15   25:areturn         
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
	//*   6    8:ifnonnull       24
		{
			abyte0 = BufferRecyclers.encodeAsUTF8(_value);
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field String _value>
	//    9   15:invokestatic    #95  <Method byte[] BufferRecyclers.encodeAsUTF8(String)>
	//   10   18:astore_1        
			_unquotedUTF8Ref = abyte0;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #92  <Field byte[] _unquotedUTF8Ref>
		}
		return abyte0;
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	public final int charLength()
	{
		return _value.length();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String _value>
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
		if(obj != null && obj.getClass() == ((Object)this).getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          42
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #107 <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #107 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            42
		{
			obj = ((Object) ((SerializedString)obj));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class SerializedString>
	//   15   29:astore_1        
			return _value.equals(((Object) (((SerializedString) (obj))._value)));
	//   16   30:aload_0         
	//   17   31:getfield        #27  <Field String _value>
	//   18   34:aload_1         
	//   19   35:getfield        #27  <Field String _value>
	//   20   38:invokevirtual   #109 <Method boolean String.equals(Object)>
	//   21   41:ireturn         
		} else
		{
			return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		}
	}

	public final String getValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String _value>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		return _value.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String _value>
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
	//*   6   11:ifnonnull       27
		{
			abyte0 = BufferRecyclers.quoteAsJsonUTF8(_value);
	//    7   14:aload_0         
	//    8   15:getfield        #27  <Field String _value>
	//    9   18:invokestatic    #78  <Method byte[] BufferRecyclers.quoteAsJsonUTF8(String)>
	//   10   21:astore_3        
			_quotedUTF8Ref = abyte0;
	//   11   22:aload_0         
	//   12   23:aload_3         
	//   13   24:putfield        #74  <Field byte[] _quotedUTF8Ref>
		}
		int i = abyte0.length;
	//   14   27:aload_3         
	//   15   28:arraylength     
	//   16   29:istore_2        
		if(i > bytebuffer.remaining())
	//*  17   30:iload_2         
	//*  18   31:aload_1         
	//*  19   32:invokevirtual   #120 <Method int ByteBuffer.remaining()>
	//*  20   35:icmple          40
		{
			return -1;
	//   21   38:iconst_m1       
	//   22   39:ireturn         
		} else
		{
			bytebuffer.put(abyte0, 0, i);
	//   23   40:aload_1         
	//   24   41:aload_3         
	//   25   42:iconst_0        
	//   26   43:iload_2         
	//   27   44:invokevirtual   #124 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   28   47:pop             
			return i;
	//   29   48:iload_2         
	//   30   49:ireturn         
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
	//*   6   11:ifnonnull       27
		{
			abyte0 = BufferRecyclers.encodeAsUTF8(_value);
	//    7   14:aload_0         
	//    8   15:getfield        #27  <Field String _value>
	//    9   18:invokestatic    #95  <Method byte[] BufferRecyclers.encodeAsUTF8(String)>
	//   10   21:astore_3        
			_unquotedUTF8Ref = abyte0;
	//   11   22:aload_0         
	//   12   23:aload_3         
	//   13   24:putfield        #92  <Field byte[] _unquotedUTF8Ref>
		}
		int i = abyte0.length;
	//   14   27:aload_3         
	//   15   28:arraylength     
	//   16   29:istore_2        
		if(i > bytebuffer.remaining())
	//*  17   30:iload_2         
	//*  18   31:aload_1         
	//*  19   32:invokevirtual   #120 <Method int ByteBuffer.remaining()>
	//*  20   35:icmple          40
		{
			return -1;
	//   21   38:iconst_m1       
	//   22   39:ireturn         
		} else
		{
			bytebuffer.put(abyte0, 0, i);
	//   23   40:aload_1         
	//   24   41:aload_3         
	//   25   42:iconst_0        
	//   26   43:iload_2         
	//   27   44:invokevirtual   #124 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   28   47:pop             
			return i;
	//   29   48:iload_2         
	//   30   49:ireturn         
		}
	}

	protected Object readResolve()
	{
		return ((Object) (new SerializedString(_jdkSerializeValue)));
	//    0    0:new             #2   <Class SerializedString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field String _jdkSerializeValue>
	//    4    8:invokespecial   #128 <Method void SerializedString(String)>
	//    5   11:areturn         
	}

	public final String toString()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String _value>
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
	//*   6   11:ifnonnull       27
		{
			abyte0 = BufferRecyclers.quoteAsJsonUTF8(_value);
	//    7   14:aload_0         
	//    8   15:getfield        #27  <Field String _value>
	//    9   18:invokestatic    #78  <Method byte[] BufferRecyclers.quoteAsJsonUTF8(String)>
	//   10   21:astore_3        
			_quotedUTF8Ref = abyte0;
	//   11   22:aload_0         
	//   12   23:aload_3         
	//   13   24:putfield        #74  <Field byte[] _quotedUTF8Ref>
		}
		int i = abyte0.length;
	//   14   27:aload_3         
	//   15   28:arraylength     
	//   16   29:istore_2        
		outputstream.write(abyte0, 0, i);
	//   17   30:aload_1         
	//   18   31:aload_3         
	//   19   32:iconst_0        
	//   20   33:iload_2         
	//   21   34:invokevirtual   #137 <Method void OutputStream.write(byte[], int, int)>
		return i;
	//   22   37:iload_2         
	//   23   38:ireturn         
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
	//*   6   11:ifnonnull       27
		{
			abyte0 = BufferRecyclers.encodeAsUTF8(_value);
	//    7   14:aload_0         
	//    8   15:getfield        #27  <Field String _value>
	//    9   18:invokestatic    #95  <Method byte[] BufferRecyclers.encodeAsUTF8(String)>
	//   10   21:astore_3        
			_unquotedUTF8Ref = abyte0;
	//   11   22:aload_0         
	//   12   23:aload_3         
	//   13   24:putfield        #92  <Field byte[] _unquotedUTF8Ref>
		}
		int i = abyte0.length;
	//   14   27:aload_3         
	//   15   28:arraylength     
	//   16   29:istore_2        
		outputstream.write(abyte0, 0, i);
	//   17   30:aload_1         
	//   18   31:aload_3         
	//   19   32:iconst_0        
	//   20   33:iload_2         
	//   21   34:invokevirtual   #137 <Method void OutputStream.write(byte[], int, int)>
		return i;
	//   22   37:iload_2         
	//   23   38:ireturn         
	}

	private static final long serialVersionUID = 1L;
	protected transient String _jdkSerializeValue;
	protected char _quotedChars[];
	protected byte _quotedUTF8Ref[];
	protected byte _unquotedUTF8Ref[];
	protected final String _value;
}
