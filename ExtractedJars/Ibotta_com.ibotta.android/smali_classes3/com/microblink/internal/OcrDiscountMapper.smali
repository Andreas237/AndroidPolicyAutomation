.class public final Lcom/microblink/internal/OcrDiscountMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Ljava/util/List<",
        "Lcom/microblink/internal/OcrDiscount;",
        ">;[",
        "Lcom/microblink/internal/OcrDiscount;",
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

    check-cast p1, [Lcom/microblink/internal/OcrDiscount;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/OcrDiscountMapper;->transform([Lcom/microblink/internal/OcrDiscount;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final transform([Lcom/microblink/internal/OcrDiscount;)Ljava/util/List;
    .locals 2
    .param p1    # [Lcom/microblink/internal/OcrDiscount;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/microblink/internal/OcrDiscount;",
            ")",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrDiscount;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    if-lez v1, :cond_0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v0
.end method
