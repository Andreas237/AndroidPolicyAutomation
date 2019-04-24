.class public final Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;
.super Ljava/lang/Object;
.source "PersonalStoresModule_ProvidePersonalStoresReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/personalize/PersonalStoresReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final titleBarReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
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
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;->titleBarReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/personalize/PersonalStoresReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)",
            "Lcom/ibotta/android/personalize/PersonalStoresReducer;"
        }
    .end annotation

    .line 30
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/title/TitleBarReducer;

    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;->proxyProvidePersonalStoresReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/personalize/PersonalStoresReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePersonalStoresReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/personalize/PersonalStoresReducer;
    .locals 1

    .line 41
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;->providePersonalStoresReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/personalize/PersonalStoresReducer;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 40
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/personalize/PersonalStoresReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/personalize/PersonalStoresReducer;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;->titleBarReducerProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/personalize/PersonalStoresReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;->get()Lcom/ibotta/android/personalize/PersonalStoresReducer;

    move-result-object v0

    return-object v0
.end method
