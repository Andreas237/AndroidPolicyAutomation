.class Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Ljava/lang/String;)V
    .locals 0

    .line 1596
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$4;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/widget/EditText;)V
    .locals 0

    .line 1619
    return-void
.end method

.method public d(Landroid/widget/EditText;)V
    .locals 4

    .line 1600
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 1602
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1604
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_not_null:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1605
    return-void

    .line 1608
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$4;->b:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1610
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->i(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Landroid/app/AlertDialog;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 1611
    return-void

    .line 1613
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->e(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;JLjava/lang/String;)V

    .line 1614
    return-void
.end method
