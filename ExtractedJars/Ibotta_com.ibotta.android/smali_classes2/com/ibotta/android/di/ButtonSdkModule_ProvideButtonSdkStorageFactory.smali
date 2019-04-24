.class public final Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;
.super Ljava/lang/Object;
.source "ButtonSdkModule_ProvideButtonSdkStorageFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;",
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

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;->appProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;)",
            "Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;"
        }
    .end annotation

    .line 32
    new-instance v0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;)",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;"
        }
    .end annotation

    .line 28
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/App;

    invoke-static {p0}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;->proxyProvideButtonSdkStorage(Lcom/ibotta/android/App;)Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideButtonSdkStorage(Lcom/ibotta/android/App;)Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;
    .locals 1

    .line 37
    invoke-static {p0}, Lcom/ibotta/android/di/ButtonSdkModule;->provideButtonSdkStorage(Lcom/ibotta/android/App;)Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 36
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;->appProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkStorageFactory;->get()Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    move-result-object v0

    return-object v0
.end method
