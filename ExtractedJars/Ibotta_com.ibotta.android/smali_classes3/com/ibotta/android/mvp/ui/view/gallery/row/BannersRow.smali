.class public Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;
.super Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;
.source "BannersRow.java"


# instance fields
.field private eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

.field private features:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation
.end field

.field private retailerCategoryId:I

.field private retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->BANNERS:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;)V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->features:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

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

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->features:Ljava/util/List;

    return-object v0
.end method

.method public getRetailerCategoryId()I
    .locals 1

    .line 45
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->retailerCategoryId:I

    return v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

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

    if-eqz p1, :cond_0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->features:Ljava/util/List;

    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->features:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :goto_0
    return-void
.end method

.method public setRetailerCategoryId(I)V
    .locals 0

    .line 49
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->retailerCategoryId:I

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->retailerId:Ljava/lang/Integer;

    return-void
.end method
