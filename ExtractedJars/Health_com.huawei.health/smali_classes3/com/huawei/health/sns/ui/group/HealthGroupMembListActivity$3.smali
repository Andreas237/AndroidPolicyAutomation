.class Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;->c:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 242
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "listType == 1 setRightButtonOnClickListener click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;->c:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Lo/bhk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bhk;->e()Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 244
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 246
    new-instance v6, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;->c:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v6, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;->c:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_remove_checked_members_or_not:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;->c:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    .line 248
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_common_remove_text:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3$1;

    invoke-direct {v2, p0, v4}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;->c:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    .line 254
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal_ios_btn:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3$5;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 260
    invoke-virtual {v6}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 261
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/egy;->setCancelable(Z)V

    .line 262
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 265
    :cond_0
    return-void
.end method
