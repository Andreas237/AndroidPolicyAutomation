.class Lcom/shopkick/app/campaigns/BLECampaignController$2;
.super Ljava/lang/Object;
.source "BLECampaignController.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/campaigns/BLECampaignController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/campaigns/BLECampaignController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/campaigns/BLECampaignController;)V
    .locals 0

    .line 671
    iput-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$2;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    .line 674
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$2;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->updatedLocation(Landroid/location/Location;)V

    return-void
.end method
