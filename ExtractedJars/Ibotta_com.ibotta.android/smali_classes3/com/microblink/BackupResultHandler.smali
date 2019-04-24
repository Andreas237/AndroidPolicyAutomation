.class final Lcom/microblink/BackupResultHandler;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/merchant/MerchantHandler;


# instance fields
.field private detector:Lcom/microblink/internal/merchant/MerchantDetector;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private validator:Lcom/microblink/internal/merchant/MerchantResultValidator;


# direct methods
.method constructor <init>(Lcom/microblink/internal/merchant/MerchantDetector;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/merchant/MerchantDetector;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/microblink/internal/merchant/MerchantResultValidatorImpl;

    invoke-direct {v0}, Lcom/microblink/internal/merchant/MerchantResultValidatorImpl;-><init>()V

    iput-object v0, p0, Lcom/microblink/BackupResultHandler;->validator:Lcom/microblink/internal/merchant/MerchantResultValidator;

    iput-object p1, p0, Lcom/microblink/BackupResultHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    return-void
.end method


# virtual methods
.method public final merchantResult()Lcom/microblink/internal/merchant/MerchantResult;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/BackupResultHandler;->detector:Lcom/microblink/internal/merchant/MerchantDetector;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/internal/merchant/MerchantDetector;->phoneResults()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "BLINK"

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "BLINK"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/merchant/MerchantResult;

    iget-object v2, p0, Lcom/microblink/BackupResultHandler;->validator:Lcom/microblink/internal/merchant/MerchantResultValidator;

    invoke-interface {v2, v0}, Lcom/microblink/internal/merchant/MerchantResultValidator;->valid(Lcom/microblink/internal/merchant/MerchantResult;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    return-object v1
.end method
