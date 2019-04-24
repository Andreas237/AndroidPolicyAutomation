.class public Lcom/microblink/internal/services/google/Periods;
.super Ljava/lang/Object;


# instance fields
.field private close:Lcom/microblink/internal/services/google/Hours;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "close"
    .end annotation
.end field

.field private open:Lcom/microblink/internal/services/google/Hours;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "open"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()Lcom/microblink/internal/services/google/Hours;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/Periods;->close:Lcom/microblink/internal/services/google/Hours;

    return-object v0
.end method

.method public open()Lcom/microblink/internal/services/google/Hours;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/Periods;->open:Lcom/microblink/internal/services/google/Hours;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Periods{close="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/google/Periods;->close:Lcom/microblink/internal/services/google/Hours;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", open="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/google/Periods;->open:Lcom/microblink/internal/services/google/Hours;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
