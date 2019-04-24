// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.*;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			MappingTrackSelector, TrackSelection, FixedTrackSelection

public class DefaultTrackSelector extends MappingTrackSelector
{
	private static final class AudioConfigurationTuple
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
				obj = ((Object) ((AudioConfigurationTuple)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class DefaultTrackSelector$AudioConfigurationTuple>
		//   16   28:astore_1        
				return channelCount == ((AudioConfigurationTuple) (obj)).channelCount && sampleRate == ((AudioConfigurationTuple) (obj)).sampleRate && TextUtils.equals(((CharSequence) (mimeType)), ((CharSequence) (((AudioConfigurationTuple) (obj)).mimeType)));
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

		public AudioConfigurationTuple(int i, int j, String s)
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

	private static final class AudioTrackScore
		implements Comparable
	{

		public int compareTo(AudioTrackScore audiotrackscore)
		{
			if(withinRendererCapabilitiesScore != audiotrackscore.withinRendererCapabilitiesScore)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field int withinRendererCapabilitiesScore>
		//*   2    4:aload_1         
		//*   3    5:getfield        #35  <Field int withinRendererCapabilitiesScore>
		//*   4    8:icmpeq          23
				return DefaultTrackSelector.compareInts(withinRendererCapabilitiesScore, audiotrackscore.withinRendererCapabilitiesScore);
		//    5   11:aload_0         
		//    6   12:getfield        #35  <Field int withinRendererCapabilitiesScore>
		//    7   15:aload_1         
		//    8   16:getfield        #35  <Field int withinRendererCapabilitiesScore>
		//    9   19:invokestatic    #39  <Method int DefaultTrackSelector.access$300(int, int)>
		//   10   22:ireturn         
			if(matchLanguageScore != audiotrackscore.matchLanguageScore)
		//*  11   23:aload_0         
		//*  12   24:getfield        #41  <Field int matchLanguageScore>
		//*  13   27:aload_1         
		//*  14   28:getfield        #41  <Field int matchLanguageScore>
		//*  15   31:icmpeq          46
				return DefaultTrackSelector.compareInts(matchLanguageScore, audiotrackscore.matchLanguageScore);
		//   16   34:aload_0         
		//   17   35:getfield        #41  <Field int matchLanguageScore>
		//   18   38:aload_1         
		//   19   39:getfield        #41  <Field int matchLanguageScore>
		//   20   42:invokestatic    #39  <Method int DefaultTrackSelector.access$300(int, int)>
		//   21   45:ireturn         
			if(defaultSelectionFlagScore != audiotrackscore.defaultSelectionFlagScore)
		//*  22   46:aload_0         
		//*  23   47:getfield        #43  <Field int defaultSelectionFlagScore>
		//*  24   50:aload_1         
		//*  25   51:getfield        #43  <Field int defaultSelectionFlagScore>
		//*  26   54:icmpeq          69
				return DefaultTrackSelector.compareInts(defaultSelectionFlagScore, audiotrackscore.defaultSelectionFlagScore);
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
				return DefaultTrackSelector.compareInts(audiotrackscore.bitrate, bitrate);
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
			if(channelCount != audiotrackscore.channelCount)
		//*  54  108:aload_0         
		//*  55  109:getfield        #55  <Field int channelCount>
		//*  56  112:aload_1         
		//*  57  113:getfield        #55  <Field int channelCount>
		//*  58  116:icmpeq          133
				return byte0 * DefaultTrackSelector.compareInts(channelCount, audiotrackscore.channelCount);
		//   59  119:iload_2         
		//   60  120:aload_0         
		//   61  121:getfield        #55  <Field int channelCount>
		//   62  124:aload_1         
		//   63  125:getfield        #55  <Field int channelCount>
		//   64  128:invokestatic    #39  <Method int DefaultTrackSelector.access$300(int, int)>
		//   65  131:imul            
		//   66  132:ireturn         
			if(sampleRate != audiotrackscore.sampleRate)
		//*  67  133:aload_0         
		//*  68  134:getfield        #57  <Field int sampleRate>
		//*  69  137:aload_1         
		//*  70  138:getfield        #57  <Field int sampleRate>
		//*  71  141:icmpeq          158
				return byte0 * DefaultTrackSelector.compareInts(sampleRate, audiotrackscore.sampleRate);
		//   72  144:iload_2         
		//   73  145:aload_0         
		//   74  146:getfield        #57  <Field int sampleRate>
		//   75  149:aload_1         
		//   76  150:getfield        #57  <Field int sampleRate>
		//   77  153:invokestatic    #39  <Method int DefaultTrackSelector.access$300(int, int)>
		//   78  156:imul            
		//   79  157:ireturn         
			else
				return byte0 * DefaultTrackSelector.compareInts(bitrate, audiotrackscore.bitrate);
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
			return compareTo((AudioTrackScore)obj);
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
				obj = ((Object) ((AudioTrackScore)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class DefaultTrackSelector$AudioTrackScore>
		//   16   28:astore_1        
				return withinRendererCapabilitiesScore == ((AudioTrackScore) (obj)).withinRendererCapabilitiesScore && matchLanguageScore == ((AudioTrackScore) (obj)).matchLanguageScore && defaultSelectionFlagScore == ((AudioTrackScore) (obj)).defaultSelectionFlagScore && channelCount == ((AudioTrackScore) (obj)).channelCount && sampleRate == ((AudioTrackScore) (obj)).sampleRate && bitrate == ((AudioTrackScore) (obj)).bitrate;
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
		private final Parameters parameters;
		private final int sampleRate;
		private final int withinRendererCapabilitiesScore;

		public AudioTrackScore(Format format, Parameters parameters1, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #23  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #25  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #30  <Method void Runtime(String)>
		//    4    9:athrow          
		}
	}

	public static final class Parameters
		implements Parcelable
	{

		private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparsebooleanarray, SparseBooleanArray sparsebooleanarray1)
		{
			int j = sparsebooleanarray.size();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #140 <Method int SparseBooleanArray.size()>
		//    2    4:istore_3        
			if(sparsebooleanarray1.size() != j)
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #140 <Method int SparseBooleanArray.size()>
		//*   5    9:iload_3         
		//*   6   10:icmpeq          15
				return false;
		//    7   13:iconst_0        
		//    8   14:ireturn         
			for(int i = 0; i < j; i++)
		//*   9   15:iconst_0        
		//*  10   16:istore_2        
		//*  11   17:iload_2         
		//*  12   18:iload_3         
		//*  13   19:icmpge          43
				if(sparsebooleanarray1.indexOfKey(sparsebooleanarray.keyAt(i)) < 0)
		//*  14   22:aload_1         
		//*  15   23:aload_0         
		//*  16   24:iload_2         
		//*  17   25:invokevirtual   #144 <Method int SparseBooleanArray.keyAt(int)>
		//*  18   28:invokevirtual   #147 <Method int SparseBooleanArray.indexOfKey(int)>
		//*  19   31:ifge            36
					return false;
		//   20   34:iconst_0        
		//   21   35:ireturn         

		//   22   36:iload_2         
		//   23   37:iconst_1        
		//   24   38:iadd            
		//   25   39:istore_2        
		//*  26   40:goto            17
			return true;
		//   27   43:iconst_1        
		//   28   44:ireturn         
		}

		private static boolean areSelectionOverridesEqual(SparseArray sparsearray, SparseArray sparsearray1)
		{
			int j = sparsearray.size();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #150 <Method int SparseArray.size()>
		//    2    4:istore_3        
			if(sparsearray1.size() != j)
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #150 <Method int SparseArray.size()>
		//*   5    9:iload_3         
		//*   6   10:icmpeq          15
				return false;
		//    7   13:iconst_0        
		//    8   14:ireturn         
			for(int i = 0; i < j;)
		//*   9   15:iconst_0        
		//*  10   16:istore_2        
		//*  11   17:iload_2         
		//*  12   18:iload_3         
		//*  13   19:icmpge          72
			{
				int k = sparsearray1.indexOfKey(sparsearray.keyAt(i));
		//   14   22:aload_1         
		//   15   23:aload_0         
		//   16   24:iload_2         
		//   17   25:invokevirtual   #151 <Method int SparseArray.keyAt(int)>
		//   18   28:invokevirtual   #152 <Method int SparseArray.indexOfKey(int)>
		//   19   31:istore          4
				if(k >= 0)
		//*  20   33:iload           4
		//*  21   35:iflt            70
				{
					if(!areSelectionOverridesEqual((Map)sparsearray.valueAt(i), (Map)sparsearray1.valueAt(k)))
		//*  22   38:aload_0         
		//*  23   39:iload_2         
		//*  24   40:invokevirtual   #156 <Method Object SparseArray.valueAt(int)>
		//*  25   43:checkcast       #158 <Class Map>
		//*  26   46:aload_1         
		//*  27   47:iload           4
		//*  28   49:invokevirtual   #156 <Method Object SparseArray.valueAt(int)>
		//*  29   52:checkcast       #158 <Class Map>
		//*  30   55:invokestatic    #161 <Method boolean areSelectionOverridesEqual(Map, Map)>
		//*  31   58:ifne            63
						return false;
		//   32   61:iconst_0        
		//   33   62:ireturn         
					i++;
		//   34   63:iload_2         
		//   35   64:iconst_1        
		//   36   65:iadd            
		//   37   66:istore_2        
				} else
		//*  38   67:goto            17
				{
					return false;
		//   39   70:iconst_0        
		//   40   71:ireturn         
				}
			}

			return true;
		//   41   72:iconst_1        
		//   42   73:ireturn         
		}

		private static boolean areSelectionOverridesEqual(Map map, Map map1)
		{
			int i = map.size();
		//    0    0:aload_0         
		//    1    1:invokeinterface #163 <Method int Map.size()>
		//    2    6:istore_2        
			if(map1.size() != i)
		//*   3    7:aload_1         
		//*   4    8:invokeinterface #163 <Method int Map.size()>
		//*   5   13:iload_2         
		//*   6   14:icmpeq          19
				return false;
		//    7   17:iconst_0        
		//    8   18:ireturn         
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
		//*   9   19:aload_0         
		//*  10   20:invokeinterface #167 <Method Set Map.entrySet()>
		//*  11   25:invokeinterface #173 <Method Iterator Set.iterator()>
		//*  12   30:astore_0        
		//*  13   31:aload_0         
		//*  14   32:invokeinterface #179 <Method boolean Iterator.hasNext()>
		//*  15   37:ifeq            94
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
		//   16   40:aload_0         
		//   17   41:invokeinterface #183 <Method Object Iterator.next()>
		//   18   46:checkcast       #185 <Class java.util.Map$Entry>
		//   19   49:astore_3        
				TrackGroupArray trackgrouparray = (TrackGroupArray)entry.getKey();
		//   20   50:aload_3         
		//   21   51:invokeinterface #188 <Method Object java.util.Map$Entry.getKey()>
		//   22   56:checkcast       #190 <Class TrackGroupArray>
		//   23   59:astore          4
				if(!map1.containsKey(((Object) (trackgrouparray))) || !Util.areEqual(entry.getValue(), map1.get(((Object) (trackgrouparray)))))
		//*  24   61:aload_1         
		//*  25   62:aload           4
		//*  26   64:invokeinterface #194 <Method boolean Map.containsKey(Object)>
		//*  27   69:ifeq            92
		//*  28   72:aload_3         
		//*  29   73:invokeinterface #197 <Method Object java.util.Map$Entry.getValue()>
		//*  30   78:aload_1         
		//*  31   79:aload           4
		//*  32   81:invokeinterface #201 <Method Object Map.get(Object)>
		//*  33   86:invokestatic    #205 <Method boolean Util.areEqual(Object, Object)>
		//*  34   89:ifne            31
					return false;
		//   35   92:iconst_0        
		//   36   93:ireturn         
			}

			return true;
		//   37   94:iconst_1        
		//   38   95:ireturn         
		}

		private static SparseArray readSelectionOverrides(Parcel parcel)
		{
			int k = parcel.readInt();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #98  <Method int Parcel.readInt()>
		//    2    4:istore_3        
			SparseArray sparsearray = new SparseArray(k);
		//    3    5:new             #54  <Class SparseArray>
		//    4    8:dup             
		//    5    9:iload_3         
		//    6   10:invokespecial   #209 <Method void SparseArray(int)>
		//    7   13:astore          6
			for(int i = 0; i < k; i++)
		//*   8   15:iconst_0        
		//*   9   16:istore_1        
		//*  10   17:iload_1         
		//*  11   18:iload_3         
		//*  12   19:icmpge          108
			{
				int l = parcel.readInt();
		//   13   22:aload_0         
		//   14   23:invokevirtual   #98  <Method int Parcel.readInt()>
		//   15   26:istore          4
				int i1 = parcel.readInt();
		//   16   28:aload_0         
		//   17   29:invokevirtual   #98  <Method int Parcel.readInt()>
		//   18   32:istore          5
				HashMap hashmap = new HashMap(i1);
		//   19   34:new             #211 <Class HashMap>
		//   20   37:dup             
		//   21   38:iload           5
		//   22   40:invokespecial   #212 <Method void HashMap(int)>
		//   23   43:astore          7
				for(int j = 0; j < i1; j++)
		//*  24   45:iconst_0        
		//*  25   46:istore_2        
		//*  26   47:iload_2         
		//*  27   48:iload           5
		//*  28   50:icmpge          92
					((Map) (hashmap)).put(((Object) ((TrackGroupArray)parcel.readParcelable(((Class) (com/google/android/exoplayer2/source/TrackGroupArray)).getClassLoader()))), ((Object) ((SelectionOverride)parcel.readParcelable(((Class) (com/google/android/exoplayer2/trackselection/DefaultTrackSelector$SelectionOverride)).getClassLoader()))));
		//   29   53:aload           7
		//   30   55:aload_0         
		//   31   56:ldc1            #190 <Class TrackGroupArray>
		//   32   58:invokevirtual   #218 <Method ClassLoader Class.getClassLoader()>
		//   33   61:invokevirtual   #222 <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   34   64:checkcast       #190 <Class TrackGroupArray>
		//   35   67:aload_0         
		//   36   68:ldc1            #224 <Class DefaultTrackSelector$SelectionOverride>
		//   37   70:invokevirtual   #218 <Method ClassLoader Class.getClassLoader()>
		//   38   73:invokevirtual   #222 <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   39   76:checkcast       #224 <Class DefaultTrackSelector$SelectionOverride>
		//   40   79:invokeinterface #228 <Method Object Map.put(Object, Object)>
		//   41   84:pop             

		//   42   85:iload_2         
		//   43   86:iconst_1        
		//   44   87:iadd            
		//   45   88:istore_2        
		//*  46   89:goto            47
				sparsearray.put(l, ((Object) (hashmap)));
		//   47   92:aload           6
		//   48   94:iload           4
		//   49   96:aload           7
		//   50   98:invokevirtual   #231 <Method void SparseArray.put(int, Object)>
			}

		//   51  101:iload_1         
		//   52  102:iconst_1        
		//   53  103:iadd            
		//   54  104:istore_1        
		//*  55  105:goto            17
			return sparsearray;
		//   56  108:aload           6
		//   57  110:areturn         
		}

		private static void writeSelectionOverridesToParcel(Parcel parcel, SparseArray sparsearray)
		{
			int j = sparsearray.size();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #150 <Method int SparseArray.size()>
		//    2    4:istore_3        
			parcel.writeInt(j);
		//    3    5:aload_0         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #237 <Method void Parcel.writeInt(int)>
			for(int i = 0; i < j; i++)
		//*   6   10:iconst_0        
		//*   7   11:istore_2        
		//*   8   12:iload_2         
		//*   9   13:iload_3         
		//*  10   14:icmpge          131
			{
				int k = sparsearray.keyAt(i);
		//   11   17:aload_1         
		//   12   18:iload_2         
		//   13   19:invokevirtual   #151 <Method int SparseArray.keyAt(int)>
		//   14   22:istore          4
				Object obj = ((Object) ((Map)sparsearray.valueAt(i)));
		//   15   24:aload_1         
		//   16   25:iload_2         
		//   17   26:invokevirtual   #156 <Method Object SparseArray.valueAt(int)>
		//   18   29:checkcast       #158 <Class Map>
		//   19   32:astore          6
				int l = ((Map) (obj)).size();
		//   20   34:aload           6
		//   21   36:invokeinterface #163 <Method int Map.size()>
		//   22   41:istore          5
				parcel.writeInt(k);
		//   23   43:aload_0         
		//   24   44:iload           4
		//   25   46:invokevirtual   #237 <Method void Parcel.writeInt(int)>
				parcel.writeInt(l);
		//   26   49:aload_0         
		//   27   50:iload           5
		//   28   52:invokevirtual   #237 <Method void Parcel.writeInt(int)>
				java.util.Map.Entry entry;
				for(obj = ((Object) (((Map) (obj)).entrySet().iterator())); ((Iterator) (obj)).hasNext(); parcel.writeParcelable((Parcelable)entry.getValue(), 0))
		//*  29   55:aload           6
		//*  30   57:invokeinterface #167 <Method Set Map.entrySet()>
		//*  31   62:invokeinterface #173 <Method Iterator Set.iterator()>
		//*  32   67:astore          6
		//*  33   69:aload           6
		//*  34   71:invokeinterface #179 <Method boolean Iterator.hasNext()>
		//*  35   76:ifeq            124
				{
					entry = (java.util.Map.Entry)((Iterator) (obj)).next();
		//   36   79:aload           6
		//   37   81:invokeinterface #183 <Method Object Iterator.next()>
		//   38   86:checkcast       #185 <Class java.util.Map$Entry>
		//   39   89:astore          7
					parcel.writeParcelable((Parcelable)entry.getKey(), 0);
		//   40   91:aload_0         
		//   41   92:aload           7
		//   42   94:invokeinterface #188 <Method Object java.util.Map$Entry.getKey()>
		//   43   99:checkcast       #6   <Class Parcelable>
		//   44  102:iconst_0        
		//   45  103:invokevirtual   #241 <Method void Parcel.writeParcelable(Parcelable, int)>
				}

		//   46  106:aload_0         
		//   47  107:aload           7
		//   48  109:invokeinterface #197 <Method Object java.util.Map$Entry.getValue()>
		//   49  114:checkcast       #6   <Class Parcelable>
		//   50  117:iconst_0        
		//   51  118:invokevirtual   #241 <Method void Parcel.writeParcelable(Parcelable, int)>
			}

		//   52  121:goto            69
		//   53  124:iload_2         
		//   54  125:iconst_1        
		//   55  126:iadd            
		//   56  127:istore_2        
		//*  57  128:goto            12
		//   58  131:return          
		}

		public ParametersBuilder buildUpon()
		{
			return new ParametersBuilder(this);
		//    0    0:new             #246 <Class DefaultTrackSelector$ParametersBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #249 <Method void DefaultTrackSelector$ParametersBuilder(DefaultTrackSelector$Parameters, DefaultTrackSelector$1)>
		//    5    9:areturn         
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
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
		//*   6    8:ifnull          243
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #255 <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #255 <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((Parameters)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class DefaultTrackSelector$Parameters>
		//   16   28:astore_1        
				return selectUndeterminedTextLanguage == ((Parameters) (obj)).selectUndeterminedTextLanguage && disabledTextTrackSelectionFlags == ((Parameters) (obj)).disabledTextTrackSelectionFlags && forceLowestBitrate == ((Parameters) (obj)).forceLowestBitrate && allowMixedMimeAdaptiveness == ((Parameters) (obj)).allowMixedMimeAdaptiveness && allowNonSeamlessAdaptiveness == ((Parameters) (obj)).allowNonSeamlessAdaptiveness && maxVideoWidth == ((Parameters) (obj)).maxVideoWidth && maxVideoHeight == ((Parameters) (obj)).maxVideoHeight && exceedVideoConstraintsIfNecessary == ((Parameters) (obj)).exceedVideoConstraintsIfNecessary && exceedRendererCapabilitiesIfNecessary == ((Parameters) (obj)).exceedRendererCapabilitiesIfNecessary && viewportOrientationMayChange == ((Parameters) (obj)).viewportOrientationMayChange && viewportWidth == ((Parameters) (obj)).viewportWidth && viewportHeight == ((Parameters) (obj)).viewportHeight && maxVideoBitrate == ((Parameters) (obj)).maxVideoBitrate && tunnelingAudioSessionId == ((Parameters) (obj)).tunnelingAudioSessionId && TextUtils.equals(((CharSequence) (preferredAudioLanguage)), ((CharSequence) (((Parameters) (obj)).preferredAudioLanguage))) && TextUtils.equals(((CharSequence) (preferredTextLanguage)), ((CharSequence) (((Parameters) (obj)).preferredTextLanguage))) && areRendererDisabledFlagsEqual(rendererDisabledFlags, ((Parameters) (obj)).rendererDisabledFlags) && areSelectionOverridesEqual(selectionOverrides, ((Parameters) (obj)).selectionOverrides);
		//   17   29:aload_0         
		//   18   30:getfield        #94  <Field boolean selectUndeterminedTextLanguage>
		//   19   33:aload_1         
		//   20   34:getfield        #94  <Field boolean selectUndeterminedTextLanguage>
		//   21   37:icmpne          241
		//   22   40:aload_0         
		//   23   41:getfield        #100 <Field int disabledTextTrackSelectionFlags>
		//   24   44:aload_1         
		//   25   45:getfield        #100 <Field int disabledTextTrackSelectionFlags>
		//   26   48:icmpne          241
		//   27   51:aload_0         
		//   28   52:getfield        #102 <Field boolean forceLowestBitrate>
		//   29   55:aload_1         
		//   30   56:getfield        #102 <Field boolean forceLowestBitrate>
		//   31   59:icmpne          241
		//   32   62:aload_0         
		//   33   63:getfield        #104 <Field boolean allowMixedMimeAdaptiveness>
		//   34   66:aload_1         
		//   35   67:getfield        #104 <Field boolean allowMixedMimeAdaptiveness>
		//   36   70:icmpne          241
		//   37   73:aload_0         
		//   38   74:getfield        #106 <Field boolean allowNonSeamlessAdaptiveness>
		//   39   77:aload_1         
		//   40   78:getfield        #106 <Field boolean allowNonSeamlessAdaptiveness>
		//   41   81:icmpne          241
		//   42   84:aload_0         
		//   43   85:getfield        #108 <Field int maxVideoWidth>
		//   44   88:aload_1         
		//   45   89:getfield        #108 <Field int maxVideoWidth>
		//   46   92:icmpne          241
		//   47   95:aload_0         
		//   48   96:getfield        #110 <Field int maxVideoHeight>
		//   49   99:aload_1         
		//   50  100:getfield        #110 <Field int maxVideoHeight>
		//   51  103:icmpne          241
		//   52  106:aload_0         
		//   53  107:getfield        #114 <Field boolean exceedVideoConstraintsIfNecessary>
		//   54  110:aload_1         
		//   55  111:getfield        #114 <Field boolean exceedVideoConstraintsIfNecessary>
		//   56  114:icmpne          241
		//   57  117:aload_0         
		//   58  118:getfield        #116 <Field boolean exceedRendererCapabilitiesIfNecessary>
		//   59  121:aload_1         
		//   60  122:getfield        #116 <Field boolean exceedRendererCapabilitiesIfNecessary>
		//   61  125:icmpne          241
		//   62  128:aload_0         
		//   63  129:getfield        #122 <Field boolean viewportOrientationMayChange>
		//   64  132:aload_1         
		//   65  133:getfield        #122 <Field boolean viewportOrientationMayChange>
		//   66  136:icmpne          241
		//   67  139:aload_0         
		//   68  140:getfield        #118 <Field int viewportWidth>
		//   69  143:aload_1         
		//   70  144:getfield        #118 <Field int viewportWidth>
		//   71  147:icmpne          241
		//   72  150:aload_0         
		//   73  151:getfield        #120 <Field int viewportHeight>
		//   74  154:aload_1         
		//   75  155:getfield        #120 <Field int viewportHeight>
		//   76  158:icmpne          241
		//   77  161:aload_0         
		//   78  162:getfield        #112 <Field int maxVideoBitrate>
		//   79  165:aload_1         
		//   80  166:getfield        #112 <Field int maxVideoBitrate>
		//   81  169:icmpne          241
		//   82  172:aload_0         
		//   83  173:getfield        #124 <Field int tunnelingAudioSessionId>
		//   84  176:aload_1         
		//   85  177:getfield        #124 <Field int tunnelingAudioSessionId>
		//   86  180:icmpne          241
		//   87  183:aload_0         
		//   88  184:getfield        #84  <Field String preferredAudioLanguage>
		//   89  187:aload_1         
		//   90  188:getfield        #84  <Field String preferredAudioLanguage>
		//   91  191:invokestatic    #260 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
		//   92  194:ifeq            241
		//   93  197:aload_0         
		//   94  198:getfield        #86  <Field String preferredTextLanguage>
		//   95  201:aload_1         
		//   96  202:getfield        #86  <Field String preferredTextLanguage>
		//   97  205:invokestatic    #260 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
		//   98  208:ifeq            241
		//   99  211:aload_0         
		//  100  212:getfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
		//  101  215:aload_1         
		//  102  216:getfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
		//  103  219:invokestatic    #262 <Method boolean areRendererDisabledFlagsEqual(SparseBooleanArray, SparseBooleanArray)>
		//  104  222:ifeq            241
		//  105  225:aload_0         
		//  106  226:getfield        #70  <Field SparseArray selectionOverrides>
		//  107  229:aload_1         
		//  108  230:getfield        #70  <Field SparseArray selectionOverrides>
		//  109  233:invokestatic    #264 <Method boolean areSelectionOverridesEqual(SparseArray, SparseArray)>
		//  110  236:ifeq            241
		//  111  239:iconst_1        
		//  112  240:ireturn         
		//  113  241:iconst_0        
		//  114  242:ireturn         
			} else
			{
				return false;
		//  115  243:iconst_0        
		//  116  244:ireturn         
			}
		}

		public final boolean getRendererDisabled(int i)
		{
			return rendererDisabledFlags.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #268 <Method boolean SparseBooleanArray.get(int)>
		//    4    8:ireturn         
		}

		public final SelectionOverride getSelectionOverride(int i, TrackGroupArray trackgrouparray)
		{
			Map map = (Map)selectionOverrides.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field SparseArray selectionOverrides>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #272 <Method Object SparseArray.get(int)>
		//    4    8:checkcast       #158 <Class Map>
		//    5   11:astore_3        
			if(map != null)
		//*   6   12:aload_3         
		//*   7   13:ifnull          27
				return (SelectionOverride)map.get(((Object) (trackgrouparray)));
		//    8   16:aload_3         
		//    9   17:aload_2         
		//   10   18:invokeinterface #201 <Method Object Map.get(Object)>
		//   11   23:checkcast       #224 <Class DefaultTrackSelector$SelectionOverride>
		//   12   26:areturn         
			else
				return null;
		//   13   27:aconst_null     
		//   14   28:areturn         
		}

		public final boolean hasSelectionOverride(int i, TrackGroupArray trackgrouparray)
		{
			Map map = (Map)selectionOverrides.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field SparseArray selectionOverrides>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #272 <Method Object SparseArray.get(int)>
		//    4    8:checkcast       #158 <Class Map>
		//    5   11:astore_3        
			return map != null && map.containsKey(((Object) (trackgrouparray)));
		//    6   12:aload_3         
		//    7   13:ifnull          28
		//    8   16:aload_3         
		//    9   17:aload_2         
		//   10   18:invokeinterface #194 <Method boolean Map.containsKey(Object)>
		//   11   23:ifeq            28
		//   12   26:iconst_1        
		//   13   27:ireturn         
		//   14   28:iconst_0        
		//   15   29:ireturn         
		}

		public int hashCode()
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #278 <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc2            #280 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    7:invokespecial   #285 <Method void Runtime(String)>
		//    4   10:athrow          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			writeSelectionOverridesToParcel(parcel, selectionOverrides);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #70  <Field SparseArray selectionOverrides>
		//    3    5:invokestatic    #289 <Method void writeSelectionOverridesToParcel(Parcel, SparseArray)>
			parcel.writeSparseBooleanArray(rendererDisabledFlags);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
		//    7   13:invokevirtual   #293 <Method void Parcel.writeSparseBooleanArray(SparseBooleanArray)>
			parcel.writeString(preferredAudioLanguage);
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #84  <Field String preferredAudioLanguage>
		//   11   21:invokevirtual   #296 <Method void Parcel.writeString(String)>
			parcel.writeString(preferredTextLanguage);
		//   12   24:aload_1         
		//   13   25:aload_0         
		//   14   26:getfield        #86  <Field String preferredTextLanguage>
		//   15   29:invokevirtual   #296 <Method void Parcel.writeString(String)>
			Util.writeBoolean(parcel, selectUndeterminedTextLanguage);
		//   16   32:aload_1         
		//   17   33:aload_0         
		//   18   34:getfield        #94  <Field boolean selectUndeterminedTextLanguage>
		//   19   37:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
			parcel.writeInt(disabledTextTrackSelectionFlags);
		//   20   40:aload_1         
		//   21   41:aload_0         
		//   22   42:getfield        #100 <Field int disabledTextTrackSelectionFlags>
		//   23   45:invokevirtual   #237 <Method void Parcel.writeInt(int)>
			Util.writeBoolean(parcel, forceLowestBitrate);
		//   24   48:aload_1         
		//   25   49:aload_0         
		//   26   50:getfield        #102 <Field boolean forceLowestBitrate>
		//   27   53:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
			Util.writeBoolean(parcel, allowMixedMimeAdaptiveness);
		//   28   56:aload_1         
		//   29   57:aload_0         
		//   30   58:getfield        #104 <Field boolean allowMixedMimeAdaptiveness>
		//   31   61:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
			Util.writeBoolean(parcel, allowNonSeamlessAdaptiveness);
		//   32   64:aload_1         
		//   33   65:aload_0         
		//   34   66:getfield        #106 <Field boolean allowNonSeamlessAdaptiveness>
		//   35   69:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
			parcel.writeInt(maxVideoWidth);
		//   36   72:aload_1         
		//   37   73:aload_0         
		//   38   74:getfield        #108 <Field int maxVideoWidth>
		//   39   77:invokevirtual   #237 <Method void Parcel.writeInt(int)>
			parcel.writeInt(maxVideoHeight);
		//   40   80:aload_1         
		//   41   81:aload_0         
		//   42   82:getfield        #110 <Field int maxVideoHeight>
		//   43   85:invokevirtual   #237 <Method void Parcel.writeInt(int)>
			parcel.writeInt(maxVideoBitrate);
		//   44   88:aload_1         
		//   45   89:aload_0         
		//   46   90:getfield        #112 <Field int maxVideoBitrate>
		//   47   93:invokevirtual   #237 <Method void Parcel.writeInt(int)>
			Util.writeBoolean(parcel, exceedVideoConstraintsIfNecessary);
		//   48   96:aload_1         
		//   49   97:aload_0         
		//   50   98:getfield        #114 <Field boolean exceedVideoConstraintsIfNecessary>
		//   51  101:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
			Util.writeBoolean(parcel, exceedRendererCapabilitiesIfNecessary);
		//   52  104:aload_1         
		//   53  105:aload_0         
		//   54  106:getfield        #116 <Field boolean exceedRendererCapabilitiesIfNecessary>
		//   55  109:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
			parcel.writeInt(viewportWidth);
		//   56  112:aload_1         
		//   57  113:aload_0         
		//   58  114:getfield        #118 <Field int viewportWidth>
		//   59  117:invokevirtual   #237 <Method void Parcel.writeInt(int)>
			parcel.writeInt(viewportHeight);
		//   60  120:aload_1         
		//   61  121:aload_0         
		//   62  122:getfield        #120 <Field int viewportHeight>
		//   63  125:invokevirtual   #237 <Method void Parcel.writeInt(int)>
			Util.writeBoolean(parcel, viewportOrientationMayChange);
		//   64  128:aload_1         
		//   65  129:aload_0         
		//   66  130:getfield        #122 <Field boolean viewportOrientationMayChange>
		//   67  133:invokestatic    #300 <Method void Util.writeBoolean(Parcel, boolean)>
			parcel.writeInt(tunnelingAudioSessionId);
		//   68  136:aload_1         
		//   69  137:aload_0         
		//   70  138:getfield        #124 <Field int tunnelingAudioSessionId>
		//   71  141:invokevirtual   #237 <Method void Parcel.writeInt(int)>
		//   72  144:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public Parameters createFromParcel(Parcel parcel)
			{
				return new Parameters(parcel);
			//    0    0:new             #9   <Class DefaultTrackSelector$Parameters>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void DefaultTrackSelector$Parameters(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method DefaultTrackSelector$Parameters createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public Parameters[] newArray(int i)
			{
				return new Parameters[i];
			//    0    0:iload_1         
			//    1    1:anewarray       Parameters[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method DefaultTrackSelector$Parameters[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		public static final Parameters DEFAULT = new Parameters();
		public final boolean allowMixedMimeAdaptiveness;
		public final boolean allowNonSeamlessAdaptiveness;
		public final int disabledTextTrackSelectionFlags;
		public final boolean exceedRendererCapabilitiesIfNecessary;
		public final boolean exceedVideoConstraintsIfNecessary;
		public final boolean forceLowestBitrate;
		public final int maxVideoBitrate;
		public final int maxVideoHeight;
		public final int maxVideoWidth;
		public final String preferredAudioLanguage;
		public final String preferredTextLanguage;
		private final SparseBooleanArray rendererDisabledFlags;
		public final boolean selectUndeterminedTextLanguage;
		private final SparseArray selectionOverrides;
		public final int tunnelingAudioSessionId;
		public final int viewportHeight;
		public final boolean viewportOrientationMayChange;
		public final int viewportWidth;

		static 
		{
		//    0    0:new             #2   <Class DefaultTrackSelector$Parameters>
		//    1    3:dup             
		//    2    4:invokespecial   #46  <Method void DefaultTrackSelector$Parameters()>
		//    3    7:putstatic       #48  <Field DefaultTrackSelector$Parameters DEFAULT>
		//    4   10:new             #11  <Class DefaultTrackSelector$Parameters$1>
		//    5   13:dup             
		//    6   14:invokespecial   #49  <Method void DefaultTrackSelector$Parameters$1()>
		//    7   17:putstatic       #51  <Field android.os.Parcelable$Creator CREATOR>
		//*   8   20:return          
		}


/*
		static SparseArray access$000(Parameters parameters)
		{
			return parameters.selectionOverrides;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field SparseArray selectionOverrides>
		//    2    4:areturn         
		}

*/


/*
		static SparseBooleanArray access$100(Parameters parameters)
		{
			return parameters.rendererDisabledFlags;
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
		//    2    4:areturn         
		}

*/

		private Parameters()
		{
			this(new SparseArray(), new SparseBooleanArray(), ((String) (null)), ((String) (null)), false, 0, false, false, true, 0x7fffffff, 0x7fffffff, 0x7fffffff, true, true, 0x7fffffff, 0x7fffffff, true, 0);
		//    0    0:aload_0         
		//    1    1:new             #54  <Class SparseArray>
		//    2    4:dup             
		//    3    5:invokespecial   #55  <Method void SparseArray()>
		//    4    8:new             #57  <Class SparseBooleanArray>
		//    5   11:dup             
		//    6   12:invokespecial   #58  <Method void SparseBooleanArray()>
		//    7   15:aconst_null     
		//    8   16:aconst_null     
		//    9   17:iconst_0        
		//   10   18:iconst_0        
		//   11   19:iconst_0        
		//   12   20:iconst_0        
		//   13   21:iconst_1        
		//   14   22:ldc1            #59  <Int 0x7fffffff>
		//   15   24:ldc1            #59  <Int 0x7fffffff>
		//   16   26:ldc1            #59  <Int 0x7fffffff>
		//   17   28:iconst_1        
		//   18   29:iconst_1        
		//   19   30:ldc1            #59  <Int 0x7fffffff>
		//   20   32:ldc1            #59  <Int 0x7fffffff>
		//   21   34:iconst_1        
		//   22   35:iconst_0        
		//   23   36:invokespecial   #62  <Method void DefaultTrackSelector$Parameters(SparseArray, SparseBooleanArray, String, String, boolean, int, boolean, boolean, boolean, int, int, int, boolean, boolean, int, int, boolean, int)>
		//   24   39:return          
		}

		Parameters(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #64  <Method void Object()>
			selectionOverrides = readSelectionOverrides(parcel);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #68  <Method SparseArray readSelectionOverrides(Parcel)>
		//    5    9:putfield        #70  <Field SparseArray selectionOverrides>
			rendererDisabledFlags = parcel.readSparseBooleanArray();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #76  <Method SparseBooleanArray Parcel.readSparseBooleanArray()>
		//    9   17:putfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
			preferredAudioLanguage = parcel.readString();
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokevirtual   #82  <Method String Parcel.readString()>
		//   13   25:putfield        #84  <Field String preferredAudioLanguage>
			preferredTextLanguage = parcel.readString();
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokevirtual   #82  <Method String Parcel.readString()>
		//   17   33:putfield        #86  <Field String preferredTextLanguage>
			selectUndeterminedTextLanguage = Util.readBoolean(parcel);
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
		//   21   41:putfield        #94  <Field boolean selectUndeterminedTextLanguage>
			disabledTextTrackSelectionFlags = parcel.readInt();
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:invokevirtual   #98  <Method int Parcel.readInt()>
		//   25   49:putfield        #100 <Field int disabledTextTrackSelectionFlags>
			forceLowestBitrate = Util.readBoolean(parcel);
		//   26   52:aload_0         
		//   27   53:aload_1         
		//   28   54:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
		//   29   57:putfield        #102 <Field boolean forceLowestBitrate>
			allowMixedMimeAdaptiveness = Util.readBoolean(parcel);
		//   30   60:aload_0         
		//   31   61:aload_1         
		//   32   62:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
		//   33   65:putfield        #104 <Field boolean allowMixedMimeAdaptiveness>
			allowNonSeamlessAdaptiveness = Util.readBoolean(parcel);
		//   34   68:aload_0         
		//   35   69:aload_1         
		//   36   70:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
		//   37   73:putfield        #106 <Field boolean allowNonSeamlessAdaptiveness>
			maxVideoWidth = parcel.readInt();
		//   38   76:aload_0         
		//   39   77:aload_1         
		//   40   78:invokevirtual   #98  <Method int Parcel.readInt()>
		//   41   81:putfield        #108 <Field int maxVideoWidth>
			maxVideoHeight = parcel.readInt();
		//   42   84:aload_0         
		//   43   85:aload_1         
		//   44   86:invokevirtual   #98  <Method int Parcel.readInt()>
		//   45   89:putfield        #110 <Field int maxVideoHeight>
			maxVideoBitrate = parcel.readInt();
		//   46   92:aload_0         
		//   47   93:aload_1         
		//   48   94:invokevirtual   #98  <Method int Parcel.readInt()>
		//   49   97:putfield        #112 <Field int maxVideoBitrate>
			exceedVideoConstraintsIfNecessary = Util.readBoolean(parcel);
		//   50  100:aload_0         
		//   51  101:aload_1         
		//   52  102:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
		//   53  105:putfield        #114 <Field boolean exceedVideoConstraintsIfNecessary>
			exceedRendererCapabilitiesIfNecessary = Util.readBoolean(parcel);
		//   54  108:aload_0         
		//   55  109:aload_1         
		//   56  110:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
		//   57  113:putfield        #116 <Field boolean exceedRendererCapabilitiesIfNecessary>
			viewportWidth = parcel.readInt();
		//   58  116:aload_0         
		//   59  117:aload_1         
		//   60  118:invokevirtual   #98  <Method int Parcel.readInt()>
		//   61  121:putfield        #118 <Field int viewportWidth>
			viewportHeight = parcel.readInt();
		//   62  124:aload_0         
		//   63  125:aload_1         
		//   64  126:invokevirtual   #98  <Method int Parcel.readInt()>
		//   65  129:putfield        #120 <Field int viewportHeight>
			viewportOrientationMayChange = Util.readBoolean(parcel);
		//   66  132:aload_0         
		//   67  133:aload_1         
		//   68  134:invokestatic    #92  <Method boolean Util.readBoolean(Parcel)>
		//   69  137:putfield        #122 <Field boolean viewportOrientationMayChange>
			tunnelingAudioSessionId = parcel.readInt();
		//   70  140:aload_0         
		//   71  141:aload_1         
		//   72  142:invokevirtual   #98  <Method int Parcel.readInt()>
		//   73  145:putfield        #124 <Field int tunnelingAudioSessionId>
		//   74  148:return          
		}

		Parameters(SparseArray sparsearray, SparseBooleanArray sparsebooleanarray, String s, String s1, boolean flag, int i, boolean flag1, 
				boolean flag2, boolean flag3, int j, int k, int l, boolean flag4, boolean flag5, 
				int i1, int j1, boolean flag6, int k1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #64  <Method void Object()>
			selectionOverrides = sparsearray;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #70  <Field SparseArray selectionOverrides>
			rendererDisabledFlags = sparsebooleanarray;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #78  <Field SparseBooleanArray rendererDisabledFlags>
			preferredAudioLanguage = Util.normalizeLanguageCode(s);
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:invokestatic    #128 <Method String Util.normalizeLanguageCode(String)>
		//   11   19:putfield        #84  <Field String preferredAudioLanguage>
			preferredTextLanguage = Util.normalizeLanguageCode(s1);
		//   12   22:aload_0         
		//   13   23:aload           4
		//   14   25:invokestatic    #128 <Method String Util.normalizeLanguageCode(String)>
		//   15   28:putfield        #86  <Field String preferredTextLanguage>
			selectUndeterminedTextLanguage = flag;
		//   16   31:aload_0         
		//   17   32:iload           5
		//   18   34:putfield        #94  <Field boolean selectUndeterminedTextLanguage>
			disabledTextTrackSelectionFlags = i;
		//   19   37:aload_0         
		//   20   38:iload           6
		//   21   40:putfield        #100 <Field int disabledTextTrackSelectionFlags>
			forceLowestBitrate = flag1;
		//   22   43:aload_0         
		//   23   44:iload           7
		//   24   46:putfield        #102 <Field boolean forceLowestBitrate>
			allowMixedMimeAdaptiveness = flag2;
		//   25   49:aload_0         
		//   26   50:iload           8
		//   27   52:putfield        #104 <Field boolean allowMixedMimeAdaptiveness>
			allowNonSeamlessAdaptiveness = flag3;
		//   28   55:aload_0         
		//   29   56:iload           9
		//   30   58:putfield        #106 <Field boolean allowNonSeamlessAdaptiveness>
			maxVideoWidth = j;
		//   31   61:aload_0         
		//   32   62:iload           10
		//   33   64:putfield        #108 <Field int maxVideoWidth>
			maxVideoHeight = k;
		//   34   67:aload_0         
		//   35   68:iload           11
		//   36   70:putfield        #110 <Field int maxVideoHeight>
			maxVideoBitrate = l;
		//   37   73:aload_0         
		//   38   74:iload           12
		//   39   76:putfield        #112 <Field int maxVideoBitrate>
			exceedVideoConstraintsIfNecessary = flag4;
		//   40   79:aload_0         
		//   41   80:iload           13
		//   42   82:putfield        #114 <Field boolean exceedVideoConstraintsIfNecessary>
			exceedRendererCapabilitiesIfNecessary = flag5;
		//   43   85:aload_0         
		//   44   86:iload           14
		//   45   88:putfield        #116 <Field boolean exceedRendererCapabilitiesIfNecessary>
			viewportWidth = i1;
		//   46   91:aload_0         
		//   47   92:iload           15
		//   48   94:putfield        #118 <Field int viewportWidth>
			viewportHeight = j1;
		//   49   97:aload_0         
		//   50   98:iload           16
		//   51  100:putfield        #120 <Field int viewportHeight>
			viewportOrientationMayChange = flag6;
		//   52  103:aload_0         
		//   53  104:iload           17
		//   54  106:putfield        #122 <Field boolean viewportOrientationMayChange>
			tunnelingAudioSessionId = k1;
		//   55  109:aload_0         
		//   56  110:iload           18
		//   57  112:putfield        #124 <Field int tunnelingAudioSessionId>
		//   58  115:return          
		}
	}

	public static final class ParametersBuilder
	{

		private static SparseArray cloneSelectionOverrides(SparseArray sparsearray)
		{
			SparseArray sparsearray1 = new SparseArray();
		//    0    0:new             #119 <Class SparseArray>
		//    1    3:dup             
		//    2    4:invokespecial   #120 <Method void SparseArray()>
		//    3    7:astore_2        
			for(int i = 0; i < sparsearray.size(); i++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #124 <Method int SparseArray.size()>
		//*   9   15:icmpge          49
				sparsearray1.put(sparsearray.keyAt(i), ((Object) (new HashMap((Map)sparsearray.valueAt(i)))));
		//   10   18:aload_2         
		//   11   19:aload_0         
		//   12   20:iload_1         
		//   13   21:invokevirtual   #128 <Method int SparseArray.keyAt(int)>
		//   14   24:new             #130 <Class HashMap>
		//   15   27:dup             
		//   16   28:aload_0         
		//   17   29:iload_1         
		//   18   30:invokevirtual   #134 <Method Object SparseArray.valueAt(int)>
		//   19   33:checkcast       #136 <Class Map>
		//   20   36:invokespecial   #139 <Method void HashMap(Map)>
		//   21   39:invokevirtual   #143 <Method void SparseArray.put(int, Object)>

		//   22   42:iload_1         
		//   23   43:iconst_1        
		//   24   44:iadd            
		//   25   45:istore_1        
		//*  26   46:goto            10
			return sparsearray1;
		//   27   49:aload_2         
		//   28   50:areturn         
		}

		public Parameters build()
		{
			return new Parameters(selectionOverrides, rendererDisabledFlags, preferredAudioLanguage, preferredTextLanguage, selectUndeterminedTextLanguage, disabledTextTrackSelectionFlags, forceLowestBitrate, allowMixedMimeAdaptiveness, allowNonSeamlessAdaptiveness, maxVideoWidth, maxVideoHeight, maxVideoBitrate, exceedVideoConstraintsIfNecessary, exceedRendererCapabilitiesIfNecessary, viewportWidth, viewportHeight, viewportOrientationMayChange, tunnelingAudioSessionId);
		//    0    0:new             #36  <Class DefaultTrackSelector$Parameters>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #56  <Field SparseArray selectionOverrides>
		//    4    8:aload_0         
		//    5    9:getfield        #68  <Field SparseBooleanArray rendererDisabledFlags>
		//    6   12:aload_0         
		//    7   13:getfield        #71  <Field String preferredAudioLanguage>
		//    8   16:aload_0         
		//    9   17:getfield        #74  <Field String preferredTextLanguage>
		//   10   20:aload_0         
		//   11   21:getfield        #77  <Field boolean selectUndeterminedTextLanguage>
		//   12   24:aload_0         
		//   13   25:getfield        #80  <Field int disabledTextTrackSelectionFlags>
		//   14   28:aload_0         
		//   15   29:getfield        #83  <Field boolean forceLowestBitrate>
		//   16   32:aload_0         
		//   17   33:getfield        #86  <Field boolean allowMixedMimeAdaptiveness>
		//   18   36:aload_0         
		//   19   37:getfield        #89  <Field boolean allowNonSeamlessAdaptiveness>
		//   20   40:aload_0         
		//   21   41:getfield        #92  <Field int maxVideoWidth>
		//   22   44:aload_0         
		//   23   45:getfield        #95  <Field int maxVideoHeight>
		//   24   48:aload_0         
		//   25   49:getfield        #98  <Field int maxVideoBitrate>
		//   26   52:aload_0         
		//   27   53:getfield        #101 <Field boolean exceedVideoConstraintsIfNecessary>
		//   28   56:aload_0         
		//   29   57:getfield        #104 <Field boolean exceedRendererCapabilitiesIfNecessary>
		//   30   60:aload_0         
		//   31   61:getfield        #107 <Field int viewportWidth>
		//   32   64:aload_0         
		//   33   65:getfield        #110 <Field int viewportHeight>
		//   34   68:aload_0         
		//   35   69:getfield        #113 <Field boolean viewportOrientationMayChange>
		//   36   72:aload_0         
		//   37   73:getfield        #116 <Field int tunnelingAudioSessionId>
		//   38   76:invokespecial   #150 <Method void DefaultTrackSelector$Parameters(SparseArray, SparseBooleanArray, String, String, boolean, int, boolean, boolean, boolean, int, int, int, boolean, boolean, int, int, boolean, int)>
		//   39   79:areturn         
		}

		public final ParametersBuilder clearSelectionOverride(int i, TrackGroupArray trackgrouparray)
		{
			Map map = (Map)selectionOverrides.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field SparseArray selectionOverrides>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #155 <Method Object SparseArray.get(int)>
		//    4    8:checkcast       #136 <Class Map>
		//    5   11:astore_3        
			if(map != null)
		//*   6   12:aload_3         
		//*   7   13:ifnull          55
			{
				if(!map.containsKey(((Object) (trackgrouparray))))
		//*   8   16:aload_3         
		//*   9   17:aload_2         
		//*  10   18:invokeinterface #159 <Method boolean Map.containsKey(Object)>
		//*  11   23:ifne            28
					return this;
		//   12   26:aload_0         
		//   13   27:areturn         
				map.remove(((Object) (trackgrouparray)));
		//   14   28:aload_3         
		//   15   29:aload_2         
		//   16   30:invokeinterface #163 <Method Object Map.remove(Object)>
		//   17   35:pop             
				if(map.isEmpty())
		//*  18   36:aload_3         
		//*  19   37:invokeinterface #167 <Method boolean Map.isEmpty()>
		//*  20   42:ifeq            53
					selectionOverrides.remove(i);
		//   21   45:aload_0         
		//   22   46:getfield        #56  <Field SparseArray selectionOverrides>
		//   23   49:iload_1         
		//   24   50:invokevirtual   #170 <Method void SparseArray.remove(int)>
				return this;
		//   25   53:aload_0         
		//   26   54:areturn         
			} else
			{
				return this;
		//   27   55:aload_0         
		//   28   56:areturn         
			}
		}

		public final ParametersBuilder clearSelectionOverrides()
		{
			if(selectionOverrides.size() == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #56  <Field SparseArray selectionOverrides>
		//*   2    4:invokevirtual   #124 <Method int SparseArray.size()>
		//*   3    7:ifne            12
			{
				return this;
		//    4   10:aload_0         
		//    5   11:areturn         
			} else
			{
				selectionOverrides.clear();
		//    6   12:aload_0         
		//    7   13:getfield        #56  <Field SparseArray selectionOverrides>
		//    8   16:invokevirtual   #175 <Method void SparseArray.clear()>
				return this;
		//    9   19:aload_0         
		//   10   20:areturn         
			}
		}

		public final ParametersBuilder clearSelectionOverrides(int i)
		{
			Map map = (Map)selectionOverrides.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field SparseArray selectionOverrides>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #155 <Method Object SparseArray.get(int)>
		//    4    8:checkcast       #136 <Class Map>
		//    5   11:astore_2        
			if(map != null)
		//*   6   12:aload_2         
		//*   7   13:ifnull          37
			{
				if(map.isEmpty())
		//*   8   16:aload_2         
		//*   9   17:invokeinterface #167 <Method boolean Map.isEmpty()>
		//*  10   22:ifeq            27
				{
					return this;
		//   11   25:aload_0         
		//   12   26:areturn         
				} else
				{
					selectionOverrides.remove(i);
		//   13   27:aload_0         
		//   14   28:getfield        #56  <Field SparseArray selectionOverrides>
		//   15   31:iload_1         
		//   16   32:invokevirtual   #170 <Method void SparseArray.remove(int)>
					return this;
		//   17   35:aload_0         
		//   18   36:areturn         
				}
			} else
			{
				return this;
		//   19   37:aload_0         
		//   20   38:areturn         
			}
		}

		public ParametersBuilder clearVideoSizeConstraints()
		{
			return setMaxVideoSize(0x7fffffff, 0x7fffffff);
		//    0    0:aload_0         
		//    1    1:ldc1            #178 <Int 0x7fffffff>
		//    2    3:ldc1            #178 <Int 0x7fffffff>
		//    3    5:invokevirtual   #182 <Method DefaultTrackSelector$ParametersBuilder setMaxVideoSize(int, int)>
		//    4    8:areturn         
		}

		public ParametersBuilder clearViewportSizeConstraints()
		{
			return setViewportSize(0x7fffffff, 0x7fffffff, true);
		//    0    0:aload_0         
		//    1    1:ldc1            #178 <Int 0x7fffffff>
		//    2    3:ldc1            #178 <Int 0x7fffffff>
		//    3    5:iconst_1        
		//    4    6:invokevirtual   #187 <Method DefaultTrackSelector$ParametersBuilder setViewportSize(int, int, boolean)>
		//    5    9:areturn         
		}

		public ParametersBuilder setAllowMixedMimeAdaptiveness(boolean flag)
		{
			allowMixedMimeAdaptiveness = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #86  <Field boolean allowMixedMimeAdaptiveness>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public ParametersBuilder setAllowNonSeamlessAdaptiveness(boolean flag)
		{
			allowNonSeamlessAdaptiveness = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #89  <Field boolean allowNonSeamlessAdaptiveness>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public ParametersBuilder setDisabledTextTrackSelectionFlags(int i)
		{
			disabledTextTrackSelectionFlags = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #80  <Field int disabledTextTrackSelectionFlags>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean flag)
		{
			exceedRendererCapabilitiesIfNecessary = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #104 <Field boolean exceedRendererCapabilitiesIfNecessary>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean flag)
		{
			exceedVideoConstraintsIfNecessary = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #101 <Field boolean exceedVideoConstraintsIfNecessary>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public ParametersBuilder setForceLowestBitrate(boolean flag)
		{
			forceLowestBitrate = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #83  <Field boolean forceLowestBitrate>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public ParametersBuilder setMaxVideoBitrate(int i)
		{
			maxVideoBitrate = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #98  <Field int maxVideoBitrate>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public ParametersBuilder setMaxVideoSize(int i, int j)
		{
			maxVideoWidth = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #92  <Field int maxVideoWidth>
			maxVideoHeight = j;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #95  <Field int maxVideoHeight>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public ParametersBuilder setMaxVideoSizeSd()
		{
			return setMaxVideoSize(1279, 719);
		//    0    0:aload_0         
		//    1    1:sipush          1279
		//    2    4:sipush          719
		//    3    7:invokevirtual   #182 <Method DefaultTrackSelector$ParametersBuilder setMaxVideoSize(int, int)>
		//    4   10:areturn         
		}

		public ParametersBuilder setPreferredAudioLanguage(String s)
		{
			preferredAudioLanguage = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #71  <Field String preferredAudioLanguage>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public ParametersBuilder setPreferredTextLanguage(String s)
		{
			preferredTextLanguage = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #74  <Field String preferredTextLanguage>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final ParametersBuilder setRendererDisabled(int i, boolean flag)
		{
			if(rendererDisabledFlags.get(i) == flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #68  <Field SparseBooleanArray rendererDisabledFlags>
		//*   2    4:iload_1         
		//*   3    5:invokevirtual   #204 <Method boolean SparseBooleanArray.get(int)>
		//*   4    8:iload_2         
		//*   5    9:icmpne          14
				return this;
		//    6   12:aload_0         
		//    7   13:areturn         
			if(flag)
		//*   8   14:iload_2         
		//*   9   15:ifeq            29
			{
				rendererDisabledFlags.put(i, true);
		//   10   18:aload_0         
		//   11   19:getfield        #68  <Field SparseBooleanArray rendererDisabledFlags>
		//   12   22:iload_1         
		//   13   23:iconst_1        
		//   14   24:invokevirtual   #207 <Method void SparseBooleanArray.put(int, boolean)>
				return this;
		//   15   27:aload_0         
		//   16   28:areturn         
			} else
			{
				rendererDisabledFlags.delete(i);
		//   17   29:aload_0         
		//   18   30:getfield        #68  <Field SparseBooleanArray rendererDisabledFlags>
		//   19   33:iload_1         
		//   20   34:invokevirtual   #210 <Method void SparseBooleanArray.delete(int)>
				return this;
		//   21   37:aload_0         
		//   22   38:areturn         
			}
		}

		public ParametersBuilder setSelectUndeterminedTextLanguage(boolean flag)
		{
			selectUndeterminedTextLanguage = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #77  <Field boolean selectUndeterminedTextLanguage>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final ParametersBuilder setSelectionOverride(int i, TrackGroupArray trackgrouparray, SelectionOverride selectionoverride)
		{
			Map map = (Map)selectionOverrides.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field SparseArray selectionOverrides>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #155 <Method Object SparseArray.get(int)>
		//    4    8:checkcast       #136 <Class Map>
		//    5   11:astore          5
			Object obj = ((Object) (map));
		//    6   13:aload           5
		//    7   15:astore          4
			if(map == null)
		//*   8   17:aload           5
		//*   9   19:ifnonnull       41
			{
				obj = ((Object) (new HashMap()));
		//   10   22:new             #130 <Class HashMap>
		//   11   25:dup             
		//   12   26:invokespecial   #214 <Method void HashMap()>
		//   13   29:astore          4
				selectionOverrides.put(i, obj);
		//   14   31:aload_0         
		//   15   32:getfield        #56  <Field SparseArray selectionOverrides>
		//   16   35:iload_1         
		//   17   36:aload           4
		//   18   38:invokevirtual   #143 <Method void SparseArray.put(int, Object)>
			}
			if(((Map) (obj)).containsKey(((Object) (trackgrouparray))) && Util.areEqual(((Map) (obj)).get(((Object) (trackgrouparray))), ((Object) (selectionoverride))))
		//*  19   41:aload           4
		//*  20   43:aload_2         
		//*  21   44:invokeinterface #159 <Method boolean Map.containsKey(Object)>
		//*  22   49:ifeq            69
		//*  23   52:aload           4
		//*  24   54:aload_2         
		//*  25   55:invokeinterface #216 <Method Object Map.get(Object)>
		//*  26   60:aload_3         
		//*  27   61:invokestatic    #222 <Method boolean Util.areEqual(Object, Object)>
		//*  28   64:ifeq            69
			{
				return this;
		//   29   67:aload_0         
		//   30   68:areturn         
			} else
			{
				((Map) (obj)).put(((Object) (trackgrouparray)), ((Object) (selectionoverride)));
		//   31   69:aload           4
		//   32   71:aload_2         
		//   33   72:aload_3         
		//   34   73:invokeinterface #225 <Method Object Map.put(Object, Object)>
		//   35   78:pop             
				return this;
		//   36   79:aload_0         
		//   37   80:areturn         
			}
		}

		public ParametersBuilder setTunnelingAudioSessionId(int i)
		{
			if(tunnelingAudioSessionId != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #116 <Field int tunnelingAudioSessionId>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          15
			{
				tunnelingAudioSessionId = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #116 <Field int tunnelingAudioSessionId>
				return this;
		//    7   13:aload_0         
		//    8   14:areturn         
			} else
			{
				return this;
		//    9   15:aload_0         
		//   10   16:areturn         
			}
		}

		public ParametersBuilder setViewportSize(int i, int j, boolean flag)
		{
			viewportWidth = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #107 <Field int viewportWidth>
			viewportHeight = j;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #110 <Field int viewportHeight>
			viewportOrientationMayChange = flag;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #113 <Field boolean viewportOrientationMayChange>
			return this;
		//    9   15:aload_0         
		//   10   16:areturn         
		}

		public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean flag)
		{
			context = ((Context) (Util.getPhysicalDisplaySize(context)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #232 <Method Point Util.getPhysicalDisplaySize(Context)>
		//    2    4:astore_1        
			return setViewportSize(((Point) (context)).x, ((Point) (context)).y, flag);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:getfield        #237 <Field int Point.x>
		//    6   10:aload_1         
		//    7   11:getfield        #240 <Field int Point.y>
		//    8   14:iload_2         
		//    9   15:invokevirtual   #187 <Method DefaultTrackSelector$ParametersBuilder setViewportSize(int, int, boolean)>
		//   10   18:areturn         
		}

		private boolean allowMixedMimeAdaptiveness;
		private boolean allowNonSeamlessAdaptiveness;
		private int disabledTextTrackSelectionFlags;
		private boolean exceedRendererCapabilitiesIfNecessary;
		private boolean exceedVideoConstraintsIfNecessary;
		private boolean forceLowestBitrate;
		private int maxVideoBitrate;
		private int maxVideoHeight;
		private int maxVideoWidth;
		private String preferredAudioLanguage;
		private String preferredTextLanguage;
		private final SparseBooleanArray rendererDisabledFlags;
		private boolean selectUndeterminedTextLanguage;
		private final SparseArray selectionOverrides;
		private int tunnelingAudioSessionId;
		private int viewportHeight;
		private boolean viewportOrientationMayChange;
		private int viewportWidth;

		public ParametersBuilder()
		{
			this(Parameters.DEFAULT);
		//    0    0:aload_0         
		//    1    1:getstatic       #40  <Field DefaultTrackSelector$Parameters DefaultTrackSelector$Parameters.DEFAULT>
		//    2    4:invokespecial   #43  <Method void DefaultTrackSelector$ParametersBuilder(DefaultTrackSelector$Parameters)>
		//    3    7:return          
		}

		private ParametersBuilder(Parameters parameters)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #46  <Method void Object()>
			selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #50  <Method SparseArray DefaultTrackSelector$Parameters.access$000(DefaultTrackSelector$Parameters)>
		//    5    9:invokestatic    #54  <Method SparseArray cloneSelectionOverrides(SparseArray)>
		//    6   12:putfield        #56  <Field SparseArray selectionOverrides>
			rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokestatic    #60  <Method SparseBooleanArray DefaultTrackSelector$Parameters.access$100(DefaultTrackSelector$Parameters)>
		//   10   20:invokevirtual   #66  <Method SparseBooleanArray SparseBooleanArray.clone()>
		//   11   23:putfield        #68  <Field SparseBooleanArray rendererDisabledFlags>
			preferredAudioLanguage = parameters.preferredAudioLanguage;
		//   12   26:aload_0         
		//   13   27:aload_1         
		//   14   28:getfield        #70  <Field String DefaultTrackSelector$Parameters.preferredAudioLanguage>
		//   15   31:putfield        #71  <Field String preferredAudioLanguage>
			preferredTextLanguage = parameters.preferredTextLanguage;
		//   16   34:aload_0         
		//   17   35:aload_1         
		//   18   36:getfield        #73  <Field String DefaultTrackSelector$Parameters.preferredTextLanguage>
		//   19   39:putfield        #74  <Field String preferredTextLanguage>
			selectUndeterminedTextLanguage = parameters.selectUndeterminedTextLanguage;
		//   20   42:aload_0         
		//   21   43:aload_1         
		//   22   44:getfield        #76  <Field boolean DefaultTrackSelector$Parameters.selectUndeterminedTextLanguage>
		//   23   47:putfield        #77  <Field boolean selectUndeterminedTextLanguage>
			disabledTextTrackSelectionFlags = parameters.disabledTextTrackSelectionFlags;
		//   24   50:aload_0         
		//   25   51:aload_1         
		//   26   52:getfield        #79  <Field int DefaultTrackSelector$Parameters.disabledTextTrackSelectionFlags>
		//   27   55:putfield        #80  <Field int disabledTextTrackSelectionFlags>
			forceLowestBitrate = parameters.forceLowestBitrate;
		//   28   58:aload_0         
		//   29   59:aload_1         
		//   30   60:getfield        #82  <Field boolean DefaultTrackSelector$Parameters.forceLowestBitrate>
		//   31   63:putfield        #83  <Field boolean forceLowestBitrate>
			allowMixedMimeAdaptiveness = parameters.allowMixedMimeAdaptiveness;
		//   32   66:aload_0         
		//   33   67:aload_1         
		//   34   68:getfield        #85  <Field boolean DefaultTrackSelector$Parameters.allowMixedMimeAdaptiveness>
		//   35   71:putfield        #86  <Field boolean allowMixedMimeAdaptiveness>
			allowNonSeamlessAdaptiveness = parameters.allowNonSeamlessAdaptiveness;
		//   36   74:aload_0         
		//   37   75:aload_1         
		//   38   76:getfield        #88  <Field boolean DefaultTrackSelector$Parameters.allowNonSeamlessAdaptiveness>
		//   39   79:putfield        #89  <Field boolean allowNonSeamlessAdaptiveness>
			maxVideoWidth = parameters.maxVideoWidth;
		//   40   82:aload_0         
		//   41   83:aload_1         
		//   42   84:getfield        #91  <Field int DefaultTrackSelector$Parameters.maxVideoWidth>
		//   43   87:putfield        #92  <Field int maxVideoWidth>
			maxVideoHeight = parameters.maxVideoHeight;
		//   44   90:aload_0         
		//   45   91:aload_1         
		//   46   92:getfield        #94  <Field int DefaultTrackSelector$Parameters.maxVideoHeight>
		//   47   95:putfield        #95  <Field int maxVideoHeight>
			maxVideoBitrate = parameters.maxVideoBitrate;
		//   48   98:aload_0         
		//   49   99:aload_1         
		//   50  100:getfield        #97  <Field int DefaultTrackSelector$Parameters.maxVideoBitrate>
		//   51  103:putfield        #98  <Field int maxVideoBitrate>
			exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
		//   52  106:aload_0         
		//   53  107:aload_1         
		//   54  108:getfield        #100 <Field boolean DefaultTrackSelector$Parameters.exceedVideoConstraintsIfNecessary>
		//   55  111:putfield        #101 <Field boolean exceedVideoConstraintsIfNecessary>
			exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
		//   56  114:aload_0         
		//   57  115:aload_1         
		//   58  116:getfield        #103 <Field boolean DefaultTrackSelector$Parameters.exceedRendererCapabilitiesIfNecessary>
		//   59  119:putfield        #104 <Field boolean exceedRendererCapabilitiesIfNecessary>
			viewportWidth = parameters.viewportWidth;
		//   60  122:aload_0         
		//   61  123:aload_1         
		//   62  124:getfield        #106 <Field int DefaultTrackSelector$Parameters.viewportWidth>
		//   63  127:putfield        #107 <Field int viewportWidth>
			viewportHeight = parameters.viewportHeight;
		//   64  130:aload_0         
		//   65  131:aload_1         
		//   66  132:getfield        #109 <Field int DefaultTrackSelector$Parameters.viewportHeight>
		//   67  135:putfield        #110 <Field int viewportHeight>
			viewportOrientationMayChange = parameters.viewportOrientationMayChange;
		//   68  138:aload_0         
		//   69  139:aload_1         
		//   70  140:getfield        #112 <Field boolean DefaultTrackSelector$Parameters.viewportOrientationMayChange>
		//   71  143:putfield        #113 <Field boolean viewportOrientationMayChange>
			tunnelingAudioSessionId = parameters.tunnelingAudioSessionId;
		//   72  146:aload_0         
		//   73  147:aload_1         
		//   74  148:getfield        #115 <Field int DefaultTrackSelector$Parameters.tunnelingAudioSessionId>
		//   75  151:putfield        #116 <Field int tunnelingAudioSessionId>
		//   76  154:return          
		}

	}

	public static final class SelectionOverride
		implements Parcelable
	{

		public boolean containsTrack(int i)
		{
			int ai[] = tracks;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int[] tracks>
		//    2    4:astore          4
			int k = ai.length;
		//    3    6:aload           4
		//    4    8:arraylength     
		//    5    9:istore_3        
			for(int j = 0; j < k; j++)
		//*   6   10:iconst_0        
		//*   7   11:istore_2        
		//*   8   12:iload_2         
		//*   9   13:iload_3         
		//*  10   14:icmpge          34
				if(ai[j] == i)
		//*  11   17:aload           4
		//*  12   19:iload_2         
		//*  13   20:iaload          
		//*  14   21:iload_1         
		//*  15   22:icmpne          27
					return true;
		//   16   25:iconst_1        
		//   17   26:ireturn         

		//   18   27:iload_2         
		//   19   28:iconst_1        
		//   20   29:iadd            
		//   21   30:istore_2        
		//*  22   31:goto            12
			return false;
		//   23   34:iconst_0        
		//   24   35:ireturn         
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
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
		//*   6    8:ifnull          58
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #69  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #69  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((SelectionOverride)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class DefaultTrackSelector$SelectionOverride>
		//   16   28:astore_1        
				return groupIndex == ((SelectionOverride) (obj)).groupIndex && Arrays.equals(tracks, ((SelectionOverride) (obj)).tracks);
		//   17   29:aload_0         
		//   18   30:getfield        #31  <Field int groupIndex>
		//   19   33:aload_1         
		//   20   34:getfield        #31  <Field int groupIndex>
		//   21   37:icmpne          56
		//   22   40:aload_0         
		//   23   41:getfield        #39  <Field int[] tracks>
		//   24   44:aload_1         
		//   25   45:getfield        #39  <Field int[] tracks>
		//   26   48:invokestatic    #72  <Method boolean Arrays.equals(int[], int[])>
		//   27   51:ifeq            56
		//   28   54:iconst_1        
		//   29   55:ireturn         
		//   30   56:iconst_0        
		//   31   57:ireturn         
			} else
			{
				return false;
		//   32   58:iconst_0        
		//   33   59:ireturn         
			}
		}

		public int hashCode()
		{
			return 31 * groupIndex + Arrays.hashCode(tracks);
		//    0    0:bipush          31
		//    1    2:aload_0         
		//    2    3:getfield        #31  <Field int groupIndex>
		//    3    6:imul            
		//    4    7:aload_0         
		//    5    8:getfield        #39  <Field int[] tracks>
		//    6   11:invokestatic    #77  <Method int Arrays.hashCode(int[])>
		//    7   14:iadd            
		//    8   15:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeInt(groupIndex);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #31  <Field int groupIndex>
		//    3    5:invokevirtual   #83  <Method void Parcel.writeInt(int)>
			parcel.writeInt(tracks.length);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #39  <Field int[] tracks>
		//    7   13:arraylength     
		//    8   14:invokevirtual   #83  <Method void Parcel.writeInt(int)>
			parcel.writeIntArray(tracks);
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #39  <Field int[] tracks>
		//   12   22:invokevirtual   #86  <Method void Parcel.writeIntArray(int[])>
		//   13   25:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SelectionOverride createFromParcel(Parcel parcel)
			{
				return new SelectionOverride(parcel);
			//    0    0:new             #9   <Class DefaultTrackSelector$SelectionOverride>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void DefaultTrackSelector$SelectionOverride(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method DefaultTrackSelector$SelectionOverride createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public SelectionOverride[] newArray(int i)
			{
				return new SelectionOverride[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SelectionOverride[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method DefaultTrackSelector$SelectionOverride[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		public final int groupIndex;
		public final int length;
		public final int tracks[];

		static 
		{
		//    0    0:new             #11  <Class DefaultTrackSelector$SelectionOverride$1>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void DefaultTrackSelector$SelectionOverride$1()>
		//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public transient SelectionOverride(int i, int ai[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
			groupIndex = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #31  <Field int groupIndex>
			tracks = Arrays.copyOf(ai, ai.length);
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:aload_2         
		//    8   12:arraylength     
		//    9   13:invokestatic    #37  <Method int[] Arrays.copyOf(int[], int)>
		//   10   16:putfield        #39  <Field int[] tracks>
			length = ai.length;
		//   11   19:aload_0         
		//   12   20:aload_2         
		//   13   21:arraylength     
		//   14   22:putfield        #41  <Field int length>
			Arrays.sort(tracks);
		//   15   25:aload_0         
		//   16   26:getfield        #39  <Field int[] tracks>
		//   17   29:invokestatic    #45  <Method void Arrays.sort(int[])>
		//   18   32:return          
		}

		SelectionOverride(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
			groupIndex = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #52  <Method int Parcel.readInt()>
		//    5    9:putfield        #31  <Field int groupIndex>
			length = ((int) (parcel.readByte()));
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #56  <Method byte Parcel.readByte()>
		//    9   17:putfield        #41  <Field int length>
			tracks = new int[length];
		//   10   20:aload_0         
		//   11   21:aload_0         
		//   12   22:getfield        #41  <Field int length>
		//   13   25:newarray        int[]
		//   14   27:putfield        #39  <Field int[] tracks>
			parcel.readIntArray(tracks);
		//   15   30:aload_1         
		//   16   31:aload_0         
		//   17   32:getfield        #39  <Field int[] tracks>
		//   18   35:invokevirtual   #59  <Method void Parcel.readIntArray(int[])>
		//   19   38:return          
		}
	}


	public DefaultTrackSelector()
	{
		this((TrackSelection.Factory)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #47  <Class TrackSelection$Factory>
	//    3    5:invokespecial   #50  <Method void DefaultTrackSelector(TrackSelection$Factory)>
	//    4    8:return          
	}

	public DefaultTrackSelector(TrackSelection.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void MappingTrackSelector()>
		adaptiveTrackSelectionFactory = factory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #54  <Field TrackSelection$Factory adaptiveTrackSelectionFactory>
		parametersReference = new AtomicReference(((Object) (Parameters.DEFAULT)));
	//    5    9:aload_0         
	//    6   10:new             #56  <Class AtomicReference>
	//    7   13:dup             
	//    8   14:getstatic       #60  <Field DefaultTrackSelector$Parameters DefaultTrackSelector$Parameters.DEFAULT>
	//    9   17:invokespecial   #63  <Method void AtomicReference(Object)>
	//   10   20:putfield        #65  <Field AtomicReference parametersReference>
	//   11   23:return          
	}

	public DefaultTrackSelector(BandwidthMeter bandwidthmeter)
	{
		this(((TrackSelection.Factory) (new AdaptiveTrackSelection.Factory(bandwidthmeter))));
	//    0    0:aload_0         
	//    1    1:new             #69  <Class AdaptiveTrackSelection$Factory>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #71  <Method void AdaptiveTrackSelection$Factory(BandwidthMeter)>
	//    5    9:invokespecial   #50  <Method void DefaultTrackSelector(TrackSelection$Factory)>
	//    6   12:return          
	}

	private static int compareFormatValues(int i, int j)
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_2        
		if(i == -1)
	//*   2    2:iload_0         
	//*   3    3:iconst_m1       
	//*   4    4:icmpne          16
		{
			i = ((int) (byte0));
	//    5    7:iload_2         
	//    6    8:istore_0        
			if(j == -1)
	//*   7    9:iload_1         
	//*   8   10:iconst_m1       
	//*   9   11:icmpne          27
				return 0;
	//   10   14:iconst_0        
	//   11   15:ireturn         
		} else
		{
			if(j == -1)
	//*  12   16:iload_1         
	//*  13   17:iconst_m1       
	//*  14   18:icmpne          23
				return 1;
	//   15   21:iconst_1        
	//   16   22:ireturn         
			i -= j;
	//   17   23:iload_0         
	//   18   24:iload_1         
	//   19   25:isub            
	//   20   26:istore_0        
		}
		return i;
	//   21   27:iload_0         
	//   22   28:ireturn         
	}

	private static int compareInts(int i, int j)
	{
		if(i > j)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmple          7
			return 1;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		return j <= i ? 0 : -1;
	//    5    7:iload_1         
	//    6    8:iload_0         
	//    7    9:icmple          14
	//    8   12:iconst_m1       
	//    9   13:ireturn         
	//   10   14:iconst_0        
	//   11   15:ireturn         
	}

	private static void filterAdaptiveVideoTrackCountForMimeType(TrackGroup trackgroup, int ai[], int i, String s, int j, int k, int l, List list)
	{
		for(int i1 = list.size() - 1; i1 >= 0; i1--)
	//*   0    0:aload           7
	//*   1    2:invokeinterface #85  <Method int List.size()>
	//*   2    7:iconst_1        
	//*   3    8:isub            
	//*   4    9:istore          8
	//*   5   11:iload           8
	//*   6   13:iflt            76
		{
			int j1 = ((Integer)list.get(i1)).intValue();
	//    7   16:aload           7
	//    8   18:iload           8
	//    9   20:invokeinterface #89  <Method Object List.get(int)>
	//   10   25:checkcast       #91  <Class Integer>
	//   11   28:invokevirtual   #94  <Method int Integer.intValue()>
	//   12   31:istore          9
			if(!isSupportedAdaptiveVideoTrack(trackgroup.getFormat(j1), s, ai[j1], i, j, k, l))
	//*  13   33:aload_0         
	//*  14   34:iload           9
	//*  15   36:invokevirtual   #100 <Method Format TrackGroup.getFormat(int)>
	//*  16   39:aload_3         
	//*  17   40:aload_1         
	//*  18   41:iload           9
	//*  19   43:iaload          
	//*  20   44:iload_2         
	//*  21   45:iload           4
	//*  22   47:iload           5
	//*  23   49:iload           6
	//*  24   51:invokestatic    #104 <Method boolean isSupportedAdaptiveVideoTrack(Format, String, int, int, int, int, int)>
	//*  25   54:ifne            67
				list.remove(i1);
	//   26   57:aload           7
	//   27   59:iload           8
	//   28   61:invokeinterface #107 <Method Object List.remove(int)>
	//   29   66:pop             
		}

	//   30   67:iload           8
	//   31   69:iconst_1        
	//   32   70:isub            
	//   33   71:istore          8
	//*  34   73:goto            11
	//   35   76:return          
	}

	protected static boolean formatHasLanguage(Format format, String s)
	{
		return s != null && TextUtils.equals(((CharSequence) (s)), ((CharSequence) (Util.normalizeLanguageCode(format.language))));
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #117 <Field String Format.language>
	//    5    9:invokestatic    #123 <Method String Util.normalizeLanguageCode(String)>
	//    6   12:invokestatic    #129 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	protected static boolean formatHasNoLanguage(Format format)
	{
		return TextUtils.isEmpty(((CharSequence) (format.language))) || formatHasLanguage(format, "und");
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field String Format.language>
	//    2    4:invokestatic    #135 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:ifne            24
	//    4   10:aload_0         
	//    5   11:ldc1            #137 <String "und">
	//    6   13:invokestatic    #139 <Method boolean formatHasLanguage(Format, String)>
	//    7   16:ifeq            22
	//    8   19:goto            24
	//    9   22:iconst_0        
	//   10   23:ireturn         
	//   11   24:iconst_1        
	//   12   25:ireturn         
	}

	private static int getAdaptiveAudioTrackCount(TrackGroup trackgroup, int ai[], AudioConfigurationTuple audioconfigurationtuple)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int j;
		int k;
		for(j = 0; i < trackgroup.length; j = k)
	//*   2    2:iconst_0        
	//*   3    3:istore          4
	//*   4    5:iload_3         
	//*   5    6:aload_0         
	//*   6    7:getfield        #144 <Field int TrackGroup.length>
	//*   7   10:icmpge          49
		{
			k = j;
	//    8   13:iload           4
	//    9   15:istore          5
			if(isSupportedAdaptiveAudioTrack(trackgroup.getFormat(i), ai[i], audioconfigurationtuple))
	//*  10   17:aload_0         
	//*  11   18:iload_3         
	//*  12   19:invokevirtual   #100 <Method Format TrackGroup.getFormat(int)>
	//*  13   22:aload_1         
	//*  14   23:iload_3         
	//*  15   24:iaload          
	//*  16   25:aload_2         
	//*  17   26:invokestatic    #148 <Method boolean isSupportedAdaptiveAudioTrack(Format, int, DefaultTrackSelector$AudioConfigurationTuple)>
	//*  18   29:ifeq            38
				k = j + 1;
	//   19   32:iload           4
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore          5
			i++;
	//   23   38:iload_3         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_3        
		}

	//   27   42:iload           5
	//   28   44:istore          4
	//*  29   46:goto            5
		return j;
	//   30   49:iload           4
	//   31   51:ireturn         
	}

	private static int[] getAdaptiveAudioTracks(TrackGroup trackgroup, int ai[], boolean flag)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #152 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void HashSet()>
	//    3    7:astore          11
		boolean flag1 = false;
	//    4    9:iconst_0        
	//    5   10:istore          6
		AudioConfigurationTuple audioconfigurationtuple = null;
	//    6   12:aconst_null     
	//    7   13:astore          8
		int i = 0;
	//    8   15:iconst_0        
	//    9   16:istore_3        
		int k = i;
	//   10   17:iload_3         
	//   11   18:istore          4
		while(i < trackgroup.length) 
	//*  12   20:iload_3         
	//*  13   21:aload_0         
	//*  14   22:getfield        #144 <Field int TrackGroup.length>
	//*  15   25:icmpge          146
		{
			Object obj = ((Object) (trackgroup.getFormat(i)));
	//   16   28:aload_0         
	//   17   29:iload_3         
	//   18   30:invokevirtual   #100 <Method Format TrackGroup.getFormat(int)>
	//   19   33:astore          9
			int l = ((Format) (obj)).channelCount;
	//   20   35:aload           9
	//   21   37:getfield        #156 <Field int Format.channelCount>
	//   22   40:istore          5
			int j1 = ((Format) (obj)).sampleRate;
	//   23   42:aload           9
	//   24   44:getfield        #159 <Field int Format.sampleRate>
	//   25   47:istore          7
			if(flag)
	//*  26   49:iload_2         
	//*  27   50:ifeq            59
				obj = null;
	//   28   53:aconst_null     
	//   29   54:astore          9
			else
	//*  30   56:goto            66
				obj = ((Object) (((Format) (obj)).sampleMimeType));
	//   31   59:aload           9
	//   32   61:getfield        #162 <Field String Format.sampleMimeType>
	//   33   64:astore          9
			AudioConfigurationTuple audioconfigurationtuple1 = new AudioConfigurationTuple(l, j1, ((String) (obj)));
	//   34   66:new             #8   <Class DefaultTrackSelector$AudioConfigurationTuple>
	//   35   69:dup             
	//   36   70:iload           5
	//   37   72:iload           7
	//   38   74:aload           9
	//   39   76:invokespecial   #165 <Method void DefaultTrackSelector$AudioConfigurationTuple(int, int, String)>
	//   40   79:astore          10
			l = k;
	//   41   81:iload           4
	//   42   83:istore          5
			obj = ((Object) (audioconfigurationtuple));
	//   43   85:aload           8
	//   44   87:astore          9
			if(hashset.add(((Object) (audioconfigurationtuple1))))
	//*  45   89:aload           11
	//*  46   91:aload           10
	//*  47   93:invokevirtual   #169 <Method boolean HashSet.add(Object)>
	//*  48   96:ifeq            131
			{
				int k1 = getAdaptiveAudioTrackCount(trackgroup, ai, audioconfigurationtuple1);
	//   49   99:aload_0         
	//   50  100:aload_1         
	//   51  101:aload           10
	//   52  103:invokestatic    #171 <Method int getAdaptiveAudioTrackCount(TrackGroup, int[], DefaultTrackSelector$AudioConfigurationTuple)>
	//   53  106:istore          7
				l = k;
	//   54  108:iload           4
	//   55  110:istore          5
				obj = ((Object) (audioconfigurationtuple));
	//   56  112:aload           8
	//   57  114:astore          9
				if(k1 > k)
	//*  58  116:iload           7
	//*  59  118:iload           4
	//*  60  120:icmple          131
				{
					l = k1;
	//   61  123:iload           7
	//   62  125:istore          5
					obj = ((Object) (audioconfigurationtuple1));
	//   63  127:aload           10
	//   64  129:astore          9
				}
			}
			i++;
	//   65  131:iload_3         
	//   66  132:iconst_1        
	//   67  133:iadd            
	//   68  134:istore_3        
			k = l;
	//   69  135:iload           5
	//   70  137:istore          4
			audioconfigurationtuple = ((AudioConfigurationTuple) (obj));
	//   71  139:aload           9
	//   72  141:astore          8
		}
	//*  73  143:goto            20
		if(k > 1)
	//*  74  146:iload           4
	//*  75  148:iconst_1        
	//*  76  149:icmple          224
		{
			int ai1[] = new int[k];
	//   77  152:iload           4
	//   78  154:newarray        int[]
	//   79  156:astore          9
			k = 0;
	//   80  158:iconst_0        
	//   81  159:istore          4
			for(int j = ((int) (flag1)); j < trackgroup.length;)
	//*  82  161:iload           6
	//*  83  163:istore_3        
	//*  84  164:iload_3         
	//*  85  165:aload_0         
	//*  86  166:getfield        #144 <Field int TrackGroup.length>
	//*  87  169:icmpge          221
			{
				int i1 = k;
	//   88  172:iload           4
	//   89  174:istore          5
				if(isSupportedAdaptiveAudioTrack(trackgroup.getFormat(j), ai[j], (AudioConfigurationTuple)Assertions.checkNotNull(((Object) (audioconfigurationtuple)))))
	//*  90  176:aload_0         
	//*  91  177:iload_3         
	//*  92  178:invokevirtual   #100 <Method Format TrackGroup.getFormat(int)>
	//*  93  181:aload_1         
	//*  94  182:iload_3         
	//*  95  183:iaload          
	//*  96  184:aload           8
	//*  97  186:invokestatic    #177 <Method Object Assertions.checkNotNull(Object)>
	//*  98  189:checkcast       #8   <Class DefaultTrackSelector$AudioConfigurationTuple>
	//*  99  192:invokestatic    #148 <Method boolean isSupportedAdaptiveAudioTrack(Format, int, DefaultTrackSelector$AudioConfigurationTuple)>
	//* 100  195:ifeq            210
				{
					ai1[k] = j;
	//  101  198:aload           9
	//  102  200:iload           4
	//  103  202:iload_3         
	//  104  203:iastore         
					i1 = k + 1;
	//  105  204:iload           4
	//  106  206:iconst_1        
	//  107  207:iadd            
	//  108  208:istore          5
				}
				j++;
	//  109  210:iload_3         
	//  110  211:iconst_1        
	//  111  212:iadd            
	//  112  213:istore_3        
				k = i1;
	//  113  214:iload           5
	//  114  216:istore          4
			}

	//* 115  218:goto            164
			return ai1;
	//  116  221:aload           9
	//  117  223:areturn         
		} else
		{
			return NO_TRACKS;
	//  118  224:getstatic       #43  <Field int[] NO_TRACKS>
	//  119  227:areturn         
		}
	}

	private static int getAdaptiveVideoTrackCountForMimeType(TrackGroup trackgroup, int ai[], int i, String s, int j, int k, int l, List list)
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          8
		int j1;
		int k1;
		for(j1 = 0; i1 < list.size(); j1 = k1)
	//*   2    3:iconst_0        
	//*   3    4:istore          9
	//*   4    6:iload           8
	//*   5    8:aload           7
	//*   6   10:invokeinterface #85  <Method int List.size()>
	//*   7   15:icmpge          82
		{
			int l1 = ((Integer)list.get(i1)).intValue();
	//    8   18:aload           7
	//    9   20:iload           8
	//   10   22:invokeinterface #89  <Method Object List.get(int)>
	//   11   27:checkcast       #91  <Class Integer>
	//   12   30:invokevirtual   #94  <Method int Integer.intValue()>
	//   13   33:istore          11
			k1 = j1;
	//   14   35:iload           9
	//   15   37:istore          10
			if(isSupportedAdaptiveVideoTrack(trackgroup.getFormat(l1), s, ai[l1], i, j, k, l))
	//*  16   39:aload_0         
	//*  17   40:iload           11
	//*  18   42:invokevirtual   #100 <Method Format TrackGroup.getFormat(int)>
	//*  19   45:aload_3         
	//*  20   46:aload_1         
	//*  21   47:iload           11
	//*  22   49:iaload          
	//*  23   50:iload_2         
	//*  24   51:iload           4
	//*  25   53:iload           5
	//*  26   55:iload           6
	//*  27   57:invokestatic    #104 <Method boolean isSupportedAdaptiveVideoTrack(Format, String, int, int, int, int, int)>
	//*  28   60:ifeq            69
				k1 = j1 + 1;
	//   29   63:iload           9
	//   30   65:iconst_1        
	//   31   66:iadd            
	//   32   67:istore          10
			i1++;
	//   33   69:iload           8
	//   34   71:iconst_1        
	//   35   72:iadd            
	//   36   73:istore          8
		}

	//   37   75:iload           10
	//   38   77:istore          9
	//*  39   79:goto            6
		return j1;
	//   40   82:iload           9
	//   41   84:ireturn         
	}

	private static int[] getAdaptiveVideoTracksForGroup(TrackGroup trackgroup, int ai[], boolean flag, int i, int j, int k, int l, int i1, 
			int j1, boolean flag1)
	{
		if(trackgroup.length < 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field int TrackGroup.length>
	//*   2    4:iconst_2        
	//*   3    5:icmpge          12
			return NO_TRACKS;
	//    4    8:getstatic       #43  <Field int[] NO_TRACKS>
	//    5   11:areturn         
		List list = getViewportFilteredTrackIndices(trackgroup, i1, j1, flag1);
	//    6   12:aload_0         
	//    7   13:iload           7
	//    8   15:iload           8
	//    9   17:iload           9
	//   10   19:invokestatic    #186 <Method List getViewportFilteredTrackIndices(TrackGroup, int, int, boolean)>
	//   11   22:astore          15
		if(list.size() < 2)
	//*  12   24:aload           15
	//*  13   26:invokeinterface #85  <Method int List.size()>
	//*  14   31:iconst_2        
	//*  15   32:icmpge          39
			return NO_TRACKS;
	//   16   35:getstatic       #43  <Field int[] NO_TRACKS>
	//   17   38:areturn         
		String s;
		if(!flag)
	//*  18   39:iload_2         
	//*  19   40:ifne            177
		{
			HashSet hashset = new HashSet();
	//   20   43:new             #152 <Class HashSet>
	//   21   46:dup             
	//   22   47:invokespecial   #153 <Method void HashSet()>
	//   23   50:astore          16
			s = null;
	//   24   52:aconst_null     
	//   25   53:astore          12
			i1 = 0;
	//   26   55:iconst_0        
	//   27   56:istore          7
			int k1;
			for(j1 = i1; i1 < list.size(); j1 = k1)
	//*  28   58:iload           7
	//*  29   60:istore          8
	//*  30   62:iload           7
	//*  31   64:aload           15
	//*  32   66:invokeinterface #85  <Method int List.size()>
	//*  33   71:icmpge          174
			{
				String s2 = trackgroup.getFormat(((Integer)list.get(i1)).intValue()).sampleMimeType;
	//   34   74:aload_0         
	//   35   75:aload           15
	//   36   77:iload           7
	//   37   79:invokeinterface #89  <Method Object List.get(int)>
	//   38   84:checkcast       #91  <Class Integer>
	//   39   87:invokevirtual   #94  <Method int Integer.intValue()>
	//   40   90:invokevirtual   #100 <Method Format TrackGroup.getFormat(int)>
	//   41   93:getfield        #162 <Field String Format.sampleMimeType>
	//   42   96:astore          14
				String s1 = s;
	//   43   98:aload           12
	//   44  100:astore          13
				k1 = j1;
	//   45  102:iload           8
	//   46  104:istore          10
				if(hashset.add(((Object) (s2))))
	//*  47  106:aload           16
	//*  48  108:aload           14
	//*  49  110:invokevirtual   #169 <Method boolean HashSet.add(Object)>
	//*  50  113:ifeq            157
				{
					int l1 = getAdaptiveVideoTrackCountForMimeType(trackgroup, ai, i, s2, j, k, l, list);
	//   51  116:aload_0         
	//   52  117:aload_1         
	//   53  118:iload_3         
	//   54  119:aload           14
	//   55  121:iload           4
	//   56  123:iload           5
	//   57  125:iload           6
	//   58  127:aload           15
	//   59  129:invokestatic    #188 <Method int getAdaptiveVideoTrackCountForMimeType(TrackGroup, int[], int, String, int, int, int, List)>
	//   60  132:istore          11
					s1 = s;
	//   61  134:aload           12
	//   62  136:astore          13
					k1 = j1;
	//   63  138:iload           8
	//   64  140:istore          10
					if(l1 > j1)
	//*  65  142:iload           11
	//*  66  144:iload           8
	//*  67  146:icmple          157
					{
						k1 = l1;
	//   68  149:iload           11
	//   69  151:istore          10
						s1 = s2;
	//   70  153:aload           14
	//   71  155:astore          13
					}
				}
				i1++;
	//   72  157:iload           7
	//   73  159:iconst_1        
	//   74  160:iadd            
	//   75  161:istore          7
				s = s1;
	//   76  163:aload           13
	//   77  165:astore          12
			}

	//   78  167:iload           10
	//   79  169:istore          8
		} else
	//*  80  171:goto            62
	//*  81  174:goto            180
		{
			s = null;
	//   82  177:aconst_null     
	//   83  178:astore          12
		}
		filterAdaptiveVideoTrackCountForMimeType(trackgroup, ai, i, s, j, k, l, list);
	//   84  180:aload_0         
	//   85  181:aload_1         
	//   86  182:iload_3         
	//   87  183:aload           12
	//   88  185:iload           4
	//   89  187:iload           5
	//   90  189:iload           6
	//   91  191:aload           15
	//   92  193:invokestatic    #190 <Method void filterAdaptiveVideoTrackCountForMimeType(TrackGroup, int[], int, String, int, int, int, List)>
		if(list.size() < 2)
	//*  93  196:aload           15
	//*  94  198:invokeinterface #85  <Method int List.size()>
	//*  95  203:iconst_2        
	//*  96  204:icmpge          211
			return NO_TRACKS;
	//   97  207:getstatic       #43  <Field int[] NO_TRACKS>
	//   98  210:areturn         
		else
			return Util.toArray(list);
	//   99  211:aload           15
	//  100  213:invokestatic    #194 <Method int[] Util.toArray(List)>
	//  101  216:areturn         
	}

	private static Point getMaxVideoSizeInViewport(boolean flag, int i, int j, int k, int l)
	{
label0:
		{
			if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            40
			{
				boolean flag2 = false;
	//    2    4:iconst_0        
	//    3    5:istore          6
				boolean flag1;
				if(k > l)
	//*   4    7:iload_3         
	//*   5    8:iload           4
	//*   6   10:icmple          19
					flag1 = true;
	//    7   13:iconst_1        
	//    8   14:istore          5
				else
	//*   9   16:goto            22
					flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore          5
				if(i > j)
	//*  12   22:iload_1         
	//*  13   23:iload_2         
	//*  14   24:icmple          30
					flag2 = true;
	//   15   27:iconst_1        
	//   16   28:istore          6
				if(flag1 != flag2)
	//*  17   30:iload           5
	//*  18   32:iload           6
	//*  19   34:icmpeq          40
					break label0;
	//   20   37:goto            48
			}
			int i1 = j;
	//   21   40:iload_2         
	//   22   41:istore          5
			j = i;
	//   23   43:iload_1         
	//   24   44:istore_2        
			i = i1;
	//   25   45:iload           5
	//   26   47:istore_1        
		}
		int j1 = k * i;
	//   27   48:iload_3         
	//   28   49:iload_1         
	//   29   50:imul            
	//   30   51:istore          5
		int k1 = l * j;
	//   31   53:iload           4
	//   32   55:iload_2         
	//   33   56:imul            
	//   34   57:istore          6
		if(j1 >= k1)
	//*  35   59:iload           5
	//*  36   61:iload           6
	//*  37   63:icmplt          81
			return new Point(j, Util.ceilDivide(k1, k));
	//   38   66:new             #198 <Class Point>
	//   39   69:dup             
	//   40   70:iload_2         
	//   41   71:iload           6
	//   42   73:iload_3         
	//   43   74:invokestatic    #201 <Method int Util.ceilDivide(int, int)>
	//   44   77:invokespecial   #204 <Method void Point(int, int)>
	//   45   80:areturn         
		else
			return new Point(Util.ceilDivide(j1, l), i);
	//   46   81:new             #198 <Class Point>
	//   47   84:dup             
	//   48   85:iload           5
	//   49   87:iload           4
	//   50   89:invokestatic    #201 <Method int Util.ceilDivide(int, int)>
	//   51   92:iload_1         
	//   52   93:invokespecial   #204 <Method void Point(int, int)>
	//   53   96:areturn         
	}

	private static List getViewportFilteredTrackIndices(TrackGroup trackgroup, int i, int j, boolean flag)
	{
		ArrayList arraylist = new ArrayList(trackgroup.length);
	//    0    0:new             #206 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #144 <Field int TrackGroup.length>
	//    4    8:invokespecial   #209 <Method void ArrayList(int)>
	//    5   11:astore          8
		int i1 = 0;
	//    6   13:iconst_0        
	//    7   14:istore          5
		for(int k = 0; k < trackgroup.length; k++)
	//*   8   16:iconst_0        
	//*   9   17:istore          4
	//*  10   19:iload           4
	//*  11   21:aload_0         
	//*  12   22:getfield        #144 <Field int TrackGroup.length>
	//*  13   25:icmpge          48
			arraylist.add(((Object) (Integer.valueOf(k))));
	//   14   28:aload           8
	//   15   30:iload           4
	//   16   32:invokestatic    #213 <Method Integer Integer.valueOf(int)>
	//   17   35:invokevirtual   #214 <Method boolean ArrayList.add(Object)>
	//   18   38:pop             

	//   19   39:iload           4
	//   20   41:iconst_1        
	//   21   42:iadd            
	//   22   43:istore          4
	//*  23   45:goto            19
		if(i != 0x7fffffff)
	//*  24   48:iload_1         
	//*  25   49:ldc1            #215 <Int 0x7fffffff>
	//*  26   51:icmpeq          278
		{
			if(j == 0x7fffffff)
	//*  27   54:iload_2         
	//*  28   55:ldc1            #215 <Int 0x7fffffff>
	//*  29   57:icmpne          63
				return ((List) (arraylist));
	//   30   60:aload           8
	//   31   62:areturn         
			int l;
			int j1;
			for(l = 0x7fffffff; i1 < trackgroup.length; l = j1)
	//*  32   63:ldc1            #215 <Int 0x7fffffff>
	//*  33   65:istore          4
	//*  34   67:iload           5
	//*  35   69:aload_0         
	//*  36   70:getfield        #144 <Field int TrackGroup.length>
	//*  37   73:icmpge          211
			{
				Format format = trackgroup.getFormat(i1);
	//   38   76:aload_0         
	//   39   77:iload           5
	//   40   79:invokevirtual   #100 <Method Format TrackGroup.getFormat(int)>
	//   41   82:astore          9
				j1 = l;
	//   42   84:iload           4
	//   43   86:istore          6
				if(format.width > 0)
	//*  44   88:aload           9
	//*  45   90:getfield        #218 <Field int Format.width>
	//*  46   93:ifle            198
				{
					j1 = l;
	//   47   96:iload           4
	//   48   98:istore          6
					if(format.height > 0)
	//*  49  100:aload           9
	//*  50  102:getfield        #221 <Field int Format.height>
	//*  51  105:ifle            198
					{
						Point point = getMaxVideoSizeInViewport(flag, i, j, format.width, format.height);
	//   52  108:iload_3         
	//   53  109:iload_1         
	//   54  110:iload_2         
	//   55  111:aload           9
	//   56  113:getfield        #218 <Field int Format.width>
	//   57  116:aload           9
	//   58  118:getfield        #221 <Field int Format.height>
	//   59  121:invokestatic    #223 <Method Point getMaxVideoSizeInViewport(boolean, int, int, int, int)>
	//   60  124:astore          10
						int k1 = format.width * format.height;
	//   61  126:aload           9
	//   62  128:getfield        #218 <Field int Format.width>
	//   63  131:aload           9
	//   64  133:getfield        #221 <Field int Format.height>
	//   65  136:imul            
	//   66  137:istore          7
						j1 = l;
	//   67  139:iload           4
	//   68  141:istore          6
						if(format.width >= (int)((float)point.x * 0.98F))
	//*  69  143:aload           9
	//*  70  145:getfield        #218 <Field int Format.width>
	//*  71  148:aload           10
	//*  72  150:getfield        #226 <Field int Point.x>
	//*  73  153:i2f             
	//*  74  154:ldc1            #28  <Float 0.98F>
	//*  75  156:fmul            
	//*  76  157:f2i             
	//*  77  158:icmplt          198
						{
							j1 = l;
	//   78  161:iload           4
	//   79  163:istore          6
							if(format.height >= (int)((float)point.y * 0.98F))
	//*  80  165:aload           9
	//*  81  167:getfield        #221 <Field int Format.height>
	//*  82  170:aload           10
	//*  83  172:getfield        #229 <Field int Point.y>
	//*  84  175:i2f             
	//*  85  176:ldc1            #28  <Float 0.98F>
	//*  86  178:fmul            
	//*  87  179:f2i             
	//*  88  180:icmplt          198
							{
								j1 = l;
	//   89  183:iload           4
	//   90  185:istore          6
								if(k1 < l)
	//*  91  187:iload           7
	//*  92  189:iload           4
	//*  93  191:icmpge          198
									j1 = k1;
	//   94  194:iload           7
	//   95  196:istore          6
							}
						}
					}
				}
				i1++;
	//   96  198:iload           5
	//   97  200:iconst_1        
	//   98  201:iadd            
	//   99  202:istore          5
			}

	//  100  204:iload           6
	//  101  206:istore          4
	//* 102  208:goto            67
			if(l != 0x7fffffff)
	//* 103  211:iload           4
	//* 104  213:ldc1            #215 <Int 0x7fffffff>
	//* 105  215:icmpeq          275
				for(i = arraylist.size() - 1; i >= 0; i--)
	//* 106  218:aload           8
	//* 107  220:invokevirtual   #230 <Method int ArrayList.size()>
	//* 108  223:iconst_1        
	//* 109  224:isub            
	//* 110  225:istore_1        
	//* 111  226:iload_1         
	//* 112  227:iflt            275
				{
					j = trackgroup.getFormat(((Integer)arraylist.get(i)).intValue()).getPixelCount();
	//  113  230:aload_0         
	//  114  231:aload           8
	//  115  233:iload_1         
	//  116  234:invokevirtual   #231 <Method Object ArrayList.get(int)>
	//  117  237:checkcast       #91  <Class Integer>
	//  118  240:invokevirtual   #94  <Method int Integer.intValue()>
	//  119  243:invokevirtual   #100 <Method Format TrackGroup.getFormat(int)>
	//  120  246:invokevirtual   #234 <Method int Format.getPixelCount()>
	//  121  249:istore_2        
					if(j == -1 || j > l)
	//* 122  250:iload_2         
	//* 123  251:iconst_m1       
	//* 124  252:icmpeq          261
	//* 125  255:iload_2         
	//* 126  256:iload           4
	//* 127  258:icmple          268
						arraylist.remove(i);
	//  128  261:aload           8
	//  129  263:iload_1         
	//  130  264:invokevirtual   #235 <Method Object ArrayList.remove(int)>
	//  131  267:pop             
				}

	//  132  268:iload_1         
	//  133  269:iconst_1        
	//  134  270:isub            
	//  135  271:istore_1        
	//* 136  272:goto            226
			return ((List) (arraylist));
	//  137  275:aload           8
	//  138  277:areturn         
		} else
		{
			return ((List) (arraylist));
	//  139  278:aload           8
	//  140  280:areturn         
		}
	}

	protected static boolean isSupported(int i, boolean flag)
	{
		i &= 7;
	//    0    0:iload_0         
	//    1    1:bipush          7
	//    2    3:iand            
	//    3    4:istore_0        
		return i == 4 || flag && i == 3;
	//    4    5:iload_0         
	//    5    6:iconst_4        
	//    6    7:icmpeq          24
	//    7   10:iload_1         
	//    8   11:ifeq            22
	//    9   14:iload_0         
	//   10   15:iconst_3        
	//   11   16:icmpne          22
	//   12   19:goto            24
	//   13   22:iconst_0        
	//   14   23:ireturn         
	//   15   24:iconst_1        
	//   16   25:ireturn         
	}

	private static boolean isSupportedAdaptiveAudioTrack(Format format, int i, AudioConfigurationTuple audioconfigurationtuple)
	{
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
			flag = flag1;
	//    2    3:iload           4
	//    3    5:istore_3        
			if(!isSupported(i, false))
				break label0;
	//    4    6:iload_1         
	//    5    7:iconst_0        
	//    6    8:invokestatic    #240 <Method boolean isSupported(int, boolean)>
	//    7   11:ifeq            68
			flag = flag1;
	//    8   14:iload           4
	//    9   16:istore_3        
			if(format.channelCount != audioconfigurationtuple.channelCount)
				break label0;
	//   10   17:aload_0         
	//   11   18:getfield        #156 <Field int Format.channelCount>
	//   12   21:aload_2         
	//   13   22:getfield        #241 <Field int DefaultTrackSelector$AudioConfigurationTuple.channelCount>
	//   14   25:icmpne          68
			flag = flag1;
	//   15   28:iload           4
	//   16   30:istore_3        
			if(format.sampleRate != audioconfigurationtuple.sampleRate)
				break label0;
	//   17   31:aload_0         
	//   18   32:getfield        #159 <Field int Format.sampleRate>
	//   19   35:aload_2         
	//   20   36:getfield        #242 <Field int DefaultTrackSelector$AudioConfigurationTuple.sampleRate>
	//   21   39:icmpne          68
			if(audioconfigurationtuple.mimeType != null)
	//*  22   42:aload_2         
	//*  23   43:getfield        #245 <Field String DefaultTrackSelector$AudioConfigurationTuple.mimeType>
	//*  24   46:ifnull          66
			{
				flag = flag1;
	//   25   49:iload           4
	//   26   51:istore_3        
				if(!TextUtils.equals(((CharSequence) (audioconfigurationtuple.mimeType)), ((CharSequence) (format.sampleMimeType))))
					break label0;
	//   27   52:aload_2         
	//   28   53:getfield        #245 <Field String DefaultTrackSelector$AudioConfigurationTuple.mimeType>
	//   29   56:aload_0         
	//   30   57:getfield        #162 <Field String Format.sampleMimeType>
	//   31   60:invokestatic    #129 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   32   63:ifeq            68
			}
			flag = true;
	//   33   66:iconst_1        
	//   34   67:istore_3        
		}
		return flag;
	//   35   68:iload_3         
	//   36   69:ireturn         
	}

	private static boolean isSupportedAdaptiveVideoTrack(Format format, String s, int i, int j, int k, int l, int i1)
	{
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
			flag = flag1;
	//    2    3:iload           8
	//    3    5:istore          7
			if(!isSupported(i, false))
				break label0;
	//    4    7:iload_2         
	//    5    8:iconst_0        
	//    6    9:invokestatic    #240 <Method boolean isSupported(int, boolean)>
	//    7   12:ifeq            110
			flag = flag1;
	//    8   15:iload           8
	//    9   17:istore          7
			if((i & j) == 0)
				break label0;
	//   10   19:iload_2         
	//   11   20:iload_3         
	//   12   21:iand            
	//   13   22:ifeq            110
			if(s != null)
	//*  14   25:aload_1         
	//*  15   26:ifnull          44
			{
				flag = flag1;
	//   16   29:iload           8
	//   17   31:istore          7
				if(!Util.areEqual(((Object) (format.sampleMimeType)), ((Object) (s))))
					break label0;
	//   18   33:aload_0         
	//   19   34:getfield        #162 <Field String Format.sampleMimeType>
	//   20   37:aload_1         
	//   21   38:invokestatic    #249 <Method boolean Util.areEqual(Object, Object)>
	//   22   41:ifeq            110
			}
			if(format.width != -1)
	//*  23   44:aload_0         
	//*  24   45:getfield        #218 <Field int Format.width>
	//*  25   48:iconst_m1       
	//*  26   49:icmpeq          65
			{
				flag = flag1;
	//   27   52:iload           8
	//   28   54:istore          7
				if(format.width > k)
					break label0;
	//   29   56:aload_0         
	//   30   57:getfield        #218 <Field int Format.width>
	//   31   60:iload           4
	//   32   62:icmpgt          110
			}
			if(format.height != -1)
	//*  33   65:aload_0         
	//*  34   66:getfield        #221 <Field int Format.height>
	//*  35   69:iconst_m1       
	//*  36   70:icmpeq          86
			{
				flag = flag1;
	//   37   73:iload           8
	//   38   75:istore          7
				if(format.height > l)
					break label0;
	//   39   77:aload_0         
	//   40   78:getfield        #221 <Field int Format.height>
	//   41   81:iload           5
	//   42   83:icmpgt          110
			}
			if(format.bitrate != -1)
	//*  43   86:aload_0         
	//*  44   87:getfield        #252 <Field int Format.bitrate>
	//*  45   90:iconst_m1       
	//*  46   91:icmpeq          107
			{
				flag = flag1;
	//   47   94:iload           8
	//   48   96:istore          7
				if(format.bitrate > i1)
					break label0;
	//   49   98:aload_0         
	//   50   99:getfield        #252 <Field int Format.bitrate>
	//   51  102:iload           6
	//   52  104:icmpgt          110
			}
			flag = true;
	//   53  107:iconst_1        
	//   54  108:istore          7
		}
		return flag;
	//   55  110:iload           7
	//   56  112:ireturn         
	}

	private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedtrackinfo, int ai[][][], RendererConfiguration arendererconfiguration[], TrackSelection atrackselection[], int i)
	{
		int j;
		int k;
		int l;
		boolean flag1;
		if(i == 0)
	//*   0    0:iload           4
	//*   1    2:ifne            6
			return;
	//    2    5:return          
		flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          10
		j = 0;
	//    5    9:iconst_0        
	//    6   10:istore          5
		l = -1;
	//    7   12:iconst_m1       
	//    8   13:istore          7
		k = l;
	//    9   15:iload           7
	//   10   17:istore          6
_L8:
		if(j >= mappedtrackinfo.getRendererCount()) goto _L2; else goto _L1
	//   11   19:iload           5
	//   12   21:aload_0         
	//   13   22:invokevirtual   #259 <Method int MappingTrackSelector$MappedTrackInfo.getRendererCount()>
	//   14   25:icmpge          164
_L1:
		int i1;
		int j1;
		int k1;
		k1 = mappedtrackinfo.getRendererType(j);
	//   15   28:aload_0         
	//   16   29:iload           5
	//   17   31:invokevirtual   #263 <Method int MappingTrackSelector$MappedTrackInfo.getRendererType(int)>
	//   18   34:istore          11
		TrackSelection trackselection = atrackselection[j];
	//   19   36:aload_3         
	//   20   37:iload           5
	//   21   39:aaload          
	//   22   40:astore          12
		if(k1 != 1)
	//*  23   42:iload           11
	//*  24   44:iconst_1        
	//*  25   45:icmpeq          62
		{
			i1 = l;
	//   26   48:iload           7
	//   27   50:istore          8
			j1 = k;
	//   28   52:iload           6
	//   29   54:istore          9
			if(k1 != 2)
				break MISSING_BLOCK_LABEL_147;
	//   30   56:iload           11
	//   31   58:iconst_2        
	//   32   59:icmpne          147
		}
		i1 = l;
	//   33   62:iload           7
	//   34   64:istore          8
		j1 = k;
	//   35   66:iload           6
	//   36   68:istore          9
		if(trackselection == null)
			break MISSING_BLOCK_LABEL_147;
	//   37   70:aload           12
	//   38   72:ifnull          147
		i1 = l;
	//   39   75:iload           7
	//   40   77:istore          8
		j1 = k;
	//   41   79:iload           6
	//   42   81:istore          9
		if(!rendererSupportsTunneling(ai[j], mappedtrackinfo.getTrackGroups(j), trackselection))
			break MISSING_BLOCK_LABEL_147;
	//   43   83:aload_1         
	//   44   84:iload           5
	//   45   86:aaload          
	//   46   87:aload_0         
	//   47   88:iload           5
	//   48   90:invokevirtual   #267 <Method TrackGroupArray MappingTrackSelector$MappedTrackInfo.getTrackGroups(int)>
	//   49   93:aload           12
	//   50   95:invokestatic    #271 <Method boolean rendererSupportsTunneling(int[][], TrackGroupArray, TrackSelection)>
	//   51   98:ifeq            147
		if(k1 != 1) goto _L4; else goto _L3
	//   52  101:iload           11
	//   53  103:iconst_1        
	//   54  104:icmpne          130
_L3:
		if(l == -1) goto _L6; else goto _L5
	//   55  107:iload           7
	//   56  109:iconst_m1       
	//   57  110:icmpeq          119
_L5:
		j = 0;
	//   58  113:iconst_0        
	//   59  114:istore          5
		break MISSING_BLOCK_LABEL_167;
	//   60  116:goto            167
_L6:
		i1 = j;
	//   61  119:iload           5
	//   62  121:istore          8
		j1 = k;
	//   63  123:iload           6
	//   64  125:istore          9
		break MISSING_BLOCK_LABEL_147;
	//   65  127:goto            147
_L4:
		if(k == -1) goto _L7; else goto _L5
	//   66  130:iload           6
	//   67  132:iconst_m1       
	//   68  133:icmpeq          139
	//*  69  136:goto            113
_L7:
		j1 = j;
	//   70  139:iload           5
	//   71  141:istore          9
		i1 = l;
	//   72  143:iload           7
	//   73  145:istore          8
		j++;
	//   74  147:iload           5
	//   75  149:iconst_1        
	//   76  150:iadd            
	//   77  151:istore          5
		l = i1;
	//   78  153:iload           8
	//   79  155:istore          7
		k = j1;
	//   80  157:iload           9
	//   81  159:istore          6
		  goto _L8
	//*  82  161:goto            19
_L2:
		j = 1;
	//   83  164:iconst_1        
	//   84  165:istore          5
		boolean flag = flag1;
	//   85  167:iload           10
	//   86  169:istore          8
		if(l != -1)
	//*  87  171:iload           7
	//*  88  173:iconst_m1       
	//*  89  174:icmpeq          190
		{
			flag = flag1;
	//   90  177:iload           10
	//   91  179:istore          8
			if(k != -1)
	//*  92  181:iload           6
	//*  93  183:iconst_m1       
	//*  94  184:icmpeq          190
				flag = true;
	//   95  187:iconst_1        
	//   96  188:istore          8
		}
		if((j & flag) != 0)
	//*  97  190:iload           5
	//*  98  192:iload           8
	//*  99  194:iand            
	//* 100  195:ifeq            218
		{
			mappedtrackinfo = ((MappingTrackSelector.MappedTrackInfo) (new RendererConfiguration(i)));
	//  101  198:new             #273 <Class RendererConfiguration>
	//  102  201:dup             
	//  103  202:iload           4
	//  104  204:invokespecial   #274 <Method void RendererConfiguration(int)>
	//  105  207:astore_0        
			arendererconfiguration[l] = ((RendererConfiguration) (mappedtrackinfo));
	//  106  208:aload_2         
	//  107  209:iload           7
	//  108  211:aload_0         
	//  109  212:aastore         
			arendererconfiguration[k] = ((RendererConfiguration) (mappedtrackinfo));
	//  110  213:aload_2         
	//  111  214:iload           6
	//  112  216:aload_0         
	//  113  217:aastore         
		}
		return;
	//  114  218:return          
	}

	private static boolean rendererSupportsTunneling(int ai[][], TrackGroupArray trackgrouparray, TrackSelection trackselection)
	{
		if(trackselection == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int j = trackgrouparray.indexOf(trackselection.getTrackGroup());
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokeinterface #280 <Method TrackGroup TrackSelection.getTrackGroup()>
	//    7   13:invokevirtual   #286 <Method int TrackGroupArray.indexOf(TrackGroup)>
	//    8   16:istore          4
		for(int i = 0; i < trackselection.length(); i++)
	//*   9   18:iconst_0        
	//*  10   19:istore_3        
	//*  11   20:iload_3         
	//*  12   21:aload_2         
	//*  13   22:invokeinterface #288 <Method int TrackSelection.length()>
	//*  14   27:icmpge          59
			if((ai[j][trackselection.getIndexInTrackGroup(i)] & 0x20) != 32)
	//*  15   30:aload_0         
	//*  16   31:iload           4
	//*  17   33:aaload          
	//*  18   34:aload_2         
	//*  19   35:iload_3         
	//*  20   36:invokeinterface #291 <Method int TrackSelection.getIndexInTrackGroup(int)>
	//*  21   41:iaload          
	//*  22   42:bipush          32
	//*  23   44:iand            
	//*  24   45:bipush          32
	//*  25   47:icmpeq          52
				return false;
	//   26   50:iconst_0        
	//   27   51:ireturn         

	//   28   52:iload_3         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_3        
	//*  32   56:goto            20
		return true;
	//   33   59:iconst_1        
	//   34   60:ireturn         
	}

	private static TrackSelection selectAdaptiveVideoTrack(TrackGroupArray trackgrouparray, int ai[][], int i, Parameters parameters, TrackSelection.Factory factory)
		throws ExoPlaybackException
	{
		byte byte0;
		if(parameters.allowNonSeamlessAdaptiveness)
	//*   0    0:aload_3         
	//*   1    1:getfield        #299 <Field boolean DefaultTrackSelector$Parameters.allowNonSeamlessAdaptiveness>
	//*   2    4:ifeq            14
			byte0 = 24;
	//    3    7:bipush          24
	//    4    9:istore          5
		else
	//*   5   11:goto            18
			byte0 = 16;
	//    6   14:bipush          16
	//    7   16:istore          5
		boolean flag;
		if(parameters.allowMixedMimeAdaptiveness && (i & byte0) != 0)
	//*   8   18:aload_3         
	//*   9   19:getfield        #302 <Field boolean DefaultTrackSelector$Parameters.allowMixedMimeAdaptiveness>
	//*  10   22:ifeq            38
	//*  11   25:iload_2         
	//*  12   26:iload           5
	//*  13   28:iand            
	//*  14   29:ifeq            38
			flag = true;
	//   15   32:iconst_1        
	//   16   33:istore          6
		else
	//*  17   35:goto            41
			flag = false;
	//   18   38:iconst_0        
	//   19   39:istore          6
		for(i = 0; i < trackgrouparray.length; i++)
	//*  20   41:iconst_0        
	//*  21   42:istore_2        
	//*  22   43:iload_2         
	//*  23   44:aload_0         
	//*  24   45:getfield        #303 <Field int TrackGroupArray.length>
	//*  25   48:icmpge          127
		{
			TrackGroup trackgroup = trackgrouparray.get(i);
	//   26   51:aload_0         
	//   27   52:iload_2         
	//   28   53:invokevirtual   #306 <Method TrackGroup TrackGroupArray.get(int)>
	//   29   56:astore          7
			int ai1[] = getAdaptiveVideoTracksForGroup(trackgroup, ai[i], flag, ((int) (byte0)), parameters.maxVideoWidth, parameters.maxVideoHeight, parameters.maxVideoBitrate, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
	//   30   58:aload           7
	//   31   60:aload_1         
	//   32   61:iload_2         
	//   33   62:aaload          
	//   34   63:iload           6
	//   35   65:iload           5
	//   36   67:aload_3         
	//   37   68:getfield        #309 <Field int DefaultTrackSelector$Parameters.maxVideoWidth>
	//   38   71:aload_3         
	//   39   72:getfield        #312 <Field int DefaultTrackSelector$Parameters.maxVideoHeight>
	//   40   75:aload_3         
	//   41   76:getfield        #315 <Field int DefaultTrackSelector$Parameters.maxVideoBitrate>
	//   42   79:aload_3         
	//   43   80:getfield        #318 <Field int DefaultTrackSelector$Parameters.viewportWidth>
	//   44   83:aload_3         
	//   45   84:getfield        #321 <Field int DefaultTrackSelector$Parameters.viewportHeight>
	//   46   87:aload_3         
	//   47   88:getfield        #324 <Field boolean DefaultTrackSelector$Parameters.viewportOrientationMayChange>
	//   48   91:invokestatic    #326 <Method int[] getAdaptiveVideoTracksForGroup(TrackGroup, int[], boolean, int, int, int, int, int, int, boolean)>
	//   49   94:astore          8
			if(ai1.length > 0)
	//*  50   96:aload           8
	//*  51   98:arraylength     
	//*  52   99:ifle            120
				return ((TrackSelection.Factory)Assertions.checkNotNull(((Object) (factory)))).createTrackSelection(trackgroup, ai1);
	//   53  102:aload           4
	//   54  104:invokestatic    #177 <Method Object Assertions.checkNotNull(Object)>
	//   55  107:checkcast       #47  <Class TrackSelection$Factory>
	//   56  110:aload           7
	//   57  112:aload           8
	//   58  114:invokeinterface #330 <Method TrackSelection TrackSelection$Factory.createTrackSelection(TrackGroup, int[])>
	//   59  119:areturn         
		}

	//   60  120:iload_2         
	//   61  121:iconst_1        
	//   62  122:iadd            
	//   63  123:istore_2        
	//*  64  124:goto            43
		return null;
	//   65  127:aconst_null     
	//   66  128:areturn         
	}

	private static TrackSelection selectFixedVideoTrack(TrackGroupArray trackgrouparray, int ai[][], Parameters parameters)
	{
		int i;
		int j;
		int k;
		int l;
		int l1;
		TrackGroup trackgroup;
		k = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          5
		l = k;
	//    2    3:iload           5
	//    3    5:istore          6
		l1 = 0;
	//    4    7:iconst_0        
	//    5    8:istore          10
		trackgroup = null;
	//    6   10:aconst_null     
	//    7   11:astore          13
		i = 0;
	//    8   13:iconst_0        
	//    9   14:istore_3        
		j = 0;
	//   10   15:iconst_0        
	//   11   16:istore          4
_L11:
		int i1;
		Object obj;
		List list;
		int ai1[];
		obj = ((Object) (trackgrouparray));
	//   12   18:aload_0         
	//   13   19:astore          14
		if(l1 >= ((TrackGroupArray) (obj)).length)
			break; /* Loop/switch isn't completed */
	//   14   21:iload           10
	//   15   23:aload           14
	//   16   25:getfield        #303 <Field int TrackGroupArray.length>
	//   17   28:icmpge          452
		obj = ((Object) (((TrackGroupArray) (obj)).get(l1)));
	//   18   31:aload           14
	//   19   33:iload           10
	//   20   35:invokevirtual   #306 <Method TrackGroup TrackGroupArray.get(int)>
	//   21   38:astore          14
		list = getViewportFilteredTrackIndices(((TrackGroup) (obj)), parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
	//   22   40:aload           14
	//   23   42:aload_2         
	//   24   43:getfield        #318 <Field int DefaultTrackSelector$Parameters.viewportWidth>
	//   25   46:aload_2         
	//   26   47:getfield        #321 <Field int DefaultTrackSelector$Parameters.viewportHeight>
	//   27   50:aload_2         
	//   28   51:getfield        #324 <Field boolean DefaultTrackSelector$Parameters.viewportOrientationMayChange>
	//   29   54:invokestatic    #186 <Method List getViewportFilteredTrackIndices(TrackGroup, int, int, boolean)>
	//   30   57:astore          15
		ai1 = ai[l1];
	//   31   59:aload_1         
	//   32   60:iload           10
	//   33   62:aaload          
	//   34   63:astore          16
		i1 = k;
	//   35   65:iload           5
	//   36   67:istore          7
		boolean flag = false;
	//   37   69:iconst_0        
	//   38   70:istore          8
		k = l;
	//   39   72:iload           6
	//   40   74:istore          5
		l = i1;
	//   41   76:iload           7
	//   42   78:istore          6
		i1 = j;
	//   43   80:iload           4
	//   44   82:istore          7
		j = ((int) (flag));
	//   45   84:iload           8
	//   46   86:istore          4
_L9:
		if(j >= ((TrackGroup) (obj)).length) goto _L2; else goto _L1
	//   47   88:iload           4
	//   48   90:aload           14
	//   49   92:getfield        #144 <Field int TrackGroup.length>
	//   50   95:icmpge          427
_L1:
		int j1;
		int k1;
		boolean flag1;
		boolean flag2;
		Format format;
		if(!isSupported(ai1[j], parameters.exceedRendererCapabilitiesIfNecessary))
			continue; /* Loop/switch isn't completed */
	//   51   98:aload           16
	//   52  100:iload           4
	//   53  102:iaload          
	//   54  103:aload_2         
	//   55  104:getfield        #337 <Field boolean DefaultTrackSelector$Parameters.exceedRendererCapabilitiesIfNecessary>
	//   56  107:invokestatic    #240 <Method boolean isSupported(int, boolean)>
	//   57  110:ifeq            418
		format = ((TrackGroup) (obj)).getFormat(j);
	//   58  113:aload           14
	//   59  115:iload           4
	//   60  117:invokevirtual   #100 <Method Format TrackGroup.getFormat(int)>
	//   61  120:astore          17
		if(list.contains(((Object) (Integer.valueOf(j)))) && (format.width == -1 || format.width <= parameters.maxVideoWidth) && (format.height == -1 || format.height <= parameters.maxVideoHeight) && (format.bitrate == -1 || format.bitrate <= parameters.maxVideoBitrate))
	//*  62  122:aload           15
	//*  63  124:iload           4
	//*  64  126:invokestatic    #213 <Method Integer Integer.valueOf(int)>
	//*  65  129:invokeinterface #340 <Method boolean List.contains(Object)>
	//*  66  134:ifeq            206
	//*  67  137:aload           17
	//*  68  139:getfield        #218 <Field int Format.width>
	//*  69  142:iconst_m1       
	//*  70  143:icmpeq          158
	//*  71  146:aload           17
	//*  72  148:getfield        #218 <Field int Format.width>
	//*  73  151:aload_2         
	//*  74  152:getfield        #309 <Field int DefaultTrackSelector$Parameters.maxVideoWidth>
	//*  75  155:icmpgt          206
	//*  76  158:aload           17
	//*  77  160:getfield        #221 <Field int Format.height>
	//*  78  163:iconst_m1       
	//*  79  164:icmpeq          179
	//*  80  167:aload           17
	//*  81  169:getfield        #221 <Field int Format.height>
	//*  82  172:aload_2         
	//*  83  173:getfield        #312 <Field int DefaultTrackSelector$Parameters.maxVideoHeight>
	//*  84  176:icmpgt          206
	//*  85  179:aload           17
	//*  86  181:getfield        #252 <Field int Format.bitrate>
	//*  87  184:iconst_m1       
	//*  88  185:icmpeq          200
	//*  89  188:aload           17
	//*  90  190:getfield        #252 <Field int Format.bitrate>
	//*  91  193:aload_2         
	//*  92  194:getfield        #315 <Field int DefaultTrackSelector$Parameters.maxVideoBitrate>
	//*  93  197:icmpgt          206
			flag1 = true;
	//   94  200:iconst_1        
	//   95  201:istore          11
		else
	//*  96  203:goto            209
			flag1 = false;
	//   97  206:iconst_0        
	//   98  207:istore          11
		if(!flag1 && !parameters.exceedVideoConstraintsIfNecessary)
	//*  99  209:iload           11
	//* 100  211:ifne            224
	//* 101  214:aload_2         
	//* 102  215:getfield        #343 <Field boolean DefaultTrackSelector$Parameters.exceedVideoConstraintsIfNecessary>
	//* 103  218:ifne            224
			continue; /* Loop/switch isn't completed */
	//  104  221:goto            418
		if(flag1)
	//* 105  224:iload           11
	//* 106  226:ifeq            235
			k1 = 2;
	//  107  229:iconst_2        
	//  108  230:istore          9
		else
	//* 109  232:goto            238
			k1 = 1;
	//  110  235:iconst_1        
	//  111  236:istore          9
		flag2 = isSupported(ai1[j], false);
	//  112  238:aload           16
	//  113  240:iload           4
	//  114  242:iaload          
	//  115  243:iconst_0        
	//  116  244:invokestatic    #240 <Method boolean isSupported(int, boolean)>
	//  117  247:istore          12
		j1 = k1;
	//  118  249:iload           9
	//  119  251:istore          8
		if(flag2)
	//* 120  253:iload           12
	//* 121  255:ifeq            266
			j1 = k1 + 1000;
	//  122  258:iload           9
	//  123  260:sipush          1000
	//  124  263:iadd            
	//  125  264:istore          8
		if(j1 > i1)
	//* 126  266:iload           8
	//* 127  268:iload           7
	//* 128  270:icmple          279
			k1 = 1;
	//  129  273:iconst_1        
	//  130  274:istore          9
		else
	//* 131  276:goto            282
			k1 = 0;
	//  132  279:iconst_0        
	//  133  280:istore          9
		if(j1 != i1) goto _L4; else goto _L3
	//  134  282:iload           8
	//  135  284:iload           7
	//  136  286:icmpne          385
_L3:
		if(!parameters.forceLowestBitrate) goto _L6; else goto _L5
	//  137  289:aload_2         
	//  138  290:getfield        #346 <Field boolean DefaultTrackSelector$Parameters.forceLowestBitrate>
	//  139  293:ifeq            321
_L5:
		if(compareFormatValues(format.bitrate, l) >= 0) goto _L8; else goto _L7
	//  140  296:aload           17
	//  141  298:getfield        #252 <Field int Format.bitrate>
	//  142  301:iload           6
	//  143  303:invokestatic    #348 <Method int compareFormatValues(int, int)>
	//  144  306:ifge            315
_L7:
		k1 = 1;
	//  145  309:iconst_1        
	//  146  310:istore          9
		  goto _L4
	//* 147  312:goto            385
_L8:
		k1 = 0;
	//  148  315:iconst_0        
	//  149  316:istore          9
		  goto _L4
	//* 150  318:goto            385
_L6:
		k1 = format.getPixelCount();
	//  151  321:aload           17
	//  152  323:invokevirtual   #234 <Method int Format.getPixelCount()>
	//  153  326:istore          9
		if(k1 != k)
	//* 154  328:iload           9
	//* 155  330:iload           5
	//* 156  332:icmpeq          347
			k1 = compareFormatValues(k1, k);
	//  157  335:iload           9
	//  158  337:iload           5
	//  159  339:invokestatic    #348 <Method int compareFormatValues(int, int)>
	//  160  342:istore          9
		else
	//* 161  344:goto            359
			k1 = compareFormatValues(format.bitrate, l);
	//  162  347:aload           17
	//  163  349:getfield        #252 <Field int Format.bitrate>
	//  164  352:iload           6
	//  165  354:invokestatic    #348 <Method int compareFormatValues(int, int)>
	//  166  357:istore          9
		if(!flag2 || !flag1 ? k1 >= 0 : k1 <= 0) goto _L8; else goto _L7
	//  167  359:iload           12
	//  168  361:ifeq            377
	//  169  364:iload           11
	//  170  366:ifeq            377
	//  171  369:iload           9
	//  172  371:ifle            315
	//  173  374:goto            309
	//  174  377:iload           9
	//  175  379:ifge            315
	//* 176  382:goto            309
_L4:
		if(k1 != 0)
	//* 177  385:iload           9
	//* 178  387:ifeq            418
		{
			l = format.bitrate;
	//  179  390:aload           17
	//  180  392:getfield        #252 <Field int Format.bitrate>
	//  181  395:istore          6
			k = format.getPixelCount();
	//  182  397:aload           17
	//  183  399:invokevirtual   #234 <Method int Format.getPixelCount()>
	//  184  402:istore          5
			i1 = j1;
	//  185  404:iload           8
	//  186  406:istore          7
			i = j;
	//  187  408:iload           4
	//  188  410:istore_3        
			trackgroup = ((TrackGroup) (obj));
	//  189  411:aload           14
	//  190  413:astore          13
		}
	//* 191  415:goto            418
		j++;
	//  192  418:iload           4
	//  193  420:iconst_1        
	//  194  421:iadd            
	//  195  422:istore          4
		  goto _L9
	//* 196  424:goto            88
_L2:
		l1++;
	//  197  427:iload           10
	//  198  429:iconst_1        
	//  199  430:iadd            
	//  200  431:istore          10
		j = i1;
	//  201  433:iload           7
	//  202  435:istore          4
		i1 = k;
	//  203  437:iload           5
	//  204  439:istore          7
		k = l;
	//  205  441:iload           6
	//  206  443:istore          5
		l = i1;
	//  207  445:iload           7
	//  208  447:istore          6
		if(true) goto _L11; else goto _L10
	//  209  449:goto            18
_L10:
		if(trackgroup == null)
	//* 210  452:aload           13
	//* 211  454:ifnonnull       459
			return null;
	//  212  457:aconst_null     
	//  213  458:areturn         
		else
			return ((TrackSelection) (new FixedTrackSelection(trackgroup, i)));
	//  214  459:new             #350 <Class FixedTrackSelection>
	//  215  462:dup             
	//  216  463:aload           13
	//  217  465:iload_3         
	//  218  466:invokespecial   #353 <Method void FixedTrackSelection(TrackGroup, int)>
	//  219  469:areturn         
	}

	public ParametersBuilder buildUponParameters()
	{
		return getParameters().buildUpon();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #359 <Method DefaultTrackSelector$Parameters getParameters()>
	//    2    4:invokevirtual   #362 <Method DefaultTrackSelector$ParametersBuilder DefaultTrackSelector$Parameters.buildUpon()>
	//    3    7:areturn         
	}

	public final void clearSelectionOverride(int i, TrackGroupArray trackgrouparray)
	{
		setParameters(buildUponParameters().clearSelectionOverride(i, trackgrouparray));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #367 <Method DefaultTrackSelector$ParametersBuilder buildUponParameters()>
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #370 <Method DefaultTrackSelector$ParametersBuilder DefaultTrackSelector$ParametersBuilder.clearSelectionOverride(int, TrackGroupArray)>
	//    6   10:invokevirtual   #374 <Method void setParameters(DefaultTrackSelector$ParametersBuilder)>
	//    7   13:return          
	}

	public final void clearSelectionOverrides()
	{
		setParameters(buildUponParameters().clearSelectionOverrides());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #367 <Method DefaultTrackSelector$ParametersBuilder buildUponParameters()>
	//    3    5:invokevirtual   #378 <Method DefaultTrackSelector$ParametersBuilder DefaultTrackSelector$ParametersBuilder.clearSelectionOverrides()>
	//    4    8:invokevirtual   #374 <Method void setParameters(DefaultTrackSelector$ParametersBuilder)>
	//    5   11:return          
	}

	public final void clearSelectionOverrides(int i)
	{
		setParameters(buildUponParameters().clearSelectionOverrides(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #367 <Method DefaultTrackSelector$ParametersBuilder buildUponParameters()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #381 <Method DefaultTrackSelector$ParametersBuilder DefaultTrackSelector$ParametersBuilder.clearSelectionOverrides(int)>
	//    5    9:invokevirtual   #374 <Method void setParameters(DefaultTrackSelector$ParametersBuilder)>
	//    6   12:return          
	}

	public Parameters getParameters()
	{
		return (Parameters)parametersReference.get();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AtomicReference parametersReference>
	//    2    4:invokevirtual   #384 <Method Object AtomicReference.get()>
	//    3    7:checkcast       #14  <Class DefaultTrackSelector$Parameters>
	//    4   10:areturn         
	}

	public final boolean getRendererDisabled(int i)
	{
		return getParameters().getRendererDisabled(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #359 <Method DefaultTrackSelector$Parameters getParameters()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #388 <Method boolean DefaultTrackSelector$Parameters.getRendererDisabled(int)>
	//    4    8:ireturn         
	}

	public final SelectionOverride getSelectionOverride(int i, TrackGroupArray trackgrouparray)
	{
		return getParameters().getSelectionOverride(i, trackgrouparray);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #359 <Method DefaultTrackSelector$Parameters getParameters()>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #392 <Method DefaultTrackSelector$SelectionOverride DefaultTrackSelector$Parameters.getSelectionOverride(int, TrackGroupArray)>
	//    5    9:areturn         
	}

	public final boolean hasSelectionOverride(int i, TrackGroupArray trackgrouparray)
	{
		return getParameters().hasSelectionOverride(i, trackgrouparray);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #359 <Method DefaultTrackSelector$Parameters getParameters()>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #396 <Method boolean DefaultTrackSelector$Parameters.hasSelectionOverride(int, TrackGroupArray)>
	//    5    9:ireturn         
	}

	protected TrackSelection[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedtrackinfo, int ai[][][], int ai1[], Parameters parameters)
		throws ExoPlaybackException
	{
		int j1 = mappedtrackinfo.getRendererCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #259 <Method int MappingTrackSelector$MappedTrackInfo.getRendererCount()>
	//    2    4:istore          11
		TrackSelection atrackselection[] = new TrackSelection[j1];
	//    3    6:iload           11
	//    4    8:anewarray       TrackSelection[]
	//    5   11:astore          14
		boolean flag1 = false;
	//    6   13:iconst_0        
	//    7   14:istore          6
		boolean flag = flag1;
	//    8   16:iload           6
	//    9   18:istore          5
		boolean flag2 = flag;
	//   10   20:iload           5
	//   11   22:istore          7
		int k = ((int) (flag));
	//   12   24:iload           5
	//   13   26:istore          8
		do
		{
			boolean flag4 = true;
	//   14   28:iconst_1        
	//   15   29:istore          10
			if(k >= j1)
				break;
	//   16   31:iload           8
	//   17   33:iload           11
	//   18   35:icmpge          157
			flag = flag1;
	//   19   38:iload           6
	//   20   40:istore          5
			boolean flag3 = flag2;
	//   21   42:iload           7
	//   22   44:istore          9
			if(2 == mappedtrackinfo.getRendererType(k))
	//*  23   46:iconst_2        
	//*  24   47:aload_1         
	//*  25   48:iload           8
	//*  26   50:invokevirtual   #263 <Method int MappingTrackSelector$MappedTrackInfo.getRendererType(int)>
	//*  27   53:icmpne          140
			{
				flag = flag1;
	//   28   56:iload           6
	//   29   58:istore          5
				if(!flag1)
	//*  30   60:iload           6
	//*  31   62:ifne            111
				{
					atrackselection[k] = selectVideoTrack(mappedtrackinfo.getTrackGroups(k), ai[k], ai1[k], parameters, adaptiveTrackSelectionFactory);
	//   32   65:aload           14
	//   33   67:iload           8
	//   34   69:aload_0         
	//   35   70:aload_1         
	//   36   71:iload           8
	//   37   73:invokevirtual   #267 <Method TrackGroupArray MappingTrackSelector$MappedTrackInfo.getTrackGroups(int)>
	//   38   76:aload_2         
	//   39   77:iload           8
	//   40   79:aaload          
	//   41   80:aload_3         
	//   42   81:iload           8
	//   43   83:iaload          
	//   44   84:aload           4
	//   45   86:aload_0         
	//   46   87:getfield        #54  <Field TrackSelection$Factory adaptiveTrackSelectionFactory>
	//   47   90:invokevirtual   #401 <Method TrackSelection selectVideoTrack(TrackGroupArray, int[][], int, DefaultTrackSelector$Parameters, TrackSelection$Factory)>
	//   48   93:aastore         
					if(atrackselection[k] != null)
	//*  49   94:aload           14
	//*  50   96:iload           8
	//*  51   98:aaload          
	//*  52   99:ifnull          108
						flag = true;
	//   53  102:iconst_1        
	//   54  103:istore          5
					else
	//*  55  105:goto            111
						flag = false;
	//   56  108:iconst_0        
	//   57  109:istore          5
				}
				if(mappedtrackinfo.getTrackGroups(k).length > 0)
	//*  58  111:aload_1         
	//*  59  112:iload           8
	//*  60  114:invokevirtual   #267 <Method TrackGroupArray MappingTrackSelector$MappedTrackInfo.getTrackGroups(int)>
	//*  61  117:getfield        #303 <Field int TrackGroupArray.length>
	//*  62  120:ifle            130
					flag1 = flag4;
	//   63  123:iload           10
	//   64  125:istore          6
				else
	//*  65  127:goto            133
					flag1 = false;
	//   66  130:iconst_0        
	//   67  131:istore          6
				flag3 = flag2 | flag1;
	//   68  133:iload           7
	//   69  135:iload           6
	//   70  137:ior             
	//   71  138:istore          9
			}
			k++;
	//   72  140:iload           8
	//   73  142:iconst_1        
	//   74  143:iadd            
	//   75  144:istore          8
			flag1 = flag;
	//   76  146:iload           5
	//   77  148:istore          6
			flag2 = flag3;
	//   78  150:iload           9
	//   79  152:istore          7
		} while(true);
	//   80  154:goto            28
		k = 0;
	//   81  157:iconst_0        
	//   82  158:istore          8
		flag = ((boolean) (k));
	//   83  160:iload           8
	//   84  162:istore          5
		int l = ((int) (flag));
	//   85  164:iload           5
	//   86  166:istore          9
		for(int j = ((int) (flag)); j < j1;)
	//*  87  168:iload           5
	//*  88  170:istore          6
	//*  89  172:iload           6
	//*  90  174:iload           11
	//*  91  176:icmpge          434
		{
			int k1 = mappedtrackinfo.getRendererType(j);
	//   92  179:aload_1         
	//   93  180:iload           6
	//   94  182:invokevirtual   #263 <Method int MappingTrackSelector$MappedTrackInfo.getRendererType(int)>
	//   95  185:istore          12
			int i = k;
	//   96  187:iload           8
	//   97  189:istore          5
			int i1 = l;
	//   98  191:iload           9
	//   99  193:istore          10
			switch(k1)
	//* 100  195:iload           12
			{
	//* 101  197:tableswitch     1 3: default 224
	//	               1 320
	//	               2 417
	//	               3 258
			default:
				atrackselection[j] = selectOtherTrack(k1, mappedtrackinfo.getTrackGroups(j), ai[j], parameters);
	//  102  224:aload           14
	//  103  226:iload           6
	//  104  228:aload_0         
	//  105  229:iload           12
	//  106  231:aload_1         
	//  107  232:iload           6
	//  108  234:invokevirtual   #267 <Method TrackGroupArray MappingTrackSelector$MappedTrackInfo.getTrackGroups(int)>
	//  109  237:aload_2         
	//  110  238:iload           6
	//  111  240:aaload          
	//  112  241:aload           4
	//  113  243:invokevirtual   #405 <Method TrackSelection selectOtherTrack(int, TrackGroupArray, int[][], DefaultTrackSelector$Parameters)>
	//  114  246:aastore         
				i = k;
	//  115  247:iload           8
	//  116  249:istore          5
				i1 = l;
	//  117  251:iload           9
	//  118  253:istore          10
				break;
	//  119  255:goto            417

			case 2: // '\002'
				break;

			case 3: // '\003'
				i = k;
	//  120  258:iload           8
	//  121  260:istore          5
				i1 = l;
	//  122  262:iload           9
	//  123  264:istore          10
				if(l != 0)
					break;
	//  124  266:iload           9
	//  125  268:ifne            417
				atrackselection[j] = selectTextTrack(mappedtrackinfo.getTrackGroups(j), ai[j], parameters);
	//  126  271:aload           14
	//  127  273:iload           6
	//  128  275:aload_0         
	//  129  276:aload_1         
	//  130  277:iload           6
	//  131  279:invokevirtual   #267 <Method TrackGroupArray MappingTrackSelector$MappedTrackInfo.getTrackGroups(int)>
	//  132  282:aload_2         
	//  133  283:iload           6
	//  134  285:aaload          
	//  135  286:aload           4
	//  136  288:invokevirtual   #408 <Method TrackSelection selectTextTrack(TrackGroupArray, int[][], DefaultTrackSelector$Parameters)>
	//  137  291:aastore         
				if(atrackselection[j] != null)
	//* 138  292:aload           14
	//* 139  294:iload           6
	//* 140  296:aaload          
	//* 141  297:ifnull          306
					i = 1;
	//  142  300:iconst_1        
	//  143  301:istore          5
				else
	//* 144  303:goto            309
					i = 0;
	//  145  306:iconst_0        
	//  146  307:istore          5
				i1 = i;
	//  147  309:iload           5
	//  148  311:istore          10
				i = k;
	//  149  313:iload           8
	//  150  315:istore          5
				break;
	//  151  317:goto            417

			case 1: // '\001'
				i = k;
	//  152  320:iload           8
	//  153  322:istore          5
				i1 = l;
	//  154  324:iload           9
	//  155  326:istore          10
				if(k != 0)
					break;
	//  156  328:iload           8
	//  157  330:ifne            417
				TrackGroupArray trackgrouparray = mappedtrackinfo.getTrackGroups(j);
	//  158  333:aload_1         
	//  159  334:iload           6
	//  160  336:invokevirtual   #267 <Method TrackGroupArray MappingTrackSelector$MappedTrackInfo.getTrackGroups(int)>
	//  161  339:astore          15
				int ai2[][] = ai[j];
	//  162  341:aload_2         
	//  163  342:iload           6
	//  164  344:aaload          
	//  165  345:astore          16
				i = ai1[j];
	//  166  347:aload_3         
	//  167  348:iload           6
	//  168  350:iaload          
	//  169  351:istore          5
				TrackSelection.Factory factory;
				if(flag2)
	//* 170  353:iload           7
	//* 171  355:ifeq            364
					factory = null;
	//  172  358:aconst_null     
	//  173  359:astore          13
				else
	//* 174  361:goto            373
					factory = adaptiveTrackSelectionFactory;
	//  175  364:aload_0         
	//  176  365:getfield        #54  <Field TrackSelection$Factory adaptiveTrackSelectionFactory>
	//  177  368:astore          13
	//* 178  370:goto            361
				atrackselection[j] = selectAudioTrack(trackgrouparray, ai2, i, parameters, factory);
	//  179  373:aload           14
	//  180  375:iload           6
	//  181  377:aload_0         
	//  182  378:aload           15
	//  183  380:aload           16
	//  184  382:iload           5
	//  185  384:aload           4
	//  186  386:aload           13
	//  187  388:invokevirtual   #411 <Method TrackSelection selectAudioTrack(TrackGroupArray, int[][], int, DefaultTrackSelector$Parameters, TrackSelection$Factory)>
	//  188  391:aastore         
				if(atrackselection[j] != null)
	//* 189  392:aload           14
	//* 190  394:iload           6
	//* 191  396:aaload          
	//* 192  397:ifnull          410
				{
					i = 1;
	//  193  400:iconst_1        
	//  194  401:istore          5
					i1 = l;
	//  195  403:iload           9
	//  196  405:istore          10
				} else
	//* 197  407:goto            417
				{
					i = 0;
	//  198  410:iconst_0        
	//  199  411:istore          5
					i1 = l;
	//  200  413:iload           9
	//  201  415:istore          10
				}
				break;
			}
			j++;
	//  202  417:iload           6
	//  203  419:iconst_1        
	//  204  420:iadd            
	//  205  421:istore          6
			k = i;
	//  206  423:iload           5
	//  207  425:istore          8
			l = i1;
	//  208  427:iload           10
	//  209  429:istore          9
		}

	//* 210  431:goto            172
		return atrackselection;
	//  211  434:aload           14
	//  212  436:areturn         
	}

	protected TrackSelection selectAudioTrack(TrackGroupArray trackgrouparray, int ai[][], int i, Parameters parameters, TrackSelection.Factory factory)
		throws ExoPlaybackException
	{
		AudioTrackScore audiotrackscore = null;
	//    0    0:aconst_null     
	//    1    1:astore          11
		int j = -1;
	//    2    3:iconst_m1       
	//    3    4:istore          6
		int k = j;
	//    4    6:iload           6
	//    5    8:istore          7
		i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_3        
		do
		{
			if(i >= trackgrouparray.length)
				break;
	//    8   12:iload_3         
	//    9   13:aload_1         
	//   10   14:getfield        #303 <Field int TrackGroupArray.length>
	//   11   17:icmpge          182
			TrackGroup trackgroup = trackgrouparray.get(i);
	//   12   20:aload_1         
	//   13   21:iload_3         
	//   14   22:invokevirtual   #306 <Method TrackGroup TrackGroupArray.get(int)>
	//   15   25:astore          14
			int ai1[] = ai[i];
	//   16   27:aload_2         
	//   17   28:iload_3         
	//   18   29:aaload          
	//   19   30:astore          15
			int l = j;
	//   20   32:iload           6
	//   21   34:istore          8
			boolean flag = false;
	//   22   36:iconst_0        
	//   23   37:istore          9
			j = k;
	//   24   39:iload           7
	//   25   41:istore          6
			for(k = ((int) (flag)); k < trackgroup.length;)
	//*  26   43:iload           9
	//*  27   45:istore          7
	//*  28   47:iload           7
	//*  29   49:aload           14
	//*  30   51:getfield        #144 <Field int TrackGroup.length>
	//*  31   54:icmpge          167
			{
				int i1;
				int j1;
				AudioTrackScore audiotrackscore1;
label0:
				{
					j1 = l;
	//   32   57:iload           8
	//   33   59:istore          10
					audiotrackscore1 = audiotrackscore;
	//   34   61:aload           11
	//   35   63:astore          12
					i1 = j;
	//   36   65:iload           6
	//   37   67:istore          9
					if(!isSupported(ai1[k], parameters.exceedRendererCapabilitiesIfNecessary))
						break label0;
	//   38   69:aload           15
	//   39   71:iload           7
	//   40   73:iaload          
	//   41   74:aload           4
	//   42   76:getfield        #337 <Field boolean DefaultTrackSelector$Parameters.exceedRendererCapabilitiesIfNecessary>
	//   43   79:invokestatic    #240 <Method boolean isSupported(int, boolean)>
	//   44   82:ifeq            146
					AudioTrackScore audiotrackscore2 = new AudioTrackScore(trackgroup.getFormat(k), parameters, ai1[k]);
	//   45   85:new             #11  <Class DefaultTrackSelector$AudioTrackScore>
	//   46   88:dup             
	//   47   89:aload           14
	//   48   91:iload           7
	//   49   93:invokevirtual   #100 <Method Format TrackGroup.getFormat(int)>
	//   50   96:aload           4
	//   51   98:aload           15
	//   52  100:iload           7
	//   53  102:iaload          
	//   54  103:invokespecial   #414 <Method void DefaultTrackSelector$AudioTrackScore(Format, DefaultTrackSelector$Parameters, int)>
	//   55  106:astore          13
					if(audiotrackscore != null)
	//*  56  108:aload           11
	//*  57  110:ifnull          135
					{
						j1 = l;
	//   58  113:iload           8
	//   59  115:istore          10
						audiotrackscore1 = audiotrackscore;
	//   60  117:aload           11
	//   61  119:astore          12
						i1 = j;
	//   62  121:iload           6
	//   63  123:istore          9
						if(audiotrackscore2.compareTo(audiotrackscore) <= 0)
							break label0;
	//   64  125:aload           13
	//   65  127:aload           11
	//   66  129:invokevirtual   #418 <Method int DefaultTrackSelector$AudioTrackScore.compareTo(DefaultTrackSelector$AudioTrackScore)>
	//   67  132:ifle            146
					}
					j1 = i;
	//   68  135:iload_3         
	//   69  136:istore          10
					i1 = k;
	//   70  138:iload           7
	//   71  140:istore          9
					audiotrackscore1 = audiotrackscore2;
	//   72  142:aload           13
	//   73  144:astore          12
				}
				k++;
	//   74  146:iload           7
	//   75  148:iconst_1        
	//   76  149:iadd            
	//   77  150:istore          7
				l = j1;
	//   78  152:iload           10
	//   79  154:istore          8
				audiotrackscore = audiotrackscore1;
	//   80  156:aload           12
	//   81  158:astore          11
				j = i1;
	//   82  160:iload           9
	//   83  162:istore          6
			}

	//*  84  164:goto            47
			i++;
	//   85  167:iload_3         
	//   86  168:iconst_1        
	//   87  169:iadd            
	//   88  170:istore_3        
			k = j;
	//   89  171:iload           6
	//   90  173:istore          7
			j = l;
	//   91  175:iload           8
	//   92  177:istore          6
		} while(true);
	//   93  179:goto            12
		if(j == -1)
	//*  94  182:iload           6
	//*  95  184:iconst_m1       
	//*  96  185:icmpne          190
			return null;
	//   97  188:aconst_null     
	//   98  189:areturn         
		trackgrouparray = ((TrackGroupArray) (trackgrouparray.get(j)));
	//   99  190:aload_1         
	//  100  191:iload           6
	//  101  193:invokevirtual   #306 <Method TrackGroup TrackGroupArray.get(int)>
	//  102  196:astore_1        
		if(!parameters.forceLowestBitrate && factory != null)
	//* 103  197:aload           4
	//* 104  199:getfield        #346 <Field boolean DefaultTrackSelector$Parameters.forceLowestBitrate>
	//* 105  202:ifne            239
	//* 106  205:aload           5
	//* 107  207:ifnull          239
		{
			ai = ((int [][]) (getAdaptiveAudioTracks(((TrackGroup) (trackgrouparray)), ai[j], parameters.allowMixedMimeAdaptiveness)));
	//  108  210:aload_1         
	//  109  211:aload_2         
	//  110  212:iload           6
	//  111  214:aaload          
	//  112  215:aload           4
	//  113  217:getfield        #302 <Field boolean DefaultTrackSelector$Parameters.allowMixedMimeAdaptiveness>
	//  114  220:invokestatic    #420 <Method int[] getAdaptiveAudioTracks(TrackGroup, int[], boolean)>
	//  115  223:astore_2        
			if(ai.length > 0)
	//* 116  224:aload_2         
	//* 117  225:arraylength     
	//* 118  226:ifle            239
				return factory.createTrackSelection(((TrackGroup) (trackgrouparray)), ((int []) (ai)));
	//  119  229:aload           5
	//  120  231:aload_1         
	//  121  232:aload_2         
	//  122  233:invokeinterface #330 <Method TrackSelection TrackSelection$Factory.createTrackSelection(TrackGroup, int[])>
	//  123  238:areturn         
		}
		return ((TrackSelection) (new FixedTrackSelection(((TrackGroup) (trackgrouparray)), k)));
	//  124  239:new             #350 <Class FixedTrackSelection>
	//  125  242:dup             
	//  126  243:aload_1         
	//  127  244:iload           7
	//  128  246:invokespecial   #353 <Method void FixedTrackSelection(TrackGroup, int)>
	//  129  249:areturn         
	}

	protected TrackSelection selectOtherTrack(int i, TrackGroupArray trackgrouparray, int ai[][], Parameters parameters)
		throws ExoPlaybackException
	{
		TrackGroup trackgroup = null;
	//    0    0:aconst_null     
	//    1    1:astore          11
		int j1 = 0;
	//    2    3:iconst_0        
	//    3    4:istore          9
		i = j1;
	//    4    6:iload           9
	//    5    8:istore_1        
		int j = i;
	//    6    9:iload_1         
	//    7   10:istore          5
		while(j1 < trackgrouparray.length) 
	//*   8   12:iload           9
	//*   9   14:aload_2         
	//*  10   15:getfield        #303 <Field int TrackGroupArray.length>
	//*  11   18:icmpge          212
		{
			TrackGroup trackgroup2 = trackgrouparray.get(j1);
	//   12   21:aload_2         
	//   13   22:iload           9
	//   14   24:invokevirtual   #306 <Method TrackGroup TrackGroupArray.get(int)>
	//   15   27:astore          13
			int ai1[] = ai[j1];
	//   16   29:aload_3         
	//   17   30:iload           9
	//   18   32:aaload          
	//   19   33:astore          14
			int k = i;
	//   20   35:iload_1         
	//   21   36:istore          6
			boolean flag = false;
	//   22   38:iconst_0        
	//   23   39:istore          7
			i = j;
	//   24   41:iload           5
	//   25   43:istore_1        
			for(j = ((int) (flag)); j < trackgroup2.length;)
	//*  26   44:iload           7
	//*  27   46:istore          5
	//*  28   48:iload           5
	//*  29   50:aload           13
	//*  30   52:getfield        #144 <Field int TrackGroup.length>
	//*  31   55:icmpge          197
			{
				TrackGroup trackgroup1 = trackgroup;
	//   32   58:aload           11
	//   33   60:astore          12
				int k1 = k;
	//   34   62:iload           6
	//   35   64:istore          10
				int i1 = i;
	//   36   66:iload_1         
	//   37   67:istore          8
				if(isSupported(ai1[j], parameters.exceedRendererCapabilitiesIfNecessary))
	//*  38   69:aload           14
	//*  39   71:iload           5
	//*  40   73:iaload          
	//*  41   74:aload           4
	//*  42   76:getfield        #337 <Field boolean DefaultTrackSelector$Parameters.exceedRendererCapabilitiesIfNecessary>
	//*  43   79:invokestatic    #240 <Method boolean isSupported(int, boolean)>
	//*  44   82:ifeq            177
				{
					int l = trackgroup2.getFormat(j).selectionFlags;
	//   45   85:aload           13
	//   46   87:iload           5
	//   47   89:invokevirtual   #100 <Method Format TrackGroup.getFormat(int)>
	//   48   92:getfield        #423 <Field int Format.selectionFlags>
	//   49   95:istore          7
					i1 = 1;
	//   50   97:iconst_1        
	//   51   98:istore          8
					boolean flag1;
					if((l & 1) != 0)
	//*  52  100:iload           7
	//*  53  102:iconst_1        
	//*  54  103:iand            
	//*  55  104:ifeq            113
						flag1 = true;
	//   56  107:iconst_1        
	//   57  108:istore          7
					else
	//*  58  110:goto            116
						flag1 = false;
	//   59  113:iconst_0        
	//   60  114:istore          7
					if(flag1)
	//*  61  116:iload           7
	//*  62  118:ifeq            124
						i1 = 2;
	//   63  121:iconst_2        
	//   64  122:istore          8
					flag1 = ((boolean) (i1));
	//   65  124:iload           8
	//   66  126:istore          7
					if(isSupported(ai1[j], false))
	//*  67  128:aload           14
	//*  68  130:iload           5
	//*  69  132:iaload          
	//*  70  133:iconst_0        
	//*  71  134:invokestatic    #240 <Method boolean isSupported(int, boolean)>
	//*  72  137:ifeq            148
						flag1 = ((boolean) (i1 + 1000));
	//   73  140:iload           8
	//   74  142:sipush          1000
	//   75  145:iadd            
	//   76  146:istore          7
					trackgroup1 = trackgroup;
	//   77  148:aload           11
	//   78  150:astore          12
					k1 = k;
	//   79  152:iload           6
	//   80  154:istore          10
					i1 = i;
	//   81  156:iload_1         
	//   82  157:istore          8
					if(flag1 > i)
	//*  83  159:iload           7
	//*  84  161:iload_1         
	//*  85  162:icmple          177
					{
						k1 = j;
	//   86  165:iload           5
	//   87  167:istore          10
						trackgroup1 = trackgroup2;
	//   88  169:aload           13
	//   89  171:astore          12
						i1 = ((int) (flag1));
	//   90  173:iload           7
	//   91  175:istore          8
					}
				}
				j++;
	//   92  177:iload           5
	//   93  179:iconst_1        
	//   94  180:iadd            
	//   95  181:istore          5
				trackgroup = trackgroup1;
	//   96  183:aload           12
	//   97  185:astore          11
				k = k1;
	//   98  187:iload           10
	//   99  189:istore          6
				i = i1;
	//  100  191:iload           8
	//  101  193:istore_1        
			}

	//* 102  194:goto            48
			j1++;
	//  103  197:iload           9
	//  104  199:iconst_1        
	//  105  200:iadd            
	//  106  201:istore          9
			j = i;
	//  107  203:iload_1         
	//  108  204:istore          5
			i = k;
	//  109  206:iload           6
	//  110  208:istore_1        
		}
	//* 111  209:goto            12
		if(trackgroup == null)
	//* 112  212:aload           11
	//* 113  214:ifnonnull       219
			return null;
	//  114  217:aconst_null     
	//  115  218:areturn         
		else
			return ((TrackSelection) (new FixedTrackSelection(trackgroup, i)));
	//  116  219:new             #350 <Class FixedTrackSelection>
	//  117  222:dup             
	//  118  223:aload           11
	//  119  225:iload_1         
	//  120  226:invokespecial   #353 <Method void FixedTrackSelection(TrackGroup, int)>
	//  121  229:areturn         
	}

	protected TrackSelection selectTextTrack(TrackGroupArray trackgrouparray, int ai[][], Parameters parameters)
		throws ExoPlaybackException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #425 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #427 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #432 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	protected final Pair selectTracks(MappingTrackSelector.MappedTrackInfo mappedtrackinfo, int ai[][][], int ai1[])
		throws ExoPlaybackException
	{
		Parameters parameters = (Parameters)parametersReference.get();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AtomicReference parametersReference>
	//    2    4:invokevirtual   #384 <Method Object AtomicReference.get()>
	//    3    7:checkcast       #14  <Class DefaultTrackSelector$Parameters>
	//    4   10:astore          7
		int k = mappedtrackinfo.getRendererCount();
	//    5   12:aload_1         
	//    6   13:invokevirtual   #259 <Method int MappingTrackSelector$MappedTrackInfo.getRendererCount()>
	//    7   16:istore          6
		TrackSelection atrackselection[] = selectAllTracks(mappedtrackinfo, ai, ai1, parameters);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:aload           7
	//   13   24:invokevirtual   #436 <Method TrackSelection[] selectAllTracks(MappingTrackSelector$MappedTrackInfo, int[][][], int[], DefaultTrackSelector$Parameters)>
	//   14   27:astore          8
		for(int i = 0; i < k; i++)
	//*  15   29:iconst_0        
	//*  16   30:istore          4
	//*  17   32:iload           4
	//*  18   34:iload           6
	//*  19   36:icmpge          183
		{
			if(parameters.getRendererDisabled(i))
	//*  20   39:aload           7
	//*  21   41:iload           4
	//*  22   43:invokevirtual   #388 <Method boolean DefaultTrackSelector$Parameters.getRendererDisabled(int)>
	//*  23   46:ifeq            58
			{
				atrackselection[i] = null;
	//   24   49:aload           8
	//   25   51:iload           4
	//   26   53:aconst_null     
	//   27   54:aastore         
				continue;
	//   28   55:goto            174
			}
			ai1 = ((int []) (mappedtrackinfo.getTrackGroups(i)));
	//   29   58:aload_1         
	//   30   59:iload           4
	//   31   61:invokevirtual   #267 <Method TrackGroupArray MappingTrackSelector$MappedTrackInfo.getTrackGroups(int)>
	//   32   64:astore_3        
			if(!parameters.hasSelectionOverride(i, ((TrackGroupArray) (ai1))))
				continue;
	//   33   65:aload           7
	//   34   67:iload           4
	//   35   69:aload_3         
	//   36   70:invokevirtual   #396 <Method boolean DefaultTrackSelector$Parameters.hasSelectionOverride(int, TrackGroupArray)>
	//   37   73:ifeq            174
			SelectionOverride selectionoverride = parameters.getSelectionOverride(i, ((TrackGroupArray) (ai1)));
	//   38   76:aload           7
	//   39   78:iload           4
	//   40   80:aload_3         
	//   41   81:invokevirtual   #392 <Method DefaultTrackSelector$SelectionOverride DefaultTrackSelector$Parameters.getSelectionOverride(int, TrackGroupArray)>
	//   42   84:astore          9
			if(selectionoverride == null)
	//*  43   86:aload           9
	//*  44   88:ifnonnull       100
			{
				atrackselection[i] = null;
	//   45   91:aload           8
	//   46   93:iload           4
	//   47   95:aconst_null     
	//   48   96:aastore         
				continue;
	//   49   97:goto            174
			}
			if(selectionoverride.length == 1)
	//*  50  100:aload           9
	//*  51  102:getfield        #437 <Field int DefaultTrackSelector$SelectionOverride.length>
	//*  52  105:iconst_1        
	//*  53  106:icmpne          140
				atrackselection[i] = ((TrackSelection) (new FixedTrackSelection(((TrackGroupArray) (ai1)).get(selectionoverride.groupIndex), selectionoverride.tracks[0])));
	//   54  109:aload           8
	//   55  111:iload           4
	//   56  113:new             #350 <Class FixedTrackSelection>
	//   57  116:dup             
	//   58  117:aload_3         
	//   59  118:aload           9
	//   60  120:getfield        #440 <Field int DefaultTrackSelector$SelectionOverride.groupIndex>
	//   61  123:invokevirtual   #306 <Method TrackGroup TrackGroupArray.get(int)>
	//   62  126:aload           9
	//   63  128:getfield        #443 <Field int[] DefaultTrackSelector$SelectionOverride.tracks>
	//   64  131:iconst_0        
	//   65  132:iaload          
	//   66  133:invokespecial   #353 <Method void FixedTrackSelection(TrackGroup, int)>
	//   67  136:aastore         
			else
	//*  68  137:goto            174
				atrackselection[i] = ((TrackSelection.Factory)Assertions.checkNotNull(((Object) (adaptiveTrackSelectionFactory)))).createTrackSelection(((TrackGroupArray) (ai1)).get(selectionoverride.groupIndex), selectionoverride.tracks);
	//   69  140:aload           8
	//   70  142:iload           4
	//   71  144:aload_0         
	//   72  145:getfield        #54  <Field TrackSelection$Factory adaptiveTrackSelectionFactory>
	//   73  148:invokestatic    #177 <Method Object Assertions.checkNotNull(Object)>
	//   74  151:checkcast       #47  <Class TrackSelection$Factory>
	//   75  154:aload_3         
	//   76  155:aload           9
	//   77  157:getfield        #440 <Field int DefaultTrackSelector$SelectionOverride.groupIndex>
	//   78  160:invokevirtual   #306 <Method TrackGroup TrackGroupArray.get(int)>
	//   79  163:aload           9
	//   80  165:getfield        #443 <Field int[] DefaultTrackSelector$SelectionOverride.tracks>
	//   81  168:invokeinterface #330 <Method TrackSelection TrackSelection$Factory.createTrackSelection(TrackGroup, int[])>
	//   82  173:aastore         
		}

	//   83  174:iload           4
	//   84  176:iconst_1        
	//   85  177:iadd            
	//   86  178:istore          4
	//*  87  180:goto            32
		RendererConfiguration arendererconfiguration[] = new RendererConfiguration[k];
	//   88  183:iload           6
	//   89  185:anewarray       RendererConfiguration[]
	//   90  188:astore          9
		for(int j = 0; j < k; j++)
	//*  91  190:iconst_0        
	//*  92  191:istore          4
	//*  93  193:iload           4
	//*  94  195:iload           6
	//*  95  197:icmpge          266
		{
			boolean flag;
			if(!parameters.getRendererDisabled(j) && (mappedtrackinfo.getRendererType(j) == 5 || atrackselection[j] != null))
	//*  96  200:aload           7
	//*  97  202:iload           4
	//*  98  204:invokevirtual   #388 <Method boolean DefaultTrackSelector$Parameters.getRendererDisabled(int)>
	//*  99  207:ifne            234
	//* 100  210:aload_1         
	//* 101  211:iload           4
	//* 102  213:invokevirtual   #263 <Method int MappingTrackSelector$MappedTrackInfo.getRendererType(int)>
	//* 103  216:iconst_5        
	//* 104  217:icmpeq          228
	//* 105  220:aload           8
	//* 106  222:iload           4
	//* 107  224:aaload          
	//* 108  225:ifnull          234
				flag = true;
	//  109  228:iconst_1        
	//  110  229:istore          5
			else
	//* 111  231:goto            237
				flag = false;
	//  112  234:iconst_0        
	//  113  235:istore          5
			if(flag)
	//* 114  237:iload           5
	//* 115  239:ifeq            249
				ai1 = ((int []) (RendererConfiguration.DEFAULT));
	//  116  242:getstatic       #446 <Field RendererConfiguration RendererConfiguration.DEFAULT>
	//  117  245:astore_3        
			else
	//* 118  246:goto            251
				ai1 = null;
	//  119  249:aconst_null     
	//  120  250:astore_3        
			arendererconfiguration[j] = ((RendererConfiguration) (ai1));
	//  121  251:aload           9
	//  122  253:iload           4
	//  123  255:aload_3         
	//  124  256:aastore         
		}

	//  125  257:iload           4
	//  126  259:iconst_1        
	//  127  260:iadd            
	//  128  261:istore          4
	//* 129  263:goto            193
		maybeConfigureRenderersForTunneling(mappedtrackinfo, ai, arendererconfiguration, atrackselection, parameters.tunnelingAudioSessionId);
	//  130  266:aload_1         
	//  131  267:aload_2         
	//  132  268:aload           9
	//  133  270:aload           8
	//  134  272:aload           7
	//  135  274:getfield        #449 <Field int DefaultTrackSelector$Parameters.tunnelingAudioSessionId>
	//  136  277:invokestatic    #451 <Method void maybeConfigureRenderersForTunneling(MappingTrackSelector$MappedTrackInfo, int[][][], RendererConfiguration[], TrackSelection[], int)>
		return Pair.create(((Object) (arendererconfiguration)), ((Object) (atrackselection)));
	//  137  280:aload           9
	//  138  282:aload           8
	//  139  284:invokestatic    #457 <Method Pair Pair.create(Object, Object)>
	//  140  287:areturn         
	}

	protected TrackSelection selectVideoTrack(TrackGroupArray trackgrouparray, int ai[][], int i, Parameters parameters, TrackSelection.Factory factory)
		throws ExoPlaybackException
	{
		if(!parameters.forceLowestBitrate && factory != null)
	//*   0    0:aload           4
	//*   1    2:getfield        #346 <Field boolean DefaultTrackSelector$Parameters.forceLowestBitrate>
	//*   2    5:ifne            28
	//*   3    8:aload           5
	//*   4   10:ifnull          28
			factory = ((TrackSelection.Factory) (selectAdaptiveVideoTrack(trackgrouparray, ai, i, parameters, factory)));
	//    5   13:aload_1         
	//    6   14:aload_2         
	//    7   15:iload_3         
	//    8   16:aload           4
	//    9   18:aload           5
	//   10   20:invokestatic    #460 <Method TrackSelection selectAdaptiveVideoTrack(TrackGroupArray, int[][], int, DefaultTrackSelector$Parameters, TrackSelection$Factory)>
	//   11   23:astore          5
		else
	//*  12   25:goto            31
			factory = null;
	//   13   28:aconst_null     
	//   14   29:astore          5
		Object obj = ((Object) (factory));
	//   15   31:aload           5
	//   16   33:astore          6
		if(factory == null)
	//*  17   35:aload           5
	//*  18   37:ifnonnull       49
			obj = ((Object) (selectFixedVideoTrack(trackgrouparray, ai, parameters)));
	//   19   40:aload_1         
	//   20   41:aload_2         
	//   21   42:aload           4
	//   22   44:invokestatic    #462 <Method TrackSelection selectFixedVideoTrack(TrackGroupArray, int[][], DefaultTrackSelector$Parameters)>
	//   23   47:astore          6
		return ((TrackSelection) (obj));
	//   24   49:aload           6
	//   25   51:areturn         
	}

	public void setParameters(Parameters parameters)
	{
		Assertions.checkNotNull(((Object) (parameters)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #177 <Method Object Assertions.checkNotNull(Object)>
	//    2    4:pop             
		if(!((Parameters)parametersReference.getAndSet(((Object) (parameters)))).equals(((Object) (parameters))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #65  <Field AtomicReference parametersReference>
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #466 <Method Object AtomicReference.getAndSet(Object)>
	//*   7   13:checkcast       #14  <Class DefaultTrackSelector$Parameters>
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #468 <Method boolean DefaultTrackSelector$Parameters.equals(Object)>
	//*  10   20:ifne            27
			invalidate();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #471 <Method void invalidate()>
	//   13   27:return          
	}

	public void setParameters(ParametersBuilder parametersbuilder)
	{
		setParameters(parametersbuilder.build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #474 <Method DefaultTrackSelector$Parameters DefaultTrackSelector$ParametersBuilder.build()>
	//    3    5:invokevirtual   #476 <Method void setParameters(DefaultTrackSelector$Parameters)>
	//    4    8:return          
	}

	public final void setRendererDisabled(int i, boolean flag)
	{
		setParameters(buildUponParameters().setRendererDisabled(i, flag));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #367 <Method DefaultTrackSelector$ParametersBuilder buildUponParameters()>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #481 <Method DefaultTrackSelector$ParametersBuilder DefaultTrackSelector$ParametersBuilder.setRendererDisabled(int, boolean)>
	//    6   10:invokevirtual   #374 <Method void setParameters(DefaultTrackSelector$ParametersBuilder)>
	//    7   13:return          
	}

	public final void setSelectionOverride(int i, TrackGroupArray trackgrouparray, SelectionOverride selectionoverride)
	{
		setParameters(buildUponParameters().setSelectionOverride(i, trackgrouparray, selectionoverride));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #367 <Method DefaultTrackSelector$ParametersBuilder buildUponParameters()>
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #486 <Method DefaultTrackSelector$ParametersBuilder DefaultTrackSelector$ParametersBuilder.setSelectionOverride(int, TrackGroupArray, DefaultTrackSelector$SelectionOverride)>
	//    7   11:invokevirtual   #374 <Method void setParameters(DefaultTrackSelector$ParametersBuilder)>
	//    8   14:return          
	}

	public void setTunnelingAudioSessionId(int i)
	{
		setParameters(buildUponParameters().setTunnelingAudioSessionId(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #367 <Method DefaultTrackSelector$ParametersBuilder buildUponParameters()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #489 <Method DefaultTrackSelector$ParametersBuilder DefaultTrackSelector$ParametersBuilder.setTunnelingAudioSessionId(int)>
	//    5    9:invokevirtual   #374 <Method void setParameters(DefaultTrackSelector$ParametersBuilder)>
	//    6   12:return          
	}

	private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98F;
	private static final int NO_TRACKS[] = new int[0];
	private static final int WITHIN_RENDERER_CAPABILITIES_BONUS = 1000;
	private final TrackSelection.Factory adaptiveTrackSelectionFactory;
	private final AtomicReference parametersReference;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #43  <Field int[] NO_TRACKS>
	//*   3    6:return          
	}


/*
	static int access$300(int i, int j)
	{
		return compareInts(i, j);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #76  <Method int compareInts(int, int)>
	//    3    5:ireturn         
	}

*/
}
