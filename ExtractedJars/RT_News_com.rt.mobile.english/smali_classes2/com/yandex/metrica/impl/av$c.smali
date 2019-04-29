.class Lcom/yandex/metrica/impl/av$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/av;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/yandex/metrica/impl/q$a;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final t:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/yandex/metrica/impl/q$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Ljava/lang/String;

.field protected c:I

.field protected d:J

.field protected e:Ljava/lang/String;

.field protected f:Ljava/lang/String;

.field protected g:Ljava/lang/String;

.field protected h:Ljava/lang/Integer;

.field protected i:Ljava/lang/Integer;

.field protected j:Ljava/lang/String;

.field protected k:Ljava/lang/String;

.field protected l:I

.field protected m:I

.field protected n:Ljava/lang/String;

.field protected o:Ljava/lang/String;

.field protected p:Ljava/lang/String;

.field protected q:Lcom/yandex/metrica/impl/ob/mo;

.field protected r:Lcom/yandex/metrica/impl/r;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 439
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 440
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->c:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$e;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->s:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$j;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->f:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$f;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->n:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$i;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->e:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$e;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->p:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$h;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->q:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$e;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->h:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$e;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->i:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$e;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->w:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$e;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->z:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$f;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->A:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->B:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$e;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->D:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->E:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->j:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->l:Lcom/yandex/metrica/impl/q$a;

    const-class v2, Lcom/yandex/metrica/impl/av$b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/av$c;->s:Ljava/util/Map;

    .line 459
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 460
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->b:Lcom/yandex/metrica/impl/q$a;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->c:Lcom/yandex/metrica/impl/q$a;

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->s:Lcom/yandex/metrica/impl/q$a;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->f:Lcom/yandex/metrica/impl/q$a;

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->w:Lcom/yandex/metrica/impl/q$a;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->n:Lcom/yandex/metrica/impl/q$a;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->e:Lcom/yandex/metrica/impl/q$a;

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->p:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->q:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0xb

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->h:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0xc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->i:Lcom/yandex/metrica/impl/q$a;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->y:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0xd

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->z:Lcom/yandex/metrica/impl/q$a;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->B:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->C:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x11

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->D:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x12

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->E:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x13

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->j:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->l:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x15

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/av$c;->t:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 536
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(IZ)Lcom/yandex/metrica/impl/av$c;
    .locals 2

    .line 484
    invoke-static {p0}, Lcom/yandex/metrica/impl/q$a;->a(I)Lcom/yandex/metrica/impl/q$a;

    move-result-object p0

    .line 1501
    sget-object v0, Lcom/yandex/metrica/impl/av$1;->a:[I

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/q$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1512
    sget-object p1, Lcom/yandex/metrica/impl/av$c;->s:Ljava/util/Map;

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    goto :goto_0

    :pswitch_0
    if-eqz p1, :cond_0

    .line 1506
    const-class p1, Lcom/yandex/metrica/impl/av$e;

    goto :goto_0

    .line 1508
    :cond_0
    const-class p1, Lcom/yandex/metrica/impl/av$g;

    .line 486
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/av$c;->t:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    const/4 v0, 0x0

    .line 490
    :try_start_0
    new-array v1, v0, [Ljava/lang/Class;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/av$c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 492
    :catch_0
    new-instance p1, Lcom/yandex/metrica/impl/av$c;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/av$c;-><init>()V

    .line 495
    :goto_1
    invoke-virtual {p1, p0}, Lcom/yandex/metrica/impl/av$c;->a(Ljava/lang/Integer;)Lcom/yandex/metrica/impl/av$c;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method a(I)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 550
    iput p1, p0, Lcom/yandex/metrica/impl/av$c;->c:I

    return-object p0
.end method

.method a(J)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 555
    iput-wide p1, p0, Lcom/yandex/metrica/impl/av$c;->d:J

    return-object p0
.end method

.method a(Lcom/yandex/metrica/impl/ob/mo;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 620
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->q:Lcom/yandex/metrica/impl/ob/mo;

    return-object p0
.end method

.method a(Lcom/yandex/metrica/impl/r;)Lcom/yandex/metrica/impl/av$c;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/r;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 626
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->r:Lcom/yandex/metrica/impl/r;

    return-object p0
.end method

.method a(Ljava/lang/Integer;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 575
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->h:Ljava/lang/Integer;

    return-object p0
.end method

.method a(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 540
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->a:Ljava/lang/String;

    return-object p0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    .line 631
    iget-object v0, p0, Lcom/yandex/metrica/impl/av$c;->a:Ljava/lang/String;

    return-object v0
.end method

.method b(I)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 600
    iput p1, p0, Lcom/yandex/metrica/impl/av$c;->l:I

    return-object p0
.end method

.method b(Ljava/lang/Integer;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 585
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->i:Ljava/lang/Integer;

    return-object p0
.end method

.method b(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 545
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->b:Ljava/lang/String;

    return-object p0
.end method

.method protected b()[B
    .locals 1

    .line 635
    iget-object v0, p0, Lcom/yandex/metrica/impl/av$c;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/av$c;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/yandex/metrica/impl/bp;->c(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method c(I)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 605
    iput p1, p0, Lcom/yandex/metrica/impl/av$c;->m:I

    return-object p0
.end method

.method c(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 560
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->e:Ljava/lang/String;

    return-object p0
.end method

.method protected c()Ljava/lang/Integer;
    .locals 1

    .line 639
    iget-object v0, p0, Lcom/yandex/metrica/impl/av$c;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method d(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 565
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->g:Ljava/lang/String;

    return-object p0
.end method

.method protected d()Ljava/lang/String;
    .locals 1

    .line 647
    iget-object v0, p0, Lcom/yandex/metrica/impl/av$c;->j:Ljava/lang/String;

    return-object v0
.end method

.method e(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 570
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->f:Ljava/lang/String;

    return-object p0
.end method

.method e()Lcom/yandex/metrica/impl/ob/jc$c$e$a;
    .locals 6

    .line 651
    new-instance v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jc$c$e$a;-><init>()V

    .line 653
    iget v1, p0, Lcom/yandex/metrica/impl/av$c;->m:I

    iget-object v2, p0, Lcom/yandex/metrica/impl/av$c;->n:Ljava/lang/String;

    iget-object v3, p0, Lcom/yandex/metrica/impl/av$c;->g:Ljava/lang/String;

    iget-object v4, p0, Lcom/yandex/metrica/impl/av$c;->f:Ljava/lang/String;

    iget-object v5, p0, Lcom/yandex/metrica/impl/av$c;->o:Ljava/lang/String;

    invoke-static {v1, v2, v3, v4, v5}, Lcom/yandex/metrica/impl/av;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    move-result-object v1

    .line 655
    iget-object v2, p0, Lcom/yandex/metrica/impl/av$c;->e:Ljava/lang/String;

    invoke-static {v2}, Lcom/yandex/metrica/impl/av;->d(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/jc$c$b;

    move-result-object v2

    .line 656
    iget-object v3, p0, Lcom/yandex/metrica/impl/av$c;->k:Ljava/lang/String;

    invoke-static {v3}, Lcom/yandex/metrica/impl/av;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

    move-result-object v3

    if-eqz v1, :cond_0

    .line 660
    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->h:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    :cond_0
    if-eqz v2, :cond_1

    .line 663
    iput-object v2, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->g:Lcom/yandex/metrica/impl/ob/jc$c$b;

    .line 665
    :cond_1
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/av$c;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 666
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/av$c;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->e:Ljava/lang/String;

    .line 668
    :cond_2
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/av$c;->b()[B

    move-result-object v1

    if-eqz v1, :cond_3

    .line 669
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/av$c;->b()[B

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    .line 671
    :cond_3
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/av$c;->d()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 672
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/av$c;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->i:Ljava/lang/String;

    :cond_4
    if-eqz v3, :cond_5

    .line 675
    iput-object v3, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->j:Lcom/yandex/metrica/impl/ob/jc$c$e$a$a;

    .line 678
    :cond_5
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/av$c;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->d:I

    .line 679
    iget v1, p0, Lcom/yandex/metrica/impl/av$c;->c:I

    int-to-long v1, v1

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->b:J

    .line 680
    iget-wide v1, p0, Lcom/yandex/metrica/impl/av$c;->d:J

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->c:J

    .line 681
    iget v1, p0, Lcom/yandex/metrica/impl/av$c;->l:I

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->k:I

    .line 682
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/av$c;->f()I

    move-result v1

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->l:I

    .line 683
    iget-object v1, p0, Lcom/yandex/metrica/impl/av$c;->e:Ljava/lang/String;

    invoke-static {v1}, Lcom/yandex/metrica/impl/av;->e(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->m:I

    .line 684
    iget-object v1, p0, Lcom/yandex/metrica/impl/av$c;->p:Ljava/lang/String;

    if-nez v1, :cond_6

    const/4 v1, 0x0

    new-array v1, v1, [B

    goto :goto_0

    :cond_6
    iget-object v1, p0, Lcom/yandex/metrica/impl/av$c;->p:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    :goto_0
    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->n:[B

    .line 685
    invoke-static {}, Lcom/yandex/metrica/impl/av;->b()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/yandex/metrica/impl/av$c;->r:Lcom/yandex/metrica/impl/r;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_7

    .line 687
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->o:I

    :cond_7
    return-object v0
.end method

.method protected f()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method f(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 580
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->o:Ljava/lang/String;

    return-object p0
.end method

.method g(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 590
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->j:Ljava/lang/String;

    return-object p0
.end method

.method h(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 595
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->k:Ljava/lang/String;

    return-object p0
.end method

.method i(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 610
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->n:Ljava/lang/String;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;
    .locals 0

    .line 615
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$c;->p:Ljava/lang/String;

    return-object p0
.end method
