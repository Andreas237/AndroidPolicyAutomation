.class public Lo/bjy;
.super Landroid/app/AlertDialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bjy$c;
    }
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Landroid/widget/LinearLayout;

.field protected c:Landroid/widget/TextView;

.field protected d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private f:Z

.field private g:Lo/bjy$c;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/ImageView;

.field private k:F


# direct methods
.method public constructor <init>(Landroid/app/Activity;ZLo/bjy$c;)V
    .locals 1

    .line 93
    invoke-direct {p0, p1}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjy;->g:Lo/bjy$c;

    .line 94
    iput-object p1, p0, Lo/bjy;->a:Landroid/app/Activity;

    .line 95
    iput-boolean p2, p0, Lo/bjy;->f:Z

    .line 96
    iput-object p3, p0, Lo/bjy;->g:Lo/bjy$c;

    .line 97
    invoke-direct {p0}, Lo/bjy;->c()V

    .line 98
    return-void
.end method

.method static synthetic a(Lo/bjy;)F
    .locals 1

    .line 32
    iget v0, p0, Lo/bjy;->k:F

    return v0
.end method

.method static synthetic a(Lo/bjy;F)F
    .locals 0

    .line 32
    iput p1, p0, Lo/bjy;->k:F

    return p1
.end method

.method private a(Landroid/view/View;)V
    .locals 1

    .line 145
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bjy;->e:Landroid/widget/ImageView;

    .line 146
    sget v0, Lcom/huawei/android/sns/R$id;->text_warning_info:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bjy;->d:Landroid/widget/TextView;

    .line 147
    sget v0, Lcom/huawei/android/sns/R$id;->text_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bjy;->h:Landroid/widget/TextView;

    .line 148
    sget v0, Lcom/huawei/android/sns/R$id;->image_two_dimcode:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bjy;->i:Landroid/widget/ImageView;

    .line 149
    sget v0, Lcom/huawei/android/sns/R$id;->text_info:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bjy;->c:Landroid/widget/TextView;

    .line 151
    invoke-direct {p0, p1}, Lo/bjy;->d(Landroid/view/View;)V

    .line 153
    return-void
.end method

.method private b()V
    .locals 2

    .line 210
    iget-boolean v0, p0, Lo/bjy;->f:Z

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lo/bjy;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_towdimcode_info:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 213
    iget-object v0, p0, Lo/bjy;->d:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 219
    :cond_0
    iget-object v0, p0, Lo/bjy;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_sweep_and_add_friend:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 220
    iget-object v0, p0, Lo/bjy;->d:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 222
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/bjy;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/bjy;->d()V

    return-void
.end method

.method private c()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lo/bjy;->b:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    .line 133
    iget-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 134
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_self_two_dimcode:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bjy;->b:Landroid/widget/LinearLayout;

    .line 136
    :cond_0
    return-void
.end method

.method private d()V
    .locals 1

    .line 201
    invoke-virtual {p0}, Lo/bjy;->dismiss()V

    .line 202
    iget-object v0, p0, Lo/bjy;->g:Lo/bjy$c;

    invoke-interface {v0}, Lo/bjy$c;->a()V

    .line 203
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 2

    .line 162
    sget v0, Lcom/huawei/android/sns/R$id;->scroll_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ScrollView;

    .line 163
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Landroid/widget/ScrollView;->setOverScrollMode(I)V

    .line 164
    new-instance v0, Lo/bjy$1;

    invoke-direct {v0, p0}, Lo/bjy$1;-><init>(Lo/bjy;)V

    invoke-virtual {v1, v0}, Landroid/widget/ScrollView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 194
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 3

    .line 241
    iget-object v0, p0, Lo/bjy;->e:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 242
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 261
    iget-object v0, p0, Lo/bjy;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .line 231
    new-instance v0, Lo/bjx;

    invoke-direct {v0}, Lo/bjx;-><init>()V

    iget-object v1, p0, Lo/bjy;->a:Landroid/app/Activity;

    iget-object v2, p0, Lo/bjy;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, p1, v2}, Lo/bjx;->d(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 232
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    .line 251
    new-instance v0, Lo/biw;

    invoke-direct {v0}, Lo/biw;-><init>()V

    iget-object v1, p0, Lo/bjy;->i:Landroid/widget/ImageView;

    const/16 v2, 0x12c

    const/16 v3, 0x12c

    invoke-virtual {v0, p1, v2, v3, v1}, Lo/biw;->b(Ljava/lang/String;IILandroid/widget/ImageView;)V

    .line 252
    return-void
.end method

.method public e()V
    .locals 6

    .line 287
    iget-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 289
    :goto_0
    iget-object v0, p0, Lo/bjy;->e:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 290
    iget-object v0, p0, Lo/bjy;->i:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 291
    iget-object v0, p0, Lo/bjy;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 292
    iget-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_head_image_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 293
    iget-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_head_image_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 294
    iget-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v2, :cond_1

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_qrcode_offset:I

    goto :goto_1

    :cond_1
    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_head_image_margin_top:I

    :goto_1
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 295
    iget-object v0, p0, Lo/bjy;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 297
    iget-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_qrcode_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 298
    iget-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_qrcode_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 299
    iget-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_qrcode_margin_top:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 300
    iget-object v0, p0, Lo/bjy;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 302
    iget-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_text_info_margin_top:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 303
    iget-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v2, :cond_2

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_qrcode_offset:I

    goto :goto_2

    :cond_2
    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_text_info_margin_bottom:I

    :goto_2
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 304
    iget-object v0, p0, Lo/bjy;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 306
    iget-object v0, p0, Lo/bjy;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->requestLayout()V

    .line 307
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 6

    .line 271
    iget-boolean v0, p0, Lo/bjy;->f:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 273
    iget-object v0, p0, Lo/bjy;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_conversation_format_diff_year:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/bog;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 274
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 276
    iget-object v0, p0, Lo/bjy;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 277
    iget-object v0, p0, Lo/bjy;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bjy;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_qr_expire_time:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 280
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 117
    invoke-direct {p0}, Lo/bjy;->c()V

    .line 118
    iget-object v0, p0, Lo/bjy;->b:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lo/bjy;->setView(Landroid/view/View;)V

    .line 119
    iget-object v0, p0, Lo/bjy;->b:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lo/bjy;->a(Landroid/view/View;)V

    .line 120
    invoke-direct {p0}, Lo/bjy;->b()V

    .line 121
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onCreate(Landroid/os/Bundle;)V

    .line 122
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/bjy;->setCanceledOnTouchOutside(Z)V

    .line 123
    return-void
.end method
