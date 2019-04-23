// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.VideoFormatSelectorUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsTrackSelector, Variant, HlsMasterPlaylist

public final class DefaultHlsTrackSelector
	implements HlsTrackSelector
{

	private DefaultHlsTrackSelector(Context context1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Context context>
		type = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #25  <Field int type>
	//    8   14:return          
	}

	public static DefaultHlsTrackSelector newAudioInstance()
	{
		return new DefaultHlsTrackSelector(((Context) (null)), 1);
	//    0    0:new             #2   <Class DefaultHlsTrackSelector>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:iconst_1        
	//    4    6:invokespecial   #30  <Method void DefaultHlsTrackSelector(Context, int)>
	//    5    9:areturn         
	}

	public static DefaultHlsTrackSelector newDefaultInstance(Context context1)
	{
		return new DefaultHlsTrackSelector(context1, 0);
	//    0    0:new             #2   <Class DefaultHlsTrackSelector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #30  <Method void DefaultHlsTrackSelector(Context, int)>
	//    5    9:areturn         
	}

	public static DefaultHlsTrackSelector newSubtitleInstance()
	{
		return new DefaultHlsTrackSelector(((Context) (null)), 2);
	//    0    0:new             #2   <Class DefaultHlsTrackSelector>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:iconst_2        
	//    4    6:invokespecial   #30  <Method void DefaultHlsTrackSelector(Context, int)>
	//    5    9:areturn         
	}

	private static boolean variantHasExplicitCodecWithPrefix(Variant variant, String s)
	{
		variant = ((Variant) (variant.format.codecs));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Format Variant.format>
	//    2    4:getfield        #47  <Field String Format.codecs>
	//    3    7:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (variant))))
	//*   4    8:aload_0         
	//*   5    9:invokestatic    #53  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   12:ifeq            17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		variant = ((Variant) (((String) (variant)).split("(\\s*,\\s*)|(\\s*$)")));
	//    9   17:aload_0         
	//   10   18:ldc1            #55  <String "(\\s*,\\s*)|(\\s*$)">
	//   11   20:invokevirtual   #61  <Method String[] String.split(String)>
	//   12   23:astore_0        
		for(int i = 0; i < variant.length; i++)
	//*  13   24:iconst_0        
	//*  14   25:istore_2        
	//*  15   26:iload_2         
	//*  16   27:aload_0         
	//*  17   28:arraylength     
	//*  18   29:icmpge          51
			if(((String) (variant[i])).startsWith(s))
	//*  19   32:aload_0         
	//*  20   33:iload_2         
	//*  21   34:aaload          
	//*  22   35:aload_1         
	//*  23   36:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  24   39:ifeq            44
				return true;
	//   25   42:iconst_1        
	//   26   43:ireturn         

	//   27   44:iload_2         
	//   28   45:iconst_1        
	//   29   46:iadd            
	//   30   47:istore_2        
	//*  31   48:goto            26
		return false;
	//   32   51:iconst_0        
	//   33   52:ireturn         
	}

	public void selectTracks(HlsMasterPlaylist hlsmasterplaylist, HlsTrackSelector.Output output)
		throws IOException
	{
		int j = type;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int type>
	//    2    4:istore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		boolean flag = false;
	//    5    8:iconst_0        
	//    6    9:istore          4
		if(j != 1 && j != 2)
	//*   7   11:iload           5
	//*   8   13:iconst_1        
	//*   9   14:icmpeq          300
	//*  10   17:iload           5
	//*  11   19:iconst_2        
	//*  12   20:icmpne          26
	//*  13   23:goto            300
		{
			ArrayList arraylist1 = new ArrayList();
	//   14   26:new             #71  <Class ArrayList>
	//   15   29:dup             
	//   16   30:invokespecial   #72  <Method void ArrayList()>
	//   17   33:astore          7
			int ai[] = VideoFormatSelectorUtil.selectVideoFormatsForDefaultDisplay(context, hlsmasterplaylist.variants, ((String []) (null)), false);
	//   18   35:aload_0         
	//   19   36:getfield        #23  <Field Context context>
	//   20   39:aload_1         
	//   21   40:getfield        #78  <Field List HlsMasterPlaylist.variants>
	//   22   43:aconst_null     
	//   23   44:iconst_0        
	//   24   45:invokestatic    #84  <Method int[] VideoFormatSelectorUtil.selectVideoFormatsForDefaultDisplay(Context, List, String[], boolean)>
	//   25   48:astore          6
			for(i = 0; i < ai.length; i++)
	//*  26   50:iconst_0        
	//*  27   51:istore_3        
	//*  28   52:iload_3         
	//*  29   53:aload           6
	//*  30   55:arraylength     
	//*  31   56:icmpge          85
				arraylist1.add(hlsmasterplaylist.variants.get(ai[i]));
	//   32   59:aload           7
	//   33   61:aload_1         
	//   34   62:getfield        #78  <Field List HlsMasterPlaylist.variants>
	//   35   65:aload           6
	//   36   67:iload_3         
	//   37   68:iaload          
	//   38   69:invokeinterface #90  <Method Object List.get(int)>
	//   39   74:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
	//   40   77:pop             

	//   41   78:iload_3         
	//   42   79:iconst_1        
	//   43   80:iadd            
	//   44   81:istore_3        
	//*  45   82:goto            52
			ArrayList arraylist = new ArrayList();
	//   46   85:new             #71  <Class ArrayList>
	//   47   88:dup             
	//   48   89:invokespecial   #72  <Method void ArrayList()>
	//   49   92:astore          6
			ArrayList arraylist2 = new ArrayList();
	//   50   94:new             #71  <Class ArrayList>
	//   51   97:dup             
	//   52   98:invokespecial   #72  <Method void ArrayList()>
	//   53  101:astore          8
			for(i = 0; i < arraylist1.size(); i++)
	//*  54  103:iconst_0        
	//*  55  104:istore_3        
	//*  56  105:iload_3         
	//*  57  106:aload           7
	//*  58  108:invokevirtual   #98  <Method int ArrayList.size()>
	//*  59  111:icmpge          185
			{
				Variant variant = (Variant)arraylist1.get(i);
	//   60  114:aload           7
	//   61  116:iload_3         
	//   62  117:invokevirtual   #99  <Method Object ArrayList.get(int)>
	//   63  120:checkcast       #37  <Class Variant>
	//   64  123:astore          9
				if(variant.format.height <= 0 && !variantHasExplicitCodecWithPrefix(variant, "avc"))
	//*  65  125:aload           9
	//*  66  127:getfield        #41  <Field Format Variant.format>
	//*  67  130:getfield        #102 <Field int Format.height>
	//*  68  133:ifgt            170
	//*  69  136:aload           9
	//*  70  138:ldc1            #104 <String "avc">
	//*  71  140:invokestatic    #106 <Method boolean variantHasExplicitCodecWithPrefix(Variant, String)>
	//*  72  143:ifeq            149
	//*  73  146:goto            170
				{
					if(variantHasExplicitCodecWithPrefix(variant, "mp4a"))
	//*  74  149:aload           9
	//*  75  151:ldc1            #108 <String "mp4a">
	//*  76  153:invokestatic    #106 <Method boolean variantHasExplicitCodecWithPrefix(Variant, String)>
	//*  77  156:ifeq            178
						arraylist2.add(((Object) (variant)));
	//   78  159:aload           8
	//   79  161:aload           9
	//   80  163:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
	//   81  166:pop             
				} else
	//*  82  167:goto            178
				{
					arraylist.add(((Object) (variant)));
	//   83  170:aload           6
	//   84  172:aload           9
	//   85  174:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
	//   86  177:pop             
				}
			}

	//   87  178:iload_3         
	//   88  179:iconst_1        
	//   89  180:iadd            
	//   90  181:istore_3        
	//*  91  182:goto            105
			if(arraylist.isEmpty())
	//*  92  185:aload           6
	//*  93  187:invokevirtual   #111 <Method boolean ArrayList.isEmpty()>
	//*  94  190:ifne            196
	//*  95  193:goto            225
			{
				arraylist = arraylist1;
	//   96  196:aload           7
	//   97  198:astore          6
				if(arraylist2.size() < arraylist1.size())
	//*  98  200:aload           8
	//*  99  202:invokevirtual   #98  <Method int ArrayList.size()>
	//* 100  205:aload           7
	//* 101  207:invokevirtual   #98  <Method int ArrayList.size()>
	//* 102  210:icmpge          225
				{
					arraylist1.removeAll(((java.util.Collection) (arraylist2)));
	//  103  213:aload           7
	//  104  215:aload           8
	//  105  217:invokevirtual   #115 <Method boolean ArrayList.removeAll(java.util.Collection)>
	//  106  220:pop             
					arraylist = arraylist1;
	//  107  221:aload           7
	//  108  223:astore          6
				}
			}
			i = ((int) (flag));
	//  109  225:iload           4
	//  110  227:istore_3        
			if(arraylist.size() > 1)
	//* 111  228:aload           6
	//* 112  230:invokevirtual   #98  <Method int ArrayList.size()>
	//* 113  233:iconst_1        
	//* 114  234:icmple          267
			{
				Variant avariant[] = new Variant[arraylist.size()];
	//  115  237:aload           6
	//  116  239:invokevirtual   #98  <Method int ArrayList.size()>
	//  117  242:anewarray       Variant[]
	//  118  245:astore          7
				arraylist.toArray(((Object []) (avariant)));
	//  119  247:aload           6
	//  120  249:aload           7
	//  121  251:invokevirtual   #119 <Method Object[] ArrayList.toArray(Object[])>
	//  122  254:pop             
				output.adaptiveTrack(hlsmasterplaylist, avariant);
	//  123  255:aload_2         
	//  124  256:aload_1         
	//  125  257:aload           7
	//  126  259:invokeinterface #125 <Method void HlsTrackSelector$Output.adaptiveTrack(HlsMasterPlaylist, Variant[])>
				i = ((int) (flag));
	//  127  264:iload           4
	//  128  266:istore_3        
			}
			for(; i < arraylist.size(); i++)
	//* 129  267:iload_3         
	//* 130  268:aload           6
	//* 131  270:invokevirtual   #98  <Method int ArrayList.size()>
	//* 132  273:icmpge          299
				output.fixedTrack(hlsmasterplaylist, (Variant)arraylist.get(i));
	//  133  276:aload_2         
	//  134  277:aload_1         
	//  135  278:aload           6
	//  136  280:iload_3         
	//  137  281:invokevirtual   #99  <Method Object ArrayList.get(int)>
	//  138  284:checkcast       #37  <Class Variant>
	//  139  287:invokeinterface #129 <Method void HlsTrackSelector$Output.fixedTrack(HlsMasterPlaylist, Variant)>

	//  140  292:iload_3         
	//  141  293:iconst_1        
	//  142  294:iadd            
	//  143  295:istore_3        
	//* 144  296:goto            267
			return;
	//  145  299:return          
		}
		List list;
		if(type == 1)
	//* 146  300:aload_0         
	//* 147  301:getfield        #25  <Field int type>
	//* 148  304:iconst_1        
	//* 149  305:icmpne          317
			list = hlsmasterplaylist.audios;
	//  150  308:aload_1         
	//  151  309:getfield        #132 <Field List HlsMasterPlaylist.audios>
	//  152  312:astore          6
		else
	//* 153  314:goto            323
			list = hlsmasterplaylist.subtitles;
	//  154  317:aload_1         
	//  155  318:getfield        #135 <Field List HlsMasterPlaylist.subtitles>
	//  156  321:astore          6
		if(list != null && !list.isEmpty())
	//* 157  323:aload           6
	//* 158  325:ifnull          374
	//* 159  328:aload           6
	//* 160  330:invokeinterface #136 <Method boolean List.isEmpty()>
	//* 161  335:ifne            374
			for(; i < list.size(); i++)
	//* 162  338:iload_3         
	//* 163  339:aload           6
	//* 164  341:invokeinterface #137 <Method int List.size()>
	//* 165  346:icmpge          374
				output.fixedTrack(hlsmasterplaylist, (Variant)list.get(i));
	//  166  349:aload_2         
	//  167  350:aload_1         
	//  168  351:aload           6
	//  169  353:iload_3         
	//  170  354:invokeinterface #90  <Method Object List.get(int)>
	//  171  359:checkcast       #37  <Class Variant>
	//  172  362:invokeinterface #129 <Method void HlsTrackSelector$Output.fixedTrack(HlsMasterPlaylist, Variant)>

	//  173  367:iload_3         
	//  174  368:iconst_1        
	//  175  369:iadd            
	//  176  370:istore_3        
	//* 177  371:goto            338
	//  178  374:return          
	}

	private static final int TYPE_AUDIO = 1;
	private static final int TYPE_DEFAULT = 0;
	private static final int TYPE_SUBTITLE = 2;
	private final Context context;
	private final int type;
}
