.class public Lo/etk;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/etk$d;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/LinearLayout$LayoutParams;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/LinearLayout$LayoutParams;

.field private g:Landroid/widget/LinearLayout$LayoutParams;

.field private h:Landroid/widget/LinearLayout$LayoutParams;

.field private i:Landroid/widget/LinearLayout$LayoutParams;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 41
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 31
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->b:Landroid/widget/LinearLayout$LayoutParams;

    .line 32
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->g:Landroid/widget/LinearLayout$LayoutParams;

    .line 33
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->h:Landroid/widget/LinearLayout$LayoutParams;

    .line 34
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->i:Landroid/widget/LinearLayout$LayoutParams;

    .line 35
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->f:Landroid/widget/LinearLayout$LayoutParams;

    .line 42
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/etk;->c:Landroid/widget/ImageView;

    .line 43
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/etk;->d:Landroid/widget/TextView;

    .line 44
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/etk;->a:Landroid/widget/TextView;

    .line 45
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/etk;->e:Landroid/widget/TextView;

    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 48
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/etk;->setOrientation(I)V

    .line 50
    const/16 v0, 0x11

    invoke-virtual {p0, v0}, Lo/etk;->setGravity(I)V

    .line 56
    iget-object v0, p0, Lo/etk;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_12_sp:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 57
    iget-object v0, p0, Lo/etk;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$color;->sug_fitness_detils_50:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    iget-object v0, p0, Lo/etk;->g:Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 60
    iget-object v0, p0, Lo/etk;->a:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 62
    iget-object v0, p0, Lo/etk;->a:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 63
    iget-object v0, p0, Lo/etk;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_15_sp:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 65
    iget-object v0, p0, Lo/etk;->e:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 66
    iget-object v0, p0, Lo/etk;->e:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 67
    iget-object v0, p0, Lo/etk;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_12_sp:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 69
    iget-object v0, p0, Lo/etk;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_sportdetail_pace:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 73
    iget-object v0, p0, Lo/etk;->b:Landroid/widget/LinearLayout$LayoutParams;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->activity_horizontal_margin:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 75
    iget-object v0, p0, Lo/etk;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/etk;->b:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0, v0, v1}, Lo/etk;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 78
    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 80
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 81
    const/16 v0, 0x11

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 83
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 85
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 86
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 87
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_margin_2dp:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 88
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 91
    iget-object v0, p0, Lo/etk;->i:Landroid/widget/LinearLayout$LayoutParams;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_margin_4dp:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 93
    iget-object v0, p0, Lo/etk;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/etk;->h:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v5, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 94
    iget-object v0, p0, Lo/etk;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/etk;->i:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v5, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    iget-object v0, p0, Lo/etk;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/etk;->g:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v4, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 97
    invoke-virtual {v4, v5, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 99
    invoke-virtual {p0, v4}, Lo/etk;->addView(Landroid/view/View;)V

    .line 102
    iget-object v0, p0, Lo/etk;->f:Landroid/widget/LinearLayout$LayoutParams;

    const/16 v1, 0x1f4

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 103
    iget-object v0, p0, Lo/etk;->f:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0, v0}, Lo/etk;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 109
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->b:Landroid/widget/LinearLayout$LayoutParams;

    .line 32
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->g:Landroid/widget/LinearLayout$LayoutParams;

    .line 33
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->h:Landroid/widget/LinearLayout$LayoutParams;

    .line 34
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->i:Landroid/widget/LinearLayout$LayoutParams;

    .line 35
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->f:Landroid/widget/LinearLayout$LayoutParams;

    .line 112
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 115
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->b:Landroid/widget/LinearLayout$LayoutParams;

    .line 32
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->g:Landroid/widget/LinearLayout$LayoutParams;

    .line 33
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->h:Landroid/widget/LinearLayout$LayoutParams;

    .line 34
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->i:Landroid/widget/LinearLayout$LayoutParams;

    .line 35
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lo/etk;->f:Landroid/widget/LinearLayout$LayoutParams;

    .line 116
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 132
    iget-object v0, p0, Lo/etk;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 133
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 140
    iget-object v0, p0, Lo/etk;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    return-void
.end method

.method public d(ZLandroid/content/Context;Z)V
    .locals 2

    .line 221
    iget-object v0, p0, Lo/etk;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 231
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 136
    iget-object v0, p0, Lo/etk;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 174
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 176
    return-void
.end method

.method public setGroupSize(II)V
    .locals 1

    .line 169
    iget-object v0, p0, Lo/etk;->f:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 170
    iget-object v0, p0, Lo/etk;->f:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0, v0}, Lo/etk;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 171
    return-void
.end method

.method public setItemView(Lo/etk$d;)V
    .locals 4

    .line 201
    if-nez p1, :cond_0

    .line 202
    const-string v0, "Track_SportDetailItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setItemView data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    return-void

    .line 206
    :cond_0
    iget-object v0, p0, Lo/etk;->c:Landroid/widget/ImageView;

    iget-object v1, p1, Lo/etk$d;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 207
    iget-object v0, p0, Lo/etk;->d:Landroid/widget/TextView;

    iget-object v1, p1, Lo/etk$d;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    iget-object v0, p0, Lo/etk;->a:Landroid/widget/TextView;

    iget-object v1, p1, Lo/etk$d;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    iget-object v0, p0, Lo/etk;->e:Landroid/widget/TextView;

    iget-object v1, p1, Lo/etk$d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    return-void
.end method

.method public setTextColor(I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 120
    iget-object v0, p0, Lo/etk;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 121
    iget-object v0, p0, Lo/etk;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 122
    iget-object v0, p0, Lo/etk;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 123
    iget-object v0, p0, Lo/etk;->d:Landroid/widget/TextView;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 124
    return-void
.end method

.method public setValueTextSize(F)V
    .locals 2

    .line 128
    iget-object v0, p0, Lo/etk;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 129
    return-void
.end method
