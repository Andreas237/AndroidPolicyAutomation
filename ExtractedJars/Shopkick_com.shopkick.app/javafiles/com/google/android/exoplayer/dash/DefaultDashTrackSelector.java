// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash;

import android.content.Context;
import com.google.android.exoplayer.chunk.VideoFormatSelectorUtil;
import com.google.android.exoplayer.dash.mpd.AdaptationSet;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescription;
import com.google.android.exoplayer.dash.mpd.Period;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash:
//			DashTrackSelector

public final class DefaultDashTrackSelector
	implements DashTrackSelector
{

	private DefaultDashTrackSelector(int i, Context context1, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		adaptationSetType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int adaptationSetType>
		context = context1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Context context>
		filterVideoRepresentations = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field boolean filterVideoRepresentations>
		filterProtectedHdContent = flag1;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field boolean filterProtectedHdContent>
	//   14   25:return          
	}

	public static DefaultDashTrackSelector newAudioInstance()
	{
		return new DefaultDashTrackSelector(1, ((Context) (null)), false, false);
	//    0    0:new             #2   <Class DefaultDashTrackSelector>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:aconst_null     
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokespecial   #31  <Method void DefaultDashTrackSelector(int, Context, boolean, boolean)>
	//    7   11:areturn         
	}

	public static DefaultDashTrackSelector newTextInstance()
	{
		return new DefaultDashTrackSelector(2, ((Context) (null)), false, false);
	//    0    0:new             #2   <Class DefaultDashTrackSelector>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:aconst_null     
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokespecial   #31  <Method void DefaultDashTrackSelector(int, Context, boolean, boolean)>
	//    7   11:areturn         
	}

	public static DefaultDashTrackSelector newVideoInstance(Context context1, boolean flag, boolean flag1)
	{
		return new DefaultDashTrackSelector(0, context1, flag, flag1);
	//    0    0:new             #2   <Class DefaultDashTrackSelector>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #31  <Method void DefaultDashTrackSelector(int, Context, boolean, boolean)>
	//    7   11:areturn         
	}

	public void selectTracks(MediaPresentationDescription mediapresentationdescription, int i, DashTrackSelector.Output output)
		throws IOException
	{
		Period period = mediapresentationdescription.getPeriod(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #44  <Method Period MediaPresentationDescription.getPeriod(int)>
	//    3    5:astore          9
		for(int j = 0; j < period.adaptationSets.size(); j++)
	//*   4    7:iconst_0        
	//*   5    8:istore          4
	//*   6   10:iload           4
	//*   7   12:aload           9
	//*   8   14:getfield        #50  <Field List Period.adaptationSets>
	//*   9   17:invokeinterface #56  <Method int List.size()>
	//*  10   22:icmpge          246
		{
			int ai[] = ((int []) ((AdaptationSet)period.adaptationSets.get(j)));
	//   11   25:aload           9
	//   12   27:getfield        #50  <Field List Period.adaptationSets>
	//   13   30:iload           4
	//   14   32:invokeinterface #60  <Method Object List.get(int)>
	//   15   37:checkcast       #62  <Class AdaptationSet>
	//   16   40:astore          8
			int k = ((AdaptationSet) (ai)).type;
	//   17   42:aload           8
	//   18   44:getfield        #65  <Field int AdaptationSet.type>
	//   19   47:istore          5
			int j1 = adaptationSetType;
	//   20   49:aload_0         
	//   21   50:getfield        #20  <Field int adaptationSetType>
	//   22   53:istore          6
			if(k != j1)
				continue;
	//   23   55:iload           5
	//   24   57:iload           6
	//   25   59:icmpne          237
			if(j1 == 0)
	//*  26   62:iload           6
	//*  27   64:ifne            198
			{
				if(filterVideoRepresentations)
	//*  28   67:aload_0         
	//*  29   68:getfield        #24  <Field boolean filterVideoRepresentations>
	//*  30   71:ifeq            126
				{
					Context context1 = context;
	//   31   74:aload_0         
	//   32   75:getfield        #22  <Field Context context>
	//   33   78:astore          10
					List list = ((AdaptationSet) (ai)).representations;
	//   34   80:aload           8
	//   35   82:getfield        #68  <Field List AdaptationSet.representations>
	//   36   85:astore          11
					boolean flag;
					if(filterProtectedHdContent && ((AdaptationSet) (ai)).hasContentProtection())
	//*  37   87:aload_0         
	//*  38   88:getfield        #26  <Field boolean filterProtectedHdContent>
	//*  39   91:ifeq            108
	//*  40   94:aload           8
	//*  41   96:invokevirtual   #72  <Method boolean AdaptationSet.hasContentProtection()>
	//*  42   99:ifeq            108
						flag = true;
	//   43  102:iconst_1        
	//   44  103:istore          7
					else
	//*  45  105:goto            111
						flag = false;
	//   46  108:iconst_0        
	//   47  109:istore          7
					ai = VideoFormatSelectorUtil.selectVideoFormatsForDefaultDisplay(context1, list, ((String []) (null)), flag);
	//   48  111:aload           10
	//   49  113:aload           11
	//   50  115:aconst_null     
	//   51  116:iload           7
	//   52  118:invokestatic    #78  <Method int[] VideoFormatSelectorUtil.selectVideoFormatsForDefaultDisplay(Context, List, String[], boolean)>
	//   53  121:astore          8
				} else
	//*  54  123:goto            141
				{
					ai = Util.firstIntegersArray(((AdaptationSet) (ai)).representations.size());
	//   55  126:aload           8
	//   56  128:getfield        #68  <Field List AdaptationSet.representations>
	//   57  131:invokeinterface #56  <Method int List.size()>
	//   58  136:invokestatic    #84  <Method int[] Util.firstIntegersArray(int)>
	//   59  139:astore          8
				}
				int k1 = ai.length;
	//   60  141:aload           8
	//   61  143:arraylength     
	//   62  144:istore          6
				if(k1 > 1)
	//*  63  146:iload           6
	//*  64  148:iconst_1        
	//*  65  149:icmple          164
					output.adaptiveTrack(mediapresentationdescription, i, j, ai);
	//   66  152:aload_3         
	//   67  153:aload_1         
	//   68  154:iload_2         
	//   69  155:iload           4
	//   70  157:aload           8
	//   71  159:invokeinterface #90  <Method void DashTrackSelector$Output.adaptiveTrack(MediaPresentationDescription, int, int, int[])>
				for(int l = 0; l < k1; l++)
	//*  72  164:iconst_0        
	//*  73  165:istore          5
	//*  74  167:iload           5
	//*  75  169:iload           6
	//*  76  171:icmpge          237
					output.fixedTrack(mediapresentationdescription, i, j, ai[l]);
	//   77  174:aload_3         
	//   78  175:aload_1         
	//   79  176:iload_2         
	//   80  177:iload           4
	//   81  179:aload           8
	//   82  181:iload           5
	//   83  183:iaload          
	//   84  184:invokeinterface #94  <Method void DashTrackSelector$Output.fixedTrack(MediaPresentationDescription, int, int, int)>

	//   85  189:iload           5
	//   86  191:iconst_1        
	//   87  192:iadd            
	//   88  193:istore          5
				continue;
	//   89  195:goto            167
			}
			for(int i1 = 0; i1 < ((AdaptationSet) (ai)).representations.size(); i1++)
	//*  90  198:iconst_0        
	//*  91  199:istore          5
	//*  92  201:iload           5
	//*  93  203:aload           8
	//*  94  205:getfield        #68  <Field List AdaptationSet.representations>
	//*  95  208:invokeinterface #56  <Method int List.size()>
	//*  96  213:icmpge          237
				output.fixedTrack(mediapresentationdescription, i, j, i1);
	//   97  216:aload_3         
	//   98  217:aload_1         
	//   99  218:iload_2         
	//  100  219:iload           4
	//  101  221:iload           5
	//  102  223:invokeinterface #94  <Method void DashTrackSelector$Output.fixedTrack(MediaPresentationDescription, int, int, int)>

	//  103  228:iload           5
	//  104  230:iconst_1        
	//  105  231:iadd            
	//  106  232:istore          5
		}

	//  107  234:goto            201
	//  108  237:iload           4
	//  109  239:iconst_1        
	//  110  240:iadd            
	//  111  241:istore          4
	//* 112  243:goto            10
	//  113  246:return          
	}

	private final int adaptationSetType;
	private final Context context;
	private final boolean filterProtectedHdContent;
	private final boolean filterVideoRepresentations;
}
