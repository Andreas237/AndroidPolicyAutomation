.class public Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupportImpl;
.super Ljava/lang/Object;
.source "WindfallRetailerSupportImpl.java"

# interfaces
.implements Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$getWindfallRetailer$0(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/windfall/retailer/WindfallRetailer;)Z
    .locals 0

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->getIbottaRetailerId()I

    move-result p1

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result p0

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public getWindfallRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/microblink/Retailer;
    .locals 2
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 20
    sget-object p1, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    return-object p1

    .line 25
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isBarcode()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v0

    sget-object v1, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->WALMART:Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    invoke-virtual {v1}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->getIbottaRetailerId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 29
    sget-object p1, Lcom/microblink/Retailer;->WALMART_QR:Lcom/microblink/Retailer;

    goto :goto_0

    .line 31
    :cond_1
    invoke-static {}, Lcom/ibotta/android/windfall/retailer/WindfallRetailer;->values()[Lcom/ibotta/android/windfall/retailer/WindfallRetailer;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/J8Arrays;->stream([Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/windfall/retailer/-$$Lambda$WindfallRetailerSupportImpl$GS32PEAPGgNGG04xytaIgNVtlfI;

    invoke-direct {v1, p1}, Lcom/ibotta/android/windfall/retailer/-$$Lambda$WindfallRetailerSupportImpl$GS32PEAPGgNGG04xytaIgNVtlfI;-><init>(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 32
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 33
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/windfall/retailer/-$$Lambda$wF3YtONBy6O0SNRB3ucchILnkQk;->INSTANCE:Lcom/ibotta/android/windfall/retailer/-$$Lambda$wF3YtONBy6O0SNRB3ucchILnkQk;

    .line 34
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    .line 35
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/Retailer;

    :goto_0
    return-object p1
.end method

.method public isWalmartQr(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z
    .locals 1
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 43
    invoke-virtual {p0, p1}, Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupportImpl;->getWindfallRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/microblink/Retailer;

    move-result-object p1

    sget-object v0, Lcom/microblink/Retailer;->WALMART_QR:Lcom/microblink/Retailer;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isWindfallRetailerMapping(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z
    .locals 1
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 48
    invoke-virtual {p0, p1}, Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupportImpl;->getWindfallRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/microblink/Retailer;

    move-result-object p1

    sget-object v0, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
