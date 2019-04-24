// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.i.a;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class AboutRobotSettingsPresenter
{
	public static interface a
	{

		public abstract void a(String s);

		public abstract void b(String s);

		public abstract void c(String s);
	}


	public AboutRobotSettingsPresenter(a a1, AssetId assetid, Assembler assembler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = a1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field AboutRobotSettingsPresenter$a a>
		b = assembler.getAssetStatusSubsystem(assetid);
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #25  <Method AssetStatusSubsystem Assembler.getAssetStatusSubsystem(AssetId)>
	//    9   15:putfield        #27  <Field AssetStatusSubsystem b>
		c = (com.irobot.home.i.a)assembler.getDomainEventBus();
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #31  <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   13   23:checkcast       #33  <Class a>
	//   14   26:putfield        #35  <Field a c>
		a();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #37  <Method void a()>
	//   17   33:return          
	}

	public void a()
	{
		c.a(((Object) (this)), EventType.AssetSoftwareVersionEvent);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field a c>
	//    2    4:aload_0         
	//    3    5:getstatic       #44  <Field EventType EventType.AssetSoftwareVersionEvent>
	//    4    8:invokevirtual   #47  <Method void a.a(Object, EventType)>
		b.queryAssetStatus(AssetStatusType.SoftwareVersion);
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field AssetStatusSubsystem b>
	//    7   15:getstatic       #53  <Field AssetStatusType AssetStatusType.SoftwareVersion>
	//    8   18:invokevirtual   #59  <Method void AssetStatusSubsystem.queryAssetStatus(AssetStatusType)>
		c.a(((Object) (this)), EventType.AssetSoftwareLastUpdatedEvent);
	//    9   21:aload_0         
	//   10   22:getfield        #35  <Field a c>
	//   11   25:aload_0         
	//   12   26:getstatic       #62  <Field EventType EventType.AssetSoftwareLastUpdatedEvent>
	//   13   29:invokevirtual   #47  <Method void a.a(Object, EventType)>
		b.queryAssetStatus(AssetStatusType.SoftwareVersionUpdateDate);
	//   14   32:aload_0         
	//   15   33:getfield        #27  <Field AssetStatusSubsystem b>
	//   16   36:getstatic       #65  <Field AssetStatusType AssetStatusType.SoftwareVersionUpdateDate>
	//   17   39:invokevirtual   #59  <Method void AssetStatusSubsystem.queryAssetStatus(AssetStatusType)>
		c.a(((Object) (this)), EventType.AssetRegistrationDateEvent);
	//   18   42:aload_0         
	//   19   43:getfield        #35  <Field a c>
	//   20   46:aload_0         
	//   21   47:getstatic       #68  <Field EventType EventType.AssetRegistrationDateEvent>
	//   22   50:invokevirtual   #47  <Method void a.a(Object, EventType)>
		b.queryAssetStatus(AssetStatusType.RegistrationDate);
	//   23   53:aload_0         
	//   24   54:getfield        #27  <Field AssetStatusSubsystem b>
	//   25   57:getstatic       #71  <Field AssetStatusType AssetStatusType.RegistrationDate>
	//   26   60:invokevirtual   #59  <Method void AssetStatusSubsystem.queryAssetStatus(AssetStatusType)>
	//   27   63:return          
	}

	public void b()
	{
		c.a(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field a c>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #74  <Method void a.a(Object)>
	//    4    8:return          
	}

	public void onAssetRegistrationDateEvent(AssetRegistrationDateEvent assetregistrationdateevent)
	{
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd");
	//    0    0:new             #79  <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc1            #81  <String "yyyy-MM-dd">
	//    3    6:invokespecial   #84  <Method void SimpleDateFormat(String)>
	//    4    9:astore_2        
		simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
	//    5   10:aload_2         
	//    6   11:ldc1            #86  <String "UTC">
	//    7   13:invokestatic    #92  <Method TimeZone TimeZone.getTimeZone(String)>
	//    8   16:invokevirtual   #96  <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		assetregistrationdateevent = ((AssetRegistrationDateEvent) (simpledateformat.format(assetregistrationdateevent.registrationDate())));
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #102 <Method java.util.Date AssetRegistrationDateEvent.registrationDate()>
	//   12   24:invokevirtual   #106 <Method String SimpleDateFormat.format(java.util.Date)>
	//   13   27:astore_1        
		c.b(((Object) (this)), EventType.AssetRegistrationDateEvent);
	//   14   28:aload_0         
	//   15   29:getfield        #35  <Field a c>
	//   16   32:aload_0         
	//   17   33:getstatic       #68  <Field EventType EventType.AssetRegistrationDateEvent>
	//   18   36:invokevirtual   #108 <Method void a.b(Object, EventType)>
		a.c(((String) (assetregistrationdateevent)));
	//   19   39:aload_0         
	//   20   40:getfield        #19  <Field AboutRobotSettingsPresenter$a a>
	//   21   43:aload_1         
	//   22   44:invokeinterface #110 <Method void AboutRobotSettingsPresenter$a.c(String)>
	//   23   49:return          
	}

	public void onAssetSoftwareLastUpdatedEvent(AssetSoftwareLastUpdatedEvent assetsoftwarelastupdatedevent)
	{
		assetsoftwarelastupdatedevent = ((AssetSoftwareLastUpdatedEvent) ((new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ")).format(assetsoftwarelastupdatedevent.lastUpdateTime())));
	//    0    0:new             #79  <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc1            #115 <String "yyyy-MM-dd HH:mm:ssZ">
	//    3    6:invokespecial   #84  <Method void SimpleDateFormat(String)>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #120 <Method java.util.Date AssetSoftwareLastUpdatedEvent.lastUpdateTime()>
	//    6   13:invokevirtual   #106 <Method String SimpleDateFormat.format(java.util.Date)>
	//    7   16:astore_1        
		c.b(((Object) (this)), EventType.AssetSoftwareLastUpdatedEvent);
	//    8   17:aload_0         
	//    9   18:getfield        #35  <Field a c>
	//   10   21:aload_0         
	//   11   22:getstatic       #62  <Field EventType EventType.AssetSoftwareLastUpdatedEvent>
	//   12   25:invokevirtual   #108 <Method void a.b(Object, EventType)>
		a.b(((String) (assetsoftwarelastupdatedevent)));
	//   13   28:aload_0         
	//   14   29:getfield        #19  <Field AboutRobotSettingsPresenter$a a>
	//   15   32:aload_1         
	//   16   33:invokeinterface #122 <Method void AboutRobotSettingsPresenter$a.b(String)>
	//   17   38:return          
	}

	public void onAssetSoftwareVersionEvent(AssetSoftwareVersionEvent assetsoftwareversionevent)
	{
		assetsoftwareversionevent = ((AssetSoftwareVersionEvent) (assetsoftwareversionevent.softwareVersion()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #130 <Method String AssetSoftwareVersionEvent.softwareVersion()>
	//    2    4:astore_1        
		c.b(((Object) (this)), EventType.AssetSoftwareVersionEvent);
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field a c>
	//    5    9:aload_0         
	//    6   10:getstatic       #44  <Field EventType EventType.AssetSoftwareVersionEvent>
	//    7   13:invokevirtual   #108 <Method void a.b(Object, EventType)>
		assetsoftwareversionevent = ((AssetSoftwareVersionEvent) (SoftwareVersion.create(((String) (assetsoftwareversionevent)))));
	//    8   16:aload_1         
	//    9   17:invokestatic    #136 <Method SoftwareVersion SoftwareVersion.create(String)>
	//   10   20:astore_1        
		a.a(((SoftwareVersion) (assetsoftwareversionevent)).toString());
	//   11   21:aload_0         
	//   12   22:getfield        #19  <Field AboutRobotSettingsPresenter$a a>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #139 <Method String SoftwareVersion.toString()>
	//   15   29:invokeinterface #141 <Method void com.irobot.home.AboutRobotSettingsPresenter$a.a(String)>
	//   16   34:return          
	}

	private final a a;
	private final AssetStatusSubsystem b;
	private final com.irobot.home.i.a c;
}
