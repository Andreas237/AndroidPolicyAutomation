.class public Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;
.super Landroid/app/Dialog;

# interfaces
.implements Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;


# static fields
.field private static final DIALOG_WIDTH_RATIO:D = 0.85

.field private static final TAG:Ljava/lang/String; = "HwDialogCustom"


# instance fields
.field private isSearchRequestedModify:Z

.field private isSearchRequestedReturn:Z

.field private isShowOnClick:Z

.field private mContext:Landroid/content/Context;

.field private m_NeutralButton:Landroid/widget/Button;

.field private m_buttonLayout:Landroid/widget/LinearLayout;

.field private m_contentLayout:Landroid/widget/LinearLayout;

.field private m_contentTV:Landroid/widget/TextView;

.field private m_negButton:Landroid/widget/Button;

.field private m_posButton:Landroid/widget/Button;

.field private m_rootLayout:Landroid/widget/LinearLayout;

.field private m_titleTV:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isShowOnClick:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isSearchRequestedModify:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isSearchRequestedReturn:Z

    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->initView()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isShowOnClick:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isSearchRequestedModify:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isSearchRequestedReturn:Z

    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->initView()V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;)Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isShowOnClick:Z

    return v0
.end method

.method private initView()V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->requestWindowFeature(I)Z

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dialog_layout"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getLayoutId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->setContentView(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dialog_liny"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_rootLayout:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_title"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_titleTV:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_content"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_msg"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentTV:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_button_layout"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_buttonLayout:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_ok"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_posButton:Landroid/widget/Button;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_cancel"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_negButton:Landroid/widget/Button;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_neutral"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_NeutralButton:Landroid/widget/Button;

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->resumeMeasureHeight()V

    return-void
.end method

.method private resumeMeasureHeight()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$1;

    invoke-direct {v1, p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$1;-><init>(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 3

    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "HwDialogCustom"

    const-string v1, "cancel failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public dismiss()V
    .locals 3

    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "HwDialogCustom"

    const-string v1, "dismiss failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public getButton(I)Landroid/widget/Button;
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_posButton:Landroid/widget/Button;

    return-object v0

    :cond_0
    const/4 v0, -0x2

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_negButton:Landroid/widget/Button;

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_NeutralButton:Landroid/widget/Button;

    return-object v0
.end method

.method public getContentView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public getListView()Landroid/widget/ListView;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public hide()V
    .locals 3

    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->hide()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "HwDialogCustom"

    const-string v1, "hide failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public onContentChanged()V
    .locals 8

    invoke-super {p0}, Landroid/app/Dialog;->onContentChanged()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->getWindow()Landroid/view/Window;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    invoke-virtual {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/widget/Screen;->getScreenWidth(Landroid/content/Context;)I

    move-result v6

    invoke-virtual {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/widget/Screen;->getScreenHeight(Landroid/content/Context;)I

    move-result v7

    if-le v6, v7, :cond_0

    int-to-double v0, v7

    const-wide v2, 0x3feb333333333333L    # 0.85

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    goto :goto_0

    :cond_0
    int-to-double v0, v6

    const-wide v2, 0x3feb333333333333L    # 0.85

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    :goto_0
    invoke-virtual {v4, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_1
    return-void
.end method

.method public onSearchRequested()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isSearchRequestedModify:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isSearchRequestedReturn:Z

    return v0

    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 0

    return-object p0
.end method

.method public setCancelable(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    return-void
.end method

.method public setCanceledOnTouchOutside(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    return-void
.end method

.method public setCustomContentView(I)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_0
    return-object p0
.end method

.method public setCustomContentView(Landroid/view/View;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_0
    return-object p0
.end method

.method public setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 0

    return-object p0
.end method

.method public setMessage(I)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->setMessage(Ljava/lang/String;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    return-object v0
.end method

.method public setMessage(Ljava/lang/String;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentTV:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentTV:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_contentTV:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    return-object v0
.end method

.method public setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 5

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_rootLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_negButton:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_buttonLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_negButton:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_negButton:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$3;

    invoke-direct {v1, p0, p2}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$3;-><init>(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;Landroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p0
.end method

.method public setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    return-object v0
.end method

.method public setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 5

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_rootLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_NeutralButton:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_buttonLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_NeutralButton:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_NeutralButton:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$4;

    invoke-direct {v1, p0, p2}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$4;-><init>(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;Landroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p0
.end method

.method public setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-void
.end method

.method public setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    return-void
.end method

.method public setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    return-void
.end method

.method public setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    return-object v0
.end method

.method public setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 5

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_rootLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_posButton:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_buttonLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_posButton:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_posButton:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$2;

    invoke-direct {v1, p0, p2}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom$2;-><init>(Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;Landroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p0
.end method

.method public setSearchRequestedReturn(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isSearchRequestedModify:Z

    iput-boolean p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isSearchRequestedReturn:Z

    return-void
.end method

.method public setShowingOnClick(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->isShowOnClick:Z

    return-void
.end method

.method public setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 0

    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_titleTV:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_titleTV:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_titleTV:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setTitle(I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_titleTV:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_titleTV:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->m_titleTV:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public show()V
    .locals 3

    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "HwDialogCustom"

    const-string v1, "showDialog failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method
