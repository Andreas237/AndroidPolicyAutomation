// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.fragments:
//			g

public class bi extends g
{
	public static interface a
	{

		public abstract void a(OnDemandOTAStatus ondemandotastatus);
	}


	public bi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void g()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #40  <Field boolean c>
		e = ((OnDemandOTAHandler) (new OnDemandOTAHandler() {

			public void updateStatus(OnDemandOTAStatus ondemandotastatus)
			{
				String s = bi.b();
			//    0    0:invokestatic    #22  <Method String bi.b()>
			//    1    3:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
			//    2    4:new             #24  <Class StringBuilder>
			//    3    7:dup             
			//    4    8:invokespecial   #25  <Method void StringBuilder()>
			//    5   11:astore_3        
				stringbuilder.append("updateStatus: ");
			//    6   12:aload_3         
			//    7   13:ldc1            #27  <String "updateStatus: ">
			//    8   15:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
			//    9   18:pop             
				stringbuilder.append(((Object) (ondemandotastatus)));
			//   10   19:aload_3         
			//   11   20:aload_1         
			//   12   21:invokevirtual   #34  <Method StringBuilder StringBuilder.append(Object)>
			//   13   24:pop             
				o.b(s, stringbuilder.toString());
			//   14   25:aload_2         
			//   15   26:aload_3         
			//   16   27:invokevirtual   #37  <Method String StringBuilder.toString()>
			//   17   30:invokestatic    #42  <Method void o.b(String, String)>
				com.irobot.home.fragments.bi.a(a).a(ondemandotastatus);
			//   18   33:aload_0         
			//   19   34:getfield        #12  <Field bi a>
			//   20   37:invokestatic    #45  <Method bi$a com.irobot.home.fragments.bi.a(bi)>
			//   21   40:aload_1         
			//   22   41:invokeinterface #49  <Method void com.irobot.home.fragments.bi$a.a(OnDemandOTAStatus)>
			//   23   46:return          
			}

			final bi a;

			
			{
				a = bi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field bi a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void OnDemandOTAHandler()>
			//    5    9:return          
			}
		}
));
	//    5    9:aload_0         
	//    6   10:new             #6   <Class bi$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #43  <Method void bi$1(bi)>
	//   10   18:putfield        #45  <Field OnDemandOTAHandler e>
	//   11   21:return          
	}

	static a a(bi bi1)
	{
		return bi1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field bi$a d>
	//    2    4:areturn         
	}

	static String b()
	{
		return b;
	//    0    0:getstatic       #34  <Field String b>
	//    1    3:areturn         
	}

	protected void a()
	{
		String s = j.j().a().getName();
	//    0    0:invokestatic    #52  <Method a j.j()>
	//    1    3:invokevirtual   #57  <Method AssetInfo a.a()>
	//    2    6:invokevirtual   #62  <Method String AssetInfo.getName()>
	//    3    9:astore_1        
		a.setText(((CharSequence) (getString(0x7f0f022a, new Object[] {
			s
		}))));
	//    4   10:aload_0         
	//    5   11:getfield        #64  <Field TextView a>
	//    6   14:aload_0         
	//    7   15:ldc1            #65  <Int 0x7f0f022a>
	//    8   17:iconst_1        
	//    9   18:anewarray       Object[]
	//   10   21:dup             
	//   11   22:iconst_0        
	//   12   23:aload_1         
	//   13   24:aastore         
	//   14   25:invokevirtual   #71  <Method String getString(int, Object[])>
	//   15   28:invokevirtual   #77  <Method void TextView.setText(CharSequence)>
	//   16   31:return          
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #81  <Method void g.onAttach(Activity)>
		if(activity instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #8   <Class bi$a>
	//*   5    9:ifeq            21
		{
			d = (a)activity;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #8   <Class bi$a>
	//    9   17:putfield        #48  <Field bi$a d>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #83  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #84  <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (activity)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #87  <Method String Object.toString()>
	//   18   34:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnConnectingListener");
	//   20   38:aload_2         
	//   21   39:ldc1            #93  <String " must implement OnConnectingListener">
	//   22   41:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   45:new             #95  <Class RuntimeException>
	//   25   48:dup             
	//   26   49:aload_2         
	//   27   50:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #99  <Method void RuntimeException(String)>
	//   29   56:athrow          
		}
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #102 <Method void g.onAttach(Context)>
		if(context instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #8   <Class bi$a>
	//*   5    9:ifeq            21
		{
			d = (a)context;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #8   <Class bi$a>
	//    9   17:putfield        #48  <Field bi$a d>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #83  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #84  <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (context)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #87  <Method String Object.toString()>
	//   18   34:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnConnectingListener");
	//   20   38:aload_2         
	//   21   39:ldc1            #93  <String " must implement OnConnectingListener">
	//   22   41:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   45:new             #95  <Class RuntimeException>
	//   25   48:dup             
	//   26   49:aload_2         
	//   27   50:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #99  <Method void RuntimeException(String)>
	//   29   56:athrow          
		}
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void g.onDetach()>
		d = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #48  <Field bi$a d>
	//    5    9:return          
	}

	public void onHiddenChanged(boolean flag)
	{
		super.onHiddenChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #109 <Method void g.onHiddenChanged(boolean)>
		if(!flag && !c)
	//*   3    5:iload_1         
	//*   4    6:ifne            45
	//*   5    9:aload_0         
	//*   6   10:getfield        #40  <Field boolean c>
	//*   7   13:ifne            45
		{
			c = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #40  <Field boolean c>
			AssetInfo assetinfo = j.j().a();
	//   11   21:invokestatic    #52  <Method a j.j()>
	//   12   24:invokevirtual   #57  <Method AssetInfo a.a()>
	//   13   27:astore_2        
			Assembler.getInstance().getUpdateUIService(assetinfo.getAssetId()).queryOnDemandOTAStatus(e);
	//   14   28:invokestatic    #115 <Method Assembler Assembler.getInstance()>
	//   15   31:aload_2         
	//   16   32:invokevirtual   #119 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   17   35:invokevirtual   #123 <Method UpdateUIService Assembler.getUpdateUIService(com.irobot.core.AssetId)>
	//   18   38:aload_0         
	//   19   39:getfield        #45  <Field OnDemandOTAHandler e>
	//   20   42:invokevirtual   #129 <Method void UpdateUIService.queryOnDemandOTAStatus(OnDemandOTAHandler)>
		}
	//   21   45:return          
	}

	private static final String b = j.r(((Class) (com/irobot/home/fragments/bi)).getSimpleName());
	TextView a;
	private boolean c;
	private a d;
	private OnDemandOTAHandler e;

	static 
	{
	//    0    0:ldc1            #2   <Class bi>
	//    1    2:invokevirtual   #26  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #32  <Method String j.r(String)>
	//    3    8:putstatic       #34  <Field String b>
	//*   4   11:return          
	}
}
