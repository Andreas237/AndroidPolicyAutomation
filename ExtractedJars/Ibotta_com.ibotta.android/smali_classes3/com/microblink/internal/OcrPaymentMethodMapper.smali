.class public final Lcom/microblink/internal/OcrPaymentMethodMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Ljava/util/List<",
        "Lcom/microblink/internal/OcrPaymentMethod;",
        ">;[",
        "Lcom/microblink/internal/OcrPaymentMethod;",
        ">;"
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

    check-cast p1, [Lcom/microblink/internal/OcrPaymentMethod;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/OcrPaymentMethodMapper;->transform([Lcom/microblink/internal/OcrPaymentMethod;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final transform([Lcom/microblink/internal/OcrPaymentMethod;)Ljava/util/List;
    .locals 6
    .param p1    # [Lcom/microblink/internal/OcrPaymentMethod;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/microblink/internal/OcrPaymentMethod;",
            ")",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrPaymentMethod;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    if-lez v1, :cond_1

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    iget-object v4, v3, Lcom/microblink/internal/OcrPaymentMethod;->itemText:Ljava/lang/String;

    invoke-static {v4}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    iget v4, v3, Lcom/microblink/internal/OcrPaymentMethod;->price:F

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-lez v4, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
