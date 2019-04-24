// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			ExtendedColor, PdfDeviceNColor

public class DeviceNColor extends ExtendedColor
{

	public DeviceNColor(PdfDeviceNColor pdfdevicencolor, float af[])
	{
		super(6);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:invokespecial   #13  <Method void ExtendedColor(int)>
		if(pdfdevicencolor.getSpotColors().length != af.length)
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #19  <Method PdfSpotColor[] PdfDeviceNColor.getSpotColors()>
	//*   5   10:arraylength     
	//*   6   11:aload_2         
	//*   7   12:arraylength     
	//*   8   13:icmpeq          33
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("devicen.color.shall.have.the.same.number.of.colorants.as.the.destination.DeviceN.color.space", new Object[0]));
	//    9   16:new             #21  <Class RuntimeException>
	//   10   19:dup             
	//   11   20:ldc1            #23  <String "devicen.color.shall.have.the.same.number.of.colorants.as.the.destination.DeviceN.color.space">
	//   12   22:iconst_0        
	//   13   23:anewarray       Object[]
	//   14   26:invokestatic    #31  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   15   29:invokespecial   #34  <Method void RuntimeException(String)>
	//   16   32:athrow          
		} else
		{
			pdfDeviceNColor = pdfdevicencolor;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:putfield        #36  <Field PdfDeviceNColor pdfDeviceNColor>
			tints = af;
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:putfield        #38  <Field float[] tints>
			return;
	//   23   43:return          
		}
	}

	public boolean equals(Object obj)
	{
		if((obj instanceof DeviceNColor) && ((DeviceNColor)obj).tints.length == tints.length)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class DeviceNColor>
	//*   2    4:ifeq            76
	//*   3    7:aload_1         
	//*   4    8:checkcast       #2   <Class DeviceNColor>
	//*   5   11:getfield        #38  <Field float[] tints>
	//*   6   14:arraylength     
	//*   7   15:aload_0         
	//*   8   16:getfield        #38  <Field float[] tints>
	//*   9   19:arraylength     
	//*  10   20:icmpne          76
		{
			int j = 0;
	//   11   23:iconst_0        
	//   12   24:istore_3        
			float af[] = tints;
	//   13   25:aload_0         
	//   14   26:getfield        #38  <Field float[] tints>
	//   15   29:astore          5
			int k = af.length;
	//   16   31:aload           5
	//   17   33:arraylength     
	//   18   34:istore          4
			for(int i = 0; i < k; i++)
	//*  19   36:iconst_0        
	//*  20   37:istore_2        
	//*  21   38:iload_2         
	//*  22   39:iload           4
	//*  23   41:icmpge          74
			{
				if(af[i] != ((DeviceNColor)obj).tints[j])
	//*  24   44:aload           5
	//*  25   46:iload_2         
	//*  26   47:faload          
	//*  27   48:aload_1         
	//*  28   49:checkcast       #2   <Class DeviceNColor>
	//*  29   52:getfield        #38  <Field float[] tints>
	//*  30   55:iload_3         
	//*  31   56:faload          
	//*  32   57:fcmpl           
	//*  33   58:ifeq            63
					return false;
	//   34   61:iconst_0        
	//   35   62:ireturn         
				j++;
	//   36   63:iload_3         
	//   37   64:iconst_1        
	//   38   65:iadd            
	//   39   66:istore_3        
			}

	//   40   67:iload_2         
	//   41   68:iconst_1        
	//   42   69:iadd            
	//   43   70:istore_2        
	//*  44   71:goto            38
			return true;
	//   45   74:iconst_1        
	//   46   75:ireturn         
		} else
		{
			return false;
	//   47   76:iconst_0        
	//   48   77:ireturn         
		}
	}

	public PdfDeviceNColor getPdfDeviceNColor()
	{
		return pdfDeviceNColor;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PdfDeviceNColor pdfDeviceNColor>
	//    2    4:areturn         
	}

	public float[] getTints()
	{
		return tints;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field float[] tints>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int j = pdfDeviceNColor.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PdfDeviceNColor pdfDeviceNColor>
	//    2    4:invokevirtual   #49  <Method int PdfDeviceNColor.hashCode()>
	//    3    7:istore_2        
		float af[] = tints;
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field float[] tints>
	//    6   12:astore          4
		int k = af.length;
	//    7   14:aload           4
	//    8   16:arraylength     
	//    9   17:istore_3        
		for(int i = 0; i < k; i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_1        
	//*  12   20:iload_1         
	//*  13   21:iload_3         
	//*  14   22:icmpge          45
			j ^= Float.valueOf(af[i]).hashCode();
	//   15   25:iload_2         
	//   16   26:aload           4
	//   17   28:iload_1         
	//   18   29:faload          
	//   19   30:invokestatic    #55  <Method Float Float.valueOf(float)>
	//   20   33:invokevirtual   #56  <Method int Float.hashCode()>
	//   21   36:ixor            
	//   22   37:istore_2        

	//   23   38:iload_1         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_1        
	//*  27   42:goto            20
		return j;
	//   28   45:iload_2         
	//   29   46:ireturn         
	}

	PdfDeviceNColor pdfDeviceNColor;
	float tints[];
}
