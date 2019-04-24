.class public final enum Lorg/threeten/bp/temporal/ChronoUnit;
.super Ljava/lang/Enum;
.source "ChronoUnit.java"

# interfaces
.implements Lorg/threeten/bp/temporal/TemporalUnit;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/threeten/bp/temporal/ChronoUnit;",
        ">;",
        "Lorg/threeten/bp/temporal/TemporalUnit;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum CENTURIES:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum DAYS:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum DECADES:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum ERAS:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum FOREVER:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum HALF_DAYS:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum HOURS:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum MICROS:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum MILLENNIA:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum MILLIS:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum MINUTES:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum MONTHS:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum NANOS:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum SECONDS:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum WEEKS:Lorg/threeten/bp/temporal/ChronoUnit;

.field public static final enum YEARS:Lorg/threeten/bp/temporal/ChronoUnit;


# instance fields
.field private final duration:Lorg/threeten/bp/Duration;

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 59
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "NANOS"

    const-string v2, "Nanos"

    const-wide/16 v3, 0x1

    invoke-static {v3, v4}, Lorg/threeten/bp/Duration;->ofNanos(J)Lorg/threeten/bp/Duration;

    move-result-object v5

    const/4 v6, 0x0

    invoke-direct {v0, v1, v6, v2, v5}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->NANOS:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 64
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "MICROS"

    const-string v2, "Micros"

    const-wide/16 v7, 0x3e8

    invoke-static {v7, v8}, Lorg/threeten/bp/Duration;->ofNanos(J)Lorg/threeten/bp/Duration;

    move-result-object v5

    const/4 v7, 0x1

    invoke-direct {v0, v1, v7, v2, v5}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->MICROS:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 69
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "MILLIS"

    const-string v2, "Millis"

    const-wide/32 v8, 0xf4240

    invoke-static {v8, v9}, Lorg/threeten/bp/Duration;->ofNanos(J)Lorg/threeten/bp/Duration;

    move-result-object v5

    const/4 v8, 0x2

    invoke-direct {v0, v1, v8, v2, v5}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->MILLIS:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 75
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "SECONDS"

    const-string v2, "Seconds"

    invoke-static {v3, v4}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->SECONDS:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 80
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "MINUTES"

    const-string v2, "Minutes"

    const-wide/16 v9, 0x3c

    invoke-static {v9, v10}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/4 v5, 0x4

    invoke-direct {v0, v1, v5, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->MINUTES:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 85
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "HOURS"

    const-string v2, "Hours"

    const-wide/16 v9, 0xe10

    invoke-static {v9, v10}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/4 v9, 0x5

    invoke-direct {v0, v1, v9, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->HOURS:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 90
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "HALF_DAYS"

    const-string v2, "HalfDays"

    const-wide/32 v10, 0xa8c0

    invoke-static {v10, v11}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/4 v10, 0x6

    invoke-direct {v0, v1, v10, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->HALF_DAYS:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 101
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "DAYS"

    const-string v2, "Days"

    const-wide/32 v11, 0x15180

    invoke-static {v11, v12}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/4 v11, 0x7

    invoke-direct {v0, v1, v11, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->DAYS:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 108
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "WEEKS"

    const-string v2, "Weeks"

    const-wide/32 v12, 0x93a80

    invoke-static {v12, v13}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/16 v12, 0x8

    invoke-direct {v0, v1, v12, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->WEEKS:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 116
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "MONTHS"

    const-string v2, "Months"

    const-wide/32 v13, 0x282072

    invoke-static {v13, v14}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/16 v13, 0x9

    invoke-direct {v0, v1, v13, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->MONTHS:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 125
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "YEARS"

    const-string v2, "Years"

    const-wide/32 v14, 0x1e18558

    invoke-static {v14, v15}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/16 v14, 0xa

    invoke-direct {v0, v1, v14, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->YEARS:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 133
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "DECADES"

    const-string v2, "Decades"

    const-wide/32 v15, 0x12cf3570

    invoke-static/range {v15 .. v16}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/16 v15, 0xb

    invoke-direct {v0, v1, v15, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->DECADES:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 141
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "CENTURIES"

    const-string v2, "Centuries"

    const-wide v16, 0xbc181660L

    invoke-static/range {v16 .. v17}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->CENTURIES:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 149
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "MILLENNIA"

    const-string v2, "Millennia"

    const-wide v17, 0x758f0dfc0L

    invoke-static/range {v17 .. v18}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->MILLENNIA:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 158
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "ERAS"

    const-string v2, "Eras"

    const-wide v18, 0x701ce172277000L

    invoke-static/range {v18 .. v19}, Lorg/threeten/bp/Duration;->ofSeconds(J)Lorg/threeten/bp/Duration;

    move-result-object v3

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2, v3}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->ERAS:Lorg/threeten/bp/temporal/ChronoUnit;

    .line 166
    new-instance v0, Lorg/threeten/bp/temporal/ChronoUnit;

    const-string v1, "FOREVER"

    const-string v2, "Forever"

    const-wide v14, 0x7fffffffffffffffL

    const-wide/32 v12, 0x3b9ac9ff

    invoke-static {v14, v15, v12, v13}, Lorg/threeten/bp/Duration;->ofSeconds(JJ)Lorg/threeten/bp/Duration;

    move-result-object v12

    const/16 v13, 0xf

    invoke-direct {v0, v1, v13, v2, v12}, Lorg/threeten/bp/temporal/ChronoUnit;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->FOREVER:Lorg/threeten/bp/temporal/ChronoUnit;

    const/16 v0, 0x10

    .line 53
    new-array v0, v0, [Lorg/threeten/bp/temporal/ChronoUnit;

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->NANOS:Lorg/threeten/bp/temporal/ChronoUnit;

    aput-object v1, v0, v6

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->MICROS:Lorg/threeten/bp/temporal/ChronoUnit;

    aput-object v1, v0, v7

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->MILLIS:Lorg/threeten/bp/temporal/ChronoUnit;

    aput-object v1, v0, v8

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->SECONDS:Lorg/threeten/bp/temporal/ChronoUnit;

    aput-object v1, v0, v4

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->MINUTES:Lorg/threeten/bp/temporal/ChronoUnit;

    aput-object v1, v0, v5

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->HOURS:Lorg/threeten/bp/temporal/ChronoUnit;

    aput-object v1, v0, v9

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->HALF_DAYS:Lorg/threeten/bp/temporal/ChronoUnit;

    aput-object v1, v0, v10

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->DAYS:Lorg/threeten/bp/temporal/ChronoUnit;

    aput-object v1, v0, v11

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->WEEKS:Lorg/threeten/bp/temporal/ChronoUnit;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->MONTHS:Lorg/threeten/bp/temporal/ChronoUnit;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->YEARS:Lorg/threeten/bp/temporal/ChronoUnit;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->DECADES:Lorg/threeten/bp/temporal/ChronoUnit;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->CENTURIES:Lorg/threeten/bp/temporal/ChronoUnit;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->MILLENNIA:Lorg/threeten/bp/temporal/ChronoUnit;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->ERAS:Lorg/threeten/bp/temporal/ChronoUnit;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lorg/threeten/bp/temporal/ChronoUnit;->FOREVER:Lorg/threeten/bp/temporal/ChronoUnit;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sput-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->$VALUES:[Lorg/threeten/bp/temporal/ChronoUnit;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lorg/threeten/bp/Duration;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/threeten/bp/Duration;",
            ")V"
        }
    .end annotation

    .line 171
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 172
    iput-object p3, p0, Lorg/threeten/bp/temporal/ChronoUnit;->name:Ljava/lang/String;

    .line 173
    iput-object p4, p0, Lorg/threeten/bp/temporal/ChronoUnit;->duration:Lorg/threeten/bp/Duration;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/threeten/bp/temporal/ChronoUnit;
    .locals 1

    .line 53
    const-class v0, Lorg/threeten/bp/temporal/ChronoUnit;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/threeten/bp/temporal/ChronoUnit;

    return-object p0
.end method

.method public static values()[Lorg/threeten/bp/temporal/ChronoUnit;
    .locals 1

    .line 53
    sget-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->$VALUES:[Lorg/threeten/bp/temporal/ChronoUnit;

    invoke-virtual {v0}, [Lorg/threeten/bp/temporal/ChronoUnit;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/threeten/bp/temporal/ChronoUnit;

    return-object v0
.end method


# virtual methods
.method public addTo(Lorg/threeten/bp/temporal/Temporal;J)Lorg/threeten/bp/temporal/Temporal;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lorg/threeten/bp/temporal/Temporal;",
            ">(TR;J)TR;"
        }
    .end annotation

    .line 253
    invoke-interface {p1, p2, p3, p0}, Lorg/threeten/bp/temporal/Temporal;->plus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/temporal/Temporal;

    move-result-object p1

    return-object p1
.end method

.method public between(Lorg/threeten/bp/temporal/Temporal;Lorg/threeten/bp/temporal/Temporal;)J
    .locals 0

    .line 259
    invoke-interface {p1, p2, p0}, Lorg/threeten/bp/temporal/Temporal;->until(Lorg/threeten/bp/temporal/Temporal;Lorg/threeten/bp/temporal/TemporalUnit;)J

    move-result-wide p1

    return-wide p1
.end method

.method public getDuration()Lorg/threeten/bp/Duration;
    .locals 1

    .line 187
    iget-object v0, p0, Lorg/threeten/bp/temporal/ChronoUnit;->duration:Lorg/threeten/bp/Duration;

    return-object v0
.end method

.method public isDateBased()Z
    .locals 1

    .line 213
    sget-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->DAYS:Lorg/threeten/bp/temporal/ChronoUnit;

    invoke-virtual {p0, v0}, Lorg/threeten/bp/temporal/ChronoUnit;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->FOREVER:Lorg/threeten/bp/temporal/ChronoUnit;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isDurationEstimated()Z
    .locals 1

    .line 203
    invoke-virtual {p0}, Lorg/threeten/bp/temporal/ChronoUnit;->isDateBased()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->FOREVER:Lorg/threeten/bp/temporal/ChronoUnit;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isSupportedBy(Lorg/threeten/bp/temporal/Temporal;)Z
    .locals 5

    .line 228
    sget-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->FOREVER:Lorg/threeten/bp/temporal/ChronoUnit;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    return v1

    .line 231
    :cond_0
    instance-of v0, p1, Lorg/threeten/bp/chrono/ChronoLocalDate;

    if-eqz v0, :cond_1

    .line 232
    invoke-virtual {p0}, Lorg/threeten/bp/temporal/ChronoUnit;->isDateBased()Z

    move-result p1

    return p1

    .line 234
    :cond_1
    instance-of v0, p1, Lorg/threeten/bp/chrono/ChronoLocalDateTime;

    const/4 v2, 0x1

    if-nez v0, :cond_3

    instance-of v0, p1, Lorg/threeten/bp/chrono/ChronoZonedDateTime;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const-wide/16 v3, 0x1

    .line 238
    :try_start_0
    invoke-interface {p1, v3, v4, p0}, Lorg/threeten/bp/temporal/Temporal;->plus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/temporal/Temporal;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    const-wide/16 v3, -0x1

    .line 242
    :try_start_1
    invoke-interface {p1, v3, v4, p0}, Lorg/threeten/bp/temporal/Temporal;->plus(JLorg/threeten/bp/temporal/TemporalUnit;)Lorg/threeten/bp/temporal/Temporal;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    return v2

    :catch_1
    return v1

    :cond_3
    :goto_0
    return v2
.end method

.method public isTimeBased()Z
    .locals 1

    .line 222
    sget-object v0, Lorg/threeten/bp/temporal/ChronoUnit;->DAYS:Lorg/threeten/bp/temporal/ChronoUnit;

    invoke-virtual {p0, v0}, Lorg/threeten/bp/temporal/ChronoUnit;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 265
    iget-object v0, p0, Lorg/threeten/bp/temporal/ChronoUnit;->name:Ljava/lang/String;

    return-object v0
.end method
