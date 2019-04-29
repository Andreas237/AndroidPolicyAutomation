.class public abstract Lorg/joda/time/field/BaseDateTimeField;
.super Lorg/joda/time/DateTimeField;
.source "BaseDateTimeField.java"


# instance fields
.field private final iType:Lorg/joda/time/DateTimeFieldType;


# direct methods
.method protected constructor <init>(Lorg/joda/time/DateTimeFieldType;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Lorg/joda/time/DateTimeField;-><init>()V

    if-nez p1, :cond_0

    .line 52
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The type must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 54
    :cond_0
    iput-object p1, p0, Lorg/joda/time/field/BaseDateTimeField;->iType:Lorg/joda/time/DateTimeFieldType;

    return-void
.end method


# virtual methods
.method public add(JI)J
    .locals 1

    .line 253
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getDurationField()Lorg/joda/time/DurationField;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/DurationField;->add(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public add(JJ)J
    .locals 1

    .line 267
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getDurationField()Lorg/joda/time/DurationField;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DurationField;->add(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public add(Lorg/joda/time/ReadablePartial;I[II)[I
    .locals 7

    if-nez p4, :cond_0

    return-object p3

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-lez p4, :cond_4

    .line 307
    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    .line 308
    aget v2, p3, p2

    add-int/2addr v2, p4

    int-to-long v2, v2

    int-to-long v4, v1

    cmp-long v6, v2, v4

    if-gtz v6, :cond_1

    long-to-int v1, v2

    .line 310
    aput v1, p3, p2

    goto :goto_1

    :cond_1
    if-nez v0, :cond_3

    if-nez p2, :cond_2

    .line 315
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Maximum value exceeded for add"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    add-int/lit8 v0, p2, -0x1

    .line 317
    invoke-interface {p1, v0}, Lorg/joda/time/ReadablePartial;->getField(I)Lorg/joda/time/DateTimeField;

    move-result-object v0

    .line 319
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getRangeDurationField()Lorg/joda/time/DurationField;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/DurationField;->getType()Lorg/joda/time/DurationFieldType;

    move-result-object v2

    invoke-virtual {v0}, Lorg/joda/time/DateTimeField;->getDurationField()Lorg/joda/time/DurationField;

    move-result-object v3

    invoke-virtual {v3}, Lorg/joda/time/DurationField;->getType()Lorg/joda/time/DurationFieldType;

    move-result-object v3

    if-eq v2, v3, :cond_3

    .line 320
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Fields invalid for add"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 323
    aget v2, p3, p2

    sub-int/2addr v1, v2

    sub-int/2addr p4, v1

    add-int/lit8 v1, p2, -0x1

    const/4 v2, 0x1

    .line 324
    invoke-virtual {v0, p1, v1, p3, v2}, Lorg/joda/time/DateTimeField;->add(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p3

    .line 325
    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    aput v1, p3, p2

    goto :goto_0

    :cond_4
    :goto_1
    if-gez p4, :cond_8

    .line 328
    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    .line 329
    aget v2, p3, p2

    add-int/2addr v2, p4

    int-to-long v2, v2

    int-to-long v4, v1

    cmp-long v6, v2, v4

    if-ltz v6, :cond_5

    long-to-int p4, v2

    .line 331
    aput p4, p3, p2

    goto :goto_2

    :cond_5
    if-nez v0, :cond_7

    if-nez p2, :cond_6

    .line 336
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Maximum value exceeded for add"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    add-int/lit8 v0, p2, -0x1

    .line 338
    invoke-interface {p1, v0}, Lorg/joda/time/ReadablePartial;->getField(I)Lorg/joda/time/DateTimeField;

    move-result-object v0

    .line 339
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getRangeDurationField()Lorg/joda/time/DurationField;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/DurationField;->getType()Lorg/joda/time/DurationFieldType;

    move-result-object v2

    invoke-virtual {v0}, Lorg/joda/time/DateTimeField;->getDurationField()Lorg/joda/time/DurationField;

    move-result-object v3

    invoke-virtual {v3}, Lorg/joda/time/DurationField;->getType()Lorg/joda/time/DurationFieldType;

    move-result-object v3

    if-eq v2, v3, :cond_7

    .line 340
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Fields invalid for add"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    add-int/lit8 v1, v1, -0x1

    .line 343
    aget v2, p3, p2

    sub-int/2addr v1, v2

    sub-int/2addr p4, v1

    add-int/lit8 v1, p2, -0x1

    const/4 v2, -0x1

    .line 344
    invoke-virtual {v0, p1, v1, p3, v2}, Lorg/joda/time/DateTimeField;->add(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p3

    .line 345
    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    aput v1, p3, p2

    goto :goto_1

    .line 348
    :cond_8
    :goto_2
    aget p4, p3, p2

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/joda/time/field/BaseDateTimeField;->set(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    return-object p1
.end method

.method public addWrapField(JI)J
    .locals 3

    .line 461
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->get(J)I

    move-result v0

    .line 462
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->getMinimumValue(J)I

    move-result v1

    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue(J)I

    move-result v2

    invoke-static {v0, p3, v1, v2}, Lorg/joda/time/field/FieldUtils;->getWrappedValue(IIII)I

    move-result p3

    .line 464
    invoke-virtual {p0, p1, p2, p3}, Lorg/joda/time/field/BaseDateTimeField;->set(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public addWrapField(Lorg/joda/time/ReadablePartial;I[II)[I
    .locals 3

    .line 495
    aget v0, p3, p2

    .line 496
    invoke-virtual {p0, p1}, Lorg/joda/time/field/BaseDateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;)I

    move-result v1

    invoke-virtual {p0, p1}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;)I

    move-result v2

    invoke-static {v0, p4, v1, v2}, Lorg/joda/time/field/FieldUtils;->getWrappedValue(IIII)I

    move-result p4

    .line 498
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/joda/time/field/BaseDateTimeField;->set(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    return-object p1
.end method

.method public addWrapPartial(Lorg/joda/time/ReadablePartial;I[II)[I
    .locals 7

    if-nez p4, :cond_0

    return-object p3

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-lez p4, :cond_4

    .line 388
    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    .line 389
    aget v2, p3, p2

    add-int/2addr v2, p4

    int-to-long v2, v2

    int-to-long v4, v1

    cmp-long v6, v2, v4

    if-gtz v6, :cond_1

    long-to-int v1, v2

    .line 391
    aput v1, p3, p2

    goto :goto_1

    :cond_1
    if-nez v0, :cond_3

    if-nez p2, :cond_2

    add-int/lit8 v1, v1, 0x1

    .line 396
    aget v2, p3, p2

    sub-int/2addr v1, v2

    sub-int/2addr p4, v1

    .line 397
    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    aput v1, p3, p2

    goto :goto_0

    :cond_2
    add-int/lit8 v0, p2, -0x1

    .line 400
    invoke-interface {p1, v0}, Lorg/joda/time/ReadablePartial;->getField(I)Lorg/joda/time/DateTimeField;

    move-result-object v0

    .line 402
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getRangeDurationField()Lorg/joda/time/DurationField;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/DurationField;->getType()Lorg/joda/time/DurationFieldType;

    move-result-object v2

    invoke-virtual {v0}, Lorg/joda/time/DateTimeField;->getDurationField()Lorg/joda/time/DurationField;

    move-result-object v3

    invoke-virtual {v3}, Lorg/joda/time/DurationField;->getType()Lorg/joda/time/DurationFieldType;

    move-result-object v3

    if-eq v2, v3, :cond_3

    .line 403
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Fields invalid for add"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 406
    aget v2, p3, p2

    sub-int/2addr v1, v2

    sub-int/2addr p4, v1

    add-int/lit8 v1, p2, -0x1

    const/4 v2, 0x1

    .line 407
    invoke-virtual {v0, p1, v1, p3, v2}, Lorg/joda/time/DateTimeField;->addWrapPartial(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p3

    .line 408
    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    aput v1, p3, p2

    goto :goto_0

    :cond_4
    :goto_1
    if-gez p4, :cond_8

    .line 411
    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    .line 412
    aget v2, p3, p2

    add-int/2addr v2, p4

    int-to-long v2, v2

    int-to-long v4, v1

    cmp-long v6, v2, v4

    if-ltz v6, :cond_5

    long-to-int p4, v2

    .line 414
    aput p4, p3, p2

    goto :goto_2

    :cond_5
    if-nez v0, :cond_7

    if-nez p2, :cond_6

    add-int/lit8 v1, v1, -0x1

    .line 419
    aget v2, p3, p2

    sub-int/2addr v1, v2

    sub-int/2addr p4, v1

    .line 420
    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    aput v1, p3, p2

    goto :goto_1

    :cond_6
    add-int/lit8 v0, p2, -0x1

    .line 423
    invoke-interface {p1, v0}, Lorg/joda/time/ReadablePartial;->getField(I)Lorg/joda/time/DateTimeField;

    move-result-object v0

    .line 424
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getRangeDurationField()Lorg/joda/time/DurationField;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/DurationField;->getType()Lorg/joda/time/DurationFieldType;

    move-result-object v2

    invoke-virtual {v0}, Lorg/joda/time/DateTimeField;->getDurationField()Lorg/joda/time/DurationField;

    move-result-object v3

    invoke-virtual {v3}, Lorg/joda/time/DurationField;->getType()Lorg/joda/time/DurationFieldType;

    move-result-object v3

    if-eq v2, v3, :cond_7

    .line 425
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Fields invalid for add"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    add-int/lit8 v1, v1, -0x1

    .line 428
    aget v2, p3, p2

    sub-int/2addr v1, v2

    sub-int/2addr p4, v1

    add-int/lit8 v1, p2, -0x1

    const/4 v2, -0x1

    .line 429
    invoke-virtual {v0, p1, v1, p3, v2}, Lorg/joda/time/DateTimeField;->addWrapPartial(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p3

    .line 430
    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    aput v1, p3, p2

    goto :goto_1

    .line 433
    :cond_8
    :goto_2
    aget p4, p3, p2

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/joda/time/field/BaseDateTimeField;->set(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    return-object p1
.end method

.method protected convertText(Ljava/lang/String;Ljava/util/Locale;)I
    .locals 1

    .line 668
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p2

    .line 670
    :catch_0
    new-instance p2, Lorg/joda/time/IllegalFieldValueException;

    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getType()Lorg/joda/time/DateTimeFieldType;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lorg/joda/time/IllegalFieldValueException;-><init>(Lorg/joda/time/DateTimeFieldType;Ljava/lang/String;)V

    throw p2
.end method

.method public abstract get(J)I
.end method

.method public getAsShortText(ILjava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 227
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->getAsText(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAsShortText(J)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 180
    invoke-virtual {p0, p1, p2, v0}, Lorg/joda/time/field/BaseDateTimeField;->getAsShortText(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsShortText(JLjava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 168
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->get(J)I

    move-result p1

    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getAsShortText(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsShortText(Lorg/joda/time/ReadablePartial;ILjava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 195
    invoke-virtual {p0, p2, p3}, Lorg/joda/time/field/BaseDateTimeField;->getAsShortText(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAsShortText(Lorg/joda/time/ReadablePartial;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 210
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getType()Lorg/joda/time/DateTimeFieldType;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/joda/time/ReadablePartial;->get(Lorg/joda/time/DateTimeFieldType;)I

    move-result v0

    invoke-virtual {p0, p1, v0, p2}, Lorg/joda/time/field/BaseDateTimeField;->getAsShortText(Lorg/joda/time/ReadablePartial;ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsText(ILjava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 153
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAsText(J)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 106
    invoke-virtual {p0, p1, p2, v0}, Lorg/joda/time/field/BaseDateTimeField;->getAsText(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsText(JLjava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 94
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->get(J)I

    move-result p1

    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getAsText(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsText(Lorg/joda/time/ReadablePartial;ILjava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 121
    invoke-virtual {p0, p2, p3}, Lorg/joda/time/field/BaseDateTimeField;->getAsText(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAsText(Lorg/joda/time/ReadablePartial;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 136
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getType()Lorg/joda/time/DateTimeFieldType;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/joda/time/ReadablePartial;->get(Lorg/joda/time/DateTimeFieldType;)I

    move-result v0

    invoke-virtual {p0, p1, v0, p2}, Lorg/joda/time/field/BaseDateTimeField;->getAsText(Lorg/joda/time/ReadablePartial;ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDifference(JJ)I
    .locals 1

    .line 522
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getDurationField()Lorg/joda/time/DurationField;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DurationField;->getDifference(JJ)I

    move-result p1

    return p1
.end method

.method public getDifferenceAsLong(JJ)J
    .locals 1

    .line 545
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getDurationField()Lorg/joda/time/DurationField;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DurationField;->getDifferenceAsLong(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public abstract getDurationField()Lorg/joda/time/DurationField;
.end method

.method public getLeapAmount(J)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getLeapDurationField()Lorg/joda/time/DurationField;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getMaximumShortTextLength(Ljava/util/Locale;)I
    .locals 0

    .line 850
    invoke-virtual {p0, p1}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumTextLength(Ljava/util/Locale;)I

    move-result p1

    return p1
.end method

.method public getMaximumTextLength(Ljava/util/Locale;)I
    .locals 1

    .line 829
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue()I

    move-result p1

    if-ltz p1, :cond_2

    const/16 v0, 0xa

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/16 v0, 0x64

    if-ge p1, v0, :cond_1

    const/4 p1, 0x2

    return p1

    :cond_1
    const/16 v0, 0x3e8

    if-ge p1, v0, :cond_2

    const/4 p1, 0x3

    return p1

    .line 839
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1
.end method

.method public abstract getMaximumValue()I
.end method

.method public getMaximumValue(J)I
    .locals 0

    .line 792
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue()I

    move-result p1

    return p1
.end method

.method public getMaximumValue(Lorg/joda/time/ReadablePartial;)I
    .locals 0

    .line 804
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue()I

    move-result p1

    return p1
.end method

.method public getMaximumValue(Lorg/joda/time/ReadablePartial;[I)I
    .locals 0

    .line 818
    invoke-virtual {p0, p1}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;)I

    move-result p1

    return p1
.end method

.method public abstract getMinimumValue()I
.end method

.method public getMinimumValue(J)I
    .locals 0

    .line 746
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getMinimumValue()I

    move-result p1

    return p1
.end method

.method public getMinimumValue(Lorg/joda/time/ReadablePartial;)I
    .locals 0

    .line 758
    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getMinimumValue()I

    move-result p1

    return p1
.end method

.method public getMinimumValue(Lorg/joda/time/ReadablePartial;[I)I
    .locals 0

    .line 772
    invoke-virtual {p0, p1}, Lorg/joda/time/field/BaseDateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;)I

    move-result p1

    return p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lorg/joda/time/field/BaseDateTimeField;->iType:Lorg/joda/time/DateTimeFieldType;

    invoke-virtual {v0}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract getRangeDurationField()Lorg/joda/time/DurationField;
.end method

.method public final getType()Lorg/joda/time/DateTimeFieldType;
    .locals 1

    .line 58
    iget-object v0, p0, Lorg/joda/time/field/BaseDateTimeField;->iType:Lorg/joda/time/DateTimeFieldType;

    return-object v0
.end method

.method public isLeap(J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final isSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public remainder(J)J
    .locals 4

    .line 994
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->roundFloor(J)J

    move-result-wide v0

    sub-long v2, p1, v0

    return-wide v2
.end method

.method public roundCeiling(J)J
    .locals 3

    .line 886
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->roundFloor(J)J

    move-result-wide v0

    cmp-long v2, v0, p1

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    .line 888
    invoke-virtual {p0, v0, v1, p1}, Lorg/joda/time/field/BaseDateTimeField;->add(JI)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public abstract roundFloor(J)J
.end method

.method public roundHalfCeiling(J)J
    .locals 8

    .line 927
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->roundFloor(J)J

    move-result-wide v0

    .line 928
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->roundCeiling(J)J

    move-result-wide v2

    sub-long v4, p1, v0

    sub-long v6, v2, p1

    cmp-long p1, v6, v4

    if-gtz p1, :cond_0

    return-wide v2

    :cond_0
    return-wide v0
.end method

.method public roundHalfEven(J)J
    .locals 8

    .line 955
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->roundFloor(J)J

    move-result-wide v0

    .line 956
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->roundCeiling(J)J

    move-result-wide v2

    sub-long v4, p1, v0

    sub-long v6, v2, p1

    cmp-long p1, v4, v6

    if-gez p1, :cond_0

    return-wide v0

    :cond_0
    cmp-long p1, v6, v4

    if-gez p1, :cond_1

    return-wide v2

    .line 970
    :cond_1
    invoke-virtual {p0, v2, v3}, Lorg/joda/time/field/BaseDateTimeField;->get(J)I

    move-result p1

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_2

    return-wide v2

    :cond_2
    return-wide v0
.end method

.method public roundHalfFloor(J)J
    .locals 8

    .line 903
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->roundFloor(J)J

    move-result-wide v0

    .line 904
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/field/BaseDateTimeField;->roundCeiling(J)J

    move-result-wide v2

    sub-long v4, p1, v0

    sub-long v6, v2, p1

    cmp-long p1, v4, v6

    if-gtz p1, :cond_0

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public abstract set(JI)J
.end method

.method public final set(JLjava/lang/String;)J
    .locals 1

    const/4 v0, 0x0

    .line 635
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/joda/time/field/BaseDateTimeField;->set(JLjava/lang/String;Ljava/util/Locale;)J

    move-result-wide p1

    return-wide p1
.end method

.method public set(JLjava/lang/String;Ljava/util/Locale;)J
    .locals 0

    .line 618
    invoke-virtual {p0, p3, p4}, Lorg/joda/time/field/BaseDateTimeField;->convertText(Ljava/lang/String;Ljava/util/Locale;)I

    move-result p3

    .line 619
    invoke-virtual {p0, p1, p2, p3}, Lorg/joda/time/field/BaseDateTimeField;->set(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public set(Lorg/joda/time/ReadablePartial;I[II)[I
    .locals 2

    .line 585
    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v0

    invoke-virtual {p0, p1, p3}, Lorg/joda/time/field/BaseDateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    invoke-static {p0, p4, v0, v1}, Lorg/joda/time/field/FieldUtils;->verifyValueBounds(Lorg/joda/time/DateTimeField;III)V

    .line 586
    aput p4, p3, p2

    :cond_0
    :goto_0
    add-int/lit8 p2, p2, 0x1

    .line 589
    invoke-interface {p1}, Lorg/joda/time/ReadablePartial;->size()I

    move-result p4

    if-ge p2, p4, :cond_2

    .line 590
    invoke-interface {p1, p2}, Lorg/joda/time/ReadablePartial;->getField(I)Lorg/joda/time/DateTimeField;

    move-result-object p4

    .line 591
    aget v0, p3, p2

    invoke-virtual {p4, p1, p3}, Lorg/joda/time/DateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    if-le v0, v1, :cond_1

    .line 592
    invoke-virtual {p4, p1, p3}, Lorg/joda/time/DateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v0

    aput v0, p3, p2

    .line 594
    :cond_1
    aget v0, p3, p2

    invoke-virtual {p4, p1, p3}, Lorg/joda/time/DateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 595
    invoke-virtual {p4, p1, p3}, Lorg/joda/time/DateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result p4

    aput p4, p3, p2

    goto :goto_0

    :cond_2
    return-object p3
.end method

.method public set(Lorg/joda/time/ReadablePartial;I[ILjava/lang/String;Ljava/util/Locale;)[I
    .locals 0

    .line 654
    invoke-virtual {p0, p4, p5}, Lorg/joda/time/field/BaseDateTimeField;->convertText(Ljava/lang/String;Ljava/util/Locale;)I

    move-result p4

    .line 655
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/joda/time/field/BaseDateTimeField;->set(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1003
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DateTimeField["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/joda/time/field/BaseDateTimeField;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
