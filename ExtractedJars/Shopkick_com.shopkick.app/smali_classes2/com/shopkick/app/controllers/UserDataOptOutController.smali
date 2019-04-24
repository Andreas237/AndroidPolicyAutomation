.class public Lcom/shopkick/app/controllers/UserDataOptOutController;
.super Ljava/lang/Object;
.source "UserDataOptOutController.java"


# static fields
.field private static volatile INSTANCE:Lcom/shopkick/app/controllers/UserDataOptOutController;

.field private static final InstanceLock:Ljava/lang/Object;


# instance fields
.field private final apiManager:Lcom/shopkick/fetchers/api/APIManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/controllers/UserDataOptOutController;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/shopkick/app/controllers/UserDataOptOutController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-void
.end method

.method public static getInstance()Lcom/shopkick/app/controllers/UserDataOptOutController;
    .locals 2

    .line 50
    sget-object v0, Lcom/shopkick/app/controllers/UserDataOptOutController;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 51
    :try_start_0
    sget-object v1, Lcom/shopkick/app/controllers/UserDataOptOutController;->INSTANCE:Lcom/shopkick/app/controllers/UserDataOptOutController;

    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v1, Lcom/shopkick/app/controllers/UserDataOptOutController;->INSTANCE:Lcom/shopkick/app/controllers/UserDataOptOutController;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static initialize(Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 2

    const-string v0, "apiManager cannot be null!"

    .line 35
    invoke-static {p0, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    sget-object v0, Lcom/shopkick/app/controllers/UserDataOptOutController;->INSTANCE:Lcom/shopkick/app/controllers/UserDataOptOutController;

    if-nez v0, :cond_1

    .line 38
    sget-object v0, Lcom/shopkick/app/controllers/UserDataOptOutController;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 39
    :try_start_0
    sget-object v1, Lcom/shopkick/app/controllers/UserDataOptOutController;->INSTANCE:Lcom/shopkick/app/controllers/UserDataOptOutController;

    if-nez v1, :cond_0

    .line 40
    new-instance v1, Lcom/shopkick/app/controllers/UserDataOptOutController;

    invoke-direct {v1, p0}, Lcom/shopkick/app/controllers/UserDataOptOutController;-><init>(Lcom/shopkick/fetchers/api/APIManager;)V

    sput-object v1, Lcom/shopkick/app/controllers/UserDataOptOutController;->INSTANCE:Lcom/shopkick/app/controllers/UserDataOptOutController;

    .line 42
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static isInitialized()Z
    .locals 2

    .line 62
    sget-object v0, Lcom/shopkick/app/controllers/UserDataOptOutController;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 63
    :try_start_0
    sget-object v1, Lcom/shopkick/app/controllers/UserDataOptOutController;->INSTANCE:Lcom/shopkick/app/controllers/UserDataOptOutController;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 64
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public showDataOptOutFlow(Lcom/shopkick/app/activities/BaseActivity;)V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/controllers/UserDataOptOutController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    const v1, 0x7f110222

    invoke-static {v1, v0}, Lcom/shopkick/app/widget/DataOptOutDialog;->newInstance(ILcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/widget/DataOptOutDialog;

    move-result-object v0

    .line 72
    invoke-virtual {p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->showDialog(Landroid/support/v4/app/DialogFragment;)V

    return-void
.end method
