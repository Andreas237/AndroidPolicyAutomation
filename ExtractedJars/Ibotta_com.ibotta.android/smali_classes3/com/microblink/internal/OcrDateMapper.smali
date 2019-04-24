.class public final Lcom/microblink/internal/OcrDateMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/DateTime;",
        "Lcom/microblink/OcrResult;",
        ">;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "OcrDateMapper"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final transform(Lcom/microblink/OcrResult;)Lcom/microblink/DateTime;
    .locals 5
    .param p1    # Lcom/microblink/OcrResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p1, Lcom/microblink/OcrResult;->date:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p1, Lcom/microblink/OcrResult;->date:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/DateUtils;->parseDateTime(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v3}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Lcom/microblink/DateTime;

    invoke-direct {v3}, Lcom/microblink/DateTime;-><init>()V

    invoke-virtual {v3, v0}, Lcom/microblink/DateTime;->dateTime(Ljava/util/Date;)Lcom/microblink/DateTime;

    move-result-object v3

    invoke-static {v0}, Lcom/microblink/internal/DateUtils;->shortDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iget v4, p1, Lcom/microblink/OcrResult;->dateConfidence:F

    invoke-static {v0, v4}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/microblink/DateTime;->date(Lcom/microblink/StringType;)Lcom/microblink/DateTime;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v3, "OcrDateMapper"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v0, v4}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    iget-object v0, p1, Lcom/microblink/OcrResult;->time:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    :try_start_1
    iget-object v0, p1, Lcom/microblink/OcrResult;->time:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/DateUtils;->parseDateTime(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_2

    if-nez v2, :cond_1

    new-instance v3, Lcom/microblink/DateTime;

    invoke-direct {v3}, Lcom/microblink/DateTime;-><init>()V

    move-object v2, v3

    :cond_1
    invoke-static {v0}, Lcom/microblink/internal/DateUtils;->shortTime(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iget p1, p1, Lcom/microblink/OcrResult;->timeConfidence:F

    invoke-static {v0, p1}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/microblink/DateTime;->time(Lcom/microblink/StringType;)Lcom/microblink/DateTime;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-string v0, "OcrDateMapper"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_1
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

    check-cast p1, Lcom/microblink/OcrResult;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/OcrDateMapper;->transform(Lcom/microblink/OcrResult;)Lcom/microblink/DateTime;

    move-result-object p1

    return-object p1
.end method
