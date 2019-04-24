.class final Lcom/microblink/ReceiptSdk$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Lcom/microblink/internal/services/license/LicenseServiceResponse;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/microblink/internal/services/license/LicenseServiceResponse;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/license/LicenseServiceResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public final bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/license/LicenseServiceResponse;

    invoke-virtual {p0, p1}, Lcom/microblink/ReceiptSdk$2;->onComplete(Lcom/microblink/internal/services/license/LicenseServiceResponse;)V

    return-void
.end method
