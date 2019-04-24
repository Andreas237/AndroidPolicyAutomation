.class public final Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;
.super Ljava/lang/Object;
.source "ImErrorModule_ProvideImUiUtilFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;",
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

.field private final module:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;->module:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;"
        }
    .end annotation

    .line 37
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;"
        }
    .end annotation

    .line 32
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;->proxyProvideImUiUtil(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideImUiUtil(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;->provideImUiUtil(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 41
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;->module:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;->get()Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;

    move-result-object v0

    return-object v0
.end method
