.class public final Lcom/microblink/internal/AdditionalLineMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/AdditionalLine;",
        "Lcom/microblink/internal/OcrAdditionalLine;",
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
.method public final transform(Lcom/microblink/internal/OcrAdditionalLine;)Lcom/microblink/AdditionalLine;
    .locals 4
    .param p1    # Lcom/microblink/internal/OcrAdditionalLine;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p1, Lcom/microblink/internal/OcrAdditionalLine;->type:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lcom/microblink/StringType;

    iget-object v2, p1, Lcom/microblink/internal/OcrAdditionalLine;->type:Ljava/lang/String;

    iget v3, p1, Lcom/microblink/internal/OcrAdditionalLine;->typeConfidence:F

    invoke-direct {v0, v2, v3}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p1, Lcom/microblink/internal/OcrAdditionalLine;->lineText:Ljava/lang/String;

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v1, Lcom/microblink/StringType;

    iget-object v2, p1, Lcom/microblink/internal/OcrAdditionalLine;->lineText:Ljava/lang/String;

    iget v3, p1, Lcom/microblink/internal/OcrAdditionalLine;->textConfidence:F

    invoke-direct {v1, v2, v3}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    :cond_1
    new-instance v2, Lcom/microblink/AdditionalLine;

    iget p1, p1, Lcom/microblink/internal/OcrAdditionalLine;->lineNumber:I

    invoke-direct {v2, v0, v1, p1}, Lcom/microblink/AdditionalLine;-><init>(Lcom/microblink/StringType;Lcom/microblink/StringType;I)V

    return-object v2
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, Lcom/microblink/internal/OcrAdditionalLine;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/AdditionalLineMapper;->transform(Lcom/microblink/internal/OcrAdditionalLine;)Lcom/microblink/AdditionalLine;

    move-result-object p1

    return-object p1
.end method
