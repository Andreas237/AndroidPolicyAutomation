.class Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay$1;
.super Ljava/lang/Object;
.source "ProcessingSurveyOverlay.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->startAnimsForHide()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay$1;->this$0:Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 228
    iget-object p1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay$1;->this$0:Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->access$100(Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;)Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 229
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    .line 230
    iget-object p1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay$1;->this$0:Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->dismiss()V

    :cond_0
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 221
    iget-object p1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay$1;->this$0:Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->access$000(Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;)Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 222
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    .line 223
    iget-object p1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay$1;->this$0:Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->dismiss()V

    :cond_0
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
