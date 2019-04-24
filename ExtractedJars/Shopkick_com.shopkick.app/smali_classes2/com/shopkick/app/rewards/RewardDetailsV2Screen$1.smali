.class Lcom/shopkick/app/rewards/RewardDetailsV2Screen$1;
.super Ljava/lang/Object;
.source "RewardDetailsV2Screen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->animateToast()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)V
    .locals 0

    .line 454
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$1;->this$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 460
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$1;->this$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->access$000(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

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
