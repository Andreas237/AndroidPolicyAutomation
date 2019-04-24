// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import com.startapp.android.publish.ads.video.c.a.a.b;
import com.startapp.android.publish.ads.video.c.a.e;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingDetails;
import java.io.Serializable;

public class VideoAdDetails
	implements Serializable
{
	public static final class PostRollType extends Enum
	{

		public static PostRollType valueOf(String s)
		{
			return (PostRollType)Enum.valueOf(com/startapp/android/publish/ads/video/VideoAdDetails$PostRollType, s);
		//    0    0:ldc1            #2   <Class VideoAdDetails$PostRollType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class VideoAdDetails$PostRollType>
		//    4    9:areturn         
		}

		public static PostRollType[] values()
		{
			return (PostRollType[])((PostRollType []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field VideoAdDetails$PostRollType[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.startapp.android.publish.ads.video.VideoAdDetails$PostRollType_3B_.clone()>
		//    2    6:checkcast       #42  <Class VideoAdDetails$PostRollType[]>
		//    3    9:areturn         
		}

		private static final PostRollType $VALUES[];
		public static final PostRollType IMAGE;
		public static final PostRollType LAST_FRAME;
		public static final PostRollType NONE;

		static 
		{
			IMAGE = new PostRollType("IMAGE", 0);
		//    0    0:new             #2   <Class VideoAdDetails$PostRollType>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "IMAGE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void VideoAdDetails$PostRollType(String, int)>
		//    5   10:putstatic       #23  <Field VideoAdDetails$PostRollType IMAGE>
			LAST_FRAME = new PostRollType("LAST_FRAME", 1);
		//    6   13:new             #2   <Class VideoAdDetails$PostRollType>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "LAST_FRAME">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void VideoAdDetails$PostRollType(String, int)>
		//   11   23:putstatic       #26  <Field VideoAdDetails$PostRollType LAST_FRAME>
			NONE = new PostRollType("NONE", 2);
		//   12   26:new             #2   <Class VideoAdDetails$PostRollType>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "NONE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void VideoAdDetails$PostRollType(String, int)>
		//   17   36:putstatic       #29  <Field VideoAdDetails$PostRollType NONE>
			$VALUES = (new PostRollType[] {
				IMAGE, LAST_FRAME, NONE
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       PostRollType[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field VideoAdDetails$PostRollType IMAGE>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field VideoAdDetails$PostRollType LAST_FRAME>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field VideoAdDetails$PostRollType NONE>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field VideoAdDetails$PostRollType[] $VALUES>
		//*  33   64:return          
		}

		private PostRollType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public VideoAdDetails()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	public VideoAdDetails(e e1, boolean flag)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		super();
	//    2    2:aload_0         
	//    3    3:invokespecial   #36  <Method void Object()>
		if(e1 != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          100
		{
			videoTrackingDetails = new VideoTrackingDetails(e1);
	//    6   10:aload_0         
	//    7   11:new             #40  <Class VideoTrackingDetails>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #43  <Method void VideoTrackingDetails(e)>
	//   11   19:putfield        #45  <Field VideoTrackingDetails videoTrackingDetails>
			if(e1.g() != null)
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #51  <Method b e.g()>
	//*  14   26:ifnull          40
				videoUrl = e1.g().a();
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #51  <Method b e.g()>
	//   18   34:invokevirtual   #56  <Method String b.a()>
	//   19   37:putfield        #58  <Field String videoUrl>
			if(flag)
	//*  20   40:iload_2         
	//*  21   41:ifeq            106
			{
				skippableAfter = e1.f();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #62  <Method int e.f()>
	//   25   49:putfield        #64  <Field int skippableAfter>
				if(skippableAfter != 0x7fffffff)
	//*  26   52:aload_0         
	//*  27   53:getfield        #64  <Field int skippableAfter>
	//*  28   56:ldc1            #65  <Int 0x7fffffff>
	//*  29   58:icmpeq          101
					flag = true;
	//   30   61:iconst_1        
	//   31   62:istore_2        
				else
	//*  32   63:aload_0         
	//*  33   64:iload_2         
	//*  34   65:putfield        #67  <Field boolean skippable>
	//*  35   68:aload_0         
	//*  36   69:aload_1         
	//*  37   70:invokevirtual   #71  <Method com.startapp.android.publish.ads.video.c.a.a.e e.c()>
	//*  38   73:invokevirtual   #74  <Method String com.startapp.android.publish.ads.video.c.a.a.e.a()>
	//*  39   76:putfield        #76  <Field String clickUrl>
	//*  40   79:aload_0         
	//*  41   80:getfield        #76  <Field String clickUrl>
	//*  42   83:ifnull          114
	//*  43   86:iload_3         
	//*  44   87:istore_2        
	//*  45   88:aload_0         
	//*  46   89:iload_2         
	//*  47   90:putfield        #78  <Field boolean clickable>
	//*  48   93:aload_0         
	//*  49   94:getstatic       #81  <Field VideoAdDetails$PostRollType VideoAdDetails$PostRollType.NONE>
	//*  50   97:putfield        #83  <Field VideoAdDetails$PostRollType postRoll>
	//*  51  100:return          
					flag = false;
	//   52  101:iconst_0        
	//   53  102:istore_2        
				skippable = flag;
			} else
	//*  54  103:goto            63
			{
				skippable = false;
	//   55  106:aload_0         
	//   56  107:iconst_0        
	//   57  108:putfield        #67  <Field boolean skippable>
			}
			clickUrl = e1.c().a();
			if(clickUrl != null)
				flag = flag1;
			else
	//*  58  111:goto            68
				flag = false;
	//   59  114:iconst_0        
	//   60  115:istore_2        
			clickable = flag;
			postRoll = PostRollType.NONE;
		}
	//*  61  116:goto            88
	}

	public String getClickUrl()
	{
		return clickUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String clickUrl>
	//    2    4:areturn         
	}

	public String getLocalVideoPath()
	{
		return localVideoPath;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String localVideoPath>
	//    2    4:areturn         
	}

	public PostRollType getPostRollType()
	{
		return postRoll;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field VideoAdDetails$PostRollType postRoll>
	//    2    4:areturn         
	}

	public int getSkippableAfter()
	{
		return skippableAfter;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int skippableAfter>
	//    2    4:ireturn         
	}

	public VideoTrackingDetails getVideoTrackingDetails()
	{
		return videoTrackingDetails;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field VideoTrackingDetails videoTrackingDetails>
	//    2    4:areturn         
	}

	public String getVideoUrl()
	{
		return videoUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String videoUrl>
	//    2    4:areturn         
	}

	public boolean isClickable()
	{
		return clickable;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean clickable>
	//    2    4:ireturn         
	}

	public boolean isCloseable()
	{
		return closeable;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field boolean closeable>
	//    2    4:ireturn         
	}

	public boolean isSkippable()
	{
		return skippable;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean skippable>
	//    2    4:ireturn         
	}

	public boolean isVideoMuted()
	{
		return isVideoMuted;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field boolean isVideoMuted>
	//    2    4:ireturn         
	}

	public void setLocalVideoPath(String s)
	{
		localVideoPath = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field String localVideoPath>
	//    3    5:return          
	}

	public void setVideoMuted(boolean flag)
	{
		isVideoMuted = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #101 <Field boolean isVideoMuted>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("VideoAdDetails [videoUrl=").append(videoUrl).append(", localVideoPath=").append(localVideoPath).append(", postRoll=").append(((Object) (postRoll))).append(", closeable=").append(closeable).append(", skippable=").append(skippable).append(", skippableAfter=").append(skippableAfter).append(", videoTrackingDetails= ").append(((Object) (videoTrackingDetails))).append(", isVideoMuted= ").append(isVideoMuted).append("]").toString();
	//    0    0:new             #108 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #109 <Method void StringBuilder()>
	//    3    7:ldc1            #111 <String "VideoAdDetails [videoUrl=">
	//    4    9:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #58  <Field String videoUrl>
	//    7   16:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #117 <String ", localVideoPath=">
	//    9   21:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #87  <Field String localVideoPath>
	//   12   28:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #119 <String ", postRoll=">
	//   14   33:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #83  <Field VideoAdDetails$PostRollType postRoll>
	//   17   40:invokevirtual   #122 <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:ldc1            #124 <String ", closeable=">
	//   19   45:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #98  <Field boolean closeable>
	//   22   52:invokevirtual   #127 <Method StringBuilder StringBuilder.append(boolean)>
	//   23   55:ldc1            #129 <String ", skippable=">
	//   24   57:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #67  <Field boolean skippable>
	//   27   64:invokevirtual   #127 <Method StringBuilder StringBuilder.append(boolean)>
	//   28   67:ldc1            #131 <String ", skippableAfter=">
	//   29   69:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #64  <Field int skippableAfter>
	//   32   76:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   33   79:ldc1            #136 <String ", videoTrackingDetails= ">
	//   34   81:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   35   84:aload_0         
	//   36   85:getfield        #45  <Field VideoTrackingDetails videoTrackingDetails>
	//   37   88:invokevirtual   #122 <Method StringBuilder StringBuilder.append(Object)>
	//   38   91:ldc1            #138 <String ", isVideoMuted= ">
	//   39   93:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   40   96:aload_0         
	//   41   97:getfield        #101 <Field boolean isVideoMuted>
	//   42  100:invokevirtual   #127 <Method StringBuilder StringBuilder.append(boolean)>
	//   43  103:ldc1            #140 <String "]">
	//   44  105:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   45  108:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   46  111:areturn         
	}

	private static final long serialVersionUID = 1L;
	private String clickUrl;
	private boolean clickable;
	private boolean closeable;
	private boolean isVideoMuted;
	private String localVideoPath;
	private PostRollType postRoll;
	private boolean skippable;
	private int skippableAfter;
	private VideoTrackingDetails videoTrackingDetails;
	private String videoUrl;
}
