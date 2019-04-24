// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement;
import com.google.android.exoplayer2.upstream.*;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.*;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashMediaPeriod, DashManifestStaleException, DashSegmentIndex

public final class DashMediaSource extends BaseMediaSource
{
	private static final class DashTimeline extends Timeline
	{

		private long getAdjustedWindowDefaultStartPositionUs(long l)
		{
			long l2 = windowDefaultStartPositionUs;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field long windowDefaultStartPositionUs>
		//    2    4:lstore          6
			if(!manifest.dynamic)
		//*   3    6:aload_0         
		//*   4    7:getfield        #39  <Field DashManifest manifest>
		//*   5   10:getfield        #51  <Field boolean DashManifest.dynamic>
		//*   6   13:ifne            19
				return l2;
		//    7   16:lload           6
		//    8   18:lreturn         
			long l1 = l2;
		//    9   19:lload           6
		//   10   21:lstore          4
			if(l > 0L)
		//*  11   23:lload_1         
		//*  12   24:lconst_0        
		//*  13   25:lcmp            
		//*  14   26:ifle            49
			{
				l1 = l2 + l;
		//   15   29:lload           6
		//   16   31:lload_1         
		//   17   32:ladd            
		//   18   33:lstore          4
				if(l1 > windowDurationUs)
		//*  19   35:lload           4
		//*  20   37:aload_0         
		//*  21   38:getfield        #35  <Field long windowDurationUs>
		//*  22   41:lcmp            
		//*  23   42:ifle            49
					return 0x1L;
		//   24   45:ldc2w           #52  <Long 0x1L>
		//   25   48:lreturn         
			}
			l2 = offsetInFirstPeriodUs + l1;
		//   26   49:aload_0         
		//   27   50:getfield        #33  <Field long offsetInFirstPeriodUs>
		//   28   53:lload           4
		//   29   55:ladd            
		//   30   56:lstore          6
			l = manifest.getPeriodDurationUs(0);
		//   31   58:aload_0         
		//   32   59:getfield        #39  <Field DashManifest manifest>
		//   33   62:iconst_0        
		//   34   63:invokevirtual   #57  <Method long DashManifest.getPeriodDurationUs(int)>
		//   35   66:lstore_1        
			int i = 0;
		//   36   67:iconst_0        
		//   37   68:istore_3        
			long l3;
			do
			{
				l3 = l;
		//   38   69:lload_1         
		//   39   70:lstore          8
				if(i >= manifest.getPeriodCount() - 1 || l2 < l3)
					break;
		//   40   72:iload_3         
		//   41   73:aload_0         
		//   42   74:getfield        #39  <Field DashManifest manifest>
		//   43   77:invokevirtual   #61  <Method int DashManifest.getPeriodCount()>
		//   44   80:iconst_1        
		//   45   81:isub            
		//   46   82:icmpge          116
		//   47   85:lload           6
		//   48   87:lload           8
		//   49   89:lcmp            
		//   50   90:iflt            116
				i++;
		//   51   93:iload_3         
		//   52   94:iconst_1        
		//   53   95:iadd            
		//   54   96:istore_3        
				l = manifest.getPeriodDurationUs(i);
		//   55   97:aload_0         
		//   56   98:getfield        #39  <Field DashManifest manifest>
		//   57  101:iload_3         
		//   58  102:invokevirtual   #57  <Method long DashManifest.getPeriodDurationUs(int)>
		//   59  105:lstore_1        
				l2 -= l3;
		//   60  106:lload           6
		//   61  108:lload           8
		//   62  110:lsub            
		//   63  111:lstore          6
			} while(true);
		//   64  113:goto            69
			Object obj = ((Object) (manifest.getPeriod(i)));
		//   65  116:aload_0         
		//   66  117:getfield        #39  <Field DashManifest manifest>
		//   67  120:iload_3         
		//   68  121:invokevirtual   #65  <Method Period DashManifest.getPeriod(int)>
		//   69  124:astore          10
			i = ((Period) (obj)).getAdaptationSetIndex(2);
		//   70  126:aload           10
		//   71  128:iconst_2        
		//   72  129:invokevirtual   #71  <Method int Period.getAdaptationSetIndex(int)>
		//   73  132:istore_3        
			if(i == -1)
		//*  74  133:iload_3         
		//*  75  134:iconst_m1       
		//*  76  135:icmpne          141
				return l1;
		//   77  138:lload           4
		//   78  140:lreturn         
			obj = ((Object) (((Representation)((AdaptationSet)((Period) (obj)).adaptationSets.get(i)).representations.get(0)).getIndex()));
		//   79  141:aload           10
		//   80  143:getfield        #75  <Field List Period.adaptationSets>
		//   81  146:iload_3         
		//   82  147:invokeinterface #81  <Method Object List.get(int)>
		//   83  152:checkcast       #83  <Class AdaptationSet>
		//   84  155:getfield        #86  <Field List AdaptationSet.representations>
		//   85  158:iconst_0        
		//   86  159:invokeinterface #81  <Method Object List.get(int)>
		//   87  164:checkcast       #88  <Class Representation>
		//   88  167:invokevirtual   #92  <Method DashSegmentIndex Representation.getIndex()>
		//   89  170:astore          10
			if(obj != null)
		//*  90  172:aload           10
		//*  91  174:ifnull          217
			{
				if(((DashSegmentIndex) (obj)).getSegmentCount(l3) == 0)
		//*  92  177:aload           10
		//*  93  179:lload           8
		//*  94  181:invokeinterface #98  <Method int DashSegmentIndex.getSegmentCount(long)>
		//*  95  186:ifne            192
					return l1;
		//   96  189:lload           4
		//   97  191:lreturn         
				else
					return (l1 + ((DashSegmentIndex) (obj)).getTimeUs(((DashSegmentIndex) (obj)).getSegmentNum(l2, l3))) - l2;
		//   98  192:lload           4
		//   99  194:aload           10
		//  100  196:aload           10
		//  101  198:lload           6
		//  102  200:lload           8
		//  103  202:invokeinterface #102 <Method long DashSegmentIndex.getSegmentNum(long, long)>
		//  104  207:invokeinterface #105 <Method long DashSegmentIndex.getTimeUs(long)>
		//  105  212:ladd            
		//  106  213:lload           6
		//  107  215:lsub            
		//  108  216:lreturn         
			} else
			{
				return l1;
		//  109  217:lload           4
		//  110  219:lreturn         
			}
		}

		public int getIndexOfPeriod(Object obj)
		{
			boolean flag = obj instanceof Integer;
		//    0    0:aload_1         
		//    1    1:instanceof      #109 <Class Integer>
		//    2    4:istore          4
			int i = -1;
		//    3    6:iconst_m1       
		//    4    7:istore_2        
			if(!flag)
		//*   5    8:iload           4
		//*   6   10:ifne            15
				return -1;
		//    7   13:iconst_m1       
		//    8   14:ireturn         
			int j = ((Integer)obj).intValue();
		//    9   15:aload_1         
		//   10   16:checkcast       #109 <Class Integer>
		//   11   19:invokevirtual   #112 <Method int Integer.intValue()>
		//   12   22:istore_3        
			if(j >= firstPeriodId)
		//*  13   23:iload_3         
		//*  14   24:aload_0         
		//*  15   25:getfield        #31  <Field int firstPeriodId>
		//*  16   28:icmplt          53
			{
				if(j >= firstPeriodId + getPeriodCount())
		//*  17   31:iload_3         
		//*  18   32:aload_0         
		//*  19   33:getfield        #31  <Field int firstPeriodId>
		//*  20   36:aload_0         
		//*  21   37:invokevirtual   #113 <Method int getPeriodCount()>
		//*  22   40:iadd            
		//*  23   41:icmplt          46
					return -1;
		//   24   44:iconst_m1       
		//   25   45:ireturn         
				i = j - firstPeriodId;
		//   26   46:iload_3         
		//   27   47:aload_0         
		//   28   48:getfield        #31  <Field int firstPeriodId>
		//   29   51:isub            
		//   30   52:istore_2        
			}
			return i;
		//   31   53:iload_2         
		//   32   54:ireturn         
		}

		public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean flag)
		{
			Assertions.checkIndex(i, 0, manifest.getPeriodCount());
		//    0    0:iload_1         
		//    1    1:iconst_0        
		//    2    2:aload_0         
		//    3    3:getfield        #39  <Field DashManifest manifest>
		//    4    6:invokevirtual   #61  <Method int DashManifest.getPeriodCount()>
		//    5    9:invokestatic    #120 <Method int Assertions.checkIndex(int, int, int)>
		//    6   12:pop             
			Integer integer = null;
		//    7   13:aconst_null     
		//    8   14:astore          5
			String s;
			if(flag)
		//*   9   16:iload_3         
		//*  10   17:ifeq            36
				s = manifest.getPeriod(i).id;
		//   11   20:aload_0         
		//   12   21:getfield        #39  <Field DashManifest manifest>
		//   13   24:iload_1         
		//   14   25:invokevirtual   #65  <Method Period DashManifest.getPeriod(int)>
		//   15   28:getfield        #124 <Field String Period.id>
		//   16   31:astore          4
			else
		//*  17   33:goto            39
				s = null;
		//   18   36:aconst_null     
		//   19   37:astore          4
			if(flag)
		//*  20   39:iload_3         
		//*  21   40:ifeq            65
				integer = Integer.valueOf(firstPeriodId + Assertions.checkIndex(i, 0, manifest.getPeriodCount()));
		//   22   43:aload_0         
		//   23   44:getfield        #31  <Field int firstPeriodId>
		//   24   47:iload_1         
		//   25   48:iconst_0        
		//   26   49:aload_0         
		//   27   50:getfield        #39  <Field DashManifest manifest>
		//   28   53:invokevirtual   #61  <Method int DashManifest.getPeriodCount()>
		//   29   56:invokestatic    #120 <Method int Assertions.checkIndex(int, int, int)>
		//   30   59:iadd            
		//   31   60:invokestatic    #128 <Method Integer Integer.valueOf(int)>
		//   32   63:astore          5
			return period.set(((Object) (s)), ((Object) (integer)), 0, manifest.getPeriodDurationUs(i), C.msToUs(manifest.getPeriod(i).startMs - manifest.getPeriod(0).startMs) - offsetInFirstPeriodUs);
		//   33   65:aload_2         
		//   34   66:aload           4
		//   35   68:aload           5
		//   36   70:iconst_0        
		//   37   71:aload_0         
		//   38   72:getfield        #39  <Field DashManifest manifest>
		//   39   75:iload_1         
		//   40   76:invokevirtual   #57  <Method long DashManifest.getPeriodDurationUs(int)>
		//   41   79:aload_0         
		//   42   80:getfield        #39  <Field DashManifest manifest>
		//   43   83:iload_1         
		//   44   84:invokevirtual   #65  <Method Period DashManifest.getPeriod(int)>
		//   45   87:getfield        #131 <Field long Period.startMs>
		//   46   90:aload_0         
		//   47   91:getfield        #39  <Field DashManifest manifest>
		//   48   94:iconst_0        
		//   49   95:invokevirtual   #65  <Method Period DashManifest.getPeriod(int)>
		//   50   98:getfield        #131 <Field long Period.startMs>
		//   51  101:lsub            
		//   52  102:invokestatic    #136 <Method long C.msToUs(long)>
		//   53  105:aload_0         
		//   54  106:getfield        #33  <Field long offsetInFirstPeriodUs>
		//   55  109:lsub            
		//   56  110:invokevirtual   #142 <Method com.google.android.exoplayer2.Timeline$Period com.google.android.exoplayer2.Timeline$Period.set(Object, Object, int, long, long)>
		//   57  113:areturn         
		}

		public int getPeriodCount()
		{
			return manifest.getPeriodCount();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field DashManifest manifest>
		//    2    4:invokevirtual   #61  <Method int DashManifest.getPeriodCount()>
		//    3    7:ireturn         
		}

		public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, boolean flag, long l)
		{
			Assertions.checkIndex(i, 0, 1);
		//    0    0:iload_1         
		//    1    1:iconst_0        
		//    2    2:iconst_1        
		//    3    3:invokestatic    #120 <Method int Assertions.checkIndex(int, int, int)>
		//    4    6:pop             
			l = getAdjustedWindowDefaultStartPositionUs(l);
		//    5    7:aload_0         
		//    6    8:lload           4
		//    7   10:invokespecial   #146 <Method long getAdjustedWindowDefaultStartPositionUs(long)>
		//    8   13:lstore          4
			Object obj;
			if(flag)
		//*   9   15:iload_3         
		//*  10   16:ifeq            28
				obj = windowTag;
		//   11   19:aload_0         
		//   12   20:getfield        #41  <Field Object windowTag>
		//   13   23:astore          6
			else
		//*  14   25:goto            34
				obj = null;
		//   15   28:aconst_null     
		//   16   29:astore          6
		//*  17   31:goto            25
			return window.set(obj, presentationStartTimeMs, windowStartTimeMs, true, manifest.dynamic, l, windowDurationUs, 0, manifest.getPeriodCount() - 1, offsetInFirstPeriodUs);
		//   18   34:aload_2         
		//   19   35:aload           6
		//   20   37:aload_0         
		//   21   38:getfield        #27  <Field long presentationStartTimeMs>
		//   22   41:aload_0         
		//   23   42:getfield        #29  <Field long windowStartTimeMs>
		//   24   45:iconst_1        
		//   25   46:aload_0         
		//   26   47:getfield        #39  <Field DashManifest manifest>
		//   27   50:getfield        #51  <Field boolean DashManifest.dynamic>
		//   28   53:lload           4
		//   29   55:aload_0         
		//   30   56:getfield        #35  <Field long windowDurationUs>
		//   31   59:iconst_0        
		//   32   60:aload_0         
		//   33   61:getfield        #39  <Field DashManifest manifest>
		//   34   64:invokevirtual   #61  <Method int DashManifest.getPeriodCount()>
		//   35   67:iconst_1        
		//   36   68:isub            
		//   37   69:aload_0         
		//   38   70:getfield        #33  <Field long offsetInFirstPeriodUs>
		//   39   73:invokevirtual   #151 <Method com.google.android.exoplayer2.Timeline$Window com.google.android.exoplayer2.Timeline$Window.set(Object, long, long, boolean, boolean, long, long, int, int, long)>
		//   40   76:areturn         
		}

		public int getWindowCount()
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		private final int firstPeriodId;
		private final DashManifest manifest;
		private final long offsetInFirstPeriodUs;
		private final long presentationStartTimeMs;
		private final long windowDefaultStartPositionUs;
		private final long windowDurationUs;
		private final long windowStartTimeMs;
		private final Object windowTag;

		public DashTimeline(long l, long l1, int i, long l2, 
				long l3, long l4, DashManifest dashmanifest, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Timeline()>
			presentationStartTimeMs = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #27  <Field long presentationStartTimeMs>
			windowStartTimeMs = l1;
		//    5    9:aload_0         
		//    6   10:lload_3         
		//    7   11:putfield        #29  <Field long windowStartTimeMs>
			firstPeriodId = i;
		//    8   14:aload_0         
		//    9   15:iload           5
		//   10   17:putfield        #31  <Field int firstPeriodId>
			offsetInFirstPeriodUs = l2;
		//   11   20:aload_0         
		//   12   21:lload           6
		//   13   23:putfield        #33  <Field long offsetInFirstPeriodUs>
			windowDurationUs = l3;
		//   14   26:aload_0         
		//   15   27:lload           8
		//   16   29:putfield        #35  <Field long windowDurationUs>
			windowDefaultStartPositionUs = l4;
		//   17   32:aload_0         
		//   18   33:lload           10
		//   19   35:putfield        #37  <Field long windowDefaultStartPositionUs>
			manifest = dashmanifest;
		//   20   38:aload_0         
		//   21   39:aload           12
		//   22   41:putfield        #39  <Field DashManifest manifest>
			windowTag = obj;
		//   23   44:aload_0         
		//   24   45:aload           13
		//   25   47:putfield        #41  <Field Object windowTag>
		//   26   50:return          
		}
	}

	private final class DefaultPlayerEmsgCallback
		implements PlayerEmsgHandler.PlayerEmsgCallback
	{

		public void onDashLiveMediaPresentationEndSignalEncountered()
		{
			DashMediaSource.this.onDashLiveMediaPresentationEndSignalEncountered();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DashMediaSource this$0>
		//    2    4:invokevirtual   #25  <Method void DashMediaSource.onDashLiveMediaPresentationEndSignalEncountered()>
		//    3    7:return          
		}

		public void onDashManifestPublishTimeExpired(long l)
		{
			DashMediaSource.this.onDashManifestPublishTimeExpired(l);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DashMediaSource this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #29  <Method void DashMediaSource.onDashManifestPublishTimeExpired(long)>
		//    4    8:return          
		}

		public void onDashManifestRefreshRequested()
		{
			DashMediaSource.this.onDashManifestRefreshRequested();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DashMediaSource this$0>
		//    2    4:invokevirtual   #32  <Method void DashMediaSource.onDashManifestRefreshRequested()>
		//    3    7:return          
		}

		final DashMediaSource this$0;

		private DefaultPlayerEmsgCallback()
		{
			this$0 = DashMediaSource.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field DashMediaSource this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	public static final class Factory
		implements com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory
	{

		public volatile MediaSource createMediaSource(Uri uri)
		{
			return ((MediaSource) (createMediaSource(uri)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #62  <Method DashMediaSource createMediaSource(Uri)>
		//    3    5:areturn         
		}

		public DashMediaSource createMediaSource(Uri uri)
		{
			isCreateCalled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #64  <Field boolean isCreateCalled>
			if(manifestParser == null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
		//*   5    9:ifnonnull       23
				manifestParser = ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new DashManifestParser()));
		//    6   12:aload_0         
		//    7   13:new             #68  <Class DashManifestParser>
		//    8   16:dup             
		//    9   17:invokespecial   #69  <Method void DashManifestParser()>
		//   10   20:putfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
			return new DashMediaSource(((DashManifest) (null)), (Uri)Assertions.checkNotNull(((Object) (uri))), manifestDataSourceFactory, manifestParser, chunkSourceFactory, compositeSequenceableLoaderFactory, minLoadableRetryCount, livePresentationDelayMs, tag);
		//   11   23:new             #8   <Class DashMediaSource>
		//   12   26:dup             
		//   13   27:aconst_null     
		//   14   28:aload_1         
		//   15   29:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
		//   16   32:checkcast       #71  <Class Uri>
		//   17   35:aload_0         
		//   18   36:getfield        #44  <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
		//   19   39:aload_0         
		//   20   40:getfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
		//   21   43:aload_0         
		//   22   44:getfield        #42  <Field DashChunkSource$Factory chunkSourceFactory>
		//   23   47:aload_0         
		//   24   48:getfield        #55  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		//   25   51:aload_0         
		//   26   52:getfield        #46  <Field int minLoadableRetryCount>
		//   27   55:aload_0         
		//   28   56:getfield        #50  <Field long livePresentationDelayMs>
		//   29   59:aload_0         
		//   30   60:getfield        #73  <Field Object tag>
		//   31   63:aconst_null     
		//   32   64:invokespecial   #76  <Method void DashMediaSource(DashManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, DashChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object, DashMediaSource$1)>
		//   33   67:areturn         
		}

		public DashMediaSource createMediaSource(Uri uri, Handler handler1, MediaSourceEventListener mediasourceeventlistener)
		{
			uri = ((Uri) (createMediaSource(uri)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #62  <Method DashMediaSource createMediaSource(Uri)>
		//    3    5:astore_1        
			if(handler1 != null && mediasourceeventlistener != null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          20
		//*   6   10:aload_3         
		//*   7   11:ifnull          20
				((DashMediaSource) (uri)).addEventListener(handler1, mediasourceeventlistener);
		//    8   14:aload_1         
		//    9   15:aload_2         
		//   10   16:aload_3         
		//   11   17:invokevirtual   #82  <Method void DashMediaSource.addEventListener(Handler, MediaSourceEventListener)>
			return ((DashMediaSource) (uri));
		//   12   20:aload_1         
		//   13   21:areturn         
		}

		public DashMediaSource createMediaSource(DashManifest dashmanifest)
		{
			Assertions.checkArgument(dashmanifest.dynamic ^ true);
		//    0    0:aload_1         
		//    1    1:getfield        #89  <Field boolean DashManifest.dynamic>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #93  <Method void Assertions.checkArgument(boolean)>
			isCreateCalled = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #64  <Field boolean isCreateCalled>
			return new DashMediaSource(dashmanifest, ((Uri) (null)), ((com.google.android.exoplayer2.upstream.DataSource.Factory) (null)), ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (null)), chunkSourceFactory, compositeSequenceableLoaderFactory, minLoadableRetryCount, livePresentationDelayMs, tag);
		//    8   14:new             #8   <Class DashMediaSource>
		//    9   17:dup             
		//   10   18:aload_1         
		//   11   19:aconst_null     
		//   12   20:aconst_null     
		//   13   21:aconst_null     
		//   14   22:aload_0         
		//   15   23:getfield        #42  <Field DashChunkSource$Factory chunkSourceFactory>
		//   16   26:aload_0         
		//   17   27:getfield        #55  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		//   18   30:aload_0         
		//   19   31:getfield        #46  <Field int minLoadableRetryCount>
		//   20   34:aload_0         
		//   21   35:getfield        #50  <Field long livePresentationDelayMs>
		//   22   38:aload_0         
		//   23   39:getfield        #73  <Field Object tag>
		//   24   42:aconst_null     
		//   25   43:invokespecial   #76  <Method void DashMediaSource(DashManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, DashChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object, DashMediaSource$1)>
		//   26   46:areturn         
		}

		public DashMediaSource createMediaSource(DashManifest dashmanifest, Handler handler1, MediaSourceEventListener mediasourceeventlistener)
		{
			dashmanifest = ((DashManifest) (createMediaSource(dashmanifest)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #96  <Method DashMediaSource createMediaSource(DashManifest)>
		//    3    5:astore_1        
			if(handler1 != null && mediasourceeventlistener != null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          20
		//*   6   10:aload_3         
		//*   7   11:ifnull          20
				((DashMediaSource) (dashmanifest)).addEventListener(handler1, mediasourceeventlistener);
		//    8   14:aload_1         
		//    9   15:aload_2         
		//   10   16:aload_3         
		//   11   17:invokevirtual   #82  <Method void DashMediaSource.addEventListener(Handler, MediaSourceEventListener)>
			return ((DashMediaSource) (dashmanifest));
		//   12   20:aload_1         
		//   13   21:areturn         
		}

		public int[] getSupportedTypes()
		{
			return (new int[] {
				0
			});
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:iconst_0        
		//    5    6:iastore         
		//    6    7:areturn         
		}

		public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositesequenceableloaderfactory)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #103 <Method void Assertions.checkState(boolean)>
			compositeSequenceableLoaderFactory = (CompositeSequenceableLoaderFactory)Assertions.checkNotNull(((Object) (compositesequenceableloaderfactory)));
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
		//    8   14:checkcast       #105 <Class CompositeSequenceableLoaderFactory>
		//    9   17:putfield        #55  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
			return this;
		//   10   20:aload_0         
		//   11   21:areturn         
		}

		public Factory setLivePresentationDelayMs(long l)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #103 <Method void Assertions.checkState(boolean)>
			livePresentationDelayMs = l;
		//    5    9:aload_0         
		//    6   10:lload_1         
		//    7   11:putfield        #50  <Field long livePresentationDelayMs>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setManifestParser(com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #103 <Method void Assertions.checkState(boolean)>
			manifestParser = (com.google.android.exoplayer2.upstream.ParsingLoadable.Parser)Assertions.checkNotNull(((Object) (parser)));
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
		//    8   14:checkcast       #111 <Class com.google.android.exoplayer2.upstream.ParsingLoadable$Parser>
		//    9   17:putfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
			return this;
		//   10   20:aload_0         
		//   11   21:areturn         
		}

		public Factory setMinLoadableRetryCount(int i)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #103 <Method void Assertions.checkState(boolean)>
			minLoadableRetryCount = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #46  <Field int minLoadableRetryCount>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setTag(Object obj)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #103 <Method void Assertions.checkState(boolean)>
			tag = obj;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #73  <Field Object tag>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		private final DashChunkSource.Factory chunkSourceFactory;
		private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
		private boolean isCreateCalled;
		private long livePresentationDelayMs;
		private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
		private com.google.android.exoplayer2.upstream.ParsingLoadable.Parser manifestParser;
		private int minLoadableRetryCount;
		private Object tag;

		public Factory(DashChunkSource.Factory factory, com.google.android.exoplayer2.upstream.DataSource.Factory factory1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
			chunkSourceFactory = (DashChunkSource.Factory)Assertions.checkNotNull(((Object) (factory)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
		//    5    9:checkcast       #40  <Class DashChunkSource$Factory>
		//    6   12:putfield        #42  <Field DashChunkSource$Factory chunkSourceFactory>
			manifestDataSourceFactory = factory1;
		//    7   15:aload_0         
		//    8   16:aload_2         
		//    9   17:putfield        #44  <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
			minLoadableRetryCount = 3;
		//   10   20:aload_0         
		//   11   21:iconst_3        
		//   12   22:putfield        #46  <Field int minLoadableRetryCount>
			livePresentationDelayMs = -1L;
		//   13   25:aload_0         
		//   14   26:ldc2w           #47  <Long -1L>
		//   15   29:putfield        #50  <Field long livePresentationDelayMs>
			compositeSequenceableLoaderFactory = ((CompositeSequenceableLoaderFactory) (new DefaultCompositeSequenceableLoaderFactory()));
		//   16   32:aload_0         
		//   17   33:new             #52  <Class DefaultCompositeSequenceableLoaderFactory>
		//   18   36:dup             
		//   19   37:invokespecial   #53  <Method void DefaultCompositeSequenceableLoaderFactory()>
		//   20   40:putfield        #55  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		//   21   43:return          
		}
	}

	static final class Iso8601Parser
		implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
	{

		public Long parse(Uri uri, InputStream inputstream)
			throws IOException
		{
			inputstream = ((InputStream) ((new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream, Charset.forName("UTF-8")))))).readLine()));
		//    0    0:new             #36  <Class BufferedReader>
		//    1    3:dup             
		//    2    4:new             #38  <Class InputStreamReader>
		//    3    7:dup             
		//    4    8:aload_2         
		//    5    9:ldc1            #40  <String "UTF-8">
		//    6   11:invokestatic    #46  <Method Charset Charset.forName(String)>
		//    7   14:invokespecial   #49  <Method void InputStreamReader(InputStream, Charset)>
		//    8   17:invokespecial   #52  <Method void BufferedReader(java.io.Reader)>
		//    9   20:invokevirtual   #56  <Method String BufferedReader.readLine()>
		//   10   23:astore_2        
			long l2;
			uri = ((Uri) (TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(((CharSequence) (inputstream)))));
		//   11   24:getstatic       #24  <Field Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN>
		//   12   27:aload_2         
		//   13   28:invokevirtual   #60  <Method Matcher Pattern.matcher(CharSequence)>
		//   14   31:astore_1        
			if(!((Matcher) (uri)).matches())
		//*  15   32:aload_1         
		//*  16   33:invokevirtual   #66  <Method boolean Matcher.matches()>
		//*  17   36:ifne            72
			{
				uri = ((Uri) (new StringBuilder()));
		//   18   39:new             #68  <Class StringBuilder>
		//   19   42:dup             
		//   20   43:invokespecial   #69  <Method void StringBuilder()>
		//   21   46:astore_1        
				((StringBuilder) (uri)).append("Couldn't parse timestamp: ");
		//   22   47:aload_1         
		//   23   48:ldc1            #71  <String "Couldn't parse timestamp: ">
		//   24   50:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   25   53:pop             
				((StringBuilder) (uri)).append(((String) (inputstream)));
		//   26   54:aload_1         
		//   27   55:aload_2         
		//   28   56:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   29   59:pop             
				throw new ParserException(((StringBuilder) (uri)).toString());
		//   30   60:new             #77  <Class ParserException>
		//   31   63:dup             
		//   32   64:aload_1         
		//   33   65:invokevirtual   #80  <Method String StringBuilder.toString()>
		//   34   68:invokespecial   #83  <Method void ParserException(String)>
		//   35   71:athrow          
			}
			inputstream = ((InputStream) (((Matcher) (uri)).group(1)));
		//   36   72:aload_1         
		//   37   73:iconst_1        
		//   38   74:invokevirtual   #87  <Method String Matcher.group(int)>
		//   39   77:astore_2        
			SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
		//   40   78:new             #89  <Class SimpleDateFormat>
		//   41   81:dup             
		//   42   82:ldc1            #91  <String "yyyy-MM-dd'T'HH:mm:ss">
		//   43   84:getstatic       #97  <Field Locale Locale.US>
		//   44   87:invokespecial   #100 <Method void SimpleDateFormat(String, Locale)>
		//   45   90:astore          11
			simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
		//   46   92:aload           11
		//   47   94:ldc1            #102 <String "UTC">
		//   48   96:invokestatic    #108 <Method TimeZone TimeZone.getTimeZone(String)>
		//   49   99:invokevirtual   #112 <Method void SimpleDateFormat.setTimeZone(TimeZone)>
			l2 = simpledateformat.parse(((String) (inputstream))).getTime();
		//   50  102:aload           11
		//   51  104:aload_2         
		//   52  105:invokevirtual   #115 <Method Date SimpleDateFormat.parse(String)>
		//   53  108:invokevirtual   #121 <Method long Date.getTime()>
		//   54  111:lstore          7
			if(!"Z".equals(((Object) (((Matcher) (uri)).group(2))))) goto _L2; else goto _L1
		//   55  113:ldc1            #123 <String "Z">
		//   56  115:aload_1         
		//   57  116:iconst_2        
		//   58  117:invokevirtual   #87  <Method String Matcher.group(int)>
		//   59  120:invokevirtual   #129 <Method boolean String.equals(Object)>
		//   60  123:ifeq            132
_L1:
			long l = l2;
		//   61  126:lload           7
		//   62  128:lstore_3        
			  goto _L3
		//*  63  129:goto            189
_L2:
			long l3;
			if("+".equals(((Object) (((Matcher) (uri)).group(4)))))
		//*  64  132:ldc1            #131 <String "+">
		//*  65  134:aload_1         
		//*  66  135:iconst_4        
		//*  67  136:invokevirtual   #87  <Method String Matcher.group(int)>
		//*  68  139:invokevirtual   #129 <Method boolean String.equals(Object)>
		//*  69  142:ifeq            204
				l = 1L;
		//   70  145:lconst_1        
		//   71  146:lstore_3        
			else
		//*  72  147:goto            150
		//*  73  150:aload_1         
		//*  74  151:iconst_5        
		//*  75  152:invokevirtual   #87  <Method String Matcher.group(int)>
		//*  76  155:invokestatic    #137 <Method long Long.parseLong(String)>
		//*  77  158:lstore          9
		//*  78  160:aload_1         
		//*  79  161:bipush          7
		//*  80  163:invokevirtual   #87  <Method String Matcher.group(int)>
		//*  81  166:astore_1        
		//*  82  167:aload_1         
		//*  83  168:invokestatic    #143 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  84  171:ifeq            180
		//*  85  174:lconst_0        
		//*  86  175:lstore          5
		//*  87  177:goto            211
		//*  88  180:aload_1         
		//*  89  181:invokestatic    #137 <Method long Long.parseLong(String)>
		//*  90  184:lstore          5
		//*  91  186:goto            211
		//*  92  189:lload_3         
		//*  93  190:invokestatic    #147 <Method Long Long.valueOf(long)>
		//*  94  193:areturn         
		//*  95  194:astore_1        
		//*  96  195:new             #77  <Class ParserException>
		//*  97  198:dup             
		//*  98  199:aload_1         
		//*  99  200:invokespecial   #150 <Method void ParserException(Throwable)>
		//* 100  203:athrow          
				l = -1L;
		//  101  204:ldc2w           #151 <Long -1L>
		//  102  207:lstore_3        
			l3 = Long.parseLong(((Matcher) (uri)).group(5));
			uri = ((Uri) (((Matcher) (uri)).group(7)));
			long l1;
			if(TextUtils.isEmpty(((CharSequence) (uri))))
				l1 = 0L;
			else
				try
				{
					l1 = Long.parseLong(((String) (uri)));
				}
				// Misplaced declaration of an exception variable
				catch(Uri uri)
				{
					throw new ParserException(((Throwable) (uri)));
				}
		//* 103  208:goto            150
			l = l2 - l * ((l3 * 60L + l1) * 60L * 1000L);
		//  104  211:lload           7
		//  105  213:lload_3         
		//  106  214:lload           9
		//  107  216:ldc2w           #153 <Long 60L>
		//  108  219:lmul            
		//  109  220:lload           5
		//  110  222:ladd            
		//  111  223:ldc2w           #153 <Long 60L>
		//  112  226:lmul            
		//  113  227:ldc2w           #155 <Long 1000L>
		//  114  230:lmul            
		//  115  231:lmul            
		//  116  232:lsub            
		//  117  233:lstore_3        
			  goto _L4
_L3:
			return Long.valueOf(l);
_L4:
			if(true) goto _L3; else goto _L5
		//  118  234:goto            189
_L5:
		}

		public volatile Object parse(Uri uri, InputStream inputstream)
			throws IOException
		{
			return ((Object) (parse(uri, inputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #160 <Method Long parse(Uri, InputStream)>
		//    4    6:areturn         
		}

		private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|\u2212)(\\d\\d)(:?(\\d\\d))?))");

		static 
		{
		//    0    0:ldc1            #16  <String "(.+?)(Z|((\\+|-|\u2212)(\\d\\d)(:?(\\d\\d))?))">
		//    1    2:invokestatic    #22  <Method Pattern Pattern.compile(String)>
		//    2    5:putstatic       #24  <Field Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN>
		//*   3    8:return          
		}

		Iso8601Parser()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
		//    2    4:return          
		}
	}

	private final class ManifestCallback
		implements com.google.android.exoplayer2.upstream.Loader.Callback
	{

		public volatile void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, boolean flag)
		{
			onLoadCanceled((ParsingLoadable)loadable, l, l1, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #27  <Class ParsingLoadable>
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:iload           6
		//    6   10:invokevirtual   #30  <Method void onLoadCanceled(ParsingLoadable, long, long, boolean)>
		//    7   13:return          
		}

		public void onLoadCanceled(ParsingLoadable parsingloadable, long l, long l1, boolean flag)
		{
			DashMediaSource.this.onLoadCanceled(parsingloadable, l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field DashMediaSource this$0>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:invokevirtual   #33  <Method void DashMediaSource.onLoadCanceled(ParsingLoadable, long, long)>
		//    6   11:return          
		}

		public volatile void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1)
		{
			onLoadCompleted((ParsingLoadable)loadable, l, l1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #27  <Class ParsingLoadable>
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:invokevirtual   #39  <Method void onLoadCompleted(ParsingLoadable, long, long)>
		//    6   11:return          
		}

		public void onLoadCompleted(ParsingLoadable parsingloadable, long l, long l1)
		{
			onManifestLoadCompleted(parsingloadable, l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field DashMediaSource this$0>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:invokevirtual   #42  <Method void DashMediaSource.onManifestLoadCompleted(ParsingLoadable, long, long)>
		//    6   11:return          
		}

		public volatile int onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, IOException ioexception)
		{
			return onLoadError((ParsingLoadable)loadable, l, l1, ioexception);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #27  <Class ParsingLoadable>
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:aload           6
		//    6   10:invokevirtual   #48  <Method int onLoadError(ParsingLoadable, long, long, IOException)>
		//    7   13:ireturn         
		}

		public int onLoadError(ParsingLoadable parsingloadable, long l, long l1, IOException ioexception)
		{
			return onManifestLoadError(parsingloadable, l, l1, ioexception);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field DashMediaSource this$0>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:aload           6
		//    6   10:invokevirtual   #51  <Method int DashMediaSource.onManifestLoadError(ParsingLoadable, long, long, IOException)>
		//    7   13:ireturn         
		}

		final DashMediaSource this$0;

		private ManifestCallback()
		{
			this$0 = DashMediaSource.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field DashMediaSource this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}

	}

	final class ManifestLoadErrorThrower
		implements LoaderErrorThrower
	{

		private void maybeThrowManifestError()
			throws IOException
		{
			if(manifestFatalError != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field DashMediaSource this$0>
		//*   2    4:invokestatic    #26  <Method IOException DashMediaSource.access$800(DashMediaSource)>
		//*   3    7:ifnull          18
				throw manifestFatalError;
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field DashMediaSource this$0>
		//    6   14:invokestatic    #26  <Method IOException DashMediaSource.access$800(DashMediaSource)>
		//    7   17:athrow          
			else
				return;
		//    8   18:return          
		}

		public void maybeThrowError()
			throws IOException
		{
			loader.maybeThrowError();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DashMediaSource this$0>
		//    2    4:invokestatic    #32  <Method Loader DashMediaSource.access$700(DashMediaSource)>
		//    3    7:invokevirtual   #36  <Method void Loader.maybeThrowError()>
			maybeThrowManifestError();
		//    4   10:aload_0         
		//    5   11:invokespecial   #38  <Method void maybeThrowManifestError()>
		//    6   14:return          
		}

		public void maybeThrowError(int i)
			throws IOException
		{
			loader.maybeThrowError(i);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DashMediaSource this$0>
		//    2    4:invokestatic    #32  <Method Loader DashMediaSource.access$700(DashMediaSource)>
		//    3    7:iload_1         
		//    4    8:invokevirtual   #41  <Method void Loader.maybeThrowError(int)>
			maybeThrowManifestError();
		//    5   11:aload_0         
		//    6   12:invokespecial   #38  <Method void maybeThrowManifestError()>
		//    7   15:return          
		}

		final DashMediaSource this$0;

		ManifestLoadErrorThrower()
		{
			this$0 = DashMediaSource.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field DashMediaSource this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private static final class PeriodSeekInfo
	{

		public static PeriodSeekInfo createPeriodSeekInfo(Period period, long l)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:296)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #28  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #30  <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:296)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #35  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public final long availableEndTimeUs;
		public final long availableStartTimeUs;
		public final boolean isIndexExplicit;

		private PeriodSeekInfo(boolean flag, long l, long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			isIndexExplicit = flag;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field boolean isIndexExplicit>
			availableStartTimeUs = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #21  <Field long availableStartTimeUs>
			availableEndTimeUs = l1;
		//    8   14:aload_0         
		//    9   15:lload           4
		//   10   17:putfield        #23  <Field long availableEndTimeUs>
		//   11   20:return          
		}
	}

	private final class UtcTimestampCallback
		implements com.google.android.exoplayer2.upstream.Loader.Callback
	{

		public volatile void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, boolean flag)
		{
			onLoadCanceled((ParsingLoadable)loadable, l, l1, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #27  <Class ParsingLoadable>
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:iload           6
		//    6   10:invokevirtual   #30  <Method void onLoadCanceled(ParsingLoadable, long, long, boolean)>
		//    7   13:return          
		}

		public void onLoadCanceled(ParsingLoadable parsingloadable, long l, long l1, boolean flag)
		{
			DashMediaSource.this.onLoadCanceled(parsingloadable, l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field DashMediaSource this$0>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:invokevirtual   #33  <Method void DashMediaSource.onLoadCanceled(ParsingLoadable, long, long)>
		//    6   11:return          
		}

		public volatile void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1)
		{
			onLoadCompleted((ParsingLoadable)loadable, l, l1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #27  <Class ParsingLoadable>
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:invokevirtual   #39  <Method void onLoadCompleted(ParsingLoadable, long, long)>
		//    6   11:return          
		}

		public void onLoadCompleted(ParsingLoadable parsingloadable, long l, long l1)
		{
			onUtcTimestampLoadCompleted(parsingloadable, l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field DashMediaSource this$0>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:invokevirtual   #42  <Method void DashMediaSource.onUtcTimestampLoadCompleted(ParsingLoadable, long, long)>
		//    6   11:return          
		}

		public volatile int onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, IOException ioexception)
		{
			return onLoadError((ParsingLoadable)loadable, l, l1, ioexception);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #27  <Class ParsingLoadable>
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:aload           6
		//    6   10:invokevirtual   #48  <Method int onLoadError(ParsingLoadable, long, long, IOException)>
		//    7   13:ireturn         
		}

		public int onLoadError(ParsingLoadable parsingloadable, long l, long l1, IOException ioexception)
		{
			return onUtcTimestampLoadError(parsingloadable, l, l1, ioexception);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field DashMediaSource this$0>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:aload           6
		//    6   10:invokevirtual   #51  <Method int DashMediaSource.onUtcTimestampLoadError(ParsingLoadable, long, long, IOException)>
		//    7   13:ireturn         
		}

		final DashMediaSource this$0;

		private UtcTimestampCallback()
		{
			this$0 = DashMediaSource.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field DashMediaSource this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}

	}

	private static final class XsDateTimeParser
		implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
	{

		public Long parse(Uri uri, InputStream inputstream)
			throws IOException
		{
			return Long.valueOf(Util.parseXsDateTime((new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))))).readLine()));
		//    0    0:new             #23  <Class BufferedReader>
		//    1    3:dup             
		//    2    4:new             #25  <Class InputStreamReader>
		//    3    7:dup             
		//    4    8:aload_2         
		//    5    9:invokespecial   #28  <Method void InputStreamReader(InputStream)>
		//    6   12:invokespecial   #31  <Method void BufferedReader(java.io.Reader)>
		//    7   15:invokevirtual   #35  <Method String BufferedReader.readLine()>
		//    8   18:invokestatic    #41  <Method long Util.parseXsDateTime(String)>
		//    9   21:invokestatic    #47  <Method Long Long.valueOf(long)>
		//   10   24:areturn         
		}

		public volatile Object parse(Uri uri, InputStream inputstream)
			throws IOException
		{
			return ((Object) (parse(uri, inputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #51  <Method Long parse(Uri, InputStream)>
		//    4    6:areturn         
		}

		private XsDateTimeParser()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}


	public DashMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, DashChunkSource.Factory factory1, int i, long l, Handler handler1, 
			MediaSourceEventListener mediasourceeventlistener)
	{
		this(uri, factory, ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new DashManifestParser())), factory1, i, l, handler1, mediasourceeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #122 <Class DashManifestParser>
	//    4    6:dup             
	//    5    7:invokespecial   #124 <Method void DashManifestParser()>
	//    6   10:aload_3         
	//    7   11:iload           4
	//    8   13:lload           5
	//    9   15:aload           7
	//   10   17:aload           8
	//   11   19:invokespecial   #127 <Method void DashMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, DashChunkSource$Factory, int, long, Handler, MediaSourceEventListener)>
	//   12   22:return          
	}

	public DashMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, DashChunkSource.Factory factory1, Handler handler1, MediaSourceEventListener mediasourceeventlistener)
	{
		this(uri, factory, factory1, 3, -1L, handler1, mediasourceeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_3        
	//    5    5:ldc2w           #41  <Long -1L>
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #131 <Method void DashMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, DashChunkSource$Factory, int, long, Handler, MediaSourceEventListener)>
	//    9   15:return          
	}

	public DashMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser, DashChunkSource.Factory factory1, int i, long l, 
			Handler handler1, MediaSourceEventListener mediasourceeventlistener)
	{
		this(((DashManifest) (null)), uri, factory, parser, factory1, ((CompositeSequenceableLoaderFactory) (new DefaultCompositeSequenceableLoaderFactory())), i, l, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:new             #133 <Class DefaultCompositeSequenceableLoaderFactory>
	//    7   10:dup             
	//    8   11:invokespecial   #134 <Method void DefaultCompositeSequenceableLoaderFactory()>
	//    9   14:iload           5
	//   10   16:lload           6
	//   11   18:aconst_null     
	//   12   19:invokespecial   #137 <Method void DashMediaSource(DashManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, DashChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object)>
		if(handler1 != null && mediasourceeventlistener != null)
	//*  13   22:aload           8
	//*  14   24:ifnull          41
	//*  15   27:aload           9
	//*  16   29:ifnull          41
		{
			addEventListener(handler1, mediasourceeventlistener);
	//   17   32:aload_0         
	//   18   33:aload           8
	//   19   35:aload           9
	//   20   37:invokevirtual   #141 <Method void addEventListener(Handler, MediaSourceEventListener)>
			return;
	//   21   40:return          
		} else
		{
			return;
	//   22   41:return          
		}
	}

	private DashMediaSource(DashManifest dashmanifest, Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser, DashChunkSource.Factory factory1, CompositeSequenceableLoaderFactory compositesequenceableloaderfactory, int i, 
			long l, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #144 <Method void BaseMediaSource()>
		initialManifestUri = uri;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #146 <Field Uri initialManifestUri>
		manifest = dashmanifest;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #148 <Field DashManifest manifest>
		manifestUri = uri;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #150 <Field Uri manifestUri>
		manifestDataSourceFactory = factory;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #152 <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
		manifestParser = parser;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #154 <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
		chunkSourceFactory = factory1;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:putfield        #156 <Field DashChunkSource$Factory chunkSourceFactory>
		minLoadableRetryCount = i;
	//   20   36:aload_0         
	//   21   37:iload           7
	//   22   39:putfield        #158 <Field int minLoadableRetryCount>
		livePresentationDelayMs = l;
	//   23   42:aload_0         
	//   24   43:lload           8
	//   25   45:putfield        #160 <Field long livePresentationDelayMs>
		compositeSequenceableLoaderFactory = compositesequenceableloaderfactory;
	//   26   48:aload_0         
	//   27   49:aload           6
	//   28   51:putfield        #162 <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		tag = obj;
	//   29   54:aload_0         
	//   30   55:aload           10
	//   31   57:putfield        #164 <Field Object tag>
		boolean flag;
		if(dashmanifest != null)
	//*  32   60:aload_1         
	//*  33   61:ifnull          70
			flag = true;
	//   34   64:iconst_1        
	//   35   65:istore          11
		else
	//*  36   67:goto            73
			flag = false;
	//   37   70:iconst_0        
	//   38   71:istore          11
		sideloadedManifest = flag;
	//   39   73:aload_0         
	//   40   74:iload           11
	//   41   76:putfield        #166 <Field boolean sideloadedManifest>
		manifestEventDispatcher = createEventDispatcher(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (null)));
	//   42   79:aload_0         
	//   43   80:aload_0         
	//   44   81:aconst_null     
	//   45   82:invokevirtual   #170 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher createEventDispatcher(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//   46   85:putfield        #172 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
		manifestUriLock = new Object();
	//   47   88:aload_0         
	//   48   89:new             #174 <Class Object>
	//   49   92:dup             
	//   50   93:invokespecial   #175 <Method void Object()>
	//   51   96:putfield        #177 <Field Object manifestUriLock>
		periodsById = new SparseArray();
	//   52   99:aload_0         
	//   53  100:new             #179 <Class SparseArray>
	//   54  103:dup             
	//   55  104:invokespecial   #180 <Method void SparseArray()>
	//   56  107:putfield        #182 <Field SparseArray periodsById>
		playerEmsgCallback = ((PlayerEmsgHandler.PlayerEmsgCallback) (new DefaultPlayerEmsgCallback()));
	//   57  110:aload_0         
	//   58  111:new             #13  <Class DashMediaSource$DefaultPlayerEmsgCallback>
	//   59  114:dup             
	//   60  115:aload_0         
	//   61  116:aconst_null     
	//   62  117:invokespecial   #185 <Method void DashMediaSource$DefaultPlayerEmsgCallback(DashMediaSource, DashMediaSource$1)>
	//   63  120:putfield        #187 <Field PlayerEmsgHandler$PlayerEmsgCallback playerEmsgCallback>
		expiredManifestPublishTimeUs = 0x1L;
	//   64  123:aload_0         
	//   65  124:ldc2w           #188 <Long 0x1L>
	//   66  127:putfield        #191 <Field long expiredManifestPublishTimeUs>
		if(sideloadedManifest)
	//*  67  130:aload_0         
	//*  68  131:getfield        #166 <Field boolean sideloadedManifest>
	//*  69  134:ifeq            173
		{
			Assertions.checkState(dashmanifest.dynamic ^ true);
	//   70  137:aload_1         
	//   71  138:getfield        #196 <Field boolean DashManifest.dynamic>
	//   72  141:iconst_1        
	//   73  142:ixor            
	//   74  143:invokestatic    #202 <Method void Assertions.checkState(boolean)>
			manifestCallback = null;
	//   75  146:aload_0         
	//   76  147:aconst_null     
	//   77  148:putfield        #204 <Field DashMediaSource$ManifestCallback manifestCallback>
			refreshManifestRunnable = null;
	//   78  151:aload_0         
	//   79  152:aconst_null     
	//   80  153:putfield        #206 <Field Runnable refreshManifestRunnable>
			simulateManifestRefreshRunnable = null;
	//   81  156:aload_0         
	//   82  157:aconst_null     
	//   83  158:putfield        #208 <Field Runnable simulateManifestRefreshRunnable>
			manifestLoadErrorThrower = ((LoaderErrorThrower) (new com.google.android.exoplayer2.upstream.LoaderErrorThrower.Dummy()));
	//   84  161:aload_0         
	//   85  162:new             #210 <Class com.google.android.exoplayer2.upstream.LoaderErrorThrower$Dummy>
	//   86  165:dup             
	//   87  166:invokespecial   #211 <Method void com.google.android.exoplayer2.upstream.LoaderErrorThrower$Dummy()>
	//   88  169:putfield        #213 <Field LoaderErrorThrower manifestLoadErrorThrower>
			return;
	//   89  172:return          
		} else
		{
			manifestCallback = new ManifestCallback();
	//   90  173:aload_0         
	//   91  174:new             #22  <Class DashMediaSource$ManifestCallback>
	//   92  177:dup             
	//   93  178:aload_0         
	//   94  179:aconst_null     
	//   95  180:invokespecial   #214 <Method void DashMediaSource$ManifestCallback(DashMediaSource, DashMediaSource$1)>
	//   96  183:putfield        #204 <Field DashMediaSource$ManifestCallback manifestCallback>
			manifestLoadErrorThrower = ((LoaderErrorThrower) (new ManifestLoadErrorThrower()));
	//   97  186:aload_0         
	//   98  187:new             #25  <Class DashMediaSource$ManifestLoadErrorThrower>
	//   99  190:dup             
	//  100  191:aload_0         
	//  101  192:invokespecial   #217 <Method void DashMediaSource$ManifestLoadErrorThrower(DashMediaSource)>
	//  102  195:putfield        #213 <Field LoaderErrorThrower manifestLoadErrorThrower>
			refreshManifestRunnable = new Runnable() {

				public void run()
				{
					startLoadingManifest();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DashMediaSource this$0>
				//    2    4:invokestatic    #24  <Method void DashMediaSource.access$300(DashMediaSource)>
				//    3    7:return          
				}

				final DashMediaSource this$0;

			
			{
				this$0 = DashMediaSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DashMediaSource this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//  103  198:aload_0         
	//  104  199:new             #6   <Class DashMediaSource$1>
	//  105  202:dup             
	//  106  203:aload_0         
	//  107  204:invokespecial   #218 <Method void DashMediaSource$1(DashMediaSource)>
	//  108  207:putfield        #206 <Field Runnable refreshManifestRunnable>
			simulateManifestRefreshRunnable = new Runnable() {

				public void run()
				{
					processManifest(false);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DashMediaSource this$0>
				//    2    4:iconst_0        
				//    3    5:invokestatic    #25  <Method void DashMediaSource.access$400(DashMediaSource, boolean)>
				//    4    8:return          
				}

				final DashMediaSource this$0;

			
			{
				this$0 = DashMediaSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DashMediaSource this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//  109  210:aload_0         
	//  110  211:new             #8   <Class DashMediaSource$2>
	//  111  214:dup             
	//  112  215:aload_0         
	//  113  216:invokespecial   #219 <Method void DashMediaSource$2(DashMediaSource)>
	//  114  219:putfield        #208 <Field Runnable simulateManifestRefreshRunnable>
			return;
	//  115  222:return          
		}
	}

	DashMediaSource(DashManifest dashmanifest, Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser, DashChunkSource.Factory factory1, CompositeSequenceableLoaderFactory compositesequenceableloaderfactory, int i, 
			long l, Object obj, _cls1 _pcls1)
	{
		this(dashmanifest, uri, factory, parser, factory1, compositesequenceableloaderfactory, i, l, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:iload           7
	//    8   12:lload           8
	//    9   14:aload           10
	//   10   16:invokespecial   #137 <Method void DashMediaSource(DashManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, DashChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object)>
	//   11   19:return          
	}

	public DashMediaSource(DashManifest dashmanifest, DashChunkSource.Factory factory, int i, Handler handler1, MediaSourceEventListener mediasourceeventlistener)
	{
		this(dashmanifest, ((Uri) (null)), ((com.google.android.exoplayer2.upstream.DataSource.Factory) (null)), ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (null)), factory, ((CompositeSequenceableLoaderFactory) (new DefaultCompositeSequenceableLoaderFactory())), i, -1L, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aload_2         
	//    6    6:new             #133 <Class DefaultCompositeSequenceableLoaderFactory>
	//    7    9:dup             
	//    8   10:invokespecial   #134 <Method void DefaultCompositeSequenceableLoaderFactory()>
	//    9   13:iload_3         
	//   10   14:ldc2w           #41  <Long -1L>
	//   11   17:aconst_null     
	//   12   18:invokespecial   #137 <Method void DashMediaSource(DashManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, DashChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object)>
		if(handler1 != null && mediasourceeventlistener != null)
	//*  13   21:aload           4
	//*  14   23:ifnull          40
	//*  15   26:aload           5
	//*  16   28:ifnull          40
		{
			addEventListener(handler1, mediasourceeventlistener);
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:aload           5
	//   20   36:invokevirtual   #141 <Method void addEventListener(Handler, MediaSourceEventListener)>
			return;
	//   21   39:return          
		} else
		{
			return;
	//   22   40:return          
		}
	}

	public DashMediaSource(DashManifest dashmanifest, DashChunkSource.Factory factory, Handler handler1, MediaSourceEventListener mediasourceeventlistener)
	{
		this(dashmanifest, factory, 3, handler1, mediasourceeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_3        
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:invokespecial   #226 <Method void DashMediaSource(DashManifest, DashChunkSource$Factory, int, Handler, MediaSourceEventListener)>
	//    7   10:return          
	}

	private long getManifestLoadRetryDelayMillis()
	{
		return (long)Math.min((staleManifestReloadAttempt - 1) * 1000, 5000);
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field int staleManifestReloadAttempt>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:sipush          1000
	//    5    9:imul            
	//    6   10:sipush          5000
	//    7   13:invokestatic    #253 <Method int Math.min(int, int)>
	//    8   16:i2l             
	//    9   17:lreturn         
	}

	private long getNowUnixTimeUs()
	{
		if(elapsedRealtimeOffsetMs != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field long elapsedRealtimeOffsetMs>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            21
			return C.msToUs(SystemClock.elapsedRealtime() + elapsedRealtimeOffsetMs);
	//    5    9:invokestatic    #261 <Method long SystemClock.elapsedRealtime()>
	//    6   12:aload_0         
	//    7   13:getfield        #256 <Field long elapsedRealtimeOffsetMs>
	//    8   16:ladd            
	//    9   17:invokestatic    #267 <Method long C.msToUs(long)>
	//   10   20:lreturn         
		else
			return C.msToUs(System.currentTimeMillis());
	//   11   21:invokestatic    #272 <Method long System.currentTimeMillis()>
	//   12   24:invokestatic    #267 <Method long C.msToUs(long)>
	//   13   27:lreturn         
	}

	private void onUtcTimestampResolutionError(IOException ioexception)
	{
		Log.e("DashMediaSource", "Failed to resolve UtcTiming element.", ((Throwable) (ioexception)));
	//    0    0:ldc1            #54  <String "DashMediaSource">
	//    1    2:ldc2            #276 <String "Failed to resolve UtcTiming element.">
	//    2    5:aload_1         
	//    3    6:invokestatic    #282 <Method int Log.e(String, String, Throwable)>
	//    4    9:pop             
		processManifest(true);
	//    5   10:aload_0         
	//    6   11:iconst_1        
	//    7   12:invokespecial   #235 <Method void processManifest(boolean)>
	//    8   15:return          
	}

	private void onUtcTimestampResolved(long l)
	{
		elapsedRealtimeOffsetMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #256 <Field long elapsedRealtimeOffsetMs>
		processManifest(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #235 <Method void processManifest(boolean)>
	//    6   10:return          
	}

	private void processManifest(boolean flag)
	{
		for(int i = 0; i < periodsById.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #182 <Field SparseArray periodsById>
	//*   5    7:invokevirtual   #288 <Method int SparseArray.size()>
	//*   6   10:icmpge          61
		{
			int k = periodsById.keyAt(i);
	//    7   13:aload_0         
	//    8   14:getfield        #182 <Field SparseArray periodsById>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #292 <Method int SparseArray.keyAt(int)>
	//   11   21:istore_3        
			if(k >= firstPeriodId)
	//*  12   22:iload_3         
	//*  13   23:aload_0         
	//*  14   24:getfield        #294 <Field int firstPeriodId>
	//*  15   27:icmplt          54
				((DashMediaPeriod)periodsById.valueAt(i)).updateManifest(manifest, k - firstPeriodId);
	//   16   30:aload_0         
	//   17   31:getfield        #182 <Field SparseArray periodsById>
	//   18   34:iload_2         
	//   19   35:invokevirtual   #298 <Method Object SparseArray.valueAt(int)>
	//   20   38:checkcast       #300 <Class DashMediaPeriod>
	//   21   41:aload_0         
	//   22   42:getfield        #148 <Field DashManifest manifest>
	//   23   45:iload_3         
	//   24   46:aload_0         
	//   25   47:getfield        #294 <Field int firstPeriodId>
	//   26   50:isub            
	//   27   51:invokevirtual   #304 <Method void DashMediaPeriod.updateManifest(DashManifest, int)>
		}

	//   28   54:iload_2         
	//   29   55:iconst_1        
	//   30   56:iadd            
	//   31   57:istore_2        
	//*  32   58:goto            2
		int j = manifest.getPeriodCount() - 1;
	//   33   61:aload_0         
	//   34   62:getfield        #148 <Field DashManifest manifest>
	//   35   65:invokevirtual   #307 <Method int DashManifest.getPeriodCount()>
	//   36   68:iconst_1        
	//   37   69:isub            
	//   38   70:istore_2        
		PeriodSeekInfo periodseekinfo = PeriodSeekInfo.createPeriodSeekInfo(manifest.getPeriod(0), manifest.getPeriodDurationUs(0));
	//   39   71:aload_0         
	//   40   72:getfield        #148 <Field DashManifest manifest>
	//   41   75:iconst_0        
	//   42   76:invokevirtual   #311 <Method Period DashManifest.getPeriod(int)>
	//   43   79:aload_0         
	//   44   80:getfield        #148 <Field DashManifest manifest>
	//   45   83:iconst_0        
	//   46   84:invokevirtual   #315 <Method long DashManifest.getPeriodDurationUs(int)>
	//   47   87:invokestatic    #319 <Method DashMediaSource$PeriodSeekInfo DashMediaSource$PeriodSeekInfo.createPeriodSeekInfo(Period, long)>
	//   48   90:astore          16
		PeriodSeekInfo periodseekinfo1 = PeriodSeekInfo.createPeriodSeekInfo(manifest.getPeriod(j), manifest.getPeriodDurationUs(j));
	//   49   92:aload_0         
	//   50   93:getfield        #148 <Field DashManifest manifest>
	//   51   96:iload_2         
	//   52   97:invokevirtual   #311 <Method Period DashManifest.getPeriod(int)>
	//   53  100:aload_0         
	//   54  101:getfield        #148 <Field DashManifest manifest>
	//   55  104:iload_2         
	//   56  105:invokevirtual   #315 <Method long DashManifest.getPeriodDurationUs(int)>
	//   57  108:invokestatic    #319 <Method DashMediaSource$PeriodSeekInfo DashMediaSource$PeriodSeekInfo.createPeriodSeekInfo(Period, long)>
	//   58  111:astore          17
		long l3 = periodseekinfo.availableStartTimeUs;
	//   59  113:aload           16
	//   60  115:getfield        #322 <Field long DashMediaSource$PeriodSeekInfo.availableStartTimeUs>
	//   61  118:lstore          6
		long l1 = periodseekinfo1.availableEndTimeUs;
	//   62  120:aload           17
	//   63  122:getfield        #325 <Field long DashMediaSource$PeriodSeekInfo.availableEndTimeUs>
	//   64  125:lstore          4
		boolean flag1;
		if(manifest.dynamic && !periodseekinfo1.isIndexExplicit)
	//*  65  127:aload_0         
	//*  66  128:getfield        #148 <Field DashManifest manifest>
	//*  67  131:getfield        #196 <Field boolean DashManifest.dynamic>
	//*  68  134:ifeq            292
	//*  69  137:aload           17
	//*  70  139:getfield        #328 <Field boolean DashMediaSource$PeriodSeekInfo.isIndexExplicit>
	//*  71  142:ifne            292
		{
			long l5 = Math.min(getNowUnixTimeUs() - C.msToUs(manifest.availabilityStartTimeMs) - C.msToUs(manifest.getPeriod(j).startMs), l1);
	//   72  145:aload_0         
	//   73  146:invokespecial   #330 <Method long getNowUnixTimeUs()>
	//   74  149:aload_0         
	//   75  150:getfield        #148 <Field DashManifest manifest>
	//   76  153:getfield        #333 <Field long DashManifest.availabilityStartTimeMs>
	//   77  156:invokestatic    #267 <Method long C.msToUs(long)>
	//   78  159:lsub            
	//   79  160:aload_0         
	//   80  161:getfield        #148 <Field DashManifest manifest>
	//   81  164:iload_2         
	//   82  165:invokevirtual   #311 <Method Period DashManifest.getPeriod(int)>
	//   83  168:getfield        #338 <Field long Period.startMs>
	//   84  171:invokestatic    #267 <Method long C.msToUs(long)>
	//   85  174:lsub            
	//   86  175:lload           4
	//   87  177:invokestatic    #341 <Method long Math.min(long, long)>
	//   88  180:lstore          8
			l1 = l3;
	//   89  182:lload           6
	//   90  184:lstore          4
			if(manifest.timeShiftBufferDepthMs != 0x1L)
	//*  91  186:aload_0         
	//*  92  187:getfield        #148 <Field DashManifest manifest>
	//*  93  190:getfield        #344 <Field long DashManifest.timeShiftBufferDepthMs>
	//*  94  193:ldc2w           #188 <Long 0x1L>
	//*  95  196:lcmp            
	//*  96  197:ifeq            279
			{
				DashManifest dashmanifest;
				for(l1 = l5 - C.msToUs(manifest.timeShiftBufferDepthMs); l1 < 0L && j > 0; l1 += dashmanifest.getPeriodDurationUs(j))
	//*  97  200:lload           8
	//*  98  202:aload_0         
	//*  99  203:getfield        #148 <Field DashManifest manifest>
	//* 100  206:getfield        #344 <Field long DashManifest.timeShiftBufferDepthMs>
	//* 101  209:invokestatic    #267 <Method long C.msToUs(long)>
	//* 102  212:lsub            
	//* 103  213:lstore          4
	//* 104  215:lload           4
	//* 105  217:lconst_0        
	//* 106  218:lcmp            
	//* 107  219:ifge            250
	//* 108  222:iload_2         
	//* 109  223:ifle            250
				{
					dashmanifest = manifest;
	//  110  226:aload_0         
	//  111  227:getfield        #148 <Field DashManifest manifest>
	//  112  230:astore          16
					j--;
	//  113  232:iload_2         
	//  114  233:iconst_1        
	//  115  234:isub            
	//  116  235:istore_2        
				}

	//  117  236:lload           4
	//  118  238:aload           16
	//  119  240:iload_2         
	//  120  241:invokevirtual   #315 <Method long DashManifest.getPeriodDurationUs(int)>
	//  121  244:ladd            
	//  122  245:lstore          4
	//* 123  247:goto            215
				if(j == 0)
	//* 124  250:iload_2         
	//* 125  251:ifne            266
					l1 = Math.max(l3, l1);
	//  126  254:lload           6
	//  127  256:lload           4
	//  128  258:invokestatic    #347 <Method long Math.max(long, long)>
	//  129  261:lstore          4
				else
	//* 130  263:goto            279
					l1 = manifest.getPeriodDurationUs(0);
	//  131  266:aload_0         
	//  132  267:getfield        #148 <Field DashManifest manifest>
	//  133  270:iconst_0        
	//  134  271:invokevirtual   #315 <Method long DashManifest.getPeriodDurationUs(int)>
	//  135  274:lstore          4
			}
	//* 136  276:goto            263
			flag1 = true;
	//  137  279:iconst_1        
	//  138  280:istore_2        
			l3 = l1;
	//  139  281:lload           4
	//  140  283:lstore          6
			l1 = l5;
	//  141  285:lload           8
	//  142  287:lstore          4
		} else
	//* 143  289:goto            294
		{
			flag1 = false;
	//  144  292:iconst_0        
	//  145  293:istore_2        
		}
		long l6 = l1 - l3;
	//  146  294:lload           4
	//  147  296:lload           6
	//  148  298:lsub            
	//  149  299:lstore          8
		for(int l = 0; l < manifest.getPeriodCount() - 1;)
	//* 150  301:iconst_0        
	//* 151  302:istore_3        
	//* 152  303:iload_3         
	//* 153  304:aload_0         
	//* 154  305:getfield        #148 <Field DashManifest manifest>
	//* 155  308:invokevirtual   #307 <Method int DashManifest.getPeriodCount()>
	//* 156  311:iconst_1        
	//* 157  312:isub            
	//* 158  313:icmpge          340
		{
			l1 = manifest.getPeriodDurationUs(l);
	//  159  316:aload_0         
	//  160  317:getfield        #148 <Field DashManifest manifest>
	//  161  320:iload_3         
	//  162  321:invokevirtual   #315 <Method long DashManifest.getPeriodDurationUs(int)>
	//  163  324:lstore          4
			l++;
	//  164  326:iload_3         
	//  165  327:iconst_1        
	//  166  328:iadd            
	//  167  329:istore_3        
			l6 += l1;
	//  168  330:lload           8
	//  169  332:lload           4
	//  170  334:ladd            
	//  171  335:lstore          8
		}

	//* 172  337:goto            303
		if(manifest.dynamic)
	//* 173  340:aload_0         
	//* 174  341:getfield        #148 <Field DashManifest manifest>
	//* 175  344:getfield        #196 <Field boolean DashManifest.dynamic>
	//* 176  347:ifeq            439
		{
			long l7 = livePresentationDelayMs;
	//  177  350:aload_0         
	//  178  351:getfield        #160 <Field long livePresentationDelayMs>
	//  179  354:lstore          10
			l1 = l7;
	//  180  356:lload           10
	//  181  358:lstore          4
			if(l7 == -1L)
	//* 182  360:lload           10
	//* 183  362:ldc2w           #41  <Long -1L>
	//* 184  365:lcmp            
	//* 185  366:ifne            400
				if(manifest.suggestedPresentationDelayMs != 0x1L)
	//* 186  369:aload_0         
	//* 187  370:getfield        #148 <Field DashManifest manifest>
	//* 188  373:getfield        #350 <Field long DashManifest.suggestedPresentationDelayMs>
	//* 189  376:ldc2w           #188 <Long 0x1L>
	//* 190  379:lcmp            
	//* 191  380:ifeq            395
					l1 = manifest.suggestedPresentationDelayMs;
	//  192  383:aload_0         
	//  193  384:getfield        #148 <Field DashManifest manifest>
	//  194  387:getfield        #350 <Field long DashManifest.suggestedPresentationDelayMs>
	//  195  390:lstore          4
				else
	//* 196  392:goto            400
					l1 = 30000L;
	//  197  395:ldc2w           #38  <Long 30000L>
	//  198  398:lstore          4
			l1 = l6 - C.msToUs(l1);
	//  199  400:lload           8
	//  200  402:lload           4
	//  201  404:invokestatic    #267 <Method long C.msToUs(long)>
	//  202  407:lsub            
	//  203  408:lstore          4
			if(l1 < 0x4c4b40L)
	//* 204  410:lload           4
	//* 205  412:ldc2w           #47  <Long 0x4c4b40L>
	//* 206  415:lcmp            
	//* 207  416:ifge            436
				l1 = Math.min(0x4c4b40L, l6 / 2L);
	//  208  419:ldc2w           #47  <Long 0x4c4b40L>
	//  209  422:lload           8
	//  210  424:ldc2w           #351 <Long 2L>
	//  211  427:ldiv            
	//  212  428:invokestatic    #341 <Method long Math.min(long, long)>
	//  213  431:lstore          4
		} else
	//* 214  433:goto            442
	//* 215  436:goto            442
		{
			l1 = 0L;
	//  216  439:lconst_0        
	//  217  440:lstore          4
		}
		long l8 = manifest.availabilityStartTimeMs;
	//  218  442:aload_0         
	//  219  443:getfield        #148 <Field DashManifest manifest>
	//  220  446:getfield        #333 <Field long DashManifest.availabilityStartTimeMs>
	//  221  449:lstore          10
		long l9 = manifest.getPeriod(0).startMs;
	//  222  451:aload_0         
	//  223  452:getfield        #148 <Field DashManifest manifest>
	//  224  455:iconst_0        
	//  225  456:invokevirtual   #311 <Method Period DashManifest.getPeriod(int)>
	//  226  459:getfield        #338 <Field long Period.startMs>
	//  227  462:lstore          12
		long l10 = C.usToMs(l3);
	//  228  464:lload           6
	//  229  466:invokestatic    #355 <Method long C.usToMs(long)>
	//  230  469:lstore          14
		refreshSourceInfo(((Timeline) (new DashTimeline(manifest.availabilityStartTimeMs, l8 + l9 + l10, firstPeriodId, l3, l6, l1, manifest, tag))), ((Object) (manifest)));
	//  231  471:aload_0         
	//  232  472:new             #10  <Class DashMediaSource$DashTimeline>
	//  233  475:dup             
	//  234  476:aload_0         
	//  235  477:getfield        #148 <Field DashManifest manifest>
	//  236  480:getfield        #333 <Field long DashManifest.availabilityStartTimeMs>
	//  237  483:lload           10
	//  238  485:lload           12
	//  239  487:ladd            
	//  240  488:lload           14
	//  241  490:ladd            
	//  242  491:aload_0         
	//  243  492:getfield        #294 <Field int firstPeriodId>
	//  244  495:lload           6
	//  245  497:lload           8
	//  246  499:lload           4
	//  247  501:aload_0         
	//  248  502:getfield        #148 <Field DashManifest manifest>
	//  249  505:aload_0         
	//  250  506:getfield        #164 <Field Object tag>
	//  251  509:invokespecial   #358 <Method void DashMediaSource$DashTimeline(long, long, int, long, long, long, DashManifest, Object)>
	//  252  512:aload_0         
	//  253  513:getfield        #148 <Field DashManifest manifest>
	//  254  516:invokevirtual   #362 <Method void refreshSourceInfo(Timeline, Object)>
		if(!sideloadedManifest)
	//* 255  519:aload_0         
	//* 256  520:getfield        #166 <Field boolean sideloadedManifest>
	//* 257  523:ifne            640
		{
			handler.removeCallbacks(simulateManifestRefreshRunnable);
	//  258  526:aload_0         
	//  259  527:getfield        #364 <Field Handler handler>
	//  260  530:aload_0         
	//  261  531:getfield        #208 <Field Runnable simulateManifestRefreshRunnable>
	//  262  534:invokevirtual   #370 <Method void Handler.removeCallbacks(Runnable)>
			if(flag1)
	//* 263  537:iload_2         
	//* 264  538:ifeq            556
				handler.postDelayed(simulateManifestRefreshRunnable, 5000L);
	//  265  541:aload_0         
	//  266  542:getfield        #364 <Field Handler handler>
	//  267  545:aload_0         
	//  268  546:getfield        #208 <Field Runnable simulateManifestRefreshRunnable>
	//  269  549:ldc2w           #371 <Long 5000L>
	//  270  552:invokevirtual   #376 <Method boolean Handler.postDelayed(Runnable, long)>
	//  271  555:pop             
			if(manifestLoadPending)
	//* 272  556:aload_0         
	//* 273  557:getfield        #378 <Field boolean manifestLoadPending>
	//* 274  560:ifeq            568
			{
				startLoadingManifest();
	//  275  563:aload_0         
	//  276  564:invokespecial   #230 <Method void startLoadingManifest()>
				return;
	//  277  567:return          
			}
			if(flag && manifest.dynamic && manifest.minUpdatePeriodMs != 0x1L)
	//* 278  568:iload_1         
	//* 279  569:ifeq            640
	//* 280  572:aload_0         
	//* 281  573:getfield        #148 <Field DashManifest manifest>
	//* 282  576:getfield        #196 <Field boolean DashManifest.dynamic>
	//* 283  579:ifeq            640
	//* 284  582:aload_0         
	//* 285  583:getfield        #148 <Field DashManifest manifest>
	//* 286  586:getfield        #381 <Field long DashManifest.minUpdatePeriodMs>
	//* 287  589:ldc2w           #188 <Long 0x1L>
	//* 288  592:lcmp            
	//* 289  593:ifeq            640
			{
				long l4 = manifest.minUpdatePeriodMs;
	//  290  596:aload_0         
	//  291  597:getfield        #148 <Field DashManifest manifest>
	//  292  600:getfield        #381 <Field long DashManifest.minUpdatePeriodMs>
	//  293  603:lstore          6
				long l2 = l4;
	//  294  605:lload           6
	//  295  607:lstore          4
				if(l4 == 0L)
	//* 296  609:lload           6
	//* 297  611:lconst_0        
	//* 298  612:lcmp            
	//* 299  613:ifne            621
					l2 = 5000L;
	//  300  616:ldc2w           #371 <Long 5000L>
	//  301  619:lstore          4
				scheduleManifestRefresh(Math.max(0L, (manifestLoadStartTimestampMs + l2) - SystemClock.elapsedRealtime()));
	//  302  621:aload_0         
	//  303  622:lconst_0        
	//  304  623:aload_0         
	//  305  624:getfield        #383 <Field long manifestLoadStartTimestampMs>
	//  306  627:lload           4
	//  307  629:ladd            
	//  308  630:invokestatic    #261 <Method long SystemClock.elapsedRealtime()>
	//  309  633:lsub            
	//  310  634:invokestatic    #347 <Method long Math.max(long, long)>
	//  311  637:invokespecial   #386 <Method void scheduleManifestRefresh(long)>
			}
		}
	//  312  640:return          
	}

	private void resolveUtcTimingElement(UtcTimingElement utctimingelement)
	{
		String s = utctimingelement.schemeIdUri;
	//    0    0:aload_1         
	//    1    1:getfield        #393 <Field String UtcTimingElement.schemeIdUri>
	//    2    4:astore_2        
		if(!Util.areEqual(((Object) (s)), "urn:mpeg:dash:utc:direct:2014") && !Util.areEqual(((Object) (s)), "urn:mpeg:dash:utc:direct:2012"))
	//*   3    5:aload_2         
	//*   4    6:ldc2            #395 <String "urn:mpeg:dash:utc:direct:2014">
	//*   5    9:invokestatic    #401 <Method boolean Util.areEqual(Object, Object)>
	//*   6   12:ifne            116
	//*   7   15:aload_2         
	//*   8   16:ldc2            #403 <String "urn:mpeg:dash:utc:direct:2012">
	//*   9   19:invokestatic    #401 <Method boolean Util.areEqual(Object, Object)>
	//*  10   22:ifeq            28
	//*  11   25:goto            116
		{
			if(!Util.areEqual(((Object) (s)), "urn:mpeg:dash:utc:http-iso:2014") && !Util.areEqual(((Object) (s)), "urn:mpeg:dash:utc:http-iso:2012"))
	//*  12   28:aload_2         
	//*  13   29:ldc2            #405 <String "urn:mpeg:dash:utc:http-iso:2014">
	//*  14   32:invokestatic    #401 <Method boolean Util.areEqual(Object, Object)>
	//*  15   35:ifne            103
	//*  16   38:aload_2         
	//*  17   39:ldc2            #407 <String "urn:mpeg:dash:utc:http-iso:2012">
	//*  18   42:invokestatic    #401 <Method boolean Util.areEqual(Object, Object)>
	//*  19   45:ifeq            51
	//*  20   48:goto            103
			{
				if(!Util.areEqual(((Object) (s)), "urn:mpeg:dash:utc:http-xsdate:2014") && !Util.areEqual(((Object) (s)), "urn:mpeg:dash:utc:http-xsdate:2012"))
	//*  21   51:aload_2         
	//*  22   52:ldc2            #409 <String "urn:mpeg:dash:utc:http-xsdate:2014">
	//*  23   55:invokestatic    #401 <Method boolean Util.areEqual(Object, Object)>
	//*  24   58:ifne            89
	//*  25   61:aload_2         
	//*  26   62:ldc2            #411 <String "urn:mpeg:dash:utc:http-xsdate:2012">
	//*  27   65:invokestatic    #401 <Method boolean Util.areEqual(Object, Object)>
	//*  28   68:ifeq            74
	//*  29   71:goto            89
				{
					onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
	//   30   74:aload_0         
	//   31   75:new             #413 <Class IOException>
	//   32   78:dup             
	//   33   79:ldc2            #415 <String "Unsupported UTC timing scheme">
	//   34   82:invokespecial   #417 <Method void IOException(String)>
	//   35   85:invokespecial   #419 <Method void onUtcTimestampResolutionError(IOException)>
					return;
	//   36   88:return          
				} else
				{
					resolveUtcTimingElementHttp(utctimingelement, ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new XsDateTimeParser())));
	//   37   89:aload_0         
	//   38   90:aload_1         
	//   39   91:new             #34  <Class DashMediaSource$XsDateTimeParser>
	//   40   94:dup             
	//   41   95:aconst_null     
	//   42   96:invokespecial   #422 <Method void DashMediaSource$XsDateTimeParser(DashMediaSource$1)>
	//   43   99:invokespecial   #426 <Method void resolveUtcTimingElementHttp(UtcTimingElement, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
					return;
	//   44  102:return          
				}
			} else
			{
				resolveUtcTimingElementHttp(utctimingelement, ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new Iso8601Parser())));
	//   45  103:aload_0         
	//   46  104:aload_1         
	//   47  105:new             #19  <Class DashMediaSource$Iso8601Parser>
	//   48  108:dup             
	//   49  109:invokespecial   #427 <Method void DashMediaSource$Iso8601Parser()>
	//   50  112:invokespecial   #426 <Method void resolveUtcTimingElementHttp(UtcTimingElement, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
				return;
	//   51  115:return          
			}
		} else
		{
			resolveUtcTimingElementDirect(utctimingelement);
	//   52  116:aload_0         
	//   53  117:aload_1         
	//   54  118:invokespecial   #430 <Method void resolveUtcTimingElementDirect(UtcTimingElement)>
			return;
	//   55  121:return          
		}
	}

	private void resolveUtcTimingElementDirect(UtcTimingElement utctimingelement)
	{
		try
		{
			onUtcTimestampResolved(Util.parseXsDateTime(utctimingelement.value) - manifestLoadEndTimestampMs);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #435 <Field String UtcTimingElement.value>
	//    3    5:invokestatic    #439 <Method long Util.parseXsDateTime(String)>
	//    4    8:aload_0         
	//    5    9:getfield        #441 <Field long manifestLoadEndTimestampMs>
	//    6   12:lsub            
	//    7   13:invokespecial   #443 <Method void onUtcTimestampResolved(long)>
			return;
	//    8   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(UtcTimingElement utctimingelement)
	//*   9   17:astore_1        
		{
			onUtcTimestampResolutionError(((IOException) (utctimingelement)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #419 <Method void onUtcTimestampResolutionError(IOException)>
		}
	//   13   23:return          
	}

	private void resolveUtcTimingElementHttp(UtcTimingElement utctimingelement, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser)
	{
		startLoading(new ParsingLoadable(dataSource, Uri.parse(utctimingelement.value), 5, parser), ((com.google.android.exoplayer2.upstream.Loader.Callback) (new UtcTimestampCallback())), 1);
	//    0    0:aload_0         
	//    1    1:new             #445 <Class ParsingLoadable>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #447 <Field DataSource dataSource>
	//    5    9:aload_1         
	//    6   10:getfield        #435 <Field String UtcTimingElement.value>
	//    7   13:invokestatic    #453 <Method Uri Uri.parse(String)>
	//    8   16:iconst_5        
	//    9   17:aload_2         
	//   10   18:invokespecial   #456 <Method void ParsingLoadable(DataSource, Uri, int, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
	//   11   21:new             #31  <Class DashMediaSource$UtcTimestampCallback>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:invokespecial   #457 <Method void DashMediaSource$UtcTimestampCallback(DashMediaSource, DashMediaSource$1)>
	//   16   30:iconst_1        
	//   17   31:invokespecial   #461 <Method void startLoading(ParsingLoadable, com.google.android.exoplayer2.upstream.Loader$Callback, int)>
	//   18   34:return          
	}

	private void scheduleManifestRefresh(long l)
	{
		handler.postDelayed(refreshManifestRunnable, l);
	//    0    0:aload_0         
	//    1    1:getfield        #364 <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:getfield        #206 <Field Runnable refreshManifestRunnable>
	//    4    8:lload_1         
	//    5    9:invokevirtual   #376 <Method boolean Handler.postDelayed(Runnable, long)>
	//    6   12:pop             
	//    7   13:return          
	}

	private void startLoading(ParsingLoadable parsingloadable, com.google.android.exoplayer2.upstream.Loader.Callback callback, int i)
	{
		long l = loader.startLoading(((com.google.android.exoplayer2.upstream.Loader.Loadable) (parsingloadable)), callback, i);
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field Loader loader>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #467 <Method long Loader.startLoading(com.google.android.exoplayer2.upstream.Loader$Loadable, com.google.android.exoplayer2.upstream.Loader$Callback, int)>
	//    6   10:lstore          4
		manifestEventDispatcher.loadStarted(parsingloadable.dataSpec, parsingloadable.type, l);
	//    7   12:aload_0         
	//    8   13:getfield        #172 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
	//    9   16:aload_1         
	//   10   17:getfield        #471 <Field DataSpec ParsingLoadable.dataSpec>
	//   11   20:aload_1         
	//   12   21:getfield        #474 <Field int ParsingLoadable.type>
	//   13   24:lload           4
	//   14   26:invokevirtual   #480 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadStarted(DataSpec, int, long)>
	//   15   29:return          
	}

	private void startLoadingManifest()
	{
		handler.removeCallbacks(refreshManifestRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #364 <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:getfield        #206 <Field Runnable refreshManifestRunnable>
	//    4    8:invokevirtual   #370 <Method void Handler.removeCallbacks(Runnable)>
		if(loader.isLoading())
	//*   5   11:aload_0         
	//*   6   12:getfield        #239 <Field Loader loader>
	//*   7   15:invokevirtual   #485 <Method boolean Loader.isLoading()>
	//*   8   18:ifeq            27
		{
			manifestLoadPending = true;
	//    9   21:aload_0         
	//   10   22:iconst_1        
	//   11   23:putfield        #378 <Field boolean manifestLoadPending>
			return;
	//   12   26:return          
		}
		Uri uri;
		synchronized(manifestUriLock)
	//*  13   27:aload_0         
	//*  14   28:getfield        #177 <Field Object manifestUriLock>
	//*  15   31:astore_1        
	//*  16   32:aload_1         
	//*  17   33:monitorenter    
		{
			uri = manifestUri;
	//   18   34:aload_0         
	//   19   35:getfield        #150 <Field Uri manifestUri>
	//   20   38:astore_2        
		}
	//   21   39:aload_1         
	//   22   40:monitorexit     
		manifestLoadPending = false;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #378 <Field boolean manifestLoadPending>
		startLoading(new ParsingLoadable(dataSource, uri, 4, manifestParser), ((com.google.android.exoplayer2.upstream.Loader.Callback) (manifestCallback)), minLoadableRetryCount);
	//   26   46:aload_0         
	//   27   47:new             #445 <Class ParsingLoadable>
	//   28   50:dup             
	//   29   51:aload_0         
	//   30   52:getfield        #447 <Field DataSource dataSource>
	//   31   55:aload_2         
	//   32   56:iconst_4        
	//   33   57:aload_0         
	//   34   58:getfield        #154 <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
	//   35   61:invokespecial   #456 <Method void ParsingLoadable(DataSource, Uri, int, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
	//   36   64:aload_0         
	//   37   65:getfield        #204 <Field DashMediaSource$ManifestCallback manifestCallback>
	//   38   68:aload_0         
	//   39   69:getfield        #158 <Field int minLoadableRetryCount>
	//   40   72:invokespecial   #461 <Method void startLoading(ParsingLoadable, com.google.android.exoplayer2.upstream.Loader$Callback, int)>
		return;
	//   41   75:return          
		exception;
	//   42   76:astore_2        
		obj;
	//   43   77:aload_1         
		JVM INSTR monitorexit ;
	//   44   78:monitorexit     
		throw exception;
	//   45   79:aload_2         
	//   46   80:athrow          
	}

	public MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, Allocator allocator)
	{
		int i = mediaperiodid.periodIndex;
	//    0    0:aload_1         
	//    1    1:getfield        #492 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//    2    4:istore_3        
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (createEventDispatcher(mediaperiodid, manifest.getPeriod(i).startMs)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #148 <Field DashManifest manifest>
	//    7   11:iload_3         
	//    8   12:invokevirtual   #311 <Method Period DashManifest.getPeriod(int)>
	//    9   15:getfield        #338 <Field long Period.startMs>
	//   10   18:invokevirtual   #495 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher createEventDispatcher(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long)>
	//   11   21:astore_1        
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (new DashMediaPeriod(firstPeriodId + i, manifest, i, chunkSourceFactory, minLoadableRetryCount, ((com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher) (mediaperiodid)), elapsedRealtimeOffsetMs, manifestLoadErrorThrower, allocator, compositeSequenceableLoaderFactory, playerEmsgCallback)));
	//   12   22:new             #300 <Class DashMediaPeriod>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #294 <Field int firstPeriodId>
	//   16   30:iload_3         
	//   17   31:iadd            
	//   18   32:aload_0         
	//   19   33:getfield        #148 <Field DashManifest manifest>
	//   20   36:iload_3         
	//   21   37:aload_0         
	//   22   38:getfield        #156 <Field DashChunkSource$Factory chunkSourceFactory>
	//   23   41:aload_0         
	//   24   42:getfield        #158 <Field int minLoadableRetryCount>
	//   25   45:aload_1         
	//   26   46:aload_0         
	//   27   47:getfield        #256 <Field long elapsedRealtimeOffsetMs>
	//   28   50:aload_0         
	//   29   51:getfield        #213 <Field LoaderErrorThrower manifestLoadErrorThrower>
	//   30   54:aload_2         
	//   31   55:aload_0         
	//   32   56:getfield        #162 <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
	//   33   59:aload_0         
	//   34   60:getfield        #187 <Field PlayerEmsgHandler$PlayerEmsgCallback playerEmsgCallback>
	//   35   63:invokespecial   #498 <Method void DashMediaPeriod(int, DashManifest, int, DashChunkSource$Factory, int, com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher, long, LoaderErrorThrower, Allocator, CompositeSequenceableLoaderFactory, PlayerEmsgHandler$PlayerEmsgCallback)>
	//   36   66:astore_1        
		periodsById.put(((DashMediaPeriod) (mediaperiodid)).id, ((Object) (mediaperiodid)));
	//   37   67:aload_0         
	//   38   68:getfield        #182 <Field SparseArray periodsById>
	//   39   71:aload_1         
	//   40   72:getfield        #501 <Field int DashMediaPeriod.id>
	//   41   75:aload_1         
	//   42   76:invokevirtual   #505 <Method void SparseArray.put(int, Object)>
		return ((MediaPeriod) (mediaperiodid));
	//   43   79:aload_1         
	//   44   80:areturn         
	}

	public void maybeThrowSourceInfoRefreshError()
		throws IOException
	{
		manifestLoadErrorThrower.maybeThrowError();
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field LoaderErrorThrower manifestLoadErrorThrower>
	//    2    4:invokeinterface #511 <Method void LoaderErrorThrower.maybeThrowError()>
	//    3    9:return          
	}

	void onDashLiveMediaPresentationEndSignalEncountered()
	{
		dynamicMediaPresentationEnded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #515 <Field boolean dynamicMediaPresentationEnded>
	//    3    5:return          
	}

	void onDashManifestPublishTimeExpired(long l)
	{
		if(expiredManifestPublishTimeUs == 0x1L || expiredManifestPublishTimeUs < l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field long expiredManifestPublishTimeUs>
	//*   2    4:ldc2w           #188 <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            20
	//*   5   11:aload_0         
	//*   6   12:getfield        #191 <Field long expiredManifestPublishTimeUs>
	//*   7   15:lload_1         
	//*   8   16:lcmp            
	//*   9   17:ifge            25
			expiredManifestPublishTimeUs = l;
	//   10   20:aload_0         
	//   11   21:lload_1         
	//   12   22:putfield        #191 <Field long expiredManifestPublishTimeUs>
	//   13   25:return          
	}

	void onDashManifestRefreshRequested()
	{
		handler.removeCallbacks(simulateManifestRefreshRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #364 <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:getfield        #208 <Field Runnable simulateManifestRefreshRunnable>
	//    4    8:invokevirtual   #370 <Method void Handler.removeCallbacks(Runnable)>
		startLoadingManifest();
	//    5   11:aload_0         
	//    6   12:invokespecial   #230 <Method void startLoadingManifest()>
	//    7   15:return          
	}

	void onLoadCanceled(ParsingLoadable parsingloadable, long l, long l1)
	{
		manifestEventDispatcher.loadCanceled(parsingloadable.dataSpec, parsingloadable.type, l, l1, parsingloadable.bytesLoaded());
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
	//    2    4:aload_1         
	//    3    5:getfield        #471 <Field DataSpec ParsingLoadable.dataSpec>
	//    4    8:aload_1         
	//    5    9:getfield        #474 <Field int ParsingLoadable.type>
	//    6   12:lload_2         
	//    7   13:lload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #522 <Method long ParsingLoadable.bytesLoaded()>
	//   10   19:invokevirtual   #526 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCanceled(DataSpec, int, long, long, long)>
	//   11   22:return          
	}

	void onManifestLoadCompleted(ParsingLoadable parsingloadable, long l, long l1)
	{
		int i;
		int j;
		DashManifest dashmanifest;
		manifestEventDispatcher.loadCompleted(parsingloadable.dataSpec, parsingloadable.type, l, l1, parsingloadable.bytesLoaded());
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
	//    2    4:aload_1         
	//    3    5:getfield        #471 <Field DataSpec ParsingLoadable.dataSpec>
	//    4    8:aload_1         
	//    5    9:getfield        #474 <Field int ParsingLoadable.type>
	//    6   12:lload_2         
	//    7   13:lload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #522 <Method long ParsingLoadable.bytesLoaded()>
	//   10   19:invokevirtual   #531 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCompleted(DataSpec, int, long, long, long)>
		dashmanifest = (DashManifest)parsingloadable.getResult();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #535 <Method Object ParsingLoadable.getResult()>
	//   13   26:checkcast       #193 <Class DashManifest>
	//   14   29:astore          11
		if(manifest == null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #148 <Field DashManifest manifest>
	//*  17   35:ifnonnull       44
			i = 0;
	//   18   38:iconst_0        
	//   19   39:istore          6
		else
	//*  20   41:goto            53
			i = manifest.getPeriodCount();
	//   21   44:aload_0         
	//   22   45:getfield        #148 <Field DashManifest manifest>
	//   23   48:invokevirtual   #307 <Method int DashManifest.getPeriodCount()>
	//   24   51:istore          6
		long l2 = dashmanifest.getPeriod(0).startMs;
	//   25   53:aload           11
	//   26   55:iconst_0        
	//   27   56:invokevirtual   #311 <Method Period DashManifest.getPeriod(int)>
	//   28   59:getfield        #338 <Field long Period.startMs>
	//   29   62:lstore          9
		for(j = 0; j < i && manifest.getPeriod(j).startMs < l2; j++);
	//   30   64:iconst_0        
	//   31   65:istore          7
	//   32   67:iload           7
	//   33   69:iload           6
	//   34   71:icmpge          101
	//   35   74:aload_0         
	//   36   75:getfield        #148 <Field DashManifest manifest>
	//   37   78:iload           7
	//   38   80:invokevirtual   #311 <Method Period DashManifest.getPeriod(int)>
	//   39   83:getfield        #338 <Field long Period.startMs>
	//   40   86:lload           9
	//   41   88:lcmp            
	//   42   89:ifge            101
	//   43   92:iload           7
	//   44   94:iconst_1        
	//   45   95:iadd            
	//   46   96:istore          7
	//*  47   98:goto            67
		if(!dashmanifest.dynamic)
			break MISSING_BLOCK_LABEL_316;
	//   48  101:aload           11
	//   49  103:getfield        #196 <Field boolean DashManifest.dynamic>
	//   50  106:ifeq            316
		if(i - j <= dashmanifest.getPeriodCount()) goto _L2; else goto _L1
	//   51  109:iload           6
	//   52  111:iload           7
	//   53  113:isub            
	//   54  114:aload           11
	//   55  116:invokevirtual   #307 <Method int DashManifest.getPeriodCount()>
	//   56  119:icmple          137
_L1:
		Log.w("DashMediaSource", "Loaded out of sync manifest");
	//   57  122:ldc1            #54  <String "DashMediaSource">
	//   58  124:ldc2            #537 <String "Loaded out of sync manifest">
	//   59  127:invokestatic    #541 <Method int Log.w(String, String)>
	//   60  130:pop             
_L4:
		boolean flag;
		flag = true;
	//   61  131:iconst_1        
	//   62  132:istore          8
		break; /* Loop/switch isn't completed */
	//   63  134:goto            262
_L2:
		if(!dynamicMediaPresentationEnded && (expiredManifestPublishTimeUs == 0x1L || dashmanifest.publishTimeMs * 1000L > expiredManifestPublishTimeUs))
	//*  64  137:aload_0         
	//*  65  138:getfield        #515 <Field boolean dynamicMediaPresentationEnded>
	//*  66  141:ifne            181
	//*  67  144:aload_0         
	//*  68  145:getfield        #191 <Field long expiredManifestPublishTimeUs>
	//*  69  148:ldc2w           #188 <Long 0x1L>
	//*  70  151:lcmp            
	//*  71  152:ifeq            175
	//*  72  155:aload           11
	//*  73  157:getfield        #544 <Field long DashManifest.publishTimeMs>
	//*  74  160:ldc2w           #545 <Long 1000L>
	//*  75  163:lmul            
	//*  76  164:aload_0         
	//*  77  165:getfield        #191 <Field long expiredManifestPublishTimeUs>
	//*  78  168:lcmp            
	//*  79  169:ifgt            175
	//*  80  172:goto            181
		{
			flag = false;
	//   81  175:iconst_0        
	//   82  176:istore          8
			break; /* Loop/switch isn't completed */
	//   83  178:goto            262
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   84  181:new             #548 <Class StringBuilder>
	//   85  184:dup             
	//   86  185:invokespecial   #549 <Method void StringBuilder()>
	//   87  188:astore          12
		stringbuilder.append("Loaded stale dynamic manifest: ");
	//   88  190:aload           12
	//   89  192:ldc2            #551 <String "Loaded stale dynamic manifest: ">
	//   90  195:invokevirtual   #555 <Method StringBuilder StringBuilder.append(String)>
	//   91  198:pop             
		stringbuilder.append(dashmanifest.publishTimeMs);
	//   92  199:aload           12
	//   93  201:aload           11
	//   94  203:getfield        #544 <Field long DashManifest.publishTimeMs>
	//   95  206:invokevirtual   #558 <Method StringBuilder StringBuilder.append(long)>
	//   96  209:pop             
		stringbuilder.append(", ");
	//   97  210:aload           12
	//   98  212:ldc2            #560 <String ", ">
	//   99  215:invokevirtual   #555 <Method StringBuilder StringBuilder.append(String)>
	//  100  218:pop             
		stringbuilder.append(dynamicMediaPresentationEnded);
	//  101  219:aload           12
	//  102  221:aload_0         
	//  103  222:getfield        #515 <Field boolean dynamicMediaPresentationEnded>
	//  104  225:invokevirtual   #563 <Method StringBuilder StringBuilder.append(boolean)>
	//  105  228:pop             
		stringbuilder.append(", ");
	//  106  229:aload           12
	//  107  231:ldc2            #560 <String ", ">
	//  108  234:invokevirtual   #555 <Method StringBuilder StringBuilder.append(String)>
	//  109  237:pop             
		stringbuilder.append(expiredManifestPublishTimeUs);
	//  110  238:aload           12
	//  111  240:aload_0         
	//  112  241:getfield        #191 <Field long expiredManifestPublishTimeUs>
	//  113  244:invokevirtual   #558 <Method StringBuilder StringBuilder.append(long)>
	//  114  247:pop             
		Log.w("DashMediaSource", stringbuilder.toString());
	//  115  248:ldc1            #54  <String "DashMediaSource">
	//  116  250:aload           12
	//  117  252:invokevirtual   #567 <Method String StringBuilder.toString()>
	//  118  255:invokestatic    #541 <Method int Log.w(String, String)>
	//  119  258:pop             
		if(true) goto _L4; else goto _L3
	//  120  259:goto            131
_L3:
		if(flag)
	//* 121  262:iload           8
	//* 122  264:ifeq            311
		{
			i = staleManifestReloadAttempt;
	//  123  267:aload_0         
	//  124  268:getfield        #247 <Field int staleManifestReloadAttempt>
	//  125  271:istore          6
			staleManifestReloadAttempt = i + 1;
	//  126  273:aload_0         
	//  127  274:iload           6
	//  128  276:iconst_1        
	//  129  277:iadd            
	//  130  278:putfield        #247 <Field int staleManifestReloadAttempt>
			if(i < minLoadableRetryCount)
	//* 131  281:iload           6
	//* 132  283:aload_0         
	//* 133  284:getfield        #158 <Field int minLoadableRetryCount>
	//* 134  287:icmpge          299
			{
				scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
	//  135  290:aload_0         
	//  136  291:aload_0         
	//  137  292:invokespecial   #569 <Method long getManifestLoadRetryDelayMillis()>
	//  138  295:invokespecial   #386 <Method void scheduleManifestRefresh(long)>
				return;
	//  139  298:return          
			} else
			{
				manifestFatalError = ((IOException) (new DashManifestStaleException()));
	//  140  299:aload_0         
	//  141  300:new             #571 <Class DashManifestStaleException>
	//  142  303:dup             
	//  143  304:invokespecial   #572 <Method void DashManifestStaleException()>
	//  144  307:putfield        #243 <Field IOException manifestFatalError>
				return;
	//  145  310:return          
			}
		}
		staleManifestReloadAttempt = 0;
	//  146  311:aload_0         
	//  147  312:iconst_0        
	//  148  313:putfield        #247 <Field int staleManifestReloadAttempt>
		manifest = dashmanifest;
	//  149  316:aload_0         
	//  150  317:aload           11
	//  151  319:putfield        #148 <Field DashManifest manifest>
		manifestLoadPending = manifestLoadPending & manifest.dynamic;
	//  152  322:aload_0         
	//  153  323:aload_0         
	//  154  324:getfield        #378 <Field boolean manifestLoadPending>
	//  155  327:aload_0         
	//  156  328:getfield        #148 <Field DashManifest manifest>
	//  157  331:getfield        #196 <Field boolean DashManifest.dynamic>
	//  158  334:iand            
	//  159  335:putfield        #378 <Field boolean manifestLoadPending>
		manifestLoadStartTimestampMs = l - l1;
	//  160  338:aload_0         
	//  161  339:lload_2         
	//  162  340:lload           4
	//  163  342:lsub            
	//  164  343:putfield        #383 <Field long manifestLoadStartTimestampMs>
		manifestLoadEndTimestampMs = l;
	//  165  346:aload_0         
	//  166  347:lload_2         
	//  167  348:putfield        #441 <Field long manifestLoadEndTimestampMs>
		if(manifest.location != null)
	//* 168  351:aload_0         
	//* 169  352:getfield        #148 <Field DashManifest manifest>
	//* 170  355:getfield        #575 <Field Uri DashManifest.location>
	//* 171  358:ifnull          407
			synchronized(manifestUriLock)
	//* 172  361:aload_0         
	//* 173  362:getfield        #177 <Field Object manifestUriLock>
	//* 174  365:astore          11
	//* 175  367:aload           11
	//* 176  369:monitorenter    
			{
				if(parsingloadable.dataSpec.uri == manifestUri)
	//* 177  370:aload_1         
	//* 178  371:getfield        #471 <Field DataSpec ParsingLoadable.dataSpec>
	//* 179  374:getfield        #580 <Field Uri DataSpec.uri>
	//* 180  377:aload_0         
	//* 181  378:getfield        #150 <Field Uri manifestUri>
	//* 182  381:if_acmpne       395
					manifestUri = manifest.location;
	//  183  384:aload_0         
	//  184  385:aload_0         
	//  185  386:getfield        #148 <Field DashManifest manifest>
	//  186  389:getfield        #575 <Field Uri DashManifest.location>
	//  187  392:putfield        #150 <Field Uri manifestUri>
			}
	//  188  395:aload           11
	//  189  397:monitorexit     
		break MISSING_BLOCK_LABEL_407;
	//  190  398:goto            407
		parsingloadable;
	//  191  401:astore_1        
		obj;
	//  192  402:aload           11
		JVM INSTR monitorexit ;
	//  193  404:monitorexit     
		throw parsingloadable;
	//  194  405:aload_1         
	//  195  406:athrow          
		if(i == 0)
	//* 196  407:iload           6
	//* 197  409:ifne            440
		{
			if(manifest.utcTiming != null)
	//* 198  412:aload_0         
	//* 199  413:getfield        #148 <Field DashManifest manifest>
	//* 200  416:getfield        #584 <Field UtcTimingElement DashManifest.utcTiming>
	//* 201  419:ifnull          434
			{
				resolveUtcTimingElement(manifest.utcTiming);
	//  202  422:aload_0         
	//  203  423:aload_0         
	//  204  424:getfield        #148 <Field DashManifest manifest>
	//  205  427:getfield        #584 <Field UtcTimingElement DashManifest.utcTiming>
	//  206  430:invokespecial   #586 <Method void resolveUtcTimingElement(UtcTimingElement)>
				return;
	//  207  433:return          
			} else
			{
				processManifest(true);
	//  208  434:aload_0         
	//  209  435:iconst_1        
	//  210  436:invokespecial   #235 <Method void processManifest(boolean)>
				return;
	//  211  439:return          
			}
		} else
		{
			firstPeriodId = firstPeriodId + j;
	//  212  440:aload_0         
	//  213  441:aload_0         
	//  214  442:getfield        #294 <Field int firstPeriodId>
	//  215  445:iload           7
	//  216  447:iadd            
	//  217  448:putfield        #294 <Field int firstPeriodId>
			processManifest(true);
	//  218  451:aload_0         
	//  219  452:iconst_1        
	//  220  453:invokespecial   #235 <Method void processManifest(boolean)>
			return;
	//  221  456:return          
		}
	}

	int onManifestLoadError(ParsingLoadable parsingloadable, long l, long l1, IOException ioexception)
	{
		boolean flag = ioexception instanceof ParserException;
	//    0    0:aload           6
	//    1    2:instanceof      #432 <Class ParserException>
	//    2    5:istore          7
		manifestEventDispatcher.loadError(parsingloadable.dataSpec, parsingloadable.type, l, l1, parsingloadable.bytesLoaded(), ioexception, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #172 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
	//    5   11:aload_1         
	//    6   12:getfield        #471 <Field DataSpec ParsingLoadable.dataSpec>
	//    7   15:aload_1         
	//    8   16:getfield        #474 <Field int ParsingLoadable.type>
	//    9   19:lload_2         
	//   10   20:lload           4
	//   11   22:aload_1         
	//   12   23:invokevirtual   #522 <Method long ParsingLoadable.bytesLoaded()>
	//   13   26:aload           6
	//   14   28:iload           7
	//   15   30:invokevirtual   #593 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadError(DataSpec, int, long, long, long, IOException, boolean)>
		return !flag ? 0 : 3;
	//   16   33:iload           7
	//   17   35:ifeq            40
	//   18   38:iconst_3        
	//   19   39:ireturn         
	//   20   40:iconst_0        
	//   21   41:ireturn         
	}

	void onUtcTimestampLoadCompleted(ParsingLoadable parsingloadable, long l, long l1)
	{
		manifestEventDispatcher.loadCompleted(parsingloadable.dataSpec, parsingloadable.type, l, l1, parsingloadable.bytesLoaded());
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
	//    2    4:aload_1         
	//    3    5:getfield        #471 <Field DataSpec ParsingLoadable.dataSpec>
	//    4    8:aload_1         
	//    5    9:getfield        #474 <Field int ParsingLoadable.type>
	//    6   12:lload_2         
	//    7   13:lload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #522 <Method long ParsingLoadable.bytesLoaded()>
	//   10   19:invokevirtual   #531 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCompleted(DataSpec, int, long, long, long)>
		onUtcTimestampResolved(((Long)parsingloadable.getResult()).longValue() - l);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #535 <Method Object ParsingLoadable.getResult()>
	//   14   27:checkcast       #597 <Class Long>
	//   15   30:invokevirtual   #600 <Method long Long.longValue()>
	//   16   33:lload_2         
	//   17   34:lsub            
	//   18   35:invokespecial   #443 <Method void onUtcTimestampResolved(long)>
	//   19   38:return          
	}

	int onUtcTimestampLoadError(ParsingLoadable parsingloadable, long l, long l1, IOException ioexception)
	{
		manifestEventDispatcher.loadError(parsingloadable.dataSpec, parsingloadable.type, l, l1, parsingloadable.bytesLoaded(), ioexception, true);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
	//    2    4:aload_1         
	//    3    5:getfield        #471 <Field DataSpec ParsingLoadable.dataSpec>
	//    4    8:aload_1         
	//    5    9:getfield        #474 <Field int ParsingLoadable.type>
	//    6   12:lload_2         
	//    7   13:lload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #522 <Method long ParsingLoadable.bytesLoaded()>
	//   10   19:aload           6
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #593 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadError(DataSpec, int, long, long, long, IOException, boolean)>
		onUtcTimestampResolutionError(ioexception);
	//   13   25:aload_0         
	//   14   26:aload           6
	//   15   28:invokespecial   #419 <Method void onUtcTimestampResolutionError(IOException)>
		return 2;
	//   16   31:iconst_2        
	//   17   32:ireturn         
	}

	public void prepareSourceInternal(ExoPlayer exoplayer, boolean flag)
	{
		if(sideloadedManifest)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field boolean sideloadedManifest>
	//*   2    4:ifeq            13
		{
			processManifest(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #235 <Method void processManifest(boolean)>
			return;
	//    6   12:return          
		} else
		{
			dataSource = manifestDataSourceFactory.createDataSource();
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #152 <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
	//   10   18:invokeinterface #611 <Method DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//   11   23:putfield        #447 <Field DataSource dataSource>
			loader = new Loader("Loader:DashMediaSource");
	//   12   26:aload_0         
	//   13   27:new             #464 <Class Loader>
	//   14   30:dup             
	//   15   31:ldc2            #613 <String "Loader:DashMediaSource">
	//   16   34:invokespecial   #614 <Method void Loader(String)>
	//   17   37:putfield        #239 <Field Loader loader>
			handler = new Handler();
	//   18   40:aload_0         
	//   19   41:new             #366 <Class Handler>
	//   20   44:dup             
	//   21   45:invokespecial   #615 <Method void Handler()>
	//   22   48:putfield        #364 <Field Handler handler>
			startLoadingManifest();
	//   23   51:aload_0         
	//   24   52:invokespecial   #230 <Method void startLoadingManifest()>
			return;
	//   25   55:return          
		}
	}

	public void releasePeriod(MediaPeriod mediaperiod)
	{
		mediaperiod = ((MediaPeriod) ((DashMediaPeriod)mediaperiod));
	//    0    0:aload_1         
	//    1    1:checkcast       #300 <Class DashMediaPeriod>
	//    2    4:astore_1        
		((DashMediaPeriod) (mediaperiod)).release();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #620 <Method void DashMediaPeriod.release()>
		periodsById.remove(((DashMediaPeriod) (mediaperiod)).id);
	//    5    9:aload_0         
	//    6   10:getfield        #182 <Field SparseArray periodsById>
	//    7   13:aload_1         
	//    8   14:getfield        #501 <Field int DashMediaPeriod.id>
	//    9   17:invokevirtual   #624 <Method void SparseArray.remove(int)>
	//   10   20:return          
	}

	public void releaseSourceInternal()
	{
		manifestLoadPending = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #378 <Field boolean manifestLoadPending>
		dataSource = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #447 <Field DataSource dataSource>
		if(loader != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #239 <Field Loader loader>
	//*   8   14:ifnull          29
		{
			loader.release();
	//    9   17:aload_0         
	//   10   18:getfield        #239 <Field Loader loader>
	//   11   21:invokevirtual   #626 <Method void Loader.release()>
			loader = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #239 <Field Loader loader>
		}
		manifestLoadStartTimestampMs = 0L;
	//   15   29:aload_0         
	//   16   30:lconst_0        
	//   17   31:putfield        #383 <Field long manifestLoadStartTimestampMs>
		manifestLoadEndTimestampMs = 0L;
	//   18   34:aload_0         
	//   19   35:lconst_0        
	//   20   36:putfield        #441 <Field long manifestLoadEndTimestampMs>
		DashManifest dashmanifest;
		if(sideloadedManifest)
	//*  21   39:aload_0         
	//*  22   40:getfield        #166 <Field boolean sideloadedManifest>
	//*  23   43:ifeq            54
			dashmanifest = manifest;
	//   24   46:aload_0         
	//   25   47:getfield        #148 <Field DashManifest manifest>
	//   26   50:astore_1        
		else
	//*  27   51:goto            56
			dashmanifest = null;
	//   28   54:aconst_null     
	//   29   55:astore_1        
		manifest = dashmanifest;
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:putfield        #148 <Field DashManifest manifest>
		manifestUri = initialManifestUri;
	//   33   61:aload_0         
	//   34   62:aload_0         
	//   35   63:getfield        #146 <Field Uri initialManifestUri>
	//   36   66:putfield        #150 <Field Uri manifestUri>
		manifestFatalError = null;
	//   37   69:aload_0         
	//   38   70:aconst_null     
	//   39   71:putfield        #243 <Field IOException manifestFatalError>
		if(handler != null)
	//*  40   74:aload_0         
	//*  41   75:getfield        #364 <Field Handler handler>
	//*  42   78:ifnull          94
		{
			handler.removeCallbacksAndMessages(((Object) (null)));
	//   43   81:aload_0         
	//   44   82:getfield        #364 <Field Handler handler>
	//   45   85:aconst_null     
	//   46   86:invokevirtual   #630 <Method void Handler.removeCallbacksAndMessages(Object)>
			handler = null;
	//   47   89:aload_0         
	//   48   90:aconst_null     
	//   49   91:putfield        #364 <Field Handler handler>
		}
		elapsedRealtimeOffsetMs = 0L;
	//   50   94:aload_0         
	//   51   95:lconst_0        
	//   52   96:putfield        #256 <Field long elapsedRealtimeOffsetMs>
		staleManifestReloadAttempt = 0;
	//   53   99:aload_0         
	//   54  100:iconst_0        
	//   55  101:putfield        #247 <Field int staleManifestReloadAttempt>
		expiredManifestPublishTimeUs = 0x1L;
	//   56  104:aload_0         
	//   57  105:ldc2w           #188 <Long 0x1L>
	//   58  108:putfield        #191 <Field long expiredManifestPublishTimeUs>
		dynamicMediaPresentationEnded = false;
	//   59  111:aload_0         
	//   60  112:iconst_0        
	//   61  113:putfield        #515 <Field boolean dynamicMediaPresentationEnded>
		firstPeriodId = 0;
	//   62  116:aload_0         
	//   63  117:iconst_0        
	//   64  118:putfield        #294 <Field int firstPeriodId>
		periodsById.clear();
	//   65  121:aload_0         
	//   66  122:getfield        #182 <Field SparseArray periodsById>
	//   67  125:invokevirtual   #633 <Method void SparseArray.clear()>
	//   68  128:return          
	}

	public void replaceManifestUri(Uri uri)
	{
		synchronized(manifestUriLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #177 <Field Object manifestUriLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			manifestUri = uri;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #150 <Field Uri manifestUri>
			initialManifestUri = uri;
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:putfield        #146 <Field Uri initialManifestUri>
		}
	//   11   17:aload_2         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		uri;
	//   14   20:astore_1        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw uri;
	//   17   23:aload_1         
	//   18   24:athrow          
	}

	public static final long DEFAULT_LIVE_PRESENTATION_DELAY_FIXED_MS = 30000L;
	public static final long DEFAULT_LIVE_PRESENTATION_DELAY_PREFER_MANIFEST_MS = -1L;
	public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
	private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 0x4c4b40L;
	private static final int NOTIFY_MANIFEST_INTERVAL_MS = 5000;
	private static final String TAG = "DashMediaSource";
	private final DashChunkSource.Factory chunkSourceFactory;
	private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
	private DataSource dataSource;
	private boolean dynamicMediaPresentationEnded;
	private long elapsedRealtimeOffsetMs;
	private long expiredManifestPublishTimeUs;
	private int firstPeriodId;
	private Handler handler;
	private Uri initialManifestUri;
	private final long livePresentationDelayMs;
	private Loader loader;
	private DashManifest manifest;
	private final ManifestCallback manifestCallback;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
	private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
	private IOException manifestFatalError;
	private long manifestLoadEndTimestampMs;
	private final LoaderErrorThrower manifestLoadErrorThrower;
	private boolean manifestLoadPending;
	private long manifestLoadStartTimestampMs;
	private final com.google.android.exoplayer2.upstream.ParsingLoadable.Parser manifestParser;
	private Uri manifestUri;
	private final Object manifestUriLock;
	private final int minLoadableRetryCount;
	private final SparseArray periodsById;
	private final PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
	private final Runnable refreshManifestRunnable;
	private final boolean sideloadedManifest;
	private final Runnable simulateManifestRefreshRunnable;
	private int staleManifestReloadAttempt;
	private final Object tag;

	static 
	{
		ExoPlayerLibraryInfo.registerModule("goog.exo.dash");
	//    0    0:ldc1            #110 <String "goog.exo.dash">
	//    1    2:invokestatic    #116 <Method void ExoPlayerLibraryInfo.registerModule(String)>
	//*   2    5:return          
	}


/*
	static void access$300(DashMediaSource dashmediasource)
	{
		dashmediasource.startLoadingManifest();
	//    0    0:aload_0         
	//    1    1:invokespecial   #230 <Method void startLoadingManifest()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$400(DashMediaSource dashmediasource, boolean flag)
	{
		dashmediasource.processManifest(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #235 <Method void processManifest(boolean)>
		return;
	//    3    5:return          
	}

*/


/*
	static Loader access$700(DashMediaSource dashmediasource)
	{
		return dashmediasource.loader;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field Loader loader>
	//    2    4:areturn         
	}

*/


/*
	static IOException access$800(DashMediaSource dashmediasource)
	{
		return dashmediasource.manifestFatalError;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field IOException manifestFatalError>
	//    2    4:areturn         
	}

*/
}
