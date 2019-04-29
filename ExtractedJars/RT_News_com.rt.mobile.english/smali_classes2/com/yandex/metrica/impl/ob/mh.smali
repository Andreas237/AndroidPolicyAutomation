.class public Lcom/yandex/metrica/impl/ob/mh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/mm;


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/mg;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 28
    new-instance v0, Lcom/yandex/metrica/impl/ob/mf;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/mf;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/mh;-><init>(Lcom/yandex/metrica/impl/ob/mf;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/mf;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/mf;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 32
    new-instance v0, Lcom/yandex/metrica/impl/ob/mg;

    const-string v1, "AES/CBC/PKCS5Padding"

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/mf;->a()[B

    move-result-object v2

    .line 33
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/mf;->b()[B

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/yandex/metrica/impl/ob/mg;-><init>(Ljava/lang/String;[B[B)V

    .line 32
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/mh;-><init>(Lcom/yandex/metrica/impl/ob/mg;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/mg;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/mg;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/mh;->a:Lcom/yandex/metrica/impl/ob/mg;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/ml;
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 43
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->b()Ljava/lang/String;

    move-result-object v0

    .line 45
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    :try_start_0
    const-string v1, "UTF-8"

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 48
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/mh;->a:Lcom/yandex/metrica/impl/ob/mg;

    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ob/mg;->a([B)[B

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 50
    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 56
    :catch_0
    :cond_0
    new-instance v0, Lcom/yandex/metrica/impl/ob/ml;

    invoke-virtual {p1, v2}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/mh;->a()Lcom/yandex/metrica/impl/ob/mo;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/yandex/metrica/impl/ob/ml;-><init>(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/mo;)V

    return-object v0
.end method

.method public a()Lcom/yandex/metrica/impl/ob/mo;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 75
    sget-object v0, Lcom/yandex/metrica/impl/ob/mo;->c:Lcom/yandex/metrica/impl/ob/mo;

    return-object v0
.end method

.method public a([B)[B
    .locals 3
    .param p1    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    .line 61
    new-array v1, v0, [B

    if-eqz p1, :cond_0

    .line 62
    array-length v2, p1

    if-lez v2, :cond_0

    .line 64
    :try_start_0
    invoke-static {p1, v0}, Landroid/util/Base64;->decode([BI)[B

    move-result-object p1

    .line 65
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/mh;->a:Lcom/yandex/metrica/impl/ob/mg;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/mg;->b([B)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object p1, v1

    :goto_0
    return-object p1
.end method
