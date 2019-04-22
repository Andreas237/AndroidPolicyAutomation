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
	//    1    1:ldc1            #12  <Int 0x80000000>
	//    2    3:ldc1            #12  <Int 0x80000000>
	//    3    5:invokespecial   #15  <Method void SimpleTarget(int, int)>
	//    4    8:return          
	}

	public SimpleTarget(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void BaseTarget()>
		width = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int width>
		height = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int height>
	//    8   14:return          
	}

	public final void getSize(SizeReadyCallback sizereadycallback)
	{
		if(Util.isValidDimensions(width, height))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field int width>
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field int height>
	//*   4    8:invokestatic    #31  <Method boolean Util.isValidDimensions(int, int)>
	//*   5   11:ifeq            29
		{
			sizereadycallback.onSizeReady(width, height);
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field int width>
	//    9   19:aload_0         
	//   10   20:getfield        #22  <Field int height>
	//   11   23:invokeinterface #36  <Method void SizeReadyCallback.onSizeReady(int, int)>
			return;
	//   12   28:return          
		} else
		{
			sizereadycallback = ((SizeReadyCallback) (new StringBuilder()));
	//   13   29:new             #38  <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #39  <Method void StringBuilder()>
	//   16   36:astore_1        
			((StringBuilder) (sizereadycallback)).append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
	//   17   37:aload_1         
	//   18   38:ldc1            #41  <String "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ">
	//   19   40:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
			((StringBuilder) (sizereadycallback)).append(width);
	//   21   44:aload_1         
	//   22   45:aload_0         
	//   23   46:getfield        #20  <Field int width>
	//   24   49:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
	//   25   52:pop             
			((StringBuilder) (sizereadycallback)).append(" and height: ");
	//   26   53:aload_1         
	//   27   54:ldc1            #50  <String " and height: ">
	//   28   56:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
			((StringBuilder) (sizereadycallback)).append(height);
	//   30   60:aload_1         
	//   31   61:aload_0         
	//   32   62:getfield        #22  <Field int height>
	//   33   65:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
	//   34   68:pop             
			((StringBuilder) (sizereadycallback)).append(", either provide dimensions in the constructor or call override()");
	//   35   69:aload_1         
	//   36   70:ldc1            #52  <String ", either provide dimensions in the constructor or call override()">
	//   37   72:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   38   75:pop             
			throw new IllegalArgumentException(((StringBuilder) (sizereadycallback)).toString());
	//   39   76:new             #54  <Class IllegalArgumentException>
	//   40   79:dup             
	//   41   80:aload_1         
	//   42   81:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   43   84:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   44   87:athrow          
		}
	}

	public void removeCallback(SizeReadyCallback sizereadycallback)
	{
	//    0    0:return          
	}

	private final int height;
	private final int width;
}
