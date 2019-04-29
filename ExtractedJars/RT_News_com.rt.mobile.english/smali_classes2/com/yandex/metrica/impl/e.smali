.class public Lcom/yandex/metrica/impl/e;
.super Lcom/yandex/metrica/impl/ak;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/e$b;,
        Lcom/yandex/metrica/impl/e$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/fg;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/fg;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ak;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/yandex/metrica/impl/e;->a:Lcom/yandex/metrica/impl/ob/fg;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/e;)Lcom/yandex/metrica/impl/ob/fg;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/yandex/metrica/impl/e;->a:Lcom/yandex/metrica/impl/ob/fg;

    return-object p0
.end method


# virtual methods
.method protected a(Lcom/yandex/metrica/impl/ob/ic;)I
    .locals 2

    .line 44
    iget-object p1, p0, Lcom/yandex/metrica/impl/e;->a:Lcom/yandex/metrica/impl/ob/fg;

    const-wide/16 v0, -0x1

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/fg;->c(J)J

    move-result-wide v0

    long-to-int p1, v0

    return p1
.end method

.method a()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Lcom/yandex/metrica/impl/ak$a;",
            ">;"
        }
    .end annotation

    .line 32
    new-instance v0, Lcom/yandex/metrica/impl/e$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/e$1;-><init>(Lcom/yandex/metrica/impl/e;)V

    return-object v0
.end method

.method protected a(Lcom/yandex/metrica/impl/ob/ic;I)V
    .locals 3

    .line 49
    iget-object v0, p0, Lcom/yandex/metrica/impl/e;->a:Lcom/yandex/metrica/impl/ob/fg;

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fg;->f(J)Lcom/yandex/metrica/impl/ob/fg;

    .line 50
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ic;->c()Lcom/yandex/metrica/impl/ob/ic;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ic;->j()V

    return-void
.end method
