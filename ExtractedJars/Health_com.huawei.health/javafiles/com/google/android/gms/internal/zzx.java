// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.io.IOException;
import java.util.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.google.android.gms.internal:
//			zzz, zza, zzl, zzx

public class zzx
	implements zzz
{
	public static final class zza extends Binder
		implements zzx
	{
		static class zza
			implements zzx
		{

			public IBinder asBinder()
			{
				return zzrk;
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field IBinder zzrk>
			//    2    4:areturn         
			}

			public void zzG(IObjectWrapper iobjectwrapper)
				throws RemoteException
			{
				Parcel parcel;
				Parcel parcel1;
				parcel = Parcel.obtain();
			//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
			//    1    3:astore_2        
				parcel1 = Parcel.obtain();
			//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
			//    3    7:astore_3        
				parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
			//    4    8:aload_2         
			//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IOnMyLocationChangeListener">
			//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
				if(iobjectwrapper == null) goto _L2; else goto _L1
			//    7   14:aload_1         
			//    8   15:ifnull          71
_L1:
				iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
			//    9   18:aload_1         
			//   10   19:invokeinterface #41  <Method IBinder IObjectWrapper.asBinder()>
			//   11   24:astore_1        
			//*  12   25:goto            28
_L4:
				parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
			//   13   28:aload_2         
			//   14   29:aload_1         
			//   15   30:invokevirtual   #44  <Method void Parcel.writeStrongBinder(IBinder)>
				zzrk.transact(1, parcel, parcel1, 0);
			//   16   33:aload_0         
			//   17   34:getfield        #18  <Field IBinder zzrk>
			//   18   37:iconst_1        
			//   19   38:aload_2         
			//   20   39:aload_3         
			//   21   40:iconst_0        
			//   22   41:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
			//   23   46:pop             
				parcel1.readException();
			//   24   47:aload_3         
			//   25   48:invokevirtual   #53  <Method void Parcel.readException()>
				parcel1.recycle();
			//   26   51:aload_3         
			//   27   52:invokevirtual   #56  <Method void Parcel.recycle()>
				parcel.recycle();
			//   28   55:aload_2         
			//   29   56:invokevirtual   #56  <Method void Parcel.recycle()>
				return;
			//   30   59:return          
				iobjectwrapper;
			//   31   60:astore_1        
				parcel1.recycle();
			//   32   61:aload_3         
			//   33   62:invokevirtual   #56  <Method void Parcel.recycle()>
				parcel.recycle();
			//   34   65:aload_2         
			//   35   66:invokevirtual   #56  <Method void Parcel.recycle()>
				throw iobjectwrapper;
			//   36   69:aload_1         
			//   37   70:athrow          
_L2:
				iobjectwrapper = null;
			//   38   71:aconst_null     
			//   39   72:astore_1        
				if(true) goto _L4; else goto _L3
			//   40   73:goto            28
_L3:
			}

			private IBinder zzrk;

			zza(IBinder ibinder)
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #16  <Method void Object()>
				zzrk = ibinder;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #18  <Field IBinder zzrk>
			//    5    9:return          
			}
		}


		public static zzx zzdS(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
		//    4    6:aload_0         
		//    5    7:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMyLocationChangeListener">
		//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzx))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzx>
		//*  12   23:ifeq            31
				return (zzx)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzx>
		//   15   30:areturn         
			else
				return ((zzx) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzx$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #31  <Method void zzx$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public IBinder asBinder()
		{
			return ((IBinder) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    2: default 28
		//		               1: 39
		//		               1598968902: 31
		//*   2   28:goto            62
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
		//    3   31:aload_3         
		//    4   32:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMyLocationChangeListener">
		//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
				return true;
		//    6   37:iconst_1        
		//    7   38:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
		//    8   39:aload_2         
		//    9   40:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMyLocationChangeListener">
		//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
				zzG(com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder()));
		//   11   45:aload_0         
		//   12   46:aload_2         
		//   13   47:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
		//   14   50:invokestatic    #55  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   15   53:invokevirtual   #59  <Method void zzG(IObjectWrapper)>
				parcel1.writeNoException();
		//   16   56:aload_3         
		//   17   57:invokevirtual   #62  <Method void Parcel.writeNoException()>
				return true;
		//   18   60:iconst_1        
		//   19   61:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   20   62:aload_0         
		//   21   63:iload_1         
		//   22   64:aload_2         
		//   23   65:aload_3         
		//   24   66:iload           4
		//   25   68:invokespecial   #64  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   26   71:ireturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Binder()>
			attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMyLocationChangeListener">
		//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
		//    6   11:return          
		}
	}


	public zzx(HttpClient httpclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzaD = httpclient;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field HttpClient zzaD>
	//    5    9:return          
	}

	private static void zza(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, zzl zzl1)
		throws com.google.android.gms.internal.zza
	{
		zzl1 = ((zzl) (zzl1.zzm()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method byte[] zzl.zzm()>
	//    2    4:astore_1        
		if(zzl1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
			httpentityenclosingrequestbase.setEntity(((org.apache.http.HttpEntity) (new ByteArrayEntity(((byte []) (zzl1))))));
	//    5    9:aload_0         
	//    6   10:new             #30  <Class ByteArrayEntity>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #33  <Method void ByteArrayEntity(byte[])>
	//   10   18:invokevirtual   #39  <Method void HttpEntityEnclosingRequestBase.setEntity(org.apache.http.HttpEntity)>
	//   11   21:return          
	}

	private static void zza(HttpUriRequest httpurirequest, Map map)
	{
		String s;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); httpurirequest.setHeader(s, (String)map.get(((Object) (s)))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #49  <Method Set Map.keySet()>
	//*   2    6:invokeinterface #55  <Method Iterator Set.iterator()>
	//*   3   11:astore_2        
	//*   4   12:aload_2         
	//*   5   13:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            51
			s = (String)iterator.next();
	//    7   21:aload_2         
	//    8   22:invokeinterface #65  <Method Object Iterator.next()>
	//    9   27:checkcast       #67  <Class String>
	//   10   30:astore_3        

	//   11   31:aload_0         
	//   12   32:aload_3         
	//   13   33:aload_1         
	//   14   34:aload_3         
	//   15   35:invokeinterface #71  <Method Object Map.get(Object)>
	//   16   40:checkcast       #67  <Class String>
	//   17   43:invokeinterface #77  <Method void HttpUriRequest.setHeader(String, String)>
	//*  18   48:goto            12
	//   19   51:return          
	}

	static HttpUriRequest zzb(zzl zzl1, Map map)
		throws com.google.android.gms.internal.zza
	{
		switch(zzl1.getMethod())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #84  <Method int zzl.getMethod()>
		{
	//*   2    4:tableswitch     -1 7: default 56
	//	               -1 59
	//	               0 116
	//	               1 140
	//	               2 169
	//	               3 128
	//	               4 198
	//	               5 210
	//	               6 222
	//	               7 234
	//*   3   56:goto            263
		case -1: 
			map = ((Map) (zzl1.zzj()));
	//    4   59:aload_0         
	//    5   60:invokevirtual   #87  <Method byte[] zzl.zzj()>
	//    6   63:astore_1        
			if(map != null)
	//*   7   64:aload_1         
	//*   8   65:ifnull          104
			{
				HttpPost httppost = new HttpPost(zzl1.getUrl());
	//    9   68:new             #89  <Class HttpPost>
	//   10   71:dup             
	//   11   72:aload_0         
	//   12   73:invokevirtual   #93  <Method String zzl.getUrl()>
	//   13   76:invokespecial   #96  <Method void HttpPost(String)>
	//   14   79:astore_2        
				httppost.addHeader("Content-Type", zzl1.zzi());
	//   15   80:aload_2         
	//   16   81:ldc1            #98  <String "Content-Type">
	//   17   83:aload_0         
	//   18   84:invokevirtual   #101 <Method String zzl.zzi()>
	//   19   87:invokevirtual   #104 <Method void HttpPost.addHeader(String, String)>
				httppost.setEntity(((org.apache.http.HttpEntity) (new ByteArrayEntity(((byte []) (map))))));
	//   20   90:aload_2         
	//   21   91:new             #30  <Class ByteArrayEntity>
	//   22   94:dup             
	//   23   95:aload_1         
	//   24   96:invokespecial   #33  <Method void ByteArrayEntity(byte[])>
	//   25   99:invokevirtual   #105 <Method void HttpPost.setEntity(org.apache.http.HttpEntity)>
				return ((HttpUriRequest) (httppost));
	//   26  102:aload_2         
	//   27  103:areturn         
			} else
			{
				return ((HttpUriRequest) (new HttpGet(zzl1.getUrl())));
	//   28  104:new             #107 <Class HttpGet>
	//   29  107:dup             
	//   30  108:aload_0         
	//   31  109:invokevirtual   #93  <Method String zzl.getUrl()>
	//   32  112:invokespecial   #108 <Method void HttpGet(String)>
	//   33  115:areturn         
			}

		case 0: // '\0'
			return ((HttpUriRequest) (new HttpGet(zzl1.getUrl())));
	//   34  116:new             #107 <Class HttpGet>
	//   35  119:dup             
	//   36  120:aload_0         
	//   37  121:invokevirtual   #93  <Method String zzl.getUrl()>
	//   38  124:invokespecial   #108 <Method void HttpGet(String)>
	//   39  127:areturn         

		case 3: // '\003'
			return ((HttpUriRequest) (new HttpDelete(zzl1.getUrl())));
	//   40  128:new             #110 <Class HttpDelete>
	//   41  131:dup             
	//   42  132:aload_0         
	//   43  133:invokevirtual   #93  <Method String zzl.getUrl()>
	//   44  136:invokespecial   #111 <Method void HttpDelete(String)>
	//   45  139:areturn         

		case 1: // '\001'
			map = ((Map) (new HttpPost(zzl1.getUrl())));
	//   46  140:new             #89  <Class HttpPost>
	//   47  143:dup             
	//   48  144:aload_0         
	//   49  145:invokevirtual   #93  <Method String zzl.getUrl()>
	//   50  148:invokespecial   #96  <Method void HttpPost(String)>
	//   51  151:astore_1        
			((HttpPost) (map)).addHeader("Content-Type", zzl1.zzl());
	//   52  152:aload_1         
	//   53  153:ldc1            #98  <String "Content-Type">
	//   54  155:aload_0         
	//   55  156:invokevirtual   #114 <Method String zzl.zzl()>
	//   56  159:invokevirtual   #104 <Method void HttpPost.addHeader(String, String)>
			zza(((HttpEntityEnclosingRequestBase) (map)), zzl1);
	//   57  162:aload_1         
	//   58  163:aload_0         
	//   59  164:invokestatic    #116 <Method void zza(HttpEntityEnclosingRequestBase, zzl)>
			return ((HttpUriRequest) (map));
	//   60  167:aload_1         
	//   61  168:areturn         

		case 2: // '\002'
			map = ((Map) (new HttpPut(zzl1.getUrl())));
	//   62  169:new             #118 <Class HttpPut>
	//   63  172:dup             
	//   64  173:aload_0         
	//   65  174:invokevirtual   #93  <Method String zzl.getUrl()>
	//   66  177:invokespecial   #119 <Method void HttpPut(String)>
	//   67  180:astore_1        
			((HttpPut) (map)).addHeader("Content-Type", zzl1.zzl());
	//   68  181:aload_1         
	//   69  182:ldc1            #98  <String "Content-Type">
	//   70  184:aload_0         
	//   71  185:invokevirtual   #114 <Method String zzl.zzl()>
	//   72  188:invokevirtual   #120 <Method void HttpPut.addHeader(String, String)>
			zza(((HttpEntityEnclosingRequestBase) (map)), zzl1);
	//   73  191:aload_1         
	//   74  192:aload_0         
	//   75  193:invokestatic    #116 <Method void zza(HttpEntityEnclosingRequestBase, zzl)>
			return ((HttpUriRequest) (map));
	//   76  196:aload_1         
	//   77  197:areturn         

		case 4: // '\004'
			return ((HttpUriRequest) (new HttpHead(zzl1.getUrl())));
	//   78  198:new             #122 <Class HttpHead>
	//   79  201:dup             
	//   80  202:aload_0         
	//   81  203:invokevirtual   #93  <Method String zzl.getUrl()>
	//   82  206:invokespecial   #123 <Method void HttpHead(String)>
	//   83  209:areturn         

		case 5: // '\005'
			return ((HttpUriRequest) (new HttpOptions(zzl1.getUrl())));
	//   84  210:new             #125 <Class HttpOptions>
	//   85  213:dup             
	//   86  214:aload_0         
	//   87  215:invokevirtual   #93  <Method String zzl.getUrl()>
	//   88  218:invokespecial   #126 <Method void HttpOptions(String)>
	//   89  221:areturn         

		case 6: // '\006'
			return ((HttpUriRequest) (new HttpTrace(zzl1.getUrl())));
	//   90  222:new             #128 <Class HttpTrace>
	//   91  225:dup             
	//   92  226:aload_0         
	//   93  227:invokevirtual   #93  <Method String zzl.getUrl()>
	//   94  230:invokespecial   #129 <Method void HttpTrace(String)>
	//   95  233:areturn         

		case 7: // '\007'
			map = ((Map) (new zza(zzl1.getUrl())));
	//   96  234:new             #8   <Class zzx$zza>
	//   97  237:dup             
	//   98  238:aload_0         
	//   99  239:invokevirtual   #93  <Method String zzl.getUrl()>
	//  100  242:invokespecial   #130 <Method void zzx$zza(String)>
	//  101  245:astore_1        
			((zza) (map)).addHeader("Content-Type", zzl1.zzl());
	//  102  246:aload_1         
	//  103  247:ldc1            #98  <String "Content-Type">
	//  104  249:aload_0         
	//  105  250:invokevirtual   #114 <Method String zzl.zzl()>
	//  106  253:invokevirtual   #131 <Method void zzx$zza.addHeader(String, String)>
			zza(((HttpEntityEnclosingRequestBase) (map)), zzl1);
	//  107  256:aload_1         
	//  108  257:aload_0         
	//  109  258:invokestatic    #116 <Method void zza(HttpEntityEnclosingRequestBase, zzl)>
			return ((HttpUriRequest) (map));
	//  110  261:aload_1         
	//  111  262:areturn         
		}
		throw new IllegalStateException("Unknown request method.");
	//  112  263:new             #133 <Class IllegalStateException>
	//  113  266:dup             
	//  114  267:ldc1            #135 <String "Unknown request method.">
	//  115  269:invokespecial   #136 <Method void IllegalStateException(String)>
	//  116  272:athrow          
	}

	public HttpResponse zza(zzl zzl1, Map map)
		throws IOException, com.google.android.gms.internal.zza
	{
		HttpUriRequest httpurirequest = zzb(zzl1, map);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #142 <Method HttpUriRequest zzb(zzl, Map)>
	//    3    5:astore          4
		zza(httpurirequest, map);
	//    4    7:aload           4
	//    5    9:aload_2         
	//    6   10:invokestatic    #144 <Method void zza(HttpUriRequest, Map)>
		zza(httpurirequest, zzl1.getHeaders());
	//    7   13:aload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #148 <Method Map zzl.getHeaders()>
	//   10   19:invokestatic    #144 <Method void zza(HttpUriRequest, Map)>
		map = ((Map) (httpurirequest.getParams()));
	//   11   22:aload           4
	//   12   24:invokeinterface #152 <Method org.apache.http.params.HttpParams HttpUriRequest.getParams()>
	//   13   29:astore_2        
		int i = zzl1.zzp();
	//   14   30:aload_1         
	//   15   31:invokevirtual   #155 <Method int zzl.zzp()>
	//   16   34:istore_3        
		HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (map)), 5000);
	//   17   35:aload_2         
	//   18   36:sipush          5000
	//   19   39:invokestatic    #161 <Method void HttpConnectionParams.setConnectionTimeout(org.apache.http.params.HttpParams, int)>
		HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (map)), i);
	//   20   42:aload_2         
	//   21   43:iload_3         
	//   22   44:invokestatic    #164 <Method void HttpConnectionParams.setSoTimeout(org.apache.http.params.HttpParams, int)>
		return zzaD.execute(httpurirequest);
	//   23   47:aload_0         
	//   24   48:getfield        #18  <Field HttpClient zzaD>
	//   25   51:aload           4
	//   26   53:invokeinterface #170 <Method HttpResponse HttpClient.execute(HttpUriRequest)>
	//   27   58:areturn         
	}

	protected final HttpClient zzaD;
}
