// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.richmedia;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.baidu.android.pushservice.h.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.baidu.android.pushservice.richmedia:
//			MediaListActivity

class MediaListActivity$3$1
	implements android.content.kListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
	//    0    0:return          
	}

	final MediaListActivity._cls3 a;

	MediaListActivity$3$1(MediaListActivity._cls3 _pcls3)
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

	// Unreferenced inner class com/baidu/android/pushservice/richmedia/MediaListActivity$3

/* anonymous class */
	class MediaListActivity._cls3
		implements android.widget.AdapterView.OnItemLongClickListener
	{

		public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
		{
			(new android.app.AlertDialog.Builder(((android.content.Context) (a)))).setTitle("\u63D0\u793A").setMessage("\u786E\u5B9A\u8981\u5220\u9664\u8BE5\u8BB0\u5F55\uFF1F").setPositiveButton("\u786E\u5B9A", new MediaListActivity._cls3._cls2(l)).setNegativeButton("\u53D6\u6D88", ((android.content.DialogInterface.OnClickListener) (new MediaListActivity._cls3._cls1(this)))).show();
		//    0    0:new             #26  <Class android.app.AlertDialog$Builder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field MediaListActivity a>
		//    4    8:invokespecial   #29  <Method void android.app.AlertDialog$Builder(android.content.Context)>
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
				a = medialistactivity;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MediaListActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}

		// Unreferenced inner class com/baidu/android/pushservice/richmedia/MediaListActivity$3$2

/* anonymous class */
		class MediaListActivity._cls3._cls2
			implements android.content.DialogInterface.OnClickListener
		{

			public void onClick(DialogInterface dialoginterface, int i)
			{
				dialoginterface = ((DialogInterface) ((String)((Map)b.a.a.get((int)a)).get(((Object) (MediaListActivity.a())))));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field MediaListActivity$3 b>
			//    2    4:getfield        #30  <Field MediaListActivity MediaListActivity$3.a>
			//    3    7:getfield        #35  <Field ArrayList MediaListActivity.a>
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field long a>
			//    6   14:l2i             
			//    7   15:invokevirtual   #41  <Method Object ArrayList.get(int)>
			//    8   18:checkcast       #43  <Class Map>
			//    9   21:invokestatic    #46  <Method String MediaListActivity.a()>
			//   10   24:invokeinterface #49  <Method Object Map.get(Object)>
			//   11   29:checkcast       #51  <Class String>
			//   12   32:astore_1        
				com.baidu.android.pushservice.h.o.h h = o.a(((android.content.Context) (b.a)), ((String) (dialoginterface)));
			//   13   33:aload_0         
			//   14   34:getfield        #19  <Field MediaListActivity$3 b>
			//   15   37:getfield        #30  <Field MediaListActivity MediaListActivity$3.a>
			//   16   40:aload_1         
			//   17   41:invokestatic    #56  <Method com.baidu.android.pushservice.h.o$h o.a(android.content.Context, String)>
			//   18   44:astore_3        
				if(h != null)
			//*  19   45:aload_3         
			//*  20   46:ifnull          64
					(new File(h.e)).delete();
			//   21   49:new             #58  <Class File>
			//   22   52:dup             
			//   23   53:aload_3         
			//   24   54:getfield        #64  <Field String com.baidu.android.pushservice.h.o$h.e>
			//   25   57:invokespecial   #67  <Method void File(String)>
			//   26   60:invokevirtual   #71  <Method boolean File.delete()>
			//   27   63:pop             
				o.b(((android.content.Context) (b.a)), ((String) (dialoginterface)));
			//   28   64:aload_0         
			//   29   65:getfield        #19  <Field MediaListActivity$3 b>
			//   30   68:getfield        #30  <Field MediaListActivity MediaListActivity$3.a>
			//   31   71:aload_1         
			//   32   72:invokestatic    #74  <Method int o.b(android.content.Context, String)>
			//   33   75:pop             
				dialoginterface = ((DialogInterface) (new Intent()));
			//   34   76:new             #76  <Class Intent>
			//   35   79:dup             
			//   36   80:invokespecial   #77  <Method void Intent()>
			//   37   83:astore_1        
				((Intent) (dialoginterface)).setClass(((android.content.Context) (b.a)), com/baidu/android/pushservice/richmedia/MediaListActivity);
			//   38   84:aload_1         
			//   39   85:aload_0         
			//   40   86:getfield        #19  <Field MediaListActivity$3 b>
			//   41   89:getfield        #30  <Field MediaListActivity MediaListActivity$3.a>
			//   42   92:ldc1            #32  <Class MediaListActivity>
			//   43   94:invokevirtual   #81  <Method Intent Intent.setClass(android.content.Context, Class)>
			//   44   97:pop             
				b.a.startActivity(((Intent) (dialoginterface)));
			//   45   98:aload_0         
			//   46   99:getfield        #19  <Field MediaListActivity$3 b>
			//   47  102:getfield        #30  <Field MediaListActivity MediaListActivity$3.a>
			//   48  105:aload_1         
			//   49  106:invokevirtual   #85  <Method void MediaListActivity.startActivity(Intent)>
			//   50  109:return          
			}

			final long a;
			final MediaListActivity._cls3 b;

					
					{
						b = MediaListActivity._cls3.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #19  <Field MediaListActivity$3 b>
						a = l;
					//    3    5:aload_0         
					//    4    6:lload_2         
					//    5    7:putfield        #21  <Field long a>
						super();
					//    6   10:aload_0         
					//    7   11:invokespecial   #24  <Method void Object()>
					//    8   14:return          
					}
		}

	}

}
