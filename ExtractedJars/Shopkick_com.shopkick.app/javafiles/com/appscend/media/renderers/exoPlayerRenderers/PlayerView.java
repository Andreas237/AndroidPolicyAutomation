// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.widget.LinearLayout;

// Referenced classes of package com.appscend.media.renderers.exoPlayerRenderers:
//			ExoPlayerInterface

public class PlayerView extends LinearLayout
	implements android.view.TextureView.SurfaceTextureListener
{

	public PlayerView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void LinearLayout(Context)>
	//    3    5:return          
	}

	public PlayerView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void LinearLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public PlayerView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #19  <Method void LinearLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public PlayerView(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #25  <Method void LinearLayout(Context, AttributeSet, int, int)>
	//    6    9:return          
	}

	public void acquireVideoTexture(Context context, ExoPlayerInterface exoplayerinterface)
	{
		player = exoplayerinterface;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #31  <Field ExoPlayerInterface player>
		context = ((Context) (new TextureView(context)));
	//    3    5:new             #33  <Class TextureView>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #34  <Method void TextureView(Context)>
	//    7   13:astore_1        
		addView(((android.view.View) (context)), ((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, -1))));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:new             #36  <Class android.widget.LinearLayout$LayoutParams>
	//   11   19:dup             
	//   12   20:iconst_m1       
	//   13   21:iconst_m1       
	//   14   22:invokespecial   #39  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   15   25:invokevirtual   #43  <Method void addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		if(exoplayerinterface != null)
	//*  16   28:aload_2         
	//*  17   29:ifnull          52
		{
			exoplayerinterface.switchPlayerView(this);
	//   18   32:aload_2         
	//   19   33:aload_0         
	//   20   34:invokevirtual   #49  <Method void ExoPlayerInterface.switchPlayerView(PlayerView)>
			if(exoplayerinterface.getSurfaceTexture() != null)
	//*  21   37:aload_2         
	//*  22   38:invokevirtual   #53  <Method SurfaceTexture ExoPlayerInterface.getSurfaceTexture()>
	//*  23   41:ifnull          52
				((TextureView) (context)).setSurfaceTexture(exoplayerinterface.getSurfaceTexture());
	//   24   44:aload_1         
	//   25   45:aload_2         
	//   26   46:invokevirtual   #53  <Method SurfaceTexture ExoPlayerInterface.getSurfaceTexture()>
	//   27   49:invokevirtual   #57  <Method void TextureView.setSurfaceTexture(SurfaceTexture)>
		}
		((TextureView) (context)).setSurfaceTextureListener(((android.view.TextureView.SurfaceTextureListener) (this)));
	//   28   52:aload_1         
	//   29   53:aload_0         
	//   30   54:invokevirtual   #61  <Method void TextureView.setSurfaceTextureListener(android.view.TextureView$SurfaceTextureListener)>
	//   31   57:return          
	}

	public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
	{
		Log.v("PlayerView", "surface texture available");
	//    0    0:ldc1            #65  <String "PlayerView">
	//    1    2:ldc1            #67  <String "surface texture available">
	//    2    4:invokestatic    #73  <Method int Log.v(String, String)>
	//    3    7:pop             
		ExoPlayerInterface exoplayerinterface = player;
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field ExoPlayerInterface player>
	//    6   12:astore          4
		if(exoplayerinterface != null)
	//*   7   14:aload           4
	//*   8   16:ifnull          40
		{
			exoplayerinterface.setSurfaceTexture(surfacetexture);
	//    9   19:aload           4
	//   10   21:aload_1         
	//   11   22:invokevirtual   #74  <Method void ExoPlayerInterface.setSurfaceTexture(SurfaceTexture)>
			surfacetexture = ((SurfaceTexture) (player));
	//   12   25:aload_0         
	//   13   26:getfield        #31  <Field ExoPlayerInterface player>
	//   14   29:astore_1        
			((ExoPlayerInterface) (surfacetexture)).seekTo(((ExoPlayerInterface) (surfacetexture)).getCurrentPosition() + 1L);
	//   15   30:aload_1         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #78  <Method long ExoPlayerInterface.getCurrentPosition()>
	//   18   35:lconst_1        
	//   19   36:ladd            
	//   20   37:invokevirtual   #82  <Method void ExoPlayerInterface.seekTo(long)>
		}
	//   21   40:return          
	}

	public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
	{
		surfacetexture = ((SurfaceTexture) (player));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ExoPlayerInterface player>
	//    2    4:astore_1        
		boolean flag;
		if(surfacetexture != null && ((ExoPlayerInterface) (surfacetexture)).getSurfaceTexture() == null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #53  <Method SurfaceTexture ExoPlayerInterface.getSurfaceTexture()>
	//*   7   13:ifnonnull       21
			flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_2        
		else
	//*  10   18:goto            23
			flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_2        
		surfacetexture = ((SurfaceTexture) (new StringBuilder()));
	//   13   23:new             #86  <Class StringBuilder>
	//   14   26:dup             
	//   15   27:invokespecial   #89  <Method void StringBuilder()>
	//   16   30:astore_1        
		((StringBuilder) (surfacetexture)).append("will release: ");
	//   17   31:aload_1         
	//   18   32:ldc1            #91  <String "will release: ">
	//   19   34:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		((StringBuilder) (surfacetexture)).append(flag);
	//   21   38:aload_1         
	//   22   39:iload_2         
	//   23   40:invokevirtual   #98  <Method StringBuilder StringBuilder.append(boolean)>
	//   24   43:pop             
		Log.v("PlayerView", ((StringBuilder) (surfacetexture)).toString());
	//   25   44:ldc1            #65  <String "PlayerView">
	//   26   46:aload_1         
	//   27   47:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   28   50:invokestatic    #73  <Method int Log.v(String, String)>
	//   29   53:pop             
		return flag;
	//   30   54:iload_2         
	//   31   55:ireturn         
	}

	public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
	{
	//    0    0:return          
	}

	public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
	{
	//    0    0:return          
	}

	public void releaseVideoTexture()
	{
		removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method void removeAllViews()>
		player = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field ExoPlayerInterface player>
	//    5    9:return          
	}

	private ExoPlayerInterface player;
}
