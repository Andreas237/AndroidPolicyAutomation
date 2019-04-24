.class Lo/fbv$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbv;->d(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fbv;


# direct methods
.method constructor <init>(Lo/fbv;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/fbv$4;->e:Lo/fbv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 110
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "select MultiUsers position = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 111
    iget-object v0, p0, Lo/fbv$4;->e:Lo/fbv;

    invoke-static {v0}, Lo/fbv;->b(Lo/fbv;)Lo/ewj;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewj;->notifyDataSetChanged()V

    .line 112
    iget-object v0, p0, Lo/fbv$4;->e:Lo/fbv;

    invoke-static {v0}, Lo/fbv;->b(Lo/fbv;)Lo/ewj;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/ewj;->e(I)Lo/afa;

    move-result-object v4

    .line 113
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 114
    invoke-virtual {v4}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 115
    iget-object v0, p0, Lo/fbv$4;->e:Lo/fbv;

    invoke-static {v0}, Lo/fbv;->d(Lo/fbv;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lo/fbv$4$5;

    invoke-direct {v1, p0}, Lo/fbv$4$5;-><init>(Lo/fbv$4;)V

    invoke-static {v0, v1}, Lo/fbw;->d(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {v4}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 124
    invoke-virtual {v4}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/afj;

    .line 125
    iget-object v0, p0, Lo/fbv$4;->e:Lo/fbv;

    invoke-virtual {v5}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fbv;->b(Lo/fbv;Ljava/lang/String;)V

    .line 129
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/fbv$4;->e:Lo/fbv;

    invoke-static {v0}, Lo/fbv;->c(Lo/fbv;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 130
    iget-object v0, p0, Lo/fbv$4;->e:Lo/fbv;

    invoke-static {v0}, Lo/fbv;->c(Lo/fbv;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 132
    :cond_2
    return-void
.end method
