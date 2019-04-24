.class public final Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;
.super Ljava/lang/Object;
.source "GalleryModule_ProvidesAccountTrackingFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;",
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

.field private final galleryDetailEventContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

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
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->module:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->galleryDetailEventContextProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;"
        }
    .end annotation

    .line 50
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/AppHelper;

    .line 51
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/tracking/EventContextProvider;

    .line 52
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 48
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->proxyProvidesAccountTracking(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidesAccountTracking(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;
    .locals 0

    .line 70
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;->providesAccountTracking(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 69
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;
    .locals 4

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->module:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->galleryDetailEventContextProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule_ProvidesAccountTrackingFactory;->get()Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    move-result-object v0

    return-object v0
.end method
