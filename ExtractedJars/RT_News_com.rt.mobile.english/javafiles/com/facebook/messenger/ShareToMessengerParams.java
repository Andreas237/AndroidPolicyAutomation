// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.messenger;

import android.net.Uri;
import java.util.*;

// Referenced classes of package com.facebook.messenger:
//			ShareToMessengerParamsBuilder

public class ShareToMessengerParams
{

	ShareToMessengerParams(ShareToMessengerParamsBuilder sharetomessengerparamsbuilder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void Object()>
		uri = sharetomessengerparamsbuilder.getUri();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #77  <Method Uri ShareToMessengerParamsBuilder.getUri()>
	//    5    9:putfield        #79  <Field Uri uri>
		mimeType = sharetomessengerparamsbuilder.getMimeType();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #83  <Method String ShareToMessengerParamsBuilder.getMimeType()>
	//    9   17:putfield        #85  <Field String mimeType>
		metaData = sharetomessengerparamsbuilder.getMetaData();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #88  <Method String ShareToMessengerParamsBuilder.getMetaData()>
	//   13   25:putfield        #90  <Field String metaData>
		externalUri = sharetomessengerparamsbuilder.getExternalUri();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #93  <Method Uri ShareToMessengerParamsBuilder.getExternalUri()>
	//   17   33:putfield        #95  <Field Uri externalUri>
		if(uri == null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #79  <Field Uri uri>
	//*  20   40:ifnonnull       53
			throw new NullPointerException("Must provide non-null uri");
	//   21   43:new             #97  <Class NullPointerException>
	//   22   46:dup             
	//   23   47:ldc1            #99  <String "Must provide non-null uri">
	//   24   49:invokespecial   #102 <Method void NullPointerException(String)>
	//   25   52:athrow          
		if(mimeType == null)
	//*  26   53:aload_0         
	//*  27   54:getfield        #85  <Field String mimeType>
	//*  28   57:ifnonnull       70
			throw new NullPointerException("Must provide mimeType");
	//   29   60:new             #97  <Class NullPointerException>
	//   30   63:dup             
	//   31   64:ldc1            #104 <String "Must provide mimeType">
	//   32   66:invokespecial   #102 <Method void NullPointerException(String)>
	//   33   69:athrow          
		if(!VALID_URI_SCHEMES.contains(((Object) (uri.getScheme()))))
	//*  34   70:getstatic       #62  <Field Set VALID_URI_SCHEMES>
	//*  35   73:aload_0         
	//*  36   74:getfield        #79  <Field Uri uri>
	//*  37   77:invokevirtual   #109 <Method String Uri.getScheme()>
	//*  38   80:invokeinterface #112 <Method boolean Set.contains(Object)>
	//*  39   85:ifne            127
		{
			sharetomessengerparamsbuilder = ((ShareToMessengerParamsBuilder) (new StringBuilder()));
	//   40   88:new             #114 <Class StringBuilder>
	//   41   91:dup             
	//   42   92:invokespecial   #115 <Method void StringBuilder()>
	//   43   95:astore_1        
			((StringBuilder) (sharetomessengerparamsbuilder)).append("Unsupported URI scheme: ");
	//   44   96:aload_1         
	//   45   97:ldc1            #117 <String "Unsupported URI scheme: ">
	//   46   99:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   47  102:pop             
			((StringBuilder) (sharetomessengerparamsbuilder)).append(uri.getScheme());
	//   48  103:aload_1         
	//   49  104:aload_0         
	//   50  105:getfield        #79  <Field Uri uri>
	//   51  108:invokevirtual   #109 <Method String Uri.getScheme()>
	//   52  111:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   53  114:pop             
			throw new IllegalArgumentException(((StringBuilder) (sharetomessengerparamsbuilder)).toString());
	//   54  115:new             #123 <Class IllegalArgumentException>
	//   55  118:dup             
	//   56  119:aload_1         
	//   57  120:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   58  123:invokespecial   #127 <Method void IllegalArgumentException(String)>
	//   59  126:athrow          
		}
		if(!VALID_MIME_TYPES.contains(((Object) (mimeType))))
	//*  60  127:getstatic       #54  <Field Set VALID_MIME_TYPES>
	//*  61  130:aload_0         
	//*  62  131:getfield        #85  <Field String mimeType>
	//*  63  134:invokeinterface #112 <Method boolean Set.contains(Object)>
	//*  64  139:ifne            178
		{
			sharetomessengerparamsbuilder = ((ShareToMessengerParamsBuilder) (new StringBuilder()));
	//   65  142:new             #114 <Class StringBuilder>
	//   66  145:dup             
	//   67  146:invokespecial   #115 <Method void StringBuilder()>
	//   68  149:astore_1        
			((StringBuilder) (sharetomessengerparamsbuilder)).append("Unsupported mime-type: ");
	//   69  150:aload_1         
	//   70  151:ldc1            #129 <String "Unsupported mime-type: ">
	//   71  153:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   72  156:pop             
			((StringBuilder) (sharetomessengerparamsbuilder)).append(mimeType);
	//   73  157:aload_1         
	//   74  158:aload_0         
	//   75  159:getfield        #85  <Field String mimeType>
	//   76  162:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   77  165:pop             
			throw new IllegalArgumentException(((StringBuilder) (sharetomessengerparamsbuilder)).toString());
	//   78  166:new             #123 <Class IllegalArgumentException>
	//   79  169:dup             
	//   80  170:aload_1         
	//   81  171:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   82  174:invokespecial   #127 <Method void IllegalArgumentException(String)>
	//   83  177:athrow          
		}
		if(externalUri != null && !VALID_EXTERNAL_URI_SCHEMES.contains(((Object) (externalUri.getScheme()))))
	//*  84  178:aload_0         
	//*  85  179:getfield        #95  <Field Uri externalUri>
	//*  86  182:ifnull          242
	//*  87  185:getstatic       #68  <Field Set VALID_EXTERNAL_URI_SCHEMES>
	//*  88  188:aload_0         
	//*  89  189:getfield        #95  <Field Uri externalUri>
	//*  90  192:invokevirtual   #109 <Method String Uri.getScheme()>
	//*  91  195:invokeinterface #112 <Method boolean Set.contains(Object)>
	//*  92  200:ifne            242
		{
			sharetomessengerparamsbuilder = ((ShareToMessengerParamsBuilder) (new StringBuilder()));
	//   93  203:new             #114 <Class StringBuilder>
	//   94  206:dup             
	//   95  207:invokespecial   #115 <Method void StringBuilder()>
	//   96  210:astore_1        
			((StringBuilder) (sharetomessengerparamsbuilder)).append("Unsupported external uri scheme: ");
	//   97  211:aload_1         
	//   98  212:ldc1            #131 <String "Unsupported external uri scheme: ">
	//   99  214:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  100  217:pop             
			((StringBuilder) (sharetomessengerparamsbuilder)).append(externalUri.getScheme());
	//  101  218:aload_1         
	//  102  219:aload_0         
	//  103  220:getfield        #95  <Field Uri externalUri>
	//  104  223:invokevirtual   #109 <Method String Uri.getScheme()>
	//  105  226:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  106  229:pop             
			throw new IllegalArgumentException(((StringBuilder) (sharetomessengerparamsbuilder)).toString());
	//  107  230:new             #123 <Class IllegalArgumentException>
	//  108  233:dup             
	//  109  234:aload_1         
	//  110  235:invokevirtual   #126 <Method String StringBuilder.toString()>
	//  111  238:invokespecial   #127 <Method void IllegalArgumentException(String)>
	//  112  241:athrow          
		} else
		{
			return;
	//  113  242:return          
		}
	}

	public static ShareToMessengerParamsBuilder newBuilder(Uri uri1, String s)
	{
		return new ShareToMessengerParamsBuilder(uri1, s);
	//    0    0:new             #73  <Class ShareToMessengerParamsBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #136 <Method void ShareToMessengerParamsBuilder(Uri, String)>
	//    5    9:areturn         
	}

	public static final Set VALID_EXTERNAL_URI_SCHEMES;
	public static final Set VALID_MIME_TYPES;
	public static final Set VALID_URI_SCHEMES;
	public final Uri externalUri;
	public final String metaData;
	public final String mimeType;
	public final Uri uri;

	static 
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #19  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void HashSet()>
	//    3    7:astore_0        
		((Set) (hashset)).add("image/*");
	//    4    8:aload_0         
	//    5    9:ldc1            #24  <String "image/*">
	//    6   11:invokeinterface #30  <Method boolean Set.add(Object)>
	//    7   16:pop             
		((Set) (hashset)).add("image/jpeg");
	//    8   17:aload_0         
	//    9   18:ldc1            #32  <String "image/jpeg">
	//   10   20:invokeinterface #30  <Method boolean Set.add(Object)>
	//   11   25:pop             
		((Set) (hashset)).add("image/png");
	//   12   26:aload_0         
	//   13   27:ldc1            #34  <String "image/png">
	//   14   29:invokeinterface #30  <Method boolean Set.add(Object)>
	//   15   34:pop             
		((Set) (hashset)).add("image/gif");
	//   16   35:aload_0         
	//   17   36:ldc1            #36  <String "image/gif">
	//   18   38:invokeinterface #30  <Method boolean Set.add(Object)>
	//   19   43:pop             
		((Set) (hashset)).add("image/webp");
	//   20   44:aload_0         
	//   21   45:ldc1            #38  <String "image/webp">
	//   22   47:invokeinterface #30  <Method boolean Set.add(Object)>
	//   23   52:pop             
		((Set) (hashset)).add("video/*");
	//   24   53:aload_0         
	//   25   54:ldc1            #40  <String "video/*">
	//   26   56:invokeinterface #30  <Method boolean Set.add(Object)>
	//   27   61:pop             
		((Set) (hashset)).add("video/mp4");
	//   28   62:aload_0         
	//   29   63:ldc1            #42  <String "video/mp4">
	//   30   65:invokeinterface #30  <Method boolean Set.add(Object)>
	//   31   70:pop             
		((Set) (hashset)).add("audio/*");
	//   32   71:aload_0         
	//   33   72:ldc1            #44  <String "audio/*">
	//   34   74:invokeinterface #30  <Method boolean Set.add(Object)>
	//   35   79:pop             
		((Set) (hashset)).add("audio/mpeg");
	//   36   80:aload_0         
	//   37   81:ldc1            #46  <String "audio/mpeg">
	//   38   83:invokeinterface #30  <Method boolean Set.add(Object)>
	//   39   88:pop             
		VALID_MIME_TYPES = Collections.unmodifiableSet(((Set) (hashset)));
	//   40   89:aload_0         
	//   41   90:invokestatic    #52  <Method Set Collections.unmodifiableSet(Set)>
	//   42   93:putstatic       #54  <Field Set VALID_MIME_TYPES>
		hashset = new HashSet();
	//   43   96:new             #19  <Class HashSet>
	//   44   99:dup             
	//   45  100:invokespecial   #22  <Method void HashSet()>
	//   46  103:astore_0        
		((Set) (hashset)).add("content");
	//   47  104:aload_0         
	//   48  105:ldc1            #56  <String "content">
	//   49  107:invokeinterface #30  <Method boolean Set.add(Object)>
	//   50  112:pop             
		((Set) (hashset)).add("android.resource");
	//   51  113:aload_0         
	//   52  114:ldc1            #58  <String "android.resource">
	//   53  116:invokeinterface #30  <Method boolean Set.add(Object)>
	//   54  121:pop             
		((Set) (hashset)).add("file");
	//   55  122:aload_0         
	//   56  123:ldc1            #60  <String "file">
	//   57  125:invokeinterface #30  <Method boolean Set.add(Object)>
	//   58  130:pop             
		VALID_URI_SCHEMES = Collections.unmodifiableSet(((Set) (hashset)));
	//   59  131:aload_0         
	//   60  132:invokestatic    #52  <Method Set Collections.unmodifiableSet(Set)>
	//   61  135:putstatic       #62  <Field Set VALID_URI_SCHEMES>
		hashset = new HashSet();
	//   62  138:new             #19  <Class HashSet>
	//   63  141:dup             
	//   64  142:invokespecial   #22  <Method void HashSet()>
	//   65  145:astore_0        
		((Set) (hashset)).add("http");
	//   66  146:aload_0         
	//   67  147:ldc1            #64  <String "http">
	//   68  149:invokeinterface #30  <Method boolean Set.add(Object)>
	//   69  154:pop             
		((Set) (hashset)).add("https");
	//   70  155:aload_0         
	//   71  156:ldc1            #66  <String "https">
	//   72  158:invokeinterface #30  <Method boolean Set.add(Object)>
	//   73  163:pop             
		VALID_EXTERNAL_URI_SCHEMES = Collections.unmodifiableSet(((Set) (hashset)));
	//   74  164:aload_0         
	//   75  165:invokestatic    #52  <Method Set Collections.unmodifiableSet(Set)>
	//   76  168:putstatic       #68  <Field Set VALID_EXTERNAL_URI_SCHEMES>
	//*  77  171:return          
	}
}
