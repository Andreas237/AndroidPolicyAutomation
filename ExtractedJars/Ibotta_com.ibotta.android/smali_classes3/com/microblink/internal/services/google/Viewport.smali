.class public Lcom/microblink/internal/services/google/Viewport;
.super Ljava/lang/Object;


# instance fields
.field private northeast:Lcom/microblink/internal/services/google/LocationResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "northeast"
    .end annotation
.end field

.field private northwest:Lcom/microblink/internal/services/google/LocationResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "northwest"
    .end annotation
.end field

.field private southeast:Lcom/microblink/internal/services/google/LocationResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "southeast"
    .end annotation
.end field

.field private southwest:Lcom/microblink/internal/services/google/LocationResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "southwest"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public northeast()Lcom/microblink/internal/services/google/LocationResponse;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/Viewport;->northeast:Lcom/microblink/internal/services/google/LocationResponse;

    return-object v0
.end method

.method public northwest()Lcom/microblink/internal/services/google/LocationResponse;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/Viewport;->northwest:Lcom/microblink/internal/services/google/LocationResponse;

    return-object v0
.end method

.method public southeast()Lcom/microblink/internal/services/google/LocationResponse;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/Viewport;->southeast:Lcom/microblink/internal/services/google/LocationResponse;

    return-object v0
.end method

.method public southwest()Lcom/microblink/internal/services/google/LocationResponse;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/Viewport;->southwest:Lcom/microblink/internal/services/google/LocationResponse;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Viewport{northeast="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/google/Viewport;->northeast:Lcom/microblink/internal/services/google/LocationResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", southwest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/google/Viewport;->southwest:Lcom/microblink/internal/services/google/LocationResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", southeast="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/google/Viewport;->southeast:Lcom/microblink/internal/services/google/LocationResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", northwest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/google/Viewport;->northwest:Lcom/microblink/internal/services/google/LocationResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
