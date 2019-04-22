// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.b.c.a;
import com.google.ads.interactivemedia.v3.b.d.c;
import com.google.ads.interactivemedia.v3.b.f;
import com.google.ads.interactivemedia.v3.b.w;
import com.google.c.b.m;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			q, u, ad, t, 
//			ae, ab, al, aa, 
//			a, i, l

public class i extends q
	implements AdsManager
{

	i(String s, ab ab1, ad ad1, BaseDisplayContainer basedisplaycontainer, ContentProgressProvider contentprogressprovider, List list, SortedSet sortedset, 
			Context context, boolean flag)
		throws AdError
	{
		this(s, ab1, ad1, basedisplaycontainer, contentprogressprovider, list, sortedset, ((al) (null)), ((u) (null)), ((com.google.ads.interactivemedia.v3.impl.a) (null)), context, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:aconst_null     
	//   11   15:aload           8
	//   12   17:iload           9
	//   13   19:invokespecial   #20  <Method void i(String, ab, ad, BaseDisplayContainer, ContentProgressProvider, List, SortedSet, al, u, com.google.ads.interactivemedia.v3.impl.a, Context, boolean)>
	//   14   22:return          
	}

	i(String s, ab ab1, ad ad1, BaseDisplayContainer basedisplaycontainer, ContentProgressProvider contentprogressprovider, List list, SortedSet sortedset, 
			al al1, u u1, com.google.ads.interactivemedia.v3.impl.a a1, Context context, boolean flag)
		throws AdError
	{
label0:
		{
			super(s, ab1, ad1, basedisplaycontainer, a1, context, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           10
	//    6    8:aload           11
	//    7   10:iload           12
	//    8   12:invokespecial   #27  <Method void q(String, ab, ad, BaseDisplayContainer, com.google.ads.interactivemedia.v3.impl.a, Context, boolean)>
			h = list;
	//    9   15:aload_0         
	//   10   16:aload           6
	//   11   18:putfield        #29  <Field List h>
			if(sortedset != null && !sortedset.isEmpty())
	//*  12   21:aload           7
	//*  13   23:ifnull          124
	//*  14   26:aload           7
	//*  15   28:invokeinterface #35  <Method boolean SortedSet.isEmpty()>
	//*  16   33:ifne            124
				if(contentprogressprovider != null)
	//*  17   36:aload           5
	//*  18   38:ifnull          108
				{
					if(u1 != null)
	//*  19   41:aload           9
	//*  20   43:ifnull          55
						e = u1;
	//   21   46:aload_0         
	//   22   47:aload           9
	//   23   49:putfield        #39  <Field u e>
					else
	//*  24   52:goto            72
						e = new u(contentprogressprovider, ad1.a());
	//   25   55:aload_0         
	//   26   56:new             #41  <Class u>
	//   27   59:dup             
	//   28   60:aload           5
	//   29   62:aload_3         
	//   30   63:invokevirtual   #47  <Method long com.google.ads.interactivemedia.v3.impl.ad.a()>
	//   31   66:invokespecial   #50  <Method void u(ContentProgressProvider, long)>
	//   32   69:putfield        #39  <Field u e>
					d = new t(ab1, sortedset, s);
	//   33   72:aload_0         
	//   34   73:new             #52  <Class t>
	//   35   76:dup             
	//   36   77:aload_2         
	//   37   78:aload           7
	//   38   80:aload_1         
	//   39   81:invokespecial   #55  <Method void t(ab, SortedSet, String)>
	//   40   84:putfield        #59  <Field t d>
					e.a(((af.b) (d)));
	//   41   87:aload_0         
	//   42   88:getfield        #39  <Field u e>
	//   43   91:aload_0         
	//   44   92:getfield        #59  <Field t d>
	//   45   95:invokevirtual   #62  <Method void com.google.ads.interactivemedia.v3.impl.u.a(af$b)>
					e.b();
	//   46   98:aload_0         
	//   47   99:getfield        #39  <Field u e>
	//   48  102:invokevirtual   #66  <Method void u.b()>
				} else
	//*  49  105:goto            124
				{
					throw new AdError(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType.PLAY, com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode.PLAYLIST_NO_CONTENT_TRACKING, "Unable to handle cue points, no content progress provider configured.");
	//   50  108:new             #17  <Class AdError>
	//   51  111:dup             
	//   52  112:getstatic       #72  <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorType com.google.ads.interactivemedia.v3.api.AdError$AdErrorType.PLAY>
	//   53  115:getstatic       #78  <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode.PLAYLIST_NO_CONTENT_TRACKING>
	//   54  118:ldc1            #80  <String "Unable to handle cue points, no content progress provider configured.">
	//   55  120:invokespecial   #83  <Method void AdError(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode, String)>
	//   56  123:athrow          
				}
			if(al1 != null)
	//*  57  124:aload           8
	//*  58  126:ifnull          138
			{
				c = al1;
	//   59  129:aload_0         
	//   60  130:aload           8
	//   61  132:putfield        #87  <Field al c>
			} else
	//*  62  135:goto            232
			{
				contentprogressprovider = ((ContentProgressProvider) (ad1.b()));
	//   63  138:aload_3         
	//   64  139:invokevirtual   #90  <Method aa$a ad.b()>
	//   65  142:astore          5
				static class _cls1 extends b
				{

					void a(com.google.ads.interactivemedia.v3.b.d.a a2, Object obj)
						throws IOException, IllegalAccessException
					{
						a2 = ((com.google.ads.interactivemedia.v3.b.d.a) (a.read(a2)));
					//    0    0:aload_0         
					//    1    1:getfield        #41  <Field w a>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #53  <Method Object w.read(com.google.ads.interactivemedia.v3.b.d.a)>
					//    4    8:astore_1        
						if(a2 != null || !e)
					//*   5    9:aload_1         
					//*   6   10:ifnonnull       20
					//*   7   13:aload_0         
					//*   8   14:getfield        #33  <Field boolean e>
					//*   9   17:ifne            29
							c.set(obj, ((Object) (a2)));
					//   10   20:aload_0         
					//   11   21:getfield        #29  <Field Field c>
					//   12   24:aload_2         
					//   13   25:aload_1         
					//   14   26:invokevirtual   #59  <Method void Field.set(Object, Object)>
					//   15   29:return          
					}

					void a(c c1, Object obj)
						throws IOException, IllegalAccessException
					{
						obj = c.get(obj);
					//    0    0:aload_0         
					//    1    1:getfield        #29  <Field Field c>
					//    2    4:aload_2         
					//    3    5:invokevirtual   #65  <Method Object Field.get(Object)>
					//    4    8:astore_2        
						((w) (new l(b, a, d.b()))).write(c1, obj);
					//    5    9:new             #67  <Class l>
					//    6   12:dup             
					//    7   13:aload_0         
					//    8   14:getfield        #27  <Field f b>
					//    9   17:aload_0         
					//   10   18:getfield        #41  <Field w a>
					//   11   21:aload_0         
					//   12   22:getfield        #31  <Field a d>
					//   13   25:invokevirtual   #72  <Method java.lang.reflect.Type a.b()>
					//   14   28:invokespecial   #75  <Method void l(f, w, java.lang.reflect.Type)>
					//   15   31:aload_1         
					//   16   32:aload_2         
					//   17   33:invokevirtual   #78  <Method void w.write(c, Object)>
					//   18   36:return          
					}

					public boolean a(Object obj)
						throws IOException, IllegalAccessException
					{
						boolean flag2 = h;
					//    0    0:aload_0         
					//    1    1:getfield        #82  <Field boolean h>
					//    2    4:istore_3        
						boolean flag1 = false;
					//    3    5:iconst_0        
					//    4    6:istore_2        
						if(!flag2)
					//*   5    7:iload_3         
					//*   6    8:ifne            13
							return false;
					//    7   11:iconst_0        
					//    8   12:ireturn         
						if(c.get(obj) != obj)
					//*   9   13:aload_0         
					//*  10   14:getfield        #29  <Field Field c>
					//*  11   17:aload_1         
					//*  12   18:invokevirtual   #65  <Method Object Field.get(Object)>
					//*  13   21:aload_1         
					//*  14   22:if_acmpeq       27
							flag1 = true;
					//   15   25:iconst_1        
					//   16   26:istore_2        
						return flag1;
					//   17   27:iload_2         
					//   18   28:ireturn         
					}

					final w a;
					final f b;
					final Field c;
					final a d;
					final boolean e;
					final i f;

			
			{
				f = j;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field i f>
				b = f1;
			//    3    5:aload_0         
			//    4    6:aload           5
			//    5    8:putfield        #27  <Field f b>
				c = field;
			//    6   11:aload_0         
			//    7   12:aload           6
			//    8   14:putfield        #29  <Field Field c>
				d = a1;
			//    9   17:aload_0         
			//   10   18:aload           7
			//   11   20:putfield        #31  <Field a d>
				e = flag2;
			//   12   23:aload_0         
			//   13   24:iload           8
			//   14   26:putfield        #33  <Field boolean e>
				super(s, flag, flag1);
			//   15   29:aload_0         
			//   16   30:aload_2         
			//   17   31:iload_3         
			//   18   32:iload           4
			//   19   34:invokespecial   #36  <Method void i$b(String, boolean, boolean)>
				a = com.google.ads.interactivemedia.v3.b.b.a.i.a(f, b, c, d);
			//   20   37:aload_0         
			//   21   38:aload_0         
			//   22   39:getfield        #25  <Field i f>
			//   23   42:aload_0         
			//   24   43:getfield        #27  <Field f b>
			//   25   46:aload_0         
			//   26   47:getfield        #29  <Field Field c>
			//   27   50:aload_0         
			//   28   51:getfield        #31  <Field a d>
			//   29   54:invokestatic    #39  <Method w com.google.ads.interactivemedia.v3.b.b.a.i.a(i, f, Field, a)>
			//   30   57:putfield        #41  <Field w a>
			//   31   60:return          
			}
				}

				switch(com.google.ads.interactivemedia.v3.impl._cls1.a[((aa.a) (contentprogressprovider)).ordinal()])
	//*  66  144:getstatic       #93  <Field int[] com.google.ads.interactivemedia.v3.impl.i$1.a>
	//*  67  147:aload           5
	//*  68  149:invokevirtual   #99  <Method int aa$a.ordinal()>
	//*  69  152:iaload          
				{
	//*  70  153:tableswitch     1 2: default 176
	//	               1 210
	//	               2 210
				default:
					ab1 = ((ab) (com.google.ads.interactivemedia.v3.api.AdError.AdErrorType.PLAY));
	//   71  176:getstatic       #72  <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorType com.google.ads.interactivemedia.v3.api.AdError$AdErrorType.PLAY>
	//   72  179:astore_2        
					ad1 = ((ad) (com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode.INTERNAL_ERROR));
	//   73  180:getstatic       #102 <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode.INTERNAL_ERROR>
	//   74  183:astore_3        
					s = String.valueOf(((Object) (((aa.a) (contentprogressprovider)).name())));
	//   75  184:aload           5
	//   76  186:invokevirtual   #106 <Method String aa$a.name()>
	//   77  189:invokestatic    #112 <Method String String.valueOf(Object)>
	//   78  192:astore_1        
					if(s.length() != 0)
	//*  79  193:aload_1         
	//*  80  194:invokevirtual   #115 <Method int String.length()>
	//*  81  197:ifeq            250
						s = "UI style not supported: ".concat(s);
	//   82  200:ldc1            #117 <String "UI style not supported: ">
	//   83  202:aload_1         
	//   84  203:invokevirtual   #121 <Method String String.concat(String)>
	//   85  206:astore_1        
					else
	//*  86  207:goto            260
	//*  87  210:aload_0         
	//*  88  211:new             #123 <Class ae>
	//*  89  214:dup             
	//*  90  215:aload_1         
	//*  91  216:aload_3         
	//*  92  217:aload_2         
	//*  93  218:aload_0         
	//*  94  219:aload           4
	//*  95  221:checkcast       #125 <Class AdDisplayContainer>
	//*  96  224:aload           11
	//*  97  226:invokespecial   #128 <Method void ae(String, ad, ab, i, AdDisplayContainer, Context)>
	//*  98  229:putfield        #87  <Field al c>
	//*  99  232:aload_0         
	//* 100  233:aload_0         
	//* 101  234:getfield        #87  <Field al c>
	//* 102  237:invokevirtual   #132 <Method void addAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener)>
	//* 103  240:aload_2         
	//* 104  241:aload_0         
	//* 105  242:getfield        #87  <Field al c>
	//* 106  245:aload_1         
	//* 107  246:invokevirtual   #137 <Method void com.google.ads.interactivemedia.v3.impl.ab.a(al, String)>
	//* 108  249:return          
						s = new String("UI style not supported: ");
	//  109  250:new             #108 <Class String>
	//  110  253:dup             
	//  111  254:ldc1            #117 <String "UI style not supported: ">
	//  112  256:invokespecial   #140 <Method void String(String)>
	//  113  259:astore_1        
					break label0;

				case 1: // '\001'
				case 2: // '\002'
					c = ((al) (new ae(s, ad1, ab1, this, (AdDisplayContainer)basedisplaycontainer, context)));
					break;
				}
			}
			addAdErrorListener(((com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener) (c)));
			ab1.a(c, s);
			return;
		}
		throw new AdError(((com.google.ads.interactivemedia.v3.api.AdError.AdErrorType) (ab1)), ((com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode) (ad1)), s);
	//  114  260:new             #17  <Class AdError>
	//  115  263:dup             
	//  116  264:aload_2         
	//  117  265:aload_3         
	//  118  266:aload_1         
	//  119  267:invokespecial   #83  <Method void AdError(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode, String)>
	//  120  270:athrow          
	}

	private void b(Map map)
	{
		if(map != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
		{
			g = ((List) (m.a(map.values())));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #148 <Method java.util.Collection Map.values()>
	//    5   11:invokestatic    #153 <Method m m.a(java.util.Collection)>
	//    6   14:putfield        #155 <Field List g>
			return;
	//    7   17:return          
		} else
		{
			g = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #155 <Field List g>
			return;
	//   11   23:return          
		}
	}

	private List getCurrentCompanions()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field List g>
	//    2    4:areturn         
	}

	private void onCompanionRendered(String s)
	{
		a.a(s, b);
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field ab a>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #166 <Field String b>
	//    5    9:invokevirtual   #169 <Method void com.google.ads.interactivemedia.v3.impl.ab.a(String, String)>
	//    6   12:return          
	}

	protected void a()
	{
		g = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #155 <Field List g>
		super.a();
	//    3    5:aload_0         
	//    4    6:invokespecial   #171 <Method void com.google.ads.interactivemedia.v3.impl.q.a()>
	//    5    9:return          
	}

	public volatile void a(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType aderrortype, int j, String s)
	{
		super.a(aderrortype, j, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #174 <Method void com.google.ads.interactivemedia.v3.impl.q.a(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, int, String)>
	//    5    7:return          
	}

	public volatile void a(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType aderrortype, com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode aderrorcode, String s)
	{
		super.a(aderrortype, aderrorcode, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #176 <Method void com.google.ads.interactivemedia.v3.impl.q.a(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode, String)>
	//    5    7:return          
	}

	public void a(ab.c c)
	{
		com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType adeventtype = c.a;
	//    0    0:aload_1         
	//    1    1:getfield        #182 <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.impl.ab$c.a>
	//    2    4:astore_2        
		if(_cls1.b[adeventtype.ordinal()] == 1)
	//*   3    5:getstatic       #184 <Field int[] i$1.b>
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #187 <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*   6   12:iaload          
	//*   7   13:iconst_1        
	//*   8   14:icmpeq          20
	//*   9   17:goto            38
		{
			a();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #188 <Method void a()>
			if(!f)
	//*  12   24:aload_0         
	//*  13   25:getfield        #192 <Field boolean f>
	//*  14   28:ifne            38
				a(aa.c.destroy);
	//   15   31:aload_0         
	//   16   32:getstatic       #198 <Field aa$c aa$c.destroy>
	//   17   35:invokevirtual   #201 <Method void a(aa$c)>
		}
		if(adeventtype == com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.COMPLETED || adeventtype == com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.SKIPPED)
	//*  18   38:aload_2         
	//*  19   39:getstatic       #204 <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.COMPLETED>
	//*  20   42:if_acmpeq       52
	//*  21   45:aload_2         
	//*  22   46:getstatic       #207 <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.SKIPPED>
	//*  23   49:if_acmpne       57
			b(((Map) (null)));
	//   24   52:aload_0         
	//   25   53:aconst_null     
	//   26   54:invokespecial   #209 <Method void b(Map)>
		super.a(c);
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:invokespecial   #211 <Method void com.google.ads.interactivemedia.v3.impl.q.a(ab$c)>
	//   30   62:return          
	}

	public void a(Map map)
	{
		b(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #209 <Method void b(Map)>
	//    3    5:return          
	}

	public volatile void addAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener aderrorlistener)
	{
		super.addAdErrorListener(aderrorlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #212 <Method void q.addAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener)>
	//    3    5:return          
	}

	public volatile void addAdEventListener(com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener adeventlistener)
	{
		super.addAdEventListener(adeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #216 <Method void q.addAdEventListener(com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener)>
	//    3    5:return          
	}

	public volatile void destroy()
	{
		super.destroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #218 <Method void q.destroy()>
	//    2    4:return          
	}

	public void discardAdBreak()
	{
		a(aa.c.discardAdBreak);
	//    0    0:aload_0         
	//    1    1:getstatic       #221 <Field aa$c aa$c.discardAdBreak>
	//    2    4:invokevirtual   #201 <Method void a(aa$c)>
	//    3    7:return          
	}

	public List getAdCuePoints()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List h>
	//    2    4:areturn         
	}

	public volatile VideoProgressUpdate getAdProgress()
	{
		return super.getAdProgress();
	//    0    0:aload_0         
	//    1    1:invokespecial   #227 <Method VideoProgressUpdate q.getAdProgress()>
	//    2    4:areturn         
	}

	public volatile Ad getCurrentAd()
	{
		return super.getCurrentAd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #231 <Method Ad q.getCurrentAd()>
	//    2    4:areturn         
	}

	public volatile void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #234 <Method void q.init()>
	//    2    4:return          
	}

	public volatile void init(AdsRenderingSettings adsrenderingsettings)
	{
		super.init(adsrenderingsettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #237 <Method void q.init(AdsRenderingSettings)>
	//    3    5:return          
	}

	public boolean isCustomPlaybackUsed()
	{
		return c.f();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field al c>
	//    2    4:invokeinterface #242 <Method boolean com.google.ads.interactivemedia.v3.impl.al.f()>
	//    3    9:ireturn         
	}

	public void pause()
	{
		a(aa.c.pause);
	//    0    0:aload_0         
	//    1    1:getstatic       #245 <Field aa$c aa$c.pause>
	//    2    4:invokevirtual   #201 <Method void a(aa$c)>
	//    3    7:return          
	}

	public volatile void removeAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener aderrorlistener)
	{
		super.removeAdErrorListener(aderrorlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #248 <Method void q.removeAdErrorListener(com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener)>
	//    3    5:return          
	}

	public volatile void removeAdEventListener(com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener adeventlistener)
	{
		super.removeAdEventListener(adeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #251 <Method void q.removeAdEventListener(com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener)>
	//    3    5:return          
	}

	public void requestNextAdBreak()
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field u e>
	//*   2    4:ifnull          45
		{
			a.b(new aa(aa.b.contentTimeUpdate, aa.c.contentTimeUpdate, b, ((Object) (e.a()))));
	//    3    7:aload_0         
	//    4    8:getfield        #163 <Field ab a>
	//    5   11:new             #254 <Class aa>
	//    6   14:dup             
	//    7   15:getstatic       #260 <Field aa$b aa$b.contentTimeUpdate>
	//    8   18:getstatic       #262 <Field aa$c aa$c.contentTimeUpdate>
	//    9   21:aload_0         
	//   10   22:getfield        #166 <Field String b>
	//   11   25:aload_0         
	//   12   26:getfield        #39  <Field u e>
	//   13   29:invokevirtual   #264 <Method VideoProgressUpdate com.google.ads.interactivemedia.v3.impl.u.a()>
	//   14   32:invokespecial   #267 <Method void aa(aa$b, aa$c, String, Object)>
	//   15   35:invokevirtual   #270 <Method void ab.b(aa)>
			a(aa.c.requestNextAdBreak);
	//   16   38:aload_0         
	//   17   39:getstatic       #272 <Field aa$c aa$c.requestNextAdBreak>
	//   18   42:invokevirtual   #201 <Method void a(aa$c)>
		}
	//   19   45:return          
	}

	public void resume()
	{
		a(aa.c.resume);
	//    0    0:aload_0         
	//    1    1:getstatic       #275 <Field aa$c aa$c.resume>
	//    2    4:invokevirtual   #201 <Method void a(aa$c)>
	//    3    7:return          
	}

	public void skip()
	{
		a(aa.c.skip);
	//    0    0:aload_0         
	//    1    1:getstatic       #278 <Field aa$c aa$c.skip>
	//    2    4:invokevirtual   #201 <Method void a(aa$c)>
	//    3    7:return          
	}

	public void start()
	{
		a(aa.c.start);
	//    0    0:aload_0         
	//    1    1:getstatic       #281 <Field aa$c aa$c.start>
	//    2    4:invokevirtual   #201 <Method void a(aa$c)>
	//    3    7:return          
	}

	private List g;
	private List h;
}
