// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.*;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			ab

public class z extends ImageView
	implements android.view.View.OnClickListener
{

	public z(Context context, ab ab1, CompanionData companiondata, String s, List list)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void ImageView(Context)>
		b = ab1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field ab b>
		a = companiondata;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field CompanionData a>
		c = s;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field String c>
		d = list;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #31  <Field List d>
		if(!(this instanceof View))
	//*  15   27:aload_0         
	//*  16   28:instanceof      #33  <Class View>
	//*  17   31:ifne            40
		{
			setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #37  <Method void setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   21   39:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)this, ((android.view.View.OnClickListener) (this)));
	//   22   40:aload_0         
	//   23   41:checkcast       #33  <Class View>
	//   24   44:aload_0         
	//   25   45:invokestatic    #42  <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   26   48:return          
		}
	}

	static CompanionData a(z z1)
	{
		return z1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field CompanionData a>
	//    2    4:areturn         
	}

	private void b()
	{
		b.a(a.companionId(), c);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ab b>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field CompanionData a>
	//    4    8:invokevirtual   #53  <Method String CompanionData.companionId()>
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field String c>
	//    7   15:invokevirtual   #58  <Method void ab.a(String, String)>
	//    8   18:return          
	}

	static void b(z z1)
	{
		z1.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void b()>
	//    2    4:return          
	}

	Bitmap a(String s)
		throws IOException
	{
		return BitmapFactoryInstrumentation.decodeStream(URLConnectionInstrumentation.openConnection((new URL(s)).openConnection()).getInputStream());
	//    0    0:new             #66  <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #69  <Method void URL(String)>
	//    4    8:invokevirtual   #73  <Method URLConnection URL.openConnection()>
	//    5   11:invokestatic    #78  <Method URLConnection URLConnectionInstrumentation.openConnection(URLConnection)>
	//    6   14:invokevirtual   #84  <Method java.io.InputStream URLConnection.getInputStream()>
	//    7   17:invokestatic    #90  <Method Bitmap BitmapFactoryInstrumentation.decodeStream(java.io.InputStream)>
	//    8   20:areturn         
	}

	public void a()
	{
		TraceFieldInterface tracefieldinterface = new TraceFieldInterface() {

			public void _nr_setTrace(Trace trace)
			{
				try
				{
					_nr_trace = trace;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #33  <Field Trace _nr_trace>
					return;
			//    3    5:return          
				}
				// Misplaced declaration of an exception variable
				catch(Trace trace)
			//*   4    6:astore_1        
				{
					return;
			//    5    7:return          
				}
			}

			protected transient Bitmap a(Void avoid1[])
			{
				try
				{
					avoid1 = ((Void []) (b.a(z.a(b).src())));
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field z b>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field z b>
			//    4    8:invokestatic    #39  <Method CompanionData z.a(z)>
			//    5   11:invokevirtual   #45  <Method String CompanionData.src()>
			//    6   14:invokevirtual   #48  <Method Bitmap z.a(String)>
			//    7   17:astore_1        
				}
			//*   8   18:aload_1         
			//*   9   19:areturn         
				// Misplaced declaration of an exception variable
				catch(Void avoid1[])
			//*  10   20:astore_1        
				{
					a = ((Exception) (avoid1));
			//   11   21:aload_0         
			//   12   22:aload_1         
			//   13   23:putfield        #26  <Field Exception a>
					return null;
			//   14   26:aconst_null     
			//   15   27:areturn         
				}
				return ((Bitmap) (avoid1));
			}

			protected void a(Bitmap bitmap)
			{
				if(bitmap == null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       89
				{
					bitmap = ((Bitmap) (String.valueOf(((Object) (z.a(b).src())))));
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field z b>
			//    4    8:invokestatic    #39  <Method CompanionData z.a(z)>
			//    5   11:invokevirtual   #45  <Method String CompanionData.src()>
			//    6   14:invokestatic    #55  <Method String String.valueOf(Object)>
			//    7   17:astore_1        
					String s = String.valueOf(((Object) (a)));
			//    8   18:aload_0         
			//    9   19:getfield        #26  <Field Exception a>
			//   10   22:invokestatic    #55  <Method String String.valueOf(Object)>
			//   11   25:astore_2        
					StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (bitmap))).length() + 33 + String.valueOf(((Object) (s))).length());
			//   12   26:new             #57  <Class StringBuilder>
			//   13   29:dup             
			//   14   30:aload_1         
			//   15   31:invokestatic    #55  <Method String String.valueOf(Object)>
			//   16   34:invokevirtual   #61  <Method int String.length()>
			//   17   37:bipush          33
			//   18   39:iadd            
			//   19   40:aload_2         
			//   20   41:invokestatic    #55  <Method String String.valueOf(Object)>
			//   21   44:invokevirtual   #61  <Method int String.length()>
			//   22   47:iadd            
			//   23   48:invokespecial   #64  <Method void StringBuilder(int)>
			//   24   51:astore_3        
					stringbuilder.append("Loading image companion ");
			//   25   52:aload_3         
			//   26   53:ldc1            #66  <String "Loading image companion ">
			//   27   55:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
			//   28   58:pop             
					stringbuilder.append(((String) (bitmap)));
			//   29   59:aload_3         
			//   30   60:aload_1         
			//   31   61:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
			//   32   64:pop             
					stringbuilder.append(" failed: ");
			//   33   65:aload_3         
			//   34   66:ldc1            #72  <String " failed: ">
			//   35   68:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
			//   36   71:pop             
					stringbuilder.append(s);
			//   37   72:aload_3         
			//   38   73:aload_2         
			//   39   74:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
			//   40   77:pop             
					Log.e("IMASDK", stringbuilder.toString());
			//   41   78:ldc1            #74  <String "IMASDK">
			//   42   80:aload_3         
			//   43   81:invokevirtual   #77  <Method String StringBuilder.toString()>
			//   44   84:invokestatic    #83  <Method int Log.e(String, String)>
			//   45   87:pop             
					return;
			//   46   88:return          
				} else
				{
					z.b(b);
			//   47   89:aload_0         
			//   48   90:getfield        #22  <Field z b>
			//   49   93:invokestatic    #85  <Method void z.b(z)>
					b.setImageBitmap(bitmap);
			//   50   96:aload_0         
			//   51   97:getfield        #22  <Field z b>
			//   52  100:aload_1         
			//   53  101:invokevirtual   #88  <Method void z.setImageBitmap(Bitmap)>
					return;
			//   54  104:return          
				}
			}

			protected Object doInBackground(Object aobj[])
			{
				TraceMachine.enterMethod(_nr_trace, "z$1#doInBackground", ((java.util.ArrayList) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #33  <Field Trace _nr_trace>
			//    2    4:ldc1            #94  <String "z$1#doInBackground">
			//    3    6:aconst_null     
			//    4    7:invokestatic    #100 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
				  goto _L1
			//*   5   10:goto            20
_L3:
				TraceMachine.enterMethod(((Trace) (null)), "z$1#doInBackground", ((java.util.ArrayList) (null)));
			//    6   13:aconst_null     
			//    7   14:ldc1            #94  <String "z$1#doInBackground">
			//    8   16:aconst_null     
			//    9   17:invokestatic    #100 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
				aobj = ((Object []) (a((Void[])aobj)));
			//   10   20:aload_0         
			//   11   21:aload_1         
			//   12   22:checkcast       #102 <Class Void[]>
			//   13   25:invokevirtual   #104 <Method Bitmap a(Void[])>
			//   14   28:astore_1        
				TraceMachine.exitMethod();
			//   15   29:invokestatic    #107 <Method void TraceMachine.exitMethod()>
				TraceMachine.unloadTraceContext(((Object) (this)));
			//   16   32:aload_0         
			//   17   33:invokestatic    #111 <Method void TraceMachine.unloadTraceContext(Object)>
				return ((Object) (aobj));
			//   18   36:aload_1         
			//   19   37:areturn         
				NoSuchFieldError nosuchfielderror;
				nosuchfielderror;
			//   20   38:astore_2        
				if(true) goto _L3; else goto _L2
_L2:
			//*  21   39:goto            13
			}

			protected void onPostExecute(Object obj)
			{
				TraceMachine.enterMethod(_nr_trace, "z$1#onPostExecute", ((java.util.ArrayList) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #33  <Field Trace _nr_trace>
			//    2    4:ldc1            #114 <String "z$1#onPostExecute">
			//    3    6:aconst_null     
			//    4    7:invokestatic    #100 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
				  goto _L1
			//*   5   10:goto            20
_L3:
				TraceMachine.enterMethod(((Trace) (null)), "z$1#onPostExecute", ((java.util.ArrayList) (null)));
			//    6   13:aconst_null     
			//    7   14:ldc1            #114 <String "z$1#onPostExecute">
			//    8   16:aconst_null     
			//    9   17:invokestatic    #100 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
				a((Bitmap)obj);
			//   10   20:aload_0         
			//   11   21:aload_1         
			//   12   22:checkcast       #116 <Class Bitmap>
			//   13   25:invokevirtual   #118 <Method void a(Bitmap)>
				TraceMachine.exitMethod();
			//   14   28:invokestatic    #107 <Method void TraceMachine.exitMethod()>
				return;
			//   15   31:return          
				NoSuchFieldError nosuchfielderror;
				nosuchfielderror;
			//   16   32:astore_2        
				if(true) goto _L3; else goto _L2
_L2:
			//*  17   33:goto            13
			}

			public Trace _nr_trace;
			Exception a;
			final z b;

			
			{
				b = z.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field z b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #24  <Method void AsyncTask()>
				a = null;
			//    5    9:aload_0         
			//    6   10:aconst_null     
			//    7   11:putfield        #26  <Field Exception a>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #8   <Class z$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #93  <Method void z$1(z)>
	//    4    8:astore_1        
		Void avoid[] = new Void[0];
	//    5    9:iconst_0        
	//    6   10:anewarray       Void[]
	//    7   13:astore_2        
		if(!(tracefieldinterface instanceof AsyncTask))
	//*   8   14:aload_1         
	//*   9   15:instanceof      #97  <Class AsyncTask>
	//*  10   18:ifne            28
		{
			((_cls1) (tracefieldinterface)).execute(((Object []) (avoid)));
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #101 <Method AsyncTask z$1.execute(Object[])>
	//   14   26:pop             
			return;
	//   15   27:return          
		} else
		{
			AsyncTaskInstrumentation.execute((AsyncTask)tracefieldinterface, ((Object []) (avoid)));
	//   16   28:aload_1         
	//   17   29:checkcast       #97  <Class AsyncTask>
	//   18   32:aload_2         
	//   19   33:invokestatic    #106 <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
	//   20   36:pop             
			return;
	//   21   37:return          
		}
	}

	public void onClick(View view)
	{
		for(view = ((View) (d.iterator())); ((Iterator) (view)).hasNext(); ((com.google.ads.interactivemedia.v3.api.CompanionAdSlot.ClickListener)((Iterator) (view)).next()).onCompanionAdClick());
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List d>
	//    2    4:invokeinterface #114 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #120 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #124 <Method Object Iterator.next()>
	//    9   25:checkcast       #126 <Class com.google.ads.interactivemedia.v3.api.CompanionAdSlot$ClickListener>
	//   10   28:invokeinterface #129 <Method void com.google.ads.interactivemedia.v3.api.CompanionAdSlot$ClickListener.onCompanionAdClick()>
	//*  11   33:goto            10
		b.d(a.clickThroughUrl());
	//   12   36:aload_0         
	//   13   37:getfield        #25  <Field ab b>
	//   14   40:aload_0         
	//   15   41:getfield        #27  <Field CompanionData a>
	//   16   44:invokevirtual   #132 <Method String CompanionData.clickThroughUrl()>
	//   17   47:invokevirtual   #134 <Method void ab.d(String)>
	//   18   50:return          
	}

	private final CompanionData a;
	private final ab b;
	private final String c;
	private final List d;
}
