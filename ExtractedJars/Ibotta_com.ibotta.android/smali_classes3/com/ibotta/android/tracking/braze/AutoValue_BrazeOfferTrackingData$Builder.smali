.class final Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;
.super Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
.source "AutoValue_BrazeOfferTrackingData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private amount:Ljava/lang/Float;

.field private description:Ljava/lang/String;

.field private expiration:Ljava/util/Date;

.field private id:Ljava/lang/Integer;

.field private name:Ljava/lang/String;

.field private offerImage:Ljava/lang/String;

.field private redemptionMax:Ljava/lang/Short;

.field private shareUrl:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 148
    invoke-direct {p0}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public amount(F)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .locals 0

    .line 162
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->amount:Ljava/lang/Float;

    return-object p0
.end method

.method public build()Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;
    .locals 12

    const-string v0, ""

    .line 193
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->id:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 194
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " id"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 196
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->amount:Ljava/lang/Float;

    if-nez v1, :cond_1

    .line 197
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " amount"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 199
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->redemptionMax:Ljava/lang/Short;

    if-nez v1, :cond_2

    .line 200
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " redemptionMax"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 202
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 205
    new-instance v0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->id:Ljava/lang/Integer;

    .line 206
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->name:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->amount:Ljava/lang/Float;

    .line 208
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    iget-object v6, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->description:Ljava/lang/String;

    iget-object v7, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->expiration:Ljava/util/Date;

    iget-object v8, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->shareUrl:Ljava/lang/String;

    iget-object v9, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->offerImage:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->redemptionMax:Ljava/lang/Short;

    .line 213
    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    move-result v10

    const/4 v11, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;-><init>(ILjava/lang/String;FLjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;SLcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$1;)V

    return-object v0

    .line 203
    :cond_3
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

.method public description(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 167
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->description:Ljava/lang/String;

    return-object p0
.end method

.method public expiration(Ljava/util/Date;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 172
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->expiration:Ljava/util/Date;

    return-object p0
.end method

.method public id(I)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .locals 0

    .line 152
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->id:Ljava/lang/Integer;

    return-object p0
.end method

.method public name(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 157
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public offerImage(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 182
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->offerImage:Ljava/lang/String;

    return-object p0
.end method

.method public redemptionMax(S)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .locals 0

    .line 187
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->redemptionMax:Ljava/lang/Short;

    return-object p0
.end method

.method public shareUrl(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 177
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;->shareUrl:Ljava/lang/String;

    return-object p0
.end method
