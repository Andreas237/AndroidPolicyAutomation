.class public final Lcom/microblink/internal/services/linux/LinuxInfoLinesMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Ljava/util/ArrayList<",
        "Lcom/microblink/internal/OcrAdditionalLine;",
        ">;",
        "Ljava/util/List<",
        "Lcom/microblink/internal/services/linux/InfoLine;",
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

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/linux/LinuxInfoLinesMapper;->transform(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final transform(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3
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
            "Lcom/microblink/internal/services/linux/InfoLine;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/microblink/internal/OcrAdditionalLine;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lcom/microblink/internal/services/linux/LinuxInfoLineMapper;

    invoke-direct {v1}, Lcom/microblink/internal/services/linux/LinuxInfoLineMapper;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/internal/services/linux/InfoLine;

    invoke-virtual {v1, v2}, Lcom/microblink/internal/services/linux/LinuxInfoLineMapper;->transform(Lcom/microblink/internal/services/linux/InfoLine;)Lcom/microblink/internal/OcrAdditionalLine;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
