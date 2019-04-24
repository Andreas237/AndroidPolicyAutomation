.class public Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;
.super Ljava/lang/Object;
.source "PartnerAppTrackingConfig.java"


# static fields
.field public static final DEFAULT:Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;


# instance fields
.field private final partnerApps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;-><init>()V

    sput-object v0, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;->partnerApps:Ljava/util/List;

    return-void
.end method

.method static synthetic lambda$getAppNameAndIdMap$0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p1
.end method


# virtual methods
.method public getAppNameAndIdMap()Ljava/util/Map;
    .locals 4
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;->partnerApps:Ljava/util/List;

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/state/app/config/pat/-$$Lambda$EJ_HAmG2pStDmGtoEbj0a1jyaKo;->INSTANCE:Lcom/ibotta/android/state/app/config/pat/-$$Lambda$EJ_HAmG2pStDmGtoEbj0a1jyaKo;

    sget-object v2, Lcom/ibotta/android/state/app/config/pat/-$$Lambda$-0eZ5e-Tqn48Ej_m5qP_zA1neW8;->INSTANCE:Lcom/ibotta/android/state/app/config/pat/-$$Lambda$-0eZ5e-Tqn48Ej_m5qP_zA1neW8;

    sget-object v3, Lcom/ibotta/android/state/app/config/pat/-$$Lambda$PartnerAppTrackingConfig$HQh00pz3YR-pUu_clR9Fb6bHHEA;->INSTANCE:Lcom/ibotta/android/state/app/config/pat/-$$Lambda$PartnerAppTrackingConfig$HQh00pz3YR-pUu_clR9Fb6bHHEA;

    invoke-static {v1, v2, v3}, Ljava9/util/stream/Collectors;->toUnmodifiableMap(Ljava9/util/function/Function;Ljava9/util/function/Function;Ljava9/util/function/BinaryOperator;)Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getPartnerApps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;->partnerApps:Ljava/util/List;

    return-object v0
.end method

.method public setPartnerApps(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo;",
            ">;)V"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;->partnerApps:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;->partnerApps:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method
