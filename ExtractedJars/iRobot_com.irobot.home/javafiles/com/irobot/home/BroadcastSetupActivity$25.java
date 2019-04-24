// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.model.WifiConfig;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$25
	implements com.irobot.home.fragments.z.a
{

	public void a(WifiConfig wificonfig)
	{
		a.J = wificonfig;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:aload_1         
	//    3    5:putfield        #26  <Field WifiConfig BroadcastSetupActivity.J>
		BroadcastSetupActivity.f(a, true);
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field BroadcastSetupActivity a>
	//    6   12:iconst_1        
	//    7   13:invokestatic    #30  <Method boolean BroadcastSetupActivity.f(BroadcastSetupActivity, boolean)>
	//    8   16:pop             
		a.m();
	//    9   17:aload_0         
	//   10   18:getfield        #17  <Field BroadcastSetupActivity a>
	//   11   21:invokevirtual   #33  <Method void BroadcastSetupActivity.m()>
	//   12   24:return          
	}

	public void a(WifiConfig wificonfig, boolean flag, boolean flag1)
	{
		BroadcastSetupActivity.b(a, true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #37  <Method boolean BroadcastSetupActivity.b(BroadcastSetupActivity, boolean)>
	//    4    8:pop             
		a.J = wificonfig;
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
	//    7   13:aload_1         
	//    8   14:putfield        #26  <Field WifiConfig BroadcastSetupActivity.J>
		BroadcastSetupActivity.c(a, flag1);
	//    9   17:aload_0         
	//   10   18:getfield        #17  <Field BroadcastSetupActivity a>
	//   11   21:iload_3         
	//   12   22:invokestatic    #40  <Method boolean BroadcastSetupActivity.c(BroadcastSetupActivity, boolean)>
	//   13   25:pop             
		if(BroadcastSetupActivity.k(a))
	//*  14   26:aload_0         
	//*  15   27:getfield        #17  <Field BroadcastSetupActivity a>
	//*  16   30:invokestatic    #44  <Method boolean BroadcastSetupActivity.k(BroadcastSetupActivity)>
	//*  17   33:ifeq            101
		{
			BroadcastSetupActivity.d(a, false);
	//   18   36:aload_0         
	//   19   37:getfield        #17  <Field BroadcastSetupActivity a>
	//   20   40:iconst_0        
	//   21   41:invokestatic    #47  <Method boolean BroadcastSetupActivity.d(BroadcastSetupActivity, boolean)>
	//   22   44:pop             
			int i;
			if(ProvisioningType.Ble == Assembler.getInstance().getAssetSetupUIService().getServiceData().getProvisioningType())
	//*  23   45:getstatic       #53  <Field ProvisioningType ProvisioningType.Ble>
	//*  24   48:invokestatic    #59  <Method Assembler Assembler.getInstance()>
	//*  25   51:invokevirtual   #63  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//*  26   54:invokevirtual   #69  <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//*  27   57:invokevirtual   #75  <Method ProvisioningType AssetSetupUIServiceData.getProvisioningType()>
	//*  28   60:if_acmpne       81
			{
				wificonfig = ((WifiConfig) (a));
	//   29   63:aload_0         
	//   30   64:getfield        #17  <Field BroadcastSetupActivity a>
	//   31   67:astore_1        
				i = 7;
	//   32   68:bipush          7
	//   33   70:istore          4
			} else
	//*  34   72:aload_1         
	//*  35   73:iload           4
	//*  36   75:putfield        #79  <Field int BroadcastSetupActivity.x>
	//*  37   78:goto            93
			{
				wificonfig = ((WifiConfig) (a));
	//   38   81:aload_0         
	//   39   82:getfield        #17  <Field BroadcastSetupActivity a>
	//   40   85:astore_1        
				i = 8;
	//   41   86:bipush          8
	//   42   88:istore          4
			}
			wificonfig.x = i;
	//*  43   90:goto            72
			a.m();
	//   44   93:aload_0         
	//   45   94:getfield        #17  <Field BroadcastSetupActivity a>
	//   46   97:invokevirtual   #33  <Method void BroadcastSetupActivity.m()>
			return;
	//   47  100:return          
		}
		if(a.I != null)
	//*  48  101:aload_0         
	//*  49  102:getfield        #17  <Field BroadcastSetupActivity a>
	//*  50  105:getfield        #82  <Field android.net.wifi.WifiInfo BroadcastSetupActivity.I>
	//*  51  108:ifnull          129
		{
			BroadcastSetupActivity.e(a, flag ^ true);
	//   52  111:aload_0         
	//   53  112:getfield        #17  <Field BroadcastSetupActivity a>
	//   54  115:iload_2         
	//   55  116:iconst_1        
	//   56  117:ixor            
	//   57  118:invokestatic    #85  <Method boolean BroadcastSetupActivity.e(BroadcastSetupActivity, boolean)>
	//   58  121:pop             
			a.i();
	//   59  122:aload_0         
	//   60  123:getfield        #17  <Field BroadcastSetupActivity a>
	//   61  126:invokevirtual   #88  <Method void BroadcastSetupActivity.i()>
		}
	//   62  129:return          
	}

	public void a(boolean flag)
	{
		a.b(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #91  <Method void BroadcastSetupActivity.b(boolean)>
		BroadcastSetupActivity broadcastsetupactivity = a;
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field BroadcastSetupActivity a>
	//    6   12:astore_3        
		int i;
		if(BroadcastSetupActivity.l(a))
	//*   7   13:aload_0         
	//*   8   14:getfield        #17  <Field BroadcastSetupActivity a>
	//*   9   17:invokestatic    #94  <Method boolean BroadcastSetupActivity.l(BroadcastSetupActivity)>
	//*  10   20:ifeq            29
			i = 0x7f0f0235;
	//   11   23:ldc1            #95  <Int 0x7f0f0235>
	//   12   25:istore_2        
		else
	//*  13   26:goto            32
			i = 0x7f0f0761;
	//   14   29:ldc1            #96  <Int 0x7f0f0761>
	//   15   31:istore_2        
		broadcastsetupactivity.a(0, 8, i, 0x7f0800c8);
	//   16   32:aload_3         
	//   17   33:iconst_0        
	//   18   34:bipush          8
	//   19   36:iload_2         
	//   20   37:ldc1            #97  <Int 0x7f0800c8>
	//   21   39:invokevirtual   #100 <Method void BroadcastSetupActivity.a(int, int, int, int)>
	//   22   42:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$25(BroadcastSetupActivity broadcastsetupactivity)
	{
		a = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
