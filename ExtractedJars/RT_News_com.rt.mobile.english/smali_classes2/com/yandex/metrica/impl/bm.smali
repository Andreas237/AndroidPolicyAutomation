.class public Lcom/yandex/metrica/impl/bm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/am;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/bm$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/kt;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/jw;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/bm$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final d:Lcom/yandex/metrica/impl/bn;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final e:Lcom/yandex/metrica/impl/ob/lo;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/kt;Lcom/yandex/metrica/impl/ob/jw;)V
    .locals 6
    .param p1    # Lcom/yandex/metrica/impl/ob/kt;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/jw;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 51
    new-instance v3, Lcom/yandex/metrica/impl/bm$a;

    invoke-direct {v3}, Lcom/yandex/metrica/impl/bm$a;-><init>()V

    new-instance v4, Lcom/yandex/metrica/impl/bn;

    invoke-direct {v4}, Lcom/yandex/metrica/impl/bn;-><init>()V

    new-instance v5, Lcom/yandex/metrica/impl/ob/lo;

    invoke-direct {v5}, Lcom/yandex/metrica/impl/ob/lo;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/yandex/metrica/impl/bm;-><init>(Lcom/yandex/metrica/impl/ob/kt;Lcom/yandex/metrica/impl/ob/jw;Lcom/yandex/metrica/impl/bm$a;Lcom/yandex/metrica/impl/bn;Lcom/yandex/metrica/impl/ob/lo;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/kt;Lcom/yandex/metrica/impl/ob/jw;Lcom/yandex/metrica/impl/bm$a;Lcom/yandex/metrica/impl/bn;Lcom/yandex/metrica/impl/ob/lo;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/kt;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/jw;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/bm$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/bn;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/lo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p1, p0, Lcom/yandex/metrica/impl/bm;->a:Lcom/yandex/metrica/impl/ob/kt;

    .line 111
    iput-object p2, p0, Lcom/yandex/metrica/impl/bm;->b:Lcom/yandex/metrica/impl/ob/jw;

    .line 112
    iput-object p3, p0, Lcom/yandex/metrica/impl/bm;->c:Lcom/yandex/metrica/impl/bm$a;

    .line 113
    iput-object p4, p0, Lcom/yandex/metrica/impl/bm;->d:Lcom/yandex/metrica/impl/bn;

    .line 114
    iput-object p5, p0, Lcom/yandex/metrica/impl/bm;->e:Lcom/yandex/metrica/impl/ob/lo;

    return-void
.end method

.method private a([B)[B
    .locals 4

    const/4 v0, 0x0

    const/16 v1, 0x10

    .line 89
    :try_start_0
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    .line 90
    iget-object v2, p0, Lcom/yandex/metrica/impl/bm;->c:Lcom/yandex/metrica/impl/bm$a;

    const-string v3, "hBnBQbZrmjPXEWVJ"

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/yandex/metrica/impl/bm$a;->a([B[B)Lcom/yandex/metrica/impl/ob/mg;

    move-result-object v0

    .line 91
    array-length v2, p1

    sub-int/2addr v2, v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/yandex/metrica/impl/ob/mg;->a([BII)[B

    move-result-object p1

    .line 96
    iget-object v0, p0, Lcom/yandex/metrica/impl/bm;->e:Lcom/yandex/metrica/impl/ob/lo;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/lo;->b([B)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(I[BLjava/util/Map;)Z
    .locals 2
    .param p3    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    const/16 v1, 0xc8

    if-ne v1, p1, :cond_1

    const-string p1, "Content-Encoding"

    .line 62
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 63
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "encrypted"

    .line 64
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 65
    invoke-direct {p0, p2}, Lcom/yandex/metrica/impl/bm;->a([B)[B

    move-result-object p2

    :cond_0
    if-eqz p2, :cond_1

    .line 71
    iget-object p1, p0, Lcom/yandex/metrica/impl/bm;->d:Lcom/yandex/metrica/impl/bn;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/bn;->a([B)Lcom/yandex/metrica/impl/bn$b;

    move-result-object p1

    .line 73
    sget-object p2, Lcom/yandex/metrica/impl/bn$b$a;->b:Lcom/yandex/metrica/impl/bn$b$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->k()Lcom/yandex/metrica/impl/bn$b$a;

    move-result-object v1

    if-ne p2, v1, :cond_1

    .line 74
    iget-object p2, p0, Lcom/yandex/metrica/impl/bm;->a:Lcom/yandex/metrica/impl/ob/kt;

    iget-object v0, p0, Lcom/yandex/metrica/impl/bm;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {p2, p1, v0, p3}, Lcom/yandex/metrica/impl/ob/kt;->a(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/jw;Ljava/util/Map;)V

    const/4 v0, 0x1

    :cond_1
    return v0
.end method
