.class public Lcom/usebutton/sdk/purchasepath/TextCard;
.super Lcom/usebutton/sdk/purchasepath/Card;
.source "TextCard.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/purchasepath/TextCard$Builder;
    }
.end annotation


# instance fields
.field private backgroundColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private body:Ljava/lang/String;

.field private bodyColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private bodySize:F

.field private bodyTypeface:Landroid/graphics/Typeface;

.field private title:Ljava/lang/String;

.field private titleColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private titleSize:F

.field private titleTypeface:Landroid/graphics/Typeface;


# direct methods
.method private constructor <init>(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)V
    .locals 1

    .line 36
    invoke-static {p1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->access$000(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)Lcom/usebutton/sdk/purchasepath/CallToAction;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/purchasepath/Card;-><init>(Lcom/usebutton/sdk/purchasepath/CallToAction;)V

    .line 37
    invoke-static {p1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->access$100(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->title:Ljava/lang/String;

    .line 38
    invoke-static {p1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->access$200(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->titleColor:I

    .line 39
    invoke-static {p1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->access$300(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->titleTypeface:Landroid/graphics/Typeface;

    .line 40
    invoke-static {p1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->access$400(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)F

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->titleSize:F

    .line 41
    invoke-static {p1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->access$500(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->body:Ljava/lang/String;

    .line 42
    invoke-static {p1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->access$600(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->bodyColor:I

    .line 43
    invoke-static {p1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->access$700(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->bodyTypeface:Landroid/graphics/Typeface;

    .line 44
    invoke-static {p1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->access$800(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)F

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->bodySize:F

    .line 45
    invoke-static {p1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->access$900(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)I

    move-result p1

    iput p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->backgroundColor:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;Lcom/usebutton/sdk/purchasepath/TextCard$1;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/purchasepath/TextCard;-><init>(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)V

    return-void
.end method


# virtual methods
.method public getBackgroundColor()I
    .locals 1

    .line 138
    iget v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->backgroundColor:I

    return v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->body:Ljava/lang/String;

    return-object v0
.end method

.method public getBodyColor()I
    .locals 1

    .line 130
    iget v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->bodyColor:I

    return v0
.end method

.method public getBodySize()F
    .locals 1

    .line 142
    iget v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->bodySize:F

    return v0
.end method

.method public getBodyTypeface()Landroid/graphics/Typeface;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->bodyTypeface:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleColor()I
    .locals 1

    .line 114
    iget v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->titleColor:I

    return v0
.end method

.method public getTitleSize()F
    .locals 1

    .line 122
    iget v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->titleSize:F

    return v0
.end method

.method public getTitleTypeface()Landroid/graphics/Typeface;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->titleTypeface:Landroid/graphics/Typeface;

    return-object v0
.end method

.method protected final onBindView(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 93
    sget v0, Lcom/usebutton/sdk/R$id;->textcard_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 94
    sget v1, Lcom/usebutton/sdk/R$id;->textcard_body:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 95
    sget v2, Lcom/usebutton/sdk/R$id;->textcard_layout:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    .line 98
    invoke-virtual {p0}, Lcom/usebutton/sdk/purchasepath/TextCard;->getBackgroundColor()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 99
    invoke-virtual {p0}, Lcom/usebutton/sdk/purchasepath/TextCard;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    invoke-virtual {p0}, Lcom/usebutton/sdk/purchasepath/TextCard;->getTitleColor()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 101
    invoke-virtual {p0}, Lcom/usebutton/sdk/purchasepath/TextCard;->getTitleSize()F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 102
    invoke-virtual {p0}, Lcom/usebutton/sdk/purchasepath/TextCard;->getTitleTypeface()Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 103
    invoke-virtual {p0}, Lcom/usebutton/sdk/purchasepath/TextCard;->getBody()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    invoke-virtual {p0}, Lcom/usebutton/sdk/purchasepath/TextCard;->getBodyColor()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 105
    invoke-virtual {p0}, Lcom/usebutton/sdk/purchasepath/TextCard;->getBodySize()F

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 106
    invoke-virtual {p0}, Lcom/usebutton/sdk/purchasepath/TextCard;->getBodyTypeface()Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    return-void
.end method

.method protected final onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 87
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 88
    sget v1, Lcom/usebutton/sdk/R$layout;->btn_checkout_textcard:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public setBackgroundColor(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->backgroundColor:I

    return-void
.end method

.method public setBody(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->body:Ljava/lang/String;

    return-void
.end method

.method public setBodyColor(I)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->bodyColor:I

    return-void
.end method

.method public setBodySize(F)V
    .locals 0

    .line 77
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->bodySize:F

    return-void
.end method

.method public setBodyTypeface(Landroid/graphics/Typeface;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->bodyTypeface:Landroid/graphics/Typeface;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->title:Ljava/lang/String;

    return-void
.end method

.method public setTitleColor(I)V
    .locals 0

    .line 53
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->titleColor:I

    return-void
.end method

.method public setTitleSize(F)V
    .locals 0

    .line 61
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->titleSize:F

    return-void
.end method

.method public setTitleTypeface(Landroid/graphics/Typeface;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard;->titleTypeface:Landroid/graphics/Typeface;

    return-void
.end method
