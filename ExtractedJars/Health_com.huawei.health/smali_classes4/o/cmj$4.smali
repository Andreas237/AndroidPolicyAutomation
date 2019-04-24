.class Lo/cmj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cmj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cmj;


# direct methods
.method constructor <init>(Lo/cmj;)V
    .locals 0

    .line 510
    iput-object p1, p0, Lo/cmj$4;->a:Lo/cmj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    .line 514
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "name : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " service "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 515
    iget-object v0, p0, Lo/cmj$4;->a:Lo/cmj;

    invoke-static {p2}, Lo/abf$e;->c(Landroid/os/IBinder;)Lo/abf;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cmj;->a(Lo/cmj;Lo/abf;)Lo/abf;

    .line 517
    iget-object v0, p0, Lo/cmj$4;->a:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->b(Lo/cmj;)Lo/abf;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cmj$4;->a:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->e(Lo/cmj;)Lo/cmo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 518
    iget-object v0, p0, Lo/cmj$4;->a:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->e(Lo/cmj;)Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmo;->b(Ljava/lang/Object;)V

    .line 519
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bind Success "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 521
    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    .line 526
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onServiceDisconnected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 527
    iget-object v0, p0, Lo/cmj$4;->a:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->e(Lo/cmj;)Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmo;->a(Ljava/lang/Object;)V

    .line 528
    iget-object v0, p0, Lo/cmj$4;->a:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->d(Lo/cmj;)V

    .line 530
    iget-object v0, p0, Lo/cmj$4;->a:Lo/cmj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cmj;->a(Lo/cmj;Lo/abf;)Lo/abf;

    .line 532
    return-void
.end method
