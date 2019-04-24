.class public final Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;
.super Ljava/lang/Object;
.source "BaseOfferCardView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;",
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

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    .line 31
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

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
            "Lcom/ibotta/android/images/ImageCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;",
            ">;"
        }
    .end annotation

    .line 40
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectAppHelper(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectFormatting(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method public static injectHandler(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Landroid/os/Handler;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->handler:Landroid/os/Handler;

    return-void
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;)V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Lcom/ibotta/android/util/AppHelper;)V

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Lcom/ibotta/android/images/ImageCache;)V

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Lcom/ibotta/android/util/Formatting;)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Landroid/os/Handler;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;)V

    return-void
.end method
