.class public Lcom/rt/mobile/english/ui/widget/DrawerItemView;
.super Landroid/widget/LinearLayout;
.source "DrawerItemView.java"


# instance fields
.field private backgroundDrawable:Landroid/graphics/drawable/Drawable;

.field dividerBottom:Landroid/view/View;

.field private dividerPosition:I

.field dividerTop:Landroid/view/View;

.field icon:Landroid/widget/ImageView;

.field private iconDrawable:Landroid/graphics/drawable/Drawable;

.field title:Landroid/widget/TextView;

.field private titleString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 45
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 49
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Lcom/rt/mobile/english/R$styleable;->DrawerItemView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    .line 55
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->titleString:Ljava/lang/String;

    const/4 p2, 0x3

    .line 56
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->iconDrawable:Landroid/graphics/drawable/Drawable;

    .line 57
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->backgroundDrawable:Landroid/graphics/drawable/Drawable;

    const/4 p2, 0x2

    .line 58
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerPosition:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 62
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->init()V

    return-void

    :catchall_0
    move-exception p2

    .line 60
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 66
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object p3, Lcom/rt/mobile/english/R$styleable;->DrawerItemView:[I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    .line 72
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->titleString:Ljava/lang/String;

    const/4 p2, 0x3

    .line 73
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->iconDrawable:Landroid/graphics/drawable/Drawable;

    .line 74
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->backgroundDrawable:Landroid/graphics/drawable/Drawable;

    const/4 p2, 0x2

    .line 75
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerPosition:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->init()V

    return-void

    :catchall_0
    move-exception p2

    .line 77
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method private init()V
    .locals 3

    .line 83
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->iconDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_0

    const v1, 0x7f0c0089

    goto :goto_0

    :cond_0
    const v1, 0x7f0c0088

    :goto_0
    invoke-static {v0, v1, p0}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    const v0, 0x7f090136

    .line 84
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->title:Landroid/widget/TextView;

    const v0, 0x7f090070

    .line 85
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerTop:Landroid/view/View;

    const v0, 0x7f09006f

    .line 86
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerBottom:Landroid/view/View;

    const v0, 0x7f090135

    .line 87
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 88
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->icon:Landroid/widget/ImageView;

    .line 91
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->title:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->titleString:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->icon:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    .line 93
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->icon:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->iconDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 96
    :cond_2
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->backgroundDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    const v0, 0x7f090131

    .line 97
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->backgroundDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 100
    :cond_3
    iget v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerPosition:I

    const/16 v1, 0x8

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 114
    :pswitch_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerTop:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 115
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerBottom:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 110
    :pswitch_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerTop:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 111
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerBottom:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 106
    :pswitch_2
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerTop:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 107
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerBottom:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 102
    :pswitch_3
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerTop:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 103
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->dividerBottom:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
