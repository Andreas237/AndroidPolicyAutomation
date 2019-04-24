.class Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V
    .locals 0

    .line 227
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 230
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter onResponse():err_code="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "objData="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    if-nez p1, :cond_1

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    move-object v1, p2

    check-cast v1, Lcom/huawei/up/model/UserInfomation;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->d(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->g(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->d(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter onResponse():mUserInfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->g(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "    headImgPath="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->i(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->i(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->i(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 238
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter onResponse():userPhoto="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->k(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$5;->a:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 242
    :cond_1
    return-void
.end method
