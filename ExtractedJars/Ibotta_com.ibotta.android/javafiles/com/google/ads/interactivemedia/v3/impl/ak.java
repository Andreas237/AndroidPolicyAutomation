// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.*;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.v3.impl.data.b;
import com.google.ads.interactivemedia.v3.impl.data.l;
import java.util.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			al, u, ad, k, 
//			aa, ab, c, ai, 
//			o

public class ak
	implements com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback, af.b, al
{
	static abstract class a
	{

		public static a create(String s)
		{
			return ((a) (new o(s)));
		//    0    0:new             #16  <Class o>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #19  <Method void o(String)>
		//    4    8:areturn         
		}

		abstract String TXXX();

		a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public ak(String s, ad ad1, ab ab1, ai ai1, StreamDisplayContainer streamdisplaycontainer, String s1, Context context)
		throws AdError
	{
		this(s, ad1, ab1, ai1, streamdisplaycontainer, s1, ((u) (null)), ((k) (null)), context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aconst_null     
	//    8   11:aconst_null     
	//    9   12:aload           7
	//   10   14:invokespecial   #34  <Method void ak(String, ad, ab, ai, StreamDisplayContainer, String, u, k, Context)>
	//   11   17:return          
	}

	public ak(String s, ad ad1, ab ab1, ai ai1, StreamDisplayContainer streamdisplaycontainer, String s1, u u1, 
			k k1, Context context)
		throws AdError
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		a = streamdisplaycontainer.getVideoStreamPlayer();
	//    2    4:aload_0         
	//    3    5:aload           5
	//    4    7:invokeinterface #45  <Method VideoStreamPlayer StreamDisplayContainer.getVideoStreamPlayer()>
	//    5   12:putfield        #47  <Field VideoStreamPlayer a>
		VideoStreamPlayer videostreamplayer = a;
	//    6   15:aload_0         
	//    7   16:getfield        #47  <Field VideoStreamPlayer a>
	//    8   19:astore          10
		if(videostreamplayer != null)
	//*   9   21:aload           10
	//*  10   23:ifnull          122
		{
			c = ai1;
	//   11   26:aload_0         
	//   12   27:aload           4
	//   13   29:putfield        #49  <Field ai c>
			f = s;
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:putfield        #51  <Field String f>
			b = ab1;
	//   17   37:aload_0         
	//   18   38:aload_3         
	//   19   39:putfield        #53  <Field ab b>
			g = s1;
	//   20   42:aload_0         
	//   21   43:aload           6
	//   22   45:putfield        #55  <Field String g>
			d = u1;
	//   23   48:aload_0         
	//   24   49:aload           7
	//   25   51:putfield        #57  <Field u d>
			if(d == null)
	//*  26   54:aload_0         
	//*  27   55:getfield        #57  <Field u d>
	//*  28   58:ifnonnull       78
				d = new u(((com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider) (videostreamplayer)), ad1.a());
	//   29   61:aload_0         
	//   30   62:new             #59  <Class u>
	//   31   65:dup             
	//   32   66:aload           10
	//   33   68:aload_2         
	//   34   69:invokevirtual   #64  <Method long ad.a()>
	//   35   72:invokespecial   #67  <Method void u(com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider, long)>
	//   36   75:putfield        #57  <Field u d>
			e = k1;
	//   37   78:aload_0         
	//   38   79:aload           8
	//   39   81:putfield        #69  <Field k e>
			if(e == null)
	//*  40   84:aload_0         
	//*  41   85:getfield        #69  <Field k e>
	//*  42   88:ifnonnull       121
			{
				try
				{
					e = new k(s, ad1, ab1, ((com.google.ads.interactivemedia.v3.api.BaseDisplayContainer) (streamdisplaycontainer)), context);
	//   43   91:aload_0         
	//   44   92:new             #71  <Class k>
	//   45   95:dup             
	//   46   96:aload_1         
	//   47   97:aload_2         
	//   48   98:aload_3         
	//   49   99:aload           5
	//   50  101:aload           9
	//   51  103:invokespecial   #74  <Method void k(String, ad, ab, com.google.ads.interactivemedia.v3.api.BaseDisplayContainer, Context)>
	//   52  106:putfield        #69  <Field k e>
					return;
	//   53  109:return          
				}
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  54  110:astore_1        
				{
					Log.e("IMASDK", "Error creating ad UI: ", ((Throwable) (s)));
	//   55  111:ldc1            #76  <String "IMASDK">
	//   56  113:ldc1            #78  <String "Error creating ad UI: ">
	//   57  115:aload_1         
	//   58  116:invokestatic    #83  <Method int Log.e(String, String, Throwable)>
	//   59  119:pop             
				}
				return;
	//   60  120:return          
			} else
			{
				return;
	//   61  121:return          
			}
		} else
		{
			throw new AdError(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType.LOAD, com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode.INVALID_ARGUMENTS, "Server-side ad insertion player was not provided.");
	//   62  122:new             #31  <Class AdError>
	//   63  125:dup             
	//   64  126:getstatic       #89  <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorType com.google.ads.interactivemedia.v3.api.AdError$AdErrorType.LOAD>
	//   65  129:getstatic       #95  <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode.INVALID_ARGUMENTS>
	//   66  132:ldc1            #97  <String "Server-side ad insertion player was not provided.">
	//   67  134:invokespecial   #100 <Method void AdError(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode, String)>
	//   68  137:athrow          
		}
	}

	private void a(aa.c c1, Object obj)
	{
		b.b(new aa(aa.b.videoDisplay, c1, f, obj));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ab b>
	//    2    4:new             #103 <Class aa>
	//    3    7:dup             
	//    4    8:getstatic       #109 <Field aa$b aa$b.videoDisplay>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field String f>
	//    8   16:aload_2         
	//    9   17:invokespecial   #112 <Method void aa(aa$b, aa$c, String, Object)>
	//   10   20:invokevirtual   #117 <Method void com.google.ads.interactivemedia.v3.impl.ab.b(aa)>
	//   11   23:return          
	}

	public String a(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          346
		{
			String s1 = g;
	//    2    4:aload_0         
	//    3    5:getfield        #55  <Field String g>
	//    4    8:astore_2        
			if(s1 != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          346
			{
				if(s1.length() == 0)
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #124 <Method int String.length()>
	//*   9   17:ifne            22
					return s;
	//   10   20:aload_1         
	//   11   21:areturn         
				Object obj = ((Object) (g.trim().replaceAll("\\s+", "")));
	//   12   22:aload_0         
	//   13   23:getfield        #55  <Field String g>
	//   14   26:invokevirtual   #128 <Method String String.trim()>
	//   15   29:ldc1            #130 <String "\\s+">
	//   16   31:ldc1            #132 <String "">
	//   17   33:invokevirtual   #136 <Method String String.replaceAll(String, String)>
	//   18   36:astore_3        
				s1 = ((String) (obj));
	//   19   37:aload_3         
	//   20   38:astore_2        
				if(((String) (obj)).charAt(0) == '?')
	//*  21   39:aload_3         
	//*  22   40:iconst_0        
	//*  23   41:invokevirtual   #140 <Method char String.charAt(int)>
	//*  24   44:bipush          63
	//*  25   46:icmpne          55
					s1 = ((String) (obj)).substring(1);
	//   26   49:aload_3         
	//   27   50:iconst_1        
	//   28   51:invokevirtual   #144 <Method String String.substring(int)>
	//   29   54:astore_2        
				if(s1.length() == 0)
	//*  30   55:aload_2         
	//*  31   56:invokevirtual   #124 <Method int String.length()>
	//*  32   59:ifne            64
					return s;
	//   33   62:aload_1         
	//   34   63:areturn         
				obj = ((Object) (Uri.parse(s)));
	//   35   64:aload_1         
	//   36   65:invokestatic    #150 <Method Uri Uri.parse(String)>
	//   37   68:astore_3        
				Object obj1 = ((Object) (((Uri) (obj)).getQueryParameterNames()));
	//   38   69:aload_3         
	//   39   70:invokevirtual   #154 <Method Set Uri.getQueryParameterNames()>
	//   40   73:astore          5
				android.net.Uri.Builder builder = Uri.parse(s).buildUpon();
	//   41   75:aload_1         
	//   42   76:invokestatic    #150 <Method Uri Uri.parse(String)>
	//   43   79:invokevirtual   #158 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   44   82:astore          4
				builder.clearQuery();
	//   45   84:aload           4
	//   46   86:invokevirtual   #163 <Method android.net.Uri$Builder android.net.Uri$Builder.clearQuery()>
	//   47   89:pop             
				if(!((Set) (obj1)).isEmpty())
	//*  48   90:aload           5
	//*  49   92:invokeinterface #169 <Method boolean Set.isEmpty()>
	//*  50   97:ifne            221
				{
					s = String.valueOf(((Object) (s1)));
	//   51  100:aload_2         
	//   52  101:invokestatic    #173 <Method String String.valueOf(Object)>
	//   53  104:astore_1        
					if(s.length() != 0)
	//*  54  105:aload_1         
	//*  55  106:invokevirtual   #124 <Method int String.length()>
	//*  56  109:ifeq            122
						s = "http://www.dom.com/path?".concat(s);
	//   57  112:ldc1            #175 <String "http://www.dom.com/path?">
	//   58  114:aload_1         
	//   59  115:invokevirtual   #178 <Method String String.concat(String)>
	//   60  118:astore_1        
					else
	//*  61  119:goto            132
						s = new String("http://www.dom.com/path?");
	//   62  122:new             #120 <Class String>
	//   63  125:dup             
	//   64  126:ldc1            #175 <String "http://www.dom.com/path?">
	//   65  128:invokespecial   #181 <Method void String(String)>
	//   66  131:astore_1        
					s = ((String) (Uri.parse(s)));
	//   67  132:aload_1         
	//   68  133:invokestatic    #150 <Method Uri Uri.parse(String)>
	//   69  136:astore_1        
					obj1 = ((Object) (((Set) (obj1)).iterator()));
	//   70  137:aload           5
	//   71  139:invokeinterface #185 <Method Iterator Set.iterator()>
	//   72  144:astore          5
					do
					{
						if(!((Iterator) (obj1)).hasNext())
							break;
	//   73  146:aload           5
	//   74  148:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//   75  153:ifeq            221
						String s2 = (String)((Iterator) (obj1)).next();
	//   76  156:aload           5
	//   77  158:invokeinterface #194 <Method Object Iterator.next()>
	//   78  163:checkcast       #120 <Class String>
	//   79  166:astore          6
						if(((Uri) (s)).getQueryParameter(s2) == null)
	//*  80  168:aload_1         
	//*  81  169:aload           6
	//*  82  171:invokevirtual   #197 <Method String Uri.getQueryParameter(String)>
	//*  83  174:ifnonnull       146
						{
							Iterator iterator = ((Uri) (obj)).getQueryParameters(s2).iterator();
	//   84  177:aload_3         
	//   85  178:aload           6
	//   86  180:invokevirtual   #201 <Method List Uri.getQueryParameters(String)>
	//   87  183:invokeinterface #204 <Method Iterator List.iterator()>
	//   88  188:astore          7
							while(iterator.hasNext()) 
	//*  89  190:aload           7
	//*  90  192:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//*  91  197:ifeq            146
								builder.appendQueryParameter(s2, (String)iterator.next());
	//   92  200:aload           4
	//   93  202:aload           6
	//   94  204:aload           7
	//   95  206:invokeinterface #194 <Method Object Iterator.next()>
	//   96  211:checkcast       #120 <Class String>
	//   97  214:invokevirtual   #208 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   98  217:pop             
						}
					} while(true);
	//   99  218:goto            190
				}
				obj = ((Object) (builder.build()));
	//  100  221:aload           4
	//  101  223:invokevirtual   #212 <Method Uri android.net.Uri$Builder.build()>
	//  102  226:astore_3        
				if(((Uri) (obj)).getQuery() == null)
	//* 103  227:aload_3         
	//* 104  228:invokevirtual   #215 <Method String Uri.getQuery()>
	//* 105  231:ifnonnull       269
				{
					s = String.valueOf(((Object) (s1)));
	//  106  234:aload_2         
	//  107  235:invokestatic    #173 <Method String String.valueOf(Object)>
	//  108  238:astore_1        
					if(s.length() != 0)
	//* 109  239:aload_1         
	//* 110  240:invokevirtual   #124 <Method int String.length()>
	//* 111  243:ifeq            256
						s = "?".concat(s);
	//  112  246:ldc1            #217 <String "?">
	//  113  248:aload_1         
	//  114  249:invokevirtual   #178 <Method String String.concat(String)>
	//  115  252:astore_1        
					else
	//* 116  253:goto            301
						s = new String("?");
	//  117  256:new             #120 <Class String>
	//  118  259:dup             
	//  119  260:ldc1            #217 <String "?">
	//  120  262:invokespecial   #181 <Method void String(String)>
	//  121  265:astore_1        
				} else
	//* 122  266:goto            301
				{
					s = String.valueOf(((Object) (s1)));
	//  123  269:aload_2         
	//  124  270:invokestatic    #173 <Method String String.valueOf(Object)>
	//  125  273:astore_1        
					if(s.length() != 0)
	//* 126  274:aload_1         
	//* 127  275:invokevirtual   #124 <Method int String.length()>
	//* 128  278:ifeq            291
						s = "&".concat(s);
	//  129  281:ldc1            #219 <String "&">
	//  130  283:aload_1         
	//  131  284:invokevirtual   #178 <Method String String.concat(String)>
	//  132  287:astore_1        
					else
	//* 133  288:goto            301
						s = new String("&");
	//  134  291:new             #120 <Class String>
	//  135  294:dup             
	//  136  295:ldc1            #219 <String "&">
	//  137  297:invokespecial   #181 <Method void String(String)>
	//  138  300:astore_1        
				}
				s1 = String.valueOf(obj);
	//  139  301:aload_3         
	//  140  302:invokestatic    #173 <Method String String.valueOf(Object)>
	//  141  305:astore_2        
				obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s))).length())));
	//  142  306:new             #221 <Class StringBuilder>
	//  143  309:dup             
	//  144  310:aload_2         
	//  145  311:invokestatic    #173 <Method String String.valueOf(Object)>
	//  146  314:invokevirtual   #124 <Method int String.length()>
	//  147  317:aload_1         
	//  148  318:invokestatic    #173 <Method String String.valueOf(Object)>
	//  149  321:invokevirtual   #124 <Method int String.length()>
	//  150  324:iadd            
	//  151  325:invokespecial   #224 <Method void StringBuilder(int)>
	//  152  328:astore_3        
				((StringBuilder) (obj)).append(s1);
	//  153  329:aload_3         
	//  154  330:aload_2         
	//  155  331:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  156  334:pop             
				((StringBuilder) (obj)).append(s);
	//  157  335:aload_3         
	//  158  336:aload_1         
	//  159  337:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  160  340:pop             
				return ((StringBuilder) (obj)).toString();
	//  161  341:aload_3         
	//  162  342:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  163  345:areturn         
			}
		}
		return s;
	//  164  346:aload_1         
	//  165  347:areturn         
	}

	public void a()
	{
		d.a(((af.b) (e)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field u d>
	//    2    4:aload_0         
	//    3    5:getfield        #69  <Field k e>
	//    4    8:invokevirtual   #234 <Method void u.a(af$b)>
		d.a(((af.b) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #57  <Field u d>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #234 <Method void u.a(af$b)>
	//    9   19:return          
	}

	public void a(VideoProgressUpdate videoprogressupdate)
	{
		a(aa.c.timeupdate, ((Object) (videoprogressupdate)));
	//    0    0:aload_0         
	//    1    1:getstatic       #241 <Field aa$c aa$c.timeupdate>
	//    2    4:aload_1         
	//    3    5:invokespecial   #243 <Method void a(aa$c, Object)>
	//    4    8:return          
	}

	public void a(b b1)
	{
		e.a(b1);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field k e>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #246 <Method void k.a(b)>
	//    4    8:return          
	}

	public boolean a(aa.c c1, l l1)
	{
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[aa.c.values().length];
			//    0    0:invokestatic    #18  <Method aa$c[] aa$c.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[aa.c.loadStream.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field aa$c aa$c.loadStream>
			//    6   15:invokevirtual   #28  <Method int aa$c.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
			//    9   20:return          
				}
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   21:astore_0        
			//*  11   22:return          
			}
		}

		if(_cls1.a[c1.ordinal()] != 1)
	//*   0    0:getstatic       #250 <Field int[] ak$1.a>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #253 <Method int aa$c.ordinal()>
	//*   3    7:iaload          
	//*   4    8:iconst_1        
	//*   5    9:icmpeq          14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		if(l1 != null && l1.streamUrl != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          57
	//*  10   18:aload_2         
	//*  11   19:getfield        #258 <Field String l.streamUrl>
	//*  12   22:ifnull          57
		{
			d.b();
	//   13   25:aload_0         
	//   14   26:getfield        #57  <Field u d>
	//   15   29:invokevirtual   #260 <Method void com.google.ads.interactivemedia.v3.impl.u.b()>
			c1 = ((aa.c) (a(l1.streamUrl)));
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:getfield        #258 <Field String l.streamUrl>
	//   19   37:invokevirtual   #262 <Method String a(String)>
	//   20   40:astore_1        
			a.loadUrl(((String) (c1)), l1.subtitles);
	//   21   41:aload_0         
	//   22   42:getfield        #47  <Field VideoStreamPlayer a>
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:getfield        #266 <Field List l.subtitles>
	//   26   50:invokeinterface #272 <Method void VideoStreamPlayer.loadUrl(String, List)>
			return true;
	//   27   55:iconst_1        
	//   28   56:ireturn         
		} else
		{
			c.a(((AdErrorEvent) (new c(new AdError(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType.LOAD, com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")))));
	//   29   57:aload_0         
	//   30   58:getfield        #49  <Field ai c>
	//   31   61:new             #274 <Class c>
	//   32   64:dup             
	//   33   65:new             #31  <Class AdError>
	//   34   68:dup             
	//   35   69:getstatic       #89  <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorType com.google.ads.interactivemedia.v3.api.AdError$AdErrorType.LOAD>
	//   36   72:getstatic       #277 <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode.INTERNAL_ERROR>
	//   37   75:ldc2            #279 <String "Load message must contain video url.">
	//   38   78:invokespecial   #100 <Method void AdError(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode, String)>
	//   39   81:invokespecial   #282 <Method void c(AdError)>
	//   40   84:invokevirtual   #287 <Method void ai.a(AdErrorEvent)>
			return true;
	//   41   87:iconst_1        
	//   42   88:ireturn         
		}
	}

	public void b()
	{
		e.a();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field k e>
	//    2    4:invokevirtual   #289 <Method void k.a()>
	//    3    7:return          
	}

	public boolean b(aa.c c1, l l1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void c()
	{
		a.onAdBreakStarted();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field VideoStreamPlayer a>
	//    2    4:invokeinterface #292 <Method void VideoStreamPlayer.onAdBreakStarted()>
	//    3    9:return          
	}

	public void d()
	{
		a.onAdBreakEnded();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field VideoStreamPlayer a>
	//    2    4:invokeinterface #295 <Method void VideoStreamPlayer.onAdBreakEnded()>
	//    3    9:return          
	}

	public void e()
	{
		Log.d("SDK_DEBUG", "Destroying StreamVideoDisplay");
	//    0    0:ldc2            #297 <String "SDK_DEBUG">
	//    1    3:ldc2            #299 <String "Destroying StreamVideoDisplay">
	//    2    6:invokestatic    #302 <Method int Log.d(String, String)>
	//    3    9:pop             
		h();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #305 <Method void h()>
		a = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #47  <Field VideoStreamPlayer a>
		b = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #53  <Field ab b>
		u u1 = d;
	//   12   24:aload_0         
	//   13   25:getfield        #57  <Field u d>
	//   14   28:astore_1        
		if(u1 != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          49
		{
			u1.b(((af.b) (e)));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #69  <Field k e>
	//   20   38:invokevirtual   #307 <Method void com.google.ads.interactivemedia.v3.impl.u.b(af$b)>
			d.b(((af.b) (this)));
	//   21   41:aload_0         
	//   22   42:getfield        #57  <Field u d>
	//   23   45:aload_0         
	//   24   46:invokevirtual   #307 <Method void com.google.ads.interactivemedia.v3.impl.u.b(af$b)>
		}
		d = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #57  <Field u d>
		e = null;
	//   28   54:aload_0         
	//   29   55:aconst_null     
	//   30   56:putfield        #69  <Field k e>
	//   31   59:return          
	}

	public boolean f()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void g()
	{
		a.addCallback(((com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field VideoStreamPlayer a>
	//    2    4:aload_0         
	//    3    5:invokeinterface #311 <Method void VideoStreamPlayer.addCallback(com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer$VideoStreamPlayerCallback)>
	//    4   10:return          
	}

	public VideoProgressUpdate getAdProgress()
	{
		return a.getContentProgress();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field VideoStreamPlayer a>
	//    2    4:invokeinterface #316 <Method VideoProgressUpdate VideoStreamPlayer.getContentProgress()>
	//    3    9:areturn         
	}

	public void h()
	{
		a.removeCallback(((com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field VideoStreamPlayer a>
	//    2    4:aload_0         
	//    3    5:invokeinterface #319 <Method void VideoStreamPlayer.removeCallback(com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer$VideoStreamPlayerCallback)>
	//    4   10:return          
	}

	public void onAdError(AdErrorEvent aderrorevent)
	{
	//    0    0:return          
	}

	public void onUserTextReceived(String s)
	{
		a(aa.c.timedMetadata, ((Object) (a.create(s))));
	//    0    0:aload_0         
	//    1    1:getstatic       #324 <Field aa$c aa$c.timedMetadata>
	//    2    4:aload_1         
	//    3    5:invokestatic    #328 <Method ak$a ak$a.create(String)>
	//    4    8:invokespecial   #243 <Method void a(aa$c, Object)>
	//    5   11:return          
	}

	private VideoStreamPlayer a;
	private ab b;
	private final ai c;
	private u d;
	private k e;
	private String f;
	private String g;
}
