.class public final Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;
.super Ljava/lang/Object;
.source "ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Landroid/content/SharedPreferences;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;->contextProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Landroid/content/SharedPreferences;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Landroid/content/SharedPreferences;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;->proxyProvideScheduledWorkReceiverPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideScheduledWorkReceiverPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 1

    .line 39
    invoke-static {p0}, Lcom/ibotta/android/di/ScheduledWorkerModule;->provideScheduledWorkReceiverPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 38
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/SharedPreferences;

    return-object p0
.end method


# virtual methods
.method public get()Landroid/content/SharedPreferences;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;->contextProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;->provideInstance(Ljavax/inject/Provider;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ScheduledWorkerModule_ProvideScheduledWorkReceiverPrefsFactory;->get()Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
