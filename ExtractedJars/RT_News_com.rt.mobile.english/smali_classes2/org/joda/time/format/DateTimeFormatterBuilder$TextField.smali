.class Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;
.super Ljava/lang/Object;
.source "DateTimeFormatterBuilder.java"

# interfaces
.implements Lorg/joda/time/format/InternalPrinter;
.implements Lorg/joda/time/format/InternalParser;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/joda/time/format/DateTimeFormatterBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "TextField"
.end annotation


# static fields
.field private static cParseCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/Locale;",
            "Ljava/util/Map<",
            "Lorg/joda/time/DateTimeFieldType;",
            "[",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final iFieldType:Lorg/joda/time/DateTimeFieldType;

.field private final iShort:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1655
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->cParseCache:Ljava/util/Map;

    return-void
.end method

.method constructor <init>(Lorg/joda/time/DateTimeFieldType;Z)V
    .locals 0

    .line 1661
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1662
    iput-object p1, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iFieldType:Lorg/joda/time/DateTimeFieldType;

    .line 1663
    iput-boolean p2, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iShort:Z

    return-void
.end method

.method private print(JLorg/joda/time/Chronology;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 1689
    iget-object v0, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iFieldType:Lorg/joda/time/DateTimeFieldType;

    invoke-virtual {v0, p3}, Lorg/joda/time/DateTimeFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;

    move-result-object p3

    .line 1690
    iget-boolean v0, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iShort:Z

    if-eqz v0, :cond_0

    .line 1691
    invoke-virtual {p3, p1, p2, p4}, Lorg/joda/time/DateTimeField;->getAsShortText(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1693
    :cond_0
    invoke-virtual {p3, p1, p2, p4}, Lorg/joda/time/DateTimeField;->getAsText(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private print(Lorg/joda/time/ReadablePartial;Ljava/util/Locale;)Ljava/lang/String;
    .locals 2

    .line 1698
    iget-object v0, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iFieldType:Lorg/joda/time/DateTimeFieldType;

    invoke-interface {p1, v0}, Lorg/joda/time/ReadablePartial;->isSupported(Lorg/joda/time/DateTimeFieldType;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1699
    iget-object v0, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iFieldType:Lorg/joda/time/DateTimeFieldType;

    invoke-interface {p1}, Lorg/joda/time/ReadablePartial;->getChronology()Lorg/joda/time/Chronology;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/joda/time/DateTimeFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;

    move-result-object v0

    .line 1700
    iget-boolean v1, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iShort:Z

    if-eqz v1, :cond_0

    .line 1701
    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getAsShortText(Lorg/joda/time/ReadablePartial;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1703
    :cond_0
    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getAsText(Lorg/joda/time/ReadablePartial;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, "\ufffd"

    return-object p1
.end method


# virtual methods
.method public estimateParsedLength()I
    .locals 1

    .line 1711
    invoke-virtual {p0}, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->estimatePrintedLength()I

    move-result v0

    return v0
.end method

.method public estimatePrintedLength()I
    .locals 1

    .line 1667
    iget-boolean v0, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iShort:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    goto :goto_0

    :cond_0
    const/16 v0, 0x14

    :goto_0
    return v0
.end method

.method public parseInto(Lorg/joda/time/format/DateTimeParserBucket;Ljava/lang/CharSequence;I)I
    .locals 11

    .line 1716
    invoke-virtual {p1}, Lorg/joda/time/format/DateTimeParserBucket;->getLocale()Ljava/util/Locale;

    move-result-object v0

    .line 1721
    sget-object v1, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->cParseCache:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-nez v1, :cond_0

    .line 1723
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 1724
    sget-object v2, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->cParseCache:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1726
    :cond_0
    iget-object v2, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iFieldType:Lorg/joda/time/DateTimeFieldType;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_4

    .line 1728
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v5, 0x20

    invoke-direct {v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 1729
    new-instance v6, Lorg/joda/time/MutableDateTime;

    const-wide/16 v7, 0x0

    sget-object v9, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-direct {v6, v7, v8, v9}, Lorg/joda/time/MutableDateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    .line 1730
    iget-object v7, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iFieldType:Lorg/joda/time/DateTimeFieldType;

    invoke-virtual {v6, v7}, Lorg/joda/time/MutableDateTime;->property(Lorg/joda/time/DateTimeFieldType;)Lorg/joda/time/MutableDateTime$Property;

    move-result-object v6

    .line 1731
    invoke-virtual {v6}, Lorg/joda/time/MutableDateTime$Property;->getMinimumValueOverall()I

    move-result v7

    .line 1732
    invoke-virtual {v6}, Lorg/joda/time/MutableDateTime$Property;->getMaximumValueOverall()I

    move-result v8

    sub-int v9, v8, v7

    if-le v9, v5, :cond_1

    xor-int/lit8 p1, p3, -0x1

    return p1

    .line 1736
    :cond_1
    invoke-virtual {v6, v0}, Lorg/joda/time/MutableDateTime$Property;->getMaximumTextLength(Ljava/util/Locale;)I

    move-result v5

    :goto_0
    if-gt v7, v8, :cond_2

    .line 1738
    invoke-virtual {v6, v7}, Lorg/joda/time/MutableDateTime$Property;->set(I)Lorg/joda/time/MutableDateTime;

    .line 1739
    invoke-virtual {v6, v0}, Lorg/joda/time/MutableDateTime$Property;->getAsShortText(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1740
    invoke-virtual {v6, v0}, Lorg/joda/time/MutableDateTime$Property;->getAsShortText(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1741
    invoke-virtual {v6, v0}, Lorg/joda/time/MutableDateTime$Property;->getAsShortText(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1742
    invoke-virtual {v6, v0}, Lorg/joda/time/MutableDateTime$Property;->getAsText(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1743
    invoke-virtual {v6, v0}, Lorg/joda/time/MutableDateTime$Property;->getAsText(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1744
    invoke-virtual {v6, v0}, Lorg/joda/time/MutableDateTime$Property;->getAsText(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    const-string v6, "en"

    .line 1746
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v6, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iFieldType:Lorg/joda/time/DateTimeFieldType;

    invoke-static {}, Lorg/joda/time/DateTimeFieldType;->era()Lorg/joda/time/DateTimeFieldType;

    move-result-object v7

    if-ne v6, v7, :cond_3

    const-string v5, "BCE"

    .line 1748
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "bce"

    .line 1749
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "CE"

    .line 1750
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "ce"

    .line 1751
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x3

    :cond_3
    const/4 v6, 0x2

    .line 1754
    new-array v6, v6, [Ljava/lang/Object;

    aput-object v2, v6, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v6, v4

    .line 1755
    iget-object v3, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iFieldType:Lorg/joda/time/DateTimeFieldType;

    invoke-interface {v1, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v2

    goto :goto_1

    .line 1757
    :cond_4
    aget-object v1, v2, v3

    check-cast v1, Ljava/util/Map;

    .line 1758
    aget-object v2, v2, v4

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 1761
    :goto_1
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    add-int/2addr v5, p3

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    :goto_2
    if-le v2, p3, :cond_6

    .line 1763
    invoke-interface {p2, p3, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1764
    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 1765
    iget-object p2, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->iFieldType:Lorg/joda/time/DateTimeFieldType;

    invoke-virtual {p1, p2, v3, v0}, Lorg/joda/time/format/DateTimeParserBucket;->saveField(Lorg/joda/time/DateTimeFieldType;Ljava/lang/String;Ljava/util/Locale;)V

    return v2

    :cond_5
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_6
    xor-int/lit8 p1, p3, -0x1

    return p1
.end method

.method public printTo(Ljava/lang/Appendable;JLorg/joda/time/Chronology;ILorg/joda/time/DateTimeZone;Ljava/util/Locale;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1674
    :try_start_0
    invoke-direct {p0, p2, p3, p4, p7}, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->print(JLorg/joda/time/Chronology;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const p2, 0xfffd

    .line 1676
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :goto_0
    return-void
.end method

.method public printTo(Ljava/lang/Appendable;Lorg/joda/time/ReadablePartial;Ljava/util/Locale;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1682
    :try_start_0
    invoke-direct {p0, p2, p3}, Lorg/joda/time/format/DateTimeFormatterBuilder$TextField;->print(Lorg/joda/time/ReadablePartial;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const p2, 0xfffd

    .line 1684
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :goto_0
    return-void
.end method
