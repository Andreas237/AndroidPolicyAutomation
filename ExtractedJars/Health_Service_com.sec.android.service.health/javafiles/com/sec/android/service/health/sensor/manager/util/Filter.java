// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.manager.util;

import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import java.util.List;

public class Filter
{

	public Filter(int i, int j, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mRequiredDeviceType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int mRequiredDeviceType>
		mRequiredDataType = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int mRequiredDataType>
		mRequiredDeviceId = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #20  <Field String mRequiredDeviceId>
	//   11   19:return          
	}

	public int getFilterDataType()
	{
		return mRequiredDataType;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int mRequiredDataType>
	//    2    4:ireturn         
	}

	public String getFilterDeviceId()
	{
		return mRequiredDeviceId;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mRequiredDeviceId>
	//    2    4:areturn         
	}

	public int getFilterDeviceType()
	{
		return mRequiredDeviceType;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int mRequiredDeviceType>
	//    2    4:ireturn         
	}

	public boolean verifyDevice(_PrivilegeSensorDevice _pprivilegesensordevice)
	{
		if(_pprivilegesensordevice == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		boolean flag1 = true;
	//    4    6:iconst_1        
	//    5    7:istore_3        
		boolean flag = flag1;
	//    6    8:iload_3         
	//    7    9:istore_2        
		if(mRequiredDataType != 0)
	//*   8   10:aload_0         
	//*   9   11:getfield        #18  <Field int mRequiredDataType>
	//*  10   14:ifeq            52
		{
			flag = flag1;
	//   11   17:iload_3         
	//   12   18:istore_2        
			if(true)
	//*  13   19:iconst_1        
	//*  14   20:ifeq            52
			{
				List list = _pprivilegesensordevice.getDataType();
	//   15   23:aload_1         
	//   16   24:invokevirtual   #34  <Method List _PrivilegeSensorDevice.getDataType()>
	//   17   27:astore          4
				if(true && list.contains(((Object) (Integer.valueOf(mRequiredDataType)))))
	//*  18   29:iconst_1        
	//*  19   30:ifeq            89
	//*  20   33:aload           4
	//*  21   35:aload_0         
	//*  22   36:getfield        #18  <Field int mRequiredDataType>
	//*  23   39:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//*  24   42:invokeinterface #46  <Method boolean List.contains(Object)>
	//*  25   47:ifeq            89
					flag = true;
	//   26   50:iconst_1        
	//   27   51:istore_2        
				else
	//*  28   52:iload_2         
	//*  29   53:istore_3        
	//*  30   54:aload_0         
	//*  31   55:getfield        #20  <Field String mRequiredDeviceId>
	//*  32   58:ifnull          87
	//*  33   61:iload_2         
	//*  34   62:istore_3        
	//*  35   63:iload_2         
	//*  36   64:ifeq            87
	//*  37   67:iload_2         
	//*  38   68:ifeq            94
	//*  39   71:aload_0         
	//*  40   72:getfield        #20  <Field String mRequiredDeviceId>
	//*  41   75:aload_1         
	//*  42   76:invokevirtual   #49  <Method String _PrivilegeSensorDevice.getId()>
	//*  43   79:invokevirtual   #54  <Method boolean String.equals(Object)>
	//*  44   82:ifeq            94
	//*  45   85:iconst_1        
	//*  46   86:istore_3        
	//*  47   87:iload_3         
	//*  48   88:ireturn         
					flag = false;
	//   49   89:iconst_0        
	//   50   90:istore_2        
			}
		}
		flag1 = flag;
		if(mRequiredDeviceId != null)
		{
			flag1 = flag;
			if(flag)
				if(flag && mRequiredDeviceId.equals(((Object) (_pprivilegesensordevice.getId()))))
					flag1 = true;
				else
	//*  51   91:goto            52
					flag1 = false;
	//   52   94:iconst_0        
	//   53   95:istore_3        
		}
		return flag1;
	//*  54   96:goto            87
	}

	private int mRequiredDataType;
	private String mRequiredDeviceId;
	private int mRequiredDeviceType;
}
