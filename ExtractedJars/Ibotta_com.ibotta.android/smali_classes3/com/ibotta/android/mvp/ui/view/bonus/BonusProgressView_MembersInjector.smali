.class public final Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;
.super Ljava/lang/Object;
.source "BonusProgressView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;->bonusHelperProvider:Ljavax/inject/Provider;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;",
            ">;"
        }
    .end annotation

    .line 26
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectBonusHelper(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;Lcom/ibotta/api/helper/bonus/BonusHelper;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    return-void
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;)V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;->bonusHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;->injectBonusHelper(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;Lcom/ibotta/api/helper/bonus/BonusHelper;)V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;Lcom/ibotta/android/images/ImageCache;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;)V

    return-void
.end method
