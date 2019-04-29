.class final Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;
.super Ljava/lang/Object;
.source "DateTimeZoneBuilder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/joda/time/tz/DateTimeZoneBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "OfYear"
.end annotation


# instance fields
.field final iAdvance:Z

.field final iDayOfMonth:I

.field final iDayOfWeek:I

.field final iMillisOfDay:I

.field final iMode:C

.field final iMonthOfYear:I


# direct methods
.method constructor <init>(CIIIZI)V
    .locals 1

    .line 504
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x75

    if-eq p1, v0, :cond_0

    const/16 v0, 0x77

    if-eq p1, v0, :cond_0

    const/16 v0, 0x73

    if-eq p1, v0, :cond_0

    .line 506
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unknown mode: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 509
    :cond_0
    iput-char p1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMode:C

    .line 510
    iput p2, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMonthOfYear:I

    .line 511
    iput p3, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfMonth:I

    .line 512
    iput p4, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfWeek:I

    .line 513
    iput-boolean p5, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iAdvance:Z

    .line 514
    iput p6, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMillisOfDay:I

    return-void
.end method

.method static readFrom(Ljava/io/DataInput;)Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 482
    new-instance v7, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    int-to-char v1, v0

    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v2

    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v3

    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v4

    invoke-interface {p0}, Ljava/io/DataInput;->readBoolean()Z

    move-result v5

    invoke-static {p0}, Lorg/joda/time/tz/DateTimeZoneBuilder;->readMillis(Ljava/io/DataInput;)J

    move-result-wide v8

    long-to-int v6, v8

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;-><init>(CIIIZI)V

    return-object v7
.end method

.method private setDayOfMonth(Lorg/joda/time/Chronology;J)J
    .locals 2

    .line 706
    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfMonth:I

    if-ltz v0, :cond_0

    .line 707
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->dayOfMonth()Lorg/joda/time/DateTimeField;

    move-result-object p1

    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfMonth:I

    invoke-virtual {p1, p2, p3, v0}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide p1

    goto :goto_0

    .line 709
    :cond_0
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->dayOfMonth()Lorg/joda/time/DateTimeField;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p3, v1}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide p2

    .line 710
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->monthOfYear()Lorg/joda/time/DateTimeField;

    move-result-object v0

    invoke-virtual {v0, p2, p3, v1}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p2

    .line 711
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->dayOfMonth()Lorg/joda/time/DateTimeField;

    move-result-object p1

    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfMonth:I

    invoke-virtual {p1, p2, p3, v0}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method private setDayOfMonthNext(Lorg/joda/time/Chronology;J)J
    .locals 3

    .line 672
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfMonth(Lorg/joda/time/Chronology;J)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 674
    iget v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMonthOfYear:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iget v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfMonth:I

    const/16 v2, 0x1d

    if-ne v1, v2, :cond_1

    .line 675
    :goto_0
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lorg/joda/time/DateTimeField;->isLeap(J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 676
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p3, v1}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p2

    goto :goto_0

    .line 678
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfMonth(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    :goto_1
    return-wide v0

    .line 680
    :cond_1
    throw v0
.end method

.method private setDayOfMonthPrevious(Lorg/joda/time/Chronology;J)J
    .locals 3

    .line 691
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfMonth(Lorg/joda/time/Chronology;J)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 693
    iget v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMonthOfYear:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iget v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfMonth:I

    const/16 v2, 0x1d

    if-ne v1, v2, :cond_1

    .line 694
    :goto_0
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lorg/joda/time/DateTimeField;->isLeap(J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 695
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, p2, p3, v1}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p2

    goto :goto_0

    .line 697
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfMonth(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    :goto_1
    return-wide v0

    .line 699
    :cond_1
    throw v0
.end method

.method private setDayOfWeek(Lorg/joda/time/Chronology;J)J
    .locals 2

    .line 717
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->dayOfWeek()Lorg/joda/time/DateTimeField;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lorg/joda/time/DateTimeField;->get(J)I

    move-result v0

    .line 718
    iget v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfWeek:I

    sub-int/2addr v1, v0

    if-eqz v1, :cond_2

    .line 720
    iget-boolean v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iAdvance:Z

    if-eqz v0, :cond_0

    if-gez v1, :cond_1

    add-int/lit8 v1, v1, 0x7

    goto :goto_0

    :cond_0
    if-lez v1, :cond_1

    add-int/lit8 v1, v1, -0x7

    .line 729
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->dayOfWeek()Lorg/joda/time/DateTimeField;

    move-result-object p1

    invoke-virtual {p1, p2, p3, v1}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p2

    :cond_2
    return-wide p2
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 632
    :cond_0
    instance-of v1, p1, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 633
    check-cast p1, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    .line 634
    iget-char v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMode:C

    iget-char v3, p1, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMode:C

    if-ne v1, v3, :cond_1

    iget v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMonthOfYear:I

    iget v3, p1, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMonthOfYear:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfMonth:I

    iget v3, p1, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfMonth:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfWeek:I

    iget v3, p1, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfWeek:I

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iAdvance:Z

    iget-boolean v3, p1, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iAdvance:Z

    if-ne v1, v3, :cond_1

    iget v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMillisOfDay:I

    iget p1, p1, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMillisOfDay:I

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public next(JII)J
    .locals 6

    .line 549
    iget-char v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMode:C

    const/4 v1, 0x0

    const/16 v2, 0x77

    if-ne v0, v2, :cond_0

    add-int/2addr p3, p4

    goto :goto_0

    .line 551
    :cond_0
    iget-char p4, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMode:C

    const/16 v0, 0x73

    if-ne p4, v0, :cond_1

    goto :goto_0

    :cond_1
    move p3, v1

    :goto_0
    int-to-long p3, p3

    add-long v2, p1, p3

    .line 560
    invoke-static {}, Lorg/joda/time/chrono/ISOChronology;->getInstanceUTC()Lorg/joda/time/chrono/ISOChronology;

    move-result-object p1

    .line 561
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->monthOfYear()Lorg/joda/time/DateTimeField;

    move-result-object p2

    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMonthOfYear:I

    invoke-virtual {p2, v2, v3, v0}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide v4

    .line 563
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->millisOfDay()Lorg/joda/time/DateTimeField;

    move-result-object p2

    invoke-virtual {p2, v4, v5, v1}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide v0

    .line 564
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->millisOfDay()Lorg/joda/time/DateTimeField;

    move-result-object p2

    iget v4, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMillisOfDay:I

    invoke-virtual {p2, v0, v1, v4}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide v0

    .line 565
    invoke-direct {p0, p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfMonthNext(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    .line 567
    iget p2, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfWeek:I

    const/4 v4, 0x1

    if-nez p2, :cond_2

    cmp-long p2, v0, v2

    if-gtz p2, :cond_3

    .line 569
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object p2

    invoke-virtual {p2, v0, v1, v4}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide v0

    .line 570
    invoke-direct {p0, p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfMonthNext(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    goto :goto_1

    .line 573
    :cond_2
    invoke-direct {p0, p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfWeek(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    cmp-long p2, v0, v2

    if-gtz p2, :cond_3

    .line 575
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object p2

    invoke-virtual {p2, v0, v1, v4}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide v0

    .line 576
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->monthOfYear()Lorg/joda/time/DateTimeField;

    move-result-object p2

    iget v2, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMonthOfYear:I

    invoke-virtual {p2, v0, v1, v2}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide v0

    .line 577
    invoke-direct {p0, p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfMonthNext(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    .line 578
    invoke-direct {p0, p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfWeek(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    :cond_3
    :goto_1
    sub-long p1, v0, p3

    return-wide p1
.end method

.method public previous(JII)J
    .locals 6

    .line 591
    iget-char v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMode:C

    const/4 v1, 0x0

    const/16 v2, 0x77

    if-ne v0, v2, :cond_0

    add-int/2addr p3, p4

    goto :goto_0

    .line 593
    :cond_0
    iget-char p4, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMode:C

    const/16 v0, 0x73

    if-ne p4, v0, :cond_1

    goto :goto_0

    :cond_1
    move p3, v1

    :goto_0
    int-to-long p3, p3

    add-long v2, p1, p3

    .line 602
    invoke-static {}, Lorg/joda/time/chrono/ISOChronology;->getInstanceUTC()Lorg/joda/time/chrono/ISOChronology;

    move-result-object p1

    .line 603
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->monthOfYear()Lorg/joda/time/DateTimeField;

    move-result-object p2

    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMonthOfYear:I

    invoke-virtual {p2, v2, v3, v0}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide v4

    .line 605
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->millisOfDay()Lorg/joda/time/DateTimeField;

    move-result-object p2

    invoke-virtual {p2, v4, v5, v1}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide v0

    .line 606
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->millisOfDay()Lorg/joda/time/DateTimeField;

    move-result-object p2

    iget v4, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMillisOfDay:I

    invoke-virtual {p2, v0, v1, v4}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide v0

    .line 607
    invoke-direct {p0, p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfMonthPrevious(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    .line 609
    iget p2, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfWeek:I

    const/4 v4, -0x1

    if-nez p2, :cond_2

    cmp-long p2, v0, v2

    if-ltz p2, :cond_3

    .line 611
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object p2

    invoke-virtual {p2, v0, v1, v4}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide v0

    .line 612
    invoke-direct {p0, p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfMonthPrevious(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    goto :goto_1

    .line 615
    :cond_2
    invoke-direct {p0, p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfWeek(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    cmp-long p2, v0, v2

    if-ltz p2, :cond_3

    .line 617
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object p2

    invoke-virtual {p2, v0, v1, v4}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide v0

    .line 618
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->monthOfYear()Lorg/joda/time/DateTimeField;

    move-result-object p2

    iget v2, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMonthOfYear:I

    invoke-virtual {p2, v0, v1, v2}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide v0

    .line 619
    invoke-direct {p0, p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfMonthPrevious(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    .line 620
    invoke-direct {p0, p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfWeek(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    :cond_3
    :goto_1
    sub-long p1, v0, p3

    return-wide p1
.end method

.method public setInstant(III)J
    .locals 4

    .line 522
    iget-char v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMode:C

    const/16 v1, 0x77

    if-ne v0, v1, :cond_0

    add-int/2addr p2, p3

    goto :goto_0

    .line 524
    :cond_0
    iget-char p3, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMode:C

    const/16 v0, 0x73

    if-ne p3, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 530
    :goto_0
    invoke-static {}, Lorg/joda/time/chrono/ISOChronology;->getInstanceUTC()Lorg/joda/time/chrono/ISOChronology;

    move-result-object p3

    .line 531
    invoke-virtual {p3}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide v0

    .line 532
    invoke-virtual {p3}, Lorg/joda/time/Chronology;->monthOfYear()Lorg/joda/time/DateTimeField;

    move-result-object p1

    iget v2, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMonthOfYear:I

    invoke-virtual {p1, v0, v1, v2}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide v0

    .line 533
    invoke-virtual {p3}, Lorg/joda/time/Chronology;->millisOfDay()Lorg/joda/time/DateTimeField;

    move-result-object p1

    iget v2, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMillisOfDay:I

    invoke-virtual {p1, v0, v1, v2}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide v0

    .line 534
    invoke-direct {p0, p3, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfMonth(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    .line 536
    iget p1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfWeek:I

    if-eqz p1, :cond_2

    .line 537
    invoke-direct {p0, p3, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->setDayOfWeek(Lorg/joda/time/Chronology;J)J

    move-result-wide v0

    :cond_2
    int-to-long p1, p2

    sub-long v2, v0, p1

    return-wide v2
.end method

.method public writeTo(Ljava/io/DataOutput;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 659
    iget-char v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMode:C

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 660
    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMonthOfYear:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 661
    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfMonth:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 662
    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iDayOfWeek:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 663
    iget-boolean v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iAdvance:Z

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeBoolean(Z)V

    .line 664
    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->iMillisOfDay:I

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder;->writeMillis(Ljava/io/DataOutput;J)V

    return-void
.end method
