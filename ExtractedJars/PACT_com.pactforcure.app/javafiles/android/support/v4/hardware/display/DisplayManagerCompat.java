// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.WeakHashMap;

public abstract class DisplayManagerCompat
{
	private static class DisplayManagerCompatApi14Impl extends DisplayManagerCompat
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

		DisplayManagerCompatApi14Impl(Context context)
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

	private static class DisplayManagerCompatApi17Impl extends DisplayManagerCompat
	{

		public Display getDisplay(int i)
		{
			return mDisplayManager.getDisplay(i);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field DisplayManager mDisplayManager>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #32  <Method Display DisplayManager.getDisplay(int)>
		//    4    8:areturn         
		}

		public Display[] getDisplays()
		{
			return mDisplayManager.getDisplays();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field DisplayManager mDisplayManager>
		//    2    4:invokevirtual   #36  <Method Display[] DisplayManager.getDisplays()>
		//    3    7:areturn         
		}

		public Display[] getDisplays(String s)
		{
			return mDisplayManager.getDisplays(s);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field DisplayManager mDisplayManager>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #39  <Method Display[] DisplayManager.getDisplays(String)>
		//    4    8:areturn         
		}

		private final DisplayManager mDisplayManager;

		DisplayManagerCompatApi17Impl(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void DisplayManagerCompat()>
			mDisplayManager = (DisplayManager)context.getSystemService("display");
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:ldc1            #17  <String "display">
		//    5    8:invokevirtual   #23  <Method Object Context.getSystemService(String)>
		//    6   11:checkcast       #25  <Class DisplayManager>
		//    7   14:putfield        #27  <Field DisplayManager mDisplayManager>
		//    8   17:return          
		}
	}


	DisplayManagerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public static DisplayManagerCompat getInstance(Context context)
	{
		WeakHashMap weakhashmap = sInstances;
	//    0    0:getstatic       #26  <Field WeakHashMap sInstances>
	//    1    3:astore_3        
		weakhashmap;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		DisplayManagerCompat displaymanagercompat = (DisplayManagerCompat)sInstances.get(((Object) (context)));
	//    4    6:getstatic       #26  <Field WeakHashMap sInstances>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #34  <Method Object WeakHashMap.get(Object)>
	//    7   13:checkcast       #2   <Class DisplayManagerCompat>
	//    8   16:astore_2        
		Object obj = ((Object) (displaymanagercompat));
	//    9   17:aload_2         
	//   10   18:astore_1        
		if(displaymanagercompat != null) goto _L2; else goto _L1
	//   11   19:aload_2         
	//   12   20:ifnonnull       49
_L1:
		if(android.os.Build.VERSION.SDK_INT < 17)
			break MISSING_BLOCK_LABEL_53;
	//   13   23:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//   14   26:bipush          17
	//   15   28:icmplt          53
		obj = ((Object) (new DisplayManagerCompatApi17Impl(context)));
	//   16   31:new             #9   <Class DisplayManagerCompat$DisplayManagerCompatApi17Impl>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #43  <Method void DisplayManagerCompat$DisplayManagerCompatApi17Impl(Context)>
	//   20   39:astore_1        
_L3:
		sInstances.put(((Object) (context)), obj);
	//   21   40:getstatic       #26  <Field WeakHashMap sInstances>
	//   22   43:aload_0         
	//   23   44:aload_1         
	//   24   45:invokevirtual   #47  <Method Object WeakHashMap.put(Object, Object)>
	//   25   48:pop             
_L2:
		weakhashmap;
	//   26   49:aload_3         
		JVM INSTR monitorexit ;
	//   27   50:monitorexit     
		return ((DisplayManagerCompat) (obj));
	//   28   51:aload_1         
	//   29   52:areturn         
		obj = ((Object) (new DisplayManagerCompatApi14Impl(context)));
	//   30   53:new             #6   <Class DisplayManagerCompat$DisplayManagerCompatApi14Impl>
	//   31   56:dup             
	//   32   57:aload_0         
	//   33   58:invokespecial   #48  <Method void DisplayManagerCompat$DisplayManagerCompatApi14Impl(Context)>
	//   34   61:astore_1        
		  goto _L3
	//*  35   62:goto            40
		context;
	//   36   65:astore_0        
		weakhashmap;
	//   37   66:aload_3         
		JVM INSTR monitorexit ;
	//   38   67:monitorexit     
		throw context;
	//   39   68:aload_0         
	//   40   69:athrow          
	}

	public abstract Display getDisplay(int i);

	public abstract Display[] getDisplays();

	public abstract Display[] getDisplays(String s);

	public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
	private static final WeakHashMap sInstances = new WeakHashMap();

	static 
	{
	//    0    0:new             #21  <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void WeakHashMap()>
	//    3    7:putstatic       #26  <Field WeakHashMap sInstances>
	//*   4   10:return          
	}
}
