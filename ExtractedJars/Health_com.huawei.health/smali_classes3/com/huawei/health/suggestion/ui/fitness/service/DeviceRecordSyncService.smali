.class public Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;,
        Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;,
        Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Landroid/content/Context;

.field private d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;

.field private final e:Landroid/os/IBinder;

.field private f:I

.field private h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private i:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 47
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;-><init>(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e:Landroid/os/IBinder;

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->a:Z

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->b:Z

    .line 186
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-void
.end method

.method private a()V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e:Landroid/os/IBinder;

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;->a()Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;

    move-result-object v1

    .line 142
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 143
    invoke-interface {v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;->e()V

    .line 145
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->stopSelf()V

    .line 146
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 182
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setLastSyncTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    const-string v0, "deviceLastSyncTime"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->d()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->a(I)V

    return-void
.end method

.method private c()I
    .locals 4

    .line 177
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastSyncTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "deviceLastSyncTime"

    invoke-static {v2}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    const-string v0, "deviceLastSyncTime"

    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)I
    .locals 1

    .line 36
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->f:I

    return v0
.end method

.method private c(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dgn;>;)Ljava/util/List<Lcom/huawei/health/suggestion/model/RecordAction;>;"
        }
    .end annotation

    .line 277
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 278
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dgn;

    .line 279
    new-instance v7, Lcom/huawei/health/suggestion/model/RecordAction;

    invoke-virtual {v6}, Lo/dgn;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lo/dgn;->b()I

    move-result v1

    invoke-virtual {v6}, Lo/dgn;->d()F

    move-result v2

    invoke-virtual {v6}, Lo/dgn;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v7, v0, v1, v2, v3}, Lcom/huawei/health/suggestion/model/RecordAction;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    .line 280
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 281
    goto :goto_0

    .line 282
    :cond_0
    return-object v4
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;Z)Z
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->a:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 149
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    invoke-virtual {v0}, Lo/dge;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 150
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is not connected!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    const-string v0, "device is not connected"

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->d(ILjava/lang/String;)V

    .line 152
    return-void

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    invoke-virtual {v0}, Lo/dge;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 155
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is not support!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    const-string v0, "device is not support"

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->d(ILjava/lang/String;)V

    .line 157
    return-void

    .line 159
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->c()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->f:I

    .line 160
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->i:I

    .line 162
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter queryDeviceRecords"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 171
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 174
    return-void
.end method

.method private d(ILjava/lang/String;)V
    .locals 5

    .line 132
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e:Landroid/os/IBinder;

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;->a()Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;

    move-result-object v4

    .line 133
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStatListener:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 135
    invoke-interface {v4, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;->b(ILjava/lang/String;)V

    .line 137
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->stopSelf()V

    .line 138
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Landroid/content/Context;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 36
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;ILjava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->d(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;Z)Z
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->b:Z

    return p1
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->a:Z

    return v0
.end method

.method static synthetic h(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->b:Z

    return v0
.end method

.method static synthetic i(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)I
    .locals 1

    .line 36
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->i:I

    return v0
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->a()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    .line 295
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBind "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e:Landroid/os/IBinder;

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 118
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 119
    iput-object p0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->c:Landroid/content/Context;

    .line 120
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;-><init>(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;

    .line 121
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u542f\u52a8\u540c\u6b65\u670d\u52a1-----------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 288
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 289
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    invoke-virtual {v0}, Lo/dge;->c()V

    .line 290
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destory\u540c\u6b65\u670d\u52a1-----------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 126
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;->sendEmptyMessage(I)Z

    .line 127
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
