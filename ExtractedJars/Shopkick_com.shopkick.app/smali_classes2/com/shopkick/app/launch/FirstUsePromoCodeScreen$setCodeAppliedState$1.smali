.class final Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$setCodeAppliedState$1;
.super Ljava/lang/Object;
.source "FirstUsePromoCodeScreen.kt"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->setCodeAppliedState()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/animation/ValueAnimator;",
        "kotlin.jvm.PlatformType",
        "onAnimationUpdate"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $dstColor:I

.field final synthetic this$0:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;I)V
    .locals 0

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$setCodeAppliedState$1;->this$0:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;

    iput p2, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$setCodeAppliedState$1;->$dstColor:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$setCodeAppliedState$1;->this$0:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;

    iget v1, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$setCodeAppliedState$1;->$dstColor:I

    const-string v2, "it"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->access$adjustAlpha(Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;IF)I

    move-result p1

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen$setCodeAppliedState$1;->this$0:Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;->access$getNextButton$p(Lcom/shopkick/app/launch/FirstUsePromoCodeScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void

    .line 191
    :cond_1
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
