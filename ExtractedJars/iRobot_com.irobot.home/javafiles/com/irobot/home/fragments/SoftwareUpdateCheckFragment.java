// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.irobot.core.*;
import com.irobot.home.i.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class SoftwareUpdateCheckFragment extends com.irobot.home.fragments.j
{
	public static interface a
	{

		public abstract void a(boolean flag);
	}


	public SoftwareUpdateCheckFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void com.irobot.home.fragments.j()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field boolean d>
	//    5    9:return          
	}

	static boolean a(SoftwareUpdateCheckFragment softwareupdatecheckfragment, boolean flag)
	{
		softwareupdatecheckfragment.d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field boolean d>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	public void onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		if(!d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field boolean d>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj = ((Object) (b));
	//    4    8:getstatic       #31  <Field String b>
	//    5   11:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #43  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #44  <Method void StringBuilder()>
	//    9   19:astore          4
		stringbuilder.append("AssetUpdateAvailabilityEvent: ");
	//   10   21:aload           4
	//   11   23:ldc1            #46  <String "AssetUpdateAvailabilityEvent: ">
	//   12   25:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
		stringbuilder.append(assetupdateavailabilityevent.status().name());
	//   14   29:aload           4
	//   15   31:aload_1         
	//   16   32:invokevirtual   #56  <Method UpdateStatus AssetUpdateAvailabilityEvent.status()>
	//   17   35:invokevirtual   #61  <Method String UpdateStatus.name()>
	//   18   38:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
		stringbuilder.append(", ");
	//   20   42:aload           4
	//   21   44:ldc1            #63  <String ", ">
	//   22   46:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
		stringbuilder.append(assetupdateavailabilityevent.updateInfo().toString());
	//   24   50:aload           4
	//   25   52:aload_1         
	//   26   53:invokevirtual   #67  <Method FirmwareUpdateItem AssetUpdateAvailabilityEvent.updateInfo()>
	//   27   56:invokevirtual   #72  <Method String FirmwareUpdateItem.toString()>
	//   28   59:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
		o.b(((String) (obj)), stringbuilder.toString());
	//   30   63:aload_3         
	//   31   64:aload           4
	//   32   66:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   33   69:invokestatic    #78  <Method void o.b(String, String)>
		obj = ((Object) (c));
	//   34   72:aload_0         
	//   35   73:getfield        #80  <Field SoftwareUpdateCheckFragment$a c>
	//   36   76:astore_3        
		boolean flag;
		if(assetupdateavailabilityevent.status() == UpdateStatus.UpdateAvailable)
	//*  37   77:aload_1         
	//*  38   78:invokevirtual   #56  <Method UpdateStatus AssetUpdateAvailabilityEvent.status()>
	//*  39   81:getstatic       #84  <Field UpdateStatus UpdateStatus.UpdateAvailable>
	//*  40   84:if_acmpne       92
			flag = true;
	//   41   87:iconst_1        
	//   42   88:istore_2        
		else
	//*  43   89:goto            94
			flag = false;
	//   44   92:iconst_0        
	//   45   93:istore_2        
		((a) (obj)).a(flag);
	//   46   94:aload_3         
	//   47   95:iload_2         
	//   48   96:invokeinterface #87  <Method void com.irobot.home.fragments.SoftwareUpdateCheckFragment$a.a(boolean)>
	//   49  101:return          
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void j.onAttach(Activity)>
		if(activity instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #8   <Class SoftwareUpdateCheckFragment$a>
	//*   5    9:ifeq            21
		{
			c = (a)activity;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #8   <Class SoftwareUpdateCheckFragment$a>
	//    9   17:putfield        #80  <Field SoftwareUpdateCheckFragment$a c>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #43  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #44  <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (activity)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #95  <Method String Object.toString()>
	//   18   34:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnUpdateCheckListener");
	//   20   38:aload_2         
	//   21   39:ldc1            #97  <String " must implement OnUpdateCheckListener">
	//   22   41:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   45:new             #99  <Class RuntimeException>
	//   25   48:dup             
	//   26   49:aload_2         
	//   27   50:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #102 <Method void RuntimeException(String)>
	//   29   56:athrow          
		}
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #105 <Method void j.onAttach(Context)>
		if(context instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #8   <Class SoftwareUpdateCheckFragment$a>
	//*   5    9:ifeq            21
		{
			c = (a)context;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #8   <Class SoftwareUpdateCheckFragment$a>
	//    9   17:putfield        #80  <Field SoftwareUpdateCheckFragment$a c>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #43  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #44  <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (context)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #95  <Method String Object.toString()>
	//   18   34:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnUpdateCheckListener");
	//   20   38:aload_2         
	//   21   39:ldc1            #97  <String " must implement OnUpdateCheckListener">
	//   22   41:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   45:new             #99  <Class RuntimeException>
	//   25   48:dup             
	//   26   49:aload_2         
	//   27   50:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #102 <Method void RuntimeException(String)>
	//   29   56:athrow          
		}
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method void j.onDetach()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #80  <Field SoftwareUpdateCheckFragment$a c>
	//    5    9:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #111 <Method void j.onPause()>
		g.b(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//    2    4:aload_0         
	//    3    5:getfield        #115 <Field a g>
	//    4    8:aload_0         
	//    5    9:getstatic       #121 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//    6   12:invokevirtual   #126 <Method void a.b(Object, EventType)>
	//    7   15:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void j.onResume()>
		g.a(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//    2    4:aload_0         
	//    3    5:getfield        #115 <Field a g>
	//    4    8:aload_0         
	//    5    9:getstatic       #121 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//    6   12:invokevirtual   #131 <Method void a.a(Object, EventType)>
		Object obj = ((Object) (AssetId.assetIdForString(a)));
	//    7   15:aload_0         
	//    8   16:getfield        #133 <Field String a>
	//    9   19:invokestatic    #139 <Method AssetId AssetId.assetIdForString(String)>
	//   10   22:astore_1        
		obj = ((Object) (Assembler.getInstance().getUpdateUIService(((AssetId) (obj)))));
	//   11   23:invokestatic    #145 <Method Assembler Assembler.getInstance()>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #149 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//   14   30:astore_1        
		(new Handler()).postDelayed(new Runnable(((UpdateUIService) (obj))) {

			public void run()
			{
				com.irobot.home.fragments.SoftwareUpdateCheckFragment.a(b, true);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field SoftwareUpdateCheckFragment b>
			//    2    4:iconst_1        
			//    3    5:invokestatic    #28  <Method boolean com.irobot.home.fragments.SoftwareUpdateCheckFragment.a(SoftwareUpdateCheckFragment, boolean)>
			//    4    8:pop             
				a.queryForSoftwareUpdate();
			//    5    9:aload_0         
			//    6   10:getfield        #21  <Field UpdateUIService a>
			//    7   13:invokevirtual   #33  <Method void UpdateUIService.queryForSoftwareUpdate()>
			//    8   16:return          
			}

			final UpdateUIService a;
			final SoftwareUpdateCheckFragment b;

			
			{
				b = SoftwareUpdateCheckFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SoftwareUpdateCheckFragment b>
				a = updateuiservice;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field UpdateUIService a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 2000L);
	//   15   31:new             #151 <Class Handler>
	//   16   34:dup             
	//   17   35:invokespecial   #152 <Method void Handler()>
	//   18   38:new             #6   <Class SoftwareUpdateCheckFragment$1>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:invokespecial   #155 <Method void SoftwareUpdateCheckFragment$1(SoftwareUpdateCheckFragment, UpdateUIService)>
	//   23   47:ldc2w           #156 <Long 2000L>
	//   24   50:invokevirtual   #161 <Method boolean Handler.postDelayed(Runnable, long)>
	//   25   53:pop             
	//   26   54:return          
	}

	private static final String b = j.r(((Class) (com/irobot/home/fragments/SoftwareUpdateCheckFragment)).getSimpleName());
	String a;
	private a c;
	private boolean d;

	static 
	{
	//    0    0:ldc1            #2   <Class SoftwareUpdateCheckFragment>
	//    1    2:invokevirtual   #23  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #29  <Method String j.r(String)>
	//    3    8:putstatic       #31  <Field String b>
	//*   4   11:return          
	}
}
