// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompatApi21

static final class PlaybackStateCompatApi21$CustomAction
{

	public static String getAction(Object obj)
	{
		return ((android.media.session.PlaybackState.CustomAction)obj).getAction();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.PlaybackState$CustomAction>
	//    2    4:invokevirtual   #19  <Method String android.media.session.PlaybackState$CustomAction.getAction()>
	//    3    7:areturn         
	}

	public static Bundle getExtras(Object obj)
	{
		return ((android.media.session.PlaybackState.CustomAction)obj).getExtras();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.PlaybackState$CustomAction>
	//    2    4:invokevirtual   #24  <Method Bundle android.media.session.PlaybackState$CustomAction.getExtras()>
	//    3    7:areturn         
	}

	public static int getIcon(Object obj)
	{
		return ((android.media.session.PlaybackState.CustomAction)obj).getIcon();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.PlaybackState$CustomAction>
	//    2    4:invokevirtual   #29  <Method int android.media.session.PlaybackState$CustomAction.getIcon()>
	//    3    7:ireturn         
	}

	public static CharSequence getName(Object obj)
	{
		return ((android.media.session.PlaybackState.CustomAction)obj).getName();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.PlaybackState$CustomAction>
	//    2    4:invokevirtual   #34  <Method CharSequence android.media.session.PlaybackState$CustomAction.getName()>
	//    3    7:areturn         
	}

	public static Object newInstance(String s, CharSequence charsequence, int i, Bundle bundle)
	{
		s = ((String) (new android.media.session.PlaybackState.CustomAction.Builder(s, charsequence, i)));
	//    0    0:new             #38  <Class android.media.session.PlaybackState$CustomAction$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #41  <Method void android.media.session.PlaybackState$CustomAction$Builder(String, CharSequence, int)>
	//    6   10:astore_0        
		((android.media.session.PlaybackState.CustomAction.Builder) (s)).setExtras(bundle);
	//    7   11:aload_0         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #45  <Method android.media.session.PlaybackState$CustomAction$Builder android.media.session.PlaybackState$CustomAction$Builder.setExtras(Bundle)>
	//   10   16:pop             
		return ((Object) (((android.media.session.PlaybackState.CustomAction.Builder) (s)).build()));
	//   11   17:aload_0         
	//   12   18:invokevirtual   #49  <Method android.media.session.PlaybackState$CustomAction android.media.session.PlaybackState$CustomAction$Builder.build()>
	//   13   21:areturn         
	}

	PlaybackStateCompatApi21$CustomAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
