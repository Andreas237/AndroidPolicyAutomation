.class public Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetectorImpl;
.super Ljava/lang/Object;
.source "PartnerAppDetectorImpl.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;


# instance fields
.field private final appIsInstalledFunction:Lcom/ibotta/android/tracking/proprietary/pat/AppIsInstalledFunction;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/proprietary/pat/AppIsInstalledFunction;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetectorImpl;->appIsInstalledFunction:Lcom/ibotta/android/tracking/proprietary/pat/AppIsInstalledFunction;

    return-void
.end method

.method private getPartnerAppStates(Ljava/util/Map;)Ljava9/util/stream/Stream;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava9/util/stream/Stream<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;",
            ">;"
        }
    .end annotation

    .line 33
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/tracking/proprietary/pat/-$$Lambda$PartnerAppDetectorImpl$ChnycSXA1q35etnIEchgxZTa_d0;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/tracking/proprietary/pat/-$$Lambda$PartnerAppDetectorImpl$ChnycSXA1q35etnIEchgxZTa_d0;-><init>(Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetectorImpl;Ljava/util/Map;)V

    .line 34
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$getPartnerAppStates$0(Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetectorImpl;Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;
    .locals 3

    .line 35
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetectorImpl;->appIsInstalledFunction:Lcom/ibotta/android/tracking/proprietary/pat/AppIsInstalledFunction;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/pat/AppIsInstalledFunction;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {p2, p1, v0}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;->create(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;

    move-result-object p1

    const-string p2, "Partner app status: installed=%1$b"

    const/4 v0, 0x1

    .line 38
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;->isInstalled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public getInstalledPartnerApps(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;",
            ">;"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetectorImpl;->getPartnerAppStates(Ljava/util/Map;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/tracking/proprietary/pat/-$$Lambda$WhgbLjrh5fQTuOJzriGd9X5tnVY;->INSTANCE:Lcom/ibotta/android/tracking/proprietary/pat/-$$Lambda$WhgbLjrh5fQTuOJzriGd9X5tnVY;

    .line 28
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 29
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
