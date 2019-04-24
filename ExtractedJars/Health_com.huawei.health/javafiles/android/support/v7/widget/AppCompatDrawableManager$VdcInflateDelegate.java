// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.v7.widget:
//			AppCompatDrawableManager

static class AppCompatDrawableManager$VdcInflateDelegate
	implements AppCompatDrawableManager.InflateDelegate
{

	public Drawable createFromXmlInner(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
	{
		try
		{
			context = ((Context) (VectorDrawableCompat.createFromXmlInner(context.getResources(), xmlpullparser, attributeset, theme)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method android.content.res.Resources Context.getResources()>
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:aload           4
	//    5    8:invokestatic    #34  <Method VectorDrawableCompat VectorDrawableCompat.createFromXmlInner(android.content.res.Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//    6   11:astore_1        
		}
	//*   7   12:aload_1         
	//*   8   13:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   9   14:astore_1        
		{
			Log.e("VdcInflateDelegate", "Exception while inflating <vector>", ((Throwable) (context)));
	//   10   15:ldc1            #35  <String "VdcInflateDelegate">
	//   11   17:ldc1            #37  <String "Exception while inflating <vector>">
	//   12   19:aload_1         
	//   13   20:invokestatic    #43  <Method int Log.e(String, String, Throwable)>
	//   14   23:pop             
			return null;
	//   15   24:aconst_null     
	//   16   25:areturn         
		}
		return ((Drawable) (context));
	}

	AppCompatDrawableManager$VdcInflateDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
