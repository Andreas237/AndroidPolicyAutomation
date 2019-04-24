.class public interface abstract Lcom/microblink/internal/services/license/LicenseeService;
.super Ljava/lang/Object;


# virtual methods
.method public abstract checkLicense(Lcom/microblink/OnCompleteListener;)V
    .param p1    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/license/LicenseServiceResponse;",
            ">;)V"
        }
    .end annotation
.end method
