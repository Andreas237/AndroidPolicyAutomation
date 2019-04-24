// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.core;

import cn.com.fmsh.util.FM_Bytes;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package cn.com.fmsh.tsm.business.core:
//			ConfigKey

public class ConfigKeyManager
{

	public ConfigKeyManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		configKeys = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void HashMap()>
	//    6   12:putfield        #16  <Field Map configKeys>
		configKeyInit();
	//    7   15:aload_0         
	//    8   16:invokespecial   #19  <Method void configKeyInit()>
	//    9   19:return          
	}

	private void configKeyInit()
	{
		ConfigKey configkey = new ConfigKey();
	//    0    0:new             #22  <Class ConfigKey>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ConfigKey()>
	//    3    7:astore_1        
		configkey.setIndex(0);
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #27  <Method void ConfigKey.setIndex(int)>
		configkey.setPrivateKey(FM_Bytes.hexStringToBytes("2DE56012F864F1B8B42E103B3D16028FF9D7D9FDF31EC9DC9F2AD22BFF9A7E754BC96BDEE6BA227FCE2AEF77AA3AE6028DD9CA6F7E4107950F9B28ADF4BC5AE4E7AE4194DA3B580D9C37E8B61F5E8EF5A33ABC6931E10A8C856163471123DBCC9DC972793D9A35A0E5D5248B56C27DD6BA04101B428F5557C9750A9A71CFA419"));
	//    7   13:aload_1         
	//    8   14:ldc1            #29  <String "2DE56012F864F1B8B42E103B3D16028FF9D7D9FDF31EC9DC9F2AD22BFF9A7E754BC96BDEE6BA227FCE2AEF77AA3AE6028DD9CA6F7E4107950F9B28ADF4BC5AE4E7AE4194DA3B580D9C37E8B61F5E8EF5A33ABC6931E10A8C856163471123DBCC9DC972793D9A35A0E5D5248B56C27DD6BA04101B428F5557C9750A9A71CFA419">
	//    9   16:invokestatic    #35  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//   10   19:invokevirtual   #39  <Method void ConfigKey.setPrivateKey(byte[])>
		configkey.setPublicKey(FM_Bytes.hexStringToBytes("D46057338A825C64F776DA312702CB997C02E399A44CA8295FF396A2D1648DC752053C52AFE41D2C223F79471EE69BCC84E545984BECF21A0CC3DE6670A69332DF2F6E13FFBCB649A3D3F68E7B1FC69462E14AC1D4929B459E00C06B11C2F8FFEA2594FE6B9FC5D3174F8F834F78055FC479E09DCA387739EC597BC3BA24B3F7"));
	//   11   22:aload_1         
	//   12   23:ldc1            #41  <String "D46057338A825C64F776DA312702CB997C02E399A44CA8295FF396A2D1648DC752053C52AFE41D2C223F79471EE69BCC84E545984BECF21A0CC3DE6670A69332DF2F6E13FFBCB649A3D3F68E7B1FC69462E14AC1D4929B459E00C06B11C2F8FFEA2594FE6B9FC5D3174F8F834F78055FC479E09DCA387739EC597BC3BA24B3F7">
	//   13   25:invokestatic    #35  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//   14   28:invokevirtual   #44  <Method void ConfigKey.setPublicKey(byte[])>
		configKeys.put(((Object) (Integer.valueOf(configkey.getIndex()))), ((Object) (configkey)));
	//   15   31:aload_0         
	//   16   32:getfield        #16  <Field Map configKeys>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #48  <Method int ConfigKey.getIndex()>
	//   19   39:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   20   42:aload_1         
	//   21   43:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   22   48:pop             
		configkey = new ConfigKey();
	//   23   49:new             #22  <Class ConfigKey>
	//   24   52:dup             
	//   25   53:invokespecial   #23  <Method void ConfigKey()>
	//   26   56:astore_1        
		configkey.setIndex(1);
	//   27   57:aload_1         
	//   28   58:iconst_1        
	//   29   59:invokevirtual   #27  <Method void ConfigKey.setIndex(int)>
		configkey.setPrivateKey(FM_Bytes.hexStringToBytes("044F572C205CC9691730424921D6B6827405E0A70D281E61AE536722D3E56A59E89BF896BDB125516B60B328AE04650E8E6D33961EC4DBF1D58B887516555396BD9108E783D2B8FDC52E77B88DAA6A90DD54C4CB822233E3956018DB5A3DA50CAE4D8BA2B5D34F756238F80266DCD97C9505CD0A40B04BF1C82A501057798CA1"));
	//   30   62:aload_1         
	//   31   63:ldc1            #62  <String "044F572C205CC9691730424921D6B6827405E0A70D281E61AE536722D3E56A59E89BF896BDB125516B60B328AE04650E8E6D33961EC4DBF1D58B887516555396BD9108E783D2B8FDC52E77B88DAA6A90DD54C4CB822233E3956018DB5A3DA50CAE4D8BA2B5D34F756238F80266DCD97C9505CD0A40B04BF1C82A501057798CA1">
	//   32   65:invokestatic    #35  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//   33   68:invokevirtual   #39  <Method void ConfigKey.setPrivateKey(byte[])>
		configkey.setPublicKey(FM_Bytes.hexStringToBytes("A19710531E029A57F5A72C23C0B5A720973022B2F00FBFD2FEFCB2FFDBB71A43375776253D7E63F6BA9944BDF9B6A349BC989B24145A9CCE6C9355089C2DF9927469E45FD678328E7E28C69D60EC176166E1B00537EF5BF6A183C7C771F3FB8E86B51E97484E271C58DE079B7409CA81ED1BA54D367EF5DE94AB2F292ACCD253"));
	//   34   71:aload_1         
	//   35   72:ldc1            #64  <String "A19710531E029A57F5A72C23C0B5A720973022B2F00FBFD2FEFCB2FFDBB71A43375776253D7E63F6BA9944BDF9B6A349BC989B24145A9CCE6C9355089C2DF9927469E45FD678328E7E28C69D60EC176166E1B00537EF5BF6A183C7C771F3FB8E86B51E97484E271C58DE079B7409CA81ED1BA54D367EF5DE94AB2F292ACCD253">
	//   36   74:invokestatic    #35  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//   37   77:invokevirtual   #44  <Method void ConfigKey.setPublicKey(byte[])>
		configKeys.put(((Object) (Integer.valueOf(configkey.getIndex()))), ((Object) (configkey)));
	//   38   80:aload_0         
	//   39   81:getfield        #16  <Field Map configKeys>
	//   40   84:aload_1         
	//   41   85:invokevirtual   #48  <Method int ConfigKey.getIndex()>
	//   42   88:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   43   91:aload_1         
	//   44   92:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   45   97:pop             
		configkey = new ConfigKey();
	//   46   98:new             #22  <Class ConfigKey>
	//   47  101:dup             
	//   48  102:invokespecial   #23  <Method void ConfigKey()>
	//   49  105:astore_1        
		configkey.setIndex(2);
	//   50  106:aload_1         
	//   51  107:iconst_2        
	//   52  108:invokevirtual   #27  <Method void ConfigKey.setIndex(int)>
		configkey.setPrivateKey(FM_Bytes.hexStringToBytes("64F8F48EA05E3A82A7BBE57546971F8756C4E9E19E766A66141AC28D7FED1BD6789EA0F14B1854BEEFCD003FC2E204ACA7D1891BBA0292F69AB3EE12DD872B877770915910B977C57020442B840AFAAC5F5052679809621BA32CB15E53FA9B0A8605CF3DC07EA8686481CD9148847B5EC523433A69942535EDB5DD2F6109A419"));
	//   53  111:aload_1         
	//   54  112:ldc1            #66  <String "64F8F48EA05E3A82A7BBE57546971F8756C4E9E19E766A66141AC28D7FED1BD6789EA0F14B1854BEEFCD003FC2E204ACA7D1891BBA0292F69AB3EE12DD872B877770915910B977C57020442B840AFAAC5F5052679809621BA32CB15E53FA9B0A8605CF3DC07EA8686481CD9148847B5EC523433A69942535EDB5DD2F6109A419">
	//   55  114:invokestatic    #35  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//   56  117:invokevirtual   #39  <Method void ConfigKey.setPrivateKey(byte[])>
		configkey.setPublicKey(FM_Bytes.hexStringToBytes("DCEB7C0A17BB72AF041B649A01D974E29190A99DFE0D3CBC36C5D24BBE1CB6C9A1A81F2D3EC307421A528F1BAA7B8263E51D527BE1B2681B0E1F8F61C0314E0F0BC64E593120486BDE92C18F5A98047D661318138E053857E8C9D52791845B2C084EBEA48DB82DFC75699EFDC78355BB56BFD33CC58B03902EED1D3905513A25"));
	//   57  120:aload_1         
	//   58  121:ldc1            #68  <String "DCEB7C0A17BB72AF041B649A01D974E29190A99DFE0D3CBC36C5D24BBE1CB6C9A1A81F2D3EC307421A528F1BAA7B8263E51D527BE1B2681B0E1F8F61C0314E0F0BC64E593120486BDE92C18F5A98047D661318138E053857E8C9D52791845B2C084EBEA48DB82DFC75699EFDC78355BB56BFD33CC58B03902EED1D3905513A25">
	//   59  123:invokestatic    #35  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//   60  126:invokevirtual   #44  <Method void ConfigKey.setPublicKey(byte[])>
		configKeys.put(((Object) (Integer.valueOf(configkey.getIndex()))), ((Object) (configkey)));
	//   61  129:aload_0         
	//   62  130:getfield        #16  <Field Map configKeys>
	//   63  133:aload_1         
	//   64  134:invokevirtual   #48  <Method int ConfigKey.getIndex()>
	//   65  137:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   66  140:aload_1         
	//   67  141:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   68  146:pop             
	//   69  147:return          
	}

	public ConfigKey getConfigKey(int i)
	{
		return (ConfigKey)configKeys.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Map configKeys>
	//    2    4:iload_1         
	//    3    5:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #74  <Method Object Map.get(Object)>
	//    5   13:checkcast       #22  <Class ConfigKey>
	//    6   16:areturn         
	}

	private Map configKeys;
}
