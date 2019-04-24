.class Lo/dca$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dca;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lo/dca;


# direct methods
.method constructor <init>(Lo/dca;Landroid/os/Looper;)V
    .locals 0

    .line 343
    iput-object p1, p0, Lo/dca$c;->d:Lo/dca;

    .line 344
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 345
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 349
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 350
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 352
    :pswitch_0
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync time out"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    invoke-static {v0}, Lo/dca;->e(Lo/dca;)V

    .line 354
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dca;->b(Lo/dca;I)V

    .line 356
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const-string v1, ""

    const/16 v2, 0x520d

    invoke-static {v0, v2, v1}, Lo/dca;->e(Lo/dca;ILjava/lang/String;)V

    .line 357
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dca;->b(Lo/dca;Z)Z

    .line 358
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dca;->a(Lo/dca;I)I

    .line 359
    goto/16 :goto_0

    .line 361
    :pswitch_1
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "proc cpc time out"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    invoke-static {v0}, Lo/dca;->e(Lo/dca;)V

    .line 363
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dca;->b(Lo/dca;I)V

    .line 365
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const-string v1, ""

    const/16 v2, 0x520d

    invoke-static {v0, v2, v1}, Lo/dca;->e(Lo/dca;ILjava/lang/String;)V

    .line 366
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dca;->b(Lo/dca;Z)Z

    .line 367
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dca;->a(Lo/dca;I)I

    .line 368
    goto/16 :goto_0

    .line 370
    :pswitch_2
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "proc update sync flag"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const/4 v1, 0x1

    iput v1, v0, Lo/dca;->a:I

    .line 372
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dca;->a(Lo/dca;I)I

    .line 373
    goto :goto_0

    .line 375
    :pswitch_3
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync from device success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const/16 v1, 0x64

    invoke-static {v0, v1}, Lo/dca;->a(Lo/dca;I)I

    .line 377
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    const/4 v1, 0x4

    iput v1, v0, Lo/dca;->a:I

    .line 379
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    invoke-static {v0}, Lo/dca;->c(Lo/dca;)Lo/dca$b;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 380
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no timer task"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    iget-object v0, p0, Lo/dca$c;->d:Lo/dca;

    invoke-virtual {v0}, Lo/dca;->a()V

    .line 383
    :cond_0
    invoke-static {}, Lo/dca;->k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 384
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "report progress 100"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    invoke-static {}, Lo/dca;->k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x4e20

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 392
    :cond_1
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
