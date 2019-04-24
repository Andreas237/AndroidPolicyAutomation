.class public Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;
.super Landroid/widget/FrameLayout;
.source "ErrorIndicator.java"


# instance fields
.field private final errorTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .line 31
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 33
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 34
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x11

    const/4 v3, -0x1

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v1, 0x77000000

    .line 38
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 40
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 41
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 43
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 44
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v2, :cond_0

    const/4 v2, 0x4

    .line 46
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextAlignment(I)V

    .line 48
    :cond_0
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v2, 0x0

    .line 49
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundColor(I)V

    const/16 v2, 0x14

    .line 50
    invoke-static {p1, v2}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p1

    .line 51
    invoke-virtual {v1, p1, p1, p1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    const/high16 p1, 0x41c80000    # 25.0f

    .line 52
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 53
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt p1, v2, :cond_1

    const/high16 p1, 0x3f000000    # 0.5f

    .line 54
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 56
    :cond_1
    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;->errorTextView:Landroid/widget/TextView;

    .line 58
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;->errorTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 59
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public setText(Lcom/scandit/recognition/ContextStatusException;)V
    .locals 3

    .line 63
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;->errorTextView:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/scandit/recognition/ContextStatusException;->getErrorCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {p1}, Lcom/scandit/recognition/ContextStatusException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 63
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;->errorTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
