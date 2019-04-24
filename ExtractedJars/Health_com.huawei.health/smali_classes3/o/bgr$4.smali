.class Lo/bgr$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bgr;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/bgr;


# direct methods
.method constructor <init>(Lo/bgr;)V
    .locals 0

    .line 450
    iput-object p1, p0, Lo/bgr$4;->a:Lo/bgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 455
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 457
    iget-object v0, p0, Lo/bgr$4;->a:Lo/bgr;

    invoke-static {v0}, Lo/bgr;->a(Lo/bgr;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/bgr$4;->a:Lo/bgr;

    invoke-static {v1}, Lo/bgr;->a(Lo/bgr;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x153

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 459
    iget-object v0, p0, Lo/bgr$4;->a:Lo/bgr;

    .line 460
    invoke-static {v0}, Lo/bgr;->k(Lo/bgr;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 459
    const/4 v1, 0x2

    const/16 v2, 0x147

    invoke-static {v1, v2, v0}, Lo/apf;->d(IILjava/lang/Object;)V

    goto :goto_0

    .line 464
    :cond_0
    const-string v0, "NormalGroupEvent"

    const-string v1, "clearChatRecord error. delete record from DB error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    :goto_0
    return-void
.end method
