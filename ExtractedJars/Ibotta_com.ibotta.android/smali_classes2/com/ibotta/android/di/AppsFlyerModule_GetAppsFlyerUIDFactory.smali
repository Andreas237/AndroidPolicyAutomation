.class public final Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;
.super Ljava/lang/Object;
.source "AppsFlyerModule_GetAppsFlyerUIDFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/lang/String;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;->appProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;)",
            "Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;"
        }
    .end annotation

    .line 30
    new-instance v0, Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 26
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/App;

    invoke-static {p0}, Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;->proxyGetAppsFlyerUID(Lcom/ibotta/android/App;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static proxyGetAppsFlyerUID(Lcom/ibotta/android/App;)Ljava/lang/String;
    .locals 1

    .line 35
    invoke-static {p0}, Lcom/ibotta/android/di/AppsFlyerModule;->getAppsFlyerUID(Lcom/ibotta/android/App;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 34
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;->get()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;->appProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/AppsFlyerModule_GetAppsFlyerUIDFactory;->provideInstance(Ljavax/inject/Provider;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
