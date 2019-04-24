.class Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay$3;
.super Ljava/lang/Object;
.source "RedeemPromoCodeOverlay.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;->setCodeAppliedState()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay$3;->this$0:Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay$3;->this$0:Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay$3;->this$0:Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;->dismiss()V

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay$3;->this$0:Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;

    invoke-static {v0}, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;->access$100(Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;)Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->enableOverlay(Z)V

    :cond_0
    return-void
.end method
