// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming.manifest;


public final class StreamKey
	implements Comparable
{

	public StreamKey(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		streamElementIndex = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int streamElementIndex>
		trackIndex = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int trackIndex>
	//    8   14:return          
	}

	public int compareTo(StreamKey streamkey)
	{
		int j = streamElementIndex - streamkey.streamElementIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int streamElementIndex>
	//    2    4:aload_1         
	//    3    5:getfield        #17  <Field int streamElementIndex>
	//    4    8:isub            
	//    5    9:istore_3        
		int i = j;
	//    6   10:iload_3         
	//    7   11:istore_2        
		if(j == 0)
	//*   8   12:iload_3         
	//*   9   13:ifne            26
			i = trackIndex - streamkey.trackIndex;
	//   10   16:aload_0         
	//   11   17:getfield        #19  <Field int trackIndex>
	//   12   20:aload_1         
	//   13   21:getfield        #19  <Field int trackIndex>
	//   14   24:isub            
	//   15   25:istore_2        
		return i;
	//   16   26:iload_2         
	//   17   27:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((StreamKey)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class StreamKey>
	//    3    5:invokevirtual   #27  <Method int compareTo(StreamKey)>
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
	//*   8   12:invokevirtual   #34  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #34  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((StreamKey)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class StreamKey>
	//   16   28:astore_1        
			return streamElementIndex == ((StreamKey) (obj)).streamElementIndex && trackIndex == ((StreamKey) (obj)).trackIndex;
	//   17   29:aload_0         
	//   18   30:getfield        #17  <Field int streamElementIndex>
	//   19   33:aload_1         
	//   20   34:getfield        #17  <Field int streamElementIndex>
	//   21   37:icmpne          53
	//   22   40:aload_0         
	//   23   41:getfield        #19  <Field int trackIndex>
	//   24   44:aload_1         
	//   25   45:getfield        #19  <Field int trackIndex>
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
		return 31 * streamElementIndex + trackIndex;
	//    0    0:bipush          31
	//    1    2:aload_0         
	//    2    3:getfield        #17  <Field int streamElementIndex>
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #19  <Field int trackIndex>
	//    6   11:iadd            
	//    7   12:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(streamElementIndex);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field int streamElementIndex>
	//    7   13:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//    8   16:pop             
		stringbuilder.append(".");
	//    9   17:aload_1         
	//   10   18:ldc1            #47  <String ".">
	//   11   20:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(trackIndex);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #19  <Field int trackIndex>
	//   16   29:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	public final int streamElementIndex;
	public final int trackIndex;
}
