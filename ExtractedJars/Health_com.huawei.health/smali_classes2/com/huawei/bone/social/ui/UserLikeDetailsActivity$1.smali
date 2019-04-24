.class Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eeh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$1;->e:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/edv;)V
    .locals 5

    .line 304
    instance-of v0, p1, Lo/wn;

    if-eqz v0, :cond_1

    .line 305
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "baseResp "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$1;->e:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->i(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)I

    .line 307
    move-object v0, p1

    check-cast v0, Lo/wn;

    iget v0, v0, Lo/wn;->errorCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 308
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter errorCode = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 311
    const/16 v0, 0x3e8

    iput v0, v4, Landroid/os/Message;->what:I

    .line 312
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$1;->e:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->d(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 313
    return-void

    .line 316
    :cond_0
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter errorCode 1= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 318
    const/16 v0, 0x3e8

    iput v0, v4, Landroid/os/Message;->what:I

    .line 319
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$1;->e:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->d(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 320
    goto :goto_0

    .line 323
    :cond_1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 324
    const/16 v0, 0x3e8

    iput v0, v4, Landroid/os/Message;->what:I

    .line 325
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$1;->e:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->d(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 327
    :goto_0
    return-void
.end method
