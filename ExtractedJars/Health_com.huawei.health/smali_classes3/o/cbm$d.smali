.class public Lo/cbm$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cbm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:Lo/fhm;

.field b:Lo/cbm;

.field private c:Z

.field private d:Landroid/widget/Button;

.field private e:Landroid/widget/Button;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/Button;

.field private h:Landroid/widget/Button;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbm$d;->c:Z

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbm$d;->b:Lo/cbm;

    .line 76
    iput-object p1, p0, Lo/cbm$d;->p:Landroid/content/Context;

    .line 77
    return-void
.end method

.method private a(Landroid/view/View;Landroid/view/View;)V
    .locals 12

    .line 176
    const v0, 0x7f1217f4

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cbm$d;->k:Landroid/widget/TextView;

    .line 177
    const v0, 0x7f1217ed

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cbm$d;->i:Landroid/widget/TextView;

    .line 178
    const v0, 0x7f1217ee

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cbm$d;->f:Landroid/widget/TextView;

    .line 179
    const v0, 0x7f1217ef

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cbm$d;->o:Landroid/widget/TextView;

    .line 181
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v3

    .line 182
    const/4 v0, 0x5

    if-ne v0, v3, :cond_0

    .line 183
    iget-object v0, p0, Lo/cbm$d;->i:Landroid/widget/TextView;

    const v1, 0x7f02025e

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 186
    :cond_0
    iget-object v0, p0, Lo/cbm$d;->k:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 187
    iget-object v0, p0, Lo/cbm$d;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lo/cbm$d;->p:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 188
    iget-object v0, p0, Lo/cbm$d;->f:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 189
    iget-object v0, p0, Lo/cbm$d;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/cbm$d;->p:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 191
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 192
    iget-object v0, p0, Lo/cbm$d;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 194
    :cond_1
    iget-object v0, p0, Lo/cbm$d;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 195
    iget-object v0, p0, Lo/cbm$d;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 198
    :goto_0
    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const v1, 0x7f020003

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 199
    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const v1, 0x7f020225

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 200
    new-instance v6, Landroid/text/SpannableString;

    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    const v2, 0x7f020231

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 202
    new-instance v7, Landroid/text/SpannableString;

    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    const v2, 0x7f020224

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 204
    invoke-virtual {v6}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 205
    new-instance v9, Lo/fhs;

    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const-string v1, "HealthUserAgreement"

    invoke-direct {v9, v0, v1}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 206
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v8

    const/16 v2, 0x21

    invoke-virtual {v6, v0, v8, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 208
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v8

    const/16 v1, 0x11

    invoke-virtual {v6, v9, v8, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 209
    iget-object v0, p0, Lo/cbm$d;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    invoke-virtual {v7}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    .line 212
    new-instance v0, Lo/fhs;

    iget-object v1, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const-string v2, "HealthPrivacy"

    invoke-direct {v0, v1, v2}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object v11, v0

    .line 213
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v10

    const/16 v2, 0x21

    invoke-virtual {v7, v0, v10, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 215
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v10

    const/16 v1, 0x11

    invoke-virtual {v7, v11, v10, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 216
    iget-object v0, p0, Lo/cbm$d;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 217
    return-void
.end method

.method private b(Landroid/app/Dialog;Landroid/view/View;Landroid/content/Context;)V
    .locals 9

    .line 220
    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 221
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 222
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 223
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    .line 224
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 225
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    .line 226
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v7

    .line 227
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v8

    .line 228
    invoke-virtual {v6}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v8, 0x2

    sub-int/2addr v0, v1

    iput v0, v7, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 229
    iput v8, v7, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 230
    invoke-virtual {v6}, Landroid/view/Display;->getHeight()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v7, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 231
    invoke-virtual {v4, v7}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 232
    const v0, 0x7f0e03a3

    invoke-virtual {v4, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 233
    return-void
.end method

.method static synthetic b(Lo/cbm$d;)Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Lo/cbm$d;->c:Z

    return v0
.end method

.method static synthetic c(Lo/cbm$d;)Landroid/content/Context;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    return-object v0
.end method

.method private c(Lo/ale;)Landroid/support/v4/view/PagerAdapter;
    .locals 6

    .line 106
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 107
    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f07039c

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 108
    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f07039d

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 109
    invoke-direct {p0, v4, v5}, Lo/cbm$d;->a(Landroid/view/View;Landroid/view/View;)V

    .line 110
    const v0, 0x7f1217f0

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/cbm$d;->e:Landroid/widget/Button;

    .line 111
    const v0, 0x7f1217f1

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/cbm$d;->d:Landroid/widget/Button;

    .line 112
    const v0, 0x7f1217f5

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/cbm$d;->h:Landroid/widget/Button;

    .line 113
    const v0, 0x7f1217f6

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/cbm$d;->g:Landroid/widget/Button;

    .line 115
    iget-object v0, p0, Lo/cbm$d;->e:Landroid/widget/Button;

    iget-object v1, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const v2, 0x7f020200

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
    iget-object v0, p0, Lo/cbm$d;->d:Landroid/widget/Button;

    iget-object v1, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const v2, 0x7f0201fe

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 118
    iget-object v0, p0, Lo/cbm$d;->h:Landroid/widget/Button;

    iget-object v1, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const v2, 0x7f0201ff

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 119
    iget-object v0, p0, Lo/cbm$d;->g:Landroid/widget/Button;

    iget-object v1, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const v2, 0x7f020004

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 120
    iget-object v0, p0, Lo/cbm$d;->h:Landroid/widget/Button;

    new-instance v1, Lo/cbm$d$4;

    invoke-direct {v1, p0}, Lo/cbm$d$4;-><init>(Lo/cbm$d;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    iget-object v0, p0, Lo/cbm$d;->g:Landroid/widget/Button;

    new-instance v1, Lo/cbm$d$1;

    invoke-direct {v1, p0, p1}, Lo/cbm$d$1;-><init>(Lo/cbm$d;Lo/ale;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    iget-object v0, p0, Lo/cbm$d;->e:Landroid/widget/Button;

    new-instance v1, Lo/cbm$d$5;

    invoke-direct {v1, p0}, Lo/cbm$d$5;-><init>(Lo/cbm$d;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    iget-object v0, p0, Lo/cbm$d;->d:Landroid/widget/Button;

    new-instance v1, Lo/cbm$d$3;

    invoke-direct {v1, p0}, Lo/cbm$d$3;-><init>(Lo/cbm$d;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    new-instance v0, Lo/fhn;

    invoke-direct {v0, v3}, Lo/fhn;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static synthetic d(Lo/cbm$d;)Lo/fhm;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/cbm$d;->a:Lo/fhm;

    return-object v0
.end method

.method static synthetic d(Lo/cbm$d;Landroid/content/Context;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lo/cbm$d;->e(Landroid/content/Context;)V

    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 2

    .line 236
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 237
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 238
    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 239
    return-void
.end method


# virtual methods
.method public d(Lo/ale;)Lo/cbm;
    .locals 9

    .line 81
    new-instance v0, Lo/cbm;

    iget-object v1, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const v2, 0x7f0e010b

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/cbm;-><init>(Landroid/content/Context;ILo/cbm$4;)V

    iput-object v0, p0, Lo/cbm$d;->b:Lo/cbm;

    .line 83
    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 84
    const v0, 0x7f07039b

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 86
    new-instance v6, Landroid/util/TypedValue;

    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 87
    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x7f010268

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v6, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 88
    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, v6, Landroid/util/TypedValue;->resourceId:I

    sget-object v2, Lcom/huawei/health/R$styleable;->customDialogDefinition:[I

    .line 89
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v7

    .line 91
    iget v0, v6, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    .line 92
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_0

    .line 94
    :cond_0
    iget-object v0, p0, Lo/cbm$d;->p:Landroid/content/Context;

    const v1, 0x7f050064

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 96
    :goto_0
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 97
    invoke-virtual {v5, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 98
    iget-object v0, p0, Lo/cbm$d;->b:Lo/cbm;

    iget-object v1, p0, Lo/cbm$d;->p:Landroid/content/Context;

    invoke-direct {p0, v0, v5, v1}, Lo/cbm$d;->b(Landroid/app/Dialog;Landroid/view/View;Landroid/content/Context;)V

    .line 99
    const v0, 0x7f1217ea

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fhm;

    iput-object v0, p0, Lo/cbm$d;->a:Lo/fhm;

    .line 100
    iget-object v0, p0, Lo/cbm$d;->a:Lo/fhm;

    invoke-direct {p0, p1}, Lo/cbm$d;->c(Lo/ale;)Landroid/support/v4/view/PagerAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fhm;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 101
    iget-object v0, p0, Lo/cbm$d;->b:Lo/cbm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cbm;->setCancelable(Z)V

    .line 102
    iget-object v0, p0, Lo/cbm$d;->b:Lo/cbm;

    return-object v0
.end method

.method public e(Z)Lo/cbm$d;
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/cbm$d;->c:Z

    .line 72
    return-object p0
.end method
