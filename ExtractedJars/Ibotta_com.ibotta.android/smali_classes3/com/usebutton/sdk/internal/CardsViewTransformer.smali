.class Lcom/usebutton/sdk/internal/CardsViewTransformer;
.super Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BaseViewTransformer;
.source "CardsViewTransformer.java"


# static fields
.field private static final MAX_DIM_ALPHA:F = 0.7f


# direct methods
.method constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BaseViewTransformer;-><init>()V

    return-void
.end method


# virtual methods
.method public getDimAlpha(FFFLcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/view/View;)F
    .locals 0

    sub-float/2addr p1, p3

    const/4 p3, 0x0

    .line 22
    invoke-static {p3, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    div-float/2addr p1, p2

    const p2, 0x3f333333    # 0.7f

    mul-float p1, p1, p2

    return p1
.end method

.method public transformView(FFFLcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/view/View;)V
    .locals 0

    return-void
.end method
