.class public interface abstract Lio/branch/referral/BranchViewHandler$IBranchViewEvents;
.super Ljava/lang/Object;
.source "BranchViewHandler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/BranchViewHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IBranchViewEvents"
.end annotation


# virtual methods
.method public abstract onBranchViewAccepted(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onBranchViewCancelled(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onBranchViewError(ILjava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onBranchViewVisible(Ljava/lang/String;Ljava/lang/String;)V
.end method
