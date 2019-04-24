.class public Lcom/ibotta/api/model/content/DealContent;
.super Lcom/ibotta/api/model/base/BaseContent;
.source "DealContent.java"

# interfaces
.implements Lcom/ibotta/api/model/DealModel;


# instance fields
.field private actionButtonText:Ljava/lang/String;

.field private actionButtonType:Ljava/lang/String;

.field private buttonInfo:Ljava/lang/String;

.field private cacheKey:Ljava/lang/String;

.field private callbackUrl:Ljava/lang/String;

.field private deeplinkUrl:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private endTime:Ljava/lang/String;

.field private imageUrlLarge:Ljava/lang/String;

.field private imageUrlSmall:Ljava/lang/String;

.field private imageUrlThumbnail:Ljava/lang/String;

.field private percentBackText:Ljava/lang/String;

.field private price:F

.field private retailerId:I

.field private sortResults:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;"
        }
    .end annotation
.end field

.field private startTime:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/ibotta/api/model/base/BaseContent;-><init>()V

    return-void
.end method


# virtual methods
.method public getActionButtonText()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->actionButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public getActionButtonType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->actionButtonType:Ljava/lang/String;

    return-object v0
.end method

.method public getButtonInfo()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->buttonInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->cacheKey:Ljava/lang/String;

    return-object v0
.end method

.method public getCallbackUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->callbackUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getDeeplinkUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->deeplinkUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrlLarge()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->imageUrlLarge:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrlSmall()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 114
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->imageUrlSmall:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrlThumbnail()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->imageUrlThumbnail:Ljava/lang/String;

    return-object v0
.end method

.method public getPercentBackText()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->percentBackText:Ljava/lang/String;

    return-object v0
.end method

.method public getPrice()F
    .locals 1

    .line 141
    iget v0, p0, Lcom/ibotta/api/model/content/DealContent;->price:F

    return v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 150
    iget v0, p0, Lcom/ibotta/api/model/content/DealContent;->retailerId:I

    return v0
.end method

.method public getSortResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 168
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->sortResults:Ljava/util/List;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/ibotta/api/model/content/DealContent;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public setActionButtonText(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->actionButtonText:Ljava/lang/String;

    return-void
.end method

.method public setActionButtonType(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->actionButtonType:Ljava/lang/String;

    return-void
.end method

.method public setButtonInfo(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->buttonInfo:Ljava/lang/String;

    return-void
.end method

.method public setCacheKey(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->cacheKey:Ljava/lang/String;

    return-void
.end method

.method public setCallbackUrl(Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->callbackUrl:Ljava/lang/String;

    return-void
.end method

.method public setDeeplinkUrl(Ljava/lang/String;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->deeplinkUrl:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->description:Ljava/lang/String;

    return-void
.end method

.method public setEndTime(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->endTime:Ljava/lang/String;

    return-void
.end method

.method public setImageUrlLarge(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->imageUrlLarge:Ljava/lang/String;

    return-void
.end method

.method public setImageUrlSmall(Ljava/lang/String;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->imageUrlSmall:Ljava/lang/String;

    return-void
.end method

.method public setImageUrlThumbnail(Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->imageUrlThumbnail:Ljava/lang/String;

    return-void
.end method

.method public setPercentBackText(Ljava/lang/String;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->percentBackText:Ljava/lang/String;

    return-void
.end method

.method public setPrice(F)V
    .locals 0

    .line 145
    iput p1, p0, Lcom/ibotta/api/model/content/DealContent;->price:F

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 154
    iput p1, p0, Lcom/ibotta/api/model/content/DealContent;->retailerId:I

    return-void
.end method

.method public setSortResults(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;)V"
        }
    .end annotation

    .line 172
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->sortResults:Ljava/util/List;

    return-void
.end method

.method public setStartTime(Ljava/lang/String;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/ibotta/api/model/content/DealContent;->startTime:Ljava/lang/String;

    return-void
.end method
