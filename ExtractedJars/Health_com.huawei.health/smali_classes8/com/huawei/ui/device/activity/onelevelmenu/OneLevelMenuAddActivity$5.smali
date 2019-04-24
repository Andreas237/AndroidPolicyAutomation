.class Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity$5;->c:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;

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

    .line 113
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eor$d;

    .line 114
    if-nez v4, :cond_0

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity$5;->c:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->b(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "holder == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return-void

    .line 118
    :cond_0
    iget-object v0, v4, Lo/eor$d;->c:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->toggle()V

    .line 120
    invoke-static {}, Lo/eor;->e()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v4, Lo/eor$d;->c:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity$5;->c:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->b(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "arg2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "checkBox.isChecked() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lo/eor$d;->c:Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity$5;->c:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->b(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ContactDeleteListAdapter map = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/eor;->e()Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    return-void
.end method
