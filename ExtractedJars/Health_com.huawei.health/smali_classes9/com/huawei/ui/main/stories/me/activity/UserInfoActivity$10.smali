.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:F

.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;F)V
    .locals 0

    .line 1033
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$10;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iput p2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$10;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 1036
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$10;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$10;->c:F

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setWeight(F)V

    .line 1037
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$10;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$10;->c:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 1038
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weightv=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$10;->c:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1039
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$10;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->u(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 1040
    return-void
.end method
