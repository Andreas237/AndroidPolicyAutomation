.class public Lcom/shopkick/app/widget/AuthV3ErrorBox;
.super Lcom/shopkick/app/widget/SKTextView;
.source "AuthV3ErrorBox.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/SKTextView;-><init>(Landroid/content/Context;)V

    .line 17
    invoke-direct {p0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->initialize()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/SKTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    invoke-direct {p0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->initialize()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/widget/SKTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->initialize()V

    return-void
.end method

.method private initialize()V
    .locals 2

    const v0, 0x7f080065

    .line 31
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setBackgroundResource(I)V

    const/16 v0, 0x11

    .line 32
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setGravity(I)V

    .line 33
    invoke-virtual {p0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f06015d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setTextColor(I)V

    const/high16 v0, 0x41800000    # 16.0f

    .line 34
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setTextSize(F)V

    const/4 v0, 0x4

    .line 35
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setDefaultFont(I)Z

    const/16 v0, 0x8

    .line 36
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public setError(I)V
    .locals 1

    .line 61
    invoke-virtual {p0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setError(Ljava/lang/String;)V

    return-void
.end method

.method public setError(Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setText(Ljava/lang/String;)V

    .line 47
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    .line 48
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 50
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setVisibility(I)V

    :goto_0
    return-void
.end method
