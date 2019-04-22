// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.*;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			q, ak, ab, al, 
//			ad, u, a

public class ai extends q
	implements StreamManager
{

	ai(String s, ab ab1, ad ad, BaseDisplayContainer basedisplaycontainer, ContentProgressProvider contentprogressprovider, String s1, al al1, 
			u u, a a1, Context context, String s2, boolean flag)
		throws AdError
	{
		super(s, ab1, ad, basedisplaycontainer, a1, context, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           9
	//    6    8:aload           10
	//    7   10:iload           12
	//    8   12:invokespecial   #22  <Method void q(String, ab, ad, BaseDisplayContainer, a, Context, boolean)>
		h = ((List) (new ArrayList()));
	//    9   15:aload_0         
	//   10   16:new             #24  <Class ArrayList>
	//   11   19:dup             
	//   12   20:invokespecial   #27  <Method void ArrayList()>
	//   13   23:putfield        #29  <Field List h>
		g = s2;
	//   14   26:aload_0         
	//   15   27:aload           11
	//   16   29:putfield        #31  <Field String g>
		if(al1 != null)
	//*  17   32:aload           7
	//*  18   34:ifnull          46
		{
			c = al1;
	//   19   37:aload_0         
	//   20   38:aload           7
	//   21   40:putfield        #35  <Field al c>
		} else
	//*  22   43:goto            80
		{
			c = ((al) (new ak(s, ad, ab1, this, (StreamDisplayContainer)basedisplaycontainer, s1, context)));
	//   23   46:aload_0         
	//   24   47:new             #37  <Class ak>
	//   25   50:dup             
	//   26   51:aload_1         
	//   27   52:aload_3         
	//   28   53:aload_2         
	//   29   54:aload_0         
	//   30   55:aload           4
	//   31   57:checkcast       #39  <Class StreamDisplayContainer>
	//   32   60:aload           6
	//   33   62:aload           10
	//   34   64:invokespecial   #42  <Method void ak(String, ad, ab, ai, StreamDisplayContainer, String, Context)>
	//   35   67:putfield        #35  <Field al c>
			((ak)c).g();
	//   36   70:aload_0         
	//   37   71:getfield        #35  <Field al c>
	//   38   74:checkcast       #37  <Class ak>
	//   39   77:invokevirtual   #44  <Method void ak.g()>
		}
		addAdErrorListener(((com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener) (c)));
	//   40   80:aload_0         
	//   41   81:aload_0         
	//   42   82:getfield        #35  <Field al c>
	//   43   85:invokevirtual   #48  <Method void addAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener)>
		ab1.a(c, s);
	//   44   88:aload_2         
	//   45   89:aload_0         
	//   46   90:getfield        #35  <Field al c>
	//   47   93:aload_1         
	//   48   94:invokevirtual   #54  <Method void ab.a(al, String)>
	//   49   97:return          
	}

	ai(String s, ab ab1, ad ad, StreamRequest streamrequest, Context context, String s1, boolean flag)
		throws AdError
	{
		this(s, ab1, ad, ((BaseDisplayContainer) (streamrequest.getStreamDisplayContainer())), ((ContentProgressProvider) (streamrequest.getStreamDisplayContainer().getVideoStreamPlayer())), streamrequest.getManifestSuffix(), ((al) (null)), ((u) (null)), ((a) (null)), context, s1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokeinterface #63  <Method StreamDisplayContainer StreamRequest.getStreamDisplayContainer()>
	//    6   11:aload           4
	//    7   13:invokeinterface #63  <Method StreamDisplayContainer StreamRequest.getStreamDisplayContainer()>
	//    8   18:invokeinterface #67  <Method com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer StreamDisplayContainer.getVideoStreamPlayer()>
	//    9   23:aload           4
	//   10   25:invokeinterface #71  <Method String StreamRequest.getManifestSuffix()>
	//   11   30:aconst_null     
	//   12   31:aconst_null     
	//   13   32:aconst_null     
	//   14   33:aload           5
	//   15   35:aload           6
	//   16   37:iload           7
	//   17   39:invokespecial   #73  <Method void ai(String, ab, ad, BaseDisplayContainer, ContentProgressProvider, String, al, u, a, Context, String, boolean)>
	//   18   42:return          
	}

	public volatile void a(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType aderrortype, int j, String s)
	{
		super.a(aderrortype, j, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #76  <Method void q.a(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, int, String)>
	//    5    7:return          
	}

	public volatile void a(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType aderrortype, com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode aderrorcode, String s)
	{
		super.a(aderrortype, aderrorcode, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #79  <Method void q.a(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode, String)>
	//    5    7:return          
	}

	public void a(ab.c c)
	{
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.values().length];
			//    0    0:invokestatic    #18  <Method com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType[] com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.AD_BREAK_STARTED.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.AD_BREAK_STARTED>
			//    6   15:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.AD_BREAK_ENDED>
			//*  11   26:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #34  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.CUEPOINTS_CHANGED>
			//*  16   37:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] a>
			//*  20   45:getstatic       #37  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.AD_PROGRESS>
			//*  21   48:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.AD_BREAK_ENDED.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.CUEPOINTS_CHANGED.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					a[com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.AD_PROGRESS.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls1.a[c.a.ordinal()])
	//*   0    0:getstatic       #83  <Field int[] ai$1.a>
	//*   1    3:aload_1         
	//*   2    4:getfield        #88  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType ab$c.a>
	//*   3    7:invokevirtual   #94  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 4: default 40
	//	               1 82
	//	               2 65
	//	               3 54
	//	               4 43
	//*   6   40:goto            91
		case 4: // '\004'
			i = c.e;
	//    7   43:aload_0         
	//    8   44:aload_1         
	//    9   45:getfield        #97  <Field AdProgressInfo ab$c.e>
	//   10   48:putfield        #99  <Field AdProgressInfo i>
			break;

	//*  11   51:goto            91
		case 3: // '\003'
			h = c.d;
	//   12   54:aload_0         
	//   13   55:aload_1         
	//   14   56:getfield        #102 <Field List ab$c.d>
	//   15   59:putfield        #29  <Field List h>
			break;

	//*  16   62:goto            91
		case 2: // '\002'
			this.c.d();
	//   17   65:aload_0         
	//   18   66:getfield        #35  <Field al c>
	//   19   69:invokeinterface #106 <Method void al.d()>
			i = null;
	//   20   74:aload_0         
	//   21   75:aconst_null     
	//   22   76:putfield        #99  <Field AdProgressInfo i>
			break;

	//*  23   79:goto            91
		case 1: // '\001'
			this.c.c();
	//   24   82:aload_0         
	//   25   83:getfield        #35  <Field al c>
	//   26   86:invokeinterface #108 <Method void al.c()>
			break;
		}
		super.a(c);
	//   27   91:aload_0         
	//   28   92:aload_1         
	//   29   93:invokespecial   #110 <Method void q.a(ab$c)>
	//   30   96:return          
	}

	public volatile void a(Map map)
	{
		super.a(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #113 <Method void q.a(Map)>
	//    3    5:return          
	}

	public volatile void addAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener aderrorlistener)
	{
		super.addAdErrorListener(aderrorlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #114 <Method void q.addAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener)>
	//    3    5:return          
	}

	public volatile void addAdEventListener(com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener adeventlistener)
	{
		super.addAdEventListener(adeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #118 <Method void q.addAdEventListener(com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener)>
	//    3    5:return          
	}

	public volatile void destroy()
	{
		super.destroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void q.destroy()>
	//    2    4:return          
	}

	public volatile VideoProgressUpdate getAdProgress()
	{
		return super.getAdProgress();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method VideoProgressUpdate q.getAdProgress()>
	//    2    4:areturn         
	}

	public AdProgressInfo getAdProgressInfo()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field AdProgressInfo i>
	//    2    4:areturn         
	}

	public double getContentTimeForStreamTime(double d)
	{
		if(h.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field List h>
	//*   2    4:invokeinterface #135 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return 0.0D;
	//    4   12:dconst_0        
	//    5   13:dreturn         
		Iterator iterator = h.iterator();
	//    6   14:aload_0         
	//    7   15:getfield        #29  <Field List h>
	//    8   18:invokeinterface #139 <Method Iterator List.iterator()>
	//    9   23:astore          5
		double d1 = d;
	//   10   25:dload_1         
	//   11   26:dstore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   27:aload           5
	//   13   29:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            141
			CuePoint cuepoint = (CuePoint)iterator.next();
	//   15   37:aload           5
	//   16   39:invokeinterface #148 <Method Object Iterator.next()>
	//   17   44:checkcast       #150 <Class CuePoint>
	//   18   47:astore          6
			if(cuepoint.getStartTime() > cuepoint.getEndTime())
	//*  19   49:aload           6
	//*  20   51:invokeinterface #154 <Method double CuePoint.getStartTime()>
	//*  21   56:aload           6
	//*  22   58:invokeinterface #157 <Method double CuePoint.getEndTime()>
	//*  23   63:dcmpl           
	//*  24   64:ifle            69
				return 0.0D;
	//   25   67:dconst_0        
	//   26   68:dreturn         
			if(d >= cuepoint.getEndTime())
	//*  27   69:dload_1         
	//*  28   70:aload           6
	//*  29   72:invokeinterface #157 <Method double CuePoint.getEndTime()>
	//*  30   77:dcmpl           
	//*  31   78:iflt            102
				d1 -= cuepoint.getEndTime() - cuepoint.getStartTime();
	//   32   81:dload_3         
	//   33   82:aload           6
	//   34   84:invokeinterface #157 <Method double CuePoint.getEndTime()>
	//   35   89:aload           6
	//   36   91:invokeinterface #154 <Method double CuePoint.getStartTime()>
	//   37   96:dsub            
	//   38   97:dsub            
	//   39   98:dstore_3        
			else
	//*  40   99:goto            27
			if(d < cuepoint.getEndTime() && d > cuepoint.getStartTime())
	//*  41  102:dload_1         
	//*  42  103:aload           6
	//*  43  105:invokeinterface #157 <Method double CuePoint.getEndTime()>
	//*  44  110:dcmpg           
	//*  45  111:ifge            27
	//*  46  114:dload_1         
	//*  47  115:aload           6
	//*  48  117:invokeinterface #154 <Method double CuePoint.getStartTime()>
	//*  49  122:dcmpl           
	//*  50  123:ifle            27
				d1 -= d - cuepoint.getStartTime();
	//   51  126:dload_3         
	//   52  127:dload_1         
	//   53  128:aload           6
	//   54  130:invokeinterface #154 <Method double CuePoint.getStartTime()>
	//   55  135:dsub            
	//   56  136:dsub            
	//   57  137:dstore_3        
		} while(true);
	//   58  138:goto            27
		return d1;
	//   59  141:dload_3         
	//   60  142:dreturn         
	}

	public List getCuePoints()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List h>
	//    2    4:areturn         
	}

	public volatile Ad getCurrentAd()
	{
		return super.getCurrentAd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #165 <Method Ad q.getCurrentAd()>
	//    2    4:areturn         
	}

	public CuePoint getPreviousCuePointForStreamTime(double d)
	{
		Iterator iterator = h.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List h>
	//    2    4:invokeinterface #139 <Method Iterator List.iterator()>
	//    3    9:astore          5
		CuePoint cuepoint = null;
	//    4   11:aconst_null     
	//    5   12:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   13:aload           5
	//    7   15:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//    8   20:ifeq            53
			CuePoint cuepoint1 = (CuePoint)iterator.next();
	//    9   23:aload           5
	//   10   25:invokeinterface #148 <Method Object Iterator.next()>
	//   11   30:checkcast       #150 <Class CuePoint>
	//   12   33:astore          4
			if(cuepoint1.getStartTime() < d)
	//*  13   35:aload           4
	//*  14   37:invokeinterface #154 <Method double CuePoint.getStartTime()>
	//*  15   42:dload_1         
	//*  16   43:dcmpg           
	//*  17   44:ifge            13
				cuepoint = cuepoint1;
	//   18   47:aload           4
	//   19   49:astore_3        
		} while(true);
	//   20   50:goto            13
		return cuepoint;
	//   21   53:aload_3         
	//   22   54:areturn         
	}

	public String getStreamId()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String g>
	//    2    4:areturn         
	}

	public double getStreamTimeForContentTime(double d)
	{
		if(h.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field List h>
	//*   2    4:invokeinterface #135 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return 0.0D;
	//    4   12:dconst_0        
	//    5   13:dreturn         
		Iterator iterator = h.iterator();
	//    6   14:aload_0         
	//    7   15:getfield        #29  <Field List h>
	//    8   18:invokeinterface #139 <Method Iterator List.iterator()>
	//    9   23:astore          9
		double d1 = d;
	//   10   25:dload_1         
	//   11   26:dstore_3        
		double d2 = 0.0D;
	//   12   27:dconst_0        
	//   13   28:dstore          5
		CuePoint cuepoint;
		for(double d3 = d2; iterator.hasNext(); d3 = cuepoint.getEndTime())
	//*  14   30:dload           5
	//*  15   32:dstore          7
	//*  16   34:aload           9
	//*  17   36:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//*  18   41:ifeq            130
		{
			cuepoint = (CuePoint)iterator.next();
	//   19   44:aload           9
	//   20   46:invokeinterface #148 <Method Object Iterator.next()>
	//   21   51:checkcast       #150 <Class CuePoint>
	//   22   54:astore          10
			if(cuepoint.getStartTime() > cuepoint.getEndTime())
	//*  23   56:aload           10
	//*  24   58:invokeinterface #154 <Method double CuePoint.getStartTime()>
	//*  25   63:aload           10
	//*  26   65:invokeinterface #157 <Method double CuePoint.getEndTime()>
	//*  27   70:dcmpl           
	//*  28   71:ifle            76
				return 0.0D;
	//   29   74:dconst_0        
	//   30   75:dreturn         
			d2 += cuepoint.getStartTime() - d3;
	//   31   76:dload           5
	//   32   78:aload           10
	//   33   80:invokeinterface #154 <Method double CuePoint.getStartTime()>
	//   34   85:dload           7
	//   35   87:dsub            
	//   36   88:dadd            
	//   37   89:dstore          5
			if(d2 > d)
	//*  38   91:dload           5
	//*  39   93:dload_1         
	//*  40   94:dcmpl           
	//*  41   95:ifle            100
				return d1;
	//   42   98:dload_3         
	//   43   99:dreturn         
			d1 += cuepoint.getEndTime() - cuepoint.getStartTime();
	//   44  100:dload_3         
	//   45  101:aload           10
	//   46  103:invokeinterface #157 <Method double CuePoint.getEndTime()>
	//   47  108:aload           10
	//   48  110:invokeinterface #154 <Method double CuePoint.getStartTime()>
	//   49  115:dsub            
	//   50  116:dadd            
	//   51  117:dstore_3        
		}

	//   52  118:aload           10
	//   53  120:invokeinterface #157 <Method double CuePoint.getEndTime()>
	//   54  125:dstore          7
	//*  55  127:goto            34
		return d1;
	//   56  130:dload_3         
	//   57  131:dreturn         
	}

	public volatile void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method void q.init()>
	//    2    4:return          
	}

	public volatile void init(AdsRenderingSettings adsrenderingsettings)
	{
		super.init(adsrenderingsettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #175 <Method void q.init(AdsRenderingSettings)>
	//    3    5:return          
	}

	public boolean isCustomPlaybackUsed()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile void removeAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener aderrorlistener)
	{
		super.removeAdErrorListener(aderrorlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #179 <Method void q.removeAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener)>
	//    3    5:return          
	}

	public volatile void removeAdEventListener(com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener adeventlistener)
	{
		super.removeAdEventListener(adeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #182 <Method void q.removeAdEventListener(com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener)>
	//    3    5:return          
	}

	private final String g;
	private List h;
	private AdProgressInfo i;
}
