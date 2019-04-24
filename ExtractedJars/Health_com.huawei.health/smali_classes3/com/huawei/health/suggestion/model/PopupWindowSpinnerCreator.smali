.class public Lcom/huawei/health/suggestion/model/PopupWindowSpinnerCreator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final SPINNER_MAX_WIDTH:I = 0x104

.field private static final SPINNER_MIN_WIDTH:I = 0x24


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createSpinnerPopupWindow(Landroid/content/Context;[Ljava/lang/String;IZILandroid/widget/RadioGroup$OnCheckedChangeListener;)Landroid/widget/PopupWindow;
    .locals 15

    .line 40
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p5, :cond_1

    .line 41
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_1
    new-instance v3, Landroid/widget/RadioGroup;

    invoke-direct {v3, p0}, Landroid/widget/RadioGroup;-><init>(Landroid/content/Context;)V

    .line 45
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/RadioGroup;->setOrientation(I)V

    .line 46
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_spinner_menu_bg:I

    invoke-virtual {v3, v0}, Landroid/widget/RadioGroup;->setBackgroundResource(I)V

    .line 47
    const/high16 v0, 0x43820000    # 260.0f

    invoke-static {p0, v0}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v4

    .line 48
    move/from16 v5, p4

    .line 49
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v6

    .line 50
    const/high16 v0, 0x42400000    # 48.0f

    invoke-static {p0, v0}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v7

    .line 52
    new-instance v8, Landroid/text/TextPaint;

    invoke-direct {v8}, Landroid/text/TextPaint;-><init>()V

    .line 53
    const/high16 v0, 0x41700000    # 15.0f

    invoke-static {p0, v0}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v8, v0}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 54
    const/4 v9, 0x0

    .line 56
    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 58
    const/4 v11, 0x0

    :goto_0
    move-object/from16 v0, p1

    array-length v0, v0

    if-ge v11, v0, :cond_6

    .line 59
    sget v0, Lcom/huawei/health/suggestion/R$layout;->spinner_radiobutton_item:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/RadioButton;

    .line 60
    invoke-virtual {v12, v5}, Landroid/widget/RadioButton;->setMinWidth(I)V

    .line 61
    invoke-virtual {v12, v4}, Landroid/widget/RadioButton;->setMaxWidth(I)V

    .line 63
    if-nez v11, :cond_2

    .line 64
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_menu_button_top_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 65
    :cond_2
    move-object/from16 v0, p1

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ne v11, v0, :cond_3

    .line 66
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_menu_button_bottom_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_menu_button_normal_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 72
    :goto_1
    aget-object v0, p1, v11

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 73
    aget-object v0, p1, v11

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setTag(Ljava/lang/Object;)V

    .line 74
    invoke-virtual {v12, v7}, Landroid/widget/RadioButton;->setHeight(I)V

    .line 75
    invoke-virtual {v3, v12}, Landroid/widget/RadioGroup;->addView(Landroid/view/View;)V

    .line 77
    move-object/from16 v0, p1

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-eq v11, v0, :cond_4

    if-eqz p3, :cond_4

    .line 78
    new-instance v13, Landroid/widget/ImageView;

    invoke-direct {v13, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 79
    const/high16 v0, -0x1000000

    invoke-virtual {v13, v0}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 80
    const v0, 0x3dcccccd    # 0.1f

    invoke-virtual {v13, v0}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 81
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {p0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    const/4 v1, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object v14, v0

    .line 82
    invoke-virtual {v14, v6}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 83
    invoke-virtual {v14, v6}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 84
    invoke-virtual {v3, v13, v14}, Landroid/widget/RadioGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 88
    :cond_4
    aget-object v0, p1, v11

    aget-object v1, p1, v11

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v8, v0, v2, v1, v10}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 89
    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_5

    .line 90
    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v9, v0

    .line 93
    :cond_5
    new-instance v0, Lcom/huawei/health/suggestion/model/PopupWindowSpinnerCreator$1;

    invoke-direct {v0, v3}, Lcom/huawei/health/suggestion/model/PopupWindowSpinnerCreator$1;-><init>(Landroid/widget/RadioGroup;)V

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 108
    :cond_6
    mul-int/lit8 v0, v6, 0x2

    int-to-float v0, v0

    add-float/2addr v9, v0

    .line 109
    int-to-float v0, v5

    cmpg-float v0, v9, v0

    if-gez v0, :cond_7

    .line 110
    int-to-float v9, v5

    goto :goto_2

    .line 111
    :cond_7
    int-to-float v0, v4

    cmpl-float v0, v9, v0

    if-lez v0, :cond_8

    .line 112
    int-to-float v9, v4

    .line 114
    :cond_8
    :goto_2
    const/high16 v0, 0x40300000    # 2.75f

    invoke-static {p0, v0}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v9, v0

    .line 123
    move/from16 v0, p2

    invoke-virtual {v3, v0}, Landroid/widget/RadioGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/RadioGroup;->check(I)V

    .line 124
    move-object/from16 v0, p5

    invoke-virtual {v3, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 126
    new-instance v11, Landroid/widget/PopupWindow;

    float-to-int v0, v9

    const/4 v1, -0x2

    invoke-direct {v11, v3, v0, v1}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    .line 128
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 130
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 132
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v11, v0}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 134
    return-object v11
.end method
