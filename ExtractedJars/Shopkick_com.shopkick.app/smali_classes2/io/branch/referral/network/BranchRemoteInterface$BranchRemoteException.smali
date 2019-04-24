.class public Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;
.super Ljava/lang/Exception;
.source "BranchRemoteInterface.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/network/BranchRemoteInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BranchRemoteException"
.end annotation


# instance fields
.field private branchErrorCode:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 284
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    const/16 v0, -0x71

    .line 276
    iput v0, p0, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;->branchErrorCode:I

    .line 285
    iput p1, p0, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;->branchErrorCode:I

    return-void
.end method

.method static synthetic access$200(Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;)I
    .locals 0

    .line 275
    iget p0, p0, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;->branchErrorCode:I

    return p0
.end method
