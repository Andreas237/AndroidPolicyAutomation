.class abstract Lorg/joda/time/format/DateTimeFormatterBuilder$NumberFormatter;
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
    accessFlags = 0x408
    name = "NumberFormatter"
.end annotation


# instance fields
.field protected final iFieldType:Lorg/joda/time/DateTimeFieldType;

.field protected final iMaxParsedDigits:I

.field protected final iSigned:Z


# direct methods
.method constructor <init>(Lorg/joda/time/DateTimeFieldType;IZ)V
    .locals 0

    .line 1293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1294
    iput-object p1, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$NumberFormatter;->iFieldType:Lorg/joda/time/DateTimeFieldType;

    .line 1295
    iput p2, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$NumberFormatter;->iMaxParsedDigits:I

    .line 1296
    iput-boolean p3, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$NumberFormatter;->iSigned:Z

    return-void
.end method


# virtual methods
.method public estimateParsedLength()I
    .locals 1

    .line 1300
    iget v0, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$NumberFormatter;->iMaxParsedDigits:I

    return v0
.end method

.method public parseInto(Lorg/joda/time/format/DateTimeParserBucket;Ljava/lang/CharSequence;I)I
    .locals 11

    .line 1304
    iget v0, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$NumberFormatter;->iMaxParsedDigits:I

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    move v2, p3

    move p3, v1

    move v3, p3

    :goto_0
    const/16 v4, 0x30

    if-ge p3, v0, :cond_6

    add-int v5, v2, p3

    .line 1309
    invoke-interface {p2, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    const/16 v7, 0x39

    if-nez p3, :cond_4

    const/16 v8, 0x2d

    if-eq v6, v8, :cond_0

    const/16 v9, 0x2b

    if-ne v6, v9, :cond_4

    .line 1310
    :cond_0
    iget-boolean v9, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$NumberFormatter;->iSigned:Z

    if-eqz v9, :cond_4

    if-ne v6, v8, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    add-int/lit8 v6, p3, 0x1

    if-ge v6, v0, :cond_6

    add-int/lit8 v5, v5, 0x1

    .line 1314
    invoke-interface {p2, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-lt v5, v4, :cond_6

    if-le v5, v7, :cond_2

    goto :goto_3

    :cond_2
    if-eqz v3, :cond_3

    move p3, v6

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 1327
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_4
    if-lt v6, v4, :cond_6

    if-le v6, v7, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_6
    :goto_3
    if-nez p3, :cond_7

    xor-int/lit8 p1, v2, -0x1

    return p1

    :cond_7
    const/16 v0, 0x9

    if-lt p3, v0, :cond_8

    add-int/2addr p3, v2

    .line 1344
    invoke-interface {p2, v2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    goto :goto_6

    :cond_8
    if-eqz v3, :cond_9

    add-int/lit8 v0, v2, 0x1

    goto :goto_4

    :cond_9
    move v0, v2

    :goto_4
    add-int/lit8 v1, v0, 0x1

    .line 1351
    :try_start_0
    invoke-interface {p2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    sub-int/2addr v0, v4

    add-int/2addr p3, v2

    :goto_5
    if-ge v1, p3, :cond_a

    shl-int/lit8 v2, v0, 0x3

    shl-int/lit8 v0, v0, 0x1

    add-int/2addr v2, v0

    add-int/lit8 v0, v1, 0x1

    .line 1357
    invoke-interface {p2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    add-int/2addr v2, v1

    add-int/lit8 v1, v2, -0x30

    move v10, v1

    move v1, v0

    move v0, v10

    goto :goto_5

    :cond_a
    if-eqz v3, :cond_b

    neg-int p2, v0

    goto :goto_6

    :cond_b
    move p2, v0

    .line 1364
    :goto_6
    iget-object v0, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$NumberFormatter;->iFieldType:Lorg/joda/time/DateTimeFieldType;

    invoke-virtual {p1, v0, p2}, Lorg/joda/time/format/DateTimeParserBucket;->saveField(Lorg/joda/time/DateTimeFieldType;I)V

    return p3

    :catch_0
    xor-int/lit8 p1, v2, -0x1

    return p1
.end method
