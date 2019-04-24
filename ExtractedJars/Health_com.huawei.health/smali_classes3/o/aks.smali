.class public Lo/aks;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/Context;

.field private static b:[B

.field private static e:Lo/aks;


# instance fields
.field private c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

.field private d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

.field private f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private k:[B

.field private m:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const/4 v0, 0x0

    sput-object v0, Lo/aks;->e:Lo/aks;

    .line 39
    const/4 v0, 0x1

    new-array v0, v0, [B

    sput-object v0, Lo/aks;->b:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lo/aks;->k:[B

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/aks;->i:Ljava/util/List;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/aks;->g:Ljava/util/List;

    .line 44
    new-instance v0, Lo/aks$5;

    invoke-direct {v0, p0}, Lo/aks$5;-><init>(Lo/aks;)V

    iput-object v0, p0, Lo/aks;->f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aks;->h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 55
    new-instance v0, Lo/aks$4;

    invoke-direct {v0, p0}, Lo/aks$4;-><init>(Lo/aks;)V

    iput-object v0, p0, Lo/aks;->m:Landroid/content/ServiceConnection;

    .line 136
    new-instance v3, Landroid/content/Intent;

    const-string v0, "local.proxy"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 137
    const-string v0, "com.huawei.health"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 138
    sget-object v0, Lo/aks;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/aks;->m:Landroid/content/ServiceConnection;

    sget-object v2, Lo/aks;->a:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 144
    return-void
.end method

.method static synthetic a(Lo/aks;)Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    return-object v0
.end method

.method static synthetic a(Lo/aks;Ljava/util/List;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lo/aks;->c(Ljava/util/List;)V

    return-void
.end method

.method static synthetic b(Lo/aks;Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;)Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;
    .locals 0

    .line 29
    iput-object p1, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    return-object p1
.end method

.method static synthetic b(Lo/aks;Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;
    .locals 0

    .line 29
    iput-object p1, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    return-object p1
.end method

.method static synthetic b(Lo/aks;)Ljava/util/List;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/aks;->i:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lo/aks;)Ljava/util/List;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/aks;->g:Ljava/util/List;

    return-object v0
.end method

.method private c(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;)V"
        }
    .end annotation

    .line 792
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 793
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 794
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 795
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 796
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notify notifyAllListener~~~~"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 797
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "success"

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 795
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 802
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/aks;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/aks;->f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method public static e()Lo/aks;
    .locals 3

    .line 127
    sget-object v1, Lo/aks;->b:[B

    monitor-enter v1

    .line 128
    :try_start_0
    sget-object v0, Lo/aks;->e:Lo/aks;

    if-nez v0, :cond_0

    .line 129
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/aks;->a:Landroid/content/Context;

    .line 130
    new-instance v0, Lo/aks;

    invoke-direct {v0}, Lo/aks;-><init>()V

    sput-object v0, Lo/aks;->e:Lo/aks;

    .line 132
    :cond_0
    sget-object v0, Lo/aks;->e:Lo/aks;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 133
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 301
    const/4 v2, 0x0

    .line 302
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-virtual {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->c()Ljava/util/List;

    move-result-object v2

    .line 305
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 306
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 307
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 308
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 309
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->conver2CommonDevice()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 310
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 307
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 313
    :cond_2
    return-object v3

    .line 315
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 83
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerServiceConnectedListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 85
    const-string v0, "success"

    const v1, 0x186a0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 87
    :cond_0
    iget-object v0, p0, Lo/aks;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 88
    iget-object v0, p0, Lo/aks;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 471
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unbindAllDevice "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 473
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 475
    const-string v0, "typeList"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 478
    goto :goto_0

    .line 476
    :catch_0
    move-exception v5

    .line 477
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackService JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    :goto_0
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "unbindDevicesByTypes"

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 480
    goto :goto_1

    .line 481
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackService is null!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    :goto_1
    return-void
.end method

.method public a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 623
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 624
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "setRunPlan"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 626
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 628
    :goto_0
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 279
    const/4 v2, 0x0

    .line 280
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    if-eqz v0, :cond_0

    .line 281
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-virtual {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->e()Ljava/util/List;

    move-result-object v2

    .line 284
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 285
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 286
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 287
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 288
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->conver2CommonDevice()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 289
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 286
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 292
    :cond_2
    return-object v3

    .line 294
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 151
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "getOperator"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 154
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 450
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 451
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendHealthDataTohealth jsonString:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 454
    const-string v0, "jsonString"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 457
    goto :goto_0

    .line 455
    :catch_0
    move-exception v5

    .line 456
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackService JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    :goto_0
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "sendHealthDataTohealth"

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 459
    goto :goto_1

    .line 460
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackService is null!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    :goto_1
    return-void
.end method

.method public b(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 194
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRunPostureReportStatus enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "setRunPostureReportStatus"

    .line 197
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    .line 196
    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 198
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "notificationRunPostureInfo"

    invoke-virtual {v0, v1, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 200
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRunPostureReportStatus callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    :goto_0
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 325
    const/4 v4, 0x0

    .line 326
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    if-eqz v0, :cond_0

    .line 327
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-virtual {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->i()Ljava/util/List;

    move-result-object v4

    .line 330
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 331
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 332
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 333
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 334
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->conver2CommonDevice()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v7

    .line 335
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 332
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 338
    :cond_2
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWearDeviceList is size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    return-object v5

    .line 341
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 93
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterServiceConnectedListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lo/aks;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lo/aks;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 97
    :cond_0
    return-void
.end method

.method public c(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 162
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 163
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOperator callbackservice is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "setOperator"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 166
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOperator callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    :goto_0
    return-void
.end method

.method public d(Z)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 9

    .line 379
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo isWear:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    iget-object v4, p0, Lo/aks;->k:[B

    monitor-enter v4

    .line 381
    :try_start_0
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 382
    const/4 v5, 0x0

    .line 383
    if-eqz p1, :cond_0

    .line 384
    invoke-virtual {p0}, Lo/aks;->a()Ljava/util/List;

    move-result-object v5

    goto :goto_0

    .line 386
    :cond_0
    invoke-virtual {p0}, Lo/aks;->b()Ljava/util/List;

    move-result-object v5

    .line 389
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 390
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() deviceInfoList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 392
    if-eqz v7, :cond_1

    .line 393
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 394
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 395
    monitor-exit v4

    return-object v7

    .line 398
    :cond_1
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    :cond_2
    goto :goto_1

    .line 401
    :cond_3
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfo\'s ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 402
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 404
    :cond_4
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 405
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 408
    :cond_5
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 409
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public d()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 254
    const/4 v2, 0x0

    .line 255
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-virtual {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->b()Ljava/util/List;

    move-result-object v2

    .line 259
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 260
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 261
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 262
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 263
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->conver2CommonDevice()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 264
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 261
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 267
    :cond_2
    return-object v3

    .line 269
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 221
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "notificationStateConnectionStateChanged"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 225
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackService is null!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    .line 837
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter removeFunctionCallback()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 838
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    if-eqz v0, :cond_0

    .line 839
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-virtual {v0, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 841
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "localBinder is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    :goto_0
    return-void
.end method

.method public d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 177
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "setHeartRateReportStatus"

    .line 179
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    .line 178
    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 180
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "notificationHeartRateInfo"

    invoke-virtual {v0, v1, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 183
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    :goto_0
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 100
    iget-object v0, p0, Lo/aks;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    iget-object v0, p0, Lo/aks;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 506
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getMessageCenterFromWear "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 508
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 510
    const-string v0, "commandType"

    const/4 v1, 0x3

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 511
    const-string v0, "leomac"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 514
    goto :goto_0

    .line 512
    :catch_0
    move-exception v5

    .line 513
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackService JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    :goto_0
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "getWearData"

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 516
    goto :goto_1

    .line 517
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackService is null!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    :goto_1
    return-void
.end method

.method public e(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 635
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 636
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "setRunPlanReminderSwitch"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 638
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 640
    :goto_0
    return-void
.end method

.method public f()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 9

    .line 348
    iget-object v4, p0, Lo/aks;->k:[B

    monitor-enter v4

    .line 349
    :try_start_0
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 350
    invoke-virtual {p0}, Lo/aks;->d()Ljava/util/List;

    move-result-object v5

    .line 351
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 352
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() deviceInfoList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 354
    if-eqz v7, :cond_0

    .line 355
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 356
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 357
    monitor-exit v4

    return-object v7

    .line 360
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    :cond_1
    goto :goto_0

    .line 363
    :cond_2
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfo\'s ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 364
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 366
    :cond_3
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 367
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 370
    :cond_4
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 371
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public f(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 243
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "notificationSportReminder"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 246
    :cond_0
    return-void
.end method

.method public f(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 760
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 761
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "notificationWorkoutRecordSpeechPlayReportStatus"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 763
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 765
    :goto_0
    return-void
.end method

.method public g()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation

    .line 552
    const/4 v1, 0x0

    .line 553
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    if-eqz v0, :cond_0

    .line 554
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-virtual {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->g()Ljava/util/List;

    move-result-object v1

    .line 556
    :cond_0
    return-object v1
.end method

.method public g(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 524
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getDeviceListFromWear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 526
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "getDeviceList"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 528
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackService is null!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    :goto_0
    return-void
.end method

.method public g(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 677
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 678
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "workoutOperateRealtimeData"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 680
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 682
    :goto_0
    return-void
.end method

.method public h()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 2

    .line 544
    const/4 v1, 0x0

    .line 545
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    if-eqz v0, :cond_0

    .line 546
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-virtual {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->k()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v1

    .line 548
    :cond_0
    return-object v1
.end method

.method public h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 611
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 612
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "getRunPlanParameter"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 614
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    :goto_0
    return-void
.end method

.method public h(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 776
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 777
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "setNotificationStatusResponse"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 779
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 781
    :goto_0
    return-void
.end method

.method public i()Lorg/json/JSONObject;
    .locals 1

    .line 537
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    if-eqz v0, :cond_0

    .line 538
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-virtual {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 540
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public i(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 488
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getMessageCenterFromWear "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 490
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 492
    const-string v0, "commandType"

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 495
    goto :goto_0

    .line 493
    :catch_0
    move-exception v5

    .line 494
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackService JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    :goto_0
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "getWearData"

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 497
    goto :goto_1

    .line 498
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackService is null!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    :goto_1
    return-void
.end method

.method public i(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 768
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 769
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "setHeartRateResponse"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 771
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 773
    :goto_0
    return-void
.end method

.method public k(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 231
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 232
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "notificationStatus"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 234
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    :goto_0
    return-void
.end method

.method public k(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 784
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 785
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "setMetricUnit"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 787
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 789
    :goto_0
    return-void
.end method

.method public k()Z
    .locals 6

    .line 561
    const/4 v4, 0x0

    .line 562
    const/4 v5, 0x0

    .line 563
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    if-eqz v0, :cond_0

    .line 564
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-virtual {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->k()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 566
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 567
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo()Z

    move-result v4

    goto :goto_0

    .line 569
    :cond_1
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWearDeviceSupportHeart deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    :goto_0
    return v4
.end method

.method public l(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 736
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 737
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerNotificationPress ---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 738
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "registerNotificationPressCallBack"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 740
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    :goto_0
    return-void
.end method

.method public l()Z
    .locals 7

    .line 576
    const/4 v4, 0x0

    .line 577
    const/4 v5, 0x0

    .line 578
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    if-eqz v0, :cond_0

    .line 579
    iget-object v0, p0, Lo/aks;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-virtual {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->g()Ljava/util/List;

    move-result-object v5

    .line 581
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 582
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 583
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo()Z

    move-result v4

    .line 584
    if-eqz v4, :cond_1

    .line 585
    return v4

    .line 582
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    goto :goto_1

    .line 589
    :cond_3
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHealthDeviceSupportHeart deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    :goto_1
    return v4
.end method

.method public m(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 723
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 724
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "notificationWorkoutRecordSpeechPlay"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 726
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 728
    :goto_0
    return-void
.end method

.method public m(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 820
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setStressMeasureStatus()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 821
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 822
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "setStressReportStatus"

    .line 823
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    .line 822
    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 824
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "notificationStressInfo"

    invoke-virtual {v0, v1, p2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 827
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 829
    :goto_0
    return-void
.end method

.method public n(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 685
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 686
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "syncFitnessDetailData"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 688
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 689
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 691
    :cond_1
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 693
    :goto_0
    return-void
.end method

.method public o(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 715
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 716
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "notificationGetWorkoutRecordStatistic"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 718
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 720
    :goto_0
    return-void
.end method

.method public p(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 707
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    if-eqz v0, :cond_0

    .line 708
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "registerNotificationRunPlanRecordInfoCallbackList"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 710
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 712
    :goto_0
    return-void
.end method

.method public s(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 750
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 751
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterNotificationPress ---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 752
    iget-object v0, p0, Lo/aks;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const-string v1, "registerNotificationPressCallBack"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 754
    :cond_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackservice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 756
    :goto_0
    return-void
.end method

.method public u(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 805
    iput-object p1, p0, Lo/aks;->h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 806
    return-void
.end method
