.class public interface abstract Lcom/microblink/internal/candidate/CandidateCalculator$Listener;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/internal/candidate/CandidateCalculator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onCandidateAppearedThresholdTimes(Lcom/microblink/internal/candidate/Candidate;)V
    .param p1    # Lcom/microblink/internal/candidate/Candidate;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
