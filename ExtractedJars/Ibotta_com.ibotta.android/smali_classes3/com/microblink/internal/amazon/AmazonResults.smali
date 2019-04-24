.class public final Lcom/microblink/internal/amazon/AmazonResults;
.super Ljava/lang/Object;


# instance fields
.field private aborted:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "aborted"
    .end annotation
.end field

.field private catNodes:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "catNodes"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private error:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "error"
    .end annotation
.end field

.field private hasNext:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hasNext"
    .end annotation
.end field

.field private imageUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "imgUrl"
    .end annotation
.end field

.field private orders:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "orders"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/amazon/AmazonOrder;",
            ">;"
        }
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

.method public constructor <init>(Lcom/microblink/internal/amazon/AmazonResults;)V
    .locals 4
    .param p1    # Lcom/microblink/internal/amazon/AmazonResults;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/microblink/internal/amazon/AmazonResults;->orders:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/microblink/internal/amazon/AmazonResults;->orders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/services/amazon/AmazonOrder;

    iget-object v2, p0, Lcom/microblink/internal/amazon/AmazonResults;->orders:Ljava/util/List;

    new-instance v3, Lcom/microblink/internal/services/amazon/AmazonOrder;

    invoke-direct {v3, v1}, Lcom/microblink/internal/services/amazon/AmazonOrder;-><init>(Lcom/microblink/internal/services/amazon/AmazonOrder;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-boolean v0, p1, Lcom/microblink/internal/amazon/AmazonResults;->aborted:Z

    iput-boolean v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->aborted:Z

    iget-boolean v0, p1, Lcom/microblink/internal/amazon/AmazonResults;->hasNext:Z

    iput-boolean v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->hasNext:Z

    iget-object v0, p1, Lcom/microblink/internal/amazon/AmazonResults;->error:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->error:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/amazon/AmazonResults;->upc:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->upc:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/amazon/AmazonResults;->imageUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->imageUrl:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/amazon/AmazonResults;->shipments:Ljava/util/List;

    iput-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->shipments:Ljava/util/List;

    iget-object v0, p1, Lcom/microblink/internal/amazon/AmazonResults;->rawHtml:Ljava/lang/String;

    iput-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->rawHtml:Ljava/lang/String;

    iget-object v0, p1, Lcom/microblink/internal/amazon/AmazonResults;->catNodes:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    iget-object p1, p1, Lcom/microblink/internal/amazon/AmazonResults;->catNodes:Ljava/util/List;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->catNodes:Ljava/util/List;

    :cond_1
    return-void
.end method


# virtual methods
.method public final aborted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->aborted:Z

    return v0
.end method

.method public final catNodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->catNodes:Ljava/util/List;

    return-object v0
.end method

.method public final error()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->error:Ljava/lang/String;

    return-object v0
.end method

.method public final hasNext()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->hasNext:Z

    return v0
.end method

.method public final imageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final orders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/amazon/AmazonOrder;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->orders:Ljava/util/List;

    return-object v0
.end method

.method public final rawHtml()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->rawHtml:Ljava/lang/String;

    return-object v0
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

    iget-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->shipments:Ljava/util/List;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AmazonResults{orders="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/amazon/AmazonResults;->orders:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", aborted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/internal/amazon/AmazonResults;->aborted:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", hasNext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/internal/amazon/AmazonResults;->hasNext:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", error=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/amazon/AmazonResults;->error:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", upc=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/amazon/AmazonResults;->upc:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", imageUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/amazon/AmazonResults;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", catNodes="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/amazon/AmazonResults;->catNodes:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", shipments="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/amazon/AmazonResults;->shipments:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", rawHtml=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/amazon/AmazonResults;->rawHtml:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/microblink/internal/amazon/AmazonResults;->upc:Ljava/lang/String;

    return-object v0
.end method
