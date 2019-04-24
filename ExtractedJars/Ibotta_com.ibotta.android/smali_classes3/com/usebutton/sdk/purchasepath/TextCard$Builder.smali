.class public Lcom/usebutton/sdk/purchasepath/TextCard$Builder;
.super Ljava/lang/Object;
.source "TextCard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/purchasepath/TextCard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
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

.field private callToAction:Lcom/usebutton/sdk/purchasepath/CallToAction;

.field private title:Ljava/lang/String;

.field private titleColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private titleSize:F

.field private titleTypeface:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/purchasepath/CallToAction;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/purchasepath/CallToAction;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 148
    iput v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->titleColor:I

    .line 149
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iput-object v1, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->titleTypeface:Landroid/graphics/Typeface;

    const/high16 v1, 0x41800000    # 16.0f

    .line 150
    iput v1, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->titleSize:F

    .line 152
    iput v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->bodyColor:I

    .line 153
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->bodyTypeface:Landroid/graphics/Typeface;

    const/high16 v0, 0x41500000    # 13.0f

    .line 154
    iput v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->bodySize:F

    const-string v0, "#0CAC56"

    .line 155
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->backgroundColor:I

    .line 166
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->callToAction:Lcom/usebutton/sdk/purchasepath/CallToAction;

    .line 167
    iput-object p2, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->title:Ljava/lang/String;

    .line 168
    iput-object p3, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->body:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)Lcom/usebutton/sdk/purchasepath/CallToAction;
    .locals 0

    .line 145
    iget-object p0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->callToAction:Lcom/usebutton/sdk/purchasepath/CallToAction;

    return-object p0
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)Ljava/lang/String;
    .locals 0

    .line 145
    iget-object p0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->title:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)I
    .locals 0

    .line 145
    iget p0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->titleColor:I

    return p0
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)Landroid/graphics/Typeface;
    .locals 0

    .line 145
    iget-object p0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->titleTypeface:Landroid/graphics/Typeface;

    return-object p0
.end method

.method static synthetic access$400(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)F
    .locals 0

    .line 145
    iget p0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->titleSize:F

    return p0
.end method

.method static synthetic access$500(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)Ljava/lang/String;
    .locals 0

    .line 145
    iget-object p0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->body:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$600(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)I
    .locals 0

    .line 145
    iget p0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->bodyColor:I

    return p0
.end method

.method static synthetic access$700(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)Landroid/graphics/Typeface;
    .locals 0

    .line 145
    iget-object p0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->bodyTypeface:Landroid/graphics/Typeface;

    return-object p0
.end method

.method static synthetic access$800(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)F
    .locals 0

    .line 145
    iget p0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->bodySize:F

    return p0
.end method

.method static synthetic access$900(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;)I
    .locals 0

    .line 145
    iget p0, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->backgroundColor:I

    return p0
.end method


# virtual methods
.method public build()Lcom/usebutton/sdk/purchasepath/TextCard;
    .locals 2

    .line 231
    new-instance v0, Lcom/usebutton/sdk/purchasepath/TextCard;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/usebutton/sdk/purchasepath/TextCard;-><init>(Lcom/usebutton/sdk/purchasepath/TextCard$Builder;Lcom/usebutton/sdk/purchasepath/TextCard$1;)V

    return-object v0
.end method

.method public setBackgroundColor(I)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 223
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->backgroundColor:I

    return-object p0
.end method

.method public setBodyColor(I)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 199
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->bodyColor:I

    return-object p0
.end method

.method public setBodySize(F)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;
    .locals 0

    .line 215
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->bodySize:F

    return-object p0
.end method

.method public setBodyTypeface(Landroid/graphics/Typeface;)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;
    .locals 0
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 207
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->bodyTypeface:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public setTitleColor(I)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 175
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->titleColor:I

    return-object p0
.end method

.method public setTitleSize(F)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;
    .locals 0

    .line 191
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->titleSize:F

    return-object p0
.end method

.method public setTitleTypeface(Landroid/graphics/Typeface;)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;
    .locals 0
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 183
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->titleTypeface:Landroid/graphics/Typeface;

    return-object p0
.end method
