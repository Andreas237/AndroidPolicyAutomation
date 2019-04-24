.class public final Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideTitleBarReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/title/TitleBarReducer;",
        ">;"
    }
.end annotation


# instance fields
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
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;"
        }
    .end annotation

    .line 32
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/title/TitleBarReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/title/TitleBarReducer;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Resources;

    invoke-static {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;->proxyProvideTitleBarReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/title/TitleBarReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideTitleBarReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/title/TitleBarReducer;
    .locals 1

    .line 37
    invoke-static {p0}, Lcom/ibotta/android/di/ReducerModule;->provideTitleBarReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/title/TitleBarReducer;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 36
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/title/TitleBarReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/title/TitleBarReducer;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/title/TitleBarReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideTitleBarReducerFactory;->get()Lcom/ibotta/android/title/TitleBarReducer;

    move-result-object v0

    return-object v0
.end method
