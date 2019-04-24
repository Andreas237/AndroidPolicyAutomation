.class public final Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;
.super Ljava/lang/Object;
.source "PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;",
        ">;"
    }
.end annotation


# instance fields
.field private final partnerAppEventFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;",
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
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;->partnerAppEventFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;",
            ">;)",
            "Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;"
        }
    .end annotation

    .line 37
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;

    .line 36
    invoke-static {p0, p1}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;->proxyProvidePartnerAppTracker(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePartnerAppTracker(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;
    .locals 0

    .line 50
    invoke-static {p0, p1}, Lcom/ibotta/android/di/PartnerAppTrackingModule;->providePartnerAppTracker(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 49
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;->trackingQueueProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;->partnerAppEventFactoryProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppTrackerFactory;->get()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;

    move-result-object v0

    return-object v0
.end method
