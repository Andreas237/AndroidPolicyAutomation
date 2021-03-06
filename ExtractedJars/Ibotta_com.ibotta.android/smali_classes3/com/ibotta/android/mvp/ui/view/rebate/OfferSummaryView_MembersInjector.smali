.class public final Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;
.super Ljava/lang/Object;
.source "OfferSummaryView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/OfferButtonReducer;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->offerHelperProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->offerButtonReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/OfferButtonReducer;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;",
            ">;"
        }
    .end annotation

    .line 46
    new-instance v6, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method public static injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectFormatting(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method public static injectOfferButtonReducer(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/button/OfferButtonReducer;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerButtonReducer:Lcom/ibotta/android/button/OfferButtonReducer;

    return-void
.end method

.method public static injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;)V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/util/AppHelper;)V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->appConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->offerHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/util/Formatting;)V

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->offerButtonReducerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/button/OfferButtonReducer;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->injectOfferButtonReducer(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Lcom/ibotta/android/button/OfferButtonReducer;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;)V

    return-void
.end method
