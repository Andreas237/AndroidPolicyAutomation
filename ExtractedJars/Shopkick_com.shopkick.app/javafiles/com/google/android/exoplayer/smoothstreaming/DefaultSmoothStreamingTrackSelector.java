// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import android.content.Context;
import com.google.android.exoplayer.chunk.VideoFormatSelectorUtil;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingTrackSelector, SmoothStreamingManifest

public final class DefaultSmoothStreamingTrackSelector
	implements SmoothStreamingTrackSelector
{

	private DefaultSmoothStreamingTrackSelector(int i, Context context1, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #20  <Field Context context>
		streamElementType = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #22  <Field int streamElementType>
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

	public static DefaultSmoothStreamingTrackSelector newAudioInstance()
	{
		return new DefaultSmoothStreamingTrackSelector(0, ((Context) (null)), false, false);
	//    0    0:new             #2   <Class DefaultSmoothStreamingTrackSelector>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokespecial   #31  <Method void DefaultSmoothStreamingTrackSelector(int, Context, boolean, boolean)>
	//    7   11:areturn         
	}

	public static DefaultSmoothStreamingTrackSelector newTextInstance()
	{
		return new DefaultSmoothStreamingTrackSelector(2, ((Context) (null)), false, false);
	//    0    0:new             #2   <Class DefaultSmoothStreamingTrackSelector>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:aconst_null     
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokespecial   #31  <Method void DefaultSmoothStreamingTrackSelector(int, Context, boolean, boolean)>
	//    7   11:areturn         
	}

	public static DefaultSmoothStreamingTrackSelector newVideoInstance(Context context1, boolean flag, boolean flag1)
	{
		return new DefaultSmoothStreamingTrackSelector(1, context1, flag, flag1);
	//    0    0:new             #2   <Class DefaultSmoothStreamingTrackSelector>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #31  <Method void DefaultSmoothStreamingTrackSelector(int, Context, boolean, boolean)>
	//    7   11:areturn         
	}

	public void selectTracks(SmoothStreamingManifest smoothstreamingmanifest, SmoothStreamingTrackSelector.Output output)
		throws IOException
	{
		for(int i = 0; i < smoothstreamingmanifest.streamElements.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_1         
	//*   4    4:getfield        #44  <Field SmoothStreamingManifest$StreamElement[] SmoothStreamingManifest.streamElements>
	//*   5    7:arraylength     
	//*   6    8:icmpge          208
		{
			Object obj = ((Object) (smoothstreamingmanifest.streamElements[i].tracks));
	//    7   11:aload_1         
	//    8   12:getfield        #44  <Field SmoothStreamingManifest$StreamElement[] SmoothStreamingManifest.streamElements>
	//    9   15:iload_3         
	//   10   16:aaload          
	//   11   17:getfield        #50  <Field SmoothStreamingManifest$TrackElement[] SmoothStreamingManifest$StreamElement.tracks>
	//   12   20:astore          8
			int j = smoothstreamingmanifest.streamElements[i].type;
	//   13   22:aload_1         
	//   14   23:getfield        #44  <Field SmoothStreamingManifest$StreamElement[] SmoothStreamingManifest.streamElements>
	//   15   26:iload_3         
	//   16   27:aaload          
	//   17   28:getfield        #53  <Field int SmoothStreamingManifest$StreamElement.type>
	//   18   31:istore          4
			int i1 = streamElementType;
	//   19   33:aload_0         
	//   20   34:getfield        #22  <Field int streamElementType>
	//   21   37:istore          5
			if(j != i1)
				continue;
	//   22   39:iload           4
	//   23   41:iload           5
	//   24   43:icmpne          201
			if(i1 == 1)
	//*  25   46:iload           5
	//*  26   48:iconst_1        
	//*  27   49:icmpne          171
			{
				int ai[];
				if(filterVideoRepresentations)
	//*  28   52:aload_0         
	//*  29   53:getfield        #24  <Field boolean filterVideoRepresentations>
	//*  30   56:ifeq            110
				{
					Context context1 = context;
	//   31   59:aload_0         
	//   32   60:getfield        #20  <Field Context context>
	//   33   63:astore          7
					obj = ((Object) (Arrays.asList(((Object []) (obj)))));
	//   34   65:aload           8
	//   35   67:invokestatic    #59  <Method java.util.List Arrays.asList(Object[])>
	//   36   70:astore          8
					boolean flag;
					if(filterProtectedHdContent && smoothstreamingmanifest.protectionElement != null)
	//*  37   72:aload_0         
	//*  38   73:getfield        #26  <Field boolean filterProtectedHdContent>
	//*  39   76:ifeq            92
	//*  40   79:aload_1         
	//*  41   80:getfield        #63  <Field SmoothStreamingManifest$ProtectionElement SmoothStreamingManifest.protectionElement>
	//*  42   83:ifnull          92
						flag = true;
	//   43   86:iconst_1        
	//   44   87:istore          6
					else
	//*  45   89:goto            95
						flag = false;
	//   46   92:iconst_0        
	//   47   93:istore          6
					ai = VideoFormatSelectorUtil.selectVideoFormatsForDefaultDisplay(context1, ((java.util.List) (obj)), ((String []) (null)), flag);
	//   48   95:aload           7
	//   49   97:aload           8
	//   50   99:aconst_null     
	//   51  100:iload           6
	//   52  102:invokestatic    #69  <Method int[] VideoFormatSelectorUtil.selectVideoFormatsForDefaultDisplay(Context, java.util.List, String[], boolean)>
	//   53  105:astore          7
				} else
	//*  54  107:goto            118
				{
					ai = Util.firstIntegersArray(obj.length);
	//   55  110:aload           8
	//   56  112:arraylength     
	//   57  113:invokestatic    #75  <Method int[] Util.firstIntegersArray(int)>
	//   58  116:astore          7
				}
				int j1 = ai.length;
	//   59  118:aload           7
	//   60  120:arraylength     
	//   61  121:istore          5
				if(j1 > 1)
	//*  62  123:iload           5
	//*  63  125:iconst_1        
	//*  64  126:icmple          139
					output.adaptiveTrack(smoothstreamingmanifest, i, ai);
	//   65  129:aload_2         
	//   66  130:aload_1         
	//   67  131:iload_3         
	//   68  132:aload           7
	//   69  134:invokeinterface #81  <Method void SmoothStreamingTrackSelector$Output.adaptiveTrack(SmoothStreamingManifest, int, int[])>
				for(int k = 0; k < j1; k++)
	//*  70  139:iconst_0        
	//*  71  140:istore          4
	//*  72  142:iload           4
	//*  73  144:iload           5
	//*  74  146:icmpge          201
					output.fixedTrack(smoothstreamingmanifest, i, ai[k]);
	//   75  149:aload_2         
	//   76  150:aload_1         
	//   77  151:iload_3         
	//   78  152:aload           7
	//   79  154:iload           4
	//   80  156:iaload          
	//   81  157:invokeinterface #85  <Method void SmoothStreamingTrackSelector$Output.fixedTrack(SmoothStreamingManifest, int, int)>

	//   82  162:iload           4
	//   83  164:iconst_1        
	//   84  165:iadd            
	//   85  166:istore          4
				continue;
	//   86  168:goto            142
			}
			for(int l = 0; l < obj.length; l++)
	//*  87  171:iconst_0        
	//*  88  172:istore          4
	//*  89  174:iload           4
	//*  90  176:aload           8
	//*  91  178:arraylength     
	//*  92  179:icmpge          201
				output.fixedTrack(smoothstreamingmanifest, i, l);
	//   93  182:aload_2         
	//   94  183:aload_1         
	//   95  184:iload_3         
	//   96  185:iload           4
	//   97  187:invokeinterface #85  <Method void SmoothStreamingTrackSelector$Output.fixedTrack(SmoothStreamingManifest, int, int)>

	//   98  192:iload           4
	//   99  194:iconst_1        
	//  100  195:iadd            
	//  101  196:istore          4
		}

	//  102  198:goto            174
	//  103  201:iload_3         
	//  104  202:iconst_1        
	//  105  203:iadd            
	//  106  204:istore_3        
	//* 107  205:goto            2
	//  108  208:return          
	}

	private final Context context;
	private final boolean filterProtectedHdContent;
	private final boolean filterVideoRepresentations;
	private final int streamElementType;
}
