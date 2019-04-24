// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

public class IOContext
{

	public IOContext(BufferRecycler bufferrecycler, Object obj, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		_bufferRecycler = bufferrecycler;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field BufferRecycler _bufferRecycler>
		_sourceRef = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Object _sourceRef>
		_managedResource = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #31  <Field boolean _managedResource>
	//   11   19:return          
	}

	private IllegalArgumentException wrongBuf()
	{
		return new IllegalArgumentException("Trying to release buffer not owned by the context");
	//    0    0:new             #36  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #38  <String "Trying to release buffer not owned by the context">
	//    3    6:invokespecial   #41  <Method void IllegalArgumentException(String)>
	//    4    9:areturn         
	}

	protected final void _verifyAlloc(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
			throw new IllegalStateException("Trying to call same allocXxx() method second time");
	//    2    4:new             #45  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:ldc1            #47  <String "Trying to call same allocXxx() method second time">
	//    5   10:invokespecial   #48  <Method void IllegalStateException(String)>
	//    6   13:athrow          
		else
			return;
	//    7   14:return          
	}

	protected final void _verifyRelease(byte abyte0[], byte abyte1[])
	{
		if(abyte0 != abyte1 && abyte0.length <= abyte1.length)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpeq       17
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:aload_2         
	//*   6    8:arraylength     
	//*   7    9:icmpgt          17
			throw wrongBuf();
	//    8   12:aload_0         
	//    9   13:invokespecial   #52  <Method IllegalArgumentException wrongBuf()>
	//   10   16:athrow          
		else
			return;
	//   11   17:return          
	}

	protected final void _verifyRelease(char ac[], char ac1[])
	{
		if(ac != ac1 && ac.length <= ac1.length)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpeq       17
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:aload_2         
	//*   6    8:arraylength     
	//*   7    9:icmpgt          17
			throw wrongBuf();
	//    8   12:aload_0         
	//    9   13:invokespecial   #52  <Method IllegalArgumentException wrongBuf()>
	//   10   16:athrow          
		else
			return;
	//   11   17:return          
	}

	public byte[] allocBase64Buffer()
	{
		_verifyAlloc(((Object) (_base64Buffer)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #57  <Field byte[] _base64Buffer>
	//    3    5:invokevirtual   #59  <Method void _verifyAlloc(Object)>
		byte abyte0[] = _bufferRecycler.allocByteBuffer(3);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//    6   12:iconst_3        
	//    7   13:invokevirtual   #65  <Method byte[] BufferRecycler.allocByteBuffer(int)>
	//    8   16:astore_1        
		_base64Buffer = abyte0;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #57  <Field byte[] _base64Buffer>
		return abyte0;
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public char[] allocConcatBuffer()
	{
		_verifyAlloc(((Object) (_concatCBuffer)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #69  <Field char[] _concatCBuffer>
	//    3    5:invokevirtual   #59  <Method void _verifyAlloc(Object)>
		char ac[] = _bufferRecycler.allocCharBuffer(1);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #73  <Method char[] BufferRecycler.allocCharBuffer(int)>
	//    8   16:astore_1        
		_concatCBuffer = ac;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #69  <Field char[] _concatCBuffer>
		return ac;
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public char[] allocNameCopyBuffer(int i)
	{
		_verifyAlloc(((Object) (_nameCopyBuffer)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #76  <Field char[] _nameCopyBuffer>
	//    3    5:invokevirtual   #59  <Method void _verifyAlloc(Object)>
		char ac[] = _bufferRecycler.allocCharBuffer(3, i);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//    6   12:iconst_3        
	//    7   13:iload_1         
	//    8   14:invokevirtual   #79  <Method char[] BufferRecycler.allocCharBuffer(int, int)>
	//    9   17:astore_2        
		_nameCopyBuffer = ac;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #76  <Field char[] _nameCopyBuffer>
		return ac;
	//   13   23:aload_2         
	//   14   24:areturn         
	}

	public byte[] allocReadIOBuffer()
	{
		_verifyAlloc(((Object) (_readIOBuffer)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #82  <Field byte[] _readIOBuffer>
	//    3    5:invokevirtual   #59  <Method void _verifyAlloc(Object)>
		byte abyte0[] = _bufferRecycler.allocByteBuffer(0);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #65  <Method byte[] BufferRecycler.allocByteBuffer(int)>
	//    8   16:astore_1        
		_readIOBuffer = abyte0;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #82  <Field byte[] _readIOBuffer>
		return abyte0;
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public byte[] allocReadIOBuffer(int i)
	{
		_verifyAlloc(((Object) (_readIOBuffer)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #82  <Field byte[] _readIOBuffer>
	//    3    5:invokevirtual   #59  <Method void _verifyAlloc(Object)>
		byte abyte0[] = _bufferRecycler.allocByteBuffer(0, i);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//    6   12:iconst_0        
	//    7   13:iload_1         
	//    8   14:invokevirtual   #85  <Method byte[] BufferRecycler.allocByteBuffer(int, int)>
	//    9   17:astore_2        
		_readIOBuffer = abyte0;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #82  <Field byte[] _readIOBuffer>
		return abyte0;
	//   13   23:aload_2         
	//   14   24:areturn         
	}

	public char[] allocTokenBuffer()
	{
		_verifyAlloc(((Object) (_tokenCBuffer)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #88  <Field char[] _tokenCBuffer>
	//    3    5:invokevirtual   #59  <Method void _verifyAlloc(Object)>
		char ac[] = _bufferRecycler.allocCharBuffer(0);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #73  <Method char[] BufferRecycler.allocCharBuffer(int)>
	//    8   16:astore_1        
		_tokenCBuffer = ac;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #88  <Field char[] _tokenCBuffer>
		return ac;
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public char[] allocTokenBuffer(int i)
	{
		_verifyAlloc(((Object) (_tokenCBuffer)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #88  <Field char[] _tokenCBuffer>
	//    3    5:invokevirtual   #59  <Method void _verifyAlloc(Object)>
		char ac[] = _bufferRecycler.allocCharBuffer(0, i);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//    6   12:iconst_0        
	//    7   13:iload_1         
	//    8   14:invokevirtual   #79  <Method char[] BufferRecycler.allocCharBuffer(int, int)>
	//    9   17:astore_2        
		_tokenCBuffer = ac;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #88  <Field char[] _tokenCBuffer>
		return ac;
	//   13   23:aload_2         
	//   14   24:areturn         
	}

	public byte[] allocWriteEncodingBuffer()
	{
		_verifyAlloc(((Object) (_writeEncodingBuffer)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #91  <Field byte[] _writeEncodingBuffer>
	//    3    5:invokevirtual   #59  <Method void _verifyAlloc(Object)>
		byte abyte0[] = _bufferRecycler.allocByteBuffer(1);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #65  <Method byte[] BufferRecycler.allocByteBuffer(int)>
	//    8   16:astore_1        
		_writeEncodingBuffer = abyte0;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #91  <Field byte[] _writeEncodingBuffer>
		return abyte0;
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public byte[] allocWriteEncodingBuffer(int i)
	{
		_verifyAlloc(((Object) (_writeEncodingBuffer)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #91  <Field byte[] _writeEncodingBuffer>
	//    3    5:invokevirtual   #59  <Method void _verifyAlloc(Object)>
		byte abyte0[] = _bufferRecycler.allocByteBuffer(1, i);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//    6   12:iconst_1        
	//    7   13:iload_1         
	//    8   14:invokevirtual   #85  <Method byte[] BufferRecycler.allocByteBuffer(int, int)>
	//    9   17:astore_2        
		_writeEncodingBuffer = abyte0;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #91  <Field byte[] _writeEncodingBuffer>
		return abyte0;
	//   13   23:aload_2         
	//   14   24:areturn         
	}

	public TextBuffer constructTextBuffer()
	{
		return new TextBuffer(_bufferRecycler);
	//    0    0:new             #95  <Class TextBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//    4    8:invokespecial   #98  <Method void TextBuffer(BufferRecycler)>
	//    5   11:areturn         
	}

	public JsonEncoding getEncoding()
	{
		return _encoding;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field JsonEncoding _encoding>
	//    2    4:areturn         
	}

	public Object getSourceReference()
	{
		return _sourceRef;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object _sourceRef>
	//    2    4:areturn         
	}

	public boolean isResourceManaged()
	{
		return _managedResource;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean _managedResource>
	//    2    4:ireturn         
	}

	public void releaseBase64Buffer(byte abyte0[])
	{
		if(abyte0 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          27
		{
			_verifyRelease(abyte0, _base64Buffer);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #57  <Field byte[] _base64Buffer>
	//    6   10:invokevirtual   #110 <Method void _verifyRelease(byte[], byte[])>
			_base64Buffer = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #57  <Field byte[] _base64Buffer>
			_bufferRecycler.releaseByteBuffer(3, abyte0);
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//   12   22:iconst_3        
	//   13   23:aload_1         
	//   14   24:invokevirtual   #114 <Method void BufferRecycler.releaseByteBuffer(int, byte[])>
		}
	//   15   27:return          
	}

	public void releaseConcatBuffer(char ac[])
	{
		if(ac != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          27
		{
			_verifyRelease(ac, _concatCBuffer);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #69  <Field char[] _concatCBuffer>
	//    6   10:invokevirtual   #118 <Method void _verifyRelease(char[], char[])>
			_concatCBuffer = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #69  <Field char[] _concatCBuffer>
			_bufferRecycler.releaseCharBuffer(1, ac);
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//   12   22:iconst_1        
	//   13   23:aload_1         
	//   14   24:invokevirtual   #122 <Method void BufferRecycler.releaseCharBuffer(int, char[])>
		}
	//   15   27:return          
	}

	public void releaseNameCopyBuffer(char ac[])
	{
		if(ac != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          27
		{
			_verifyRelease(ac, _nameCopyBuffer);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #76  <Field char[] _nameCopyBuffer>
	//    6   10:invokevirtual   #118 <Method void _verifyRelease(char[], char[])>
			_nameCopyBuffer = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #76  <Field char[] _nameCopyBuffer>
			_bufferRecycler.releaseCharBuffer(3, ac);
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//   12   22:iconst_3        
	//   13   23:aload_1         
	//   14   24:invokevirtual   #122 <Method void BufferRecycler.releaseCharBuffer(int, char[])>
		}
	//   15   27:return          
	}

	public void releaseReadIOBuffer(byte abyte0[])
	{
		if(abyte0 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          27
		{
			_verifyRelease(abyte0, _readIOBuffer);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #82  <Field byte[] _readIOBuffer>
	//    6   10:invokevirtual   #110 <Method void _verifyRelease(byte[], byte[])>
			_readIOBuffer = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #82  <Field byte[] _readIOBuffer>
			_bufferRecycler.releaseByteBuffer(0, abyte0);
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//   12   22:iconst_0        
	//   13   23:aload_1         
	//   14   24:invokevirtual   #114 <Method void BufferRecycler.releaseByteBuffer(int, byte[])>
		}
	//   15   27:return          
	}

	public void releaseTokenBuffer(char ac[])
	{
		if(ac != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          27
		{
			_verifyRelease(ac, _tokenCBuffer);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #88  <Field char[] _tokenCBuffer>
	//    6   10:invokevirtual   #118 <Method void _verifyRelease(char[], char[])>
			_tokenCBuffer = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #88  <Field char[] _tokenCBuffer>
			_bufferRecycler.releaseCharBuffer(0, ac);
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//   12   22:iconst_0        
	//   13   23:aload_1         
	//   14   24:invokevirtual   #122 <Method void BufferRecycler.releaseCharBuffer(int, char[])>
		}
	//   15   27:return          
	}

	public void releaseWriteEncodingBuffer(byte abyte0[])
	{
		if(abyte0 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          27
		{
			_verifyRelease(abyte0, _writeEncodingBuffer);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #91  <Field byte[] _writeEncodingBuffer>
	//    6   10:invokevirtual   #110 <Method void _verifyRelease(byte[], byte[])>
			_writeEncodingBuffer = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #91  <Field byte[] _writeEncodingBuffer>
			_bufferRecycler.releaseByteBuffer(1, abyte0);
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field BufferRecycler _bufferRecycler>
	//   12   22:iconst_1        
	//   13   23:aload_1         
	//   14   24:invokevirtual   #114 <Method void BufferRecycler.releaseByteBuffer(int, byte[])>
		}
	//   15   27:return          
	}

	public void setEncoding(JsonEncoding jsonencoding)
	{
		_encoding = jsonencoding;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field JsonEncoding _encoding>
	//    3    5:return          
	}

	public IOContext withEncoding(JsonEncoding jsonencoding)
	{
		_encoding = jsonencoding;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field JsonEncoding _encoding>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected byte _base64Buffer[];
	protected final BufferRecycler _bufferRecycler;
	protected char _concatCBuffer[];
	protected JsonEncoding _encoding;
	protected final boolean _managedResource;
	protected char _nameCopyBuffer[];
	protected byte _readIOBuffer[];
	protected final Object _sourceRef;
	protected char _tokenCBuffer[];
	protected byte _writeEncodingBuffer[];
}
