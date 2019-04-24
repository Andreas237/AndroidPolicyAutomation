.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/CloudRequestHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V
    .locals 0

    .line 1061
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 4

    .line 1101
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1102
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "errorStatus =="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1103
    return-void
.end method

.method public onFinish(Landroid/os/Bundle;)V
    .locals 7

    .line 1064
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 1065
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1066
    const-string v0, "userInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 1067
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1068
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter set by b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1069
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 1070
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->i(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/os/Handler;

    move-result-object v5

    .line 1071
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 1072
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 1073
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1075
    :cond_0
    goto :goto_0

    .line 1076
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 1078
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    const-string v0, "0"

    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "1"

    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1079
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter set by g"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1080
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 1081
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->i(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/os/Handler;

    move-result-object v5

    .line 1082
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 1083
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 1084
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1086
    :cond_2
    goto :goto_1

    .line 1087
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 1089
    :goto_1
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDefaultDataFromAccount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->g(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " isDefaultDataFromDataplat = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->h(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1090
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->g(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->h(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1092
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->f(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1093
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 1094
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$28;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 1097
    :cond_4
    return-void
.end method
