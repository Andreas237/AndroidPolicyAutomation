.class public Lo/anh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/anh;


# instance fields
.field private a:J

.field private c:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 18
    new-instance v0, Lo/anh;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lo/anh;-><init>(JJ)V

    sput-object v0, Lo/anh;->b:Lo/anh;

    return-void
.end method

.method private constructor <init>(JJ)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/anh;->c:J

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/anh;->a:J

    .line 24
    iput-wide p1, p0, Lo/anh;->c:J

    .line 25
    iput-wide p3, p0, Lo/anh;->a:J

    .line 26
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 4

    .line 86
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {p0, v0, v1, v2, v3}, Lo/amy;->b(Landroid/content/Context;JJ)V

    .line 87
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/anh;
    .locals 10

    .line 101
    :try_start_0
    invoke-static {p0}, Lo/amy;->y(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v4

    .line 102
    if-eqz v4, :cond_0

    array-length v0, v4

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 103
    :cond_0
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "alive record empty or data bad,return unseted record"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    sget-object v0, Lo/anh;->b:Lo/anh;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 106
    :cond_1
    const/4 v0, 0x0

    :try_start_1
    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 107
    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 108
    new-instance v9, Lo/anh;

    invoke-direct {v9, v5, v6, v7, v8}, Lo/anh;-><init>(JJ)V

    .line 109
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Deserialize timestamp="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " elapsedRealtimeArg="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 110
    return-object v9

    .line 111
    :catch_0
    move-exception v4

    .line 112
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Deserialize error,exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " return mUnsetedAliveRecord"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    sget-object v0, Lo/anh;->b:Lo/anh;

    return-object v0
.end method

.method private d(J)J
    .locals 6

    .line 69
    iget-wide v0, p0, Lo/anh;->a:J

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 70
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "elapsedRealtimeNow("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ") <= mElapsedRealtime("

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/anh;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "),maybe reboot,return death mills zero"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    const-wide/16 v0, 0x0

    return-wide v0

    .line 74
    :cond_0
    iget-wide v0, p0, Lo/anh;->a:J

    sub-long v4, p1, v0

    .line 75
    const-wide v0, 0x9a7ec800L

    cmp-long v0, v4, v0

    if-lez v0, :cond_1

    .line 76
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "(elapsedRealtime) intervalMills("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 77
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ") > MAX_VALIDATE_DEATH_MILLS("

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-wide v2, 0x9a7ec800L

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "),interval larger than 30 days,drop death time,return NO_DEATH_MILLS"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 76
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const-wide/16 v0, 0x0

    return-wide v0

    .line 81
    :cond_1
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "computeIntervalByElapsedRealtime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return-wide v4
.end method

.method private e(J)J
    .locals 6

    .line 47
    iget-wide v0, p0, Lo/anh;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 48
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "timeStamp zero,no data validate,return NO_DEATH_MILLS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    const-wide/16 v0, 0x0

    return-wide v0

    .line 51
    :cond_0
    iget-wide v0, p0, Lo/anh;->c:J

    cmp-long v0, p1, v0

    if-gtz v0, :cond_1

    .line 52
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "timeStampNow("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ") <= mTimestamp("

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/anh;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "),maybe modify time,return death mills zero"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    const-wide/16 v0, 0x0

    return-wide v0

    .line 56
    :cond_1
    iget-wide v0, p0, Lo/anh;->c:J

    sub-long v4, p1, v0

    .line 57
    const-wide v0, 0x9a7ec800L

    cmp-long v0, v4, v0

    if-lez v0, :cond_2

    .line 58
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "(timeStamp) intervalMills("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 59
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ") > MAX_VALIDATE_DEATH_MILLS("

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-wide v2, 0x9a7ec800L

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "),interval larger than 30 days,drop death time,return NO_DEATH_MILLS"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 58
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    const-wide/16 v0, 0x0

    return-wide v0

    .line 63
    :cond_2
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "computeIntervalByTimeStamp:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    return-wide v4
.end method

.method public static e(Landroid/content/Context;)V
    .locals 0

    .line 90
    invoke-static {p0}, Lo/amy;->z(Landroid/content/Context;)V

    .line 91
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 4

    .line 118
    iget-wide v0, p0, Lo/anh;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Lo/anh;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    .line 119
    :cond_0
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isUnseted mTimestamp="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/anh;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mElapsedRealtime="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/anh;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " data not can use,return unseted!!!"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    const/4 v0, 0x1

    return v0

    .line 123
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public b()J
    .locals 12

    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 30
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    .line 31
    invoke-direct {p0, v4, v5}, Lo/anh;->e(J)J

    move-result-wide v8

    .line 32
    invoke-direct {p0, v6, v7}, Lo/anh;->d(J)J

    move-result-wide v10

    .line 33
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-lez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, v10, v0

    if-gtz v0, :cond_1

    .line 34
    :cond_0
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intervalMillsByTimeStamp or intervalMillsByElapsedRealtime no larger than zero,return NO_DEATH_MILLS!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    const-wide/16 v0, 0x0

    return-wide v0

    .line 38
    :cond_1
    cmp-long v0, v8, v10

    if-gtz v0, :cond_2

    .line 39
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "computeIntervalMillsFromNow end value:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    return-wide v8

    .line 42
    :cond_2
    const-string v0, "Step_AliveStatusRecord"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "computeIntervalMillsFromNow end value:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    return-wide v10
.end method
