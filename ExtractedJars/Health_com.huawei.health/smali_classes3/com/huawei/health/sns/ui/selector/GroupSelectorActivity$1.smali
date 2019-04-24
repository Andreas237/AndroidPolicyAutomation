.class Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)V
    .locals 0

    .line 577
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$1;->e:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 581
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$1;->e:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->a(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)Lo/bjg;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/bjg;->e(I)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 582
    if-eqz v3, :cond_1

    .line 584
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$1;->e:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)I

    move-result v0

    if-nez v0, :cond_0

    .line 593
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$1;->e:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-static {v0, v3}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->e(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 596
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$1;->e:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 604
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$1;->e:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->e(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;J)V

    .line 608
    :cond_1
    :goto_0
    return-void
.end method
