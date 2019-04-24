.class final Lcom/microblink/internal/FileMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Ljava/util/List<",
        "Ljava/io/File;",
        ">;[",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FileMapper"


# instance fields
.field private final pattern:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/FileMapper;->pattern:Ljava/lang/String;

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

    check-cast p1, [Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/FileMapper;->transform([Ljava/io/File;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final transform([Ljava/io/File;)Ljava/util/List;
    .locals 6
    .param p1    # [Ljava/io/File;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    array-length v0, p1

    if-lez v0, :cond_3

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, p1, v3

    if-eqz v4, :cond_1

    iget-object v5, p0, Lcom/microblink/internal/FileMapper;->pattern:Ljava/lang/String;

    invoke-static {v5}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, p0, Lcom/microblink/internal/FileMapper;->pattern:Ljava/lang/String;

    invoke-static {v4, v5}, Lcom/microblink/internal/DiskUtils;->containsId(Ljava/io/File;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    :cond_0
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v1

    :catch_0
    move-exception p1

    const-string v1, "FileMapper"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
