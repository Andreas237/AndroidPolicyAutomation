.class public abstract Lcom/huawei/hwid/core/b/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/core/b/a/a$a;,
        Lcom/huawei/hwid/core/b/a/a$b;,
        Lcom/huawei/hwid/core/b/a/a$c;,
        Lcom/huawei/hwid/core/b/a/a$d;
    }
.end annotation


# instance fields
.field protected a:I

.field protected b:I

.field protected c:I

.field protected d:Ljava/lang/String;

.field protected e:Ljava/lang/String;

.field protected f:I

.field protected g:I

.field private h:Ljava/lang/String;

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:I

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private s:Z

.field private t:Lcom/huawei/hwid/core/b/a/a$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a;->a:I

    .line 151
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a;->b:I

    .line 154
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a;->c:I

    .line 163
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a;->f:I

    .line 165
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->h:Ljava/lang/String;

    .line 169
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->i:Ljava/util/ArrayList;

    .line 172
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a;->j:Z

    .line 176
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a;->k:Z

    .line 178
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a;->l:Z

    .line 184
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a;->m:Z

    .line 191
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a;->g:I

    .line 206
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a;->n:I

    .line 222
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->r:Ljava/util/ArrayList;

    .line 223
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a;->s:Z

    .line 233
    sget-object v0, Lcom/huawei/hwid/core/b/a/a$c;->a:Lcom/huawei/hwid/core/b/a/a$c;

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->t:Lcom/huawei/hwid/core/b/a/a$c;

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 276
    invoke-static {}, Lcom/huawei/hwid/core/b/a/a$d;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Lcom/huawei/hwid/core/helper/handler/a;)Lcom/huawei/hwid/core/b/a/a$b;
    .locals 2

    .line 500
    new-instance v1, Lcom/huawei/hwid/core/b/a/a$a;

    const-string v0, "BackgroundHandlerThread"

    invoke-direct {v1, v0, p3}, Lcom/huawei/hwid/core/b/a/a$a;-><init>(Ljava/lang/String;Lcom/huawei/hwid/core/helper/handler/a;)V

    .line 501
    invoke-virtual {v1}, Lcom/huawei/hwid/core/b/a/a$a;->start()V

    .line 502
    invoke-virtual {v1}, Lcom/huawei/hwid/core/b/a/a$a;->a()Lcom/huawei/hwid/core/b/a/a$b;

    move-result-object v0

    return-object v0
.end method

.method public a()Lcom/huawei/hwid/core/b/a/a$c;
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->t:Lcom/huawei/hwid/core/b/a/a$c;

    return-object v0
.end method

.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 455
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 456
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?Version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "12000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&cVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 458
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?Version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "12000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&cVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 358
    iput p1, p0, Lcom/huawei/hwid/core/b/a/a;->a:I

    .line 359
    return-void
.end method

.method public a(IILjava/lang/String;)V
    .locals 7

    .line 571
    move v5, p2

    .line 572
    move-object v6, p3

    .line 574
    const/16 v0, 0xc8

    if-ne p2, v0, :cond_0

    iget v0, p0, Lcom/huawei/hwid/core/b/a/a;->b:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/hwid/core/b/a/a;->c:I

    if-lez v0, :cond_0

    .line 575
    iget v5, p0, Lcom/huawei/hwid/core/b/a/a;->c:I

    .line 576
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->l()Ljava/lang/String;

    move-result-object v6

    .line 578
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->r:Ljava/util/ArrayList;

    const-string v1, "{times:%d,code:%d,msg:%s}"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "result ok"

    goto :goto_0

    :cond_1
    move-object v3, v6

    :goto_0
    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 579
    return-void
.end method

.method public a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0

    .line 326
    return-void
.end method

.method public a(Lcom/huawei/hwid/core/b/a/a$c;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a;->t:Lcom/huawei/hwid/core/b/a/a$c;

    .line 237
    return-void
.end method

.method protected abstract a(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public a(Z)V
    .locals 0

    .line 398
    iput-boolean p1, p0, Lcom/huawei/hwid/core/b/a/a;->j:Z

    .line 399
    return-void
.end method

.method public b(Landroid/content/Context;)Landroid/os/Bundle;
    .locals 6

    .line 607
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->w()Ljava/lang/String;

    move-result-object v2

    .line 608
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 609
    const/4 v0, 0x0

    return-object v0

    .line 611
    :cond_0
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 612
    const-string v0, "opID"

    const-string v1, "0"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 613
    const-string v0, "reqTime"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 614
    const-string v0, "rspTime"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 615
    const-string v0, "opDetail"

    invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    const-string v0, "url"

    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/b/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    const-string v0, "siteID"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->r()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 619
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->i()I

    move-result v4

    .line 621
    const/16 v0, 0x3f0

    if-eq v0, v4, :cond_1

    const/16 v0, 0x3ed

    if-eq v0, v4, :cond_1

    const/16 v0, 0xbc0

    if-eq v0, v4, :cond_1

    .line 622
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->y()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 623
    :cond_1
    const-string v0, "isRequestException"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 624
    const-string v0, "error"

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 626
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->j()I

    move-result v5

    .line 627
    const/4 v0, -0x1

    if-eq v0, v5, :cond_3

    .line 628
    const-string v0, "error"

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 630
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->k()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_4

    .line 631
    const-string v0, "error"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->k()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 633
    :cond_4
    const-string v0, "error"

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 636
    :goto_0
    const-string v0, "isRequestException"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 638
    :goto_1
    return-object v3
.end method

.method public b(I)V
    .locals 2

    .line 390
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->i:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    return-void
.end method

.method protected b(Ljava/lang/String;)V
    .locals 0

    .line 323
    return-void
.end method

.method protected b(Z)V
    .locals 0

    .line 496
    iput-boolean p1, p0, Lcom/huawei/hwid/core/b/a/a;->m:Z

    .line 497
    return-void
.end method

.method protected c()Ljava/lang/String;
    .locals 3

    .line 294
    const-class v1, Lcom/huawei/hwid/core/b/a/a;

    monitor-enter v1

    .line 295
    :try_start_0
    invoke-static {}, Lcom/huawei/hwid/core/b/a/a$d;->b()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 296
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public c(I)V
    .locals 5

    .line 429
    iput p1, p0, Lcom/huawei/hwid/core/b/a/a;->n:I

    .line 431
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->f()Ljava/lang/String;

    move-result-object v2

    .line 433
    const-string v3, ""

    .line 437
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a;->n:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/hwid/core/b/a/a;->n:I

    const/16 v1, 0x3e7

    if-gt v0, v1, :cond_0

    .line 438
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 440
    :cond_0
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "\\{0\\}"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const/4 v0, 0x1

    aput-object v3, v4, v0

    .line 441
    invoke-static {v2, v4}, Lcom/huawei/hwid/core/d/j;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->o:Ljava/lang/String;

    .line 442
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 462
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a;->o:Ljava/lang/String;

    .line 463
    return-void
.end method

.method protected abstract d()Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public d(I)V
    .locals 0

    .line 488
    iput p1, p0, Lcom/huawei/hwid/core/b/a/a;->f:I

    .line 489
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 560
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a;->p:Ljava/lang/String;

    .line 561
    return-void
.end method

.method protected e()Ljava/lang/String;
    .locals 1

    .line 319
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 568
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a;->q:Ljava/lang/String;

    .line 569
    return-void
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public g()Landroid/os/Bundle;
    .locals 1

    .line 337
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->h()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public h()Landroid/os/Bundle;
    .locals 3

    .line 341
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 342
    const-string v0, "responseCode"

    iget v1, p0, Lcom/huawei/hwid/core/b/a/a;->a:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 343
    const-string v0, "resultCode"

    iget v1, p0, Lcom/huawei/hwid/core/b/a/a;->b:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 344
    const-string v0, "errorCode"

    iget v1, p0, Lcom/huawei/hwid/core/b/a/a;->c:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 345
    const-string v0, "errorDesc"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    const-string v0, "TGC"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a;->e:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const-string v0, "UIHandlerErrCodeList"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->m()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 348
    const-string v0, "isUIHandlerAllErrCode"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->n()Z

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 349
    const-string v0, "isIngoreTokenErr"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->o()Z

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 350
    return-object v2
.end method

.method public i()I
    .locals 1

    .line 354
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a;->a:I

    return v0
.end method

.method public j()I
    .locals 1

    .line 362
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a;->b:I

    return v0
.end method

.method public k()I
    .locals 1

    .line 366
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a;->c:I

    return v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 370
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 394
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->i:Ljava/util/ArrayList;

    return-object v0
.end method

.method public n()Z
    .locals 1

    .line 402
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a;->j:Z

    return v0
.end method

.method public o()Z
    .locals 1

    .line 410
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a;->k:Z

    return v0
.end method

.method public p()I
    .locals 1

    .line 414
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a;->g:I

    return v0
.end method

.method public q()Ljava/lang/String;
    .locals 3

    .line 418
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->f()Ljava/lang/String;

    move-result-object v2

    .line 420
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 421
    const-string v0, "/"

    invoke-virtual {v2, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 423
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public r()I
    .locals 1

    .line 445
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a;->n:I

    return v0
.end method

.method public s()Z
    .locals 1

    .line 476
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a;->l:Z

    return v0
.end method

.method public t()I
    .locals 1

    .line 484
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a;->f:I

    return v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    .line 556
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->p:Ljava/lang/String;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    .line 564
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->q:Ljava/lang/String;

    return-object v0
.end method

.method public w()Ljava/lang/String;
    .locals 4

    .line 585
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 586
    const-string v0, ""

    return-object v0

    .line 588
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 589
    const-string v0, "{"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 591
    if-lez v2, :cond_2

    .line 592
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    .line 593
    if-eqz v3, :cond_1

    .line 594
    const-string v0, ","

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 600
    :cond_2
    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x()V
    .locals 1

    .line 604
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 605
    return-void
.end method

.method public y()Z
    .locals 2

    .line 642
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->i()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->i()I

    move-result v0

    const/16 v1, 0x133

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
