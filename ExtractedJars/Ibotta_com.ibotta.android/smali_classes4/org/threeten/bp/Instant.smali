.class public final Lorg/threeten/bp/Instant;
.super Lorg/threeten/bp/jdk8/DefaultInterfaceTemporalAccessor;
.source "Instant.java"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;
.implements Lorg/threeten/bp/temporal/Temporal;
.implements Lorg/threeten/bp/temporal/TemporalAdjuster;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/threeten/bp/jdk8/DefaultInterfaceTemporalAccessor;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Comparable<",
        "Lorg/threeten/bp/Instant;",
        ">;",
        "Lorg/threeten/bp/temporal/Temporal;",
        "Lorg/threeten/bp/temporal/TemporalAdjuster;"
    }
.end annotation


# static fields
.field public static final EPOCH:Lorg/threeten/bp/Instant;

.field public static final FROM:Lorg/threeten/bp/temporal/TemporalQuery;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/threeten/bp/temporal/TemporalQuery<",
            "Lorg/threeten/bp/Instant;",
            ">;"
        }
    .end annotation
.end field

.field public static final MAX:Lorg/threeten/bp/Instant;

.field public static final MIN:Lorg/threeten/bp/Instant;

.field private static final serialVersionUID:J = -0x93d170fdcc5dce4L


# instance fields
.field private final nanos:I

.field private final seconds:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 164
    new-instance v0, Lorg/threeten/bp/Instant;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lorg/threeten/bp/Instant;-><init>(JI)V

    sput-object v0, Lorg/threeten/bp/Instant;->EPOCH:Lorg/threeten/bp/Instant;

    const-wide v3, -0x701cefeb9bec00L

    .line 183
    invoke-static {v3, v4, v1, v2}, Lorg/threeten/bp/Instant;->ofEpochSecond(JJ)Lorg/threeten/bp/Instant;

    move-result-object v0

    sput-object v0, Lorg/threeten/bp/Instant;->MIN:Lorg/threeten/bp/Instant;

    const-wide v0, 0x701cd2fa9578ffL

    const-wide/32 v2, 0x3b9ac9ff

    .line 194
    invoke-static {v0, v1, v2, v3}, Lorg/threeten/bp/Instant;->ofEpochSecond(JJ)Lorg/threeten/bp/Instant;

    move-result-object v0

    sput-object v0, Lorg/threeten/bp/Instant;->MAX:Lorg/threeten/bp/Instant;

    .line 198
    new-instance v0, Lorg/threeten/bp/Instant$1;

    invoke-direct {v0}, Lorg/threeten/bp/Instant$1;-><init>()V

    sput-object v0, Lorg/threeten/bp/Instant;->FROM:Lorg/threeten/bp/temporal/TemporalQuery;

    return-void
.end method

.method private constructor <init>(JI)V
    .locals 0

    .line 391
    invoke-direct {p0}, Lorg/threeten/bp/jdk8/DefaultInterfaceTemporalAccessor;-><init>()V

    .line 392
    iput-wide p1, p0, Lorg/threeten/bp/Instant;->seconds:J

    .line 393
    iput p3, p0, Lorg/threeten/bp/Instant;->nanos:I

    return-void
.end method

.method private static create(JI)Lorg/threeten/bp/Instant;
    .locals 5

    int-to-long v0, p2

    or-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 375
    sget-object p0, Lorg/threeten/bp/Instant;->EPOCH:Lorg/threeten/bp/Instant;

    return-object p0

    :cond_0
    const-wide v0, -0x701cefeb9bec00L

    cmp-long v2, p0, v0

    if-ltz v2, :cond_1

    const-wide v0, 0x701cd2fa9578ffL

    cmp-long v2, p0, v0

    if-gtz v2, :cond_1

    .line 380
    new-instance v0, Lorg/threeten/bp/Instant;

    invoke-direct {v0, p0, p1, p2}, Lorg/threeten/bp/Instant;-><init>(JI)V

    return-object v0

    .line 378
    :cond_1
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    const-string p1, "Instant exceeds minimum or maximum instant"

    invoke-direct {p0, p1}, Lorg/threeten/bp/DateTimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static from(Lorg/threeten/bp/temporal/TemporalAccessor;)Lorg/threeten/bp/Instant;
    .locals 4

    .line 340
    :try_start_0
    sget-object v0, Lorg/threeten/bp/temporal/ChronoField;->INSTANT_SECONDS:Lorg/threeten/bp/temporal/ChronoField;

    invoke-interface {p0, v0}, Lorg/threeten/bp/temporal/TemporalAccessor;->getLong(Lorg/threeten/bp/temporal/TemporalField;)J

    move-result-wide v0

    .line 341
    sget-object v2, Lorg/threeten/bp/temporal/ChronoField;->NANO_OF_SECOND:Lorg/threeten/bp/temporal/ChronoField;

    invoke-interface {p0, v2}, Lorg/threeten/bp/temporal/TemporalAccessor;->get(Lorg/threeten/bp/temporal/TemporalField;)I

    move-result v2

    int-to-long v2, v2

    .line 342
    invoke-static {v0, v1, v2, v3}, Lorg/threeten/bp/Instant;->ofEpochSecond(JJ)Lorg/threeten/bp/Instant;

    move-result-object p0
    :try_end_0
    .catch Lorg/threeten/bp/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 344
    new-instance v1, Lorg/threeten/bp/DateTimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to obtain Instant from TemporalAccessor: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Lorg/threeten/bp/DateTimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private nanosUntil(Lorg/threeten/bp/Instant;)J
    .locals 4

    .line 991
    iget-wide v0, p1, Lorg/threeten/bp/Instant;->seconds:J

    iget-wide v2, p0, Lorg/threeten/bp/Instant;->seconds:J

    invoke-static {v0, v1, v2, v3}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeSubtract(JJ)J

    move-result-wide v0

    const v2, 0x3b9aca00

    .line 992
    invoke-static {v0, v1, v2}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeMultiply(JI)J

    move-result-wide v0

    .line 993
    iget p1, p1, Lorg/threeten/bp/Instant;->nanos:I

    iget v2, p0, Lorg/threeten/bp/Instant;->nanos:I

    sub-int/2addr p1, v2

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeAdd(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public static ofEpochSecond(J)Lorg/threeten/bp/Instant;
    .locals 1

    const/4 v0, 0x0

    .line 276
    invoke-static {p0, p1, v0}, Lorg/threeten/bp/Instant;->create(JI)Lorg/threeten/bp/Instant;

    move-result-object p0

    return-object p0
.end method

.method public static ofEpochSecond(JJ)Lorg/threeten/bp/Instant;
    .locals 2

    const-wide/32 v0, 0x3b9aca00

    .line 300
    invoke-static {p2, p3, v0, v1}, Lorg/threeten/bp/jdk8/Jdk8Methods;->floorDiv(JJ)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeAdd(JJ)J

    move-result-wide p0

    const v0, 0x3b9aca00

    .line 301
    invoke-static {p2, p3, v0}, Lorg/threeten/bp/jdk8/Jdk8Methods;->floorMod(JI)I

    move-result p2

    .line 302
    invoke-static {p0, p1, p2}, Lorg/threeten/bp/Instant;->create(JI)Lorg/threeten/bp/Instant;

    move-result-object p0

    return-object p0
.end method

.method private plus(JJ)Lorg/threeten/bp/Instant;
    .locals 5

    or-long v0, p1, p3

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-object p0

    .line 785
    :cond_0
    iget-wide v0, p0, Lorg/threeten/bp/Instant;->seconds:J

    invoke-static {v0, v1, p1, p2}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeAdd(JJ)J

    move-result-wide p1

    const-wide/32 v0, 0x3b9aca00

    .line 786
    div-long v2, p3, v0

    invoke-static {p1, p2, v2, v3}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeAdd(JJ)J

    move-result-wide p1

    .line 787
    rem-long/2addr p3, v0

    .line 788
    iget v0, p0, Lorg/threeten/bp/Instant;->nanos:I

    int-to-long v0, v0

    add-long/2addr v0, p3

    .line 789
    invoke-static {p1, p2, v0, v1}, Lorg/threeten/bp/Instant;->ofEpochSecond(JJ)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1
.end method

.method static readExternal(Ljava/io/DataInput;)Lorg/threeten/bp/Instant;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1185
    invoke-interface {p0}, Ljava/io/DataInput;->readLong()J

    move-result-wide v0

    .line 1186
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result p0

    int-to-long v2, p0

    .line 1187
    invoke-static {v0, v1, v2, v3}, Lorg/threeten/bp/Instant;->ofEpochSecond(JJ)Lorg/threeten/bp/Instant;

    move-result-object p0

    return-object p0
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    .line 1176
    new-instance v0, Ljava/io/InvalidObjectException;

    const-string v1, "Deserialization via serialization delegate"

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private secondsUntil(Lorg/threeten/bp/Instant;)J
    .locals 9

    .line 997
    iget-wide v0, p1, Lorg/threeten/bp/Instant;->seconds:J

    iget-wide v2, p0, Lorg/threeten/bp/Instant;->seconds:J

    invoke-static {v0, v1, v2, v3}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeSubtract(JJ)J

    move-result-wide v0

    .line 998
    iget p1, p1, Lorg/threeten/bp/Instant;->nanos:I

    iget v2, p0, Lorg/threeten/bp/Instant;->nanos:I

    sub-int/2addr p1, v2

    int-to-long v2, p1

    const-wide/16 v4, 0x1

    const-wide/16 v6, 0x0

    cmp-long p1, v0, v6

    if-lez p1, :cond_0

    cmp-long v8, v2, v6

    if-gez v8, :cond_0

    sub-long/2addr v0, v4

    goto :goto_0

    :cond_0
    if-gez p1, :cond_1

    cmp-long p1, v2, v6

    if-lez p1, :cond_1

    add-long/2addr v0, v4

    :cond_1
    :goto_0
    return-wide v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1167
    new-instance v0, Lorg/threeten/bp/Ser;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Lorg/threeten/bp/Ser;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public adjustInto(Lorg/threeten/bp/temporal/Temporal;)Lorg/threeten/bp/temporal/Temporal;
    .locals 3

    .line 926
    sget-object v0, Lorg/threeten/bp/temporal/ChronoField;->INSTANT_SECONDS:Lorg/threeten/bp/temporal/ChronoField;

    iget-wide v1, p0, Lorg/threeten/bp/Instant;->seconds:J

    invoke-interface {p1, v0, v1, v2}, Lorg/threeten/bp/temporal/Temporal;->with(Lorg/threeten/bp/temporal/TemporalField;J)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    sget-object v0, Lorg/threeten/bp/temporal/ChronoField;->NANO_OF_SECOND:Lorg/threeten/bp/temporal/ChronoField;

    iget v1, p0, Lorg/threeten/bp/Instant;->nanos:I

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Lorg/threeten/bp/temporal/Temporal;->with(Lorg/threeten/bp/temporal/TemporalField;J)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 157
    check-cast p1, Lorg/threeten/bp/Instant;

    invoke-virtual {p0, p1}, Lorg/threeten/bp/Instant;->compareTo(Lorg/threeten/bp/Instant;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/threeten/bp/Instant;)I
    .locals 4

    .line 1087
    iget-wide v0, p0, Lorg/threeten/bp/Instant;->seconds:J

    iget-wide v2, p1, Lorg/threeten/bp/Instant;->seconds:J

    invoke-static {v0, v1, v2, v3}, Lorg/threeten/bp/jdk8/Jdk8Methods;->compareLongs(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 1091
    :cond_0
    iget v0, p0, Lorg/threeten/bp/Instant;->nanos:I

    iget p1, p1, Lorg/threeten/bp/Instant;->nanos:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1134
    :cond_0
    instance-of v1, p1, Lorg/threeten/bp/Instant;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 1135
    check-cast p1, Lorg/threeten/bp/Instant;

    .line 1136
    iget-wide v3, p0, Lorg/threeten/bp/Instant;->seconds:J

    iget-wide v5, p1, Lorg/threeten/bp/Instant;->seconds:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget v1, p0, Lorg/threeten/bp/Instant;->nanos:I

    iget p1, p1, Lorg/threeten/bp/Instant;->nanos:I

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public get(Lorg/threeten/bp/temporal/TemporalField;)I
    .locals 3

    .line 491
    instance-of v0, p1, Lorg/threeten/bp/temporal/ChronoField;

    if-eqz v0, :cond_0

    .line 492
    sget-object v0, Lorg/threeten/bp/Instant$2;->$SwitchMap$org$threeten$bp$temporal$ChronoField:[I

    move-object v1, p1

    check-cast v1, Lorg/threeten/bp/temporal/ChronoField;

    invoke-virtual {v1}, Lorg/threeten/bp/temporal/ChronoField;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 497
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported field: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 495
    :pswitch_0
    iget p1, p0, Lorg/threeten/bp/Instant;->nanos:I

    const v0, 0xf4240

    div-int/2addr p1, v0

    return p1

    .line 494
    :pswitch_1
    iget p1, p0, Lorg/threeten/bp/Instant;->nanos:I

    div-int/lit16 p1, p1, 0x3e8

    return p1

    .line 493
    :pswitch_2
    iget p1, p0, Lorg/threeten/bp/Instant;->nanos:I

    return p1

    .line 499
    :cond_0
    invoke-virtual {p0, p1}, Lorg/threeten/bp/Instant;->range(Lorg/threeten/bp/temporal/TemporalField;)Lorg/threeten/bp/temporal/ValueRange;

    move-result-object v0

    invoke-interface {p1, p0}, Lorg/threeten/bp/temporal/TemporalField;->getFrom(Lorg/threeten/bp/temporal/TemporalAccessor;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lorg/threeten/bp/temporal/ValueRange;->checkValidIntValue(JLorg/threeten/bp/temporal/TemporalField;)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getEpochSecond()J
    .locals 2

    .line 549
    iget-wide v0, p0, Lorg/threeten/bp/Instant;->seconds:J

    return-wide v0
.end method

.method public getLong(Lorg/threeten/bp/temporal/TemporalField;)J
    .locals 3

    .line 526
    instance-of v0, p1, Lorg/threeten/bp/temporal/ChronoField;

    if-eqz v0, :cond_0

    .line 527
    sget-object v0, Lorg/threeten/bp/Instant$2;->$SwitchMap$org$threeten$bp$temporal$ChronoField:[I

    move-object v1, p1

    check-cast v1, Lorg/threeten/bp/temporal/ChronoField;

    invoke-virtual {v1}, Lorg/threeten/bp/temporal/ChronoField;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 533
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported field: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 531
    :pswitch_0
    iget-wide v0, p0, Lorg/threeten/bp/Instant;->seconds:J

    return-wide v0

    .line 530
    :pswitch_1
    iget p1, p0, Lorg/threeten/bp/Instant;->nanos:I

    const v0, 0xf4240

    div-int/2addr p1, v0

    int-to-long v0, p1

    return-wide v0

    .line 529
    :pswitch_2
    iget p1, p0, Lorg/threeten/bp/Instant;->nanos:I

    div-int/lit16 p1, p1, 0x3e8

    int-to-long v0, p1

    return-wide v0

    .line 528
    :pswitch_3
    iget p1, p0, Lorg/threeten/bp/Instant;->nanos:I

    int-to-long v0, p1

    return-wide v0

    .line 535
    :cond_0
    invoke-interface {p1, p0}, Lorg/threeten/bp/temporal/TemporalField;->getFrom(Lorg/threeten/bp/temporal/TemporalAccessor;)J

    move-result-wide v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getNano()I
    .locals 1

    .line 562
    iget v0, p0, Lorg/threeten/bp/Instant;->nanos:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 1149
    iget-wide v0, p0, Lorg/threeten/bp/Instant;->seconds:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v1, v0

    iget v0, p0, Lorg/threeten/bp/Instant;->nanos:I

    mul-int/lit8 v0, v0, 0x33

    add-int/2addr v1, v0

    return v1
.end method

.method public isSupported(Lorg/threeten/bp/temporal/TemporalField;)Z
    .locals 3

    .line 424
    instance-of v0, p1, Lorg/threeten/bp/temporal/ChronoField;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 425
    sget-object v0, Lorg/threeten/bp/temporal/ChronoField;->INSTANT_SECONDS:Lorg/threeten/bp/temporal/ChronoField;

    if-eq p1, v0, :cond_1

    sget-object v0, Lorg/threeten/bp/temporal/ChronoField;->NANO_OF_SECOND:Lorg/threeten/bp/temporal/ChronoField;

    if-eq p1, v0, :cond_1

    sget-object v0, Lorg/threeten/bp/temporal/ChronoField;->MICRO_OF_SECOND:Lorg/threeten/bp/temporal/ChronoField;

    if-eq p1, v0, :cond_1

    sget-object v0, Lorg/threeten/bp/temporal/ChronoField;->MILLI_OF_SECOND:Lorg/threeten/bp/temporal/ChronoField;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1

    :cond_2
    if-eqz p1, :cond_3

    .line 427
    invoke-interface {p1, p0}, Lorg/threeten/bp/temporal/TemporalField;->isSupportedBy(Lorg/threeten/bp/temporal/TemporalAccessor;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public isSupported(Lorg/threeten/bp/temporal/TemporalUnit;)Z
    .locals 3

    .line 432
    instance-of v0, p1, Lorg/threeten/bp/temporal/ChronoUnit;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 433
    invoke-interface {p1}, Lorg/threeten/bp/temporal/TemporalUnit;->isTimeBased()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->DAYS:Lorg/threeten/bp/temporal/ChronoUnit;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1

    :cond_2
    if-eqz p1, :cond_3

    .line 435
    invoke-interface {p1, p0}, Lorg/threeten/bp/temporal/TemporalUnit;->isSupportedBy(Lorg/threeten/bp/temporal/Temporal;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public minus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/Instant;
    .locals 3

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 810
    invoke-virtual {p0, p1, p2, p3}, Lorg/threeten/bp/Instant;->plus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/Instant;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Lorg/threeten/bp/Instant;->plus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/Instant;

    move-result-object p1

    goto :goto_0

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Lorg/threeten/bp/Instant;->plus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/Instant;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public minus(Lorg/threeten/bp/temporal/TemporalAmount;)Lorg/threeten/bp/Instant;
    .locals 0

    .line 800
    invoke-interface {p1, p0}, Lorg/threeten/bp/temporal/TemporalAmount;->subtractFrom(Lorg/threeten/bp/temporal/Temporal;)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    check-cast p1, Lorg/threeten/bp/Instant;

    return-object p1
.end method

.method public bridge synthetic minus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/temporal/Temporal;
    .locals 0

    .line 157
    invoke-virtual {p0, p1, p2, p3}, Lorg/threeten/bp/Instant;->minus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic minus(Lorg/threeten/bp/temporal/TemporalAmount;)Lorg/threeten/bp/temporal/Temporal;
    .locals 0

    .line 157
    invoke-virtual {p0, p1}, Lorg/threeten/bp/Instant;->minus(Lorg/threeten/bp/temporal/TemporalAmount;)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1
.end method

.method public plus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/Instant;
    .locals 4

    .line 711
    instance-of v0, p3, Lorg/threeten/bp/temporal/ChronoUnit;

    if-eqz v0, :cond_0

    .line 712
    sget-object v0, Lorg/threeten/bp/Instant$2;->$SwitchMap$org$threeten$bp$temporal$ChronoUnit:[I

    move-object v1, p3

    check-cast v1, Lorg/threeten/bp/temporal/ChronoUnit;

    invoke-virtual {v1}, Lorg/threeten/bp/temporal/ChronoUnit;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 722
    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported unit: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const p3, 0x15180

    .line 720
    invoke-static {p1, p2, p3}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeMultiply(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lorg/threeten/bp/Instant;->plusSeconds(J)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1

    :pswitch_1
    const p3, 0xa8c0

    .line 719
    invoke-static {p1, p2, p3}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeMultiply(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lorg/threeten/bp/Instant;->plusSeconds(J)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1

    :pswitch_2
    const/16 p3, 0xe10

    .line 718
    invoke-static {p1, p2, p3}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeMultiply(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lorg/threeten/bp/Instant;->plusSeconds(J)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1

    :pswitch_3
    const/16 p3, 0x3c

    .line 717
    invoke-static {p1, p2, p3}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeMultiply(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lorg/threeten/bp/Instant;->plusSeconds(J)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1

    .line 716
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lorg/threeten/bp/Instant;->plusSeconds(J)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1

    .line 715
    :pswitch_5
    invoke-virtual {p0, p1, p2}, Lorg/threeten/bp/Instant;->plusMillis(J)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1

    :pswitch_6
    const-wide/32 v0, 0xf4240

    .line 714
    div-long v2, p1, v0

    rem-long/2addr p1, v0

    const-wide/16 v0, 0x3e8

    mul-long p1, p1, v0

    invoke-direct {p0, v2, v3, p1, p2}, Lorg/threeten/bp/Instant;->plus(JJ)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1

    .line 713
    :pswitch_7
    invoke-virtual {p0, p1, p2}, Lorg/threeten/bp/Instant;->plusNanos(J)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1

    .line 724
    :cond_0
    invoke-interface {p3, p0, p1, p2}, Lorg/threeten/bp/temporal/TemporalUnit;->addTo(Lorg/threeten/bp/temporal/Temporal;J)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    check-cast p1, Lorg/threeten/bp/Instant;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public plus(Lorg/threeten/bp/temporal/TemporalAmount;)Lorg/threeten/bp/Instant;
    .locals 0

    .line 701
    invoke-interface {p1, p0}, Lorg/threeten/bp/temporal/TemporalAmount;->addTo(Lorg/threeten/bp/temporal/Temporal;)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    check-cast p1, Lorg/threeten/bp/Instant;

    return-object p1
.end method

.method public bridge synthetic plus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/temporal/Temporal;
    .locals 0

    .line 157
    invoke-virtual {p0, p1, p2, p3}, Lorg/threeten/bp/Instant;->plus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic plus(Lorg/threeten/bp/temporal/TemporalAmount;)Lorg/threeten/bp/temporal/Temporal;
    .locals 0

    .line 157
    invoke-virtual {p0, p1}, Lorg/threeten/bp/Instant;->plus(Lorg/threeten/bp/temporal/TemporalAmount;)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1
.end method

.method public plusMillis(J)Lorg/threeten/bp/Instant;
    .locals 4

    const-wide/16 v0, 0x3e8

    .line 753
    div-long v2, p1, v0

    rem-long/2addr p1, v0

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    invoke-direct {p0, v2, v3, p1, p2}, Lorg/threeten/bp/Instant;->plus(JJ)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1
.end method

.method public plusNanos(J)Lorg/threeten/bp/Instant;
    .locals 2

    const-wide/16 v0, 0x0

    .line 767
    invoke-direct {p0, v0, v1, p1, p2}, Lorg/threeten/bp/Instant;->plus(JJ)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1
.end method

.method public plusSeconds(J)Lorg/threeten/bp/Instant;
    .locals 2

    const-wide/16 v0, 0x0

    .line 739
    invoke-direct {p0, p1, p2, v0, v1}, Lorg/threeten/bp/Instant;->plus(JJ)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1
.end method

.method public query(Lorg/threeten/bp/temporal/TemporalQuery;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/threeten/bp/temporal/TemporalQuery<",
            "TR;>;)TR;"
        }
    .end annotation

    .line 887
    invoke-static {}, Lorg/threeten/bp/temporal/TemporalQueries;->precision()Lorg/threeten/bp/temporal/TemporalQuery;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 888
    sget-object p1, Lorg/threeten/bp/temporal/ChronoUnit;->NANOS:Lorg/threeten/bp/temporal/ChronoUnit;

    return-object p1

    .line 891
    :cond_0
    invoke-static {}, Lorg/threeten/bp/temporal/TemporalQueries;->localDate()Lorg/threeten/bp/temporal/TemporalQuery;

    move-result-object v0

    if-eq p1, v0, :cond_2

    invoke-static {}, Lorg/threeten/bp/temporal/TemporalQueries;->localTime()Lorg/threeten/bp/temporal/TemporalQuery;

    move-result-object v0

    if-eq p1, v0, :cond_2

    .line 892
    invoke-static {}, Lorg/threeten/bp/temporal/TemporalQueries;->chronology()Lorg/threeten/bp/temporal/TemporalQuery;

    move-result-object v0

    if-eq p1, v0, :cond_2

    invoke-static {}, Lorg/threeten/bp/temporal/TemporalQueries;->zoneId()Lorg/threeten/bp/temporal/TemporalQuery;

    move-result-object v0

    if-eq p1, v0, :cond_2

    .line 893
    invoke-static {}, Lorg/threeten/bp/temporal/TemporalQueries;->zone()Lorg/threeten/bp/temporal/TemporalQuery;

    move-result-object v0

    if-eq p1, v0, :cond_2

    invoke-static {}, Lorg/threeten/bp/temporal/TemporalQueries;->offset()Lorg/threeten/bp/temporal/TemporalQuery;

    move-result-object v0

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 896
    :cond_1
    invoke-interface {p1, p0}, Lorg/threeten/bp/temporal/TemporalQuery;->queryFrom(Lorg/threeten/bp/temporal/TemporalAccessor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public range(Lorg/threeten/bp/temporal/TemporalField;)Lorg/threeten/bp/temporal/ValueRange;
    .locals 0

    .line 462
    invoke-super {p0, p1}, Lorg/threeten/bp/jdk8/DefaultInterfaceTemporalAccessor;->range(Lorg/threeten/bp/temporal/TemporalField;)Lorg/threeten/bp/temporal/ValueRange;

    move-result-object p1

    return-object p1
.end method

.method public toEpochMilli()J
    .locals 8

    .line 1059
    iget-wide v0, p0, Lorg/threeten/bp/Instant;->seconds:J

    const v2, 0xf4240

    const-wide/16 v3, 0x3e8

    const-wide/16 v5, 0x0

    cmp-long v7, v0, v5

    if-ltz v7, :cond_0

    .line 1060
    invoke-static {v0, v1, v3, v4}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeMultiply(JJ)J

    move-result-wide v0

    .line 1061
    iget v3, p0, Lorg/threeten/bp/Instant;->nanos:I

    div-int/2addr v3, v2

    int-to-long v2, v3

    invoke-static {v0, v1, v2, v3}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeAdd(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v5, 0x1

    add-long/2addr v0, v5

    .line 1069
    invoke-static {v0, v1, v3, v4}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeMultiply(JJ)J

    move-result-wide v0

    .line 1070
    iget v5, p0, Lorg/threeten/bp/Instant;->nanos:I

    div-int/2addr v5, v2

    int-to-long v5, v5

    sub-long/2addr v3, v5

    invoke-static {v0, v1, v3, v4}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeSubtract(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1162
    sget-object v0, Lorg/threeten/bp/format/DateTimeFormatter;->ISO_INSTANT:Lorg/threeten/bp/format/DateTimeFormatter;

    invoke-virtual {v0, p0}, Lorg/threeten/bp/format/DateTimeFormatter;->format(Lorg/threeten/bp/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public until(Lorg/threeten/bp/temporal/Temporal;Lorg/threeten/bp/temporal/TemporalUnit;)J
    .locals 2

    .line 972
    invoke-static {p1}, Lorg/threeten/bp/Instant;->from(Lorg/threeten/bp/temporal/TemporalAccessor;)Lorg/threeten/bp/Instant;

    move-result-object p1

    .line 973
    instance-of v0, p2, Lorg/threeten/bp/temporal/ChronoUnit;

    if-eqz v0, :cond_0

    .line 974
    move-object v0, p2

    check-cast v0, Lorg/threeten/bp/temporal/ChronoUnit;

    .line 975
    sget-object v1, Lorg/threeten/bp/Instant$2;->$SwitchMap$org$threeten$bp$temporal$ChronoUnit:[I

    invoke-virtual {v0}, Lorg/threeten/bp/temporal/ChronoUnit;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 985
    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported unit: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 983
    :pswitch_0
    invoke-direct {p0, p1}, Lorg/threeten/bp/Instant;->secondsUntil(Lorg/threeten/bp/Instant;)J

    move-result-wide p1

    const-wide/32 v0, 0x15180

    div-long/2addr p1, v0

    return-wide p1

    .line 982
    :pswitch_1
    invoke-direct {p0, p1}, Lorg/threeten/bp/Instant;->secondsUntil(Lorg/threeten/bp/Instant;)J

    move-result-wide p1

    const-wide/32 v0, 0xa8c0

    div-long/2addr p1, v0

    return-wide p1

    .line 981
    :pswitch_2
    invoke-direct {p0, p1}, Lorg/threeten/bp/Instant;->secondsUntil(Lorg/threeten/bp/Instant;)J

    move-result-wide p1

    const-wide/16 v0, 0xe10

    div-long/2addr p1, v0

    return-wide p1

    .line 980
    :pswitch_3
    invoke-direct {p0, p1}, Lorg/threeten/bp/Instant;->secondsUntil(Lorg/threeten/bp/Instant;)J

    move-result-wide p1

    const-wide/16 v0, 0x3c

    div-long/2addr p1, v0

    return-wide p1

    .line 979
    :pswitch_4
    invoke-direct {p0, p1}, Lorg/threeten/bp/Instant;->secondsUntil(Lorg/threeten/bp/Instant;)J

    move-result-wide p1

    return-wide p1

    .line 978
    :pswitch_5
    invoke-virtual {p1}, Lorg/threeten/bp/Instant;->toEpochMilli()J

    move-result-wide p1

    invoke-virtual {p0}, Lorg/threeten/bp/Instant;->toEpochMilli()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeSubtract(JJ)J

    move-result-wide p1

    return-wide p1

    .line 977
    :pswitch_6
    invoke-direct {p0, p1}, Lorg/threeten/bp/Instant;->nanosUntil(Lorg/threeten/bp/Instant;)J

    move-result-wide p1

    const-wide/16 v0, 0x3e8

    div-long/2addr p1, v0

    return-wide p1

    .line 976
    :pswitch_7
    invoke-direct {p0, p1}, Lorg/threeten/bp/Instant;->nanosUntil(Lorg/threeten/bp/Instant;)J

    move-result-wide p1

    return-wide p1

    .line 987
    :cond_0
    invoke-interface {p2, p0, p1}, Lorg/threeten/bp/temporal/TemporalUnit;->between(Lorg/threeten/bp/temporal/Temporal;Lorg/threeten/bp/temporal/Temporal;)J

    move-result-wide p1

    return-wide p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public with(Lorg/threeten/bp/temporal/TemporalAdjuster;)Lorg/threeten/bp/Instant;
    .locals 0

    .line 586
    invoke-interface {p1, p0}, Lorg/threeten/bp/temporal/TemporalAdjuster;->adjustInto(Lorg/threeten/bp/temporal/Temporal;)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    check-cast p1, Lorg/threeten/bp/Instant;

    return-object p1
.end method

.method public with(Lorg/threeten/bp/temporal/TemporalField;J)Lorg/threeten/bp/Instant;
    .locals 2

    .line 634
    instance-of v0, p1, Lorg/threeten/bp/temporal/ChronoField;

    if-eqz v0, :cond_4

    .line 635
    move-object v0, p1

    check-cast v0, Lorg/threeten/bp/temporal/ChronoField;

    .line 636
    invoke-virtual {v0, p2, p3}, Lorg/threeten/bp/temporal/ChronoField;->checkValidValue(J)J

    .line 637
    sget-object v1, Lorg/threeten/bp/Instant$2;->$SwitchMap$org$threeten$bp$temporal$ChronoField:[I

    invoke-virtual {v0}, Lorg/threeten/bp/temporal/ChronoField;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 649
    new-instance p2, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported field: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 647
    :pswitch_0
    iget-wide v0, p0, Lorg/threeten/bp/Instant;->seconds:J

    cmp-long p1, p2, v0

    if-eqz p1, :cond_0

    iget p1, p0, Lorg/threeten/bp/Instant;->nanos:I

    invoke-static {p2, p3, p1}, Lorg/threeten/bp/Instant;->create(JI)Lorg/threeten/bp/Instant;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1

    :pswitch_1
    long-to-int p1, p2

    const p2, 0xf4240

    mul-int p1, p1, p2

    .line 640
    iget p2, p0, Lorg/threeten/bp/Instant;->nanos:I

    if-eq p1, p2, :cond_1

    iget-wide p2, p0, Lorg/threeten/bp/Instant;->seconds:J

    invoke-static {p2, p3, p1}, Lorg/threeten/bp/Instant;->create(JI)Lorg/threeten/bp/Instant;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, p0

    :goto_1
    return-object p1

    :pswitch_2
    long-to-int p1, p2

    mul-int/lit16 p1, p1, 0x3e8

    .line 644
    iget p2, p0, Lorg/threeten/bp/Instant;->nanos:I

    if-eq p1, p2, :cond_2

    iget-wide p2, p0, Lorg/threeten/bp/Instant;->seconds:J

    invoke-static {p2, p3, p1}, Lorg/threeten/bp/Instant;->create(JI)Lorg/threeten/bp/Instant;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, p0

    :goto_2
    return-object p1

    .line 646
    :pswitch_3
    iget p1, p0, Lorg/threeten/bp/Instant;->nanos:I

    int-to-long v0, p1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_3

    iget-wide v0, p0, Lorg/threeten/bp/Instant;->seconds:J

    long-to-int p1, p2

    invoke-static {v0, v1, p1}, Lorg/threeten/bp/Instant;->create(JI)Lorg/threeten/bp/Instant;

    move-result-object p1

    goto :goto_3

    :cond_3
    move-object p1, p0

    :goto_3
    return-object p1

    .line 651
    :cond_4
    invoke-interface {p1, p0, p2, p3}, Lorg/threeten/bp/temporal/TemporalField;->adjustInto(Lorg/threeten/bp/temporal/Temporal;J)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    check-cast p1, Lorg/threeten/bp/Instant;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic with(Lorg/threeten/bp/temporal/TemporalAdjuster;)Lorg/threeten/bp/temporal/Temporal;
    .locals 0

    .line 157
    invoke-virtual {p0, p1}, Lorg/threeten/bp/Instant;->with(Lorg/threeten/bp/temporal/TemporalAdjuster;)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic with(Lorg/threeten/bp/temporal/TemporalField;J)Lorg/threeten/bp/temporal/Temporal;
    .locals 0

    .line 157
    invoke-virtual {p0, p1, p2, p3}, Lorg/threeten/bp/Instant;->with(Lorg/threeten/bp/temporal/TemporalField;J)Lorg/threeten/bp/Instant;

    move-result-object p1

    return-object p1
.end method

.method writeExternal(Ljava/io/DataOutput;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1180
    iget-wide v0, p0, Lorg/threeten/bp/Instant;->seconds:J

    invoke-interface {p1, v0, v1}, Ljava/io/DataOutput;->writeLong(J)V

    .line 1181
    iget v0, p0, Lorg/threeten/bp/Instant;->nanos:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    return-void
.end method
