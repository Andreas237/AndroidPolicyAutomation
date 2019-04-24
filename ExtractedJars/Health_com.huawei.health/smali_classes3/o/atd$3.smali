.class Lo/atd$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atd;->c(II)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/atd;

.field final synthetic b:I

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/atd;II)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/atd$3;->a:Lo/atd;

    iput p2, p0, Lo/atd$3;->b:I

    iput p3, p0, Lo/atd$3;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 60
    invoke-virtual {p0, p1}, Lo/atd$3;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 64
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 69
    :cond_0
    iget-object v0, p0, Lo/atd$3;->a:Lo/atd;

    iget v1, p0, Lo/atd$3;->b:I

    invoke-static {v0, v1}, Lo/atd;->e(Lo/atd;I)Lcom/huawei/health/sns/model/group/GroupListData;

    move-result-object v2

    .line 71
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 76
    :cond_1
    iget-object v0, p0, Lo/atd$3;->a:Lo/atd;

    invoke-static {v0}, Lo/atd;->c(Lo/atd;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 78
    iget-object v0, p0, Lo/atd$3;->a:Lo/atd;

    invoke-static {v0}, Lo/atd;->c(Lo/atd;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 79
    iget v0, p0, Lo/atd$3;->e:I

    iput v0, v3, Landroid/os/Message;->what:I

    .line 80
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 81
    const-string v0, "bundleKeyGroupListData"

    invoke-virtual {v4, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 82
    invoke-virtual {v3, v4}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 83
    iget-object v0, p0, Lo/atd$3;->a:Lo/atd;

    invoke-static {v0}, Lo/atd;->c(Lo/atd;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 85
    :cond_2
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
