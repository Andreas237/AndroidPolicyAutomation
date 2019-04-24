.class public Lcom/ibotta/api/model/retailer/Category;
.super Ljava/lang/Object;
.source "Category.java"

# interfaces
.implements Lcom/ibotta/api/ContentEventTrackable;
.implements Lcom/ibotta/api/PixelTrackable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/api/ContentEventTrackable;",
        "Lcom/ibotta/api/PixelTrackable;",
        "Ljava/lang/Comparable<",
        "Lcom/ibotta/api/model/retailer/Category;",
        ">;"
    }
.end annotation


# instance fields
.field private categorySetting:Lcom/ibotta/api/model/retailer/RetailerCategorySetting;

.field private categoryType:Ljava/lang/String;

.field private transient categoryTypeEnum:Lcom/ibotta/api/model/retailer/CategoryType;

.field private features:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/feature/Feature;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation
.end field

.field private iconUrl:Ljava/lang/String;

.field private id:I

.field private imageUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private sortOrder:F

.field private targetCategories:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private trackingClickUrl:Ljava/lang/String;

.field private trackingImpressionUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->features:Ljava/util/List;

    .line 37
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->targetCategories:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/ibotta/api/model/retailer/Category;)I
    .locals 2

    .line 146
    invoke-virtual {p0, p1}, Lcom/ibotta/api/model/retailer/Category;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 150
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Category;->getSortOrder()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getSortOrder()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Float;->compareTo(Ljava/lang/Float;)I

    move-result v0

    mul-int/lit8 v0, v0, -0x1

    if-nez v0, :cond_1

    .line 153
    iget v0, p0, Lcom/ibotta/api/model/retailer/Category;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/api/model/retailer/Category;

    invoke-virtual {p0, p1}, Lcom/ibotta/api/model/retailer/Category;->compareTo(Lcom/ibotta/api/model/retailer/Category;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ne p1, p0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 176
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    .line 179
    :cond_2
    check-cast p1, Lcom/ibotta/api/model/retailer/Category;

    .line 180
    new-instance v0, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    invoke-direct {v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;-><init>()V

    iget v1, p0, Lcom/ibotta/api/model/retailer/Category;->id:I

    iget v2, p1, Lcom/ibotta/api/model/retailer/Category;->id:I

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(II)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/api/model/retailer/Category;->name:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/api/model/retailer/Category;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/api/model/retailer/Category;->sortOrder:F

    iget p1, p1, Lcom/ibotta/api/model/retailer/Category;->sortOrder:F

    .line 181
    invoke-virtual {v0, v1, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(FF)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result p1

    return p1
.end method

.method public getCategorySetting()Lcom/ibotta/api/model/retailer/RetailerCategorySetting;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->categorySetting:Lcom/ibotta/api/model/retailer/RetailerCategorySetting;

    return-object v0
.end method

.method public getCategoryType()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->categoryType:Ljava/lang/String;

    return-object v0
.end method

.method public getCategoryTypeEnum()Lcom/ibotta/api/model/retailer/CategoryType;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->categoryTypeEnum:Lcom/ibotta/api/model/retailer/CategoryType;

    if-eqz v0, :cond_0

    return-object v0

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->categoryType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/retailer/CategoryType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/retailer/CategoryType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->categoryTypeEnum:Lcom/ibotta/api/model/retailer/CategoryType;

    .line 109
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->categoryTypeEnum:Lcom/ibotta/api/model/retailer/CategoryType;

    return-object v0
.end method

.method public getFeatures()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation

    .line 129
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->features:Ljava/util/List;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/ibotta/api/model/retailer/Category;->id:I

    return v0
.end method

.method public getIdString()Ljava/lang/String;
    .locals 1

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()F
    .locals 1

    .line 69
    iget v0, p0, Lcom/ibotta/api/model/retailer/Category;->sortOrder:F

    return v0
.end method

.method public getTargetCategories()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 137
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->targetCategories:Ljava/util/Set;

    return-object v0
.end method

.method public getTrackingClickUrl()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->trackingClickUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingImpressionUrl()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Category;->trackingImpressionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 164
    new-instance v0, Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    const/16 v1, 0x1e4d

    const/16 v2, 0x12c1

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;-><init>(II)V

    iget v1, p0, Lcom/ibotta/api/model/retailer/Category;->id:I

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(I)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/api/model/retailer/Category;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/api/model/retailer/Category;->sortOrder:F

    .line 165
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(F)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->toHashCode()I

    move-result v0

    return v0
.end method

.method public setCategorySetting(Lcom/ibotta/api/model/retailer/RetailerCategorySetting;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Category;->categorySetting:Lcom/ibotta/api/model/retailer/RetailerCategorySetting;

    return-void
.end method

.method public setCategoryType(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Category;->categoryType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 100
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Category;->categoryTypeEnum:Lcom/ibotta/api/model/retailer/CategoryType;

    return-void
.end method

.method public setFeatures(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;)V"
        }
    .end annotation

    .line 133
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Category;->features:Ljava/util/List;

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Category;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 49
    iput p1, p0, Lcom/ibotta/api/model/retailer/Category;->id:I

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Category;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Category;->name:Ljava/lang/String;

    return-void
.end method

.method public setSortOrder(F)V
    .locals 0

    .line 73
    iput p1, p0, Lcom/ibotta/api/model/retailer/Category;->sortOrder:F

    return-void
.end method

.method public setTargetCategories(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 141
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Category;->targetCategories:Ljava/util/Set;

    return-void
.end method

.method public setTrackingClickUrl(Ljava/lang/String;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Category;->trackingClickUrl:Ljava/lang/String;

    return-void
.end method

.method public setTrackingImpressionUrl(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Category;->trackingImpressionUrl:Ljava/lang/String;

    return-void
.end method
