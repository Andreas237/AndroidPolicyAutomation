// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.WeakHashMap;

public final class DisplayManagerCompat
{

	private DisplayManagerCompat(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Context mContext>
	//    5    9:return          
	}

	public static DisplayManagerCompat getInstance(Context context)
	{
		WeakHashMap weakhashmap = sInstances;
	//    0    0:getstatic       #22  <Field WeakHashMap sInstances>
	//    1    3:astore_3        
		weakhashmap;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		DisplayManagerCompat displaymanagercompat1 = (DisplayManagerCompat)sInstances.get(((Object) (context)));
	//    4    6:getstatic       #22  <Field WeakHashMap sInstances>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #34  <Method Object WeakHashMap.get(Object)>
	//    7   13:checkcast       #2   <Class DisplayManagerCompat>
	//    8   16:astore_2        
		DisplayManagerCompat displaymanagercompat;
		displaymanagercompat = displaymanagercompat1;
	//    9   17:aload_2         
	//   10   18:astore_1        
		if(displaymanagercompat1 != null)
			break MISSING_BLOCK_LABEL_41;
	//   11   19:aload_2         
	//   12   20:ifnonnull       41
		displaymanagercompat = new DisplayManagerCompat(context);
	//   13   23:new             #2   <Class DisplayManagerCompat>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:invokespecial   #36  <Method void DisplayManagerCompat(Context)>
	//   17   31:astore_1        
		sInstances.put(((Object) (context)), ((Object) (displaymanagercompat)));
	//   18   32:getstatic       #22  <Field WeakHashMap sInstances>
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #40  <Method Object WeakHashMap.put(Object, Object)>
	//   22   40:pop             
		weakhashmap;
	//   23   41:aload_3         
		JVM INSTR monitorexit ;
	//   24   42:monitorexit     
		return displaymanagercompat;
	//   25   43:aload_1         
	//   26   44:areturn         
		context;
	//   27   45:astore_0        
		weakhashmap;
	//   28   46:aload_3         
		JVM INSTR monitorexit ;
	//   29   47:monitorexit     
		throw context;
	//   30   48:aload_0         
	//   31   49:athrow          
	}

	public Display getDisplay(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          25
			return ((DisplayManager)mContext.getSystemService("display")).getDisplay(i);
	//    3    8:aload_0         
	//    4    9:getfield        #27  <Field Context mContext>
	//    5   12:ldc1            #53  <String "display">
	//    6   14:invokevirtual   #59  <Method Object Context.getSystemService(String)>
	//    7   17:checkcast       #61  <Class DisplayManager>
	//    8   20:iload_1         
	//    9   21:invokevirtual   #63  <Method Display DisplayManager.getDisplay(int)>
	//   10   24:areturn         
		Display display = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay();
	//   11   25:aload_0         
	//   12   26:getfield        #27  <Field Context mContext>
	//   13   29:ldc1            #65  <String "window">
	//   14   31:invokevirtual   #59  <Method Object Context.getSystemService(String)>
	//   15   34:checkcast       #67  <Class WindowManager>
	//   16   37:invokeinterface #71  <Method Display WindowManager.getDefaultDisplay()>
	//   17   42:astore_2        
		if(display.getDisplayId() == i)
	//*  18   43:aload_2         
	//*  19   44:invokevirtual   #77  <Method int Display.getDisplayId()>
	//*  20   47:iload_1         
	//*  21   48:icmpne          53
			return display;
	//   22   51:aload_2         
	//   23   52:areturn         
		else
			return null;
	//   24   53:aconst_null     
	//   25   54:areturn         
	}

	public Display[] getDisplays()
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          24
			return ((DisplayManager)mContext.getSystemService("display")).getDisplays();
	//    3    8:aload_0         
	//    4    9:getfield        #27  <Field Context mContext>
	//    5   12:ldc1            #53  <String "display">
	//    6   14:invokevirtual   #59  <Method Object Context.getSystemService(String)>
	//    7   17:checkcast       #61  <Class DisplayManager>
	//    8   20:invokevirtual   #81  <Method Display[] DisplayManager.getDisplays()>
	//    9   23:areturn         
		else
			return (new Display[] {
				((WindowManager)mContext.getSystemService("window")).getDefaultDisplay()
			});
	//   10   24:iconst_1        
	//   11   25:anewarray       Display[]
	//   12   28:dup             
	//   13   29:iconst_0        
	//   14   30:aload_0         
	//   15   31:getfield        #27  <Field Context mContext>
	//   16   34:ldc1            #65  <String "window">
	//   17   36:invokevirtual   #59  <Method Object Context.getSystemService(String)>
	//   18   39:checkcast       #67  <Class WindowManager>
	//   19   42:invokeinterface #71  <Method Display WindowManager.getDefaultDisplay()>
	//   20   47:aastore         
	//   21   48:areturn         
	}

	public Display[] getDisplays(String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          25
			return ((DisplayManager)mContext.getSystemService("display")).getDisplays(s);
	//    3    8:aload_0         
	//    4    9:getfield        #27  <Field Context mContext>
	//    5   12:ldc1            #53  <String "display">
	//    6   14:invokevirtual   #59  <Method Object Context.getSystemService(String)>
	//    7   17:checkcast       #61  <Class DisplayManager>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #84  <Method Display[] DisplayManager.getDisplays(String)>
	//   10   24:areturn         
		if(s == null)
	//*  11   25:aload_1         
	//*  12   26:ifnonnull       34
			return new Display[0];
	//   13   29:iconst_0        
	//   14   30:anewarray       Display[]
	//   15   33:areturn         
		else
			return (new Display[] {
				((WindowManager)mContext.getSystemService("window")).getDefaultDisplay()
			});
	//   16   34:iconst_1        
	//   17   35:anewarray       Display[]
	//   18   38:dup             
	//   19   39:iconst_0        
	//   20   40:aload_0         
	//   21   41:getfield        #27  <Field Context mContext>
	//   22   44:ldc1            #65  <String "window">
	//   23   46:invokevirtual   #59  <Method Object Context.getSystemService(String)>
	//   24   49:checkcast       #67  <Class WindowManager>
	//   25   52:invokeinterface #71  <Method Display WindowManager.getDefaultDisplay()>
	//   26   57:aastore         
	//   27   58:areturn         
	}

	public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
	private static final WeakHashMap sInstances = new WeakHashMap();
	private final Context mContext;

	static 
	{
	//    0    0:new             #17  <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void WeakHashMap()>
	//    3    7:putstatic       #22  <Field WeakHashMap sInstances>
	//*   4   10:return          
	}
}
