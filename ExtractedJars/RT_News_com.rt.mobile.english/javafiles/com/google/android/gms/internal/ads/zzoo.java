// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzql, zzpc, zzakk, zzop, 
//			zzakb, zzoz, zzpw, zzoj, 
//			zzlo, zzps

public final class zzoo extends zzql
	implements zzpc
{

	public zzoo(String s, List list, String s1, zzpw zzpw, String s2, double d, 
			String s3, String s4, zzoj zzoj, Bundle bundle, zzlo zzlo, View view, IObjectWrapper iobjectwrapper, 
			String s5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void zzql()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #44  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void Object()>
	//    6   12:putfield        #47  <Field Object mLock>
		zzbhw = s;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #49  <Field String zzbhw>
		zzbhx = list;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #51  <Field List zzbhx>
		zzbhy = s1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #53  <Field String zzbhy>
		zzbhz = zzpw;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #55  <Field zzpw zzbhz>
		zzbia = s2;
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:putfield        #57  <Field String zzbia>
		zzbib = d;
	//   22   42:aload_0         
	//   23   43:dload           6
	//   24   45:putfield        #59  <Field double zzbib>
		zzbic = s3;
	//   25   48:aload_0         
	//   26   49:aload           8
	//   27   51:putfield        #61  <Field String zzbic>
		zzbid = s4;
	//   28   54:aload_0         
	//   29   55:aload           9
	//   30   57:putfield        #63  <Field String zzbid>
		zzbie = zzoj;
	//   31   60:aload_0         
	//   32   61:aload           10
	//   33   63:putfield        #65  <Field zzoj zzbie>
		mExtras = bundle;
	//   34   66:aload_0         
	//   35   67:aload           11
	//   36   69:putfield        #67  <Field Bundle mExtras>
		zzbif = zzlo;
	//   37   72:aload_0         
	//   38   73:aload           12
	//   39   75:putfield        #69  <Field zzlo zzbif>
		zzbig = view;
	//   40   78:aload_0         
	//   41   79:aload           13
	//   42   81:putfield        #71  <Field View zzbig>
		zzbih = iobjectwrapper;
	//   43   84:aload_0         
	//   44   85:aload           14
	//   45   87:putfield        #73  <Field IObjectWrapper zzbih>
		zzbii = s5;
	//   46   90:aload_0         
	//   47   91:aload           15
	//   48   93:putfield        #75  <Field String zzbii>
	//   49   96:return          
	}

	static zzoz zza(zzoo zzoo1, zzoz zzoz1)
	{
		zzoo1.zzbij = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #83  <Field zzoz zzbij>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static zzoz zzb(zzoo zzoo1)
	{
		return zzoo1.zzbij;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field zzoz zzbij>
	//    2    4:areturn         
	}

	public final void destroy()
	{
		zzakk.zzcrm.post(((Runnable) (new zzop(this))));
	//    0    0:getstatic       #92  <Field Handler zzakk.zzcrm>
	//    1    3:new             #94  <Class zzop>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #97  <Method void zzop(zzoo)>
	//    5   11:invokevirtual   #103 <Method boolean Handler.post(Runnable)>
	//    6   14:pop             
		zzbhw = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #49  <Field String zzbhw>
		zzbhx = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #51  <Field List zzbhx>
		zzbhy = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #53  <Field String zzbhy>
		zzbhz = null;
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:putfield        #55  <Field zzpw zzbhz>
		zzbia = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #57  <Field String zzbia>
		zzbib = 0.0D;
	//   22   40:aload_0         
	//   23   41:dconst_0        
	//   24   42:putfield        #59  <Field double zzbib>
		zzbic = null;
	//   25   45:aload_0         
	//   26   46:aconst_null     
	//   27   47:putfield        #61  <Field String zzbic>
		zzbid = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #63  <Field String zzbid>
		zzbie = null;
	//   31   55:aload_0         
	//   32   56:aconst_null     
	//   33   57:putfield        #65  <Field zzoj zzbie>
		mExtras = null;
	//   34   60:aload_0         
	//   35   61:aconst_null     
	//   36   62:putfield        #67  <Field Bundle mExtras>
		mLock = null;
	//   37   65:aload_0         
	//   38   66:aconst_null     
	//   39   67:putfield        #47  <Field Object mLock>
		zzbif = null;
	//   40   70:aload_0         
	//   41   71:aconst_null     
	//   42   72:putfield        #69  <Field zzlo zzbif>
		zzbig = null;
	//   43   75:aload_0         
	//   44   76:aconst_null     
	//   45   77:putfield        #71  <Field View zzbig>
	//   46   80:return          
	}

	public final String getBody()
	{
		return zzbhy;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String zzbhy>
	//    2    4:areturn         
	}

	public final String getCallToAction()
	{
		return zzbia;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String zzbia>
	//    2    4:areturn         
	}

	public final String getCustomTemplateId()
	{
		return "";
	//    0    0:ldc1            #109 <String "">
	//    1    2:areturn         
	}

	public final Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public final String getHeadline()
	{
		return zzbhw;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String zzbhw>
	//    2    4:areturn         
	}

	public final List getImages()
	{
		return zzbhx;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field List zzbhx>
	//    2    4:areturn         
	}

	public final String getMediationAdapterClassName()
	{
		return zzbii;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String zzbii>
	//    2    4:areturn         
	}

	public final String getPrice()
	{
		return zzbid;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String zzbid>
	//    2    4:areturn         
	}

	public final double getStarRating()
	{
		return zzbib;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field double zzbib>
	//    2    4:dreturn         
	}

	public final String getStore()
	{
		return zzbic;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String zzbic>
	//    2    4:areturn         
	}

	public final zzlo getVideoController()
	{
		return zzbif;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field zzlo zzbif>
	//    2    4:areturn         
	}

	public final void performClick(Bundle bundle)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzbij != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #83  <Field zzoz zzbij>
	//    7   11:ifnonnull       22
				zzakb.e("#001 Attempt to perform click before app native ad initialized.");
	//    8   14:ldc1            #126 <String "#001 Attempt to perform click before app native ad initialized.">
	//    9   16:invokestatic    #132 <Method void zzakb.e(String)>
			}
	//   10   19:aload_2         
	//   11   20:monitorexit     
			return;
	//   12   21:return          
		}
		zzbij.performClick(bundle);
	//   13   22:aload_0         
	//   14   23:getfield        #83  <Field zzoz zzbij>
	//   15   26:aload_1         
	//   16   27:invokeinterface #136 <Method void zzoz.performClick(Bundle)>
		obj;
	//   17   32:aload_2         
		JVM INSTR monitorexit ;
	//   18   33:monitorexit     
		return;
	//   19   34:return          
		bundle;
	//   20   35:astore_1        
		obj;
	//   21   36:aload_2         
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		throw bundle;
	//   23   38:aload_1         
	//   24   39:athrow          
	}

	public final boolean recordImpression(Bundle bundle)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(zzbij != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #83  <Field zzoz zzbij>
	//    7   11:ifnonnull       23
				zzakb.e("#002 Attempt to record impression before native ad initialized.");
	//    8   14:ldc1            #140 <String "#002 Attempt to record impression before native ad initialized.">
	//    9   16:invokestatic    #132 <Method void zzakb.e(String)>
			}
	//   10   19:aload_3         
	//   11   20:monitorexit     
			return false;
	//   12   21:iconst_0        
	//   13   22:ireturn         
		}
		boolean flag = zzbij.recordImpression(bundle);
	//   14   23:aload_0         
	//   15   24:getfield        #83  <Field zzoz zzbij>
	//   16   27:aload_1         
	//   17   28:invokeinterface #142 <Method boolean zzoz.recordImpression(Bundle)>
	//   18   33:istore_2        
		obj;
	//   19   34:aload_3         
		JVM INSTR monitorexit ;
	//   20   35:monitorexit     
		return flag;
	//   21   36:iload_2         
	//   22   37:ireturn         
		bundle;
	//   23   38:astore_1        
		obj;
	//   24   39:aload_3         
		JVM INSTR monitorexit ;
	//   25   40:monitorexit     
		throw bundle;
	//   26   41:aload_1         
	//   27   42:athrow          
	}

	public final void reportTouchEvent(Bundle bundle)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzbij != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #83  <Field zzoz zzbij>
	//    7   11:ifnonnull       22
				zzakb.e("#003 Attempt to report touch event before native ad initialized.");
	//    8   14:ldc1            #145 <String "#003 Attempt to report touch event before native ad initialized.">
	//    9   16:invokestatic    #132 <Method void zzakb.e(String)>
			}
	//   10   19:aload_2         
	//   11   20:monitorexit     
			return;
	//   12   21:return          
		}
		zzbij.reportTouchEvent(bundle);
	//   13   22:aload_0         
	//   14   23:getfield        #83  <Field zzoz zzbij>
	//   15   26:aload_1         
	//   16   27:invokeinterface #147 <Method void zzoz.reportTouchEvent(Bundle)>
		obj;
	//   17   32:aload_2         
		JVM INSTR monitorexit ;
	//   18   33:monitorexit     
		return;
	//   19   34:return          
		bundle;
	//   20   35:astore_1        
		obj;
	//   21   36:aload_2         
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		throw bundle;
	//   23   38:aload_1         
	//   24   39:athrow          
	}

	public final void zzb(zzoz zzoz1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzbij = zzoz1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #83  <Field zzoz zzbij>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		zzoz1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw zzoz1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final zzpw zzjz()
	{
		return zzbhz;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field zzpw zzbhz>
	//    2    4:areturn         
	}

	public final IObjectWrapper zzka()
	{
		return ObjectWrapper.wrap(((Object) (zzbij)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field zzoz zzbij>
	//    2    4:invokestatic    #158 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    3    7:areturn         
	}

	public final String zzkb()
	{
		return "2";
	//    0    0:ldc1            #161 <String "2">
	//    1    2:areturn         
	}

	public final zzoj zzkc()
	{
		return zzbie;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field zzoj zzbie>
	//    2    4:areturn         
	}

	public final View zzkd()
	{
		return zzbig;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field View zzbig>
	//    2    4:areturn         
	}

	public final IObjectWrapper zzke()
	{
		return zzbih;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field IObjectWrapper zzbih>
	//    2    4:areturn         
	}

	public final zzps zzkf()
	{
		return ((zzps) (zzbie));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field zzoj zzbie>
	//    2    4:areturn         
	}

	private Bundle mExtras;
	private Object mLock;
	private String zzbhw;
	private List zzbhx;
	private String zzbhy;
	private zzpw zzbhz;
	private String zzbia;
	private double zzbib;
	private String zzbic;
	private String zzbid;
	private zzoj zzbie;
	private zzlo zzbif;
	private View zzbig;
	private IObjectWrapper zzbih;
	private String zzbii;
	private zzoz zzbij;
}
