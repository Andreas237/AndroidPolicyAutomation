// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import android.text.TextUtils;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			DefaultTrackSelector

private static final class DefaultTrackSelector$AudioConfigurationTuple
{

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
	//*   6    8:ifnull          69
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #32  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #32  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((DefaultTrackSelector$AudioConfigurationTuple)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class DefaultTrackSelector$AudioConfigurationTuple>
	//   16   28:astore_1        
			return channelCount == ((DefaultTrackSelector$AudioConfigurationTuple) (obj)).channelCount && sampleRate == ((DefaultTrackSelector$AudioConfigurationTuple) (obj)).sampleRate && TextUtils.equals(((CharSequence) (mimeType)), ((CharSequence) (((DefaultTrackSelector$AudioConfigurationTuple) (obj)).mimeType)));
	//   17   29:aload_0         
	//   18   30:getfield        #20  <Field int channelCount>
	//   19   33:aload_1         
	//   20   34:getfield        #20  <Field int channelCount>
	//   21   37:icmpne          67
	//   22   40:aload_0         
	//   23   41:getfield        #22  <Field int sampleRate>
	//   24   44:aload_1         
	//   25   45:getfield        #22  <Field int sampleRate>
	//   26   48:icmpne          67
	//   27   51:aload_0         
	//   28   52:getfield        #24  <Field String mimeType>
	//   29   55:aload_1         
	//   30   56:getfield        #24  <Field String mimeType>
	//   31   59:invokestatic    #37  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   32   62:ifeq            67
	//   33   65:iconst_1        
	//   34   66:ireturn         
	//   35   67:iconst_0        
	//   36   68:ireturn         
		} else
		{
			return false;
	//   37   69:iconst_0        
	//   38   70:ireturn         
		}
	}

	public int hashCode()
	{
		int j = channelCount;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int channelCount>
	//    2    4:istore_2        
		int k = sampleRate;
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field int sampleRate>
	//    5    9:istore_3        
		int i;
		if(mimeType != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #24  <Field String mimeType>
	//*   8   14:ifnull          28
			i = mimeType.hashCode();
	//    9   17:aload_0         
	//   10   18:getfield        #24  <Field String mimeType>
	//   11   21:invokevirtual   #43  <Method int String.hashCode()>
	//   12   24:istore_1        
		else
	//*  13   25:goto            30
			i = 0;
	//   14   28:iconst_0        
	//   15   29:istore_1        
		return 31 * (j * 31 + k) + i;
	//   16   30:bipush          31
	//   17   32:iload_2         
	//   18   33:bipush          31
	//   19   35:imul            
	//   20   36:iload_3         
	//   21   37:iadd            
	//   22   38:imul            
	//   23   39:iload_1         
	//   24   40:iadd            
	//   25   41:ireturn         
	}

	public final int channelCount;
	public final String mimeType;
	public final int sampleRate;

	public DefaultTrackSelector$AudioConfigurationTuple(int i, int j, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		channelCount = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int channelCount>
		sampleRate = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int sampleRate>
		mimeType = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field String mimeType>
	//   11   19:return          
	}
}
