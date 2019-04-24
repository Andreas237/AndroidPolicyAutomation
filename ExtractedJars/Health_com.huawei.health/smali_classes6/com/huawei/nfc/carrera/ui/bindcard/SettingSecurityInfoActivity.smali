.class public Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"


# instance fields
.field private btnNext:Lo/egd;

.field private imgSecurityIcon:Landroid/widget/ImageView;

.field private saveBundle:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->jumpToBind()V

    return-void
.end method

.method private initParams()Z
    .locals 3

    .line 41
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 42
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 44
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 46
    :cond_1
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->saveBundle:Landroid/os/Bundle;

    .line 47
    const/4 v0, 0x1

    return v0
.end method

.method private initUI()V
    .locals 2

    .line 52
    sget v0, Lcom/huawei/wallet/R$id;->security_activity_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->imgSecurityIcon:Landroid/widget/ImageView;

    .line 56
    sget v0, Lcom/huawei/wallet/R$id;->setting_security_btn_next:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->btnNext:Lo/egd;

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->btnNext:Lo/egd;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    return-void
.end method

.method private jumpToBind()V
    .locals 2

    .line 74
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 75
    const-class v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->saveBundle:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 77
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->startActivity(Landroid/content/Intent;)V

    .line 79
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->finish()V

    .line 80
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 27
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_activity_setting_security:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->setContentView(I)V

    .line 29
    sget v0, Lcom/huawei/wallet/R$string;->nfc_setting_security_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->showHead(I)V

    .line 31
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 33
    const-string v0, "init security params error !"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->finish()V

    .line 36
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SettingSecurityInfoActivity;->initUI()V

    .line 37
    return-void
.end method
