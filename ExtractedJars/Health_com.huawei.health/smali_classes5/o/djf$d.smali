.class Lo/djf$d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/djf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic c:Lo/djf;


# direct methods
.method constructor <init>(Lo/djf;)V
    .locals 0

    .line 420
    iput-object p1, p0, Lo/djf$d;->c:Lo/djf;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 424
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ConnectionChangeReceiver onReceive, intent.action: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " intent.type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    iget-object v0, p0, Lo/djf$d;->c:Lo/djf;

    invoke-static {v0}, Lo/djf;->b(Lo/djf;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ConnectionChangeReceiver onReceive, isMobile is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    const/4 v0, 0x1

    invoke-static {v0}, Lo/djf;->d(Z)Z

    .line 436
    iget-object v0, p0, Lo/djf$d;->c:Lo/djf;

    invoke-static {v0}, Lo/djf;->c(Lo/djf;)Lo/djf$b;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/djf$d;->c:Lo/djf;

    invoke-static {v0}, Lo/djf;->c(Lo/djf;)Lo/djf$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/djf$b;->isAlive()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lo/djf;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 438
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start refresh thread@ConnectionChangeReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    iget-object v0, p0, Lo/djf$d;->c:Lo/djf;

    new-instance v1, Lo/djf$b;

    iget-object v2, p0, Lo/djf$d;->c:Lo/djf;

    invoke-direct {v1, v2}, Lo/djf$b;-><init>(Lo/djf;)V

    invoke-static {v0, v1}, Lo/djf;->b(Lo/djf;Lo/djf$b;)Lo/djf$b;

    .line 440
    iget-object v0, p0, Lo/djf$d;->c:Lo/djf;

    invoke-static {v0}, Lo/djf;->c(Lo/djf;)Lo/djf$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/djf$b;->start()V

    goto/16 :goto_0

    .line 445
    :cond_0
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ConnectionChangeReceiver onReceive, isMobile is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    invoke-static {}, Lo/djf;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 450
    const/4 v0, 0x0

    invoke-static {v0}, Lo/djf;->d(Z)Z

    .line 451
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ConnectionChangeReceiver onReceive, from mobile switch to non-mobile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    iget-object v0, p0, Lo/djf$d;->c:Lo/djf;

    iget-object v1, p0, Lo/djf$d;->c:Lo/djf;

    invoke-static {v1}, Lo/djf;->e(Lo/djf;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lo/djf;->c(Lo/djf;Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/djf$d;->c:Lo/djf;

    invoke-static {v0}, Lo/djf;->a(Lo/djf;)Lo/djf$e;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/djf$d;->c:Lo/djf;

    invoke-static {v0}, Lo/djf;->a(Lo/djf;)Lo/djf$e;

    move-result-object v0

    invoke-virtual {v0}, Lo/djf$e;->isAlive()Z

    move-result v0

    if-nez v0, :cond_1

    .line 454
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start record thread@ConnectionChangeReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    iget-object v0, p0, Lo/djf$d;->c:Lo/djf;

    new-instance v1, Lo/djf$e;

    iget-object v2, p0, Lo/djf$d;->c:Lo/djf;

    invoke-direct {v1, v2}, Lo/djf$e;-><init>(Lo/djf;)V

    invoke-static {v0, v1}, Lo/djf;->e(Lo/djf;Lo/djf$e;)Lo/djf$e;

    .line 456
    iget-object v0, p0, Lo/djf$d;->c:Lo/djf;

    invoke-static {v0}, Lo/djf;->a(Lo/djf;)Lo/djf$e;

    move-result-object v0

    invoke-virtual {v0}, Lo/djf$e;->start()V

    .line 459
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lo/djf;->d(Z)Z

    .line 460
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ConnectionChangeReceiver onReceive, ready to close refresh thread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    :cond_2
    :goto_0
    return-void
.end method
