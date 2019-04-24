// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class PlatformViewDimension
{

	public PlatformViewDimension(double d, double d1, double d2, double d3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mX = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #16  <Field double mX>
		mY = d1;
	//    5    9:aload_0         
	//    6   10:dload_3         
	//    7   11:putfield        #18  <Field double mY>
		mWidth = d2;
	//    8   14:aload_0         
	//    9   15:dload           5
	//   10   17:putfield        #20  <Field double mWidth>
		mHeight = d3;
	//   11   20:aload_0         
	//   12   21:dload           7
	//   13   23:putfield        #22  <Field double mHeight>
	//   14   26:return          
	}

	public double getHeight()
	{
		return mHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field double mHeight>
	//    2    4:dreturn         
	}

	public double getWidth()
	{
		return mWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field double mWidth>
	//    2    4:dreturn         
	}

	public double getX()
	{
		return mX;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field double mX>
	//    2    4:dreturn         
	}

	public double getY()
	{
		return mY;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field double mY>
	//    2    4:dreturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("PlatformViewDimension{mX=");
	//    4    8:aload_1         
	//    5    9:ldc1            #35  <String "PlatformViewDimension{mX=">
	//    6   11:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mX);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #16  <Field double mX>
	//   11   20:invokevirtual   #42  <Method StringBuilder StringBuilder.append(double)>
	//   12   23:pop             
		stringbuilder.append(",mY=");
	//   13   24:aload_1         
	//   14   25:ldc1            #44  <String ",mY=">
	//   15   27:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mY);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #18  <Field double mY>
	//   20   36:invokevirtual   #42  <Method StringBuilder StringBuilder.append(double)>
	//   21   39:pop             
		stringbuilder.append(",mWidth=");
	//   22   40:aload_1         
	//   23   41:ldc1            #46  <String ",mWidth=">
	//   24   43:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mWidth);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #20  <Field double mWidth>
	//   29   52:invokevirtual   #42  <Method StringBuilder StringBuilder.append(double)>
	//   30   55:pop             
		stringbuilder.append(",mHeight=");
	//   31   56:aload_1         
	//   32   57:ldc1            #48  <String ",mHeight=">
	//   33   59:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mHeight);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #22  <Field double mHeight>
	//   38   68:invokevirtual   #42  <Method StringBuilder StringBuilder.append(double)>
	//   39   71:pop             
		stringbuilder.append("}");
	//   40   72:aload_1         
	//   41   73:ldc1            #50  <String "}">
	//   42   75:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		return stringbuilder.toString();
	//   44   79:aload_1         
	//   45   80:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   46   83:areturn         
	}

	final double mHeight;
	final double mWidth;
	final double mX;
	final double mY;
}
