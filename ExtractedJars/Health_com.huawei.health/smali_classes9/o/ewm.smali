.class public Lo/ewm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:[B

.field private static e:Lo/ewm;


# instance fields
.field private a:Z

.field private b:[F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const/4 v0, 0x1

    new-array v0, v0, [B

    sput-object v0, Lo/ewm;->c:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewm;->b:[F

    .line 221
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewm;->a:Z

    .line 27
    return-void
.end method

.method private a()I
    .locals 4

    .line 111
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->c()J

    move-result-wide v0

    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v2

    invoke-virtual {v2}, Lo/ewd;->b()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private b(IZ)[F
    .locals 5

    .line 53
    const/16 v0, 0x12

    new-array v4, v0, [F

    .line 54
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 55
    if-eqz p2, :cond_1

    .line 56
    invoke-direct {p0}, Lo/ewm;->d()[F

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 57
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ewd;->h(I)[F

    move-result-object v4

    .line 58
    invoke-virtual {p0, v4}, Lo/ewm;->b([F)V

    .line 59
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initCalibData()setCalibrateData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 61
    :cond_0
    invoke-direct {p0}, Lo/ewm;->d()[F

    move-result-object v4

    .line 62
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initCalibData()getCalibrateData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 65
    :cond_1
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ewd;->h(I)[F

    move-result-object v4

    goto/16 :goto_0

    .line 67
    :cond_2
    const/4 v0, 0x2

    if-ne v0, p1, :cond_3

    .line 68
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 69
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 70
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v4, v1

    .line 71
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v4, v1

    .line 72
    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v4, v1

    .line 73
    const/4 v0, 0x0

    const/4 v1, 0x5

    aput v0, v4, v1

    .line 74
    const/4 v0, 0x0

    const/4 v1, 0x6

    aput v0, v4, v1

    .line 75
    const/4 v0, 0x0

    const/4 v1, 0x7

    aput v0, v4, v1

    .line 76
    const/4 v0, 0x0

    const/16 v1, 0x8

    aput v0, v4, v1

    .line 77
    const/4 v0, 0x0

    const/16 v1, 0x9

    aput v0, v4, v1

    .line 78
    const/4 v0, 0x0

    const/16 v1, 0xa

    aput v0, v4, v1

    .line 79
    const/4 v0, 0x0

    const/16 v1, 0xb

    aput v0, v4, v1

    .line 80
    const/4 v0, 0x0

    const/16 v1, 0xc

    aput v0, v4, v1

    .line 81
    const/4 v0, 0x0

    const/16 v1, 0xd

    aput v0, v4, v1

    .line 82
    const/4 v0, 0x0

    const/16 v1, 0xe

    aput v0, v4, v1

    .line 83
    const/4 v0, 0x0

    const/16 v1, 0xf

    aput v0, v4, v1

    .line 84
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->u()I

    move-result v0

    int-to-float v0, v0

    const/16 v1, 0x10

    aput v0, v4, v1

    .line 85
    int-to-float v0, p1

    const/16 v1, 0x11

    aput v0, v4, v1

    .line 86
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initCalibData()flag =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 87
    :cond_3
    const/4 v0, 0x1

    if-ne v0, p1, :cond_4

    .line 88
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 89
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 90
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v4, v1

    .line 91
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v4, v1

    .line 92
    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v4, v1

    .line 93
    const/4 v0, 0x0

    const/4 v1, 0x5

    aput v0, v4, v1

    .line 94
    const/4 v0, 0x0

    const/4 v1, 0x6

    aput v0, v4, v1

    .line 95
    const/4 v0, 0x0

    const/4 v1, 0x7

    aput v0, v4, v1

    .line 96
    const/4 v0, 0x0

    const/16 v1, 0x8

    aput v0, v4, v1

    .line 97
    const/4 v0, 0x0

    const/16 v1, 0x9

    aput v0, v4, v1

    .line 98
    const/4 v0, 0x0

    const/16 v1, 0xa

    aput v0, v4, v1

    .line 99
    const/4 v0, 0x0

    const/16 v1, 0xb

    aput v0, v4, v1

    .line 100
    const/4 v0, 0x0

    const/16 v1, 0xc

    aput v0, v4, v1

    .line 101
    const/4 v0, 0x0

    const/16 v1, 0xd

    aput v0, v4, v1

    .line 102
    const/4 v0, 0x0

    const/16 v1, 0xe

    aput v0, v4, v1

    .line 103
    const/4 v0, 0x0

    const/16 v1, 0xf

    aput v0, v4, v1

    .line 104
    const/4 v0, 0x0

    const/16 v1, 0x10

    aput v0, v4, v1

    .line 105
    int-to-float v0, p1

    const/16 v1, 0x11

    aput v0, v4, v1

    .line 106
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initCalibData()flag =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :cond_4
    :goto_0
    return-object v4
.end method

.method private b()[I
    .locals 2

    .line 115
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v1

    iget-object v1, v1, Lo/ewd;->f:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ewd;->a(Ljava/util/List;)[I

    move-result-object v0

    return-object v0
.end method

.method public static c()Lo/ewm;
    .locals 4

    .line 30
    sget-object v2, Lo/ewm;->c:[B

    monitor-enter v2

    .line 31
    :try_start_0
    sget-object v0, Lo/ewm;->e:Lo/ewm;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 32
    new-instance v0, Lo/ewm;

    invoke-direct {v0}, Lo/ewm;-><init>()V

    sput-object v0, Lo/ewm;->e:Lo/ewm;

    .line 34
    :cond_0
    sget-object v0, Lo/ewm;->e:Lo/ewm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 35
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private d()[F
    .locals 2

    .line 38
    iget-object v0, p0, Lo/ewm;->b:[F

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 39
    iget-object v0, p0, Lo/ewm;->b:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0

    .line 41
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private e(Z)V
    .locals 0

    .line 223
    iput-boolean p1, p0, Lo/ewm;->a:Z

    .line 224
    return-void
.end method

.method private f()[I
    .locals 2

    .line 119
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v1

    iget-object v1, v1, Lo/ewd;->h:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ewd;->a(Ljava/util/List;)[I

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b([F)V
    .locals 1

    .line 45
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 46
    invoke-virtual {p1}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lo/ewm;->b:[F

    goto :goto_0

    .line 48
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewm;->b:[F

    .line 50
    :goto_0
    return-void
.end method

.method public c([F)Z
    .locals 5

    .line 204
    const/4 v2, 0x0

    .line 205
    const/4 v3, 0x0

    .line 206
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 207
    const/4 v4, 0x0

    :goto_0
    array-length v0, p1

    if-ge v4, v0, :cond_2

    .line 208
    aget v0, p1, v4

    const/4 v1, 0x0

    cmpl-float v0, v1, v0

    if-nez v0, :cond_0

    .line 209
    add-int/lit8 v3, v3, 0x1

    .line 211
    :cond_0
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    if-ne v4, v0, :cond_1

    .line 212
    array-length v0, p1

    if-ne v3, v0, :cond_1

    .line 213
    const/4 v2, 0x1

    .line 207
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 218
    :cond_2
    return v2
.end method

.method public e()Z
    .locals 1

    .line 226
    iget-boolean v0, p0, Lo/ewm;->a:Z

    return v0
.end method

.method public declared-synchronized e(I)[F
    .locals 12

    monitor-enter p0

    .line 122
    const/4 v4, 0x0

    .line 123
    :try_start_0
    invoke-static {}, Lcom/huawei/hwstressmgr/PressureCalibrate;->c()Lcom/huawei/hwstressmgr/PressureCalibrate;

    move-result-object v5

    .line 124
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSoBack()flag =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/ewm;->b(IZ)[F

    move-result-object v6

    .line 126
    invoke-virtual {p0, v6}, Lo/ewm;->c([F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    const/16 v0, 0x13

    new-array v4, v0, [F

    .line 128
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkArray(calibData)= true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    monitor-exit p0

    return-object v4

    .line 131
    :cond_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calibData len =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const/4 v7, 0x0

    :goto_0
    array-length v0, v6

    if-ge v7, v0, :cond_1

    .line 133
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calibData["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "] calibData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget v3, v6, v7

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 135
    :cond_1
    invoke-direct {p0}, Lo/ewm;->a()I

    move-result v7

    .line 136
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "signalTime  =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    const/4 v8, 0x0

    .line 138
    invoke-direct {p0}, Lo/ewm;->b()[I

    move-result-object v9

    .line 139
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    .line 140
    array-length v8, v9

    .line 141
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RRIDataLength  =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RRIData len =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v9

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    const/4 v10, 0x0

    :goto_1
    array-length v0, v9

    if-ge v10, v0, :cond_2

    .line 144
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RRIData["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "] RRIData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget v3, v9, v10

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 147
    :cond_2
    invoke-direct {p0}, Lo/ewm;->f()[I

    move-result-object v10

    .line 148
    const/4 v0, 0x0

    if-eq v0, v10, :cond_3

    .line 149
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SQIData len =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v10

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    :cond_3
    invoke-virtual/range {v5 .. v10}, Lcom/huawei/hwstressmgr/PressureCalibrate;->libPressureCalibrate([FII[I[I)[F

    move-result-object v4

    .line 152
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 153
    const/4 v11, 0x0

    :goto_2
    array-length v0, v4

    if-ge v11, v0, :cond_4

    .line 154
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "float["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "] back = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget v3, v4, v11

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    goto :goto_3

    .line 157
    :cond_5
    const/16 v0, 0x13

    new-array v4, v0, [F

    .line 158
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "back is not ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    :goto_3
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e(IJJ)[F
    .locals 14

    monitor-enter p0

    .line 164
    const/4 v6, 0x0

    .line 165
    :try_start_0
    invoke-static {}, Lcom/huawei/hwstressmgr/PressureCalibrate;->c()Lcom/huawei/hwstressmgr/PressureCalibrate;

    move-result-object v7

    .line 166
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCycleSoBack()flag =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/ewm;->b(IZ)[F

    move-result-object v8

    .line 168
    invoke-virtual {p0, v8}, Lo/ewm;->c([F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    const/16 v0, 0x13

    new-array v6, v0, [F

    .line 170
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ewm;->e(Z)V

    .line 171
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkArray(cyclecalibData)= true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    monitor-exit p0

    return-object v6

    .line 174
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ewm;->e(Z)V

    .line 181
    sub-long v0, p4, p2

    long-to-int v0, v0

    div-int/lit16 v9, v0, 0x3e8

    .line 182
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v1

    iget-object v1, v1, Lo/ewd;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ewd;->a(Ljava/util/List;)[I

    move-result-object v10

    .line 183
    const/4 v11, 0x0

    .line 184
    const/4 v0, 0x0

    if-eq v0, v10, :cond_1

    .line 185
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cycleRRIData len =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v10

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    array-length v11, v10

    .line 188
    :cond_1
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v1

    iget-object v1, v1, Lo/ewd;->g:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ewd;->a(Ljava/util/List;)[I

    move-result-object v12

    .line 189
    move-object v0, v7

    move-object v1, v8

    move v2, v9

    move v3, v11

    move-object v4, v10

    move-object v5, v12

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/hwstressmgr/PressureCalibrate;->libPressureCalibrate([FII[I[I)[F

    move-result-object v6

    .line 190
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 191
    const/4 v13, 0x0

    :goto_0
    array-length v0, v6

    if-ge v13, v0, :cond_2

    .line 192
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "float["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "] cycleBack = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget v3, v6, v13

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 195
    :cond_2
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 196
    const/16 v0, 0x13

    new-array v6, v0, [F

    .line 197
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cycleBack is not ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    :cond_3
    monitor-exit p0

    return-object v6

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
