.class public final Lcom/microblink/internal/services/linux/Product;
.super Ljava/lang/Object;


# instance fields
.field private fullPrice:Lcom/microblink/FloatType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "fullPrice"
    .end annotation
.end field

.field private ignored:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ignored"
    .end annotation
.end field

.field private infoLines:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "infoLines"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/linux/InfoLine;",
            ">;"
        }
    .end annotation
.end field

.field private line:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "line"
    .end annotation
.end field

.field private notEligible:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "not_eligible"
    .end annotation
.end field

.field private price:Lcom/microblink/FloatType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "price"
    .end annotation
.end field

.field private quantity:Lcom/microblink/IntType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "qty"
    .end annotation
.end field

.field private rpn:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rpn"
    .end annotation
.end field

.field private rsd:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rsd"
    .end annotation
.end field

.field private totalPrice:Lcom/microblink/FloatType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "totalPrice"
    .end annotation
.end field

.field private uom:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "uom"
    .end annotation
.end field

.field private uomAmount:Lcom/microblink/FloatType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "uomAmount"
    .end annotation
.end field

.field private uomPrice:Lcom/microblink/FloatType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "uomPrice"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fullPrice()Lcom/microblink/FloatType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Product;->fullPrice:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final ignored()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/internal/services/linux/Product;->ignored:Z

    return v0
.end method

.method public final infoLines()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/linux/InfoLine;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Product;->infoLines:Ljava/util/List;

    return-object v0
.end method

.method public final line()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/linux/Product;->line:I

    return v0
.end method

.method public final notEligible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/internal/services/linux/Product;->notEligible:Z

    return v0
.end method

.method public final price()Lcom/microblink/FloatType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Product;->price:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final quantity()Lcom/microblink/IntType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Product;->quantity:Lcom/microblink/IntType;

    return-object v0
.end method

.method public final rpn()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Product;->rpn:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final rsd()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Product;->rsd:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Product{line="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/internal/services/linux/Product;->line:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", fullPrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Product;->fullPrice:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", price="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Product;->price:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", quantity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Product;->quantity:Lcom/microblink/IntType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rpn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Product;->rpn:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rsd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Product;->rsd:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalPrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Product;->totalPrice:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Product;->uom:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uomPrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Product;->uomPrice:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uomAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Product;->uomAmount:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", infoLines="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Product;->infoLines:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ignored="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/internal/services/linux/Product;->ignored:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", notEligible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/internal/services/linux/Product;->notEligible:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final totalPrice()Lcom/microblink/FloatType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Product;->totalPrice:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final uom()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Product;->uom:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final uomPrice()Lcom/microblink/FloatType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Product;->uomPrice:Lcom/microblink/FloatType;

    return-object v0
.end method
