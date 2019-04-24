.class public Lo/and;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/and$a;,
        Lo/and$b;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/content/Context;

.field private c:Landroid/os/Handler;

.field private d:I

.field private e:I

.field private g:Lo/and$a;

.field private i:Lo/ald;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;)V
    .locals 4

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/and;->b:Landroid/content/Context;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/and;->a:Ljava/lang/String;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/and;->c:Landroid/os/Handler;

    .line 38
    const/4 v0, -0x1

    iput v0, p0, Lo/and;->d:I

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/and;->e:I

    .line 156
    const/4 v0, 0x0

    iput-object v0, p0, Lo/and;->i:Lo/ald;

    .line 158
    new-instance v0, Lo/and$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/and$a;-><init>(Lo/and$5;)V

    iput-object v0, p0, Lo/and;->g:Lo/and$a;

    .line 43
    move-object v2, p0

    monitor-enter v2

    .line 44
    :try_start_0
    iput-object p2, p0, Lo/and;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 46
    :goto_0
    iput-object p1, p0, Lo/and;->b:Landroid/content/Context;

    .line 47
    iput-object p3, p0, Lo/and;->c:Landroid/os/Handler;

    .line 48
    return-void
.end method

.method private c(JLo/ald;)V
    .locals 9

    .line 202
    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    if-nez p3, :cond_1

    .line 203
    :cond_0
    return-void

    .line 205
    :cond_1
    move-wide v4, p1

    .line 206
    new-instance v6, Lo/ald;

    invoke-direct {v6}, Lo/ald;-><init>()V

    .line 207
    invoke-virtual {v6, p3}, Lo/ald;->a(Lo/ald;)V

    .line 209
    iget-object v0, p0, Lo/and;->g:Lo/and$a;

    invoke-virtual {v0, v4, v5, v6}, Lo/and$a;->e(JLo/ald;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 210
    const-string v0, "Step_UploadUtil"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Upload nextDay refused for same,step:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, v6, Lo/ald;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " calories:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, v6, Lo/ald;->d:I

    .line 211
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " floor:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, v6, Lo/ald;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " distance:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, v6, Lo/ald;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " startTime:"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 210
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    return-void

    .line 215
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v4, v5, v0, v1}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 216
    const-string v0, "Step_UploadUtil"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "timeStamp:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " isSameDay as:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " nextDay call error,pls check!!!"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    return-void

    .line 220
    :cond_3
    new-instance v7, Ljava/security/SecureRandom;

    invoke-direct {v7}, Ljava/security/SecureRandom;-><init>()V

    .line 221
    const/16 v0, 0x12c

    invoke-virtual {v7, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v8

    .line 223
    const-string v0, "Step_UploadUtil"

    const/16 v1, 0xe

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Upload nextDay machinical delay mills:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    mul-int/lit16 v2, v8, 0x3e8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " step:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, v6, Lo/ald;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "deviceStep:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, v6, Lo/ald;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " calories:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, v6, Lo/ald;->d:I

    .line 224
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " floor:"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget v2, v6, Lo/ald;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, " distance:"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    iget v2, v6, Lo/ald;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, " startTime:"

    const/16 v3, 0xc

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    .line 223
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    iget-object v0, p0, Lo/and;->c:Landroid/os/Handler;

    new-instance v1, Lo/and$5;

    invoke-direct {v1, p0, v6, v4, v5}, Lo/and$5;-><init>(Lo/and;Lo/ald;J)V

    mul-int/lit16 v2, v8, 0x3e8

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 232
    return-void
.end method

.method private d(IIJ)Lcom/huawei/hihealth/HiHealthData;
    .locals 5

    .line 122
    move-object v3, p0

    monitor-enter v3

    .line 123
    :try_start_0
    iget-object v0, p0, Lo/and;->a:Ljava/lang/String;

    invoke-static {p1, p2, v0}, Lo/amm;->c(IILjava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v2

    .line 124
    const/16 v0, 0x385

    if-ne v0, p2, :cond_0

    .line 125
    invoke-static {p3, p4}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 126
    invoke-static {p3, p4}, Lo/cnk;->i(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    goto :goto_0

    .line 128
    :cond_0
    invoke-virtual {v2, p3, p4}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    :goto_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 131
    :goto_1
    return-object v2
.end method


# virtual methods
.method public b(Lo/ald;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lo/and;->i:Lo/ald;

    .line 189
    return-void
.end method

.method public b(I)Z
    .locals 2

    .line 71
    iget v0, p0, Lo/and;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/and;->e:I

    .line 72
    iget v0, p0, Lo/and;->e:I

    const/16 v1, 0x190

    if-le v0, v1, :cond_0

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lo/and;->e:I

    .line 74
    const/4 v0, 0x1

    return v0

    .line 76
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 148
    move-object v0, p0

    monitor-enter v0

    .line 149
    :try_start_0
    iput-object p1, p0, Lo/and;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 151
    :goto_0
    return-void
.end method

.method public c(I)Z
    .locals 2

    .line 57
    iget v0, p0, Lo/and;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 58
    iput p1, p0, Lo/and;->d:I

    .line 59
    const/4 v0, 0x0

    return v0

    .line 62
    :cond_0
    iget v0, p0, Lo/and;->d:I

    sub-int v0, p1, v0

    const/16 v1, 0x190

    if-le v0, v1, :cond_1

    .line 63
    iput p1, p0, Lo/and;->d:I

    .line 64
    const/4 v0, 0x1

    return v0

    .line 66
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public d(IIIII)V
    .locals 8

    .line 81
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual/range {v0 .. v7}, Lo/and;->e(IIIIIJ)V

    .line 82
    return-void
.end method

.method public e(IIIIIJ)V
    .locals 9

    .line 88
    const-string v0, "Step_UploadUtil"

    const/16 v1, 0xc

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadStaticsToDB totalSteps="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "deviceStep:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " Calories:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " Floor:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " Distance:"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, " startTime:"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static/range {p6 .. p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lo/and;->g:Lo/and$a;

    move-wide v1, p6

    move v3, p1

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v0 .. v6}, Lo/and$a;->c(JIIII)V

    .line 92
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 94
    if-lez p1, :cond_0

    .line 95
    const v0, 0x9c42

    move-wide v1, p6

    invoke-direct {p0, p1, v0, v1, v2}, Lo/and;->d(IIJ)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    :cond_0
    if-lez p2, :cond_1

    .line 99
    const/16 v0, 0x385

    move-wide v1, p6

    invoke-direct {p0, p2, v0, v1, v2}, Lo/and;->d(IIJ)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    :cond_1
    if-lez p3, :cond_2

    .line 103
    const v0, 0x9c43

    move-wide v1, p6

    invoke-direct {p0, p3, v0, v1, v2}, Lo/and;->d(IIJ)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    :cond_2
    if-lez p4, :cond_3

    .line 107
    const v0, 0x9c45

    move-wide v1, p6

    invoke-direct {p0, p4, v0, v1, v2}, Lo/and;->d(IIJ)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    :cond_3
    if-lez p5, :cond_4

    .line 111
    const v0, 0x9c44

    move-wide v1, p6

    invoke-direct {p0, p5, v0, v1, v2}, Lo/and;->d(IIJ)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    :cond_4
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 115
    invoke-static {v7}, Lo/amm;->a(Ljava/util/List;)Lcom/huawei/hihealth/HiDataInsertOption;

    move-result-object v8

    .line 116
    iget-object v0, p0, Lo/and;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/and$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/and$b;-><init>(Lo/and$5;)V

    invoke-interface {v0, v8, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 118
    :cond_5
    return-void
.end method

.method public e(J)V
    .locals 5

    .line 193
    const-string v0, "Step_UploadUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recognized next day,oldDayTimeStamp:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :try_start_0
    iget-object v0, p0, Lo/and;->i:Lo/ald;

    invoke-direct {p0, p1, p2, v0}, Lo/and;->c(JLo/ald;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 198
    goto :goto_0

    .line 196
    :catch_0
    move-exception v4

    .line 197
    const-string v0, "Step_UploadUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nextDay occure exception!!!:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    :goto_0
    return-void
.end method
