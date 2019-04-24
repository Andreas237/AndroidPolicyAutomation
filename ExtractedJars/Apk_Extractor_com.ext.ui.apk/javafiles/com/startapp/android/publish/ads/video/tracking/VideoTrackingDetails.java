// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video.tracking;

import com.startapp.android.publish.ads.video.c.a.a.c;
import com.startapp.android.publish.ads.video.c.a.b;
import com.startapp.android.publish.ads.video.c.a.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.startapp.android.publish.ads.video.tracking:
//			FractionTrackingLink, AbsoluteTrackingLink, ActionTrackingLink, VideoTrackingLink

public class VideoTrackingDetails
	implements Serializable
{

	public VideoTrackingDetails()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:return          
	}

	public VideoTrackingDetails(e e1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		if(e1 != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          295
		{
			HashMap hashmap = e1.a();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #45  <Method HashMap e.a()>
	//    6   12:astore_2        
			ArrayList arraylist = new ArrayList();
	//    7   13:new             #47  <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #48  <Method void ArrayList()>
	//   10   20:astore_3        
			addFractionUrls((List)hashmap.get(((Object) (b.k))), 0, ((List) (arraylist)));
	//   11   21:aload_2         
	//   12   22:getstatic       #54  <Field b b.k>
	//   13   25:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   14   28:checkcast       #62  <Class List>
	//   15   31:iconst_0        
	//   16   32:aload_3         
	//   17   33:invokestatic    #66  <Method void addFractionUrls(List, int, List)>
			addFractionUrls((List)hashmap.get(((Object) (b.l))), 25, ((List) (arraylist)));
	//   18   36:aload_2         
	//   19   37:getstatic       #69  <Field b b.l>
	//   20   40:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   21   43:checkcast       #62  <Class List>
	//   22   46:bipush          25
	//   23   48:aload_3         
	//   24   49:invokestatic    #66  <Method void addFractionUrls(List, int, List)>
			addFractionUrls((List)hashmap.get(((Object) (b.m))), 50, ((List) (arraylist)));
	//   25   52:aload_2         
	//   26   53:getstatic       #72  <Field b b.m>
	//   27   56:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   28   59:checkcast       #62  <Class List>
	//   29   62:bipush          50
	//   30   64:aload_3         
	//   31   65:invokestatic    #66  <Method void addFractionUrls(List, int, List)>
			addFractionUrls((List)hashmap.get(((Object) (b.n))), 75, ((List) (arraylist)));
	//   32   68:aload_2         
	//   33   69:getstatic       #75  <Field b b.n>
	//   34   72:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   35   75:checkcast       #62  <Class List>
	//   36   78:bipush          75
	//   37   80:aload_3         
	//   38   81:invokestatic    #66  <Method void addFractionUrls(List, int, List)>
			addFractionUrls((List)hashmap.get(((Object) (b.o))), 100, ((List) (arraylist)));
	//   39   84:aload_2         
	//   40   85:getstatic       #78  <Field b b.o>
	//   41   88:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   42   91:checkcast       #62  <Class List>
	//   43   94:bipush          100
	//   44   96:aload_3         
	//   45   97:invokestatic    #66  <Method void addFractionUrls(List, int, List)>
			fractionTrackingUrls = (FractionTrackingLink[])((List) (arraylist)).toArray(((Object []) (new FractionTrackingLink[((List) (arraylist)).size()])));
	//   46  100:aload_0         
	//   47  101:aload_3         
	//   48  102:aload_3         
	//   49  103:invokeinterface #82  <Method int List.size()>
	//   50  108:anewarray       FractionTrackingLink[]
	//   51  111:invokeinterface #88  <Method Object[] List.toArray(Object[])>
	//   52  116:checkcast       #89  <Class FractionTrackingLink[]>
	//   53  119:putfield        #91  <Field FractionTrackingLink[] fractionTrackingUrls>
			impressionUrls = urlToTrackingList(e1.d());
	//   54  122:aload_0         
	//   55  123:aload_1         
	//   56  124:invokevirtual   #95  <Method List e.d()>
	//   57  127:invokestatic    #99  <Method ActionTrackingLink[] urlToTrackingList(List)>
	//   58  130:putfield        #101 <Field ActionTrackingLink[] impressionUrls>
			soundMuteUrls = trackingToTrackingList((List)hashmap.get(((Object) (b.a))));
	//   59  133:aload_0         
	//   60  134:aload_2         
	//   61  135:getstatic       #103 <Field b b.a>
	//   62  138:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   63  141:checkcast       #62  <Class List>
	//   64  144:invokestatic    #106 <Method ActionTrackingLink[] trackingToTrackingList(List)>
	//   65  147:putfield        #108 <Field ActionTrackingLink[] soundMuteUrls>
			soundUnmuteUrls = trackingToTrackingList((List)hashmap.get(((Object) (b.b))));
	//   66  150:aload_0         
	//   67  151:aload_2         
	//   68  152:getstatic       #110 <Field b b.b>
	//   69  155:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   70  158:checkcast       #62  <Class List>
	//   71  161:invokestatic    #106 <Method ActionTrackingLink[] trackingToTrackingList(List)>
	//   72  164:putfield        #112 <Field ActionTrackingLink[] soundUnmuteUrls>
			videoPausedUrls = trackingToTrackingList((List)hashmap.get(((Object) (b.c))));
	//   73  167:aload_0         
	//   74  168:aload_2         
	//   75  169:getstatic       #115 <Field b b.c>
	//   76  172:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   77  175:checkcast       #62  <Class List>
	//   78  178:invokestatic    #106 <Method ActionTrackingLink[] trackingToTrackingList(List)>
	//   79  181:putfield        #117 <Field ActionTrackingLink[] videoPausedUrls>
			videoResumedUrls = trackingToTrackingList((List)hashmap.get(((Object) (b.d))));
	//   80  184:aload_0         
	//   81  185:aload_2         
	//   82  186:getstatic       #119 <Field b b.d>
	//   83  189:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   84  192:checkcast       #62  <Class List>
	//   85  195:invokestatic    #106 <Method ActionTrackingLink[] trackingToTrackingList(List)>
	//   86  198:putfield        #121 <Field ActionTrackingLink[] videoResumedUrls>
			videoSkippedUrls = trackingToTrackingList((List)hashmap.get(((Object) (b.f))));
	//   87  201:aload_0         
	//   88  202:aload_2         
	//   89  203:getstatic       #124 <Field b b.f>
	//   90  206:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   91  209:checkcast       #62  <Class List>
	//   92  212:invokestatic    #106 <Method ActionTrackingLink[] trackingToTrackingList(List)>
	//   93  215:putfield        #126 <Field ActionTrackingLink[] videoSkippedUrls>
			videoPausedUrls = trackingToTrackingList((List)hashmap.get(((Object) (b.c))));
	//   94  218:aload_0         
	//   95  219:aload_2         
	//   96  220:getstatic       #115 <Field b b.c>
	//   97  223:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   98  226:checkcast       #62  <Class List>
	//   99  229:invokestatic    #106 <Method ActionTrackingLink[] trackingToTrackingList(List)>
	//  100  232:putfield        #117 <Field ActionTrackingLink[] videoPausedUrls>
			videoClosedUrls = trackingToTrackingList((List)hashmap.get(((Object) (b.y))));
	//  101  235:aload_0         
	//  102  236:aload_2         
	//  103  237:getstatic       #129 <Field b b.y>
	//  104  240:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//  105  243:checkcast       #62  <Class List>
	//  106  246:invokestatic    #106 <Method ActionTrackingLink[] trackingToTrackingList(List)>
	//  107  249:putfield        #131 <Field ActionTrackingLink[] videoClosedUrls>
			inlineErrorTrackingUrls = urlToTrackingList(e1.e());
	//  108  252:aload_0         
	//  109  253:aload_1         
	//  110  254:invokevirtual   #134 <Method List e.e()>
	//  111  257:invokestatic    #99  <Method ActionTrackingLink[] urlToTrackingList(List)>
	//  112  260:putfield        #136 <Field ActionTrackingLink[] inlineErrorTrackingUrls>
			videoClickTrackingUrls = urlToTrackingList(e1.c().b());
	//  113  263:aload_0         
	//  114  264:aload_1         
	//  115  265:invokevirtual   #139 <Method com.startapp.android.publish.ads.video.c.a.a.e e.c()>
	//  116  268:invokevirtual   #143 <Method List com.startapp.android.publish.ads.video.c.a.a.e.b()>
	//  117  271:invokestatic    #99  <Method ActionTrackingLink[] urlToTrackingList(List)>
	//  118  274:putfield        #145 <Field ActionTrackingLink[] videoClickTrackingUrls>
			absoluteTrackingUrls = toAbsoluteTrackingList((List)hashmap.get(((Object) (b.s))));
	//  119  277:aload_0         
	//  120  278:aload_0         
	//  121  279:aload_2         
	//  122  280:getstatic       #148 <Field b b.s>
	//  123  283:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//  124  286:checkcast       #62  <Class List>
	//  125  289:invokespecial   #152 <Method AbsoluteTrackingLink[] toAbsoluteTrackingList(List)>
	//  126  292:putfield        #154 <Field AbsoluteTrackingLink[] absoluteTrackingUrls>
		}
	//  127  295:return          
	}

	private static void addFractionUrls(List list, int i, List list1)
	{
		if(list != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          66
		{
			FractionTrackingLink fractiontrackinglink;
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); list1.add(((Object) (fractiontrackinglink))))
	//*   2    4:aload_0         
	//*   3    5:invokeinterface #158 <Method Iterator List.iterator()>
	//*   4   10:astore_0        
	//*   5   11:aload_0         
	//*   6   12:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//*   7   17:ifeq            66
			{
				c c1 = (c)((Iterator) (list)).next();
	//    8   20:aload_0         
	//    9   21:invokeinterface #168 <Method Object Iterator.next()>
	//   10   26:checkcast       #170 <Class c>
	//   11   29:astore_3        
				fractiontrackinglink = new FractionTrackingLink();
	//   12   30:new             #84  <Class FractionTrackingLink>
	//   13   33:dup             
	//   14   34:invokespecial   #171 <Method void FractionTrackingLink()>
	//   15   37:astore          4
				fractiontrackinglink.setTrackingUrl(c1.a());
	//   16   39:aload           4
	//   17   41:aload_3         
	//   18   42:invokevirtual   #174 <Method String c.a()>
	//   19   45:invokevirtual   #178 <Method void FractionTrackingLink.setTrackingUrl(String)>
				fractiontrackinglink.setFraction(i);
	//   20   48:aload           4
	//   21   50:iload_1         
	//   22   51:invokevirtual   #182 <Method void FractionTrackingLink.setFraction(int)>
			}

	//   23   54:aload_2         
	//   24   55:aload           4
	//   25   57:invokeinterface #186 <Method boolean List.add(Object)>
	//   26   62:pop             
		}
	//*  27   63:goto            11
	//   28   66:return          
	}

	private String printTrackingLinks(VideoTrackingLink avideotrackinglink[])
	{
		if(avideotrackinglink != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			return Arrays.toString(((Object []) (avideotrackinglink)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #196 <Method String Arrays.toString(Object[])>
	//    4    8:areturn         
		else
			return "";
	//    5    9:ldc1            #198 <String "">
	//    6   11:areturn         
	}

	private AbsoluteTrackingLink[] toAbsoluteTrackingList(List list)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          110
		{
			ArrayList arraylist = new ArrayList(list.size());
	//    2    4:new             #47  <Class ArrayList>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokeinterface #82  <Method int List.size()>
	//    6   14:invokespecial   #200 <Method void ArrayList(int)>
	//    7   17:astore_2        
			AbsoluteTrackingLink absolutetrackinglink;
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (absolutetrackinglink))))
	//*   8   18:aload_1         
	//*   9   19:invokeinterface #158 <Method Iterator List.iterator()>
	//*  10   24:astore_1        
	//*  11   25:aload_1         
	//*  12   26:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//*  13   31:ifeq            91
			{
				c c1 = (c)((Iterator) (list)).next();
	//   14   34:aload_1         
	//   15   35:invokeinterface #168 <Method Object Iterator.next()>
	//   16   40:checkcast       #170 <Class c>
	//   17   43:astore_3        
				absolutetrackinglink = new AbsoluteTrackingLink();
	//   18   44:new             #202 <Class AbsoluteTrackingLink>
	//   19   47:dup             
	//   20   48:invokespecial   #203 <Method void AbsoluteTrackingLink()>
	//   21   51:astore          4
				absolutetrackinglink.setTrackingUrl(c1.a());
	//   22   53:aload           4
	//   23   55:aload_3         
	//   24   56:invokevirtual   #174 <Method String c.a()>
	//   25   59:invokevirtual   #204 <Method void AbsoluteTrackingLink.setTrackingUrl(String)>
				if(c1.b() != -1)
	//*  26   62:aload_3         
	//*  27   63:invokevirtual   #206 <Method int c.b()>
	//*  28   66:iconst_m1       
	//*  29   67:icmpeq          79
					absolutetrackinglink.setVideoOffsetMillis(c1.b());
	//   30   70:aload           4
	//   31   72:aload_3         
	//   32   73:invokevirtual   #206 <Method int c.b()>
	//   33   76:invokevirtual   #209 <Method void AbsoluteTrackingLink.setVideoOffsetMillis(int)>
			}

	//   34   79:aload_2         
	//   35   80:aload           4
	//   36   82:invokeinterface #186 <Method boolean List.add(Object)>
	//   37   87:pop             
	//*  38   88:goto            25
			return (AbsoluteTrackingLink[])((List) (arraylist)).toArray(((Object []) (new AbsoluteTrackingLink[((List) (arraylist)).size()])));
	//   39   91:aload_2         
	//   40   92:aload_2         
	//   41   93:invokeinterface #82  <Method int List.size()>
	//   42   98:anewarray       AbsoluteTrackingLink[]
	//   43  101:invokeinterface #88  <Method Object[] List.toArray(Object[])>
	//   44  106:checkcast       #210 <Class AbsoluteTrackingLink[]>
	//   45  109:areturn         
		} else
		{
			return new AbsoluteTrackingLink[0];
	//   46  110:iconst_0        
	//   47  111:anewarray       AbsoluteTrackingLink[]
	//   48  114:areturn         
		}
	}

	private static ActionTrackingLink[] trackingToTrackingList(List list)
	{
		if(list != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          90
		{
			ArrayList arraylist = new ArrayList(list.size());
	//    2    4:new             #47  <Class ArrayList>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokeinterface #82  <Method int List.size()>
	//    6   14:invokespecial   #200 <Method void ArrayList(int)>
	//    7   17:astore_1        
			ActionTrackingLink actiontrackinglink;
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (actiontrackinglink))))
	//*   8   18:aload_0         
	//*   9   19:invokeinterface #158 <Method Iterator List.iterator()>
	//*  10   24:astore_0        
	//*  11   25:aload_0         
	//*  12   26:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//*  13   31:ifeq            71
			{
				c c1 = (c)((Iterator) (list)).next();
	//   14   34:aload_0         
	//   15   35:invokeinterface #168 <Method Object Iterator.next()>
	//   16   40:checkcast       #170 <Class c>
	//   17   43:astore_2        
				actiontrackinglink = new ActionTrackingLink();
	//   18   44:new             #213 <Class ActionTrackingLink>
	//   19   47:dup             
	//   20   48:invokespecial   #214 <Method void ActionTrackingLink()>
	//   21   51:astore_3        
				actiontrackinglink.setTrackingUrl(c1.a());
	//   22   52:aload_3         
	//   23   53:aload_2         
	//   24   54:invokevirtual   #174 <Method String c.a()>
	//   25   57:invokevirtual   #215 <Method void ActionTrackingLink.setTrackingUrl(String)>
			}

	//   26   60:aload_1         
	//   27   61:aload_3         
	//   28   62:invokeinterface #186 <Method boolean List.add(Object)>
	//   29   67:pop             
	//*  30   68:goto            25
			return (ActionTrackingLink[])((List) (arraylist)).toArray(((Object []) (new ActionTrackingLink[((List) (arraylist)).size()])));
	//   31   71:aload_1         
	//   32   72:aload_1         
	//   33   73:invokeinterface #82  <Method int List.size()>
	//   34   78:anewarray       ActionTrackingLink[]
	//   35   81:invokeinterface #88  <Method Object[] List.toArray(Object[])>
	//   36   86:checkcast       #216 <Class ActionTrackingLink[]>
	//   37   89:areturn         
		} else
		{
			return new ActionTrackingLink[0];
	//   38   90:iconst_0        
	//   39   91:anewarray       ActionTrackingLink[]
	//   40   94:areturn         
		}
	}

	private static ActionTrackingLink[] urlToTrackingList(List list)
	{
		if(list != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          87
		{
			ArrayList arraylist = new ArrayList(list.size());
	//    2    4:new             #47  <Class ArrayList>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokeinterface #82  <Method int List.size()>
	//    6   14:invokespecial   #200 <Method void ArrayList(int)>
	//    7   17:astore_1        
			ActionTrackingLink actiontrackinglink;
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (actiontrackinglink))))
	//*   8   18:aload_0         
	//*   9   19:invokeinterface #158 <Method Iterator List.iterator()>
	//*  10   24:astore_0        
	//*  11   25:aload_0         
	//*  12   26:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//*  13   31:ifeq            68
			{
				String s = (String)((Iterator) (list)).next();
	//   14   34:aload_0         
	//   15   35:invokeinterface #168 <Method Object Iterator.next()>
	//   16   40:checkcast       #219 <Class String>
	//   17   43:astore_2        
				actiontrackinglink = new ActionTrackingLink();
	//   18   44:new             #213 <Class ActionTrackingLink>
	//   19   47:dup             
	//   20   48:invokespecial   #214 <Method void ActionTrackingLink()>
	//   21   51:astore_3        
				actiontrackinglink.setTrackingUrl(s);
	//   22   52:aload_3         
	//   23   53:aload_2         
	//   24   54:invokevirtual   #215 <Method void ActionTrackingLink.setTrackingUrl(String)>
			}

	//   25   57:aload_1         
	//   26   58:aload_3         
	//   27   59:invokeinterface #186 <Method boolean List.add(Object)>
	//   28   64:pop             
	//*  29   65:goto            25
			return (ActionTrackingLink[])((List) (arraylist)).toArray(((Object []) (new ActionTrackingLink[((List) (arraylist)).size()])));
	//   30   68:aload_1         
	//   31   69:aload_1         
	//   32   70:invokeinterface #82  <Method int List.size()>
	//   33   75:anewarray       ActionTrackingLink[]
	//   34   78:invokeinterface #88  <Method Object[] List.toArray(Object[])>
	//   35   83:checkcast       #216 <Class ActionTrackingLink[]>
	//   36   86:areturn         
		} else
		{
			return new ActionTrackingLink[0];
	//   37   87:iconst_0        
	//   38   88:anewarray       ActionTrackingLink[]
	//   39   91:areturn         
		}
	}

	public AbsoluteTrackingLink[] getAbsoluteTrackingUrls()
	{
		return absoluteTrackingUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field AbsoluteTrackingLink[] absoluteTrackingUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getCreativeViewUrls()
	{
		return creativeViewUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field ActionTrackingLink[] creativeViewUrls>
	//    2    4:areturn         
	}

	public FractionTrackingLink[] getFractionTrackingUrls()
	{
		return fractionTrackingUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field FractionTrackingLink[] fractionTrackingUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getImpressionUrls()
	{
		return impressionUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field ActionTrackingLink[] impressionUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getInlineErrorTrackingUrls()
	{
		return inlineErrorTrackingUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field ActionTrackingLink[] inlineErrorTrackingUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getSoundMuteUrls()
	{
		return soundMuteUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ActionTrackingLink[] soundMuteUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getSoundUnmuteUrls()
	{
		return soundUnmuteUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field ActionTrackingLink[] soundUnmuteUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getVideoClickTrackingUrls()
	{
		return videoClickTrackingUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field ActionTrackingLink[] videoClickTrackingUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getVideoClosedUrls()
	{
		return videoClosedUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field ActionTrackingLink[] videoClosedUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getVideoPausedUrls()
	{
		return videoPausedUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field ActionTrackingLink[] videoPausedUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getVideoPostRollClosedUrls()
	{
		return videoPostRollClosedUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field ActionTrackingLink[] videoPostRollClosedUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getVideoPostRollImpressionUrls()
	{
		return videoPostRollImpressionUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field ActionTrackingLink[] videoPostRollImpressionUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getVideoResumedUrls()
	{
		return videoResumedUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field ActionTrackingLink[] videoResumedUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getVideoRewardedUrls()
	{
		return videoRewardedUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field ActionTrackingLink[] videoRewardedUrls>
	//    2    4:areturn         
	}

	public ActionTrackingLink[] getVideoSkippedUrls()
	{
		return videoSkippedUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field ActionTrackingLink[] videoSkippedUrls>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("VideoTrackingDetails [fractionTrackingUrls=").append(printTrackingLinks(((VideoTrackingLink []) (fractionTrackingUrls)))).append(", absoluteTrackingUrls=").append(printTrackingLinks(((VideoTrackingLink []) (absoluteTrackingUrls)))).append(", impressionUrls=").append(printTrackingLinks(((VideoTrackingLink []) (impressionUrls)))).append(", creativeViewUrls=").append(printTrackingLinks(((VideoTrackingLink []) (creativeViewUrls)))).append(", soundMuteUrls=").append(printTrackingLinks(((VideoTrackingLink []) (soundMuteUrls)))).append(", soundUnmuteUrls=").append(printTrackingLinks(((VideoTrackingLink []) (soundUnmuteUrls)))).append(", videoPausedUrls=").append(printTrackingLinks(((VideoTrackingLink []) (videoPausedUrls)))).append(", videoResumedUrls=").append(printTrackingLinks(((VideoTrackingLink []) (videoResumedUrls)))).append(", videoSkippedUrls=").append(printTrackingLinks(((VideoTrackingLink []) (videoSkippedUrls)))).append(", videoClosedUrls=").append(printTrackingLinks(((VideoTrackingLink []) (videoClosedUrls)))).append(", videoPostRollImpressionUrls=").append(printTrackingLinks(((VideoTrackingLink []) (videoPostRollImpressionUrls)))).append(", videoPostRollClosedUrls=").append(printTrackingLinks(((VideoTrackingLink []) (videoPostRollClosedUrls)))).append(", videoRewardedUrls=").append(printTrackingLinks(((VideoTrackingLink []) (videoRewardedUrls)))).append(", videoClickTrackingUrls=").append(printTrackingLinks(((VideoTrackingLink []) (videoClickTrackingUrls)))).append(", inlineErrorTrackingUrls=").append(printTrackingLinks(((VideoTrackingLink []) (inlineErrorTrackingUrls)))).append("]").toString();
	//    0    0:new             #248 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #249 <Method void StringBuilder()>
	//    3    7:ldc1            #251 <String "VideoTrackingDetails [fractionTrackingUrls=">
	//    4    9:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:aload_0         
	//    7   14:getfield        #91  <Field FractionTrackingLink[] fractionTrackingUrls>
	//    8   17:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//    9   20:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:ldc2            #259 <String ", absoluteTrackingUrls=">
	//   11   26:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_0         
	//   13   30:aload_0         
	//   14   31:getfield        #154 <Field AbsoluteTrackingLink[] absoluteTrackingUrls>
	//   15   34:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   16   37:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   17   40:ldc2            #261 <String ", impressionUrls=">
	//   18   43:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   19   46:aload_0         
	//   20   47:aload_0         
	//   21   48:getfield        #101 <Field ActionTrackingLink[] impressionUrls>
	//   22   51:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   23   54:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   24   57:ldc2            #263 <String ", creativeViewUrls=">
	//   25   60:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   26   63:aload_0         
	//   27   64:aload_0         
	//   28   65:getfield        #226 <Field ActionTrackingLink[] creativeViewUrls>
	//   29   68:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   30   71:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   31   74:ldc2            #265 <String ", soundMuteUrls=">
	//   32   77:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   33   80:aload_0         
	//   34   81:aload_0         
	//   35   82:getfield        #108 <Field ActionTrackingLink[] soundMuteUrls>
	//   36   85:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   37   88:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   38   91:ldc2            #267 <String ", soundUnmuteUrls=">
	//   39   94:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   40   97:aload_0         
	//   41   98:aload_0         
	//   42   99:getfield        #112 <Field ActionTrackingLink[] soundUnmuteUrls>
	//   43  102:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   44  105:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   45  108:ldc2            #269 <String ", videoPausedUrls=">
	//   46  111:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   47  114:aload_0         
	//   48  115:aload_0         
	//   49  116:getfield        #117 <Field ActionTrackingLink[] videoPausedUrls>
	//   50  119:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   51  122:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   52  125:ldc2            #271 <String ", videoResumedUrls=">
	//   53  128:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   54  131:aload_0         
	//   55  132:aload_0         
	//   56  133:getfield        #121 <Field ActionTrackingLink[] videoResumedUrls>
	//   57  136:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   58  139:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   59  142:ldc2            #273 <String ", videoSkippedUrls=">
	//   60  145:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   61  148:aload_0         
	//   62  149:aload_0         
	//   63  150:getfield        #126 <Field ActionTrackingLink[] videoSkippedUrls>
	//   64  153:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   65  156:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   66  159:ldc2            #275 <String ", videoClosedUrls=">
	//   67  162:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   68  165:aload_0         
	//   69  166:aload_0         
	//   70  167:getfield        #131 <Field ActionTrackingLink[] videoClosedUrls>
	//   71  170:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   72  173:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   73  176:ldc2            #277 <String ", videoPostRollImpressionUrls=">
	//   74  179:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   75  182:aload_0         
	//   76  183:aload_0         
	//   77  184:getfield        #241 <Field ActionTrackingLink[] videoPostRollImpressionUrls>
	//   78  187:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   79  190:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   80  193:ldc2            #279 <String ", videoPostRollClosedUrls=">
	//   81  196:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   82  199:aload_0         
	//   83  200:aload_0         
	//   84  201:getfield        #238 <Field ActionTrackingLink[] videoPostRollClosedUrls>
	//   85  204:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   86  207:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   87  210:ldc2            #281 <String ", videoRewardedUrls=">
	//   88  213:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   89  216:aload_0         
	//   90  217:aload_0         
	//   91  218:getfield        #245 <Field ActionTrackingLink[] videoRewardedUrls>
	//   92  221:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//   93  224:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   94  227:ldc2            #283 <String ", videoClickTrackingUrls=">
	//   95  230:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   96  233:aload_0         
	//   97  234:aload_0         
	//   98  235:getfield        #145 <Field ActionTrackingLink[] videoClickTrackingUrls>
	//   99  238:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//  100  241:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//  101  244:ldc2            #285 <String ", inlineErrorTrackingUrls=">
	//  102  247:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//  103  250:aload_0         
	//  104  251:aload_0         
	//  105  252:getfield        #136 <Field ActionTrackingLink[] inlineErrorTrackingUrls>
	//  106  255:invokespecial   #257 <Method String printTrackingLinks(VideoTrackingLink[])>
	//  107  258:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//  108  261:ldc2            #287 <String "]">
	//  109  264:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//  110  267:invokevirtual   #289 <Method String StringBuilder.toString()>
	//  111  270:areturn         
	}

	private static final long serialVersionUID = 1L;
	private AbsoluteTrackingLink absoluteTrackingUrls[];
	private ActionTrackingLink creativeViewUrls[];
	private FractionTrackingLink fractionTrackingUrls[];
	private ActionTrackingLink impressionUrls[];
	private ActionTrackingLink inlineErrorTrackingUrls[];
	private ActionTrackingLink soundMuteUrls[];
	private ActionTrackingLink soundUnmuteUrls[];
	private ActionTrackingLink videoClickTrackingUrls[];
	private ActionTrackingLink videoClosedUrls[];
	private ActionTrackingLink videoPausedUrls[];
	private ActionTrackingLink videoPostRollClosedUrls[];
	private ActionTrackingLink videoPostRollImpressionUrls[];
	private ActionTrackingLink videoResumedUrls[];
	private ActionTrackingLink videoRewardedUrls[];
	private ActionTrackingLink videoSkippedUrls[];
}
