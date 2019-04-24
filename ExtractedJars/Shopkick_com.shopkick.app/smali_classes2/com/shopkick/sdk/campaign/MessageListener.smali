.class public interface abstract Lcom/shopkick/sdk/campaign/MessageListener;
.super Ljava/lang/Object;
.source "MessageListener.java"


# virtual methods
.method public abstract getIconResourceId()I
.end method

.method public abstract getNotificationId(Lcom/shopkick/sdk/campaign/MessageEvent;)I
.end method

.method public abstract getRequestCode(Lcom/shopkick/sdk/campaign/MessageEvent;)I
.end method

.method public abstract getTopActivity()Landroid/app/Activity;
.end method

.method public abstract launchDeepLink(Ljava/lang/String;Lcom/shopkick/sdk/campaign/MessageEvent;Z)V
.end method

.method public abstract onMessageTriggered(Lcom/shopkick/sdk/campaign/MessageEvent;)V
.end method
