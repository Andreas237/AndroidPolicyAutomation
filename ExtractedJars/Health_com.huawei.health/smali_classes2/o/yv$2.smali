.class Lo/yv$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aah;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/yv;->b(Ljava/lang/String;Lo/zl;)V
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
.field private final synthetic b:Ljava/lang/String;

.field final synthetic c:Lo/yv;

.field private final synthetic e:J


# direct methods
.method constructor <init>(Lo/yv;Ljava/lang/String;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/yv$2;->c:Lo/yv;

    iput-object p2, p0, Lo/yv$2;->b:Ljava/lang/String;

    iput-wide p3, p0, Lo/yv$2;->e:J

    .line 586
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/aag;)V
    .locals 1

    .line 1
    move-object v0, p1

    check-cast v0, Lo/aaa;

    invoke-virtual {p0, v0}, Lo/yv$2;->c(Lo/aaa;)V

    return-void
.end method

.method public c(Lo/aaa;)V
    .locals 10

    .line 591
    const-string v0, "getGrsUrls onRequestResponse."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 594
    const/4 v5, 0x0

    .line 597
    iget-object v0, p0, Lo/yv$2;->c:Lo/yv;

    invoke-static {v0, p1}, Lo/yv;->d(Lo/yv;Lo/aaa;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 600
    const/4 v5, 0x1

    .line 602
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGrsUrls onRequestResponse isSuccess value--->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo/aaa;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 604
    iget-object v0, p0, Lo/yv$2;->c:Lo/yv;

    invoke-static {v0, p1}, Lo/yv;->b(Lo/yv;Lo/aaa;)V

    .line 605
    goto :goto_0

    .line 608
    :cond_0
    const-string v0, "getGrsUrls onRequestResponse server query fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 611
    :goto_0
    invoke-static {}, Lo/zp;->b()Lo/zp;

    move-result-object v0

    iget-object v1, p0, Lo/yv$2;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/zp;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 613
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGrsUrls onRequestResponse timeOutStatus ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 616
    const-string v0, "-900"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 619
    iget-object v0, p0, Lo/yv$2;->c:Lo/yv;

    invoke-static {v0}, Lo/yv;->c(Lo/yv;)Lo/yv$b;

    move-result-object v0

    const/16 v1, 0x2c2

    invoke-virtual {v0, v1}, Lo/yv$b;->removeMessages(I)V

    .line 622
    iget-object v0, p0, Lo/yv$2;->c:Lo/yv;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/yv;->d(Lo/yv;Z)Ljava/util/Map;

    move-result-object v7

    .line 625
    invoke-static {v7}, Lo/aar;->d(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 627
    const-string v0, "onRequestResponse sp get getGrsUrls is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 630
    iget-object v0, p0, Lo/yv$2;->c:Lo/yv;

    invoke-static {v0}, Lo/yv;->e(Lo/yv;)Ljava/util/Map;

    move-result-object v7

    .line 633
    goto :goto_1

    .line 636
    :cond_1
    const-string v0, "onRequestResponse sp get getGrsUrls success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 639
    :goto_1
    iget-object v0, p0, Lo/yv$2;->c:Lo/yv;

    invoke-static {v0}, Lo/yv;->c(Lo/yv;)Lo/yv$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/yv$b;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 640
    invoke-static {v7}, Lo/aar;->d(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 642
    const-string v0, "onRequestResponse get getGrsUrls success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 643
    const/16 v0, 0x7d2

    iput v0, v8, Landroid/os/Message;->what:I

    .line 644
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 645
    goto :goto_2

    .line 648
    :cond_2
    const-string v0, "onRequestResponse get getGrsUrls fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 649
    const/16 v0, 0x7d1

    iput v0, v8, Landroid/os/Message;->what:I

    .line 651
    :goto_2
    iget-object v0, p0, Lo/yv$2;->c:Lo/yv;

    invoke-static {v0}, Lo/yv;->c(Lo/yv;)Lo/yv$b;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/yv$b;->sendMessage(Landroid/os/Message;)Z

    .line 653
    iget-object v0, p0, Lo/yv$2;->c:Lo/yv;

    invoke-static {v0, v5, p1}, Lo/yv;->d(Lo/yv;ZLo/aaa;)V

    .line 656
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

    iget-wide v3, p0, Lo/yv$2;->e:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 657
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGrsUrls onRequestResponse cp."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 658
    iget-object v0, p0, Lo/yv$2;->c:Lo/yv;

    invoke-static {v0, v9}, Lo/yv;->d(Lo/yv;Ljava/lang/String;)V

    .line 660
    :cond_3
    return-void
.end method
