.class public final Lcom/microblink/internal/PaymentMethodsMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Ljava/util/List<",
        "Lcom/microblink/PaymentMethod;",
        ">;",
        "Ljava/util/List<",
        "Lcom/microblink/internal/OcrPaymentMethod;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/PaymentMethodsMapper;->transform(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final transform(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrPaymentMethod;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/microblink/PaymentMethod;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/OcrPaymentMethod;

    iget-object v2, v1, Lcom/microblink/internal/OcrPaymentMethod;->itemText:Ljava/lang/String;

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Lcom/microblink/PaymentMethod;

    iget-object v3, v1, Lcom/microblink/internal/OcrPaymentMethod;->itemText:Ljava/lang/String;

    new-instance v4, Lcom/microblink/FloatType;

    iget v5, v1, Lcom/microblink/internal/OcrPaymentMethod;->price:F

    iget v1, v1, Lcom/microblink/internal/OcrPaymentMethod;->priceConfidence:F

    invoke-direct {v4, v5, v1}, Lcom/microblink/FloatType;-><init>(FF)V

    invoke-direct {v2, v3, v4}, Lcom/microblink/PaymentMethod;-><init>(Ljava/lang/String;Lcom/microblink/FloatType;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
