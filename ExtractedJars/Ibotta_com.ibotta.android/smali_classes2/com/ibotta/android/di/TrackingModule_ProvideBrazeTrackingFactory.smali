.class public final Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;
.super Ljava/lang/Object;
.source "TrackingModule_ProvideBrazeTrackingFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
        ">;"
    }
.end annotation


# instance fields
.field private final appboyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
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
            "Lcom/appboy/Appboy;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;->appboyProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;)",
            "Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;"
        }
    .end annotation

    .line 31
    new-instance v0, Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;)",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appboy/Appboy;

    invoke-static {p0}, Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;->proxyProvideBrazeTracking(Lcom/appboy/Appboy;)Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideBrazeTracking(Lcom/appboy/Appboy;)Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .locals 1

    .line 36
    invoke-static {p0}, Lcom/ibotta/android/di/TrackingModule;->provideBrazeTracking(Lcom/appboy/Appboy;)Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 35
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;->appboyProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/TrackingModule_ProvideBrazeTrackingFactory;->get()Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-result-object v0

    return-object v0
.end method
