.class Lcom/shopkick/app/rewards/RewardDetailsV2Screen$DenominationOnClickListener;
.super Ljava/lang/Object;
.source "RewardDetailsV2Screen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RewardDetailsV2Screen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DenominationOnClickListener"
.end annotation


# instance fields
.field denomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

.field screenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RewardDetailsV2Screen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;)V
    .locals 1

    .line 823
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 824
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$DenominationOnClickListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    .line 825
    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$DenominationOnClickListener;->denomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 830
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$DenominationOnClickListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 831
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    check-cast p1, Lcom/shopkick/app/widget/RewardDenominationView;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$DenominationOnClickListener;->denomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    invoke-static {v0, p1, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->access$400(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;Lcom/shopkick/app/widget/RewardDenominationView;Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;)V

    :cond_0
    return-void
.end method
