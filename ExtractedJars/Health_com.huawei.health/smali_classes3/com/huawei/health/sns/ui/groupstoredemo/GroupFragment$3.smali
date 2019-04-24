.class Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 0

    .line 1088
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$3;->c:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1092
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1093
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$3;->c:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1094
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$3;->c:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1095
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$3;->c:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->startActivity(Landroid/content/Intent;)V

    .line 1096
    return-void
.end method
