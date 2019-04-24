.class Lcom/shopkick/app/store/MCommerceManager$1;
.super Ljava/lang/Object;
.source "MCommerceManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/MCommerceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/MCommerceManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/MCommerceManager;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager$1;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$1;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$000(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 89
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager$1;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v1}, Lcom/shopkick/app/store/MCommerceManager;->access$100(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/store/MCommerceManager$1;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v2}, Lcom/shopkick/app/store/MCommerceManager;->access$000(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v2

    new-instance v3, Lcom/shopkick/app/store/MCommerceManager$1$1;

    invoke-direct {v3, p0}, Lcom/shopkick/app/store/MCommerceManager$1$1;-><init>(Lcom/shopkick/app/store/MCommerceManager$1;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/overlays/base/OverlaysManager;->maybeReplaceCurrentOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;)V

    :cond_0
    return-void
.end method
