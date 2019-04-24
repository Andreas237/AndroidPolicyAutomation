.class Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->onCallBackSuccess(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;)V
    .locals 0

    .line 325
    iput-object p1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1$2;->e:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 328
    const-string v0, "Group_HealthTwoDimCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IBaseResponseCallback->err_code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    if-nez p1, :cond_0

    .line 330
    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 331
    const-string v0, "Group_HealthTwoDimCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "share callback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1$2;->e:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;I)I

    .line 333
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1$2;->e:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1$2;->e:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1$2;->e:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;

    iget-object v1, v1, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->h(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;I)I

    .line 335
    const-string v0, "Group_HealthTwoDimCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sharePopupActivity getShareType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1$2;->e:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;

    iget-object v3, v3, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1$2;->e:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 340
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1$2;->e:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x199

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 342
    :cond_1
    return-void
.end method
