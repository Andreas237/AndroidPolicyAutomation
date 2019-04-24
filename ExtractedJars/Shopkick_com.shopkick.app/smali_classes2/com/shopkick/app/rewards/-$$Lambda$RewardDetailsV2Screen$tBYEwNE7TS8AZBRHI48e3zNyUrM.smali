.class public final synthetic Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$tBYEwNE7TS8AZBRHI48e3zNyUrM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

.field private final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$tBYEwNE7TS8AZBRHI48e3zNyUrM;->f$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    iput p2, p0, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$tBYEwNE7TS8AZBRHI48e3zNyUrM;->f$1:I

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$tBYEwNE7TS8AZBRHI48e3zNyUrM;->f$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    iget v1, p0, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$tBYEwNE7TS8AZBRHI48e3zNyUrM;->f$1:I

    invoke-static {v0, v1, p1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->lambda$animateButtonColor$220(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;ILandroid/animation/ValueAnimator;)V

    return-void
.end method
