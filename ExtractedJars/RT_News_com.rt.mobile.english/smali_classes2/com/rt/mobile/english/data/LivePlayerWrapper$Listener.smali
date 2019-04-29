.class public interface abstract Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;
.super Ljava/lang/Object;
.source "LivePlayerWrapper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/LivePlayerWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract ccUpdated(Ljava/lang/Boolean;)V
.end method

.method public abstract loadingChanged(Ljava/lang/Boolean;)V
.end method

.method public abstract onPlayerError(I)V
.end method

.method public abstract stateChanged(ILjava/lang/Boolean;)V
.end method
