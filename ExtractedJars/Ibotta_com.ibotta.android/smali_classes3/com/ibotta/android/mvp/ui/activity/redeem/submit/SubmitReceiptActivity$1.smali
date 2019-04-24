.class Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity$1;
.super Ljava/lang/Object;
.source "SubmitReceiptActivity.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 109
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;->onSubmittedAnimationFinished()V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
