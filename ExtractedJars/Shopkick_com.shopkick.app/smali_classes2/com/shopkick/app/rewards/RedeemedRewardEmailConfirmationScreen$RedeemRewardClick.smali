.class Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$RedeemRewardClick;
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
    name = "RedeemRewardClick"
.end annotation


# instance fields
.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V
    .locals 1

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$RedeemRewardClick;->screenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 186
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$RedeemRewardClick;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;

    if-eqz p1, :cond_0

    .line 188
    invoke-static {p1}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->access$000(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V

    :cond_0
    return-void
.end method
