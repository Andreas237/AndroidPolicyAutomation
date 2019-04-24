// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.*;
import com.irobot.home.util.o;
import java.io.IOException;

public class CustomVideoView extends TextureView
	implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.view.TextureView.SurfaceTextureListener
{
	public static interface a
	{

		public abstract void a(int i, int j);

		public abstract void e_();

		public abstract void f_();
	}


	public CustomVideoView(Context context)
	{
		this(context, ((AttributeSet) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:invokespecial   #31  <Method void CustomVideoView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public CustomVideoView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #31  <Method void CustomVideoView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public CustomVideoView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #34  <Method void TextureView(Context, AttributeSet, int)>
		c = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #36  <Field boolean c>
		d = false;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #38  <Field boolean d>
		e = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #40  <Field boolean e>
		setSurfaceTextureListener(((android.view.TextureView.SurfaceTextureListener) (this)));
	//   14   22:aload_0         
	//   15   23:aload_0         
	//   16   24:invokevirtual   #44  <Method void setSurfaceTextureListener(android.view.TextureView$SurfaceTextureListener)>
	//   17   27:return          
	}

	static MediaPlayer a(CustomVideoView customvideoview)
	{
		return customvideoview.a;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field MediaPlayer a>
	//    2    4:areturn         
	}

	private void a(int i, int j)
	{
		int k = getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method int getWidth()>
	//    2    4:istore          5
		int l = getHeight();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #55  <Method int getHeight()>
	//    5   10:istore          6
		double d1 = (double)j / (double)i;
	//    6   12:iload_2         
	//    7   13:i2d             
	//    8   14:iload_1         
	//    9   15:i2d             
	//   10   16:ddiv            
	//   11   17:dstore_3        
		j = (int)((double)k * d1);
	//   12   18:iload           5
	//   13   20:i2d             
	//   14   21:dload_3         
	//   15   22:dmul            
	//   16   23:d2i             
	//   17   24:istore_2        
		if(l < j)
	//*  18   25:iload           6
	//*  19   27:iload_2         
	//*  20   28:icmpge          36
			i = 1;
	//   21   31:iconst_1        
	//   22   32:istore_1        
		else
	//*  23   33:goto            38
			i = 0;
	//   24   36:iconst_0        
	//   25   37:istore_1        
		if((i ^ d) != 0)
	//*  26   38:iload_1         
	//*  27   39:aload_0         
	//*  28   40:getfield        #38  <Field boolean d>
	//*  29   43:ixor            
	//*  30   44:ifeq            60
		{
			i = (int)((double)l / d1);
	//   31   47:iload           6
	//   32   49:i2d             
	//   33   50:dload_3         
	//   34   51:ddiv            
	//   35   52:d2i             
	//   36   53:istore_1        
			j = l;
	//   37   54:iload           6
	//   38   56:istore_2        
		} else
	//*  39   57:goto            63
		{
			i = k;
	//   40   60:iload           5
	//   41   62:istore_1        
		}
		int i1 = (k - i) / 2;
	//   42   63:iload           5
	//   43   65:iload_1         
	//   44   66:isub            
	//   45   67:iconst_2        
	//   46   68:idiv            
	//   47   69:istore          7
		int j1 = (l - j) / 2;
	//   48   71:iload           6
	//   49   73:iload_2         
	//   50   74:isub            
	//   51   75:iconst_2        
	//   52   76:idiv            
	//   53   77:istore          8
		Matrix matrix = new Matrix();
	//   54   79:new             #57  <Class Matrix>
	//   55   82:dup             
	//   56   83:invokespecial   #60  <Method void Matrix()>
	//   57   86:astore          9
		getTransform(matrix);
	//   58   88:aload_0         
	//   59   89:aload           9
	//   60   91:invokevirtual   #64  <Method Matrix getTransform(Matrix)>
	//   61   94:pop             
		matrix.setScale((float)i / (float)k, (float)j / (float)l);
	//   62   95:aload           9
	//   63   97:iload_1         
	//   64   98:i2f             
	//   65   99:iload           5
	//   66  101:i2f             
	//   67  102:fdiv            
	//   68  103:iload_2         
	//   69  104:i2f             
	//   70  105:iload           6
	//   71  107:i2f             
	//   72  108:fdiv            
	//   73  109:invokevirtual   #68  <Method void Matrix.setScale(float, float)>
		matrix.postTranslate(i1, j1);
	//   74  112:aload           9
	//   75  114:iload           7
	//   76  116:i2f             
	//   77  117:iload           8
	//   78  119:i2f             
	//   79  120:invokevirtual   #72  <Method boolean Matrix.postTranslate(float, float)>
	//   80  123:pop             
		setTransform(matrix);
	//   81  124:aload_0         
	//   82  125:aload           9
	//   83  127:invokevirtual   #76  <Method void setTransform(Matrix)>
	//   84  130:return          
	}

	static void a(CustomVideoView customvideoview, int i, int j)
	{
		customvideoview.a(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #79  <Method void a(int, int)>
	//    4    6:return          
	}

	static boolean b(CustomVideoView customvideoview)
	{
		return customvideoview.e;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean e>
	//    2    4:ireturn         
	}

	static a c(CustomVideoView customvideoview)
	{
		return customvideoview.f;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field CustomVideoView$a f>
	//    2    4:areturn         
	}

	public void a()
	{
		setVisibility(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #87  <Method void setVisibility(int)>
	//    3    5:return          
	}

	public void b()
	{
		setVisibility(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #87  <Method void setVisibility(int)>
	//    3    5:return          
	}

	public void c()
	{
		setVisibility(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #87  <Method void setVisibility(int)>
		setVisibility(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #87  <Method void setVisibility(int)>
	//    6   10:return          
	}

	public void d()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field MediaPlayer a>
	//*   2    4:ifnull          26
		{
			a.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field MediaPlayer a>
	//    5   11:invokevirtual   #92  <Method void MediaPlayer.stop()>
			a.release();
	//    6   14:aload_0         
	//    7   15:getfield        #47  <Field MediaPlayer a>
	//    8   18:invokevirtual   #95  <Method void MediaPlayer.release()>
			a = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #47  <Field MediaPlayer a>
		}
		e = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #40  <Field boolean e>
	//   15   31:return          
	}

	public void onCompletion(MediaPlayer mediaplayer)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field CustomVideoView$a f>
	//*   2    4:ifnull          16
			f.f_();
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field CustomVideoView$a f>
	//    5   11:invokeinterface #100 <Method void CustomVideoView$a.f_()>
	//    6   16:return          
	}

	protected void onDetachedFromWindow()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method void d()>
		super.onDetachedFromWindow();
	//    2    4:aload_0         
	//    3    5:invokespecial   #105 <Method void TextureView.onDetachedFromWindow()>
	//    4    8:return          
	}

	public boolean onError(MediaPlayer mediaplayer, int i, int j)
	{
		String s;
		if(i != 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          58
		{
			if(i != 100)
	//*   3    5:iload_2         
	//*   4    6:bipush          100
	//*   5    8:icmpeq          51
			{
				mediaplayer = ((MediaPlayer) (new StringBuilder()));
	//    6   11:new             #109 <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #110 <Method void StringBuilder()>
	//    9   18:astore_1        
				((StringBuilder) (mediaplayer)).append("UNKNOWN[");
	//   10   19:aload_1         
	//   11   20:ldc1            #112 <String "UNKNOWN[">
	//   12   22:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
				((StringBuilder) (mediaplayer)).append(String.valueOf(i));
	//   14   26:aload_1         
	//   15   27:iload_2         
	//   16   28:invokestatic    #122 <Method String String.valueOf(int)>
	//   17   31:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
				((StringBuilder) (mediaplayer)).append("]");
	//   19   35:aload_1         
	//   20   36:ldc1            #124 <String "]">
	//   21   38:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
				s = ((StringBuilder) (mediaplayer)).toString();
	//   23   42:aload_1         
	//   24   43:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   25   46:astore          4
			} else
	//*  26   48:goto            62
			{
				s = "MEDIA_ERROR_SERVER_DIED";
	//   27   51:ldc1            #130 <String "MEDIA_ERROR_SERVER_DIED">
	//   28   53:astore          4
			}
		} else
	//*  29   55:goto            62
		{
			s = "MEDIA_ERROR_UNKNOWN";
	//   30   58:ldc1            #132 <String "MEDIA_ERROR_UNKNOWN">
	//   31   60:astore          4
		}
		if(j != -1010)
	//*  32   62:iload_3         
	//*  33   63:sipush          -1010
	//*  34   66:icmpeq          146
		{
			if(j != -1007)
	//*  35   69:iload_3         
	//*  36   70:sipush          -1007
	//*  37   73:icmpeq          140
			{
				if(j != -1004)
	//*  38   76:iload_3         
	//*  39   77:sipush          -1004
	//*  40   80:icmpeq          134
				{
					if(j != -110)
	//*  41   83:iload_3         
	//*  42   84:bipush          -110
	//*  43   86:icmpeq          128
					{
						mediaplayer = ((MediaPlayer) (new StringBuilder()));
	//   44   89:new             #109 <Class StringBuilder>
	//   45   92:dup             
	//   46   93:invokespecial   #110 <Method void StringBuilder()>
	//   47   96:astore_1        
						((StringBuilder) (mediaplayer)).append("UNKNOWN[");
	//   48   97:aload_1         
	//   49   98:ldc1            #112 <String "UNKNOWN[">
	//   50  100:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   51  103:pop             
						((StringBuilder) (mediaplayer)).append(String.valueOf(j));
	//   52  104:aload_1         
	//   53  105:iload_3         
	//   54  106:invokestatic    #122 <Method String String.valueOf(int)>
	//   55  109:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   56  112:pop             
						((StringBuilder) (mediaplayer)).append("]");
	//   57  113:aload_1         
	//   58  114:ldc1            #124 <String "]">
	//   59  116:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   60  119:pop             
						mediaplayer = ((MediaPlayer) (((StringBuilder) (mediaplayer)).toString()));
	//   61  120:aload_1         
	//   62  121:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   63  124:astore_1        
					} else
	//*  64  125:goto            149
					{
						mediaplayer = "MEDIA_ERROR_TIMED_OUT";
	//   65  128:ldc1            #134 <String "MEDIA_ERROR_TIMED_OUT">
	//   66  130:astore_1        
					}
				} else
	//*  67  131:goto            149
				{
					mediaplayer = "MEDIA_ERROR_IO";
	//   68  134:ldc1            #136 <String "MEDIA_ERROR_IO">
	//   69  136:astore_1        
				}
			} else
	//*  70  137:goto            149
			{
				mediaplayer = "MEDIA_ERROR_MALFORMED";
	//   71  140:ldc1            #138 <String "MEDIA_ERROR_MALFORMED">
	//   72  142:astore_1        
			}
		} else
	//*  73  143:goto            149
		{
			mediaplayer = "MEDIA_ERROR_UNSUPPORTED";
	//   74  146:ldc1            #140 <String "MEDIA_ERROR_UNSUPPORTED">
	//   75  148:astore_1        
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   76  149:new             #109 <Class StringBuilder>
	//   77  152:dup             
	//   78  153:invokespecial   #110 <Method void StringBuilder()>
	//   79  156:astore          5
		stringbuilder.append("onError: ");
	//   80  158:aload           5
	//   81  160:ldc1            #142 <String "onError: ">
	//   82  162:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   83  165:pop             
		stringbuilder.append(s);
	//   84  166:aload           5
	//   85  168:aload           4
	//   86  170:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   87  173:pop             
		stringbuilder.append(", ");
	//   88  174:aload           5
	//   89  176:ldc1            #144 <String ", ">
	//   90  178:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   91  181:pop             
		stringbuilder.append(((String) (mediaplayer)));
	//   92  182:aload           5
	//   93  184:aload_1         
	//   94  185:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   95  188:pop             
		o.e("CustomVideoView", stringbuilder.toString());
	//   96  189:ldc1            #146 <String "CustomVideoView">
	//   97  191:aload           5
	//   98  193:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   99  196:invokestatic    #151 <Method void o.e(String, String)>
		e = true;
	//  100  199:aload_0         
	//  101  200:iconst_1        
	//  102  201:putfield        #40  <Field boolean e>
		if(f != null)
	//* 103  204:aload_0         
	//* 104  205:getfield        #83  <Field CustomVideoView$a f>
	//* 105  208:ifnull          222
			f.a(i, j);
	//  106  211:aload_0         
	//  107  212:getfield        #83  <Field CustomVideoView$a f>
	//  108  215:iload_2         
	//  109  216:iload_3         
	//  110  217:invokeinterface #152 <Method void CustomVideoView$a.a(int, int)>
		d();
	//  111  222:aload_0         
	//  112  223:invokevirtual   #103 <Method void d()>
		return true;
	//  113  226:iconst_1        
	//  114  227:ireturn         
	}

	public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
	{
		surfacetexture = ((SurfaceTexture) (new Surface(surfacetexture)));
	//    0    0:new             #164 <Class Surface>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #167 <Method void Surface(SurfaceTexture)>
	//    4    8:astore_1        
		try
		{
			a = new MediaPlayer();
	//    5    9:aload_0         
	//    6   10:new             #89  <Class MediaPlayer>
	//    7   13:dup             
	//    8   14:invokespecial   #168 <Method void MediaPlayer()>
	//    9   17:putfield        #47  <Field MediaPlayer a>
			a.setOnCompletionListener(((android.media.MediaPlayer.OnCompletionListener) (this)));
	//   10   20:aload_0         
	//   11   21:getfield        #47  <Field MediaPlayer a>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #172 <Method void MediaPlayer.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
			a.setOnErrorListener(((android.media.MediaPlayer.OnErrorListener) (this)));
	//   14   28:aload_0         
	//   15   29:getfield        #47  <Field MediaPlayer a>
	//   16   32:aload_0         
	//   17   33:invokevirtual   #176 <Method void MediaPlayer.setOnErrorListener(android.media.MediaPlayer$OnErrorListener)>
			a.setLooping(c);
	//   18   36:aload_0         
	//   19   37:getfield        #47  <Field MediaPlayer a>
	//   20   40:aload_0         
	//   21   41:getfield        #36  <Field boolean c>
	//   22   44:invokevirtual   #180 <Method void MediaPlayer.setLooping(boolean)>
			a.setDataSource(getContext(), b);
	//   23   47:aload_0         
	//   24   48:getfield        #47  <Field MediaPlayer a>
	//   25   51:aload_0         
	//   26   52:invokevirtual   #184 <Method Context getContext()>
	//   27   55:aload_0         
	//   28   56:getfield        #186 <Field Uri b>
	//   29   59:invokevirtual   #190 <Method void MediaPlayer.setDataSource(Context, Uri)>
			a.setSurface(((Surface) (surfacetexture)));
	//   30   62:aload_0         
	//   31   63:getfield        #47  <Field MediaPlayer a>
	//   32   66:aload_1         
	//   33   67:invokevirtual   #194 <Method void MediaPlayer.setSurface(Surface)>
			a.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

				public void onPrepared(MediaPlayer mediaplayer)
				{
					CustomVideoView.a(a, CustomVideoView.a(a).getVideoWidth(), CustomVideoView.a(a).getVideoHeight());
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field CustomVideoView a>
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field CustomVideoView a>
				//    4    8:invokestatic    #28  <Method MediaPlayer CustomVideoView.a(CustomVideoView)>
				//    5   11:invokevirtual   #34  <Method int MediaPlayer.getVideoWidth()>
				//    6   14:aload_0         
				//    7   15:getfield        #19  <Field CustomVideoView a>
				//    8   18:invokestatic    #28  <Method MediaPlayer CustomVideoView.a(CustomVideoView)>
				//    9   21:invokevirtual   #37  <Method int MediaPlayer.getVideoHeight()>
				//   10   24:invokestatic    #40  <Method void CustomVideoView.a(CustomVideoView, int, int)>
					mediaplayer.start();
				//   11   27:aload_1         
				//   12   28:invokevirtual   #43  <Method void MediaPlayer.start()>
					(new Handler()).post(new Runnable(this, mediaplayer) {

						public void run()
						{
							if(CustomVideoView.b(b.a))
						//*   0    0:aload_0         
						//*   1    1:getfield        #19  <Field CustomVideoView$1 b>
						//*   2    4:getfield        #31  <Field CustomVideoView CustomVideoView$1.a>
						//*   3    7:invokestatic    #36  <Method boolean CustomVideoView.b(CustomVideoView)>
						//*   4   10:ifeq            14
								return;
						//    5   13:return          
							if(a.getCurrentPosition() != 0)
						//*   6   14:aload_0         
						//*   7   15:getfield        #21  <Field MediaPlayer a>
						//*   8   18:invokevirtual   #42  <Method int MediaPlayer.getCurrentPosition()>
						//*   9   21:ifeq            53
							{
								if(CustomVideoView.c(b.a) != null)
						//*  10   24:aload_0         
						//*  11   25:getfield        #19  <Field CustomVideoView$1 b>
						//*  12   28:getfield        #31  <Field CustomVideoView CustomVideoView$1.a>
						//*  13   31:invokestatic    #46  <Method CustomVideoView$a CustomVideoView.c(CustomVideoView)>
						//*  14   34:ifnull          91
								{
									CustomVideoView.c(b.a).e_();
						//   15   37:aload_0         
						//   16   38:getfield        #19  <Field CustomVideoView$1 b>
						//   17   41:getfield        #31  <Field CustomVideoView CustomVideoView$1.a>
						//   18   44:invokestatic    #46  <Method CustomVideoView$a CustomVideoView.c(CustomVideoView)>
						//   19   47:invokeinterface #51  <Method void CustomVideoView$a.e_()>
									return;
						//   20   52:return          
								}
								break MISSING_BLOCK_LABEL_91;
							}
							try
							{
								(new Handler()).postDelayed(((Runnable) (this)), 50L);
						//   21   53:new             #53  <Class Handler>
						//   22   56:dup             
						//   23   57:invokespecial   #54  <Method void Handler()>
						//   24   60:aload_0         
						//   25   61:ldc2w           #55  <Long 50L>
						//   26   64:invokevirtual   #60  <Method boolean Handler.postDelayed(Runnable, long)>
						//   27   67:pop             
								return;
						//   28   68:return          
							}
							catch(IllegalStateException illegalstateexception)
						//*  29   69:astore_1        
							{
								illegalstateexception.printStackTrace();
						//   30   70:aload_1         
						//   31   71:invokevirtual   #63  <Method void IllegalStateException.printStackTrace()>
							}
							b.a.onError(a, -1, -1);
						//   32   74:aload_0         
						//   33   75:getfield        #19  <Field CustomVideoView$1 b>
						//   34   78:getfield        #31  <Field CustomVideoView CustomVideoView$1.a>
						//   35   81:aload_0         
						//   36   82:getfield        #21  <Field MediaPlayer a>
						//   37   85:iconst_m1       
						//   38   86:iconst_m1       
						//   39   87:invokevirtual   #67  <Method boolean CustomVideoView.onError(MediaPlayer, int, int)>
						//   40   90:pop             
						//   41   91:return          
						}

						final MediaPlayer a;
						final _cls1 b;

			
			{
				b = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CustomVideoView$1 b>
				a = mediaplayer;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field MediaPlayer a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
);
				//   13   31:new             #45  <Class Handler>
				//   14   34:dup             
				//   15   35:invokespecial   #46  <Method void Handler()>
				//   16   38:new             #13  <Class CustomVideoView$1$1>
				//   17   41:dup             
				//   18   42:aload_0         
				//   19   43:aload_1         
				//   20   44:invokespecial   #49  <Method void CustomVideoView$1$1(CustomVideoView$1, MediaPlayer)>
				//   21   47:invokevirtual   #53  <Method boolean Handler.post(Runnable)>
				//   22   50:pop             
				//   23   51:return          
				}

				final CustomVideoView a;

			
			{
				a = CustomVideoView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CustomVideoView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   34   70:aload_0         
	//   35   71:getfield        #47  <Field MediaPlayer a>
	//   36   74:new             #12  <Class CustomVideoView$1>
	//   37   77:dup             
	//   38   78:aload_0         
	//   39   79:invokespecial   #197 <Method void CustomVideoView$1(CustomVideoView)>
	//   40   82:invokevirtual   #201 <Method void MediaPlayer.setOnPreparedListener(android.media.MediaPlayer$OnPreparedListener)>
			a.prepare();
	//   41   85:aload_0         
	//   42   86:getfield        #47  <Field MediaPlayer a>
	//   43   89:invokevirtual   #204 <Method void MediaPlayer.prepare()>
			return;
	//   44   92:return          
		}
	//*  45   93:astore_1        
	//*  46   94:aload_1         
	//*  47   95:invokevirtual   #207 <Method void IOException.printStackTrace()>
	//*  48   98:return          
	//*  49   99:astore_1        
	//*  50  100:aload_1         
	//*  51  101:invokevirtual   #208 <Method void IllegalStateException.printStackTrace()>
	//*  52  104:aload_0         
	//*  53  105:getfield        #47  <Field MediaPlayer a>
	//*  54  108:invokevirtual   #211 <Method void MediaPlayer.reset()>
	//*  55  111:return          
	//*  56  112:astore_1        
	//*  57  113:aload_1         
	//*  58  114:invokevirtual   #212 <Method void SecurityException.printStackTrace()>
	//*  59  117:return          
		// Misplaced declaration of an exception variable
		catch(SurfaceTexture surfacetexture)
	//*  60  118:astore_1        
		{
			((IllegalArgumentException) (surfacetexture)).printStackTrace();
	//   61  119:aload_1         
	//   62  120:invokevirtual   #213 <Method void IllegalArgumentException.printStackTrace()>
		}
		// Misplaced declaration of an exception variable
		catch(SurfaceTexture surfacetexture)
		{
			((SecurityException) (surfacetexture)).printStackTrace();
			return;
		}
		// Misplaced declaration of an exception variable
		catch(SurfaceTexture surfacetexture)
		{
			((IllegalStateException) (surfacetexture)).printStackTrace();
			a.reset();
			return;
		}
		// Misplaced declaration of an exception variable
		catch(SurfaceTexture surfacetexture)
		{
			((IOException) (surfacetexture)).printStackTrace();
			return;
		}
	//   63  123:return          
	}

	public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method void d()>
		surfacetexture.release();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #218 <Method void SurfaceTexture.release()>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
	{
	//    0    0:return          
	}

	public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
	{
	//    0    0:return          
	}

	protected void onVisibilityChanged(View view, int i)
	{
		super.onVisibilityChanged(view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #224 <Method void TextureView.onVisibilityChanged(View, int)>
		if(i == 0 && isAvailable())
	//*   4    6:iload_2         
	//*   5    7:ifne            37
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #228 <Method boolean isAvailable()>
	//*   8   14:ifeq            37
		{
			d();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #103 <Method void d()>
			onSurfaceTextureAvailable(getSurfaceTexture(), getWidth(), getHeight());
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #232 <Method SurfaceTexture getSurfaceTexture()>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #52  <Method int getWidth()>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #55  <Method int getHeight()>
	//   18   34:invokevirtual   #234 <Method void onSurfaceTextureAvailable(SurfaceTexture, int, int)>
		}
	//   19   37:return          
	}

	public void setLooping(boolean flag)
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean c>
	//    3    5:return          
	}

	public void setSource(Uri uri)
	{
		b = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #186 <Field Uri b>
	//    3    5:return          
	}

	public void setVideoStatusListener(a a1)
	{
		f = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field CustomVideoView$a f>
	//    3    5:return          
	}

	private MediaPlayer a;
	private Uri b;
	private boolean c;
	private boolean d;
	private boolean e;
	private a f;
}
