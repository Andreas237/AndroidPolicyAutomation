// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.*;
import javax.crypto.KeyAgreement;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzayy, zzayu, zzayv

public final class zzayt
{

	private static BigInteger zza(EllipticCurve ellipticcurve)
		throws GeneralSecurityException
	{
		ellipticcurve = ((EllipticCurve) (ellipticcurve.getField()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #14  <Method java.security.spec.ECField EllipticCurve.getField()>
	//    2    4:astore_0        
		if(ellipticcurve instanceof ECFieldFp)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #16  <Class ECFieldFp>
	//*   5    9:ifeq            20
			return ((ECFieldFp)ellipticcurve).getP();
	//    6   12:aload_0         
	//    7   13:checkcast       #16  <Class ECFieldFp>
	//    8   16:invokevirtual   #20  <Method BigInteger ECFieldFp.getP()>
	//    9   19:areturn         
		else
			throw new GeneralSecurityException("Only curves over prime order fields are supported");
	//   10   20:new             #8   <Class GeneralSecurityException>
	//   11   23:dup             
	//   12   24:ldc1            #22  <String "Only curves over prime order fields are supported">
	//   13   26:invokespecial   #26  <Method void GeneralSecurityException(String)>
	//   14   29:athrow          
	}

	public static KeyPair zza(ECParameterSpec ecparameterspec)
		throws GeneralSecurityException
	{
		KeyPairGenerator keypairgenerator = (KeyPairGenerator)zzayy.zzdoe.zzek("EC");
	//    0    0:getstatic       #35  <Field zzayy zzayy.zzdoe>
	//    1    3:ldc1            #37  <String "EC">
	//    2    5:invokevirtual   #41  <Method Object zzayy.zzek(String)>
	//    3    8:checkcast       #43  <Class KeyPairGenerator>
	//    4   11:astore_1        
		keypairgenerator.initialize(((java.security.spec.AlgorithmParameterSpec) (ecparameterspec)));
	//    5   12:aload_1         
	//    6   13:aload_0         
	//    7   14:invokevirtual   #47  <Method void KeyPairGenerator.initialize(java.security.spec.AlgorithmParameterSpec)>
		return keypairgenerator.generateKeyPair();
	//    8   17:aload_1         
	//    9   18:invokevirtual   #51  <Method KeyPair KeyPairGenerator.generateKeyPair()>
	//   10   21:areturn         
	}

	public static ECPublicKey zza(zzayv zzayv1, byte abyte0[], byte abyte1[])
		throws GeneralSecurityException
	{
		zzayv1 = ((zzayv) (zza(zzayv1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #55  <Method ECParameterSpec zza(zzayv)>
	//    2    4:astore_0        
		abyte0 = ((byte []) (new ECPoint(new BigInteger(1, abyte0), new BigInteger(1, abyte1))));
	//    3    5:new             #57  <Class ECPoint>
	//    4    8:dup             
	//    5    9:new             #59  <Class BigInteger>
	//    6   12:dup             
	//    7   13:iconst_1        
	//    8   14:aload_1         
	//    9   15:invokespecial   #62  <Method void BigInteger(int, byte[])>
	//   10   18:new             #59  <Class BigInteger>
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:aload_2         
	//   14   24:invokespecial   #62  <Method void BigInteger(int, byte[])>
	//   15   27:invokespecial   #65  <Method void ECPoint(BigInteger, BigInteger)>
	//   16   30:astore_1        
		zza(((ECPoint) (abyte0)), ((ECParameterSpec) (zzayv1)).getCurve());
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #71  <Method EllipticCurve ECParameterSpec.getCurve()>
	//   20   36:invokestatic    #74  <Method void zza(ECPoint, EllipticCurve)>
		zzayv1 = ((zzayv) (new ECPublicKeySpec(((ECPoint) (abyte0)), ((ECParameterSpec) (zzayv1)))));
	//   21   39:new             #76  <Class ECPublicKeySpec>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:invokespecial   #79  <Method void ECPublicKeySpec(ECPoint, ECParameterSpec)>
	//   26   48:astore_0        
		return (ECPublicKey)((KeyFactory)zzayy.zzdof.zzek("EC")).generatePublic(((java.security.spec.KeySpec) (zzayv1)));
	//   27   49:getstatic       #82  <Field zzayy zzayy.zzdof>
	//   28   52:ldc1            #37  <String "EC">
	//   29   54:invokevirtual   #41  <Method Object zzayy.zzek(String)>
	//   30   57:checkcast       #84  <Class KeyFactory>
	//   31   60:aload_0         
	//   32   61:invokevirtual   #88  <Method java.security.PublicKey KeyFactory.generatePublic(java.security.spec.KeySpec)>
	//   33   64:checkcast       #90  <Class ECPublicKey>
	//   34   67:areturn         
	}

	public static ECParameterSpec zza(zzayv zzayv1)
		throws NoSuchAlgorithmException
	{
		zzayu.zzdnn[zzayv1.ordinal()];
	//    0    0:getstatic       #98  <Field int[] zzayu.zzdnn>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #104 <Method int zzayv.ordinal()>
	//    3    7:iaload          
		JVM INSTR tableswitch 1 3: default 36
	//	               1 129
	//	               2 110
	//	               3 84;
	//    4    8:tableswitch     1 3: default 36
	//	               1 129
	//	               2 110
	//	               3 84
		   goto _L1 _L2 _L3 _L4
_L1:
		zzayv1 = ((zzayv) (String.valueOf(((Object) (zzayv1)))));
	//    5   36:aload_0         
	//    6   37:invokestatic    #110 <Method String String.valueOf(Object)>
	//    7   40:astore_0        
		StringBuilder stringbuilder = new StringBuilder(22 + String.valueOf(((Object) (zzayv1))).length());
	//    8   41:new             #112 <Class StringBuilder>
	//    9   44:dup             
	//   10   45:bipush          22
	//   11   47:aload_0         
	//   12   48:invokestatic    #110 <Method String String.valueOf(Object)>
	//   13   51:invokevirtual   #115 <Method int String.length()>
	//   14   54:iadd            
	//   15   55:invokespecial   #118 <Method void StringBuilder(int)>
	//   16   58:astore_1        
		stringbuilder.append("curve not implemented:");
	//   17   59:aload_1         
	//   18   60:ldc1            #120 <String "curve not implemented:">
	//   19   62:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   20   65:pop             
		stringbuilder.append(((String) (zzayv1)));
	//   21   66:aload_1         
	//   22   67:aload_0         
	//   23   68:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   24   71:pop             
		throw new NoSuchAlgorithmException(stringbuilder.toString());
	//   25   72:new             #92  <Class NoSuchAlgorithmException>
	//   26   75:dup             
	//   27   76:aload_1         
	//   28   77:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   29   80:invokespecial   #129 <Method void NoSuchAlgorithmException(String)>
	//   30   83:athrow          
_L4:
		String s;
		String s1;
		String s2;
		String s3;
		s3 = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";
	//   31   84:ldc1            #131 <String "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151">
	//   32   86:astore          4
		zzayv1 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449";
	//   33   88:ldc1            #133 <String "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449">
	//   34   90:astore_0        
		s = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00";
	//   35   91:ldc1            #135 <String "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00">
	//   36   93:astore_1        
		s1 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66";
	//   37   94:ldc1            #137 <String "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66">
	//   38   96:astore_2        
		s2 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650";
	//   39   97:ldc1            #139 <String "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650">
	//   40   99:astore_3        
_L6:
		return zza(s3, ((String) (zzayv1)), s, s1, s2);
	//   41  100:aload           4
	//   42  102:aload_0         
	//   43  103:aload_1         
	//   44  104:aload_2         
	//   45  105:aload_3         
	//   46  106:invokestatic    #142 <Method ECParameterSpec zza(String, String, String, String, String)>
	//   47  109:areturn         
_L3:
		s3 = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319";
	//   48  110:ldc1            #144 <String "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319">
	//   49  112:astore          4
		zzayv1 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643";
	//   50  114:ldc1            #146 <String "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643">
	//   51  116:astore_0        
		s = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef";
	//   52  117:ldc1            #148 <String "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef">
	//   53  119:astore_1        
		s1 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7";
	//   54  120:ldc1            #150 <String "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7">
	//   55  122:astore_2        
		s2 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f";
	//   56  123:ldc1            #152 <String "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f">
	//   57  125:astore_3        
		continue; /* Loop/switch isn't completed */
	//   58  126:goto            100
_L2:
		s3 = "115792089210356248762697446949407573530086143415290314195533631308867097853951";
	//   59  129:ldc1            #154 <String "115792089210356248762697446949407573530086143415290314195533631308867097853951">
	//   60  131:astore          4
		zzayv1 = "115792089210356248762697446949407573529996955224135760342422259061068512044369";
	//   61  133:ldc1            #156 <String "115792089210356248762697446949407573529996955224135760342422259061068512044369">
	//   62  135:astore_0        
		s = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b";
	//   63  136:ldc1            #158 <String "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b">
	//   64  138:astore_1        
		s1 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296";
	//   65  139:ldc1            #160 <String "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296">
	//   66  141:astore_2        
		s2 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5";
	//   67  142:ldc1            #162 <String "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5">
	//   68  144:astore_3        
		if(true) goto _L6; else goto _L5
	//   69  145:goto            100
_L5:
	}

	private static ECParameterSpec zza(String s, String s1, String s2, String s3, String s4)
	{
		s = ((String) (new BigInteger(s)));
	//    0    0:new             #59  <Class BigInteger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #163 <Method void BigInteger(String)>
	//    4    8:astore_0        
		s1 = ((String) (new BigInteger(s1)));
	//    5    9:new             #59  <Class BigInteger>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #163 <Method void BigInteger(String)>
	//    9   17:astore_1        
		BigInteger biginteger = ((BigInteger) (s)).subtract(new BigInteger("3"));
	//   10   18:aload_0         
	//   11   19:new             #59  <Class BigInteger>
	//   12   22:dup             
	//   13   23:ldc1            #165 <String "3">
	//   14   25:invokespecial   #163 <Method void BigInteger(String)>
	//   15   28:invokevirtual   #169 <Method BigInteger BigInteger.subtract(BigInteger)>
	//   16   31:astore          5
		s2 = ((String) (new BigInteger(s2, 16)));
	//   17   33:new             #59  <Class BigInteger>
	//   18   36:dup             
	//   19   37:aload_2         
	//   20   38:bipush          16
	//   21   40:invokespecial   #172 <Method void BigInteger(String, int)>
	//   22   43:astore_2        
		s3 = ((String) (new BigInteger(s3, 16)));
	//   23   44:new             #59  <Class BigInteger>
	//   24   47:dup             
	//   25   48:aload_3         
	//   26   49:bipush          16
	//   27   51:invokespecial   #172 <Method void BigInteger(String, int)>
	//   28   54:astore_3        
		s4 = ((String) (new BigInteger(s4, 16)));
	//   29   55:new             #59  <Class BigInteger>
	//   30   58:dup             
	//   31   59:aload           4
	//   32   61:bipush          16
	//   33   63:invokespecial   #172 <Method void BigInteger(String, int)>
	//   34   66:astore          4
		return new ECParameterSpec(new EllipticCurve(((java.security.spec.ECField) (new ECFieldFp(((BigInteger) (s))))), biginteger, ((BigInteger) (s2))), new ECPoint(((BigInteger) (s3)), ((BigInteger) (s4))), ((BigInteger) (s1)), 1);
	//   35   68:new             #67  <Class ECParameterSpec>
	//   36   71:dup             
	//   37   72:new             #10  <Class EllipticCurve>
	//   38   75:dup             
	//   39   76:new             #16  <Class ECFieldFp>
	//   40   79:dup             
	//   41   80:aload_0         
	//   42   81:invokespecial   #175 <Method void ECFieldFp(BigInteger)>
	//   43   84:aload           5
	//   44   86:aload_2         
	//   45   87:invokespecial   #178 <Method void EllipticCurve(java.security.spec.ECField, BigInteger, BigInteger)>
	//   46   90:new             #57  <Class ECPoint>
	//   47   93:dup             
	//   48   94:aload_3         
	//   49   95:aload           4
	//   50   97:invokespecial   #65  <Method void ECPoint(BigInteger, BigInteger)>
	//   51  100:aload_1         
	//   52  101:iconst_1        
	//   53  102:invokespecial   #181 <Method void ECParameterSpec(EllipticCurve, ECPoint, BigInteger, int)>
	//   54  105:areturn         
	}

	static void zza(ECPoint ecpoint, EllipticCurve ellipticcurve)
		throws GeneralSecurityException
	{
		BigInteger biginteger = zza(ellipticcurve);
	//    0    0:aload_1         
	//    1    1:invokestatic    #183 <Method BigInteger zza(EllipticCurve)>
	//    2    4:astore_2        
		BigInteger biginteger1 = ecpoint.getAffineX();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #186 <Method BigInteger ECPoint.getAffineX()>
	//    5    9:astore_3        
		ecpoint = ((ECPoint) (ecpoint.getAffineY()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #189 <Method BigInteger ECPoint.getAffineY()>
	//    8   14:astore_0        
		if(biginteger1 != null && ecpoint != null)
	//*   9   15:aload_3         
	//*  10   16:ifnull          139
	//*  11   19:aload_0         
	//*  12   20:ifnonnull       26
	//*  13   23:goto            139
		{
			if(biginteger1.signum() != -1 && biginteger1.compareTo(biginteger) == -1)
	//*  14   26:aload_3         
	//*  15   27:invokevirtual   #192 <Method int BigInteger.signum()>
	//*  16   30:iconst_m1       
	//*  17   31:icmpeq          129
	//*  18   34:aload_3         
	//*  19   35:aload_2         
	//*  20   36:invokevirtual   #196 <Method int BigInteger.compareTo(BigInteger)>
	//*  21   39:iconst_m1       
	//*  22   40:icmpeq          46
	//*  23   43:goto            129
			{
				if(((BigInteger) (ecpoint)).signum() != -1 && ((BigInteger) (ecpoint)).compareTo(biginteger) == -1)
	//*  24   46:aload_0         
	//*  25   47:invokevirtual   #192 <Method int BigInteger.signum()>
	//*  26   50:iconst_m1       
	//*  27   51:icmpeq          119
	//*  28   54:aload_0         
	//*  29   55:aload_2         
	//*  30   56:invokevirtual   #196 <Method int BigInteger.compareTo(BigInteger)>
	//*  31   59:iconst_m1       
	//*  32   60:icmpeq          66
	//*  33   63:goto            119
				{
					if(!((BigInteger) (ecpoint)).multiply(((BigInteger) (ecpoint))).mod(biginteger).equals(((Object) (biginteger1.multiply(biginteger1).add(ellipticcurve.getA()).multiply(biginteger1).add(ellipticcurve.getB()).mod(biginteger)))))
	//*  34   66:aload_0         
	//*  35   67:aload_0         
	//*  36   68:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//*  37   71:aload_2         
	//*  38   72:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//*  39   75:aload_3         
	//*  40   76:aload_3         
	//*  41   77:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//*  42   80:aload_1         
	//*  43   81:invokevirtual   #205 <Method BigInteger EllipticCurve.getA()>
	//*  44   84:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//*  45   87:aload_3         
	//*  46   88:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//*  47   91:aload_1         
	//*  48   92:invokevirtual   #211 <Method BigInteger EllipticCurve.getB()>
	//*  49   95:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//*  50   98:aload_2         
	//*  51   99:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//*  52  102:invokevirtual   #215 <Method boolean BigInteger.equals(Object)>
	//*  53  105:ifne            118
						throw new GeneralSecurityException("Point is not on curve");
	//   54  108:new             #8   <Class GeneralSecurityException>
	//   55  111:dup             
	//   56  112:ldc1            #217 <String "Point is not on curve">
	//   57  114:invokespecial   #26  <Method void GeneralSecurityException(String)>
	//   58  117:athrow          
					else
						return;
	//   59  118:return          
				} else
				{
					throw new GeneralSecurityException("y is out of range");
	//   60  119:new             #8   <Class GeneralSecurityException>
	//   61  122:dup             
	//   62  123:ldc1            #219 <String "y is out of range">
	//   63  125:invokespecial   #26  <Method void GeneralSecurityException(String)>
	//   64  128:athrow          
				}
			} else
			{
				throw new GeneralSecurityException("x is out of range");
	//   65  129:new             #8   <Class GeneralSecurityException>
	//   66  132:dup             
	//   67  133:ldc1            #221 <String "x is out of range">
	//   68  135:invokespecial   #26  <Method void GeneralSecurityException(String)>
	//   69  138:athrow          
			}
		} else
		{
			throw new GeneralSecurityException("point is at infinity");
	//   70  139:new             #8   <Class GeneralSecurityException>
	//   71  142:dup             
	//   72  143:ldc1            #223 <String "point is at infinity">
	//   73  145:invokespecial   #26  <Method void GeneralSecurityException(String)>
	//   74  148:athrow          
		}
	}

	public static byte[] zza(ECPrivateKey ecprivatekey, ECPoint ecpoint)
		throws GeneralSecurityException
	{
label0:
		{
			byte abyte0[];
			BigInteger biginteger2;
label1:
			{
				zza(ecpoint, ecprivatekey.getParams().getCurve());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #230 <Method ECParameterSpec ECPrivateKey.getParams()>
	//    3    7:invokevirtual   #71  <Method EllipticCurve ECParameterSpec.getCurve()>
	//    4   10:invokestatic    #74  <Method void zza(ECPoint, EllipticCurve)>
				Object obj = ((Object) (ecprivatekey.getParams()));
	//    5   13:aload_0         
	//    6   14:invokeinterface #230 <Method ECParameterSpec ECPrivateKey.getParams()>
	//    7   19:astore          4
				((ECParameterSpec) (obj)).getCurve();
	//    8   21:aload           4
	//    9   23:invokevirtual   #71  <Method EllipticCurve ECParameterSpec.getCurve()>
	//   10   26:pop             
				ecpoint = ((ECPoint) (new ECPublicKeySpec(ecpoint, ((ECParameterSpec) (obj)))));
	//   11   27:new             #76  <Class ECPublicKeySpec>
	//   12   30:dup             
	//   13   31:aload_1         
	//   14   32:aload           4
	//   15   34:invokespecial   #79  <Method void ECPublicKeySpec(ECPoint, ECParameterSpec)>
	//   16   37:astore_1        
				ecpoint = ((ECPoint) (KeyFactory.getInstance("EC").generatePublic(((java.security.spec.KeySpec) (ecpoint)))));
	//   17   38:ldc1            #37  <String "EC">
	//   18   40:invokestatic    #234 <Method KeyFactory KeyFactory.getInstance(String)>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #88  <Method java.security.PublicKey KeyFactory.generatePublic(java.security.spec.KeySpec)>
	//   21   47:astore_1        
				obj = ((Object) ((KeyAgreement)zzayy.zzdod.zzek("ECDH")));
	//   22   48:getstatic       #237 <Field zzayy zzayy.zzdod>
	//   23   51:ldc1            #239 <String "ECDH">
	//   24   53:invokevirtual   #41  <Method Object zzayy.zzek(String)>
	//   25   56:checkcast       #241 <Class KeyAgreement>
	//   26   59:astore          4
				((KeyAgreement) (obj)).init(((java.security.Key) (ecprivatekey)));
	//   27   61:aload           4
	//   28   63:aload_0         
	//   29   64:invokevirtual   #245 <Method void KeyAgreement.init(java.security.Key)>
				((KeyAgreement) (obj)).doPhase(((java.security.Key) (ecpoint)), true);
	//   30   67:aload           4
	//   31   69:aload_1         
	//   32   70:iconst_1        
	//   33   71:invokevirtual   #249 <Method java.security.Key KeyAgreement.doPhase(java.security.Key, boolean)>
	//   34   74:pop             
				abyte0 = ((KeyAgreement) (obj)).generateSecret();
	//   35   75:aload           4
	//   36   77:invokevirtual   #253 <Method byte[] KeyAgreement.generateSecret()>
	//   37   80:astore          7
				obj = ((Object) (ecprivatekey.getParams().getCurve()));
	//   38   82:aload_0         
	//   39   83:invokeinterface #230 <Method ECParameterSpec ECPrivateKey.getParams()>
	//   40   88:invokevirtual   #71  <Method EllipticCurve ECParameterSpec.getCurve()>
	//   41   91:astore          4
				ecprivatekey = ((ECPrivateKey) (new BigInteger(1, abyte0)));
	//   42   93:new             #59  <Class BigInteger>
	//   43   96:dup             
	//   44   97:iconst_1        
	//   45   98:aload           7
	//   46  100:invokespecial   #62  <Method void BigInteger(int, byte[])>
	//   47  103:astore_0        
				if(((BigInteger) (ecprivatekey)).signum() == -1 || ((BigInteger) (ecprivatekey)).compareTo(zza(((EllipticCurve) (obj)))) != -1)
	//*  48  104:aload_0         
	//*  49  105:invokevirtual   #192 <Method int BigInteger.signum()>
	//*  50  108:iconst_m1       
	//*  51  109:icmpeq          644
	//*  52  112:aload_0         
	//*  53  113:aload           4
	//*  54  115:invokestatic    #183 <Method BigInteger zza(EllipticCurve)>
	//*  55  118:invokevirtual   #196 <Method int BigInteger.compareTo(BigInteger)>
	//*  56  121:iconst_m1       
	//*  57  122:icmpeq          128
					break label0;
	//   58  125:goto            644
				biginteger2 = zza(((EllipticCurve) (obj)));
	//   59  128:aload           4
	//   60  130:invokestatic    #183 <Method BigInteger zza(EllipticCurve)>
	//   61  133:astore          8
				ecpoint = ((ECPoint) (((EllipticCurve) (obj)).getA()));
	//   62  135:aload           4
	//   63  137:invokevirtual   #205 <Method BigInteger EllipticCurve.getA()>
	//   64  140:astore_1        
				obj = ((Object) (((EllipticCurve) (obj)).getB()));
	//   65  141:aload           4
	//   66  143:invokevirtual   #211 <Method BigInteger EllipticCurve.getB()>
	//   67  146:astore          4
				ecprivatekey = ((ECPrivateKey) (((BigInteger) (ecprivatekey)).multiply(((BigInteger) (ecprivatekey))).add(((BigInteger) (ecpoint))).multiply(((BigInteger) (ecprivatekey))).add(((BigInteger) (obj))).mod(biginteger2)));
	//   68  148:aload_0         
	//   69  149:aload_0         
	//   70  150:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//   71  153:aload_1         
	//   72  154:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//   73  157:aload_0         
	//   74  158:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//   75  161:aload           4
	//   76  163:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//   77  166:aload           8
	//   78  168:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//   79  171:astore_0        
				if(biginteger2.signum() != 1)
	//*  80  172:aload           8
	//*  81  174:invokevirtual   #192 <Method int BigInteger.signum()>
	//*  82  177:iconst_1        
	//*  83  178:icmpeq          192
					throw new InvalidAlgorithmParameterException("p must be positive");
	//   84  181:new             #255 <Class InvalidAlgorithmParameterException>
	//   85  184:dup             
	//   86  185:ldc2            #257 <String "p must be positive">
	//   87  188:invokespecial   #258 <Method void InvalidAlgorithmParameterException(String)>
	//   88  191:athrow          
				BigInteger biginteger3 = ((BigInteger) (ecprivatekey)).mod(biginteger2);
	//   89  192:aload_0         
	//   90  193:aload           8
	//   91  195:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//   92  198:astore          9
				ecpoint = null;
	//   93  200:aconst_null     
	//   94  201:astore_1        
				if(biginteger3.equals(((Object) (BigInteger.ZERO))))
	//*  95  202:aload           9
	//*  96  204:getstatic       #262 <Field BigInteger BigInteger.ZERO>
	//*  97  207:invokevirtual   #215 <Method boolean BigInteger.equals(Object)>
	//*  98  210:ifeq            220
				{
					ecpoint = ((ECPoint) (BigInteger.ZERO));
	//   99  213:getstatic       #262 <Field BigInteger BigInteger.ZERO>
	//  100  216:astore_1        
					break label1;
	//  101  217:goto            620
				}
				if(biginteger2.testBit(0) && biginteger2.testBit(1))
	//* 102  220:aload           8
	//* 103  222:iconst_0        
	//* 104  223:invokevirtual   #266 <Method boolean BigInteger.testBit(int)>
	//* 105  226:ifeq            261
	//* 106  229:aload           8
	//* 107  231:iconst_1        
	//* 108  232:invokevirtual   #266 <Method boolean BigInteger.testBit(int)>
	//* 109  235:ifeq            261
				{
					ecprivatekey = ((ECPrivateKey) (biginteger3.modPow(biginteger2.add(BigInteger.ONE).shiftRight(2), biginteger2)));
	//  110  238:aload           9
	//  111  240:aload           8
	//  112  242:getstatic       #269 <Field BigInteger BigInteger.ONE>
	//  113  245:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//  114  248:iconst_2        
	//  115  249:invokevirtual   #273 <Method BigInteger BigInteger.shiftRight(int)>
	//  116  252:aload           8
	//  117  254:invokevirtual   #277 <Method BigInteger BigInteger.modPow(BigInteger, BigInteger)>
	//  118  257:astore_0        
				} else
	//* 119  258:goto            583
				{
					ecprivatekey = ((ECPrivateKey) (ecpoint));
	//  120  261:aload_1         
	//  121  262:astore_0        
					if(biginteger2.testBit(0))
	//* 122  263:aload           8
	//* 123  265:iconst_0        
	//* 124  266:invokevirtual   #266 <Method boolean BigInteger.testBit(int)>
	//* 125  269:ifeq            583
					{
						ecprivatekey = ((ECPrivateKey) (ecpoint));
	//  126  272:aload_1         
	//  127  273:astore_0        
						if(!biginteger2.testBit(1))
	//* 128  274:aload           8
	//* 129  276:iconst_1        
	//* 130  277:invokevirtual   #266 <Method boolean BigInteger.testBit(int)>
	//* 131  280:ifne            583
						{
							ecprivatekey = ((ECPrivateKey) (BigInteger.ONE));
	//  132  283:getstatic       #269 <Field BigInteger BigInteger.ONE>
	//  133  286:astore_0        
							Object obj1 = ((Object) (biginteger2.subtract(BigInteger.ONE).shiftRight(1)));
	//  134  287:aload           8
	//  135  289:getstatic       #269 <Field BigInteger BigInteger.ONE>
	//  136  292:invokevirtual   #169 <Method BigInteger BigInteger.subtract(BigInteger)>
	//  137  295:iconst_1        
	//  138  296:invokevirtual   #273 <Method BigInteger BigInteger.shiftRight(int)>
	//  139  299:astore          4
							int i = 0;
	//  140  301:iconst_0        
	//  141  302:istore_2        
							BigInteger biginteger4;
							do
							{
								biginteger4 = ((BigInteger) (ecprivatekey)).multiply(((BigInteger) (ecprivatekey))).subtract(biginteger3).mod(biginteger2);
	//  142  303:aload_0         
	//  143  304:aload_0         
	//  144  305:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  145  308:aload           9
	//  146  310:invokevirtual   #169 <Method BigInteger BigInteger.subtract(BigInteger)>
	//  147  313:aload           8
	//  148  315:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//  149  318:astore          10
								if(biginteger4.equals(((Object) (BigInteger.ZERO))))
	//* 150  320:aload           10
	//* 151  322:getstatic       #262 <Field BigInteger BigInteger.ZERO>
	//* 152  325:invokevirtual   #215 <Method boolean BigInteger.equals(Object)>
	//* 153  328:ifeq            336
								{
									ecpoint = ((ECPoint) (ecprivatekey));
	//  154  331:aload_0         
	//  155  332:astore_1        
									break label1;
	//  156  333:goto            620
								}
								ecpoint = ((ECPoint) (biginteger4.modPow(((BigInteger) (obj1)), biginteger2)));
	//  157  336:aload           10
	//  158  338:aload           4
	//  159  340:aload           8
	//  160  342:invokevirtual   #277 <Method BigInteger BigInteger.modPow(BigInteger, BigInteger)>
	//  161  345:astore_1        
								if(((BigInteger) (ecpoint)).add(BigInteger.ONE).equals(((Object) (biginteger2))))
									break;
	//  162  346:aload_1         
	//  163  347:getstatic       #269 <Field BigInteger BigInteger.ONE>
	//  164  350:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//  165  353:aload           8
	//  166  355:invokevirtual   #215 <Method boolean BigInteger.equals(Object)>
	//  167  358:ifne            430
								if(!((BigInteger) (ecpoint)).equals(((Object) (BigInteger.ONE))))
	//* 168  361:aload_1         
	//* 169  362:getstatic       #269 <Field BigInteger BigInteger.ONE>
	//* 170  365:invokevirtual   #215 <Method boolean BigInteger.equals(Object)>
	//* 171  368:ifne            382
									throw new InvalidAlgorithmParameterException("p is not prime");
	//  172  371:new             #255 <Class InvalidAlgorithmParameterException>
	//  173  374:dup             
	//  174  375:ldc2            #279 <String "p is not prime">
	//  175  378:invokespecial   #258 <Method void InvalidAlgorithmParameterException(String)>
	//  176  381:athrow          
								ecpoint = ((ECPoint) (((BigInteger) (ecprivatekey)).add(BigInteger.ONE)));
	//  177  382:aload_0         
	//  178  383:getstatic       #269 <Field BigInteger BigInteger.ONE>
	//  179  386:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//  180  389:astore_1        
								int j = i + 1;
	//  181  390:iload_2         
	//  182  391:iconst_1        
	//  183  392:iadd            
	//  184  393:istore_3        
								ecprivatekey = ((ECPrivateKey) (ecpoint));
	//  185  394:aload_1         
	//  186  395:astore_0        
								i = j;
	//  187  396:iload_3         
	//  188  397:istore_2        
								if(j == 128)
	//* 189  398:iload_3         
	//* 190  399:sipush          128
	//* 191  402:icmpne          303
								{
									ecprivatekey = ((ECPrivateKey) (ecpoint));
	//  192  405:aload_1         
	//  193  406:astore_0        
									i = j;
	//  194  407:iload_3         
	//  195  408:istore_2        
									if(!biginteger2.isProbablePrime(80))
	//* 196  409:aload           8
	//* 197  411:bipush          80
	//* 198  413:invokevirtual   #282 <Method boolean BigInteger.isProbablePrime(int)>
	//* 199  416:ifne            303
										throw new InvalidAlgorithmParameterException("p is not prime");
	//  200  419:new             #255 <Class InvalidAlgorithmParameterException>
	//  201  422:dup             
	//  202  423:ldc2            #279 <String "p is not prime">
	//  203  426:invokespecial   #258 <Method void InvalidAlgorithmParameterException(String)>
	//  204  429:athrow          
								}
							} while(true);
							BigInteger biginteger5 = biginteger2.add(BigInteger.ONE).shiftRight(1);
	//  205  430:aload           8
	//  206  432:getstatic       #269 <Field BigInteger BigInteger.ONE>
	//  207  435:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//  208  438:iconst_1        
	//  209  439:invokevirtual   #273 <Method BigInteger BigInteger.shiftRight(int)>
	//  210  442:astore          11
							ecpoint = ((ECPoint) (BigInteger.ONE));
	//  211  444:getstatic       #269 <Field BigInteger BigInteger.ONE>
	//  212  447:astore_1        
							i = biginteger5.bitLength() - 2;
	//  213  448:aload           11
	//  214  450:invokevirtual   #285 <Method int BigInteger.bitLength()>
	//  215  453:iconst_2        
	//  216  454:isub            
	//  217  455:istore_2        
							obj1 = ((Object) (ecprivatekey));
	//  218  456:aload_0         
	//  219  457:astore          4
							for(; i >= 0; i--)
	//* 220  459:iload_2         
	//* 221  460:iflt            580
							{
								BigInteger biginteger1 = ((BigInteger) (obj1)).multiply(((BigInteger) (ecpoint)));
	//  222  463:aload           4
	//  223  465:aload_1         
	//  224  466:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  225  469:astore          6
								BigInteger biginteger = ((BigInteger) (obj1)).multiply(((BigInteger) (obj1))).add(((BigInteger) (ecpoint)).multiply(((BigInteger) (ecpoint))).mod(biginteger2).multiply(biginteger4)).mod(biginteger2);
	//  226  471:aload           4
	//  227  473:aload           4
	//  228  475:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  229  478:aload_1         
	//  230  479:aload_1         
	//  231  480:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  232  483:aload           8
	//  233  485:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//  234  488:aload           10
	//  235  490:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  236  493:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//  237  496:aload           8
	//  238  498:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//  239  501:astore          5
								biginteger1 = biginteger1.add(biginteger1).mod(biginteger2);
	//  240  503:aload           6
	//  241  505:aload           6
	//  242  507:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//  243  510:aload           8
	//  244  512:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//  245  515:astore          6
								obj1 = ((Object) (biginteger));
	//  246  517:aload           5
	//  247  519:astore          4
								ecpoint = ((ECPoint) (biginteger1));
	//  248  521:aload           6
	//  249  523:astore_1        
								if(biginteger5.testBit(i))
	//* 250  524:aload           11
	//* 251  526:iload_2         
	//* 252  527:invokevirtual   #266 <Method boolean BigInteger.testBit(int)>
	//* 253  530:ifeq            573
								{
									obj1 = ((Object) (biginteger.multiply(((BigInteger) (ecprivatekey))).add(biginteger1.multiply(biginteger4)).mod(biginteger2)));
	//  254  533:aload           5
	//  255  535:aload_0         
	//  256  536:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  257  539:aload           6
	//  258  541:aload           10
	//  259  543:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  260  546:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//  261  549:aload           8
	//  262  551:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//  263  554:astore          4
									ecpoint = ((ECPoint) (((BigInteger) (ecprivatekey)).multiply(biginteger1).add(biginteger).mod(biginteger2)));
	//  264  556:aload_0         
	//  265  557:aload           6
	//  266  559:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  267  562:aload           5
	//  268  564:invokevirtual   #208 <Method BigInteger BigInteger.add(BigInteger)>
	//  269  567:aload           8
	//  270  569:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//  271  572:astore_1        
								}
							}

	//  272  573:iload_2         
	//  273  574:iconst_1        
	//  274  575:isub            
	//  275  576:istore_2        
	//* 276  577:goto            459
							ecprivatekey = ((ECPrivateKey) (obj1));
	//  277  580:aload           4
	//  278  582:astore_0        
						}
					}
				}
				ecpoint = ((ECPoint) (ecprivatekey));
	//  279  583:aload_0         
	//  280  584:astore_1        
				if(ecprivatekey != null)
	//* 281  585:aload_0         
	//* 282  586:ifnull          620
				{
					ecpoint = ((ECPoint) (ecprivatekey));
	//  283  589:aload_0         
	//  284  590:astore_1        
					if(((BigInteger) (ecprivatekey)).multiply(((BigInteger) (ecprivatekey))).mod(biginteger2).compareTo(biginteger3) != 0)
	//* 285  591:aload_0         
	//* 286  592:aload_0         
	//* 287  593:invokevirtual   #199 <Method BigInteger BigInteger.multiply(BigInteger)>
	//* 288  596:aload           8
	//* 289  598:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//* 290  601:aload           9
	//* 291  603:invokevirtual   #196 <Method int BigInteger.compareTo(BigInteger)>
	//* 292  606:ifeq            620
						throw new GeneralSecurityException("Could not find a modular square root");
	//  293  609:new             #8   <Class GeneralSecurityException>
	//  294  612:dup             
	//  295  613:ldc2            #287 <String "Could not find a modular square root">
	//  296  616:invokespecial   #26  <Method void GeneralSecurityException(String)>
	//  297  619:athrow          
				}
			}
			if(!((BigInteger) (ecpoint)).testBit(0))
	//* 298  620:iconst_1        
	//* 299  621:aload_1         
	//* 300  622:iconst_0        
	//* 301  623:invokevirtual   #266 <Method boolean BigInteger.testBit(int)>
	//* 302  626:icmpeq          641
				biginteger2.subtract(((BigInteger) (ecpoint))).mod(biginteger2);
	//  303  629:aload           8
	//  304  631:aload_1         
	//  305  632:invokevirtual   #169 <Method BigInteger BigInteger.subtract(BigInteger)>
	//  306  635:aload           8
	//  307  637:invokevirtual   #202 <Method BigInteger BigInteger.mod(BigInteger)>
	//  308  640:pop             
			return abyte0;
	//  309  641:aload           7
	//  310  643:areturn         
		}
		throw new GeneralSecurityException("shared secret is out of range");
	//  311  644:new             #8   <Class GeneralSecurityException>
	//  312  647:dup             
	//  313  648:ldc2            #289 <String "shared secret is out of range">
	//  314  651:invokespecial   #26  <Method void GeneralSecurityException(String)>
	//  315  654:athrow          
	}

	public static int zzb(EllipticCurve ellipticcurve)
		throws GeneralSecurityException
	{
		return (zza(ellipticcurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
	//    0    0:aload_0         
	//    1    1:invokestatic    #183 <Method BigInteger zza(EllipticCurve)>
	//    2    4:getstatic       #269 <Field BigInteger BigInteger.ONE>
	//    3    7:invokevirtual   #169 <Method BigInteger BigInteger.subtract(BigInteger)>
	//    4   10:invokevirtual   #285 <Method int BigInteger.bitLength()>
	//    5   13:bipush          7
	//    6   15:iadd            
	//    7   16:bipush          8
	//    8   18:idiv            
	//    9   19:ireturn         
	}
}
