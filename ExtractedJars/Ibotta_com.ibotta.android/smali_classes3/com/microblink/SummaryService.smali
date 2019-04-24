.class interface abstract Lcom/microblink/SummaryService;
.super Ljava/lang/Object;


# virtual methods
.method public abstract summary(Lcom/microblink/SummaryStats;Lcom/microblink/Receipt;Lcom/microblink/internal/merchant/MerchantResult;Lcom/microblink/OnCompleteListener;)V
    .param p1    # Lcom/microblink/SummaryStats;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/Receipt;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/internal/merchant/MerchantResult;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/SummaryStats;",
            "Lcom/microblink/Receipt;",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/receipt/SummaryResponse;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract uploadImages(Ljava/util/List;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/receipt/SummaryMediaResponse;",
            ">;)V"
        }
    .end annotation
.end method
