.class public final Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;
.super Ljava/lang/Object;
.source "ManagerModule_ProvideScheduledWorkReceiverFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/receiver/work/ScheduledWorkManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final scheduledWorkReceiverPrefsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;->contextProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;->scheduledWorkReceiverPrefsProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)",
            "Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/receiver/work/ScheduledWorkManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)",
            "Lcom/ibotta/android/receiver/work/ScheduledWorkManager;"
        }
    .end annotation

    .line 43
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/SharedPreferences;

    .line 42
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;->proxyProvideScheduledWorkReceiver(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/content/SharedPreferences;)Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideScheduledWorkReceiver(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/content/SharedPreferences;)Lcom/ibotta/android/receiver/work/ScheduledWorkManager;
    .locals 0

    .line 57
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/ManagerModule;->provideScheduledWorkReceiver(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/content/SharedPreferences;)Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 56
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/receiver/work/ScheduledWorkManager;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;->scheduledWorkReceiverPrefsProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/ManagerModule_ProvideScheduledWorkReceiverFactory;->get()Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    move-result-object v0

    return-object v0
.end method
