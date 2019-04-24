.class public final Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;
.super Ljava/lang/Object;
.source "WalletV2Module_ProvidePwiWalletReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/pwi/PwiWalletV2Reducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;

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
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;Ljavax/inject/Provider;)Lcom/ibotta/android/pwi/PwiWalletV2Reducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/pwi/PwiWalletV2Reducer;"
        }
    .end annotation

    .line 33
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;->proxyProvidePwiWalletReducer(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;Landroid/content/res/Resources;)Lcom/ibotta/android/pwi/PwiWalletV2Reducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePwiWalletReducer(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;Landroid/content/res/Resources;)Lcom/ibotta/android/pwi/PwiWalletV2Reducer;
    .locals 0

    .line 44
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;->providePwiWalletReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/pwi/PwiWalletV2Reducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 43
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/pwi/PwiWalletV2Reducer;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;Ljavax/inject/Provider;)Lcom/ibotta/android/pwi/PwiWalletV2Reducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;->get()Lcom/ibotta/android/pwi/PwiWalletV2Reducer;

    move-result-object v0

    return-object v0
.end method
