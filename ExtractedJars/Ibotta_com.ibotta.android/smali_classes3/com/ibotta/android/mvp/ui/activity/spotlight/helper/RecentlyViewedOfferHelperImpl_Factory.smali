.class public final Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl_Factory;
.super Ljava/lang/Object;
.source "RecentlyViewedOfferHelperImpl_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;",
        ">;"
    }
.end annotation


# instance fields
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
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl_Factory;->offerHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl_Factory;"
        }
    .end annotation

    .line 32
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl_Factory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl_Factory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newRecentlyViewedOfferHelperImpl(Lcom/ibotta/api/helper/offer/OfferHelper;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;
    .locals 1

    .line 37
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;"
        }
    .end annotation

    .line 27
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;

    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl_Factory;->offerHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl_Factory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl_Factory;->get()Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;

    move-result-object v0

    return-object v0
.end method
