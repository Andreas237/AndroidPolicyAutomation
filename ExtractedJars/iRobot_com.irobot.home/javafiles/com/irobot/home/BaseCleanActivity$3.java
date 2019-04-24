// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.os.Handler;
import com.irobot.core.Assembler;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.CommandTierAgent;
import com.irobot.home.model.a;
import com.irobot.home.model.i;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			BaseCleanActivity, BroadcastSetupActivity_

class BaseCleanActivity$3
	implements Runnable
{

	public void run()
	{
		String s = j.j().a().getName();
	//    0    0:invokestatic    #40  <Method a j.j()>
	//    1    3:invokevirtual   #45  <Method AssetInfo a.a()>
	//    2    6:invokevirtual   #51  <Method String AssetInfo.getName()>
	//    3    9:astore_1        
		(new android.app.AlertDialog$Builder(((android.content.Context) (c)))).setTitle(0x7f0f0786).setMessage(((CharSequence) (c.getString(0x7f0f019f, new Object[] {
			s, s
		})))).setCancelable(false).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				a.a.post(new Runnable(this) {

					public void run()
					{
						CommandTierAgent commandtieragent = Assembler.getInstance().getCommandTierAgent(a.a.b);
					//    0    0:invokestatic    #32  <Method Assembler Assembler.getInstance()>
					//    1    3:aload_0         
					//    2    4:getfield        #19  <Field BaseCleanActivity$3$1 a>
					//    3    7:getfield        #35  <Field BaseCleanActivity$3 com.irobot.home.BaseCleanActivity$3$1.a>
					//    4   10:getfield        #39  <Field AssetId BaseCleanActivity$3.b>
					//    5   13:invokevirtual   #43  <Method CommandTierAgent Assembler.getCommandTierAgent(AssetId)>
					//    6   16:astore_1        
						try
						{
							com.irobot.home.o.a.a(a.a.b.getId()).a(i.WIPE);
					//    7   17:aload_0         
					//    8   18:getfield        #19  <Field BaseCleanActivity$3$1 a>
					//    9   21:getfield        #35  <Field BaseCleanActivity$3 com.irobot.home.BaseCleanActivity$3$1.a>
					//   10   24:getfield        #39  <Field AssetId BaseCleanActivity$3.b>
					//   11   27:invokevirtual   #49  <Method String AssetId.getId()>
					//   12   30:invokestatic    #54  <Method com.irobot.home.o.a com.irobot.home.o.a.a(String)>
					//   13   33:getstatic       #60  <Field i i.WIPE>
					//   14   36:invokevirtual   #63  <Method void com.irobot.home.o.a.a(i)>
						}
					//*  15   39:goto            83
						catch(Exception exception)
					//*  16   42:astore_2        
						{
							String s = BaseCleanActivity.t();
					//   17   43:invokestatic    #68  <Method String BaseCleanActivity.t()>
					//   18   46:astore_3        
							StringBuilder stringbuilder = new StringBuilder();
					//   19   47:new             #70  <Class StringBuilder>
					//   20   50:dup             
					//   21   51:invokespecial   #71  <Method void StringBuilder()>
					//   22   54:astore          4
							stringbuilder.append("Error sending wipe command to robot. ");
					//   23   56:aload           4
					//   24   58:ldc1            #73  <String "Error sending wipe command to robot. ">
					//   25   60:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
					//   26   63:pop             
							stringbuilder.append(exception.getMessage());
					//   27   64:aload           4
					//   28   66:aload_2         
					//   29   67:invokevirtual   #80  <Method String Exception.getMessage()>
					//   30   70:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
					//   31   73:pop             
							o.e(s, stringbuilder.toString());
					//   32   74:aload_3         
					//   33   75:aload           4
					//   34   77:invokevirtual   #83  <Method String StringBuilder.toString()>
					//   35   80:invokestatic    #89  <Method void o.e(String, String)>
						}
						commandtieragent.resetRobotRemotely();
					//   36   83:aload_1         
					//   37   84:invokevirtual   #94  <Method void CommandTierAgent.resetRobotRemotely()>
						j.b(a.a.b.getId());
					//   38   87:aload_0         
					//   39   88:getfield        #19  <Field BaseCleanActivity$3$1 a>
					//   40   91:getfield        #35  <Field BaseCleanActivity$3 com.irobot.home.BaseCleanActivity$3$1.a>
					//   41   94:getfield        #39  <Field AssetId BaseCleanActivity$3.b>
					//   42   97:invokevirtual   #49  <Method String AssetId.getId()>
					//   43  100:invokestatic    #99  <Method void j.b(String)>
					//   44  103:return          
					}

					final _cls1 a;

			
			{
				a = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseCleanActivity$3$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BaseCleanActivity$3 a>
			//    2    4:getfield        #27  <Field Handler com.irobot.home.BaseCleanActivity$3.a>
			//    3    7:new             #13  <Class BaseCleanActivity$3$1$1>
			//    4   10:dup             
			//    5   11:aload_0         
			//    6   12:invokespecial   #30  <Method void BaseCleanActivity$3$1$1(BaseCleanActivity$3$1)>
			//    7   15:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
			//    8   18:pop             
				com.irobot.home.BroadcastSetupActivity_.a(((android.content.Context) (a.c))).a(true).a();
			//    9   19:aload_0         
			//   10   20:getfield        #19  <Field BaseCleanActivity$3 a>
			//   11   23:getfield        #40  <Field BaseCleanActivity BaseCleanActivity$3.c>
			//   12   26:invokestatic    #45  <Method BroadcastSetupActivity_$a com.irobot.home.BroadcastSetupActivity_.a(android.content.Context)>
			//   13   29:iconst_1        
			//   14   30:invokevirtual   #50  <Method BroadcastSetupActivity_$a com.irobot.home.BroadcastSetupActivity_$a.a(boolean)>
			//   15   33:invokevirtual   #53  <Method org.androidannotations.api.a.e com.irobot.home.BroadcastSetupActivity_$a.a()>
			//   16   36:pop             
				a.c.finish();
			//   17   37:aload_0         
			//   18   38:getfield        #19  <Field BaseCleanActivity$3 a>
			//   19   41:getfield        #40  <Field BaseCleanActivity BaseCleanActivity$3.c>
			//   20   44:invokevirtual   #58  <Method void BaseCleanActivity.finish()>
			//   21   47:return          
			}

			final BaseCleanActivity._cls3 a;

			
			{
				a = BaseCleanActivity._cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseCleanActivity$3 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
).show();
	//    4   10:new             #53  <Class android.app.AlertDialog$Builder>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field BaseCleanActivity c>
	//    8   18:invokespecial   #56  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    9   21:ldc1            #57  <Int 0x7f0f0786>
	//   10   23:invokevirtual   #61  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   11   26:aload_0         
	//   12   27:getfield        #25  <Field BaseCleanActivity c>
	//   13   30:ldc1            #62  <Int 0x7f0f019f>
	//   14   32:iconst_2        
	//   15   33:anewarray       Object[]
	//   16   36:dup             
	//   17   37:iconst_0        
	//   18   38:aload_1         
	//   19   39:aastore         
	//   20   40:dup             
	//   21   41:iconst_1        
	//   22   42:aload_1         
	//   23   43:aastore         
	//   24   44:invokevirtual   #66  <Method String BaseCleanActivity.getString(int, Object[])>
	//   25   47:invokevirtual   #70  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   26   50:iconst_0        
	//   27   51:invokevirtual   #74  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//   28   54:ldc1            #75  <Int 0x7f0f05bb>
	//   29   56:new             #13  <Class BaseCleanActivity$3$1>
	//   30   59:dup             
	//   31   60:aload_0         
	//   32   61:invokespecial   #78  <Method void BaseCleanActivity$3$1(BaseCleanActivity$3)>
	//   33   64:invokevirtual   #82  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   34   67:invokevirtual   #86  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   35   70:pop             
	//   36   71:return          
	}

	final Handler a;
	final AssetId b;
	final BaseCleanActivity c;

	BaseCleanActivity$3(BaseCleanActivity basecleanactivity, Handler handler, AssetId assetid)
	{
		c = basecleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field BaseCleanActivity c>
		a = handler;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field Handler a>
		b = assetid;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field AssetId b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #32  <Method void Object()>
	//   11   19:return          
	}
}
