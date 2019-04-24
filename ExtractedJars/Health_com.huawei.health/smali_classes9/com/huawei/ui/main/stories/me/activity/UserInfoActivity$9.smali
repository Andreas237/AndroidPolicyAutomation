.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V
    .locals 0

    .line 1010
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;->d:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 0

    .line 1027
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 4

    .line 1015
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;->d:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;->d:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;->d:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    new-instance v3, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9$1;

    invoke-direct {v3, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/dnm;->c(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    .line 1021
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;->d:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->y(Landroid/content/Context;)V

    .line 1022
    return-void
.end method
