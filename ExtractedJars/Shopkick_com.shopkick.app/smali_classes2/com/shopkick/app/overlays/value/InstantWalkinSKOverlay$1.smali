.class Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay$1;
.super Ljava/lang/Object;
.source "InstantWalkinSKOverlay.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;

    invoke-static {v0}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->access$000(Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;)Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->startBallEnterAnim()V

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->access$102(Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;Z)Z

    return-void
.end method
