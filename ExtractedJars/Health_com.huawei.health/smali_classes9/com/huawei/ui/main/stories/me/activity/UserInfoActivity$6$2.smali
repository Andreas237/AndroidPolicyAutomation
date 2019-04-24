.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;)V
    .locals 0

    .line 953
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 2

    .line 976
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a()V

    .line 977
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 978
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x69

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 980
    :cond_0
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 4

    .line 956
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 957
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "birthday=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "gender=="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 959
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    new-instance v3, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2$5;

    invoke-direct {v3, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/dnm;->c(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    .line 971
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->y(Landroid/content/Context;)V

    .line 972
    return-void
.end method
