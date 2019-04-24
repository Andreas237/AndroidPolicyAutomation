// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.startapp.common.a.c;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			BaseRequest

static class BaseRequest$a
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore_3        
		if(a != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field ScanResult a>
	//*   6   12:ifnull          135
		{
			stringbuilder.append(a.SSID).append(',');
	//    7   15:aload_3         
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field ScanResult a>
	//   10   20:getfield        #27  <Field String ScanResult.SSID>
	//   11   23:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:bipush          44
	//   13   28:invokevirtual   #34  <Method StringBuilder StringBuilder.append(char)>
	//   14   31:pop             
			stringbuilder.append(a.BSSID).append(',');
	//   15   32:aload_3         
	//   16   33:aload_0         
	//   17   34:getfield        #15  <Field ScanResult a>
	//   18   37:getfield        #37  <Field String ScanResult.BSSID>
	//   19   40:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:bipush          44
	//   21   45:invokevirtual   #34  <Method StringBuilder StringBuilder.append(char)>
	//   22   48:pop             
			stringbuilder.append(WifiManager.calculateSignalLevel(a.level, 5)).append(',');
	//   23   49:aload_3         
	//   24   50:aload_0         
	//   25   51:getfield        #15  <Field ScanResult a>
	//   26   54:getfield        #41  <Field int ScanResult.level>
	//   27   57:iconst_5        
	//   28   58:invokestatic    #47  <Method int WifiManager.calculateSignalLevel(int, int)>
	//   29   61:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   30   64:bipush          44
	//   31   66:invokevirtual   #34  <Method StringBuilder StringBuilder.append(char)>
	//   32   69:pop             
			stringbuilder.append(a.level).append(',');
	//   33   70:aload_3         
	//   34   71:aload_0         
	//   35   72:getfield        #15  <Field ScanResult a>
	//   36   75:getfield        #41  <Field int ScanResult.level>
	//   37   78:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   38   81:bipush          44
	//   39   83:invokevirtual   #34  <Method StringBuilder StringBuilder.append(char)>
	//   40   86:pop             
			long l = c.a(a);
	//   41   87:aload_0         
	//   42   88:getfield        #15  <Field ScanResult a>
	//   43   91:invokestatic    #55  <Method long c.a(ScanResult)>
	//   44   94:lstore_1        
			if(l != 0L)
	//*  45   95:lload_1         
	//*  46   96:lconst_0        
	//*  47   97:lcmp            
	//*  48   98:ifeq            107
				stringbuilder.append(l);
	//   49  101:aload_3         
	//   50  102:lload_1         
	//   51  103:invokevirtual   #58  <Method StringBuilder StringBuilder.append(long)>
	//   52  106:pop             
			stringbuilder.append(',');
	//   53  107:aload_3         
	//   54  108:bipush          44
	//   55  110:invokevirtual   #34  <Method StringBuilder StringBuilder.append(char)>
	//   56  113:pop             
			CharSequence charsequence = c.b(a);
	//   57  114:aload_0         
	//   58  115:getfield        #15  <Field ScanResult a>
	//   59  118:invokestatic    #62  <Method CharSequence c.b(ScanResult)>
	//   60  121:astore          4
			if(charsequence != null)
	//*  61  123:aload           4
	//*  62  125:ifnull          135
				stringbuilder.append(charsequence);
	//   63  128:aload_3         
	//   64  129:aload           4
	//   65  131:invokevirtual   #65  <Method StringBuilder StringBuilder.append(CharSequence)>
	//   66  134:pop             
		}
		return stringbuilder.toString();
	//   67  135:aload_3         
	//   68  136:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   69  139:areturn         
	}

	private ScanResult a;

	public BaseRequest$a(ScanResult scanresult)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = scanresult;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ScanResult a>
	//    5    9:return          
	}
}
