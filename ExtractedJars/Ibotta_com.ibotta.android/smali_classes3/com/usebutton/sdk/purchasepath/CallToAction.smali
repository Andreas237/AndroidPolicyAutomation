.class public Lcom/usebutton/sdk/purchasepath/CallToAction;
.super Ljava/lang/Object;
.source "CallToAction.java"


# instance fields
.field private icon:I
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation
.end field

.field private text:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private textColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/CallToAction;->icon:I

    .line 26
    iput-object p2, p0, Lcom/usebutton/sdk/purchasepath/CallToAction;->text:Ljava/lang/String;

    .line 27
    iput p3, p0, Lcom/usebutton/sdk/purchasepath/CallToAction;->textColor:I

    return-void
.end method


# virtual methods
.method public getIcon()I
    .locals 1
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    .line 32
    iget v0, p0, Lcom/usebutton/sdk/purchasepath/CallToAction;->icon:I

    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/CallToAction;->text:Ljava/lang/String;

    return-object v0
.end method

.method public getTextColor()I
    .locals 1
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation

    .line 42
    iget v0, p0, Lcom/usebutton/sdk/purchasepath/CallToAction;->textColor:I

    return v0
.end method

.method public setIcon(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param

    .line 46
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/CallToAction;->icon:I

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/CallToAction;->text:Ljava/lang/String;

    return-void
.end method

.method public setTextColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 54
    iput p1, p0, Lcom/usebutton/sdk/purchasepath/CallToAction;->textColor:I

    return-void
.end method
