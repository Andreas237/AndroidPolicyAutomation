.class Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$5;
.super Ljava/lang/Object;
.source "FirstUseGiftCardPickerScreen.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollDownTitleAnimation()V
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

    .line 258
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$5;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 261
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 262
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$5;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$800(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(IF)V

    return-void
.end method
