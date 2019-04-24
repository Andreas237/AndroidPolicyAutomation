.class public final Lcom/microblink/internal/services/receipt/SummaryMediaResponse;
.super Lcom/microblink/internal/services/ServiceResponse;


# instance fields
.field private image:Lcom/microblink/internal/services/receipt/Image;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "receipt_image"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/internal/services/ServiceResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SummaryMediaResponse{image="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/receipt/SummaryMediaResponse;->image:Lcom/microblink/internal/services/receipt/Image;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
