.class public interface abstract Lcom/microblink/internal/candidate/CandidateCalculator;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/candidate/CandidateCalculator$Listener;
    }
.end annotation


# virtual methods
.method public abstract candidateResult()Lcom/microblink/internal/candidate/CandidateResult;
.end method

.method public abstract update(Lcom/microblink/internal/candidate/Candidate;Lcom/microblink/internal/candidate/CandidateCalculator$Listener;)V
    .param p1    # Lcom/microblink/internal/candidate/Candidate;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/candidate/CandidateCalculator$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
