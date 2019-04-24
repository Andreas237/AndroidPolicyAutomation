// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.*;
import android.widget.*;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ErrorMessageProvider;
import com.google.android.exoplayer2.video.VideoListener;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			PlayerControlView, AspectRatioFrameLayout, SubtitleView

public class PlayerView extends FrameLayout
{
	private final class ComponentListener extends com.google.android.exoplayer2.Player.DefaultEventListener
		implements TextOutput, VideoListener, android.view.View.OnLayoutChangeListener
	{

		public void onCues(List list)
		{
			if(subtitleView != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field PlayerView this$0>
		//*   2    4:invokestatic    #32  <Method SubtitleView PlayerView.access$100(PlayerView)>
		//*   3    7:ifnull          21
				subtitleView.onCues(list);
		//    4   10:aload_0         
		//    5   11:getfield        #19  <Field PlayerView this$0>
		//    6   14:invokestatic    #32  <Method SubtitleView PlayerView.access$100(PlayerView)>
		//    7   17:aload_1         
		//    8   18:invokevirtual   #36  <Method void SubtitleView.onCues(List)>
		//    9   21:return          
		}

		public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
				int k1, int l1)
		{
			PlayerView.applyTextureViewRotation((TextureView)view, textureViewRotation);
		//    0    0:aload_1         
		//    1    1:checkcast       #42  <Class TextureView>
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field PlayerView this$0>
		//    4    8:invokestatic    #46  <Method int PlayerView.access$400(PlayerView)>
		//    5   11:invokestatic    #50  <Method void PlayerView.access$500(TextureView, int)>
		//    6   14:return          
		}

		public void onPlayerStateChanged(boolean flag, int i)
		{
			updateBuffering();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field PlayerView this$0>
		//    2    4:invokestatic    #55  <Method void PlayerView.access$800(PlayerView)>
			updateErrorMessage();
		//    3    7:aload_0         
		//    4    8:getfield        #19  <Field PlayerView this$0>
		//    5   11:invokestatic    #58  <Method void PlayerView.access$900(PlayerView)>
			if(isPlayingAd() && controllerHideDuringAds)
		//*   6   14:aload_0         
		//*   7   15:getfield        #19  <Field PlayerView this$0>
		//*   8   18:invokestatic    #62  <Method boolean PlayerView.access$1000(PlayerView)>
		//*   9   21:ifeq            42
		//*  10   24:aload_0         
		//*  11   25:getfield        #19  <Field PlayerView this$0>
		//*  12   28:invokestatic    #65  <Method boolean PlayerView.access$1100(PlayerView)>
		//*  13   31:ifeq            42
			{
				hideController();
		//   14   34:aload_0         
		//   15   35:getfield        #19  <Field PlayerView this$0>
		//   16   38:invokevirtual   #68  <Method void PlayerView.hideController()>
				return;
		//   17   41:return          
			} else
			{
				maybeShowController(false);
		//   18   42:aload_0         
		//   19   43:getfield        #19  <Field PlayerView this$0>
		//   20   46:iconst_0        
		//   21   47:invokestatic    #72  <Method void PlayerView.access$1200(PlayerView, boolean)>
				return;
		//   22   50:return          
			}
		}

		public void onPositionDiscontinuity(int i)
		{
			if(isPlayingAd() && controllerHideDuringAds)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field PlayerView this$0>
		//*   2    4:invokestatic    #62  <Method boolean PlayerView.access$1000(PlayerView)>
		//*   3    7:ifeq            27
		//*   4   10:aload_0         
		//*   5   11:getfield        #19  <Field PlayerView this$0>
		//*   6   14:invokestatic    #65  <Method boolean PlayerView.access$1100(PlayerView)>
		//*   7   17:ifeq            27
				hideController();
		//    8   20:aload_0         
		//    9   21:getfield        #19  <Field PlayerView this$0>
		//   10   24:invokevirtual   #68  <Method void PlayerView.hideController()>
		//   11   27:return          
		}

		public void onRenderedFirstFrame()
		{
			if(shutterView != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field PlayerView this$0>
		//*   2    4:invokestatic    #79  <Method View PlayerView.access$600(PlayerView)>
		//*   3    7:ifnull          21
				shutterView.setVisibility(4);
		//    4   10:aload_0         
		//    5   11:getfield        #19  <Field PlayerView this$0>
		//    6   14:invokestatic    #79  <Method View PlayerView.access$600(PlayerView)>
		//    7   17:iconst_4        
		//    8   18:invokevirtual   #84  <Method void View.setVisibility(int)>
		//    9   21:return          
		}

		public void onTracksChanged(TrackGroupArray trackgrouparray, TrackSelectionArray trackselectionarray)
		{
			updateForCurrentTrackSelections(false);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field PlayerView this$0>
		//    2    4:iconst_0        
		//    3    5:invokestatic    #89  <Method void PlayerView.access$700(PlayerView, boolean)>
		//    4    8:return          
		}

		public void onVideoSizeChanged(int i, int j, int k, float f)
		{
			float f1;
label0:
			{
label1:
				{
					if(contentFrame == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field PlayerView this$0>
		//*   2    4:invokestatic    #95  <Method AspectRatioFrameLayout PlayerView.access$200(PlayerView)>
		//*   3    7:ifnonnull       11
						return;
		//    4   10:return          
					if(j != 0 && i != 0)
		//*   5   11:iload_2         
		//*   6   12:ifeq            35
		//*   7   15:iload_1         
		//*   8   16:ifne            22
		//*   9   19:goto            35
						f = ((float)i * f) / (float)j;
		//   10   22:iload_1         
		//   11   23:i2f             
		//   12   24:fload           4
		//   13   26:fmul            
		//   14   27:iload_2         
		//   15   28:i2f             
		//   16   29:fdiv            
		//   17   30:fstore          4
					else
		//*  18   32:goto            38
						f = 1.0F;
		//   19   35:fconst_1        
		//   20   36:fstore          4
					f1 = f;
		//   21   38:fload           4
		//   22   40:fstore          5
					if(!(surfaceView instanceof TextureView))
						break label0;
		//   23   42:aload_0         
		//   24   43:getfield        #19  <Field PlayerView this$0>
		//   25   46:invokestatic    #98  <Method View PlayerView.access$300(PlayerView)>
		//   26   49:instanceof      #42  <Class TextureView>
		//   27   52:ifeq            149
					if(k != 90)
		//*  28   55:iload_3         
		//*  29   56:bipush          90
		//*  30   58:icmpeq          72
					{
						f1 = f;
		//   31   61:fload           4
		//   32   63:fstore          5
						if(k != 270)
							break label1;
		//   33   65:iload_3         
		//   34   66:sipush          270
		//   35   69:icmpne          78
					}
					f1 = 1.0F / f;
		//   36   72:fconst_1        
		//   37   73:fload           4
		//   38   75:fdiv            
		//   39   76:fstore          5
				}
				if(textureViewRotation != 0)
		//*  40   78:aload_0         
		//*  41   79:getfield        #19  <Field PlayerView this$0>
		//*  42   82:invokestatic    #46  <Method int PlayerView.access$400(PlayerView)>
		//*  43   85:ifeq            99
					surfaceView.removeOnLayoutChangeListener(((android.view.View.OnLayoutChangeListener) (this)));
		//   44   88:aload_0         
		//   45   89:getfield        #19  <Field PlayerView this$0>
		//   46   92:invokestatic    #98  <Method View PlayerView.access$300(PlayerView)>
		//   47   95:aload_0         
		//   48   96:invokevirtual   #102 <Method void View.removeOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
				textureViewRotation = k;
		//   49   99:aload_0         
		//   50  100:getfield        #19  <Field PlayerView this$0>
		//   51  103:iload_3         
		//   52  104:invokestatic    #106 <Method int PlayerView.access$402(PlayerView, int)>
		//   53  107:pop             
				if(textureViewRotation != 0)
		//*  54  108:aload_0         
		//*  55  109:getfield        #19  <Field PlayerView this$0>
		//*  56  112:invokestatic    #46  <Method int PlayerView.access$400(PlayerView)>
		//*  57  115:ifeq            129
					surfaceView.addOnLayoutChangeListener(((android.view.View.OnLayoutChangeListener) (this)));
		//   58  118:aload_0         
		//   59  119:getfield        #19  <Field PlayerView this$0>
		//   60  122:invokestatic    #98  <Method View PlayerView.access$300(PlayerView)>
		//   61  125:aload_0         
		//   62  126:invokevirtual   #109 <Method void View.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
				PlayerView.applyTextureViewRotation((TextureView)surfaceView, textureViewRotation);
		//   63  129:aload_0         
		//   64  130:getfield        #19  <Field PlayerView this$0>
		//   65  133:invokestatic    #98  <Method View PlayerView.access$300(PlayerView)>
		//   66  136:checkcast       #42  <Class TextureView>
		//   67  139:aload_0         
		//   68  140:getfield        #19  <Field PlayerView this$0>
		//   69  143:invokestatic    #46  <Method int PlayerView.access$400(PlayerView)>
		//   70  146:invokestatic    #50  <Method void PlayerView.access$500(TextureView, int)>
			}
			contentFrame.setAspectRatio(f1);
		//   71  149:aload_0         
		//   72  150:getfield        #19  <Field PlayerView this$0>
		//   73  153:invokestatic    #95  <Method AspectRatioFrameLayout PlayerView.access$200(PlayerView)>
		//   74  156:fload           5
		//   75  158:invokevirtual   #115 <Method void AspectRatioFrameLayout.setAspectRatio(float)>
		//   76  161:return          
		}

		final PlayerView this$0;

		private ComponentListener()
		{
			this$0 = PlayerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field PlayerView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void com.google.android.exoplayer2.Player$DefaultEventListener()>
		//    5    9:return          
		}

	}


	public PlayerView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #59  <Method void PlayerView(Context, AttributeSet)>
	//    4    6:return          
	}

	public PlayerView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #63  <Method void PlayerView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public PlayerView(Context context, AttributeSet attributeset, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #65  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #72  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private static void applyTextureViewRotation(TextureView textureview, int i)
	{
		float f = textureview.getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method int TextureView.getWidth()>
	//    2    4:i2f             
	//    3    5:fstore_2        
		float f1 = textureview.getHeight();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #136 <Method int TextureView.getHeight()>
	//    6   10:i2f             
	//    7   11:fstore_3        
		if(f != 0.0F && f1 != 0.0F && i != 0)
	//*   8   12:fload_2         
	//*   9   13:fconst_0        
	//*  10   14:fcmpl           
	//*  11   15:ifeq            125
	//*  12   18:fload_3         
	//*  13   19:fconst_0        
	//*  14   20:fcmpl           
	//*  15   21:ifeq            125
	//*  16   24:iload_1         
	//*  17   25:ifne            31
	//*  18   28:goto            125
		{
			Matrix matrix = new Matrix();
	//   19   31:new             #138 <Class Matrix>
	//   20   34:dup             
	//   21   35:invokespecial   #140 <Method void Matrix()>
	//   22   38:astore          6
			float f2 = f / 2.0F;
	//   23   40:fload_2         
	//   24   41:fconst_2        
	//   25   42:fdiv            
	//   26   43:fstore          4
			float f3 = f1 / 2.0F;
	//   27   45:fload_3         
	//   28   46:fconst_2        
	//   29   47:fdiv            
	//   30   48:fstore          5
			matrix.postRotate(i, f2, f3);
	//   31   50:aload           6
	//   32   52:iload_1         
	//   33   53:i2f             
	//   34   54:fload           4
	//   35   56:fload           5
	//   36   58:invokevirtual   #144 <Method boolean Matrix.postRotate(float, float, float)>
	//   37   61:pop             
			RectF rectf = new RectF(0.0F, 0.0F, f, f1);
	//   38   62:new             #146 <Class RectF>
	//   39   65:dup             
	//   40   66:fconst_0        
	//   41   67:fconst_0        
	//   42   68:fload_2         
	//   43   69:fload_3         
	//   44   70:invokespecial   #149 <Method void RectF(float, float, float, float)>
	//   45   73:astore          7
			RectF rectf1 = new RectF();
	//   46   75:new             #146 <Class RectF>
	//   47   78:dup             
	//   48   79:invokespecial   #150 <Method void RectF()>
	//   49   82:astore          8
			matrix.mapRect(rectf1, rectf);
	//   50   84:aload           6
	//   51   86:aload           8
	//   52   88:aload           7
	//   53   90:invokevirtual   #154 <Method boolean Matrix.mapRect(RectF, RectF)>
	//   54   93:pop             
			matrix.postScale(f / rectf1.width(), f1 / rectf1.height(), f2, f3);
	//   55   94:aload           6
	//   56   96:fload_2         
	//   57   97:aload           8
	//   58   99:invokevirtual   #158 <Method float RectF.width()>
	//   59  102:fdiv            
	//   60  103:fload_3         
	//   61  104:aload           8
	//   62  106:invokevirtual   #161 <Method float RectF.height()>
	//   63  109:fdiv            
	//   64  110:fload           4
	//   65  112:fload           5
	//   66  114:invokevirtual   #165 <Method boolean Matrix.postScale(float, float, float, float)>
	//   67  117:pop             
			textureview.setTransform(matrix);
	//   68  118:aload_0         
	//   69  119:aload           6
	//   70  121:invokevirtual   #169 <Method void TextureView.setTransform(Matrix)>
			return;
	//   71  124:return          
		} else
		{
			textureview.setTransform(((Matrix) (null)));
	//   72  125:aload_0         
	//   73  126:aconst_null     
	//   74  127:invokevirtual   #169 <Method void TextureView.setTransform(Matrix)>
			return;
	//   75  130:return          
		}
	}

	private void closeShutter()
	{
		if(shutterView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field View shutterView>
	//*   2    4:ifnull          15
			shutterView.setVisibility(0);
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field View shutterView>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #176 <Method void View.setVisibility(int)>
	//    7   15:return          
	}

	private static void configureEditModeLogo(Resources resources, ImageView imageview)
	{
		imageview.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getstatic       #183 <Field int R$drawable.exo_edit_mode_logo>
	//    3    5:invokevirtual   #189 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//    4    8:invokevirtual   #195 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		imageview.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color));
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getstatic       #200 <Field int R$color.exo_edit_mode_background_color>
	//    8   16:invokevirtual   #204 <Method int Resources.getColor(int)>
	//    9   19:invokevirtual   #207 <Method void ImageView.setBackgroundColor(int)>
	//   10   22:return          
	}

	private static void configureEditModeLogoV23(Resources resources, ImageView imageview)
	{
		imageview.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, ((android.content.res.Resources.Theme) (null))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getstatic       #183 <Field int R$drawable.exo_edit_mode_logo>
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #214 <Method android.graphics.drawable.Drawable Resources.getDrawable(int, android.content.res.Resources$Theme)>
	//    5    9:invokevirtual   #195 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		imageview.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, ((android.content.res.Resources.Theme) (null))));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getstatic       #200 <Field int R$color.exo_edit_mode_background_color>
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #217 <Method int Resources.getColor(int, android.content.res.Resources$Theme)>
	//   11   21:invokevirtual   #207 <Method void ImageView.setBackgroundColor(int)>
	//   12   24:return          
	}

	private void hideArtwork()
	{
		if(artworkView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #221 <Field ImageView artworkView>
	//*   2    4:ifnull          24
		{
			artworkView.setImageResource(0x106000d);
	//    3    7:aload_0         
	//    4    8:getfield        #221 <Field ImageView artworkView>
	//    5   11:ldc1            #222 <Int 0x106000d>
	//    6   13:invokevirtual   #225 <Method void ImageView.setImageResource(int)>
			artworkView.setVisibility(4);
	//    7   16:aload_0         
	//    8   17:getfield        #221 <Field ImageView artworkView>
	//    9   20:iconst_4        
	//   10   21:invokevirtual   #226 <Method void ImageView.setVisibility(int)>
		}
	//   11   24:return          
	}

	private boolean isDpadKey(int i)
	{
		return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
	//    0    0:iload_1         
	//    1    1:bipush          19
	//    2    3:icmpeq          63
	//    3    6:iload_1         
	//    4    7:sipush          270
	//    5   10:icmpeq          63
	//    6   13:iload_1         
	//    7   14:bipush          22
	//    8   16:icmpeq          63
	//    9   19:iload_1         
	//   10   20:sipush          271
	//   11   23:icmpeq          63
	//   12   26:iload_1         
	//   13   27:bipush          20
	//   14   29:icmpeq          63
	//   15   32:iload_1         
	//   16   33:sipush          269
	//   17   36:icmpeq          63
	//   18   39:iload_1         
	//   19   40:bipush          21
	//   20   42:icmpeq          63
	//   21   45:iload_1         
	//   22   46:sipush          268
	//   23   49:icmpeq          63
	//   24   52:iload_1         
	//   25   53:bipush          23
	//   26   55:icmpne          61
	//   27   58:goto            63
	//   28   61:iconst_0        
	//   29   62:ireturn         
	//   30   63:iconst_1        
	//   31   64:ireturn         
	}

	private boolean isPlayingAd()
	{
		return player != null && player.isPlayingAd() && player.getPlayWhenReady();
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field Player player>
	//    2    4:ifnull          33
	//    3    7:aload_0         
	//    4    8:getfield        #232 <Field Player player>
	//    5   11:invokeinterface #235 <Method boolean Player.isPlayingAd()>
	//    6   16:ifeq            33
	//    7   19:aload_0         
	//    8   20:getfield        #232 <Field Player player>
	//    9   23:invokeinterface #238 <Method boolean Player.getPlayWhenReady()>
	//   10   28:ifeq            33
	//   11   31:iconst_1        
	//   12   32:ireturn         
	//   13   33:iconst_0        
	//   14   34:ireturn         
	}

	private void maybeShowController(boolean flag)
	{
		if(isPlayingAd() && controllerHideDuringAds)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #82  <Method boolean isPlayingAd()>
	//*   2    4:ifeq            15
	//*   3    7:aload_0         
	//*   4    8:getfield        #85  <Field boolean controllerHideDuringAds>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(useController)
	//*   7   15:aload_0         
	//*   8   16:getfield        #240 <Field boolean useController>
	//*   9   19:ifeq            71
		{
			boolean flag1;
			if(controller.isVisible() && controller.getShowTimeoutMs() <= 0)
	//*  10   22:aload_0         
	//*  11   23:getfield        #242 <Field PlayerControlView controller>
	//*  12   26:invokevirtual   #247 <Method boolean PlayerControlView.isVisible()>
	//*  13   29:ifeq            47
	//*  14   32:aload_0         
	//*  15   33:getfield        #242 <Field PlayerControlView controller>
	//*  16   36:invokevirtual   #250 <Method int PlayerControlView.getShowTimeoutMs()>
	//*  17   39:ifgt            47
				flag1 = true;
	//   18   42:iconst_1        
	//   19   43:istore_2        
			else
	//*  20   44:goto            49
				flag1 = false;
	//   21   47:iconst_0        
	//   22   48:istore_2        
			boolean flag2 = shouldShowControllerIndefinitely();
	//   23   49:aload_0         
	//   24   50:invokespecial   #253 <Method boolean shouldShowControllerIndefinitely()>
	//   25   53:istore_3        
			if(flag || flag1 || flag2)
	//*  26   54:iload_1         
	//*  27   55:ifne            66
	//*  28   58:iload_2         
	//*  29   59:ifne            66
	//*  30   62:iload_3         
	//*  31   63:ifeq            71
				showController(flag2);
	//   32   66:aload_0         
	//   33   67:iload_3         
	//   34   68:invokespecial   #256 <Method void showController(boolean)>
		}
	//   35   71:return          
	}

	private boolean setArtworkFromBitmap(Bitmap bitmap)
	{
		if(bitmap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          59
		{
			int i = bitmap.getWidth();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #261 <Method int Bitmap.getWidth()>
	//    4    8:istore_2        
			int j = bitmap.getHeight();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #262 <Method int Bitmap.getHeight()>
	//    7   13:istore_3        
			if(i > 0 && j > 0)
	//*   8   14:iload_2         
	//*   9   15:ifle            59
	//*  10   18:iload_3         
	//*  11   19:ifle            59
			{
				if(contentFrame != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #95  <Field AspectRatioFrameLayout contentFrame>
	//*  14   26:ifnull          41
					contentFrame.setAspectRatio((float)i / (float)j);
	//   15   29:aload_0         
	//   16   30:getfield        #95  <Field AspectRatioFrameLayout contentFrame>
	//   17   33:iload_2         
	//   18   34:i2f             
	//   19   35:iload_3         
	//   20   36:i2f             
	//   21   37:fdiv            
	//   22   38:invokevirtual   #268 <Method void AspectRatioFrameLayout.setAspectRatio(float)>
				artworkView.setImageBitmap(bitmap);
	//   23   41:aload_0         
	//   24   42:getfield        #221 <Field ImageView artworkView>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #272 <Method void ImageView.setImageBitmap(Bitmap)>
				artworkView.setVisibility(0);
	//   27   49:aload_0         
	//   28   50:getfield        #221 <Field ImageView artworkView>
	//   29   53:iconst_0        
	//   30   54:invokevirtual   #226 <Method void ImageView.setVisibility(int)>
				return true;
	//   31   57:iconst_1        
	//   32   58:ireturn         
			}
		}
		return false;
	//   33   59:iconst_0        
	//   34   60:ireturn         
	}

	private boolean setArtworkFromMetadata(Metadata metadata)
	{
		for(int i = 0; i < metadata.length(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokevirtual   #279 <Method int Metadata.length()>
	//*   5    7:icmpge          50
		{
			com.google.android.exoplayer2.metadata.Metadata.Entry entry = metadata.get(i);
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #283 <Method com.google.android.exoplayer2.metadata.Metadata$Entry Metadata.get(int)>
	//    9   15:astore_3        
			if(entry instanceof ApicFrame)
	//*  10   16:aload_3         
	//*  11   17:instanceof      #285 <Class ApicFrame>
	//*  12   20:ifeq            43
			{
				metadata = ((Metadata) (((ApicFrame)entry).pictureData));
	//   13   23:aload_3         
	//   14   24:checkcast       #285 <Class ApicFrame>
	//   15   27:getfield        #289 <Field byte[] ApicFrame.pictureData>
	//   16   30:astore_1        
				return setArtworkFromBitmap(BitmapFactory.decodeByteArray(((byte []) (metadata)), 0, metadata.length));
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:iconst_0        
	//   20   34:aload_1         
	//   21   35:arraylength     
	//   22   36:invokestatic    #295 <Method Bitmap BitmapFactory.decodeByteArray(byte[], int, int)>
	//   23   39:invokespecial   #297 <Method boolean setArtworkFromBitmap(Bitmap)>
	//   24   42:ireturn         
			}
		}

	//   25   43:iload_2         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_2        
	//*  29   47:goto            2
		return false;
	//   30   50:iconst_0        
	//   31   51:ireturn         
	}

	private static void setResizeModeRaw(AspectRatioFrameLayout aspectratioframelayout, int i)
	{
		aspectratioframelayout.setResizeMode(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #302 <Method void AspectRatioFrameLayout.setResizeMode(int)>
	//    3    5:return          
	}

	private boolean shouldShowControllerIndefinitely()
	{
		boolean flag;
label0:
		{
			Player player1 = player;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field Player player>
	//    2    4:astore          4
			boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore_3        
			if(player1 == null)
	//*   5    8:aload           4
	//*   6   10:ifnonnull       15
				return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
			int i = player.getPlaybackState();
	//    9   15:aload_0         
	//   10   16:getfield        #232 <Field Player player>
	//   11   19:invokeinterface #305 <Method int Player.getPlaybackState()>
	//   12   24:istore_1        
			if(controllerAutoShow)
	//*  13   25:aload_0         
	//*  14   26:getfield        #307 <Field boolean controllerAutoShow>
	//*  15   29:ifeq            60
			{
				flag = flag1;
	//   16   32:iload_3         
	//   17   33:istore_2        
				if(i == 1)
					break label0;
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:icmpeq          62
				flag = flag1;
	//   21   39:iload_3         
	//   22   40:istore_2        
				if(i == 4)
					break label0;
	//   23   41:iload_1         
	//   24   42:iconst_4        
	//   25   43:icmpeq          62
				if(!player.getPlayWhenReady())
	//*  26   46:aload_0         
	//*  27   47:getfield        #232 <Field Player player>
	//*  28   50:invokeinterface #238 <Method boolean Player.getPlayWhenReady()>
	//*  29   55:ifne            60
					return true;
	//   30   58:iconst_1        
	//   31   59:ireturn         
			}
			flag = false;
	//   32   60:iconst_0        
	//   33   61:istore_2        
		}
		return flag;
	//   34   62:iload_2         
	//   35   63:ireturn         
	}

	private void showController(boolean flag)
	{
		if(!useController)
	//*   0    0:aload_0         
	//*   1    1:getfield        #240 <Field boolean useController>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		PlayerControlView playercontrolview = controller;
	//    4    8:aload_0         
	//    5    9:getfield        #242 <Field PlayerControlView controller>
	//    6   12:astore_3        
		int i;
		if(flag)
	//*   7   13:iload_1         
	//*   8   14:ifeq            22
			i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		else
	//*  11   19:goto            27
			i = controllerShowTimeoutMs;
	//   12   22:aload_0         
	//   13   23:getfield        #309 <Field int controllerShowTimeoutMs>
	//   14   26:istore_2        
		playercontrolview.setShowTimeoutMs(i);
	//   15   27:aload_3         
	//   16   28:iload_2         
	//   17   29:invokevirtual   #312 <Method void PlayerControlView.setShowTimeoutMs(int)>
		controller.show();
	//   18   32:aload_0         
	//   19   33:getfield        #242 <Field PlayerControlView controller>
	//   20   36:invokevirtual   #315 <Method void PlayerControlView.show()>
	//   21   39:return          
	}

	public static void switchTargetView(Player player1, PlayerView playerview, PlayerView playerview1)
	{
		if(playerview == playerview1)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpne       6
			return;
	//    3    5:return          
		if(playerview1 != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          15
			playerview1.setPlayer(player1);
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #322 <Method void setPlayer(Player)>
		if(playerview != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          24
			playerview.setPlayer(((Player) (null)));
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:invokevirtual   #322 <Method void setPlayer(Player)>
	//   14   24:return          
	}

	private void updateBuffering()
	{
		if(bufferingView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #325 <Field View bufferingView>
	//*   2    4:ifnull          81
		{
			boolean flag2 = showBuffering;
	//    3    7:aload_0         
	//    4    8:getfield        #327 <Field boolean showBuffering>
	//    5   11:istore_3        
			boolean flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
			boolean flag;
			if(flag2 && player != null && player.getPlaybackState() == 2 && player.getPlayWhenReady())
	//*   8   14:iload_3         
	//*   9   15:ifeq            55
	//*  10   18:aload_0         
	//*  11   19:getfield        #232 <Field Player player>
	//*  12   22:ifnull          55
	//*  13   25:aload_0         
	//*  14   26:getfield        #232 <Field Player player>
	//*  15   29:invokeinterface #305 <Method int Player.getPlaybackState()>
	//*  16   34:iconst_2        
	//*  17   35:icmpne          55
	//*  18   38:aload_0         
	//*  19   39:getfield        #232 <Field Player player>
	//*  20   42:invokeinterface #238 <Method boolean Player.getPlayWhenReady()>
	//*  21   47:ifeq            55
				flag = true;
	//   22   50:iconst_1        
	//   23   51:istore_1        
			else
	//*  24   52:goto            57
				flag = false;
	//   25   55:iconst_0        
	//   26   56:istore_1        
			View view = bufferingView;
	//   27   57:aload_0         
	//   28   58:getfield        #325 <Field View bufferingView>
	//   29   61:astore          4
			byte byte0;
			if(flag)
	//*  30   63:iload_1         
	//*  31   64:ifeq            72
				byte0 = ((byte) (flag1));
	//   32   67:iload_2         
	//   33   68:istore_1        
			else
	//*  34   69:goto            75
				byte0 = 8;
	//   35   72:bipush          8
	//   36   74:istore_1        
			view.setVisibility(((int) (byte0)));
	//   37   75:aload           4
	//   38   77:iload_1         
	//   39   78:invokevirtual   #176 <Method void View.setVisibility(int)>
		}
	//   40   81:return          
	}

	private void updateErrorMessage()
	{
		if(errorMessageView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #329 <Field TextView errorMessageView>
	//*   2    4:ifnull          126
		{
			if(customErrorMessage != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #331 <Field CharSequence customErrorMessage>
	//*   5   11:ifnull          34
			{
				errorMessageView.setText(customErrorMessage);
	//    6   14:aload_0         
	//    7   15:getfield        #329 <Field TextView errorMessageView>
	//    8   18:aload_0         
	//    9   19:getfield        #331 <Field CharSequence customErrorMessage>
	//   10   22:invokevirtual   #337 <Method void TextView.setText(CharSequence)>
				errorMessageView.setVisibility(0);
	//   11   25:aload_0         
	//   12   26:getfield        #329 <Field TextView errorMessageView>
	//   13   29:iconst_0        
	//   14   30:invokevirtual   #338 <Method void TextView.setVisibility(int)>
				return;
	//   15   33:return          
			}
			Object obj1 = null;
	//   16   34:aconst_null     
	//   17   35:astore_2        
			Object obj = ((Object) (obj1));
	//   18   36:aload_2         
	//   19   37:astore_1        
			if(player != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #232 <Field Player player>
	//*  22   42:ifnull          79
			{
				obj = ((Object) (obj1));
	//   23   45:aload_2         
	//   24   46:astore_1        
				if(player.getPlaybackState() == 1)
	//*  25   47:aload_0         
	//*  26   48:getfield        #232 <Field Player player>
	//*  27   51:invokeinterface #305 <Method int Player.getPlaybackState()>
	//*  28   56:iconst_1        
	//*  29   57:icmpne          79
				{
					obj = ((Object) (obj1));
	//   30   60:aload_2         
	//   31   61:astore_1        
					if(errorMessageProvider != null)
	//*  32   62:aload_0         
	//*  33   63:getfield        #340 <Field ErrorMessageProvider errorMessageProvider>
	//*  34   66:ifnull          79
						obj = ((Object) (player.getPlaybackError()));
	//   35   69:aload_0         
	//   36   70:getfield        #232 <Field Player player>
	//   37   73:invokeinterface #344 <Method com.google.android.exoplayer2.ExoPlaybackException Player.getPlaybackError()>
	//   38   78:astore_1        
				}
			}
			if(obj != null)
	//*  39   79:aload_1         
	//*  40   80:ifnull          117
			{
				obj = ((Object) ((CharSequence)errorMessageProvider.getErrorMessage(((Throwable) (obj))).second));
	//   41   83:aload_0         
	//   42   84:getfield        #340 <Field ErrorMessageProvider errorMessageProvider>
	//   43   87:aload_1         
	//   44   88:invokeinterface #350 <Method Pair ErrorMessageProvider.getErrorMessage(Throwable)>
	//   45   93:getfield        #356 <Field Object Pair.second>
	//   46   96:checkcast       #358 <Class CharSequence>
	//   47   99:astore_1        
				errorMessageView.setText(((CharSequence) (obj)));
	//   48  100:aload_0         
	//   49  101:getfield        #329 <Field TextView errorMessageView>
	//   50  104:aload_1         
	//   51  105:invokevirtual   #337 <Method void TextView.setText(CharSequence)>
				errorMessageView.setVisibility(0);
	//   52  108:aload_0         
	//   53  109:getfield        #329 <Field TextView errorMessageView>
	//   54  112:iconst_0        
	//   55  113:invokevirtual   #338 <Method void TextView.setVisibility(int)>
				return;
	//   56  116:return          
			}
			errorMessageView.setVisibility(8);
	//   57  117:aload_0         
	//   58  118:getfield        #329 <Field TextView errorMessageView>
	//   59  121:bipush          8
	//   60  123:invokevirtual   #338 <Method void TextView.setVisibility(int)>
		}
	//   61  126:return          
	}

	private void updateForCurrentTrackSelections(boolean flag)
	{
		if(player != null && !player.getCurrentTrackGroups().isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #232 <Field Player player>
	//*   2    4:ifnull          204
	//*   3    7:aload_0         
	//*   4    8:getfield        #232 <Field Player player>
	//*   5   11:invokeinterface #362 <Method TrackGroupArray Player.getCurrentTrackGroups()>
	//*   6   16:invokevirtual   #367 <Method boolean TrackGroupArray.isEmpty()>
	//*   7   19:ifeq            25
	//*   8   22:goto            204
		{
			if(flag && !keepContentOnPlayerReset)
	//*   9   25:iload_1         
	//*  10   26:ifeq            40
	//*  11   29:aload_0         
	//*  12   30:getfield        #369 <Field boolean keepContentOnPlayerReset>
	//*  13   33:ifne            40
				closeShutter();
	//   14   36:aload_0         
	//   15   37:invokespecial   #371 <Method void closeShutter()>
			TrackSelectionArray trackselectionarray = player.getCurrentTrackSelections();
	//   16   40:aload_0         
	//   17   41:getfield        #232 <Field Player player>
	//   18   44:invokeinterface #375 <Method TrackSelectionArray Player.getCurrentTrackSelections()>
	//   19   49:astore          4
			for(int i = 0; i < trackselectionarray.length; i++)
	//*  20   51:iconst_0        
	//*  21   52:istore_2        
	//*  22   53:iload_2         
	//*  23   54:aload           4
	//*  24   56:getfield        #379 <Field int TrackSelectionArray.length>
	//*  25   59:icmpge          97
				if(player.getRendererType(i) == 2 && trackselectionarray.get(i) != null)
	//*  26   62:aload_0         
	//*  27   63:getfield        #232 <Field Player player>
	//*  28   66:iload_2         
	//*  29   67:invokeinterface #382 <Method int Player.getRendererType(int)>
	//*  30   72:iconst_2        
	//*  31   73:icmpne          90
	//*  32   76:aload           4
	//*  33   78:iload_2         
	//*  34   79:invokevirtual   #385 <Method TrackSelection TrackSelectionArray.get(int)>
	//*  35   82:ifnull          90
				{
					hideArtwork();
	//   36   85:aload_0         
	//   37   86:invokespecial   #387 <Method void hideArtwork()>
					return;
	//   38   89:return          
				}

	//   39   90:iload_2         
	//   40   91:iconst_1        
	//   41   92:iadd            
	//   42   93:istore_2        
	//*  43   94:goto            53
			closeShutter();
	//   44   97:aload_0         
	//   45   98:invokespecial   #371 <Method void closeShutter()>
			if(useArtwork)
	//*  46  101:aload_0         
	//*  47  102:getfield        #389 <Field boolean useArtwork>
	//*  48  105:ifeq            199
			{
label0:
				for(int j = 0; j < trackselectionarray.length; j++)
	//*  49  108:iconst_0        
	//*  50  109:istore_2        
	//*  51  110:iload_2         
	//*  52  111:aload           4
	//*  53  113:getfield        #379 <Field int TrackSelectionArray.length>
	//*  54  116:icmpge          187
				{
					TrackSelection trackselection = trackselectionarray.get(j);
	//   55  119:aload           4
	//   56  121:iload_2         
	//   57  122:invokevirtual   #385 <Method TrackSelection TrackSelectionArray.get(int)>
	//   58  125:astore          5
					if(trackselection == null)
						continue;
	//   59  127:aload           5
	//   60  129:ifnull          180
					int k = 0;
	//   61  132:iconst_0        
	//   62  133:istore_3        
					do
					{
						if(k >= trackselection.length())
							continue label0;
	//   63  134:iload_3         
	//   64  135:aload           5
	//   65  137:invokeinterface #392 <Method int TrackSelection.length()>
	//   66  142:icmpge          180
						Metadata metadata = trackselection.getFormat(k).metadata;
	//   67  145:aload           5
	//   68  147:iload_3         
	//   69  148:invokeinterface #396 <Method Format TrackSelection.getFormat(int)>
	//   70  153:getfield        #402 <Field Metadata Format.metadata>
	//   71  156:astore          6
						if(metadata != null && setArtworkFromMetadata(metadata))
	//*  72  158:aload           6
	//*  73  160:ifnull          173
	//*  74  163:aload_0         
	//*  75  164:aload           6
	//*  76  166:invokespecial   #404 <Method boolean setArtworkFromMetadata(Metadata)>
	//*  77  169:ifeq            173
							return;
	//   78  172:return          
						k++;
	//   79  173:iload_3         
	//   80  174:iconst_1        
	//   81  175:iadd            
	//   82  176:istore_3        
					} while(true);
	//   83  177:goto            134
				}

	//   84  180:iload_2         
	//   85  181:iconst_1        
	//   86  182:iadd            
	//   87  183:istore_2        
	//*  88  184:goto            110
				if(setArtworkFromBitmap(defaultArtwork))
	//*  89  187:aload_0         
	//*  90  188:aload_0         
	//*  91  189:getfield        #406 <Field Bitmap defaultArtwork>
	//*  92  192:invokespecial   #297 <Method boolean setArtworkFromBitmap(Bitmap)>
	//*  93  195:ifeq            199
					return;
	//   94  198:return          
			}
			hideArtwork();
	//   95  199:aload_0         
	//   96  200:invokespecial   #387 <Method void hideArtwork()>
			return;
	//   97  203:return          
		}
		if(!keepContentOnPlayerReset)
	//*  98  204:aload_0         
	//*  99  205:getfield        #369 <Field boolean keepContentOnPlayerReset>
	//* 100  208:ifne            219
		{
			hideArtwork();
	//  101  211:aload_0         
	//  102  212:invokespecial   #387 <Method void hideArtwork()>
			closeShutter();
	//  103  215:aload_0         
	//  104  216:invokespecial   #371 <Method void closeShutter()>
		}
	//  105  219:return          
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		if(player != null && player.isPlayingAd())
	//*   0    0:aload_0         
	//*   1    1:getfield        #232 <Field Player player>
	//*   2    4:ifnull          33
	//*   3    7:aload_0         
	//*   4    8:getfield        #232 <Field Player player>
	//*   5   11:invokeinterface #235 <Method boolean Player.isPlayingAd()>
	//*   6   16:ifeq            33
		{
			overlayFrameLayout.requestFocus();
	//    7   19:aload_0         
	//    8   20:getfield        #410 <Field FrameLayout overlayFrameLayout>
	//    9   23:invokevirtual   #413 <Method boolean FrameLayout.requestFocus()>
	//   10   26:pop             
			return super.dispatchKeyEvent(keyevent);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:invokespecial   #415 <Method boolean FrameLayout.dispatchKeyEvent(KeyEvent)>
	//   14   32:ireturn         
		}
		boolean flag2 = isDpadKey(keyevent.getKeyCode());
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #420 <Method int KeyEvent.getKeyCode()>
	//   18   38:invokespecial   #422 <Method boolean isDpadKey(int)>
	//   19   41:istore          4
		boolean flag1 = false;
	//   20   43:iconst_0        
	//   21   44:istore_3        
		boolean flag;
		if(flag2 && useController && !controller.isVisible())
	//*  22   45:iload           4
	//*  23   47:ifeq            72
	//*  24   50:aload_0         
	//*  25   51:getfield        #240 <Field boolean useController>
	//*  26   54:ifeq            72
	//*  27   57:aload_0         
	//*  28   58:getfield        #242 <Field PlayerControlView controller>
	//*  29   61:invokevirtual   #247 <Method boolean PlayerControlView.isVisible()>
	//*  30   64:ifne            72
			flag = true;
	//   31   67:iconst_1        
	//   32   68:istore_2        
		else
	//*  33   69:goto            74
			flag = false;
	//   34   72:iconst_0        
	//   35   73:istore_2        
		maybeShowController(true);
	//   36   74:aload_0         
	//   37   75:iconst_1        
	//   38   76:invokespecial   #91  <Method void maybeShowController(boolean)>
		if(flag || dispatchMediaKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent))
	//*  39   79:iload_2         
	//*  40   80:ifne            99
	//*  41   83:aload_0         
	//*  42   84:aload_1         
	//*  43   85:invokevirtual   #425 <Method boolean dispatchMediaKeyEvent(KeyEvent)>
	//*  44   88:ifne            99
	//*  45   91:aload_0         
	//*  46   92:aload_1         
	//*  47   93:invokespecial   #415 <Method boolean FrameLayout.dispatchKeyEvent(KeyEvent)>
	//*  48   96:ifeq            101
			flag1 = true;
	//   49   99:iconst_1        
	//   50  100:istore_3        
		return flag1;
	//   51  101:iload_3         
	//   52  102:ireturn         
	}

	public boolean dispatchMediaKeyEvent(KeyEvent keyevent)
	{
		return useController && controller.dispatchMediaKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field boolean useController>
	//    2    4:ifeq            20
	//    3    7:aload_0         
	//    4    8:getfield        #242 <Field PlayerControlView controller>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #426 <Method boolean PlayerControlView.dispatchMediaKeyEvent(KeyEvent)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public boolean getControllerAutoShow()
	{
		return controllerAutoShow;
	//    0    0:aload_0         
	//    1    1:getfield        #307 <Field boolean controllerAutoShow>
	//    2    4:ireturn         
	}

	public boolean getControllerHideOnTouch()
	{
		return controllerHideOnTouch;
	//    0    0:aload_0         
	//    1    1:getfield        #430 <Field boolean controllerHideOnTouch>
	//    2    4:ireturn         
	}

	public int getControllerShowTimeoutMs()
	{
		return controllerShowTimeoutMs;
	//    0    0:aload_0         
	//    1    1:getfield        #309 <Field int controllerShowTimeoutMs>
	//    2    4:ireturn         
	}

	public Bitmap getDefaultArtwork()
	{
		return defaultArtwork;
	//    0    0:aload_0         
	//    1    1:getfield        #406 <Field Bitmap defaultArtwork>
	//    2    4:areturn         
	}

	public FrameLayout getOverlayFrameLayout()
	{
		return overlayFrameLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #410 <Field FrameLayout overlayFrameLayout>
	//    2    4:areturn         
	}

	public Player getPlayer()
	{
		return player;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field Player player>
	//    2    4:areturn         
	}

	public int getResizeMode()
	{
		boolean flag;
		if(contentFrame != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field AspectRatioFrameLayout contentFrame>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Assertions.checkState(flag);
	//    8   14:iload_1         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		return contentFrame.getResizeMode();
	//   10   18:aload_0         
	//   11   19:getfield        #95  <Field AspectRatioFrameLayout contentFrame>
	//   12   22:invokevirtual   #445 <Method int AspectRatioFrameLayout.getResizeMode()>
	//   13   25:ireturn         
	}

	public SubtitleView getSubtitleView()
	{
		return subtitleView;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field SubtitleView subtitleView>
	//    2    4:areturn         
	}

	public boolean getUseArtwork()
	{
		return useArtwork;
	//    0    0:aload_0         
	//    1    1:getfield        #389 <Field boolean useArtwork>
	//    2    4:ireturn         
	}

	public boolean getUseController()
	{
		return useController;
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field boolean useController>
	//    2    4:ireturn         
	}

	public View getVideoSurfaceView()
	{
		return surfaceView;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field View surfaceView>
	//    2    4:areturn         
	}

	public void hideController()
	{
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          14
			controller.hide();
	//    3    7:aload_0         
	//    4    8:getfield        #242 <Field PlayerControlView controller>
	//    5   11:invokevirtual   #455 <Method void PlayerControlView.hide()>
	//    6   14:return          
	}

	public boolean isControllerVisible()
	{
		return controller != null && controller.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field PlayerControlView controller>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #242 <Field PlayerControlView controller>
	//    5   11:invokevirtual   #247 <Method boolean PlayerControlView.isVisible()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(useController && player != null && motionevent.getActionMasked() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #240 <Field boolean useController>
	//*   2    4:ifeq            57
	//*   3    7:aload_0         
	//*   4    8:getfield        #232 <Field Player player>
	//*   5   11:ifnull          57
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #463 <Method int MotionEvent.getActionMasked()>
	//*   8   18:ifeq            24
	//*   9   21:goto            57
		{
			if(!controller.isVisible())
	//*  10   24:aload_0         
	//*  11   25:getfield        #242 <Field PlayerControlView controller>
	//*  12   28:invokevirtual   #247 <Method boolean PlayerControlView.isVisible()>
	//*  13   31:ifne            41
			{
				maybeShowController(true);
	//   14   34:aload_0         
	//   15   35:iconst_1        
	//   16   36:invokespecial   #91  <Method void maybeShowController(boolean)>
				return true;
	//   17   39:iconst_1        
	//   18   40:ireturn         
			}
			if(controllerHideOnTouch)
	//*  19   41:aload_0         
	//*  20   42:getfield        #430 <Field boolean controllerHideOnTouch>
	//*  21   45:ifeq            55
				controller.hide();
	//   22   48:aload_0         
	//   23   49:getfield        #242 <Field PlayerControlView controller>
	//   24   52:invokevirtual   #455 <Method void PlayerControlView.hide()>
			return true;
	//   25   55:iconst_1        
	//   26   56:ireturn         
		} else
		{
			return false;
	//   27   57:iconst_0        
	//   28   58:ireturn         
		}
	}

	public boolean onTrackballEvent(MotionEvent motionevent)
	{
		if(useController && player != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #240 <Field boolean useController>
	//*   2    4:ifeq            24
	//*   3    7:aload_0         
	//*   4    8:getfield        #232 <Field Player player>
	//*   5   11:ifnonnull       17
	//*   6   14:goto            24
		{
			maybeShowController(true);
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:invokespecial   #91  <Method void maybeShowController(boolean)>
			return true;
	//   10   22:iconst_1        
	//   11   23:ireturn         
		} else
		{
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		}
	}

	public void setAspectRatioListener(AspectRatioFrameLayout.AspectRatioListener aspectratiolistener)
	{
		boolean flag;
		if(contentFrame != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field AspectRatioFrameLayout contentFrame>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		contentFrame.setAspectRatioListener(aspectratiolistener);
	//   10   18:aload_0         
	//   11   19:getfield        #95  <Field AspectRatioFrameLayout contentFrame>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #468 <Method void AspectRatioFrameLayout.setAspectRatioListener(AspectRatioFrameLayout$AspectRatioListener)>
	//   14   26:return          
	}

	public void setControlDispatcher(ControlDispatcher controldispatcher)
	{
		boolean flag;
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		controller.setControlDispatcher(controldispatcher);
	//   10   18:aload_0         
	//   11   19:getfield        #242 <Field PlayerControlView controller>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #472 <Method void PlayerControlView.setControlDispatcher(ControlDispatcher)>
	//   14   26:return          
	}

	public void setControllerAutoShow(boolean flag)
	{
		controllerAutoShow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #307 <Field boolean controllerAutoShow>
	//    3    5:return          
	}

	public void setControllerHideDuringAds(boolean flag)
	{
		controllerHideDuringAds = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #85  <Field boolean controllerHideDuringAds>
	//    3    5:return          
	}

	public void setControllerHideOnTouch(boolean flag)
	{
		boolean flag1;
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          12
			flag1 = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag1);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		controllerHideOnTouch = flag;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #430 <Field boolean controllerHideOnTouch>
	//   13   23:return          
	}

	public void setControllerShowTimeoutMs(int i)
	{
		boolean flag;
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		controllerShowTimeoutMs = i;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #309 <Field int controllerShowTimeoutMs>
		if(controller.isVisible())
	//*  13   23:aload_0         
	//*  14   24:getfield        #242 <Field PlayerControlView controller>
	//*  15   27:invokevirtual   #247 <Method boolean PlayerControlView.isVisible()>
	//*  16   30:ifeq            37
			showController();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #478 <Method void showController()>
	//   19   37:return          
	}

	public void setControllerVisibilityListener(PlayerControlView.VisibilityListener visibilitylistener)
	{
		boolean flag;
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		controller.setVisibilityListener(visibilitylistener);
	//   10   18:aload_0         
	//   11   19:getfield        #242 <Field PlayerControlView controller>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #483 <Method void PlayerControlView.setVisibilityListener(PlayerControlView$VisibilityListener)>
	//   14   26:return          
	}

	public void setCustomErrorMessage(CharSequence charsequence)
	{
		boolean flag;
		if(errorMessageView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #329 <Field TextView errorMessageView>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		customErrorMessage = charsequence;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #331 <Field CharSequence customErrorMessage>
		updateErrorMessage();
	//   13   23:aload_0         
	//   14   24:invokespecial   #127 <Method void updateErrorMessage()>
	//   15   27:return          
	}

	public void setDefaultArtwork(Bitmap bitmap)
	{
		if(defaultArtwork != bitmap)
	//*   0    0:aload_0         
	//*   1    1:getfield        #406 <Field Bitmap defaultArtwork>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       18
		{
			defaultArtwork = bitmap;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #406 <Field Bitmap defaultArtwork>
			updateForCurrentTrackSelections(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #117 <Method void updateForCurrentTrackSelections(boolean)>
		}
	//   10   18:return          
	}

	public void setErrorMessageProvider(ErrorMessageProvider errormessageprovider)
	{
		if(errorMessageProvider != errormessageprovider)
	//*   0    0:aload_0         
	//*   1    1:getfield        #340 <Field ErrorMessageProvider errorMessageProvider>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			errorMessageProvider = errormessageprovider;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #340 <Field ErrorMessageProvider errorMessageProvider>
			updateErrorMessage();
	//    7   13:aload_0         
	//    8   14:invokespecial   #127 <Method void updateErrorMessage()>
		}
	//    9   17:return          
	}

	public void setExtraAdGroupMarkers(long al[], boolean aflag[])
	{
		boolean flag;
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		Assertions.checkState(flag);
	//    8   14:iload_3         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		controller.setExtraAdGroupMarkers(al, aflag);
	//   10   18:aload_0         
	//   11   19:getfield        #242 <Field PlayerControlView controller>
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #493 <Method void PlayerControlView.setExtraAdGroupMarkers(long[], boolean[])>
	//   15   27:return          
	}

	public void setFastForwardIncrementMs(int i)
	{
		boolean flag;
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		controller.setFastForwardIncrementMs(i);
	//   10   18:aload_0         
	//   11   19:getfield        #242 <Field PlayerControlView controller>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #496 <Method void PlayerControlView.setFastForwardIncrementMs(int)>
	//   14   26:return          
	}

	public void setKeepContentOnPlayerReset(boolean flag)
	{
		if(keepContentOnPlayerReset != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #369 <Field boolean keepContentOnPlayerReset>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			keepContentOnPlayerReset = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #369 <Field boolean keepContentOnPlayerReset>
			updateForCurrentTrackSelections(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #117 <Method void updateForCurrentTrackSelections(boolean)>
		}
	//   10   18:return          
	}

	public void setPlaybackPreparer(PlaybackPreparer playbackpreparer)
	{
		boolean flag;
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		controller.setPlaybackPreparer(playbackpreparer);
	//   10   18:aload_0         
	//   11   19:getfield        #242 <Field PlayerControlView controller>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #501 <Method void PlayerControlView.setPlaybackPreparer(PlaybackPreparer)>
	//   14   26:return          
	}

	public void setPlayer(Player player1)
	{
		if(player == player1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #232 <Field Player player>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		if(player != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #232 <Field Player player>
	//*   7   13:ifnull          126
		{
			player.removeListener(((com.google.android.exoplayer2.Player.EventListener) (componentListener)));
	//    8   16:aload_0         
	//    9   17:getfield        #232 <Field Player player>
	//   10   20:aload_0         
	//   11   21:getfield        #503 <Field PlayerView$ComponentListener componentListener>
	//   12   24:invokeinterface #507 <Method void Player.removeListener(com.google.android.exoplayer2.Player$EventListener)>
			Object obj = ((Object) (player.getVideoComponent()));
	//   13   29:aload_0         
	//   14   30:getfield        #232 <Field Player player>
	//   15   33:invokeinterface #511 <Method com.google.android.exoplayer2.Player$VideoComponent Player.getVideoComponent()>
	//   16   38:astore_2        
			if(obj != null)
	//*  17   39:aload_2         
	//*  18   40:ifnull          102
			{
				((com.google.android.exoplayer2.Player.VideoComponent) (obj)).removeVideoListener(((VideoListener) (componentListener)));
	//   19   43:aload_2         
	//   20   44:aload_0         
	//   21   45:getfield        #503 <Field PlayerView$ComponentListener componentListener>
	//   22   48:invokeinterface #517 <Method void com.google.android.exoplayer2.Player$VideoComponent.removeVideoListener(VideoListener)>
				if(surfaceView instanceof TextureView)
	//*  23   53:aload_0         
	//*  24   54:getfield        #99  <Field View surfaceView>
	//*  25   57:instanceof      #129 <Class TextureView>
	//*  26   60:ifeq            79
					((com.google.android.exoplayer2.Player.VideoComponent) (obj)).clearVideoTextureView((TextureView)surfaceView);
	//   27   63:aload_2         
	//   28   64:aload_0         
	//   29   65:getfield        #99  <Field View surfaceView>
	//   30   68:checkcast       #129 <Class TextureView>
	//   31   71:invokeinterface #521 <Method void com.google.android.exoplayer2.Player$VideoComponent.clearVideoTextureView(TextureView)>
				else
	//*  32   76:goto            102
				if(surfaceView instanceof SurfaceView)
	//*  33   79:aload_0         
	//*  34   80:getfield        #99  <Field View surfaceView>
	//*  35   83:instanceof      #523 <Class SurfaceView>
	//*  36   86:ifeq            102
					((com.google.android.exoplayer2.Player.VideoComponent) (obj)).clearVideoSurfaceView((SurfaceView)surfaceView);
	//   37   89:aload_2         
	//   38   90:aload_0         
	//   39   91:getfield        #99  <Field View surfaceView>
	//   40   94:checkcast       #523 <Class SurfaceView>
	//   41   97:invokeinterface #527 <Method void com.google.android.exoplayer2.Player$VideoComponent.clearVideoSurfaceView(SurfaceView)>
			}
			obj = ((Object) (player.getTextComponent()));
	//   42  102:aload_0         
	//   43  103:getfield        #232 <Field Player player>
	//   44  106:invokeinterface #531 <Method com.google.android.exoplayer2.Player$TextComponent Player.getTextComponent()>
	//   45  111:astore_2        
			if(obj != null)
	//*  46  112:aload_2         
	//*  47  113:ifnull          126
				((com.google.android.exoplayer2.Player.TextComponent) (obj)).removeTextOutput(((TextOutput) (componentListener)));
	//   48  116:aload_2         
	//   49  117:aload_0         
	//   50  118:getfield        #503 <Field PlayerView$ComponentListener componentListener>
	//   51  121:invokeinterface #537 <Method void com.google.android.exoplayer2.Player$TextComponent.removeTextOutput(TextOutput)>
		}
		player = player1;
	//   52  126:aload_0         
	//   53  127:aload_1         
	//   54  128:putfield        #232 <Field Player player>
		if(useController)
	//*  55  131:aload_0         
	//*  56  132:getfield        #240 <Field boolean useController>
	//*  57  135:ifeq            146
			controller.setPlayer(player1);
	//   58  138:aload_0         
	//   59  139:getfield        #242 <Field PlayerControlView controller>
	//   60  142:aload_1         
	//   61  143:invokevirtual   #538 <Method void PlayerControlView.setPlayer(Player)>
		if(subtitleView != null)
	//*  62  146:aload_0         
	//*  63  147:getfield        #76  <Field SubtitleView subtitleView>
	//*  64  150:ifnull          161
			subtitleView.setCues(((List) (null)));
	//   65  153:aload_0         
	//   66  154:getfield        #76  <Field SubtitleView subtitleView>
	//   67  157:aconst_null     
	//   68  158:invokevirtual   #544 <Method void SubtitleView.setCues(List)>
		updateBuffering();
	//   69  161:aload_0         
	//   70  162:invokespecial   #123 <Method void updateBuffering()>
		updateErrorMessage();
	//   71  165:aload_0         
	//   72  166:invokespecial   #127 <Method void updateErrorMessage()>
		updateForCurrentTrackSelections(true);
	//   73  169:aload_0         
	//   74  170:iconst_1        
	//   75  171:invokespecial   #117 <Method void updateForCurrentTrackSelections(boolean)>
		if(player1 != null)
	//*  76  174:aload_1         
	//*  77  175:ifnull          285
		{
			Object obj1 = ((Object) (player1.getVideoComponent()));
	//   78  178:aload_1         
	//   79  179:invokeinterface #511 <Method com.google.android.exoplayer2.Player$VideoComponent Player.getVideoComponent()>
	//   80  184:astore_2        
			if(obj1 != null)
	//*  81  185:aload_2         
	//*  82  186:ifnull          248
			{
				if(surfaceView instanceof TextureView)
	//*  83  189:aload_0         
	//*  84  190:getfield        #99  <Field View surfaceView>
	//*  85  193:instanceof      #129 <Class TextureView>
	//*  86  196:ifeq            215
					((com.google.android.exoplayer2.Player.VideoComponent) (obj1)).setVideoTextureView((TextureView)surfaceView);
	//   87  199:aload_2         
	//   88  200:aload_0         
	//   89  201:getfield        #99  <Field View surfaceView>
	//   90  204:checkcast       #129 <Class TextureView>
	//   91  207:invokeinterface #547 <Method void com.google.android.exoplayer2.Player$VideoComponent.setVideoTextureView(TextureView)>
				else
	//*  92  212:goto            238
				if(surfaceView instanceof SurfaceView)
	//*  93  215:aload_0         
	//*  94  216:getfield        #99  <Field View surfaceView>
	//*  95  219:instanceof      #523 <Class SurfaceView>
	//*  96  222:ifeq            238
					((com.google.android.exoplayer2.Player.VideoComponent) (obj1)).setVideoSurfaceView((SurfaceView)surfaceView);
	//   97  225:aload_2         
	//   98  226:aload_0         
	//   99  227:getfield        #99  <Field View surfaceView>
	//  100  230:checkcast       #523 <Class SurfaceView>
	//  101  233:invokeinterface #550 <Method void com.google.android.exoplayer2.Player$VideoComponent.setVideoSurfaceView(SurfaceView)>
				((com.google.android.exoplayer2.Player.VideoComponent) (obj1)).addVideoListener(((VideoListener) (componentListener)));
	//  102  238:aload_2         
	//  103  239:aload_0         
	//  104  240:getfield        #503 <Field PlayerView$ComponentListener componentListener>
	//  105  243:invokeinterface #553 <Method void com.google.android.exoplayer2.Player$VideoComponent.addVideoListener(VideoListener)>
			}
			obj1 = ((Object) (player1.getTextComponent()));
	//  106  248:aload_1         
	//  107  249:invokeinterface #531 <Method com.google.android.exoplayer2.Player$TextComponent Player.getTextComponent()>
	//  108  254:astore_2        
			if(obj1 != null)
	//* 109  255:aload_2         
	//* 110  256:ifnull          269
				((com.google.android.exoplayer2.Player.TextComponent) (obj1)).addTextOutput(((TextOutput) (componentListener)));
	//  111  259:aload_2         
	//  112  260:aload_0         
	//  113  261:getfield        #503 <Field PlayerView$ComponentListener componentListener>
	//  114  264:invokeinterface #556 <Method void com.google.android.exoplayer2.Player$TextComponent.addTextOutput(TextOutput)>
			player1.addListener(((com.google.android.exoplayer2.Player.EventListener) (componentListener)));
	//  115  269:aload_1         
	//  116  270:aload_0         
	//  117  271:getfield        #503 <Field PlayerView$ComponentListener componentListener>
	//  118  274:invokeinterface #559 <Method void Player.addListener(com.google.android.exoplayer2.Player$EventListener)>
			maybeShowController(false);
	//  119  279:aload_0         
	//  120  280:iconst_0        
	//  121  281:invokespecial   #91  <Method void maybeShowController(boolean)>
			return;
	//  122  284:return          
		} else
		{
			hideController();
	//  123  285:aload_0         
	//  124  286:invokevirtual   #561 <Method void hideController()>
			return;
	//  125  289:return          
		}
	}

	public void setRepeatToggleModes(int i)
	{
		boolean flag;
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		controller.setRepeatToggleModes(i);
	//   10   18:aload_0         
	//   11   19:getfield        #242 <Field PlayerControlView controller>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #564 <Method void PlayerControlView.setRepeatToggleModes(int)>
	//   14   26:return          
	}

	public void setResizeMode(int i)
	{
		boolean flag;
		if(contentFrame != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field AspectRatioFrameLayout contentFrame>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		contentFrame.setResizeMode(i);
	//   10   18:aload_0         
	//   11   19:getfield        #95  <Field AspectRatioFrameLayout contentFrame>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #302 <Method void AspectRatioFrameLayout.setResizeMode(int)>
	//   14   26:return          
	}

	public void setRewindIncrementMs(int i)
	{
		boolean flag;
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		controller.setRewindIncrementMs(i);
	//   10   18:aload_0         
	//   11   19:getfield        #242 <Field PlayerControlView controller>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #567 <Method void PlayerControlView.setRewindIncrementMs(int)>
	//   14   26:return          
	}

	public void setShowBuffering(boolean flag)
	{
		if(showBuffering != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #327 <Field boolean showBuffering>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			showBuffering = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #327 <Field boolean showBuffering>
			updateBuffering();
	//    7   13:aload_0         
	//    8   14:invokespecial   #123 <Method void updateBuffering()>
		}
	//    9   17:return          
	}

	public void setShowMultiWindowTimeBar(boolean flag)
	{
		boolean flag1;
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          12
			flag1 = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag1);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		controller.setShowMultiWindowTimeBar(flag);
	//   10   18:aload_0         
	//   11   19:getfield        #242 <Field PlayerControlView controller>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #571 <Method void PlayerControlView.setShowMultiWindowTimeBar(boolean)>
	//   14   26:return          
	}

	public void setShowShuffleButton(boolean flag)
	{
		boolean flag1;
		if(controller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field PlayerControlView controller>
	//*   2    4:ifnull          12
			flag1 = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag1);
	//    8   14:iload_2         
	//    9   15:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		controller.setShowShuffleButton(flag);
	//   10   18:aload_0         
	//   11   19:getfield        #242 <Field PlayerControlView controller>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #574 <Method void PlayerControlView.setShowShuffleButton(boolean)>
	//   14   26:return          
	}

	public void setShutterBackgroundColor(int i)
	{
		if(shutterView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field View shutterView>
	//*   2    4:ifnull          15
			shutterView.setBackgroundColor(i);
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field View shutterView>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #576 <Method void View.setBackgroundColor(int)>
	//    7   15:return          
	}

	public void setUseArtwork(boolean flag)
	{
		boolean flag1;
		if(flag && artworkView == null)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
	//*   2    4:aload_0         
	//*   3    5:getfield        #221 <Field ImageView artworkView>
	//*   4    8:ifnull          14
	//*   5   11:goto            19
			flag1 = false;
	//    6   14:iconst_0        
	//    7   15:istore_2        
		else
	//*   8   16:goto            21
			flag1 = true;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		Assertions.checkState(flag1);
	//   11   21:iload_2         
	//   12   22:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		if(useArtwork != flag)
	//*  13   25:aload_0         
	//*  14   26:getfield        #389 <Field boolean useArtwork>
	//*  15   29:iload_1         
	//*  16   30:icmpeq          43
		{
			useArtwork = flag;
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:putfield        #389 <Field boolean useArtwork>
			updateForCurrentTrackSelections(false);
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:invokespecial   #117 <Method void updateForCurrentTrackSelections(boolean)>
		}
	//   23   43:return          
	}

	public void setUseController(boolean flag)
	{
		boolean flag1;
		if(flag && controller == null)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
	//*   2    4:aload_0         
	//*   3    5:getfield        #242 <Field PlayerControlView controller>
	//*   4    8:ifnull          14
	//*   5   11:goto            19
			flag1 = false;
	//    6   14:iconst_0        
	//    7   15:istore_2        
		else
	//*   8   16:goto            21
			flag1 = true;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		Assertions.checkState(flag1);
	//   11   21:iload_2         
	//   12   22:invokestatic    #443 <Method void Assertions.checkState(boolean)>
		if(useController == flag)
	//*  13   25:aload_0         
	//*  14   26:getfield        #240 <Field boolean useController>
	//*  15   29:iload_1         
	//*  16   30:icmpne          34
			return;
	//   17   33:return          
		useController = flag;
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:putfield        #240 <Field boolean useController>
		if(flag)
	//*  21   39:iload_1         
	//*  22   40:ifeq            55
		{
			controller.setPlayer(player);
	//   23   43:aload_0         
	//   24   44:getfield        #242 <Field PlayerControlView controller>
	//   25   47:aload_0         
	//   26   48:getfield        #232 <Field Player player>
	//   27   51:invokevirtual   #538 <Method void PlayerControlView.setPlayer(Player)>
			return;
	//   28   54:return          
		}
		if(controller != null)
	//*  29   55:aload_0         
	//*  30   56:getfield        #242 <Field PlayerControlView controller>
	//*  31   59:ifnull          77
		{
			controller.hide();
	//   32   62:aload_0         
	//   33   63:getfield        #242 <Field PlayerControlView controller>
	//   34   66:invokevirtual   #455 <Method void PlayerControlView.hide()>
			controller.setPlayer(((Player) (null)));
	//   35   69:aload_0         
	//   36   70:getfield        #242 <Field PlayerControlView controller>
	//   37   73:aconst_null     
	//   38   74:invokevirtual   #538 <Method void PlayerControlView.setPlayer(Player)>
		}
	//   39   77:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #579 <Method void FrameLayout.setVisibility(int)>
		if(surfaceView instanceof SurfaceView)
	//*   3    5:aload_0         
	//*   4    6:getfield        #99  <Field View surfaceView>
	//*   5    9:instanceof      #523 <Class SurfaceView>
	//*   6   12:ifeq            23
			surfaceView.setVisibility(i);
	//    7   15:aload_0         
	//    8   16:getfield        #99  <Field View surfaceView>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #176 <Method void View.setVisibility(int)>
	//   11   23:return          
	}

	public void showController()
	{
		showController(shouldShowControllerIndefinitely());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #253 <Method boolean shouldShowControllerIndefinitely()>
	//    3    5:invokespecial   #256 <Method void showController(boolean)>
	//    4    8:return          
	}

	private static final int SURFACE_TYPE_NONE = 0;
	private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
	private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
	private final ImageView artworkView;
	private final View bufferingView;
	private final ComponentListener componentListener;
	private final AspectRatioFrameLayout contentFrame;
	private final PlayerControlView controller;
	private boolean controllerAutoShow;
	private boolean controllerHideDuringAds;
	private boolean controllerHideOnTouch;
	private int controllerShowTimeoutMs;
	private CharSequence customErrorMessage;
	private Bitmap defaultArtwork;
	private ErrorMessageProvider errorMessageProvider;
	private final TextView errorMessageView;
	private boolean keepContentOnPlayerReset;
	private final FrameLayout overlayFrameLayout;
	private Player player;
	private boolean showBuffering;
	private final View shutterView;
	private final SubtitleView subtitleView;
	private final View surfaceView;
	private int textureViewRotation;
	private boolean useArtwork;
	private boolean useController;


/*
	static SubtitleView access$100(PlayerView playerview)
	{
		return playerview.subtitleView;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field SubtitleView subtitleView>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1000(PlayerView playerview)
	{
		return playerview.isPlayingAd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method boolean isPlayingAd()>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$1100(PlayerView playerview)
	{
		return playerview.controllerHideDuringAds;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field boolean controllerHideDuringAds>
	//    2    4:ireturn         
	}

*/


/*
	static void access$1200(PlayerView playerview, boolean flag)
	{
		playerview.maybeShowController(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #91  <Method void maybeShowController(boolean)>
		return;
	//    3    5:return          
	}

*/


/*
	static AspectRatioFrameLayout access$200(PlayerView playerview)
	{
		return playerview.contentFrame;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field AspectRatioFrameLayout contentFrame>
	//    2    4:areturn         
	}

*/


/*
	static View access$300(PlayerView playerview)
	{
		return playerview.surfaceView;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field View surfaceView>
	//    2    4:areturn         
	}

*/


/*
	static int access$400(PlayerView playerview)
	{
		return playerview.textureViewRotation;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int textureViewRotation>
	//    2    4:ireturn         
	}

*/


/*
	static int access$402(PlayerView playerview, int i)
	{
		playerview.textureViewRotation = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #103 <Field int textureViewRotation>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$500(TextureView textureview, int i)
	{
		applyTextureViewRotation(textureview, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #110 <Method void applyTextureViewRotation(TextureView, int)>
		return;
	//    3    5:return          
	}

*/


/*
	static View access$600(PlayerView playerview)
	{
		return playerview.shutterView;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field View shutterView>
	//    2    4:areturn         
	}

*/


/*
	static void access$700(PlayerView playerview, boolean flag)
	{
		playerview.updateForCurrentTrackSelections(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #117 <Method void updateForCurrentTrackSelections(boolean)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$800(PlayerView playerview)
	{
		playerview.updateBuffering();
	//    0    0:aload_0         
	//    1    1:invokespecial   #123 <Method void updateBuffering()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$900(PlayerView playerview)
	{
		playerview.updateErrorMessage();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method void updateErrorMessage()>
		return;
	//    2    4:return          
	}

*/
}
