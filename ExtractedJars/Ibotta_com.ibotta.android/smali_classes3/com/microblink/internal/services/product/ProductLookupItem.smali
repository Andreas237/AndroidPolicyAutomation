.class public final Lcom/microblink/internal/services/product/ProductLookupItem;
.super Ljava/lang/Object;


# instance fields
.field private final description:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private line:I

.field private final productNumber:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private unitPrice:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;FI)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->line:I

    iput-object p1, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->description:Ljava/lang/String;

    iput-object p2, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->productNumber:Ljava/lang/String;

    iput p4, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->line:I

    iput p3, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->unitPrice:F

    return-void
.end method


# virtual methods
.method public final description()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final line()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->line:I

    return v0
.end method

.method public final productNumber()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->productNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ProductLookupItem{description=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", productNumber=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->productNumber:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", line="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->line:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", unitPrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->unitPrice:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final unitPrice()F
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/product/ProductLookupItem;->unitPrice:F

    return v0
.end method
