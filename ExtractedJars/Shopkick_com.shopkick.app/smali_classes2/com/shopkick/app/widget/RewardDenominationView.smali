.class public Lcom/shopkick/app/widget/RewardDenominationView;
.super Landroid/widget/RelativeLayout;
.source "RewardDenominationView.java"


# instance fields
.field private final denominationTextView:Landroid/widget/TextView;

.field private redeemable:Z

.field private selected:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 30
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 32
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c0186

    const/4 v1, 0x1

    .line 33
    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const p1, 0x7f0901e1

    .line 34
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/RewardDenominationView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/shopkick/app/widget/RewardDenominationView;->denominationTextView:Landroid/widget/TextView;

    .line 35
    iget-object p1, p0, Lcom/shopkick/app/widget/RewardDenominationView;->denominationTextView:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/widget/RewardDenominationView;->updateDisplay()V

    return-void
.end method

.method private updateDisplay()V
    .locals 3

    .line 40
    iget-boolean v0, p0, Lcom/shopkick/app/widget/RewardDenominationView;->selected:Z

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/widget/RewardDenominationView;->denominationTextView:Landroid/widget/TextView;

    const v1, 0x7f08012a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/widget/RewardDenominationView;->denominationTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/shopkick/app/widget/RewardDenominationView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f06015d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/widget/RewardDenominationView;->denominationTextView:Landroid/widget/TextView;

    const v1, 0x7f080129

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/widget/RewardDenominationView;->denominationTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/shopkick/app/widget/RewardDenominationView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0600c9

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public markAsNotSelected()V
    .locals 1

    const/4 v0, 0x0

    .line 61
    iput-boolean v0, p0, Lcom/shopkick/app/widget/RewardDenominationView;->selected:Z

    .line 62
    invoke-direct {p0}, Lcom/shopkick/app/widget/RewardDenominationView;->updateDisplay()V

    return-void
.end method

.method public markAsRedeemable()V
    .locals 1

    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, Lcom/shopkick/app/widget/RewardDenominationView;->redeemable:Z

    .line 70
    invoke-direct {p0}, Lcom/shopkick/app/widget/RewardDenominationView;->updateDisplay()V

    return-void
.end method

.method public markAsSelected()V
    .locals 1

    const/4 v0, 0x1

    .line 53
    iput-boolean v0, p0, Lcom/shopkick/app/widget/RewardDenominationView;->selected:Z

    .line 54
    invoke-direct {p0}, Lcom/shopkick/app/widget/RewardDenominationView;->updateDisplay()V

    return-void
.end method
