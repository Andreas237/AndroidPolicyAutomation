.class Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;
.super Ljava/lang/Object;
.source "BLECampaignController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->onEntered(ILcom/shopkick/sdk/zone/ZoneReading;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;

.field final synthetic val$chainId:Ljava/lang/String;

.field final synthetic val$departmentId:Ljava/lang/String;

.field final synthetic val$locationId:Ljava/lang/String;

.field final synthetic val$reading:Lcom/shopkick/sdk/zone/ZoneReading;


# direct methods
.method constructor <init>(Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 536
    iput-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->this$1:Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;

    iput-object p2, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->val$reading:Lcom/shopkick/sdk/zone/ZoneReading;

    iput-object p3, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->val$chainId:Ljava/lang/String;

    iput-object p4, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->val$departmentId:Ljava/lang/String;

    iput-object p5, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->val$locationId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 539
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->this$1:Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;

    const-string v1, "[BLE_MESSAGING] Runnable to show overlay"

    iget-object v2, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->val$reading:Lcom/shopkick/sdk/zone/ZoneReading;

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->access$1000(Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;Ljava/lang/String;Lcom/shopkick/sdk/zone/ZoneReading;)V

    .line 540
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->this$1:Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;

    iget-object v0, v0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$700(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/campaigns/MessagingManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->this$1:Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;

    invoke-static {v1}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->access$1100(Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;)Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->val$chainId:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->val$departmentId:Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;->val$locationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/campaigns/MessagingManager;->doOverlay(Lcom/shopkick/app/fetchers/api/skapi/Campaign;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method
