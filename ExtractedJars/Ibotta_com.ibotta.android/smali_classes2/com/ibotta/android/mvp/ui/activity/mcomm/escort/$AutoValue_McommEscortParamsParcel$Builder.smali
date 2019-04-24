.class final Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
.source "$AutoValue_McommEscortParamsParcel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private dealId:Ljava/lang/String;

.field private eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

.field private offerId:Ljava/lang/Integer;

.field private productId:Ljava/lang/String;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private searchTerm:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 134
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;)V
    .locals 1

    .line 136
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;-><init>()V

    .line 137
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getDealId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->dealId:Ljava/lang/String;

    .line 138
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getProductId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->productId:Ljava/lang/String;

    .line 139
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getSearchTerm()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->searchTerm:Ljava/lang/String;

    .line 140
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->offerId:Ljava/lang/Integer;

    .line 141
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 142
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$1;)V
    .locals 0

    .line 127
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;
    .locals 9

    const-string v0, ""

    .line 183
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    if-nez v1, :cond_0

    .line 184
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " eventContext"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 186
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v1, :cond_1

    .line 187
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " retailerParcel"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 189
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 192
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->dealId:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->productId:Ljava/lang/String;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->searchTerm:Ljava/lang/String;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->offerId:Ljava/lang/Integer;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-object v0

    .line 190
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public dealId(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 146
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->dealId:Ljava/lang/String;

    return-object p0
.end method

.method protected eventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 169
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object p0

    .line 167
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null eventContext"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public offerId(Ljava/lang/Integer;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 161
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->offerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public productId(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 151
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->productId:Ljava/lang/String;

    return-object p0
.end method

.method protected retailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 177
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object p0

    .line 175
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null retailerParcel"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public searchTerm(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 156
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->searchTerm:Ljava/lang/String;

    return-object p0
.end method
