.class public final Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;
.super Ljava/lang/Object;
.source "RebateRowView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;",
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

.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
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

.field private final offerButtonReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/OfferButtonReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
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
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/OfferButtonReducer;",
            ">;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    .line 39
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->offerHelperProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->offerButtonReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 8
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
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/OfferButtonReducer;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;",
            ">;"
        }
    .end annotation

    .line 52
    new-instance v7, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method public static injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectFormatting(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method public static injectOfferButtonReducer(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/button/OfferButtonReducer;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerButtonReducer:Lcom/ibotta/android/button/OfferButtonReducer;

    return-void
.end method

.method public static injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/util/AppHelper;)V

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/util/Formatting;)V

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/images/ImageCache;)V

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->offerHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->offerButtonReducerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/button/OfferButtonReducer;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectOfferButtonReducer(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Lcom/ibotta/android/button/OfferButtonReducer;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V

    return-void
.end method
