// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.d.a.c;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

class AppCompatDrawableManager$AvdcInflateDelegate
	implements AppCompatDrawableManager.InflateDelegate
{

	public Drawable createFromXmlInner(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
	{
		try
		{
			context = ((Context) (c.a(context, context.getResources(), xmlpullparser, attributeset, theme)));
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #21  <Method android.content.res.Resources Context.getResources()>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokestatic    #27  <Method c c.a(Context, android.content.res.Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//    7   12:astore_1        
		}
	//*   8   13:aload_1         
	//*   9   14:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  10   15:astore_1        
		{
			Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", ((Throwable) (context)));
	//   11   16:ldc1            #29  <String "AvdcInflateDelegate">
	//   12   18:ldc1            #31  <String "Exception while inflating <animated-vector>">
	//   13   20:aload_1         
	//   14   21:invokestatic    #37  <Method int Log.e(String, String, Throwable)>
	//   15   24:pop             
			return null;
	//   16   25:aconst_null     
	//   17   26:areturn         
		}
		return ((Drawable) (context));
	}

	AppCompatDrawableManager$AvdcInflateDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
