.class public final Lcom/microblink/internal/services/amazon/AmazonOrder;
.super Ljava/lang/Object;


# instance fields
.field private dateUTC:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "dateUTC"
    .end annotation
.end field

.field private orderNumber:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "orderNum"
    .end annotation
.end field

.field private rawHtml:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "raw_html"
    .end annotation
.end field

.field private shipments:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "shipments"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/amazon/AmazonShipment;",
            ">;"
        }
    .end annotation
.end field

.field private shippingAddress:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "shippingAddress"
    .end annotation
.end field

.field private total:F
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/microblink/internal/services/amazon/AmazonOrder;)V
    .locals 2
    .param p1    # Lcom/microblink/internal/services/amazon/AmazonOrder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Lcom/microblink/internal/services/amazon/AmazonOrder;->dateUTC:J

    iput-wide v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->dateUTC:J

    iget v0, p1, Lcom/microblink/internal/services/amazon/AmazonOrder;->total:F

    iput v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->total:F

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonOrder;->orderNumber:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->orderNumber:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonOrder;->shipments:Ljava/util/List;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->shipments:Ljava/util/List;

    iget-object v0, p1, Lcom/microblink/internal/services/amazon/AmazonOrder;->rawHtml:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->rawHtml:Ljava/lang/String;

    iget-object p1, p1, Lcom/microblink/internal/services/amazon/AmazonOrder;->shippingAddress:Ljava/lang/String;

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->shippingAddress:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final dateUTC()J
    .locals 2

    iget-wide v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->dateUTC:J

    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/microblink/internal/services/amazon/AmazonOrder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->orderNumber:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object p1, p1, Lcom/microblink/internal/services/amazon/AmazonOrder;->orderNumber:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    iget-object p1, p1, Lcom/microblink/internal/services/amazon/AmazonOrder;->orderNumber:Ljava/lang/String;

    if-nez p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->orderNumber:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final orderNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->orderNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final rawHtml()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->rawHtml:Ljava/lang/String;

    return-object v0
.end method

.method public final rawHtml(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->rawHtml:Ljava/lang/String;

    return-void
.end method

.method public final shipments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/amazon/AmazonShipment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->shipments:Ljava/util/List;

    return-object v0
.end method

.method public final shipments(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/amazon/AmazonShipment;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->shipments:Ljava/util/List;

    return-void
.end method

.method public final shippingAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->shippingAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AmazonOrder{dateUTC="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->dateUTC:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", total="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->total:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", orderNumber=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->orderNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", shipments="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->shipments:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", rawHtml=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->rawHtml:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", shippingAddress=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->shippingAddress:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final total()F
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/amazon/AmazonOrder;->total:F

    return v0
.end method
