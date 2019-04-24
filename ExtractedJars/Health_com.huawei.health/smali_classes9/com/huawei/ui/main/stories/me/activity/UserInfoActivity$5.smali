.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V
    .locals 0

    .line 249
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 276
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 280
    :cond_0
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Handler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a()V

    .line 283
    :goto_0
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 5

    .line 252
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onSuccess,data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    if-eqz p2, :cond_1

    .line 254
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 255
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 256
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiUserInfo;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;

    .line 258
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "height=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "weight=="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "birthday=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

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

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "gender"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "birthday"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "height"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 267
    :cond_0
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Handler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a()V

    .line 272
    :cond_1
    :goto_0
    return-void
.end method
