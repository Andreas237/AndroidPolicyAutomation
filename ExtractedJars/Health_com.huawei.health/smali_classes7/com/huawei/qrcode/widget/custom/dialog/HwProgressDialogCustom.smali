.class public Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;
.super Landroid/app/Dialog;

# interfaces
.implements Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;


# static fields
.field private static final DIALOG_WIDTH_RATIO:D = 0.85

.field private static final TAG:Ljava/lang/String; = "HwProgressDialog"


# instance fields
.field private isSearchRequestedModify:Z

.field private isSearchRequestedReturn:Z

.field private isShowOnClick:Z

.field private mContext:Landroid/content/Context;

.field private mHasStarted:Z

.field private mIncrementBy:I

.field private mIncrementSecondaryBy:I

.field private mIndeterminate:Z

.field private mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

.field private mInflatter:Landroid/view/LayoutInflater;

.field private mMax:I

.field private mMessage:Ljava/lang/CharSequence;

.field private mMessageView:Landroid/widget/TextView;

.field private mProgress:Landroid/widget/ProgressBar;

.field private mProgressDrawable:Landroid/graphics/drawable/Drawable;

.field private mProgressNumber:Landroid/widget/TextView;

.field private mProgressNumberFormat:Ljava/lang/String;

.field private mProgressPercent:Landroid/widget/TextView;

.field private mProgressPercentFormat:Ljava/text/NumberFormat;

.field private mProgressStyle:I

.field private mProgressVal:I

.field private mSecondaryProgressVal:I

.field private mViewUpdateHandler:Landroid/os/Handler;

.field private m_buttonLayout:Landroid/widget/LinearLayout;

.field private m_contentLayout:Landroid/widget/LinearLayout;

.field private m_contentTV:Landroid/widget/TextView;

.field private m_negButton:Landroid/widget/Button;

.field private m_posButton:Landroid/widget/Button;

.field private m_rootLayout:Landroid/widget/LinearLayout;

.field private m_titleTV:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isSearchRequestedModify:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isSearchRequestedReturn:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressStyle:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isShowOnClick:Z

    const-string v0, "HwProgressDialog"

    const-string v1, "HwProgressDialog "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mContext:Landroid/content/Context;

    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mInflatter:Landroid/view/LayoutInflater;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->requestWindowFeature(I)Z

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->initView()V

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->initFormats()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isSearchRequestedModify:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isSearchRequestedReturn:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressStyle:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isShowOnClick:Z

    const-string v0, "HwProgressDialog"

    const-string v1, "HwProgressDialog "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mContext:Landroid/content/Context;

    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mInflatter:Landroid/view/LayoutInflater;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->requestWindowFeature(I)Z

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->initView()V

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->initFormats()V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressNumberFormat:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressNumber:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Ljava/text/NumberFormat;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressPercentFormat:Ljava/text/NumberFormat;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressPercent:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isShowOnClick:Z

    return v0
.end method

.method private initContent()V
    .locals 4

    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressStyle:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$1;-><init>(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;)V

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mViewUpdateHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mInflatter:Landroid/view/LayoutInflater;

    const v1, 0x7f030003

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    const v0, 0x7f08001b

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    const v0, 0x7f08001d

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressNumber:Landroid/widget/TextView;

    const v0, 0x7f08001c

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressPercent:Landroid/widget/TextView;

    invoke-virtual {p0, v3}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mInflatter:Landroid/view/LayoutInflater;

    const v1, 0x7f030005

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    const v0, 0x7f08001b

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    const v0, 0x7f080029

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mMessageView:Landroid/widget/TextView;

    invoke-virtual {p0, v3}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setView(Landroid/view/View;)V

    :goto_0
    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mMax:I

    if-lez v0, :cond_1

    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mMax:I

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setMax(I)V

    :cond_1
    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressVal:I

    if-lez v0, :cond_2

    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressVal:I

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setProgress(I)V

    :cond_2
    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mSecondaryProgressVal:I

    if-lez v0, :cond_3

    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mSecondaryProgressVal:I

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setSecondaryProgress(I)V

    :cond_3
    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIncrementBy:I

    if-lez v0, :cond_4

    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIncrementBy:I

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->incrementProgressBy(I)V

    :cond_4
    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIncrementSecondaryBy:I

    if-lez v0, :cond_5

    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIncrementSecondaryBy:I

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->incrementSecondaryProgressBy(I)V

    :cond_5
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_6
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mMessage:Ljava/lang/CharSequence;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mMessage:Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setMessage(Ljava/lang/CharSequence;)V

    :cond_8
    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIndeterminate:Z

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setIndeterminate(Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->onProgressChanged()V

    return-void
.end method

.method private initFormats()V
    .locals 2

    const-string v0, "%1d/%2d"

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressNumberFormat:Ljava/lang/String;

    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressPercentFormat:Ljava/text/NumberFormat;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressPercentFormat:Ljava/text/NumberFormat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    return-void
.end method

.method private initView()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dialog_layout"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getLayoutId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setContentView(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dialog_liny"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_rootLayout:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_title"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_titleTV:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_content"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_msg"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_contentTV:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_button_layout"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_buttonLayout:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_ok"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_posButton:Landroid/widget/Button;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mContext:Landroid/content/Context;

    const-string v1, "scanqrcode_sdk_custom_dia_cancel"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_negButton:Landroid/widget/Button;

    return-void
.end method

.method private onProgressChanged()V
    .locals 2

    const-string v0, "HwProgressDialog"

    const-string v1, " onProgressChanged."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressStyle:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mViewUpdateHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mViewUpdateHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mViewUpdateHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method

.method private setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 2

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_negButton:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_negButton:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_negButton:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$3;

    invoke-direct {v1, p0, p2}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$3;-><init>(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;Landroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 2

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_posButton:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_buttonLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_posButton:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_posButton:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$2;

    invoke-direct {v1, p0, p2}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom$2;-><init>(Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;Landroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

    const-string v0, "HwProgressDialog"

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

    const-string v0, "HwProgressDialog"

    const-string v1, "dismiss failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public getButton(I)Landroid/widget/Button;
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_posButton:Landroid/widget/Button;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_negButton:Landroid/widget/Button;

    return-object v0
.end method

.method public getMax()I
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mMax:I

    return v0
.end method

.method public getProgress()I
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressVal:I

    return v0
.end method

.method public getSecondaryProgress()I
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getSecondaryProgress()I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mSecondaryProgressVal:I

    return v0
.end method

.method public getWindow()Landroid/view/Window;
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method public incrementProgressBy(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->incrementProgressBy(I)V

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->onProgressChanged()V

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIncrementBy:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIncrementBy:I

    :goto_0
    return-void
.end method

.method public incrementSecondaryProgressBy(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->incrementSecondaryProgressBy(I)V

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->onProgressChanged()V

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIncrementSecondaryBy:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIncrementSecondaryBy:I

    :goto_0
    return-void
.end method

.method public isIndeterminate()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    move-result v0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIndeterminate:Z

    return v0
.end method

.method public onContentChanged()V
    .locals 8

    invoke-super {p0}, Landroid/app/Dialog;->onContentChanged()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->getWindow()Landroid/view/Window;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    invoke-virtual {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/widget/Screen;->getScreenWidth(Landroid/content/Context;)I

    move-result v6

    invoke-virtual {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->getContext()Landroid/content/Context;

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

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "HwProgressDialog"

    const-string v1, "onCreate "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->initContent()V

    return-void
.end method

.method public onSearchRequested()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isSearchRequestedModify:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isSearchRequestedReturn:Z

    return v0

    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mHasStarted:Z

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mHasStarted:Z

    return-void
.end method

.method public setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    invoke-direct {p0, p2, p3}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public setIndeterminate(Z)V
    .locals 2

    const-string v0, "HwProgressDialog"

    const-string v1, "setIndeterminate "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIndeterminate:Z

    :goto_0
    return-void
.end method

.method public setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    :goto_0
    return-void
.end method

.method public setMax(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->onProgressChanged()V

    goto :goto_0

    :cond_0
    iput p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mMax:I

    :goto_0
    return-void
.end method

.method public setMessage(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressStyle:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_contentTV:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_contentTV:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mMessageView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mMessageView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mMessage:Ljava/lang/CharSequence;

    :goto_0
    return-void
.end method

.method public setProgress(I)V
    .locals 2

    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mHasStarted:Z

    if-eqz v0, :cond_0

    const-string v0, "HwProgressDialog"

    const-string v1, "setProgress "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->onProgressChanged()V

    goto :goto_0

    :cond_0
    iput p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressVal:I

    :goto_0
    return-void
.end method

.method public setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    :goto_0
    return-void
.end method

.method public setProgressNumberFormat(Ljava/lang/String;)V
    .locals 2

    const-string v0, "HwProgressDialog"

    const-string v1, "setProgressNumberFormat "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressNumberFormat:Ljava/lang/String;

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->onProgressChanged()V

    return-void
.end method

.method public setProgressPercentFormat(Ljava/text/NumberFormat;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressPercentFormat:Ljava/text/NumberFormat;

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->onProgressChanged()V

    return-void
.end method

.method public setProgressStyle(I)V
    .locals 2

    const-string v0, "HwProgressDialog"

    const-string v1, "setProgressStyle "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iput p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgressStyle:I

    return-void
.end method

.method public setSearchRequestedReturn(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isSearchRequestedModify:Z

    iput-boolean p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isSearchRequestedReturn:Z

    return-void
.end method

.method public setSecondaryProgress(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setSecondaryProgress(I)V

    invoke-direct {p0}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->onProgressChanged()V

    goto :goto_0

    :cond_0
    iput p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mSecondaryProgressVal:I

    :goto_0
    return-void
.end method

.method public setShowingOnClick(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->isShowOnClick:Z

    return-void
.end method

.method public setTitle(I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->setTitle(Ljava/lang/String;)V

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_titleTV:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_titleTV:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_titleTV:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setView(Landroid/view/View;)V
    .locals 5

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_rootLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;->m_contentLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

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

    const-string v0, "HwProgressDialog"

    const-string v1, "showDialog failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method
