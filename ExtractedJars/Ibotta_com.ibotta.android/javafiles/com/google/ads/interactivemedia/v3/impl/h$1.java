// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.*;
import java.util.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			h, c, w, j, 
//			ai, i, ad

class h$1
	implements 
{

	public void a(String s, com.google.ads.interactivemedia.v3.api.ror.AdErrorType aderrortype, int k, String s1)
	{
		if(h.a(a).get(((Object) (s))) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field h a>
	//*   2    4:invokestatic    #22  <Method Map h.a(h)>
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #28  <Method Object Map.get(Object)>
	//*   5   13:ifnull          41
			s = ((String) (((AdsRequest)h.a(a).get(((Object) (s)))).getUserRequestContext()));
	//    6   16:aload_0         
	//    7   17:getfield        #14  <Field h a>
	//    8   20:invokestatic    #22  <Method Map h.a(h)>
	//    9   23:aload_1         
	//   10   24:invokeinterface #28  <Method Object Map.get(Object)>
	//   11   29:checkcast       #30  <Class AdsRequest>
	//   12   32:invokeinterface #34  <Method Object AdsRequest.getUserRequestContext()>
	//   13   37:astore_1        
		else
	//*  14   38:goto            63
			s = ((String) (((StreamRequest)h.e(a).get(((Object) (s)))).getUserRequestContext()));
	//   15   41:aload_0         
	//   16   42:getfield        #14  <Field h a>
	//   17   45:invokestatic    #37  <Method Map h.e(h)>
	//   18   48:aload_1         
	//   19   49:invokeinterface #28  <Method Object Map.get(Object)>
	//   20   54:checkcast       #39  <Class StreamRequest>
	//   21   57:invokeinterface #40  <Method Object StreamRequest.getUserRequestContext()>
	//   22   62:astore_1        
		s = ((String) (new c(new AdError(aderrortype, k, s1), ((Object) (s)))));
	//   23   63:new             #42  <Class c>
	//   24   66:dup             
	//   25   67:new             #44  <Class AdError>
	//   26   70:dup             
	//   27   71:aload_2         
	//   28   72:iload_3         
	//   29   73:aload           4
	//   30   75:invokespecial   #47  <Method void AdError(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, int, String)>
	//   31   78:aload_1         
	//   32   79:invokespecial   #50  <Method void c(AdError, Object)>
	//   33   82:astore_1        
		h.d(a).a(((com.google.ads.interactivemedia.v3.api.AdErrorEvent) (s)));
	//   34   83:aload_0         
	//   35   84:getfield        #14  <Field h a>
	//   36   87:invokestatic    #54  <Method w h.d(h)>
	//   37   90:aload_1         
	//   38   91:invokevirtual   #59  <Method void w.a(com.google.ads.interactivemedia.v3.api.AdErrorEvent)>
	//   39   94:return          
	}

	public void a(String s, com.google.ads.interactivemedia.v3.api.ror.AdErrorType aderrortype, com.google.ads.interactivemedia.v3.api.ror.AdErrorCode aderrorcode, String s1)
	{
		if(h.a(a).get(((Object) (s))) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field h a>
	//*   2    4:invokestatic    #22  <Method Map h.a(h)>
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #28  <Method Object Map.get(Object)>
	//*   5   13:ifnull          41
			s = ((String) (((AdsRequest)h.a(a).get(((Object) (s)))).getUserRequestContext()));
	//    6   16:aload_0         
	//    7   17:getfield        #14  <Field h a>
	//    8   20:invokestatic    #22  <Method Map h.a(h)>
	//    9   23:aload_1         
	//   10   24:invokeinterface #28  <Method Object Map.get(Object)>
	//   11   29:checkcast       #30  <Class AdsRequest>
	//   12   32:invokeinterface #34  <Method Object AdsRequest.getUserRequestContext()>
	//   13   37:astore_1        
		else
	//*  14   38:goto            63
			s = ((String) (((StreamRequest)h.e(a).get(((Object) (s)))).getUserRequestContext()));
	//   15   41:aload_0         
	//   16   42:getfield        #14  <Field h a>
	//   17   45:invokestatic    #37  <Method Map h.e(h)>
	//   18   48:aload_1         
	//   19   49:invokeinterface #28  <Method Object Map.get(Object)>
	//   20   54:checkcast       #39  <Class StreamRequest>
	//   21   57:invokeinterface #40  <Method Object StreamRequest.getUserRequestContext()>
	//   22   62:astore_1        
		s = ((String) (new c(new AdError(aderrortype, aderrorcode, s1), ((Object) (s)))));
	//   23   63:new             #42  <Class c>
	//   24   66:dup             
	//   25   67:new             #44  <Class AdError>
	//   26   70:dup             
	//   27   71:aload_2         
	//   28   72:aload_3         
	//   29   73:aload           4
	//   30   75:invokespecial   #63  <Method void AdError(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode, String)>
	//   31   78:aload_1         
	//   32   79:invokespecial   #50  <Method void c(AdError, Object)>
	//   33   82:astore_1        
		h.d(a).a(((com.google.ads.interactivemedia.v3.api.AdErrorEvent) (s)));
	//   34   83:aload_0         
	//   35   84:getfield        #14  <Field h a>
	//   36   87:invokestatic    #54  <Method w h.d(h)>
	//   37   90:aload_1         
	//   38   91:invokevirtual   #59  <Method void w.a(com.google.ads.interactivemedia.v3.api.AdErrorEvent)>
	//   39   94:return          
	}

	public void a(String s, ad ad, String s1, boolean flag)
	{
		StreamRequest streamrequest = (StreamRequest)h.e(a).get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokestatic    #37  <Method Map h.e(h)>
	//    3    7:aload_1         
	//    4    8:invokeinterface #28  <Method Object Map.get(Object)>
	//    5   13:checkcast       #39  <Class StreamRequest>
	//    6   16:astore          5
		try
		{
			a.a(((com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent) (new j(((com.google.ads.interactivemedia.v3.api.StreamManager) (new ai(s, h.b(a), ad, streamrequest, h.c(a), s1, flag))), streamrequest.getUserRequestContext()))));
	//    7   18:aload_0         
	//    8   19:getfield        #14  <Field h a>
	//    9   22:new             #66  <Class j>
	//   10   25:dup             
	//   11   26:new             #68  <Class ai>
	//   12   29:dup             
	//   13   30:aload_1         
	//   14   31:aload_0         
	//   15   32:getfield        #14  <Field h a>
	//   16   35:invokestatic    #72  <Method ab h.b(h)>
	//   17   38:aload_2         
	//   18   39:aload           5
	//   19   41:aload_0         
	//   20   42:getfield        #14  <Field h a>
	//   21   45:invokestatic    #76  <Method android.content.Context h.c(h)>
	//   22   48:aload_3         
	//   23   49:iload           4
	//   24   51:invokespecial   #79  <Method void ai(String, ab, ad, StreamRequest, android.content.Context, String, boolean)>
	//   25   54:aload           5
	//   26   56:invokeinterface #40  <Method Object StreamRequest.getUserRequestContext()>
	//   27   61:invokespecial   #82  <Method void j(com.google.ads.interactivemedia.v3.api.StreamManager, Object)>
	//   28   64:invokevirtual   #85  <Method void h.a(com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent)>
			return;
	//   29   67:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  30   68:astore_1        
		{
			h.d(a).a(((com.google.ads.interactivemedia.v3.api.AdErrorEvent) (new c(((AdError) (s)), streamrequest.getUserRequestContext()))));
	//   31   69:aload_0         
	//   32   70:getfield        #14  <Field h a>
	//   33   73:invokestatic    #54  <Method w h.d(h)>
	//   34   76:new             #42  <Class c>
	//   35   79:dup             
	//   36   80:aload_1         
	//   37   81:aload           5
	//   38   83:invokeinterface #40  <Method Object StreamRequest.getUserRequestContext()>
	//   39   88:invokespecial   #50  <Method void c(AdError, Object)>
	//   40   91:invokevirtual   #59  <Method void w.a(com.google.ads.interactivemedia.v3.api.AdErrorEvent)>
		}
	//   41   94:return          
	}

	public void a(String s, ad ad, List list, SortedSet sortedset, boolean flag)
	{
		AdsRequest adsrequest = (AdsRequest)h.a(a).get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokestatic    #22  <Method Map h.a(h)>
	//    3    7:aload_1         
	//    4    8:invokeinterface #28  <Method Object Map.get(Object)>
	//    5   13:checkcast       #30  <Class AdsRequest>
	//    6   16:astore          6
		try
		{
			a.a(((com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent) (new j(((com.google.ads.interactivemedia.v3.api.AdsManager) (new i(s, h.b(a), ad, ((com.google.ads.interactivemedia.v3.api.BaseDisplayContainer) (adsrequest.getAdDisplayContainer())), adsrequest.getContentProgressProvider(), list, sortedset, h.c(a), flag))), adsrequest.getUserRequestContext()))));
	//    7   18:aload_0         
	//    8   19:getfield        #14  <Field h a>
	//    9   22:new             #66  <Class j>
	//   10   25:dup             
	//   11   26:new             #88  <Class i>
	//   12   29:dup             
	//   13   30:aload_1         
	//   14   31:aload_0         
	//   15   32:getfield        #14  <Field h a>
	//   16   35:invokestatic    #72  <Method ab h.b(h)>
	//   17   38:aload_2         
	//   18   39:aload           6
	//   19   41:invokeinterface #92  <Method com.google.ads.interactivemedia.v3.api.AdDisplayContainer AdsRequest.getAdDisplayContainer()>
	//   20   46:aload           6
	//   21   48:invokeinterface #96  <Method com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider AdsRequest.getContentProgressProvider()>
	//   22   53:aload_3         
	//   23   54:aload           4
	//   24   56:aload_0         
	//   25   57:getfield        #14  <Field h a>
	//   26   60:invokestatic    #76  <Method android.content.Context h.c(h)>
	//   27   63:iload           5
	//   28   65:invokespecial   #99  <Method void i(String, ab, ad, com.google.ads.interactivemedia.v3.api.BaseDisplayContainer, com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider, List, SortedSet, android.content.Context, boolean)>
	//   29   68:aload           6
	//   30   70:invokeinterface #34  <Method Object AdsRequest.getUserRequestContext()>
	//   31   75:invokespecial   #102 <Method void j(com.google.ads.interactivemedia.v3.api.AdsManager, Object)>
	//   32   78:invokevirtual   #85  <Method void h.a(com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent)>
			return;
	//   33   81:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  34   82:astore_1        
		{
			h.d(a).a(((com.google.ads.interactivemedia.v3.api.AdErrorEvent) (new c(((AdError) (s)), adsrequest.getUserRequestContext()))));
	//   35   83:aload_0         
	//   36   84:getfield        #14  <Field h a>
	//   37   87:invokestatic    #54  <Method w h.d(h)>
	//   38   90:new             #42  <Class c>
	//   39   93:dup             
	//   40   94:aload_1         
	//   41   95:aload           6
	//   42   97:invokeinterface #34  <Method Object AdsRequest.getUserRequestContext()>
	//   43  102:invokespecial   #50  <Method void c(AdError, Object)>
	//   44  105:invokevirtual   #59  <Method void w.a(com.google.ads.interactivemedia.v3.api.AdErrorEvent)>
		}
	//   45  108:return          
	}

	final h a;

	h$1(h h1)
	{
		a = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field h a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
