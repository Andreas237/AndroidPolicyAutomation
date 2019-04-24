.class public Lcom/microblink/internal/candidate/Candidate;
.super Ljava/lang/Object;


# instance fields
.field private confidence:F

.field private count:I

.field private line:I

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/candidate/Candidate;->name:Ljava/lang/String;

    iput p2, p0, Lcom/microblink/internal/candidate/Candidate;->count:I

    iput p3, p0, Lcom/microblink/internal/candidate/Candidate;->confidence:F

    iput p4, p0, Lcom/microblink/internal/candidate/Candidate;->line:I

    return-void
.end method


# virtual methods
.method public confidence()F
    .locals 1

    iget v0, p0, Lcom/microblink/internal/candidate/Candidate;->confidence:F

    return v0
.end method

.method public count()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/candidate/Candidate;->count:I

    return v0
.end method

.method public line()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/candidate/Candidate;->line:I

    return v0
.end method

.method public name()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/candidate/Candidate;->name:Ljava/lang/String;

    return-object v0
.end method
