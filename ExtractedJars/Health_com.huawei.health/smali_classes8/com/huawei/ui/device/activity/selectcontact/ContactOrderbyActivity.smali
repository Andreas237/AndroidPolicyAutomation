.class public Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/emr;

.field private c:Ljava/lang/String;

.field private d:Lo/eow;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/Contact;>;"
        }
    .end annotation
.end field

.field private f:Landroid/os/Handler;

.field private k:Lo/enz;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 38
    const-string v0, "ContactOrderbyActivity"

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->c:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->d:Lo/eow;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e:Ljava/util/List;

    .line 143
    new-instance v0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$2;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->f:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 3

    .line 93
    sget v0, Lcom/huawei/ui/device/R$id;->contact_orderby_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->b:Lo/emr;

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->b:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$1;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    sget v0, Lcom/huawei/ui/device/R$id;->contact_orderby_drag_list:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/epb;

    .line 105
    new-instance v0, Lo/eow;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lo/eow;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->d:Lo/eow;

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->d:Lo/eow;

    invoke-virtual {v2, v0}, Lo/epb;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 110
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->c:Ljava/lang/String;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 70
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->a:Landroid/content/Context;

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->k:Lo/enz;

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->k:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/enz;->e(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e:Ljava/util/List;

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get null DBdata, the activity will be shut down!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    return-void

    .line 79
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mContactTables size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->f:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 82
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->f:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 85
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)Lo/emr;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->b:Lo/emr;

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->b:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 169
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->finish()V

    .line 170
    return-void
.end method

.method private d()V
    .locals 2

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_mult_alarm_clock_synchroFailed_dialog:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->b:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 179
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->finish()V

    .line 180
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->d()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)Landroid/os/Handler;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->f:Landroid/os/Handler;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveData() delete data mContactTables = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->k:Lo/enz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDeviceSettingsInteractors of saveData error null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-void

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v4

    .line 125
    invoke-virtual {v4}, Lo/env;->i()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_not_connect:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 129
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->k:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e:Ljava/util/List;

    new-instance v3, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$3;

    invoke-direct {v3, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$3;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/enz;->d(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 141
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->c()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->a()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 55
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 56
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_settings_contact_orderby_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->setContentView(I)V

    .line 59
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->b()V

    .line 63
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 184
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->f:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 188
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->f:Landroid/os/Handler;

    .line 190
    :cond_0
    return-void
.end method
