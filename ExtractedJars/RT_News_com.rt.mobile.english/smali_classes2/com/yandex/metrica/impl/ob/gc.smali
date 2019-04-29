.class public Lcom/yandex/metrica/impl/ob/gc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/mf;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 20
    new-instance v0, Lcom/yandex/metrica/impl/ob/mf;

    invoke-static {}, Lcom/yandex/metrica/impl/t;->a()Lcom/yandex/metrica/impl/t;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/t;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/mf;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/gc;-><init>(Lcom/yandex/metrica/impl/ob/mf;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/mf;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gc;->a:Lcom/yandex/metrica/impl/ob/mf;

    return-void
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/fn;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/yandex/metrica/impl/ob/fn<",
            "Lcom/yandex/metrica/impl/ob/jj$a;",
            ">;"
        }
    .end annotation

    .line 29
    new-instance v0, Lcom/yandex/metrica/impl/ob/fm;

    new-instance v1, Lcom/yandex/metrica/impl/ob/fr;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/fr;-><init>()V

    new-instance v2, Lcom/yandex/metrica/impl/ob/mg;

    const-string v3, "AES/CBC/PKCS5Padding"

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/gc;->a:Lcom/yandex/metrica/impl/ob/mf;

    .line 33
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/mf;->a()[B

    move-result-object v4

    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/gc;->a:Lcom/yandex/metrica/impl/ob/mf;

    .line 34
    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/mf;->b()[B

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lcom/yandex/metrica/impl/ob/mg;-><init>(Ljava/lang/String;[B[B)V

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fm;-><init>(Lcom/yandex/metrica/impl/ob/fn;Lcom/yandex/metrica/impl/ob/mg;)V

    return-object v0
.end method

.method public b()Lcom/yandex/metrica/impl/ob/fn;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/yandex/metrica/impl/ob/fn<",
            "Lcom/yandex/metrica/impl/ob/ji$a;",
            ">;"
        }
    .end annotation

    .line 40
    new-instance v0, Lcom/yandex/metrica/impl/ob/fm;

    new-instance v1, Lcom/yandex/metrica/impl/ob/fq;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/fq;-><init>()V

    new-instance v2, Lcom/yandex/metrica/impl/ob/mg;

    const-string v3, "AES/CBC/PKCS5Padding"

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/gc;->a:Lcom/yandex/metrica/impl/ob/mf;

    .line 44
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/mf;->a()[B

    move-result-object v4

    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/gc;->a:Lcom/yandex/metrica/impl/ob/mf;

    .line 45
    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/mf;->b()[B

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lcom/yandex/metrica/impl/ob/mg;-><init>(Ljava/lang/String;[B[B)V

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fm;-><init>(Lcom/yandex/metrica/impl/ob/fn;Lcom/yandex/metrica/impl/ob/mg;)V

    return-object v0
.end method
