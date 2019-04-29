.class Lcom/yandex/metrica/impl/ob/gf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/yandex/metrica/impl/ob/gj;

.field private c:I

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/ge;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/ge;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/ge;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/gj;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gf;->a:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/gf;->b:Lcom/yandex/metrica/impl/ob/gj;

    .line 30
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gf;->d:Ljava/util/List;

    .line 31
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gf;->e:Ljava/util/List;

    .line 32
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gf;->f:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/ge;)V
    .locals 2

    .line 36
    iget v0, p0, Lcom/yandex/metrica/impl/ob/gf;->c:I

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ge;->c()Lcom/yandex/metrica/impl/bl$a;

    move-result-object v1

    iget v1, v1, Lcom/yandex/metrica/impl/bl$a;->b:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/yandex/metrica/impl/ob/gf;->c:I

    .line 37
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gf;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    sget-object v0, Lcom/yandex/metrica/impl/ob/gf$1;->a:[I

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gf;->b:Lcom/yandex/metrica/impl/ob/gj;

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/ge;->a(Lcom/yandex/metrica/impl/ob/gj;)Lcom/yandex/metrica/impl/ob/ge$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ge$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 41
    :pswitch_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gf;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 39
    :pswitch_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gf;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a()Z
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gf;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()I
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gf;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gf;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/ge;",
            ">;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gf;->d:Ljava/util/List;

    return-object v0
.end method

.method public e()Ljava/lang/Long;
    .locals 4

    const-wide v0, 0x7fffffffffffffffL

    .line 71
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gf;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/ob/ge;

    .line 73
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ge;->c()Lcom/yandex/metrica/impl/bl$a;

    move-result-object v2

    iget-wide v2, v2, Lcom/yandex/metrica/impl/bl$a;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 74
    invoke-virtual {v2, v0}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result v3

    if-gez v3, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 86
    :cond_1
    check-cast p1, Lcom/yandex/metrica/impl/ob/gf;

    .line 88
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gf;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/gf;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gf;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
