.class final Lcom/microblink/LinuxMerchantResultHandler;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/merchant/MerchantHandler;


# instance fields
.field private merchantResult:Lcom/microblink/internal/merchant/MerchantResult;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/microblink/internal/merchant/MerchantResult;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/merchant/MerchantResult;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/LinuxMerchantResultHandler;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    return-void
.end method


# virtual methods
.method public final merchantResult()Lcom/microblink/internal/merchant/MerchantResult;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/LinuxMerchantResultHandler;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/LinuxMerchantResultHandler;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    invoke-virtual {v0}, Lcom/microblink/internal/merchant/MerchantResult;->merchantSource()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/LinuxMerchantResultHandler;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
