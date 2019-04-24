.class public final Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;
.super Ljava/lang/Object;
.source "MyOffersGalleryReducer_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final galleryHeaderReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final galleryOrganizerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;",
            ">;"
        }
    .end annotation
.end field

.field private final titleBarReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
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
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;->galleryHeaderReducerProvider:Ljavax/inject/Provider;

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;->galleryOrganizerProvider:Ljavax/inject/Provider;

    .line 27
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;->titleBarReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newMyOffersGalleryReducer(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;
    .locals 1

    .line 58
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;"
        }
    .end annotation

    .line 40
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;

    .line 41
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    .line 42
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;

    .line 43
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/title/TitleBarReducer;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;
    .locals 3

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;->galleryHeaderReducerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;->galleryOrganizerProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;->titleBarReducerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer_Factory;->get()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;

    move-result-object v0

    return-object v0
.end method
