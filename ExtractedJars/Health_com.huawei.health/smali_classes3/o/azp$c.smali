.class Lo/azp$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lo/azp;


# direct methods
.method constructor <init>(Lo/azp;Landroid/os/Looper;)V
    .locals 0

    .line 454
    iput-object p1, p0, Lo/azp$c;->c:Lo/azp;

    .line 455
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 456
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 461
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 462
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 466
    :pswitch_0
    iget-object v0, p0, Lo/azp$c;->c:Lo/azp;

    invoke-static {v0}, Lo/azp;->b(Lo/azp;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 467
    const-string v0, "SNSIMConnection"

    const-string v1, "------------Build XMPPConnection begin-------------"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    iget-object v0, p0, Lo/azp$c;->c:Lo/azp;

    invoke-static {v0}, Lo/azp;->a(Lo/azp;)Lo/azd$a;

    move-result-object v5

    .line 469
    iget-object v0, p0, Lo/azp$c;->c:Lo/azp;

    invoke-static {v0}, Lo/azp;->b(Lo/azp;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 472
    iget-object v0, p0, Lo/azp$c;->c:Lo/azp;

    invoke-virtual {v0}, Lo/azp;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 474
    sget-object v0, Lo/azd$a;->c:Lo/azd$a;

    if-ne v5, v0, :cond_0

    .line 476
    iget-object v0, p0, Lo/azp$c;->c:Lo/azp;

    invoke-static {v0}, Lo/azp;->d(Lo/azp;)V

    .line 477
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/azp$c;->removeMessages(I)V

    goto :goto_0

    .line 482
    :cond_0
    iget-object v0, p0, Lo/azp$c;->c:Lo/azp;

    invoke-static {v0, v5}, Lo/azp;->c(Lo/azp;Lo/azd$a;)V

    .line 485
    :cond_1
    :goto_0
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "------------Build XMPPConnection end result:("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")-------------"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    goto :goto_2

    .line 490
    :pswitch_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v5

    .line 491
    if-eqz v5, :cond_2

    .line 493
    iget-object v0, p0, Lo/azp$c;->c:Lo/azp;

    const-string v1, "userID"

    const-wide/16 v2, 0x0

    invoke-virtual {v5, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    const-string v3, "deviceID"

    const/4 v4, 0x0

    invoke-virtual {v5, v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lo/azp;->e(Lo/azp;JLjava/lang/String;)V

    goto :goto_1

    .line 497
    :cond_2
    iget-object v0, p0, Lo/azp$c;->c:Lo/azp;

    invoke-static {v0}, Lo/azp;->c(Lo/azp;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 499
    :goto_1
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/azp$c;->removeMessages(I)V

    .line 500
    goto :goto_2

    .line 504
    :pswitch_2
    iget-object v0, p0, Lo/azp$c;->c:Lo/azp;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v0, v1}, Lo/azp;->a(Lo/azp;Landroid/os/Bundle;)V

    .line 505
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/azp$c;->removeMessages(I)V

    .line 506
    const-string v0, "SNSIMConnection"

    const-string v1, "Handle XMPPConnection is released!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    goto :goto_2

    .line 511
    :pswitch_3
    iget-object v0, p0, Lo/azp$c;->c:Lo/azp;

    invoke-static {v0}, Lo/azp;->f(Lo/azp;)V

    .line 513
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/azp$c;->removeMessages(I)V

    .line 514
    .line 519
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
