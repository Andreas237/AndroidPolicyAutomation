.class public interface abstract Lio/branch/referral/Branch$BranchLinkShareListener;
.super Ljava/lang/Object;
.source "Branch.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/Branch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "BranchLinkShareListener"
.end annotation


# virtual methods
.method public abstract onChannelSelected(Ljava/lang/String;)V
.end method

.method public abstract onLinkShareResponse(Ljava/lang/String;Ljava/lang/String;Lio/branch/referral/BranchError;)V
.end method

.method public abstract onShareLinkDialogDismissed()V
.end method

.method public abstract onShareLinkDialogLaunched()V
.end method
