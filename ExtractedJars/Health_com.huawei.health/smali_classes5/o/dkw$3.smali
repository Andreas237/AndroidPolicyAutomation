.class Lo/dkw$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/yg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dkw;->b(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dkw;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/dkw;I)V
    .locals 0

    .line 633
    iput-object p1, p0, Lo/dkw$3;->c:Lo/dkw;

    iput p2, p0, Lo/dkw$3;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 636
    iget-object v0, p0, Lo/dkw$3;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->e(Lo/dkw;)Ljava/util/Map;

    move-result-object v0

    iget v1, p0, Lo/dkw$3;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v2, p2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    iget-object v0, p0, Lo/dkw$3;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->b(Lo/dkw;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 638
    iget-object v0, p0, Lo/dkw$3;->c:Lo/dkw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkw;->d(Lo/dkw;I)I

    .line 639
    iget-object v0, p0, Lo/dkw$3;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 640
    iget-object v0, p0, Lo/dkw$3;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 641
    const/16 v0, 0xa

    iput v0, v3, Landroid/os/Message;->what:I

    .line 642
    iget v0, p0, Lo/dkw$3;->e:I

    iput v0, v3, Landroid/os/Message;->arg1:I

    .line 643
    iget-object v0, p0, Lo/dkw$3;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 645
    :cond_0
    return-void
.end method
