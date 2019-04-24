.class public Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyNegativeOnclickListenner;,
        Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyPositiveOnclickListenner;
    }
.end annotation


# instance fields
.field authInfoLt:Landroid/widget/LinearLayout;

.field authTitleTxt:Landroid/widget/TextView;

.field buttonTextColor:I

.field private content:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field dialog:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;

.field private dialogType:Ljava/lang/String;

.field linearLayout1:Landroid/widget/LinearLayout;

.field linearLayout2:Landroid/widget/LinearLayout;

.field negativeButton:Landroid/widget/Button;

.field private negativeButtonClickListener:Landroid/view/View$OnClickListener;

.field private negativeButtonText:Ljava/lang/String;

.field private negativeButtonTextColor:I

.field positiveButton:Landroid/widget/Button;

.field private positiveButtonClickListener:Landroid/view/View$OnClickListener;

.field private positiveButtonText:Ljava/lang/String;

.field private positiveButtonTextColor:I

.field private service:Lcom/huawei/ui/openservice/db/model/OpenService;

.field private serviceName:Ljava/lang/String;

.field private spanS:Landroid/text/SpannableString;

.field sportDataTxt:Landroid/widget/LinearLayout;

.field private title:Ljava/lang/String;

.field unknwonButton:Landroid/widget/Button;

.field userInfoTxt:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonTextColor:I

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonTextColor:I

    .line 244
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;

    .line 246
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout1:Landroid/widget/LinearLayout;

    .line 247
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout2:Landroid/widget/LinearLayout;

    .line 248
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->authInfoLt:Landroid/widget/LinearLayout;

    .line 249
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->authTitleTxt:Landroid/widget/TextView;

    .line 250
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->userInfoTxt:Landroid/widget/LinearLayout;

    .line 251
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->sportDataTxt:Landroid/widget/LinearLayout;

    .line 253
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButton:Landroid/widget/Button;

    .line 254
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButton:Landroid/widget/Button;

    .line 255
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->unknwonButton:Landroid/widget/Button;

    .line 68
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/openservice/R$string;->IDS_hwh_open_service_pop_up_notification_note:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->title:Ljava/lang/String;

    .line 70
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/openservice/R$string;->IDS_hwh_open_service_pop_up_notification:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->content:Ljava/lang/String;

    .line 71
    sget v0, Lcom/huawei/ui/openservice/R$string;->IDS_hwh_open_service_pop_up_notification_agree:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    .line 73
    :cond_0
    sget v0, Lcom/huawei/ui/openservice/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    .line 75
    :cond_1
    return-void
.end method

.method static synthetic access$100(Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonClickListener:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonClickListener:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private createDialogByService()V
    .locals 6

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->getHmsAuth()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->getAuthType()Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->getAuthType()Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/AuthTypeList;->getTypes()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 397
    const-string v0, "CustomAuthAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "service.getAuthType().getTypes() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/OpenService;->getAuthType()Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/AuthTypeList;->getTypes()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->authInfoLt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 399
    const-string v0, "CustomAuthAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "service.getProductName() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/OpenService;->getProductName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->authTitleTxt:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/openservice/R$string;->IDS_hwh_open_service_dialog_health_auth:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/OpenService;->getProductName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->getAuthType()Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/AuthTypeList;->getTypes()Ljava/util/List;

    move-result-object v0

    const-string v1, "USER_INFO"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->userInfoTxt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 404
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->getAuthType()Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/AuthTypeList;->getTypes()Ljava/util/List;

    move-result-object v0

    const-string v1, "SPORT_DATA"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->sportDataTxt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 409
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->authInfoLt:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 411
    :cond_2
    :goto_0
    return-void
.end method

.method private createDialogByStringValues()V
    .locals 6

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialogType:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->serviceName:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 377
    const-string v0, "CustomAuthAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dialogType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialogType:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",serviceName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->serviceName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialogType:Ljava/lang/String;

    const-string v1, "HMS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 379
    const-string v0, "CustomAuthAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialogType == HMS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->authInfoLt:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 381
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialogType:Ljava/lang/String;

    const-string v1, "NO_HMS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 382
    const-string v0, "CustomAuthAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialogType == NO_HMS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->authInfoLt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 384
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->authTitleTxt:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/openservice/R$string;->IDS_hwh_open_service_dialog_health_auth:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->serviceName:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->userInfoTxt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->sportDataTxt:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 389
    :cond_1
    :goto_0
    return-void
.end method

.method private isAllButtonTextNotNull()V
    .locals 3

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout1:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout2:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 431
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 432
    iget v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonTextColor:I

    if-eqz v0, :cond_0

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonTextColor:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    goto :goto_0

    .line 435
    :cond_0
    iget v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->buttonTextColor:I

    if-eqz v0, :cond_1

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButton:Landroid/widget/Button;

    iget v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->buttonTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 439
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonClickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_2

    .line 440
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButton:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyPositiveOnclickListenner;

    invoke-direct {v1, p0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyPositiveOnclickListenner;-><init>(Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 443
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 444
    iget v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonTextColor:I

    if-eqz v0, :cond_3

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonTextColor:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    goto :goto_1

    .line 447
    :cond_3
    iget v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->buttonTextColor:I

    if-eqz v0, :cond_4

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButton:Landroid/widget/Button;

    iget v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->buttonTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 451
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonClickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_5

    .line 452
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButton:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyNegativeOnclickListenner;

    invoke-direct {v1, p0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyNegativeOnclickListenner;-><init>(Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 454
    :cond_5
    return-void
.end method

.method private isOnlyNegativeButtonNotNull()V
    .locals 3

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout1:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 475
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout2:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->unknwonButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 478
    iget v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonTextColor:I

    if-eqz v0, :cond_0

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonTextColor:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    goto :goto_0

    .line 481
    :cond_0
    iget v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->buttonTextColor:I

    if-eqz v0, :cond_1

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButton:Landroid/widget/Button;

    iget v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->buttonTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 485
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonClickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_2

    .line 486
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->unknwonButton:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyNegativeOnclickListenner;

    invoke-direct {v1, p0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyNegativeOnclickListenner;-><init>(Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 488
    :cond_2
    return-void
.end method

.method private isOnlyPositiveButtonNotNull()V
    .locals 3

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout1:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout2:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->unknwonButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 461
    iget v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonTextColor:I

    if-eqz v0, :cond_0

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->unknwonButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonTextColor:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    goto :goto_0

    .line 464
    :cond_0
    iget v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->buttonTextColor:I

    if-eqz v0, :cond_1

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->unknwonButton:Landroid/widget/Button;

    iget v1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->buttonTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 468
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonClickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_2

    .line 469
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->unknwonButton:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyPositiveOnclickListenner;

    invoke-direct {v1, p0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyPositiveOnclickListenner;-><init>(Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 471
    :cond_2
    return-void
.end method

.method private setButtonStyle()V
    .locals 2

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 416
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->isAllButtonTextNotNull()V

    goto :goto_0

    .line 417
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 418
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->isOnlyNegativeButtonNotNull()V

    goto :goto_0

    .line 419
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 420
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->isOnlyPositiveButtonNotNull()V

    goto :goto_0

    .line 422
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout1:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 423
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout2:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 425
    :goto_0
    return-void
.end method


# virtual methods
.method public create()Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;
    .locals 17

    .line 274
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 276
    new-instance v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/openservice/R$style;->CustomDialog:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;-><init>(Landroid/content/Context;ILcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$1;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;

    .line 277
    sget v0, Lcom/huawei/ui/openservice/R$layout;->custom_auth_alert_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 280
    new-instance v6, Landroid/util/TypedValue;

    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 281
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lcom/huawei/ui/openservice/R$attr;->customDialogStyleRefer:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v6, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 286
    iget v0, v6, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    .line 287
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, v6, Landroid/util/TypedValue;->resourceId:I

    sget-object v2, Lcom/huawei/ui/openservice/R$styleable;->customDialogDefinition:[I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v10

    .line 288
    sget v0, Lcom/huawei/ui/openservice/R$styleable;->customDialogDefinition_dialogBackground:I

    invoke-virtual {v10, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 289
    new-instance v11, Landroid/util/TypedValue;

    invoke-direct {v11}, Landroid/util/TypedValue;-><init>()V

    .line 290
    new-instance v12, Landroid/util/TypedValue;

    invoke-direct {v12}, Landroid/util/TypedValue;-><init>()V

    .line 291
    sget v0, Lcom/huawei/ui/openservice/R$styleable;->customDialogDefinition_titleTextSize:I

    invoke-virtual {v10, v0, v11}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 292
    sget v0, Lcom/huawei/ui/openservice/R$styleable;->customDialogDefinition_contentTextSize:I

    invoke-virtual {v10, v0, v12}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 293
    sget v0, Lcom/huawei/ui/openservice/R$styleable;->customDialogDefinition_buttonTextColor:I

    sget v1, Lcom/huawei/ui/openservice/R$color;->common_colorAccent:I

    invoke-virtual {v10, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->buttonTextColor:I

    .line 294
    iget v0, v11, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v7, v0

    .line 295
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    int-to-float v1, v7

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;->dip2px(Landroid/content/Context;F)I

    move-result v7

    .line 296
    iget v0, v12, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v8, v0

    .line 297
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    int-to-float v1, v8

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;->dip2px(Landroid/content/Context;F)I

    move-result v8

    .line 299
    invoke-virtual {v10}, Landroid/content/res/TypedArray;->recycle()V

    .line 300
    goto :goto_0

    .line 301
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/openservice/R$drawable;->activity_dialog_bg:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 302
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/openservice/R$color;->common_colorAccent:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->buttonTextColor:I

    .line 303
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/openservice/R$dimen;->custom_normal_titlebar_title_textsize:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    .line 304
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/openservice/R$dimen;->default_text_font_size_large2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    .line 308
    :goto_0
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 311
    sget v0, Lcom/huawei/ui/openservice/R$id;->custom_text_alert_dailog_title:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 312
    int-to-float v0, v7

    const/4 v1, 0x0

    invoke-virtual {v10, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 313
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->title:Ljava/lang/String;

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    const-string v0, "CustomAuthAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "content = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->content:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    const-string v0, "CustomAuthAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "contentTextSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    sget v0, Lcom/huawei/ui/openservice/R$id;->dialog_text_alert_message:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    .line 320
    int-to-float v0, v8

    const/4 v1, 0x0

    invoke-virtual {v11, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 321
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->spanS:Landroid/text/SpannableString;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 322
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->spanS:Landroid/text/SpannableString;

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 323
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    goto :goto_1

    .line 326
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->content:Ljava/lang/String;

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    :goto_1
    sget v0, Lcom/huawei/ui/openservice/R$id;->dialog_linearlayout1:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout1:Landroid/widget/LinearLayout;

    .line 330
    sget v0, Lcom/huawei/ui/openservice/R$id;->dialog_linearlayout2:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout2:Landroid/widget/LinearLayout;

    .line 332
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout1:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/openservice/R$id;->dialog_text_alert_btn_negative:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButton:Landroid/widget/Button;

    .line 333
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout1:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/openservice/R$id;->dialog_text_alert_btn_positive:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButton:Landroid/widget/Button;

    .line 334
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->linearLayout2:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/openservice/R$id;->dialog_one_text_alert_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->unknwonButton:Landroid/widget/Button;

    .line 337
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->setButtonStyle()V

    .line 339
    sget v0, Lcom/huawei/ui/openservice/R$id;->auth_info_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->authInfoLt:Landroid/widget/LinearLayout;

    .line 340
    sget v0, Lcom/huawei/ui/openservice/R$id;->auth_title:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->authTitleTxt:Landroid/widget/TextView;

    .line 341
    sget v0, Lcom/huawei/ui/openservice/R$id;->user_info:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->userInfoTxt:Landroid/widget/LinearLayout;

    .line 342
    sget v0, Lcom/huawei/ui/openservice/R$id;->sport_data:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->sportDataTxt:Landroid/widget/LinearLayout;

    .line 343
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 344
    const-string v0, "CustomAuthAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "service.getHmsAuth() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/OpenService;->getHmsAuth()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->createDialogByService()V

    goto :goto_2

    .line 347
    :cond_2
    const-string v0, "CustomAuthAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->createDialogByStringValues()V

    .line 352
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;->setContentView(Landroid/view/View;)V

    .line 354
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v12

    .line 355
    const/16 v0, 0x50

    invoke-virtual {v12, v0}, Landroid/view/Window;->setGravity(I)V

    .line 356
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/view/WindowManager;

    .line 357
    invoke-interface {v13}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v14

    .line 358
    invoke-virtual {v12}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v15

    .line 359
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;->dip2px(Landroid/content/Context;F)I

    move-result v16

    .line 360
    invoke-virtual {v14}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v16, 0x2

    sub-int/2addr v0, v1

    iput v0, v15, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 361
    move/from16 v0, v16

    iput v0, v15, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 362
    invoke-virtual {v12, v15}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 363
    sget v0, Lcom/huawei/ui/openservice/R$style;->track_dialog_anim:I

    invoke-virtual {v12, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 369
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;

    return-object v0
.end method

.method public setContent(I)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->content:Ljava/lang/String;

    .line 104
    return-object p0
.end method

.method public setContent(Landroid/text/SpannableString;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->spanS:Landroid/text/SpannableString;

    .line 124
    return-object p0
.end method

.method public setContent(Ljava/lang/String;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->content:Ljava/lang/String;

    .line 114
    return-object p0
.end method

.method public setDialogType(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialogType:Ljava/lang/String;

    .line 266
    iput-object p2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->serviceName:Ljava/lang/String;

    .line 267
    return-object p0
.end method

.method public setNegativeButton(IILandroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    .line 224
    iput p2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonTextColor:I

    .line 225
    iput-object p3, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonClickListener:Landroid/view/View$OnClickListener;

    .line 226
    return-object p0
.end method

.method public setNegativeButton(ILandroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    .line 200
    iput-object p2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonClickListener:Landroid/view/View$OnClickListener;

    .line 201
    return-object p0
.end method

.method public setNegativeButton(Landroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonClickListener:Landroid/view/View$OnClickListener;

    .line 190
    return-object p0
.end method

.method public setNegativeButton(Ljava/lang/String;ILandroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 1

    .line 237
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    .line 238
    iput p2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonTextColor:I

    .line 239
    iput-object p3, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonClickListener:Landroid/view/View$OnClickListener;

    .line 240
    return-object p0
.end method

.method public setNegativeButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 1

    .line 210
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonText:Ljava/lang/String;

    .line 211
    iput-object p2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->negativeButtonClickListener:Landroid/view/View$OnClickListener;

    .line 212
    return-object p0
.end method

.method public setPositiveButton(IILandroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    .line 166
    iput p2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonTextColor:I

    .line 167
    iput-object p3, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonClickListener:Landroid/view/View$OnClickListener;

    .line 168
    return-object p0
.end method

.method public setPositiveButton(ILandroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    .line 142
    iput-object p2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonClickListener:Landroid/view/View$OnClickListener;

    .line 143
    return-object p0
.end method

.method public setPositiveButton(Landroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonClickListener:Landroid/view/View$OnClickListener;

    .line 132
    return-object p0
.end method

.method public setPositiveButton(Ljava/lang/String;ILandroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 1

    .line 179
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    .line 180
    iput p2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonTextColor:I

    .line 181
    iput-object p3, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonClickListener:Landroid/view/View$OnClickListener;

    .line 182
    return-object p0
.end method

.method public setPositiveButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 1

    .line 152
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonText:Ljava/lang/String;

    .line 153
    iput-object p2, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->positiveButtonClickListener:Landroid/view/View$OnClickListener;

    .line 154
    return-object p0
.end method

.method public setService(Lcom/huawei/ui/openservice/db/model/OpenService;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 0

    .line 260
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    .line 261
    return-object p0
.end method

.method public setTitle(I)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->title:Ljava/lang/String;

    .line 84
    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->title:Ljava/lang/String;

    .line 94
    return-object p0
.end method
