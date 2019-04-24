// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			DefaultTrackSelector

private static final class DefaultTrackSelector$AudioTrackScore
	implements Comparable
{

	public int compareTo(DefaultTrackSelector$AudioTrackScore defaulttrackselector$audiotrackscore)
	{
		if(withinRendererCapabilitiesScore != defaulttrackselector$audiotrackscore.withinRendererCapabilitiesScore)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int withinRendererCapabilitiesScore>
	//*   2    4:aload_1         
	//*   3    5:getfield        #35  <Field int withinRendererCapabilitiesScore>
	//*   4    8:icmpeq          23
			return DefaultTrackSelector.access$300(withinRendererCapabilitiesScore, defaulttrackselector$audiotrackscore.withinRendererCapabilitiesScore);
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field int withinRendererCapabilitiesScore>
	//    7   15:aload_1         
	//    8   16:getfield        #35  <Field int withinRendererCapabilitiesScore>
	//    9   19:invokestatic    #39  <Method int DefaultTrackSelector.access$300(int, int)>
	//   10   22:ireturn         
		if(matchLanguageScore != defaulttrackselector$audiotrackscore.matchLanguageScore)
	//*  11   23:aload_0         
	//*  12   24:getfield        #41  <Field int matchLanguageScore>
	//*  13   27:aload_1         
	//*  14   28:getfield        #41  <Field int matchLanguageScore>
	//*  15   31:icmpeq          46
			return DefaultTrackSelector.access$300(matchLanguageScore, defaulttrackselector$audiotrackscore.matchLanguageScore);
	//   16   34:aload_0         
	//   17   35:getfield        #41  <Field int matchLanguageScore>
	//   18   38:aload_1         
	//   19   39:getfield        #41  <Field int matchLanguageScore>
	//   20   42:invokestatic    #39  <Method int DefaultTrackSelector.access$300(int, int)>
	//   21   45:ireturn         
		if(defaultSelectionFlagScore != defaulttrackselector$audiotrackscore.defaultSelectionFlagScore)
	//*  22   46:aload_0         
	//*  23   47:getfield        #43  <Field int defaultSelectionFlagScore>
	//*  24   50:aload_1         
	//*  25   51:getfield        #43  <Field int defaultSelectionFlagScore>
	//*  26   54:icmpeq          69
			return DefaultTrackSelector.access$300(defaultSelectionFlagScore, defaulttrackselector$audiotrackscore.defaultSelectionFlagScore);
	//   27   57:aload_0         
	//   28   58:getfield        #43  <Field int defaultSelectionFlagScore>
	//   29   61:aload_1         
	//   30   62:getfield        #43  <Field int defaultSelectionFlagScore>
	//   31   65:invokestatic    #39  <Method int DefaultTrackSelector.access$300(int, int)>
	//   32   68:ireturn         
		if(parameters.forceLowestBitrate)
	//*  33   69:aload_0         
	//*  34   70:getfield        #45  <Field DefaultTrackSelector$Parameters parameters>
	//*  35   73:getfield        #51  <Field boolean DefaultTrackSelector$Parameters.forceLowestBitrate>
	//*  36   76:ifeq            91
			return DefaultTrackSelector.access$300(defaulttrackselector$audiotrackscore.bitrate, bitrate);
	//   37   79:aload_1         
	//   38   80:getfield        #53  <Field int bitrate>
	//   39   83:aload_0         
	//   40   84:getfield        #53  <Field int bitrate>
	//   41   87:invokestatic    #39  <Method int DefaultTrackSelector.access$300(int, int)>
	//   42   90:ireturn         
		int i = withinRendererCapabilitiesScore;
	//   43   91:aload_0         
	//   44   92:getfield        #35  <Field int withinRendererCapabilitiesScore>
	//   45   95:istore_3        
		byte byte0 = 1;
	//   46   96:iconst_1        
	//   47   97:istore_2        
		if(i != 1)
	//*  48   98:iload_3         
	//*  49   99:iconst_1        
	//*  50  100:icmpne          106
	//*  51  103:goto            108
			byte0 = -1;
	//   52  106:iconst_m1       
	//   53  107:istore_2        
		if(channelCount != defaulttrackselector$audiotrackscore.channelCount)
	//*  54  108:aload_0         
	//*  55  109:getfield        #55  <Field int channelCount>
	//*  56  112:aload_1         
	//*  57  113:getfield        #55  <Field int channelCount>
	//*  58  116:icmpeq          133
			return byte0 * DefaultTrackSelector.access$300(channelCount, defaulttrackselector$audiotrackscore.channelCount);
	//   59  119:iload_2         
	//   60  120:aload_0         
	//   61  121:getfield        #55  <Field int channelCount>
	//   62  124:aload_1         
	//   63  125:getfield        #55  <Field int channelCount>
	//   64  128:invokestatic    #39  <Method int DefaultTrackSelector.access$300(int, int)>
	//   65  131:imul            
	//   66  132:ireturn         
		if(sampleRate != defaulttrackselector$audiotrackscore.sampleRate)
	//*  67  133:aload_0         
	//*  68  134:getfield        #57  <Field int sampleRate>
	//*  69  137:aload_1         
	//*  70  138:getfield        #57  <Field int sampleRate>
	//*  71  141:icmpeq          158
			return byte0 * DefaultTrackSelector.access$300(sampleRate, defaulttrackselector$audiotrackscore.sampleRate);
	//   72  144:iload_2         
	//   73  145:aload_0         
	//   74  146:getfield        #57  <Field int sampleRate>
	//   75  149:aload_1         
	//   76  150:getfield        #57  <Field int sampleRate>
	//   77  153:invokestatic    #39  <Method int DefaultTrackSelector.access$300(int, int)>
	//   78  156:imul            
	//   79  157:ireturn         
		else
			return byte0 * DefaultTrackSelector.access$300(bitrate, defaulttrackselector$audiotrackscore.bitrate);
	//   80  158:iload_2         
	//   81  159:aload_0         
	//   82  160:getfield        #53  <Field int bitrate>
	//   83  163:aload_1         
	//   84  164:getfield        #53  <Field int bitrate>
	//   85  167:invokestatic    #39  <Method int DefaultTrackSelector.access$300(int, int)>
	//   86  170:imul            
	//   87  171:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((DefaultTrackSelector$AudioTrackScore)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class DefaultTrackSelector$AudioTrackScore>
	//    3    5:invokevirtual   #60  <Method int compareTo(DefaultTrackSelector$AudioTrackScore)>
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
	//*   6    8:ifnull          99
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #67  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #67  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((DefaultTrackSelector$AudioTrackScore)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class DefaultTrackSelector$AudioTrackScore>
	//   16   28:astore_1        
			return withinRendererCapabilitiesScore == ((DefaultTrackSelector$AudioTrackScore) (obj)).withinRendererCapabilitiesScore && matchLanguageScore == ((DefaultTrackSelector$AudioTrackScore) (obj)).matchLanguageScore && defaultSelectionFlagScore == ((DefaultTrackSelector$AudioTrackScore) (obj)).defaultSelectionFlagScore && channelCount == ((DefaultTrackSelector$AudioTrackScore) (obj)).channelCount && sampleRate == ((DefaultTrackSelector$AudioTrackScore) (obj)).sampleRate && bitrate == ((DefaultTrackSelector$AudioTrackScore) (obj)).bitrate;
	//   17   29:aload_0         
	//   18   30:getfield        #35  <Field int withinRendererCapabilitiesScore>
	//   19   33:aload_1         
	//   20   34:getfield        #35  <Field int withinRendererCapabilitiesScore>
	//   21   37:icmpne          97
	//   22   40:aload_0         
	//   23   41:getfield        #41  <Field int matchLanguageScore>
	//   24   44:aload_1         
	//   25   45:getfield        #41  <Field int matchLanguageScore>
	//   26   48:icmpne          97
	//   27   51:aload_0         
	//   28   52:getfield        #43  <Field int defaultSelectionFlagScore>
	//   29   55:aload_1         
	//   30   56:getfield        #43  <Field int defaultSelectionFlagScore>
	//   31   59:icmpne          97
	//   32   62:aload_0         
	//   33   63:getfield        #55  <Field int channelCount>
	//   34   66:aload_1         
	//   35   67:getfield        #55  <Field int channelCount>
	//   36   70:icmpne          97
	//   37   73:aload_0         
	//   38   74:getfield        #57  <Field int sampleRate>
	//   39   77:aload_1         
	//   40   78:getfield        #57  <Field int sampleRate>
	//   41   81:icmpne          97
	//   42   84:aload_0         
	//   43   85:getfield        #53  <Field int bitrate>
	//   44   88:aload_1         
	//   45   89:getfield        #53  <Field int bitrate>
	//   46   92:icmpne          97
	//   47   95:iconst_1        
	//   48   96:ireturn         
	//   49   97:iconst_0        
	//   50   98:ireturn         
		} else
		{
			return false;
	//   51   99:iconst_0        
	//   52  100:ireturn         
		}
	}

	public int hashCode()
	{
		return 31 * ((((withinRendererCapabilitiesScore * 31 + matchLanguageScore) * 31 + defaultSelectionFlagScore) * 31 + channelCount) * 31 + sampleRate) + bitrate;
	//    0    0:bipush          31
	//    1    2:aload_0         
	//    2    3:getfield        #35  <Field int withinRendererCapabilitiesScore>
	//    3    6:bipush          31
	//    4    8:imul            
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field int matchLanguageScore>
	//    7   13:iadd            
	//    8   14:bipush          31
	//    9   16:imul            
	//   10   17:aload_0         
	//   11   18:getfield        #43  <Field int defaultSelectionFlagScore>
	//   12   21:iadd            
	//   13   22:bipush          31
	//   14   24:imul            
	//   15   25:aload_0         
	//   16   26:getfield        #55  <Field int channelCount>
	//   17   29:iadd            
	//   18   30:bipush          31
	//   19   32:imul            
	//   20   33:aload_0         
	//   21   34:getfield        #57  <Field int sampleRate>
	//   22   37:iadd            
	//   23   38:imul            
	//   24   39:aload_0         
	//   25   40:getfield        #53  <Field int bitrate>
	//   26   43:iadd            
	//   27   44:ireturn         
	}

	private final int bitrate;
	private final int channelCount;
	private final int defaultSelectionFlagScore;
	private final int matchLanguageScore;
	private final DefaultTrackSelector.Parameters parameters;
	private final int sampleRate;
	private final int withinRendererCapabilitiesScore;

	public DefaultTrackSelector$AudioTrackScore(Format format, DefaultTrackSelector.Parameters parameters1, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #23  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #30  <Method void Runtime(String)>
	//    4    9:athrow          
	}
}
