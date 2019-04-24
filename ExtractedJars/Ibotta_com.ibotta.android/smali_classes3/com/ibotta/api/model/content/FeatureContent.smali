.class public Lcom/ibotta/api/model/content/FeatureContent;
.super Lcom/ibotta/api/model/base/BaseContent;
.source "FeatureContent.java"

# interfaces
.implements Lcom/ibotta/api/model/FeatureModel;


# instance fields
.field private bgcolor:Ljava/lang/String;

.field private bigImg:Ljava/lang/String;

.field private cacheKey:Ljava/lang/String;

.field private categoryImg:Ljava/lang/String;

.field private context:Ljava/lang/String;

.field private expiration:Ljava/util/Date;

.field private featureType:Ljava/lang/String;

.field private link:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private sortOrder:Ljava/lang/String;

.field private sortResults:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/content/SortResultContent;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;"
        }
    .end annotation
.end field

.field private trackingClickUrl:Ljava/lang/String;

.field private trackingImpressionUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/ibotta/api/model/base/BaseContent;-><init>()V

    return-void
.end method


# virtual methods
.method public getBgcolor()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->bgcolor:Ljava/lang/String;

    return-object v0
.end method

.method public getBigImg()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->bigImg:Ljava/lang/String;

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->cacheKey:Ljava/lang/String;

    return-object v0
.end method

.method public getCategoryImg()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->categoryImg:Ljava/lang/String;

    return-object v0
.end method

.method public getContext()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->context:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiration()Ljava/util/Date;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->expiration:Ljava/util/Date;

    return-object v0
.end method

.method public getFeatureType()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->featureType:Ljava/lang/String;

    return-object v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->link:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->sortOrder:Ljava/lang/String;

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

    .line 116
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->sortResults:Ljava/util/List;

    return-object v0
.end method

.method public getTrackingClickUrl()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->trackingClickUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingImpressionUrl()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/ibotta/api/model/content/FeatureContent;->trackingImpressionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public setBgcolor(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->bgcolor:Ljava/lang/String;

    return-void
.end method

.method public setBigImg(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->bigImg:Ljava/lang/String;

    return-void
.end method

.method public setCacheKey(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->cacheKey:Ljava/lang/String;

    return-void
.end method

.method public setCategoryImg(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->categoryImg:Ljava/lang/String;

    return-void
.end method

.method public setContext(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->context:Ljava/lang/String;

    return-void
.end method

.method public setExpiration(Ljava/util/Date;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->expiration:Ljava/util/Date;

    return-void
.end method

.method public setFeatureType(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->featureType:Ljava/lang/String;

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->link:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->name:Ljava/lang/String;

    return-void
.end method

.method public setSortOrder(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->sortOrder:Ljava/lang/String;

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

    .line 120
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->sortResults:Ljava/util/List;

    return-void
.end method

.method public setTrackingClickUrl(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->trackingClickUrl:Ljava/lang/String;

    return-void
.end method

.method public setTrackingImpressionUrl(Ljava/lang/String;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/ibotta/api/model/content/FeatureContent;->trackingImpressionUrl:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 152
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "%1$d %2$s %3$s %4$s"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/ibotta/api/model/content/FeatureContent;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lcom/ibotta/api/model/content/FeatureContent;->getType()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lcom/ibotta/api/model/content/FeatureContent;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lcom/ibotta/api/model/content/FeatureContent;->getBigImg()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
