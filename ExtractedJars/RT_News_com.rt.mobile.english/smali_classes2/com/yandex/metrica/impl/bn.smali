.class public Lcom/yandex/metrica/impl/bn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/bn$a;,
        Lcom/yandex/metrica/impl/bn$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/bn$a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 317
    new-instance v0, Lcom/yandex/metrica/impl/bn$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/bn$1;-><init>()V

    .line 318
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/bn;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 327
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lorg/json/JSONObject;)Lcom/yandex/metrica/impl/bn$a;
    .locals 8
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "headers"

    .line 478
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 479
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 480
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 481
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 482
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 483
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    const/4 v4, 0x0

    .line 484
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v4, v6, :cond_0

    .line 485
    new-instance v6, Landroid/util/Pair;

    .line 487
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v2, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 485
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 492
    :cond_1
    new-instance v0, Lcom/yandex/metrica/impl/bn$a;

    const-string v1, "id"

    const/4 v2, 0x0

    .line 493
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "url"

    .line 494
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "method"

    .line 495
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "delay_seconds"

    .line 497
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    .line 498
    invoke-static {p0}, Lcom/yandex/metrica/impl/bn;->b(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object p0

    move-object v1, v0

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-object v6, v7

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lcom/yandex/metrica/impl/bn$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)V

    return-object v0
.end method

.method private static a(Lorg/json/JSONObject;Z)Lcom/yandex/metrica/impl/ob/jj$a$c;
    .locals 5
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 404
    new-instance v0, Lcom/yandex/metrica/impl/ob/jj$a$c;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jj$a$c;-><init>()V

    const-string v1, "min_update_interval_seconds"

    .line 407
    invoke-static {p0, v1}, Lcom/yandex/metrica/impl/ob/lp;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v3, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->b:J

    .line 406
    invoke-static {v1, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;J)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->b:J

    const-string v1, "min_update_distance_meters"

    .line 412
    invoke-static {p0, v1}, Lcom/yandex/metrica/impl/ob/lp;->d(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    iget v2, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->c:F

    .line 411
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Float;F)F

    move-result v1

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->c:F

    const-string v1, "records_count_to_force_flush"

    .line 416
    invoke-static {p0, v1}, Lcom/yandex/metrica/impl/ob/lp;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    iget v2, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->d:I

    .line 415
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Integer;I)I

    move-result v1

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->d:I

    const-string v1, "max_records_count_in_batch"

    .line 420
    invoke-static {p0, v1}, Lcom/yandex/metrica/impl/ob/lp;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    iget v2, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->e:I

    .line 419
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Integer;I)I

    move-result v1

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->e:I

    const-string v1, "max_age_seconds_to_force_flush"

    .line 424
    invoke-static {p0, v1}, Lcom/yandex/metrica/impl/ob/lp;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v3, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->f:J

    .line 423
    invoke-static {v1, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;J)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->f:J

    const-string v1, "max_records_to_store_locally"

    .line 429
    invoke-static {p0, v1}, Lcom/yandex/metrica/impl/ob/lp;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    iget v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->g:I

    .line 428
    invoke-static {p0, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Integer;I)I

    move-result p0

    iput p0, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->g:I

    .line 432
    iput-boolean p1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->h:Z

    return-object v0
.end method

.method public static a(Ljava/util/Map;)Ljava/lang/Long;
    .locals 3
    .param p0    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Long;"
        }
    .end annotation

    .line 680
    invoke-static {p0}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Date"

    .line 681
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    .line 683
    invoke-static {p0}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 685
    :try_start_0
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 686
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "E, d MMM yyyy HH:mm:ss z"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 688
    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 331
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string p1, "value"

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, ""

    return-object p0
.end method

.method private static a(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/lp$a;)V
    .locals 3
    .param p0    # Lcom/yandex/metrica/impl/bn$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/yandex/metrica/impl/ob/lp$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "requests"

    .line 459
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "requests"

    .line 460
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "list"

    .line 461
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "list"

    .line 462
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    .line 463
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 464
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 466
    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;)Lcom/yandex/metrica/impl/bn$a;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 469
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 470
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/bn$b;->d(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method private static a(Lcom/yandex/metrica/impl/bn$b;Lorg/json/JSONObject;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 651
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 653
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 654
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 655
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 656
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v4, "value"

    .line 658
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "value"

    .line 659
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 662
    :cond_1
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ly;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/bn$b;->e(Ljava/lang/String;)V

    return-void
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 0

    .line 632
    invoke-static {p0}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static a(Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 636
    invoke-static {p0}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 568
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 569
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string p1, "enabled"

    .line 570
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 339
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string p1, "urls"

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, ""

    return-object p0
.end method

.method private static b(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 4
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bn$a$a;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 504
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "accept_network_types"

    .line 505
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "accept_network_types"

    .line 506
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    const/4 v1, 0x0

    .line 507
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 508
    sget-object v2, Lcom/yandex/metrica/impl/bn;->a:Ljava/util/Map;

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static b(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/lp$a;)V
    .locals 6

    const-string v0, "socket"

    .line 576
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v0, "seconds_to_live"

    .line 578
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    const-string v2, "token"

    .line 579
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "ports"

    .line 580
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-lez v5, :cond_2

    .line 581
    invoke-static {v2}, Lcom/yandex/metrica/impl/bn;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lez v3, :cond_2

    .line 582
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    .line 583
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 584
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->optInt(I)I

    move-result v5

    if-eqz v5, :cond_0

    .line 586
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 589
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 590
    new-instance p1, Lcom/yandex/metrica/impl/ob/kj;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/yandex/metrica/impl/ob/kj;-><init>(JLjava/lang/String;Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/bn$b;->a(Lcom/yandex/metrica/impl/ob/kj;)V

    :cond_2
    return-void
.end method

.method private static c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 349
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string p1, "urls"

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 1296
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result p1

    if-lez p1, :cond_1

    .line 1297
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 1298
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 1299
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move-object v0, p1

    :catch_0
    :cond_1
    return-object v0
.end method


# virtual methods
.method public a([B)Lcom/yandex/metrica/impl/bn$b;
    .locals 7

    .line 358
    new-instance v0, Lcom/yandex/metrica/impl/bn$b;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/bn$b;-><init>()V

    .line 361
    :try_start_0
    new-instance v1, Lcom/yandex/metrica/impl/ob/lp$a;

    new-instance v2, Ljava/lang/String;

    const-string v3, "UTF-8"

    invoke-direct {v2, p1, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/lp$a;-><init>(Ljava/lang/String;)V

    const-string p1, "device_id"

    .line 367
    invoke-static {v1, p1}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bn$b;->c(Ljava/lang/String;)V

    const-string p1, "uuid"

    .line 370
    invoke-static {v1, p1}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bn$b;->d(Ljava/lang/String;)V

    const-string p1, "query_hosts"

    .line 1600
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v1, p1, v2}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    const-string v2, "list"

    .line 1601
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "list"

    .line 1602
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v2, "get_ad"

    .line 1604
    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/bn;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1605
    invoke-static {v2}, Lcom/yandex/metrica/impl/bn;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1606
    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/bn$b;->a(Ljava/lang/String;)V

    :cond_0
    const-string v2, "report"

    .line 1609
    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/bn;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 1610
    invoke-static {v2}, Lcom/yandex/metrica/impl/bn;->a(Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1611
    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/bn$b;->b(Ljava/util/List;)V

    :cond_1
    const-string v2, "report_ad"

    .line 1614
    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/bn;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1615
    invoke-static {v2}, Lcom/yandex/metrica/impl/bn;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1616
    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/bn$b;->b(Ljava/lang/String;)V

    :cond_2
    const-string v2, "location"

    .line 1619
    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/bn;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 1620
    invoke-static {v2}, Lcom/yandex/metrica/impl/bn;->a(Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1621
    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/bn$b;->c(Ljava/util/List;)V

    :cond_3
    const-string v2, "startup"

    .line 1624
    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/bn;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 1625
    invoke-static {p1}, Lcom/yandex/metrica/impl/bn;->a(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1626
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bn$b;->a(Ljava/util/List;)V

    :cond_4
    const-string p1, "distribution_customization"

    .line 1641
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 1642
    invoke-virtual {v1, p1, v2}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    const-string v2, "clids"

    .line 1644
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 1646
    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/bn;->a(Lcom/yandex/metrica/impl/bn$b;Lorg/json/JSONObject;)V

    :cond_5
    const-string p1, "features"

    .line 2516
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v1, p1, v2}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    const/4 v2, 0x0

    .line 2517
    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/bn$b;->a(Z)V

    .line 2518
    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/bn$b;->b(Z)V

    const-string v3, "list"

    .line 2519
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v3, "list"

    .line 2520
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v3, "easy_collecting"

    .line 2522
    invoke-static {p1, v3, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/yandex/metrica/impl/bn$b;->a(Z)V

    const-string v3, "package_info"

    .line 2525
    invoke-static {p1, v3, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/yandex/metrica/impl/bn$b;->b(Z)V

    const-string v3, "socket"

    .line 2528
    invoke-static {p1, v3, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/yandex/metrica/impl/bn$b;->e(Z)V

    const-string v3, "permissions_collecting"

    .line 2530
    invoke-static {p1, v3, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/yandex/metrica/impl/bn$b;->f(Z)V

    const-string v3, "features_collecting"

    .line 2533
    invoke-static {p1, v3, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/yandex/metrica/impl/bn$b;->g(Z)V

    const-string v3, "foreground_location_collection"

    .line 2536
    invoke-static {p1, v3, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/yandex/metrica/impl/bn$b;->c(Z)V

    const-string v3, "background_location_collection"

    .line 2539
    invoke-static {p1, v3, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/yandex/metrica/impl/bn$b;->d(Z)V

    const-string v3, "telephony_restricted_to_location_tracking"

    .line 2542
    invoke-static {p1, v3, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 2545
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bn$b;->b()Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v3

    const-string v4, "android_id"

    .line 2551
    invoke-static {p1, v4, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/yandex/metrica/impl/ob/kh$a;->e(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    const-string v4, "google_aid"

    .line 2552
    invoke-static {p1, v4, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/yandex/metrica/impl/ob/kh$a;->f(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    const-string v4, "wifi_around"

    .line 2554
    invoke-static {p1, v4, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v4

    .line 2553
    invoke-virtual {v3, v4}, Lcom/yandex/metrica/impl/ob/kh$a;->h(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    const-string v4, "wifi_connected"

    .line 2556
    invoke-static {p1, v4, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v4

    .line 2555
    invoke-virtual {v3, v4}, Lcom/yandex/metrica/impl/ob/kh$a;->i(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    const-string v4, "own_macs"

    .line 2557
    invoke-static {p1, v4, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/yandex/metrica/impl/ob/kh$a;->j(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    const-string v4, "cells_around"

    .line 2559
    invoke-static {p1, v4, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v4

    .line 2558
    invoke-virtual {v3, v4}, Lcom/yandex/metrica/impl/ob/kh$a;->k(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    const-string v4, "sim_info"

    .line 2560
    invoke-static {p1, v4, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/yandex/metrica/impl/ob/kh$a;->l(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    const-string v4, "sim_imei"

    .line 2561
    invoke-static {p1, v4, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/yandex/metrica/impl/ob/kh$a;->m(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    const-string v4, "access_point"

    .line 2563
    invoke-static {p1, v4, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result p1

    .line 2562
    invoke-virtual {v3, p1}, Lcom/yandex/metrica/impl/ob/kh$a;->n(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    .line 375
    :cond_6
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bn$b;->l()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 376
    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/bn;->b(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/lp$a;)V

    :cond_7
    const-string p1, "foreground_location_collection"

    .line 380
    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ob/lp$a;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 381
    invoke-static {v0}, Lcom/yandex/metrica/impl/bn$b;->a(Lcom/yandex/metrica/impl/bn$b;)Z

    move-result v2

    .line 379
    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Z)Lcom/yandex/metrica/impl/ob/jj$a$c;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/bn$b;->a(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/jj$a$c;)Lcom/yandex/metrica/impl/ob/jj$a$c;

    const-string p1, "background_location_collection"

    .line 384
    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ob/lp$a;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 385
    invoke-static {v0}, Lcom/yandex/metrica/impl/bn$b;->b(Lcom/yandex/metrica/impl/bn$b;)Z

    move-result v2

    .line 3439
    new-instance v3, Lcom/yandex/metrica/impl/ob/jj$a$a;

    invoke-direct {v3}, Lcom/yandex/metrica/impl/ob/jj$a$a;-><init>()V

    .line 3441
    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/bn;->a(Lorg/json/JSONObject;Z)Lcom/yandex/metrica/impl/ob/jj$a$c;

    move-result-object v2

    iput-object v2, v3, Lcom/yandex/metrica/impl/ob/jj$a$a;->b:Lcom/yandex/metrica/impl/ob/jj$a$c;

    const-string v2, "collection_duration_seconds"

    .line 3444
    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/ob/lp;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v5, v3, Lcom/yandex/metrica/impl/ob/jj$a$a;->c:J

    .line 3443
    invoke-static {v2, v4, v5, v6}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;J)J

    move-result-wide v4

    iput-wide v4, v3, Lcom/yandex/metrica/impl/ob/jj$a$a;->c:J

    const-string v2, "collection_interval_seconds"

    .line 3450
    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/ob/lp;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v4, v3, Lcom/yandex/metrica/impl/ob/jj$a$a;->d:J

    .line 3449
    invoke-static {p1, v2, v4, v5}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;J)J

    move-result-wide v4

    iput-wide v4, v3, Lcom/yandex/metrica/impl/ob/jj$a$a;->d:J

    .line 383
    invoke-static {v0, v3}, Lcom/yandex/metrica/impl/bn$b;->a(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/jj$a$a;)Lcom/yandex/metrica/impl/ob/jj$a$a;

    const-string p1, "time"

    .line 3666
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p1, :cond_8

    :try_start_1
    const-string v2, "max_valid_difference_seconds"

    .line 3669
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 3670
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bn$b;->a(Ljava/lang/Long;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 390
    :catch_0
    :cond_8
    :try_start_2
    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/bn;->a(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/lp$a;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 397
    sget-object p1, Lcom/yandex/metrica/impl/bn$b$a;->b:Lcom/yandex/metrica/impl/bn$b$a;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bn$b;->a(Lcom/yandex/metrica/impl/bn$b$a;)V

    return-object v0

    .line 393
    :catch_1
    new-instance p1, Lcom/yandex/metrica/impl/bn$b;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/bn$b;-><init>()V

    .line 394
    sget-object v0, Lcom/yandex/metrica/impl/bn$b$a;->a:Lcom/yandex/metrica/impl/bn$b$a;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/bn$b;->a(Lcom/yandex/metrica/impl/bn$b$a;)V

    return-object p1
.end method
