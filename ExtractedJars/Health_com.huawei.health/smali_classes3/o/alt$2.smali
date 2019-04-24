.class Lo/alt$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/amf$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alt;->b(Lo/ala;ZZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ala;

.field final synthetic e:Lo/alt;


# direct methods
.method constructor <init>(Lo/alt;Lo/ala;)V
    .locals 0

    .line 1462
    iput-object p1, p0, Lo/alt$2;->e:Lo/alt;

    iput-object p2, p0, Lo/alt$2;->d:Lo/ala;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1480
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flush2DB result error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1481
    return-void
.end method

.method public e()V
    .locals 5

    .line 1466
    iget-object v0, p0, Lo/alt$2;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1467
    iget-object v0, p0, Lo/alt$2;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1469
    iget-object v0, p0, Lo/alt$2;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1470
    const/16 v0, 0xc8

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 1471
    iget-object v0, p0, Lo/alt$2;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1473
    :cond_0
    iget-object v0, p0, Lo/alt$2;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->e(Lo/alt;)Lo/abo;

    move-result-object v0

    invoke-virtual {v0}, Lo/abo;->b()V

    .line 1474
    iget-object v0, p0, Lo/alt$2;->e:Lo/alt;

    iget-object v1, p0, Lo/alt$2;->d:Lo/ala;

    invoke-static {v0, v1}, Lo/alt;->c(Lo/alt;Lo/ala;)V

    .line 1475
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flush2DB result success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1476
    return-void
.end method
