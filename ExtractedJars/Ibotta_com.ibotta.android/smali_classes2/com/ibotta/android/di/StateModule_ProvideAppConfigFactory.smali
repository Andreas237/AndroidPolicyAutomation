.class public final Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;
.super Ljava/lang/Object;
.source "StateModule_ProvideAppConfigFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/app/config/AppConfig;",
        ">;"
    }
.end annotation


# instance fields
.field private final configParserHolderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/ConfigParserHolder;",
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

.field private final resourcesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
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
            "Landroid/content/SharedPreferences;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/ConfigParserHolder;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;->prefsProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;->resourcesProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;->configParserHolderProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/ConfigParserHolder;",
            ">;)",
            "Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/config/AppConfig;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/ConfigParserHolder;",
            ">;)",
            "Lcom/ibotta/android/state/app/config/AppConfig;"
        }
    .end annotation

    .line 42
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/SharedPreferences;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/state/app/config/ConfigParserHolder;

    .line 41
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;->proxyProvideAppConfig(Landroid/content/SharedPreferences;Landroid/content/res/Resources;Lcom/ibotta/android/state/app/config/ConfigParserHolder;)Lcom/ibotta/android/state/app/config/AppConfig;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideAppConfig(Landroid/content/SharedPreferences;Landroid/content/res/Resources;Lcom/ibotta/android/state/app/config/ConfigParserHolder;)Lcom/ibotta/android/state/app/config/AppConfig;
    .locals 0

    .line 56
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/StateModule;->provideAppConfig(Landroid/content/SharedPreferences;Landroid/content/res/Resources;Lcom/ibotta/android/state/app/config/ConfigParserHolder;)Lcom/ibotta/android/state/app/config/AppConfig;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 55
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/config/AppConfig;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/app/config/AppConfig;
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;->prefsProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;->resourcesProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;->configParserHolderProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/config/AppConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/StateModule_ProvideAppConfigFactory;->get()Lcom/ibotta/android/state/app/config/AppConfig;

    move-result-object v0

    return-object v0
.end method
