.class public final Lcom/microblink/internal/services/amazon/AmazonProduct;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private asin:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "asin"
    .end annotation
.end field

.field private brand:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "brand"
    .end annotation
.end field

.field private category:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "category"
    .end annotation
.end field

.field private competitorRewardsGroup:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "competitor_rewards_group"
    .end annotation
.end field

.field private description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "desc"
    .end annotation
.end field

.field private imageUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "image_url"
    .end annotation
.end field

.field private price:F
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "price"
    .end annotation
.end field

.field private productName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "product_name"
    .end annotation
.end field

.field private qty:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "qty"
    .end annotation
.end field

.field private rewardsGroup:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rewards_group"
    .end annotation
.end field

.field private size:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "size"
    .end annotation
.end field

.field private upc:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "upc"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/microblink/internal/services/amazon/AmazonProduct;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/services/amazon/AmazonProduct;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->asin:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->asin:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->description:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->description:Ljava/lang/String;

    iget v0, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->price:F

    iput v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->price:F

    iget v0, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->qty:I

    iput v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->qty:I

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->brand:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->brand:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->category:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->category:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->upc:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->upc:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->imageUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->imageUrl:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->productName:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->productName:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->size:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->size:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->rewardsGroup:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->rewardsGroup:Ljava/lang/String;

    iget-object p1, p1, Lcom/microblink/internal/services/amazon/AmazonProduct;->competitorRewardsGroup:Ljava/lang/String;

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->competitorRewardsGroup:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final asin()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->asin:Ljava/lang/String;

    return-object v0
.end method

.method public final brand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public final brand(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->brand:Ljava/lang/String;

    return-void
.end method

.method public final category()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final category(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->category:Ljava/lang/String;

    return-void
.end method

.method public final competitorRewardsGroup()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->competitorRewardsGroup:Ljava/lang/String;

    return-object v0
.end method

.method public final competitorRewardsGroup(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->competitorRewardsGroup:Ljava/lang/String;

    return-void
.end method

.method public final description()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final imageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final imageUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public final price()F
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->price:F

    return v0
.end method

.method public final productName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->productName:Ljava/lang/String;

    return-object v0
.end method

.method public final productName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->productName:Ljava/lang/String;

    return-void
.end method

.method public final qty()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->qty:I

    return v0
.end method

.method public final rewardsGroup()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->rewardsGroup:Ljava/lang/String;

    return-object v0
.end method

.method public final rewardsGroup(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->rewardsGroup:Ljava/lang/String;

    return-void
.end method

.method public final size()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->size:Ljava/lang/String;

    return-object v0
.end method

.method public final size(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->size:Ljava/lang/String;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AmazonProduct{asin=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->asin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", description=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->description:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", price="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->price:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", qty="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->qty:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", brand=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->brand:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", category=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->category:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", upc=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->upc:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", imageUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", productName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->productName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", size=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->size:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", rewardsGroup=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->rewardsGroup:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", competitorRewardsGroup=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->competitorRewardsGroup:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final upc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->upc:Ljava/lang/String;

    return-object v0
.end method

.method public final upc(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonProduct;->upc:Ljava/lang/String;

    return-void
.end method
