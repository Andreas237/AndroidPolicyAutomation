// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.playlist;

import java.lang.annotation.Annotation;

public final class RenditionKey
	implements Comparable
{
	public static interface Type
		extends Annotation
	{
	}


	public RenditionKey(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int type>
		trackIndex = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #28  <Field int trackIndex>
	//    8   14:return          
	}

	public int compareTo(RenditionKey renditionkey)
	{
		int j = type - renditionkey.type;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int type>
	//    2    4:aload_1         
	//    3    5:getfield        #26  <Field int type>
	//    4    8:isub            
	//    5    9:istore_3        
		int i = j;
	//    6   10:iload_3         
	//    7   11:istore_2        
		if(j == 0)
	//*   8   12:iload_3         
	//*   9   13:ifne            26
			i = trackIndex - renditionkey.trackIndex;
	//   10   16:aload_0         
	//   11   17:getfield        #28  <Field int trackIndex>
	//   12   20:aload_1         
	//   13   21:getfield        #28  <Field int trackIndex>
	//   14   24:isub            
	//   15   25:istore_2        
		return i;
	//   16   26:iload_2         
	//   17   27:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((RenditionKey)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class RenditionKey>
	//    3    5:invokevirtual   #36  <Method int compareTo(RenditionKey)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          55
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #43  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #43  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((RenditionKey)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class RenditionKey>
	//   16   28:astore_1        
			return type == ((RenditionKey) (obj)).type && trackIndex == ((RenditionKey) (obj)).trackIndex;
	//   17   29:aload_0         
	//   18   30:getfield        #26  <Field int type>
	//   19   33:aload_1         
	//   20   34:getfield        #26  <Field int type>
	//   21   37:icmpne          53
	//   22   40:aload_0         
	//   23   41:getfield        #28  <Field int trackIndex>
	//   24   44:aload_1         
	//   25   45:getfield        #28  <Field int trackIndex>
	//   26   48:icmpne          53
	//   27   51:iconst_1        
	//   28   52:ireturn         
	//   29   53:iconst_0        
	//   30   54:ireturn         
		} else
		{
			return false;
	//   31   55:iconst_0        
	//   32   56:ireturn         
		}
	}

	public int hashCode()
	{
		return 31 * type + trackIndex;
	//    0    0:bipush          31
	//    1    2:aload_0         
	//    2    3:getfield        #26  <Field int type>
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #28  <Field int trackIndex>
	//    6   11:iadd            
	//    7   12:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #49  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(type);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field int type>
	//    7   13:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//    8   16:pop             
		stringbuilder.append(".");
	//    9   17:aload_1         
	//   10   18:ldc1            #56  <String ".">
	//   11   20:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(trackIndex);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #28  <Field int trackIndex>
	//   16   29:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	public static final int TYPE_AUDIO = 1;
	public static final int TYPE_SUBTITLE = 2;
	public static final int TYPE_VARIANT = 0;
	public final int trackIndex;
	public final int type;
}
