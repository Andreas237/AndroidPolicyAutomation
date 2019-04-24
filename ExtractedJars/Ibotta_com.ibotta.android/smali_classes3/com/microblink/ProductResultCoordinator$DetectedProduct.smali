.class Lcom/microblink/ProductResultCoordinator$DetectedProduct;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/ProductResultCoordinator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "DetectedProduct"
.end annotation


# instance fields
.field lookupStatus:Lcom/microblink/internal/services/LookupStatus;

.field product:Lcom/microblink/internal/ProductSummary;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/microblink/internal/services/LookupStatus;->PENDING:Lcom/microblink/internal/services/LookupStatus;

    iput-object v0, p0, Lcom/microblink/ProductResultCoordinator$DetectedProduct;->lookupStatus:Lcom/microblink/internal/services/LookupStatus;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DetectedMerchantResponse{storeLookUpResponse="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/ProductResultCoordinator$DetectedProduct;->product:Lcom/microblink/internal/ProductSummary;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lookupStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ProductResultCoordinator$DetectedProduct;->lookupStatus:Lcom/microblink/internal/services/LookupStatus;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
