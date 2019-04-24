.class Lcom/shopkick/app/overlays/common/BatchSKOverlay$1;
.super Ljava/lang/Object;
.source "BatchSKOverlay.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/common/BatchSKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/common/BatchSKOverlay;

.field final synthetic val$message:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/common/BatchSKOverlay;Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/BatchSKOverlay;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay$1;->val$message:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/BatchSKOverlay;

    iget-object v0, v0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay$1;->val$message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->startWoohooBallEnterAnim(Ljava/lang/String;)V

    return-void
.end method
