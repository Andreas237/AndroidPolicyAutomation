// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$24$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		a.b.n();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BroadcastSetupActivity$24 a>
	//    2    4:getfield        #26  <Field BroadcastSetupActivity BroadcastSetupActivity$24.b>
	//    3    7:invokevirtual   #31  <Method void BroadcastSetupActivity.n()>
	//    4   10:return          
	}

	final BroadcastSetupActivity._cls24 a;

	BroadcastSetupActivity$24$2(BroadcastSetupActivity._cls24 _pcls24)
	{
		a = _pcls24;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BroadcastSetupActivity$24 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/irobot/home/BroadcastSetupActivity$24

/* anonymous class */
	class BroadcastSetupActivity._cls24
		implements com.irobot.home.fragments.m.a
	{

		public void a(boolean flag, boolean flag1)
		{
			if(flag1)
		//*   0    0:iload_2         
		//*   1    1:ifeq            131
			{
				if(flag)
		//*   2    4:iload_1         
		//*   3    5:ifeq            91
				{
					AssetSetupUIServiceData assetsetupuiservicedata = Assembler.getInstance().getAssetSetupUIService().getServiceData();
		//    4    8:invokestatic    #40  <Method Assembler Assembler.getInstance()>
		//    5   11:invokevirtual   #44  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
		//    6   14:invokevirtual   #50  <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
		//    7   17:astore_3        
					b.a(b.getString(0x7f0f080f, new Object[] {
						assetsetupuiservicedata.getAssetName()
					}));
		//    8   18:aload_0         
		//    9   19:getfield        #27  <Field BroadcastSetupActivity b>
		//   10   22:aload_0         
		//   11   23:getfield        #27  <Field BroadcastSetupActivity b>
		//   12   26:ldc1            #51  <Int 0x7f0f080f>
		//   13   28:iconst_1        
		//   14   29:anewarray       Object[]
		//   15   32:dup             
		//   16   33:iconst_0        
		//   17   34:aload_3         
		//   18   35:invokevirtual   #57  <Method String AssetSetupUIServiceData.getAssetName()>
		//   19   38:aastore         
		//   20   39:invokevirtual   #61  <Method String BroadcastSetupActivity.getString(int, Object[])>
		//   21   42:invokevirtual   #64  <Method void BroadcastSetupActivity.a(String)>
					b.c.setVisibility(0);
		//   22   45:aload_0         
		//   23   46:getfield        #27  <Field BroadcastSetupActivity b>
		//   24   49:getfield        #68  <Field TextView BroadcastSetupActivity.c>
		//   25   52:iconst_0        
		//   26   53:invokevirtual   #74  <Method void TextView.setVisibility(int)>
					b.c.setOnClickListener(new BroadcastSetupActivity._cls24._cls1());
		//   27   56:aload_0         
		//   28   57:getfield        #27  <Field BroadcastSetupActivity b>
		//   29   60:getfield        #68  <Field TextView BroadcastSetupActivity.c>
		//   30   63:new             #13  <Class BroadcastSetupActivity$24$1>
		//   31   66:dup             
		//   32   67:aload_0         
		//   33   68:invokespecial   #77  <Method void BroadcastSetupActivity$24$1(BroadcastSetupActivity$24)>
		//   34   71:invokevirtual   #81  <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
					b.a(0, 8, 0x7f0f0830, 0x7f0800c8);
		//   35   74:aload_0         
		//   36   75:getfield        #27  <Field BroadcastSetupActivity b>
		//   37   78:iconst_0        
		//   38   79:bipush          8
		//   39   81:ldc1            #82  <Int 0x7f0f0830>
		//   40   83:ldc1            #83  <Int 0x7f0800c8>
		//   41   85:invokevirtual   #86  <Method void BroadcastSetupActivity.a(int, int, int, int)>
				} else
		//*  42   88:goto            110
				if(!a)
		//*  43   91:aload_0         
		//*  44   92:getfield        #32  <Field boolean a>
		//*  45   95:ifne            110
					b.c.setVisibility(8);
		//   46   98:aload_0         
		//   47   99:getfield        #27  <Field BroadcastSetupActivity b>
		//   48  102:getfield        #68  <Field TextView BroadcastSetupActivity.c>
		//   49  105:bipush          8
		//   50  107:invokevirtual   #74  <Method void TextView.setVisibility(int)>
				b.m.setOnClickListener(((android.view.View.OnClickListener) (new BroadcastSetupActivity._cls24._cls2(this))));
		//   51  110:aload_0         
		//   52  111:getfield        #27  <Field BroadcastSetupActivity b>
		//   53  114:getfield        #90  <Field Button BroadcastSetupActivity.m>
		//   54  117:new             #15  <Class BroadcastSetupActivity$24$2>
		//   55  120:dup             
		//   56  121:aload_0         
		//   57  122:invokespecial   #91  <Method void BroadcastSetupActivity$24$2(BroadcastSetupActivity$24)>
		//   58  125:invokevirtual   #94  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			} else
		//*  59  128:goto            225
			{
				Button button;
				android.view.View.OnClickListener onclicklistener;
				if(flag)
		//*  60  131:iload_1         
		//*  61  132:ifeq            192
				{
					b.a(b.getString(0x7f0f081f));
		//   62  135:aload_0         
		//   63  136:getfield        #27  <Field BroadcastSetupActivity b>
		//   64  139:aload_0         
		//   65  140:getfield        #27  <Field BroadcastSetupActivity b>
		//   66  143:ldc1            #95  <Int 0x7f0f081f>
		//   67  145:invokevirtual   #98  <Method String BroadcastSetupActivity.getString(int)>
		//   68  148:invokevirtual   #64  <Method void BroadcastSetupActivity.a(String)>
					b.a(0, 8, 0x7f0f0818, 0x7f0800c8);
		//   69  151:aload_0         
		//   70  152:getfield        #27  <Field BroadcastSetupActivity b>
		//   71  155:iconst_0        
		//   72  156:bipush          8
		//   73  158:ldc1            #99  <Int 0x7f0f0818>
		//   74  160:ldc1            #83  <Int 0x7f0800c8>
		//   75  162:invokevirtual   #86  <Method void BroadcastSetupActivity.a(int, int, int, int)>
					button = b.m;
		//   76  165:aload_0         
		//   77  166:getfield        #27  <Field BroadcastSetupActivity b>
		//   78  169:getfield        #90  <Field Button BroadcastSetupActivity.m>
		//   79  172:astore_3        
					onclicklistener = new BroadcastSetupActivity._cls24._cls3();
		//   80  173:new             #17  <Class BroadcastSetupActivity$24$3>
		//   81  176:dup             
		//   82  177:aload_0         
		//   83  178:invokespecial   #100 <Method void BroadcastSetupActivity$24$3(BroadcastSetupActivity$24)>
		//   84  181:astore          4
				} else
		//*  85  183:aload_3         
		//*  86  184:aload           4
		//*  87  186:invokevirtual   #94  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		//*  88  189:goto            213
				{
					button = b.m;
		//   89  192:aload_0         
		//   90  193:getfield        #27  <Field BroadcastSetupActivity b>
		//   91  196:getfield        #90  <Field Button BroadcastSetupActivity.m>
		//   92  199:astore_3        
					onclicklistener = new BroadcastSetupActivity._cls24._cls4();
		//   93  200:new             #19  <Class BroadcastSetupActivity$24$4>
		//   94  203:dup             
		//   95  204:aload_0         
		//   96  205:invokespecial   #101 <Method void BroadcastSetupActivity$24$4(BroadcastSetupActivity$24)>
		//   97  208:astore          4
				}
				button.setOnClickListener(onclicklistener);
		//*  98  210:goto            183
				b.c.setVisibility(8);
		//   99  213:aload_0         
		//  100  214:getfield        #27  <Field BroadcastSetupActivity b>
		//  101  217:getfield        #68  <Field TextView BroadcastSetupActivity.c>
		//  102  220:bipush          8
		//  103  222:invokevirtual   #74  <Method void TextView.setVisibility(int)>
			}
			a = false;
		//  104  225:aload_0         
		//  105  226:iconst_0        
		//  106  227:putfield        #32  <Field boolean a>
			b.m.setEnabled(true);
		//  107  230:aload_0         
		//  108  231:getfield        #27  <Field BroadcastSetupActivity b>
		//  109  234:getfield        #90  <Field Button BroadcastSetupActivity.m>
		//  110  237:iconst_1        
		//  111  238:invokevirtual   #105 <Method void Button.setEnabled(boolean)>
		//  112  241:return          
		}

		boolean a;
		final BroadcastSetupActivity b;

			
			{
				b = broadcastsetupactivity;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field BroadcastSetupActivity b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #30  <Method void Object()>
				a = false;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #32  <Field boolean a>
			//    8   14:return          
			}

		// Unreferenced inner class com/irobot/home/BroadcastSetupActivity$24$1

/* anonymous class */
		class BroadcastSetupActivity._cls24._cls1
			implements android.view.View.OnClickListener
		{

			public void onClick(View view)
			{
				a.a = true;
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field BroadcastSetupActivity$24 a>
			//    2    4:iconst_1        
			//    3    5:putfield        #25  <Field boolean BroadcastSetupActivity$24.a>
				a.b.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
			//    4    8:aload_0         
			//    5    9:getfield        #16  <Field BroadcastSetupActivity$24 a>
			//    6   12:getfield        #29  <Field BroadcastSetupActivity BroadcastSetupActivity$24.b>
			//    7   15:new             #31  <Class Intent>
			//    8   18:dup             
			//    9   19:ldc1            #33  <String "android.settings.WIFI_SETTINGS">
			//   10   21:invokespecial   #36  <Method void Intent(String)>
			//   11   24:invokevirtual   #42  <Method void BroadcastSetupActivity.startActivity(Intent)>
			//   12   27:return          
			}

			final BroadcastSetupActivity._cls24 a;

					
					{
						a = BroadcastSetupActivity._cls24.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #16  <Field BroadcastSetupActivity$24 a>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}


		// Unreferenced inner class com/irobot/home/BroadcastSetupActivity$24$3

/* anonymous class */
		class BroadcastSetupActivity._cls24._cls3
			implements android.view.View.OnClickListener
		{

			public void onClick(View view)
			{
				a.b.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field BroadcastSetupActivity$24 a>
			//    2    4:getfield        #26  <Field BroadcastSetupActivity BroadcastSetupActivity$24.b>
			//    3    7:new             #28  <Class Intent>
			//    4   10:dup             
			//    5   11:ldc1            #30  <String "android.settings.WIFI_SETTINGS">
			//    6   13:invokespecial   #33  <Method void Intent(String)>
			//    7   16:invokevirtual   #39  <Method void BroadcastSetupActivity.startActivity(Intent)>
			//    8   19:return          
			}

			final BroadcastSetupActivity._cls24 a;

					
					{
						a = BroadcastSetupActivity._cls24.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #16  <Field BroadcastSetupActivity$24 a>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}


		// Unreferenced inner class com/irobot/home/BroadcastSetupActivity$24$4

/* anonymous class */
		class BroadcastSetupActivity._cls24._cls4
			implements android.view.View.OnClickListener
		{

			public void onClick(View view)
			{
				a.b.n();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field BroadcastSetupActivity$24 a>
			//    2    4:getfield        #26  <Field BroadcastSetupActivity BroadcastSetupActivity$24.b>
			//    3    7:invokevirtual   #31  <Method void BroadcastSetupActivity.n()>
			//    4   10:return          
			}

			final BroadcastSetupActivity._cls24 a;

					
					{
						a = BroadcastSetupActivity._cls24.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #16  <Field BroadcastSetupActivity$24 a>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}

	}

}
