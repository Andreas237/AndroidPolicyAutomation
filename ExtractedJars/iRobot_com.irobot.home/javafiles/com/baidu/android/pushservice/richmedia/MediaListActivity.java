// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.richmedia;

import android.app.*;
import android.content.*;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.*;
import android.widget.*;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.h.o;
import com.baidu.android.pushservice.h.u;
import java.io.File;
import java.util.*;

// Referenced classes of package com.baidu.android.pushservice.richmedia:
//			d, c, a, MediaViewActivity, 
//			f, b, e

public class MediaListActivity extends Activity
{
	public class a extends BaseAdapter
	{

		public int getCount()
		{
			return c.size();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field ArrayList c>
		//    2    4:invokevirtual   #34  <Method int ArrayList.size()>
		//    3    7:ireturn         
		}

		public Object getItem(int i1)
		{
			if(c != null && i1 < c.size())
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field ArrayList c>
		//*   2    4:ifnull          27
		//*   3    7:iload_1         
		//*   4    8:aload_0         
		//*   5    9:getfield        #24  <Field ArrayList c>
		//*   6   12:invokevirtual   #34  <Method int ArrayList.size()>
		//*   7   15:icmpge          27
				return c.get(i1);
		//    8   18:aload_0         
		//    9   19:getfield        #24  <Field ArrayList c>
		//   10   22:iload_1         
		//   11   23:invokevirtual   #39  <Method Object ArrayList.get(int)>
		//   12   26:areturn         
			else
				return ((Object) (null));
		//   13   27:aconst_null     
		//   14   28:areturn         
		}

		public long getItemId(int i1)
		{
			return (long)i1;
		//    0    0:iload_1         
		//    1    1:i2l             
		//    2    2:lreturn         
		}

		public View getView(int i1, View view, ViewGroup viewgroup)
		{
			TextView textview;
			TextView textview1;
			TextView textview2;
			view = LayoutInflater.from(b.getApplicationContext()).inflate(MediaListActivity.f(a), ((ViewGroup) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Context b>
		//    2    4:invokevirtual   #51  <Method Context Context.getApplicationContext()>
		//    3    7:invokestatic    #57  <Method LayoutInflater LayoutInflater.from(Context)>
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field MediaListActivity a>
		//    6   14:invokestatic    #61  <Method int MediaListActivity.f(MediaListActivity)>
		//    7   17:aconst_null     
		//    8   18:invokevirtual   #65  <Method View LayoutInflater.inflate(int, ViewGroup)>
		//    9   21:astore_2        
			view.setBackgroundColor(0xff888888);
		//   10   22:aload_2         
		//   11   23:ldc1            #66  <Int 0xff888888>
		//   12   25:invokevirtual   #72  <Method void View.setBackgroundColor(int)>
			viewgroup = ((ViewGroup) ((ImageView)view.findViewById(MediaListActivity.g(a))));
		//   13   28:aload_2         
		//   14   29:aload_0         
		//   15   30:getfield        #17  <Field MediaListActivity a>
		//   16   33:invokestatic    #75  <Method int MediaListActivity.g(MediaListActivity)>
		//   17   36:invokevirtual   #79  <Method View View.findViewById(int)>
		//   18   39:checkcast       #81  <Class ImageView>
		//   19   42:astore_3        
			textview = (TextView)view.findViewById(MediaListActivity.h(a));
		//   20   43:aload_2         
		//   21   44:aload_0         
		//   22   45:getfield        #17  <Field MediaListActivity a>
		//   23   48:invokestatic    #84  <Method int MediaListActivity.h(MediaListActivity)>
		//   24   51:invokevirtual   #79  <Method View View.findViewById(int)>
		//   25   54:checkcast       #86  <Class TextView>
		//   26   57:astore          4
			textview1 = (TextView)view.findViewById(MediaListActivity.i(a));
		//   27   59:aload_2         
		//   28   60:aload_0         
		//   29   61:getfield        #17  <Field MediaListActivity a>
		//   30   64:invokestatic    #89  <Method int MediaListActivity.i(MediaListActivity)>
		//   31   67:invokevirtual   #79  <Method View View.findViewById(int)>
		//   32   70:checkcast       #86  <Class TextView>
		//   33   73:astore          5
			textview2 = (TextView)view.findViewById(MediaListActivity.j(a));
		//   34   75:aload_2         
		//   35   76:aload_0         
		//   36   77:getfield        #17  <Field MediaListActivity a>
		//   37   80:invokestatic    #92  <Method int MediaListActivity.j(MediaListActivity)>
		//   38   83:invokevirtual   #79  <Method View View.findViewById(int)>
		//   39   86:checkcast       #86  <Class TextView>
		//   40   89:astore          6
			HashMap hashmap;
			if(c == null || i1 >= c.size())
				break MISSING_BLOCK_LABEL_282;
		//   41   91:aload_0         
		//   42   92:getfield        #24  <Field ArrayList c>
		//   43   95:ifnull          282
		//   44   98:iload_1         
		//   45   99:aload_0         
		//   46  100:getfield        #24  <Field ArrayList c>
		//   47  103:invokevirtual   #34  <Method int ArrayList.size()>
		//   48  106:icmpge          282
			hashmap = (HashMap)c.get(i1);
		//   49  109:aload_0         
		//   50  110:getfield        #24  <Field ArrayList c>
		//   51  113:iload_1         
		//   52  114:invokevirtual   #39  <Method Object ArrayList.get(int)>
		//   53  117:checkcast       #94  <Class HashMap>
		//   54  120:astore          7
			if(hashmap == null)
				break MISSING_BLOCK_LABEL_282;
		//   55  122:aload           7
		//   56  124:ifnull          282
			if(textview == null)
				break MISSING_BLOCK_LABEL_157;
		//   57  127:aload           4
		//   58  129:ifnull          157
			if(hashmap.get("title") != null)
		//*  59  132:aload           7
		//*  60  134:ldc1            #96  <String "title">
		//*  61  136:invokevirtual   #99  <Method Object HashMap.get(Object)>
		//*  62  139:ifnull          157
				textview.setText(((CharSequence) (hashmap.get("title").toString())));
		//   63  142:aload           4
		//   64  144:aload           7
		//   65  146:ldc1            #96  <String "title">
		//   66  148:invokevirtual   #99  <Method Object HashMap.get(Object)>
		//   67  151:invokevirtual   #105 <Method String Object.toString()>
		//   68  154:invokevirtual   #109 <Method void TextView.setText(CharSequence)>
			if(textview1 == null)
				break MISSING_BLOCK_LABEL_187;
		//   69  157:aload           5
		//   70  159:ifnull          187
			if(hashmap.get("fromtext") != null)
		//*  71  162:aload           7
		//*  72  164:ldc1            #111 <String "fromtext">
		//*  73  166:invokevirtual   #99  <Method Object HashMap.get(Object)>
		//*  74  169:ifnull          187
				textview1.setText(((CharSequence) (hashmap.get("fromtext").toString())));
		//   75  172:aload           5
		//   76  174:aload           7
		//   77  176:ldc1            #111 <String "fromtext">
		//   78  178:invokevirtual   #99  <Method Object HashMap.get(Object)>
		//   79  181:invokevirtual   #105 <Method String Object.toString()>
		//   80  184:invokevirtual   #109 <Method void TextView.setText(CharSequence)>
			if(textview2 == null)
				break MISSING_BLOCK_LABEL_217;
		//   81  187:aload           6
		//   82  189:ifnull          217
			if(hashmap.get("timetext") != null)
		//*  83  192:aload           7
		//*  84  194:ldc1            #113 <String "timetext">
		//*  85  196:invokevirtual   #99  <Method Object HashMap.get(Object)>
		//*  86  199:ifnull          217
				textview2.setText(((CharSequence) (hashmap.get("timetext").toString())));
		//   87  202:aload           6
		//   88  204:aload           7
		//   89  206:ldc1            #113 <String "timetext">
		//   90  208:invokevirtual   #99  <Method Object HashMap.get(Object)>
		//   91  211:invokevirtual   #105 <Method String Object.toString()>
		//   92  214:invokevirtual   #109 <Method void TextView.setText(CharSequence)>
			if(viewgroup == null)
				break MISSING_BLOCK_LABEL_282;
		//   93  217:aload_3         
		//   94  218:ifnull          282
			if(hashmap.get("img") == null)
				break MISSING_BLOCK_LABEL_282;
		//   95  221:aload           7
		//   96  223:ldc1            #115 <String "img">
		//   97  225:invokevirtual   #99  <Method Object HashMap.get(Object)>
		//   98  228:ifnull          282
			((ImageView) (viewgroup)).setImageDrawable((Drawable)hashmap.get("img"));
		//   99  231:aload_3         
		//  100  232:aload           7
		//  101  234:ldc1            #115 <String "img">
		//  102  236:invokevirtual   #99  <Method Object HashMap.get(Object)>
		//  103  239:checkcast       #117 <Class Drawable>
		//  104  242:invokevirtual   #121 <Method void ImageView.setImageDrawable(Drawable)>
			return view;
		//  105  245:aload_2         
		//  106  246:areturn         
			viewgroup;
		//  107  247:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//  108  248:new             #123 <Class StringBuilder>
		//  109  251:dup             
		//  110  252:invokespecial   #124 <Method void StringBuilder()>
		//  111  255:astore          4
			stringbuilder.append("getView E: ");
		//  112  257:aload           4
		//  113  259:ldc1            #126 <String "getView E: ">
		//  114  261:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
		//  115  264:pop             
			stringbuilder.append(((Object) (viewgroup)));
		//  116  265:aload           4
		//  117  267:aload_3         
		//  118  268:invokevirtual   #133 <Method StringBuilder StringBuilder.append(Object)>
		//  119  271:pop             
			com.baidu.android.pushservice.e.a.e("MediaListActivity", stringbuilder.toString());
		//  120  272:ldc1            #135 <String "MediaListActivity">
		//  121  274:aload           4
		//  122  276:invokevirtual   #136 <Method String StringBuilder.toString()>
		//  123  279:invokestatic    #142 <Method void a.e(String, String)>
			return view;
		//  124  282:aload_2         
		//  125  283:areturn         
		}

		final MediaListActivity a;
		private final Context b;
		private final ArrayList c;

		public a(Context context, ArrayList arraylist)
		{
			a = MediaListActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MediaListActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void BaseAdapter()>
			b = context;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Context b>
			c = arraylist;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field ArrayList c>
		//   11   19:return          
		}
	}


	public MediaListActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Activity()>
		l = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #60  <Field LinearLayout l>
	//    5    9:aload_0         
	//    6   10:new             #8   <Class MediaListActivity$2>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #63  <Method void MediaListActivity$2(MediaListActivity)>
	//   10   18:putfield        #65  <Field android.widget.AdapterView$OnItemClickListener s>
	//   11   21:aload_0         
	//   12   22:new             #10  <Class MediaListActivity$3>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #66  <Method void MediaListActivity$3(MediaListActivity)>
	//   16   30:putfield        #68  <Field android.widget.AdapterView$OnItemLongClickListener t>
	//   17   33:return          
	}

	static RemoteViews a(MediaListActivity medialistactivity)
	{
		return medialistactivity.m;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field RemoteViews m>
	//    2    4:areturn         
	}

	static String a()
	{
		return r;
	//    0    0:getstatic       #74  <Field String r>
	//    1    3:areturn         
	}

	static void a(MediaListActivity medialistactivity, String s1, String s2, String s3)
	{
		medialistactivity.a(s1, s2, s3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #78  <Method void a(String, String, String)>
	//    5    7:return          
	}

	private void a(String s1, String s2, String s3)
	{
		Object obj = ((Object) (Uri.parse(s1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #84  <Method Uri Uri.parse(String)>
	//    2    4:astore          4
		Object obj1 = ((Object) (((Uri) (obj)).getPath()));
	//    3    6:aload           4
	//    4    8:invokevirtual   #87  <Method String Uri.getPath()>
	//    5   11:astore          5
		s1 = new String();
	//    6   13:new             #89  <Class String>
	//    7   16:dup             
	//    8   17:invokespecial   #90  <Method void String()>
	//    9   20:astore_1        
		if(((String) (obj1)).length() > 0)
	//*  10   21:aload           5
	//*  11   23:invokevirtual   #94  <Method int String.length()>
	//*  12   26:ifle            43
			s1 = ((String) (obj1)).substring(0, ((String) (obj1)).lastIndexOf('/'));
	//   13   29:aload           5
	//   14   31:iconst_0        
	//   15   32:aload           5
	//   16   34:bipush          47
	//   17   36:invokevirtual   #98  <Method int String.lastIndexOf(int)>
	//   18   39:invokevirtual   #102 <Method String String.substring(int, int)>
	//   19   42:astore_1        
		obj1 = ((Object) (new StringBuilder()));
	//   20   43:new             #104 <Class StringBuilder>
	//   21   46:dup             
	//   22   47:invokespecial   #105 <Method void StringBuilder()>
	//   23   50:astore          5
		((StringBuilder) (obj1)).append(Environment.getExternalStorageDirectory().getAbsolutePath());
	//   24   52:aload           5
	//   25   54:invokestatic    #111 <Method File Environment.getExternalStorageDirectory()>
	//   26   57:invokevirtual   #116 <Method String File.getAbsolutePath()>
	//   27   60:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   28   63:pop             
		((StringBuilder) (obj1)).append("/");
	//   29   64:aload           5
	//   30   66:ldc1            #122 <String "/">
	//   31   68:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   32   71:pop             
		((StringBuilder) (obj1)).append("baidu/pushservice/files");
	//   33   72:aload           5
	//   34   74:ldc1            #124 <String "baidu/pushservice/files">
	//   35   76:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   36   79:pop             
		((StringBuilder) (obj1)).append("/");
	//   37   80:aload           5
	//   38   82:ldc1            #122 <String "/">
	//   39   84:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   40   87:pop             
		((StringBuilder) (obj1)).append(((Uri) (obj)).getAuthority());
	//   41   88:aload           5
	//   42   90:aload           4
	//   43   92:invokevirtual   #127 <Method String Uri.getAuthority()>
	//   44   95:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   45   98:pop             
		((StringBuilder) (obj1)).append("/");
	//   46   99:aload           5
	//   47  101:ldc1            #122 <String "/">
	//   48  103:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   49  106:pop             
		((StringBuilder) (obj1)).append(s1);
	//   50  107:aload           5
	//   51  109:aload_1         
	//   52  110:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   53  113:pop             
		s1 = ((String) (new File(((StringBuilder) (obj1)).toString())));
	//   54  114:new             #113 <Class File>
	//   55  117:dup             
	//   56  118:aload           5
	//   57  120:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   58  123:invokespecial   #133 <Method void File(String)>
	//   59  126:astore_1        
		obj1 = ((Object) (new StringBuilder()));
	//   60  127:new             #104 <Class StringBuilder>
	//   61  130:dup             
	//   62  131:invokespecial   #105 <Method void StringBuilder()>
	//   63  134:astore          5
		((StringBuilder) (obj1)).append("<<< download url ");
	//   64  136:aload           5
	//   65  138:ldc1            #135 <String "<<< download url ">
	//   66  140:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   67  143:pop             
		((StringBuilder) (obj1)).append(((Uri) (obj)).toString());
	//   68  144:aload           5
	//   69  146:aload           4
	//   70  148:invokevirtual   #136 <Method String Uri.toString()>
	//   71  151:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   72  154:pop             
		com.baidu.android.pushservice.e.a.c("MediaListActivity", ((StringBuilder) (obj1)).toString());
	//   73  155:ldc1            #138 <String "MediaListActivity">
	//   74  157:aload           5
	//   75  159:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   76  162:invokestatic    #143 <Method void a.c(String, String)>
		obj = ((Object) (com.baidu.android.pushservice.richmedia.d.a(com.baidu.android.pushservice.richmedia.c.a.a, ((Uri) (obj)).toString())));
	//   77  165:getstatic       #148 <Field c$a com.baidu.android.pushservice.richmedia.c$a.a>
	//   78  168:aload           4
	//   79  170:invokevirtual   #136 <Method String Uri.toString()>
	//   80  173:invokestatic    #153 <Method c com.baidu.android.pushservice.richmedia.d.a(c$a, String)>
	//   81  176:astore          4
		obj.b = ((File) (s1)).getAbsolutePath();
	//   82  178:aload           4
	//   83  180:aload_1         
	//   84  181:invokevirtual   #116 <Method String File.getAbsolutePath()>
	//   85  184:putfield        #157 <Field String c.b>
		obj.c = s2;
	//   86  187:aload           4
	//   87  189:aload_2         
	//   88  190:putfield        #159 <Field String c.c>
		obj.d = s3;
	//   89  193:aload           4
	//   90  195:aload_3         
	//   91  196:putfield        #161 <Field String c.d>
		(new com.baidu.android.pushservice.richmedia.a(((Context) (this)), new f() {

			public void a(com.baidu.android.pushservice.richmedia.a a1)
			{
			//    0    0:return          
			}

			public void a(com.baidu.android.pushservice.richmedia.a a1, b b1)
			{
				String s4 = a1.d.c();
			//    0    0:aload_1         
			//    1    1:getfield        #30  <Field c a.d>
			//    2    4:invokevirtual   #36  <Method String c.c()>
			//    3    7:astore          5
				if(b1.a == b1.b)
			//*   4    9:aload_2         
			//*   5   10:getfield        #41  <Field long com.baidu.android.pushservice.richmedia.b.a>
			//*   6   13:aload_2         
			//*   7   14:getfield        #44  <Field long b.b>
			//*   8   17:lcmp            
			//*   9   18:ifne            22
					return;
			//   10   21:return          
				if(com.baidu.android.pushservice.richmedia.MediaListActivity.a(a) != null)
			//*  11   22:aload_0         
			//*  12   23:getfield        #18  <Field MediaListActivity a>
			//*  13   26:invokestatic    #47  <Method RemoteViews com.baidu.android.pushservice.richmedia.MediaListActivity.a(MediaListActivity)>
			//*  14   29:ifnull          273
				{
					int i1 = (int)(((double)b1.a * 100D) / (double)b1.b);
			//   15   32:aload_2         
			//   16   33:getfield        #41  <Field long com.baidu.android.pushservice.richmedia.b.a>
			//   17   36:l2d             
			//   18   37:ldc2w           #48  <Double 100D>
			//   19   40:dmul            
			//   20   41:aload_2         
			//   21   42:getfield        #44  <Field long b.b>
			//   22   45:l2d             
			//   23   46:ddiv            
			//   24   47:d2i             
			//   25   48:istore_3        
					a1 = ((com.baidu.android.pushservice.richmedia.a) (com.baidu.android.pushservice.richmedia.MediaListActivity.a(a)));
			//   26   49:aload_0         
			//   27   50:getfield        #18  <Field MediaListActivity a>
			//   28   53:invokestatic    #47  <Method RemoteViews com.baidu.android.pushservice.richmedia.MediaListActivity.a(MediaListActivity)>
			//   29   56:astore_1        
					int j1 = MediaListActivity.b(a);
			//   30   57:aload_0         
			//   31   58:getfield        #18  <Field MediaListActivity a>
			//   32   61:invokestatic    #52  <Method int MediaListActivity.b(MediaListActivity)>
			//   33   64:istore          4
					b1 = ((b) (new StringBuilder()));
			//   34   66:new             #54  <Class StringBuilder>
			//   35   69:dup             
			//   36   70:invokespecial   #55  <Method void StringBuilder()>
			//   37   73:astore_2        
					((StringBuilder) (b1)).append(i1);
			//   38   74:aload_2         
			//   39   75:iload_3         
			//   40   76:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
			//   41   79:pop             
					((StringBuilder) (b1)).append("%");
			//   42   80:aload_2         
			//   43   81:ldc1            #61  <String "%">
			//   44   83:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
			//   45   86:pop             
					((RemoteViews) (a1)).setTextViewText(j1, ((CharSequence) (((StringBuilder) (b1)).toString())));
			//   46   87:aload_1         
			//   47   88:iload           4
			//   48   90:aload_2         
			//   49   91:invokevirtual   #67  <Method String StringBuilder.toString()>
			//   50   94:invokevirtual   #73  <Method void RemoteViews.setTextViewText(int, CharSequence)>
					com.baidu.android.pushservice.richmedia.MediaListActivity.a(a).setTextViewText(MediaListActivity.c(a), ((CharSequence) (s4)));
			//   51   97:aload_0         
			//   52   98:getfield        #18  <Field MediaListActivity a>
			//   53  101:invokestatic    #47  <Method RemoteViews com.baidu.android.pushservice.richmedia.MediaListActivity.a(MediaListActivity)>
			//   54  104:aload_0         
			//   55  105:getfield        #18  <Field MediaListActivity a>
			//   56  108:invokestatic    #75  <Method int MediaListActivity.c(MediaListActivity)>
			//   57  111:aload           5
			//   58  113:invokevirtual   #73  <Method void RemoteViews.setTextViewText(int, CharSequence)>
					com.baidu.android.pushservice.richmedia.MediaListActivity.a(a).setProgressBar(MediaListActivity.d(a), 100, i1, false);
			//   59  116:aload_0         
			//   60  117:getfield        #18  <Field MediaListActivity a>
			//   61  120:invokestatic    #47  <Method RemoteViews com.baidu.android.pushservice.richmedia.MediaListActivity.a(MediaListActivity)>
			//   62  123:aload_0         
			//   63  124:getfield        #18  <Field MediaListActivity a>
			//   64  127:invokestatic    #77  <Method int MediaListActivity.d(MediaListActivity)>
			//   65  130:bipush          100
			//   66  132:iload_3         
			//   67  133:iconst_0        
			//   68  134:invokevirtual   #81  <Method void RemoteViews.setProgressBar(int, int, int, boolean)>
					com.baidu.android.pushservice.richmedia.MediaListActivity.a(a).setImageViewResource(MediaListActivity.e(a), 0x1080081);
			//   69  137:aload_0         
			//   70  138:getfield        #18  <Field MediaListActivity a>
			//   71  141:invokestatic    #47  <Method RemoteViews com.baidu.android.pushservice.richmedia.MediaListActivity.a(MediaListActivity)>
			//   72  144:aload_0         
			//   73  145:getfield        #18  <Field MediaListActivity a>
			//   74  148:invokestatic    #84  <Method int MediaListActivity.e(MediaListActivity)>
			//   75  151:ldc1            #85  <Int 0x1080081>
			//   76  153:invokevirtual   #89  <Method void RemoteViews.setImageViewResource(int, int)>
					if(android.os.Build.VERSION.SDK_INT >= 16)
			//*  77  156:getstatic       #95  <Field int android.os.Build$VERSION.SDK_INT>
			//*  78  159:bipush          16
			//*  79  161:icmplt          193
						a1 = ((com.baidu.android.pushservice.richmedia.a) ((new android.app.Notification.Builder(((Context) (a)))).setSmallIcon(0x1080081).setWhen(System.currentTimeMillis()).build()));
			//   80  164:new             #97  <Class android.app.Notification$Builder>
			//   81  167:dup             
			//   82  168:aload_0         
			//   83  169:getfield        #18  <Field MediaListActivity a>
			//   84  172:invokespecial   #100 <Method void android.app.Notification$Builder(Context)>
			//   85  175:ldc1            #85  <Int 0x1080081>
			//   86  177:invokevirtual   #104 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
			//   87  180:invokestatic    #110 <Method long System.currentTimeMillis()>
			//   88  183:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
			//   89  186:invokevirtual   #118 <Method Notification android.app.Notification$Builder.build()>
			//   90  189:astore_1        
					else
			//*  91  190:goto            207
						a1 = ((com.baidu.android.pushservice.richmedia.a) (new Notification(0x1080081, ((CharSequence) (null)), System.currentTimeMillis())));
			//   92  193:new             #120 <Class Notification>
			//   93  196:dup             
			//   94  197:ldc1            #85  <Int 0x1080081>
			//   95  199:aconst_null     
			//   96  200:invokestatic    #110 <Method long System.currentTimeMillis()>
			//   97  203:invokespecial   #123 <Method void Notification(int, CharSequence, long)>
			//   98  206:astore_1        
					a1.contentView = com.baidu.android.pushservice.richmedia.MediaListActivity.a(a);
			//   99  207:aload_1         
			//  100  208:aload_0         
			//  101  209:getfield        #18  <Field MediaListActivity a>
			//  102  212:invokestatic    #47  <Method RemoteViews com.baidu.android.pushservice.richmedia.MediaListActivity.a(MediaListActivity)>
			//  103  215:putfield        #127 <Field RemoteViews Notification.contentView>
					a1.contentIntent = PendingIntent.getActivity(((Context) (a)), 0, new Intent(), 0);
			//  104  218:aload_1         
			//  105  219:aload_0         
			//  106  220:getfield        #18  <Field MediaListActivity a>
			//  107  223:iconst_0        
			//  108  224:new             #129 <Class Intent>
			//  109  227:dup             
			//  110  228:invokespecial   #130 <Method void Intent()>
			//  111  231:iconst_0        
			//  112  232:invokestatic    #136 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
			//  113  235:putfield        #140 <Field PendingIntent Notification.contentIntent>
					a1.flags = ((Notification) (a1)).flags | 0x20;
			//  114  238:aload_1         
			//  115  239:aload_1         
			//  116  240:getfield        #143 <Field int Notification.flags>
			//  117  243:bipush          32
			//  118  245:ior             
			//  119  246:putfield        #143 <Field int Notification.flags>
					a1.flags = ((Notification) (a1)).flags | 2;
			//  120  249:aload_1         
			//  121  250:aload_1         
			//  122  251:getfield        #143 <Field int Notification.flags>
			//  123  254:iconst_2        
			//  124  255:ior             
			//  125  256:putfield        #143 <Field int Notification.flags>
					a.b.notify(s4, 0, ((Notification) (a1)));
			//  126  259:aload_0         
			//  127  260:getfield        #18  <Field MediaListActivity a>
			//  128  263:getfield        #146 <Field NotificationManager MediaListActivity.b>
			//  129  266:aload           5
			//  130  268:iconst_0        
			//  131  269:aload_1         
			//  132  270:invokevirtual   #152 <Method void NotificationManager.notify(String, int, Notification)>
				}
			//  133  273:return          
			}

			public void a(com.baidu.android.pushservice.richmedia.a a1, e e1)
			{
				a1 = ((com.baidu.android.pushservice.richmedia.a) (a1.d.c()));
			//    0    0:aload_1         
			//    1    1:getfield        #30  <Field c a.d>
			//    2    4:invokevirtual   #36  <Method String c.c()>
			//    3    7:astore_1        
				a.b.cancel(((String) (a1)), 0);
			//    4    8:aload_0         
			//    5    9:getfield        #18  <Field MediaListActivity a>
			//    6   12:getfield        #146 <Field NotificationManager MediaListActivity.b>
			//    7   15:aload_1         
			//    8   16:iconst_0        
			//    9   17:invokevirtual   #157 <Method void NotificationManager.cancel(String, int)>
				e1 = ((e) (com.baidu.android.pushservice.h.o.a(((Context) (a)), ((String) (a1)))));
			//   10   20:aload_0         
			//   11   21:getfield        #18  <Field MediaListActivity a>
			//   12   24:aload_1         
			//   13   25:invokestatic    #162 <Method com.baidu.android.pushservice.h.o$h o.a(Context, String)>
			//   14   28:astore_2        
				if(e1 != null && ((com.baidu.android.pushservice.h.o.h) (e1)).i == com.baidu.android.pushservice.richmedia.a.f)
			//*  15   29:aload_2         
			//*  16   30:ifnull          231
			//*  17   33:aload_2         
			//*  18   34:getfield        #167 <Field int com.baidu.android.pushservice.h.o$h.i>
			//*  19   37:getstatic       #170 <Field int a.f>
			//*  20   40:icmpne          231
				{
					a1 = ((com.baidu.android.pushservice.richmedia.a) (((com.baidu.android.pushservice.h.o.h) (e1)).e));
			//   21   43:aload_2         
			//   22   44:getfield        #173 <Field String com.baidu.android.pushservice.h.o$h.e>
			//   23   47:astore_1        
					e1 = ((e) (((com.baidu.android.pushservice.h.o.h) (e1)).f));
			//   24   48:aload_2         
			//   25   49:getfield        #175 <Field String com.baidu.android.pushservice.h.o$h.f>
			//   26   52:astore_2        
					if(((String) (e1)).length() > 0)
			//*  27   53:aload_2         
			//*  28   54:invokevirtual   #181 <Method int String.length()>
			//*  29   57:ifle            231
					{
						StringBuilder stringbuilder = new StringBuilder();
			//   30   60:new             #54  <Class StringBuilder>
			//   31   63:dup             
			//   32   64:invokespecial   #55  <Method void StringBuilder()>
			//   33   67:astore          4
						stringbuilder.append(((String) (a1)));
			//   34   69:aload           4
			//   35   71:aload_1         
			//   36   72:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
			//   37   75:pop             
						stringbuilder.append("/");
			//   38   76:aload           4
			//   39   78:ldc1            #183 <String "/">
			//   40   80:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
			//   41   83:pop             
						stringbuilder.append(((String) (e1)).substring(0, ((String) (e1)).lastIndexOf(".")));
			//   42   84:aload           4
			//   43   86:aload_2         
			//   44   87:iconst_0        
			//   45   88:aload_2         
			//   46   89:ldc1            #185 <String ".">
			//   47   91:invokevirtual   #189 <Method int String.lastIndexOf(String)>
			//   48   94:invokevirtual   #193 <Method String String.substring(int, int)>
			//   49   97:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
			//   50  100:pop             
						stringbuilder.append("/index.html");
			//   51  101:aload           4
			//   52  103:ldc1            #195 <String "/index.html">
			//   53  105:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
			//   54  108:pop             
						a1 = ((com.baidu.android.pushservice.richmedia.a) (stringbuilder.toString()));
			//   55  109:aload           4
			//   56  111:invokevirtual   #67  <Method String StringBuilder.toString()>
			//   57  114:astore_1        
						e1 = ((e) (new Intent()));
			//   58  115:new             #129 <Class Intent>
			//   59  118:dup             
			//   60  119:invokespecial   #130 <Method void Intent()>
			//   61  122:astore_2        
						((Intent) (e1)).setClass(((Context) (a)), com/baidu/android/pushservice/richmedia/MediaViewActivity);
			//   62  123:aload_2         
			//   63  124:aload_0         
			//   64  125:getfield        #18  <Field MediaListActivity a>
			//   65  128:ldc1            #197 <Class MediaViewActivity>
			//   66  130:invokevirtual   #201 <Method Intent Intent.setClass(Context, Class)>
			//   67  133:pop             
						int i1 = u.z(((Context) (a)), a.getPackageName());
			//   68  134:aload_0         
			//   69  135:getfield        #18  <Field MediaListActivity a>
			//   70  138:aload_0         
			//   71  139:getfield        #18  <Field MediaListActivity a>
			//   72  142:invokevirtual   #204 <Method String MediaListActivity.getPackageName()>
			//   73  145:invokestatic    #210 <Method int u.z(Context, String)>
			//   74  148:istore_3        
						a1 = ((com.baidu.android.pushservice.richmedia.a) (new File(((String) (a1)))));
			//   75  149:new             #212 <Class File>
			//   76  152:dup             
			//   77  153:aload_1         
			//   78  154:invokespecial   #215 <Method void File(String)>
			//   79  157:astore_1        
						if(i1 >= 24)
			//*  80  158:iload_3         
			//*  81  159:bipush          24
			//*  82  161:icmplt          204
						{
							ContentValues contentvalues = new ContentValues(1);
			//   83  164:new             #217 <Class ContentValues>
			//   84  167:dup             
			//   85  168:iconst_1        
			//   86  169:invokespecial   #220 <Method void ContentValues(int)>
			//   87  172:astore          4
							contentvalues.put("_data", ((File) (a1)).getAbsolutePath());
			//   88  174:aload           4
			//   89  176:ldc1            #222 <String "_data">
			//   90  178:aload_1         
			//   91  179:invokevirtual   #225 <Method String File.getAbsolutePath()>
			//   92  182:invokevirtual   #229 <Method void ContentValues.put(String, String)>
							a1 = ((com.baidu.android.pushservice.richmedia.a) (a.getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentvalues)));
			//   93  185:aload_0         
			//   94  186:getfield        #18  <Field MediaListActivity a>
			//   95  189:invokevirtual   #233 <Method ContentResolver MediaListActivity.getContentResolver()>
			//   96  192:getstatic       #239 <Field Uri android.provider.MediaStore$Images$Media.EXTERNAL_CONTENT_URI>
			//   97  195:aload           4
			//   98  197:invokevirtual   #245 <Method Uri ContentResolver.insert(Uri, ContentValues)>
			//   99  200:astore_1        
						} else
			//* 100  201:goto            209
						{
							a1 = ((com.baidu.android.pushservice.richmedia.a) (Uri.fromFile(((File) (a1)))));
			//  101  204:aload_1         
			//  102  205:invokestatic    #251 <Method Uri Uri.fromFile(File)>
			//  103  208:astore_1        
						}
						((Intent) (e1)).setData(((Uri) (a1)));
			//  104  209:aload_2         
			//  105  210:aload_1         
			//  106  211:invokevirtual   #255 <Method Intent Intent.setData(Uri)>
			//  107  214:pop             
						((Intent) (e1)).addFlags(0x10000000);
			//  108  215:aload_2         
			//  109  216:ldc2            #256 <Int 0x10000000>
			//  110  219:invokevirtual   #260 <Method Intent Intent.addFlags(int)>
			//  111  222:pop             
						a.startActivity(((Intent) (e1)));
			//  112  223:aload_0         
			//  113  224:getfield        #18  <Field MediaListActivity a>
			//  114  227:aload_2         
			//  115  228:invokevirtual   #264 <Method void MediaListActivity.startActivity(Intent)>
					}
				}
			//  116  231:return          
			}

			public void a(com.baidu.android.pushservice.richmedia.a a1, Throwable throwable)
			{
				a1 = ((com.baidu.android.pushservice.richmedia.a) (a1.d.c()));
			//    0    0:aload_1         
			//    1    1:getfield        #30  <Field c a.d>
			//    2    4:invokevirtual   #36  <Method String c.c()>
			//    3    7:astore_1        
				a.b.cancel(((String) (a1)), 0);
			//    4    8:aload_0         
			//    5    9:getfield        #18  <Field MediaListActivity a>
			//    6   12:getfield        #146 <Field NotificationManager MediaListActivity.b>
			//    7   15:aload_1         
			//    8   16:iconst_0        
			//    9   17:invokevirtual   #157 <Method void NotificationManager.cancel(String, int)>
				a.runOnUiThread(new Runnable(this) {

					public void run()
					{
						Toast toast = Toast.makeText(((Context) (a.a)), "\u4E0B\u8F7D\u5BCC\u5A92\u4F53\u5931\u8D25", 1);
					//    0    0:aload_0         
					//    1    1:getfield        #16  <Field MediaListActivity$4 a>
					//    2    4:getfield        #24  <Field MediaListActivity com.baidu.android.pushservice.richmedia.MediaListActivity$4.a>
					//    3    7:ldc1            #26  <String "\u4E0B\u8F7D\u5BCC\u5A92\u4F53\u5931\u8D25">
					//    4    9:iconst_1        
					//    5   10:invokestatic    #32  <Method Toast Toast.makeText(Context, CharSequence, int)>
					//    6   13:astore_1        
						toast.setGravity(17, 0, 0);
					//    7   14:aload_1         
					//    8   15:bipush          17
					//    9   17:iconst_0        
					//   10   18:iconst_0        
					//   11   19:invokevirtual   #36  <Method void Toast.setGravity(int, int, int)>
						toast.show();
					//   12   22:aload_1         
					//   13   23:invokevirtual   #39  <Method void Toast.show()>
					//   14   26:return          
					}

					final _cls4 a;

			
			{
				a = _pcls4;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MediaListActivity$4 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//   10   20:aload_0         
			//   11   21:getfield        #18  <Field MediaListActivity a>
			//   12   24:new             #13  <Class MediaListActivity$4$1>
			//   13   27:dup             
			//   14   28:aload_0         
			//   15   29:invokespecial   #268 <Method void MediaListActivity$4$1(MediaListActivity$4)>
			//   16   32:invokevirtual   #272 <Method void MediaListActivity.runOnUiThread(Runnable)>
			//   17   35:return          
			}

			public void b(com.baidu.android.pushservice.richmedia.a a1)
			{
				a1 = ((com.baidu.android.pushservice.richmedia.a) (a1.d.c()));
			//    0    0:aload_1         
			//    1    1:getfield        #30  <Field c a.d>
			//    2    4:invokevirtual   #36  <Method String c.c()>
			//    3    7:astore_1        
				a.b.cancel(((String) (a1)), 0);
			//    4    8:aload_0         
			//    5    9:getfield        #18  <Field MediaListActivity a>
			//    6   12:getfield        #146 <Field NotificationManager MediaListActivity.b>
			//    7   15:aload_1         
			//    8   16:iconst_0        
			//    9   17:invokevirtual   #157 <Method void NotificationManager.cancel(String, int)>
			//   10   20:return          
			}

			final MediaListActivity a;

			
			{
				a = MediaListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MediaListActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
, ((c) (obj)))).start();
	//   92  199:new             #163 <Class com.baidu.android.pushservice.richmedia.a>
	//   93  202:dup             
	//   94  203:aload_0         
	//   95  204:new             #16  <Class MediaListActivity$4>
	//   96  207:dup             
	//   97  208:aload_0         
	//   98  209:invokespecial   #164 <Method void MediaListActivity$4(MediaListActivity)>
	//   99  212:aload           4
	//  100  214:invokespecial   #167 <Method void com.baidu.android.pushservice.richmedia.a(Context, f, c)>
	//  101  217:invokevirtual   #170 <Method void a.start()>
	//  102  220:return          
	}

	static int b(MediaListActivity medialistactivity)
	{
		return medialistactivity.o;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field int o>
	//    2    4:ireturn         
	}

	static int c(MediaListActivity medialistactivity)
	{
		return medialistactivity.p;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field int p>
	//    2    4:ireturn         
	}

	static int d(MediaListActivity medialistactivity)
	{
		return medialistactivity.n;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field int n>
	//    2    4:ireturn         
	}

	static int e(MediaListActivity medialistactivity)
	{
		return medialistactivity.q;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field int q>
	//    2    4:ireturn         
	}

	static int f(MediaListActivity medialistactivity)
	{
		return medialistactivity.e;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field int e>
	//    2    4:ireturn         
	}

	static int g(MediaListActivity medialistactivity)
	{
		return medialistactivity.g;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field int g>
	//    2    4:ireturn         
	}

	static int h(MediaListActivity medialistactivity)
	{
		return medialistactivity.h;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int h>
	//    2    4:ireturn         
	}

	static int i(MediaListActivity medialistactivity)
	{
		return medialistactivity.i;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field int i>
	//    2    4:ireturn         
	}

	static int j(MediaListActivity medialistactivity)
	{
		return medialistactivity.j;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int j>
	//    2    4:ireturn         
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #193 <Method void Activity.onCreate(Bundle)>
		d = getResources().getIdentifier("bpush_media_list", "layout", getPackageName());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #197 <Method Resources getResources()>
	//    6   10:ldc1            #199 <String "bpush_media_list">
	//    7   12:ldc1            #201 <String "layout">
	//    8   14:aload_0         
	//    9   15:invokevirtual   #204 <Method String getPackageName()>
	//   10   18:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//   11   21:putfield        #212 <Field int d>
		requestWindowFeature(1);
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #216 <Method boolean requestWindowFeature(int)>
	//   15   29:pop             
		if(d != 0)
	//*  16   30:aload_0         
	//*  17   31:getfield        #212 <Field int d>
	//*  18   34:ifeq            357
		{
			setContentView(d);
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #212 <Field int d>
	//   22   42:invokevirtual   #220 <Method void setContentView(int)>
			bundle = ((Bundle) (getResources()));
	//   23   45:aload_0         
	//   24   46:invokevirtual   #197 <Method Resources getResources()>
	//   25   49:astore_1        
			String s1 = getPackageName();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #204 <Method String getPackageName()>
	//   28   54:astore_3        
			e = ((Resources) (bundle)).getIdentifier("bpush_media_list_item", "layout", s1);
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:ldc1            #222 <String "bpush_media_list_item">
	//   32   59:ldc1            #201 <String "layout">
	//   33   61:aload_3         
	//   34   62:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//   35   65:putfield        #181 <Field int e>
			f = ((Resources) (bundle)).getIdentifier("bpush_type_listview", "id", s1);
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:ldc1            #224 <String "bpush_type_listview">
	//   39   72:ldc1            #226 <String "id">
	//   40   74:aload_3         
	//   41   75:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//   42   78:putfield        #228 <Field int f>
			g = ((Resources) (bundle)).getIdentifier("bpush_media_list_img", "id", s1);
	//   43   81:aload_0         
	//   44   82:aload_1         
	//   45   83:ldc1            #230 <String "bpush_media_list_img">
	//   46   85:ldc1            #226 <String "id">
	//   47   87:aload_3         
	//   48   88:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//   49   91:putfield        #183 <Field int g>
			h = ((Resources) (bundle)).getIdentifier("bpush_media_list_title", "id", s1);
	//   50   94:aload_0         
	//   51   95:aload_1         
	//   52   96:ldc1            #232 <String "bpush_media_list_title">
	//   53   98:ldc1            #226 <String "id">
	//   54  100:aload_3         
	//   55  101:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//   56  104:putfield        #185 <Field int h>
			i = ((Resources) (bundle)).getIdentifier("bpush_media_list_from_text", "id", s1);
	//   57  107:aload_0         
	//   58  108:aload_1         
	//   59  109:ldc1            #234 <String "bpush_media_list_from_text">
	//   60  111:ldc1            #226 <String "id">
	//   61  113:aload_3         
	//   62  114:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//   63  117:putfield        #187 <Field int i>
			j = ((Resources) (bundle)).getIdentifier("bpush_media_list_time_text", "id", s1);
	//   64  120:aload_0         
	//   65  121:aload_1         
	//   66  122:ldc1            #236 <String "bpush_media_list_time_text">
	//   67  124:ldc1            #226 <String "id">
	//   68  126:aload_3         
	//   69  127:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//   70  130:putfield        #189 <Field int j>
			k = ((Resources) (bundle)).getIdentifier("bpush_media_none_layout", "id", s1);
	//   71  133:aload_0         
	//   72  134:aload_1         
	//   73  135:ldc1            #238 <String "bpush_media_none_layout">
	//   74  137:ldc1            #226 <String "id">
	//   75  139:aload_3         
	//   76  140:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//   77  143:putfield        #240 <Field int k>
			l = (LinearLayout)findViewById(k);
	//   78  146:aload_0         
	//   79  147:aload_0         
	//   80  148:aload_0         
	//   81  149:getfield        #240 <Field int k>
	//   82  152:invokevirtual   #244 <Method View findViewById(int)>
	//   83  155:checkcast       #246 <Class LinearLayout>
	//   84  158:putfield        #60  <Field LinearLayout l>
			c = (ListView)findViewById(f);
	//   85  161:aload_0         
	//   86  162:aload_0         
	//   87  163:aload_0         
	//   88  164:getfield        #228 <Field int f>
	//   89  167:invokevirtual   #244 <Method View findViewById(int)>
	//   90  170:checkcast       #248 <Class ListView>
	//   91  173:putfield        #250 <Field ListView c>
			bundle = ((Bundle) ((Button)findViewById(((Resources) (bundle)).getIdentifier("bpush_media_list_return_btn", "id", s1))));
	//   92  176:aload_0         
	//   93  177:aload_1         
	//   94  178:ldc1            #252 <String "bpush_media_list_return_btn">
	//   95  180:ldc1            #226 <String "id">
	//   96  182:aload_3         
	//   97  183:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//   98  186:invokevirtual   #244 <Method View findViewById(int)>
	//   99  189:checkcast       #254 <Class Button>
	//  100  192:astore_1        
			((Button) (bundle)).setClickable(true);
	//  101  193:aload_1         
	//  102  194:iconst_1        
	//  103  195:invokevirtual   #258 <Method void Button.setClickable(boolean)>
			((Button) (bundle)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MediaListActivity a>
				//    2    4:invokevirtual   #26  <Method void MediaListActivity.finish()>
				//    3    7:return          
				}

				final MediaListActivity a;

			
			{
				a = MediaListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaListActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  104  198:aload_1         
	//  105  199:new             #6   <Class MediaListActivity$1>
	//  106  202:dup             
	//  107  203:aload_0         
	//  108  204:invokespecial   #259 <Method void MediaListActivity$1(MediaListActivity)>
	//  109  207:invokevirtual   #263 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			int i1 = getResources().getIdentifier("bpush_download_progress", "layout", getPackageName());
	//  110  210:aload_0         
	//  111  211:invokevirtual   #197 <Method Resources getResources()>
	//  112  214:ldc2            #265 <String "bpush_download_progress">
	//  113  217:ldc1            #201 <String "layout">
	//  114  219:aload_0         
	//  115  220:invokevirtual   #204 <Method String getPackageName()>
	//  116  223:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//  117  226:istore_2        
			if(i1 != 0)
	//* 118  227:iload_2         
	//* 119  228:ifeq            327
			{
				m = new RemoteViews(getPackageName(), i1);
	//  120  231:aload_0         
	//  121  232:new             #267 <Class RemoteViews>
	//  122  235:dup             
	//  123  236:aload_0         
	//  124  237:invokevirtual   #204 <Method String getPackageName()>
	//  125  240:iload_2         
	//  126  241:invokespecial   #270 <Method void RemoteViews(String, int)>
	//  127  244:putfield        #71  <Field RemoteViews m>
				n = getResources().getIdentifier("bpush_downLoad_progress", "id", getPackageName());
	//  128  247:aload_0         
	//  129  248:aload_0         
	//  130  249:invokevirtual   #197 <Method Resources getResources()>
	//  131  252:ldc2            #272 <String "bpush_downLoad_progress">
	//  132  255:ldc1            #226 <String "id">
	//  133  257:aload_0         
	//  134  258:invokevirtual   #204 <Method String getPackageName()>
	//  135  261:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//  136  264:putfield        #177 <Field int n>
				o = getResources().getIdentifier("bpush_progress_percent", "id", getPackageName());
	//  137  267:aload_0         
	//  138  268:aload_0         
	//  139  269:invokevirtual   #197 <Method Resources getResources()>
	//  140  272:ldc2            #274 <String "bpush_progress_percent">
	//  141  275:ldc1            #226 <String "id">
	//  142  277:aload_0         
	//  143  278:invokevirtual   #204 <Method String getPackageName()>
	//  144  281:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//  145  284:putfield        #173 <Field int o>
				p = getResources().getIdentifier("bpush_progress_text", "id", getPackageName());
	//  146  287:aload_0         
	//  147  288:aload_0         
	//  148  289:invokevirtual   #197 <Method Resources getResources()>
	//  149  292:ldc2            #276 <String "bpush_progress_text">
	//  150  295:ldc1            #226 <String "id">
	//  151  297:aload_0         
	//  152  298:invokevirtual   #204 <Method String getPackageName()>
	//  153  301:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//  154  304:putfield        #175 <Field int p>
				q = getResources().getIdentifier("bpush_downLoad_icon", "id", getPackageName());
	//  155  307:aload_0         
	//  156  308:aload_0         
	//  157  309:invokevirtual   #197 <Method Resources getResources()>
	//  158  312:ldc2            #278 <String "bpush_downLoad_icon">
	//  159  315:ldc1            #226 <String "id">
	//  160  317:aload_0         
	//  161  318:invokevirtual   #204 <Method String getPackageName()>
	//  162  321:invokevirtual   #210 <Method int Resources.getIdentifier(String, String, String)>
	//  163  324:putfield        #179 <Field int q>
			}
			c.setOnItemClickListener(s);
	//  164  327:aload_0         
	//  165  328:getfield        #250 <Field ListView c>
	//  166  331:aload_0         
	//  167  332:getfield        #65  <Field android.widget.AdapterView$OnItemClickListener s>
	//  168  335:invokevirtual   #282 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			c.setDividerHeight(0);
	//  169  338:aload_0         
	//  170  339:getfield        #250 <Field ListView c>
	//  171  342:iconst_0        
	//  172  343:invokevirtual   #285 <Method void ListView.setDividerHeight(int)>
			c.setOnItemLongClickListener(t);
	//  173  346:aload_0         
	//  174  347:getfield        #250 <Field ListView c>
	//  175  350:aload_0         
	//  176  351:getfield        #68  <Field android.widget.AdapterView$OnItemLongClickListener t>
	//  177  354:invokevirtual   #289 <Method void ListView.setOnItemLongClickListener(android.widget.AdapterView$OnItemLongClickListener)>
		}
		b = (NotificationManager)getSystemService("notification");
	//  178  357:aload_0         
	//  179  358:aload_0         
	//  180  359:ldc2            #291 <String "notification">
	//  181  362:invokevirtual   #295 <Method Object getSystemService(String)>
	//  182  365:checkcast       #297 <Class NotificationManager>
	//  183  368:putfield        #299 <Field NotificationManager b>
	//  184  371:return          
	}

	public void onResume()
	{
		int i1;
		String as[];
		List list;
		PackageManager packagemanager;
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #304 <Method void Activity.onResume()>
		if(d == 0)
			break MISSING_BLOCK_LABEL_386;
	//    2    4:aload_0         
	//    3    5:getfield        #212 <Field int d>
	//    4    8:ifeq            386
		as = new String[4];
	//    5   11:iconst_4        
	//    6   12:anewarray       String[]
	//    7   15:astore_2        
		as[0] = "img";
	//    8   16:aload_2         
	//    9   17:iconst_0        
	//   10   18:ldc2            #306 <String "img">
	//   11   21:aastore         
		as[1] = "title";
	//   12   22:aload_2         
	//   13   23:iconst_1        
	//   14   24:ldc2            #308 <String "title">
	//   15   27:aastore         
		as[2] = "fromtext";
	//   16   28:aload_2         
	//   17   29:iconst_2        
	//   18   30:ldc2            #310 <String "fromtext">
	//   19   33:aastore         
		as[3] = "timetext";
	//   20   34:aload_2         
	//   21   35:iconst_3        
	//   22   36:ldc2            #312 <String "timetext">
	//   23   39:aastore         
		a = new ArrayList();
	//   24   40:aload_0         
	//   25   41:new             #314 <Class ArrayList>
	//   26   44:dup             
	//   27   45:invokespecial   #315 <Method void ArrayList()>
	//   28   48:putfield        #317 <Field ArrayList a>
		list = com.baidu.android.pushservice.h.o.b(((Context) (this)));
	//   29   51:aload_0         
	//   30   52:invokestatic    #322 <Method List o.b(Context)>
	//   31   55:astore_3        
		if(list == null || list.isEmpty())
	//*  32   56:aload_3         
	//*  33   57:ifnull          369
	//*  34   60:aload_3         
	//*  35   61:invokeinterface #328 <Method boolean List.isEmpty()>
	//*  36   66:ifeq            72
			break MISSING_BLOCK_LABEL_369;
	//   37   69:goto            369
		l.setVisibility(8);
	//   38   72:aload_0         
	//   39   73:getfield        #60  <Field LinearLayout l>
	//   40   76:bipush          8
	//   41   78:invokevirtual   #331 <Method void LinearLayout.setVisibility(int)>
		c.setVisibility(0);
	//   42   81:aload_0         
	//   43   82:getfield        #250 <Field ListView c>
	//   44   85:iconst_0        
	//   45   86:invokevirtual   #332 <Method void ListView.setVisibility(int)>
		c.setItemsCanFocus(true);
	//   46   89:aload_0         
	//   47   90:getfield        #250 <Field ListView c>
	//   48   93:iconst_1        
	//   49   94:invokevirtual   #335 <Method void ListView.setItemsCanFocus(boolean)>
		packagemanager = getPackageManager();
	//   50   97:aload_0         
	//   51   98:invokevirtual   #339 <Method PackageManager getPackageManager()>
	//   52  101:astore          4
		i1 = 0;
	//   53  103:iconst_0        
	//   54  104:istore_1        
_L3:
		if(i1 >= list.size()) goto _L2; else goto _L1
	//   55  105:iload_1         
	//   56  106:aload_3         
	//   57  107:invokeinterface #342 <Method int List.size()>
	//   58  112:icmpge          346
_L1:
		Object obj = ((Object) (new HashMap()));
	//   59  115:new             #344 <Class HashMap>
	//   60  118:dup             
	//   61  119:invokespecial   #345 <Method void HashMap()>
	//   62  122:astore          5
		android.content.pm.ApplicationInfo applicationinfo;
		applicationinfo = packagemanager.getApplicationInfo(((com.baidu.android.pushservice.h.o.h)list.get(i1)).a, 0);
	//   63  124:aload           4
	//   64  126:aload_3         
	//   65  127:iload_1         
	//   66  128:invokeinterface #349 <Method Object List.get(int)>
	//   67  133:checkcast       #351 <Class com.baidu.android.pushservice.h.o$h>
	//   68  136:getfield        #353 <Field String com.baidu.android.pushservice.h.o$h.a>
	//   69  139:iconst_0        
	//   70  140:invokevirtual   #359 <Method android.content.pm.ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   71  143:astore          6
		((HashMap) (obj)).put(((Object) (as[0])), ((Object) (packagemanager.getApplicationIcon(applicationinfo))));
	//   72  145:aload           5
	//   73  147:aload_2         
	//   74  148:iconst_0        
	//   75  149:aaload          
	//   76  150:aload           4
	//   77  152:aload           6
	//   78  154:invokevirtual   #363 <Method Drawable PackageManager.getApplicationIcon(android.content.pm.ApplicationInfo)>
	//   79  157:invokevirtual   #367 <Method Object HashMap.put(Object, Object)>
	//   80  160:pop             
		((HashMap) (obj)).put(((Object) (as[1])), ((Object) (((com.baidu.android.pushservice.h.o.h)list.get(i1)).c)));
	//   81  161:aload           5
	//   82  163:aload_2         
	//   83  164:iconst_1        
	//   84  165:aaload          
	//   85  166:aload_3         
	//   86  167:iload_1         
	//   87  168:invokeinterface #349 <Method Object List.get(int)>
	//   88  173:checkcast       #351 <Class com.baidu.android.pushservice.h.o$h>
	//   89  176:getfield        #368 <Field String com.baidu.android.pushservice.h.o$h.c>
	//   90  179:invokevirtual   #367 <Method Object HashMap.put(Object, Object)>
	//   91  182:pop             
		String s1 = as[2];
	//   92  183:aload_2         
	//   93  184:iconst_2        
	//   94  185:aaload          
	//   95  186:astore          7
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   96  188:new             #104 <Class StringBuilder>
	//   97  191:dup             
	//   98  192:invokespecial   #105 <Method void StringBuilder()>
	//   99  195:astore          8
			stringbuilder.append("\u6765\u81EA\uFF1A");
	//  100  197:aload           8
	//  101  199:ldc2            #370 <String "\u6765\u81EA\uFF1A">
	//  102  202:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  103  205:pop             
			stringbuilder.append(((Object) (packagemanager.getApplicationLabel(applicationinfo))));
	//  104  206:aload           8
	//  105  208:aload           4
	//  106  210:aload           6
	//  107  212:invokevirtual   #374 <Method CharSequence PackageManager.getApplicationLabel(android.content.pm.ApplicationInfo)>
	//  108  215:invokevirtual   #377 <Method StringBuilder StringBuilder.append(Object)>
	//  109  218:pop             
			((HashMap) (obj)).put(((Object) (s1)), ((Object) (stringbuilder.toString())));
	//  110  219:aload           5
	//  111  221:aload           7
	//  112  223:aload           8
	//  113  225:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  114  228:invokevirtual   #367 <Method Object HashMap.put(Object, Object)>
	//  115  231:pop             
			((HashMap) (obj)).put(((Object) (as[3])), ((Object) (u.a(((com.baidu.android.pushservice.h.o.h)list.get(i1)).j))));
	//  116  232:aload           5
	//  117  234:aload_2         
	//  118  235:iconst_3        
	//  119  236:aaload          
	//  120  237:aload_3         
	//  121  238:iload_1         
	//  122  239:invokeinterface #349 <Method Object List.get(int)>
	//  123  244:checkcast       #351 <Class com.baidu.android.pushservice.h.o$h>
	//  124  247:getfield        #380 <Field long com.baidu.android.pushservice.h.o$h.j>
	//  125  250:invokestatic    #385 <Method String u.a(long)>
	//  126  253:invokevirtual   #367 <Method Object HashMap.put(Object, Object)>
	//  127  256:pop             
			((HashMap) (obj)).put(((Object) (r)), ((Object) (((com.baidu.android.pushservice.h.o.h)list.get(i1)).b)));
	//  128  257:aload           5
	//  129  259:getstatic       #74  <Field String r>
	//  130  262:aload_3         
	//  131  263:iload_1         
	//  132  264:invokeinterface #349 <Method Object List.get(int)>
	//  133  269:checkcast       #351 <Class com.baidu.android.pushservice.h.o$h>
	//  134  272:getfield        #386 <Field String com.baidu.android.pushservice.h.o$h.b>
	//  135  275:invokevirtual   #367 <Method Object HashMap.put(Object, Object)>
	//  136  278:pop             
			a.add(obj);
	//  137  279:aload_0         
	//  138  280:getfield        #317 <Field ArrayList a>
	//  139  283:aload           5
	//  140  285:invokevirtual   #390 <Method boolean ArrayList.add(Object)>
	//  141  288:pop             
			continue; /* Loop/switch isn't completed */
	//  142  289:goto            339
		}
	//* 143  292:new             #104 <Class StringBuilder>
	//* 144  295:dup             
	//* 145  296:invokespecial   #105 <Method void StringBuilder()>
	//* 146  299:astore          5
	//* 147  301:aload           5
	//* 148  303:ldc2            #392 <String "Media item package NOT found: ">
	//* 149  306:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//* 150  309:pop             
	//* 151  310:aload           5
	//* 152  312:aload_3         
	//* 153  313:iload_1         
	//* 154  314:invokeinterface #349 <Method Object List.get(int)>
	//* 155  319:checkcast       #351 <Class com.baidu.android.pushservice.h.o$h>
	//* 156  322:getfield        #353 <Field String com.baidu.android.pushservice.h.o$h.a>
	//* 157  325:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//* 158  328:pop             
	//* 159  329:ldc1            #138 <String "MediaListActivity">
	//* 160  331:aload           5
	//* 161  333:invokevirtual   #130 <Method String StringBuilder.toString()>
	//* 162  336:invokestatic    #394 <Method void a.d(String, String)>
	//* 163  339:iload_1         
	//* 164  340:iconst_1        
	//* 165  341:iadd            
	//* 166  342:istore_1        
	//* 167  343:goto            105
	//* 168  346:new             #20  <Class MediaListActivity$a>
	//* 169  349:dup             
	//* 170  350:aload_0         
	//* 171  351:aload_0         
	//* 172  352:aload_0         
	//* 173  353:getfield        #317 <Field ArrayList a>
	//* 174  356:invokespecial   #397 <Method void MediaListActivity$a(MediaListActivity, Context, ArrayList)>
	//* 175  359:astore_2        
	//* 176  360:aload_0         
	//* 177  361:getfield        #250 <Field ListView c>
	//* 178  364:aload_2         
	//* 179  365:invokevirtual   #401 <Method void ListView.setAdapter(android.widget.ListAdapter)>
	//* 180  368:return          
	//* 181  369:aload_0         
	//* 182  370:getfield        #60  <Field LinearLayout l>
	//* 183  373:iconst_0        
	//* 184  374:invokevirtual   #331 <Method void LinearLayout.setVisibility(int)>
	//* 185  377:aload_0         
	//* 186  378:getfield        #250 <Field ListView c>
	//* 187  381:bipush          8
	//* 188  383:invokevirtual   #332 <Method void ListView.setVisibility(int)>
	//* 189  386:return          
		// Misplaced declaration of an exception variable
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		{
			obj = ((Object) (new StringBuilder()));
		}
		((StringBuilder) (obj)).append("Media item package NOT found: ");
		((StringBuilder) (obj)).append(((com.baidu.android.pushservice.h.o.h)list.get(i1)).a);
		com.baidu.android.pushservice.e.a.d("MediaListActivity", ((StringBuilder) (obj)).toString());
		i1++;
		  goto _L3
_L2:
		a a1 = new a(((Context) (this)), a);
		c.setAdapter(((android.widget.ListAdapter) (a1)));
		return;
		l.setVisibility(0);
		c.setVisibility(8);
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
	//* 190  387:astore          5
	//* 191  389:goto            292
	}

	private static String r = "downloadUrl";
	ArrayList a;
	NotificationManager b;
	private ListView c;
	private int d;
	private int e;
	private int f;
	private int g;
	private int h;
	private int i;
	private int j;
	private int k;
	private LinearLayout l;
	private RemoteViews m;
	private int n;
	private int o;
	private int p;
	private int q;
	private final android.widget.AdapterView.OnItemClickListener s = new android.widget.AdapterView.OnItemClickListener() {

		public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
		{
			adapterview = ((AdapterView) ((String)((HashMap)adapterview.getItemAtPosition(i1)).get(((Object) (com.baidu.android.pushservice.richmedia.MediaListActivity.a())))));
		//    0    0:aload_1         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #26  <Method Object AdapterView.getItemAtPosition(int)>
		//    3    5:checkcast       #28  <Class HashMap>
		//    4    8:invokestatic    #31  <Method String com.baidu.android.pushservice.richmedia.MediaListActivity.a()>
		//    5   11:invokevirtual   #35  <Method Object HashMap.get(Object)>
		//    6   14:checkcast       #37  <Class String>
		//    7   17:astore_1        
			view = ((View) (com.baidu.android.pushservice.h.o.a(((Context) (a)), ((String) (adapterview)))));
		//    8   18:aload_0         
		//    9   19:getfield        #14  <Field MediaListActivity a>
		//   10   22:aload_1         
		//   11   23:invokestatic    #42  <Method com.baidu.android.pushservice.h.o$h o.a(Context, String)>
		//   12   26:astore_2        
			if(view != null)
		//*  13   27:aload_2         
		//*  14   28:ifnull          248
				if(((com.baidu.android.pushservice.h.o.h) (view)).i == com.baidu.android.pushservice.richmedia.a.f)
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
						((Intent) (view)).setClass(((Context) (a)), com/baidu/android/pushservice/richmedia/MediaViewActivity);
		//   60  121:aload_2         
		//   61  122:aload_0         
		//   62  123:getfield        #14  <Field MediaListActivity a>
		//   63  126:ldc1            #92  <Class MediaViewActivity>
		//   64  128:invokevirtual   #96  <Method Intent Intent.setClass(Context, Class)>
		//   65  131:pop             
						i1 = u.z(((Context) (a)), a.getPackageName());
		//   66  132:aload_0         
		//   67  133:getfield        #14  <Field MediaListActivity a>
		//   68  136:aload_0         
		//   69  137:getfield        #14  <Field MediaListActivity a>
		//   70  140:invokevirtual   #99  <Method String MediaListActivity.getPackageName()>
		//   71  143:invokestatic    #105 <Method int u.z(Context, String)>
		//   72  146:istore_3        
						adapterview = ((AdapterView) (new File(((String) (adapterview)))));
		//   73  147:new             #107 <Class File>
		//   74  150:dup             
		//   75  151:aload_1         
		//   76  152:invokespecial   #110 <Method void File(String)>
		//   77  155:astore_1        
						if(i1 >= 24)
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
							adapterview = ((AdapterView) (a.getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentvalues)));
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
					com.baidu.android.pushservice.richmedia.MediaListActivity.a(a, ((com.baidu.android.pushservice.h.o.h) (view)).b, ((com.baidu.android.pushservice.h.o.h) (view)).c, ((com.baidu.android.pushservice.h.o.h) (view)).d);
		//  115  229:aload_0         
		//  116  230:getfield        #14  <Field MediaListActivity a>
		//  117  233:aload_2         
		//  118  234:getfield        #162 <Field String com.baidu.android.pushservice.h.o$h.b>
		//  119  237:aload_2         
		//  120  238:getfield        #165 <Field String com.baidu.android.pushservice.h.o$h.c>
		//  121  241:aload_2         
		//  122  242:getfield        #168 <Field String com.baidu.android.pushservice.h.o$h.d>
		//  123  245:invokestatic    #171 <Method void com.baidu.android.pushservice.richmedia.MediaListActivity.a(MediaListActivity, String, String, String)>
				}
		//  124  248:return          
		}

		final MediaListActivity a;

			
			{
				a = MediaListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MediaListActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final android.widget.AdapterView.OnItemLongClickListener t = new android.widget.AdapterView.OnItemLongClickListener() {

		public boolean onItemLongClick(AdapterView adapterview, View view, int i1, long l1)
		{
			(new android.app.AlertDialog.Builder(((Context) (a)))).setTitle("\u63D0\u793A").setMessage("\u786E\u5B9A\u8981\u5220\u9664\u8BE5\u8BB0\u5F55\uFF1F").setPositiveButton("\u786E\u5B9A", new android.content.DialogInterface.OnClickListener(this, l1) {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					dialoginterface = ((DialogInterface) ((String)((Map)b.a.a.get((int)a)).get(((Object) (com.baidu.android.pushservice.richmedia.MediaListActivity.a())))));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field MediaListActivity$3 b>
				//    2    4:getfield        #30  <Field MediaListActivity com.baidu.android.pushservice.richmedia.MediaListActivity$3.a>
				//    3    7:getfield        #35  <Field ArrayList com.baidu.android.pushservice.richmedia.MediaListActivity.a>
				//    4   10:aload_0         
				//    5   11:getfield        #21  <Field long a>
				//    6   14:l2i             
				//    7   15:invokevirtual   #41  <Method Object ArrayList.get(int)>
				//    8   18:checkcast       #43  <Class Map>
				//    9   21:invokestatic    #46  <Method String com.baidu.android.pushservice.richmedia.MediaListActivity.a()>
				//   10   24:invokeinterface #49  <Method Object Map.get(Object)>
				//   11   29:checkcast       #51  <Class String>
				//   12   32:astore_1        
					com.baidu.android.pushservice.h.o.h h1 = com.baidu.android.pushservice.h.o.a(((Context) (b.a)), ((String) (dialoginterface)));
				//   13   33:aload_0         
				//   14   34:getfield        #19  <Field MediaListActivity$3 b>
				//   15   37:getfield        #30  <Field MediaListActivity com.baidu.android.pushservice.richmedia.MediaListActivity$3.a>
				//   16   40:aload_1         
				//   17   41:invokestatic    #56  <Method com.baidu.android.pushservice.h.o$h o.a(Context, String)>
				//   18   44:astore_3        
					if(h1 != null)
				//*  19   45:aload_3         
				//*  20   46:ifnull          64
						(new File(h1.e)).delete();
				//   21   49:new             #58  <Class File>
				//   22   52:dup             
				//   23   53:aload_3         
				//   24   54:getfield        #64  <Field String com.baidu.android.pushservice.h.o$h.e>
				//   25   57:invokespecial   #67  <Method void File(String)>
				//   26   60:invokevirtual   #71  <Method boolean File.delete()>
				//   27   63:pop             
					com.baidu.android.pushservice.h.o.b(((Context) (b.a)), ((String) (dialoginterface)));
				//   28   64:aload_0         
				//   29   65:getfield        #19  <Field MediaListActivity$3 b>
				//   30   68:getfield        #30  <Field MediaListActivity com.baidu.android.pushservice.richmedia.MediaListActivity$3.a>
				//   31   71:aload_1         
				//   32   72:invokestatic    #74  <Method int o.b(Context, String)>
				//   33   75:pop             
					dialoginterface = ((DialogInterface) (new Intent()));
				//   34   76:new             #76  <Class Intent>
				//   35   79:dup             
				//   36   80:invokespecial   #77  <Method void Intent()>
				//   37   83:astore_1        
					((Intent) (dialoginterface)).setClass(((Context) (b.a)), com/baidu/android/pushservice/richmedia/MediaListActivity);
				//   38   84:aload_1         
				//   39   85:aload_0         
				//   40   86:getfield        #19  <Field MediaListActivity$3 b>
				//   41   89:getfield        #30  <Field MediaListActivity com.baidu.android.pushservice.richmedia.MediaListActivity$3.a>
				//   42   92:ldc1            #32  <Class MediaListActivity>
				//   43   94:invokevirtual   #81  <Method Intent Intent.setClass(Context, Class)>
				//   44   97:pop             
					b.a.startActivity(((Intent) (dialoginterface)));
				//   45   98:aload_0         
				//   46   99:getfield        #19  <Field MediaListActivity$3 b>
				//   47  102:getfield        #30  <Field MediaListActivity com.baidu.android.pushservice.richmedia.MediaListActivity$3.a>
				//   48  105:aload_1         
				//   49  106:invokevirtual   #85  <Method void MediaListActivity.startActivity(Intent)>
				//   50  109:return          
				}

				final long a;
				final _cls3 b;

			
			{
				b = _pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MediaListActivity$3 b>
				a = l1;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #21  <Field long a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
).setNegativeButton("\u53D6\u6D88", new android.content.DialogInterface.OnClickListener(this) {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
				//    0    0:return          
				}

				final _cls3 a;

			
			{
				a = _pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaListActivity$3 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
		//    0    0:new             #26  <Class android.app.AlertDialog$Builder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field MediaListActivity a>
		//    4    8:invokespecial   #29  <Method void android.app.AlertDialog$Builder(Context)>
		//    5   11:ldc1            #31  <String "\u63D0\u793A">
		//    6   13:invokevirtual   #35  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
		//    7   16:ldc1            #37  <String "\u786E\u5B9A\u8981\u5220\u9664\u8BE5\u8BB0\u5F55\uFF1F">
		//    8   18:invokevirtual   #40  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
		//    9   21:ldc1            #42  <String "\u786E\u5B9A">
		//   10   23:new             #12  <Class MediaListActivity$3$2>
		//   11   26:dup             
		//   12   27:aload_0         
		//   13   28:lload           4
		//   14   30:invokespecial   #45  <Method void MediaListActivity$3$2(MediaListActivity$3, long)>
		//   15   33:invokevirtual   #49  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
		//   16   36:ldc1            #51  <String "\u53D6\u6D88">
		//   17   38:new             #10  <Class MediaListActivity$3$1>
		//   18   41:dup             
		//   19   42:aload_0         
		//   20   43:invokespecial   #54  <Method void MediaListActivity$3$1(MediaListActivity$3)>
		//   21   46:invokevirtual   #57  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
		//   22   49:invokevirtual   #61  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
		//   23   52:pop             
			return true;
		//   24   53:iconst_1        
		//   25   54:ireturn         
		}

		final MediaListActivity a;

			
			{
				a = MediaListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MediaListActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}
;

	static 
	{
	//    0    0:return          
	}
}
