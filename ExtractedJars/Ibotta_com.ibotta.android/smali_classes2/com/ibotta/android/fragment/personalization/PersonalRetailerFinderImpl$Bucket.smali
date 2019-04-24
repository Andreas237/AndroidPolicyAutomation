.class public Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;
.super Ljava/lang/Object;
.source "PersonalRetailerFinderImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Bucket"
.end annotation


# instance fields
.field private final category:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;

.field private retailerModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;)V
    .locals 1

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 235
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->retailerModels:Ljava/util/List;

    .line 238
    iput-object p1, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->category:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;

    return-void
.end method


# virtual methods
.method public addRetailer(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 250
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->isFull()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->retailerModels:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getCategory()Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->category:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;

    return-object v0
.end method

.method public getRetailerModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->retailerModels:Ljava/util/List;

    return-object v0
.end method

.method public isFull()Z
    .locals 3

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->category:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->getNumRetailers()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->category:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->getNumRetailers()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 259
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->retailerModels:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v2, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
