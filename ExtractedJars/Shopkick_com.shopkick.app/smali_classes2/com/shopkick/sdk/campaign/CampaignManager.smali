.class public interface abstract Lcom/shopkick/sdk/campaign/CampaignManager;
.super Ljava/lang/Object;
.source "CampaignManager.java"


# virtual methods
.method public abstract addCampaignListener(Lcom/shopkick/sdk/campaign/MessageListener;)V
.end method

.method public abstract addStatusListener(Lcom/shopkick/sdk/campaign/CampaignStatusListener;)V
.end method

.method public abstract getCampaignsForZone(Lcom/shopkick/sdk/zone/Zone;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/zone/Zone;",
            ")",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/campaign/Campaign;",
            ">;"
        }
    .end annotation
.end method

.method public abstract handleCampaignMessage(Lcom/shopkick/sdk/campaign/MessageEvent;Lcom/shopkick/sdk/campaign/MessageListener;)V
.end method

.method public abstract processLocalNotification(Landroid/content/Intent;Lcom/shopkick/sdk/campaign/MessageListener;)V
.end method

.method public abstract removeCampaignListener(Lcom/shopkick/sdk/campaign/MessageListener;)V
.end method

.method public abstract removeStatusListener(Lcom/shopkick/sdk/campaign/CampaignStatusListener;)V
.end method

.method public abstract start()Z
.end method

.method public abstract stop()V
.end method
