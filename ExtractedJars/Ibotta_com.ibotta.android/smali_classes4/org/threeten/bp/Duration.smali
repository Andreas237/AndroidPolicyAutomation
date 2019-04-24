.class public final Lorg/threeten/bp/Duration;
.super Ljava/lang/Object;
.source "Duration.java"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;
.implements Lorg/threeten/bp/temporal/TemporalAmount;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Comparable<",
        "Lorg/threeten/bp/Duration;",
        ">;",
        "Lorg/threeten/bp/temporal/TemporalAmount;"
    }
.end annotation


# static fields
.field private static final BI_NANOS_PER_SECOND:Ljava/math/BigInteger;

.field private static final PATTERN:Ljava/util/regex/Pattern;

.field public static final ZERO:Lorg/threeten/bp/Duration;

.field private static final serialVersionUID:J = 0x2aba9d02d1c4f832L


# instance fields
.field private final nanos:I

.field private final seconds:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 99
    new-instance v0, Lorg/threeten/bp/Duration;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lorg/threeten/bp/Duration;-><init>(JI)V

    sput-object v0, Lorg/threeten/bp/Duration;->ZERO:Lorg/threeten/bp/Duration;

    const-wide/32 v0, 0x3b9aca00

    .line 115
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/threeten/bp/Duration;->BI_NANOS_PER_SECOND:Ljava/math/BigInteger;

    const-string v0, "([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?"

    const/4 v1, 0x2

    .line 120
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/threeten/bp/Duration;->PATTERN:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>(JI)V
    .locals 0

    .line 487
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 488
    iput-wide p1, p0, Lorg/threeten/bp/Duration;->seconds:J

    .line 489
    iput p3, p0, Lorg/threeten/bp/Duration;->nanos:I

    return-void
.end method

.method private static create(JI)Lorg/threeten/bp/Duration;
    .locals 5

    int-to-long v0, p2

    or-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 475
    sget-object p0, Lorg/threeten/bp/Duration;->ZERO:Lorg/threeten/bp/Duration;

    return-object p0

    .line 477
    :cond_0
    new-instance v0, Lorg/threeten/bp/Duration;

    invoke-direct {v0, p0, p1, p2}, Lorg/threeten/bp/Duration;-><init>(JI)V

    return-object v0
.end method

.method public static ofNanos(J)Lorg/threeten/bp/Duration;
    .locals 4

    const-wide/32 v0, 0x3b9aca00

    .line 246
    div-long v2, p0, v0

    .line 247
    rem-long/2addr p0, v0

    long-to-int p1, p0

    if-gez p1, :cond_0

    const p0, 0x3b9aca00

    add-int/2addr p1, p0

    const-wide/16 v0, 0x1

    sub-long/2addr v2, v0

    .line 252
    :cond_0
    invoke-static {v2, v3, p1}, Lorg/threeten/bp/Duration;->create(JI)Lorg/threeten/bp/Duration;

    move-result-object p0

    return-object p0
.end method

.method public static ofSeconds(J)Lorg/threeten/bp/Duration;
    .locals 1

    const/4 v0, 0x0

    .line 190
    invoke-static {p0, p1, v0}, Lorg/threeten/bp/Duration;->create(JI)Lorg/threeten/bp/Duration;

    move-result-object p0

    return-object p0
.end method

.method public static ofSeconds(JJ)Lorg/threeten/bp/Duration;
    .locals 2

    const-wide/32 v0, 0x3b9aca00

    .line 213
    invoke-static {p2, p3, v0, v1}, Lorg/threeten/bp/jdk8/Jdk8Methods;->floorDiv(JJ)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lorg/threeten/bp/jdk8/Jdk8Methods;->safeAdd(JJ)J

    move-result-wide p0

    const v0, 0x3b9aca00

    .line 214
    invoke-static {p2, p3, v0}, Lorg/threeten/bp/jdk8/Jdk8Methods;->floorMod(JI)I

    move-result p2

    .line 215
    invoke-static {p0, p1, p2}, Lorg/threeten/bp/Duration;->create(JI)Lorg/threeten/bp/Duration;

    move-result-object p0

    return-object p0
.end method

.method static readExternal(Ljava/io/DataInput;)Lorg/threeten/bp/Duration;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1260
    invoke-interface {p0}, Ljava/io/DataInput;->readLong()J

    move-result-wide v0

    .line 1261
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result p0

    int-to-long v2, p0

    .line 1262
    invoke-static {v0, v1, v2, v3}, Lorg/threeten/bp/Duration;->ofSeconds(JJ)Lorg/threeten/bp/Duration;

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

    .line 1251
    new-instance v0, Ljava/io/InvalidObjectException;

    const-string v1, "Deserialization via serialization delegate"

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1242
    new-instance v0, Lorg/threeten/bp/Ser;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Lorg/threeten/bp/Ser;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public addTo(Lorg/threeten/bp/temporal/Temporal;)Lorg/threeten/bp/temporal/Temporal;
    .locals 5

    .line 1000
    iget-wide v0, p0, Lorg/threeten/bp/Duration;->seconds:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 1001
    sget-object v2, Lorg/threeten/bp/temporal/ChronoUnit;->SECONDS:Lorg/threeten/bp/temporal/ChronoUnit;

    invoke-interface {p1, v0, v1, v2}, Lorg/threeten/bp/temporal/Temporal;->plus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    .line 1003
    :cond_0
    iget v0, p0, Lorg/threeten/bp/Duration;->nanos:I

    if-eqz v0, :cond_1

    int-to-long v0, v0

    .line 1004
    sget-object v2, Lorg/threeten/bp/temporal/ChronoUnit;->NANOS:Lorg/threeten/bp/temporal/ChronoUnit;

    invoke-interface {p1, v0, v1, v2}, Lorg/threeten/bp/temporal/Temporal;->plus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 93
    check-cast p1, Lorg/threeten/bp/Duration;

    invoke-virtual {p0, p1}, Lorg/threeten/bp/Duration;->compareTo(Lorg/threeten/bp/Duration;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/threeten/bp/Duration;)I
    .locals 4

    .line 1134
    iget-wide v0, p0, Lorg/threeten/bp/Duration;->seconds:J

    iget-wide v2, p1, Lorg/threeten/bp/Duration;->seconds:J

    invoke-static {v0, v1, v2, v3}, Lorg/threeten/bp/jdk8/Jdk8Methods;->compareLongs(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 1138
    :cond_0
    iget v0, p0, Lorg/threeten/bp/Duration;->nanos:I

    iget p1, p1, Lorg/threeten/bp/Duration;->nanos:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1155
    :cond_0
    instance-of v1, p1, Lorg/threeten/bp/Duration;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 1156
    check-cast p1, Lorg/threeten/bp/Duration;

    .line 1157
    iget-wide v3, p0, Lorg/threeten/bp/Duration;->seconds:J

    iget-wide v5, p1, Lorg/threeten/bp/Duration;->seconds:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget v1, p0, Lorg/threeten/bp/Duration;->nanos:I

    iget p1, p1, Lorg/threeten/bp/Duration;->nanos:I

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public get(Lorg/threeten/bp/temporal/TemporalUnit;)J
    .locals 3

    .line 500
    sget-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->SECONDS:Lorg/threeten/bp/temporal/ChronoUnit;

    if-ne p1, v0, :cond_0

    .line 501
    iget-wide v0, p0, Lorg/threeten/bp/Duration;->seconds:J

    return-wide v0

    .line 503
    :cond_0
    sget-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->NANOS:Lorg/threeten/bp/temporal/ChronoUnit;

    if-ne p1, v0, :cond_1

    .line 504
    iget p1, p0, Lorg/threeten/bp/Duration;->nanos:I

    int-to-long v0, p1

    return-wide v0

    .line 506
    :cond_1
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported unit: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getSeconds()J
    .locals 2

    .line 552
    iget-wide v0, p0, Lorg/threeten/bp/Duration;->seconds:J

    return-wide v0
.end method

.method public getUnits()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/threeten/bp/temporal/TemporalUnit;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 495
    new-array v0, v0, [Lorg/threeten/bp/temporal/ChronoUnit;

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->SECONDS:Lorg/threeten/bp/temporal/ChronoUnit;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->NANOS:Lorg/threeten/bp/temporal/ChronoUnit;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1170
    iget-wide v0, p0, Lorg/threeten/bp/Duration;->seconds:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v1, v0

    iget v0, p0, Lorg/threeten/bp/Duration;->nanos:I

    mul-int/lit8 v0, v0, 0x33

    add-int/2addr v1, v0

    return v1
.end method

.method public subtractFrom(Lorg/threeten/bp/temporal/Temporal;)Lorg/threeten/bp/temporal/Temporal;
    .locals 5

    .line 1035
    iget-wide v0, p0, Lorg/threeten/bp/Duration;->seconds:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 1036
    sget-object v2, Lorg/threeten/bp/temporal/ChronoUnit;->SECONDS:Lorg/threeten/bp/temporal/ChronoUnit;

    invoke-interface {p1, v0, v1, v2}, Lorg/threeten/bp/temporal/Temporal;->minus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    .line 1038
    :cond_0
    iget v0, p0, Lorg/threeten/bp/Duration;->nanos:I

    if-eqz v0, :cond_1

    int-to-long v0, v0

    .line 1039
    sget-object v2, Lorg/threeten/bp/temporal/ChronoUnit;->NANOS:Lorg/threeten/bp/temporal/ChronoUnit;

    invoke-interface {p1, v0, v1, v2}, Lorg/threeten/bp/temporal/Temporal;->minus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1198
    sget-object v0, Lorg/threeten/bp/Duration;->ZERO:Lorg/threeten/bp/Duration;

    if-ne p0, v0, :cond_0

    const-string v0, "PT0S"

    return-object v0

    .line 1201
    :cond_0
    iget-wide v0, p0, Lorg/threeten/bp/Duration;->seconds:J

    const-wide/16 v2, 0xe10

    div-long v4, v0, v2

    .line 1202
    rem-long v2, v0, v2

    const-wide/16 v6, 0x3c

    div-long/2addr v2, v6

    long-to-int v3, v2

    .line 1203
    rem-long/2addr v0, v6

    long-to-int v1, v0

    .line 1204
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "PT"

    .line 1205
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-eqz v2, :cond_1

    .line 1207
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v2, 0x48

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    if-eqz v3, :cond_2

    .line 1210
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x4d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    if-nez v1, :cond_3

    .line 1212
    iget v2, p0, Lorg/threeten/bp/Duration;->nanos:I

    if-nez v2, :cond_3

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v3, 0x2

    if-le v2, v3, :cond_3

    .line 1213
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    if-gez v1, :cond_5

    .line 1215
    iget v2, p0, Lorg/threeten/bp/Duration;->nanos:I

    if-lez v2, :cond_5

    const/4 v2, -0x1

    if-ne v1, v2, :cond_4

    const-string v2, "-0"

    .line 1217
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_4
    add-int/lit8 v2, v1, 0x1

    .line 1219
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1222
    :cond_5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1224
    :goto_0
    iget v2, p0, Lorg/threeten/bp/Duration;->nanos:I

    if-lez v2, :cond_8

    .line 1225
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-gez v1, :cond_6

    const v1, 0x77359400

    .line 1227
    iget v3, p0, Lorg/threeten/bp/Duration;->nanos:I

    sub-int/2addr v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1229
    :cond_6
    iget v1, p0, Lorg/threeten/bp/Duration;->nanos:I

    const v3, 0x3b9aca00

    add-int/2addr v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1231
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v1

    const/16 v3, 0x30

    if-ne v1, v3, :cond_7

    .line 1232
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_1

    :cond_7
    const/16 v1, 0x2e

    .line 1234
    invoke-virtual {v0, v2, v1}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    :cond_8
    const/16 v1, 0x53

    .line 1236
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1237
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method writeExternal(Ljava/io/DataOutput;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1255
    iget-wide v0, p0, Lorg/threeten/bp/Duration;->seconds:J

    invoke-interface {p1, v0, v1}, Ljava/io/DataOutput;->writeLong(J)V

    .line 1256
    iget v0, p0, Lorg/threeten/bp/Duration;->nanos:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    return-void
.end method
