.class public final Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;
.super Ljava/lang/Object;
.source "PwiHomeModule_ProvidePwiErrorDialogFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;",
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

.field private final module:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;->module:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;"
        }
    .end annotation

    .line 33
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;->proxyProvidePwiErrorDialogFactory(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePwiErrorDialogFactory(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;
    .locals 0

    .line 44
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;->providePwiErrorDialogFactory(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 43
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;->module:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;->get()Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    move-result-object v0

    return-object v0
.end method
