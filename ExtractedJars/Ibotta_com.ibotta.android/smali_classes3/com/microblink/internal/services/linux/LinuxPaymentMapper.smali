.class public final Lcom/microblink/internal/services/linux/LinuxPaymentMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/internal/OcrPaymentMethod;",
        "Lcom/microblink/internal/services/linux/PaymentMethod;",
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
.method public final transform(Lcom/microblink/internal/services/linux/PaymentMethod;)Lcom/microblink/internal/OcrPaymentMethod;
    .locals 2
    .param p1    # Lcom/microblink/internal/services/linux/PaymentMethod;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/internal/OcrPaymentMethod;

    invoke-direct {v0}, Lcom/microblink/internal/OcrPaymentMethod;-><init>()V

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/PaymentMethod;->amount()Lcom/microblink/FloatType;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrPaymentMethod;->price:F

    :cond_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/PaymentMethod;->method()Lcom/microblink/StringType;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/microblink/internal/OcrPaymentMethod;->itemText:Ljava/lang/String;

    :cond_1
    return-object v0
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/linux/PaymentMethod;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/linux/LinuxPaymentMapper;->transform(Lcom/microblink/internal/services/linux/PaymentMethod;)Lcom/microblink/internal/OcrPaymentMethod;

    move-result-object p1

    return-object p1
.end method
