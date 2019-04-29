.class Lcom/yandex/metrica/impl/ob/hb;
.super Lcom/yandex/metrica/impl/ao;
.source "SourceFile"


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/hi;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/gs;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/ex;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private l:Lcom/yandex/metrica/impl/ob/ew;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private m:Lcom/yandex/metrica/impl/ob/gr;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private n:Lcom/yandex/metrica/impl/ob/fj;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private o:J

.field private p:J

.field private q:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/hi;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/hi;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 65
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/eu;->g()Lcom/yandex/metrica/impl/ob/ex;

    move-result-object v3

    .line 66
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/eu;->h()Lcom/yandex/metrica/impl/ob/ew;

    move-result-object v4

    new-instance v5, Lcom/yandex/metrica/impl/ob/gr;

    invoke-direct {v5, p1}, Lcom/yandex/metrica/impl/ob/gr;-><init>(Landroid/content/Context;)V

    new-instance v6, Lcom/yandex/metrica/impl/ob/fj;

    .line 68
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/eu;->c()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object p1

    invoke-direct {v6, p1}, Lcom/yandex/metrica/impl/ob/fj;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    move-object v1, p0

    move-object v2, p2

    .line 62
    invoke-direct/range {v1 .. v6}, Lcom/yandex/metrica/impl/ob/hb;-><init>(Lcom/yandex/metrica/impl/ob/hi;Lcom/yandex/metrica/impl/ob/ex;Lcom/yandex/metrica/impl/ob/ew;Lcom/yandex/metrica/impl/ob/gr;Lcom/yandex/metrica/impl/ob/fj;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/hi;Lcom/yandex/metrica/impl/ob/ex;Lcom/yandex/metrica/impl/ob/ew;Lcom/yandex/metrica/impl/ob/gr;Lcom/yandex/metrica/impl/ob/fj;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/hi;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ex;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ew;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/gr;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/fj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 322
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ao;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    .line 58
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/hb;->p:J

    .line 59
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/hb;->q:J

    .line 324
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    .line 325
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/hi;->a()Lcom/yandex/metrica/impl/ob/gs;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hb;->b:Lcom/yandex/metrica/impl/ob/gs;

    .line 326
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/hb;->c:Lcom/yandex/metrica/impl/ob/ex;

    .line 327
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/hb;->l:Lcom/yandex/metrica/impl/ob/ew;

    .line 328
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/hb;->m:Lcom/yandex/metrica/impl/ob/gr;

    .line 329
    iput-object p5, p0, Lcom/yandex/metrica/impl/ob/hb;->n:Lcom/yandex/metrica/impl/ob/fj;

    .line 3301
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/hb;->n:Lcom/yandex/metrica/impl/ob/fj;

    const-wide/16 p2, -0x1

    invoke-virtual {p1, p2, p3}, Lcom/yandex/metrica/impl/ob/fj;->b(J)J

    move-result-wide p1

    const-wide/16 p3, 0x1

    add-long v0, p1, p3

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/hb;->o:J

    .line 331
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/hi;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/hb;->a(Ljava/util/List;)V

    return-void
.end method

.method private b(Ljava/util/List;)[Lcom/yandex/metrica/impl/ob/jc$b$a;
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/gx;",
            ">;)[",
            "Lcom/yandex/metrica/impl/ob/jc$b$a;"
        }
    .end annotation

    .line 212
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 213
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/gx;

    .line 214
    invoke-virtual {p0, v1}, Lcom/yandex/metrica/impl/ob/hb;->a(Lcom/yandex/metrica/impl/ob/gx;)Lcom/yandex/metrica/impl/ob/jc$b$a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 216
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lcom/yandex/metrica/impl/ob/jc$b$a;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/yandex/metrica/impl/ob/jc$b$a;

    return-object p1
.end method


# virtual methods
.method protected D()V
    .locals 3

    .line 105
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hb;->c:Lcom/yandex/metrica/impl/ob/ex;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/hb;->p:J

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ex;->c(J)I

    .line 108
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hb;->l:Lcom/yandex/metrica/impl/ob/ew;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/hb;->q:J

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ew;->c(J)I

    return-void
.end method

.method public E()V
    .locals 5

    .line 112
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/hb;->p:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 114
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hb;->c:Lcom/yandex/metrica/impl/ob/ex;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/hb;->p:J

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ex;->c(J)I

    :cond_0
    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ob/gx;)Lcom/yandex/metrica/impl/ob/jc$b$a;
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/gx;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 239
    new-instance v0, Lcom/yandex/metrica/impl/ob/jc$b$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jc$b$a;-><init>()V

    .line 240
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/gx;->a()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jc$b$a;->b:J

    .line 241
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/gx;->b()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jc$b$a;->c:J

    .line 242
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/gx;->d()Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 244
    invoke-static {v1}, Lcom/yandex/metrica/impl/av;->b(Lorg/json/JSONArray;)[Lcom/yandex/metrica/impl/ob/jc$a;

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    .line 246
    :cond_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/gx;->c()Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 248
    invoke-static {p1}, Lcom/yandex/metrica/impl/av;->a(Lorg/json/JSONArray;)[Lcom/yandex/metrica/impl/ob/jc$d;

    move-result-object p1

    iput-object p1, v0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    :cond_1
    return-object v0
.end method

.method a(Lcom/yandex/metrica/impl/ob/he;)Lcom/yandex/metrica/impl/ob/jc$b$b;
    .locals 7
    .param p1    # Lcom/yandex/metrica/impl/ob/he;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 221
    new-instance v0, Lcom/yandex/metrica/impl/ob/jc$b$b;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jc$b$b;-><init>()V

    .line 222
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v1

    .line 223
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/he;->a()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->b:J

    .line 224
    invoke-virtual {v1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->d:J

    .line 225
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/he;->a:Lcom/yandex/metrica/impl/ob/gs$a;

    .line 2264
    sget-object v3, Lcom/yandex/metrica/impl/ob/hb$1;->a:[I

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/gs$a;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    move v2, v4

    goto :goto_0

    :pswitch_1
    move v2, v3

    .line 225
    :goto_0
    iput v2, v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->l:I

    .line 226
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/he;->b()J

    move-result-wide v5

    iput-wide v5, v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->c:J

    .line 227
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    iput-wide v5, v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->e:D

    .line 228
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    iput-wide v5, v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->f:D

    .line 229
    invoke-virtual {v1}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->g:I

    .line 230
    invoke-virtual {v1}, Landroid/location/Location;->getBearing()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->h:I

    .line 231
    invoke-virtual {v1}, Landroid/location/Location;->getSpeed()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->i:I

    .line 232
    invoke-virtual {v1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    move-result-wide v5

    long-to-int p1, v5

    iput p1, v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->j:I

    .line 233
    invoke-virtual {v1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object p1

    const-string v1, "gps"

    .line 3255
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "network"

    .line 3257
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v3, 0x2

    goto :goto_1

    :cond_1
    move v3, v4

    .line 233
    :goto_1
    iput v3, v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->k:I

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method a(Ljava/util/List;Ljava/util/List;)Lcom/yandex/metrica/impl/ob/jc$b;
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/he;",
            ">;",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/gx;",
            ">;)",
            "Lcom/yandex/metrica/impl/ob/jc$b;"
        }
    .end annotation

    .line 191
    new-instance v0, Lcom/yandex/metrica/impl/ob/jc$b;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jc$b;-><init>()V

    .line 193
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 2204
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2205
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/ob/he;

    .line 2206
    invoke-virtual {p0, v2}, Lcom/yandex/metrica/impl/ob/hb;->a(Lcom/yandex/metrica/impl/ob/he;)Lcom/yandex/metrica/impl/ob/jc$b$b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2208
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lcom/yandex/metrica/impl/ob/jc$b$b;

    invoke-interface {v1, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/yandex/metrica/impl/ob/jc$b$b;

    .line 194
    iput-object p1, v0, Lcom/yandex/metrica/impl/ob/jc$b;->b:[Lcom/yandex/metrica/impl/ob/jc$b$b;

    .line 196
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_2

    .line 197
    invoke-direct {p0, p2}, Lcom/yandex/metrica/impl/ob/hb;->b(Ljava/util/List;)[Lcom/yandex/metrica/impl/ob/jc$b$a;

    move-result-object p1

    iput-object p1, v0, Lcom/yandex/metrica/impl/ob/jc$b;->c:[Lcom/yandex/metrica/impl/ob/jc$b$a;

    :cond_2
    return-object v0
.end method

.method protected a(Landroid/net/Uri$Builder;)V
    .locals 3
    .param p1    # Landroid/net/Uri$Builder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 274
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ao;->a(Landroid/net/Uri$Builder;)V

    const-string v0, "location"

    .line 275
    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "deviceid"

    .line 276
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "device_type"

    .line 277
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "uuid"

    .line 278
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "analytics_sdk_version_name"

    .line 279
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    .line 280
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->h()Ljava/lang/String;

    move-result-object v1

    .line 279
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "analytics_sdk_build_number"

    .line 281
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "analytics_sdk_build_type"

    .line 282
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "app_version_name"

    .line 283
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "app_build_number"

    .line 284
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "os_version"

    .line 285
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "os_api_level"

    .line 286
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->n()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "is_rooted"

    .line 287
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "app_framework"

    .line 288
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "app_id"

    .line 289
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "app_platform"

    .line 290
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "android_id"

    .line 291
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hi;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "request_id"

    .line 292
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/hb;->o:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 293
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hi;->B()Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v1, ""

    goto :goto_0

    .line 294
    :cond_0
    iget-object v1, v0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;->a:Ljava/lang/String;

    :goto_0
    const-string v2, "adv_id"

    if-nez v1, :cond_1

    const-string v1, ""

    .line 295
    :cond_1
    invoke-virtual {p1, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v1, "limit_ad_tracking"

    if-nez v0, :cond_2

    const-string v0, ""

    goto :goto_1

    .line 296
    :cond_2
    iget-object v0, v0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;->b:Ljava/lang/Boolean;

    .line 297
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/hb;->a(Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v0

    .line 296
    :goto_1
    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    return-void
.end method

.method b(Ljava/util/Map;)Ljava/util/List;
    .locals 6
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/he;",
            ">;"
        }
    .end annotation

    .line 160
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 161
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 162
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    .line 163
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    .line 164
    :cond_1
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/hb;->m:Lcom/yandex/metrica/impl/ob/gr;

    .line 165
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5, v1}, Lcom/yandex/metrica/impl/ob/gr;->a(JLjava/lang/String;)Lcom/yandex/metrica/impl/ob/he;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_0

    .line 167
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public b()Z
    .locals 7

    .line 75
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hi;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hb;->a:Lcom/yandex/metrica/impl/ob/hi;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hi;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 83
    :cond_1
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/hb;->t()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 1127
    :cond_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hb;->c:Lcom/yandex/metrica/impl/ob/ex;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/hb;->b:Lcom/yandex/metrica/impl/ob/gs;

    iget v2, v2, Lcom/yandex/metrica/impl/ob/gs;->f:I

    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/ob/ex;->b(I)Ljava/util/Map;

    move-result-object v0

    .line 1128
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/hb;->l:Lcom/yandex/metrica/impl/ob/ew;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/hb;->b:Lcom/yandex/metrica/impl/ob/gs;

    iget v3, v3, Lcom/yandex/metrica/impl/ob/gs;->f:I

    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/ew;->b(I)Ljava/util/Map;

    move-result-object v2

    .line 1129
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1130
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1132
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v5

    if-lez v5, :cond_3

    .line 1133
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iput-wide v5, p0, Lcom/yandex/metrica/impl/ob/hb;->p:J

    .line 1136
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/hb;->b(Ljava/util/Map;)Ljava/util/List;

    move-result-object v3

    .line 1140
    :cond_3
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 1141
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/yandex/metrica/impl/ob/hb;->q:J

    .line 1144
    invoke-virtual {p0, v2}, Lcom/yandex/metrica/impl/ob/hb;->c(Ljava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 1148
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_6

    .line 1149
    :cond_5
    invoke-virtual {p0, v3, v4}, Lcom/yandex/metrica/impl/ob/hb;->a(Ljava/util/List;Ljava/util/List;)Lcom/yandex/metrica/impl/ob/jc$b;

    move-result-object v0

    .line 1150
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/e;)[B

    move-result-object v0

    .line 1152
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/hb;->c([B)Z

    move-result v1

    :cond_6
    return v1
.end method

.method c(Ljava/util/Map;)Ljava/util/List;
    .locals 6
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/gx;",
            ">;"
        }
    .end annotation

    .line 175
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 176
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 177
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    .line 178
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    .line 179
    :cond_1
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/hb;->m:Lcom/yandex/metrica/impl/ob/gr;

    .line 180
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5, v1}, Lcom/yandex/metrica/impl/ob/gr;->b(JLjava/lang/String;)Lcom/yandex/metrica/impl/ob/gx;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_0

    .line 182
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public c()Z
    .locals 4

    .line 94
    invoke-super {p0}, Lcom/yandex/metrica/impl/ao;->c()Z

    move-result v0

    .line 1306
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hb;->n:Lcom/yandex/metrica/impl/ob/fj;

    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/hb;->o:J

    invoke-virtual {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/fj;->c(J)Lcom/yandex/metrica/impl/ob/fj;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/fj;->i()V

    return v0
.end method

.method public u()Z
    .locals 3

    .line 120
    invoke-super {p0}, Lcom/yandex/metrica/impl/ao;->u()Z

    move-result v0

    .line 121
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/hb;->l()I

    move-result v1

    const/16 v2, 0x190

    if-eq v2, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/2addr v0, v1

    return v0
.end method
