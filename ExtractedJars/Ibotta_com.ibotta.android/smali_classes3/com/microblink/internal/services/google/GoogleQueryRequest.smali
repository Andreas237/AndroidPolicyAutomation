.class public Lcom/microblink/internal/services/google/GoogleQueryRequest;
.super Ljava/lang/Object;


# instance fields
.field private apiKey:Ljava/lang/String;

.field private location:Lcom/microblink/internal/Location;

.field private query:Ljava/lang/String;

.field private radius:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apiKey(Ljava/lang/String;)Lcom/microblink/internal/services/google/GoogleQueryRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->apiKey:Ljava/lang/String;

    return-object p0
.end method

.method public apiKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public location()Lcom/microblink/internal/Location;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->location:Lcom/microblink/internal/Location;

    return-object v0
.end method

.method public location(Lcom/microblink/internal/Location;)Lcom/microblink/internal/services/google/GoogleQueryRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->location:Lcom/microblink/internal/Location;

    return-object p0
.end method

.method public query(Ljava/lang/String;)Lcom/microblink/internal/services/google/GoogleQueryRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->query:Ljava/lang/String;

    return-object p0
.end method

.method public query()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->query:Ljava/lang/String;

    return-object v0
.end method

.method public radius()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->radius:I

    return v0
.end method

.method public radius(I)Lcom/microblink/internal/services/google/GoogleQueryRequest;
    .locals 0

    iput p1, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->radius:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GoogleQueryRequest{query=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->query:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", apiKey=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->apiKey:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", radius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->radius:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", location="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/google/GoogleQueryRequest;->location:Lcom/microblink/internal/Location;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
