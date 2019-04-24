.class final Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;
.super Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;
.source "AutoValue_ProductSpotlightTopContentViewState.java"


# instance fields
.field private final description:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;-><init>()V

    if-eqz p1, :cond_1

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;->description:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;->imageUrl:Ljava/lang/String;

    return-void

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null imageUrl"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null description"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 49
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 50
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;

    .line 51
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;->description:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;->imageUrl:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;->description:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 63
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;->imageUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ProductSpotlightTopContentViewState{description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/AutoValue_ProductSpotlightTopContentViewState;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
