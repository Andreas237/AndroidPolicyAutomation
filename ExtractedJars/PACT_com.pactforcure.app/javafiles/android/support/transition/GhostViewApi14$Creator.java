// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// Referenced classes of package android.support.transition:
//			GhostViewApi14, GhostViewImpl

static class GhostViewApi14$Creator
	implements GhostViewImpl.Creator
{

	private static FrameLayout findFrameLayout(ViewGroup viewgroup)
	{
		for(; !(viewgroup instanceof FrameLayout); viewgroup = (ViewGroup)viewgroup)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #18  <Class FrameLayout>
	//*   2    4:ifne            29
		{
			viewgroup = ((ViewGroup) (viewgroup.getParent()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #24  <Method android.view.ViewParent ViewGroup.getParent()>
	//    5   11:astore_0        
			if(!(viewgroup instanceof ViewGroup))
	//*   6   12:aload_0         
	//*   7   13:instanceof      #20  <Class ViewGroup>
	//*   8   16:ifne            21
				return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		}

	//   11   21:aload_0         
	//   12   22:checkcast       #20  <Class ViewGroup>
	//   13   25:astore_0        
	//*  14   26:goto            0
		return (FrameLayout)viewgroup;
	//   15   29:aload_0         
	//   16   30:checkcast       #18  <Class FrameLayout>
	//   17   33:areturn         
	}

	public GhostViewImpl addGhost(View view, ViewGroup viewgroup, Matrix matrix)
	{
		GhostViewApi14 ghostviewapi14 = GhostViewApi14.getGhostView(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #30  <Method GhostViewApi14 GhostViewApi14.getGhostView(View)>
	//    2    4:astore          4
		matrix = ((Matrix) (ghostviewapi14));
	//    3    6:aload           4
	//    4    8:astore_3        
		if(ghostviewapi14 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       39
		{
			viewgroup = ((ViewGroup) (findFrameLayout(viewgroup)));
	//    7   14:aload_2         
	//    8   15:invokestatic    #32  <Method FrameLayout findFrameLayout(ViewGroup)>
	//    9   18:astore_2        
			if(viewgroup == null)
	//*  10   19:aload_2         
	//*  11   20:ifnonnull       25
				return null;
	//   12   23:aconst_null     
	//   13   24:areturn         
			matrix = ((Matrix) (new GhostViewApi14(view)));
	//   14   25:new             #8   <Class GhostViewApi14>
	//   15   28:dup             
	//   16   29:aload_1         
	//   17   30:invokespecial   #35  <Method void GhostViewApi14(View)>
	//   18   33:astore_3        
			((FrameLayout) (viewgroup)).addView(((View) (matrix)));
	//   19   34:aload_2         
	//   20   35:aload_3         
	//   21   36:invokevirtual   #38  <Method void FrameLayout.addView(View)>
		}
		matrix.mReferences = ((GhostViewApi14) (matrix)).mReferences + 1;
	//   22   39:aload_3         
	//   23   40:aload_3         
	//   24   41:getfield        #42  <Field int GhostViewApi14.mReferences>
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:putfield        #42  <Field int GhostViewApi14.mReferences>
		return ((GhostViewImpl) (matrix));
	//   28   49:aload_3         
	//   29   50:areturn         
	}

	public void removeGhost(View view)
	{
		view = ((View) (GhostViewApi14.getGhostView(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #30  <Method GhostViewApi14 GhostViewApi14.getGhostView(View)>
	//    2    4:astore_1        
		if(view != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          53
		{
			view.mReferences = ((GhostViewApi14) (view)).mReferences - 1;
	//    5    9:aload_1         
	//    6   10:aload_1         
	//    7   11:getfield        #42  <Field int GhostViewApi14.mReferences>
	//    8   14:iconst_1        
	//    9   15:isub            
	//   10   16:putfield        #42  <Field int GhostViewApi14.mReferences>
			if(((GhostViewApi14) (view)).mReferences <= 0)
	//*  11   19:aload_1         
	//*  12   20:getfield        #42  <Field int GhostViewApi14.mReferences>
	//*  13   23:ifgt            53
			{
				Object obj = ((Object) (((GhostViewApi14) (view)).getParent()));
	//   14   26:aload_1         
	//   15   27:invokevirtual   #44  <Method android.view.ViewParent GhostViewApi14.getParent()>
	//   16   30:astore_2        
				if(obj instanceof ViewGroup)
	//*  17   31:aload_2         
	//*  18   32:instanceof      #20  <Class ViewGroup>
	//*  19   35:ifeq            53
				{
					obj = ((Object) ((ViewGroup)obj));
	//   20   38:aload_2         
	//   21   39:checkcast       #20  <Class ViewGroup>
	//   22   42:astore_2        
					((ViewGroup) (obj)).endViewTransition(view);
	//   23   43:aload_2         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #47  <Method void ViewGroup.endViewTransition(View)>
					((ViewGroup) (obj)).removeView(view);
	//   26   48:aload_2         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #50  <Method void ViewGroup.removeView(View)>
				}
			}
		}
	//   29   53:return          
	}

	GhostViewApi14$Creator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
