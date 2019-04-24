.class Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V
    .locals 0

    .line 383
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$9;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 399
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 5

    .line 386
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onSuccess,data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    if-eqz p2, :cond_0

    .line 388
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 389
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 390
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$9;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiUserInfo;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;

    .line 392
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "birthday=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$9;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->h(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiUserInfo;

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

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$9;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->h(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    :cond_0
    return-void
.end method
