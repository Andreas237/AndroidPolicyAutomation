// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import java.io.File;

public class CacheSpan
	implements Comparable
{

	public CacheSpan(String s, long l, long l1)
	{
		this(s, l, l1, 0x1L, ((File) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:ldc2w           #21  <Long 0x1L>
	//    5    8:aconst_null     
	//    6    9:invokespecial   #25  <Method void CacheSpan(String, long, long, long, File)>
	//    7   12:return          
	}

	public CacheSpan(String s, long l, long l1, long l2, 
			File file1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		key = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field String key>
		position = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #33  <Field long position>
		length = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #35  <Field long length>
		boolean flag;
		if(file1 != null)
	//*  11   20:aload           8
	//*  12   22:ifnull          31
			flag = true;
	//   13   25:iconst_1        
	//   14   26:istore          9
		else
	//*  15   28:goto            34
			flag = false;
	//   16   31:iconst_0        
	//   17   32:istore          9
		isCached = flag;
	//   18   34:aload_0         
	//   19   35:iload           9
	//   20   37:putfield        #37  <Field boolean isCached>
		file = file1;
	//   21   40:aload_0         
	//   22   41:aload           8
	//   23   43:putfield        #39  <Field File file>
		lastAccessTimestamp = l2;
	//   24   46:aload_0         
	//   25   47:lload           6
	//   26   49:putfield        #41  <Field long lastAccessTimestamp>
	//   27   52:return          
	}

	public int compareTo(CacheSpan cachespan)
	{
		if(!key.equals(((Object) (cachespan.key))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field String key>
	//*   2    4:aload_1         
	//*   3    5:getfield        #31  <Field String key>
	//*   4    8:invokevirtual   #51  <Method boolean String.equals(Object)>
	//*   5   11:ifne            26
			return key.compareTo(cachespan.key);
	//    6   14:aload_0         
	//    7   15:getfield        #31  <Field String key>
	//    8   18:aload_1         
	//    9   19:getfield        #31  <Field String key>
	//   10   22:invokevirtual   #54  <Method int String.compareTo(String)>
	//   11   25:ireturn         
		long l = position - cachespan.position;
	//   12   26:aload_0         
	//   13   27:getfield        #33  <Field long position>
	//   14   30:aload_1         
	//   15   31:getfield        #33  <Field long position>
	//   16   34:lsub            
	//   17   35:lstore_2        
		if(l == 0L)
	//*  18   36:lload_2         
	//*  19   37:lconst_0        
	//*  20   38:lcmp            
	//*  21   39:ifne            44
			return 0;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		return l >= 0L ? 1 : -1;
	//   24   44:lload_2         
	//   25   45:lconst_0        
	//   26   46:lcmp            
	//   27   47:ifge            52
	//   28   50:iconst_m1       
	//   29   51:ireturn         
	//   30   52:iconst_1        
	//   31   53:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((CacheSpan)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class CacheSpan>
	//    3    5:invokevirtual   #57  <Method int compareTo(CacheSpan)>
	//    4    8:ireturn         
	}

	public boolean isHoleSpan()
	{
		return isCached ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean isCached>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	public boolean isOpenEnded()
	{
		return length == -1L;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field long length>
	//    2    4:ldc2w           #61  <Long -1L>
	//    3    7:lcmp            
	//    4    8:ifne            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public final File file;
	public final boolean isCached;
	public final String key;
	public final long lastAccessTimestamp;
	public final long length;
	public final long position;
}
