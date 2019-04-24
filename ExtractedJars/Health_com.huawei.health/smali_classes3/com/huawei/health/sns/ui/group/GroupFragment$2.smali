.class Lcom/huawei/health/sns/ui/group/GroupFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/GroupFragment;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/GroupFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 0

    .line 1080
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$2;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1084
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1085
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$2;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1086
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$2;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(Lcom/huawei/health/sns/ui/group/GroupFragment;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1087
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$2;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/group/GroupFragment;->startActivity(Landroid/content/Intent;)V

    .line 1088
    return-void
.end method
