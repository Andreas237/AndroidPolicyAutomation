.class public Lo/amw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/amw$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/amw;->a:Ljava/lang/Object;

    .line 26
    iput-object p1, p0, Lo/amw;->b:Landroid/content/Context;

    .line 27
    return-void
.end method

.method static synthetic d(Lo/amw;)Ljava/lang/Object;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/amw;->a:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 33
    move-object v4, p0

    monitor-enter v4

    .line 34
    :try_start_0
    new-instance v5, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->c(J)J

    move-result-wide v6

    .line 36
    invoke-virtual {v5, v6, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 37
    const-wide/32 v0, 0x5265c00

    add-long/2addr v0, v6

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 38
    const/16 v0, 0xe

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 56
    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "sleep_start_time"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "sleep_end_time"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "sleep_duration_sum"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "sleep_deep_duration"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "sleep_shallow_duration"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "sleep_wake_duration"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "sleep_wake_count"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "sleep_start_time_core"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "sleep_end_time_core"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "sleep_duration_sum_core"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "sleep_deep_duration_core"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "sleep_shallow_duration_core"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "sleep_wake_duration_core"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "sleep_wake_count_core"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 74
    const-string v0, "Step_SleepDataDBUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSleepDataDetail..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 76
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 77
    iget-object v0, p0, Lo/amw;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/amw$a;

    invoke-direct {v1, p0, p1}, Lo/amw$a;-><init>(Lo/amw;Ljava/util/Map;)V

    invoke-virtual {v0, v5, v1}, Lo/clq;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 79
    iget-object v0, p0, Lo/amw;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 80
    iget-object v8, p0, Lo/amw;->a:Ljava/lang/Object;

    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 82
    :try_start_1
    iget-object v0, p0, Lo/amw;->a:Ljava/lang/Object;

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    goto :goto_0

    .line 83
    :catch_0
    move-exception v9

    .line 84
    const-string v0, "Step_SleepDataDBUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSleepDataDetail InterruptedException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    :goto_0
    monitor-exit v8

    goto :goto_1

    :catchall_0
    move-exception v10

    monitor-exit v8

    :try_start_3
    throw v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 88
    :cond_0
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_1
    move-exception v11

    monitor-exit v4

    throw v11

    .line 89
    :goto_2
    return-void

    nop

    :array_0
    .array-data 4
        0xabe6
        0xabe7
        0xabe4
        0xabe1
        0xabe2
        0xabe3
        0xabe5
        0xaca9
        0xacaa
        0xac49
        0xac46
        0xac47
        0xac48
        0xac4b
    .end array-data
.end method
