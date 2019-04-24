.class public Lo/duc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static volatile d:Lo/duc;

.field private static e:Landroid/content/Context;


# instance fields
.field private b:Ljava/util/concurrent/ExecutorService;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;>;"
        }
    .end annotation
.end field

.field private f:Lo/dwr;

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private h:Landroid/os/Handler;

.field private k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    const/4 v0, 0x0

    sput-object v0, Lo/duc;->d:Lo/duc;

    .line 50
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/duc;->a:Ljava/lang/Object;

    .line 51
    const/4 v0, 0x0

    sput-object v0, Lo/duc;->e:Landroid/content/Context;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/duc;->c:Ljava/util/Map;

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/duc;->g:Ljava/util/ArrayList;

    .line 63
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/duc;->k:Ljava/util/Map;

    .line 66
    new-instance v0, Lo/duc$5;

    sget-object v1, Lo/duc;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/duc$5;-><init>(Lo/duc;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/duc;->h:Landroid/os/Handler;

    .line 91
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/duc;->b:Ljava/util/concurrent/ExecutorService;

    .line 92
    return-void
.end method

.method private a(IJJ)V
    .locals 6

    .line 382
    const/4 v2, 0x0

    .line 383
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 384
    const/4 v2, 0x0

    goto :goto_0

    .line 386
    :cond_0
    const/4 v2, 0x1

    .line 388
    :goto_0
    sub-long v3, p4, p2

    .line 389
    if-nez v2, :cond_1

    const-wide/16 v0, 0x1388

    cmp-long v0, v3, v0

    if-ltz v0, :cond_2

    .line 390
    :cond_1
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 391
    const-string v0, "target"

    const-string v1, "1"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    const-string v0, "target_source_type"

    const-string v1, "1"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    const-string v0, "delay_ms"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    const-string v0, "flag"

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_DEPEND_85040001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 397
    :cond_2
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .line 189
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 190
    return-void

    .line 192
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo/dud;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    .line 193
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/dud;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    .line 194
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 195
    :cond_1
    return-void

    .line 197
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter refreshStatus medalUrlType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " fileName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    iget-object v0, p0, Lo/duc;->c:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map;

    .line 199
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 200
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 201
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 204
    :cond_3
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 205
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    :cond_4
    :goto_0
    iget-object v0, p0, Lo/duc;->c:Ljava/util/Map;

    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    invoke-direct {p0}, Lo/duc;->d()V

    .line 209
    return-void
.end method

.method private a(Lo/dvu;)V
    .locals 7

    .line 158
    sget-object v3, Lo/duc;->a:Ljava/lang/Object;

    monitor-enter v3

    .line 159
    :try_start_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 160
    const-string v0, "grayListStyle"

    invoke-virtual {p1}, Lo/dvu;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    const-string v0, "lightListStyle"

    invoke-virtual {p1}, Lo/dvu;->p()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    const-string v0, "grayDetailStyle"

    invoke-virtual {p1}, Lo/dvu;->n()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    const-string v0, "lightDetailStyle"

    invoke-virtual {p1}, Lo/dvu;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    const-string v0, "shareImageUrl"

    invoke-virtual {p1}, Lo/dvu;->m()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    invoke-virtual {p1}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v5

    .line 166
    iget-object v0, p0, Lo/duc;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 167
    iget-object v0, p0, Lo/duc;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 169
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/duc;->g:Ljava/util/ArrayList;

    .line 170
    iget-object v0, p0, Lo/duc;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    :goto_0
    invoke-direct {p0, p1}, Lo/duc;->b(Lo/dvu;)V

    .line 174
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter initUrlData="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lo/duc;->k:Ljava/util/Map;

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    .line 177
    :goto_1
    return-void
.end method

.method private static b(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 4

    .line 259
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 260
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    const-string v1, "jsonObject is null"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    const/4 v0, 0x0

    return-object v0

    .line 263
    :cond_1
    const/4 v2, 0x0

    .line 264
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 266
    :try_start_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 269
    goto :goto_0

    .line 267
    :catch_0
    move-exception v3

    .line 268
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    const-string v1, "parseJsonObject Exception!!!"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    :cond_2
    :goto_0
    return-object v2
.end method

.method static synthetic b(Lo/duc;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/duc;->f()V

    return-void
.end method

.method static synthetic b(Lo/duc;IJJ)V
    .locals 0

    .line 46
    invoke-direct/range {p0 .. p5}, Lo/duc;->a(IJJ)V

    return-void
.end method

.method private b(Lo/dvu;)V
    .locals 4

    .line 214
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 215
    const-string v0, "grayListStyle"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    const-string v0, "lightListStyle"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    const-string v0, "grayDetailStyle"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    const-string v0, "lightDetailStyle"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    const-string v0, "shareImageUrl"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    invoke-virtual {p1}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v3

    .line 221
    iget-object v0, p0, Lo/duc;->c:Ljava/util/Map;

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    return-void
.end method

.method static synthetic c()Landroid/content/Context;
    .locals 1

    .line 46
    sget-object v0, Lo/duc;->e:Landroid/content/Context;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lo/duc;
    .locals 4

    .line 95
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/duc;->e:Landroid/content/Context;

    .line 96
    sget-object v0, Lo/duc;->d:Lo/duc;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 97
    const-class v2, Lo/duc;

    monitor-enter v2

    .line 98
    :try_start_0
    sget-object v0, Lo/duc;->d:Lo/duc;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 99
    new-instance v0, Lo/duc;

    invoke-direct {v0}, Lo/duc;-><init>()V

    sput-object v0, Lo/duc;->d:Lo/duc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 103
    :cond_1
    :goto_0
    sget-object v0, Lo/duc;->d:Lo/duc;

    return-object v0
.end method

.method static synthetic c(Lo/duc;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lo/duc;->e(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/duc;Lo/dvu;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lo/duc;->a(Lo/dvu;)V

    return-void
.end method

.method private c(Ljava/util/Map;Ljava/lang/String;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;Ljava/lang/String;)Z"
        }
    .end annotation

    .line 306
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 307
    const/4 v0, 0x1

    return v0

    .line 309
    :cond_0
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 310
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 311
    const/4 v0, 0x1

    if-ne v0, v2, :cond_1

    .line 312
    const/4 v0, 0x0

    return v0

    .line 315
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic c(Lo/duc;Ljava/util/Map;Ljava/lang/String;)Z
    .locals 1

    .line 46
    invoke-direct {p0, p1, p2}, Lo/duc;->c(Ljava/util/Map;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private d()V
    .locals 5

    .line 277
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    iget-object v0, p0, Lo/duc;->c:Ljava/util/Map;

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 278
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    .line 279
    sget-object v0, Lo/duc;->e:Landroid/content/Context;

    const-string v1, "_medalPngStatusDownload"

    invoke-static {v0, v1, v4}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 282
    goto :goto_0

    .line 280
    :catch_0
    move-exception v3

    .line 281
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ConcurrentModificationException e="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/util/ConcurrentModificationException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    :goto_0
    return-void
.end method

.method private d(ILjava/lang/Object;)V
    .locals 2

    .line 181
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 182
    iput p1, v1, Landroid/os/Message;->what:I

    .line 183
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 184
    iget-object v0, p0, Lo/duc;->h:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 185
    return-void
.end method

.method static synthetic d(Lo/duc;ILjava/lang/Object;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lo/duc;->d(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic d(Lo/duc;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lo/duc;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/duc;)Z
    .locals 1

    .line 46
    invoke-direct {p0}, Lo/duc;->g()Z

    move-result v0

    return v0
.end method

.method private e()V
    .locals 4

    .line 129
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    const-string v1, "enter getData"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    sget-object v0, Lo/duc;->e:Landroid/content/Context;

    const-string v1, "_medalPngStatusDownload"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 131
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v3

    .line 132
    iget-object v0, p0, Lo/duc;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/duc;->b:Ljava/util/concurrent/ExecutorService;

    .line 135
    :cond_0
    iget-object v0, p0, Lo/duc;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/duc$1;

    invoke-direct {v1, p0, v3, v2}, Lo/duc$1;-><init>(Lo/duc;Lo/dwr;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 155
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 9

    .line 227
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter parseJsonData jsonStr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 229
    :cond_0
    return-void

    .line 231
    :cond_1
    iget-object v0, p0, Lo/duc;->c:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 232
    iget-object v0, p0, Lo/duc;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    goto :goto_0

    .line 234
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/duc;->c:Ljava/util/Map;

    .line 237
    :goto_0
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 238
    iget-object v0, p0, Lo/duc;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 239
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_4

    .line 240
    iget-object v0, p0, Lo/duc;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 241
    invoke-static {v6, v3}, Lo/duc;->b(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v7

    .line 242
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 243
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 244
    const-string v0, "grayListStyle"

    const-string v1, "grayListStyle"

    invoke-static {v1, v7}, Lo/dud;->e(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    const-string v0, "lightListStyle"

    const-string v1, "lightListStyle"

    invoke-static {v1, v7}, Lo/dud;->e(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    const-string v0, "grayDetailStyle"

    const-string v1, "grayDetailStyle"

    invoke-static {v1, v7}, Lo/dud;->e(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    const-string v0, "lightDetailStyle"

    const-string v1, "lightDetailStyle"

    invoke-static {v1, v7}, Lo/dud;->e(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    const-string v0, "shareImageUrl"

    const-string v1, "shareImageUrl"

    invoke-static {v1, v7}, Lo/dud;->e(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    iget-object v0, p0, Lo/duc;->c:Ljava/util/Map;

    invoke-interface {v0, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 239
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    .line 254
    :cond_4
    goto :goto_2

    .line 252
    :catch_0
    move-exception v3

    .line 253
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    const-string v1, "parseJsonData Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    :goto_2
    return-void
.end method

.method static synthetic e(Lo/duc;Lo/dvu;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lo/duc;->b(Lo/dvu;)V

    return-void
.end method

.method private f()V
    .locals 22

    .line 320
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    const-string v1, "enter DownloadMedalPngRes"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    sget-object v0, Lo/duc;->e:Landroid/content/Context;

    const-string v1, "_medalPngStatusDownloadDoing"

    const-string v2, "doing"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/duc;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 323
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/duc;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .line 324
    const/4 v10, 0x0

    .line 325
    const/4 v11, 0x0

    .line 326
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 327
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/util/Map$Entry;

    .line 328
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/util/Map;

    .line 329
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    .line 330
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/duc;->c:Ljava/util/Map;

    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/util/Map;

    .line 331
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 332
    move-object v10, v14

    .line 334
    :cond_0
    move-object/from16 v16, v10

    .line 335
    invoke-interface {v13}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v17

    .line 336
    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 337
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Ljava/util/Map$Entry;

    .line 338
    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Ljava/lang/String;

    .line 339
    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Ljava/lang/String;

    .line 340
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 341
    move-object/from16 v11, v19

    .line 343
    :cond_1
    move-object/from16 v21, v11

    .line 344
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/duc;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 345
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/duc;->b:Ljava/util/concurrent/ExecutorService;

    .line 347
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/duc;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/duc$2;

    move-object/from16 v2, p0

    move-object v3, v15

    move-object/from16 v4, v19

    move-object/from16 v5, v20

    move-object v6, v14

    move-object/from16 v7, v16

    move-object/from16 v8, v21

    invoke-direct/range {v1 .. v8}, Lo/duc$2;-><init>(Lo/duc;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 370
    goto :goto_1

    .line 371
    :cond_3
    goto/16 :goto_0

    .line 372
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/duc;->b:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lo/dzw;->c(Ljava/util/concurrent/ExecutorService;)V

    .line 374
    :cond_5
    return-void
.end method

.method private g()Z
    .locals 8

    .line 288
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    const-string v1, "enter allMedalTextureIsDownload"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    iget-object v0, p0, Lo/duc;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 290
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 291
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 292
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map;

    .line 293
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 294
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 295
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 296
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 297
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 298
    const/4 v0, 0x0

    return v0

    .line 300
    :cond_0
    goto :goto_1

    .line 301
    :cond_1
    goto :goto_0

    .line 302
    :cond_2
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 107
    iget-object v0, p0, Lo/duc;->f:Lo/dwr;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()V
    .locals 7

    .line 117
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter DownMedalPngRes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    sget-object v0, Lo/duc;->e:Landroid/content/Context;

    const-string v1, "_medalPngStatusDownloadDoing"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 119
    sget-object v5, Lo/duc;->a:Ljava/lang/Object;

    monitor-enter v5

    .line 120
    const-string v0, "doing"

    :try_start_0
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 121
    invoke-direct {p0}, Lo/duc;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    :cond_0
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 125
    :goto_0
    return-void
.end method

.method public e(Lo/dwr;)V
    .locals 0

    .line 111
    if-eqz p1, :cond_0

    .line 112
    iput-object p1, p0, Lo/duc;->f:Lo/dwr;

    .line 114
    :cond_0
    return-void
.end method
