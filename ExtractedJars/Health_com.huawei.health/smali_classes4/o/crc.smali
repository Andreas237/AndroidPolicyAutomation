.class public Lo/crc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crc$a;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# instance fields
.field private c:Lo/cqq;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lo/cqq;

    invoke-direct {v0}, Lo/cqq;-><init>()V

    iput-object v0, p0, Lo/crc;->c:Lo/cqq;

    .line 33
    return-void
.end method

.method synthetic constructor <init>(Lo/crc$1;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lo/crc;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/crc;
    .locals 1

    .line 43
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/crc;->e:Landroid/content/Context;

    .line 44
    sget-object v0, Lo/crc$a;->e:Lo/crc;

    return-object v0
.end method

.method private c(IJ)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 101
    sget-object v0, Lo/crc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p1}, Lo/cpw;->d(JI)I

    move-result v4

    .line 102
    if-gtz v4, :cond_0

    .line 103
    sget-object v0, Lo/crc;->e:Landroid/content/Context;

    invoke-static {v0, p2, p3}, Lo/cui;->d(Landroid/content/Context;J)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v5

    .line 104
    const-string v0, "Debug_SynClientCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncOneDeviceByVersion hiDeviceInfo is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    if-eqz v5, :cond_0

    .line 106
    sget-object v0, Lo/crc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/cqa;->a(Lcom/huawei/hihealth/HiDeviceInfo;)Z

    .line 107
    sget-object v0, Lo/crc;->e:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cqf;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    .line 110
    :cond_0
    return v4
.end method

.method private c(IIJ)Z
    .locals 4

    .line 126
    if-ltz p1, :cond_0

    if-lez p2, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-gtz v0, :cond_1

    .line 127
    :cond_0
    const-string v0, "Debug_SynClientCache"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInput no such input appType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " deviceCode is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/4 v0, 0x0

    return v0

    .line 130
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private d(I)I
    .locals 5

    .line 89
    invoke-static {p1}, Lo/cuz;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 90
    sget-object v0, Lo/crc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v3

    .line 91
    if-gtz v3, :cond_0

    .line 92
    new-instance v4, Lcom/huawei/hihealth/HiAppInfo;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAppInfo;-><init>()V

    .line 93
    invoke-virtual {v4, v2}, Lcom/huawei/hihealth/HiAppInfo;->setPackageName(Ljava/lang/String;)V

    .line 94
    invoke-static {v2}, Lo/cuz;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAppInfo;->setAppName(Ljava/lang/String;)V

    .line 95
    sget-object v0, Lo/crc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Lo/cpu;->b(Lcom/huawei/hihealth/HiAppInfo;I)J

    move-result-wide v0

    long-to-int v3, v0

    .line 97
    :cond_0
    return v3
.end method

.method private e(IIIJ)Lo/crd;
    .locals 2

    .line 114
    new-instance v1, Lo/crd;

    invoke-direct {v1}, Lo/crd;-><init>()V

    .line 115
    invoke-virtual {v1, p1}, Lo/crd;->b(I)V

    .line 116
    invoke-virtual {v1, p4, p5}, Lo/crd;->c(J)V

    .line 117
    invoke-virtual {v1, p3}, Lo/crd;->a(I)V

    .line 118
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/crd;->c(I)V

    .line 119
    invoke-virtual {v1, p2}, Lo/crd;->d(I)V

    .line 120
    sget-object v0, Lo/crc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/cpw;->a(Lo/crd;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/crd;->e(I)V

    .line 121
    return-object v1
.end method

.method private declared-synchronized e(IIJ)Lo/crd;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    monitor-enter p0

    .line 52
    :try_start_0
    invoke-direct {p0, p1, p2, p3, p4}, Lo/crc;->c(IIJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 53
    const-string v0, "Debug_SynClientCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncHiHealthContext checkInput  = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 57
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 58
    iget-object v0, p0, Lo/crc;->c:Lo/cqq;

    invoke-virtual {v0, v6}, Lo/cqq;->a(Ljava/lang/String;)Lo/crd;

    move-result-object v7

    .line 59
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 61
    monitor-exit p0

    return-object v7

    .line 64
    :cond_1
    invoke-direct {p0, p1}, Lo/crc;->d(I)I

    move-result v8

    .line 65
    if-gtz v8, :cond_2

    .line 66
    const-string v0, "Debug_SynClientCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncHiHealthContext appID <= 0 appType =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 70
    :cond_2
    invoke-direct {p0, v8, p3, p4}, Lo/crc;->c(IJ)I

    move-result v9

    .line 71
    if-gtz v9, :cond_3

    .line 72
    const-string v0, "Debug_SynClientCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncHiHealthContext deviceID is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 76
    :cond_3
    move-object v0, p0

    move v1, v8

    move v2, p2

    move v3, v9

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lo/crc;->e(IIIJ)Lo/crd;

    move-result-object v7

    .line 77
    invoke-virtual {v7}, Lo/crd;->a()I

    move-result v10

    .line 78
    if-gtz v10, :cond_4

    .line 79
    const-string v0, "Debug_SynClientCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncHiHealthContext clientID <= 0  key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 83
    :cond_4
    iget-object v0, p0, Lo/crc;->c:Lo/cqq;

    invoke-virtual {v0, v6, v7}, Lo/cqq;->b(Ljava/lang/String;Lo/crd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    monitor-exit p0

    return-object v7

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public d(IIJ)Lo/crd;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 48
    invoke-direct {p0, p1, p2, p3, p4}, Lo/crc;->e(IIJ)Lo/crd;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 3

    .line 134
    const-class v1, Lo/crc;

    monitor-enter v1

    .line 135
    :try_start_0
    iget-object v0, p0, Lo/crc;->c:Lo/cqq;

    invoke-virtual {v0}, Lo/cqq;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 137
    :goto_0
    return-void
.end method
