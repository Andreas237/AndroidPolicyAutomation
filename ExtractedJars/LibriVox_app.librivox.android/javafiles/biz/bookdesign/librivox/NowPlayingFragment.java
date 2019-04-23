// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.app.ActivityOptions;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import biz.bookdesign.librivox.a.g;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.i;
import biz.bookdesign.librivox.audio.LocalAudioService;
import biz.bookdesign.librivox.b.a;
import biz.bookdesign.librivox.b.m;
import com.squareup.picasso.al;
import com.squareup.picasso.bb;

// Referenced classes of package biz.bookdesign.librivox:
//			bi, dq, dh, di

public class NowPlayingFragment extends Fragment
{

	public NowPlayingFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Fragment()>
	//    2    4:return          
	}

	private void a()
	{
		if(a.f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field bi a>
	//*   2    4:getfield        #27  <Field LocalAudioService bi.f>
	//*   3    7:ifnonnull       11
			return;
	//    4   10:return          
		Object obj = ((Object) (a.f.f()));
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field bi a>
	//    7   15:getfield        #27  <Field LocalAudioService bi.f>
	//    8   18:invokevirtual   #32  <Method m LocalAudioService.f()>
	//    9   21:astore_3        
		if(obj == null)
	//*  10   22:aload_3         
	//*  11   23:ifnonnull       31
		{
			b();
	//   12   26:aload_0         
	//   13   27:invokespecial   #34  <Method void b()>
			return;
	//   14   30:return          
		}
		a a1 = ((m) (obj)).k();
	//   15   31:aload_3         
	//   16   32:invokevirtual   #40  <Method a m.k()>
	//   17   35:astore_1        
		FloatingActionButton floatingactionbutton = (FloatingActionButton)b.findViewById(h.play_button);
	//   18   36:aload_0         
	//   19   37:getfield        #42  <Field ViewGroup b>
	//   20   40:getstatic       #48  <Field int h.play_button>
	//   21   43:invokevirtual   #54  <Method View ViewGroup.findViewById(int)>
	//   22   46:checkcast       #56  <Class FloatingActionButton>
	//   23   49:astore_2        
		dq dq1 = e;
	//   24   50:aload_0         
	//   25   51:getfield        #58  <Field dq e>
	//   26   54:astore          4
		if(dq1 == null || dq1.f() != a1)
	//*  27   56:aload           4
	//*  28   58:ifnull          70
	//*  29   61:aload           4
	//*  30   63:invokevirtual   #62  <Method a dq.f()>
	//*  31   66:aload_1         
	//*  32   67:if_acmpeq       87
			e = new dq(a, ((android.widget.ImageButton) (floatingactionbutton)), a1);
	//   33   70:aload_0         
	//   34   71:new             #60  <Class dq>
	//   35   74:dup             
	//   36   75:aload_0         
	//   37   76:getfield        #21  <Field bi a>
	//   38   79:aload_2         
	//   39   80:aload_1         
	//   40   81:invokespecial   #65  <Method void dq(bi, android.widget.ImageButton, a)>
	//   41   84:putfield        #58  <Field dq e>
		((TextView)b.findViewById(h.title)).setText(((CharSequence) (a1.b())));
	//   42   87:aload_0         
	//   43   88:getfield        #42  <Field ViewGroup b>
	//   44   91:getstatic       #68  <Field int h.title>
	//   45   94:invokevirtual   #54  <Method View ViewGroup.findViewById(int)>
	//   46   97:checkcast       #70  <Class TextView>
	//   47  100:aload_1         
	//   48  101:invokevirtual   #75  <Method String a.b()>
	//   49  104:invokevirtual   #79  <Method void TextView.setText(CharSequence)>
		((TextView)b.findViewById(h.author)).setText(((CharSequence) (a1.d())));
	//   50  107:aload_0         
	//   51  108:getfield        #42  <Field ViewGroup b>
	//   52  111:getstatic       #82  <Field int h.author>
	//   53  114:invokevirtual   #54  <Method View ViewGroup.findViewById(int)>
	//   54  117:checkcast       #70  <Class TextView>
	//   55  120:aload_1         
	//   56  121:invokevirtual   #84  <Method String a.d()>
	//   57  124:invokevirtual   #79  <Method void TextView.setText(CharSequence)>
		((TextView)b.findViewById(h.chapter)).setText(((CharSequence) (((m) (obj)).l())));
	//   58  127:aload_0         
	//   59  128:getfield        #42  <Field ViewGroup b>
	//   60  131:getstatic       #87  <Field int h.chapter>
	//   61  134:invokevirtual   #54  <Method View ViewGroup.findViewById(int)>
	//   62  137:checkcast       #70  <Class TextView>
	//   63  140:aload_3         
	//   64  141:invokevirtual   #90  <Method String m.l()>
	//   65  144:invokevirtual   #79  <Method void TextView.setText(CharSequence)>
		obj = ((Object) ((ImageView)b.findViewById(h.cover_image)));
	//   66  147:aload_0         
	//   67  148:getfield        #42  <Field ViewGroup b>
	//   68  151:getstatic       #93  <Field int h.cover_image>
	//   69  154:invokevirtual   #54  <Method View ViewGroup.findViewById(int)>
	//   70  157:checkcast       #95  <Class ImageView>
	//   71  160:astore_3        
		al.b().a(a1.a()).b(g.default_book_image).a(g.default_book_image).a(((ImageView) (obj)));
	//   72  161:invokestatic    #100 <Method al al.b()>
	//   73  164:aload_1         
	//   74  165:invokevirtual   #102 <Method String a.a()>
	//   75  168:invokevirtual   #105 <Method bb al.a(String)>
	//   76  171:getstatic       #110 <Field int g.default_book_image>
	//   77  174:invokevirtual   #115 <Method bb bb.b(int)>
	//   78  177:getstatic       #110 <Field int g.default_book_image>
	//   79  180:invokevirtual   #117 <Method bb bb.a(int)>
	//   80  183:aload_3         
	//   81  184:invokevirtual   #120 <Method void bb.a(ImageView)>
		b.setVisibility(0);
	//   82  187:aload_0         
	//   83  188:getfield        #42  <Field ViewGroup b>
	//   84  191:iconst_0        
	//   85  192:invokevirtual   #124 <Method void ViewGroup.setVisibility(int)>
		b.setOnClickListener(((android.view.View.OnClickListener) (new dh(this, ((ImageView) (obj)), floatingactionbutton, a1))));
	//   86  195:aload_0         
	//   87  196:getfield        #42  <Field ViewGroup b>
	//   88  199:new             #126 <Class dh>
	//   89  202:dup             
	//   90  203:aload_0         
	//   91  204:aload_3         
	//   92  205:aload_2         
	//   93  206:aload_1         
	//   94  207:invokespecial   #129 <Method void dh(NowPlayingFragment, ImageView, FloatingActionButton, a)>
	//   95  210:invokevirtual   #133 <Method void ViewGroup.setOnClickListener(android.view.View$OnClickListener)>
		e.c();
	//   96  213:aload_0         
	//   97  214:getfield        #58  <Field dq e>
	//   98  217:invokevirtual   #135 <Method void dq.c()>
		e.e();
	//   99  220:aload_0         
	//  100  221:getfield        #58  <Field dq e>
	//  101  224:invokevirtual   #137 <Method void dq.e()>
	//  102  227:return          
	}

	private void a(View view, View view1, a a1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #143 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          41
			view = ((View) (ActivityOptions.makeSceneTransitionAnimation(((android.app.Activity) (a)), new Pair[] {
				Pair.create(((Object) (view1)), "play_button"), Pair.create(((Object) (view)), "album_cover")
			})));
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field bi a>
	//    5   12:iconst_2        
	//    6   13:anewarray       Pair[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:aload_2         
	//   10   19:ldc1            #146 <String "play_button">
	//   11   21:invokestatic    #150 <Method Pair Pair.create(Object, Object)>
	//   12   24:aastore         
	//   13   25:dup             
	//   14   26:iconst_1        
	//   15   27:aload_1         
	//   16   28:ldc1            #152 <String "album_cover">
	//   17   30:invokestatic    #150 <Method Pair Pair.create(Object, Object)>
	//   18   33:aastore         
	//   19   34:invokestatic    #158 <Method ActivityOptions ActivityOptions.makeSceneTransitionAnimation(android.app.Activity, Pair[])>
	//   20   37:astore_1        
		else
	//*  21   38:goto            43
			view = null;
	//   22   41:aconst_null     
	//   23   42:astore_1        
		a1.b(((android.support.v4.app.x) (a)), ((ActivityOptions) (view)));
	//   24   43:aload_3         
	//   25   44:aload_0         
	//   26   45:getfield        #21  <Field bi a>
	//   27   48:aload_1         
	//   28   49:invokevirtual   #161 <Method void a.b(android.support.v4.app.x, ActivityOptions)>
	//   29   52:return          
	}

	static void a(NowPlayingFragment nowplayingfragment)
	{
		nowplayingfragment.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void b()>
	//    2    4:return          
	}

	static void a(NowPlayingFragment nowplayingfragment, View view, View view1, a a1)
	{
		nowplayingfragment.a(view, view1, a1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #165 <Method void a(View, View, a)>
	//    5    7:return          
	}

	private void b()
	{
		b.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ViewGroup b>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #124 <Method void ViewGroup.setVisibility(int)>
	//    4    9:return          
	}

	static void b(NowPlayingFragment nowplayingfragment)
	{
		nowplayingfragment.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #167 <Method void a()>
	//    2    4:return          
	}

	static dq c(NowPlayingFragment nowplayingfragment)
	{
		return nowplayingfragment.e;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field dq e>
	//    2    4:areturn         
	}

	public void onActivityCreated(Bundle bundle)
	{
		super.onActivityCreated(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #172 <Method void Fragment.onActivityCreated(Bundle)>
		a = (bi)super.getActivity();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #176 <Method android.support.v4.app.x Fragment.getActivity()>
	//    6   10:checkcast       #23  <Class bi>
	//    7   13:putfield        #21  <Field bi a>
	//    8   16:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		d = android.support.v4.a.g.a(((android.content.Context) (a)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field bi a>
	//    3    5:invokestatic    #183 <Method android.support.v4.a.g android.support.v4.a.g.a(android.content.Context)>
	//    4    8:putfield        #185 <Field android.support.v4.a.g d>
		c = new di(this, ((dh) (null)));
	//    5   11:aload_0         
	//    6   12:new             #187 <Class di>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:invokespecial   #190 <Method void di(NowPlayingFragment, dh)>
	//   11   21:putfield        #192 <Field di c>
		b = (ViewGroup)layoutinflater.inflate(i.now_playing, viewgroup, false);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getstatic       #197 <Field int i.now_playing>
	//   15   29:aload_2         
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #203 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   18   34:checkcast       #50  <Class ViewGroup>
	//   19   37:putfield        #42  <Field ViewGroup b>
		return ((View) (b));
	//   20   40:aload_0         
	//   21   41:getfield        #42  <Field ViewGroup b>
	//   22   44:areturn         
	}

	public void onDestroyView()
	{
		d.a(((android.content.BroadcastReceiver) (c)));
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field android.support.v4.a.g d>
	//    2    4:aload_0         
	//    3    5:getfield        #192 <Field di c>
	//    4    8:invokevirtual   #207 <Method void android.support.v4.a.g.a(android.content.BroadcastReceiver)>
		super.onDestroyView();
	//    5   11:aload_0         
	//    6   12:invokespecial   #209 <Method void Fragment.onDestroyView()>
	//    7   15:return          
	}

	public void onPause()
	{
		d.a(((android.content.BroadcastReceiver) (c)));
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field android.support.v4.a.g d>
	//    2    4:aload_0         
	//    3    5:getfield        #192 <Field di c>
	//    4    8:invokevirtual   #207 <Method void android.support.v4.a.g.a(android.content.BroadcastReceiver)>
		super.onPause();
	//    5   11:aload_0         
	//    6   12:invokespecial   #212 <Method void Fragment.onPause()>
	//    7   15:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #215 <Method void Fragment.onResume()>
		IntentFilter intentfilter = new IntentFilter();
	//    2    4:new             #217 <Class IntentFilter>
	//    3    7:dup             
	//    4    8:invokespecial   #218 <Method void IntentFilter()>
	//    5   11:astore_1        
		intentfilter.addAction("biz.bookdesign.librivox.CHAPTER_NOTIFICATION");
	//    6   12:aload_1         
	//    7   13:ldc1            #220 <String "biz.bookdesign.librivox.CHAPTER_NOTIFICATION">
	//    8   15:invokevirtual   #224 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.PAUSE_NOTIFICATION");
	//    9   18:aload_1         
	//   10   19:ldc1            #226 <String "biz.bookdesign.librivox.PAUSE_NOTIFICATION">
	//   11   21:invokevirtual   #224 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.ERROR");
	//   12   24:aload_1         
	//   13   25:ldc1            #228 <String "biz.bookdesign.librivox.ERROR">
	//   14   27:invokevirtual   #224 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.COMPLETED");
	//   15   30:aload_1         
	//   16   31:ldc1            #230 <String "biz.bookdesign.librivox.COMPLETED">
	//   17   33:invokevirtual   #224 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.BUFFERING_START");
	//   18   36:aload_1         
	//   19   37:ldc1            #232 <String "biz.bookdesign.librivox.BUFFERING_START">
	//   20   39:invokevirtual   #224 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.BUFFERING_STOP");
	//   21   42:aload_1         
	//   22   43:ldc1            #234 <String "biz.bookdesign.librivox.BUFFERING_STOP">
	//   23   45:invokevirtual   #224 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.SERVICE_CONNECTED_NOTIFICATION");
	//   24   48:aload_1         
	//   25   49:ldc1            #236 <String "biz.bookdesign.librivox.SERVICE_CONNECTED_NOTIFICATION">
	//   26   51:invokevirtual   #224 <Method void IntentFilter.addAction(String)>
		d.a(((android.content.BroadcastReceiver) (c)), intentfilter);
	//   27   54:aload_0         
	//   28   55:getfield        #185 <Field android.support.v4.a.g d>
	//   29   58:aload_0         
	//   30   59:getfield        #192 <Field di c>
	//   31   62:aload_1         
	//   32   63:invokevirtual   #239 <Method void android.support.v4.a.g.a(android.content.BroadcastReceiver, IntentFilter)>
		a();
	//   33   66:aload_0         
	//   34   67:invokespecial   #167 <Method void a()>
	//   35   70:return          
	}

	private bi a;
	private ViewGroup b;
	private di c;
	private android.support.v4.a.g d;
	private dq e;
}
