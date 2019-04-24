// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife;

import android.app.Activity;
import android.content.Context;
import android.view.View;

// Referenced classes of package butterknife:
//			ButterKnife

static final class ButterKnife$Finder$2 extends ButterKnife.Finder
{

	public View findOptionalView(Object obj, int i)
	{
		return ((Activity)obj).findViewById(i);
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class Activity>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #21  <Method View Activity.findViewById(int)>
	//    4    8:areturn         
	}

	protected Context getContext(Object obj)
	{
		return ((Context) ((Activity)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class Activity>
	//    2    4:areturn         
	}

	ButterKnife$Finder$2(String s, int i)
	{
		super(s, i, ((ButterKnife._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #12  <Method void ButterKnife$Finder(String, int, ButterKnife$1)>
	//    5    7:return          
	}
}
