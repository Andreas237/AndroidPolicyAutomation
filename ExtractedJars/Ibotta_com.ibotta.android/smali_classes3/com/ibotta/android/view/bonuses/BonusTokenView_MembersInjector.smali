.class public final Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;
.super Ljava/lang/Object;
.source "BonusTokenView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/view/bonuses/BonusTokenView;",
        ">;"
    }
.end annotation


# instance fields
.field private final bonusHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
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
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->bonusHelperProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p4, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/view/bonuses/BonusTokenView;",
            ">;"
        }
    .end annotation

    .line 41
    new-instance v0, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectBonusHelper(Lcom/ibotta/android/view/bonuses/BonusTokenView;Lcom/ibotta/api/helper/bonus/BonusHelper;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    return-void
.end method

.method public static injectImageCache(Lcom/ibotta/android/view/bonuses/BonusTokenView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/view/bonuses/BonusTokenView;)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->injectFormatting(Lcom/ibotta/android/view/common/ProgressCircleView;Lcom/ibotta/android/util/Formatting;)V

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/common/ProgressCircleView_MembersInjector;->injectHandler(Lcom/ibotta/android/view/common/ProgressCircleView;Landroid/os/Handler;)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->bonusHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->injectBonusHelper(Lcom/ibotta/android/view/bonuses/BonusTokenView;Lcom/ibotta/api/helper/bonus/BonusHelper;)V

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->injectImageCache(Lcom/ibotta/android/view/bonuses/BonusTokenView;Lcom/ibotta/android/images/ImageCache;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/view/bonuses/BonusTokenView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/bonuses/BonusTokenView_MembersInjector;->injectMembers(Lcom/ibotta/android/view/bonuses/BonusTokenView;)V

    return-void
.end method
