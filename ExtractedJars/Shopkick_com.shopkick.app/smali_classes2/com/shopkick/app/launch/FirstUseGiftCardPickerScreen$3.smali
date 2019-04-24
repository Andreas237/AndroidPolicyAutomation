.class Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$3;
.super Ljava/lang/Object;
.source "FirstUseGiftCardPickerScreen.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollUpTitleAnimation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$3;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 214
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$3;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$900(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    return-void
.end method
