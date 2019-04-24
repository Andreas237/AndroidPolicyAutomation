.class public Lcom/scandit/base/geometry/SbRectangle;
.super Ljava/lang/Object;
.source "SbRectangle.java"


# instance fields
.field public height:I

.field public width:I

.field public x:F

.field public y:F


# direct methods
.method public constructor <init>(FFII)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Lcom/scandit/base/geometry/SbRectangle;->x:F

    .line 16
    iput p2, p0, Lcom/scandit/base/geometry/SbRectangle;->y:F

    .line 17
    iput p3, p0, Lcom/scandit/base/geometry/SbRectangle;->width:I

    .line 18
    iput p4, p0, Lcom/scandit/base/geometry/SbRectangle;->height:I

    return-void
.end method
