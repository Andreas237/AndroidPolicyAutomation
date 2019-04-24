.class public final Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;
.super Ljava/lang/Object;
.source "MyOffersGalleryListView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;",
        ">;"
    }
.end annotation


# instance fields
.field private final contentCardReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/ContentCardReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final trackingQueueProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
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
            "Lcom/ibotta/android/content/card/ContentCardReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;->contentCardReducerProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/ContentCardReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;",
            ">;"
        }
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectContentCardReducer(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;Lcom/ibotta/android/content/card/ContentCardReducer;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    return-void
.end method

.method public static injectTrackingQueue(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;->contentCardReducerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/content/card/ContentCardReducer;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;->injectContentCardReducer(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;Lcom/ibotta/android/content/card/ContentCardReducer;)V

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;)V

    return-void
.end method
