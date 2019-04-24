// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import com.bumptech.glide.util.Util;

// Referenced classes of package com.bumptech.glide.request.target:
//			BaseTarget, SizeReadyCallback

public abstract class SimpleTarget extends BaseTarget
{

	public SimpleTarget()
	{
		this(0x80000000, 0x80000000);
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <Int 0x80000000>
	//    2    3:ldc1            #11  <Int 0x80000000>
	//    3    5:invokespecial   #14  <Method void SimpleTarget(int, int)>
	//    4    8:return          
	}

	public SimpleTarget(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void BaseTarget()>
		width = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int width>
		height = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int height>
	//    8   14:return          
	}

	public final void getSize(SizeReadyCallback sizereadycallback)
	{
		if(!Util.isValidDimensions(width, height))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field int width>
	//*   2    4:aload_0         
	//*   3    5:getfield        #21  <Field int height>
	//*   4    8:invokestatic    #29  <Method boolean Util.isValidDimensions(int, int)>
	//*   5   11:ifne            61
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ").append(width).append(" and height: ").append(height).append(", either provide dimensions in the constructor or call override()").toString());
	//    6   14:new             #31  <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:new             #33  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #34  <Method void StringBuilder()>
	//   11   25:ldc1            #36  <String "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ">
	//   12   27:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_0         
	//   14   31:getfield        #19  <Field int width>
	//   15   34:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   16   37:ldc1            #45  <String " and height: ">
	//   17   39:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   18   42:aload_0         
	//   19   43:getfield        #21  <Field int height>
	//   20   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   21   49:ldc1            #47  <String ", either provide dimensions in the constructor or call override()">
	//   22   51:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   23   54:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   24   57:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   25   60:athrow          
		} else
		{
			sizereadycallback.onSizeReady(width, height);
	//   26   61:aload_1         
	//   27   62:aload_0         
	//   28   63:getfield        #19  <Field int width>
	//   29   66:aload_0         
	//   30   67:getfield        #21  <Field int height>
	//   31   70:invokeinterface #59  <Method void SizeReadyCallback.onSizeReady(int, int)>
			return;
	//   32   75:return          
		}
	}

	public void removeCallback(SizeReadyCallback sizereadycallback)
	{
	//    0    0:return          
	}

	private final int height;
	private final int width;
}
