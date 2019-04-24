.class final Lcom/ibotta/api/model/content/AutoValue_CustomerNode;
.super Lcom/ibotta/api/model/content/CustomerNode;
.source "AutoValue_CustomerNode.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/content/AutoValue_CustomerNode$Builder;
    }
.end annotation


# instance fields
.field private final favoriteRetailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/RetailerContent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/RetailerContent;",
            ">;)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Lcom/ibotta/api/model/content/CustomerNode;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/api/model/content/AutoValue_CustomerNode;->favoriteRetailers:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Lcom/ibotta/api/model/content/AutoValue_CustomerNode$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/ibotta/api/model/content/AutoValue_CustomerNode;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 35
    :cond_0
    instance-of v0, p1, Lcom/ibotta/api/model/content/CustomerNode;

    if-eqz v0, :cond_1

    .line 36
    check-cast p1, Lcom/ibotta/api/model/content/CustomerNode;

    .line 37
    iget-object v0, p0, Lcom/ibotta/api/model/content/AutoValue_CustomerNode;->favoriteRetailers:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/api/model/content/CustomerNode;->getFavoriteRetailers()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getFavoriteRetailers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/RetailerContent;",
            ">;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/ibotta/api/model/content/AutoValue_CustomerNode;->favoriteRetailers:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/ibotta/api/model/content/AutoValue_CustomerNode;->favoriteRetailers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CustomerNode{favoriteRetailers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_CustomerNode;->favoriteRetailers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
