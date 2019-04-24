.class public Lcom/ibotta/android/mvp/ui/activity/im/ImUtilImpl;
.super Ljava/lang/Object;
.source "ImUtilImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getImConnectionStatusForRetailer(ILjava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/im/CredentialIntegration;",
            ">;)",
            "Lcom/ibotta/api/model/im/ImConnectionStatus;"
        }
    .end annotation

    .line 73
    invoke-static {p2}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p2

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUtilImpl$KJjRtF_0uWKkfjXmJOhZ3N4o5MQ;

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUtilImpl$KJjRtF_0uWKkfjXmJOhZ3N4o5MQ;-><init>(I)V

    .line 74
    invoke-interface {p2, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object p2, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$XNYB1Z9NsJaCxjTJ9q9fhLZyyOE;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$XNYB1Z9NsJaCxjTJ9q9fhLZyyOE;

    .line 75
    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 76
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    sget-object p2, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    .line 77
    invoke-virtual {p1, p2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/im/ImConnectionStatus;

    return-object p1
.end method

.method static synthetic lambda$getFormattedRetailerHost$0(Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    const-string v0, "\\."

    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$getFormattedRetailerHost$1([Ljava/lang/String;)Z
    .locals 1

    .line 27
    array-length p0, p0

    const/4 v0, 0x2

    if-lt p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic lambda$getFormattedRetailerHost$2([Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 29
    array-length v0, p0

    add-int/lit8 v0, v0, -0x2

    aget-object v0, p0, v0

    .line 30
    array-length v1, p0

    add-int/lit8 v1, v1, -0x1

    aget-object p0, p0, v1

    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$getFormattedRetailerHost$3(Ljava/lang/String;)Z
    .locals 0

    .line 33
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method static synthetic lambda$getImConnectionStatusForRetailer$4(ILcom/ibotta/api/model/im/CredentialIntegration;)Z
    .locals 0

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/api/model/im/CredentialIntegration;->getRetailerId()I

    move-result p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public getBeginIndex(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 40
    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public getEndIndex(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 45
    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p2, p1

    return p2
.end method

.method public getFormattedRetailerHost(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
    .locals 2

    .line 21
    invoke-static {p1}, Ljava9/util/Optional;->of(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$QLy-4f96F9B9MlREitbL2kY09iA;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$QLy-4f96F9B9MlREitbL2kY09iA;

    .line 22
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$kXgGkMGgsbkl-v1OkT4e6aPtCpQ;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$kXgGkMGgsbkl-v1OkT4e6aPtCpQ;

    .line 23
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$gqQrxPeveE_Wtr29sIRFBACT67M;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$gqQrxPeveE_Wtr29sIRFBACT67M;

    .line 24
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$jKflzdTV9rMFF0HK6Q89oOEBnp8;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$jKflzdTV9rMFF0HK6Q89oOEBnp8;

    .line 25
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUtilImpl$ga9VJdBbD0fiWySn00_pv6WP-jk;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUtilImpl$ga9VJdBbD0fiWySn00_pv6WP-jk;

    .line 26
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUtilImpl$xsCc3QHetNseHEoG7gCCbSrgH0k;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUtilImpl$xsCc3QHetNseHEoG7gCCbSrgH0k;

    .line 27
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->filter(Ljava9/util/function/Predicate;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUtilImpl$Ik-ymrikrAxn9BqCT_xV7AFq-PU;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUtilImpl$Ik-ymrikrAxn9BqCT_xV7AFq-PU;

    .line 28
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUtilImpl$Nzl9gjJ_jzfU2n1p9k4rbmOQzy8;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUtilImpl$Nzl9gjJ_jzfU2n1p9k4rbmOQzy8;

    .line 33
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->filter(Ljava9/util/function/Predicate;)Ljava9/util/Optional;

    move-result-object v0

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public getImConnectionStatusForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/im/CredentialIntegration;",
            ">;)",
            "Lcom/ibotta/api/model/im/ImConnectionStatus;"
        }
    .end annotation

    .line 51
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result p1

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtilImpl;->getImConnectionStatusForRetailer(ILjava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object p1

    return-object p1
.end method

.method public getImConnectionStatusForRetailer(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/im/CredentialIntegration;",
            ">;)",
            "Lcom/ibotta/api/model/im/ImConnectionStatus;"
        }
    .end annotation

    .line 57
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtilImpl;->getImConnectionStatusForRetailer(ILjava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object p1

    return-object p1
.end method

.method public shouldShowImRedeem(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 3
    .param p1    # Lcom/ibotta/api/model/customer/Customer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 65
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getCredentialIntegrations()Ljava/util/List;

    move-result-object p1

    .line 64
    invoke-virtual {p0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtilImpl;->getImConnectionStatusForRetailer(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object p1

    .line 66
    sget-object v2, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    if-eq p1, v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 68
    :goto_0
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->isAuxiliaryLoyaltyEnabled()Z

    move-result p2

    if-eqz p2, :cond_2

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method
