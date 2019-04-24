.class public interface abstract Lcom/shopkick/sdk/presence/PresenceSDKClient;
.super Ljava/lang/Object;
.source "PresenceSDKClient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener;,
        Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;
    }
.end annotation


# virtual methods
.method public abstract getSensorManager()Lcom/shopkick/sdk/presence/SensorManager;
.end method

.method public abstract start()Z
.end method

.method public abstract stop()V
.end method
