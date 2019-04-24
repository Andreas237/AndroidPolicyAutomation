.class public Lo/fht$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fht;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/widget/Button;

.field private b:Landroid/widget/Button;

.field c:Lo/fht;

.field private d:Lo/fhm;

.field private e:Landroid/widget/Button;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/Button;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/content/Context;

.field private p:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fht$a;->c:Lo/fht;

    .line 75
    iput-object p1, p0, Lo/fht$a;->l:Landroid/content/Context;

    .line 76
    iput-object p2, p0, Lo/fht$a;->p:Landroid/app/Activity;

    .line 77
    return-void
.end method

.method private a(Landroid/app/Dialog;Landroid/view/View;Landroid/content/Context;)V
    .locals 9

    .line 218
    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 219
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 220
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    .line 221
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 222
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    .line 223
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v7

    .line 224
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v8

    .line 225
    invoke-virtual {v6}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v8, 0x2

    sub-int/2addr v0, v1

    iput v0, v7, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 226
    invoke-virtual {v6}, Landroid/view/Display;->getHeight()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v7, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 227
    iput v8, v7, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 228
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 229
    invoke-virtual {v4, v7}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 230
    sget v0, Lcom/huawei/ui/main/R$style;->track_dialog_anim:I

    invoke-virtual {v4, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 231
    return-void
.end method

.method static synthetic b(Lo/fht$a;)Landroid/app/Activity;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/fht$a;->p:Landroid/app/Activity;

    return-object v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 2

    .line 212
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 213
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 214
    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 215
    return-void
.end method

.method static synthetic c(Lo/fht$a;)Landroid/content/Context;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/fht$a;->l:Landroid/content/Context;

    return-object v0
.end method

.method private d()Landroid/support/v4/view/PagerAdapter;
    .locals 6

    .line 106
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 107
    iget-object v0, p0, Lo/fht$a;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->ove_privacy_dialog_page_one:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 108
    iget-object v0, p0, Lo/fht$a;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->ove_privacy_dialog_page_two:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 109
    invoke-direct {p0, v4, v5}, Lo/fht$a;->d(Landroid/view/View;Landroid/view/View;)V

    .line 110
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_privacy_dialog_cancel:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/fht$a;->b:Landroid/widget/Button;

    .line 111
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_privacy_dialog_next:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/fht$a;->e:Landroid/widget/Button;

    .line 112
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_agreement_dialog_disagree:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/fht$a;->a:Landroid/widget/Button;

    .line 113
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_agreement_dialog_agree:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/fht$a;->h:Landroid/widget/Button;

    .line 115
    iget-object v0, p0, Lo/fht$a;->b:Landroid/widget/Button;

    iget-object v1, p0, Lo/fht$a;->l:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 116
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 115
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 117
    iget-object v0, p0, Lo/fht$a;->e:Landroid/widget/Button;

    iget-object v1, p0, Lo/fht$a;->l:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_startup_next:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 118
    iget-object v0, p0, Lo/fht$a;->a:Landroid/widget/Button;

    iget-object v1, p0, Lo/fht$a;->l:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 119
    iget-object v0, p0, Lo/fht$a;->h:Landroid/widget/Button;

    iget-object v1, p0, Lo/fht$a;->l:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_privacy_revoke_auth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 120
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 119
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 121
    iget-object v0, p0, Lo/fht$a;->a:Landroid/widget/Button;

    new-instance v1, Lo/fht$a$3;

    invoke-direct {v1, p0}, Lo/fht$a$3;-><init>(Lo/fht$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    iget-object v0, p0, Lo/fht$a;->h:Landroid/widget/Button;

    new-instance v1, Lo/fht$a$4;

    invoke-direct {v1, p0}, Lo/fht$a$4;-><init>(Lo/fht$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    iget-object v0, p0, Lo/fht$a;->b:Landroid/widget/Button;

    new-instance v1, Lo/fht$a$1;

    invoke-direct {v1, p0}, Lo/fht$a$1;-><init>(Lo/fht$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 158
    iget-object v0, p0, Lo/fht$a;->e:Landroid/widget/Button;

    new-instance v1, Lo/fht$a$2;

    invoke-direct {v1, p0}, Lo/fht$a$2;-><init>(Lo/fht$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 165
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    new-instance v0, Lo/fhn;

    invoke-direct {v0, v3}, Lo/fhn;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private d(Landroid/view/View;Landroid/view/View;)V
    .locals 9

    .line 178
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_ove_agreement_agree_text:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fht$a;->i:Landroid/widget/TextView;

    .line 179
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_privacy_eu_text_one:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fht$a;->f:Landroid/widget/TextView;

    .line 180
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_privacy_eu_text_two:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fht$a;->k:Landroid/widget/TextView;

    .line 181
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_privacy_other_text_one:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fht$a;->g:Landroid/widget/TextView;

    .line 183
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v4

    .line 184
    const/4 v0, 0x5

    if-ne v0, v4, :cond_0

    .line 185
    iget-object v0, p0, Lo/fht$a;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_privacy_Singapore_one:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 187
    :cond_0
    iget-object v0, p0, Lo/fht$a;->i:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 188
    iget-object v0, p0, Lo/fht$a;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fht$a;->l:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 189
    iget-object v0, p0, Lo/fht$a;->k:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 190
    iget-object v0, p0, Lo/fht$a;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fht$a;->l:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 192
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 193
    iget-object v0, p0, Lo/fht$a;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 195
    :cond_1
    iget-object v0, p0, Lo/fht$a;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 196
    iget-object v0, p0, Lo/fht$a;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 198
    :goto_0
    iget-object v0, p0, Lo/fht$a;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 199
    iget-object v0, p0, Lo/fht$a;->l:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_privacy_eu_three:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 200
    new-instance v6, Landroid/text/SpannableString;

    iget-object v0, p0, Lo/fht$a;->l:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_privacy_eu_two:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 203
    invoke-virtual {v6}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    .line 204
    new-instance v8, Lo/fhs;

    iget-object v0, p0, Lo/fht$a;->l:Landroid/content/Context;

    const-string v1, "HealthPrivacy"

    invoke-direct {v8, v0, v1}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 205
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    const v1, -0xffff01

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v7

    const/16 v2, 0x21

    invoke-virtual {v6, v0, v7, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 207
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v7

    const/16 v1, 0x11

    invoke-virtual {v6, v8, v7, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 208
    iget-object v0, p0, Lo/fht$a;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    return-void
.end method

.method static synthetic e(Lo/fht$a;)Lo/fhm;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/fht$a;->d:Lo/fhm;

    return-object v0
.end method

.method static synthetic e(Lo/fht$a;Landroid/content/Context;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lo/fht$a;->b(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public e()Lo/fht;
    .locals 9

    .line 81
    new-instance v0, Lo/fht;

    iget-object v1, p0, Lo/fht$a;->l:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$style;->CustomDialog:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fht;-><init>(Landroid/content/Context;ILo/fht$4;)V

    iput-object v0, p0, Lo/fht$a;->c:Lo/fht;

    .line 83
    iget-object v0, p0, Lo/fht$a;->l:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 84
    sget v0, Lcom/huawei/ui/main/R$layout;->ove_privacy_dialog_layout:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 86
    new-instance v6, Landroid/util/TypedValue;

    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 87
    iget-object v0, p0, Lo/fht$a;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$attr;->customDialogStyleRefer:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v6, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 88
    iget-object v0, p0, Lo/fht$a;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, v6, Landroid/util/TypedValue;->resourceId:I

    sget-object v2, Lcom/huawei/ui/main/R$styleable;->customDialogDefinition:[I

    .line 89
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v7

    .line 91
    iget v0, v6, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    .line 92
    sget v0, Lcom/huawei/ui/main/R$styleable;->customDialogDefinition_dialogBackground:I

    invoke-virtual {v7, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_0

    .line 94
    :cond_0
    iget-object v0, p0, Lo/fht$a;->l:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$drawable;->activity_dialog_bg:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 96
    :goto_0
    invoke-virtual {v5, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 97
    iget-object v0, p0, Lo/fht$a;->c:Lo/fht;

    iget-object v1, p0, Lo/fht$a;->l:Landroid/content/Context;

    invoke-direct {p0, v0, v5, v1}, Lo/fht$a;->a(Landroid/app/Dialog;Landroid/view/View;Landroid/content/Context;)V

    .line 98
    sget v0, Lcom/huawei/ui/main/R$id;->viewpager:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fhm;

    iput-object v0, p0, Lo/fht$a;->d:Lo/fhm;

    .line 99
    iget-object v0, p0, Lo/fht$a;->d:Lo/fhm;

    invoke-direct {p0}, Lo/fht$a;->d()Landroid/support/v4/view/PagerAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fhm;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 100
    iget-object v0, p0, Lo/fht$a;->c:Lo/fht;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fht;->setCancelable(Z)V

    .line 101
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 102
    iget-object v0, p0, Lo/fht$a;->c:Lo/fht;

    return-object v0
.end method
