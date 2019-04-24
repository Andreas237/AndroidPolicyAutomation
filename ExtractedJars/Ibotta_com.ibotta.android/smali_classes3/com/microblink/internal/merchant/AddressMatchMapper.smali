.class public final Lcom/microblink/internal/merchant/AddressMatchMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/internal/merchant/AddressMatch;",
        "Lcom/microblink/OcrResult;",
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
.method public final transform(Lcom/microblink/OcrResult;)Lcom/microblink/internal/merchant/AddressMatch;
    .locals 4
    .param p1    # Lcom/microblink/OcrResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p1, Lcom/microblink/OcrResult;->city:Ljava/lang/String;

    iget-object v1, p1, Lcom/microblink/OcrResult;->state:Ljava/lang/String;

    iget-object v2, p1, Lcom/microblink/OcrResult;->street:Ljava/lang/String;

    iget-object p1, p1, Lcom/microblink/OcrResult;->zip:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    new-instance v3, Lcom/microblink/internal/merchant/AddressMatch;

    invoke-direct {v3, v2, v0, v1, p1}, Lcom/microblink/internal/merchant/AddressMatch;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, Lcom/microblink/OcrResult;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/merchant/AddressMatchMapper;->transform(Lcom/microblink/OcrResult;)Lcom/microblink/internal/merchant/AddressMatch;

    move-result-object p1

    return-object p1
.end method
