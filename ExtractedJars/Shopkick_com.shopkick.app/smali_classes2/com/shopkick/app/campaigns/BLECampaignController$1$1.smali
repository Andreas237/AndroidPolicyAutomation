.class Lcom/shopkick/app/campaigns/BLECampaignController$1$1;
.super Ljava/lang/Object;
.source "BLECampaignController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/campaigns/BLECampaignController$1;->completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/campaigns/BLECampaignController$1;

.field final synthetic val$response:Lcom/shopkick/fetchers/DataResponse;


# direct methods
.method constructor <init>(Lcom/shopkick/app/campaigns/BLECampaignController$1;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$1$1;->this$1:Lcom/shopkick/app/campaigns/BLECampaignController$1;

    iput-object p2, p0, Lcom/shopkick/app/campaigns/BLECampaignController$1$1;->val$response:Lcom/shopkick/fetchers/DataResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 288
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$1$1;->this$1:Lcom/shopkick/app/campaigns/BLECampaignController$1;

    iget-object v0, v0, Lcom/shopkick/app/campaigns/BLECampaignController$1;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    iget-object v1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$1$1;->val$response:Lcom/shopkick/fetchers/DataResponse;

    invoke-static {v0, v1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$000(Lcom/shopkick/app/campaigns/BLECampaignController;Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method
