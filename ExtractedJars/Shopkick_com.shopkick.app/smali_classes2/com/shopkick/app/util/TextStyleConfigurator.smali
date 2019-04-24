.class public Lcom/shopkick/app/util/TextStyleConfigurator;
.super Ljava/lang/Object;
.source "TextStyleConfigurator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public setStyleForTextView(Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;Landroid/widget/TextView;)V
    .locals 5

    .line 13
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->color:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 15
    invoke-static {v0}, Lcom/shopkick/app/util/SKColor;->parseString(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 18
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontStyle:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontFace:Ljava/lang/String;

    if-eqz v0, :cond_8

    :cond_1
    const/4 v0, 0x0

    .line 20
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontStyle:Ljava/lang/String;

    if-eqz v1, :cond_4

    const-string v1, "bold"

    .line 21
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontStyle:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const-string v1, "italic"

    .line 23
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontStyle:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x2

    goto :goto_0

    :cond_3
    const-string v1, "bolditalic"

    .line 25
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontStyle:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v0, 0x3

    .line 30
    :cond_4
    :goto_0
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 31
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontFace:Ljava/lang/String;

    if-eqz v2, :cond_7

    const-string v2, "sans"

    .line 32
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontFace:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 33
    sget-object v1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    goto :goto_1

    :cond_5
    const-string v2, "serif"

    .line 34
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontFace:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 35
    sget-object v1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_1

    :cond_6
    const-string v2, "mono"

    .line 36
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontFace:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 37
    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 41
    :cond_7
    :goto_1
    invoke-static {v1, v0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    .line 42
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 45
    :cond_8
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->shadowRadius:Ljava/lang/Double;

    if-nez v0, :cond_9

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->shadowOffset:Lcom/shopkick/app/fetchers/api/skapi/Point;

    if-nez v0, :cond_9

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->shadowColor:Ljava/lang/String;

    if-eqz v0, :cond_d

    :cond_9
    const v0, 0x3e4ccccd    # 0.2f

    .line 47
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->shadowRadius:Ljava/lang/Double;

    if-eqz v1, :cond_a

    .line 48
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->shadowRadius:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->floatValue()F

    move-result v0

    .line 52
    :cond_a
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->shadowOffset:Lcom/shopkick/app/fetchers/api/skapi/Point;

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_b

    .line 53
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->shadowOffset:Lcom/shopkick/app/fetchers/api/skapi/Point;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Point;->x:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->floatValue()F

    move-result v2

    .line 54
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->shadowOffset:Lcom/shopkick/app/fetchers/api/skapi/Point;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Point;->y:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->floatValue()F

    move-result v1

    goto :goto_2

    :cond_b
    move v1, v2

    :goto_2
    const/high16 v3, -0x1000000

    .line 58
    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->shadowColor:Ljava/lang/String;

    if-eqz v4, :cond_c

    .line 60
    invoke-static {v4}, Lcom/shopkick/app/util/SKColor;->parseString(Ljava/lang/String;)I

    move-result v3

    .line 63
    :cond_c
    invoke-virtual {p2, v0, v2, v1, v3}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 66
    :cond_d
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontSize:Ljava/lang/Double;

    if-eqz v0, :cond_e

    .line 67
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;->fontSize:Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->floatValue()F

    move-result p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_e
    return-void
.end method

.method public setStyleForTextView(Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;Lcom/shopkick/app/widget/SKButton;)V
    .locals 0

    .line 72
    invoke-virtual {p2}, Lcom/shopkick/app/widget/SKButton;->getButtonTextView()Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/util/TextStyleConfigurator;->setStyleForTextView(Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;Landroid/widget/TextView;)V

    return-void
.end method
