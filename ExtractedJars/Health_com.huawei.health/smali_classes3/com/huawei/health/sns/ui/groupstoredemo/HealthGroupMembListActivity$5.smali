.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 133
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "listType == 1 setRightButtonOnClickListener click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Lo/bil;

    move-result-object v0

    invoke-virtual {v0}, Lo/bil;->e()Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 135
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 137
    new-instance v6, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v6, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 138
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_remove_checked_members_or_not:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    .line 139
    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_common_remove_text:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5$1;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    .line 144
    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal_ios_btn:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5$4;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 150
    invoke-virtual {v6}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 151
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/egy;->setCancelable(Z)V

    .line 152
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 155
    :cond_0
    return-void
.end method
