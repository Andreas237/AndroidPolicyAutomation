.class public Lo/ems;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ems$d;
    }
.end annotation


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Landroid/content/Context;

.field private c:Landroid/view/LayoutInflater;

.field private e:Landroid/view/View;

.field private k:Lo/ems$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const-string v0, "HealthToolBar"

    sput-object v0, Lo/ems;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 49
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 50
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/ems;->c(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 56
    if-nez p2, :cond_0

    .line 57
    return-void

    .line 60
    :cond_0
    iput-object p1, p0, Lo/ems;->b:Landroid/content/Context;

    .line 62
    invoke-direct {p0, p1, p2}, Lo/ems;->c(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 63
    return-void
.end method

.method private c(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 67
    iget-object v0, p0, Lo/ems;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lo/ems;->c:Landroid/view/LayoutInflater;

    .line 68
    iget-object v0, p0, Lo/ems;->c:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/commonui/R$layout;->toobarlayout:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 69
    sget v0, Lcom/huawei/ui/commonui/R$id;->toolBarLayout:I

    invoke-virtual {p0, v0}, Lo/ems;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ems;->a:Landroid/widget/LinearLayout;

    .line 71
    iget-object v0, p0, Lo/ems;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    .line 72
    const/4 v4, 0x0

    .line 73
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 74
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/huawei/ui/commonui/R$styleable;->custom_title_bar:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 75
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 76
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->custom_title_bar_titleBarBg:I

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 77
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 80
    :cond_0
    if-eqz v4, :cond_1

    .line 81
    invoke-virtual {p0, v4}, Lo/ems;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 83
    :cond_1
    if-eqz v3, :cond_2

    .line 84
    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/commonui/R$attr;->titleBarBgColor:I

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {v3, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    iget-object v0, p0, Lo/ems;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$color;->common_health_titlebar_backgraound:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v5, v1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/ems;->setBackgroundColor(I)V

    .line 87
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 91
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 4

    .line 160
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 161
    sget-object v0, Lo/ems;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    return-void

    .line 164
    :cond_0
    iget-object v0, p0, Lo/ems;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 165
    sget-object v0, Lo/ems;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mToolbar"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    return-void

    .line 169
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 170
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lo/ems;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 172
    :cond_2
    return-void
.end method

.method public d(Landroid/view/View;)V
    .locals 4

    .line 146
    iget-object v0, p0, Lo/ems;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 147
    sget-object v0, Lo/ems;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mToolbar"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    return-void

    .line 150
    :cond_0
    iput-object p1, p0, Lo/ems;->e:Landroid/view/View;

    .line 151
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/ems;->setIconVisible(II)V

    .line 152
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/ems;->setIconVisible(II)V

    .line 153
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/ems;->setIconVisible(II)V

    .line 154
    iget-object v0, p0, Lo/ems;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ems;->e:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 155
    iget-object v0, p0, Lo/ems;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->invalidate()V

    .line 156
    return-void
.end method

.method public e(Landroid/view/View;)V
    .locals 4

    .line 129
    iget-object v0, p0, Lo/ems;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 130
    sget-object v0, Lo/ems;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mToolbar"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    return-void

    .line 133
    :cond_0
    iget-object v0, p0, Lo/ems;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 134
    invoke-virtual {p0}, Lo/ems;->invalidate()V

    .line 136
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 301
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 302
    iget-object v0, p0, Lo/ems;->k:Lo/ems$d;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/ems$d;->onSingleTap(I)V

    goto :goto_0

    .line 303
    :cond_0
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 304
    iget-object v0, p0, Lo/ems;->k:Lo/ems$d;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/ems$d;->onSingleTap(I)V

    goto :goto_0

    .line 305
    :cond_1
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item3:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 306
    iget-object v0, p0, Lo/ems;->k:Lo/ems$d;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lo/ems$d;->onSingleTap(I)V

    .line 308
    :cond_2
    :goto_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 8

    .line 95
    invoke-super/range {p0 .. p5}, Landroid/widget/RelativeLayout;->onLayout(ZIIII)V

    .line 96
    invoke-virtual {p0}, Lo/ems;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    return-void

    .line 99
    :cond_0
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    instance-of v0, v0, Landroid/widget/LinearLayout;

    if-eqz v0, :cond_5

    .line 100
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v2

    .line 101
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 102
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    .line 103
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 104
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    .line 105
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 108
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 109
    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 110
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 111
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    div-int/2addr v0, v1

    if-le v4, v0, :cond_3

    .line 112
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    div-int v4, v0, v1

    .line 114
    :cond_3
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_5

    .line 115
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 116
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_4

    .line 117
    .line 118
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 119
    iput v4, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 120
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 126
    :cond_5
    return-void
.end method

.method public setIcon(II)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 176
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 177
    const/4 v2, 0x0

    .line 178
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 180
    :pswitch_0
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_imageView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 181
    goto :goto_0

    .line 183
    :pswitch_1
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_imageView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 184
    goto :goto_0

    .line 186
    :pswitch_2
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item3:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_imageView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 187
    .line 191
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 192
    invoke-virtual {v2, p2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 193
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 196
    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setIconAlpha(II)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 200
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 201
    const/4 v2, 0x0

    .line 202
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 204
    :pswitch_0
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_imageView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 205
    goto :goto_0

    .line 207
    :pswitch_1
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_imageView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 208
    goto :goto_0

    .line 210
    :pswitch_2
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item3:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_imageView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 211
    .line 215
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 216
    invoke-virtual {v2, p2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 217
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 220
    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setIconTitle(ILjava/lang/CharSequence;)V
    .locals 3

    .line 250
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 251
    const/4 v2, 0x0

    .line 252
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 254
    :pswitch_0
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_textView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 255
    goto :goto_0

    .line 257
    :pswitch_1
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_textView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 258
    goto :goto_0

    .line 260
    :pswitch_2
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item3:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_textView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 261
    .line 265
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 266
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 269
    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setIconTitleColor(ILjava/lang/CharSequence;Z)V
    .locals 3

    .line 223
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 224
    const/4 v2, 0x0

    .line 225
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 227
    :pswitch_0
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_textView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 228
    goto :goto_0

    .line 230
    :pswitch_1
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_textView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 231
    goto :goto_0

    .line 233
    :pswitch_2
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item3:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$id;->toolbar_textView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 234
    .line 238
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 239
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    if-eqz p3, :cond_0

    .line 241
    iget-object v0, p0, Lo/ems;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->common_colorAccent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 243
    :cond_0
    iget-object v0, p0, Lo/ems;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->common_list_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 247
    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setIconVisible(II)V
    .locals 3

    .line 273
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 274
    const/4 v2, 0x0

    .line 275
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 277
    :pswitch_0
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 278
    goto :goto_0

    .line 280
    :pswitch_1
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 281
    goto :goto_0

    .line 283
    :pswitch_2
    iget-object v0, p0, Lo/ems;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->item3:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 284
    .line 288
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 289
    invoke-virtual {v2, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 290
    invoke-virtual {v2, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 293
    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setOnSingleTapListener(Lo/ems$d;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lo/ems;->k:Lo/ems$d;

    .line 298
    return-void
.end method
