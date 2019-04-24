.class public final Lcom/microblink/internal/candidate/CandidateResultHandler;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/merchant/MerchantHandler;


# instance fields
.field private final city:Lcom/microblink/StringType;

.field private final country:Ljava/lang/String;

.field private detector:Lcom/microblink/internal/merchant/MerchantDetector;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final rawResults:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final state:Lcom/microblink/StringType;

.field private final zip:Lcom/microblink/StringType;


# direct methods
.method public constructor <init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/StringType;Lcom/microblink/StringType;Lcom/microblink/StringType;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/merchant/MerchantDetector;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/merchant/MerchantDetector;",
            "Lcom/microblink/StringType;",
            "Lcom/microblink/StringType;",
            "Lcom/microblink/StringType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    iput-object p2, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->zip:Lcom/microblink/StringType;

    iput-object p3, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->city:Lcom/microblink/StringType;

    iput-object p4, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->state:Lcom/microblink/StringType;

    iput-object p5, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->country:Ljava/lang/String;

    iput-object p6, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->rawResults:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final merchantResult()Lcom/microblink/internal/merchant/MerchantResult;
    .locals 8
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/internal/merchant/MerchantDetector;->ocrMerchantCandidateResultHandler()Lcom/microblink/internal/candidate/CandidateCalculator;

    move-result-object v0

    invoke-interface {v0}, Lcom/microblink/internal/candidate/CandidateCalculator;->candidateResult()Lcom/microblink/internal/candidate/CandidateResult;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/microblink/internal/candidate/CandidateResult;->acceptedCandidates()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    iget-object v0, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->zip:Lcom/microblink/StringType;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->city:Lcom/microblink/StringType;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->state:Lcom/microblink/StringType;

    invoke-static {v0}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->country:Ljava/lang/String;

    iget-object v7, p0, Lcom/microblink/internal/candidate/CandidateResultHandler;->rawResults:Ljava/util/List;

    invoke-virtual/range {v1 .. v7}, Lcom/microblink/internal/merchant/MerchantDetector;->detectMerchant(Lcom/microblink/internal/candidate/CandidateResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/microblink/internal/merchant/MerchantResult;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
