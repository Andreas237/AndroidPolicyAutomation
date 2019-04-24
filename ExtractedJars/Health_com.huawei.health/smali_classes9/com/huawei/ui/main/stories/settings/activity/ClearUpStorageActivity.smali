.class public Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/ProgressBar;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/content/Context;

.field private e:Landroid/view/View;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/Button;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/view/View;

.field private k:Landroid/widget/ImageView;

.field private l:I

.field private m:Landroid/os/Handler;

.field private n:Landroid/view/View;

.field private o:Ljava/lang/String;

.field private p:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->d:Landroid/content/Context;

    .line 51
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->o:Ljava/lang/String;

    .line 52
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->l:I

    .line 54
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->m:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->o:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->o:Ljava/lang/String;

    return-object v0
.end method

.method private b()V
    .locals 4

    .line 122
    const-string v0, "ClearUpStorageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "findRubbishSpaceSize()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e(I)V

    .line 124
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;-><init>(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 138
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 139
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->l:I

    return v0
.end method

.method private c()V
    .locals 4

    .line 76
    const-string v0, "ClearUpStorageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    sget v0, Lcom/huawei/ui/main/R$id;->center_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e:Landroid/view/View;

    .line 79
    sget v0, Lcom/huawei/ui/main/R$id;->check_progress_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->b:Landroid/widget/ProgressBar;

    .line 80
    sget v0, Lcom/huawei/ui/main/R$id;->tv_app_circle_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->c:Landroid/widget/TextView;

    .line 81
    sget v0, Lcom/huawei/ui/main/R$id;->panel_mutile_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->a:Landroid/view/View;

    .line 82
    sget v0, Lcom/huawei/ui/main/R$id;->tv_tip_one_textview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->f:Landroid/widget/TextView;

    .line 83
    sget v0, Lcom/huawei/ui/main/R$id;->tv_tip_two_textview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->h:Landroid/widget/TextView;

    .line 84
    sget v0, Lcom/huawei/ui/main/R$id;->iv_clear_over_icon:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->k:Landroid/widget/ImageView;

    .line 85
    sget v0, Lcom/huawei/ui/main/R$id;->pannel_clear_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->i:Landroid/view/View;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->clear_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->g:Landroid/widget/Button;

    .line 87
    sget v0, Lcom/huawei/ui/main/R$id;->panel_not_litter:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->n:Landroid/view/View;

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->tv_not_litter_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->p:Landroid/widget/TextView;

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->g:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;-><init>(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Landroid/content/Context;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;I)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Landroid/os/Handler;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->m:Landroid/os/Handler;

    return-object v0
.end method

.method private e(I)V
    .locals 10

    .line 142
    const-string v0, "ClearUpStorageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateClearUpUI state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    iput p1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->l:I

    .line 144
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 146
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->b:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_social_clearup_storage_scaning:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->i:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 152
    goto/16 :goto_0

    .line 154
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->o:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->b:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_social_clearup_storage_scaning:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->i:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_social_clearup_storage_no_temporary_file:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 163
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->b:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 168
    const/high16 v0, -0x28000000

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->o:Ljava/lang/String;

    const-string v1, " "

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 170
    new-instance v8, Landroid/text/SpannableStringBuilder;

    invoke-direct {v8, v7}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 171
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->clear_up_circle_big_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v9, v0

    .line 172
    const-string v0, "ClearUpStorageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateClearUpUI SCAN_STORAGE_FINISH tepSizeStr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " tepTextSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    new-instance v0, Landroid/text/style/TextAppearanceSpan;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v9

    move-object v4, v6

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Landroid/text/style/TextAppearanceSpan;-><init>(Ljava/lang/String;IILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    const/4 v2, 0x0

    const/16 v3, 0x22

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_social_clearup_storage_clear_temporary_file:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->g:Landroid/widget/Button;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_social_clearup_storage_button_text:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 180
    goto/16 :goto_0

    .line 182
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->b:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 187
    const/high16 v0, -0x28000000

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->o:Ljava/lang/String;

    const-string v1, " "

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 189
    new-instance v8, Landroid/text/SpannableStringBuilder;

    invoke-direct {v8, v7}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 190
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->clear_up_circle_big_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v9, v0

    .line 191
    new-instance v0, Landroid/text/style/TextAppearanceSpan;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v9

    move-object v4, v6

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Landroid/text/style/TextAppearanceSpan;-><init>(Ljava/lang/String;IILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    const/4 v2, 0x0

    const/16 v3, 0x22

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 193
    const-string v0, "ClearUpStorageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateClearUpUI 2222 spanBuilder = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  tepTextSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_social_clearup_storage_clear_doing:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->i:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 197
    goto :goto_0

    .line 199
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->b:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_social_clearup_storage_clear_finish:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->g:Landroid/widget/Button;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_social_clearup_storage_button_finish:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 209
    .line 213
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0x65 -> :sswitch_1
        0x6e -> :sswitch_2
        0x6f -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 59
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 60
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_clearup_storage:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->setContentView(I)V

    .line 61
    iput-object p0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->d:Landroid/content/Context;

    .line 62
    const-string v0, "ClearUpStorageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->c()V

    .line 65
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->b()V

    .line 66
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 70
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 71
    const-string v0, "ClearUpStorageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->m:Landroid/os/Handler;

    .line 73
    return-void
.end method
