.class public final Lcom/microblink/internal/OcrPhoneMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/StringType;",
        "[",
        "Lcom/microblink/internal/OcrPhone;",
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
.method public final transform([Lcom/microblink/internal/OcrPhone;)Lcom/microblink/StringType;
    .locals 1
    .param p1    # [Lcom/microblink/internal/OcrPhone;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object p1, p1, Lcom/microblink/internal/OcrPhone;->itemText:Ljava/lang/String;

    invoke-static {p1}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;)Lcom/microblink/StringType;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, [Lcom/microblink/internal/OcrPhone;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/OcrPhoneMapper;->transform([Lcom/microblink/internal/OcrPhone;)Lcom/microblink/StringType;

    move-result-object p1

    return-object p1
.end method
