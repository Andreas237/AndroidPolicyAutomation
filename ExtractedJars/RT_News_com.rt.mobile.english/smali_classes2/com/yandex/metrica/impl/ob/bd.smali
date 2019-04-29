.class public Lcom/yandex/metrica/impl/ob/bd;
.super Lcom/yandex/metrica/impl/ob/be;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/be<",
        "Lcom/yandex/metrica/impl/ob/bq;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/bz;

.field private final b:Lcom/yandex/metrica/impl/ob/cy;

.field private final c:Lcom/yandex/metrica/impl/ob/bw;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/be;-><init>()V

    .line 30
    new-instance v0, Lcom/yandex/metrica/impl/ob/bz;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/bz;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/bd;->a:Lcom/yandex/metrica/impl/ob/bz;

    .line 31
    new-instance v0, Lcom/yandex/metrica/impl/ob/cy;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/cy;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/bd;->b:Lcom/yandex/metrica/impl/ob/cy;

    .line 32
    new-instance v0, Lcom/yandex/metrica/impl/ob/bw;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/bw;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/bd;->c:Lcom/yandex/metrica/impl/ob/bw;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/yandex/metrica/impl/ob/bb;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/yandex/metrica/impl/ob/bb<",
            "Lcom/yandex/metrica/impl/ob/bq;",
            ">;"
        }
    .end annotation

    .line 37
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 38
    invoke-static {p1}, Lcom/yandex/metrica/impl/q$a;->a(I)Lcom/yandex/metrica/impl/q$a;

    move-result-object p1

    .line 39
    sget-object v1, Lcom/yandex/metrica/impl/ob/bd$1;->a:[I

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/q$a;->ordinal()I

    move-result p1

    aget p1, v1, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 48
    :pswitch_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/bd;->c:Lcom/yandex/metrica/impl/ob/bw;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 45
    :pswitch_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/bd;->a:Lcom/yandex/metrica/impl/ob/bz;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 41
    :pswitch_2
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/bd;->b:Lcom/yandex/metrica/impl/ob/cy;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 42
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/bd;->a:Lcom/yandex/metrica/impl/ob/bz;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 54
    :goto_0
    new-instance p1, Lcom/yandex/metrica/impl/ob/ba;

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ba;-><init>(Ljava/util/List;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
