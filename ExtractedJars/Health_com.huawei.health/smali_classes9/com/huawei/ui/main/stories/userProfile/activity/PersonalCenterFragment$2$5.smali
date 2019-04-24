.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2;->c(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2;

.field final synthetic d:I

.field final synthetic e:Lo/afj;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2;Lo/afj;I)V
    .locals 0

    .line 1791
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2$5;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2$5;->e:Lo/afj;

    iput p3, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2$5;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1794
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2$5;->e:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1795
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2$5;->e:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->h(Ljava/lang/String;)V

    .line 1796
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2$5;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2;->c:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->p(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2$5;->d:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1797
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2$5;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2;->c:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    invoke-virtual {v0}, Lo/fik;->notifyDataSetChanged()V

    .line 1799
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1800
    const-string v0, "com.huawei.bone.action.DEVICE_THIRD_DELETE"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1801
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2$5;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$2;->c:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1803
    :cond_0
    return-void
.end method
