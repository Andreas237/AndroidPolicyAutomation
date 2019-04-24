.class public interface abstract Lcom/shopkick/sdk/campaign/Message;
.super Ljava/lang/Object;
.source "Message.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;,
        Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;
    }
.end annotation


# virtual methods
.method public abstract getBackgroundType()Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;
.end method

.method public abstract getCampaignId()Ljava/lang/String;
.end method

.method public abstract getForegroundDeepLink()Ljava/lang/String;
.end method

.method public abstract getForegroundType()Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;
.end method

.method public abstract getMessageId()Ljava/lang/String;
.end method

.method public abstract getNotificationDeepLink()Ljava/lang/String;
.end method

.method public abstract getNotificationLogoImageUrl()Ljava/lang/String;
.end method

.method public abstract getNotificationOverlayImageUrl()Ljava/lang/String;
.end method

.method public abstract getNotificationOverlayText()Ljava/lang/String;
.end method

.method public abstract getNotificationText()Ljava/lang/String;
.end method

.method public abstract getNotificationTitle()Ljava/lang/String;
.end method

.method public abstract getOverlayImageUrl()Ljava/lang/String;
.end method

.method public abstract getOverlayLogoUrl()Ljava/lang/String;
.end method

.method public abstract getOverlayText()Ljava/lang/String;
.end method

.method public abstract getZoneQuery()Ljava/lang/String;
.end method
