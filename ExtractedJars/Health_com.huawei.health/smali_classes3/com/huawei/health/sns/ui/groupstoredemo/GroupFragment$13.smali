.class Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$13;
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Ljava/lang/String;)V
    .locals 0

    .line 1570
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$13;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$13;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/widget/EditText;)V
    .locals 0

    .line 1589
    return-void
.end method

.method public d(Landroid/widget/EditText;)V
    .locals 7

    .line 1574
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    .line 1576
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$13;->a:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1578
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$13;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->i(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Landroid/app/AlertDialog;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 1579
    return-void

    .line 1582
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$13;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$13;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v3

    invoke-virtual {v3}, Lo/aoq;->a()J

    move-result-wide v3

    move-object v5, v6

    invoke-static/range {v0 .. v5}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;JJLjava/lang/String;)V

    .line 1583
    return-void
.end method
