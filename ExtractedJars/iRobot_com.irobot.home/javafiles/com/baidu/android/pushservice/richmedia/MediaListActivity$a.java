// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.richmedia;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.*;
import android.widget.*;
import com.baidu.android.pushservice.e.a;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.baidu.android.pushservice.richmedia:
//			MediaListActivity

public class MediaListActivity$a extends BaseAdapter
{

	public int getCount()
	{
		return c.size();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ArrayList c>
	//    2    4:invokevirtual   #34  <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public Object getItem(int i)
	{
		if(c != null && i < c.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ArrayList c>
	//*   2    4:ifnull          27
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #24  <Field ArrayList c>
	//*   6   12:invokevirtual   #34  <Method int ArrayList.size()>
	//*   7   15:icmpge          27
			return c.get(i);
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

	public long getItemId(int i)
	{
		return (long)i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lreturn         
	}

	public View getView(int i, View view, ViewGroup viewgroup)
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
		if(c == null || i >= c.size())
			break MISSING_BLOCK_LABEL_282;
	//   41   91:aload_0         
	//   42   92:getfield        #24  <Field ArrayList c>
	//   43   95:ifnull          282
	//   44   98:iload_1         
	//   45   99:aload_0         
	//   46  100:getfield        #24  <Field ArrayList c>
	//   47  103:invokevirtual   #34  <Method int ArrayList.size()>
	//   48  106:icmpge          282
		hashmap = (HashMap)c.get(i);
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

	public MediaListActivity$a(MediaListActivity medialistactivity, Context context, ArrayList arraylist)
	{
		a = medialistactivity;
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
