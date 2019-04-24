.class Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V
    .locals 0

    .line 386
    iput-object p1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;->c:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(I)V
    .locals 4

    .line 406
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getinformationUrl doPostReq onFailed ==> resCode == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;->c:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->o(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x7d1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 409
    return-void
.end method

.method public onSucceed(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 389
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 390
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;->c:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->c(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;->c:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->p(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 393
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 394
    const/16 v0, 0x42

    iput v0, v4, Landroid/os/Message;->what:I

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;->c:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->f(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;->c:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->o(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;->c:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;Z)Z

    .line 399
    :cond_0
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;->c:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SOCIAL_MORE_INFO_URL"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;->c:Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->f(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 402
    :cond_1
    return-void
.end method
