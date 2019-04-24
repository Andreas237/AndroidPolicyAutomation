.class public abstract Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;
.super Ljava/lang/Object;
.source "ScanditLogo.java"


# instance fields
.field protected final mIsLegacy:Z

.field protected final mRightImageOffset:I

.field protected final mWidth:I


# direct methods
.method public constructor <init>(ZII)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;->mIsLegacy:Z

    .line 25
    iput p2, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;->mWidth:I

    .line 26
    iput p3, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;->mRightImageOffset:I

    return-void
.end method


# virtual methods
.method public abstract draw(Landroid/content/Context;Landroid/graphics/Canvas;IILandroid/graphics/Rect;)V
.end method

.method public getRightImageOffset()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;->mRightImageOffset:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;->mWidth:I

    return v0
.end method
