.class Lo/ahz$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ahz;


# direct methods
.method constructor <init>(Lo/ahz;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 300
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 302
    :sswitch_0
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->i(Lo/ahz;)Ljava/lang/String;

    move-result-object v4

    .line 303
    const-string v0, "CombinationTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TIMEOUT:\u8bbe\u5907\u914d\u7f6e\u5931\u8d25\uff0c\u7ed3\u679c\u4e0a\u62a5UI "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 304
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-virtual {v0}, Lo/ahz;->a()V

    .line 305
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-virtual {v0}, Lo/ahz;->c()V

    .line 306
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->h(Lo/ahz;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->c(Landroid/content/Context;)V

    .line 307
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->f(Lo/ahz;)Lo/ajv;

    move-result-object v0

    const-string v1, "\u914d\u7f51\u5931\u8d25"

    const/16 v2, 0x83c

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/ajv;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->n(Lo/ahz;)Lo/ajm;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 309
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "  MULTICAST_ERROR_MULT_REV_TIMEOUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 310
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->n(Lo/ahz;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x83c

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V

    goto/16 :goto_0

    .line 315
    :sswitch_1
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->i(Lo/ahz;)Ljava/lang/String;

    move-result-object v5

    .line 316
    const-string v0, "CombinationTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UDP\u63a5\u6536\u5f02\u5e38\uff0c\u7ed3\u679c\u4e0a\u62a5UI "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 317
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-virtual {v0}, Lo/ahz;->c()V

    .line 318
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->h(Lo/ahz;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->c(Landroid/content/Context;)V

    .line 319
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->f(Lo/ahz;)Lo/ajv;

    move-result-object v0

    const-string v1, "\u914d\u7f51\u5931\u8d25"

    const/16 v2, 0x835

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/ajv;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->n(Lo/ahz;)Lo/ajm;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 321
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "  MULTICAST_ERROR_CONFIG_FAIL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 322
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->n(Lo/ahz;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x835

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V

    goto/16 :goto_0

    .line 326
    :sswitch_2
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u505c\u6b62\u53d1\u5305"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 327
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->n(Lo/ahz;)Lo/ajm;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 328
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->n(Lo/ahz;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x8a2

    invoke-interface {v0, v1}, Lo/ajm;->onStatus(I)V

    .line 330
    :cond_0
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-virtual {v0}, Lo/ahz;->e()V

    .line 331
    goto/16 :goto_0

    .line 333
    :sswitch_3
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4f4e\u901f\u6a21\u5f0f 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 334
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/ahz;->a(I)V

    .line 335
    goto :goto_0

    .line 337
    :sswitch_4
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e2d\u901f\u6a21\u5f0f 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 338
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ahz;->a(I)V

    .line 339
    goto :goto_0

    .line 341
    :sswitch_5
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5207\u6362\u6a21\u5f0f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 342
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ahz;->a(Lo/ahz;I)I

    .line 343
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->m(Lo/ahz;)Lo/ahz$a;

    move-result-object v0

    iget-object v1, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v1}, Lo/ahz;->p(Lo/ahz;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ahz$a;->e(I)V

    .line 344
    goto :goto_0

    .line 347
    :sswitch_6
    const/4 v0, 0x3

    invoke-static {v0}, Lo/dbw;->d(I)V

    .line 348
    new-instance v0, Lo/ahz$1$2;

    invoke-direct {v0, p0}, Lo/ahz$1$2;-><init>(Lo/ahz$1;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 364
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->k(Lo/ahz;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x9

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 365
    goto :goto_0

    .line 368
    :sswitch_7
    iget-object v0, p0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0, p1}, Lo/ahz;->b(Lo/ahz;Landroid/os/Message;)V

    .line 369
    .line 373
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_7
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
        0x5 -> :sswitch_2
        0x6 -> :sswitch_3
        0x7 -> :sswitch_4
        0x8 -> :sswitch_5
        0x9 -> :sswitch_6
        0x89f -> :sswitch_7
    .end sparse-switch
.end method
