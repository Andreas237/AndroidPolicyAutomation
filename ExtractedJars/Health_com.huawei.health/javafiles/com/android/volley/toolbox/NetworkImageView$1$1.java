// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.VolleyError;

// Referenced classes of package com.android.volley.toolbox:
//			NetworkImageView

class NetworkImageView$1$1
	implements Runnable
{

	public void run()
	{
		onResponse(val$response, false);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field NetworkImageView$1 this$1>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field ImageLoader$ImageContainer val$response>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #27  <Method void NetworkImageView$1.onResponse(ImageLoader$ImageContainer, boolean)>
	//    6   12:return          
	}

	final NetworkImageView._cls1 this$1;
	final ainer val$response;

	NetworkImageView$1$1()
	{
		this$1 = final__pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field NetworkImageView$1 this$1>
		val$response = ainer.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ImageLoader$ImageContainer val$response>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/android/volley/toolbox/NetworkImageView$1

/* anonymous class */
	class NetworkImageView._cls1
		implements ImageLoader.ImageListener
	{

		public void onErrorResponse(VolleyError volleyerror)
		{
			if(NetworkImageView.access$000(NetworkImageView.this) != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field NetworkImageView this$0>
		//*   2    4:invokestatic    #33  <Method int NetworkImageView.access$000(NetworkImageView)>
		//*   3    7:ifeq            24
				setImageResource(NetworkImageView.access$000(NetworkImageView.this));
		//    4   10:aload_0         
		//    5   11:getfield        #21  <Field NetworkImageView this$0>
		//    6   14:aload_0         
		//    7   15:getfield        #21  <Field NetworkImageView this$0>
		//    8   18:invokestatic    #33  <Method int NetworkImageView.access$000(NetworkImageView)>
		//    9   21:invokevirtual   #37  <Method void NetworkImageView.setImageResource(int)>
		//   10   24:return          
		}

		public void onResponse(ImageLoader.ImageContainer imagecontainer, boolean flag)
		{
			if(flag && isInLayoutPass)
		//*   0    0:iload_2         
		//*   1    1:ifeq            29
		//*   2    4:aload_0         
		//*   3    5:getfield        #23  <Field boolean val$isInLayoutPass>
		//*   4    8:ifeq            29
			{
				post(((Runnable) (((NetworkImageView._cls1._cls1) (imagecontainer)). new NetworkImageView._cls1._cls1())));
		//    5   11:aload_0         
		//    6   12:getfield        #21  <Field NetworkImageView this$0>
		//    7   15:new             #13  <Class NetworkImageView$1$1>
		//    8   18:dup             
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:invokespecial   #42  <Method void NetworkImageView$1$1(NetworkImageView$1, ImageLoader$ImageContainer)>
		//   12   24:invokevirtual   #46  <Method boolean NetworkImageView.post(Runnable)>
		//   13   27:pop             
				return;
		//   14   28:return          
			}
			if(imagecontainer.getBitmap() != null)
		//*  15   29:aload_1         
		//*  16   30:invokevirtual   #52  <Method android.graphics.Bitmap ImageLoader$ImageContainer.getBitmap()>
		//*  17   33:ifnull          48
			{
				setImageBitmap(imagecontainer.getBitmap());
		//   18   36:aload_0         
		//   19   37:getfield        #21  <Field NetworkImageView this$0>
		//   20   40:aload_1         
		//   21   41:invokevirtual   #52  <Method android.graphics.Bitmap ImageLoader$ImageContainer.getBitmap()>
		//   22   44:invokevirtual   #56  <Method void NetworkImageView.setImageBitmap(android.graphics.Bitmap)>
				return;
		//   23   47:return          
			}
			if(NetworkImageView.access$100(NetworkImageView.this) != 0)
		//*  24   48:aload_0         
		//*  25   49:getfield        #21  <Field NetworkImageView this$0>
		//*  26   52:invokestatic    #59  <Method int NetworkImageView.access$100(NetworkImageView)>
		//*  27   55:ifeq            72
				setImageResource(NetworkImageView.access$100(NetworkImageView.this));
		//   28   58:aload_0         
		//   29   59:getfield        #21  <Field NetworkImageView this$0>
		//   30   62:aload_0         
		//   31   63:getfield        #21  <Field NetworkImageView this$0>
		//   32   66:invokestatic    #59  <Method int NetworkImageView.access$100(NetworkImageView)>
		//   33   69:invokevirtual   #37  <Method void NetworkImageView.setImageResource(int)>
		//   34   72:return          
		}

		final NetworkImageView this$0;
		final boolean val$isInLayoutPass;

			
			{
				this$0 = final_networkimageview;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field NetworkImageView this$0>
				isInLayoutPass = Z.this;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field boolean val$isInLayoutPass>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}

}
