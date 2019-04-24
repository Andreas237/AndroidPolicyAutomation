.class Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

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

    .line 217
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eov$d;

    .line 219
    if-nez v4, :cond_0

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "holder == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    return-void

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ContactDeleteListAdapter ViewHolder = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    iget-object v0, v4, Lo/eov$d;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->toggle()V

    .line 230
    invoke-static {}, Lo/eov;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v4, Lo/eov$d;->b:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)Ljava/lang/String;

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

    iget-object v3, v4, Lo/eov$d;->b:Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ContactDeleteListAdapter map = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/eov;->a()Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    iget-object v0, v4, Lo/eov$d;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)I

    goto :goto_0

    .line 239
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->g(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)I

    .line 242
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mcheckNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->h(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->h(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->c(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;I)V

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->h(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->i(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V

    goto :goto_1

    .line 251
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;->b:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->f(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V

    .line 253
    :goto_1
    return-void
.end method
