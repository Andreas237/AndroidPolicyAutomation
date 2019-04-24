// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.richmedia;

import android.content.*;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import com.baidu.android.pushservice.h.o;
import com.baidu.android.pushservice.h.u;
import java.io.File;
import java.util.HashMap;

// Referenced classes of package com.baidu.android.pushservice.richmedia:
//			MediaListActivity, a, MediaViewActivity

class MediaListActivity$2
	implements android.widget.ickListener
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		adapterview = ((AdapterView) ((String)((HashMap)adapterview.getItemAtPosition(i)).get(((Object) (MediaListActivity.a())))));
	//    0    0:aload_1         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #26  <Method Object AdapterView.getItemAtPosition(int)>
	//    3    5:checkcast       #28  <Class HashMap>
	//    4    8:invokestatic    #31  <Method String MediaListActivity.a()>
	//    5   11:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//    6   14:checkcast       #37  <Class String>
	//    7   17:astore_1        
		view = ((View) (o.a(((android.content.Context) (a)), ((String) (adapterview)))));
	//    8   18:aload_0         
	//    9   19:getfield        #14  <Field MediaListActivity a>
	//   10   22:aload_1         
	//   11   23:invokestatic    #42  <Method com.baidu.android.pushservice.h.o$h o.a(android.content.Context, String)>
	//   12   26:astore_2        
		if(view != null)
	//*  13   27:aload_2         
	//*  14   28:ifnull          248
			if(((com.baidu.android.pushservice.h.o.h) (view)).i == a.f)
	//*  15   31:aload_2         
	//*  16   32:getfield        #48  <Field int com.baidu.android.pushservice.h.o$h.i>
	//*  17   35:getstatic       #53  <Field int a.f>
	//*  18   38:icmpne          229
			{
				adapterview = ((AdapterView) (((com.baidu.android.pushservice.h.o.h) (view)).e));
	//   19   41:aload_2         
	//   20   42:getfield        #57  <Field String com.baidu.android.pushservice.h.o$h.e>
	//   21   45:astore_1        
				view = ((View) (((com.baidu.android.pushservice.h.o.h) (view)).f));
	//   22   46:aload_2         
	//   23   47:getfield        #59  <Field String com.baidu.android.pushservice.h.o$h.f>
	//   24   50:astore_2        
				if(((String) (view)).length() > 0)
	//*  25   51:aload_2         
	//*  26   52:invokevirtual   #63  <Method int String.length()>
	//*  27   55:ifle            248
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   28   58:new             #65  <Class StringBuilder>
	//   29   61:dup             
	//   30   62:invokespecial   #66  <Method void StringBuilder()>
	//   31   65:astore          6
					stringbuilder.append(((String) (adapterview)));
	//   32   67:aload           6
	//   33   69:aload_1         
	//   34   70:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   35   73:pop             
					stringbuilder.append("/");
	//   36   74:aload           6
	//   37   76:ldc1            #72  <String "/">
	//   38   78:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
					stringbuilder.append(((String) (view)).substring(0, ((String) (view)).lastIndexOf(".")));
	//   40   82:aload           6
	//   41   84:aload_2         
	//   42   85:iconst_0        
	//   43   86:aload_2         
	//   44   87:ldc1            #74  <String ".">
	//   45   89:invokevirtual   #78  <Method int String.lastIndexOf(String)>
	//   46   92:invokevirtual   #82  <Method String String.substring(int, int)>
	//   47   95:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   48   98:pop             
					stringbuilder.append("/index.html");
	//   49   99:aload           6
	//   50  101:ldc1            #84  <String "/index.html">
	//   51  103:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   52  106:pop             
					adapterview = ((AdapterView) (stringbuilder.toString()));
	//   53  107:aload           6
	//   54  109:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   55  112:astore_1        
					view = ((View) (new Intent()));
	//   56  113:new             #89  <Class Intent>
	//   57  116:dup             
	//   58  117:invokespecial   #90  <Method void Intent()>
	//   59  120:astore_2        
					((Intent) (view)).setClass(((android.content.Context) (a)), com/baidu/android/pushservice/richmedia/MediaViewActivity);
	//   60  121:aload_2         
	//   61  122:aload_0         
	//   62  123:getfield        #14  <Field MediaListActivity a>
	//   63  126:ldc1            #92  <Class MediaViewActivity>
	//   64  128:invokevirtual   #96  <Method Intent Intent.setClass(android.content.Context, Class)>
	//   65  131:pop             
					i = u.z(((android.content.Context) (a)), a.getPackageName());
	//   66  132:aload_0         
	//   67  133:getfield        #14  <Field MediaListActivity a>
	//   68  136:aload_0         
	//   69  137:getfield        #14  <Field MediaListActivity a>
	//   70  140:invokevirtual   #99  <Method String MediaListActivity.getPackageName()>
	//   71  143:invokestatic    #105 <Method int u.z(android.content.Context, String)>
	//   72  146:istore_3        
					adapterview = ((AdapterView) (new File(((String) (adapterview)))));
	//   73  147:new             #107 <Class File>
	//   74  150:dup             
	//   75  151:aload_1         
	//   76  152:invokespecial   #110 <Method void File(String)>
	//   77  155:astore_1        
					if(i >= 24)
	//*  78  156:iload_3         
	//*  79  157:bipush          24
	//*  80  159:icmplt          202
					{
						ContentValues contentvalues = new ContentValues(1);
	//   81  162:new             #112 <Class ContentValues>
	//   82  165:dup             
	//   83  166:iconst_1        
	//   84  167:invokespecial   #115 <Method void ContentValues(int)>
	//   85  170:astore          6
						contentvalues.put("_data", ((File) (adapterview)).getAbsolutePath());
	//   86  172:aload           6
	//   87  174:ldc1            #117 <String "_data">
	//   88  176:aload_1         
	//   89  177:invokevirtual   #120 <Method String File.getAbsolutePath()>
	//   90  180:invokevirtual   #124 <Method void ContentValues.put(String, String)>
						adapterview = ((AdapterView) (a.getContentResolver().insert(android.provider.dia.EXTERNAL_CONTENT_URI, contentvalues)));
	//   91  183:aload_0         
	//   92  184:getfield        #14  <Field MediaListActivity a>
	//   93  187:invokevirtual   #128 <Method ContentResolver MediaListActivity.getContentResolver()>
	//   94  190:getstatic       #134 <Field Uri android.provider.MediaStore$Images$Media.EXTERNAL_CONTENT_URI>
	//   95  193:aload           6
	//   96  195:invokevirtual   #140 <Method Uri ContentResolver.insert(Uri, ContentValues)>
	//   97  198:astore_1        
					} else
	//*  98  199:goto            207
					{
						adapterview = ((AdapterView) (Uri.fromFile(((File) (adapterview)))));
	//   99  202:aload_1         
	//  100  203:invokestatic    #146 <Method Uri Uri.fromFile(File)>
	//  101  206:astore_1        
					}
					((Intent) (view)).setData(((Uri) (adapterview)));
	//  102  207:aload_2         
	//  103  208:aload_1         
	//  104  209:invokevirtual   #150 <Method Intent Intent.setData(Uri)>
	//  105  212:pop             
					((Intent) (view)).addFlags(0x10000000);
	//  106  213:aload_2         
	//  107  214:ldc1            #151 <Int 0x10000000>
	//  108  216:invokevirtual   #155 <Method Intent Intent.addFlags(int)>
	//  109  219:pop             
					a.startActivity(((Intent) (view)));
	//  110  220:aload_0         
	//  111  221:getfield        #14  <Field MediaListActivity a>
	//  112  224:aload_2         
	//  113  225:invokevirtual   #159 <Method void MediaListActivity.startActivity(Intent)>
					return;
	//  114  228:return          
				}
			} else
			{
				MediaListActivity.a(a, ((com.baidu.android.pushservice.h.o.h) (view)).b, ((com.baidu.android.pushservice.h.o.h) (view)).c, ((com.baidu.android.pushservice.h.o.h) (view)).d);
	//  115  229:aload_0         
	//  116  230:getfield        #14  <Field MediaListActivity a>
	//  117  233:aload_2         
	//  118  234:getfield        #162 <Field String com.baidu.android.pushservice.h.o$h.b>
	//  119  237:aload_2         
	//  120  238:getfield        #165 <Field String com.baidu.android.pushservice.h.o$h.c>
	//  121  241:aload_2         
	//  122  242:getfield        #168 <Field String com.baidu.android.pushservice.h.o$h.d>
	//  123  245:invokestatic    #171 <Method void MediaListActivity.a(MediaListActivity, String, String, String)>
			}
	//  124  248:return          
	}

	final MediaListActivity a;

	MediaListActivity$2(MediaListActivity medialistactivity)
	{
		a = medialistactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MediaListActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
