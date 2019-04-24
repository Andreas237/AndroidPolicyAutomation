.class public Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;
.super Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    return-void
.end method


# virtual methods
.method public a(II)Landroid/graphics/Rect;
    .locals 10

    .line 50
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$dimen;->camera_bankcard_tips_margin_left_or_right:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    .line 51
    mul-int/lit8 v0, v8, 0x2

    sub-int v3, p1, v0

    .line 52
    mul-int/lit8 v0, v3, 0x2

    div-int/lit8 v2, v0, 0x3

    .line 54
    sub-int v0, p1, v3

    div-int/lit8 v4, v0, 0x2

    .line 55
    sub-int v0, p2, v2

    div-int/lit8 v5, v0, 0x2

    .line 56
    add-int v6, v4, v3

    .line 57
    add-int v7, v5, v2

    .line 58
    new-instance v9, Landroid/graphics/Rect;

    invoke-direct {v9, v4, v5, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 60
    return-object v9
.end method

.method public c()V
    .locals 2

    .line 31
    invoke-super {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c()V

    .line 32
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;->d(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;->a:I

    .line 33
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;->d(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;->e:I

    .line 34
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;->d(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;->b:I

    .line 35
    const v0, 0x3f19999a    # 0.6f

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardOverlayView;->d:F

    .line 36
    return-void
.end method
