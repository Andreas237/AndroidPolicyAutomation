.class Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$CheckboxClick;
.super Ljava/lang/Object;
.source "RedeemedRewardEmailConfirmationScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CheckboxClick"
.end annotation


# instance fields
.field private checkbox:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$CheckboxClick;->checkbox:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 172
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$CheckboxClick;->checkbox:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    return-void
.end method
