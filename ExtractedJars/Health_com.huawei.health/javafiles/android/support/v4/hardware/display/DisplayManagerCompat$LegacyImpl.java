// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.display;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package android.support.v4.hardware.display:
//			DisplayManagerCompat

static class DisplayManagerCompat$LegacyImpl extends DisplayManagerCompat
{

	public Display getDisplay(int i)
	{
		Display display = mWindowManager.getDefaultDisplay();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WindowManager mWindowManager>
	//    2    4:invokeinterface #31  <Method Display WindowManager.getDefaultDisplay()>
	//    3    9:astore_2        
		if(display.getDisplayId() == i)
	//*   4   10:aload_2         
	//*   5   11:invokevirtual   #37  <Method int Display.getDisplayId()>
	//*   6   14:iload_1         
	//*   7   15:icmpne          20
			return display;
	//    8   18:aload_2         
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	public Display[] getDisplays()
	{
		return (new Display[] {
			mWindowManager.getDefaultDisplay()
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Display[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field WindowManager mWindowManager>
	//    6   10:invokeinterface #31  <Method Display WindowManager.getDefaultDisplay()>
	//    7   15:aastore         
	//    8   16:areturn         
	}

	public Display[] getDisplays(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return getDisplays();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #42  <Method Display[] getDisplays()>
	//    4    8:areturn         
		else
			return new Display[0];
	//    5    9:iconst_0        
	//    6   10:anewarray       Display[]
	//    7   13:areturn         
	}

	private final WindowManager mWindowManager;

	public DisplayManagerCompat$LegacyImpl(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void DisplayManagerCompat()>
		mWindowManager = (WindowManager)context.getSystemService("window");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #14  <String "window">
	//    5    8:invokevirtual   #20  <Method Object Context.getSystemService(String)>
	//    6   11:checkcast       #22  <Class WindowManager>
	//    7   14:putfield        #24  <Field WindowManager mWindowManager>
	//    8   17:return          
	}
}
