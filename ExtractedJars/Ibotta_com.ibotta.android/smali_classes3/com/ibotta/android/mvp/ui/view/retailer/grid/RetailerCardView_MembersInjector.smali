.class public final Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView_MembersInjector;
.super Ljava/lang/Object;
.source "RetailerCardView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;",
        ">;"
    }
.end annotation


# instance fields
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
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;",
            ">;"
        }
    .end annotation

    .line 20
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;)V
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;Lcom/ibotta/android/images/ImageCache;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerCardView;)V

    return-void
.end method
