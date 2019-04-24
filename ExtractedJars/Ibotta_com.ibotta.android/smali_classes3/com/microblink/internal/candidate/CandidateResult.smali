.class public Lcom/microblink/internal/candidate/CandidateResult;
.super Ljava/lang/Object;


# instance fields
.field private final acceptedCandidates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/candidate/Candidate;",
            ">;"
        }
    .end annotation
.end field

.field private final acceptedIfNoMatch:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/candidate/Candidate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/candidate/Candidate;",
            ">;",
            "Ljava/util/List<",
            "Lcom/microblink/internal/candidate/Candidate;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/candidate/CandidateResult;->acceptedCandidates:Ljava/util/List;

    iput-object p2, p0, Lcom/microblink/internal/candidate/CandidateResult;->acceptedIfNoMatch:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public acceptedCandidates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/candidate/Candidate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/candidate/CandidateResult;->acceptedCandidates:Ljava/util/List;

    return-object v0
.end method

.method public acceptedIfNoMatch()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/candidate/Candidate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/candidate/CandidateResult;->acceptedIfNoMatch:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CandidateResult{acceptedCandidates="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/candidate/CandidateResult;->acceptedCandidates:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", acceptedIfNoMatch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/candidate/CandidateResult;->acceptedIfNoMatch:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
