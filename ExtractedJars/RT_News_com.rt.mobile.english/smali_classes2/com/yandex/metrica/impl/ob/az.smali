.class public Lcom/yandex/metrica/impl/ob/az;
.super Lcom/yandex/metrica/impl/ob/be;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/be<",
        "Lcom/yandex/metrica/impl/ob/bg;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ck;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/x;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/be;-><init>()V

    .line 23
    new-instance v0, Lcom/yandex/metrica/impl/ob/ck;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/ck;-><init>(Lcom/yandex/metrica/impl/ob/x;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/az;->a:Lcom/yandex/metrica/impl/ob/ck;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/yandex/metrica/impl/ob/bb;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/yandex/metrica/impl/ob/bb<",
            "Lcom/yandex/metrica/impl/ob/bg;",
            ">;"
        }
    .end annotation

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    invoke-static {p1}, Lcom/yandex/metrica/impl/q$a;->a(I)Lcom/yandex/metrica/impl/q$a;

    move-result-object p1

    .line 30
    sget-object v1, Lcom/yandex/metrica/impl/ob/az$1;->a:[I

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/q$a;->ordinal()I

    move-result p1

    aget p1, v1, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 38
    :pswitch_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/az;->a:Lcom/yandex/metrica/impl/ob/ck;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ck;->c()Lcom/yandex/metrica/impl/ob/bk;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 35
    :pswitch_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/az;->a:Lcom/yandex/metrica/impl/ob/ck;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ck;->b()Lcom/yandex/metrica/impl/ob/bi;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 32
    :pswitch_2
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/az;->a:Lcom/yandex/metrica/impl/ob/ck;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ck;->a()Lcom/yandex/metrica/impl/ob/bj;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    :goto_0
    new-instance p1, Lcom/yandex/metrica/impl/ob/ba;

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ba;-><init>(Ljava/util/List;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
