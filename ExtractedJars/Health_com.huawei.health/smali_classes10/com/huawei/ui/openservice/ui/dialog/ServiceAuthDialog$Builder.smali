.class public Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;,
        Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$CheckedChangeListener;
    }
.end annotation


# instance fields
.field private btnLogin:Landroid/widget/Button;

.field private buttonClickListener:Landroid/view/View$OnClickListener;

.field private context:Landroid/content/Context;

.field dialog:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;

.field private isChecked:Z

.field private service:Lcom/huawei/ui/openservice/db/model/OpenService;

.field private serviceAuthNote:Landroid/widget/TextView;

.field private serviceIcon:Landroid/widget/ImageView;

.field private serviceIconUrl:Ljava/lang/String;

.field private serviceName:Landroid/widget/TextView;

.field private titleBar:Lo/emr;

.field private userInfo:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->isChecked:Z

    .line 67
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->context:Landroid/content/Context;

    .line 69
    return-void
.end method

.method static synthetic access$100(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)Landroid/widget/CheckBox;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->userInfo:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)Landroid/widget/Button;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->btnLogin:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->isChecked:Z

    return v0
.end method

.method static synthetic access$302(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;Z)Z
    .locals 0

    .line 40
    iput-boolean p1, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->isChecked:Z

    return p1
.end method

.method static synthetic access$400(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->buttonClickListener:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private initData()V
    .locals 8

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 139
    return-void

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceIcon()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->serviceIconUrl:Ljava/lang/String;

    .line 143
    const-string v0, "ServiceAuthDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "serviceIconUrl = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->serviceIconUrl:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->serviceIconUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->serviceIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->getProductName()Ljava/lang/String;

    move-result-object v6

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->serviceName:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceProvider()Ljava/lang/String;

    move-result-object v7

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->serviceAuthNote:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/openservice/R$string;->IDS_hwh_open_service_service_auth_note:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v7, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->userInfo:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 152
    return-void
.end method

.method private initView(Landroid/view/View;)V
    .locals 2

    .line 125
    sget v0, Lcom/huawei/ui/openservice/R$id;->service_auth_title_bar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->titleBar:Lo/emr;

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->titleBar:Lo/emr;

    new-instance v1, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;

    invoke-direct {v1, p0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;-><init>(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    sget v0, Lcom/huawei/ui/openservice/R$id;->service_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->serviceIcon:Landroid/widget/ImageView;

    .line 128
    sget v0, Lcom/huawei/ui/openservice/R$id;->service_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->serviceName:Landroid/widget/TextView;

    .line 129
    sget v0, Lcom/huawei/ui/openservice/R$id;->service_auth_note:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->serviceAuthNote:Landroid/widget/TextView;

    .line 130
    sget v0, Lcom/huawei/ui/openservice/R$id;->user_info:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->userInfo:Landroid/widget/CheckBox;

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->userInfo:Landroid/widget/CheckBox;

    new-instance v1, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$CheckedChangeListener;

    invoke-direct {v1, p0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$CheckedChangeListener;-><init>(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 132
    sget v0, Lcom/huawei/ui/openservice/R$id;->btn_agree_enter:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->btnLogin:Landroid/widget/Button;

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->btnLogin:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;

    invoke-direct {v1, p0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;-><init>(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    return-void
.end method


# virtual methods
.method public create()Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;
    .locals 12

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->context:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 92
    sget v0, Lcom/huawei/ui/openservice/R$layout;->dialog_service_auth:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 93
    new-instance v0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->context:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/openservice/R$style;->full_screen_dialog:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;-><init>(Landroid/content/Context;ILcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$1;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;

    .line 95
    invoke-direct {p0, v5}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->initView(Landroid/view/View;)V

    .line 96
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->initData()V

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->context:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/WindowManager;

    .line 100
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v7

    .line 101
    invoke-virtual {v7}, Landroid/view/Display;->getWidth()I

    move-result v8

    .line 102
    invoke-virtual {v7}, Landroid/view/Display;->getHeight()I

    move-result v9

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;->getWindow()Landroid/view/Window;

    move-result-object v10

    .line 104
    const v0, 0x800033

    invoke-virtual {v10, v0}, Landroid/view/Window;->setGravity(I)V

    .line 106
    const/high16 v0, 0x4000000

    invoke-virtual {v10, v0}, Landroid/view/Window;->addFlags(I)V

    .line 108
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 109
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 110
    invoke-virtual {v10}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x2400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 114
    :cond_0
    invoke-virtual {v10}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v11

    .line 115
    iput v8, v11, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 116
    iput v9, v11, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 117
    invoke-virtual {v10, v11}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;->setContentView(Landroid/view/View;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;

    return-object v0
.end method

.method public setPositiveButton(Landroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->buttonClickListener:Landroid/view/View$OnClickListener;

    .line 76
    return-object p0
.end method

.method public setService(Lcom/huawei/ui/openservice/db/model/OpenService;)Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->service:Lcom/huawei/ui/openservice/db/model/OpenService;

    .line 83
    return-object p0
.end method
