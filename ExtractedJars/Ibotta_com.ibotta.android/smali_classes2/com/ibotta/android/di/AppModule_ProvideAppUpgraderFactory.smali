.class public final Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideAppUpgraderFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/app/upgrade/AppUpgrader;",
        ">;"
    }
.end annotation


# instance fields
.field private final appProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;"
        }
    .end annotation
.end field

.field private final prefsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;->appProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;->prefsProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)",
            "Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/upgrade/AppUpgrader;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgrader;"
        }
    .end annotation

    .line 33
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/App;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/SharedPreferences;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;->proxyProvideAppUpgrader(Lcom/ibotta/android/App;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/upgrade/AppUpgrader;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideAppUpgrader(Lcom/ibotta/android/App;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/upgrade/AppUpgrader;
    .locals 0

    .line 43
    invoke-static {p0, p1}, Lcom/ibotta/android/di/AppModule;->provideAppUpgrader(Lcom/ibotta/android/App;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/upgrade/AppUpgrader;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 42
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/upgrade/AppUpgrader;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/app/upgrade/AppUpgrader;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;->appProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;->prefsProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/upgrade/AppUpgrader;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideAppUpgraderFactory;->get()Lcom/ibotta/android/state/app/upgrade/AppUpgrader;

    move-result-object v0

    return-object v0
.end method
