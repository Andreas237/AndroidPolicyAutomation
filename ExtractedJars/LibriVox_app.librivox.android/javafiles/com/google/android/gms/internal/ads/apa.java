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
//			apf, apb, apc

public final class apa
{

	public static int a(EllipticCurve ellipticcurve)
	{
		return (b(ellipticcurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
	//    0    0:aload_0         
	//    1    1:invokestatic    #10  <Method BigInteger b(EllipticCurve)>
	//    2    4:getstatic       #16  <Field BigInteger BigInteger.ONE>
	//    3    7:invokevirtual   #20  <Method BigInteger BigInteger.subtract(BigInteger)>
	//    4   10:invokevirtual   #24  <Method int BigInteger.bitLength()>
	//    5   13:bipush          7
	//    6   15:iadd            
	//    7   16:bipush          8
	//    8   18:idiv            
	//    9   19:ireturn         
	}

	public static KeyPair a(ECParameterSpec ecparameterspec)
	{
		KeyPairGenerator keypairgenerator = (KeyPairGenerator)apf.d.a("EC");
	//    0    0:getstatic       #32  <Field apf apf.d>
	//    1    3:ldc1            #34  <String "EC">
	//    2    5:invokevirtual   #37  <Method Object apf.a(String)>
	//    3    8:checkcast       #39  <Class KeyPairGenerator>
	//    4   11:astore_1        
		keypairgenerator.initialize(((java.security.spec.AlgorithmParameterSpec) (ecparameterspec)));
	//    5   12:aload_1         
	//    6   13:aload_0         
	//    7   14:invokevirtual   #43  <Method void KeyPairGenerator.initialize(java.security.spec.AlgorithmParameterSpec)>
		return keypairgenerator.generateKeyPair();
	//    8   17:aload_1         
	//    9   18:invokevirtual   #47  <Method KeyPair KeyPairGenerator.generateKeyPair()>
	//   10   21:areturn         
	}

	public static ECPublicKey a(apc apc1, byte abyte0[], byte abyte1[])
	{
		apc1 = ((apc) (a(apc1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #51  <Method ECParameterSpec a(apc)>
	//    2    4:astore_0        
		abyte0 = ((byte []) (new ECPoint(new BigInteger(1, abyte0), new BigInteger(1, abyte1))));
	//    3    5:new             #53  <Class ECPoint>
	//    4    8:dup             
	//    5    9:new             #12  <Class BigInteger>
	//    6   12:dup             
	//    7   13:iconst_1        
	//    8   14:aload_1         
	//    9   15:invokespecial   #57  <Method void BigInteger(int, byte[])>
	//   10   18:new             #12  <Class BigInteger>
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:aload_2         
	//   14   24:invokespecial   #57  <Method void BigInteger(int, byte[])>
	//   15   27:invokespecial   #60  <Method void ECPoint(BigInteger, BigInteger)>
	//   16   30:astore_1        
		a(((ECPoint) (abyte0)), ((ECParameterSpec) (apc1)).getCurve());
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #66  <Method EllipticCurve ECParameterSpec.getCurve()>
	//   20   36:invokestatic    #69  <Method void a(ECPoint, EllipticCurve)>
		apc1 = ((apc) (new ECPublicKeySpec(((ECPoint) (abyte0)), ((ECParameterSpec) (apc1)))));
	//   21   39:new             #71  <Class ECPublicKeySpec>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:invokespecial   #74  <Method void ECPublicKeySpec(ECPoint, ECParameterSpec)>
	//   26   48:astore_0        
		return (ECPublicKey)((KeyFactory)apf.e.a("EC")).generatePublic(((java.security.spec.KeySpec) (apc1)));
	//   27   49:getstatic       #77  <Field apf apf.e>
	//   28   52:ldc1            #34  <String "EC">
	//   29   54:invokevirtual   #37  <Method Object apf.a(String)>
	//   30   57:checkcast       #79  <Class KeyFactory>
	//   31   60:aload_0         
	//   32   61:invokevirtual   #83  <Method java.security.PublicKey KeyFactory.generatePublic(java.security.spec.KeySpec)>
	//   33   64:checkcast       #85  <Class ECPublicKey>
	//   34   67:areturn         
	}

	public static ECParameterSpec a(apc apc1)
	{
		switch(apb.b[apc1.ordinal()])
	//*   0    0:getstatic       #90  <Field int[] apb.b>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #95  <Method int apc.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 112
	//	               2 98
	//	               3 84
		default:
			apc1 = ((apc) (String.valueOf(((Object) (apc1)))));
	//    5   36:aload_0         
	//    6   37:invokestatic    #101 <Method String String.valueOf(Object)>
	//    7   40:astore_0        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (apc1))).length() + 22);
	//    8   41:new             #103 <Class StringBuilder>
	//    9   44:dup             
	//   10   45:aload_0         
	//   11   46:invokestatic    #101 <Method String String.valueOf(Object)>
	//   12   49:invokevirtual   #106 <Method int String.length()>
	//   13   52:bipush          22
	//   14   54:iadd            
	//   15   55:invokespecial   #109 <Method void StringBuilder(int)>
	//   16   58:astore_1        
			stringbuilder.append("curve not implemented:");
	//   17   59:aload_1         
	//   18   60:ldc1            #111 <String "curve not implemented:">
	//   19   62:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   20   65:pop             
			stringbuilder.append(((String) (apc1)));
	//   21   66:aload_1         
	//   22   67:aload_0         
	//   23   68:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   24   71:pop             
			throw new NoSuchAlgorithmException(stringbuilder.toString());
	//   25   72:new             #117 <Class NoSuchAlgorithmException>
	//   26   75:dup             
	//   27   76:aload_1         
	//   28   77:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   29   80:invokespecial   #124 <Method void NoSuchAlgorithmException(String)>
	//   30   83:athrow          

		case 3: // '\003'
			return a("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
	//   31   84:ldc1            #126 <String "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151">
	//   32   86:ldc1            #128 <String "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449">
	//   33   88:ldc1            #130 <String "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00">
	//   34   90:ldc1            #132 <String "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66">
	//   35   92:ldc1            #134 <String "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650">
	//   36   94:invokestatic    #137 <Method ECParameterSpec a(String, String, String, String, String)>
	//   37   97:areturn         

		case 2: // '\002'
			return a("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
	//   38   98:ldc1            #139 <String "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319">
	//   39  100:ldc1            #141 <String "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643">
	//   40  102:ldc1            #143 <String "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef">
	//   41  104:ldc1            #145 <String "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7">
	//   42  106:ldc1            #147 <String "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f">
	//   43  108:invokestatic    #137 <Method ECParameterSpec a(String, String, String, String, String)>
	//   44  111:areturn         

		case 1: // '\001'
			return a("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
	//   45  112:ldc1            #149 <String "115792089210356248762697446949407573530086143415290314195533631308867097853951">
	//   46  114:ldc1            #151 <String "115792089210356248762697446949407573529996955224135760342422259061068512044369">
	//   47  116:ldc1            #153 <String "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b">
	//   48  118:ldc1            #155 <String "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296">
	//   49  120:ldc1            #157 <String "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5">
	//   50  122:invokestatic    #137 <Method ECParameterSpec a(String, String, String, String, String)>
	//   51  125:areturn         
		}
	}

	private static ECParameterSpec a(String s, String s1, String s2, String s3, String s4)
	{
		s = ((String) (new BigInteger(s)));
	//    0    0:new             #12  <Class BigInteger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #158 <Method void BigInteger(String)>
	//    4    8:astore_0        
		s1 = ((String) (new BigInteger(s1)));
	//    5    9:new             #12  <Class BigInteger>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #158 <Method void BigInteger(String)>
	//    9   17:astore_1        
		BigInteger biginteger = ((BigInteger) (s)).subtract(new BigInteger("3"));
	//   10   18:aload_0         
	//   11   19:new             #12  <Class BigInteger>
	//   12   22:dup             
	//   13   23:ldc1            #160 <String "3">
	//   14   25:invokespecial   #158 <Method void BigInteger(String)>
	//   15   28:invokevirtual   #20  <Method BigInteger BigInteger.subtract(BigInteger)>
	//   16   31:astore          5
		s2 = ((String) (new BigInteger(s2, 16)));
	//   17   33:new             #12  <Class BigInteger>
	//   18   36:dup             
	//   19   37:aload_2         
	//   20   38:bipush          16
	//   21   40:invokespecial   #163 <Method void BigInteger(String, int)>
	//   22   43:astore_2        
		s3 = ((String) (new BigInteger(s3, 16)));
	//   23   44:new             #12  <Class BigInteger>
	//   24   47:dup             
	//   25   48:aload_3         
	//   26   49:bipush          16
	//   27   51:invokespecial   #163 <Method void BigInteger(String, int)>
	//   28   54:astore_3        
		s4 = ((String) (new BigInteger(s4, 16)));
	//   29   55:new             #12  <Class BigInteger>
	//   30   58:dup             
	//   31   59:aload           4
	//   32   61:bipush          16
	//   33   63:invokespecial   #163 <Method void BigInteger(String, int)>
	//   34   66:astore          4
		return new ECParameterSpec(new EllipticCurve(((java.security.spec.ECField) (new ECFieldFp(((BigInteger) (s))))), biginteger, ((BigInteger) (s2))), new ECPoint(((BigInteger) (s3)), ((BigInteger) (s4))), ((BigInteger) (s1)), 1);
	//   35   68:new             #62  <Class ECParameterSpec>
	//   36   71:dup             
	//   37   72:new             #165 <Class EllipticCurve>
	//   38   75:dup             
	//   39   76:new             #167 <Class ECFieldFp>
	//   40   79:dup             
	//   41   80:aload_0         
	//   42   81:invokespecial   #170 <Method void ECFieldFp(BigInteger)>
	//   43   84:aload           5
	//   44   86:aload_2         
	//   45   87:invokespecial   #173 <Method void EllipticCurve(java.security.spec.ECField, BigInteger, BigInteger)>
	//   46   90:new             #53  <Class ECPoint>
	//   47   93:dup             
	//   48   94:aload_3         
	//   49   95:aload           4
	//   50   97:invokespecial   #60  <Method void ECPoint(BigInteger, BigInteger)>
	//   51  100:aload_1         
	//   52  101:iconst_1        
	//   53  102:invokespecial   #176 <Method void ECParameterSpec(EllipticCurve, ECPoint, BigInteger, int)>
	//   54  105:areturn         
	}

	static void a(ECPoint ecpoint, EllipticCurve ellipticcurve)
	{
		BigInteger biginteger = b(ellipticcurve);
	//    0    0:aload_1         
	//    1    1:invokestatic    #10  <Method BigInteger b(EllipticCurve)>
	//    2    4:astore_2        
		BigInteger biginteger1 = ecpoint.getAffineX();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #180 <Method BigInteger ECPoint.getAffineX()>
	//    5    9:astore_3        
		ecpoint = ((ECPoint) (ecpoint.getAffineY()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #183 <Method BigInteger ECPoint.getAffineY()>
	//    8   14:astore_0        
		if(biginteger1 != null && ecpoint != null)
	//*   9   15:aload_3         
	//*  10   16:ifnull          130
	//*  11   19:aload_0         
	//*  12   20:ifnull          130
		{
			if(biginteger1.signum() != -1 && biginteger1.compareTo(biginteger) == -1)
	//*  13   23:aload_3         
	//*  14   24:invokevirtual   #186 <Method int BigInteger.signum()>
	//*  15   27:iconst_m1       
	//*  16   28:icmpeq          120
	//*  17   31:aload_3         
	//*  18   32:aload_2         
	//*  19   33:invokevirtual   #190 <Method int BigInteger.compareTo(BigInteger)>
	//*  20   36:iconst_m1       
	//*  21   37:icmpne          120
			{
				if(((BigInteger) (ecpoint)).signum() != -1 && ((BigInteger) (ecpoint)).compareTo(biginteger) == -1)
	//*  22   40:aload_0         
	//*  23   41:invokevirtual   #186 <Method int BigInteger.signum()>
	//*  24   44:iconst_m1       
	//*  25   45:icmpeq          110
	//*  26   48:aload_0         
	//*  27   49:aload_2         
	//*  28   50:invokevirtual   #190 <Method int BigInteger.compareTo(BigInteger)>
	//*  29   53:iconst_m1       
	//*  30   54:icmpne          110
				{
					if(((BigInteger) (ecpoint)).multiply(((BigInteger) (ecpoint))).mod(biginteger).equals(((Object) (biginteger1.multiply(biginteger1).add(ellipticcurve.getA()).multiply(biginteger1).add(ellipticcurve.getB()).mod(biginteger)))))
	//*  31   57:aload_0         
	//*  32   58:aload_0         
	//*  33   59:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//*  34   62:aload_2         
	//*  35   63:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//*  36   66:aload_3         
	//*  37   67:aload_3         
	//*  38   68:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//*  39   71:aload_1         
	//*  40   72:invokevirtual   #199 <Method BigInteger EllipticCurve.getA()>
	//*  41   75:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//*  42   78:aload_3         
	//*  43   79:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//*  44   82:aload_1         
	//*  45   83:invokevirtual   #205 <Method BigInteger EllipticCurve.getB()>
	//*  46   86:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//*  47   89:aload_2         
	//*  48   90:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//*  49   93:invokevirtual   #209 <Method boolean BigInteger.equals(Object)>
	//*  50   96:ifeq            100
						return;
	//   51   99:return          
					else
						throw new GeneralSecurityException("Point is not on curve");
	//   52  100:new             #211 <Class GeneralSecurityException>
	//   53  103:dup             
	//   54  104:ldc1            #213 <String "Point is not on curve">
	//   55  106:invokespecial   #214 <Method void GeneralSecurityException(String)>
	//   56  109:athrow          
				} else
				{
					throw new GeneralSecurityException("y is out of range");
	//   57  110:new             #211 <Class GeneralSecurityException>
	//   58  113:dup             
	//   59  114:ldc1            #216 <String "y is out of range">
	//   60  116:invokespecial   #214 <Method void GeneralSecurityException(String)>
	//   61  119:athrow          
				}
			} else
			{
				throw new GeneralSecurityException("x is out of range");
	//   62  120:new             #211 <Class GeneralSecurityException>
	//   63  123:dup             
	//   64  124:ldc1            #218 <String "x is out of range">
	//   65  126:invokespecial   #214 <Method void GeneralSecurityException(String)>
	//   66  129:athrow          
			}
		} else
		{
			throw new GeneralSecurityException("point is at infinity");
	//   67  130:new             #211 <Class GeneralSecurityException>
	//   68  133:dup             
	//   69  134:ldc1            #220 <String "point is at infinity">
	//   70  136:invokespecial   #214 <Method void GeneralSecurityException(String)>
	//   71  139:athrow          
		}
	}

	public static byte[] a(ECPrivateKey ecprivatekey, ECPoint ecpoint)
	{
		Object obj;
		a(ecpoint, ecprivatekey.getParams().getCurve());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #229 <Method ECParameterSpec ECPrivateKey.getParams()>
	//    3    7:invokevirtual   #66  <Method EllipticCurve ECParameterSpec.getCurve()>
	//    4   10:invokestatic    #69  <Method void a(ECPoint, EllipticCurve)>
		obj = ((Object) (ecprivatekey.getParams()));
	//    5   13:aload_0         
	//    6   14:invokeinterface #229 <Method ECParameterSpec ECPrivateKey.getParams()>
	//    7   19:astore          4
		((ECParameterSpec) (obj)).getCurve();
	//    8   21:aload           4
	//    9   23:invokevirtual   #66  <Method EllipticCurve ECParameterSpec.getCurve()>
	//   10   26:pop             
		ecpoint = ((ECPoint) (new ECPublicKeySpec(ecpoint, ((ECParameterSpec) (obj)))));
	//   11   27:new             #71  <Class ECPublicKeySpec>
	//   12   30:dup             
	//   13   31:aload_1         
	//   14   32:aload           4
	//   15   34:invokespecial   #74  <Method void ECPublicKeySpec(ECPoint, ECParameterSpec)>
	//   16   37:astore_1        
		ecpoint = ((ECPoint) (KeyFactory.getInstance("EC").generatePublic(((java.security.spec.KeySpec) (ecpoint)))));
	//   17   38:ldc1            #34  <String "EC">
	//   18   40:invokestatic    #233 <Method KeyFactory KeyFactory.getInstance(String)>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #83  <Method java.security.PublicKey KeyFactory.generatePublic(java.security.spec.KeySpec)>
	//   21   47:astore_1        
		obj = ((Object) ((KeyAgreement)apf.c.a("ECDH")));
	//   22   48:getstatic       #236 <Field apf apf.c>
	//   23   51:ldc1            #238 <String "ECDH">
	//   24   53:invokevirtual   #37  <Method Object apf.a(String)>
	//   25   56:checkcast       #240 <Class KeyAgreement>
	//   26   59:astore          4
		((KeyAgreement) (obj)).init(((java.security.Key) (ecprivatekey)));
	//   27   61:aload           4
	//   28   63:aload_0         
	//   29   64:invokevirtual   #244 <Method void KeyAgreement.init(java.security.Key)>
		byte abyte0[];
		((KeyAgreement) (obj)).doPhase(((java.security.Key) (ecpoint)), true);
	//   30   67:aload           4
	//   31   69:aload_1         
	//   32   70:iconst_1        
	//   33   71:invokevirtual   #248 <Method java.security.Key KeyAgreement.doPhase(java.security.Key, boolean)>
	//   34   74:pop             
		abyte0 = ((KeyAgreement) (obj)).generateSecret();
	//   35   75:aload           4
	//   36   77:invokevirtual   #252 <Method byte[] KeyAgreement.generateSecret()>
	//   37   80:astore          7
		obj = ((Object) (ecprivatekey.getParams().getCurve()));
	//   38   82:aload_0         
	//   39   83:invokeinterface #229 <Method ECParameterSpec ECPrivateKey.getParams()>
	//   40   88:invokevirtual   #66  <Method EllipticCurve ECParameterSpec.getCurve()>
	//   41   91:astore          4
		ecprivatekey = ((ECPrivateKey) (new BigInteger(1, abyte0)));
	//   42   93:new             #12  <Class BigInteger>
	//   43   96:dup             
	//   44   97:iconst_1        
	//   45   98:aload           7
	//   46  100:invokespecial   #57  <Method void BigInteger(int, byte[])>
	//   47  103:astore_0        
		if(((BigInteger) (ecprivatekey)).signum() == -1 || ((BigInteger) (ecprivatekey)).compareTo(b(((EllipticCurve) (obj)))) != -1) goto _L2; else goto _L1
	//   48  104:aload_0         
	//   49  105:invokevirtual   #186 <Method int BigInteger.signum()>
	//   50  108:iconst_m1       
	//   51  109:icmpeq          640
	//   52  112:aload_0         
	//   53  113:aload           4
	//   54  115:invokestatic    #10  <Method BigInteger b(EllipticCurve)>
	//   55  118:invokevirtual   #190 <Method int BigInteger.compareTo(BigInteger)>
	//   56  121:iconst_m1       
	//   57  122:icmpne          640
_L1:
		BigInteger biginteger2;
		biginteger2 = b(((EllipticCurve) (obj)));
	//   58  125:aload           4
	//   59  127:invokestatic    #10  <Method BigInteger b(EllipticCurve)>
	//   60  130:astore          8
		ecpoint = ((ECPoint) (((EllipticCurve) (obj)).getA()));
	//   61  132:aload           4
	//   62  134:invokevirtual   #199 <Method BigInteger EllipticCurve.getA()>
	//   63  137:astore_1        
		obj = ((Object) (((EllipticCurve) (obj)).getB()));
	//   64  138:aload           4
	//   65  140:invokevirtual   #205 <Method BigInteger EllipticCurve.getB()>
	//   66  143:astore          4
		ecprivatekey = ((ECPrivateKey) (((BigInteger) (ecprivatekey)).multiply(((BigInteger) (ecprivatekey))).add(((BigInteger) (ecpoint))).multiply(((BigInteger) (ecprivatekey))).add(((BigInteger) (obj))).mod(biginteger2)));
	//   67  145:aload_0         
	//   68  146:aload_0         
	//   69  147:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//   70  150:aload_1         
	//   71  151:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//   72  154:aload_0         
	//   73  155:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//   74  158:aload           4
	//   75  160:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//   76  163:aload           8
	//   77  165:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//   78  168:astore_0        
		if(biginteger2.signum() != 1) goto _L4; else goto _L3
	//   79  169:aload           8
	//   80  171:invokevirtual   #186 <Method int BigInteger.signum()>
	//   81  174:iconst_1        
	//   82  175:icmpne          629
_L3:
		BigInteger biginteger3 = ((BigInteger) (ecprivatekey)).mod(biginteger2);
	//   83  178:aload_0         
	//   84  179:aload           8
	//   85  181:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//   86  184:astore          9
		ecpoint = null;
	//   87  186:aconst_null     
	//   88  187:astore_1        
		if(!biginteger3.equals(((Object) (BigInteger.ZERO)))) goto _L6; else goto _L5
	//   89  188:aload           9
	//   90  190:getstatic       #255 <Field BigInteger BigInteger.ZERO>
	//   91  193:invokevirtual   #209 <Method boolean BigInteger.equals(Object)>
	//   92  196:ifeq            206
_L5:
		ecpoint = ((ECPoint) (BigInteger.ZERO));
	//   93  199:getstatic       #255 <Field BigInteger BigInteger.ZERO>
	//   94  202:astore_1        
		  goto _L7
	//*  95  203:goto            605
_L6:
		if(!biginteger2.testBit(0) || !biginteger2.testBit(1)) goto _L9; else goto _L8
	//   96  206:aload           8
	//   97  208:iconst_0        
	//   98  209:invokevirtual   #259 <Method boolean BigInteger.testBit(int)>
	//   99  212:ifeq            247
	//  100  215:aload           8
	//  101  217:iconst_1        
	//  102  218:invokevirtual   #259 <Method boolean BigInteger.testBit(int)>
	//  103  221:ifeq            247
_L8:
		ecprivatekey = ((ECPrivateKey) (biginteger3.modPow(biginteger2.add(BigInteger.ONE).shiftRight(2), biginteger2)));
	//  104  224:aload           9
	//  105  226:aload           8
	//  106  228:getstatic       #16  <Field BigInteger BigInteger.ONE>
	//  107  231:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//  108  234:iconst_2        
	//  109  235:invokevirtual   #263 <Method BigInteger BigInteger.shiftRight(int)>
	//  110  238:aload           8
	//  111  240:invokevirtual   #267 <Method BigInteger BigInteger.modPow(BigInteger, BigInteger)>
	//  112  243:astore_0        
		  goto _L10
	//* 113  244:goto            565
_L9:
		ecprivatekey = ((ECPrivateKey) (ecpoint));
	//  114  247:aload_1         
	//  115  248:astore_0        
		if(!biginteger2.testBit(0)) goto _L10; else goto _L11
	//  116  249:aload           8
	//  117  251:iconst_0        
	//  118  252:invokevirtual   #259 <Method boolean BigInteger.testBit(int)>
	//  119  255:ifeq            565
_L11:
		ecprivatekey = ((ECPrivateKey) (ecpoint));
	//  120  258:aload_1         
	//  121  259:astore_0        
		if(biginteger2.testBit(1)) goto _L10; else goto _L12
	//  122  260:aload           8
	//  123  262:iconst_1        
	//  124  263:invokevirtual   #259 <Method boolean BigInteger.testBit(int)>
	//  125  266:ifne            565
_L12:
		ecprivatekey = ((ECPrivateKey) (BigInteger.ONE));
	//  126  269:getstatic       #16  <Field BigInteger BigInteger.ONE>
	//  127  272:astore_0        
		obj = ((Object) (biginteger2.subtract(BigInteger.ONE).shiftRight(1)));
	//  128  273:aload           8
	//  129  275:getstatic       #16  <Field BigInteger BigInteger.ONE>
	//  130  278:invokevirtual   #20  <Method BigInteger BigInteger.subtract(BigInteger)>
	//  131  281:iconst_1        
	//  132  282:invokevirtual   #263 <Method BigInteger BigInteger.shiftRight(int)>
	//  133  285:astore          4
		int i = 0;
	//  134  287:iconst_0        
	//  135  288:istore_2        
_L16:
		BigInteger biginteger4 = ((BigInteger) (ecprivatekey)).multiply(((BigInteger) (ecprivatekey))).subtract(biginteger3).mod(biginteger2);
	//  136  289:aload_0         
	//  137  290:aload_0         
	//  138  291:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  139  294:aload           9
	//  140  296:invokevirtual   #20  <Method BigInteger BigInteger.subtract(BigInteger)>
	//  141  299:aload           8
	//  142  301:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//  143  304:astore          10
		if(!biginteger4.equals(((Object) (BigInteger.ZERO)))) goto _L14; else goto _L13
	//  144  306:aload           10
	//  145  308:getstatic       #255 <Field BigInteger BigInteger.ZERO>
	//  146  311:invokevirtual   #209 <Method boolean BigInteger.equals(Object)>
	//  147  314:ifeq            322
_L13:
		ecpoint = ((ECPoint) (ecprivatekey));
	//  148  317:aload_0         
	//  149  318:astore_1        
		  goto _L7
	//* 150  319:goto            605
_L14:
		ecpoint = ((ECPoint) (biginteger4.modPow(((BigInteger) (obj)), biginteger2)));
	//  151  322:aload           10
	//  152  324:aload           4
	//  153  326:aload           8
	//  154  328:invokevirtual   #267 <Method BigInteger BigInteger.modPow(BigInteger, BigInteger)>
	//  155  331:astore_1        
		if(((BigInteger) (ecpoint)).add(BigInteger.ONE).equals(((Object) (biginteger2))))
			break MISSING_BLOCK_LABEL_419;
	//  156  332:aload_1         
	//  157  333:getstatic       #16  <Field BigInteger BigInteger.ONE>
	//  158  336:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//  159  339:aload           8
	//  160  341:invokevirtual   #209 <Method boolean BigInteger.equals(Object)>
	//  161  344:ifne            419
		if(!((BigInteger) (ecpoint)).equals(((Object) (BigInteger.ONE))))
			break MISSING_BLOCK_LABEL_408;
	//  162  347:aload_1         
	//  163  348:getstatic       #16  <Field BigInteger BigInteger.ONE>
	//  164  351:invokevirtual   #209 <Method boolean BigInteger.equals(Object)>
	//  165  354:ifeq            408
		ecpoint = ((ECPoint) (((BigInteger) (ecprivatekey)).add(BigInteger.ONE)));
	//  166  357:aload_0         
	//  167  358:getstatic       #16  <Field BigInteger BigInteger.ONE>
	//  168  361:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//  169  364:astore_1        
		int j;
		j = i + 1;
	//  170  365:iload_2         
	//  171  366:iconst_1        
	//  172  367:iadd            
	//  173  368:istore_3        
		ecprivatekey = ((ECPrivateKey) (ecpoint));
	//  174  369:aload_1         
	//  175  370:astore_0        
		i = j;
	//  176  371:iload_3         
	//  177  372:istore_2        
		if(j != 128)
			continue; /* Loop/switch isn't completed */
	//  178  373:iload_3         
	//  179  374:sipush          128
	//  180  377:icmpne          289
		if(!biginteger2.isProbablePrime(80))
			break; /* Loop/switch isn't completed */
	//  181  380:aload           8
	//  182  382:bipush          80
	//  183  384:invokevirtual   #270 <Method boolean BigInteger.isProbablePrime(int)>
	//  184  387:ifeq            397
		ecprivatekey = ((ECPrivateKey) (ecpoint));
	//  185  390:aload_1         
	//  186  391:astore_0        
		i = j;
	//  187  392:iload_3         
	//  188  393:istore_2        
		if(true) goto _L16; else goto _L15
	//  189  394:goto            289
_L15:
		throw new InvalidAlgorithmParameterException("p is not prime");
	//  190  397:new             #272 <Class InvalidAlgorithmParameterException>
	//  191  400:dup             
	//  192  401:ldc2            #274 <String "p is not prime">
	//  193  404:invokespecial   #275 <Method void InvalidAlgorithmParameterException(String)>
	//  194  407:athrow          
		throw new InvalidAlgorithmParameterException("p is not prime");
	//  195  408:new             #272 <Class InvalidAlgorithmParameterException>
	//  196  411:dup             
	//  197  412:ldc2            #274 <String "p is not prime">
	//  198  415:invokespecial   #275 <Method void InvalidAlgorithmParameterException(String)>
	//  199  418:athrow          
		BigInteger biginteger5;
		biginteger5 = biginteger2.add(BigInteger.ONE).shiftRight(1);
	//  200  419:aload           8
	//  201  421:getstatic       #16  <Field BigInteger BigInteger.ONE>
	//  202  424:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//  203  427:iconst_1        
	//  204  428:invokevirtual   #263 <Method BigInteger BigInteger.shiftRight(int)>
	//  205  431:astore          11
		obj = ((Object) (BigInteger.ONE));
	//  206  433:getstatic       #16  <Field BigInteger BigInteger.ONE>
	//  207  436:astore          4
		i = biginteger5.bitLength() - 2;
	//  208  438:aload           11
	//  209  440:invokevirtual   #24  <Method int BigInteger.bitLength()>
	//  210  443:iconst_2        
	//  211  444:isub            
	//  212  445:istore_2        
		ecpoint = ((ECPoint) (ecprivatekey));
	//  213  446:aload_0         
	//  214  447:astore_1        
_L22:
		if(i < 0) goto _L18; else goto _L17
	//  215  448:iload_2         
	//  216  449:iflt            671
_L17:
		BigInteger biginteger;
		BigInteger biginteger1;
		try
		{
			biginteger1 = ((BigInteger) (ecpoint)).multiply(((BigInteger) (obj)));
	//  217  452:aload_1         
	//  218  453:aload           4
	//  219  455:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  220  458:astore          6
			biginteger = ((BigInteger) (ecpoint)).multiply(((BigInteger) (ecpoint))).add(((BigInteger) (obj)).multiply(((BigInteger) (obj))).mod(biginteger2).multiply(biginteger4)).mod(biginteger2);
	//  221  460:aload_1         
	//  222  461:aload_1         
	//  223  462:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  224  465:aload           4
	//  225  467:aload           4
	//  226  469:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  227  472:aload           8
	//  228  474:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//  229  477:aload           10
	//  230  479:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//  231  482:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//  232  485:aload           8
	//  233  487:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//  234  490:astore          5
			biginteger1 = biginteger1.add(biginteger1).mod(biginteger2);
	//  235  492:aload           6
	//  236  494:aload           6
	//  237  496:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//  238  499:aload           8
	//  239  501:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//  240  504:astore          6
		}
	//* 241  506:aload           5
	//* 242  508:astore_1        
	//* 243  509:aload           6
	//* 244  511:astore          4
	//* 245  513:aload           11
	//* 246  515:iload_2         
	//* 247  516:invokevirtual   #259 <Method boolean BigInteger.testBit(int)>
	//* 248  519:ifeq            664
	//* 249  522:aload           5
	//* 250  524:aload_0         
	//* 251  525:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//* 252  528:aload           6
	//* 253  530:aload           10
	//* 254  532:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//* 255  535:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//* 256  538:aload           8
	//* 257  540:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//* 258  543:astore_1        
	//* 259  544:aload_0         
	//* 260  545:aload           6
	//* 261  547:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//* 262  550:aload           5
	//* 263  552:invokevirtual   #202 <Method BigInteger BigInteger.add(BigInteger)>
	//* 264  555:aload           8
	//* 265  557:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//* 266  560:astore          4
	//* 267  562:goto            664
	//* 268  565:aload_0         
	//* 269  566:astore_1        
	//* 270  567:aload_0         
	//* 271  568:ifnull          605
	//* 272  571:aload_0         
	//* 273  572:aload_0         
	//* 274  573:invokevirtual   #193 <Method BigInteger BigInteger.multiply(BigInteger)>
	//* 275  576:aload           8
	//* 276  578:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//* 277  581:aload           9
	//* 278  583:invokevirtual   #190 <Method int BigInteger.compareTo(BigInteger)>
	//* 279  586:ifne            594
	//* 280  589:aload_0         
	//* 281  590:astore_1        
	//* 282  591:goto            605
	//* 283  594:new             #211 <Class GeneralSecurityException>
	//* 284  597:dup             
	//* 285  598:ldc2            #277 <String "Could not find a modular square root">
	//* 286  601:invokespecial   #214 <Method void GeneralSecurityException(String)>
	//* 287  604:athrow          
	//* 288  605:iconst_1        
	//* 289  606:aload_1         
	//* 290  607:iconst_0        
	//* 291  608:invokevirtual   #259 <Method boolean BigInteger.testBit(int)>
	//* 292  611:icmpeq          676
	//* 293  614:aload           8
	//* 294  616:aload_1         
	//* 295  617:invokevirtual   #20  <Method BigInteger BigInteger.subtract(BigInteger)>
	//* 296  620:aload           8
	//* 297  622:invokevirtual   #196 <Method BigInteger BigInteger.mod(BigInteger)>
	//* 298  625:pop             
	//* 299  626:aload           7
	//* 300  628:areturn         
	//* 301  629:new             #272 <Class InvalidAlgorithmParameterException>
	//* 302  632:dup             
	//* 303  633:ldc2            #279 <String "p must be positive">
	//* 304  636:invokespecial   #275 <Method void InvalidAlgorithmParameterException(String)>
	//* 305  639:athrow          
	//* 306  640:new             #211 <Class GeneralSecurityException>
	//* 307  643:dup             
	//* 308  644:ldc2            #281 <String "shared secret is out of range">
	//* 309  647:invokespecial   #214 <Method void GeneralSecurityException(String)>
	//* 310  650:athrow          
		// Misplaced declaration of an exception variable
		catch(ECPrivateKey ecprivatekey)
	//* 311  651:astore_0        
		{
			throw new GeneralSecurityException(((IllegalStateException) (ecprivatekey)).toString());
	//  312  652:new             #211 <Class GeneralSecurityException>
	//  313  655:dup             
	//  314  656:aload_0         
	//  315  657:invokevirtual   #282 <Method String IllegalStateException.toString()>
	//  316  660:invokespecial   #214 <Method void GeneralSecurityException(String)>
	//  317  663:athrow          
		}
		ecpoint = ((ECPoint) (biginteger));
		obj = ((Object) (biginteger1));
		if(biginteger5.testBit(i))
		{
			ecpoint = ((ECPoint) (biginteger.multiply(((BigInteger) (ecprivatekey))).add(biginteger1.multiply(biginteger4)).mod(biginteger2)));
			obj = ((Object) (((BigInteger) (ecprivatekey)).multiply(biginteger1).add(biginteger).mod(biginteger2)));
		}
		continue; /* Loop/switch isn't completed */
_L10:
		ecpoint = ((ECPoint) (ecprivatekey));
		if(ecprivatekey == null) goto _L7; else goto _L19
_L19:
		if(((BigInteger) (ecprivatekey)).multiply(((BigInteger) (ecprivatekey))).mod(biginteger2).compareTo(biginteger3) != 0) goto _L21; else goto _L20
_L20:
		ecpoint = ((ECPoint) (ecprivatekey));
		  goto _L7
_L21:
		throw new GeneralSecurityException("Could not find a modular square root");
_L7:
		if(((BigInteger) (ecpoint)).testBit(0))
			break MISSING_BLOCK_LABEL_676;
		biginteger2.subtract(((BigInteger) (ecpoint))).mod(biginteger2);
		return abyte0;
_L4:
		throw new InvalidAlgorithmParameterException("p must be positive");
_L2:
		throw new GeneralSecurityException("shared secret is out of range");
		i--;
	//  318  664:iload_2         
	//  319  665:iconst_1        
	//  320  666:isub            
	//  321  667:istore_2        
		  goto _L22
	//* 322  668:goto            448
_L18:
		ecprivatekey = ((ECPrivateKey) (ecpoint));
	//  323  671:aload_1         
	//  324  672:astore_0        
		  goto _L10
	//* 325  673:goto            565
		return abyte0;
	//  326  676:aload           7
	//  327  678:areturn         
		  goto _L22
	}

	private static BigInteger b(EllipticCurve ellipticcurve)
	{
		ellipticcurve = ((EllipticCurve) (ellipticcurve.getField()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #286 <Method java.security.spec.ECField EllipticCurve.getField()>
	//    2    4:astore_0        
		if(ellipticcurve instanceof ECFieldFp)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #167 <Class ECFieldFp>
	//*   5    9:ifeq            20
			return ((ECFieldFp)ellipticcurve).getP();
	//    6   12:aload_0         
	//    7   13:checkcast       #167 <Class ECFieldFp>
	//    8   16:invokevirtual   #289 <Method BigInteger ECFieldFp.getP()>
	//    9   19:areturn         
		else
			throw new GeneralSecurityException("Only curves over prime order fields are supported");
	//   10   20:new             #211 <Class GeneralSecurityException>
	//   11   23:dup             
	//   12   24:ldc2            #291 <String "Only curves over prime order fields are supported">
	//   13   27:invokespecial   #214 <Method void GeneralSecurityException(String)>
	//   14   30:athrow          
	}
}
