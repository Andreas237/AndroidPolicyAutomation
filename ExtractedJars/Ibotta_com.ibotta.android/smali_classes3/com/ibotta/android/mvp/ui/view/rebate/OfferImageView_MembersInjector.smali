.class public final Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;
.super Ljava/lang/Object;
.source "OfferImageView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;",
            ">;"
        }
    .end annotation

    .line 26
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method public static injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;)V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;Lcom/ibotta/android/util/AppHelper;)V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;)V

    return-void
.end method
