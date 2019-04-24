.class Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$7;
.super Ljava/lang/Object;
.source "FirstUseGiftCardPickerScreen.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


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

    .line 282
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$7;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 290
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$7;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$202(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;Z)Z

    .line 291
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$7;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1, v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$402(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;Z)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 285
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$7;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$1000(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
