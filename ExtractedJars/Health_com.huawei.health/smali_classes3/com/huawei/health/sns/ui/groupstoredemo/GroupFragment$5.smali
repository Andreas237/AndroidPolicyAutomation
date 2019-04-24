.class Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$5;
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
.field final synthetic b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 0

    .line 1073
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$5;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1077
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$5;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$5;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_edit_group_name:I

    invoke-virtual {v1, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$5;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->e(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1079
    return-void
.end method
