.class Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay$1;
.super Ljava/lang/Object;
.source "RedeemPromoCodeOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;-><init>(Landroid/content/Context;Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/account/UserAccountDataSource;)V
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

    .line 92
    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;->cancel()V

    return-void
.end method
