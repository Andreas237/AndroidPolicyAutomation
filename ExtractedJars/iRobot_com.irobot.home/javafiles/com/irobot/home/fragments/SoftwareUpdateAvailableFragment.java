// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.DuplicateAssetStatusChangedEvent;
import com.irobot.core.EventType;
import com.irobot.core.OnDemandOTAAvailabilityEvent;
import com.irobot.core.OnDemandOTAPathType;
import com.irobot.core.OnDemandOTAStartError;
import com.irobot.core.OnDemandOtaPath;
import com.irobot.core.ServiceDiscovery;
import com.irobot.core.TimeoutEvent;
import com.irobot.core.UpdateUIService;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class SoftwareUpdateAvailableFragment extends com.irobot.home.fragments.j
{
	public static interface a
	{

		public abstract void b(boolean flag);

		public abstract void f();
	}


	public SoftwareUpdateAvailableFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void com.irobot.home.fragments.j()>
		b = OnDemandOTAPathType.None;
	//    2    4:aload_0         
	//    3    5:getstatic       #57  <Field OnDemandOTAPathType OnDemandOTAPathType.None>
	//    4    8:putfield        #59  <Field OnDemandOTAPathType b>
		m = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #61  <Field AlertDialog m>
		n = OnDemandOTAStartError.None;
	//    8   16:aload_0         
	//    9   17:getstatic       #65  <Field OnDemandOTAStartError OnDemandOTAStartError.None>
	//   10   20:putfield        #67  <Field OnDemandOTAStartError n>
	//   11   23:return          
	}

	static UpdateUIService a(SoftwareUpdateAvailableFragment softwareupdateavailablefragment)
	{
		return softwareupdateavailablefragment.l;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field UpdateUIService l>
	//    2    4:areturn         
	}

	static a b(SoftwareUpdateAvailableFragment softwareupdateavailablefragment)
	{
		return softwareupdateavailablefragment.j;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field SoftwareUpdateAvailableFragment$a j>
	//    2    4:areturn         
	}

	static void c(SoftwareUpdateAvailableFragment softwareupdateavailablefragment)
	{
		softwareupdateavailablefragment.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void f()>
	//    2    4:return          
	}

	private void d()
	{
label0:
		{
			String s1 = com.irobot.home.util.j.a(a).a().getName();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String a>
	//    2    4:invokestatic    #81  <Method a j.a(String)>
	//    3    7:invokevirtual   #86  <Method AssetInfo a.a()>
	//    4   10:invokevirtual   #91  <Method String AssetInfo.getName()>
	//    5   13:astore          4
			static class _cls2
			{

				static final int a[];

				static 
				{
					a = new int[OnDemandOTAStartError.values().length];
				//    0    0:invokestatic    #18  <Method OnDemandOTAStartError[] OnDemandOTAStartError.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] a>
					try
					{
						a[OnDemandOTAStartError.None.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] a>
				//    5   12:getstatic       #24  <Field OnDemandOTAStartError OnDemandOTAStartError.None>
				//    6   15:invokevirtual   #28  <Method int OnDemandOTAStartError.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] a>
				//*  10   23:getstatic       #31  <Field OnDemandOTAStartError OnDemandOTAStartError.NotOnDock>
				//*  11   26:invokevirtual   #28  <Method int OnDemandOTAStartError.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] a>
				//*  15   34:getstatic       #34  <Field OnDemandOTAStartError OnDemandOTAStartError.MidMission>
				//*  16   37:invokevirtual   #28  <Method int OnDemandOTAStartError.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   20   43:astore_0        
					try
					{
						a[OnDemandOTAStartError.NotOnDock.ordinal()] = 2;
					}
				//*  21   44:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   22   47:astore_0        
					try
					{
						a[OnDemandOTAStartError.MidMission.ordinal()] = 3;
					}
				//*  23   48:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   24   51:astore_0        
				//*  25   52:return          
				}
			}

			int i1;
			android.app.AlertDialog.Builder builder;
			Object aobj[];
			switch(com.irobot.home.fragments._cls2.a[n.ordinal()])
	//*   6   15:getstatic       #94  <Field int[] com.irobot.home.fragments.SoftwareUpdateAvailableFragment$2.a>
	//*   7   18:aload_0         
	//*   8   19:getfield        #67  <Field OnDemandOTAStartError n>
	//*   9   22:invokevirtual   #98  <Method int OnDemandOTAStartError.ordinal()>
	//*  10   25:iaload          
			{
	//*  11   26:tableswitch     1 3: default 52
	//	               1 173
	//	               2 122
	//	               3 89
			default:
				String s = i;
	//   12   52:getstatic       #48  <Field String i>
	//   13   55:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   14   56:new             #100 <Class StringBuilder>
	//   15   59:dup             
	//   16   60:invokespecial   #101 <Method void StringBuilder()>
	//   17   63:astore_3        
				stringbuilder.append("Unhandled OnDemandOTAStartError enum value: ");
	//   18   64:aload_3         
	//   19   65:ldc1            #103 <String "Unhandled OnDemandOTAStartError enum value: ">
	//   20   67:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   21   70:pop             
				stringbuilder.append(((Object) (n)));
	//   22   71:aload_3         
	//   23   72:aload_0         
	//   24   73:getfield        #67  <Field OnDemandOTAStartError n>
	//   25   76:invokevirtual   #110 <Method StringBuilder StringBuilder.append(Object)>
	//   26   79:pop             
				o.d(s, stringbuilder.toString());
	//   27   80:aload_2         
	//   28   81:aload_3         
	//   29   82:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   30   85:invokestatic    #118 <Method void o.d(String, String)>
				return;
	//   31   88:return          

			case 1: // '\001'
				break label0;

			case 3: // '\003'
				builder = (new android.app.AlertDialog.Builder(((Context) (getActivity())))).setTitle(0x7f0f0773);
	//   32   89:new             #120 <Class android.app.AlertDialog$Builder>
	//   33   92:dup             
	//   34   93:aload_0         
	//   35   94:invokevirtual   #124 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   36   97:invokespecial   #127 <Method void android.app.AlertDialog$Builder(Context)>
	//   37  100:ldc1            #128 <Int 0x7f0f0773>
	//   38  102:invokevirtual   #132 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   39  105:astore_2        
				i1 = 0x7f0f0774;
	//   40  106:ldc1            #133 <Int 0x7f0f0774>
	//   41  108:istore_1        
				aobj = new Object[1];
	//   42  109:iconst_1        
	//   43  110:anewarray       Object[]
	//   44  113:astore_3        
				aobj[0] = ((Object) (s1));
	//   45  114:aload_3         
	//   46  115:iconst_0        
	//   47  116:aload           4
	//   48  118:aastore         
				break;
	//   49  119:goto            152

			case 2: // '\002'
				builder = (new android.app.AlertDialog.Builder(((Context) (getActivity())))).setTitle(0x7f0f077a);
	//   50  122:new             #120 <Class android.app.AlertDialog$Builder>
	//   51  125:dup             
	//   52  126:aload_0         
	//   53  127:invokevirtual   #124 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   54  130:invokespecial   #127 <Method void android.app.AlertDialog$Builder(Context)>
	//   55  133:ldc1            #136 <Int 0x7f0f077a>
	//   56  135:invokevirtual   #132 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   57  138:astore_2        
				i1 = 0x7f0f077b;
	//   58  139:ldc1            #137 <Int 0x7f0f077b>
	//   59  141:istore_1        
				aobj = new Object[1];
	//   60  142:iconst_1        
	//   61  143:anewarray       Object[]
	//   62  146:astore_3        
				aobj[0] = ((Object) (s1));
	//   63  147:aload_3         
	//   64  148:iconst_0        
	//   65  149:aload           4
	//   66  151:aastore         
				break;
			}
			builder.setMessage(((CharSequence) (getString(i1, aobj)))).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//   67  152:aload_2         
	//   68  153:aload_0         
	//   69  154:iload_1         
	//   70  155:aload_3         
	//   71  156:invokevirtual   #141 <Method String getString(int, Object[])>
	//   72  159:invokevirtual   #145 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   73  162:ldc1            #146 <Int 0x7f0f05bb>
	//   74  164:aconst_null     
	//   75  165:invokevirtual   #150 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   76  168:invokevirtual   #154 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   77  171:pop             
			return;
	//   78  172:return          
		}
		j.f();
	//   79  173:aload_0         
	//   80  174:getfield        #73  <Field SoftwareUpdateAvailableFragment$a j>
	//   81  177:invokeinterface #155 <Method void SoftwareUpdateAvailableFragment$a.f()>
	//   82  182:return          
	}

	private void e()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String a>
	//    2    4:invokestatic    #81  <Method a j.a(String)>
	//    3    7:invokevirtual   #86  <Method AssetInfo a.a()>
	//    4   10:astore_2        
		AnalyticsSubsystem analyticssubsystem = AnalyticsSubsystem.getInstance();
	//    5   11:invokestatic    #161 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   14:astore_3        
		OnDemandOtaPath ondemandotapath;
		if(b == OnDemandOTAPathType.Settings)
	//*   7   15:aload_0         
	//*   8   16:getfield        #59  <Field OnDemandOTAPathType b>
	//*   9   19:getstatic       #164 <Field OnDemandOTAPathType OnDemandOTAPathType.Settings>
	//*  10   22:if_acmpne       32
			ondemandotapath = OnDemandOtaPath.Settings;
	//   11   25:getstatic       #169 <Field OnDemandOtaPath OnDemandOtaPath.Settings>
	//   12   28:astore_1        
		else
	//*  13   29:goto            36
			ondemandotapath = OnDemandOtaPath.Provisioning;
	//   14   32:getstatic       #172 <Field OnDemandOtaPath OnDemandOtaPath.Provisioning>
	//   15   35:astore_1        
		analyticssubsystem.trackOnDemandOtaUpdateNowButtonPressed(assetinfo, ondemandotapath);
	//   16   36:aload_3         
	//   17   37:aload_2         
	//   18   38:aload_1         
	//   19   39:invokevirtual   #176 <Method void AnalyticsSubsystem.trackOnDemandOtaUpdateNowButtonPressed(AssetInfo, OnDemandOtaPath)>
	//   20   42:return          
	}

	private void f()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String a>
	//    2    4:invokestatic    #81  <Method a j.a(String)>
	//    3    7:invokevirtual   #86  <Method AssetInfo a.a()>
	//    4   10:astore_1        
		AnalyticsSubsystem.getInstance().trackOnDemandOtaUpdateLaterButtonPressed(assetinfo);
	//    5   11:invokestatic    #161 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #180 <Method void AnalyticsSubsystem.trackOnDemandOtaUpdateLaterButtonPressed(AssetInfo)>
	//    8   18:return          
	}

	protected void a()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String a>
	//    2    4:invokestatic    #81  <Method a j.a(String)>
	//    3    7:invokevirtual   #86  <Method AssetInfo a.a()>
	//    4   10:astore_3        
		Object obj = ((Object) (assetinfo.getName()));
	//    5   11:aload_3         
	//    6   12:invokevirtual   #91  <Method String AssetInfo.getName()>
	//    7   15:astore_2        
		Object obj1 = ((Object) (c));
	//    8   16:aload_0         
	//    9   17:getfield        #182 <Field TextView c>
	//   10   20:astore          4
		boolean flag = true;
	//   11   22:iconst_1        
	//   12   23:istore_1        
		((TextView) (obj1)).setText(((CharSequence) (getString(0x7f0f0857, new Object[] {
			obj
		}))));
	//   13   24:aload           4
	//   14   26:aload_0         
	//   15   27:ldc1            #183 <Int 0x7f0f0857>
	//   16   29:iconst_1        
	//   17   30:anewarray       Object[]
	//   18   33:dup             
	//   19   34:iconst_0        
	//   20   35:aload_2         
	//   21   36:aastore         
	//   22   37:invokevirtual   #141 <Method String getString(int, Object[])>
	//   23   40:invokevirtual   #189 <Method void TextView.setText(CharSequence)>
		k = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//   24   43:aload_0         
	//   25   44:invokestatic    #194 <Method Assembler Assembler.getInstance()>
	//   26   47:invokevirtual   #198 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   27   50:checkcast       #200 <Class com.irobot.home.i.a>
	//   28   53:putfield        #202 <Field com.irobot.home.i.a k>
		l = Assembler.getInstance().getUpdateUIService(assetinfo.getAssetId());
	//   29   56:aload_0         
	//   30   57:invokestatic    #194 <Method Assembler Assembler.getInstance()>
	//   31   60:aload_3         
	//   32   61:invokevirtual   #206 <Method AssetId AssetInfo.getAssetId()>
	//   33   64:invokevirtual   #210 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//   34   67:putfield        #70  <Field UpdateUIService l>
		m = (new android.app.AlertDialog.Builder(((Context) (getActivity())))).setMessage(((CharSequence) (getString(0x7f0f0854, new Object[] {
			obj
		})))).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				com.irobot.home.fragments.SoftwareUpdateAvailableFragment.a(a).requestExpeditedOta();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field SoftwareUpdateAvailableFragment a>
			//    2    4:invokestatic    #24  <Method UpdateUIService com.irobot.home.fragments.SoftwareUpdateAvailableFragment.a(SoftwareUpdateAvailableFragment)>
			//    3    7:invokevirtual   #30  <Method boolean UpdateUIService.requestExpeditedOta()>
			//    4   10:pop             
				SoftwareUpdateAvailableFragment.b(a).b(false);
			//    5   11:aload_0         
			//    6   12:getfield        #16  <Field SoftwareUpdateAvailableFragment a>
			//    7   15:invokestatic    #34  <Method SoftwareUpdateAvailableFragment$a SoftwareUpdateAvailableFragment.b(SoftwareUpdateAvailableFragment)>
			//    8   18:iconst_0        
			//    9   19:invokeinterface #39  <Method void SoftwareUpdateAvailableFragment$a.b(boolean)>
				SoftwareUpdateAvailableFragment.c(a);
			//   10   24:aload_0         
			//   11   25:getfield        #16  <Field SoftwareUpdateAvailableFragment a>
			//   12   28:invokestatic    #42  <Method void SoftwareUpdateAvailableFragment.c(SoftwareUpdateAvailableFragment)>
			//   13   31:return          
			}

			final SoftwareUpdateAvailableFragment a;

			
			{
				a = SoftwareUpdateAvailableFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SoftwareUpdateAvailableFragment a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).create();
	//   35   70:aload_0         
	//   36   71:new             #120 <Class android.app.AlertDialog$Builder>
	//   37   74:dup             
	//   38   75:aload_0         
	//   39   76:invokevirtual   #124 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   40   79:invokespecial   #127 <Method void android.app.AlertDialog$Builder(Context)>
	//   41   82:aload_0         
	//   42   83:ldc1            #211 <Int 0x7f0f0854>
	//   43   85:iconst_1        
	//   44   86:anewarray       Object[]
	//   45   89:dup             
	//   46   90:iconst_0        
	//   47   91:aload_2         
	//   48   92:aastore         
	//   49   93:invokevirtual   #141 <Method String getString(int, Object[])>
	//   50   96:invokevirtual   #145 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   51   99:ldc1            #146 <Int 0x7f0f05bb>
	//   52  101:new             #6   <Class SoftwareUpdateAvailableFragment$1>
	//   53  104:dup             
	//   54  105:aload_0         
	//   55  106:invokespecial   #213 <Method void SoftwareUpdateAvailableFragment$1(SoftwareUpdateAvailableFragment)>
	//   56  109:invokevirtual   #150 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   57  112:ldc1            #214 <Int 0x7f0f017d>
	//   58  114:aconst_null     
	//   59  115:invokevirtual   #217 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   60  118:invokevirtual   #220 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   61  121:putfield        #61  <Field AlertDialog m>
		if(b == OnDemandOTAPathType.Provisioning)
	//*  62  124:aload_0         
	//*  63  125:getfield        #59  <Field OnDemandOTAPathType b>
	//*  64  128:getstatic       #222 <Field OnDemandOTAPathType OnDemandOTAPathType.Provisioning>
	//*  65  131:if_acmpne       145
		{
			e.setVisibility(0);
	//   66  134:aload_0         
	//   67  135:getfield        #224 <Field TextView e>
	//   68  138:iconst_0        
	//   69  139:invokevirtual   #228 <Method void TextView.setVisibility(int)>
		} else
	//*  70  142:goto            162
		{
			e.setVisibility(8);
	//   71  145:aload_0         
	//   72  146:getfield        #224 <Field TextView e>
	//   73  149:bipush          8
	//   74  151:invokevirtual   #228 <Method void TextView.setVisibility(int)>
			l.requestExpeditedOta();
	//   75  154:aload_0         
	//   76  155:getfield        #70  <Field UpdateUIService l>
	//   77  158:invokevirtual   #234 <Method boolean UpdateUIService.requestExpeditedOta()>
	//   78  161:pop             
		}
		if(b != OnDemandOTAPathType.None)
	//*  79  162:aload_0         
	//*  80  163:getfield        #59  <Field OnDemandOTAPathType b>
	//*  81  166:getstatic       #57  <Field OnDemandOTAPathType OnDemandOTAPathType.None>
	//*  82  169:if_acmpne       175
	//*  83  172:goto            177
			flag = false;
	//   84  175:iconst_0        
	//   85  176:istore_1        
		junit.b.a.b("On-demand OTA path type should not be none!", flag);
	//   86  177:ldc1            #236 <String "On-demand OTA path type should not be none!">
	//   87  179:iload_1         
	//   88  180:invokestatic    #241 <Method void junit.b.a.b(String, boolean)>
		obj1 = ((Object) (AnalyticsSubsystem.getInstance()));
	//   89  183:invokestatic    #161 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   90  186:astore          4
		if(b == OnDemandOTAPathType.Settings)
	//*  91  188:aload_0         
	//*  92  189:getfield        #59  <Field OnDemandOTAPathType b>
	//*  93  192:getstatic       #164 <Field OnDemandOTAPathType OnDemandOTAPathType.Settings>
	//*  94  195:if_acmpne       205
			obj = ((Object) (OnDemandOtaPath.Settings));
	//   95  198:getstatic       #169 <Field OnDemandOtaPath OnDemandOtaPath.Settings>
	//   96  201:astore_2        
		else
	//*  97  202:goto            209
			obj = ((Object) (OnDemandOtaPath.Provisioning));
	//   98  205:getstatic       #172 <Field OnDemandOtaPath OnDemandOtaPath.Provisioning>
	//   99  208:astore_2        
		((AnalyticsSubsystem) (obj1)).trackOnDemandOtaAvailableViewed(assetinfo, ((OnDemandOtaPath) (obj)));
	//  100  209:aload           4
	//  101  211:aload_3         
	//  102  212:aload_2         
	//  103  213:invokevirtual   #244 <Method void AnalyticsSubsystem.trackOnDemandOtaAvailableViewed(AssetInfo, OnDemandOtaPath)>
	//  104  216:return          
	}

	protected void b()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #246 <Method void d()>
		e();
	//    2    4:aload_0         
	//    3    5:invokespecial   #248 <Method void e()>
	//    4    8:return          
	}

	protected void c()
	{
		m.show();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field AlertDialog m>
	//    2    4:invokevirtual   #252 <Method void AlertDialog.show()>
	//    3    7:return          
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #256 <Method void j.onAttach(Activity)>
		if(activity instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #10  <Class SoftwareUpdateAvailableFragment$a>
	//*   5    9:ifeq            21
		{
			j = (a)activity;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #10  <Class SoftwareUpdateAvailableFragment$a>
	//    9   17:putfield        #73  <Field SoftwareUpdateAvailableFragment$a j>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #100 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #101 <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (activity)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #257 <Method String Object.toString()>
	//   18   34:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnUpdateAvailableListener");
	//   20   38:aload_2         
	//   21   39:ldc2            #259 <String " must implement OnUpdateAvailableListener">
	//   22   42:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   46:new             #261 <Class RuntimeException>
	//   25   49:dup             
	//   26   50:aload_2         
	//   27   51:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   28   54:invokespecial   #264 <Method void RuntimeException(String)>
	//   29   57:athrow          
		}
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #266 <Method void j.onAttach(Context)>
		if(context instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #10  <Class SoftwareUpdateAvailableFragment$a>
	//*   5    9:ifeq            21
		{
			j = (a)context;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #10  <Class SoftwareUpdateAvailableFragment$a>
	//    9   17:putfield        #73  <Field SoftwareUpdateAvailableFragment$a j>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #100 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #101 <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (context)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #257 <Method String Object.toString()>
	//   18   34:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnUpdateAvailableListener");
	//   20   38:aload_2         
	//   21   39:ldc2            #259 <String " must implement OnUpdateAvailableListener">
	//   22   42:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   46:new             #261 <Class RuntimeException>
	//   25   49:dup             
	//   26   50:aload_2         
	//   27   51:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   28   54:invokespecial   #264 <Method void RuntimeException(String)>
	//   29   57:athrow          
		}
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #269 <Method void j.onDetach()>
		j = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #73  <Field SoftwareUpdateAvailableFragment$a j>
	//    5    9:return          
	}

	public void onDuplicateAssetStatusChangedEvent(DuplicateAssetStatusChangedEvent duplicateassetstatuschangedevent)
	{
		if(!duplicateassetstatuschangedevent.isUniqueBlid())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #277 <Method boolean DuplicateAssetStatusChangedEvent.isUniqueBlid()>
	//*   2    4:ifne            28
		{
			k.b(((Object) (this)), EventType.DuplicateAssetStatusChangedEvent);
	//    3    7:aload_0         
	//    4    8:getfield        #202 <Field com.irobot.home.i.a k>
	//    5   11:aload_0         
	//    6   12:getstatic       #283 <Field EventType EventType.DuplicateAssetStatusChangedEvent>
	//    7   15:invokevirtual   #286 <Method void com.irobot.home.i.a.b(Object, EventType)>
			j.b(true);
	//    8   18:aload_0         
	//    9   19:getfield        #73  <Field SoftwareUpdateAvailableFragment$a j>
	//   10   22:iconst_1        
	//   11   23:invokeinterface #289 <Method void SoftwareUpdateAvailableFragment$a.b(boolean)>
		}
	//   12   28:return          
	}

	public void onOnDemandOTAAvailabilityEvent(OnDemandOTAAvailabilityEvent ondemandotaavailabilityevent)
	{
		boolean flag = ondemandotaavailabilityevent.startConnectionStateMet();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #297 <Method boolean OnDemandOTAAvailabilityEvent.startConnectionStateMet()>
	//    2    4:istore_3        
		n = ondemandotaavailabilityevent.startError();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #301 <Method OnDemandOTAStartError OnDemandOTAAvailabilityEvent.startError()>
	//    6   10:putfield        #67  <Field OnDemandOTAStartError n>
		d.setEnabled(flag);
	//    7   13:aload_0         
	//    8   14:getfield        #303 <Field Button d>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #308 <Method void Button.setEnabled(boolean)>
		ondemandotaavailabilityevent = ((OnDemandOTAAvailabilityEvent) (f));
	//   11   21:aload_0         
	//   12   22:getfield        #310 <Field ProgressBar f>
	//   13   25:astore_1        
		byte byte0;
		if(flag)
	//*  14   26:iload_3         
	//*  15   27:ifeq            36
			byte0 = 8;
	//   16   30:bipush          8
	//   17   32:istore_2        
		else
	//*  18   33:goto            38
			byte0 = 0;
	//   19   36:iconst_0        
	//   20   37:istore_2        
		((ProgressBar) (ondemandotaavailabilityevent)).setVisibility(((int) (byte0)));
	//   21   38:aload_1         
	//   22   39:iload_2         
	//   23   40:invokevirtual   #313 <Method void ProgressBar.setVisibility(int)>
	//   24   43:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #316 <Method void j.onPause()>
		k.b(((Object) (this)), EventType.TimeoutEvent);
	//    2    4:aload_0         
	//    3    5:getfield        #202 <Field com.irobot.home.i.a k>
	//    4    8:aload_0         
	//    5    9:getstatic       #319 <Field EventType EventType.TimeoutEvent>
	//    6   12:invokevirtual   #286 <Method void com.irobot.home.i.a.b(Object, EventType)>
		k.b(((Object) (this)), EventType.OnDemandOTAAvailabilityEvent);
	//    7   15:aload_0         
	//    8   16:getfield        #202 <Field com.irobot.home.i.a k>
	//    9   19:aload_0         
	//   10   20:getstatic       #322 <Field EventType EventType.OnDemandOTAAvailabilityEvent>
	//   11   23:invokevirtual   #286 <Method void com.irobot.home.i.a.b(Object, EventType)>
		k.b(((Object) (this)), EventType.DuplicateAssetStatusChangedEvent);
	//   12   26:aload_0         
	//   13   27:getfield        #202 <Field com.irobot.home.i.a k>
	//   14   30:aload_0         
	//   15   31:getstatic       #283 <Field EventType EventType.DuplicateAssetStatusChangedEvent>
	//   16   34:invokevirtual   #286 <Method void com.irobot.home.i.a.b(Object, EventType)>
	//   17   37:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #325 <Method void j.onResume()>
		k.a(((Object) (this)), EventType.TimeoutEvent);
	//    2    4:aload_0         
	//    3    5:getfield        #202 <Field com.irobot.home.i.a k>
	//    4    8:aload_0         
	//    5    9:getstatic       #319 <Field EventType EventType.TimeoutEvent>
	//    6   12:invokevirtual   #327 <Method void com.irobot.home.i.a.a(Object, EventType)>
		k.a(((Object) (this)), EventType.OnDemandOTAAvailabilityEvent);
	//    7   15:aload_0         
	//    8   16:getfield        #202 <Field com.irobot.home.i.a k>
	//    9   19:aload_0         
	//   10   20:getstatic       #322 <Field EventType EventType.OnDemandOTAAvailabilityEvent>
	//   11   23:invokevirtual   #327 <Method void com.irobot.home.i.a.a(Object, EventType)>
		k.a(((Object) (this)), EventType.DuplicateAssetStatusChangedEvent);
	//   12   26:aload_0         
	//   13   27:getfield        #202 <Field com.irobot.home.i.a k>
	//   14   30:aload_0         
	//   15   31:getstatic       #283 <Field EventType EventType.DuplicateAssetStatusChangedEvent>
	//   16   34:invokevirtual   #327 <Method void com.irobot.home.i.a.a(Object, EventType)>
		l.queryOnDemandOTAAvailability();
	//   17   37:aload_0         
	//   18   38:getfield        #70  <Field UpdateUIService l>
	//   19   41:invokevirtual   #330 <Method void UpdateUIService.queryOnDemandOTAAvailability()>
		ServiceDiscovery.getInstance().queryDuplicateAssetStatus(AssetId.assetIdForString(a));
	//   20   44:invokestatic    #335 <Method ServiceDiscovery ServiceDiscovery.getInstance()>
	//   21   47:aload_0         
	//   22   48:getfield        #78  <Field String a>
	//   23   51:invokestatic    #341 <Method AssetId AssetId.assetIdForString(String)>
	//   24   54:invokevirtual   #345 <Method void ServiceDiscovery.queryDuplicateAssetStatus(AssetId)>
		f.setVisibility(0);
	//   25   57:aload_0         
	//   26   58:getfield        #310 <Field ProgressBar f>
	//   27   61:iconst_0        
	//   28   62:invokevirtual   #313 <Method void ProgressBar.setVisibility(int)>
	//   29   65:return          
	}

	public void onTimeoutEvent(TimeoutEvent timeoutevent)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #350 <Method boolean isAdded()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(timeoutevent.tag().equalsIgnoreCase("OnDemandOTARemoteConnectionTimeoutTag") && b == OnDemandOTAPathType.Provisioning)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #355 <Method String TimeoutEvent.tag()>
	//*   6   12:ldc2            #357 <String "OnDemandOTARemoteConnectionTimeoutTag">
	//*   7   15:invokevirtual   #363 <Method boolean String.equalsIgnoreCase(String)>
	//*   8   18:ifeq            94
	//*   9   21:aload_0         
	//*  10   22:getfield        #59  <Field OnDemandOTAPathType b>
	//*  11   25:getstatic       #222 <Field OnDemandOTAPathType OnDemandOTAPathType.Provisioning>
	//*  12   28:if_acmpne       94
		{
			timeoutevent = ((TimeoutEvent) (com.irobot.home.util.j.a(a).a().getName()));
	//   13   31:aload_0         
	//   14   32:getfield        #78  <Field String a>
	//   15   35:invokestatic    #81  <Method a j.a(String)>
	//   16   38:invokevirtual   #86  <Method AssetInfo a.a()>
	//   17   41:invokevirtual   #91  <Method String AssetInfo.getName()>
	//   18   44:astore_1        
			(new android.app.AlertDialog.Builder(((Context) (getActivity())))).setTitle(0x7f0f0740).setMessage(((CharSequence) (getString(0x7f0f0741, new Object[] {
				timeoutevent, timeoutevent
			})))).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//   19   45:new             #120 <Class android.app.AlertDialog$Builder>
	//   20   48:dup             
	//   21   49:aload_0         
	//   22   50:invokevirtual   #124 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   23   53:invokespecial   #127 <Method void android.app.AlertDialog$Builder(Context)>
	//   24   56:ldc2            #364 <Int 0x7f0f0740>
	//   25   59:invokevirtual   #132 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   26   62:aload_0         
	//   27   63:ldc2            #365 <Int 0x7f0f0741>
	//   28   66:iconst_2        
	//   29   67:anewarray       Object[]
	//   30   70:dup             
	//   31   71:iconst_0        
	//   32   72:aload_1         
	//   33   73:aastore         
	//   34   74:dup             
	//   35   75:iconst_1        
	//   36   76:aload_1         
	//   37   77:aastore         
	//   38   78:invokevirtual   #141 <Method String getString(int, Object[])>
	//   39   81:invokevirtual   #145 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   40   84:ldc1            #146 <Int 0x7f0f05bb>
	//   41   86:aconst_null     
	//   42   87:invokevirtual   #150 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   43   90:invokevirtual   #154 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   44   93:pop             
		}
	//   45   94:return          
	}

	private static final String i = com.irobot.home.util.j.r(((Class) (com/irobot/home/fragments/SoftwareUpdateAvailableFragment)).getSimpleName());
	String a;
	OnDemandOTAPathType b;
	TextView c;
	Button d;
	TextView e;
	ProgressBar f;
	private a j;
	private com.irobot.home.i.a k;
	private UpdateUIService l;
	private AlertDialog m;
	private OnDemandOTAStartError n;

	static 
	{
	//    0    0:ldc1            #2   <Class SoftwareUpdateAvailableFragment>
	//    1    2:invokevirtual   #40  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #46  <Method String j.r(String)>
	//    3    8:putstatic       #48  <Field String i>
	//*   4   11:return          
	}
}
