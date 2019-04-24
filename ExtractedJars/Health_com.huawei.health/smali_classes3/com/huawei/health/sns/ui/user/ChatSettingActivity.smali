.class public Lcom/huawei/health/sns/ui/user/ChatSettingActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private f:Landroid/view/View;

.field private g:Z

.field private h:Lo/emu;

.field private k:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->k:Landroid/view/View;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->h:Lo/emu;

    .line 47
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->g:Z

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->f:Landroid/view/View;

    return-void
.end method

.method private a()V
    .locals 6

    .line 152
    move-object v0, p0

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_clear_all_record:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_clear:I

    new-instance v5, Lcom/huawei/health/sns/ui/user/ChatSettingActivity$3;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity$3;-><init>(Lcom/huawei/health/sns/ui/user/ChatSettingActivity;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 167
    return-void
.end method

.method private b()V
    .locals 2

    .line 69
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 70
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 74
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->layout_chat:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->k:Landroid/view/View;

    .line 75
    sget v0, Lcom/huawei/android/sns/R$id;->switch_chat:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->h:Lo/emu;

    .line 76
    sget v0, Lcom/huawei/android/sns/R$id;->layout_clear_record:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->f:Landroid/view/View;

    .line 77
    return-void
.end method

.method private b(Z)V
    .locals 2

    .line 105
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->g:Z

    if-eqz v0, :cond_0

    .line 107
    return-void

    .line 110
    :cond_0
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "enter_send_msg"

    invoke-virtual {v0, v1, p1}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 111
    return-void
.end method

.method private c()V
    .locals 2

    .line 84
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->k:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->f:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->h:Lo/emu;

    new-instance v1, Lcom/huawei/health/sns/ui/user/ChatSettingActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity$1;-><init>(Lcom/huawei/health/sns/ui/user/ChatSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 96
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/ChatSettingActivity;Z)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->b(Z)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/ChatSettingActivity;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->g()V

    return-void
.end method

.method private e()V
    .locals 4

    .line 118
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->g:Z

    .line 120
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "enter_send_msg"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 121
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->h:Lo/emu;

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->h:Lo/emu;

    invoke-virtual {v0, v3}, Lo/emu;->setChecked(Z)V

    .line 125
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->g:Z

    .line 126
    return-void
.end method

.method private g()V
    .locals 2

    .line 174
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->k()Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 175
    return-void
.end method

.method private static k()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 179
    new-instance v0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity$4;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity$4;-><init>()V

    return-object v0
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 131
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->d:Landroid/view/View;

    .line 132
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 137
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->layout_chat:I

    if-ne v0, v1, :cond_1

    .line 139
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->h:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->h:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_1

    .line 141
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->layout_clear_record:I

    if-ne v0, v1, :cond_2

    .line 143
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->a()V

    .line 145
    :cond_2
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 57
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 58
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_message_settings:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->setContentView(I)V

    .line 59
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->b()V

    .line 60
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->e()V

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/ChatSettingActivity;->c()V

    .line 62
    return-void
.end method
