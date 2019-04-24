// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.transition:
//			GhostViewApi21, GhostViewImpl

static class GhostViewApi21$Creator
	implements GhostViewImpl.Creator
{

	public GhostViewImpl addGhost(View view, ViewGroup viewgroup, Matrix matrix)
	{
		GhostViewApi21.access$000();
	//    0    0:invokestatic    #23  <Method void GhostViewApi21.access$000()>
		if(GhostViewApi21.access$100() != null)
	//*   1    3:invokestatic    #27  <Method Method GhostViewApi21.access$100()>
	//*   2    6:ifnull          59
		{
			try
			{
				view = ((View) (new GhostViewApi21((View)GhostViewApi21.access$100().invoke(((Object) (null)), new Object[] {
					view, viewgroup, matrix
				}), ((GhostViewApi21._cls1) (null)))));
	//    3    9:new             #8   <Class GhostViewApi21>
	//    4   12:dup             
	//    5   13:invokestatic    #27  <Method Method GhostViewApi21.access$100()>
	//    6   16:aconst_null     
	//    7   17:iconst_3        
	//    8   18:anewarray       Object[]
	//    9   21:dup             
	//   10   22:iconst_0        
	//   11   23:aload_1         
	//   12   24:aastore         
	//   13   25:dup             
	//   14   26:iconst_1        
	//   15   27:aload_2         
	//   16   28:aastore         
	//   17   29:dup             
	//   18   30:iconst_2        
	//   19   31:aload_3         
	//   20   32:aastore         
	//   21   33:invokevirtual   #33  <Method Object Method.invoke(Object, Object[])>
	//   22   36:checkcast       #35  <Class View>
	//   23   39:aconst_null     
	//   24   40:invokespecial   #38  <Method void GhostViewApi21(View, GhostViewApi21$1)>
	//   25   43:astore_1        
			}
	//*  26   44:aload_1         
	//*  27   45:areturn         
	//*  28   46:astore_1        
	//*  29   47:new             #40  <Class RuntimeException>
	//*  30   50:dup             
	//*  31   51:aload_1         
	//*  32   52:invokevirtual   #44  <Method Throwable InvocationTargetException.getCause()>
	//*  33   55:invokespecial   #47  <Method void RuntimeException(Throwable)>
	//*  34   58:athrow          
	//*  35   59:aconst_null     
	//*  36   60:areturn         
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  37   61:astore_1        
			{
				return null;
	//   38   62:aconst_null     
	//   39   63:areturn         
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((InvocationTargetException) (view)).getCause());
			}
			return ((GhostViewImpl) (view));
		} else
		{
			return null;
		}
	}

	public void removeGhost(View view)
	{
		GhostViewApi21.access$300();
	//    0    0:invokestatic    #52  <Method void GhostViewApi21.access$300()>
		if(GhostViewApi21.access$400() != null)
	//*   1    3:invokestatic    #55  <Method Method GhostViewApi21.access$400()>
	//*   2    6:ifnull          39
			try
			{
				GhostViewApi21.access$400().invoke(((Object) (null)), new Object[] {
					view
				});
	//    3    9:invokestatic    #55  <Method Method GhostViewApi21.access$400()>
	//    4   12:aconst_null     
	//    5   13:iconst_1        
	//    6   14:anewarray       Object[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:aload_1         
	//   10   20:aastore         
	//   11   21:invokevirtual   #33  <Method Object Method.invoke(Object, Object[])>
	//   12   24:pop             
				return;
	//   13   25:return          
			}
	//*  14   26:astore_1        
	//*  15   27:new             #40  <Class RuntimeException>
	//*  16   30:dup             
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #44  <Method Throwable InvocationTargetException.getCause()>
	//*  19   35:invokespecial   #47  <Method void RuntimeException(Throwable)>
	//*  20   38:athrow          
	//*  21   39:return          
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  22   40:astore_1        
			{
				return;
	//   23   41:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((InvocationTargetException) (view)).getCause());
			}
		else
			return;
	}

	GhostViewApi21$Creator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
