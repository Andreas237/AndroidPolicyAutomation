.class Lo/asb$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asb;->b(Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/asb;


# direct methods
.method constructor <init>(Lo/asb;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lo/asb$3;->a:Lo/asb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 185
    iget-object v0, p0, Lo/asb$3;->a:Lo/asb;

    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v1

    new-instance v2, Lo/asb$3$5;

    invoke-direct {v2, p0}, Lo/asb$3$5;-><init>(Lo/asb$3;)V

    invoke-virtual {v1, v2}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    move-result-object v1

    invoke-static {v0, v1}, Lo/asb;->e(Lo/asb;Lo/bqy;)Lo/bqy;

    .line 206
    return-void
.end method

.method public e(II)V
    .locals 3

    .line 211
    iget-object v0, p0, Lo/asb$3;->a:Lo/asb;

    invoke-static {v0}, Lo/asb;->d(Lo/asb;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lo/asb$3;->a:Lo/asb;

    invoke-static {v0}, Lo/asb;->d(Lo/asb;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/asb$3;->a:Lo/asb;

    invoke-static {v1}, Lo/asb;->d(Lo/asb;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x13

    invoke-virtual {v1, v2, p1, p2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 215
    :cond_0
    return-void
.end method
