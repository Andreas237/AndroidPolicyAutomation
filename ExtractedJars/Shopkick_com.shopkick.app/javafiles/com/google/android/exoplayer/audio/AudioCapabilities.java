// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.audio;

import android.content.*;
import java.util.Arrays;

public final class AudioCapabilities
{

	AudioCapabilities(int ai[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		if(ai != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          28
		{
			supportedEncodings = Arrays.copyOf(ai, ai.length);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:invokestatic    #30  <Method int[] Arrays.copyOf(int[], int)>
	//    9   15:putfield        #32  <Field int[] supportedEncodings>
			Arrays.sort(supportedEncodings);
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field int[] supportedEncodings>
	//   12   22:invokestatic    #36  <Method void Arrays.sort(int[])>
		} else
	//*  13   25:goto            35
		{
			supportedEncodings = new int[0];
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:newarray        int[]
	//   17   32:putfield        #32  <Field int[] supportedEncodings>
		}
		maxChannelCount = i;
	//   18   35:aload_0         
	//   19   36:iload_2         
	//   20   37:putfield        #38  <Field int maxChannelCount>
	//   21   40:return          
	}

	public static AudioCapabilities getCapabilities(Context context)
	{
		return getCapabilities(context.registerReceiver(((android.content.BroadcastReceiver) (null)), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:new             #42  <Class IntentFilter>
	//    3    5:dup             
	//    4    6:ldc1            #44  <String "android.media.action.HDMI_AUDIO_PLUG">
	//    5    8:invokespecial   #47  <Method void IntentFilter(String)>
	//    6   11:invokevirtual   #53  <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//    7   14:invokestatic    #56  <Method AudioCapabilities getCapabilities(Intent)>
	//    8   17:areturn         
	}

	static AudioCapabilities getCapabilities(Intent intent)
	{
		if(intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          38
	//*   2    4:aload_0         
	//*   3    5:ldc1            #60  <String "android.media.extra.AUDIO_PLUG_STATE">
	//*   4    7:iconst_0        
	//*   5    8:invokevirtual   #66  <Method int Intent.getIntExtra(String, int)>
	//*   6   11:ifne            17
	//*   7   14:goto            38
			return new AudioCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
	//    8   17:new             #2   <Class AudioCapabilities>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:ldc1            #68  <String "android.media.extra.ENCODINGS">
	//   12   24:invokevirtual   #72  <Method int[] Intent.getIntArrayExtra(String)>
	//   13   27:aload_0         
	//   14   28:ldc1            #74  <String "android.media.extra.MAX_CHANNEL_COUNT">
	//   15   30:iconst_0        
	//   16   31:invokevirtual   #66  <Method int Intent.getIntExtra(String, int)>
	//   17   34:invokespecial   #19  <Method void AudioCapabilities(int[], int)>
	//   18   37:areturn         
		else
			return DEFAULT_AUDIO_CAPABILITIES;
	//   19   38:getstatic       #21  <Field AudioCapabilities DEFAULT_AUDIO_CAPABILITIES>
	//   20   41:areturn         
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
		if(!(obj instanceof AudioCapabilities))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AudioCapabilities>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((AudioCapabilities)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class AudioCapabilities>
	//   12   20:astore_1        
		return Arrays.equals(supportedEncodings, ((AudioCapabilities) (obj)).supportedEncodings) && maxChannelCount == ((AudioCapabilities) (obj)).maxChannelCount;
	//   13   21:aload_0         
	//   14   22:getfield        #32  <Field int[] supportedEncodings>
	//   15   25:aload_1         
	//   16   26:getfield        #32  <Field int[] supportedEncodings>
	//   17   29:invokestatic    #80  <Method boolean Arrays.equals(int[], int[])>
	//   18   32:ifeq            48
	//   19   35:aload_0         
	//   20   36:getfield        #38  <Field int maxChannelCount>
	//   21   39:aload_1         
	//   22   40:getfield        #38  <Field int maxChannelCount>
	//   23   43:icmpne          48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public int getMaxChannelCount()
	{
		return maxChannelCount;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int maxChannelCount>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return maxChannelCount + Arrays.hashCode(supportedEncodings) * 31;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int maxChannelCount>
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field int[] supportedEncodings>
	//    4    8:invokestatic    #86  <Method int Arrays.hashCode(int[])>
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:iadd            
	//    8   15:ireturn         
	}

	public boolean supportsEncoding(int i)
	{
		return Arrays.binarySearch(supportedEncodings, i) >= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int[] supportedEncodings>
	//    2    4:iload_1         
	//    3    5:invokestatic    #92  <Method int Arrays.binarySearch(int[], int)>
	//    4    8:iflt            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #96  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("AudioCapabilities[maxChannelCount=");
	//    4    8:aload_1         
	//    5    9:ldc1            #99  <String "AudioCapabilities[maxChannelCount=">
	//    6   11:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(maxChannelCount);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #38  <Field int maxChannelCount>
	//   11   20:invokevirtual   #106 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", supportedEncodings=");
	//   13   24:aload_1         
	//   14   25:ldc1            #108 <String ", supportedEncodings=">
	//   15   27:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(Arrays.toString(supportedEncodings));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #32  <Field int[] supportedEncodings>
	//   20   36:invokestatic    #111 <Method String Arrays.toString(int[])>
	//   21   39:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append("]");
	//   23   43:aload_1         
	//   24   44:ldc1            #113 <String "]">
	//   25   46:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		return stringbuilder.toString();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   29   54:areturn         
	}

	public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(new int[] {
		2
	}, 2);
	private final int maxChannelCount;
	private final int supportedEncodings[];

	static 
	{
	//    0    0:new             #2   <Class AudioCapabilities>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:newarray        int[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:iconst_2        
	//    7   10:iastore         
	//    8   11:iconst_2        
	//    9   12:invokespecial   #19  <Method void AudioCapabilities(int[], int)>
	//   10   15:putstatic       #21  <Field AudioCapabilities DEFAULT_AUDIO_CAPABILITIES>
	//*  11   18:return          
	}
}
