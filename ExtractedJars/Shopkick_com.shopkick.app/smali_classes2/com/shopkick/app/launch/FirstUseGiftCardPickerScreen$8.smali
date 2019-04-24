.class Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$8;
.super Ljava/lang/Object;
.source "FirstUseGiftCardPickerScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->showNextButton(I)V
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

    .line 331
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$8;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .line 338
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$8;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$1100(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Landroid/support/constraint/ConstraintLayout;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    .line 339
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x1d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 340
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$8;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$1200(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$8;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    iget-object v1, v1, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 342
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$8;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$1400(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Landroid/widget/ListView;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$8;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$1300(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z

    .line 343
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$8;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$1400(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Landroid/widget/ListView;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$8;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$1300(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
