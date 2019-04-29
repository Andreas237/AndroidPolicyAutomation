.class final Lcom/nineoldandroids/view/ViewHelper$Honeycomb;
.super Ljava/lang/Object;
.source "ViewHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/view/ViewHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Honeycomb"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getAlpha(Landroid/view/View;)F
    .locals 0

    .line 181
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result p0

    return p0
.end method

.method static getPivotX(Landroid/view/View;)F
    .locals 0

    .line 189
    invoke-virtual {p0}, Landroid/view/View;->getPivotX()F

    move-result p0

    return p0
.end method

.method static getPivotY(Landroid/view/View;)F
    .locals 0

    .line 197
    invoke-virtual {p0}, Landroid/view/View;->getPivotY()F

    move-result p0

    return p0
.end method

.method static getRotation(Landroid/view/View;)F
    .locals 0

    .line 205
    invoke-virtual {p0}, Landroid/view/View;->getRotation()F

    move-result p0

    return p0
.end method

.method static getRotationX(Landroid/view/View;)F
    .locals 0

    .line 213
    invoke-virtual {p0}, Landroid/view/View;->getRotationX()F

    move-result p0

    return p0
.end method

.method static getRotationY(Landroid/view/View;)F
    .locals 0

    .line 221
    invoke-virtual {p0}, Landroid/view/View;->getRotationY()F

    move-result p0

    return p0
.end method

.method static getScaleX(Landroid/view/View;)F
    .locals 0

    .line 229
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result p0

    return p0
.end method

.method static getScaleY(Landroid/view/View;)F
    .locals 0

    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getScaleY()F

    move-result p0

    return p0
.end method

.method static getScrollX(Landroid/view/View;)F
    .locals 0

    .line 245
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p0

    int-to-float p0, p0

    return p0
.end method

.method static getScrollY(Landroid/view/View;)F
    .locals 0

    .line 253
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p0

    int-to-float p0, p0

    return p0
.end method

.method static getTranslationX(Landroid/view/View;)F
    .locals 0

    .line 261
    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    move-result p0

    return p0
.end method

.method static getTranslationY(Landroid/view/View;)F
    .locals 0

    .line 269
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    move-result p0

    return p0
.end method

.method static getX(Landroid/view/View;)F
    .locals 0

    .line 277
    invoke-virtual {p0}, Landroid/view/View;->getX()F

    move-result p0

    return p0
.end method

.method static getY(Landroid/view/View;)F
    .locals 0

    .line 285
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result p0

    return p0
.end method

.method static setAlpha(Landroid/view/View;F)V
    .locals 0

    .line 185
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method static setPivotX(Landroid/view/View;F)V
    .locals 0

    .line 193
    invoke-virtual {p0, p1}, Landroid/view/View;->setPivotX(F)V

    return-void
.end method

.method static setPivotY(Landroid/view/View;F)V
    .locals 0

    .line 201
    invoke-virtual {p0, p1}, Landroid/view/View;->setPivotY(F)V

    return-void
.end method

.method static setRotation(Landroid/view/View;F)V
    .locals 0

    .line 209
    invoke-virtual {p0, p1}, Landroid/view/View;->setRotation(F)V

    return-void
.end method

.method static setRotationX(Landroid/view/View;F)V
    .locals 0

    .line 217
    invoke-virtual {p0, p1}, Landroid/view/View;->setRotationX(F)V

    return-void
.end method

.method static setRotationY(Landroid/view/View;F)V
    .locals 0

    .line 225
    invoke-virtual {p0, p1}, Landroid/view/View;->setRotationY(F)V

    return-void
.end method

.method static setScaleX(Landroid/view/View;F)V
    .locals 0

    .line 233
    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleX(F)V

    return-void
.end method

.method static setScaleY(Landroid/view/View;F)V
    .locals 0

    .line 241
    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method

.method static setScrollX(Landroid/view/View;I)V
    .locals 0

    .line 249
    invoke-virtual {p0, p1}, Landroid/view/View;->setScrollX(I)V

    return-void
.end method

.method static setScrollY(Landroid/view/View;I)V
    .locals 0

    .line 257
    invoke-virtual {p0, p1}, Landroid/view/View;->setScrollY(I)V

    return-void
.end method

.method static setTranslationX(Landroid/view/View;F)V
    .locals 0

    .line 265
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method

.method static setTranslationY(Landroid/view/View;F)V
    .locals 0

    .line 273
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method static setX(Landroid/view/View;F)V
    .locals 0

    .line 281
    invoke-virtual {p0, p1}, Landroid/view/View;->setX(F)V

    return-void
.end method

.method static setY(Landroid/view/View;F)V
    .locals 0

    .line 289
    invoke-virtual {p0, p1}, Landroid/view/View;->setY(F)V

    return-void
.end method
