.class public Lcom/microblink/internal/services/linux/Discount;
.super Ljava/lang/Object;


# instance fields
.field private description:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description"
    .end annotation
.end field

.field private line:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "line"
    .end annotation
.end field

.field private price:Lcom/microblink/FloatType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "price"
    .end annotation
.end field

.field private sku:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sku"
    .end annotation
.end field

.field private type:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public description()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Discount;->description:Lcom/microblink/StringType;

    return-object v0
.end method

.method public line()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/linux/Discount;->line:I

    return v0
.end method

.method public price()Lcom/microblink/FloatType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Discount;->price:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public sku()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Discount;->sku:Lcom/microblink/StringType;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Discount{description="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Discount;->description:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", line="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/services/linux/Discount;->line:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", price="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Discount;->price:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sku="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Discount;->sku:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/Discount;->type:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public type()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/Discount;->type:Lcom/microblink/StringType;

    return-object v0
.end method
