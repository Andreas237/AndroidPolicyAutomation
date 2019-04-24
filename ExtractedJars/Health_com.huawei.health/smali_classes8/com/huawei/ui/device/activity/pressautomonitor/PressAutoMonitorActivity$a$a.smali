.class Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/Switch;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/TextView;

.field e:Landroid/widget/TextView;

.field final synthetic i:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;Landroid/view/View;)V
    .locals 1

    .line 374
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;->i:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;

    .line 375
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 376
    sget v0, Lcom/huawei/ui/device/R$id;->press_switch_button:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;->b:Landroid/widget/Switch;

    .line 377
    sget v0, Lcom/huawei/ui/device/R$id;->textview_relax_number:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;->d:Landroid/widget/TextView;

    .line 378
    sget v0, Lcom/huawei/ui/device/R$id;->textview_normal_number:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;->c:Landroid/widget/TextView;

    .line 379
    sget v0, Lcom/huawei/ui/device/R$id;->textview_middle_number:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;->e:Landroid/widget/TextView;

    .line 380
    sget v0, Lcom/huawei/ui/device/R$id;->textview_hight_number:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a$a;->a:Landroid/widget/TextView;

    .line 381
    return-void
.end method
