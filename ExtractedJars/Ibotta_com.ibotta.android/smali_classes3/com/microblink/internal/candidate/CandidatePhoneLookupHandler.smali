.class public final Lcom/microblink/internal/candidate/CandidatePhoneLookupHandler;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/merchant/MerchantHandler;


# instance fields
.field private detector:Lcom/microblink/internal/merchant/MerchantDetector;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private phone:Lcom/microblink/StringType;


# direct methods
.method public constructor <init>(Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/StringType;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/merchant/MerchantDetector;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/candidate/CandidatePhoneLookupHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    iput-object p2, p0, Lcom/microblink/internal/candidate/CandidatePhoneLookupHandler;->phone:Lcom/microblink/StringType;

    return-void
.end method


# virtual methods
.method public final merchantResult()Lcom/microblink/internal/merchant/MerchantResult;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/candidate/CandidatePhoneLookupHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/internal/merchant/MerchantDetector;->candidateForPhoneLookup()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/internal/candidate/CandidatePhoneLookupHandler;->phone:Lcom/microblink/StringType;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/microblink/internal/candidate/CandidatePhoneLookupHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-virtual {v2, v0, v1}, Lcom/microblink/internal/merchant/MerchantDetector;->detectMerchant(Ljava/util/Collection;Ljava/lang/String;)Lcom/microblink/internal/merchant/MerchantResult;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
