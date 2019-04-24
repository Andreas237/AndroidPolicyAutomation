.class public abstract Lcom/ibotta/api/model/content/FeaturedNode$Builder;
.super Ljava/lang/Object;
.source "FeaturedNode.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/content/FeaturedNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract banners(Ljava/util/List;)Lcom/ibotta/api/model/content/FeaturedNode$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;)",
            "Lcom/ibotta/api/model/content/FeaturedNode$Builder;"
        }
    .end annotation
.end method

.method public abstract build()Lcom/ibotta/api/model/content/FeaturedNode;
.end method

.method public abstract retailers(Ljava/util/List;)Lcom/ibotta/api/model/content/FeaturedNode$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Lcom/ibotta/api/model/content/FeaturedNode$Builder;"
        }
    .end annotation
.end method
