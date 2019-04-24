.class Lo/awj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awj;->a(ILandroid/os/Handler;)Lo/brd;
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
.field final synthetic a:I

.field final synthetic b:Lo/awj;

.field final synthetic c:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lo/awj;Landroid/os/Handler;I)V
    .locals 0

    .line 253
    iput-object p1, p0, Lo/awj$4;->b:Lo/awj;

    iput-object p2, p0, Lo/awj$4;->c:Landroid/os/Handler;

    iput p3, p0, Lo/awj$4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 253
    invoke-virtual {p0, p1}, Lo/awj$4;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 257
    iget-object v0, p0, Lo/awj$4;->b:Lo/awj;

    invoke-virtual {v0}, Lo/awj;->a()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v1

    .line 258
    iget-object v0, p0, Lo/awj$4;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lo/awj$4;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 261
    iget v0, p0, Lo/awj$4;->a:I

    iput v0, v2, Landroid/os/Message;->what:I

    .line 262
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 263
    const-string v0, "bundleKeyUserInfo"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 264
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 265
    iget-object v0, p0, Lo/awj$4;->c:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 267
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
