.class Lcom/yandex/metrica/impl/az;
.super Lcom/yandex/metrica/impl/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/az$a;,
        Lcom/yandex/metrica/impl/az$b;,
        Lcom/yandex/metrica/impl/az$c;
    }
.end annotation


# instance fields
.field l:Lcom/yandex/metrica/impl/ob/jc$c;

.field m:Lcom/yandex/metrica/impl/ob/es;

.field n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field o:I

.field p:I

.field private final q:Lcom/yandex/metrica/impl/ob/ab;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private r:Lcom/yandex/metrica/impl/az$c;

.field private final s:Lcom/yandex/metrica/impl/ob/nc;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nc<",
            "[B>;"
        }
    .end annotation
.end field

.field private final t:Lcom/yandex/metrica/impl/ob/lv;

.field private u:Lcom/yandex/metrica/impl/ob/jv;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 2

    .line 84
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->m()Lcom/yandex/metrica/impl/ob/es;

    move-result-object v0

    .line 87
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v1

    .line 82
    invoke-direct {p0, p1, v0, v1}, Lcom/yandex/metrica/impl/az;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/es;Lcom/yandex/metrica/impl/ob/jv;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/es;Lcom/yandex/metrica/impl/ob/jv;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/es;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/jv;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 97
    invoke-direct {p0}, Lcom/yandex/metrica/impl/l;-><init>()V

    const/4 v0, 0x0

    .line 71
    iput v0, p0, Lcom/yandex/metrica/impl/az;->o:I

    const/4 v0, -0x1

    .line 72
    iput v0, p0, Lcom/yandex/metrica/impl/az;->p:I

    .line 76
    new-instance v0, Lcom/yandex/metrica/impl/ob/mt;

    const-string v1, "event value in ReportTask"

    const v2, 0x3c000

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/mt;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/az;->s:Lcom/yandex/metrica/impl/ob/nc;

    .line 98
    iput-object p1, p0, Lcom/yandex/metrica/impl/az;->q:Lcom/yandex/metrica/impl/ob/ab;

    .line 99
    iput-object p2, p0, Lcom/yandex/metrica/impl/az;->m:Lcom/yandex/metrica/impl/ob/es;

    .line 100
    iput-object p3, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    .line 101
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->o()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/az;->t:Lcom/yandex/metrica/impl/ob/lv;

    return-void
.end method

.method public static K()Lcom/yandex/metrica/impl/az$a;
    .locals 1

    .line 592
    new-instance v0, Lcom/yandex/metrica/impl/az$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/az$a;-><init>()V

    return-object v0
.end method

.method private static a(Lcom/yandex/metrica/impl/a$a;)I
    .locals 6

    const/4 v0, 0x0

    .line 432
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    iget-object p0, p0, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 433
    invoke-static {v1}, Lcom/yandex/metrica/impl/az;->a(Lorg/json/JSONObject;)[Lcom/yandex/metrica/impl/ob/jc$c$a;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 435
    array-length v1, p0

    move v2, v0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, p0, v2

    const/4 v5, 0x7

    .line 436
    invoke-static {v5, v4}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v4
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    move v0, v3

    :cond_1
    return v0

    :catch_0
    return v0
.end method

.method private static a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 304
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 305
    invoke-virtual {p0, p1, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_0
    return-void
.end method

.method private static a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 299
    invoke-static {p2, p3}, Lcom/yandex/metrica/impl/bp;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 300
    invoke-virtual {p0, p1, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    return-void
.end method

.method private static a(Lorg/json/JSONObject;)[Lcom/yandex/metrica/impl/ob/jc$c$a;
    .locals 5

    .line 210
    invoke-virtual {p0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 212
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/jc$c$a;

    .line 214
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    .line 216
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 217
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 219
    :try_start_0
    new-instance v4, Lcom/yandex/metrica/impl/ob/jc$c$a;

    invoke-direct {v4}, Lcom/yandex/metrica/impl/ob/jc$c$a;-><init>()V

    .line 221
    iput-object v3, v4, Lcom/yandex/metrica/impl/ob/jc$c$a;->b:Ljava/lang/String;

    .line 222
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v4, Lcom/yandex/metrica/impl/ob/jc$c$a;->c:Ljava/lang/String;

    .line 223
    aput-object v4, v0, v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method protected D()V
    .locals 8

    .line 311
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->l:Lcom/yandex/metrica/impl/ob/jc$c;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/jc$c;->b:[Lcom/yandex/metrica/impl/ob/jc$c$e;

    const/4 v1, 0x0

    move v2, v1

    .line 313
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_0

    .line 314
    aget-object v3, v0, v2

    .line 315
    iget-object v4, p0, Lcom/yandex/metrica/impl/az;->n:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 316
    iget-object v6, v3, Lcom/yandex/metrica/impl/ob/jc$c$e;->c:Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    iget v6, v6, Lcom/yandex/metrica/impl/ob/jc$c$e$b;->d:I

    invoke-static {v6}, Lcom/yandex/metrica/impl/av;->a(I)Lcom/yandex/metrica/impl/ob/dr;

    move-result-object v6

    .line 318
    iget-object v7, p0, Lcom/yandex/metrica/impl/az;->m:Lcom/yandex/metrica/impl/ob/es;

    invoke-virtual {v6}, Lcom/yandex/metrica/impl/ob/dr;->a()I

    move-result v6

    iget-object v3, v3, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    array-length v3, v3

    invoke-virtual {v7, v4, v5, v6, v3}, Lcom/yandex/metrica/impl/ob/es;->a(JII)V

    .line 319
    invoke-static {}, Lcom/yandex/metrica/impl/av;->a()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 322
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->q:Lcom/yandex/metrica/impl/ob/ab;

    .line 323
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->f()Lcom/yandex/metrica/impl/ob/dn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/dn;->a()Lcom/yandex/metrica/impl/ob/di;

    move-result-object v0

    if-nez v0, :cond_1

    .line 325
    new-array v0, v1, [J

    goto :goto_1

    :cond_1
    const/4 v2, 0x1

    new-array v2, v2, [J

    .line 327
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/di;->c()J

    move-result-wide v3

    aput-wide v3, v2, v1

    move-object v0, v2

    .line 328
    :goto_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->m:Lcom/yandex/metrica/impl/ob/es;

    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ob/es;->a([J)I

    return-void
.end method

.method H()[Lcom/yandex/metrica/impl/ob/jc$c$c;
    .locals 5
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 199
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->q:Lcom/yandex/metrica/impl/ob/ab;

    .line 200
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/av;->a(Landroid/content/Context;)[Lcom/yandex/metrica/impl/ob/jc$c$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 202
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 203
    iget v4, p0, Lcom/yandex/metrica/impl/az;->o:I

    invoke-static {v3}, Lcom/yandex/metrica/impl/ob/b;->b(Lcom/yandex/metrica/impl/ob/e;)I

    move-result v3

    add-int/2addr v4, v3

    iput v4, p0, Lcom/yandex/metrica/impl/az;->o:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method protected I()Lcom/yandex/metrica/impl/az$c;
    .locals 12

    .line 357
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 358
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 360
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const/4 v3, 0x0

    .line 364
    :try_start_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/az;->J()Landroid/database/Cursor;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 366
    :cond_0
    :goto_0
    :try_start_1
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 367
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 368
    invoke-static {v4, v5}, Lcom/yandex/metrica/impl/ob/ln;->a(Landroid/database/Cursor;Landroid/content/ContentValues;)V

    const-string v6, "id"

    .line 369
    invoke-virtual {v5, v6}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    const-string v8, "type"

    .line 371
    invoke-virtual {v5, v8}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, Lcom/yandex/metrica/impl/ob/dr;->a(Ljava/lang/Integer;)Lcom/yandex/metrica/impl/ob/dr;

    move-result-object v8

    .line 374
    invoke-virtual {p0, v6, v7}, Lcom/yandex/metrica/impl/az;->a(J)Z

    move-result v9

    if-nez v9, :cond_0

    .line 379
    invoke-static {v5}, Lcom/yandex/metrica/impl/av;->a(Landroid/content/ContentValues;)Lcom/yandex/metrica/impl/ob/jc$c$g;

    move-result-object v5

    .line 380
    invoke-static {v8}, Lcom/yandex/metrica/impl/av;->a(Lcom/yandex/metrica/impl/ob/dr;)I

    move-result v8

    .line 383
    iget-object v9, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    .line 384
    invoke-virtual {v9}, Lcom/yandex/metrica/impl/ob/jv;->y()Ljava/lang/String;

    move-result-object v9

    .line 383
    invoke-static {v9, v8, v5}, Lcom/yandex/metrica/impl/av;->a(Ljava/lang/String;ILcom/yandex/metrica/impl/ob/jc$c$g;)Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    move-result-object v5

    .line 388
    iget v8, p0, Lcom/yandex/metrica/impl/az;->o:I

    const/4 v9, 0x1

    const-wide v10, 0x7fffffffffffffffL

    invoke-static {v9, v10, v11}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v9

    add-int/2addr v8, v9

    iput v8, p0, Lcom/yandex/metrica/impl/az;->o:I

    .line 389
    iget v8, p0, Lcom/yandex/metrica/impl/az;->o:I

    const/4 v9, 0x2

    invoke-static {v9, v5}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v9

    add-int/2addr v8, v9

    iput v8, p0, Lcom/yandex/metrica/impl/az;->o:I

    .line 391
    iget v8, p0, Lcom/yandex/metrica/impl/az;->o:I

    const v9, 0x3d400

    if-ge v8, v9, :cond_2

    .line 395
    invoke-virtual {p0, v6, v7, v5}, Lcom/yandex/metrica/impl/az;->a(JLcom/yandex/metrica/impl/ob/jc$c$e$b;)Lcom/yandex/metrica/impl/az$b;

    move-result-object v5

    if-eqz v5, :cond_0

    if-nez v3, :cond_1

    .line 398
    iget-object v3, v5, Lcom/yandex/metrica/impl/az$b;->b:Lcom/yandex/metrica/impl/a$a;

    goto :goto_1

    .line 399
    :cond_1
    iget-object v8, v5, Lcom/yandex/metrica/impl/az$b;->b:Lcom/yandex/metrica/impl/a$a;

    invoke-virtual {v3, v8}, Lcom/yandex/metrica/impl/a$a;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 402
    :goto_1
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 403
    iget-object v6, v5, Lcom/yandex/metrica/impl/az$b;->a:Lcom/yandex/metrica/impl/ob/jc$c$e;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 405
    :try_start_2
    new-instance v6, Lorg/json/JSONObject;

    iget-object v7, v5, Lcom/yandex/metrica/impl/az$b;->b:Lcom/yandex/metrica/impl/a$a;

    iget-object v7, v7, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v2, v6

    .line 409
    :catch_0
    :try_start_3
    iget-boolean v5, v5, Lcom/yandex/metrica/impl/az$b;->c:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v5, :cond_2

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v4, v3

    .line 417
    :goto_2
    invoke-static {v4}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 418
    throw v0

    :catch_1
    move-object v4, v3

    .line 417
    :catch_2
    :cond_2
    invoke-static {v4}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 420
    new-instance v3, Lcom/yandex/metrica/impl/az$c;

    invoke-direct {v3, v0, v1, v2}, Lcom/yandex/metrica/impl/az$c;-><init>(Ljava/util/List;Ljava/util/List;Lorg/json/JSONObject;)V

    return-object v3
.end method

.method protected J()Landroid/database/Cursor;
    .locals 2

    .line 550
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->m:Lcom/yandex/metrica/impl/ob/es;

    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->b:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/es;->a(Ljava/util/Map;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method protected a(JLcom/yandex/metrica/impl/ob/dr;)Landroid/database/Cursor;
    .locals 1

    .line 554
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->m:Lcom/yandex/metrica/impl/ob/es;

    invoke-virtual {v0, p1, p2, p3}, Lcom/yandex/metrica/impl/ob/es;->a(JLcom/yandex/metrica/impl/ob/dr;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method protected a(JLcom/yandex/metrica/impl/ob/jc$c$e$b;)Lcom/yandex/metrica/impl/az$b;
    .locals 9

    .line 447
    new-instance v0, Lcom/yandex/metrica/impl/ob/jc$c$e;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jc$c$e;-><init>()V

    .line 448
    iput-wide p1, v0, Lcom/yandex/metrica/impl/ob/jc$c$e;->b:J

    .line 449
    iput-object p3, v0, Lcom/yandex/metrica/impl/ob/jc$c$e;->c:Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    .line 451
    iget p3, p3, Lcom/yandex/metrica/impl/ob/jc$c$e$b;->d:I

    invoke-static {p3}, Lcom/yandex/metrica/impl/av;->a(I)Lcom/yandex/metrica/impl/ob/dr;

    move-result-object p3

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 456
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/yandex/metrica/impl/az;->a(JLcom/yandex/metrica/impl/ob/dr;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 458
    :try_start_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object p3, v1

    .line 460
    :cond_0
    :goto_0
    :try_start_2
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 461
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 462
    invoke-static {p1, v3}, Lcom/yandex/metrica/impl/ob/ln;->a(Landroid/database/Cursor;Landroid/content/ContentValues;)V

    const-string v4, "type"

    .line 3515
    invoke-virtual {v3, v4}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    .line 3517
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/jv;->I()Z

    move-result v5

    invoke-static {v4, v5}, Lcom/yandex/metrica/impl/av$c;->a(IZ)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "custom_type"

    .line 3518
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->b(Ljava/lang/Integer;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "name"

    .line 3519
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "value"

    .line 3520
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->b(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "time"

    .line 3521
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lcom/yandex/metrica/impl/av$c;->a(J)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "number"

    .line 3522
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->a(I)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "cell_info"

    .line 3523
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->e(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "location_info"

    .line 3524
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "wifi_network_info"

    .line 3525
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->d(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "error_environment"

    .line 3526
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->g(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "user_info"

    .line 3527
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->h(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "truncated"

    .line 3528
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->b(I)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "connection_type"

    .line 3529
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->c(I)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "cellular_connection_type"

    .line 3530
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->i(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "wifi_access_point"

    .line 3531
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "profile_id"

    .line 3532
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->j(Ljava/lang/String;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "encrypting_mode"

    .line 3534
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 3533
    invoke-static {v5}, Lcom/yandex/metrica/impl/ob/mo;->a(I)Lcom/yandex/metrica/impl/ob/mo;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->a(Lcom/yandex/metrica/impl/ob/mo;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    const-string v5, "first_occurrence_status"

    .line 3536
    invoke-virtual {v3, v5}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    .line 3535
    invoke-static {v5}, Lcom/yandex/metrica/impl/r;->a(Ljava/lang/Integer;)Lcom/yandex/metrica/impl/r;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/av$c;->a(Lcom/yandex/metrica/impl/r;)Lcom/yandex/metrica/impl/av$c;

    move-result-object v4

    .line 2543
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/av$c;->c()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 2544
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/av$c;->e()Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    if-eqz v4, :cond_0

    .line 4424
    new-instance v5, Lcom/yandex/metrica/impl/a$a;

    const-string v6, "app_environment"

    .line 4425
    invoke-virtual {v3, v6}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "app_environment_revision"

    .line 4426
    invoke-virtual {v3, v7}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-direct {v5, v6, v7, v8}, Lcom/yandex/metrica/impl/a$a;-><init>(Ljava/lang/String;J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p3, :cond_3

    .line 468
    :try_start_3
    iget p3, p0, Lcom/yandex/metrica/impl/az;->p:I

    if-gez p3, :cond_2

    .line 469
    invoke-static {v5}, Lcom/yandex/metrica/impl/az;->a(Lcom/yandex/metrica/impl/a$a;)I

    move-result p3

    iput p3, p0, Lcom/yandex/metrica/impl/az;->p:I

    .line 470
    iget p3, p0, Lcom/yandex/metrica/impl/az;->o:I

    iget v3, p0, Lcom/yandex/metrica/impl/az;->p:I

    add-int/2addr p3, v3

    iput p3, p0, Lcom/yandex/metrica/impl/az;->o:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    move-object p3, v5

    goto :goto_2

    :catch_0
    move-object p3, v5

    goto :goto_5

    .line 472
    :cond_3
    :try_start_4
    invoke-virtual {p3, v5}, Lcom/yandex/metrica/impl/a$a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    .line 4507
    :cond_4
    :goto_2
    iget-object v3, p0, Lcom/yandex/metrica/impl/az;->s:Lcom/yandex/metrica/impl/ob/nc;

    iget-object v5, v4, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    invoke-interface {v3, v5}, Lcom/yandex/metrica/impl/ob/nc;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    .line 4508
    iget-object v5, v4, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 4509
    iput-object v3, v4, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    .line 4510
    iget v5, v4, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->k:I

    iget-object v6, v4, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    array-length v6, v6

    array-length v3, v3

    sub-int/2addr v6, v3

    add-int/2addr v5, v6

    iput v5, v4, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->k:I

    .line 479
    :cond_5
    iget v3, p0, Lcom/yandex/metrica/impl/az;->o:I

    const/4 v5, 0x3

    invoke-static {v5, v4}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v5

    add-int/2addr v3, v5

    iput v3, p0, Lcom/yandex/metrica/impl/az;->o:I

    .line 481
    iget v3, p0, Lcom/yandex/metrica/impl/az;->o:I

    const v5, 0x3d400

    if-ge v3, v5, :cond_6

    .line 485
    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 489
    :cond_6
    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_7

    .line 490
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    invoke-interface {p2, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    iput-object p2, v0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_5

    .line 500
    :cond_7
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    return-object v1

    :catchall_0
    move-exception p2

    goto :goto_4

    :catch_1
    move-object p3, v1

    goto :goto_5

    :catchall_1
    move-exception p2

    move-object p1, v1

    :goto_4
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 501
    throw p2

    :catch_2
    move-object p1, v1

    move-object p3, p1

    .line 500
    :catch_3
    :goto_5
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 503
    new-instance p1, Lcom/yandex/metrica/impl/az$b;

    invoke-direct {p1, v0, p3, v2}, Lcom/yandex/metrica/impl/az$b;-><init>(Lcom/yandex/metrica/impl/ob/jc$c$e;Lcom/yandex/metrica/impl/a$a;Z)V

    return-object p1
.end method

.method a(Lcom/yandex/metrica/impl/az$c;[Lcom/yandex/metrica/impl/ob/jc$c$c;)Lcom/yandex/metrica/impl/ob/jc$c;
    .locals 4
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 112
    new-instance v0, Lcom/yandex/metrica/impl/ob/jc$c;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jc$c;-><init>()V

    .line 113
    new-instance v1, Lcom/yandex/metrica/impl/ob/jc$c$d;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/jc$c$d;-><init>()V

    .line 114
    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->r()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_0

    move-object v2, v3

    :cond_0
    check-cast v2, Ljava/lang/String;

    iput-object v2, v1, Lcom/yandex/metrica/impl/ob/jc$c$d;->b:Ljava/lang/String;

    .line 115
    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->q()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_1

    move-object v2, v3

    :cond_1
    check-cast v2, Ljava/lang/String;

    iput-object v2, v1, Lcom/yandex/metrica/impl/ob/jc$c$d;->c:Ljava/lang/String;

    .line 116
    iget v2, p0, Lcom/yandex/metrica/impl/az;->o:I

    const/4 v3, 0x4

    .line 117
    invoke-static {v3, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v3

    add-int/2addr v2, v3

    iput v2, p0, Lcom/yandex/metrica/impl/az;->o:I

    .line 118
    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jc$c;->c:Lcom/yandex/metrica/impl/ob/jc$c$d;

    .line 119
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/az;->a(Lcom/yandex/metrica/impl/ob/jc$c;)V

    .line 120
    iget-object v1, p1, Lcom/yandex/metrica/impl/az$c;->a:Ljava/util/List;

    iget-object v2, p1, Lcom/yandex/metrica/impl/az$c;->a:Ljava/util/List;

    .line 121
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Lcom/yandex/metrica/impl/ob/jc$c$e;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/yandex/metrica/impl/ob/jc$c$e;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jc$c;->b:[Lcom/yandex/metrica/impl/ob/jc$c$e;

    .line 122
    iget-object p1, p1, Lcom/yandex/metrica/impl/az$c;->c:Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/yandex/metrica/impl/az;->a(Lorg/json/JSONObject;)[Lcom/yandex/metrica/impl/ob/jc$c$a;

    move-result-object p1

    iput-object p1, v0, Lcom/yandex/metrica/impl/ob/jc$c;->d:[Lcom/yandex/metrica/impl/ob/jc$c$a;

    .line 123
    iput-object p2, v0, Lcom/yandex/metrica/impl/ob/jc$c;->e:[Lcom/yandex/metrica/impl/ob/jc$c$c;

    .line 125
    iget p1, p0, Lcom/yandex/metrica/impl/az;->o:I

    const/16 p2, 0x8

    invoke-static {p2}, Lcom/yandex/metrica/impl/ob/b;->i(I)I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, Lcom/yandex/metrica/impl/az;->o:I

    return-object v0
.end method

.method protected a(Landroid/net/Uri$Builder;)V
    .locals 3

    .line 236
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/l;->a(Landroid/net/Uri$Builder;)V

    const-string v0, "report"

    .line 237
    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "deviceid"

    .line 2244
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    .line 2245
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->q()Ljava/lang/String;

    move-result-object v2

    .line 2244
    invoke-static {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "uuid"

    .line 2246
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->r()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "analytics_sdk_version"

    .line 2247
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->c:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "analytics_sdk_version_name"

    .line 2252
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->d:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "app_version_name"

    .line 2257
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    .line 2258
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->p()Ljava/lang/String;

    move-result-object v2

    .line 2257
    invoke-static {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "app_build_number"

    .line 2259
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->i:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    .line 2260
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->o()Ljava/lang/String;

    move-result-object v2

    .line 2259
    invoke-static {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "os_version"

    .line 2261
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->j:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    .line 2262
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->m()Ljava/lang/String;

    move-result-object v2

    .line 2261
    invoke-static {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "os_api_level"

    .line 2263
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->k:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "analytics_sdk_build_number"

    .line 2264
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->e:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "analytics_sdk_build_type"

    .line 2265
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->f:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "app_debuggable"

    .line 2266
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->h:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "locale"

    .line 2267
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    .line 2268
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->y()Ljava/lang/String;

    move-result-object v2

    .line 2267
    invoke-static {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "is_rooted"

    .line 2269
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->m:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    .line 2270
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->s()Ljava/lang/String;

    move-result-object v2

    .line 2269
    invoke-static {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "app_framework"

    .line 2271
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    .line 2272
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->t()Ljava/lang/String;

    move-result-object v2

    .line 2271
    invoke-static {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "attribution_id"

    .line 2273
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->c:Lcom/yandex/metrica/impl/ob/ju;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ju;->o:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "api_key_128"

    .line 2277
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->D()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "app_id"

    .line 2278
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "app_platform"

    .line 2279
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "model"

    .line 2280
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "manufacturer"

    .line 2281
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "screen_width"

    .line 2282
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->u()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "screen_height"

    .line 2283
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->v()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "screen_dpi"

    .line 2284
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->w()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "scalefactor"

    .line 2285
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->x()F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "device_type"

    .line 2286
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "android_id"

    .line 2287
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "clids_set"

    .line 2288
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/yandex/metrica/impl/az;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V

    .line 2289
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jv;->B()Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v1, ""

    goto :goto_0

    .line 2290
    :cond_0
    iget-object v1, v0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;->a:Ljava/lang/String;

    :goto_0
    const-string v2, "adv_id"

    if-nez v1, :cond_1

    const-string v1, ""

    .line 2291
    :cond_1
    invoke-virtual {p1, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v1, "limit_ad_tracking"

    if-nez v0, :cond_2

    const-string v0, ""

    goto :goto_1

    .line 2292
    :cond_2
    iget-object v0, v0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;->b:Ljava/lang/Boolean;

    .line 2294
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/az;->a(Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v0

    .line 2292
    :goto_1
    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ob/jc$c;)V
    .locals 2

    .line 130
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->q:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lh;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/lh;

    move-result-object v0

    .line 131
    new-instance v1, Lcom/yandex/metrica/impl/az$1;

    invoke-direct {v1, p0, p1}, Lcom/yandex/metrica/impl/az$1;-><init>(Lcom/yandex/metrica/impl/az;Lcom/yandex/metrica/impl/ob/jc$c;)V

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/lh;->a(Lcom/yandex/metrica/impl/ob/lk;)V

    return-void
.end method

.method protected a(J)Z
    .locals 3

    const-wide/16 v0, -0x2

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b()Z
    .locals 3

    .line 171
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->q:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    .line 172
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jv;->C()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/az;->a(Ljava/util/List;)V

    .line 173
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->u:Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jv;->e()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/az;->t()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 177
    iput-object v0, p0, Lcom/yandex/metrica/impl/az;->n:Ljava/util/List;

    .line 180
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/az;->H()[Lcom/yandex/metrica/impl/ob/jc$c$c;

    move-result-object v0

    .line 181
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/az;->I()Lcom/yandex/metrica/impl/az$c;

    move-result-object v2

    iput-object v2, p0, Lcom/yandex/metrica/impl/az;->r:Lcom/yandex/metrica/impl/az$c;

    .line 184
    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->r:Lcom/yandex/metrica/impl/az$c;

    iget-object v2, v2, Lcom/yandex/metrica/impl/az$c;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    .line 188
    :cond_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->r:Lcom/yandex/metrica/impl/az$c;

    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/az;->a(Lcom/yandex/metrica/impl/az$c;[Lcom/yandex/metrica/impl/ob/jc$c$c;)Lcom/yandex/metrica/impl/ob/jc$c;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/az;->l:Lcom/yandex/metrica/impl/ob/jc$c;

    .line 190
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->r:Lcom/yandex/metrica/impl/az$c;

    iget-object v0, v0, Lcom/yandex/metrica/impl/az$c;->b:Ljava/util/List;

    iput-object v0, p0, Lcom/yandex/metrica/impl/az;->n:Ljava/util/List;

    .line 192
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->l:Lcom/yandex/metrica/impl/ob/jc$c;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/e;)[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/az;->c([B)Z

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public g()V
    .locals 4

    .line 341
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/az;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2349
    iget-object v0, p0, Lcom/yandex/metrica/impl/az;->t:Lcom/yandex/metrica/impl/ob/lv;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lv;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2350
    :goto_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->r:Lcom/yandex/metrica/impl/az$c;

    iget-object v1, v1, Lcom/yandex/metrica/impl/az$c;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2351
    iget-object v1, p0, Lcom/yandex/metrica/impl/az;->t:Lcom/yandex/metrica/impl/ob/lv;

    iget-object v2, p0, Lcom/yandex/metrica/impl/az;->r:Lcom/yandex/metrica/impl/az$c;

    iget-object v2, v2, Lcom/yandex/metrica/impl/az$c;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/ob/jc$c$e;

    const-string v3, "Event sent"

    invoke-virtual {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/lv;->a(Lcom/yandex/metrica/impl/ob/jc$c$e;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 345
    iput-object v0, p0, Lcom/yandex/metrica/impl/az;->r:Lcom/yandex/metrica/impl/az$c;

    return-void
.end method

.method public u()Z
    .locals 3

    .line 334
    invoke-super {p0}, Lcom/yandex/metrica/impl/l;->u()Z

    move-result v0

    .line 335
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/az;->l()I

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
