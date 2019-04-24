.class public interface abstract Lcom/shopkick/sdk/campaign/CampaignStatusListener;
.super Ljava/lang/Object;
.source "CampaignStatusListener.java"


# virtual methods
.method public abstract onCampaignsUpdated(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/campaign/Message;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onErrorReceived(Lcom/shopkick/sdk/campaign/CampaignStatusError;)V
.end method
