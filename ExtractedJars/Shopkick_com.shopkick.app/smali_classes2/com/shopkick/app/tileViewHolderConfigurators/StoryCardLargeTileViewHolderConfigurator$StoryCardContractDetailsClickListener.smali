.class Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;
.super Ljava/lang/Object;
.source "StoryCardLargeTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "StoryCardContractDetailsClickListener"
.end annotation


# instance fields
.field private saveButton:Lcom/shopkick/app/widget/SKButton;

.field private storyCardDetailsAnimationController:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;

.field private storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

.field private usageButton:Lcom/shopkick/app/widget/SKButton;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/widget/SKButton;Lcom/shopkick/app/widget/SKButton;)V
    .locals 0

    .line 447
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 448
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->storyCardDetailsAnimationController:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;

    .line 449
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 450
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->saveButton:Lcom/shopkick/app/widget/SKButton;

    .line 451
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->usageButton:Lcom/shopkick/app/widget/SKButton;

    return-void
.end method

.method private enableButtons()V
    .locals 2

    .line 491
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->saveButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 492
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->usageButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 456
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v0, 0x7f0906f8

    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    return-void

    .line 463
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 464
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 465
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0906fa

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    .line 467
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->enableButtons()V

    .line 468
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->storyCardDetailsAnimationController:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;

    invoke-virtual {v1, p0, p1, v0}, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->contract(Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;Landroid/widget/RelativeLayout;I)V

    return-void
.end method

.method public viewDoneContracting()V
    .locals 2

    .line 477
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f090676

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    const-string v1, "HidingOfferDetailsConstraintKey"

    .line 478
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->addImpressionConstraintKey(Ljava/lang/String;)V

    .line 479
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0906f8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    const-string v1, "HidingOfferDetailsConstraintKey"

    .line 480
    invoke-interface {v0, v1}, Lcom/shopkick/app/logging/IUserEventView;->addImpressionConstraintKey(Ljava/lang/String;)V

    .line 482
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0906fa

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    const-string v1, "ShowingOfferDetailsConstraintKey"

    .line 483
    invoke-interface {v0, v1}, Lcom/shopkick/app/logging/IUserEventView;->removeImpressionConstraintKey(Ljava/lang/String;)V

    .line 484
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0905f6

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    const-string v1, "ShowingOfferDetailsConstraintKey"

    .line 485
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->removeImpressionConstraintKey(Ljava/lang/String;)V

    .line 486
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardContractDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0907e8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    const-string v1, "ShowingOfferDetailsConstraintKey"

    .line 487
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->removeImpressionConstraintKey(Ljava/lang/String;)V

    return-void
.end method

.method public viewDoneExpanding()V
    .locals 0

    return-void
.end method
