.class public Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;
.super Ljava/lang/Object;
.source "IslamicChronology.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/joda/time/chrono/IslamicChronology;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LeapYearPatternType"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x182cef79ec9aL


# instance fields
.field final index:B

.field final pattern:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    .line 534
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    int-to-byte p1, p1

    .line 535
    iput-byte p1, p0, Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;->index:B

    .line 536
    iput p2, p0, Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;->pattern:I

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 554
    iget-byte v0, p0, Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;->index:B

    packed-switch v0, :pswitch_data_0

    return-object p0

    .line 562
    :pswitch_0
    sget-object v0, Lorg/joda/time/chrono/IslamicChronology;->LEAP_YEAR_HABASH_AL_HASIB:Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;

    return-object v0

    .line 560
    :pswitch_1
    sget-object v0, Lorg/joda/time/chrono/IslamicChronology;->LEAP_YEAR_INDIAN:Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;

    return-object v0

    .line 558
    :pswitch_2
    sget-object v0, Lorg/joda/time/chrono/IslamicChronology;->LEAP_YEAR_16_BASED:Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;

    return-object v0

    .line 556
    :pswitch_3
    sget-object v0, Lorg/joda/time/chrono/IslamicChronology;->LEAP_YEAR_15_BASED:Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 570
    instance-of v0, p1, Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 571
    iget-byte v0, p0, Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;->index:B

    check-cast p1, Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;

    iget-byte p1, p1, Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;->index:B

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 1

    .line 578
    iget-byte v0, p0, Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;->index:B

    return v0
.end method

.method isLeapYear(I)Z
    .locals 2

    .line 545
    rem-int/lit8 p1, p1, 0x1e

    const/4 v0, 0x1

    shl-int p1, v0, p1

    .line 546
    iget v1, p0, Lorg/joda/time/chrono/IslamicChronology$LeapYearPatternType;->pattern:I

    and-int/2addr p1, v1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
