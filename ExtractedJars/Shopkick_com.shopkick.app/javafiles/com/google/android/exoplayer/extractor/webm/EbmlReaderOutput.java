// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.ExtractorInput;
import java.io.IOException;

interface EbmlReaderOutput
{

	public abstract void binaryElement(int i, int j, ExtractorInput extractorinput)
		throws ParserException, IOException, InterruptedException;

	public abstract void endMasterElement(int i)
		throws ParserException;

	public abstract void floatElement(int i, double d)
		throws ParserException;

	public abstract int getElementType(int i);

	public abstract void integerElement(int i, long l)
		throws ParserException;

	public abstract boolean isLevel1Element(int i);

	public abstract void startMasterElement(int i, long l, long l1)
		throws ParserException;

	public abstract void stringElement(int i, String s)
		throws ParserException;
}
