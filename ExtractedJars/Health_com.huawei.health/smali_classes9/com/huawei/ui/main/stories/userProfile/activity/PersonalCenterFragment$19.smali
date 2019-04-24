.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->R()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V
    .locals 0

    .line 4117
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$19;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 9

    .line 4120
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAliAuth getThirdAuthorization isSuccess = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4121
    if-eqz p3, :cond_1

    .line 4122
    const-class v0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;

    invoke-static {p2, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;

    .line 4123
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;->getThirdAuthTokenList()Ljava/util/List;

    move-result-object v5

    .line 4124
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 4126
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;

    .line 4127
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->getThirdAccountType()I

    move-result v0

    const/16 v1, 0x18

    if-ne v1, v0, :cond_0

    .line 4128
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAliAuth in PersonalCenterFragment bound"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4129
    new-instance v8, Lo/dcy;

    invoke-direct {v8}, Lo/dcy;-><init>()V

    .line 4130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$19;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "alisport_red_dot_show"

    const-string v3, "true"

    invoke-static {v0, v1, v2, v3, v8}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 4133
    :cond_0
    goto :goto_0

    .line 4136
    :cond_1
    return-void
.end method
