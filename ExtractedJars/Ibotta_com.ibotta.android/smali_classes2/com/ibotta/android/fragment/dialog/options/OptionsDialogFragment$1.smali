.class Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$1;
.super Lcom/ibotta/android/commons/anim/AnimationListenerAdapter;
.source "OptionsDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->onClose()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$1;->this$0:Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;

    invoke-direct {p0}, Lcom/ibotta/android/commons/anim/AnimationListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 190
    invoke-super {p0, p1}, Lcom/ibotta/android/commons/anim/AnimationListenerAdapter;->onAnimationEnd(Landroid/view/animation/Animation;)V

    .line 191
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$1;->this$0:Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;

    invoke-static {p1}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->access$000(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 192
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$1;->this$0:Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->dismissAllowingStateLoss()V

    return-void
.end method
