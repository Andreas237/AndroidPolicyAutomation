.class public abstract Lo/djg;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private static b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private static final d:Ljava/lang/Object;

.field private static e:Lo/djg;


# instance fields
.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const/4 v0, 0x0

    sput-object v0, Lo/djg;->e:Lo/djg;

    .line 86
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/djg;->d:Ljava/lang/Object;

    .line 136
    new-instance v0, Lo/djg$1;

    invoke-direct {v0}, Lo/djg$1;-><init>()V

    sput-object v0, Lo/djg;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 33
    const/4 v0, -0x1

    iput v0, p0, Lo/djg;->c:I

    .line 37
    return-void
.end method

.method static synthetic a()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 28
    sget-object v0, Lo/djg;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method public static b()Lo/djg;
    .locals 10

    .line 88
    sget-object v4, Lo/djg;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 89
    :try_start_0
    sget-object v0, Lo/djg;->e:Lo/djg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 90
    sget-object v0, Lo/djg;->e:Lo/djg;

    invoke-virtual {v0}, Lo/djg;->onDestroy()V

    .line 91
    const/4 v0, 0x0

    sput-object v0, Lo/djg;->e:Lo/djg;

    .line 93
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    .line 94
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 95
    invoke-static {v5}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v6

    .line 96
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 97
    const-string v0, "HWOTABaseMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceConfigManager is null!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 101
    :cond_1
    :try_start_1
    invoke-virtual {v6}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v7

    .line 102
    invoke-virtual {v6}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v8

    .line 103
    const/4 v0, 0x0

    if-ne v0, v7, :cond_2

    const/4 v0, 0x0

    if-ne v0, v8, :cond_2

    .line 104
    const-string v0, "HWOTABaseMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceConfigManager.getCurrentDeviceInfo() is null!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 107
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 108
    const-string v0, "HWOTABaseMgr"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOTAInstance, getProductType() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 111
    const-string v0, "HWOTABaseMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOTAInstance, getProductType() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    :cond_4
    new-instance v0, Lo/dji;

    invoke-direct {v0, v5}, Lo/dji;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/djg;->e:Lo/djg;

    .line 125
    sget-object v0, Lo/djg;->e:Lo/djg;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/djg;->d(I)V

    .line 126
    sget-object v0, Lo/djg;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a9

    invoke-virtual {v6, v1, v0}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 127
    sget-object v0, Lo/djg;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v1, 0x9

    invoke-virtual {v6, v1, v0}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 129
    :cond_5
    sget-object v0, Lo/djg;->e:Lo/djg;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v4

    return-object v0

    .line 130
    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9
.end method

.method protected static declared-synchronized c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    const-class v0, Lo/djg;

    monitor-enter v0

    .line 61
    :try_start_0
    sput-object p0, Lo/djg;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method protected static declared-synchronized e()V
    .locals 3

    const-class v1, Lo/djg;

    monitor-enter v1

    .line 70
    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lo/djg;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Lo/djx;)V
.end method

.method public c()I
    .locals 1

    .line 44
    iget v0, p0, Lo/djg;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public abstract c(Ljava/lang/String;ILjava/lang/String;Lo/djw;)V
.end method

.method protected d(I)V
    .locals 1

    .line 51
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/djg;->c:I

    .line 52
    return-void
.end method

.method public abstract e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 78
    const/16 v0, 0x9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
