.class abstract Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;
.super Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;
.source "$AutoValue_McommEscortParamsParcel.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;
    }
.end annotation


# instance fields
.field private final dealId:Ljava/lang/String;

.field private final eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

.field private final offerId:Ljava/lang/Integer;

.field private final productId:Ljava/lang/String;

.field private final retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private final searchTerm:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->dealId:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->productId:Ljava/lang/String;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->searchTerm:Ljava/lang/String;

    .line 30
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->offerId:Ljava/lang/Integer;

    if-eqz p5, :cond_1

    .line 34
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    if-eqz p6, :cond_0

    .line 38
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null retailerParcel"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 32
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null eventContext"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 92
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    .line 93
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->dealId:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getDealId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getDealId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->productId:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getProductId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getProductId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->searchTerm:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getSearchTerm()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getSearchTerm()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->offerId:Ljava/lang/Integer;

    if-nez v1, :cond_4

    .line 97
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 98
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 99
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    :goto_4
    return v0

    :cond_6
    return v2
.end method

.method public getDealId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->dealId:Ljava/lang/String;

    return-object v0
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method public getOfferId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->offerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method public getSearchTerm()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->searchTerm:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->dealId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int v0, v0, v2

    .line 110
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->productId:Ljava/lang/String;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 112
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->searchTerm:Ljava/lang/String;

    if-nez v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 114
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->offerId:Ljava/lang/Integer;

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    :goto_3
    xor-int/2addr v0, v1

    mul-int v0, v0, v2

    .line 116
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    mul-int v0, v0, v2

    .line 118
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method toBuilder()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    .locals 2

    .line 124
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "McommEscortParamsParcel{dealId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->dealId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", productId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", searchTerm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->searchTerm:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", offerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->offerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", eventContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerParcel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
