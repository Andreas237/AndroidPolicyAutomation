.class Lo/cwi$10$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwi$10;->b(Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bru;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lo/cwi$10;


# direct methods
.method constructor <init>(Lo/cwi$10;Landroid/content/Context;)V
    .locals 0

    .line 579
    iput-object p1, p0, Lo/cwi$10$2;->d:Lo/cwi$10;

    iput-object p2, p0, Lo/cwi$10$2;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 582
    move-object v0, p2

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 583
    if-eqz v1, :cond_0

    .line 584
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 585
    const/4 v0, 0x2

    iput v0, v2, Landroid/os/Message;->what:I

    .line 586
    iget-object v0, p0, Lo/cwi$10$2;->c:Landroid/content/Context;

    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 587
    iget-object v0, p0, Lo/cwi$10$2;->d:Lo/cwi$10;

    iget-object v0, v0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->p(Lo/cwi;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 588
    goto :goto_0

    .line 589
    :cond_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 590
    const/4 v0, 0x3

    iput v0, v2, Landroid/os/Message;->what:I

    .line 591
    iget-object v0, p0, Lo/cwi$10$2;->c:Landroid/content/Context;

    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 592
    iget-object v0, p0, Lo/cwi$10$2;->d:Lo/cwi$10;

    iget-object v0, v0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->p(Lo/cwi;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 594
    :goto_0
    return-void
.end method
