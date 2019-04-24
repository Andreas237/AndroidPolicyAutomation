.class Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)V
    .locals 0

    .line 324
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$5;->c:Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 328
    move v2, p3

    .line 330
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$5;->c:Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)Lo/bdh;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/bdh;->a(I)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v3

    .line 331
    if-nez v3, :cond_0

    .line 333
    return-void

    .line 336
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$5;->c:Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 337
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 339
    const-string v0, "userName"

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 341
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 343
    const-string v0, "userName"

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 346
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$5;->c:Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->setResult(ILandroid/content/Intent;)V

    .line 347
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$5;->c:Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->finish()V

    .line 348
    return-void
.end method
