.class public Lcom/ibotta/api/model/feature/Feature;
.super Ljava/lang/Object;
.source "Feature.java"

# interfaces
.implements Lcom/ibotta/api/PixelTrackable;
.implements Lcom/ibotta/api/model/FeatureModel;


# instance fields
.field private actionText:Ljava/lang/String;

.field private bgcolor:Ljava/lang/String;

.field private bigImg:Ljava/lang/String;

.field private categoryImg:Ljava/lang/String;

.field private context:Ljava/lang/String;

.field private expiration:Ljava/util/Date;

.field private featureType:Ljava/lang/String;

.field private id:I

.field private idString:Ljava/lang/String;

.field private retailerCategoryIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private sortOrder:F

.field private trackingClickUrl:Ljava/lang/String;

.field private trackingImpressionUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->retailerCategoryIds:Ljava/util/Set;

    return-void
.end method

.method public static copy(Lcom/ibotta/api/model/feature/Feature;Lcom/ibotta/api/model/feature/Feature;)V
    .locals 1

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 162
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/feature/Feature;->setId(I)V

    .line 163
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getBigImg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/feature/Feature;->setBigImg(Ljava/lang/String;)V

    .line 164
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getCategoryImg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/feature/Feature;->setCategoryImg(Ljava/lang/String;)V

    .line 165
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getBgcolor()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/feature/Feature;->setBgcolor(Ljava/lang/String;)V

    .line 166
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getContext()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/feature/Feature;->setContext(Ljava/lang/String;)V

    .line 167
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getSortOrder()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/feature/Feature;->setSortOrder(F)V

    .line 168
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getFeatureType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/feature/Feature;->setFeatureType(Ljava/lang/String;)V

    .line 169
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getRetailerCategoryIds()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/feature/Feature;->setRetailerCategoryIds(Ljava/util/Set;)V

    .line 170
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getActionText()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/ibotta/api/model/feature/Feature;->setActionText(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getActionText()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->actionText:Ljava/lang/String;

    return-object v0
.end method

.method public getBgcolor()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->bgcolor:Ljava/lang/String;

    return-object v0
.end method

.method public getBigImg()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->bigImg:Ljava/lang/String;

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCategoryImg()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->categoryImg:Ljava/lang/String;

    return-object v0
.end method

.method public getContext()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->context:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiration()Ljava/util/Date;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->expiration:Ljava/util/Date;

    return-object v0
.end method

.method public getFeatureType()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->featureType:Ljava/lang/String;

    return-object v0
.end method

.method public getFeatureTypeEnum()Lcom/ibotta/api/model/feature/FeatureType;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->featureType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/feature/FeatureType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/feature/FeatureType;

    move-result-object v0

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/ibotta/api/model/feature/Feature;->id:I

    return v0
.end method

.method public getIdString()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->idString:Ljava/lang/String;

    return-object v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1

    .line 175
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getContext()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRetailerCategoryIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 150
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->retailerCategoryIds:Ljava/util/Set;

    return-object v0
.end method

.method public getSortOrder()Ljava/lang/String;
    .locals 1

    .line 84
    iget v0, p0, Lcom/ibotta/api/model/feature/Feature;->sortOrder:F

    invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v0

    return-object v0
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

    .line 187
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public getTrackingClickUrl()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->trackingClickUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingImpressionUrl()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->trackingImpressionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public isExpired()Z
    .locals 6

    .line 141
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->expiration:Ljava/util/Date;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 142
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 143
    iget-object v0, p0, Lcom/ibotta/api/model/feature/Feature;->expiration:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    cmp-long v0, v4, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public setActionText(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/ibotta/api/model/feature/Feature;->actionText:Ljava/lang/String;

    return-void
.end method

.method public setBgcolor(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/api/model/feature/Feature;->bgcolor:Ljava/lang/String;

    return-void
.end method

.method public setBigImg(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/api/model/feature/Feature;->bigImg:Ljava/lang/String;

    return-void
.end method

.method public setCategoryImg(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/api/model/feature/Feature;->categoryImg:Ljava/lang/String;

    return-void
.end method

.method public setContext(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/api/model/feature/Feature;->context:Ljava/lang/String;

    return-void
.end method

.method public setExpiration(Ljava/util/Date;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/ibotta/api/model/feature/Feature;->expiration:Ljava/util/Date;

    return-void
.end method

.method public setFeatureType(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/ibotta/api/model/feature/Feature;->featureType:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/ibotta/api/model/feature/Feature;->id:I

    return-void
.end method

.method public setIdString(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/ibotta/api/model/feature/Feature;->idString:Ljava/lang/String;

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setRetailerCategoryIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 154
    iput-object p1, p0, Lcom/ibotta/api/model/feature/Feature;->retailerCategoryIds:Ljava/util/Set;

    return-void
.end method

.method public setSortOrder(F)V
    .locals 0

    .line 88
    iput p1, p0, Lcom/ibotta/api/model/feature/Feature;->sortOrder:F

    return-void
.end method

.method public setTrackingClickUrl(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/ibotta/api/model/feature/Feature;->trackingClickUrl:Ljava/lang/String;

    return-void
.end method

.method public setTrackingImpressionUrl(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/ibotta/api/model/feature/Feature;->trackingImpressionUrl:Ljava/lang/String;

    return-void
.end method
