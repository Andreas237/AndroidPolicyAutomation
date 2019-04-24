.class public final Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;
.super Ljava/lang/Object;
.source "EarningsOfferRowView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
            ">;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->offerHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;",
            ">;"
        }
    .end annotation

    .line 41
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectAppHelper(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectFormatting(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method public static injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/android/util/AppHelper;)V

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/android/util/Formatting;)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/android/images/ImageCache;)V

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->offerHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;)V

    return-void
.end method
