.class public Lcom/microblink/internal/services/abn/ABNLookupRequest;
.super Ljava/lang/Object;


# instance fields
.field private final apiKey:Ljava/lang/String;

.field private final taxId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/abn/ABNLookupRequest;->taxId:Ljava/lang/String;

    iput-object p2, p0, Lcom/microblink/internal/services/abn/ABNLookupRequest;->apiKey:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public apiKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/abn/ABNLookupRequest;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public taxId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/abn/ABNLookupRequest;->taxId:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ABNLookupRequest{taxId=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/abn/ABNLookupRequest;->taxId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", apiKey=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/abn/ABNLookupRequest;->apiKey:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method