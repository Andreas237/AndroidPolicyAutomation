.class public final Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;
.super Ljava/lang/Object;
.source "FeaturedView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/view/featured/FeaturedView;",
        ">;"
    }
.end annotation


# instance fields
.field private final featureRouteHandlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/view/featured/FeatureRouteHandler;",
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

.field private final hardwareProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/view/featured/FeatureRouteHandler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->hardwareProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->featureRouteHandlerProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p5, p0, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/view/featured/FeatureRouteHandler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/view/featured/FeaturedView;",
            ">;"
        }
    .end annotation

    .line 45
    new-instance v6, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static injectFeatureRouteHandler(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/view/featured/FeatureRouteHandler;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->featureRouteHandler:Lcom/ibotta/android/view/featured/FeatureRouteHandler;

    return-void
.end method

.method public static injectHandler(Lcom/ibotta/android/view/featured/FeaturedView;Landroid/os/Handler;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->handler:Landroid/os/Handler;

    return-void
.end method

.method public static injectHardware(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/hardware/Hardware;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    return-void
.end method

.method public static injectImageCache(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method public static injectTrackingQueue(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeaturedView;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/view/featured/FeaturedView;)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->hardwareProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/hardware/Hardware;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->injectHardware(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/hardware/Hardware;)V

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->handlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->injectHandler(Lcom/ibotta/android/view/featured/FeaturedView;Landroid/os/Handler;)V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->featureRouteHandlerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->injectFeatureRouteHandler(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/view/featured/FeatureRouteHandler;)V

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->injectImageCache(Lcom/ibotta/android/view/featured/FeaturedView;Lcom/ibotta/android/images/ImageCache;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/featured/FeaturedView_MembersInjector;->injectMembers(Lcom/ibotta/android/view/featured/FeaturedView;)V

    return-void
.end method
