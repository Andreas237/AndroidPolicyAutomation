// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CreateReportSpiCall, CreateReportRequest, Report, NativeCreateReportSpiCall, 
//			DefaultCreateReportSpiCall

class CompositeCreateReportSpiCall
	implements CreateReportSpiCall
{

	public CompositeCreateReportSpiCall(DefaultCreateReportSpiCall defaultcreatereportspicall, NativeCreateReportSpiCall nativecreatereportspicall)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		javaReportSpiCall = defaultcreatereportspicall;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field DefaultCreateReportSpiCall javaReportSpiCall>
		nativeReportSpiCall = nativecreatereportspicall;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field NativeCreateReportSpiCall nativeReportSpiCall>
	//    8   14:return          
	}

	public boolean invoke(CreateReportRequest createreportrequest)
	{
		static class _cls1
		{

			static final int $SwitchMap$com$crashlytics$android$core$Report$Type[];

			static 
			{
				$SwitchMap$com$crashlytics$android$core$Report$Type = new int[Report.Type.values().length];
			//    0    0:invokestatic    #18  <Method Report$Type[] Report$Type.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$crashlytics$android$core$Report$Type>
				try
				{
					$SwitchMap$com$crashlytics$android$core$Report$Type[Report.Type.JAVA.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$crashlytics$android$core$Report$Type>
			//    5   12:getstatic       #24  <Field Report$Type Report$Type.JAVA>
			//    6   15:invokevirtual   #28  <Method int Report$Type.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$crashlytics$android$core$Report$Type>
			//*  10   23:getstatic       #31  <Field Report$Type Report$Type.NATIVE>
			//*  11   26:invokevirtual   #28  <Method int Report$Type.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					$SwitchMap$com$crashlytics$android$core$Report$Type[Report.Type.NATIVE.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls1..SwitchMap.com.crashlytics.android.core.Report.Type[createreportrequest.report.getType().ordinal()])
	//*   0    0:getstatic       #28  <Field int[] CompositeCreateReportSpiCall$1.$SwitchMap$com$crashlytics$android$core$Report$Type>
	//*   1    3:aload_1         
	//*   2    4:getfield        #34  <Field Report CreateReportRequest.report>
	//*   3    7:invokeinterface #40  <Method Report$Type Report.getType()>
	//*   4   12:invokevirtual   #46  <Method int Report$Type.ordinal()>
	//*   5   15:iaload          
		{
	//*   6   16:tableswitch     1 2: default 40
	//	               1 53
	//	               2 42
		default:
			return false;
	//    7   40:iconst_0        
	//    8   41:ireturn         

		case 2: // '\002'
			nativeReportSpiCall.invoke(createreportrequest);
	//    9   42:aload_0         
	//   10   43:getfield        #21  <Field NativeCreateReportSpiCall nativeReportSpiCall>
	//   11   46:aload_1         
	//   12   47:invokevirtual   #50  <Method boolean NativeCreateReportSpiCall.invoke(CreateReportRequest)>
	//   13   50:pop             
			return true;
	//   14   51:iconst_1        
	//   15   52:ireturn         

		case 1: // '\001'
			javaReportSpiCall.invoke(createreportrequest);
	//   16   53:aload_0         
	//   17   54:getfield        #19  <Field DefaultCreateReportSpiCall javaReportSpiCall>
	//   18   57:aload_1         
	//   19   58:invokevirtual   #53  <Method boolean DefaultCreateReportSpiCall.invoke(CreateReportRequest)>
	//   20   61:pop             
			return true;
	//   21   62:iconst_1        
	//   22   63:ireturn         
		}
	}

	private final DefaultCreateReportSpiCall javaReportSpiCall;
	private final NativeCreateReportSpiCall nativeReportSpiCall;
}
