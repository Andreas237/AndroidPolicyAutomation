.class public Lcom/yandex/metrica/impl/ob/iy;
.super Lcom/yandex/metrica/impl/ob/in;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/in<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/nc;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nc<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nc;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/nc;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/ik;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/nc<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/ik;",
            ")V"
        }
    .end annotation

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    move-object v5, p5

    .line 27
    invoke-direct/range {v0 .. v5}, Lcom/yandex/metrica/impl/ob/in;-><init>(ILjava/lang/String;Ljava/lang/Object;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    .line 34
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/iy;->a:Lcom/yandex/metrica/impl/ob/nc;

    return-void
.end method


# virtual methods
.method protected a(Lcom/yandex/metrica/impl/ob/jg$a$a;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/jg$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 39
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/iy;->a:Lcom/yandex/metrica/impl/ob/nc;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/iy;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/yandex/metrica/impl/ob/nc;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 40
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [B

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    :goto_0
    iput-object v0, p1, Lcom/yandex/metrica/impl/ob/jg$a$c;->b:[B

    return-void
.end method
