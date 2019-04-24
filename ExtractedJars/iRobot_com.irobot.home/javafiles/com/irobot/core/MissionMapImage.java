// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MissionMapImage
{

	public MissionMapImage(float f, float f1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mWidth = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #16  <Field float mWidth>
		mHeight = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #18  <Field float mHeight>
		mImageData = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #20  <Field String mImageData>
	//   11   19:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof MissionMapImage;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class MissionMapImage>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((MissionMapImage)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class MissionMapImage>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(mWidth == ((MissionMapImage) (obj)).mWidth)
	//*  14   20:aload_0         
	//*  15   21:getfield        #16  <Field float mWidth>
	//*  16   24:aload_1         
	//*  17   25:getfield        #16  <Field float mWidth>
	//*  18   28:fcmpl           
	//*  19   29:ifne            64
		{
			flag = flag1;
	//   20   32:iload_3         
	//   21   33:istore_2        
			if(mHeight == ((MissionMapImage) (obj)).mHeight)
	//*  22   34:aload_0         
	//*  23   35:getfield        #18  <Field float mHeight>
	//*  24   38:aload_1         
	//*  25   39:getfield        #18  <Field float mHeight>
	//*  26   42:fcmpl           
	//*  27   43:ifne            64
			{
				flag = flag1;
	//   28   46:iload_3         
	//   29   47:istore_2        
				if(mImageData.equals(((Object) (((MissionMapImage) (obj)).mImageData))))
	//*  30   48:aload_0         
	//*  31   49:getfield        #20  <Field String mImageData>
	//*  32   52:aload_1         
	//*  33   53:getfield        #20  <Field String mImageData>
	//*  34   56:invokevirtual   #27  <Method boolean String.equals(Object)>
	//*  35   59:ifeq            64
					flag = true;
	//   36   62:iconst_1        
	//   37   63:istore_2        
			}
		}
		return flag;
	//   38   64:iload_2         
	//   39   65:ireturn         
	}

	public float getHeight()
	{
		return mHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field float mHeight>
	//    2    4:freturn         
	}

	public String getImageData()
	{
		return mImageData;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mImageData>
	//    2    4:areturn         
	}

	public float getWidth()
	{
		return mWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field float mWidth>
	//    2    4:freturn         
	}

	public int hashCode()
	{
		return ((527 + Float.floatToIntBits(mWidth)) * 31 + Float.floatToIntBits(mHeight)) * 31 + mImageData.hashCode();
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field float mWidth>
	//    3    7:invokestatic    #40  <Method int Float.floatToIntBits(float)>
	//    4   10:iadd            
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field float mHeight>
	//    9   18:invokestatic    #40  <Method int Float.floatToIntBits(float)>
	//   10   21:iadd            
	//   11   22:bipush          31
	//   12   24:imul            
	//   13   25:aload_0         
	//   14   26:getfield        #20  <Field String mImageData>
	//   15   29:invokevirtual   #42  <Method int String.hashCode()>
	//   16   32:iadd            
	//   17   33:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MissionMapImage{mWidth=");
	//    4    8:aload_1         
	//    5    9:ldc1            #48  <String "MissionMapImage{mWidth=">
	//    6   11:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mWidth);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #16  <Field float mWidth>
	//   11   20:invokevirtual   #55  <Method StringBuilder StringBuilder.append(float)>
	//   12   23:pop             
		stringbuilder.append(",mHeight=");
	//   13   24:aload_1         
	//   14   25:ldc1            #57  <String ",mHeight=">
	//   15   27:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mHeight);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #18  <Field float mHeight>
	//   20   36:invokevirtual   #55  <Method StringBuilder StringBuilder.append(float)>
	//   21   39:pop             
		stringbuilder.append(",mImageData=");
	//   22   40:aload_1         
	//   23   41:ldc1            #59  <String ",mImageData=">
	//   24   43:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mImageData);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #20  <Field String mImageData>
	//   29   52:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append("}");
	//   31   56:aload_1         
	//   32   57:ldc1            #61  <String "}">
	//   33   59:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		return stringbuilder.toString();
	//   35   63:aload_1         
	//   36   64:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   37   67:areturn         
	}

	final float mHeight;
	final String mImageData;
	final float mWidth;
}
