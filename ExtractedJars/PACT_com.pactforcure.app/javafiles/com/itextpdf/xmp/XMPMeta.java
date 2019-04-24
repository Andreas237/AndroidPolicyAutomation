// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp;

import com.itextpdf.xmp.options.IteratorOptions;
import com.itextpdf.xmp.options.ParseOptions;
import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.properties.XMPProperty;
import java.util.Calendar;

// Referenced classes of package com.itextpdf.xmp:
//			XMPException, XMPDateTime, XMPIterator

public interface XMPMeta
	extends Cloneable
{

	public abstract void appendArrayItem(String s, String s1, PropertyOptions propertyoptions, String s2, PropertyOptions propertyoptions1)
		throws XMPException;

	public abstract void appendArrayItem(String s, String s1, String s2)
		throws XMPException;

	public abstract Object clone();

	public abstract int countArrayItems(String s, String s1)
		throws XMPException;

	public abstract void deleteArrayItem(String s, String s1, int i);

	public abstract void deleteProperty(String s, String s1);

	public abstract void deleteQualifier(String s, String s1, String s2, String s3);

	public abstract void deleteStructField(String s, String s1, String s2, String s3);

	public abstract boolean doesArrayItemExist(String s, String s1, int i);

	public abstract boolean doesPropertyExist(String s, String s1);

	public abstract boolean doesQualifierExist(String s, String s1, String s2, String s3);

	public abstract boolean doesStructFieldExist(String s, String s1, String s2, String s3);

	public abstract String dumpObject();

	public abstract XMPProperty getArrayItem(String s, String s1, int i)
		throws XMPException;

	public abstract XMPProperty getLocalizedText(String s, String s1, String s2, String s3)
		throws XMPException;

	public abstract String getObjectName();

	public abstract String getPacketHeader();

	public abstract XMPProperty getProperty(String s, String s1)
		throws XMPException;

	public abstract byte[] getPropertyBase64(String s, String s1)
		throws XMPException;

	public abstract Boolean getPropertyBoolean(String s, String s1)
		throws XMPException;

	public abstract Calendar getPropertyCalendar(String s, String s1)
		throws XMPException;

	public abstract XMPDateTime getPropertyDate(String s, String s1)
		throws XMPException;

	public abstract Double getPropertyDouble(String s, String s1)
		throws XMPException;

	public abstract Integer getPropertyInteger(String s, String s1)
		throws XMPException;

	public abstract Long getPropertyLong(String s, String s1)
		throws XMPException;

	public abstract String getPropertyString(String s, String s1)
		throws XMPException;

	public abstract XMPProperty getQualifier(String s, String s1, String s2, String s3)
		throws XMPException;

	public abstract XMPProperty getStructField(String s, String s1, String s2, String s3)
		throws XMPException;

	public abstract void insertArrayItem(String s, String s1, int i, String s2)
		throws XMPException;

	public abstract void insertArrayItem(String s, String s1, int i, String s2, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract XMPIterator iterator()
		throws XMPException;

	public abstract XMPIterator iterator(IteratorOptions iteratoroptions)
		throws XMPException;

	public abstract XMPIterator iterator(String s, String s1, IteratorOptions iteratoroptions)
		throws XMPException;

	public abstract void normalize(ParseOptions parseoptions)
		throws XMPException;

	public abstract void setArrayItem(String s, String s1, int i, String s2)
		throws XMPException;

	public abstract void setArrayItem(String s, String s1, int i, String s2, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void setLocalizedText(String s, String s1, String s2, String s3, String s4)
		throws XMPException;

	public abstract void setLocalizedText(String s, String s1, String s2, String s3, String s4, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void setObjectName(String s);

	public abstract void setProperty(String s, String s1, Object obj)
		throws XMPException;

	public abstract void setProperty(String s, String s1, Object obj, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void setPropertyBase64(String s, String s1, byte abyte0[])
		throws XMPException;

	public abstract void setPropertyBase64(String s, String s1, byte abyte0[], PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void setPropertyBoolean(String s, String s1, boolean flag)
		throws XMPException;

	public abstract void setPropertyBoolean(String s, String s1, boolean flag, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void setPropertyCalendar(String s, String s1, Calendar calendar)
		throws XMPException;

	public abstract void setPropertyCalendar(String s, String s1, Calendar calendar, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void setPropertyDate(String s, String s1, XMPDateTime xmpdatetime)
		throws XMPException;

	public abstract void setPropertyDate(String s, String s1, XMPDateTime xmpdatetime, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void setPropertyDouble(String s, String s1, double d)
		throws XMPException;

	public abstract void setPropertyDouble(String s, String s1, double d, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void setPropertyInteger(String s, String s1, int i)
		throws XMPException;

	public abstract void setPropertyInteger(String s, String s1, int i, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void setPropertyLong(String s, String s1, long l)
		throws XMPException;

	public abstract void setPropertyLong(String s, String s1, long l, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void setQualifier(String s, String s1, String s2, String s3, String s4)
		throws XMPException;

	public abstract void setQualifier(String s, String s1, String s2, String s3, String s4, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void setStructField(String s, String s1, String s2, String s3, String s4)
		throws XMPException;

	public abstract void setStructField(String s, String s1, String s2, String s3, String s4, PropertyOptions propertyoptions)
		throws XMPException;

	public abstract void sort();
}
