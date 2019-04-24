.class public final Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;
.super Ljava/lang/Object;
.source "FeaturedListView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;",
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

.field private final eventContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->hardwareProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->eventContextProvider:Ljavax/inject/Provider;

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
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;",
            ">;"
        }
    .end annotation

    .line 46
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectEventContextProvider(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/tracking/EventContextProvider;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    return-void
.end method

.method public static injectHardware(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/hardware/Hardware;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    return-void
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method public static injectTrackingQueue(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;)V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/util/AppHelper;)V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->hardwareProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/hardware/Hardware;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->injectHardware(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/hardware/Hardware;)V

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/images/ImageCache;)V

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->eventContextProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->injectEventContextProvider(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;Lcom/ibotta/android/tracking/EventContextProvider;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;)V

    return-void
.end method
