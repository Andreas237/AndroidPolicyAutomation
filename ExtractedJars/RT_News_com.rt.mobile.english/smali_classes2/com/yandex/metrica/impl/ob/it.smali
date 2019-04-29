.class public Lcom/yandex/metrica/impl/ob/it;
.super Lcom/yandex/metrica/impl/ob/in;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/in<",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;DLcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V
    .locals 6
    .param p1    # Ljava/lang/String;
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
            "D",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/ik;",
            ")V"
        }
    .end annotation

    .line 25
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const/4 v1, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v4, p4

    move-object v5, p5

    .line 22
    invoke-direct/range {v0 .. v5}, Lcom/yandex/metrica/impl/ob/in;-><init>(ILjava/lang/String;Ljava/lang/Object;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/yandex/metrica/impl/ob/jg$a$a;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/jg$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 33
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/it;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p1, Lcom/yandex/metrica/impl/ob/jg$a$c;->c:D

    return-void
.end method
