.class Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$4;
.super Ljava/lang/Object;
.source "FirstUseGiftCardPickerAdapter.java"

# interfaces
.implements Landroid/transition/Transition$TransitionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->triggerGiftCardSelectedAnimation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$4;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransitionCancel(Landroid/transition/Transition;)V
    .locals 0

    return-void
.end method

.method public onTransitionEnd(Landroid/transition/Transition;)V
    .locals 1

    .line 297
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$4;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$202(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;Z)Z

    return-void
.end method

.method public onTransitionPause(Landroid/transition/Transition;)V
    .locals 0

    return-void
.end method

.method public onTransitionResume(Landroid/transition/Transition;)V
    .locals 0

    return-void
.end method

.method public onTransitionStart(Landroid/transition/Transition;)V
    .locals 0

    return-void
.end method
