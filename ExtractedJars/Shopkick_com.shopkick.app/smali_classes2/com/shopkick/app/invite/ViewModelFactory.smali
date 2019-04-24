.class public Lcom/shopkick/app/invite/ViewModelFactory;
.super Landroid/arch/lifecycle/ViewModelProvider$NewInstanceFactory;
.source "ViewModelFactory.java"


# static fields
.field private static volatile INSTANCE:Lcom/shopkick/app/invite/ViewModelFactory;

.field private static final InstanceLock:Ljava/lang/Object;


# instance fields
.field private final applicationContext:Landroid/app/Application;

.field private final screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/invite/ViewModelFactory;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/shopkick/app/application/ScreenGlobals;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Landroid/arch/lifecycle/ViewModelProvider$NewInstanceFactory;-><init>()V

    .line 25
    iput-object p2, p0, Lcom/shopkick/app/invite/ViewModelFactory;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    .line 26
    iput-object p1, p0, Lcom/shopkick/app/invite/ViewModelFactory;->applicationContext:Landroid/app/Application;

    return-void
.end method

.method public static getViewModelFactory(Landroid/app/Application;Lcom/shopkick/app/application/ScreenGlobals;)Lcom/shopkick/app/invite/ViewModelFactory;
    .locals 2

    .line 30
    sget-object v0, Lcom/shopkick/app/invite/ViewModelFactory;->INSTANCE:Lcom/shopkick/app/invite/ViewModelFactory;

    if-nez v0, :cond_1

    .line 31
    sget-object v0, Lcom/shopkick/app/invite/ViewModelFactory;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 32
    :try_start_0
    sget-object v1, Lcom/shopkick/app/invite/ViewModelFactory;->INSTANCE:Lcom/shopkick/app/invite/ViewModelFactory;

    if-nez v1, :cond_0

    .line 33
    new-instance v1, Lcom/shopkick/app/invite/ViewModelFactory;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/invite/ViewModelFactory;-><init>(Landroid/app/Application;Lcom/shopkick/app/application/ScreenGlobals;)V

    sput-object v1, Lcom/shopkick/app/invite/ViewModelFactory;->INSTANCE:Lcom/shopkick/app/invite/ViewModelFactory;

    .line 35
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 38
    :cond_1
    :goto_0
    sget-object p0, Lcom/shopkick/app/invite/ViewModelFactory;->INSTANCE:Lcom/shopkick/app/invite/ViewModelFactory;

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;
    .locals 4
    .param p1    # Ljava/lang/Class;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/arch/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 44
    const-class v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    new-instance p1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    iget-object v0, p0, Lcom/shopkick/app/invite/ViewModelFactory;->applicationContext:Landroid/app/Application;

    iget-object v1, p0, Lcom/shopkick/app/invite/ViewModelFactory;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, p0, Lcom/shopkick/app/invite/ViewModelFactory;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, p0, Lcom/shopkick/app/invite/ViewModelFactory;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v3, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;-><init>(Landroid/app/Application;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/launch/FirstUseControllerV2;)V

    return-object p1

    .line 51
    :cond_0
    invoke-super {p0, p1}, Landroid/arch/lifecycle/ViewModelProvider$NewInstanceFactory;->create(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;

    move-result-object p1

    return-object p1
.end method
