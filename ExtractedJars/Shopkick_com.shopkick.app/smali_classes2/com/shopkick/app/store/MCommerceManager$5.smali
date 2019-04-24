.class Lcom/shopkick/app/store/MCommerceManager$5;
.super Ljava/lang/Object;
.source "MCommerceManager.java"

# interfaces
.implements Lcom/shopkick/sdk/webviewsdk/WebviewController$ActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/MCommerceManager;->getAction(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
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

    .line 420
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager$5;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public action(Lcom/shopkick/sdk/webviewsdk/WebviewAction;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 424
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$5;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0, p1}, Lcom/shopkick/app/store/MCommerceManager;->access$702(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/sdk/webviewsdk/WebviewAction;)Lcom/shopkick/sdk/webviewsdk/WebviewAction;

    .line 425
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager$5;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {p1}, Lcom/shopkick/app/store/MCommerceManager;->access$800(Lcom/shopkick/app/store/MCommerceManager;)V

    goto :goto_0

    .line 427
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/MCommerceManager$5;->noAction()V

    :goto_0
    return-void
.end method

.method public noAction()V
    .locals 4

    .line 433
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$5;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$900(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 434
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$5;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0, v1}, Lcom/shopkick/app/store/MCommerceManager;->access$1002(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;)Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    .line 436
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$5;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0, v1}, Lcom/shopkick/app/store/MCommerceManager;->access$302(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 437
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$5;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$1200(Lcom/shopkick/app/store/MCommerceManager;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager$5;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v1}, Lcom/shopkick/app/store/MCommerceManager;->access$1100(Lcom/shopkick/app/store/MCommerceManager;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 438
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager$5;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v0}, Lcom/shopkick/app/store/MCommerceManager;->access$1300(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/application/dialog/DialogsManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager$5;->this$0:Lcom/shopkick/app/store/MCommerceManager;

    invoke-static {v1}, Lcom/shopkick/app/store/MCommerceManager;->access$600(Lcom/shopkick/app/store/MCommerceManager;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f110151

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method
