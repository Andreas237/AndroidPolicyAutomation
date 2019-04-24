// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.widget.ProgressBar;
import com.irobot.core.*;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.f;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class OtaMqttActivity extends BaseFragmentActivity
{
	private class a extends OTAUIServiceDataCallback
	{

		public void onOTAUIServiceDataChanged(OTAUIServiceData otauiservicedata)
		{
			if(otauiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				o.b(OtaMqttActivity.h(), "null service data");
		//    2    4:invokestatic    #25  <Method String OtaMqttActivity.h()>
		//    3    7:ldc1            #27  <String "null service data">
		//    4    9:invokestatic    #33  <Method void o.b(String, String)>
				return;
		//    5   12:return          
			}
			Object obj = ((Object) (otauiservicedata.getDataStates()));
		//    6   13:aload_1         
		//    7   14:invokevirtual   #39  <Method ArrayList OTAUIServiceData.getDataStates()>
		//    8   17:astore_2        
			String s = OtaMqttActivity.h();
		//    9   18:invokestatic    #25  <Method String OtaMqttActivity.h()>
		//   10   21:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//   11   22:new             #41  <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #42  <Method void StringBuilder()>
		//   14   29:astore          4
			stringbuilder.append("Change list: ");
		//   15   31:aload           4
		//   16   33:ldc1            #44  <String "Change list: ">
		//   17   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   18   38:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   19   39:aload           4
		//   20   41:aload_2         
		//   21   42:invokevirtual   #53  <Method String ArrayList.toString()>
		//   22   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   23   48:pop             
			o.a(s, stringbuilder.toString());
		//   24   49:aload_3         
		//   25   50:aload           4
		//   26   52:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   27   55:invokestatic    #56  <Method void o.a(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   28   58:aload_2         
		//   29   59:invokevirtual   #60  <Method Iterator ArrayList.iterator()>
		//   30   62:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   31   63:aload_2         
		//   32   64:invokeinterface #66  <Method boolean Iterator.hasNext()>
		//   33   69:ifeq            143
				OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
		//   34   72:aload_2         
		//   35   73:invokeinterface #70  <Method Object Iterator.next()>
		//   36   78:checkcast       #72  <Class OTAUIServiceDataState>
		//   37   81:astore_3        
				static class _cls5
				{

					static final int a[];
					static final int b[];
					static final int c[];

					static 
					{
						c = new int[LocalOtaError.values().length];
					//    0    0:invokestatic    #20  <Method LocalOtaError[] LocalOtaError.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #22  <Field int[] c>
						try
						{
							c[LocalOtaError.None.ordinal()] = 1;
					//    4    9:getstatic       #22  <Field int[] c>
					//    5   12:getstatic       #26  <Field LocalOtaError LocalOtaError.None>
					//    6   15:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #22  <Field int[] c>
					//*  10   23:getstatic       #33  <Field LocalOtaError LocalOtaError.NotLocallyConnected>
					//*  11   26:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #22  <Field int[] c>
					//*  15   34:getstatic       #36  <Field LocalOtaError LocalOtaError.NotARoomba>
					//*  16   37:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #22  <Field int[] c>
					//*  20   45:getstatic       #39  <Field LocalOtaError LocalOtaError.Not900Series>
					//*  21   48:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:getstatic       #22  <Field int[] c>
					//*  25   56:getstatic       #42  <Field LocalOtaError LocalOtaError.NotAWSEnabled>
					//*  26   59:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
					//*  27   62:iconst_5        
					//*  28   63:iastore         
					//*  29   64:getstatic       #22  <Field int[] c>
					//*  30   67:getstatic       #45  <Field LocalOtaError LocalOtaError.DownloadFailed>
					//*  31   70:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
					//*  32   73:bipush          6
					//*  33   75:iastore         
					//*  34   76:getstatic       #22  <Field int[] c>
					//*  35   79:getstatic       #48  <Field LocalOtaError LocalOtaError.PreparationTimeOut>
					//*  36   82:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
					//*  37   85:bipush          7
					//*  38   87:iastore         
					//*  39   88:getstatic       #22  <Field int[] c>
					//*  40   91:getstatic       #51  <Field LocalOtaError LocalOtaError.UpdateFailed>
					//*  41   94:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
					//*  42   97:bipush          8
					//*  43   99:iastore         
					//*  44  100:invokestatic    #56  <Method LocalOtaStatus[] LocalOtaStatus.values()>
					//*  45  103:arraylength     
					//*  46  104:newarray        int[]
					//*  47  106:putstatic       #58  <Field int[] b>
					//*  48  109:getstatic       #58  <Field int[] b>
					//*  49  112:getstatic       #62  <Field LocalOtaStatus LocalOtaStatus.CheckingForUpdate>
					//*  50  115:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
					//*  51  118:iconst_1        
					//*  52  119:iastore         
					//*  53  120:getstatic       #58  <Field int[] b>
					//*  54  123:getstatic       #66  <Field LocalOtaStatus LocalOtaStatus.UpdateUnavailable>
					//*  55  126:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
					//*  56  129:iconst_2        
					//*  57  130:iastore         
					//*  58  131:getstatic       #58  <Field int[] b>
					//*  59  134:getstatic       #69  <Field LocalOtaStatus LocalOtaStatus.UpdateAvailable>
					//*  60  137:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
					//*  61  140:iconst_3        
					//*  62  141:iastore         
					//*  63  142:getstatic       #58  <Field int[] b>
					//*  64  145:getstatic       #72  <Field LocalOtaStatus LocalOtaStatus.DownloadingUpdate>
					//*  65  148:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
					//*  66  151:iconst_4        
					//*  67  152:iastore         
					//*  68  153:getstatic       #58  <Field int[] b>
					//*  69  156:getstatic       #75  <Field LocalOtaStatus LocalOtaStatus.PreparingForUpdate>
					//*  70  159:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
					//*  71  162:iconst_5        
					//*  72  163:iastore         
					//*  73  164:getstatic       #58  <Field int[] b>
					//*  74  167:getstatic       #78  <Field LocalOtaStatus LocalOtaStatus.ReadyForUpdate>
					//*  75  170:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
					//*  76  173:bipush          6
					//*  77  175:iastore         
					//*  78  176:getstatic       #58  <Field int[] b>
					//*  79  179:getstatic       #81  <Field LocalOtaStatus LocalOtaStatus.SendingUpdate>
					//*  80  182:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
					//*  81  185:bipush          7
					//*  82  187:iastore         
					//*  83  188:getstatic       #58  <Field int[] b>
					//*  84  191:getstatic       #84  <Field LocalOtaStatus LocalOtaStatus.UpdateInstalling>
					//*  85  194:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
					//*  86  197:bipush          8
					//*  87  199:iastore         
					//*  88  200:getstatic       #58  <Field int[] b>
					//*  89  203:getstatic       #87  <Field LocalOtaStatus LocalOtaStatus.Error>
					//*  90  206:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
					//*  91  209:bipush          9
					//*  92  211:iastore         
					//*  93  212:invokestatic    #92  <Method OTAUIServiceDataState[] OTAUIServiceDataState.values()>
					//*  94  215:arraylength     
					//*  95  216:newarray        int[]
					//*  96  218:putstatic       #94  <Field int[] a>
					//*  97  221:getstatic       #94  <Field int[] a>
					//*  98  224:getstatic       #98  <Field OTAUIServiceDataState OTAUIServiceDataState.LocalOTAStatus>
					//*  99  227:invokevirtual   #99  <Method int OTAUIServiceDataState.ordinal()>
					//* 100  230:iconst_1        
					//* 101  231:iastore         
					//* 102  232:getstatic       #94  <Field int[] a>
					//* 103  235:getstatic       #102 <Field OTAUIServiceDataState OTAUIServiceDataState.LocalOTAError>
					//* 104  238:invokevirtual   #99  <Method int OTAUIServiceDataState.ordinal()>
					//* 105  241:iconst_2        
					//* 106  242:iastore         
					//* 107  243:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//  108  244:astore_0        
						try
						{
							c[LocalOtaError.NotLocallyConnected.ordinal()] = 2;
						}
					//* 109  245:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//  110  248:astore_0        
						try
						{
							c[LocalOtaError.NotARoomba.ordinal()] = 3;
						}
					//* 111  249:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//  112  252:astore_0        
						try
						{
							c[LocalOtaError.Not900Series.ordinal()] = 4;
						}
					//* 113  253:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//  114  256:astore_0        
						try
						{
							c[LocalOtaError.NotAWSEnabled.ordinal()] = 5;
						}
					//* 115  257:goto            53
						catch(NoSuchFieldError nosuchfielderror4) { }
					//  116  260:astore_0        
						try
						{
							c[LocalOtaError.DownloadFailed.ordinal()] = 6;
						}
					//* 117  261:goto            64
						catch(NoSuchFieldError nosuchfielderror5) { }
					//  118  264:astore_0        
						try
						{
							c[LocalOtaError.PreparationTimeOut.ordinal()] = 7;
						}
					//* 119  265:goto            76
						catch(NoSuchFieldError nosuchfielderror6) { }
					//  120  268:astore_0        
						try
						{
							c[LocalOtaError.UpdateFailed.ordinal()] = 8;
						}
					//* 121  269:goto            88
						catch(NoSuchFieldError nosuchfielderror7) { }
					//  122  272:astore_0        
						b = new int[LocalOtaStatus.values().length];
						try
						{
							b[LocalOtaStatus.CheckingForUpdate.ordinal()] = 1;
						}
					//* 123  273:goto            100
						catch(NoSuchFieldError nosuchfielderror8) { }
					//  124  276:astore_0        
						try
						{
							b[LocalOtaStatus.UpdateUnavailable.ordinal()] = 2;
						}
					//* 125  277:goto            120
						catch(NoSuchFieldError nosuchfielderror9) { }
					//  126  280:astore_0        
						try
						{
							b[LocalOtaStatus.UpdateAvailable.ordinal()] = 3;
						}
					//* 127  281:goto            131
						catch(NoSuchFieldError nosuchfielderror10) { }
					//  128  284:astore_0        
						try
						{
							b[LocalOtaStatus.DownloadingUpdate.ordinal()] = 4;
						}
					//* 129  285:goto            142
						catch(NoSuchFieldError nosuchfielderror11) { }
					//  130  288:astore_0        
						try
						{
							b[LocalOtaStatus.PreparingForUpdate.ordinal()] = 5;
						}
					//* 131  289:goto            153
						catch(NoSuchFieldError nosuchfielderror12) { }
					//  132  292:astore_0        
						try
						{
							b[LocalOtaStatus.ReadyForUpdate.ordinal()] = 6;
						}
					//* 133  293:goto            164
						catch(NoSuchFieldError nosuchfielderror13) { }
					//  134  296:astore_0        
						try
						{
							b[LocalOtaStatus.SendingUpdate.ordinal()] = 7;
						}
					//* 135  297:goto            176
						catch(NoSuchFieldError nosuchfielderror14) { }
					//  136  300:astore_0        
						try
						{
							b[LocalOtaStatus.UpdateInstalling.ordinal()] = 8;
						}
					//* 137  301:goto            188
						catch(NoSuchFieldError nosuchfielderror15) { }
					//  138  304:astore_0        
						try
						{
							b[LocalOtaStatus.Error.ordinal()] = 9;
						}
					//* 139  305:goto            200
						catch(NoSuchFieldError nosuchfielderror16) { }
					//  140  308:astore_0        
						a = new int[OTAUIServiceDataState.values().length];
						try
						{
							a[OTAUIServiceDataState.LocalOTAStatus.ordinal()] = 1;
						}
					//* 141  309:goto            212
						catch(NoSuchFieldError nosuchfielderror17) { }
					//  142  312:astore_0        
						try
						{
							a[OTAUIServiceDataState.LocalOTAError.ordinal()] = 2;
						}
					//* 143  313:goto            232
						catch(NoSuchFieldError nosuchfielderror18) { }
					//  144  316:astore_0        
					//* 145  317:return          
					}
				}

				switch(_cls5.a[otauiservicedatastate.ordinal()])
		//*  38   82:getstatic       #77  <Field int[] OtaMqttActivity$5.a>
		//*  39   85:aload_3         
		//*  40   86:invokevirtual   #81  <Method int OTAUIServiceDataState.ordinal()>
		//*  41   89:iaload          
				{
		//*  42   90:tableswitch     1 2: default 112
		//		               1 129
		//		               2 115
		//*  43  112:goto            63
				case 2: // '\002'
					OtaMqttActivity.a(a, otauiservicedata.getLocalOTAError());
		//   44  115:aload_0         
		//   45  116:getfield        #12  <Field OtaMqttActivity a>
		//   46  119:aload_1         
		//   47  120:invokevirtual   #85  <Method LocalOtaError OTAUIServiceData.getLocalOTAError()>
		//   48  123:invokestatic    #88  <Method void OtaMqttActivity.a(OtaMqttActivity, LocalOtaError)>
					break;

		//*  49  126:goto            63
				case 1: // '\001'
					OtaMqttActivity.a(a, otauiservicedata.getLocalOTAStatus());
		//   50  129:aload_0         
		//   51  130:getfield        #12  <Field OtaMqttActivity a>
		//   52  133:aload_1         
		//   53  134:invokevirtual   #92  <Method LocalOtaStatus OTAUIServiceData.getLocalOTAStatus()>
		//   54  137:invokestatic    #95  <Method void OtaMqttActivity.a(OtaMqttActivity, LocalOtaStatus)>
					break;
				}
			} while(true);
		//*  55  140:goto            63
		//   56  143:return          
		}

		final OtaMqttActivity a;

		private a()
		{
			a = OtaMqttActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field OtaMqttActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public OtaMqttActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void BaseFragmentActivity()>
	//    2    4:aload_0         
	//    3    5:iconst_5        
	//    4    6:putfield        #43  <Field int f>
		g = new a();
	//    5    9:aload_0         
	//    6   10:new             #16  <Class OtaMqttActivity$a>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:invokespecial   #46  <Method void OtaMqttActivity$a(OtaMqttActivity, OtaMqttActivity$1)>
	//   11   19:putfield        #48  <Field OtaMqttActivity$a g>
		i = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #50  <Field boolean i>
	//   15   27:return          
	}

	private void a(LocalOtaError localotaerror)
	{
label0:
		{
			String s = e;
	//    0    0:getstatic       #53  <Field String e>
	//    1    3:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #55  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #56  <Method void StringBuilder()>
	//    5   11:astore          4
			stringbuilder.append("LocalOtaError received: ");
	//    6   13:aload           4
	//    7   15:ldc1            #58  <String "LocalOtaError received: ">
	//    8   17:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(localotaerror.name());
	//   10   21:aload           4
	//   11   23:aload_1         
	//   12   24:invokevirtual   #68  <Method String LocalOtaError.name()>
	//   13   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			o.b(s, stringbuilder.toString());
	//   15   31:aload_3         
	//   16   32:aload           4
	//   17   34:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   18   37:invokestatic    #76  <Method void o.b(String, String)>
			int k;
			switch(_cls5.c[localotaerror.ordinal()])
	//*  19   40:getstatic       #79  <Field int[] OtaMqttActivity$5.c>
	//*  20   43:aload_1         
	//*  21   44:invokevirtual   #83  <Method int LocalOtaError.ordinal()>
	//*  22   47:iaload          
			{
	//*  23   48:tableswitch     1 8: default 96
	//	               1 141
	//	               2 133
	//	               3 127
	//	               4 121
	//	               5 115
	//	               6 109
	//	               7 103
	//	               8 97
			default:
				return;
	//   24   96:return          

			case 1: // '\001'
				break label0;

			case 8: // '\b'
				k = 0x7f0f0312;
	//   25   97:ldc1            #84  <Int 0x7f0f0312>
	//   26   99:istore_2        
				break;
	//   27  100:goto            136

			case 7: // '\007'
				k = 0x7f0f031b;
	//   28  103:ldc1            #85  <Int 0x7f0f031b>
	//   29  105:istore_2        
				break;
	//   30  106:goto            136

			case 6: // '\006'
				k = 0x7f0f030d;
	//   31  109:ldc1            #86  <Int 0x7f0f030d>
	//   32  111:istore_2        
				break;
	//   33  112:goto            136

			case 5: // '\005'
				k = 0x7f0f0318;
	//   34  115:ldc1            #87  <Int 0x7f0f0318>
	//   35  117:istore_2        
				break;
	//   36  118:goto            136

			case 4: // '\004'
				k = 0x7f0f0317;
	//   37  121:ldc1            #88  <Int 0x7f0f0317>
	//   38  123:istore_2        
				break;
	//   39  124:goto            136

			case 3: // '\003'
				k = 0x7f0f031a;
	//   40  127:ldc1            #89  <Int 0x7f0f031a>
	//   41  129:istore_2        
				break;
	//   42  130:goto            136

			case 2: // '\002'
				k = 0x7f0f0319;
	//   43  133:ldc1            #90  <Int 0x7f0f0319>
	//   44  135:istore_2        
				break;
			}
			f(k);
	//   45  136:aload_0         
	//   46  137:iload_2         
	//   47  138:invokevirtual   #93  <Method void f(int)>
		}
	//   48  141:return          
	}

	private void a(LocalOtaStatus localotastatus)
	{
label0:
		{
label1:
			{
label2:
				{
label3:
					{
label4:
						{
label5:
							{
								String s = e;
	//    0    0:getstatic       #53  <Field String e>
	//    1    3:astore_3        
								StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #55  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #56  <Method void StringBuilder()>
	//    5   11:astore          4
								stringbuilder.append("LocalOtaStatus received: ");
	//    6   13:aload           4
	//    7   15:ldc1            #96  <String "LocalOtaStatus received: ">
	//    8   17:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
								stringbuilder.append(localotastatus.name());
	//   10   21:aload           4
	//   11   23:aload_1         
	//   12   24:invokevirtual   #99  <Method String LocalOtaStatus.name()>
	//   13   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
								o.b(s, stringbuilder.toString());
	//   15   31:aload_3         
	//   16   32:aload           4
	//   17   34:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   18   37:invokestatic    #76  <Method void o.b(String, String)>
								if(isFinishing())
									break label0;
	//   19   40:aload_0         
	//   20   41:invokevirtual   #103 <Method boolean isFinishing()>
	//   21   44:ifne            242
								if(isDestroyed())
	//*  22   47:aload_0         
	//*  23   48:invokevirtual   #106 <Method boolean isDestroyed()>
	//*  24   51:ifeq            55
									return;
	//   25   54:return          
								int k;
								switch(_cls5.b[localotastatus.ordinal()])
	//*  26   55:getstatic       #108 <Field int[] OtaMqttActivity$5.b>
	//*  27   58:aload_1         
	//*  28   59:invokevirtual   #109 <Method int LocalOtaStatus.ordinal()>
	//*  29   62:iaload          
								{
	//*  30   63:tableswitch     1 9: default 112
	//	               1 231
	//	               2 210
	//	               3 198
	//	               4 180
	//	               5 170
	//	               6 165
	//	               7 155
	//	               8 128
	//	               9 113
								default:
									return;
	//   31  112:return          

								case 1: // '\001'
									break label1;

								case 2: // '\002'
									break label3;

								case 3: // '\003'
									break label5;

								case 9: // '\t'
									runOnUiThread(new Runnable() {

										public void run()
										{
											a.c.setProgress(0);
										//    0    0:aload_0         
										//    1    1:getfield        #16  <Field OtaMqttActivity a>
										//    2    4:getfield        #25  <Field ProgressBar OtaMqttActivity.c>
										//    3    7:iconst_0        
										//    4    8:invokevirtual   #31  <Method void ProgressBar.setProgress(int)>
										//    5   11:return          
										}

										final OtaMqttActivity a;

			
			{
				a = OtaMqttActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field OtaMqttActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
									}
);
	//   32  113:aload_0         
	//   33  114:new             #10  <Class OtaMqttActivity$3>
	//   34  117:dup             
	//   35  118:aload_0         
	//   36  119:invokespecial   #112 <Method void OtaMqttActivity$3(OtaMqttActivity)>
	//   37  122:invokevirtual   #116 <Method void runOnUiThread(Runnable)>
									break label4;
	//   38  125:goto            204

								case 8: // '\b'
									i = false;
	//   39  128:aload_0         
	//   40  129:iconst_0        
	//   41  130:putfield        #50  <Field boolean i>
									g();
	//   42  133:aload_0         
	//   43  134:invokevirtual   #118 <Method void g()>
									f(0x7f0f0313);
	//   44  137:aload_0         
	//   45  138:ldc1            #119 <Int 0x7f0f0313>
	//   46  140:invokevirtual   #93  <Method void f(int)>
									localotastatus = ((LocalOtaStatus) (new Runnable() {

										public void run()
										{
											a.d.setVisibility(8);
										//    0    0:aload_0         
										//    1    1:getfield        #16  <Field OtaMqttActivity a>
										//    2    4:getfield        #25  <Field ProgressBar OtaMqttActivity.d>
										//    3    7:bipush          8
										//    4    9:invokevirtual   #31  <Method void ProgressBar.setVisibility(int)>
										//    5   12:return          
										}

										final OtaMqttActivity a;

			
			{
				a = OtaMqttActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field OtaMqttActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
									}
));
	//   47  143:new             #8   <Class OtaMqttActivity$2>
	//   48  146:dup             
	//   49  147:aload_0         
	//   50  148:invokespecial   #120 <Method void OtaMqttActivity$2(OtaMqttActivity)>
	//   51  151:astore_1        
									break label2;
	//   52  152:goto            225

								case 7: // '\007'
									g();
	//   53  155:aload_0         
	//   54  156:invokevirtual   #118 <Method void g()>
									k = 0x7f0f031e;
	//   55  159:ldc1            #121 <Int 0x7f0f031e>
	//   56  161:istore_2        
									break;
	//   57  162:goto            192

								case 6: // '\006'
									g();
	//   58  165:aload_0         
	//   59  166:invokevirtual   #118 <Method void g()>
									return;
	//   60  169:return          

								case 5: // '\005'
									g();
	//   61  170:aload_0         
	//   62  171:invokevirtual   #118 <Method void g()>
									k = 0x7f0f031c;
	//   63  174:ldc1            #122 <Int 0x7f0f031c>
	//   64  176:istore_2        
									break;
	//   65  177:goto            192

								case 4: // '\004'
									i = true;
	//   66  180:aload_0         
	//   67  181:iconst_1        
	//   68  182:putfield        #50  <Field boolean i>
									g();
	//   69  185:aload_0         
	//   70  186:invokevirtual   #118 <Method void g()>
									k = 0x7f0f0311;
	//   71  189:ldc1            #123 <Int 0x7f0f0311>
	//   72  191:istore_2        
									break;
								}
								f(k);
	//   73  192:aload_0         
	//   74  193:iload_2         
	//   75  194:invokevirtual   #93  <Method void f(int)>
								return;
	//   76  197:return          
							}
							f(0x7f0f043a);
	//   77  198:aload_0         
	//   78  199:ldc1            #124 <Int 0x7f0f043a>
	//   79  201:invokevirtual   #93  <Method void f(int)>
						}
						a(true);
	//   80  204:aload_0         
	//   81  205:iconst_1        
	//   82  206:invokevirtual   #127 <Method void a(boolean)>
						return;
	//   83  209:return          
					}
					f(0x7f0f0316);
	//   84  210:aload_0         
	//   85  211:ldc1            #128 <Int 0x7f0f0316>
	//   86  213:invokevirtual   #93  <Method void f(int)>
					localotastatus = ((LocalOtaStatus) (new Runnable() {

						public void run()
						{
							a.b.setEnabled(false);
						//    0    0:aload_0         
						//    1    1:getfield        #16  <Field OtaMqttActivity a>
						//    2    4:getfield        #25  <Field CustomButton OtaMqttActivity.b>
						//    3    7:iconst_0        
						//    4    8:invokevirtual   #31  <Method void CustomButton.setEnabled(boolean)>
						//    5   11:return          
						}

						final OtaMqttActivity a;

			
			{
				a = OtaMqttActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field OtaMqttActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
));
	//   87  216:new             #6   <Class OtaMqttActivity$1>
	//   88  219:dup             
	//   89  220:aload_0         
	//   90  221:invokespecial   #129 <Method void OtaMqttActivity$1(OtaMqttActivity)>
	//   91  224:astore_1        
				}
				runOnUiThread(((Runnable) (localotastatus)));
	//   92  225:aload_0         
	//   93  226:aload_1         
	//   94  227:invokevirtual   #116 <Method void runOnUiThread(Runnable)>
				return;
	//   95  230:return          
			}
			f(0x7f0f030a);
	//   96  231:aload_0         
	//   97  232:ldc1            #130 <Int 0x7f0f030a>
	//   98  234:invokevirtual   #93  <Method void f(int)>
			a(false);
	//   99  237:aload_0         
	//  100  238:iconst_0        
	//  101  239:invokevirtual   #127 <Method void a(boolean)>
		}
	//  102  242:return          
	}

	static void a(OtaMqttActivity otamqttactivity, LocalOtaError localotaerror)
	{
		otamqttactivity.a(localotaerror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #133 <Method void a(LocalOtaError)>
	//    3    5:return          
	}

	static void a(OtaMqttActivity otamqttactivity, LocalOtaStatus localotastatus)
	{
		otamqttactivity.a(localotastatus);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #136 <Method void a(LocalOtaStatus)>
	//    3    5:return          
	}

	static String h()
	{
		return e;
	//    0    0:getstatic       #53  <Field String e>
	//    1    3:areturn         
	}

	protected void a(boolean flag)
	{
		ProgressBar progressbar = d;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field ProgressBar d>
	//    2    4:astore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            15
			byte0 = 8;
	//    5    9:bipush          8
	//    6   11:istore_2        
		else
	//*   7   12:goto            17
			byte0 = 0;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		progressbar.setVisibility(((int) (byte0)));
	//   10   17:aload_3         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #143 <Method void ProgressBar.setVisibility(int)>
		b.setEnabled(flag);
	//   13   22:aload_0         
	//   14   23:getfield        #145 <Field CustomButton b>
	//   15   26:iload_1         
	//   16   27:invokevirtual   #150 <Method void CustomButton.setEnabled(boolean)>
	//   17   30:return          
	}

	protected void e()
	{
		b(0x7f0f078a);
	//    0    0:aload_0         
	//    1    1:ldc1            #151 <Int 0x7f0f078a>
	//    2    3:invokevirtual   #153 <Method void b(int)>
		h = Assembler.getInstance().getUpdateUIService(j.k());
	//    3    6:aload_0         
	//    4    7:invokestatic    #159 <Method Assembler Assembler.getInstance()>
	//    5   10:invokestatic    #165 <Method com.irobot.core.AssetId j.k()>
	//    6   13:invokevirtual   #169 <Method UpdateUIService Assembler.getUpdateUIService(com.irobot.core.AssetId)>
	//    7   16:putfield        #171 <Field UpdateUIService h>
		f f1 = new f(getResources().getColor(0x7f060026), getResources().getColor(0x7f060025), 5);
	//    8   19:new             #173 <Class f>
	//    9   22:dup             
	//   10   23:aload_0         
	//   11   24:invokevirtual   #177 <Method Resources getResources()>
	//   12   27:ldc1            #178 <Int 0x7f060026>
	//   13   29:invokevirtual   #184 <Method int Resources.getColor(int)>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #177 <Method Resources getResources()>
	//   16   36:ldc1            #185 <Int 0x7f060025>
	//   17   38:invokevirtual   #184 <Method int Resources.getColor(int)>
	//   18   41:iconst_5        
	//   19   42:invokespecial   #188 <Method void f(int, int, int)>
	//   20   45:astore_1        
		c.setProgressDrawable(((android.graphics.drawable.Drawable) (f1)));
	//   21   46:aload_0         
	//   22   47:getfield        #190 <Field ProgressBar c>
	//   23   50:aload_1         
	//   24   51:invokevirtual   #194 <Method void ProgressBar.setProgressDrawable(android.graphics.drawable.Drawable)>
		c.setMax(5);
	//   25   54:aload_0         
	//   26   55:getfield        #190 <Field ProgressBar c>
	//   27   58:iconst_5        
	//   28   59:invokevirtual   #197 <Method void ProgressBar.setMax(int)>
		c.setProgress(0);
	//   29   62:aload_0         
	//   30   63:getfield        #190 <Field ProgressBar c>
	//   31   66:iconst_0        
	//   32   67:invokevirtual   #200 <Method void ProgressBar.setProgress(int)>
	//   33   70:return          
	}

	protected void f()
	{
		o.b(e, "Request MQTT local ota update");
	//    0    0:getstatic       #53  <Field String e>
	//    1    3:ldc1            #202 <String "Request MQTT local ota update">
	//    2    5:invokestatic    #76  <Method void o.b(String, String)>
		a(false);
	//    3    8:aload_0         
	//    4    9:iconst_0        
	//    5   10:invokevirtual   #127 <Method void a(boolean)>
		h.sendCommand(OTAUIServiceCommand.RequestLocalOTA, ((OTAUIServiceData) (null)));
	//    6   13:aload_0         
	//    7   14:getfield        #171 <Field UpdateUIService h>
	//    8   17:getstatic       #208 <Field OTAUIServiceCommand OTAUIServiceCommand.RequestLocalOTA>
	//    9   20:aconst_null     
	//   10   21:invokevirtual   #214 <Method void UpdateUIService.sendCommand(OTAUIServiceCommand, OTAUIServiceData)>
	//   11   24:return          
	}

	protected void f(int k)
	{
		a.setText(k);
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field CustomTextView a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #221 <Method void CustomTextView.setText(int)>
	//    4    8:return          
	}

	protected void g()
	{
		int k = c.getProgress();
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field ProgressBar c>
	//    2    4:invokevirtual   #224 <Method int ProgressBar.getProgress()>
	//    3    7:istore_1        
		if(k == 5)
	//*   4    8:iload_1         
	//*   5    9:iconst_5        
	//*   6   10:icmpne          14
		{
			return;
	//    7   13:return          
		} else
		{
			c.setProgress(k + 1);
	//    8   14:aload_0         
	//    9   15:getfield        #190 <Field ProgressBar c>
	//   10   18:iload_1         
	//   11   19:iconst_1        
	//   12   20:iadd            
	//   13   21:invokevirtual   #200 <Method void ProgressBar.setProgress(int)>
			return;
	//   14   24:return          
		}
	}

	public void onBackPressed()
	{
		if(i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean i>
	//*   2    4:ifeq            44
		{
			(new android.support.v7.app.a.a(((android.content.Context) (this)))).b(0x7f0f0315).a(0x7f0f0235, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int k)
				{
					a.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field OtaMqttActivity a>
				//    2    4:invokevirtual   #25  <Method void OtaMqttActivity.finish()>
				//    3    7:return          
				}

				final OtaMqttActivity a;

			
			{
				a = OtaMqttActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field OtaMqttActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).b(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).c();
	//    3    7:new             #227 <Class android.support.v7.app.a$a>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #230 <Method void android.support.v7.app.a$a(android.content.Context)>
	//    7   15:ldc1            #231 <Int 0x7f0f0315>
	//    8   17:invokevirtual   #234 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
	//    9   20:ldc1            #235 <Int 0x7f0f0235>
	//   10   22:new             #12  <Class OtaMqttActivity$4>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:invokespecial   #236 <Method void OtaMqttActivity$4(OtaMqttActivity)>
	//   14   30:invokevirtual   #239 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   15   33:ldc1            #240 <Int 0x7f0f017d>
	//   16   35:aconst_null     
	//   17   36:invokevirtual   #242 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int, android.content.DialogInterface$OnClickListener)>
	//   18   39:invokevirtual   #245 <Method android.support.v7.app.a android.support.v7.app.a$a.c()>
	//   19   42:pop             
			return;
	//   20   43:return          
		} else
		{
			super.onBackPressed();
	//   21   44:aload_0         
	//   22   45:invokespecial   #247 <Method void BaseFragmentActivity.onBackPressed()>
			return;
	//   23   48:return          
		}
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #250 <Method void BaseFragmentActivity.onStart()>
		h.registerUISubscriber(((OTAUIServiceDataCallback) (g)));
	//    2    4:aload_0         
	//    3    5:getfield        #171 <Field UpdateUIService h>
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field OtaMqttActivity$a g>
	//    6   12:invokevirtual   #254 <Method boolean UpdateUIService.registerUISubscriber(OTAUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #257 <Method void BaseFragmentActivity.onStop()>
		h.unregisterSubscriber(((OTAUIServiceDataCallback) (g)));
	//    2    4:aload_0         
	//    3    5:getfield        #171 <Field UpdateUIService h>
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field OtaMqttActivity$a g>
	//    6   12:invokevirtual   #260 <Method boolean UpdateUIService.unregisterSubscriber(OTAUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String e = "OtaMqttActivity";
	CustomTextView a;
	CustomButton b;
	ProgressBar c;
	ProgressBar d;
	private final int f = 5;
	private a g;
	private UpdateUIService h;
	private volatile boolean i;

	static 
	{
	//    0    0:return          
	}
}
