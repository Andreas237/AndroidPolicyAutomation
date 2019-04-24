.class public interface abstract Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;
.super Ljava/lang/Object;
.source "FriendsMessageFlyUpCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "FriendMessageListener"
.end annotation


# virtual methods
.method public abstract getContext()Landroid/content/Context;
.end method

.method public abstract onFriendMessageSendFinished(Lcom/ibotta/api/ApiException;)V
    .param p1    # Lcom/ibotta/api/ApiException;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onFriendMessageSending(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
