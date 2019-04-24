.class public Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleHelper;
.super Ljava/lang/Object;
.source "OnboardingModuleHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convertToOnboardingModulesParcels(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Parcelable;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;",
            ">;"
        }
    .end annotation

    .line 39
    invoke-static {p0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p0

    sget-object v0, Lcom/ibotta/android/fragment/onboardingmodule/-$$Lambda$OnboardingModuleHelper$igEoCATEn0bu7_dtnXghgIPVGqo;->INSTANCE:Lcom/ibotta/android/fragment/onboardingmodule/-$$Lambda$OnboardingModuleHelper$igEoCATEn0bu7_dtnXghgIPVGqo;

    .line 40
    invoke-interface {p0, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p0

    .line 41
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static convertToOnboardingRetailerParcel(Lcom/ibotta/api/model/retailer/OnboardingRetailer;)Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;
    .locals 4

    .line 18
    new-instance v0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    .line 19
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->getId()I

    move-result v1

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->getName()Ljava/lang/String;

    move-result-object v2

    .line 21
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->getDescription()Ljava/lang/String;

    move-result-object v3

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->getModelCImageUrl()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static convertToOnboardingRetailerParcels(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/OnboardingRetailer;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;",
            ">;"
        }
    .end annotation

    .line 27
    invoke-static {p0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p0

    sget-object v0, Lcom/ibotta/android/fragment/onboardingmodule/-$$Lambda$OnboardingModuleHelper$enfX-d-UDeB2-gRx8t3OBwLe56M;->INSTANCE:Lcom/ibotta/android/fragment/onboardingmodule/-$$Lambda$OnboardingModuleHelper$enfX-d-UDeB2-gRx8t3OBwLe56M;

    .line 28
    invoke-interface {p0, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p0

    .line 29
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static convertToParcelableArrayList(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation

    .line 33
    invoke-static {p0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p0

    sget-object v0, Lcom/ibotta/android/fragment/onboardingmodule/-$$Lambda$bLZZMZ8CWUZqeZrg8favPf3pfP0;->INSTANCE:Lcom/ibotta/android/fragment/onboardingmodule/-$$Lambda$bLZZMZ8CWUZqeZrg8favPf3pfP0;

    .line 34
    invoke-interface {p0, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p0

    sget-object v0, Lcom/ibotta/android/fragment/onboardingmodule/-$$Lambda$ILvrQO_GoLxMQig4crYMbBHjVAw;->INSTANCE:Lcom/ibotta/android/fragment/onboardingmodule/-$$Lambda$ILvrQO_GoLxMQig4crYMbBHjVAw;

    .line 35
    invoke-static {v0}, Ljava9/util/stream/Collectors;->toCollection(Ljava9/util/function/Supplier;)Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic lambda$convertToOnboardingModulesParcels$0(Landroid/os/Parcelable;)Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;
    .locals 0

    .line 40
    invoke-static {p0}, Lorg/parceler/Parcels;->unwrap(Landroid/os/Parcelable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    return-object p0
.end method

.method public static synthetic lambda$enfX-d-UDeB2-gRx8t3OBwLe56M(Lcom/ibotta/api/model/retailer/OnboardingRetailer;)Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;
    .locals 0

    invoke-static {p0}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleHelper;->convertToOnboardingRetailerParcel(Lcom/ibotta/api/model/retailer/OnboardingRetailer;)Lcom/ibotta/android/fragment/onboardingmodule/OnboardingRetailerParcel;

    move-result-object p0

    return-object p0
.end method
