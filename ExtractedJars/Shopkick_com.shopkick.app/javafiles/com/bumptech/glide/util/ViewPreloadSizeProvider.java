// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import android.view.View;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.request.transition.Transition;
import java.util.Arrays;

public class ViewPreloadSizeProvider
	implements com.bumptech.glide.ListPreloader.PreloadSizeProvider, SizeReadyCallback
{
	private static final class SizeViewTarget extends ViewTarget
	{

		public void onResourceReady(Object obj, Transition transition)
		{
		//    0    0:return          
		}

		SizeViewTarget(View view, SizeReadyCallback sizereadycallback)
		{
			super(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void ViewTarget(View)>
			getSize(sizereadycallback);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #18  <Method void getSize(SizeReadyCallback)>
		//    6   10:return          
		}
	}


	public ViewPreloadSizeProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public ViewPreloadSizeProvider(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		viewTarget = new SizeViewTarget(view, ((SizeReadyCallback) (this)));
	//    2    4:aload_0         
	//    3    5:new             #11  <Class ViewPreloadSizeProvider$SizeViewTarget>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void ViewPreloadSizeProvider$SizeViewTarget(View, SizeReadyCallback)>
	//    8   14:putfield        #28  <Field ViewPreloadSizeProvider$SizeViewTarget viewTarget>
	//    9   17:return          
	}

	public int[] getPreloadSize(Object obj, int i, int j)
	{
		obj = ((Object) (size));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int[] size>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return Arrays.copyOf(((int []) (obj)), obj.length);
	//    7   11:aload_1         
	//    8   12:aload_1         
	//    9   13:arraylength     
	//   10   14:invokestatic    #40  <Method int[] Arrays.copyOf(int[], int)>
	//   11   17:areturn         
	}

	public void onSizeReady(int i, int j)
	{
		size = (new int[] {
			i, j
		});
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:newarray        int[]
	//    3    4:dup             
	//    4    5:iconst_0        
	//    5    6:iload_1         
	//    6    7:iastore         
	//    7    8:dup             
	//    8    9:iconst_1        
	//    9   10:iload_2         
	//   10   11:iastore         
	//   11   12:putfield        #34  <Field int[] size>
		viewTarget = null;
	//   12   15:aload_0         
	//   13   16:aconst_null     
	//   14   17:putfield        #28  <Field ViewPreloadSizeProvider$SizeViewTarget viewTarget>
	//   15   20:return          
	}

	public void setView(View view)
	{
		if(size == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field int[] size>
	//*   2    4:ifnonnull       29
		{
			if(viewTarget != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field ViewPreloadSizeProvider$SizeViewTarget viewTarget>
	//*   5   11:ifnull          15
			{
				return;
	//    6   14:return          
			} else
			{
				viewTarget = new SizeViewTarget(view, ((SizeReadyCallback) (this)));
	//    7   15:aload_0         
	//    8   16:new             #11  <Class ViewPreloadSizeProvider$SizeViewTarget>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokespecial   #26  <Method void ViewPreloadSizeProvider$SizeViewTarget(View, SizeReadyCallback)>
	//   13   25:putfield        #28  <Field ViewPreloadSizeProvider$SizeViewTarget viewTarget>
				return;
	//   14   28:return          
			}
		} else
		{
			return;
	//   15   29:return          
		}
	}

	private int size[];
	private SizeViewTarget viewTarget;
}
