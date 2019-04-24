// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.irobot.home.util.o;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.irobot.home.view:
//			GestureImageView

public class MapView extends GestureImageView
{

	public MapView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void GestureImageView(Context)>
		a(context, ((AttributeSet) (null)), 0);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #18  <Method void a(Context, AttributeSet, int)>
	//    8   12:return          
	}

	public MapView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void GestureImageView(Context, AttributeSet)>
		a(context, attributeset, 0);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:iconst_0        
	//    8   10:invokevirtual   #18  <Method void a(Context, AttributeSet, int)>
	//    9   13:return          
	}

	public MapView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #23  <Method void GestureImageView(Context, AttributeSet, int)>
		a(context, attributeset, i);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:iload_3         
	//    9   11:invokevirtual   #18  <Method void a(Context, AttributeSet, int)>
	//   10   14:return          
	}

	public void a(List list)
	{
		if(!list.isEmpty() && list.get(0) != null)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #30  <Method boolean List.isEmpty()>
	//*   2    6:ifne            114
	//*   3    9:aload_1         
	//*   4   10:iconst_0        
	//*   5   11:invokeinterface #34  <Method Object List.get(int)>
	//*   6   16:ifnonnull       22
	//*   7   19:goto            114
		{
			Bitmap bitmap = Bitmap.createBitmap(((Bitmap)list.get(0)).getWidth(), ((Bitmap)list.get(0)).getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
	//    8   22:aload_1         
	//    9   23:iconst_0        
	//   10   24:invokeinterface #34  <Method Object List.get(int)>
	//   11   29:checkcast       #36  <Class Bitmap>
	//   12   32:invokevirtual   #40  <Method int Bitmap.getWidth()>
	//   13   35:aload_1         
	//   14   36:iconst_0        
	//   15   37:invokeinterface #34  <Method Object List.get(int)>
	//   16   42:checkcast       #36  <Class Bitmap>
	//   17   45:invokevirtual   #43  <Method int Bitmap.getHeight()>
	//   18   48:getstatic       #49  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   19   51:invokestatic    #53  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   20   54:astore_2        
			Canvas canvas = new Canvas(bitmap);
	//   21   55:new             #55  <Class Canvas>
	//   22   58:dup             
	//   23   59:aload_2         
	//   24   60:invokespecial   #58  <Method void Canvas(Bitmap)>
	//   25   63:astore_3        
			list = ((List) (list.iterator()));
	//   26   64:aload_1         
	//   27   65:invokeinterface #62  <Method Iterator List.iterator()>
	//   28   70:astore_1        
			do
			{
				if(!((Iterator) (list)).hasNext())
					break;
	//   29   71:aload_1         
	//   30   72:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   31   77:ifeq            108
				Bitmap bitmap1 = (Bitmap)((Iterator) (list)).next();
	//   32   80:aload_1         
	//   33   81:invokeinterface #71  <Method Object Iterator.next()>
	//   34   86:checkcast       #36  <Class Bitmap>
	//   35   89:astore          4
				if(bitmap1 != null)
	//*  36   91:aload           4
	//*  37   93:ifnull          71
					canvas.drawBitmap(bitmap1, 0.0F, 0.0F, ((android.graphics.Paint) (null)));
	//   38   96:aload_3         
	//   39   97:aload           4
	//   40   99:fconst_0        
	//   41  100:fconst_0        
	//   42  101:aconst_null     
	//   43  102:invokevirtual   #75  <Method void Canvas.drawBitmap(Bitmap, float, float, android.graphics.Paint)>
			} while(true);
	//   44  105:goto            71
			setImageBitmap(bitmap);
	//   45  108:aload_0         
	//   46  109:aload_2         
	//   47  110:invokevirtual   #78  <Method void setImageBitmap(Bitmap)>
			return;
	//   48  113:return          
		} else
		{
			o.e(a, "List of bitmaps must not be empty and first bitmap in the list must not be null");
	//   49  114:getstatic       #80  <Field String a>
	//   50  117:ldc1            #82  <String "List of bitmaps must not be empty and first bitmap in the list must not be null">
	//   51  119:invokestatic    #88  <Method void o.e(String, String)>
			return;
	//   52  122:return          
		}
	}

	private static String a = "MapView";

	static 
	{
	//    0    0:return          
	}
}
