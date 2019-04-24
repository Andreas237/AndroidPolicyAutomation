.class public final Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideApiLayerNewRelicInterceptorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p0}, Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;->proxyProvideApiLayerNewRelicInterceptor(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideApiLayerNewRelicInterceptor(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;
    .locals 1

    .line 40
    invoke-static {p0}, Lcom/ibotta/android/di/AppModule;->provideApiLayerNewRelicInterceptor(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 39
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideApiLayerNewRelicInterceptorFactory;->get()Lcom/ibotta/android/api/ApiLayerNewRelicInterceptor;

    move-result-object v0

    return-object v0
.end method
