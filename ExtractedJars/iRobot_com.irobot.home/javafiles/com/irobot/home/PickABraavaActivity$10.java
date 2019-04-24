// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import com.irobot.core.AssetId;
import com.irobot.home.model.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity, CustomerRegistrationActivity_, BraavaCleanActivity_

class PickABraavaActivity$10
	implements com.irobot.home.g.a.a
{

	public void a()
	{
		Intent intent;
		if(!PickABraavaActivity.d(b))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field PickABraavaActivity b>
	//*   2    4:invokestatic    #28  <Method boolean PickABraavaActivity.d(PickABraavaActivity)>
	//*   3    7:ifne            44
		{
			intent = new Intent(((android.content.Context) (b)), com/irobot/home/CustomerRegistrationActivity_);
	//    4   10:new             #30  <Class Intent>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #18  <Field PickABraavaActivity b>
	//    8   18:ldc1            #32  <Class CustomerRegistrationActivity_>
	//    9   20:invokespecial   #35  <Method void Intent(android.content.Context, Class)>
	//   10   23:astore_1        
			intent.putExtra("assetId", a.b().getId());
	//   11   24:aload_1         
	//   12   25:ldc1            #37  <String "assetId">
	//   13   27:aload_0         
	//   14   28:getfield        #20  <Field a a>
	//   15   31:invokevirtual   #42  <Method AssetId a.b()>
	//   16   34:invokevirtual   #48  <Method String AssetId.getId()>
	//   17   37:invokevirtual   #52  <Method Intent Intent.putExtra(String, String)>
	//   18   40:pop             
		} else
	//*  19   41:goto            58
		{
			intent = new Intent(((android.content.Context) (b)), com/irobot/home/BraavaCleanActivity_);
	//   20   44:new             #30  <Class Intent>
	//   21   47:dup             
	//   22   48:aload_0         
	//   23   49:getfield        #18  <Field PickABraavaActivity b>
	//   24   52:ldc1            #54  <Class BraavaCleanActivity_>
	//   25   54:invokespecial   #35  <Method void Intent(android.content.Context, Class)>
	//   26   57:astore_1        
		}
		j.a(((android.app.Activity) (b)), intent);
	//   27   58:aload_0         
	//   28   59:getfield        #18  <Field PickABraavaActivity b>
	//   29   62:aload_1         
	//   30   63:invokestatic    #59  <Method void j.a(android.app.Activity, Intent)>
	//   31   66:return          
	}

	final a a;
	final PickABraavaActivity b;

	PickABraavaActivity$10(PickABraavaActivity pickabraavaactivity, a a1)
	{
		b = pickabraavaactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field PickABraavaActivity b>
		a = a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field a a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
