.class public Lcom/microblink/internal/candidate/CandidateCalculatorImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/candidate/CandidateCalculator;


# static fields
.field private static final CAFETERIA:Ljava/lang/String; = "cafeteria"

.field private static final FOOD_COURT:Ljava/lang/String; = "food court"

.field private static final MINIMUM_CONFIDENCE_THRESHOLD:I = 0x55


# instance fields
.field private candidateComparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/microblink/internal/candidate/Candidate;",
            ">;"
        }
    .end annotation
.end field

.field private candidateMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/microblink/internal/candidate/Candidate;",
            ">;"
        }
    .end annotation
.end field

.field private final threshHoldCount:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->candidateMap:Ljava/util/Map;

    new-instance v0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl$1;

    invoke-direct {v0, p0}, Lcom/microblink/internal/candidate/CandidateCalculatorImpl$1;-><init>(Lcom/microblink/internal/candidate/CandidateCalculatorImpl;)V

    iput-object v0, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->candidateComparator:Ljava/util/Comparator;

    iput p1, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->threshHoldCount:I

    return-void
.end method


# virtual methods
.method public candidateResult()Lcom/microblink/internal/candidate/CandidateResult;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->candidateMap:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->candidateMap:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/microblink/internal/candidate/Candidate;

    invoke-virtual {v3}, Lcom/microblink/internal/candidate/Candidate;->confidence()F

    move-result v4

    const/high16 v5, 0x42aa0000    # 85.0f

    cmpl-float v4, v4, v5

    if-ltz v4, :cond_0

    invoke-virtual {v3}, Lcom/microblink/internal/candidate/Candidate;->name()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v5, "cafeteria"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "food court"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    :cond_1
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->candidateComparator:Ljava/util/Comparator;

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object v2, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->candidateComparator:Ljava/util/Comparator;

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_4

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/microblink/internal/candidate/Candidate;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/microblink/internal/candidate/Candidate;->line()I

    move-result v5

    const v6, 0x7fffffff

    if-ge v5, v6, :cond_3

    move v4, v3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-lez v4, :cond_5

    invoke-interface {v0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/microblink/internal/candidate/Candidate;

    invoke-interface {v0, v2, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_5
    new-instance v2, Lcom/microblink/internal/candidate/CandidateResult;

    invoke-direct {v2, v0, v1}, Lcom/microblink/internal/candidate/CandidateResult;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public update(Lcom/microblink/internal/candidate/Candidate;Lcom/microblink/internal/candidate/CandidateCalculator$Listener;)V
    .locals 6
    .param p1    # Lcom/microblink/internal/candidate/Candidate;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/candidate/CandidateCalculator$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->candidateMap:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->candidateMap:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/candidate/Candidate;

    invoke-virtual {v1}, Lcom/microblink/internal/candidate/Candidate;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/microblink/internal/candidate/Candidate;->count()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {v1}, Lcom/microblink/internal/candidate/Candidate;->line()I

    move-result v2

    invoke-virtual {v1}, Lcom/microblink/internal/candidate/Candidate;->confidence()F

    move-result v5

    invoke-virtual {v1}, Lcom/microblink/internal/candidate/Candidate;->count()I

    move-result v1

    int-to-float v1, v1

    mul-float v5, v5, v1

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->confidence()F

    move-result p1

    add-float/2addr v5, p1

    int-to-float p1, v4

    div-float/2addr v5, p1

    new-instance p1, Lcom/microblink/internal/candidate/Candidate;

    invoke-direct {p1, v3, v4, v5, v2}, Lcom/microblink/internal/candidate/Candidate;-><init>(Ljava/lang/String;IFI)V

    iget-object v1, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->candidateMap:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->threshHoldCount:I

    if-ne v4, v0, :cond_0

    invoke-interface {p2, p1}, Lcom/microblink/internal/candidate/CandidateCalculator$Listener;->onCandidateAppearedThresholdTimes(Lcom/microblink/internal/candidate/Candidate;)V

    :cond_0
    return-void

    :cond_1
    iget-object p2, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl;->candidateMap:Ljava/util/Map;

    new-instance v1, Lcom/microblink/internal/candidate/Candidate;

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->confidence()F

    move-result v4

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->line()I

    move-result p1

    invoke-direct {v1, v3, v2, v4, p1}, Lcom/microblink/internal/candidate/Candidate;-><init>(Ljava/lang/String;IFI)V

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method
