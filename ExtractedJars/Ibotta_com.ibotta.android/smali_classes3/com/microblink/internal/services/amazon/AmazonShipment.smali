.class public final Lcom/microblink/internal/services/amazon/AmazonShipment;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private products:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "products"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/amazon/AmazonProduct;",
            ">;"
        }
    .end annotation
.end field

.field private seeAllLink:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "seeAllLink"
    .end annotation
.end field

.field private status:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "status"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/microblink/internal/services/amazon/AmazonShipment;)V
    .locals 3
    .param p1    # Lcom/microblink/internal/services/amazon/AmazonShipment;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonShipment;->status:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonShipment;->status:Ljava/lang/String;

    iget-object p1, p1, Lcom/microblink/internal/services/amazon/AmazonShipment;->products:Ljava/util/List;

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonShipment;->products:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/amazon/AmazonProduct;

    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonShipment;->products:Ljava/util/List;

    new-instance v2, Lcom/microblink/internal/services/amazon/AmazonProduct;

    invoke-direct {v2, v0}, Lcom/microblink/internal/services/amazon/AmazonProduct;-><init>(Lcom/microblink/internal/services/amazon/AmazonProduct;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final products()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/amazon/AmazonProduct;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonShipment;->products:Ljava/util/List;

    return-object v0
.end method

.method public final seeAllLink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonShipment;->seeAllLink:Ljava/lang/String;

    return-object v0
.end method

.method public final status()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonShipment;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AmazonShipment{status=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonShipment;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", seeAllLink=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonShipment;->seeAllLink:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", products="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonShipment;->products:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
