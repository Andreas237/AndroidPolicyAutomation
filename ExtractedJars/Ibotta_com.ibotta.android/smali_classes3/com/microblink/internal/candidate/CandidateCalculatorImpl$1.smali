.class Lcom/microblink/internal/candidate/CandidateCalculatorImpl$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/microblink/internal/candidate/Candidate;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/candidate/CandidateCalculatorImpl;


# direct methods
.method constructor <init>(Lcom/microblink/internal/candidate/CandidateCalculatorImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/candidate/CandidateCalculatorImpl$1;->this$0:Lcom/microblink/internal/candidate/CandidateCalculatorImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/microblink/internal/candidate/Candidate;Lcom/microblink/internal/candidate/Candidate;)I
    .locals 5

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->count()I

    move-result v0

    invoke-virtual {p2}, Lcom/microblink/internal/candidate/Candidate;->count()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->count()I

    move-result p1

    invoke-virtual {p2}, Lcom/microblink/internal/candidate/Candidate;->count()I

    move-result p2

    if-ge p1, p2, :cond_0

    return v4

    :cond_0
    if-le p1, p2, :cond_1

    return v3

    :cond_1
    return v2

    :cond_2
    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->confidence()F

    move-result v0

    invoke-virtual {p2}, Lcom/microblink/internal/candidate/Candidate;->confidence()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->confidence()F

    move-result p1

    invoke-virtual {p2}, Lcom/microblink/internal/candidate/Candidate;->confidence()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    mul-int/lit8 p1, p1, -0x1

    return p1

    :cond_3
    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->line()I

    move-result v0

    invoke-virtual {p2}, Lcom/microblink/internal/candidate/Candidate;->line()I

    move-result v1

    if-ge v0, v1, :cond_4

    return v3

    :cond_4
    invoke-virtual {p1}, Lcom/microblink/internal/candidate/Candidate;->line()I

    move-result p1

    invoke-virtual {p2}, Lcom/microblink/internal/candidate/Candidate;->line()I

    move-result p2

    if-le p1, p2, :cond_5

    return v4

    :cond_5
    return v2
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/microblink/internal/candidate/Candidate;

    check-cast p2, Lcom/microblink/internal/candidate/Candidate;

    invoke-virtual {p0, p1, p2}, Lcom/microblink/internal/candidate/CandidateCalculatorImpl$1;->compare(Lcom/microblink/internal/candidate/Candidate;Lcom/microblink/internal/candidate/Candidate;)I

    move-result p1

    return p1
.end method
