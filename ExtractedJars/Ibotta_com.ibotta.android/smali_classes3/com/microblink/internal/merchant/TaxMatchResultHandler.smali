.class public Lcom/microblink/internal/merchant/TaxMatchResultHandler;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/merchant/MerchantHandler;


# instance fields
.field private coordinators:Lcom/microblink/internal/merchant/MerchantResultCoordinators;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/internal/merchant/MerchantResultCoordinators<",
            "Lcom/microblink/internal/merchant/TaxMatch;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/microblink/internal/merchant/MerchantResultCoordinators;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/merchant/MerchantResultCoordinators;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/merchant/MerchantResultCoordinators<",
            "Lcom/microblink/internal/merchant/TaxMatch;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/merchant/TaxMatchResultHandler;->coordinators:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    return-void
.end method


# virtual methods
.method public merchantResult()Lcom/microblink/internal/merchant/MerchantResult;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/merchant/TaxMatchResultHandler;->coordinators:Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->foundMerchants()Lcom/microblink/internal/merchant/MerchantResult;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
