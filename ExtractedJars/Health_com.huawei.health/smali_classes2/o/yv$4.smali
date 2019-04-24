.class Lo/yv$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aah;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/yv;->e(Ljava/lang/String;Ljava/lang/String;Lo/zk;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/aah<Lo/aaa;>;"
    }
.end annotation


# instance fields
.field private final synthetic a:Ljava/lang/String;

.field final synthetic d:Lo/yv;

.field private final synthetic e:J


# direct methods
.method constructor <init>(Lo/yv;Ljava/lang/String;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/yv$4;->d:Lo/yv;

    iput-object p2, p0, Lo/yv$4;->a:Ljava/lang/String;

    iput-wide p3, p0, Lo/yv$4;->e:J

    .line 424
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/aag;)V
    .locals 1

    .line 1
    move-object v0, p1

    check-cast v0, Lo/aaa;

    invoke-virtual {p0, v0}, Lo/yv$4;->e(Lo/aaa;)V

    return-void
.end method

.method public e(Lo/aaa;)V
    .locals 10

    .line 429
    const-string v0, "getGrsUrl onRequestResponse."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 432
    const/4 v5, 0x0

    .line 435
    iget-object v0, p0, Lo/yv$4;->d:Lo/yv;

    invoke-static {v0, p1}, Lo/yv;->d(Lo/yv;Lo/aaa;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 438
    const/4 v5, 0x1

    .line 440
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGrsUrl onRequestResponse isSuccess value--->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo/aaa;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 441
    iget-object v0, p0, Lo/yv$4;->d:Lo/yv;

    invoke-static {v0, p1}, Lo/yv;->b(Lo/yv;Lo/aaa;)V

    .line 443
    goto :goto_0

    .line 446
    :cond_0
    const-string v0, "getGrsUrl onRequestResponse server query fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 449
    :goto_0
    invoke-static {}, Lo/zp;->b()Lo/zp;

    move-result-object v0

    iget-object v1, p0, Lo/yv$4;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/zp;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 451
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGrsUrl onRequestResponse timeOutStatus ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 454
    const-string v0, "-900"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 457
    iget-object v0, p0, Lo/yv$4;->d:Lo/yv;

    invoke-static {v0}, Lo/yv;->c(Lo/yv;)Lo/yv$b;

    move-result-object v0

    const/16 v1, 0x2bc

    invoke-virtual {v0, v1}, Lo/yv$b;->removeMessages(I)V

    .line 459
    iget-object v0, p0, Lo/yv$4;->d:Lo/yv;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/yv;->a(Lo/yv;Z)Ljava/lang/String;

    move-result-object v7

    .line 462
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 464
    const-string v0, "onRequestResponse sp get serviceUrl is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 467
    iget-object v0, p0, Lo/yv$4;->d:Lo/yv;

    invoke-static {v0}, Lo/yv;->a(Lo/yv;)Ljava/lang/String;

    move-result-object v7

    .line 470
    goto :goto_1

    .line 473
    :cond_1
    const-string v0, "onRequestResponse sp get serviceUrl success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 476
    :goto_1
    iget-object v0, p0, Lo/yv$4;->d:Lo/yv;

    invoke-static {v0}, Lo/yv;->c(Lo/yv;)Lo/yv$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/yv$b;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 477
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 479
    const-string v0, "onRequestResponse get serviceUrl success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 480
    const/16 v0, 0x7d0

    iput v0, v8, Landroid/os/Message;->what:I

    .line 481
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 482
    goto :goto_2

    .line 485
    :cond_2
    const-string v0, "onRequestResponse get serviceUrl fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 486
    const/16 v0, 0x7d1

    iput v0, v8, Landroid/os/Message;->what:I

    .line 488
    :goto_2
    iget-object v0, p0, Lo/yv$4;->d:Lo/yv;

    invoke-static {v0}, Lo/yv;->c(Lo/yv;)Lo/yv$b;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/yv$b;->sendMessage(Landroid/os/Message;)Z

    .line 490
    iget-object v0, p0, Lo/yv$4;->d:Lo/yv;

    invoke-static {v0, v5, p1}, Lo/yv;->d(Lo/yv;ZLo/aaa;)V

    .line 493
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Lo/aar;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lo/yv$4;->e:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 494
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGrsUrl onRequestResponse cp."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 495
    iget-object v0, p0, Lo/yv$4;->d:Lo/yv;

    invoke-static {v0, v9}, Lo/yv;->d(Lo/yv;Ljava/lang/String;)V

    .line 497
    :cond_3
    return-void
.end method
