.class public Lcom/huawei/openalliance/ad/views/AppDownloadButton;
.super Lcom/huawei/openalliance/ad/views/ProgressButton;

# interfaces
.implements Lcom/huawei/openalliance/ad/download/h;
.implements Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;,
        Lcom/huawei/openalliance/ad/views/AppDownloadButton$ButtonTextWatcher;,
        Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnNonWifiDownloadListener;,
        Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnDownloadStatusChangedListener;
    }
.end annotation


# instance fields
.field private d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

.field private e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

.field private f:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;

.field private g:Z

.field private h:Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnDownloadStatusChangedListener;

.field private i:Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnNonWifiDownloadListener;

.field private j:Lcom/huawei/openalliance/ad/views/AppDownloadButton$ButtonTextWatcher;

.field private k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

.field private l:Lcom/huawei/openalliance/ad/download/app/AppStatus;

.field private m:I

.field private n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

.field private o:Z

.field private p:I

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/TextState;>;"
        }
    .end annotation
.end field

.field private r:Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/ProgressButton;-><init>(Landroid/content/Context;)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->o:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/ProgressButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->o:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/views/ProgressButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->o:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    const/4 v0, -0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/views/ProgressButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->o:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/download/app/c;Ljava/lang/String;Z)Lcom/huawei/openalliance/ad/download/app/AppStatus;
    .locals 5

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->h()Lcom/huawei/openalliance/ad/download/d;

    move-result-object v4

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "refreshStatus, downloadStatus:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", packageName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$8;->a:[I

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/download/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->k()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    if-lez v0, :cond_0

    sget-object v3, Lcom/huawei/openalliance/ad/download/app/AppStatus;->PAUSE:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    goto :goto_1

    :cond_0
    sget-object v3, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    goto :goto_1

    :pswitch_1
    sget-object v3, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOADING:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->k()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    goto :goto_1

    :pswitch_2
    sget-object v3, Lcom/huawei/openalliance/ad/download/app/AppStatus;->PAUSE:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->k()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    goto :goto_1

    :pswitch_3
    sget-object v3, Lcom/huawei/openalliance/ad/download/app/AppStatus;->INSTALL:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    goto :goto_1

    :pswitch_4
    sget-object v3, Lcom/huawei/openalliance/ad/download/app/AppStatus;->INSTALLING:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    goto :goto_1

    :pswitch_5
    if-nez p3, :cond_1

    sget-object v3, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z

    goto :goto_1

    :cond_1
    sget-object v3, Lcom/huawei/openalliance/ad/download/app/AppStatus;->OPEN:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    goto :goto_1

    :goto_0
    sget-object v3, Lcom/huawei/openalliance/ad/download/app/AppStatus;->UNKNOWN:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    :goto_1
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private a(ILcom/huawei/openalliance/ad/download/app/AppStatus;)Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->q:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    const/4 v2, 0x2

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    :goto_0
    invoke-static {p2}, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->getTextStatus(Lcom/huawei/openalliance/ad/download/app/AppStatus;)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/a;->b()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/openalliance/ad/beans/metadata/TextState;

    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->getState()I

    move-result v0

    if-ne v3, v0, :cond_3

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->getShowPosition()I

    move-result v0

    if-ne v2, v0, :cond_3

    new-instance v0, Ljava/util/Locale;

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->getText()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_2
    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->getDefaultTextFlag()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->getText()Ljava/lang/String;

    move-result-object v5

    :cond_3
    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object v4, v5

    :cond_5
    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ad;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Context;Lcom/huawei/openalliance/ad/download/app/AppStatus;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    :cond_0
    const-string v0, ""

    return-object v0

    :cond_1
    const/4 v2, 0x0

    sget-object v0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$8;->b:[I

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/download/app/AppStatus;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_download_download:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :pswitch_1
    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_download_resume:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :pswitch_2
    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    float-to-double v3, v0

    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :pswitch_3
    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_download_open:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :pswitch_4
    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_download_install:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :pswitch_5
    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_download_installing:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_0
    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->OPEN:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;ILcom/huawei/openalliance/ad/download/app/AppStatus;)V

    return-void
.end method

.method private a(Landroid/content/Context;ILcom/huawei/openalliance/ad/download/app/AppStatus;)V
    .locals 3

    invoke-direct {p0, p2, p3}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(ILcom/huawei/openalliance/ad/download/app/AppStatus;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p3}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/download/app/AppStatus;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Ljava/lang/CharSequence;Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v2, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Ljava/lang/CharSequence;Z)V

    :goto_0
    return-void
.end method

.method private a(Landroid/content/Context;J)V
    .locals 8

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "showNonWifiAlert, context:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Landroid/app/AlertDialog$Builder;

    invoke-direct {v5, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_dialog_title:I

    invoke-virtual {v5, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_dialog_continue:I

    new-instance v1, Lcom/huawei/openalliance/ad/views/AppDownloadButton$4;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$4;-><init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)V

    invoke-virtual {v5, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_dialog_cancel:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_download_use_mobile_network:I

    const-string v1, "hiad_download_use_mobile_network"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, p2, p3}, Lcom/huawei/openalliance/ad/utils/i;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1, v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/ad;->a(Landroid/content/Context;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v5}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    instance-of v0, p1, Landroid/app/Activity;

    if-nez v0, :cond_0

    invoke-virtual {v7}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x7d3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    :cond_0
    invoke-virtual {v7}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/download/app/c;Landroid/content/Context;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/i;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->INSTALL:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-direct {p0, p2, v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;ILcom/huawei/openalliance/ad/download/app/AppStatus;)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-direct {p0, p2, v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;ILcom/huawei/openalliance/ad/download/app/AppStatus;)V

    sget-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->f()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/AppDownloadButton;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 5

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_network_no_available:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPermissions()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->o:Z

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    new-instance v2, Lcom/huawei/openalliance/ad/views/AppDownloadButton$3;

    invoke-direct {v2, p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$3;-><init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)V

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/app/f;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/app/f$a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getLeftSize()J

    move-result-wide v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->i:Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnNonWifiDownloadListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->i:Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnNonWifiDownloadListener;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-interface {v0, v1, v3, v4}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnNonWifiDownloadListener;->onNonWifiDownload(Lcom/huawei/openalliance/ad/inter/data/AppInfo;J)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->f()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, v3, v4}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;J)V

    :cond_3
    :goto_0
    goto :goto_1

    :cond_4
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->f()V

    :goto_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnDownloadStatusChangedListener;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->h:Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnDownloadStatusChangedListener;

    return-object v0
.end method

.method private b(Lcom/huawei/openalliance/ad/download/app/c;Landroid/content/Context;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/i;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->INSTALLING:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-direct {p0, p2, v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;ILcom/huawei/openalliance/ad/download/app/AppStatus;)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-direct {p0, p2, v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;ILcom/huawei/openalliance/ad/download/app/AppStatus;)V

    sget-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z

    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)Lcom/huawei/openalliance/ad/download/app/AppStatus;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    return-object v0
.end method

.method private c()V
    .locals 8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v0

    invoke-static {v3, v0}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v0

    invoke-direct {v5, v3, v0}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getIntentUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v4, v0}, Lcom/huawei/openalliance/ad/utils/c;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v0, "AppDownloadButton"

    const-string v1, "handleClick, openAppIntent failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3, v4}, Lcom/huawei/openalliance/ad/utils/c;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v7, 0x2

    goto :goto_0

    :cond_1
    const/4 v7, 0x1

    :goto_0
    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v0, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-static {v3, v4}, Lcom/huawei/openalliance/ad/utils/c;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/k/c;->i(Ljava/lang/Integer;)V

    const-string v0, "app"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v5, v1, v2, v0}, Lcom/huawei/openalliance/ad/k/c;->a(IILjava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e()V

    goto :goto_1

    :cond_2
    const-string v0, "AppDownloadButton"

    const-string v1, "handleClick, openAppMainPage failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    goto :goto_2

    :cond_3
    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTSUCCESS:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v5, v0, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;Ljava/lang/Integer;)V

    const-string v0, "app"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v5, v1, v2, v0}, Lcom/huawei/openalliance/ad/k/c;->a(IILjava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e()V

    :goto_2
    return-void
.end method

.method private c(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 6

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processStatus, status:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", preStatus:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->l:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", packageName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->f:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->getStyle(Landroid/content/Context;Lcom/huawei/openalliance/ad/download/app/AppStatus;)Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    move-result-object v4

    iget v0, v4, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->textColor:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setTextColor(I)V

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    iget-object v0, v4, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->background:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_1

    :cond_2
    iget-object v0, v4, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->background:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_1
    const/4 v5, 0x0

    sget-object v0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$8;->b:[I

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/download/app/AppStatus;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-direct {p0, v3, v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;ILcom/huawei/openalliance/ad/download/app/AppStatus;)V

    goto :goto_2

    :pswitch_1
    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->PAUSE:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-direct {p0, v3, v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;ILcom/huawei/openalliance/ad/download/app/AppStatus;)V

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setProgress(I)V

    goto :goto_2

    :pswitch_2
    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOADING:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-direct {p0, v3, v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;ILcom/huawei/openalliance/ad/download/app/AppStatus;)V

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->m:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setProgress(I)V

    goto :goto_2

    :pswitch_3
    invoke-direct {p0, v3}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;)V

    goto :goto_2

    :pswitch_4
    invoke-direct {p0, p1, v3}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Lcom/huawei/openalliance/ad/download/app/c;Landroid/content/Context;)V

    goto :goto_2

    :pswitch_5
    invoke-direct {p0, p1, v3}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->b(Lcom/huawei/openalliance/ad/download/app/c;Landroid/content/Context;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)Lcom/huawei/openalliance/ad/download/app/AppStatus;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->l:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    return-object v0
.end method

.method private d()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    new-instance v3, Lcom/huawei/openalliance/ad/k/c;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v2

    invoke-static {v1, v2}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    const-string v0, "download"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v1, v2, v0}, Lcom/huawei/openalliance/ad/k/c;->a(IILjava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e()V

    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/d;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/k/d;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->d()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;

    invoke-direct {v3, p0, p1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;-><init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton;Lcom/huawei/openalliance/ad/download/app/c;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V

    return-void
.end method

.method private e()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->r:Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->r:Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;->c()V

    :cond_0
    return-void
.end method

.method private f()V
    .locals 5

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadApp, status:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->PAUSE:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    if-ne v0, v1, :cond_5

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getTask()Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v3

    if-eqz v3, :cond_2

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(Ljava/lang/Integer;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->g:Z

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(Z)V

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v3, v1}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/download/e;Z)V

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-eqz v0, :cond_3

    new-instance v4, Lcom/huawei/openalliance/ad/k/c;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v2

    invoke-static {v1, v2}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    :cond_3
    new-instance v0, Lcom/huawei/openalliance/ad/download/app/c$a;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/download/app/c$a;-><init>()V

    iget-boolean v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->g:Z

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c$a;->a(Z)Lcom/huawei/openalliance/ad/download/app/c$a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c$a;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/openalliance/ad/download/app/c$a;->a(Lcom/huawei/openalliance/ad/k/b/d;)Lcom/huawei/openalliance/ad/download/app/c$a;

    move-result-object v0

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v1, v2}, Lcom/huawei/openalliance/ad/download/app/b;->d(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c$a;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c$a;

    move-result-object v0

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v1, v2}, Lcom/huawei/openalliance/ad/download/app/b;->e(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c$a;->b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/app/c$a;->a()Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(Ljava/lang/Integer;)V

    :cond_4
    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/download/app/c;)Z

    :cond_5
    :goto_0
    return-void
.end method

.method private getLeftSize()J
    .locals 9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getTask()Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getFileSize()J

    move-result-wide v5

    if-eqz v4, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getFileSize()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/download/app/c;->g()J

    move-result-wide v2

    sub-long v7, v0, v2

    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-gtz v0, :cond_1

    goto :goto_0

    :cond_1
    move-wide v5, v7

    :cond_2
    :goto_0
    return-wide v5
.end method

.method private getTask()Lcom/huawei/openalliance/ad/download/app/c;
    .locals 5

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/b;->c(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/download/app/c;->u()Lcom/huawei/openalliance/ad/k/b/d;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-eqz v0, :cond_0

    new-instance v4, Lcom/huawei/openalliance/ad/k/c;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v2

    invoke-static {v1, v2}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    invoke-virtual {v3, v4}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/k/b/d;)V

    :cond_0
    return-object v3
.end method


# virtual methods
.method protected a(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;

    invoke-direct {v0, p1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->f:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;

    invoke-virtual {p0, p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 3

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onProgressChanged, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", packageName"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", progress:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->k()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$6;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$6;-><init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    :cond_2
    return-void
.end method

.method public a(Ljava/lang/CharSequence;Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->j:Lcom/huawei/openalliance/ad/views/AppDownloadButton$ButtonTextWatcher;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->j:Lcom/huawei/openalliance/ad/views/AppDownloadButton$ButtonTextWatcher;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-interface {v0, p1, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$ButtonTextWatcher;->beforeTextChanged(Ljava/lang/CharSequence;Lcom/huawei/openalliance/ad/download/app/AppStatus;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/openalliance/ad/views/ProgressButton;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$7;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$7;-><init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 3

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onStatusChanged, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", packageName"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", status:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->h()Lcom/huawei/openalliance/ad/download/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$5;-><init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    :cond_2
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Ljava/lang/String;)V

    return-void
.end method

.method public cancel()V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/b;->b(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->refreshStatus()Lcom/huawei/openalliance/ad/download/app/AppStatus;

    return-void
.end method

.method public continueDownload()V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->f()V

    return-void
.end method

.method public getStyle()Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->f:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 4
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-super {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->onAttachedToWindow()V

    :try_start_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAttachedToWindow, packageName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0, v1, p0}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/h;)V

    new-instance v0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$1;-><init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "AppDownloadButton"

    const-string v1, "onAttachedToWindow RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "AppDownloadButton"

    const-string v1, "onAttachedToWindow Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onClick, status:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$8;->b:[I

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/download/app/AppStatus;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Z)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->d()V

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Z)V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->b()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->c()V

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getTask()Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-direct {p0, v3}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->d(Lcom/huawei/openalliance/ad/download/app/c;)V

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getTask()Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/openalliance/ad/download/app/b;->b(Lcom/huawei/openalliance/ad/download/app/c;)V

    :cond_3
    :goto_0
    :pswitch_5
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_5
    .end packed-switch
.end method

.method protected onDetachedFromWindow()V
    .locals 4
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-super {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->onDetachedFromWindow()V

    :try_start_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDetachedFromWindow, packageName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0, v1, p0}, Lcom/huawei/openalliance/ad/download/app/b;->b(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/h;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "AppDownloadButton"

    const-string v1, "onDetachedFromWindow RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "AppDownloadButton"

    const-string v1, "onDetachedFromWindow Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 3

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onVisibilityChanged, status:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/ProgressButton;->onVisibilityChanged(Landroid/view/View;I)V

    new-instance v0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$2;-><init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public refreshStatus()Lcom/huawei/openalliance/ad/download/app/AppStatus;
    .locals 8
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lcom/huawei/openalliance/ad/download/app/AppStatus;->UNKNOWN:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->l:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    iput-object v5, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/c;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    sget-object v5, Lcom/huawei/openalliance/ad/download/app/AppStatus;->OPEN:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->getTask()Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-direct {p0, v4, v3, v7}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Lcom/huawei/openalliance/ad/download/app/c;Ljava/lang/String;Z)Lcom/huawei/openalliance/ad/download/app/AppStatus;

    move-result-object v5

    goto :goto_0

    :cond_2
    sget-object v5, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->l:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    iput-object v5, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-direct {p0, v4}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->c(Lcom/huawei/openalliance/ad/download/app/c;)V

    :goto_1
    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "refreshStatus, status:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", packageName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->k:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    return-object v0
.end method

.method public setAdLandingPageData(Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)V
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-eqz p1, :cond_1

    :try_start_0
    new-instance v0, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getContentId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setContentId_(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getAdType()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setAdType_(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getParamFromServer()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setParamFromServer_(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getLandingUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setDetailUrl_(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getShowId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setShowId(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getMonitors()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setMonitors(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCtrlSwitchs()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setCtrlSwitchs(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getNoReportEventList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setNoReportEventList(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getAppInfo()Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setAppInfo(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->isPermPromptForLanding()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setShowPermissionDialog(Z)V

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getShowId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->updateContent(Ljava/lang/String;)V

    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getTextStateList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->q:Ljava/util/List;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setAppInfo(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v2

    const-string v0, "AppDownloadButton"

    const-string v1, "setAdLandingPageData IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v2

    const-string v0, "AppDownloadButton"

    const-string v1, "setAdLandingPageData error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public setAllowedNonWifiNetwork(Z)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->g:Z

    return-void
.end method

.method public setAppDownloadButtonStyle(Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->f:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;

    return-void
.end method

.method public setAppInfo(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setAppInfo appInfo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->e:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    return-void
.end method

.method public setButtonTextWatcher(Lcom/huawei/openalliance/ad/views/AppDownloadButton$ButtonTextWatcher;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->j:Lcom/huawei/openalliance/ad/views/AppDownloadButton$ButtonTextWatcher;

    return-void
.end method

.method public setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)Z
    .locals 6

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setAppInfo(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v0, 0x0

    return v0

    :cond_0
    instance-of v0, p1, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    :cond_1
    const/4 v0, 0x1

    :try_start_0
    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->p:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/e;->a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/inter/data/INativeAd;->getAppInfo()Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setAppInfo(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->isPermPromptForCard()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setShowPermissionDialog(Z)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x1

    return v0

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getMetaData()Ljava/lang/String;

    move-result-object v4

    const-class v0, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-static {v4, v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getTextStateList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->q:Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_3
    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setNativeAd RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "AppDownloadButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setNativeAd Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public setOnDownloadStatusChangedListener(Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnDownloadStatusChangedListener;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->h:Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnDownloadStatusChangedListener;

    return-void
.end method

.method public setOnNonWifiDownloadListener(Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnNonWifiDownloadListener;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->i:Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnNonWifiDownloadListener;

    return-void
.end method

.method public setPpsNativeView(Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->r:Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;

    return-void
.end method

.method public setShowPermissionDialog(Z)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->o:Z

    return-void
.end method

.method public updateContent(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->n:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setShowId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
