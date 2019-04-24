.class public Lo/cfz;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ProgressBar;

.field private b:Landroid/widget/TextView;

.field private c:Lo/egd;

.field private d:I

.field private e:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 35
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/cfz;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 40
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    const/16 v0, 0x64

    iput v0, p0, Lo/cfz;->d:I

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfz;->e:Landroid/view/View$OnClickListener;

    .line 41
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_common_ui_download_progressbar:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 42
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->download_progressbar:I

    invoke-virtual {p0, v0}, Lo/cfz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    .line 43
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->download_button:I

    invoke-virtual {p0, v0}, Lo/cfz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/cfz;->c:Lo/egd;

    .line 45
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    iget v1, p0, Lo/cfz;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 46
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 47
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->download_text:I

    invoke-virtual {p0, v0}, Lo/cfz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cfz;->b:Landroid/widget/TextView;

    .line 48
    invoke-static {p1}, Lo/cxa;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lo/egd;->setTextSize(F)V

    .line 51
    :cond_0
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 52
    return-void
.end method

.method private d(I)Ljava/lang/String;
    .locals 4

    .line 100
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v2

    .line 101
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 102
    const-string v3, ""

    .line 103
    int-to-float v0, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-virtual {v2, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    .line 104
    return-object v3
.end method


# virtual methods
.method public b(I)V
    .locals 2

    .line 162
    iget-object v0, p0, Lo/cfz;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 163
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 164
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 165
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/cfz;->setEnabled(Z)V

    .line 166
    invoke-virtual {p0, p1}, Lo/cfz;->setProgress(I)V

    .line 167
    if-ltz p1, :cond_0

    iget v0, p0, Lo/cfz;->d:I

    if-gt p1, v0, :cond_0

    .line 169
    invoke-direct {p0, p1}, Lo/cfz;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cfz;->setButtonText(Ljava/lang/String;)V

    .line 171
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 146
    iget-object v0, p0, Lo/cfz;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    iget v1, p0, Lo/cfz;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 150
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/cfz;->setProgress(I)V

    .line 151
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/cfz;->setEnabled(Z)V

    .line 152
    invoke-virtual {p0, p1}, Lo/cfz;->setButtonText(Ljava/lang/String;)V

    .line 154
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 179
    iget-object v0, p0, Lo/cfz;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 180
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 181
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 182
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/cfz;->setProgress(I)V

    .line 183
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/cfz;->setEnabled(Z)V

    .line 184
    invoke-virtual {p0, p1}, Lo/cfz;->setButtonText(Ljava/lang/String;)V

    .line 185
    return-void
.end method

.method public d(Ljava/lang/String;I)V
    .locals 2

    .line 194
    iget-object v0, p0, Lo/cfz;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 195
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 196
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 197
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/cfz;->setEnabled(Z)V

    .line 198
    invoke-virtual {p0, p2}, Lo/cfz;->setProgress(I)V

    .line 199
    invoke-virtual {p0, p1}, Lo/cfz;->setButtonText(Ljava/lang/String;)V

    .line 200
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 223
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/cfz;->setProgress(I)V

    .line 224
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/cfz;->setEnabled(Z)V

    .line 225
    invoke-virtual {p0, p1}, Lo/cfz;->setButtonText(Ljava/lang/String;)V

    .line 226
    iget-object v0, p0, Lo/cfz;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 227
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 229
    iget-object v0, p0, Lo/cfz;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    iget-object v0, p0, Lo/cfz;->b:Landroid/widget/TextView;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 233
    return-void
.end method

.method public e(Ljava/lang/String;I)V
    .locals 2

    .line 209
    iget-object v0, p0, Lo/cfz;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 210
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 211
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 212
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/cfz;->setEnabled(Z)V

    .line 213
    invoke-virtual {p0, p2}, Lo/cfz;->setProgress(I)V

    .line 214
    invoke-virtual {p0, p1}, Lo/cfz;->setButtonText(Ljava/lang/String;)V

    .line 215
    return-void
.end method

.method public getClicked()Z
    .locals 1

    .line 114
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->isClickable()Z

    move-result v0

    return v0
.end method

.method public getOnButtonClickListener()Landroid/view/View$OnClickListener;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/cfz;->e:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public getProgress()I
    .locals 1

    .line 78
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v0

    return v0
.end method

.method public getmButton()Lo/egd;
    .locals 1

    .line 73
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    return-object v0
.end method

.method public getmProgressBar()Landroid/widget/ProgressBar;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public setButtonBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 135
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    invoke-virtual {v0, p1}, Lo/egd;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 137
    return-void
.end method

.method public setButtonText(Ljava/lang/String;)V
    .locals 1

    .line 83
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    invoke-virtual {v0, p1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 84
    return-void
.end method

.method public setClicked(Z)V
    .locals 1

    .line 109
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    invoke-virtual {v0, p1}, Lo/egd;->setClickable(Z)V

    .line 110
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cfz;->c:Lo/egd;

    invoke-virtual {v0, p1}, Lo/egd;->setEnabled(Z)V

    .line 89
    return-void
.end method

.method public setMax(I)V
    .locals 1

    .line 119
    iput p1, p0, Lo/cfz;->d:I

    .line 120
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 121
    return-void
.end method

.method public setOnButtonClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/cfz;->e:Landroid/view/View$OnClickListener;

    .line 64
    return-void
.end method

.method public setProgress(I)V
    .locals 3

    .line 93
    mul-int/lit8 v0, p1, 0x64

    iget v1, p0, Lo/cfz;->d:I

    div-int v2, v0, v1

    .line 94
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 96
    return-void
.end method

.method public setProgressBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 125
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 126
    return-void
.end method

.method public setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 130
    iget-object v0, p0, Lo/cfz;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 131
    return-void
.end method
