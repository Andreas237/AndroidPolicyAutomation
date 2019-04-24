.class Lo/fik$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fik;->e(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lo/ahh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Landroid/widget/LinearLayout;

.field final synthetic c:Lo/ahh;

.field final synthetic d:Lo/fik;

.field final synthetic e:Landroid/widget/LinearLayout;


# direct methods
.method constructor <init>(Lo/fik;Lo/ahh;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 402
    iput-object p1, p0, Lo/fik$3;->d:Lo/fik;

    iput-object p2, p0, Lo/fik$3;->c:Lo/ahh;

    iput-object p3, p0, Lo/fik$3;->b:Landroid/widget/LinearLayout;

    iput-object p4, p0, Lo/fik$3;->a:Landroid/widget/TextView;

    iput-object p5, p0, Lo/fik$3;->e:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 406
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lo/fik$3;->c:Lo/ahh;

    invoke-virtual {v1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    iget-object v0, p0, Lo/fik$3;->d:Lo/fik;

    invoke-static {v0}, Lo/fik;->c(Lo/fik;)V

    .line 408
    return-void

    .line 409
    :cond_0
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iget-object v1, p0, Lo/fik$3;->c:Lo/ahh;

    invoke-virtual {v1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 410
    iget-object v0, p0, Lo/fik$3;->d:Lo/fik;

    invoke-static {v0}, Lo/fik;->c(Lo/fik;)V

    .line 411
    return-void

    .line 414
    :cond_1
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 415
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lo/fik$3;->d:Lo/fik;

    invoke-static {v1}, Lo/fik;->b(Lo/fik;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lo/fik$3;->d:Lo/fik;

    .line 416
    invoke-static {v1}, Lo/fik;->b(Lo/fik;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_bluetooth_open_request:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_bt_right_btn_info:I

    new-instance v2, Lo/fik$3$1;

    invoke-direct {v2, p0}, Lo/fik$3$1;-><init>(Lo/fik$3;)V

    .line 418
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_bt_left_btn_info:I

    new-instance v2, Lo/fik$3$2;

    invoke-direct {v2, p0}, Lo/fik$3$2;-><init>(Lo/fik$3;)V

    .line 435
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v5

    .line 445
    iget-object v0, p0, Lo/fik$3;->d:Lo/fik;

    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fik;->e(Lo/fik;Lo/egy;)Lo/egy;

    .line 446
    iget-object v0, p0, Lo/fik$3;->d:Lo/fik;

    invoke-static {v0}, Lo/fik;->e(Lo/fik;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 447
    iget-object v0, p0, Lo/fik$3;->d:Lo/fik;

    invoke-static {v0}, Lo/fik;->e(Lo/fik;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 448
    goto :goto_0

    .line 449
    :cond_2
    iget-object v0, p0, Lo/fik$3;->d:Lo/fik;

    iget-object v1, p0, Lo/fik$3;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fik$3;->c:Lo/ahh;

    iget-object v3, p0, Lo/fik$3;->a:Landroid/widget/TextView;

    iget-object v4, p0, Lo/fik$3;->e:Landroid/widget/LinearLayout;

    invoke-static {v0, v1, v2, v3, v4}, Lo/fik;->d(Lo/fik;Landroid/widget/LinearLayout;Lo/ahh;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V

    .line 451
    iget-object v0, p0, Lo/fik$3;->d:Lo/fik;

    iget-object v0, v0, Lo/fik;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    iget-object v1, p0, Lo/fik$3;->d:Lo/fik;

    iget-object v1, v1, Lo/fik;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d:Lo/acl$a;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lo/acl$a;)V

    .line 452
    iget-object v0, p0, Lo/fik$3;->d:Lo/fik;

    invoke-virtual {v0}, Lo/fik;->notifyDataSetChanged()V

    .line 455
    :goto_0
    return-void
.end method
