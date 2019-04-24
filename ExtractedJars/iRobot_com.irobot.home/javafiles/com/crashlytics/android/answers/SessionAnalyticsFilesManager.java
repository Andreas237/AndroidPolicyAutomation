// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import b.a.a.a.a.b.k;
import b.a.a.a.a.d.b;
import b.a.a.a.a.d.c;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionEventTransform

class SessionAnalyticsFilesManager extends b
{

	SessionAnalyticsFilesManager(Context context, SessionEventTransform sessioneventtransform, k k1, c c)
	{
		super(context, ((b.a.a.a.a.d.a) (sessioneventtransform)), k1, c, 100);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:bipush          100
	//    6    8:invokespecial   #19  <Method void b(Context, b.a.a.a.a.d.a, k, c, int)>
	//    7   11:return          
	}

	protected String generateUniqueRollOverFileName()
	{
		UUID uuid = UUID.randomUUID();
	//    0    0:invokestatic    #28  <Method UUID UUID.randomUUID()>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #30  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #33  <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("sa");
	//    6   12:aload_2         
	//    7   13:ldc1            #12  <String "sa">
	//    8   15:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append("_");
	//   10   19:aload_2         
	//   11   20:ldc1            #39  <String "_">
	//   12   22:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(uuid.toString());
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #42  <Method String UUID.toString()>
	//   17   31:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append("_");
	//   19   35:aload_2         
	//   20   36:ldc1            #39  <String "_">
	//   21   38:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		stringbuilder.append(currentTimeProvider.a());
	//   23   42:aload_2         
	//   24   43:aload_0         
	//   25   44:getfield        #46  <Field k currentTimeProvider>
	//   26   47:invokeinterface #52  <Method long k.a()>
	//   27   52:invokevirtual   #55  <Method StringBuilder StringBuilder.append(long)>
	//   28   55:pop             
		stringbuilder.append(".tap");
	//   29   56:aload_2         
	//   30   57:ldc1            #9   <String ".tap">
	//   31   59:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
		return stringbuilder.toString();
	//   33   63:aload_2         
	//   34   64:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   35   67:areturn         
	}

	protected int getMaxByteSizePerFile()
	{
		if(analyticsSettingsData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field b.a.a.a.a.g.b analyticsSettingsData>
	//*   2    4:ifnonnull       12
			return super.getMaxByteSizePerFile();
	//    3    7:aload_0         
	//    4    8:invokespecial   #62  <Method int b.getMaxByteSizePerFile()>
	//    5   11:ireturn         
		else
			return analyticsSettingsData.c;
	//    6   12:aload_0         
	//    7   13:getfield        #60  <Field b.a.a.a.a.g.b analyticsSettingsData>
	//    8   16:getfield        #68  <Field int b.a.a.a.a.g.b.c>
	//    9   19:ireturn         
	}

	protected int getMaxFilesToKeep()
	{
		if(analyticsSettingsData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field b.a.a.a.a.g.b analyticsSettingsData>
	//*   2    4:ifnonnull       12
			return super.getMaxFilesToKeep();
	//    3    7:aload_0         
	//    4    8:invokespecial   #71  <Method int b.getMaxFilesToKeep()>
	//    5   11:ireturn         
		else
			return analyticsSettingsData.e;
	//    6   12:aload_0         
	//    7   13:getfield        #60  <Field b.a.a.a.a.g.b analyticsSettingsData>
	//    8   16:getfield        #74  <Field int b.a.a.a.a.g.b.e>
	//    9   19:ireturn         
	}

	void setAnalyticsSettingsData(b.a.a.a.a.g.b b1)
	{
		analyticsSettingsData = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field b.a.a.a.a.g.b analyticsSettingsData>
	//    3    5:return          
	}

	private static final String SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION = ".tap";
	private static final String SESSION_ANALYTICS_TO_SEND_FILE_PREFIX = "sa";
	private b.a.a.a.a.g.b analyticsSettingsData;
}
