.class public abstract Lcom/ibotta/api/model/content/FeaturedNode;
.super Ljava/lang/Object;
.source "FeaturedNode.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/content/FeaturedNode$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/content/FeaturedNode$Builder;
    .locals 2

    .line 17
    new-instance v0, Lcom/ibotta/api/model/content/AutoValue_FeaturedNode$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/AutoValue_FeaturedNode$Builder;-><init>()V

    .line 18
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/AutoValue_FeaturedNode$Builder;->banners(Ljava/util/List;)Lcom/ibotta/api/model/content/FeaturedNode$Builder;

    move-result-object v0

    .line 19
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/FeaturedNode$Builder;->retailers(Ljava/util/List;)Lcom/ibotta/api/model/content/FeaturedNode$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getBanners()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRetailers()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method
