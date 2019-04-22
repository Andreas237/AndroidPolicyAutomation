// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import android.util.Log;
import java.io.Writer;

public class LogWriter extends Writer
{

	public LogWriter(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Writer()>
		mBuilder = new StringBuilder(128);
	//    2    4:aload_0         
	//    3    5:new             #19  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:sipush          128
	//    6   12:invokespecial   #22  <Method void StringBuilder(int)>
	//    7   15:putfield        #24  <Field StringBuilder mBuilder>
		mTag = s;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #26  <Field String mTag>
	//   11   23:return          
	}

	private void flushBuilder()
	{
		if(mBuilder.length() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field StringBuilder mBuilder>
	//*   2    4:invokevirtual   #32  <Method int StringBuilder.length()>
	//*   3    7:ifle            40
		{
			Log.d(mTag, mBuilder.toString());
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field String mTag>
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field StringBuilder mBuilder>
	//    8   18:invokevirtual   #36  <Method String StringBuilder.toString()>
	//    9   21:invokestatic    #42  <Method int Log.d(String, String)>
	//   10   24:pop             
			StringBuilder stringbuilder = mBuilder;
	//   11   25:aload_0         
	//   12   26:getfield        #24  <Field StringBuilder mBuilder>
	//   13   29:astore_1        
			stringbuilder.delete(0, stringbuilder.length());
	//   14   30:aload_1         
	//   15   31:iconst_0        
	//   16   32:aload_1         
	//   17   33:invokevirtual   #32  <Method int StringBuilder.length()>
	//   18   36:invokevirtual   #46  <Method StringBuilder StringBuilder.delete(int, int)>
	//   19   39:pop             
		}
	//   20   40:return          
	}

	public void close()
	{
		flushBuilder();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void flushBuilder()>
	//    2    4:return          
	}

	public void flush()
	{
		flushBuilder();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void flushBuilder()>
	//    2    4:return          
	}

	public void write(char ac[], int i, int j)
	{
		for(int k = 0; k < j; k++)
	//*   0    0:iconst_0        
	//*   1    1:istore          5
	//*   2    3:iload           5
	//*   3    5:iload_3         
	//*   4    6:icmpge          50
		{
			char c = ac[i + k];
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:iload           5
	//    8   13:iadd            
	//    9   14:caload          
	//   10   15:istore          4
			if(c == '\n')
	//*  11   17:iload           4
	//*  12   19:bipush          10
	//*  13   21:icmpne          31
				flushBuilder();
	//   14   24:aload_0         
	//   15   25:invokespecial   #49  <Method void flushBuilder()>
			else
	//*  16   28:goto            41
				mBuilder.append(c);
	//   17   31:aload_0         
	//   18   32:getfield        #24  <Field StringBuilder mBuilder>
	//   19   35:iload           4
	//   20   37:invokevirtual   #56  <Method StringBuilder StringBuilder.append(char)>
	//   21   40:pop             
		}

	//   22   41:iload           5
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore          5
	//*  26   47:goto            3
	//   27   50:return          
	}

	private StringBuilder mBuilder;
	private final String mTag;
}
