.class public Lo/chj;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/chj$b;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/LinearLayout$LayoutParams;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/LinearLayout$LayoutParams;

.field private h:Landroid/widget/LinearLayout$LayoutParams;

.field private i:Landroid/widget/LinearLayout$LayoutParams;

.field private k:Landroid/widget/LinearLayout$LayoutParams;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 44
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 34
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->d:Landroid/widget/LinearLayout$LayoutParams;

    .line 35
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->k:Landroid/widget/LinearLayout$LayoutParams;

    .line 36
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->f:Landroid/widget/LinearLayout$LayoutParams;

    .line 37
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->h:Landroid/widget/LinearLayout$LayoutParams;

    .line 38
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->i:Landroid/widget/LinearLayout$LayoutParams;

    .line 45
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/chj;->c:Landroid/widget/ImageView;

    .line 46
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/chj;->a:Landroid/widget/TextView;

    .line 47
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/chj;->e:Landroid/widget/TextView;

    .line 48
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/chj;->b:Landroid/widget/TextView;

    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 53
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lo/chj;->setGravity(I)V

    .line 57
    iget-object v0, p0, Lo/chj;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_13_sp:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 58
    iget-object v0, p0, Lo/chj;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$color;->sug_fitness_detils_50:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 61
    iget-object v0, p0, Lo/chj;->e:Landroid/widget/TextView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 62
    iget-object v0, p0, Lo/chj;->e:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 63
    iget-object v0, p0, Lo/chj;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_20_sp:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 65
    iget-object v0, p0, Lo/chj;->b:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 66
    iget-object v0, p0, Lo/chj;->b:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 67
    iget-object v0, p0, Lo/chj;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_13_sp:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 69
    iget-object v0, p0, Lo/chj;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_sportdetail_pace:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 73
    iget-object v0, p0, Lo/chj;->d:Landroid/widget/LinearLayout$LayoutParams;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->activity_horizontal_margin:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 75
    iget-object v0, p0, Lo/chj;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/chj;->d:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0, v0, v1}, Lo/chj;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 78
    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 80
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 82
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 84
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 85
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 86
    const/4 v0, 0x0

    iput v0, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 88
    iget-object v0, p0, Lo/chj;->h:Landroid/widget/LinearLayout$LayoutParams;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_margin_2dp:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 89
    iget-object v0, p0, Lo/chj;->h:Landroid/widget/LinearLayout$LayoutParams;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_margin_2dp:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 91
    iget-object v0, p0, Lo/chj;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/chj;->f:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v5, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    iget-object v0, p0, Lo/chj;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/chj;->h:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v5, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 94
    iget-object v0, p0, Lo/chj;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/chj;->k:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v4, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 95
    invoke-virtual {v4, v5, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 97
    invoke-virtual {p0, v4}, Lo/chj;->addView(Landroid/view/View;)V

    .line 100
    iget-object v0, p0, Lo/chj;->i:Landroid/widget/LinearLayout$LayoutParams;

    const/16 v1, 0x190

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 101
    iget-object v0, p0, Lo/chj;->i:Landroid/widget/LinearLayout$LayoutParams;

    const/16 v1, 0x1f4

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 102
    iget-object v0, p0, Lo/chj;->i:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0, v0}, Lo/chj;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 108
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->d:Landroid/widget/LinearLayout$LayoutParams;

    .line 35
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->k:Landroid/widget/LinearLayout$LayoutParams;

    .line 36
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->f:Landroid/widget/LinearLayout$LayoutParams;

    .line 37
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->h:Landroid/widget/LinearLayout$LayoutParams;

    .line 38
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->i:Landroid/widget/LinearLayout$LayoutParams;

    .line 111
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 114
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->d:Landroid/widget/LinearLayout$LayoutParams;

    .line 35
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->k:Landroid/widget/LinearLayout$LayoutParams;

    .line 36
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->f:Landroid/widget/LinearLayout$LayoutParams;

    .line 37
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->h:Landroid/widget/LinearLayout$LayoutParams;

    .line 38
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/chj;->i:Landroid/widget/LinearLayout$LayoutParams;

    .line 115
    return-void
.end method

.method private c(IZ)I
    .locals 4

    .line 158
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 159
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 161
    const/high16 v0, 0x40000000    # 2.0f

    if-ne v2, v0, :cond_0

    .line 162
    move v1, v3

    goto :goto_1

    .line 164
    :cond_0
    if-eqz p2, :cond_1

    .line 165
    const/16 v1, 0x1f4

    goto :goto_0

    .line 167
    :cond_1
    const/16 v1, 0x190

    .line 170
    :goto_0
    const/high16 v0, -0x80000000

    if-ne v2, v0, :cond_2

    .line 171
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 174
    :cond_2
    :goto_1
    return v1
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 135
    iget-object v0, p0, Lo/chj;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    return-void
.end method

.method public d()V
    .locals 2

    .line 131
    iget-object v0, p0, Lo/chj;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 132
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lo/chj;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    return-void
.end method

.method public e(ZLandroid/content/Context;Z)V
    .locals 8

    .line 192
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 193
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_32:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 194
    if-nez p1, :cond_0

    .line 195
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_size_40:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 198
    :cond_0
    iget-object v0, p0, Lo/chj;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 199
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 200
    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 201
    iget-object v0, p0, Lo/chj;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 202
    iget-object v0, p0, Lo/chj;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 203
    if-nez p3, :cond_1

    .line 204
    iget-object v0, p0, Lo/chj;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 205
    iget-object v0, p0, Lo/chj;->b:Landroid/widget/TextView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 206
    iget-object v0, p0, Lo/chj;->b:Landroid/widget/TextView;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {p2, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 208
    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 151
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 152
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/chj;->c(IZ)I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p2, v1}, Lo/chj;->c(IZ)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lo/chj;->setMeasuredDimension(II)V

    .line 153
    return-void
.end method

.method public setGroupSize(II)V
    .locals 1

    .line 145
    iget-object v0, p0, Lo/chj;->i:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 146
    iget-object v0, p0, Lo/chj;->i:Landroid/widget/LinearLayout$LayoutParams;

    iput p2, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 147
    iget-object v0, p0, Lo/chj;->i:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0, v0}, Lo/chj;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 148
    return-void
.end method

.method public setItemView(Lo/chj$b;)V
    .locals 4

    .line 178
    if-nez p1, :cond_0

    .line 179
    const-string v0, "Track_SportDetailItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setItemView data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    return-void

    .line 183
    :cond_0
    iget-object v0, p0, Lo/chj;->c:Landroid/widget/ImageView;

    iget-object v1, p1, Lo/chj$b;->e:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 184
    iget-object v0, p0, Lo/chj;->a:Landroid/widget/TextView;

    iget-object v1, p1, Lo/chj$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    iget-object v0, p0, Lo/chj;->e:Landroid/widget/TextView;

    iget-object v1, p1, Lo/chj$b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    iget-object v0, p0, Lo/chj;->b:Landroid/widget/TextView;

    iget-object v1, p1, Lo/chj$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    return-void
.end method

.method public setTextColor(I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 119
    iget-object v0, p0, Lo/chj;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 120
    iget-object v0, p0, Lo/chj;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 121
    iget-object v0, p0, Lo/chj;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 122
    iget-object v0, p0, Lo/chj;->a:Landroid/widget/TextView;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 123
    return-void
.end method

.method public setValueTextSize(F)V
    .locals 2

    .line 127
    iget-object v0, p0, Lo/chj;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 128
    return-void
.end method
