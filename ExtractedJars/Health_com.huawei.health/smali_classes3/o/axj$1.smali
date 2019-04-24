.class final Lo/axj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axj;->c(Lo/awt;Landroid/os/Handler;Z)Lo/brc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/awt;

.field final synthetic b:Landroid/os/Handler;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Landroid/os/Handler;Lo/awt;Z)V
    .locals 0

    .line 205
    iput-object p1, p0, Lo/axj$1;->b:Landroid/os/Handler;

    iput-object p2, p0, Lo/axj$1;->a:Lo/awt;

    iput-boolean p3, p0, Lo/axj$1;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 209
    iget-object v0, p0, Lo/axj$1;->b:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 211
    iget-object v0, p0, Lo/axj$1;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 212
    iget-object v0, p0, Lo/axj$1;->a:Lo/awt;

    invoke-virtual {v0}, Lo/awt;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 214
    const/16 v0, 0x6012

    iput v0, v3, Landroid/os/Message;->what:I

    .line 215
    iget-object v0, p0, Lo/axj$1;->a:Lo/awt;

    invoke-virtual {v0, v3}, Lo/awt;->e(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v3

    goto :goto_0

    .line 219
    :cond_0
    const/16 v0, 0x6013

    iput v0, v3, Landroid/os/Message;->what:I

    .line 221
    :goto_0
    iget-object v0, p0, Lo/axj$1;->b:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 224
    :cond_1
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Boolean;

    .line 225
    if-eqz v3, :cond_2

    .line 227
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isRequestUserNotifySucc"

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 230
    :cond_2
    iget-boolean v0, p0, Lo/axj$1;->e:Z

    invoke-static {v0}, Lo/axj;->b(Z)V

    .line 231
    return-void
.end method
