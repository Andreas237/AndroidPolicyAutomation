.class public Lorg/apache/commons/lang3/time/FastDateFormat;
.super Ljava/text/Format;
.source "FastDateFormat.java"

# interfaces
.implements Lorg/apache/commons/lang3/time/DateParser;
.implements Lorg/apache/commons/lang3/time/DatePrinter;


# static fields
.field public static final FULL:I = 0x0

.field public static final LONG:I = 0x1

.field public static final MEDIUM:I = 0x2

.field public static final SHORT:I = 0x3

.field private static final cache:Lorg/apache/commons/lang3/time/FormatCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/apache/commons/lang3/time/FormatCache<",
            "Lorg/apache/commons/lang3/time/FastDateFormat;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x2L


# instance fields
.field private final parser:Lorg/apache/commons/lang3/time/FastDateParser;

.field private final printer:Lorg/apache/commons/lang3/time/FastDatePrinter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 102
    new-instance v0, Lorg/apache/commons/lang3/time/FastDateFormat$1;

    invoke-direct {v0}, Lorg/apache/commons/lang3/time/FastDateFormat$1;-><init>()V

    sput-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)V
    .locals 1

    const/4 v0, 0x0

    .line 383
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/apache/commons/lang3/time/FastDateFormat;-><init>(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;Ljava/util/Date;)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;Ljava/util/Date;)V
    .locals 1

    .line 397
    invoke-direct {p0}, Ljava/text/Format;-><init>()V

    .line 398
    new-instance v0, Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-direct {v0, p1, p2, p3}, Lorg/apache/commons/lang3/time/FastDatePrinter;-><init>(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)V

    iput-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    .line 399
    new-instance v0, Lorg/apache/commons/lang3/time/FastDateParser;

    invoke-direct {v0, p1, p2, p3, p4}, Lorg/apache/commons/lang3/time/FastDateParser;-><init>(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;Ljava/util/Date;)V

    iput-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->parser:Lorg/apache/commons/lang3/time/FastDateParser;

    return-void
.end method

.method public static getDateInstance(I)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2

    .line 194
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, v1}, Lorg/apache/commons/lang3/time/FormatCache;->getDateInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getDateInstance(ILjava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2

    .line 209
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Lorg/apache/commons/lang3/time/FormatCache;->getDateInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getDateInstance(ILjava/util/TimeZone;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2

    .line 225
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1}, Lorg/apache/commons/lang3/time/FormatCache;->getDateInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getDateInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 1

    .line 241
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-virtual {v0, p0, p1, p2}, Lorg/apache/commons/lang3/time/FormatCache;->getDateInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getDateTimeInstance(II)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2

    .line 319
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1, v1}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(IILjava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getDateTimeInstance(IILjava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2

    .line 335
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1, p2}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(IILjava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getDateTimeInstance(IILjava/util/TimeZone;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 1

    const/4 v0, 0x0

    .line 352
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/time/FastDateFormat;->getDateTimeInstance(IILjava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;

    move-result-object p0

    return-object p0
.end method

.method public static getDateTimeInstance(IILjava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 1

    .line 369
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-virtual {v0, p0, p1, p2, p3}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(IILjava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getInstance()Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 1

    .line 120
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-virtual {v0}, Lorg/apache/commons/lang3/time/FormatCache;->getInstance()Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getInstance(Ljava/lang/String;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2

    .line 133
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, v1}, Lorg/apache/commons/lang3/time/FormatCache;->getInstance(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getInstance(Ljava/lang/String;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2

    .line 162
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Lorg/apache/commons/lang3/time/FormatCache;->getInstance(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getInstance(Ljava/lang/String;Ljava/util/TimeZone;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2

    .line 148
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1}, Lorg/apache/commons/lang3/time/FormatCache;->getInstance(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getInstance(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 1

    .line 179
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-virtual {v0, p0, p1, p2}, Lorg/apache/commons/lang3/time/FormatCache;->getInstance(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getTimeInstance(I)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2

    .line 256
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, v1}, Lorg/apache/commons/lang3/time/FormatCache;->getTimeInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getTimeInstance(ILjava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2

    .line 271
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Lorg/apache/commons/lang3/time/FormatCache;->getTimeInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getTimeInstance(ILjava/util/TimeZone;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2

    .line 287
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1}, Lorg/apache/commons/lang3/time/FormatCache;->getTimeInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method

.method public static getTimeInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 1

    .line 303
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-virtual {v0, p0, p1, p2}, Lorg/apache/commons/lang3/time/FormatCache;->getTimeInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object p0
.end method


# virtual methods
.method protected applyRules(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 674
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->applyRules(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 635
    instance-of v0, p1, Lorg/apache/commons/lang3/time/FastDateFormat;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 638
    :cond_0
    check-cast p1, Lorg/apache/commons/lang3/time/FastDateFormat;

    .line 640
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    iget-object p1, p1, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0, p1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public format(JLjava/lang/Appendable;)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B::",
            "Ljava/lang/Appendable;",
            ">(JTB;)TB;"
        }
    .end annotation

    .line 510
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0, p1, p2, p3}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(JLjava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object p1

    return-object p1
.end method

.method public format(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B::",
            "Ljava/lang/Appendable;",
            ">(",
            "Ljava/util/Calendar;",
            "TB;)TB;"
        }
    .end annotation

    .line 538
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object p1

    return-object p1
.end method

.method public format(Ljava/util/Date;Ljava/lang/Appendable;)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B::",
            "Ljava/lang/Appendable;",
            ">(",
            "Ljava/util/Date;",
            "TB;)TB;"
        }
    .end annotation

    .line 524
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Date;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object p1

    return-object p1
.end method

.method public format(J)Ljava/lang/String;
    .locals 1

    .line 428
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public format(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 1

    .line 450
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0, p1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public format(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    .line 439
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0, p1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public format(JLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 466
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0, p1, p2, p3}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(JLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object p1

    return-object p1
.end method

.method public format(Ljava/lang/Object;Ljava/lang/StringBuffer;Ljava/text/FieldPosition;)Ljava/lang/StringBuffer;
    .locals 0

    .line 416
    iget-object p3, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {p3, p1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-object p2
.end method

.method public format(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 496
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object p1

    return-object p1
.end method

.method public format(Ljava/util/Date;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 481
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Date;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object p1

    return-object p1
.end method

.method public getLocale()Ljava/util/Locale;
    .locals 1

    .line 609
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->getLocale()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public getMaxLengthEstimate()I
    .locals 1

    .line 622
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->getMaxLengthEstimate()I

    move-result v0

    return v0
.end method

.method public getPattern()Ljava/lang/String;
    .locals 1

    .line 587
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->getPattern()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTimeZone()Ljava/util/TimeZone;
    .locals 1

    .line 599
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 650
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->hashCode()I

    move-result v0

    return v0
.end method

.method public parse(Ljava/lang/String;)Ljava/util/Date;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 550
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->parser:Lorg/apache/commons/lang3/time/FastDateParser;

    invoke-virtual {v0, p1}, Lorg/apache/commons/lang3/time/FastDateParser;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
    .locals 1

    .line 558
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->parser:Lorg/apache/commons/lang3/time/FastDateParser;

    invoke-virtual {v0, p1, p2}, Lorg/apache/commons/lang3/time/FastDateParser;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public parse(Ljava/lang/String;Ljava/text/ParsePosition;Ljava/util/Calendar;)Z
    .locals 1

    .line 567
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->parser:Lorg/apache/commons/lang3/time/FastDateParser;

    invoke-virtual {v0, p1, p2, p3}, Lorg/apache/commons/lang3/time/FastDateParser;->parse(Ljava/lang/String;Ljava/text/ParsePosition;Ljava/util/Calendar;)Z

    move-result p1

    return p1
.end method

.method public parseObject(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/lang/Object;
    .locals 1

    .line 575
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->parser:Lorg/apache/commons/lang3/time/FastDateParser;

    invoke-virtual {v0, p1, p2}, Lorg/apache/commons/lang3/time/FastDateParser;->parseObject(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 660
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FastDateFormat["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->getPattern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->printer:Lorg/apache/commons/lang3/time/FastDatePrinter;

    invoke-virtual {v1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
