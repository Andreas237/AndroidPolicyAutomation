.class public Lorg/joda/time/format/DateTimeParserBucket;
.super Ljava/lang/Object;
.source "DateTimeParserBucket.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/joda/time/format/DateTimeParserBucket$SavedField;,
        Lorg/joda/time/format/DateTimeParserBucket$SavedState;
    }
.end annotation


# instance fields
.field private final iChrono:Lorg/joda/time/Chronology;

.field private final iDefaultPivotYear:Ljava/lang/Integer;

.field private final iDefaultYear:I

.field private final iDefaultZone:Lorg/joda/time/DateTimeZone;

.field private final iLocale:Ljava/util/Locale;

.field private final iMillis:J

.field private iOffset:Ljava/lang/Integer;

.field private iPivotYear:Ljava/lang/Integer;

.field private iSavedFields:[Lorg/joda/time/format/DateTimeParserBucket$SavedField;

.field private iSavedFieldsCount:I

.field private iSavedFieldsShared:Z

.field private iSavedState:Ljava/lang/Object;

.field private iZone:Lorg/joda/time/DateTimeZone;


# direct methods
.method public constructor <init>(JLorg/joda/time/Chronology;Ljava/util/Locale;)V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v5, 0x0

    const/16 v6, 0x7d0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    .line 94
    invoke-direct/range {v0 .. v6}, Lorg/joda/time/format/DateTimeParserBucket;-><init>(JLorg/joda/time/Chronology;Ljava/util/Locale;Ljava/lang/Integer;I)V

    return-void
.end method

.method public constructor <init>(JLorg/joda/time/Chronology;Ljava/util/Locale;Ljava/lang/Integer;)V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/16 v6, 0x7d0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 110
    invoke-direct/range {v0 .. v6}, Lorg/joda/time/format/DateTimeParserBucket;-><init>(JLorg/joda/time/Chronology;Ljava/util/Locale;Ljava/lang/Integer;I)V

    return-void
.end method

.method public constructor <init>(JLorg/joda/time/Chronology;Ljava/util/Locale;Ljava/lang/Integer;I)V
    .locals 0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    invoke-static {p3}, Lorg/joda/time/DateTimeUtils;->getChronology(Lorg/joda/time/Chronology;)Lorg/joda/time/Chronology;

    move-result-object p3

    .line 128
    iput-wide p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iMillis:J

    .line 129
    invoke-virtual {p3}, Lorg/joda/time/Chronology;->getZone()Lorg/joda/time/DateTimeZone;

    move-result-object p1

    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iDefaultZone:Lorg/joda/time/DateTimeZone;

    .line 130
    invoke-virtual {p3}, Lorg/joda/time/Chronology;->withUTC()Lorg/joda/time/Chronology;

    move-result-object p1

    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iChrono:Lorg/joda/time/Chronology;

    if-nez p4, :cond_0

    .line 131
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p4

    :cond_0
    iput-object p4, p0, Lorg/joda/time/format/DateTimeParserBucket;->iLocale:Ljava/util/Locale;

    .line 132
    iput p6, p0, Lorg/joda/time/format/DateTimeParserBucket;->iDefaultYear:I

    .line 133
    iput-object p5, p0, Lorg/joda/time/format/DateTimeParserBucket;->iDefaultPivotYear:Ljava/lang/Integer;

    .line 135
    iget-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iDefaultZone:Lorg/joda/time/DateTimeZone;

    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iZone:Lorg/joda/time/DateTimeZone;

    .line 136
    iget-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iDefaultPivotYear:Ljava/lang/Integer;

    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iPivotYear:Ljava/lang/Integer;

    const/16 p1, 0x8

    .line 137
    new-array p1, p1, [Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFields:[Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    return-void
.end method

.method static synthetic access$000(Lorg/joda/time/format/DateTimeParserBucket;)Lorg/joda/time/DateTimeZone;
    .locals 0

    .line 56
    iget-object p0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iZone:Lorg/joda/time/DateTimeZone;

    return-object p0
.end method

.method static synthetic access$002(Lorg/joda/time/format/DateTimeParserBucket;Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTimeZone;
    .locals 0

    .line 56
    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iZone:Lorg/joda/time/DateTimeZone;

    return-object p1
.end method

.method static synthetic access$100(Lorg/joda/time/format/DateTimeParserBucket;)Ljava/lang/Integer;
    .locals 0

    .line 56
    iget-object p0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iOffset:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$102(Lorg/joda/time/format/DateTimeParserBucket;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 56
    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iOffset:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic access$200(Lorg/joda/time/format/DateTimeParserBucket;)[Lorg/joda/time/format/DateTimeParserBucket$SavedField;
    .locals 0

    .line 56
    iget-object p0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFields:[Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    return-object p0
.end method

.method static synthetic access$202(Lorg/joda/time/format/DateTimeParserBucket;[Lorg/joda/time/format/DateTimeParserBucket$SavedField;)[Lorg/joda/time/format/DateTimeParserBucket$SavedField;
    .locals 0

    .line 56
    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFields:[Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    return-object p1
.end method

.method static synthetic access$300(Lorg/joda/time/format/DateTimeParserBucket;)I
    .locals 0

    .line 56
    iget p0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsCount:I

    return p0
.end method

.method static synthetic access$302(Lorg/joda/time/format/DateTimeParserBucket;I)I
    .locals 0

    .line 56
    iput p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsCount:I

    return p1
.end method

.method static synthetic access$402(Lorg/joda/time/format/DateTimeParserBucket;Z)Z
    .locals 0

    .line 56
    iput-boolean p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsShared:Z

    return p1
.end method

.method static compareReverse(Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)I
    .locals 1

    if-eqz p0, :cond_3

    .line 596
    invoke-virtual {p0}, Lorg/joda/time/DurationField;->isSupported()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_2

    .line 602
    invoke-virtual {p1}, Lorg/joda/time/DurationField;->isSupported()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 605
    :cond_1
    invoke-virtual {p0, p1}, Lorg/joda/time/DurationField;->compareTo(Ljava/lang/Object;)I

    move-result p0

    neg-int p0, p0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    if-eqz p1, :cond_5

    .line 597
    invoke-virtual {p1}, Lorg/joda/time/DurationField;->isSupported()Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    const/4 p0, -0x1

    return p0

    :cond_5
    :goto_2
    const/4 p0, 0x0

    return p0
.end method

.method private obtainSaveField()Lorg/joda/time/format/DateTimeParserBucket$SavedField;
    .locals 4

    .line 324
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFields:[Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    .line 325
    iget v1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsCount:I

    .line 327
    array-length v2, v0

    if-eq v1, v2, :cond_0

    iget-boolean v2, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsShared:Z

    if-eqz v2, :cond_2

    .line 329
    :cond_0
    array-length v2, v0

    if-ne v1, v2, :cond_1

    mul-int/lit8 v2, v1, 0x2

    goto :goto_0

    :cond_1
    array-length v2, v0

    :goto_0
    new-array v2, v2, [Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    const/4 v3, 0x0

    .line 331
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 332
    iput-object v2, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFields:[Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    .line 333
    iput-boolean v3, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsShared:Z

    move-object v0, v2

    :cond_2
    const/4 v2, 0x0

    .line 336
    iput-object v2, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedState:Ljava/lang/Object;

    .line 337
    aget-object v2, v0, v1

    if-nez v2, :cond_3

    .line 339
    new-instance v2, Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    invoke-direct {v2}, Lorg/joda/time/format/DateTimeParserBucket$SavedField;-><init>()V

    aput-object v2, v0, v1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 341
    iput v1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsCount:I

    return-object v2
.end method

.method private static sort([Lorg/joda/time/format/DateTimeParserBucket$SavedField;I)V
    .locals 5

    const/4 v0, 0x0

    const/16 v1, 0xa

    if-le p1, v1, :cond_0

    .line 498
    invoke-static {p0, v0, p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;II)V

    goto :goto_2

    :cond_0
    :goto_0
    if-ge v0, p1, :cond_2

    move v1, v0

    :goto_1
    if-lez v1, :cond_1

    add-int/lit8 v2, v1, -0x1

    .line 501
    aget-object v3, p0, v2

    aget-object v4, p0, v1

    invoke-virtual {v3, v4}, Lorg/joda/time/format/DateTimeParserBucket$SavedField;->compareTo(Lorg/joda/time/format/DateTimeParserBucket$SavedField;)I

    move-result v3

    if-lez v3, :cond_1

    .line 502
    aget-object v3, p0, v1

    .line 503
    aget-object v4, p0, v2

    aput-object v4, p0, v1

    .line 504
    aput-object v3, p0, v2

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method


# virtual methods
.method public computeMillis()J
    .locals 2

    const/4 v0, 0x0

    .line 385
    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lorg/joda/time/format/DateTimeParserBucket;->computeMillis(ZLjava/lang/CharSequence;)J

    move-result-wide v0

    return-wide v0
.end method

.method public computeMillis(Z)J
    .locals 2

    const/4 v0, 0x0

    .line 397
    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1, v0}, Lorg/joda/time/format/DateTimeParserBucket;->computeMillis(ZLjava/lang/CharSequence;)J

    move-result-wide v0

    return-wide v0
.end method

.method public computeMillis(ZLjava/lang/CharSequence;)J
    .locals 7

    .line 425
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFields:[Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    .line 426
    iget v1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsCount:I

    .line 427
    iget-boolean v2, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsShared:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 429
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFields:[Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    invoke-virtual {v0}, [Lorg/joda/time/format/DateTimeParserBucket$SavedField;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    iput-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFields:[Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    .line 430
    iput-boolean v3, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsShared:Z

    .line 432
    :cond_0
    invoke-static {v0, v1}, Lorg/joda/time/format/DateTimeParserBucket;->sort([Lorg/joda/time/format/DateTimeParserBucket$SavedField;I)V

    if-lez v1, :cond_1

    .line 435
    invoke-static {}, Lorg/joda/time/DurationFieldType;->months()Lorg/joda/time/DurationFieldType;

    move-result-object v2

    iget-object v4, p0, Lorg/joda/time/format/DateTimeParserBucket;->iChrono:Lorg/joda/time/Chronology;

    invoke-virtual {v2, v4}, Lorg/joda/time/DurationFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DurationField;

    move-result-object v2

    .line 436
    invoke-static {}, Lorg/joda/time/DurationFieldType;->days()Lorg/joda/time/DurationFieldType;

    move-result-object v4

    iget-object v5, p0, Lorg/joda/time/format/DateTimeParserBucket;->iChrono:Lorg/joda/time/Chronology;

    invoke-virtual {v4, v5}, Lorg/joda/time/DurationFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DurationField;

    move-result-object v4

    .line 437
    aget-object v5, v0, v3

    iget-object v5, v5, Lorg/joda/time/format/DateTimeParserBucket$SavedField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v5}, Lorg/joda/time/DateTimeField;->getDurationField()Lorg/joda/time/DurationField;

    move-result-object v5

    .line 438
    invoke-static {v5, v2}, Lorg/joda/time/format/DateTimeParserBucket;->compareReverse(Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)I

    move-result v2

    if-ltz v2, :cond_1

    invoke-static {v5, v4}, Lorg/joda/time/format/DateTimeParserBucket;->compareReverse(Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)I

    move-result v2

    if-gtz v2, :cond_1

    .line 439
    invoke-static {}, Lorg/joda/time/DateTimeFieldType;->year()Lorg/joda/time/DateTimeFieldType;

    move-result-object v0

    iget v1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iDefaultYear:I

    invoke-virtual {p0, v0, v1}, Lorg/joda/time/format/DateTimeParserBucket;->saveField(Lorg/joda/time/DateTimeFieldType;I)V

    .line 440
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/format/DateTimeParserBucket;->computeMillis(ZLjava/lang/CharSequence;)J

    move-result-wide p1

    return-wide p1

    .line 444
    :cond_1
    iget-wide v4, p0, Lorg/joda/time/format/DateTimeParserBucket;->iMillis:J

    move v2, v3

    :goto_0
    if-ge v2, v1, :cond_2

    .line 447
    :try_start_0
    aget-object v6, v0, v2

    invoke-virtual {v6, v4, v5, p1}, Lorg/joda/time/format/DateTimeParserBucket$SavedField;->set(JZ)J

    move-result-wide v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_2
    if-eqz p1, :cond_5

    move p1, v3

    :goto_1
    if-ge p1, v1, :cond_5

    .line 451
    aget-object v2, v0, p1

    add-int/lit8 v6, v1, -0x1

    if-ne p1, v6, :cond_3

    const/4 v6, 0x1

    goto :goto_2

    :cond_3
    move v6, v3

    :goto_2
    invoke-virtual {v2, v4, v5, v6}, Lorg/joda/time/format/DateTimeParserBucket$SavedField;->set(JZ)J

    move-result-wide v4
    :try_end_0
    .catch Lorg/joda/time/IllegalFieldValueException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :goto_3
    if-eqz p2, :cond_4

    .line 456
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot parse \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x22

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/joda/time/IllegalFieldValueException;->prependMessage(Ljava/lang/String;)V

    .line 458
    :cond_4
    throw p1

    .line 461
    :cond_5
    iget-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iOffset:Ljava/lang/Integer;

    if-eqz p1, :cond_6

    .line 462
    iget-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iOffset:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long p1, p1

    sub-long v0, v4, p1

    goto :goto_4

    .line 463
    :cond_6
    iget-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iZone:Lorg/joda/time/DateTimeZone;

    if-eqz p1, :cond_9

    .line 464
    iget-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iZone:Lorg/joda/time/DateTimeZone;

    invoke-virtual {p1, v4, v5}, Lorg/joda/time/DateTimeZone;->getOffsetFromLocal(J)I

    move-result p1

    int-to-long v0, p1

    sub-long v2, v4, v0

    .line 466
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iZone:Lorg/joda/time/DateTimeZone;

    invoke-virtual {v0, v2, v3}, Lorg/joda/time/DateTimeZone;->getOffset(J)I

    move-result v0

    if-eq p1, v0, :cond_8

    .line 467
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Illegal instant due to time zone offset transition ("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iZone:Lorg/joda/time/DateTimeZone;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_7

    .line 469
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot parse \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\": "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 471
    :cond_7
    new-instance p2, Lorg/joda/time/IllegalInstantException;

    invoke-direct {p2, p1}, Lorg/joda/time/IllegalInstantException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    move-wide v0, v2

    goto :goto_4

    :cond_9
    move-wide v0, v4

    :goto_4
    return-wide v0
.end method

.method public computeMillis(ZLjava/lang/String;)J
    .locals 0

    .line 411
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/format/DateTimeParserBucket;->computeMillis(ZLjava/lang/CharSequence;)J

    move-result-wide p1

    return-wide p1
.end method

.method doParseMillis(Lorg/joda/time/format/InternalParser;Ljava/lang/CharSequence;)J
    .locals 1

    const/4 v0, 0x0

    .line 179
    invoke-interface {p1, p0, p2, v0}, Lorg/joda/time/format/InternalParser;->parseInto(Lorg/joda/time/format/DateTimeParserBucket;Ljava/lang/CharSequence;I)I

    move-result p1

    if-ltz p1, :cond_0

    .line 181
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lt p1, v0, :cond_1

    const/4 p1, 0x1

    .line 182
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/format/DateTimeParserBucket;->computeMillis(ZLjava/lang/CharSequence;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    xor-int/lit8 p1, p1, -0x1

    .line 187
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lorg/joda/time/format/FormatUtils;->createErrorMessage(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getChronology()Lorg/joda/time/Chronology;
    .locals 1

    .line 195
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iChrono:Lorg/joda/time/Chronology;

    return-object v0
.end method

.method public getLocale()Ljava/util/Locale;
    .locals 1

    .line 205
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iLocale:Ljava/util/Locale;

    return-object v0
.end method

.method public getOffset()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 231
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iOffset:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iOffset:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getOffsetInteger()Ljava/lang/Integer;
    .locals 1

    .line 238
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iOffset:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPivotYear()Ljava/lang/Integer;
    .locals 1

    .line 273
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iPivotYear:Ljava/lang/Integer;

    return-object v0
.end method

.method public getZone()Lorg/joda/time/DateTimeZone;
    .locals 1

    .line 213
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iZone:Lorg/joda/time/DateTimeZone;

    return-object v0
.end method

.method public parseMillis(Lorg/joda/time/format/DateTimeParser;Ljava/lang/CharSequence;)J
    .locals 0

    .line 174
    invoke-virtual {p0}, Lorg/joda/time/format/DateTimeParserBucket;->reset()V

    .line 175
    invoke-static {p1}, Lorg/joda/time/format/DateTimeParserInternalParser;->of(Lorg/joda/time/format/DateTimeParser;)Lorg/joda/time/format/InternalParser;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lorg/joda/time/format/DateTimeParserBucket;->doParseMillis(Lorg/joda/time/format/InternalParser;Ljava/lang/CharSequence;)J

    move-result-wide p1

    return-wide p1
.end method

.method public reset()V
    .locals 2

    .line 150
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iDefaultZone:Lorg/joda/time/DateTimeZone;

    iput-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iZone:Lorg/joda/time/DateTimeZone;

    const/4 v0, 0x0

    .line 151
    iput-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iOffset:Ljava/lang/Integer;

    .line 152
    iget-object v1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iDefaultPivotYear:Ljava/lang/Integer;

    iput-object v1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iPivotYear:Ljava/lang/Integer;

    const/4 v1, 0x0

    .line 153
    iput v1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsCount:I

    .line 154
    iput-boolean v1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedFieldsShared:Z

    .line 155
    iput-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedState:Ljava/lang/Object;

    return-void
.end method

.method public restoreState(Ljava/lang/Object;)Z
    .locals 1

    .line 368
    instance-of v0, p1, Lorg/joda/time/format/DateTimeParserBucket$SavedState;

    if-eqz v0, :cond_0

    .line 369
    move-object v0, p1

    check-cast v0, Lorg/joda/time/format/DateTimeParserBucket$SavedState;

    invoke-virtual {v0, p0}, Lorg/joda/time/format/DateTimeParserBucket$SavedState;->restoreState(Lorg/joda/time/format/DateTimeParserBucket;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 370
    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedState:Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public saveField(Lorg/joda/time/DateTimeField;I)V
    .locals 1

    .line 299
    invoke-direct {p0}, Lorg/joda/time/format/DateTimeParserBucket;->obtainSaveField()Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/format/DateTimeParserBucket$SavedField;->init(Lorg/joda/time/DateTimeField;I)V

    return-void
.end method

.method public saveField(Lorg/joda/time/DateTimeFieldType;I)V
    .locals 2

    .line 309
    invoke-direct {p0}, Lorg/joda/time/format/DateTimeParserBucket;->obtainSaveField()Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    move-result-object v0

    iget-object v1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iChrono:Lorg/joda/time/Chronology;

    invoke-virtual {p1, v1}, Lorg/joda/time/DateTimeFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/format/DateTimeParserBucket$SavedField;->init(Lorg/joda/time/DateTimeField;I)V

    return-void
.end method

.method public saveField(Lorg/joda/time/DateTimeFieldType;Ljava/lang/String;Ljava/util/Locale;)V
    .locals 2

    .line 320
    invoke-direct {p0}, Lorg/joda/time/format/DateTimeParserBucket;->obtainSaveField()Lorg/joda/time/format/DateTimeParserBucket$SavedField;

    move-result-object v0

    iget-object v1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iChrono:Lorg/joda/time/Chronology;

    invoke-virtual {p1, v1}, Lorg/joda/time/DateTimeFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/format/DateTimeParserBucket$SavedField;->init(Lorg/joda/time/DateTimeField;Ljava/lang/String;Ljava/util/Locale;)V

    return-void
.end method

.method public saveState()Ljava/lang/Object;
    .locals 1

    .line 353
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedState:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 354
    new-instance v0, Lorg/joda/time/format/DateTimeParserBucket$SavedState;

    invoke-direct {v0, p0}, Lorg/joda/time/format/DateTimeParserBucket$SavedState;-><init>(Lorg/joda/time/format/DateTimeParserBucket;)V

    iput-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedState:Ljava/lang/Object;

    .line 356
    :cond_0
    iget-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedState:Ljava/lang/Object;

    return-object v0
.end method

.method public setOffset(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 247
    iput-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedState:Ljava/lang/Object;

    .line 248
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iOffset:Ljava/lang/Integer;

    return-void
.end method

.method public setOffset(Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x0

    .line 255
    iput-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedState:Ljava/lang/Object;

    .line 256
    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iOffset:Ljava/lang/Integer;

    return-void
.end method

.method public setPivotYear(Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 288
    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iPivotYear:Ljava/lang/Integer;

    return-void
.end method

.method public setZone(Lorg/joda/time/DateTimeZone;)V
    .locals 1

    const/4 v0, 0x0

    .line 220
    iput-object v0, p0, Lorg/joda/time/format/DateTimeParserBucket;->iSavedState:Ljava/lang/Object;

    .line 221
    iput-object p1, p0, Lorg/joda/time/format/DateTimeParserBucket;->iZone:Lorg/joda/time/DateTimeZone;

    return-void
.end method
