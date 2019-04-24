.class public Lcom/ibotta/api/model/personalization/PersonalizationCategory;
.super Ljava/lang/Object;
.source "PersonalizationCategory.java"


# instance fields
.field private id:I

.field private imageUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private sortOrder:F

.field private subText:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->id:I

    return v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()F
    .locals 1

    .line 49
    iget v0, p0, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->sortOrder:F

    return v0
.end method

.method public getSubText()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->subText:Ljava/lang/String;

    return-object v0
.end method

.method public setId(I)V
    .locals 0

    .line 21
    iput p1, p0, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->id:I

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->name:Ljava/lang/String;

    return-void
.end method

.method public setSortOrder(F)V
    .locals 0

    .line 53
    iput p1, p0, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->sortOrder:F

    return-void
.end method

.method public setSubText(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->subText:Ljava/lang/String;

    return-void
.end method
