.class public Lcom/shopkick/app/view/SKSlowLinearSmoothScroller;
.super Lcom/shopkick/app/view/SKLinearSmoothScroller;
.source "SKSlowLinearSmoothScroller.java"


# static fields
.field private static final MILLISECONDS_PER_INCH:F = 250.0f


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/shopkick/app/view/SKLinearSmoothScroller;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected calculateSpeedPerPixel(Landroid/util/DisplayMetrics;)F
    .locals 1

    .line 20
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x437a0000    # 250.0f

    div-float/2addr v0, p1

    return v0
.end method
