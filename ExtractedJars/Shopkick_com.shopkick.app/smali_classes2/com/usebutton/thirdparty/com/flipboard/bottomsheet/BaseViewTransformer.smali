.class public abstract Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BaseViewTransformer;
.super Ljava/lang/Object;
.source "BaseViewTransformer.java"

# interfaces
.implements Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;


# static fields
.field public static final MAX_DIM_ALPHA:F = 0.7f


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDimAlpha(FFFLcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/view/View;)F
    .locals 0

    div-float/2addr p1, p2

    const p2, 0x3f333333    # 0.7f

    mul-float/2addr p1, p2

    return p1
.end method
