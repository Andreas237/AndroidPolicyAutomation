.class Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$3;
.super Ljava/lang/Object;
.source "SelectedRewardTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->kickCounterAnimator()Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

.field final synthetic val$weakRef:Ljava/lang/ref/WeakReference;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 369
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$3;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$3;->val$weakRef:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 6

    .line 371
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$3;->val$weakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

    if-eqz v0, :cond_0

    .line 373
    invoke-static {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->access$400(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v1

    invoke-static {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->access$600(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0f0011

    .line 375
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 377
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    .line 376
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v5

    .line 374
    invoke-virtual {v0, v2, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 378
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 373
    invoke-virtual {v1, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
