// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.Writer;

public final class SegmentedStringWriter extends Writer
{

	public SegmentedStringWriter(BufferRecycler bufferrecycler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Writer()>
		_buffer = new TextBuffer(bufferrecycler);
	//    2    4:aload_0         
	//    3    5:new             #13  <Class TextBuffer>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #15  <Method void TextBuffer(BufferRecycler)>
	//    7   13:putfield        #17  <Field TextBuffer _buffer>
	//    8   16:return          
	}

	public Writer append(char c)
	{
		write(((int) (c)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #24  <Method void write(int)>
		return ((Writer) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Writer append(CharSequence charsequence)
	{
		charsequence = ((CharSequence) (((Object) (charsequence)).toString()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method String Object.toString()>
	//    2    4:astore_1        
		_buffer.append(((String) (charsequence)), 0, ((String) (charsequence)).length());
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field TextBuffer _buffer>
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:invokevirtual   #37  <Method int String.length()>
	//    9   15:invokevirtual   #40  <Method void TextBuffer.append(String, int, int)>
		return ((Writer) (this));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public Writer append(CharSequence charsequence, int i, int j)
	{
		charsequence = ((CharSequence) (((Object) (charsequence.subSequence(i, j))).toString()));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokeinterface #47  <Method CharSequence CharSequence.subSequence(int, int)>
	//    4    8:invokevirtual   #31  <Method String Object.toString()>
	//    5   11:astore_1        
		_buffer.append(((String) (charsequence)), 0, ((String) (charsequence)).length());
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field TextBuffer _buffer>
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:aload_1         
	//   11   19:invokevirtual   #37  <Method int String.length()>
	//   12   22:invokevirtual   #40  <Method void TextBuffer.append(String, int, int)>
		return ((Writer) (this));
	//   13   25:aload_0         
	//   14   26:areturn         
	}

	public volatile Appendable append(char c)
		throws IOException
	{
		return ((Appendable) (append(c)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #52  <Method Writer append(char)>
	//    3    5:areturn         
	}

	public volatile Appendable append(CharSequence charsequence)
		throws IOException
	{
		return ((Appendable) (append(charsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #56  <Method Writer append(CharSequence)>
	//    3    5:areturn         
	}

	public volatile Appendable append(CharSequence charsequence, int i, int j)
		throws IOException
	{
		return ((Appendable) (append(charsequence, i, j)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #59  <Method Writer append(CharSequence, int, int)>
	//    5    7:areturn         
	}

	public void close()
	{
	//    0    0:return          
	}

	public void flush()
	{
	//    0    0:return          
	}

	public String getAndClear()
	{
		String s = _buffer.contentsAsString();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextBuffer _buffer>
	//    2    4:invokevirtual   #65  <Method String TextBuffer.contentsAsString()>
	//    3    7:astore_1        
		_buffer.releaseBuffers();
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field TextBuffer _buffer>
	//    6   12:invokevirtual   #68  <Method void TextBuffer.releaseBuffers()>
		return s;
	//    7   15:aload_1         
	//    8   16:areturn         
	}

	public void write(int i)
	{
		_buffer.append((char)i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextBuffer _buffer>
	//    2    4:iload_1         
	//    3    5:int2char        
	//    4    6:invokevirtual   #71  <Method void TextBuffer.append(char)>
	//    5    9:return          
	}

	public void write(String s)
	{
		_buffer.append(s, 0, s.length());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextBuffer _buffer>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:aload_1         
	//    5    7:invokevirtual   #37  <Method int String.length()>
	//    6   10:invokevirtual   #40  <Method void TextBuffer.append(String, int, int)>
	//    7   13:return          
	}

	public void write(String s, int i, int j)
	{
		_buffer.append(s, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextBuffer _buffer>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #40  <Method void TextBuffer.append(String, int, int)>
	//    6   10:return          
	}

	public void write(char ac[])
	{
		_buffer.append(ac, 0, ac.length);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextBuffer _buffer>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokevirtual   #76  <Method void TextBuffer.append(char[], int, int)>
	//    7   11:return          
	}

	public void write(char ac[], int i, int j)
	{
		_buffer.append(ac, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextBuffer _buffer>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #76  <Method void TextBuffer.append(char[], int, int)>
	//    6   10:return          
	}

	protected final TextBuffer _buffer;
}
