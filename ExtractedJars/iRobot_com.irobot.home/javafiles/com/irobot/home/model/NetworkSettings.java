// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.*;
import com.irobot.home.util.j;
import java.util.*;

// Referenced classes of package com.irobot.home.model:
//			ac, y, h, z

public class NetworkSettings
	implements Parcelable
{

	public NetworkSettings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #292 <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc2            #294 <String "">
	//    4    8:putfield        #296 <Field String a>
		d = "";
	//    5   11:aload_0         
	//    6   12:ldc2            #294 <String "">
	//    7   15:putfield        #298 <Field String d>
		f = "";
	//    8   18:aload_0         
	//    9   19:ldc2            #294 <String "">
	//   10   22:putfield        #300 <Field String f>
		l = "";
	//   11   25:aload_0         
	//   12   26:ldc2            #294 <String "">
	//   13   29:putfield        #302 <Field String l>
		q = "";
	//   14   32:aload_0         
	//   15   33:ldc2            #294 <String "">
	//   16   36:putfield        #304 <Field String q>
	//   17   39:return          
	}

	public NetworkSettings(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #292 <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc2            #294 <String "">
	//    4    8:putfield        #296 <Field String a>
		d = "";
	//    5   11:aload_0         
	//    6   12:ldc2            #294 <String "">
	//    7   15:putfield        #298 <Field String d>
		f = "";
	//    8   18:aload_0         
	//    9   19:ldc2            #294 <String "">
	//   10   22:putfield        #300 <Field String f>
		l = "";
	//   11   25:aload_0         
	//   12   26:ldc2            #294 <String "">
	//   13   29:putfield        #302 <Field String l>
		q = "";
	//   14   32:aload_0         
	//   15   33:ldc2            #294 <String "">
	//   16   36:putfield        #304 <Field String q>
		a = parcel.readString();
	//   17   39:aload_0         
	//   18   40:aload_1         
	//   19   41:invokevirtual   #311 <Method String Parcel.readString()>
	//   20   44:putfield        #296 <Field String a>
		b = parcel.readInt();
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:invokevirtual   #315 <Method int Parcel.readInt()>
	//   24   52:putfield        #317 <Field int b>
		c = (y)parcel.readSerializable();
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:invokevirtual   #321 <Method java.io.Serializable Parcel.readSerializable()>
	//   28   60:checkcast       #149 <Class y>
	//   29   63:putfield        #323 <Field y c>
		d = parcel.readString();
	//   30   66:aload_0         
	//   31   67:aload_1         
	//   32   68:invokevirtual   #311 <Method String Parcel.readString()>
	//   33   71:putfield        #298 <Field String d>
		int i1 = parcel.readInt();
	//   34   74:aload_1         
	//   35   75:invokevirtual   #315 <Method int Parcel.readInt()>
	//   36   78:istore_2        
		boolean flag = true;
	//   37   79:iconst_1        
	//   38   80:istore_3        
		if(i1 != 1)
	//*  39   81:iload_2         
	//*  40   82:iconst_1        
	//*  41   83:icmpne          89
	//*  42   86:goto            91
			flag = false;
	//   43   89:iconst_0        
	//   44   90:istore_3        
		e = flag;
	//   45   91:aload_0         
	//   46   92:iload_3         
	//   47   93:putfield        #325 <Field boolean e>
		f = parcel.readString();
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:invokevirtual   #311 <Method String Parcel.readString()>
	//   51  101:putfield        #300 <Field String f>
		g = parcel.readLong();
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:invokevirtual   #329 <Method long Parcel.readLong()>
	//   55  109:putfield        #331 <Field long g>
		h = parcel.readLong();
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:invokevirtual   #329 <Method long Parcel.readLong()>
	//   59  117:putfield        #333 <Field long h>
		i = parcel.readLong();
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:invokevirtual   #329 <Method long Parcel.readLong()>
	//   63  125:putfield        #335 <Field long i>
		j = parcel.readLong();
	//   64  128:aload_0         
	//   65  129:aload_1         
	//   66  130:invokevirtual   #329 <Method long Parcel.readLong()>
	//   67  133:putfield        #337 <Field long j>
		k = parcel.readInt();
	//   68  136:aload_0         
	//   69  137:aload_1         
	//   70  138:invokevirtual   #315 <Method int Parcel.readInt()>
	//   71  141:putfield        #339 <Field int k>
		l = parcel.readString();
	//   72  144:aload_0         
	//   73  145:aload_1         
	//   74  146:invokevirtual   #311 <Method String Parcel.readString()>
	//   75  149:putfield        #302 <Field String l>
		m = (z)parcel.readSerializable();
	//   76  152:aload_0         
	//   77  153:aload_1         
	//   78  154:invokevirtual   #321 <Method java.io.Serializable Parcel.readSerializable()>
	//   79  157:checkcast       #341 <Class z>
	//   80  160:putfield        #343 <Field z m>
		n = (ac)parcel.readSerializable();
	//   81  163:aload_0         
	//   82  164:aload_1         
	//   83  165:invokevirtual   #321 <Method java.io.Serializable Parcel.readSerializable()>
	//   84  168:checkcast       #64  <Class ac>
	//   85  171:putfield        #345 <Field ac n>
		o = (h)parcel.readSerializable();
	//   86  174:aload_0         
	//   87  175:aload_1         
	//   88  176:invokevirtual   #321 <Method java.io.Serializable Parcel.readSerializable()>
	//   89  179:checkcast       #202 <Class h>
	//   90  182:putfield        #347 <Field h o>
		p = parcel.readInt();
	//   91  185:aload_0         
	//   92  186:aload_1         
	//   93  187:invokevirtual   #315 <Method int Parcel.readInt()>
	//   94  190:putfield        #349 <Field int p>
		q = parcel.readString();
	//   95  193:aload_0         
	//   96  194:aload_1         
	//   97  195:invokevirtual   #311 <Method String Parcel.readString()>
	//   98  198:putfield        #304 <Field String q>
		r = NetworkAddress.networkAddressForHostWithPort(f, b);
	//   99  201:aload_0         
	//  100  202:aload_0         
	//  101  203:getfield        #300 <Field String f>
	//  102  206:aload_0         
	//  103  207:getfield        #317 <Field int b>
	//  104  210:invokestatic    #355 <Method NetworkAddress NetworkAddress.networkAddressForHostWithPort(String, int)>
	//  105  213:putfield        #357 <Field NetworkAddress r>
	//  106  216:return          
	}

	public void a(AssetNetworkSettingsEvent assetnetworksettingsevent)
	{
		e = assetnetworksettingsevent.isDhcpEnabled();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #364 <Method boolean AssetNetworkSettingsEvent.isDhcpEnabled()>
	//    3    5:putfield        #325 <Field boolean e>
		g = assetnetworksettingsevent.subnetMask();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #367 <Method long AssetNetworkSettingsEvent.subnetMask()>
	//    7   13:putfield        #331 <Field long g>
		h = assetnetworksettingsevent.gateway();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #370 <Method long AssetNetworkSettingsEvent.gateway()>
	//   11   21:putfield        #333 <Field long h>
		i = assetnetworksettingsevent.dns1();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #373 <Method long AssetNetworkSettingsEvent.dns1()>
	//   15   29:putfield        #335 <Field long i>
		j = assetnetworksettingsevent.dns2();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #376 <Method long AssetNetworkSettingsEvent.dns2()>
	//   19   37:putfield        #337 <Field long j>
		l = com.irobot.home.util.j.a(((java.util.List) (assetnetworksettingsevent.bssid())));
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #380 <Method java.util.ArrayList AssetNetworkSettingsEvent.bssid()>
	//   23   45:invokestatic    #385 <Method String j.a(java.util.List)>
	//   24   48:putfield        #302 <Field String l>
		c = (y)t.get(((Object) (assetnetworksettingsevent.securityType())));
	//   25   51:aload_0         
	//   26   52:getstatic       #194 <Field Map t>
	//   27   55:aload_1         
	//   28   56:invokevirtual   #389 <Method WifiSecurityType AssetNetworkSettingsEvent.securityType()>
	//   29   59:invokeinterface #393 <Method Object Map.get(Object)>
	//   30   64:checkcast       #149 <Class y>
	//   31   67:putfield        #323 <Field y c>
	//   32   70:return          
	}

	public void a(AssetNetworkStatusEvent assetnetworkstatusevent)
	{
		n = (ac)s.get(((Object) (assetnetworkstatusevent.stationState())));
	//    0    0:aload_0         
	//    1    1:getstatic       #141 <Field Map s>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #400 <Method StationConnectionState AssetNetworkStatusEvent.stationState()>
	//    4    8:invokeinterface #393 <Method Object Map.get(Object)>
	//    5   13:checkcast       #64  <Class ac>
	//    6   16:putfield        #345 <Field ac n>
		o = (h)u.get(((Object) (assetnetworkstatusevent.cloudState())));
	//    7   19:aload_0         
	//    8   20:getstatic       #290 <Field Map u>
	//    9   23:aload_1         
	//   10   24:invokevirtual   #404 <Method CloudServerState AssetNetworkStatusEvent.cloudState()>
	//   11   27:invokeinterface #393 <Method Object Map.get(Object)>
	//   12   32:checkcast       #202 <Class h>
	//   13   35:putfield        #347 <Field h o>
	//   14   38:return          
	}

	public void a(AssetWifiSignalStrengthEvent assetwifisignalstrengthevent)
	{
		k = ((int) (assetwifisignalstrengthevent.signalStrength()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #411 <Method short AssetWifiSignalStrengthEvent.signalStrength()>
	//    3    5:putfield        #339 <Field int k>
	//    4    8:return          
	}

	public void a(NetworkAddress networkaddress)
	{
		r = networkaddress;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #357 <Field NetworkAddress r>
		f = networkaddress.host();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #415 <Method String NetworkAddress.host()>
	//    6   10:putfield        #300 <Field String f>
		b = networkaddress.port();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #418 <Method int NetworkAddress.port()>
	//   10   18:putfield        #317 <Field int b>
	//   11   21:return          
	}

	public void a(WifiConfigEvent wificonfigevent)
	{
		a = com.irobot.home.util.j.d(wificonfigevent.ssid());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #424 <Method String WifiConfigEvent.ssid()>
	//    3    5:invokestatic    #427 <Method String j.d(String)>
	//    4    8:putfield        #296 <Field String a>
		d = wificonfigevent.password();
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #430 <Method String WifiConfigEvent.password()>
	//    8   16:putfield        #298 <Field String d>
	//    9   19:return          
	}

	public void a(NetworkSettings networksettings)
	{
		a = networksettings.b();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #433 <Method String b()>
	//    3    5:putfield        #296 <Field String a>
		r = networksettings.e();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #436 <Method NetworkAddress e()>
	//    7   13:putfield        #357 <Field NetworkAddress r>
		c = networksettings.c();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #439 <Method y c()>
	//   11   21:putfield        #323 <Field y c>
		d = networksettings.d();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #441 <Method String d()>
	//   15   29:putfield        #298 <Field String d>
		e = networksettings.a();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #443 <Method boolean a()>
	//   19   37:putfield        #325 <Field boolean e>
		g = networksettings.f();
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #445 <Method long f()>
	//   23   45:putfield        #331 <Field long g>
		h = networksettings.g();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #447 <Method long g()>
	//   27   53:putfield        #333 <Field long h>
		i = networksettings.h();
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #449 <Method long h()>
	//   31   61:putfield        #335 <Field long i>
		j = networksettings.i();
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:invokevirtual   #451 <Method long i()>
	//   35   69:putfield        #337 <Field long j>
		k = networksettings.j();
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:invokevirtual   #453 <Method int j()>
	//   39   77:putfield        #339 <Field int k>
		l = networksettings.k();
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:invokevirtual   #455 <Method String k()>
	//   43   85:putfield        #302 <Field String l>
		m = networksettings.l();
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:invokevirtual   #458 <Method z l()>
	//   47   93:putfield        #343 <Field z m>
		n = networksettings.m();
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:invokevirtual   #461 <Method ac m()>
	//   51  101:putfield        #345 <Field ac n>
		o = networksettings.n();
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:invokevirtual   #464 <Method h n()>
	//   55  109:putfield        #347 <Field h o>
		p = networksettings.o();
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:invokevirtual   #466 <Method int o()>
	//   59  117:putfield        #349 <Field int p>
		q = networksettings.p();
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:invokevirtual   #468 <Method String p()>
	//   63  125:putfield        #304 <Field String q>
		f = networksettings.f;
	//   64  128:aload_0         
	//   65  129:aload_1         
	//   66  130:getfield        #300 <Field String f>
	//   67  133:putfield        #300 <Field String f>
	//   68  136:return          
	}

	public void a(String s1)
	{
		a = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #296 <Field String a>
	//    3    5:return          
	}

	public boolean a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #325 <Field boolean e>
	//    2    4:ireturn         
	}

	public String b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field String a>
	//    2    4:areturn         
	}

	public void b(String s1)
	{
		if(s1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            11
			s1 = "";
	//    3    7:ldc2            #294 <String "">
	//    4   10:astore_1        
		q = s1;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #304 <Field String q>
	//    8   16:return          
	}

	public y c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #323 <Field y c>
	//    2    4:areturn         
	}

	public void c(String s1)
	{
		q = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #304 <Field String q>
	//    3    5:return          
	}

	public String d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field String d>
	//    2    4:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public NetworkAddress e()
	{
		if(r == null || !r.host().equals(((Object) (f))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #357 <Field NetworkAddress r>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #357 <Field NetworkAddress r>
	//*   5   11:invokevirtual   #415 <Method String NetworkAddress.host()>
	//*   6   14:aload_0         
	//*   7   15:getfield        #300 <Field String f>
	//*   8   18:invokevirtual   #476 <Method boolean String.equals(Object)>
	//*   9   21:ifne            39
			r = NetworkAddress.networkAddressForHostWithPort(f, b);
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #300 <Field String f>
	//   13   29:aload_0         
	//   14   30:getfield        #317 <Field int b>
	//   15   33:invokestatic    #355 <Method NetworkAddress NetworkAddress.networkAddressForHostWithPort(String, int)>
	//   16   36:putfield        #357 <Field NetworkAddress r>
		return r;
	//   17   39:aload_0         
	//   18   40:getfield        #357 <Field NetworkAddress r>
	//   19   43:areturn         
	}

	public long f()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #331 <Field long g>
	//    2    4:lreturn         
	}

	public long g()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #333 <Field long h>
	//    2    4:lreturn         
	}

	public long h()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #335 <Field long i>
	//    2    4:lreturn         
	}

	public long i()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #337 <Field long j>
	//    2    4:lreturn         
	}

	public int j()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #339 <Field int k>
	//    2    4:ireturn         
	}

	public String k()
	{
		return l.toUpperCase();
	//    0    0:aload_0         
	//    1    1:getfield        #302 <Field String l>
	//    2    4:invokevirtual   #479 <Method String String.toUpperCase()>
	//    3    7:areturn         
	}

	public z l()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #343 <Field z m>
	//    2    4:areturn         
	}

	public ac m()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #345 <Field ac n>
	//    2    4:areturn         
	}

	public h n()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #347 <Field h o>
	//    2    4:areturn         
	}

	public int o()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #349 <Field int p>
	//    2    4:ireturn         
	}

	public String p()
	{
		return q.toUpperCase();
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field String q>
	//    2    4:invokevirtual   #479 <Method String String.toUpperCase()>
	//    3    7:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #483 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #485 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #489 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public NetworkSettings a(Parcel parcel)
		{
			return new NetworkSettings(parcel);
		//    0    0:new             #9   <Class NetworkSettings>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void NetworkSettings(Parcel)>
		//    4    8:areturn         
		}

		public NetworkSettings[] a(int i1)
		{
			return new NetworkSettings[i1];
		//    0    0:iload_1         
		//    1    1:anewarray       NetworkSettings[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method NetworkSettings a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i1)
		{
			return ((Object []) (a(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method NetworkSettings[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private static transient Map s;
	private static transient Map t;
	private static transient Map u;
	private String a;
	private int b;
	private y c;
	private String d;
	private boolean e;
	private String f;
	private long g;
	private long h;
	private long i;
	private long j;
	private int k;
	private String l;
	private z m;
	private ac n;
	private h o;
	private int p;
	private String q;
	private transient NetworkAddress r;

	static 
	{
	//    0    0:new             #8   <Class NetworkSettings$1>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void NetworkSettings$1()>
	//    3    7:putstatic       #53  <Field android.os.Parcelable$Creator CREATOR>
		HashMap hashmap = new HashMap();
	//    4   10:new             #55  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #56  <Method void HashMap()>
	//    7   17:astore_0        
		((Map) (hashmap)).put(((Object) (StationConnectionState.Idle)), ((Object) (ac.IDLE)));
	//    8   18:aload_0         
	//    9   19:getstatic       #62  <Field StationConnectionState StationConnectionState.Idle>
	//   10   22:getstatic       #67  <Field ac ac.IDLE>
	//   11   25:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   12   30:pop             
		((Map) (hashmap)).put(((Object) (StationConnectionState.Ok)), ((Object) (ac.OK)));
	//   13   31:aload_0         
	//   14   32:getstatic       #76  <Field StationConnectionState StationConnectionState.Ok>
	//   15   35:getstatic       #79  <Field ac ac.OK>
	//   16   38:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   17   43:pop             
		((Map) (hashmap)).put(((Object) (StationConnectionState.NetworkError)), ((Object) (ac.ERR_NETWORK)));
	//   18   44:aload_0         
	//   19   45:getstatic       #82  <Field StationConnectionState StationConnectionState.NetworkError>
	//   20   48:getstatic       #85  <Field ac ac.ERR_NETWORK>
	//   21   51:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   22   56:pop             
		((Map) (hashmap)).put(((Object) (StationConnectionState.AuthError)), ((Object) (ac.ERR_AUTH)));
	//   23   57:aload_0         
	//   24   58:getstatic       #88  <Field StationConnectionState StationConnectionState.AuthError>
	//   25   61:getstatic       #91  <Field ac ac.ERR_AUTH>
	//   26   64:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   27   69:pop             
		((Map) (hashmap)).put(((Object) (StationConnectionState.DhcpError)), ((Object) (ac.ERR_DHCP)));
	//   28   70:aload_0         
	//   29   71:getstatic       #94  <Field StationConnectionState StationConnectionState.DhcpError>
	//   30   74:getstatic       #97  <Field ac ac.ERR_DHCP>
	//   31   77:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   32   82:pop             
		((Map) (hashmap)).put(((Object) (StationConnectionState.LinkLostError)), ((Object) (ac.ERR_LINK)));
	//   33   83:aload_0         
	//   34   84:getstatic       #100 <Field StationConnectionState StationConnectionState.LinkLostError>
	//   35   87:getstatic       #103 <Field ac ac.ERR_LINK>
	//   36   90:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   37   95:pop             
		((Map) (hashmap)).put(((Object) (StationConnectionState.ConnectError)), ((Object) (ac.ERR_CONNECT)));
	//   38   96:aload_0         
	//   39   97:getstatic       #106 <Field StationConnectionState StationConnectionState.ConnectError>
	//   40  100:getstatic       #109 <Field ac ac.ERR_CONNECT>
	//   41  103:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   42  108:pop             
		((Map) (hashmap)).put(((Object) (StationConnectionState.ChannelSwitch)), ((Object) (ac.CHANNEL_SWITCH)));
	//   43  109:aload_0         
	//   44  110:getstatic       #112 <Field StationConnectionState StationConnectionState.ChannelSwitch>
	//   45  113:getstatic       #115 <Field ac ac.CHANNEL_SWITCH>
	//   46  116:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   47  121:pop             
		((Map) (hashmap)).put(((Object) (StationConnectionState.Connecting)), ((Object) (ac.CONNECTING)));
	//   48  122:aload_0         
	//   49  123:getstatic       #118 <Field StationConnectionState StationConnectionState.Connecting>
	//   50  126:getstatic       #121 <Field ac ac.CONNECTING>
	//   51  129:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   52  134:pop             
		((Map) (hashmap)).put(((Object) (StationConnectionState.NotOnDock)), ((Object) (ac.ERR_NOT_ON_DOCK)));
	//   53  135:aload_0         
	//   54  136:getstatic       #124 <Field StationConnectionState StationConnectionState.NotOnDock>
	//   55  139:getstatic       #127 <Field ac ac.ERR_NOT_ON_DOCK>
	//   56  142:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   57  147:pop             
		((Map) (hashmap)).put(((Object) (StationConnectionState.RssiLow)), ((Object) (ac.ERR_RSSI_LOW)));
	//   58  148:aload_0         
	//   59  149:getstatic       #130 <Field StationConnectionState StationConnectionState.RssiLow>
	//   60  152:getstatic       #133 <Field ac ac.ERR_RSSI_LOW>
	//   61  155:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   62  160:pop             
		s = Collections.unmodifiableMap(((Map) (hashmap)));
	//   63  161:aload_0         
	//   64  162:invokestatic    #139 <Method Map Collections.unmodifiableMap(Map)>
	//   65  165:putstatic       #141 <Field Map s>
		hashmap = new HashMap();
	//   66  168:new             #55  <Class HashMap>
	//   67  171:dup             
	//   68  172:invokespecial   #56  <Method void HashMap()>
	//   69  175:astore_0        
		((Map) (hashmap)).put(((Object) (WifiSecurityType.None)), ((Object) (y.NONE)));
	//   70  176:aload_0         
	//   71  177:getstatic       #147 <Field WifiSecurityType WifiSecurityType.None>
	//   72  180:getstatic       #152 <Field y y.NONE>
	//   73  183:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   74  188:pop             
		((Map) (hashmap)).put(((Object) (WifiSecurityType.WEPOpen)), ((Object) (y.WEP_OPEN)));
	//   75  189:aload_0         
	//   76  190:getstatic       #155 <Field WifiSecurityType WifiSecurityType.WEPOpen>
	//   77  193:getstatic       #158 <Field y y.WEP_OPEN>
	//   78  196:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   79  201:pop             
		((Map) (hashmap)).put(((Object) (WifiSecurityType.WEPShared)), ((Object) (y.WEP_SHARED)));
	//   80  202:aload_0         
	//   81  203:getstatic       #161 <Field WifiSecurityType WifiSecurityType.WEPShared>
	//   82  206:getstatic       #164 <Field y y.WEP_SHARED>
	//   83  209:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   84  214:pop             
		((Map) (hashmap)).put(((Object) (WifiSecurityType.WPA)), ((Object) (y.WPA)));
	//   85  215:aload_0         
	//   86  216:getstatic       #167 <Field WifiSecurityType WifiSecurityType.WPA>
	//   87  219:getstatic       #169 <Field y y.WPA>
	//   88  222:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   89  227:pop             
		((Map) (hashmap)).put(((Object) (WifiSecurityType.WPA2)), ((Object) (y.WPA2)));
	//   90  228:aload_0         
	//   91  229:getstatic       #172 <Field WifiSecurityType WifiSecurityType.WPA2>
	//   92  232:getstatic       #174 <Field y y.WPA2>
	//   93  235:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   94  240:pop             
		((Map) (hashmap)).put(((Object) (WifiSecurityType.WPAWPA2Mixed)), ((Object) (y.WPA_WPA2_MIXED)));
	//   95  241:aload_0         
	//   96  242:getstatic       #177 <Field WifiSecurityType WifiSecurityType.WPAWPA2Mixed>
	//   97  245:getstatic       #180 <Field y y.WPA_WPA2_MIXED>
	//   98  248:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//   99  253:pop             
		((Map) (hashmap)).put(((Object) (WifiSecurityType.EapTls)), ((Object) (y.EAP_TLS)));
	//  100  254:aload_0         
	//  101  255:getstatic       #183 <Field WifiSecurityType WifiSecurityType.EapTls>
	//  102  258:getstatic       #186 <Field y y.EAP_TLS>
	//  103  261:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  104  266:pop             
		((Map) (hashmap)).put(((Object) (WifiSecurityType.WildCard)), ((Object) (y.WILDCARD)));
	//  105  267:aload_0         
	//  106  268:getstatic       #189 <Field WifiSecurityType WifiSecurityType.WildCard>
	//  107  271:getstatic       #192 <Field y y.WILDCARD>
	//  108  274:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  109  279:pop             
		t = Collections.unmodifiableMap(((Map) (hashmap)));
	//  110  280:aload_0         
	//  111  281:invokestatic    #139 <Method Map Collections.unmodifiableMap(Map)>
	//  112  284:putstatic       #194 <Field Map t>
		hashmap = new HashMap();
	//  113  287:new             #55  <Class HashMap>
	//  114  290:dup             
	//  115  291:invokespecial   #56  <Method void HashMap()>
	//  116  294:astore_0        
		((Map) (hashmap)).put(((Object) (CloudServerState.Off)), ((Object) (h.OFF)));
	//  117  295:aload_0         
	//  118  296:getstatic       #200 <Field CloudServerState CloudServerState.Off>
	//  119  299:getstatic       #205 <Field h h.OFF>
	//  120  302:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  121  307:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.On)), ((Object) (h.ON)));
	//  122  308:aload_0         
	//  123  309:getstatic       #208 <Field CloudServerState CloudServerState.On>
	//  124  312:getstatic       #211 <Field h h.ON>
	//  125  315:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  126  320:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.ServerError)), ((Object) (h.ERROR)));
	//  127  321:aload_0         
	//  128  322:getstatic       #214 <Field CloudServerState CloudServerState.ServerError>
	//  129  325:getstatic       #217 <Field h h.ERROR>
	//  130  328:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  131  333:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.ServerDown)), ((Object) (h.DOWN)));
	//  132  334:aload_0         
	//  133  335:getstatic       #220 <Field CloudServerState CloudServerState.ServerDown>
	//  134  338:getstatic       #223 <Field h h.DOWN>
	//  135  341:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  136  346:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.NetworkError)), ((Object) (h.NET_ERROR)));
	//  137  347:aload_0         
	//  138  348:getstatic       #225 <Field CloudServerState CloudServerState.NetworkError>
	//  139  351:getstatic       #228 <Field h h.NET_ERROR>
	//  140  354:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  141  359:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.NtpError)), ((Object) (h.NTP_ERROR)));
	//  142  360:aload_0         
	//  143  361:getstatic       #231 <Field CloudServerState CloudServerState.NtpError>
	//  144  364:getstatic       #234 <Field h h.NTP_ERROR>
	//  145  367:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  146  372:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.ServiceDiscoveryError)), ((Object) (h.SERVICE_DISCOVERY_ERROR)));
	//  147  373:aload_0         
	//  148  374:getstatic       #237 <Field CloudServerState CloudServerState.ServiceDiscoveryError>
	//  149  377:getstatic       #240 <Field h h.SERVICE_DISCOVERY_ERROR>
	//  150  380:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  151  385:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.RegistrationFailedError)), ((Object) (h.REGISTRATION_FAILED_ERROR)));
	//  152  386:aload_0         
	//  153  387:getstatic       #243 <Field CloudServerState CloudServerState.RegistrationFailedError>
	//  154  390:getstatic       #246 <Field h h.REGISTRATION_FAILED_ERROR>
	//  155  393:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  156  398:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.CloudStateUnknown)), ((Object) (h.CLOUD_STATE_UNKNOWN)));
	//  157  399:aload_0         
	//  158  400:getstatic       #249 <Field CloudServerState CloudServerState.CloudStateUnknown>
	//  159  403:getstatic       #252 <Field h h.CLOUD_STATE_UNKNOWN>
	//  160  406:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  161  411:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.CloudStateUnconfigured)), ((Object) (h.CLOUD_STATE_UNCONFIGURED)));
	//  162  412:aload_0         
	//  163  413:getstatic       #255 <Field CloudServerState CloudServerState.CloudStateUnconfigured>
	//  164  416:getstatic       #258 <Field h h.CLOUD_STATE_UNCONFIGURED>
	//  165  419:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  166  424:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.CloudStateWaitForNtp)), ((Object) (h.CLOUD_STATE_WAIT_FOR_NTP)));
	//  167  425:aload_0         
	//  168  426:getstatic       #261 <Field CloudServerState CloudServerState.CloudStateWaitForNtp>
	//  169  429:getstatic       #264 <Field h h.CLOUD_STATE_WAIT_FOR_NTP>
	//  170  432:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  171  437:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.CloudStateServiceDiscovery)), ((Object) (h.CLOUD_STATE_SERVICE_DISCOVERY)));
	//  172  438:aload_0         
	//  173  439:getstatic       #267 <Field CloudServerState CloudServerState.CloudStateServiceDiscovery>
	//  174  442:getstatic       #270 <Field h h.CLOUD_STATE_SERVICE_DISCOVERY>
	//  175  445:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  176  450:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.CloudStateRegistration)), ((Object) (h.CLOUD_STATE_REGISTRATION)));
	//  177  451:aload_0         
	//  178  452:getstatic       #273 <Field CloudServerState CloudServerState.CloudStateRegistration>
	//  179  455:getstatic       #276 <Field h h.CLOUD_STATE_REGISTRATION>
	//  180  458:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  181  463:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.CloudStateConnecting)), ((Object) (h.CLOUD_STATE_CONNECTING)));
	//  182  464:aload_0         
	//  183  465:getstatic       #279 <Field CloudServerState CloudServerState.CloudStateConnecting>
	//  184  468:getstatic       #282 <Field h h.CLOUD_STATE_CONNECTING>
	//  185  471:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  186  476:pop             
		((Map) (hashmap)).put(((Object) (CloudServerState.CloudStateConnected)), ((Object) (h.CLOUD_STATE_CONNECTED)));
	//  187  477:aload_0         
	//  188  478:getstatic       #285 <Field CloudServerState CloudServerState.CloudStateConnected>
	//  189  481:getstatic       #288 <Field h h.CLOUD_STATE_CONNECTED>
	//  190  484:invokeinterface #73  <Method Object Map.put(Object, Object)>
	//  191  489:pop             
		u = Collections.unmodifiableMap(((Map) (hashmap)));
	//  192  490:aload_0         
	//  193  491:invokestatic    #139 <Method Map Collections.unmodifiableMap(Map)>
	//  194  494:putstatic       #290 <Field Map u>
	//* 195  497:return          
	}
}
