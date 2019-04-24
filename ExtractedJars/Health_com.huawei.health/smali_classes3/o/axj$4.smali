.class final Lo/axj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axj;->c(Landroid/app/Activity;IZLandroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/os/Handler;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:I

.field final synthetic e:Z


# direct methods
.method constructor <init>(ILandroid/os/Handler;ZLandroid/app/Activity;)V
    .locals 0

    .line 260
    iput p1, p0, Lo/axj$4;->d:I

    iput-object p2, p0, Lo/axj$4;->b:Landroid/os/Handler;

    iput-boolean p3, p0, Lo/axj$4;->e:Z

    iput-object p4, p0, Lo/axj$4;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 264
    new-instance v3, Lo/awt;

    iget v0, p0, Lo/axj$4;->d:I

    invoke-direct {v3, v0}, Lo/awt;-><init>(I)V

    .line 266
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/axj$4;->b:Landroid/os/Handler;

    iget-boolean v2, p0, Lo/axj$4;->e:Z

    invoke-static {v3, v1, v2}, Lo/axj;->e(Lo/awt;Landroid/os/Handler;Z)Lo/brc;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 267
    return-void
.end method

.method public e(II)V
    .locals 3

    .line 272
    iget-object v0, p0, Lo/axj$4;->c:Landroid/app/Activity;

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 273
    iget-object v0, p0, Lo/axj$4;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Lo/axj$4;->b:Landroid/os/Handler;

    const/16 v1, 0x254

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 277
    :cond_0
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isRequestUserNotifySucc"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 278
    return-void
.end method
