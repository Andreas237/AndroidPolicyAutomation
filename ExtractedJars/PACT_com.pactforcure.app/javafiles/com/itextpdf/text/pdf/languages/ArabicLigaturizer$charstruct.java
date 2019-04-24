// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.languages;


// Referenced classes of package com.itextpdf.text.pdf.languages:
//			ArabicLigaturizer

static class ArabicLigaturizer$charstruct
{

	char basechar;
	int lignum;
	char mark1;
	int numshapes;
	char vowel;

	ArabicLigaturizer$charstruct()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		numshapes = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #20  <Field int numshapes>
	//    5    9:return          
	}
}
