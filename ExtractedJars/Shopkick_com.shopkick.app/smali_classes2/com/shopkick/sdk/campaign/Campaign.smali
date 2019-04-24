.class public interface abstract Lcom/shopkick/sdk/campaign/Campaign;
.super Ljava/lang/Object;
.source "Campaign.java"


# static fields
.field public static final CAMPAIGN_TYPE_BLE:I = 0x1

.field public static final CAMPAIGN_TYPE_GEOFENCING:I = 0x2


# virtual methods
.method public abstract getCampaignId()Ljava/lang/String;
.end method

.method public abstract getEndTime()J
.end method

.method public abstract getMessages()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/campaign/Message;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getStartTime()J
.end method

.method public abstract getType()I
.end method
