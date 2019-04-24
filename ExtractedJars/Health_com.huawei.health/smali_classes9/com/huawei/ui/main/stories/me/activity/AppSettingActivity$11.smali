.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 917
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 920
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "positive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/cfz;

    move-result-object v0

    invoke-virtual {v0}, Lo/cfz;->getmButton()Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 922
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/ffx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->o(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/cmj;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/cfz;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_hw_show_me_sync_begin:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/ffx;->b(Lo/cmj;Lo/cfz;Ljava/lang/String;)V

    .line 923
    return-void
.end method
