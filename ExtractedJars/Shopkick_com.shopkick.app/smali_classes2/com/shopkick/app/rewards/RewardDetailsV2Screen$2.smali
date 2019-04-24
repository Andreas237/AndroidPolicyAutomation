.class Lcom/shopkick/app/rewards/RewardDetailsV2Screen$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "RewardDetailsV2Screen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->animateButtonColor(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

.field final synthetic val$setEnabled:Z


# direct methods
.method constructor <init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;Z)V
    .locals 0

    .line 712
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$2;->this$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    iput-boolean p2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$2;->val$setEnabled:Z

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 715
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 716
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$2;->this$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->access$100(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKTextView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 719
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 721
    iget-boolean p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$2;->val$setEnabled:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$2;->this$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->access$200(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)V

    goto :goto_0

    .line 722
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$2;->this$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->access$300(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)V

    :goto_0
    return-void
.end method
