// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.*;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.internal.Validate;
import java.util.*;

// Referenced classes of package com.facebook.places.internal:
//			BleScanner, BluetoothScanResult, LocationPackageRequestParams, ScannerException

public class BleScannerImpl
	implements BleScanner
{
	private class ScanCallBackImpl extends ScanCallback
	{

		public void onBatchScanResults(List list)
		{
			super.onBatchScanResults(list);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void ScanCallback.onBatchScanResults(List)>
			List list1 = scanResults;
		//    3    5:aload_0         
		//    4    6:getfield        #13  <Field BleScannerImpl this$0>
		//    5    9:invokestatic    #30  <Method List BleScannerImpl.access$300(BleScannerImpl)>
		//    6   12:astore_2        
			list1;
		//    7   13:aload_2         
			JVM INSTR monitorenter ;
		//    8   14:monitorenter    
			list = ((List) (list.iterator()));
		//    9   15:aload_1         
		//   10   16:invokeinterface #36  <Method Iterator List.iterator()>
		//   11   21:astore_1        
_L1:
			BluetoothScanResult bluetoothscanresult;
			do
			{
				if(!((Iterator) (list)).hasNext())
					break MISSING_BLOCK_LABEL_65;
		//   12   22:aload_1         
		//   13   23:invokeinterface #42  <Method boolean Iterator.hasNext()>
		//   14   28:ifeq            65
				bluetoothscanresult = BleScannerImpl.newBluetoothScanResult((ScanResult)((Iterator) (list)).next());
		//   15   31:aload_1         
		//   16   32:invokeinterface #46  <Method Object Iterator.next()>
		//   17   37:checkcast       #48  <Class ScanResult>
		//   18   40:invokestatic    #52  <Method BluetoothScanResult BleScannerImpl.access$400(ScanResult)>
		//   19   43:astore_3        
			} while(bluetoothscanresult == null);
		//   20   44:aload_3         
		//   21   45:ifnull          22
			scanResults.add(((Object) (bluetoothscanresult)));
		//   22   48:aload_0         
		//   23   49:getfield        #13  <Field BleScannerImpl this$0>
		//   24   52:invokestatic    #30  <Method List BleScannerImpl.access$300(BleScannerImpl)>
		//   25   55:aload_3         
		//   26   56:invokeinterface #56  <Method boolean List.add(Object)>
		//   27   61:pop             
			  goto _L1
		//*  28   62:goto            22
			list1;
		//   29   65:aload_2         
			JVM INSTR monitorexit ;
		//   30   66:monitorexit     
			return;
		//   31   67:return          
			list;
		//   32   68:astore_1        
			list1;
		//   33   69:aload_2         
			JVM INSTR monitorexit ;
		//   34   70:monitorexit     
			try
			{
				throw list;
		//   35   71:aload_1         
		//   36   72:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(List list)
		//*  37   73:astore_1        
			{
				BleScannerImpl.logException("Exception in ble scan callback", ((Exception) (list)));
		//   38   74:ldc1            #58  <String "Exception in ble scan callback">
		//   39   76:aload_1         
		//   40   77:invokestatic    #62  <Method void BleScannerImpl.access$100(String, Exception)>
			}
			return;
		//   41   80:return          
		}

		public void onScanFailed(int i)
		{
			super.onScanFailed(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #68  <Method void ScanCallback.onScanFailed(int)>
			errorCode = i;
		//    3    5:aload_0         
		//    4    6:getfield        #13  <Field BleScannerImpl this$0>
		//    5    9:iload_1         
		//    6   10:invokestatic    #72  <Method int BleScannerImpl.access$202(BleScannerImpl, int)>
		//    7   13:pop             
		//    8   14:return          
		}

		public void onScanResult(int i, ScanResult scanresult)
		{
			super.onScanResult(i, scanresult);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #76  <Method void ScanCallback.onScanResult(int, ScanResult)>
			List list = scanResults;
		//    4    6:aload_0         
		//    5    7:getfield        #13  <Field BleScannerImpl this$0>
		//    6   10:invokestatic    #30  <Method List BleScannerImpl.access$300(BleScannerImpl)>
		//    7   13:astore_3        
			list;
		//    8   14:aload_3         
			JVM INSTR monitorenter ;
		//    9   15:monitorenter    
			scanresult = ((ScanResult) (BleScannerImpl.newBluetoothScanResult(scanresult)));
		//   10   16:aload_2         
		//   11   17:invokestatic    #52  <Method BluetoothScanResult BleScannerImpl.access$400(ScanResult)>
		//   12   20:astore_2        
			if(scanresult == null)
				break MISSING_BLOCK_LABEL_39;
		//   13   21:aload_2         
		//   14   22:ifnull          39
			scanResults.add(((Object) (scanresult)));
		//   15   25:aload_0         
		//   16   26:getfield        #13  <Field BleScannerImpl this$0>
		//   17   29:invokestatic    #30  <Method List BleScannerImpl.access$300(BleScannerImpl)>
		//   18   32:aload_2         
		//   19   33:invokeinterface #56  <Method boolean List.add(Object)>
		//   20   38:pop             
			list;
		//   21   39:aload_3         
			JVM INSTR monitorexit ;
		//   22   40:monitorexit     
			return;
		//   23   41:return          
			scanresult;
		//   24   42:astore_2        
			list;
		//   25   43:aload_3         
			JVM INSTR monitorexit ;
		//   26   44:monitorexit     
			try
			{
				throw scanresult;
		//   27   45:aload_2         
		//   28   46:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(ScanResult scanresult)
		//*  29   47:astore_2        
			{
				BleScannerImpl.logException("Exception in ble scan callback", ((Exception) (scanresult)));
		//   30   48:ldc1            #58  <String "Exception in ble scan callback">
		//   31   50:aload_2         
		//   32   51:invokestatic    #62  <Method void BleScannerImpl.access$100(String, Exception)>
			}
			return;
		//   33   54:return          
		}

		final BleScannerImpl this$0;

		private ScanCallBackImpl()
		{
			this$0 = BleScannerImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field BleScannerImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void ScanCallback()>
		//    5    9:return          
		}

	}


	BleScannerImpl(Context context1, LocationPackageRequestParams locationpackagerequestparams)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #66  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #67  <Method void ArrayList()>
	//    6   12:putfield        #69  <Field List scanResults>
		context = context1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #71  <Field Context context>
		params = locationpackagerequestparams;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #73  <Field LocationPackageRequestParams params>
	//   13   25:return          
	}

	private static String formatPayload(byte abyte0[])
	{
		if(abyte0 != null && abyte0.length != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
	//*   5    9:goto            21
			return toHexString(abyte0, getPayloadLength(abyte0));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokestatic    #95  <Method int getPayloadLength(byte[])>
	//    9   17:invokestatic    #99  <Method String toHexString(byte[], int)>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	private static byte[] fromHexString(String s)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method int String.length()>
	//    2    4:istore_2        
		byte abyte0[] = new byte[j / 2];
	//    3    5:iload_2         
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:newarray        byte[]
	//    7   10:astore_3        
		for(int i = 0; i < j; i += 2)
	//*   8   11:iconst_0        
	//*   9   12:istore_1        
	//*  10   13:iload_1         
	//*  11   14:iload_2         
	//*  12   15:icmpge          56
			abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
	//   13   18:aload_3         
	//   14   19:iload_1         
	//   15   20:iconst_2        
	//   16   21:idiv            
	//   17   22:aload_0         
	//   18   23:iload_1         
	//   19   24:invokevirtual   #109 <Method char String.charAt(int)>
	//   20   27:bipush          16
	//   21   29:invokestatic    #115 <Method int Character.digit(char, int)>
	//   22   32:iconst_4        
	//   23   33:ishl            
	//   24   34:aload_0         
	//   25   35:iload_1         
	//   26   36:iconst_1        
	//   27   37:iadd            
	//   28   38:invokevirtual   #109 <Method char String.charAt(int)>
	//   29   41:bipush          16
	//   30   43:invokestatic    #115 <Method int Character.digit(char, int)>
	//   31   46:iadd            
	//   32   47:int2byte        
	//   33   48:bastore         

	//   34   49:iload_1         
	//   35   50:iconst_2        
	//   36   51:iadd            
	//   37   52:istore_1        
	//*  38   53:goto            13
		return abyte0;
	//   39   56:aload_3         
	//   40   57:areturn         
	}

	private static int getPayloadLength(byte abyte0[])
	{
		byte byte0;
		for(int i = 0; i < abyte0.length; i += byte0 + 1)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpge          34
		{
			byte0 = abyte0[i];
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:baload          
	//    9   11:istore_2        
			if(byte0 == 0)
	//*  10   12:iload_2         
	//*  11   13:ifne            18
				return i;
	//   12   16:iload_1         
	//   13   17:ireturn         
			if(byte0 < 0)
	//*  14   18:iload_2         
	//*  15   19:ifge            25
				return abyte0.length;
	//   16   22:aload_0         
	//   17   23:arraylength     
	//   18   24:ireturn         
		}

	//   19   25:iload_1         
	//   20   26:iload_2         
	//   21   27:iconst_1        
	//   22   28:iadd            
	//   23   29:iadd            
	//   24   30:istore_1        
	//*  25   31:goto            2
		return abyte0.length;
	//   26   34:aload_0         
	//   27   35:arraylength     
	//   28   36:ireturn         
	}

	private static boolean isAdvPacketBeacon(byte abyte0[], int i)
	{
		int j = i + 1;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore_2        
		if(isArrayContained(abyte0, j, IBEACON_PREFIX))
	//*   4    4:aload_0         
	//*   5    5:iload_2         
	//*   6    6:getstatic       #51  <Field byte[] IBEACON_PREFIX>
	//*   7    9:invokestatic    #121 <Method boolean isArrayContained(byte[], int, byte[])>
	//*   8   12:ifeq            17
			return true;
	//    9   15:iconst_1        
	//   10   16:ireturn         
		if(isArrayContained(abyte0, j, EDDYSTONE_PREFIX))
	//*  11   17:aload_0         
	//*  12   18:iload_2         
	//*  13   19:getstatic       #55  <Field byte[] EDDYSTONE_PREFIX>
	//*  14   22:invokestatic    #121 <Method boolean isArrayContained(byte[], int, byte[])>
	//*  15   25:ifeq            30
			return true;
	//   16   28:iconst_1        
	//   17   29:ireturn         
		if(isArrayContained(abyte0, i, GRAVITY_PREFIX))
	//*  18   30:aload_0         
	//*  19   31:iload_1         
	//*  20   32:getstatic       #59  <Field byte[] GRAVITY_PREFIX>
	//*  21   35:invokestatic    #121 <Method boolean isArrayContained(byte[], int, byte[])>
	//*  22   38:ifeq            43
			return true;
	//   23   41:iconst_1        
	//   24   42:ireturn         
		return isAltBeacon(abyte0, i);
	//   25   43:aload_0         
	//   26   44:iload_1         
	//   27   45:invokestatic    #124 <Method boolean isAltBeacon(byte[], int)>
	//   28   48:ifeq            53
	//   29   51:iconst_1        
	//   30   52:ireturn         
	//   31   53:iconst_0        
	//   32   54:ireturn         
	}

	private static boolean isAltBeacon(byte abyte0[], int i)
	{
		int j = i + 5;
	//    0    0:iload_1         
	//    1    1:iconst_5        
	//    2    2:iadd            
	//    3    3:istore_2        
		int k = abyte0.length;
	//    4    4:aload_0         
	//    5    5:arraylength     
	//    6    6:istore_3        
		boolean flag1 = false;
	//    7    7:iconst_0        
	//    8    8:istore          6
		if(j < k)
	//*   9   10:iload_2         
	//*  10   11:iload_3         
	//*  11   12:icmpge          82
		{
			byte byte0 = abyte0[i];
	//   12   15:aload_0         
	//   13   16:iload_1         
	//   14   17:baload          
	//   15   18:istore_3        
			byte byte1 = abyte0[i + 1];
	//   16   19:aload_0         
	//   17   20:iload_1         
	//   18   21:iconst_1        
	//   19   22:iadd            
	//   20   23:baload          
	//   21   24:istore          4
			i = ((int) (abyte0[i + 4]));
	//   22   26:aload_0         
	//   23   27:iload_1         
	//   24   28:iconst_4        
	//   25   29:iadd            
	//   26   30:baload          
	//   27   31:istore_1        
			j = ((int) (abyte0[j]));
	//   28   32:aload_0         
	//   29   33:iload_2         
	//   30   34:baload          
	//   31   35:istore_2        
			boolean flag = flag1;
	//   32   36:iload           6
	//   33   38:istore          5
			if(byte0 == 27)
	//*  34   40:iload_3         
	//*  35   41:bipush          27
	//*  36   43:icmpne          79
			{
				flag = flag1;
	//   37   46:iload           6
	//   38   48:istore          5
				if(byte1 == -1)
	//*  39   50:iload           4
	//*  40   52:iconst_m1       
	//*  41   53:icmpne          79
				{
					flag = flag1;
	//   42   56:iload           6
	//   43   58:istore          5
					if(i == -66)
	//*  44   60:iload_1         
	//*  45   61:bipush          -66
	//*  46   63:icmpne          79
					{
						flag = flag1;
	//   47   66:iload           6
	//   48   68:istore          5
						if(j == -84)
	//*  49   70:iload_2         
	//*  50   71:bipush          -84
	//*  51   73:icmpne          79
							flag = true;
	//   52   76:iconst_1        
	//   53   77:istore          5
					}
				}
			}
			return flag;
	//   54   79:iload           5
	//   55   81:ireturn         
		} else
		{
			return false;
	//   56   82:iconst_0        
	//   57   83:ireturn         
		}
	}

	private static boolean isArrayContained(byte abyte0[], int i, byte abyte1[])
	{
		int k = abyte1.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          4
		if(i + k > abyte0.length)
	//*   3    4:iload_1         
	//*   4    5:iload           4
	//*   5    7:iadd            
	//*   6    8:aload_0         
	//*   7    9:arraylength     
	//*   8   10:icmple          15
			return false;
	//    9   13:iconst_0        
	//   10   14:ireturn         
		for(int j = 0; j < k; j++)
	//*  11   15:iconst_0        
	//*  12   16:istore_3        
	//*  13   17:iload_3         
	//*  14   18:iload           4
	//*  15   20:icmpge          43
			if(abyte0[i + j] != abyte1[j])
	//*  16   23:aload_0         
	//*  17   24:iload_1         
	//*  18   25:iload_3         
	//*  19   26:iadd            
	//*  20   27:baload          
	//*  21   28:aload_2         
	//*  22   29:iload_3         
	//*  23   30:baload          
	//*  24   31:icmpeq          36
				return false;
	//   25   34:iconst_0        
	//   26   35:ireturn         

	//   27   36:iload_3         
	//   28   37:iconst_1        
	//   29   38:iadd            
	//   30   39:istore_3        
	//*  31   40:goto            17
		return true;
	//   32   43:iconst_1        
	//   33   44:ireturn         
	}

	private static boolean isBeacon(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int k = abyte0.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_3        
		int j;
		for(int i = 0; i < k; i = j)
	//*   7    9:iconst_0        
	//*   8   10:istore_1        
	//*   9   11:iload_1         
	//*  10   12:iload_3         
	//*  11   13:icmpge          54
		{
			j = ((int) (abyte0[i]));
	//   12   16:aload_0         
	//   13   17:iload_1         
	//   14   18:baload          
	//   15   19:istore_2        
			if(j <= 0)
	//*  16   20:iload_2         
	//*  17   21:ifgt            26
				return false;
	//   18   24:iconst_0        
	//   19   25:ireturn         
			j = j + 1 + i;
	//   20   26:iload_2         
	//   21   27:iconst_1        
	//   22   28:iadd            
	//   23   29:iload_1         
	//   24   30:iadd            
	//   25   31:istore_2        
			if(j > k)
	//*  26   32:iload_2         
	//*  27   33:iload_3         
	//*  28   34:icmple          39
				return false;
	//   29   37:iconst_0        
	//   30   38:ireturn         
			if(isAdvPacketBeacon(abyte0, i))
	//*  31   39:aload_0         
	//*  32   40:iload_1         
	//*  33   41:invokestatic    #128 <Method boolean isAdvPacketBeacon(byte[], int)>
	//*  34   44:ifeq            49
				return true;
	//   35   47:iconst_1        
	//   36   48:ireturn         
		}

	//   37   49:iload_2         
	//   38   50:istore_1        
	//*  39   51:goto            11
		return false;
	//   40   54:iconst_0        
	//   41   55:ireturn         
	}

	private static void logException(String s, Exception exception)
	{
		if(FacebookSdk.isDebugEnabled())
	//*   0    0:invokestatic    #134 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   1    3:ifeq            14
			Log.e("BleScannerImpl", s, ((Throwable) (exception)));
	//    2    6:ldc1            #24  <String "BleScannerImpl">
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #140 <Method int Log.e(String, String, Throwable)>
	//    6   13:pop             
	//    7   14:return          
	}

	private static BluetoothScanResult newBluetoothScanResult(ScanResult scanresult)
	{
		ScanRecord scanrecord = scanresult.getScanRecord();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method ScanRecord ScanResult.getScanRecord()>
	//    2    4:astore_1        
		if(isBeacon(scanrecord.getBytes()))
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #152 <Method byte[] ScanRecord.getBytes()>
	//*   5    9:invokestatic    #154 <Method boolean isBeacon(byte[])>
	//*   6   12:ifeq            38
			return new BluetoothScanResult(formatPayload(scanrecord.getBytes()), scanresult.getRssi(), scanresult.getTimestampNanos());
	//    7   15:new             #156 <Class BluetoothScanResult>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokevirtual   #152 <Method byte[] ScanRecord.getBytes()>
	//   11   23:invokestatic    #158 <Method String formatPayload(byte[])>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #161 <Method int ScanResult.getRssi()>
	//   14   30:aload_0         
	//   15   31:invokevirtual   #165 <Method long ScanResult.getTimestampNanos()>
	//   16   34:invokespecial   #168 <Method void BluetoothScanResult(String, int, long)>
	//   17   37:areturn         
		else
			return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
	}

	private static String toHexString(byte abyte0[], int i)
	{
		int j;
		StringBuffer stringbuffer;
label0:
		{
			stringbuffer = new StringBuffer();
	//    0    0:new             #170 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #171 <Method void StringBuffer()>
	//    3    7:astore_3        
			if(i >= 0)
	//*   4    8:iload_1         
	//*   5    9:iflt            20
			{
				j = i;
	//    6   12:iload_1         
	//    7   13:istore_2        
				if(i <= abyte0.length)
					break label0;
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:arraylength     
	//   11   17:icmple          23
			}
			j = abyte0.length;
	//   12   20:aload_0         
	//   13   21:arraylength     
	//   14   22:istore_2        
		}
		for(i = 0; i < j; i++)
	//*  15   23:iconst_0        
	//*  16   24:istore_1        
	//*  17   25:iload_1         
	//*  18   26:iload_2         
	//*  19   27:icmpge          60
			stringbuffer.append(String.format("%02x", new Object[] {
				Byte.valueOf(abyte0[i])
			}));
	//   20   30:aload_3         
	//   21   31:ldc1            #173 <String "%02x">
	//   22   33:iconst_1        
	//   23   34:anewarray       Object[]
	//   24   37:dup             
	//   25   38:iconst_0        
	//   26   39:aload_0         
	//   27   40:iload_1         
	//   28   41:baload          
	//   29   42:invokestatic    #179 <Method Byte Byte.valueOf(byte)>
	//   30   45:aastore         
	//   31   46:invokestatic    #183 <Method String String.format(String, Object[])>
	//   32   49:invokevirtual   #187 <Method StringBuffer StringBuffer.append(String)>
	//   33   52:pop             

	//   34   53:iload_1         
	//   35   54:iconst_1        
	//   36   55:iadd            
	//   37   56:istore_1        
	//*  38   57:goto            25
		return stringbuffer.toString();
	//   39   60:aload_3         
	//   40   61:invokevirtual   #191 <Method String StringBuffer.toString()>
	//   41   64:areturn         
	}

	private void waitForMainLooper(long l)
	{
		synchronized(new Object())
	//*   0    0:new             #4   <Class Object>
	//*   1    3:dup             
	//*   2    4:invokespecial   #64  <Method void Object()>
	//*   3    7:astore_3        
	//*   4    8:aload_3         
	//*   5    9:monitorenter    
		{
			(new Handler(Looper.getMainLooper())).post(new Runnable() {

				public void run()
				{
					synchronized(lock)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field Object val$lock>
				//*   2    4:astore_1        
				//*   3    5:aload_1         
				//*   4    6:monitorenter    
					{
						lock.notify();
				//    5    7:aload_0         
				//    6    8:getfield        #21  <Field Object val$lock>
				//    7   11:invokevirtual   #31  <Method void Object.notify()>
					}
				//    8   14:aload_1         
				//    9   15:monitorexit     
					return;
				//   10   16:return          
					exception3;
				//   11   17:astore_2        
					obj;
				//   12   18:aload_1         
					JVM INSTR monitorexit ;
				//   13   19:monitorexit     
					try
					{
						throw exception3;
				//   14   20:aload_2         
				//   15   21:athrow          
					}
					catch(Exception exception2)
				//*  16   22:astore_1        
					{
						BleScannerImpl.logException("Exception waiting for main looper", exception2);
				//   17   23:ldc1            #33  <String "Exception waiting for main looper">
				//   18   25:aload_1         
				//   19   26:invokestatic    #37  <Method void BleScannerImpl.access$100(String, Exception)>
					}
					return;
				//   20   29:return          
				}

				final BleScannerImpl this$0;
				final Object val$lock;

			
			{
				this$0 = BleScannerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BleScannerImpl this$0>
				lock = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Object val$lock>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   10:new             #197 <Class Handler>
	//    7   13:dup             
	//    8   14:invokestatic    #203 <Method Looper Looper.getMainLooper()>
	//    9   17:invokespecial   #206 <Method void Handler(Looper)>
	//   10   20:new             #8   <Class BleScannerImpl$1>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_3         
	//   14   26:invokespecial   #209 <Method void BleScannerImpl$1(BleScannerImpl, Object)>
	//   15   29:invokevirtual   #213 <Method boolean Handler.post(Runnable)>
	//   16   32:pop             
			lock.wait(l);
	//   17   33:aload_3         
	//   18   34:lload_1         
	//   19   35:invokevirtual   #216 <Method void Object.wait(long)>
		}
	//   20   38:aload_3         
	//   21   39:monitorexit     
		return;
	//   22   40:return          
		exception1;
	//   23   41:astore          4
		lock;
	//   24   43:aload_3         
		JVM INSTR monitorexit ;
	//   25   44:monitorexit     
		try
		{
			throw exception1;
	//   26   45:aload           4
	//   27   47:athrow          
		}
		catch(Exception exception)
	//*  28   48:astore_3        
		{
			logException("Exception waiting for main looper", exception);
	//   29   49:ldc1            #218 <String "Exception waiting for main looper">
	//   30   51:aload_3         
	//   31   52:invokestatic    #78  <Method void logException(String, Exception)>
		}
		return;
	//   32   55:return          
	}

	public int getErrorCode()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = errorCode;
	//    2    2:aload_0         
	//    3    3:getfield        #82  <Field int errorCode>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return i;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public List getScanResults()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		List list = scanResults;
	//    2    2:aload_0         
	//    3    3:getfield        #69  <Field List scanResults>
	//    4    6:astore_3        
		list;
	//    5    7:aload_3         
		JVM INSTR monitorenter ;
	//    6    8:monitorenter    
		ArrayList arraylist;
		int i = params.getBluetoothMaxScanResults();
	//    7    9:aload_0         
	//    8   10:getfield        #73  <Field LocationPackageRequestParams params>
	//    9   13:invokevirtual   #226 <Method int LocationPackageRequestParams.getBluetoothMaxScanResults()>
	//   10   16:istore_1        
		if(scanResults.size() > i)
	//*  11   17:aload_0         
	//*  12   18:getfield        #69  <Field List scanResults>
	//*  13   21:invokeinterface #231 <Method int List.size()>
	//*  14   26:iload_1         
	//*  15   27:icmple          79
		{
			arraylist = new ArrayList(i);
	//   16   30:new             #66  <Class ArrayList>
	//   17   33:dup             
	//   18   34:iload_1         
	//   19   35:invokespecial   #234 <Method void ArrayList(int)>
	//   20   38:astore_2        
			Comparator comparator = new Comparator() {

				public int compare(BluetoothScanResult bluetoothscanresult, BluetoothScanResult bluetoothscanresult1)
				{
					return bluetoothscanresult1.rssi - bluetoothscanresult.rssi;
				//    0    0:aload_2         
				//    1    1:getfield        #30  <Field int BluetoothScanResult.rssi>
				//    2    4:aload_1         
				//    3    5:getfield        #30  <Field int BluetoothScanResult.rssi>
				//    4    8:isub            
				//    5    9:ireturn         
				}

				public volatile int compare(Object obj, Object obj1)
				{
					return compare((BluetoothScanResult)obj, (BluetoothScanResult)obj1);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #26  <Class BluetoothScanResult>
				//    3    5:aload_2         
				//    4    6:checkcast       #26  <Class BluetoothScanResult>
				//    5    9:invokevirtual   #33  <Method int compare(BluetoothScanResult, BluetoothScanResult)>
				//    6   12:ireturn         
				}

				final BleScannerImpl this$0;

			
			{
				this$0 = BleScannerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field BleScannerImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   21   39:new             #10  <Class BleScannerImpl$2>
	//   22   42:dup             
	//   23   43:aload_0         
	//   24   44:invokespecial   #237 <Method void BleScannerImpl$2(BleScannerImpl)>
	//   25   47:astore          4
			Collections.sort(scanResults, comparator);
	//   26   49:aload_0         
	//   27   50:getfield        #69  <Field List scanResults>
	//   28   53:aload           4
	//   29   55:invokestatic    #243 <Method void Collections.sort(List, Comparator)>
			((List) (arraylist)).addAll(((java.util.Collection) (scanResults.subList(0, i))));
	//   30   58:aload_2         
	//   31   59:aload_0         
	//   32   60:getfield        #69  <Field List scanResults>
	//   33   63:iconst_0        
	//   34   64:iload_1         
	//   35   65:invokeinterface #247 <Method List List.subList(int, int)>
	//   36   70:invokeinterface #251 <Method boolean List.addAll(java.util.Collection)>
	//   37   75:pop             
			break MISSING_BLOCK_LABEL_107;
	//   38   76:goto            107
		}
		arraylist = new ArrayList(scanResults.size());
	//   39   79:new             #66  <Class ArrayList>
	//   40   82:dup             
	//   41   83:aload_0         
	//   42   84:getfield        #69  <Field List scanResults>
	//   43   87:invokeinterface #231 <Method int List.size()>
	//   44   92:invokespecial   #234 <Method void ArrayList(int)>
	//   45   95:astore_2        
		((List) (arraylist)).addAll(((java.util.Collection) (scanResults)));
	//   46   96:aload_2         
	//   47   97:aload_0         
	//   48   98:getfield        #69  <Field List scanResults>
	//   49  101:invokeinterface #251 <Method boolean List.addAll(java.util.Collection)>
	//   50  106:pop             
		list;
	//   51  107:aload_3         
		JVM INSTR monitorexit ;
	//   52  108:monitorexit     
		this;
	//   53  109:aload_0         
		JVM INSTR monitorexit ;
	//   54  110:monitorexit     
		return ((List) (arraylist));
	//   55  111:aload_2         
	//   56  112:areturn         
		Exception exception;
		exception;
	//   57  113:astore_2        
		list;
	//   58  114:aload_3         
		JVM INSTR monitorexit ;
	//   59  115:monitorexit     
		throw exception;
	//   60  116:aload_2         
	//   61  117:athrow          
		exception;
	//   62  118:astore_2        
		this;
	//   63  119:aload_0         
		JVM INSTR monitorexit ;
	//   64  120:monitorexit     
		throw exception;
	//   65  121:aload_2         
	//   66  122:athrow          
	}

	public void initAndCheckEligibility()
		throws ScannerException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		BluetoothLeScanner bluetoothlescanner;
		if(android.os.Build.VERSION.SDK_INT < 21)
			break MISSING_BLOCK_LABEL_121;
	//    2    2:getstatic       #261 <Field int android.os.Build$VERSION.SDK_INT>
	//    3    5:bipush          21
	//    4    7:icmplt          121
		if(!Validate.hasBluetoothPermission(context))
			break MISSING_BLOCK_LABEL_110;
	//    5   10:aload_0         
	//    6   11:getfield        #71  <Field Context context>
	//    7   14:invokestatic    #267 <Method boolean Validate.hasBluetoothPermission(Context)>
	//    8   17:ifeq            110
		if(!Validate.hasLocationPermission(context))
			break MISSING_BLOCK_LABEL_99;
	//    9   20:aload_0         
	//   10   21:getfield        #71  <Field Context context>
	//   11   24:invokestatic    #270 <Method boolean Validate.hasLocationPermission(Context)>
	//   12   27:ifeq            99
		bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	//   13   30:aload_0         
	//   14   31:invokestatic    #276 <Method BluetoothAdapter BluetoothAdapter.getDefaultAdapter()>
	//   15   34:putfield        #278 <Field BluetoothAdapter bluetoothAdapter>
		if(bluetoothAdapter == null || !bluetoothAdapter.isEnabled())
			break MISSING_BLOCK_LABEL_88;
	//   16   37:aload_0         
	//   17   38:getfield        #278 <Field BluetoothAdapter bluetoothAdapter>
	//   18   41:ifnull          88
	//   19   44:aload_0         
	//   20   45:getfield        #278 <Field BluetoothAdapter bluetoothAdapter>
	//   21   48:invokevirtual   #281 <Method boolean BluetoothAdapter.isEnabled()>
	//   22   51:ifeq            88
		bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
	//   23   54:aload_0         
	//   24   55:aload_0         
	//   25   56:getfield        #278 <Field BluetoothAdapter bluetoothAdapter>
	//   26   59:invokevirtual   #285 <Method BluetoothLeScanner BluetoothAdapter.getBluetoothLeScanner()>
	//   27   62:putfield        #287 <Field BluetoothLeScanner bluetoothLeScanner>
		bluetoothlescanner = bluetoothLeScanner;
	//   28   65:aload_0         
	//   29   66:getfield        #287 <Field BluetoothLeScanner bluetoothLeScanner>
	//   30   69:astore_1        
		if(bluetoothlescanner == null)
			break MISSING_BLOCK_LABEL_77;
	//   31   70:aload_1         
	//   32   71:ifnull          77
		this;
	//   33   74:aload_0         
		JVM INSTR monitorexit ;
	//   34   75:monitorexit     
		return;
	//   35   76:return          
		throw new ScannerException(ScannerException.Type.UNKNOWN_ERROR);
	//   36   77:new             #256 <Class ScannerException>
	//   37   80:dup             
	//   38   81:getstatic       #293 <Field ScannerException$Type ScannerException$Type.UNKNOWN_ERROR>
	//   39   84:invokespecial   #296 <Method void ScannerException(ScannerException$Type)>
	//   40   87:athrow          
		throw new ScannerException(ScannerException.Type.DISABLED);
	//   41   88:new             #256 <Class ScannerException>
	//   42   91:dup             
	//   43   92:getstatic       #299 <Field ScannerException$Type ScannerException$Type.DISABLED>
	//   44   95:invokespecial   #296 <Method void ScannerException(ScannerException$Type)>
	//   45   98:athrow          
		throw new ScannerException(ScannerException.Type.PERMISSION_DENIED);
	//   46   99:new             #256 <Class ScannerException>
	//   47  102:dup             
	//   48  103:getstatic       #302 <Field ScannerException$Type ScannerException$Type.PERMISSION_DENIED>
	//   49  106:invokespecial   #296 <Method void ScannerException(ScannerException$Type)>
	//   50  109:athrow          
		throw new ScannerException(ScannerException.Type.PERMISSION_DENIED);
	//   51  110:new             #256 <Class ScannerException>
	//   52  113:dup             
	//   53  114:getstatic       #302 <Field ScannerException$Type ScannerException$Type.PERMISSION_DENIED>
	//   54  117:invokespecial   #296 <Method void ScannerException(ScannerException$Type)>
	//   55  120:athrow          
		throw new ScannerException(ScannerException.Type.NOT_SUPPORTED);
	//   56  121:new             #256 <Class ScannerException>
	//   57  124:dup             
	//   58  125:getstatic       #305 <Field ScannerException$Type ScannerException$Type.NOT_SUPPORTED>
	//   59  128:invokespecial   #296 <Method void ScannerException(ScannerException$Type)>
	//   60  131:athrow          
		Exception exception;
		exception;
	//   61  132:astore_1        
		this;
	//   62  133:aload_0         
		JVM INSTR monitorexit ;
	//   63  134:monitorexit     
		throw exception;
	//   64  135:aload_1         
	//   65  136:athrow          
	}

	public void startScanning()
		throws ScannerException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(isScanInProgress) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #309 <Field boolean isScanInProgress>
	//    4    6:ifne            130
_L1:
		scanCallBack = new ScanCallBackImpl();
	//    5    9:aload_0         
	//    6   10:new             #12  <Class BleScannerImpl$ScanCallBackImpl>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:invokespecial   #312 <Method void BleScannerImpl$ScanCallBackImpl(BleScannerImpl, BleScannerImpl$1)>
	//   11   19:putfield        #314 <Field BleScannerImpl$ScanCallBackImpl scanCallBack>
		isScanInProgress = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #309 <Field boolean isScanInProgress>
		errorCode = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #82  <Field int errorCode>
		synchronized(scanResults)
	//*  18   32:aload_0         
	//*  19   33:getfield        #69  <Field List scanResults>
	//*  20   36:astore_1        
	//*  21   37:aload_1         
	//*  22   38:monitorenter    
		{
			scanResults.clear();
	//   23   39:aload_0         
	//   24   40:getfield        #69  <Field List scanResults>
	//   25   43:invokeinterface #317 <Method void List.clear()>
		}
	//   26   48:aload_1         
	//   27   49:monitorexit     
		obj = ((Object) (bluetoothLeScanner));
	//   28   50:aload_0         
	//   29   51:getfield        #287 <Field BluetoothLeScanner bluetoothLeScanner>
	//   30   54:astore_1        
		if(obj == null) goto _L4; else goto _L3
	//   31   55:aload_1         
	//   32   56:ifnull          114
_L3:
		obj = ((Object) (new android.bluetooth.le.ScanSettings.Builder()));
	//   33   59:new             #319 <Class android.bluetooth.le.ScanSettings$Builder>
	//   34   62:dup             
	//   35   63:invokespecial   #320 <Method void android.bluetooth.le.ScanSettings$Builder()>
	//   36   66:astore_1        
		((android.bluetooth.le.ScanSettings.Builder) (obj)).setScanMode(2);
	//   37   67:aload_1         
	//   38   68:iconst_2        
	//   39   69:invokevirtual   #324 <Method android.bluetooth.le.ScanSettings$Builder android.bluetooth.le.ScanSettings$Builder.setScanMode(int)>
	//   40   72:pop             
		((android.bluetooth.le.ScanSettings.Builder) (obj)).setReportDelay(0L);
	//   41   73:aload_1         
	//   42   74:lconst_0        
	//   43   75:invokevirtual   #328 <Method android.bluetooth.le.ScanSettings$Builder android.bluetooth.le.ScanSettings$Builder.setReportDelay(long)>
	//   44   78:pop             
		bluetoothLeScanner.startScan(((List) (null)), ((android.bluetooth.le.ScanSettings.Builder) (obj)).build(), ((ScanCallback) (scanCallBack)));
	//   45   79:aload_0         
	//   46   80:getfield        #287 <Field BluetoothLeScanner bluetoothLeScanner>
	//   47   83:aconst_null     
	//   48   84:aload_1         
	//   49   85:invokevirtual   #332 <Method android.bluetooth.le.ScanSettings android.bluetooth.le.ScanSettings$Builder.build()>
	//   50   88:aload_0         
	//   51   89:getfield        #314 <Field BleScannerImpl$ScanCallBackImpl scanCallBack>
	//   52   92:invokevirtual   #338 <Method void BluetoothLeScanner.startScan(List, android.bluetooth.le.ScanSettings, ScanCallback)>
		isScanInProgress = true;
	//   53   95:aload_0         
	//   54   96:iconst_1        
	//   55   97:putfield        #309 <Field boolean isScanInProgress>
		this;
	//   56  100:aload_0         
		JVM INSTR monitorexit ;
	//   57  101:monitorexit     
		return;
	//   58  102:return          
_L6:
		throw new ScannerException(ScannerException.Type.UNKNOWN_ERROR);
	//   59  103:new             #256 <Class ScannerException>
	//   60  106:dup             
	//   61  107:getstatic       #293 <Field ScannerException$Type ScannerException$Type.UNKNOWN_ERROR>
	//   62  110:invokespecial   #296 <Method void ScannerException(ScannerException$Type)>
	//   63  113:athrow          
_L4:
		throw new ScannerException(ScannerException.Type.UNKNOWN_ERROR);
	//   64  114:new             #256 <Class ScannerException>
	//   65  117:dup             
	//   66  118:getstatic       #293 <Field ScannerException$Type ScannerException$Type.UNKNOWN_ERROR>
	//   67  121:invokespecial   #296 <Method void ScannerException(ScannerException$Type)>
	//   68  124:athrow          
		exception;
	//   69  125:astore_2        
		obj;
	//   70  126:aload_1         
		JVM INSTR monitorexit ;
	//   71  127:monitorexit     
		throw exception;
	//   72  128:aload_2         
	//   73  129:athrow          
_L2:
		throw new ScannerException(ScannerException.Type.SCAN_ALREADY_IN_PROGRESS);
	//   74  130:new             #256 <Class ScannerException>
	//   75  133:dup             
	//   76  134:getstatic       #341 <Field ScannerException$Type ScannerException$Type.SCAN_ALREADY_IN_PROGRESS>
	//   77  137:invokespecial   #296 <Method void ScannerException(ScannerException$Type)>
	//   78  140:athrow          
		Object obj1;
		obj1;
	//   79  141:astore_1        
		this;
	//   80  142:aload_0         
		JVM INSTR monitorexit ;
	//   81  143:monitorexit     
		throw obj1;
	//   82  144:aload_1         
	//   83  145:athrow          
		obj1;
	//   84  146:astore_1        
		if(true) goto _L6; else goto _L5
_L5:
	//*  85  147:goto            103
	}

	public void stopScanning()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		bluetoothLeScanner.flushPendingScanResults(((ScanCallback) (scanCallBack)));
	//    2    2:aload_0         
	//    3    3:getfield        #287 <Field BluetoothLeScanner bluetoothLeScanner>
	//    4    6:aload_0         
	//    5    7:getfield        #314 <Field BleScannerImpl$ScanCallBackImpl scanCallBack>
	//    6   10:invokevirtual   #346 <Method void BluetoothLeScanner.flushPendingScanResults(ScanCallback)>
		bluetoothLeScanner.stopScan(((ScanCallback) (scanCallBack)));
	//    7   13:aload_0         
	//    8   14:getfield        #287 <Field BluetoothLeScanner bluetoothLeScanner>
	//    9   17:aload_0         
	//   10   18:getfield        #314 <Field BleScannerImpl$ScanCallBackImpl scanCallBack>
	//   11   21:invokevirtual   #349 <Method void BluetoothLeScanner.stopScan(ScanCallback)>
		waitForMainLooper(params.getBluetoothFlushResultsTimeoutMs());
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #73  <Field LocationPackageRequestParams params>
	//   15   29:invokevirtual   #352 <Method long LocationPackageRequestParams.getBluetoothFlushResultsTimeoutMs()>
	//   16   32:invokespecial   #354 <Method void waitForMainLooper(long)>
		isScanInProgress = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #309 <Field boolean isScanInProgress>
		this;
	//   20   40:aload_0         
		JVM INSTR monitorexit ;
	//   21   41:monitorexit     
		return;
	//   22   42:return          
		Exception exception;
		exception;
	//   23   43:astore_1        
	//*  24   44:aload_0         
		throw exception;
	//   25   45:monitorexit     
	//   26   46:aload_1         
	//   27   47:athrow          
	}

	private static final byte EDDYSTONE_PREFIX[] = fromHexString("16aafe");
	private static final byte GRAVITY_PREFIX[] = fromHexString("17ffab01");
	private static final byte IBEACON_PREFIX[] = fromHexString("ff4c000215");
	private static final String TAG = "BleScannerImpl";
	private BluetoothAdapter bluetoothAdapter;
	private BluetoothLeScanner bluetoothLeScanner;
	private Context context;
	private int errorCode;
	private boolean isScanInProgress;
	private LocationPackageRequestParams params;
	private ScanCallBackImpl scanCallBack;
	private final List scanResults = new ArrayList();

	static 
	{
	//    0    0:ldc1            #45  <String "ff4c000215">
	//    1    2:invokestatic    #49  <Method byte[] fromHexString(String)>
	//    2    5:putstatic       #51  <Field byte[] IBEACON_PREFIX>
	//    3    8:ldc1            #53  <String "16aafe">
	//    4   10:invokestatic    #49  <Method byte[] fromHexString(String)>
	//    5   13:putstatic       #55  <Field byte[] EDDYSTONE_PREFIX>
	//    6   16:ldc1            #57  <String "17ffab01">
	//    7   18:invokestatic    #49  <Method byte[] fromHexString(String)>
	//    8   21:putstatic       #59  <Field byte[] GRAVITY_PREFIX>
	//*   9   24:return          
	}


/*
	static void access$100(String s, Exception exception)
	{
		logException(s, exception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #78  <Method void logException(String, Exception)>
		return;
	//    3    5:return          
	}

*/


/*
	static int access$202(BleScannerImpl blescannerimpl, int i)
	{
		blescannerimpl.errorCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field int errorCode>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static List access$300(BleScannerImpl blescannerimpl)
	{
		return blescannerimpl.scanResults;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List scanResults>
	//    2    4:areturn         
	}

*/


/*
	static BluetoothScanResult access$400(ScanResult scanresult)
	{
		return newBluetoothScanResult(scanresult);
	//    0    0:aload_0         
	//    1    1:invokestatic    #89  <Method BluetoothScanResult newBluetoothScanResult(ScanResult)>
	//    2    4:areturn         
	}

*/
}
