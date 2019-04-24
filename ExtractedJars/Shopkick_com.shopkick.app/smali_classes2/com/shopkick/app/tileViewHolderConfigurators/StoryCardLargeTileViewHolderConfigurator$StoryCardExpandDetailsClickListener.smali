.class Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;
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
    name = "StoryCardExpandDetailsClickListener"
.end annotation


# instance fields
.field private saveButton:Lcom/shopkick/app/widget/SKButton;

.field private storyCardDetailsAnimationController:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;

.field private storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

.field private usageButton:Lcom/shopkick/app/widget/SKButton;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/widget/SKButton;Lcom/shopkick/app/widget/SKButton;)V
    .locals 0

    .line 387
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 388
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->storyCardDetailsAnimationController:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;

    .line 389
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 390
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->saveButton:Lcom/shopkick/app/widget/SKButton;

    .line 391
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->usageButton:Lcom/shopkick/app/widget/SKButton;

    return-void
.end method

.method private disableButtons()V
    .locals 2

    .line 432
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->saveButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 433
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->usageButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 396
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

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
    if-eqz p1, :cond_1

    return-void

    .line 404
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 405
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0906fa

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    const/16 v1, 0x8

    .line 407
    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setVisibility(I)V

    .line 408
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->disableButtons()V

    .line 409
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->storyCardDetailsAnimationController:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;

    invoke-virtual {v1, p0, p1, v0}, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->expand(Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;Landroid/widget/RelativeLayout;I)V

    return-void
.end method

.method public viewDoneContracting()V
    .locals 0

    return-void
.end method

.method public viewDoneExpanding()V
    .locals 2

    .line 414
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f090676

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    const-string v1, "HidingOfferDetailsConstraintKey"

    .line 415
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->removeImpressionConstraintKey(Ljava/lang/String;)V

    .line 416
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0906f8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    const-string v1, "HidingOfferDetailsConstraintKey"

    .line 417
    invoke-interface {v0, v1}, Lcom/shopkick/app/logging/IUserEventView;->removeImpressionConstraintKey(Ljava/lang/String;)V

    .line 419
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0906fa

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    const-string v1, "ShowingOfferDetailsConstraintKey"

    .line 420
    invoke-interface {v0, v1}, Lcom/shopkick/app/logging/IUserEventView;->addImpressionConstraintKey(Ljava/lang/String;)V

    .line 421
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0905f6

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    const-string v1, "ShowingOfferDetailsConstraintKey"

    .line 422
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->addImpressionConstraintKey(Ljava/lang/String;)V

    .line 423
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator$StoryCardExpandDetailsClickListener;->storyCardViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const v1, 0x7f0907e8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    const-string v1, "ShowingOfferDetailsConstraintKey"

    .line 424
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->addImpressionConstraintKey(Ljava/lang/String;)V

    return-void
.end method
