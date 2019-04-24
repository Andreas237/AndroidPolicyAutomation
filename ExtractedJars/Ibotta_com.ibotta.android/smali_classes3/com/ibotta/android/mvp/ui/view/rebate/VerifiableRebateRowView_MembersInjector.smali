.class public final Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;
.super Ljava/lang/Object;
.source "VerifiableRebateRowView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final imageCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
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
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;",
            ">;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method public static injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Lcom/ibotta/android/util/AppHelper;)V

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Lcom/ibotta/android/images/ImageCache;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V

    return-void
.end method
