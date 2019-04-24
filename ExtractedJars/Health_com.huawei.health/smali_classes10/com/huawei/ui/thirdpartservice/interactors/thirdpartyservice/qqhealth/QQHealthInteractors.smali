.class public Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "QQHealthInteractors"

.field private static volatile instance:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors; = null

.field private static qqHealthMgr:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr; = null


# instance fields
.field private mHWCloudMgr:Lo/czg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->instance:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->mHWCloudMgr:Lo/czg;

    .line 28
    invoke-static {}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr;->getInstance()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->qqHealthMgr:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr;

    .line 29
    return-void
.end method

.method public static getInstance()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;
    .locals 3

    .line 32
    sget-object v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->instance:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    if-nez v0, :cond_1

    .line 33
    const-class v1, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    monitor-enter v1

    .line 34
    :try_start_0
    sget-object v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->instance:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    invoke-direct {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;-><init>()V

    sput-object v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->instance:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 39
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->instance:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    return-object v0
.end method


# virtual methods
.method public authorize(Lcom/huawei/hwcloudmodel/model/ThirdUserToken;Lo/cyx;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/ThirdUserToken;Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 61
    const-string v0, "QQHealthInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter authorize():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->mHWCloudMgr:Lo/czg;

    invoke-virtual {v0, p1, p2}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/ThirdUserToken;Lo/cyx;)V

    .line 63
    return-void
.end method

.method public cancelAuthorize(Lo/cyx;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 71
    const-string v0, "QQHealthInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter cancelAuthorize():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->mHWCloudMgr:Lo/czg;

    invoke-virtual {v0, p1}, Lo/czg;->a(Lo/cyx;)V

    .line 73
    return-void
.end method

.method public getAuthorizeToken(Lo/cyx;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 48
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 49
    const-string v0, "QQHealthInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getAuthorizeToken()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->mHWCloudMgr:Lo/czg;

    invoke-virtual {v0, p1}, Lo/czg;->c(Lo/cyx;)V

    .line 52
    :cond_0
    return-void
.end method

.method public sendQQHealthConnectSuccessBroadcast()V
    .locals 4

    .line 79
    const-string v0, "QQHealthInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendQQHealthConnectSuccessBroadcast enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    sget-object v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->qqHealthMgr:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthMgr;->sendQQHealthConnectSuccessBroadcast()V

    .line 81
    return-void
.end method
