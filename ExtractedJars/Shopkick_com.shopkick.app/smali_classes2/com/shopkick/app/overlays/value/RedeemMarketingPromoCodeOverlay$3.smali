.class Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay$3;
.super Ljava/lang/Object;
.source "RedeemMarketingPromoCodeOverlay.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->setCodeAppliedState()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay$3;->this$0:Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay$3;->this$0:Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay$3;->this$0:Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->dismiss()V

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay$3;->this$0:Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;

    invoke-static {v0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->access$100(Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;)Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->enableOverlay(Z)V

    :cond_0
    return-void
.end method
