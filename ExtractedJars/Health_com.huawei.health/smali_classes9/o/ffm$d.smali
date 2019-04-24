.class public Lo/ffm$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ffm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:Lo/egb;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Landroid/os/Handler;

.field private g:Landroid/widget/EditText;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/Toast;

.field private k:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ffm$d;->b:Landroid/content/Context;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ffm$d;->c:Ljava/lang/String;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ffm$d;->e:Landroid/os/Handler;

    .line 75
    iput-object p1, p0, Lo/ffm$d;->b:Landroid/content/Context;

    .line 76
    iput-object p2, p0, Lo/ffm$d;->e:Landroid/os/Handler;

    .line 77
    return-void
.end method

.method static synthetic a(Lo/ffm$d;)Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/ffm$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lo/ffm$d;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 59
    iput-object p1, p0, Lo/ffm$d;->c:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lo/ffm$d;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lo/ffm$d;->d(Ljava/lang/String;Landroid/content/Context;)V

    return-void
.end method

.method static synthetic b(Lo/ffm$d;)Landroid/widget/EditText;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/ffm$d;->g:Landroid/widget/EditText;

    return-object v0
.end method

.method private b(Landroid/view/View;)V
    .locals 6

    .line 179
    sget v0, Lcom/huawei/ui/main/R$id;->custom_target_editText:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lo/ffm$d;->g:Landroid/widget/EditText;

    .line 183
    iget-object v0, p0, Lo/ffm$d;->g:Landroid/widget/EditText;

    const/16 v1, 0x2002

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->custom_target_under_line:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ffm$d;->h:Landroid/widget/ImageView;

    .line 185
    iget-object v0, p0, Lo/ffm$d;->g:Landroid/widget/EditText;

    new-instance v1, Lo/ffm$d$5;

    invoke-direct {v1, p0}, Lo/ffm$d$5;-><init>(Lo/ffm$d;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 191
    new-instance v4, Ljava/util/Timer;

    invoke-direct {v4}, Ljava/util/Timer;-><init>()V

    .line 192
    new-instance v0, Lo/ffm$d$4;

    invoke-direct {v0, p0}, Lo/ffm$d$4;-><init>(Lo/ffm$d;)V

    const-wide/16 v1, 0x12c

    invoke-virtual {v4, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 198
    sget v0, Lcom/huawei/ui/main/R$id;->custom_target_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/egb;

    .line 200
    iget-object v0, p0, Lo/ffm$d;->g:Landroid/widget/EditText;

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 201
    sget v0, Lcom/huawei/ui/main/R$id;->custom_target_tip:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/ffm$d;->a:Lo/egb;

    .line 202
    iget-object v0, p0, Lo/ffm$d;->a:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 203
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    iget-object v0, p0, Lo/ffm$d;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ffm$d;->d:Ljava/lang/String;

    .line 205
    iget-object v0, p0, Lo/ffm$d;->d:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 207
    :cond_0
    iget-object v0, p0, Lo/ffm$d;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ffm$d;->d:Ljava/lang/String;

    .line 208
    iget-object v0, p0, Lo/ffm$d;->d:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 210
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/ffm$d;)Landroid/widget/Button;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/ffm$d;->k:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic d(Lo/ffm$d;)Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/ffm$d;->d:Ljava/lang/String;

    return-object v0
.end method

.method private d(Ljava/lang/String;Landroid/content/Context;)V
    .locals 2

    .line 213
    iget-object v0, p0, Lo/ffm$d;->i:Landroid/widget/Toast;

    if-nez v0, :cond_0

    .line 214
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lo/ffm$d;->i:Landroid/widget/Toast;

    goto :goto_0

    .line 216
    :cond_0
    iget-object v0, p0, Lo/ffm$d;->i:Landroid/widget/Toast;

    invoke-virtual {v0, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 217
    iget-object v0, p0, Lo/ffm$d;->i:Landroid/widget/Toast;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V

    .line 219
    :goto_0
    iget-object v0, p0, Lo/ffm$d;->i:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 220
    return-void
.end method

.method static synthetic e(Lo/ffm$d;)Landroid/content/Context;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/ffm$d;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic g(Lo/ffm$d;)Landroid/os/Handler;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/ffm$d;->e:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic i(Lo/ffm$d;)Landroid/widget/ImageView;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/ffm$d;->h:Landroid/widget/ImageView;

    return-object v0
.end method


# virtual methods
.method public b()Lo/ffm;
    .locals 7

    .line 80
    iget-object v0, p0, Lo/ffm$d;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 81
    new-instance v4, Lo/ffm;

    iget-object v0, p0, Lo/ffm$d;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$style;->TrackDialog:I

    invoke-direct {v4, v0, v1}, Lo/ffm;-><init>(Landroid/content/Context;I)V

    .line 82
    sget v0, Lcom/huawei/ui/main/R$layout;->track_dialog_custom_target_item_emui9:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 86
    invoke-direct {p0, v5}, Lo/ffm$d;->b(Landroid/view/View;)V

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/Button;

    .line 89
    new-instance v0, Lo/ffm$d$1;

    invoke-direct {v0, p0, v4}, Lo/ffm$d$1;-><init>(Lo/ffm$d;Lo/ffm;)V

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    sget v0, Lcom/huawei/ui/main/R$id;->ok:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/ffm$d;->k:Landroid/widget/Button;

    .line 96
    iget-object v0, p0, Lo/ffm$d;->k:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 97
    iget-object v0, p0, Lo/ffm$d;->g:Landroid/widget/EditText;

    new-instance v1, Lo/ffm$d$3;

    invoke-direct {v1, p0}, Lo/ffm$d$3;-><init>(Lo/ffm$d;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 132
    iget-object v0, p0, Lo/ffm$d;->k:Landroid/widget/Button;

    new-instance v1, Lo/ffm$d$2;

    invoke-direct {v1, p0, v4}, Lo/ffm$d$2;-><init>(Lo/ffm$d;Lo/ffm;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v0}, Lo/ffm;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 173
    invoke-virtual {v4, v5}, Lo/ffm;->setContentView(Landroid/view/View;)V

    .line 174
    return-object v4
.end method
