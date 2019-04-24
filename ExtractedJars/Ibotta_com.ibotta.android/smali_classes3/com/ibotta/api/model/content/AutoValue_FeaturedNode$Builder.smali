.class final Lcom/ibotta/api/model/content/AutoValue_FeaturedNode$Builder;
.super Lcom/ibotta/api/model/content/FeaturedNode$Builder;
.source "AutoValue_FeaturedNode.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/content/AutoValue_FeaturedNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private banners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation
.end field

.field private retailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/ibotta/api/model/content/FeaturedNode$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public banners(Ljava/util/List;)Lcom/ibotta/api/model/content/FeaturedNode$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;)",
            "Lcom/ibotta/api/model/content/FeaturedNode$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 74
    iput-object p1, p0, Lcom/ibotta/api/model/content/AutoValue_FeaturedNode$Builder;->banners:Ljava/util/List;

    return-object p0

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null banners"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public build()Lcom/ibotta/api/model/content/FeaturedNode;
    .locals 4

    const-string v0, ""

    .line 88
    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_FeaturedNode$Builder;->banners:Ljava/util/List;

    if-nez v1, :cond_0

    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " banners"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 91
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_FeaturedNode$Builder;->retailers:Ljava/util/List;

    if-nez v1, :cond_1

    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " retailers"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 94
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 97
    new-instance v0, Lcom/ibotta/api/model/content/AutoValue_FeaturedNode;

    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_FeaturedNode$Builder;->banners:Ljava/util/List;

    iget-object v2, p0, Lcom/ibotta/api/model/content/AutoValue_FeaturedNode$Builder;->retailers:Ljava/util/List;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/api/model/content/AutoValue_FeaturedNode;-><init>(Ljava/util/List;Ljava/util/List;Lcom/ibotta/api/model/content/AutoValue_FeaturedNode$1;)V

    return-object v0

    .line 95
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public retailers(Ljava/util/List;)Lcom/ibotta/api/model/content/FeaturedNode$Builder;
    .locals 1
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

    if-eqz p1, :cond_0

    .line 82
    iput-object p1, p0, Lcom/ibotta/api/model/content/AutoValue_FeaturedNode$Builder;->retailers:Ljava/util/List;

    return-object p0

    .line 80
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null retailers"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
