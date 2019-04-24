.class public abstract Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;
.super Landroid/widget/FrameLayout;
.source "AbstractReceiptGuideView.java"


# instance fields
.field protected captureCount:I

.field hardware:Lcom/ibotta/android/hardware/Hardware;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 38
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 46
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method protected abstract getGuideView()Landroid/view/View;
.end method

.method public getReceiptPercDistFromBottom()D
    .locals 6

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->getScreenSize()Landroid/graphics/Point;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-double v0, v0

    .line 101
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 102
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->getGuideView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    const-wide/16 v3, 0x0

    cmpl-double v5, v0, v3

    if-eqz v5, :cond_0

    .line 106
    iget v3, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    add-int/2addr v3, v2

    int-to-double v2, v3

    sub-double v2, v0, v2

    div-double v3, v2, v0

    :cond_0
    return-wide v3
.end method

.method public getReceiptPercDistFromLeft()D
    .locals 6

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->getScreenSize()Landroid/graphics/Point;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-double v0, v0

    .line 60
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->getGuideView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    const-wide/16 v3, 0x0

    cmpl-double v5, v0, v3

    if-eqz v5, :cond_0

    .line 65
    iget v2, v2, Landroid/graphics/Rect;->left:I

    int-to-double v2, v2

    div-double v3, v2, v0

    :cond_0
    return-wide v3
.end method

.method public getReceiptPercDistFromRight()D
    .locals 6

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->getScreenSize()Landroid/graphics/Point;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-double v0, v0

    .line 73
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->getGuideView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    const-wide/16 v3, 0x0

    cmpl-double v5, v0, v3

    if-eqz v5, :cond_0

    .line 78
    iget v3, v2, Landroid/graphics/Rect;->left:I

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    add-int/2addr v3, v2

    int-to-double v2, v3

    sub-double v2, v0, v2

    div-double v3, v2, v0

    :cond_0
    return-wide v3
.end method

.method public getReceiptPercDistFromTop()D
    .locals 6

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->getScreenSize()Landroid/graphics/Point;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-double v0, v0

    .line 88
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 89
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->getGuideView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    const-wide/16 v3, 0x0

    cmpl-double v5, v0, v3

    if-eqz v5, :cond_0

    .line 93
    iget v2, v2, Landroid/graphics/Rect;->top:I

    int-to-double v2, v2

    div-double v3, v2, v0

    :cond_0
    return-wide v3
.end method

.method protected varargs getString(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 137
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public init(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
    .locals 0

    .line 54
    iput p2, p0, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->captureCount:I

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method

.method protected abstract initLayout()V
.end method

.method public abstract isPreviousReceiptApplicable()Z
.end method

.method public abstract pause()V
.end method

.method public abstract previewStarted(Z)V
.end method

.method public abstract releaseCapturedReceipt()V
.end method

.method protected releaseCapturedReceipt(Landroid/widget/ImageView;Landroid/graphics/drawable/BitmapDrawable;Landroid/graphics/Bitmap;)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 116
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    if-eqz p2, :cond_2

    .line 120
    invoke-virtual {p2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p1

    if-nez p1, :cond_1

    .line 121
    invoke-virtual {p2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 123
    :cond_1
    invoke-virtual {p2, v0}, Landroid/graphics/drawable/BitmapDrawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_2
    if-eqz p3, :cond_4

    .line 128
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p1

    if-nez p1, :cond_3

    .line 129
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    .line 132
    :cond_3
    invoke-static {}, Ljava/lang/System;->gc()V

    :cond_4
    return-void
.end method

.method public abstract releasePreviousReceipt()V
.end method

.method public abstract setCapturedReceiptBitmap(Landroid/graphics/Bitmap;)V
.end method

.method public abstract setPreviousReceiptBitmap(Landroid/graphics/Bitmap;)V
.end method
