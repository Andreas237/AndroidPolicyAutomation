.class Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Landroid/view/View$OnClickListener;

.field final synthetic b:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/view/View;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Lo/egd;

.field private k:Landroid/widget/TextView;

.field private m:Lo/egd;

.field private n:Landroid/view/View;

.field private o:Landroid/os/Message;

.field private p:Landroid/os/Message;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;Landroid/content/Context;)V
    .locals 1

    .line 478
    iput-object p1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->b:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 691
    new-instance v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a$4;-><init>(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->a:Landroid/view/View$OnClickListener;

    .line 479
    invoke-direct {p0, p2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d(Landroid/content/Context;)V

    .line 480
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;)Landroid/os/Message;
    .locals 1

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->o:Landroid/os/Message;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;)Landroid/os/Message;
    .locals 1

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->p:Landroid/os/Message;

    return-object v0
.end method

.method private d(Landroid/content/Context;)V
    .locals 3

    .line 488
    const-string v0, "layout_inflater"

    .line 489
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/LayoutInflater;

    .line 490
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_custom_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d:Landroid/view/View;

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_rlyt_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->c:Landroid/widget/LinearLayout;

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_llyt_btn_panel:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->h:Landroid/widget/RelativeLayout;

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_rlyt_content:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->g:Landroid/widget/RelativeLayout;

    .line 495
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_llyt_message:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->e:Landroid/widget/LinearLayout;

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_tv_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->f:Landroid/widget/TextView;

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_tv_message:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->k:Landroid/widget/TextView;

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_btn_positive:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->i:Lo/egd;

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_btn_negative:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->m:Lo/egd;

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dailog_btn_line:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->n:Landroid/view/View;

    .line 504
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 4

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 570
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 571
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->g:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 574
    return-void
.end method

.method public b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 2

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->i:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 594
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->b(Z)Z

    .line 595
    invoke-static {}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 596
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 598
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 601
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->i:Lo/egd;

    invoke-virtual {v0, p1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 602
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 603
    invoke-static {}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->a()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->p:Landroid/os/Message;

    .line 606
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->i:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->a:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 608
    :cond_1
    return-void
.end method

.method public c()Landroid/view/View;
    .locals 1

    .line 582
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d:Landroid/view/View;

    return-object v0
.end method

.method public c(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 2

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 646
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->m:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 647
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->d(Z)Z

    .line 648
    invoke-static {}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 649
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 651
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 654
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->m:Lo/egd;

    invoke-virtual {v0, p1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 655
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 656
    invoke-static {}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->a()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, -0x2

    invoke-virtual {v0, v1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->o:Landroid/os/Message;

    .line 659
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->m:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->a:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 661
    :cond_1
    return-void
.end method

.method public e(I)V
    .locals 3

    .line 540
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 541
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 542
    iput p1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 544
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 513
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 514
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 516
    return-void
.end method
