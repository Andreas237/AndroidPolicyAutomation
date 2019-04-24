.class public final Lcom/microblink/internal/services/linux/LinuxInfoLineMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/internal/OcrAdditionalLine;",
        "Lcom/microblink/internal/services/linux/InfoLine;",
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
.method public final transform(Lcom/microblink/internal/services/linux/InfoLine;)Lcom/microblink/internal/OcrAdditionalLine;
    .locals 3
    .param p1    # Lcom/microblink/internal/services/linux/InfoLine;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    new-instance v0, Lcom/microblink/internal/OcrAdditionalLine;

    invoke-direct {v0}, Lcom/microblink/internal/OcrAdditionalLine;-><init>()V

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/InfoLine;->line()I

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrAdditionalLine;->lineNumber:I

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/InfoLine;->text()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/internal/OcrAdditionalLine;->lineText:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrAdditionalLine;->textConfidence:F

    :cond_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/InfoLine;->type()Lcom/microblink/StringType;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/microblink/internal/OcrAdditionalLine;->type:Ljava/lang/String;

    invoke-static {p1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result p1

    iput p1, v0, Lcom/microblink/internal/OcrAdditionalLine;->typeConfidence:F

    :cond_1
    return-object v0
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, Lcom/microblink/internal/services/linux/InfoLine;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/linux/LinuxInfoLineMapper;->transform(Lcom/microblink/internal/services/linux/InfoLine;)Lcom/microblink/internal/OcrAdditionalLine;

    move-result-object p1

    return-object p1
.end method
