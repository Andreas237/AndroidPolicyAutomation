// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import com.appboy.configuration.CachedConfigurationProvider;

public class m extends CachedConfigurationProvider
{

	public m(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void CachedConfigurationProvider(Context)>
	//    3    5:return          
	}

	public long a()
	{
		return (long)(getIntValue("com_appboy_data_flush_interval_bad_network", 60) * 1000);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "com_appboy_data_flush_interval_bad_network">
	//    2    3:bipush          60
	//    3    5:invokevirtual   #17  <Method int getIntValue(String, int)>
	//    4    8:sipush          1000
	//    5   11:imul            
	//    6   12:i2l             
	//    7   13:lreturn         
	}

	public long b()
	{
		return (long)(getIntValue("com_appboy_data_flush_interval_good_network", 30) * 1000);
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "com_appboy_data_flush_interval_good_network">
	//    2    3:bipush          30
	//    3    5:invokevirtual   #17  <Method int getIntValue(String, int)>
	//    4    8:sipush          1000
	//    5   11:imul            
	//    6   12:i2l             
	//    7   13:lreturn         
	}

	public long c()
	{
		return (long)(getIntValue("com_appboy_data_flush_interval_great_network", 10) * 1000);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "com_appboy_data_flush_interval_great_network">
	//    2    3:bipush          10
	//    3    5:invokevirtual   #17  <Method int getIntValue(String, int)>
	//    4    8:sipush          1000
	//    5   11:imul            
	//    6   12:i2l             
	//    7   13:lreturn         
	}
}
