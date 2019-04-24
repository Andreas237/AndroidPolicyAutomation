.class public Lcom/huawei/hms/api/HuaweiApiClientImpl;
.super Lcom/huawei/hms/api/HuaweiApiClient;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;
.implements Lcom/huawei/hms/support/api/client/InnerApiClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/api/HuaweiApiClientImpl$c;,
        Lcom/huawei/hms/api/HuaweiApiClientImpl$a;,
        Lcom/huawei/hms/api/HuaweiApiClientImpl$b;
    }
.end annotation


# static fields
.field private static final t:Ljava/lang/Object;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private volatile e:Lcom/huawei/hms/core/aidl/e;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;"
        }
    .end annotation
.end field

.field private i:Z

.field private j:Ljava/util/concurrent/atomic/AtomicInteger;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/Scope;>;"
        }
    .end annotation
.end field

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;>;"
        }
    .end annotation
.end field

.field private m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lcom/huawei/hms/api/Api<*>;Lcom/huawei/hms/api/Api$ApiOptions;>;"
        }
    .end annotation
.end field

.field private n:Lcom/huawei/hms/support/api/client/SubAppInfo;

.field private o:J

.field private p:I

.field private q:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

.field private r:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

.field private s:Landroid/os/Handler;

.field private u:Lcom/huawei/hms/api/CheckUpdatelistener;

.field private v:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 162
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->t:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 171
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClient;-><init>()V

    .line 126
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->i:Z

    .line 137
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 147
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->o:J

    .line 148
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->p:I

    .line 161
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->s:Landroid/os/Handler;

    .line 165
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->u:Lcom/huawei/hms/api/CheckUpdatelistener;

    .line 675
    new-instance v0, Lcom/huawei/hms/api/f;

    invoke-direct {v0, p0}, Lcom/huawei/hms/api/f;-><init>(Lcom/huawei/hms/api/HuaweiApiClientImpl;)V

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->v:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    .line 172
    iput-object p1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    .line 173
    invoke-static {p1}, Lcom/huawei/hms/c/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->d:Ljava/lang/String;

    .line 174
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->b:Ljava/lang/String;

    .line 175
    invoke-static {p1}, Lcom/huawei/hms/c/j;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->c:Ljava/lang/String;

    .line 176
    return-void
.end method

.method private a()I
    .locals 3

    .line 354
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hms/c/j;->b(Landroid/content/Context;)I

    move-result v1

    .line 356
    if-eqz v1, :cond_0

    const v0, 0x138d9d8

    if-ge v1, v0, :cond_4

    .line 361
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->b()I

    move-result v2

    .line 364
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 366
    const v0, 0x138d9d8

    if-ge v2, v0, :cond_1

    .line 367
    const v2, 0x138d9d8

    .line 369
    :cond_1
    return v2

    .line 372
    :cond_2
    const v0, 0x13a54c0

    if-ge v2, v0, :cond_3

    .line 373
    const v2, 0x13a54c0

    .line 375
    :cond_3
    return v2

    .line 379
    :cond_4
    return v1
.end method

.method static synthetic a(Lcom/huawei/hms/api/HuaweiApiClientImpl;Lcom/huawei/hms/api/CheckUpdatelistener;)Lcom/huawei/hms/api/CheckUpdatelistener;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->u:Lcom/huawei/hms/api/CheckUpdatelistener;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method private a(I)V
    .locals 1

    .line 462
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 463
    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/api/HuaweiApiClientImpl;I)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/api/HuaweiApiClientImpl;Lcom/huawei/hms/support/api/ResolveResult;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(Lcom/huawei/hms/support/api/ResolveResult;)V

    return-void
.end method

.method private a(Lcom/huawei/hms/support/api/ResolveResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/ResolveResult<Lcom/huawei/hms/support/api/entity/core/DisconnectResp;>;)V"
        }
    .end annotation

    .line 916
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter onDisconnectionResult, disconnect from server result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 917
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/ResolveResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 916
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 919
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->l()V

    .line 920
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 921
    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/api/HuaweiApiClientImpl;Z)Z
    .locals 0

    .line 72
    iput-boolean p1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->i:Z

    return p1
.end method

.method private b()I
    .locals 10

    .line 419
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getApiMap()Ljava/util/Map;

    move-result-object v1

    .line 420
    if-nez v1, :cond_0

    .line 421
    const/4 v0, 0x0

    return v0

    .line 423
    :cond_0
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    .line 425
    const/4 v3, 0x0

    .line 426
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hms/api/Api;

    .line 427
    invoke-virtual {v5}, Lcom/huawei/hms/api/Api;->getApiName()Ljava/lang/String;

    move-result-object v6

    .line 428
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 429
    invoke-static {}, Lcom/huawei/hms/api/HuaweiApiAvailability;->getApiMap()Ljava/util/Map;

    move-result-object v7

    .line 430
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 431
    if-eqz v8, :cond_1

    .line 432
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 433
    if-le v9, v3, :cond_1

    .line 434
    move v3, v9

    .line 438
    :cond_1
    goto :goto_0

    .line 440
    :cond_2
    return v3
.end method

.method static synthetic b(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->r:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/hms/api/HuaweiApiClientImpl;Lcom/huawei/hms/support/api/ResolveResult;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->b(Lcom/huawei/hms/support/api/ResolveResult;)V

    return-void
.end method

.method private b(Lcom/huawei/hms/support/api/ResolveResult;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/ResolveResult<Lcom/huawei/hms/support/api/entity/core/ConnectResp;>;)V"
        }
    .end annotation

    .line 1008
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/ResolveResult;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hms/support/api/entity/core/ConnectResp;

    .line 1009
    if-eqz v3, :cond_0

    .line 1010
    iget-object v0, v3, Lcom/huawei/hms/support/api/entity/core/ConnectResp;->sessionId:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->f:Ljava/lang/String;

    .line 1014
    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->n:Lcom/huawei/hms/support/api/client/SubAppInfo;

    if-nez v0, :cond_1

    const/4 v4, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->n:Lcom/huawei/hms/support/api/client/SubAppInfo;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/client/SubAppInfo;->getSubAppID()Ljava/lang/String;

    move-result-object v4

    .line 1015
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1016
    iput-object v4, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->b:Ljava/lang/String;

    .line 1019
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/ResolveResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v5

    .line 1020
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter onConnectionResult, connect to server result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1022
    sget-object v0, Lcom/huawei/hms/support/api/client/Status;->SUCCESS:Lcom/huawei/hms/support/api/client/Status;

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/ResolveResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/api/client/Status;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1023
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/ResolveResult;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1024
    invoke-static {}, Lcom/huawei/hms/api/ProtocolNegotiate;->getInstance()Lcom/huawei/hms/api/ProtocolNegotiate;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/ResolveResult;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hms/support/api/entity/core/ConnectResp;

    iget-object v1, v1, Lcom/huawei/hms/support/api/entity/core/ConnectResp;->protocolVersion:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/ProtocolNegotiate;->negotiate(Ljava/util/List;)I

    .line 1027
    :cond_3
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 1029
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->q:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    if-eqz v0, :cond_4

    .line 1030
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->q:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    invoke-interface {v0}, Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;->onConnected()V

    .line 1034
    :cond_4
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->m()V

    goto :goto_1

    .line 1036
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/ResolveResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 1037
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/ResolveResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v0

    const/16 v1, 0x3e9

    if-ne v0, v1, :cond_7

    .line 1038
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->l()V

    .line 1039
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 1041
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->q:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    if-eqz v0, :cond_6

    .line 1042
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->q:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;->onConnectionSuspended(I)V

    .line 1044
    :cond_6
    return-void

    .line 1046
    :cond_7
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->l()V

    .line 1048
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 1050
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->r:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    if-eqz v0, :cond_8

    .line 1051
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->r:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    new-instance v1, Lcom/huawei/hms/api/ConnectionResult;

    invoke-direct {v1, v5}, Lcom/huawei/hms/api/ConnectionResult;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;->onConnectionFailed(Lcom/huawei/hms/api/ConnectionResult;)V

    .line 1054
    :cond_8
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Lcom/huawei/hms/api/CheckUpdatelistener;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->u:Lcom/huawei/hms/api/CheckUpdatelistener;

    return-object v0
.end method

.method private c()Z
    .locals 4

    .line 445
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->m:Ljava/util/Map;

    if-eqz v0, :cond_1

    .line 446
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 447
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 448
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hms/api/Api;

    .line 449
    const-string v0, "HuaweiGame.API"

    invoke-virtual {v3}, Lcom/huawei/hms/api/Api;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 450
    const/4 v0, 0x1

    return v0

    .line 452
    :cond_0
    goto :goto_0

    .line 454
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Ljava/lang/ref/WeakReference;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->g:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method private d()Z
    .locals 3

    .line 469
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.hms.core.aidlservice"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 470
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 472
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, p0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    return v0
.end method

.method private e()V
    .locals 6

    .line 479
    sget-object v4, Lcom/huawei/hms/api/HuaweiApiClientImpl;->t:Ljava/lang/Object;

    monitor-enter v4

    .line 480
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->s:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 481
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->s:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_0

    .line 483
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/huawei/hms/api/e;

    invoke-direct {v2, p0}, Lcom/huawei/hms/api/e;-><init>(Lcom/huawei/hms/api/HuaweiApiClientImpl;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->s:Landroid/os/Handler;

    .line 505
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->s:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 506
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 507
    :goto_1
    return-void
.end method

.method private f()V
    .locals 4

    .line 510
    sget-object v2, Lcom/huawei/hms/api/HuaweiApiClientImpl;->t:Ljava/lang/Object;

    monitor-enter v2

    .line 511
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->s:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 512
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->s:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 513
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->s:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 515
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 516
    :goto_0
    return-void
.end method

.method private g()V
    .locals 12

    .line 805
    invoke-static {}, Lcom/huawei/hms/support/b/a;->a()Lcom/huawei/hms/support/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/b/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 807
    return-void

    .line 810
    :cond_0
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 812
    const-string v0, "package"

    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 814
    const-string v0, "sdk_ver"

    const v1, 0x13a59d4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    const/4 v8, 0x0

    .line 819
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getSubAppInfo()Lcom/huawei/hms/support/api/client/SubAppInfo;

    move-result-object v9

    .line 820
    if-eqz v9, :cond_1

    .line 821
    invoke-virtual {v9}, Lcom/huawei/hms/support/api/client/SubAppInfo;->getSubAppID()Ljava/lang/String;

    move-result-object v8

    .line 824
    :cond_1
    if-nez v8, :cond_2

    .line 825
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getAppID()Ljava/lang/String;

    move-result-object v8

    .line 827
    :cond_2
    const-string v0, "app_id"

    invoke-interface {v7, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 830
    const-string v10, "core.checkUpdate"

    .line 831
    const-string v0, "\\."

    invoke-virtual {v10, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 832
    array-length v0, v11

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 833
    const-string v0, "service"

    const/4 v1, 0x0

    aget-object v1, v11, v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 834
    const-string v0, "api_name"

    const/4 v1, 0x1

    aget-object v1, v11, v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    :cond_3
    const-string v0, "result"

    const-string v1, "0"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 840
    const-string v0, "cost_time"

    const-string v1, "0"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 842
    invoke-static {}, Lcom/huawei/hms/support/b/a;->a()Lcom/huawei/hms/support/b/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "HMS_SDK_API_CALL"

    invoke-virtual {v0, v1, v2, v7}, Lcom/huawei/hms/support/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 845
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "hms/config.txt"

    invoke-static {v1, v2}, Lcom/huawei/hms/update/provider/UpdateProvider;->getLocalFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 846
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "hms/HwMobileServiceReport.txt"

    invoke-static {v2, v3}, Lcom/huawei/hms/update/provider/UpdateProvider;->getLocalFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    move-object v3, v10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 845
    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/huawei/hms/c/b;->a(Landroid/content/Context;Ljava/io/File;Ljava/io/File;Ljava/lang/String;JI)V

    .line 847
    return-void
.end method

.method private h()V
    .locals 4

    .line 870
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->i()Lcom/huawei/hms/support/api/entity/core/DisconnectInfo;

    move-result-object v3

    .line 873
    invoke-static {p0, v3}, Lcom/huawei/hms/support/api/a/a;->a(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/entity/core/DisconnectInfo;)Lcom/huawei/hms/support/api/ResolvePendingResult;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/api/HuaweiApiClientImpl$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/hms/api/HuaweiApiClientImpl$b;-><init>(Lcom/huawei/hms/api/HuaweiApiClientImpl;Lcom/huawei/hms/api/e;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/api/ResolvePendingResult;->setResultCallback(Lcom/huawei/hms/support/api/client/ResultCallback;)V

    .line 874
    return-void
.end method

.method private i()Lcom/huawei/hms/support/api/entity/core/DisconnectInfo;
    .locals 5

    .line 898
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 900
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->m:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 901
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 902
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 903
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hms/api/Api;

    .line 904
    invoke-virtual {v4}, Lcom/huawei/hms/api/Api;->getApiName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 905
    goto :goto_0

    .line 907
    :cond_0
    new-instance v0, Lcom/huawei/hms/support/api/entity/core/DisconnectInfo;

    iget-object v1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->k:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/support/api/entity/core/DisconnectInfo;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method private j()V
    .locals 4

    .line 961
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "Enter sendConnectApiServceRequest."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 962
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->k()Lcom/huawei/hms/support/api/entity/core/ConnectInfo;

    move-result-object v3

    .line 965
    invoke-static {p0, v3}, Lcom/huawei/hms/support/api/a/a;->a(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/entity/core/ConnectInfo;)Lcom/huawei/hms/support/api/client/PendingResult;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/api/HuaweiApiClientImpl$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/hms/api/HuaweiApiClientImpl$a;-><init>(Lcom/huawei/hms/api/HuaweiApiClientImpl;Lcom/huawei/hms/api/e;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/api/client/PendingResult;->setResultCallback(Lcom/huawei/hms/support/api/client/ResultCallback;)V

    .line 966
    return-void
.end method

.method private k()Lcom/huawei/hms/support/api/entity/core/ConnectInfo;
    .locals 6

    .line 992
    new-instance v0, Lcom/huawei/hms/c/g;

    iget-object v1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/hms/c/g;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hms/c/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 993
    if-nez v3, :cond_0

    const-string v4, ""

    goto :goto_0

    :cond_0
    move-object v4, v3

    .line 995
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->n:Lcom/huawei/hms/support/api/client/SubAppInfo;

    if-nez v0, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->n:Lcom/huawei/hms/support/api/client/SubAppInfo;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/client/SubAppInfo;->getSubAppID()Ljava/lang/String;

    move-result-object v5

    .line 997
    :goto_1
    new-instance v0, Lcom/huawei/hms/support/api/entity/core/ConnectInfo;

    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getApiNameList()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->k:Ljava/util/List;

    invoke-direct {v0, v1, v2, v4, v5}, Lcom/huawei/hms/support/api/entity/core/ConnectInfo;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private l()V
    .locals 1

    .line 1060
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    invoke-static {v0, p0}, Lcom/huawei/hms/c/j;->a(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 1061
    return-void
.end method

.method private m()V
    .locals 3

    .line 1067
    iget-boolean v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->i:Z

    if-eqz v0, :cond_0

    .line 1069
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "Connect notice has been shown."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1070
    return-void

    .line 1073
    :cond_0
    invoke-static {}, Lcom/huawei/hms/api/HuaweiApiAvailability;->getInstance()Lcom/huawei/hms/api/HuaweiApiAvailability;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/HuaweiApiAvailability;->isHuaweiMobileNoticeAvailable(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_1

    .line 1075
    const-string v0, "2.6.1.300"

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/huawei/hms/support/api/a/a;->a(Lcom/huawei/hms/support/api/client/ApiClient;ILjava/lang/String;)Lcom/huawei/hms/support/api/client/PendingResult;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/api/HuaweiApiClientImpl$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/hms/api/HuaweiApiClientImpl$c;-><init>(Lcom/huawei/hms/api/HuaweiApiClientImpl;Lcom/huawei/hms/api/e;)V

    .line 1076
    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/api/client/PendingResult;->setResultCallback(Lcom/huawei/hms/support/api/client/ResultCallback;)V

    .line 1078
    :cond_1
    return-void
.end method


# virtual methods
.method public asyncRequest(Landroid/os/Bundle;Ljava/lang/String;ILcom/huawei/hms/support/api/client/ResultCallback;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Bundle;Ljava/lang/String;ILcom/huawei/hms/support/api/client/ResultCallback<Lcom/huawei/hms/support/api/client/BundleResult;>;)I"
        }
    .end annotation

    .line 1136
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "Enter asyncRequest."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1138
    if-eqz p4, :cond_0

    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 1139
    :cond_0
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "arguments is invalid."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1140
    const v0, 0x3611c818

    return v0

    .line 1144
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->innerIsConnected()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1145
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "client is unConnect."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1146
    const v0, 0x3611c81b

    return v0

    .line 1150
    :cond_2
    new-instance v4, Lcom/huawei/hms/core/aidl/b;

    invoke-direct {v4, p2, p3}, Lcom/huawei/hms/core/aidl/b;-><init>(Ljava/lang/String;I)V

    .line 1151
    invoke-virtual {v4}, Lcom/huawei/hms/core/aidl/b;->c()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/hms/core/aidl/a;->a(I)Lcom/huawei/hms/core/aidl/f;

    move-result-object v5

    .line 1154
    invoke-virtual {v4, p1}, Lcom/huawei/hms/core/aidl/b;->a(Landroid/os/Bundle;)Lcom/huawei/hms/core/aidl/b;

    .line 1157
    new-instance v6, Lcom/huawei/hms/core/aidl/RequestHeader;

    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getAppID()Ljava/lang/String;

    move-result-object v0

    .line 1158
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 1160
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getSessionId()Ljava/lang/String;

    move-result-object v2

    const v3, 0x13a59d4

    invoke-direct {v6, v0, v1, v3, v2}, Lcom/huawei/hms/core/aidl/RequestHeader;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 1161
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getApiNameList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hms/core/aidl/RequestHeader;->setApiNameList(Ljava/util/List;)V

    .line 1163
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v5, v6, v0}, Lcom/huawei/hms/core/aidl/f;->a(Lcom/huawei/hms/core/aidl/IMessageEntity;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/core/aidl/b;->b:Landroid/os/Bundle;

    .line 1166
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getService()Lcom/huawei/hms/core/aidl/e;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/api/g;

    invoke-direct {v1, p0, p4}, Lcom/huawei/hms/api/g;-><init>(Lcom/huawei/hms/api/HuaweiApiClientImpl;Lcom/huawei/hms/support/api/client/ResultCallback;)V

    invoke-interface {v0, v4, v1}, Lcom/huawei/hms/core/aidl/e;->a(Lcom/huawei/hms/core/aidl/b;Lcom/huawei/hms/core/aidl/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1182
    const/4 v0, 0x0

    return v0

    .line 1183
    :catch_0
    move-exception v7

    .line 1184
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "remote exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1185
    const v0, 0x3611c819

    return v0
.end method

.method public checkUpdate(Landroid/app/Activity;Lcom/huawei/hms/api/CheckUpdatelistener;)V
    .locals 4

    .line 747
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "Enter checkUpdate"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 749
    if-nez p2, :cond_0

    .line 750
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "listener is null!"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 751
    return-void

    .line 754
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 755
    :cond_1
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkUpdate, activity is illegal: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 756
    const/4 v0, -0x1

    invoke-interface {p2, v0}, Lcom/huawei/hms/api/CheckUpdatelistener;->onResult(I)V

    .line 757
    return-void

    .line 760
    :cond_2
    iput-object p2, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->u:Lcom/huawei/hms/api/CheckUpdatelistener;

    .line 761
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->v:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v0, v1, v2, v3}, Lcom/huawei/updatesdk/UpdateSdkAPI;->checkClientOTAUpdate(Landroid/content/Context;Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;ZIZ)V

    .line 763
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->g()V

    .line 764
    return-void
.end method

.method public connect(Landroid/app/Activity;)V
    .locals 7

    .line 289
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "====== HMSSDK version: 20601300 ======"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    .line 293
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter connect, Connection Status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    const/4 v0, 0x3

    if-eq v3, v0, :cond_0

    const/4 v0, 0x5

    if-eq v3, v0, :cond_0

    const/4 v0, 0x2

    if-eq v3, v0, :cond_0

    const/4 v0, 0x4

    if-ne v3, v0, :cond_1

    .line 297
    :cond_0
    return-void

    .line 300
    :cond_1
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "connect activity:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->g:Ljava/lang/ref/WeakReference;

    .line 303
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->h:Ljava/lang/ref/WeakReference;

    .line 309
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hms/c/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->d:Ljava/lang/String;

    :goto_0
    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->b:Ljava/lang/String;

    .line 313
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a()I

    move-result v4

    .line 315
    invoke-static {v4}, Lcom/huawei/hms/api/HuaweiApiAvailability;->setServicesVersionCode(I)V

    .line 316
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    invoke-static {v0, v4}, Lcom/huawei/hms/api/HuaweiMobileServicesUtil;->isHuaweiMobileServicesAvailable(Landroid/content/Context;I)I

    move-result v5

    .line 317
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "In connect, isHuaweiMobileServicesAvailable result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    new-instance v6, Lcom/huawei/hms/c/g;

    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    invoke-direct {v6, v0}, Lcom/huawei/hms/c/g;-><init>(Landroid/content/Context;)V

    .line 320
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v6, v0}, Lcom/huawei/hms/c/g;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->p:I

    .line 323
    if-nez v5, :cond_4

    .line 324
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 326
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->d()Z

    move-result v0

    if-nez v0, :cond_3

    .line 327
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 328
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "In connect, bind core service fail"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->r:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    if-eqz v0, :cond_5

    .line 330
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->r:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    new-instance v1, Lcom/huawei/hms/api/ConnectionResult;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lcom/huawei/hms/api/ConnectionResult;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;->onConnectionFailed(Lcom/huawei/hms/api/ConnectionResult;)V

    goto :goto_1

    .line 335
    :cond_3
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->e()V

    goto :goto_1

    .line 338
    :cond_4
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->r:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    if-eqz v0, :cond_5

    .line 339
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->r:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    new-instance v1, Lcom/huawei/hms/api/ConnectionResult;

    invoke-direct {v1, v5}, Lcom/huawei/hms/api/ConnectionResult;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;->onConnectionFailed(Lcom/huawei/hms/api/ConnectionResult;)V

    .line 342
    :cond_5
    :goto_1
    return-void
.end method

.method public disconnect()V
    .locals 4

    .line 523
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    .line 525
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter disconnect, Connection Status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 530
    :pswitch_0
    goto :goto_0

    .line 534
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->f()V

    .line 535
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 536
    goto :goto_0

    .line 538
    :pswitch_2
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 539
    goto :goto_0

    .line 543
    :pswitch_3
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 545
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->h()V

    .line 546
    nop

    .line 550
    .line 555
    :goto_0
    :pswitch_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_1
    .end packed-switch
.end method

.method public getApiMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Lcom/huawei/hms/api/Api<*>;Lcom/huawei/hms/api/Api$ApiOptions;>;"
        }
    .end annotation

    .line 259
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->m:Ljava/util/Map;

    return-object v0
.end method

.method public getApiNameList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 1194
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1195
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->m:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 1196
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1197
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1198
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hms/api/Api;

    .line 1199
    invoke-virtual {v3}, Lcom/huawei/hms/api/Api;->getApiName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1200
    goto :goto_0

    .line 1202
    :cond_0
    return-object v1
.end method

.method public getAppID()Ljava/lang/String;
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    return-object v0
.end method

.method public getCpID()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPermissionInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;>;"
        }
    .end annotation

    .line 250
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->l:Ljava/util/List;

    return-object v0
.end method

.method public getScopes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/Scope;>;"
        }
    .end annotation

    .line 241
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->k:Ljava/util/List;

    return-object v0
.end method

.method public getService()Lcom/huawei/hms/core/aidl/e;
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->e:Lcom/huawei/hms/core/aidl/e;

    return-object v0
.end method

.method public getSessionId()Ljava/lang/String;
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubAppInfo()Lcom/huawei/hms/support/api/client/SubAppInfo;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->n:Lcom/huawei/hms/support/api/client/SubAppInfo;

    return-object v0
.end method

.method public getTopActivity()Landroid/app/Activity;
    .locals 1

    .line 797
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0
.end method

.method public getTransportName()Ljava/lang/String;
    .locals 1

    .line 223
    const-class v0, Lcom/huawei/hms/api/IPCTransport;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public innerIsConnected()Z
    .locals 2

    .line 615
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isConnected()Z
    .locals 10

    .line 563
    iget v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->p:I

    if-nez v0, :cond_0

    .line 564
    new-instance v4, Lcom/huawei/hms/c/g;

    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/hms/c/g;-><init>(Landroid/content/Context;)V

    .line 565
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v4, v0}, Lcom/huawei/hms/c/g;->b(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->p:I

    .line 568
    :cond_0
    iget v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->p:I

    const v1, 0x138ddc0

    if-ge v0, v1, :cond_4

    .line 570
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->o:J

    sub-long v4, v0, v2

    .line 572
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-lez v0, :cond_1

    const-wide/32 v0, 0x493e0

    cmp-long v0, v4, v0

    if-gez v0, :cond_1

    .line 573
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->innerIsConnected()Z

    move-result v0

    return v0

    .line 576
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->innerIsConnected()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 577
    new-instance v0, Lcom/huawei/hms/support/api/entity/core/CheckConnectInfo;

    invoke-direct {v0}, Lcom/huawei/hms/support/api/entity/core/CheckConnectInfo;-><init>()V

    invoke-static {p0, v0}, Lcom/huawei/hms/support/api/a/a;->a(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/entity/core/CheckConnectInfo;)Lcom/huawei/hms/support/api/client/InnerPendingResult;

    move-result-object v6

    .line 579
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x7d0

    invoke-virtual {v6, v1, v2, v0}, Lcom/huawei/hms/support/api/client/InnerPendingResult;->awaitOnAnyThread(JLjava/util/concurrent/TimeUnit;)Lcom/huawei/hms/support/api/client/Result;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hms/support/api/ResolveResult;

    .line 581
    invoke-virtual {v7}, Lcom/huawei/hms/support/api/ResolveResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v8

    .line 582
    invoke-virtual {v8}, Lcom/huawei/hms/support/api/client/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 583
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->o:J

    .line 584
    const/4 v0, 0x1

    return v0

    .line 587
    :cond_2
    invoke-virtual {v8}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v9

    .line 588
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isConnected is false, statuscode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    const v0, 0x3611c81c

    if-eq v9, v0, :cond_3

    .line 590
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->l()V

    .line 591
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 592
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->o:J

    .line 595
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 599
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->innerIsConnected()Z

    move-result v0

    return v0
.end method

.method public isConnecting()Z
    .locals 2

    .line 608
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    .line 609
    const/4 v0, 0x2

    if-eq v1, v0, :cond_0

    const/4 v0, 0x5

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onPause(Landroid/app/Activity;)V
    .locals 2

    .line 787
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "onPause"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 788
    return-void
.end method

.method public onResume(Landroid/app/Activity;)V
    .locals 2

    .line 773
    if-eqz p1, :cond_0

    .line 775
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "onResume"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 776
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->h:Ljava/lang/ref/WeakReference;

    .line 778
    :cond_0
    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .line 928
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "Enter onServiceConnected."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 931
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->f()V

    .line 933
    invoke-static {p2}, Lcom/huawei/hms/core/aidl/e$a;->a(Landroid/os/IBinder;)Lcom/huawei/hms/core/aidl/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->e:Lcom/huawei/hms/core/aidl/e;

    .line 935
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->e:Lcom/huawei/hms/core/aidl/e;

    if-nez v0, :cond_1

    .line 936
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "In onServiceConnected, mCoreService must not be null."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 938
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->l()V

    .line 939
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 941
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->r:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    if-eqz v0, :cond_0

    .line 942
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->r:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    new-instance v1, Lcom/huawei/hms/api/ConnectionResult;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lcom/huawei/hms/api/ConnectionResult;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;->onConnectionFailed(Lcom/huawei/hms/api/ConnectionResult;)V

    .line 945
    :cond_0
    return-void

    .line 948
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 949
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 951
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->j()V

    goto :goto_0

    .line 952
    :cond_2
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    .line 953
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->l()V

    .line 955
    :cond_3
    :goto_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1111
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "Enter onServiceDisconnected."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1113
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->e:Lcom/huawei/hms/core/aidl/e;

    .line 1115
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(I)V

    .line 1117
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->q:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    if-eqz v0, :cond_0

    .line 1118
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->q:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;->onConnectionSuspended(I)V

    .line 1120
    :cond_0
    return-void
.end method

.method public setApiMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Lcom/huawei/hms/api/Api<*>;Lcom/huawei/hms/api/Api$ApiOptions;>;)V"
        }
    .end annotation

    .line 624
    iput-object p1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->m:Ljava/util/Map;

    .line 625
    return-void
.end method

.method public setConnectionCallbacks(Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;)V
    .locals 0

    .line 854
    iput-object p1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->q:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    .line 855
    return-void
.end method

.method public setConnectionFailedListener(Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)V
    .locals 0

    .line 862
    iput-object p1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->r:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    .line 863
    return-void
.end method

.method public setHasShowNotice(Z)V
    .locals 0

    .line 281
    iput-boolean p1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->i:Z

    .line 282
    return-void
.end method

.method public setPermissionInfos(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;>;)V"
        }
    .end annotation

    .line 642
    iput-object p1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->l:Ljava/util/List;

    .line 643
    return-void
.end method

.method public setScopes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/Scope;>;)V"
        }
    .end annotation

    .line 633
    iput-object p1, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->k:Ljava/util/List;

    .line 634
    return-void
.end method

.method public setSubAppInfo(Lcom/huawei/hms/support/api/client/SubAppInfo;)Z
    .locals 4

    .line 652
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "Enter setSubAppInfo"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    if-nez p1, :cond_0

    .line 654
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "subAppInfo is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 655
    const/4 v0, 0x0

    return v0

    .line 658
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/client/SubAppInfo;->getSubAppID()Ljava/lang/String;

    move-result-object v2

    .line 659
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 660
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "subAppId is empty"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 661
    const/4 v0, 0x0

    return v0

    .line 664
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hms/c/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->d:Ljava/lang/String;

    .line 665
    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 666
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "subAppId is host appid"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 667
    const/4 v0, 0x0

    return v0

    .line 671
    :cond_3
    new-instance v0, Lcom/huawei/hms/support/api/client/SubAppInfo;

    invoke-direct {v0, p1}, Lcom/huawei/hms/support/api/client/SubAppInfo;-><init>(Lcom/huawei/hms/support/api/client/SubAppInfo;)V

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClientImpl;->n:Lcom/huawei/hms/support/api/client/SubAppInfo;

    .line 672
    const/4 v0, 0x1

    return v0
.end method
