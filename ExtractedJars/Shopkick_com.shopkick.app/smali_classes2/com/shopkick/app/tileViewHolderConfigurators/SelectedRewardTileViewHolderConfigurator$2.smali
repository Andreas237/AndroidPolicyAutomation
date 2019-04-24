.class Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SelectedRewardTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->startAnimations()V
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

    .line 296
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$2;->val$weakRef:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 299
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$2;->val$weakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

    if-nez p1, :cond_0

    return-void

    .line 305
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->access$300(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v0

    const v1, 0x7f11064c

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 306
    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->access$400(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v0

    const v1, 0x7f11064d

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 307
    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->access$500(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    const v1, 0x7f110652

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 309
    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->access$400(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object p1

    const/high16 v0, 0x41f00000    # 30.0f

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(F)V

    return-void
.end method
