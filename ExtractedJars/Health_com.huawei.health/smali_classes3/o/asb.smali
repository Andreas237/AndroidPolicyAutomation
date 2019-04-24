.class public final Lo/asb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:Lo/bqy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/bqy<Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;>;"
        }
    .end annotation
.end field

.field private g:Landroid/os/Handler;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asb;->c:Ljava/util/HashMap;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asb;->a:Ljava/util/HashMap;

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asb;->b:Ljava/util/List;

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/asb;->e:Ljava/util/List;

    .line 122
    return-void
.end method

.method private a()V
    .locals 1

    .line 347
    iget-object v0, p0, Lo/asb;->c:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 349
    iget-object v0, p0, Lo/asb;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 351
    :cond_0
    iget-object v0, p0, Lo/asb;->a:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 353
    iget-object v0, p0, Lo/asb;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 355
    :cond_1
    iget-object v0, p0, Lo/asb;->b:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 357
    iget-object v0, p0, Lo/asb;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 359
    :cond_2
    iget-object v0, p0, Lo/asb;->e:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 361
    iget-object v0, p0, Lo/asb;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 363
    :cond_3
    return-void
.end method

.method private b(Ljava/util/HashMap;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 237
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 239
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/asb;->c:Ljava/util/HashMap;

    .line 240
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/asb;->a:Ljava/util/HashMap;

    .line 241
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 242
    const/4 v2, 0x0

    .line 243
    const/4 v3, 0x0

    .line 244
    const/4 v4, 0x0

    .line 245
    const/4 v5, 0x0

    .line 247
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    .line 250
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 251
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 253
    invoke-static {v3}, Lo/boh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 254
    iget-object v0, p0, Lo/asb;->c:Ljava/util/HashMap;

    invoke-virtual {v0, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    iget-object v0, p0, Lo/asb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 258
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/asb;Lo/bra;)Ljava/lang/Integer;
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Lo/asb;->d(Lo/bra;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method private c(Landroid/app/Activity;)V
    .locals 4

    .line 149
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 152
    if-nez v3, :cond_0

    .line 154
    const-string v0, "MatchContactTask"

    const-string v1, "incrementalMatchContact not allow recommendContact"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    return-void

    .line 158
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/asb;->b(Landroid/os/Handler;)V

    .line 159
    return-void
.end method

.method static synthetic c(Lo/asb;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/asb;->a()V

    return-void
.end method

.method static synthetic d(Lo/asb;)Landroid/os/Handler;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/asb;->g:Landroid/os/Handler;

    return-object v0
.end method

.method private d(Lo/bra;)Ljava/lang/Integer;
    .locals 11

    .line 268
    const/4 v4, 0x0

    .line 270
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    const-string v0, "MatchContactTask"

    const-string v1, "matchContactEntity task cancel."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 276
    :cond_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v5

    .line 277
    new-instance v0, Lo/asc;

    invoke-direct {v0, v5}, Lo/asc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lo/asc;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/asb;->b:Ljava/util/List;

    .line 279
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 281
    const-string v0, "MatchContactTask"

    const-string v1, "matchContactEntity task cancel."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 285
    :cond_1
    invoke-static {}, Lo/arw;->a()Lo/arw;

    move-result-object v0

    iget-object v1, p0, Lo/asb;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/arw;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 287
    const/4 v7, 0x0

    .line 288
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 289
    if-eqz v6, :cond_2

    .line 291
    new-instance v9, Lo/asc;

    invoke-direct {v9, v5}, Lo/asc;-><init>(Landroid/content/Context;)V

    .line 293
    invoke-virtual {v9}, Lo/asc;->c()Ljava/util/HashMap;

    move-result-object v8

    .line 295
    invoke-virtual {v9, v8}, Lo/asc;->e(Ljava/util/HashMap;)Ljava/util/HashMap;

    move-result-object v8

    .line 296
    invoke-static {}, Lo/arw;->a()Lo/arw;

    move-result-object v0

    invoke-virtual {v0, v8, v6}, Lo/arw;->e(Ljava/util/HashMap;Ljava/util/List;)Ljava/util/HashMap;

    move-result-object v7

    .line 298
    :cond_2
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 300
    const-string v0, "MatchContactTask"

    const-string v1, "matchContactEntity task cancel."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 304
    :cond_3
    invoke-direct {p0, v7}, Lo/asb;->b(Ljava/util/HashMap;)V

    .line 307
    invoke-static {}, Lo/arw;->a()Lo/arw;

    move-result-object v0

    iget-object v1, p0, Lo/asb;->c:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Lo/arw;->c(Ljava/util/Map;)Ljava/util/List;

    move-result-object v9

    .line 308
    if-eqz v9, :cond_6

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 311
    iget-object v0, p0, Lo/asb;->e:Ljava/util/List;

    invoke-static {p1, v9, v0}, Lo/asa;->d(Lo/bra;Ljava/util/List;Ljava/util/List;)I

    move-result v4

    .line 312
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 314
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 317
    :cond_4
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lo/asb;->e:Ljava/util/List;

    iget-object v2, p0, Lo/asb;->c:Ljava/util/HashMap;

    iget-object v3, p0, Lo/asb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v1, v2, v3, v8}, Lo/axa;->c(Ljava/util/List;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)Z

    move-result v10

    .line 320
    if-eqz v10, :cond_5

    .line 322
    invoke-static {}, Lo/arw;->a()Lo/arw;

    move-result-object v0

    iget-object v1, p0, Lo/asb;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/arw;->e(Ljava/util/List;)V

    .line 325
    invoke-static {}, Lo/asa;->a()V

    goto :goto_0

    .line 329
    :cond_5
    const-string v0, "MatchContactTask"

    const-string v1, "batchInsertOrUpdateContact not success."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    :cond_6
    :goto_0
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isMatchedContact"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 337
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "matchContactTime"

    invoke-static {}, Lo/ary;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 339
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/asb;Lo/bqy;)Lo/bqy;
    .locals 0

    .line 35
    iput-object p1, p0, Lo/asb;->d:Lo/bqy;

    return-object p1
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 1

    .line 132
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    :cond_0
    return-void

    .line 138
    :cond_1
    invoke-direct {p0, p1}, Lo/asb;->c(Landroid/app/Activity;)V

    .line 139
    return-void
.end method

.method public b(Landroid/os/Handler;)V
    .locals 1

    .line 169
    iput-object p1, p0, Lo/asb;->g:Landroid/os/Handler;

    .line 171
    iget-object v0, p0, Lo/asb;->d:Lo/bqy;

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lo/asb;->d:Lo/bqy;

    invoke-interface {v0}, Lo/bqy;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    return-void

    .line 179
    :cond_0
    new-instance v0, Lo/asb$3;

    invoke-direct {v0, p0}, Lo/asb$3;-><init>(Lo/asb;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 217
    return-void
.end method

.method public c()V
    .locals 1

    .line 224
    iget-object v0, p0, Lo/asb;->d:Lo/bqy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/asb;->d:Lo/bqy;

    invoke-interface {v0}, Lo/bqy;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 226
    iget-object v0, p0, Lo/asb;->d:Lo/bqy;

    invoke-interface {v0}, Lo/bqy;->b()V

    .line 228
    :cond_0
    return-void
.end method
