.class Lio/branch/referral/BranchStrongMatchHelper$3;
.super Ljava/lang/Object;
.source "BranchStrongMatchHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/referral/BranchStrongMatchHelper;->updateStrongMatchCheckFinished(Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/referral/BranchStrongMatchHelper;

.field final synthetic val$callback:Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;


# direct methods
.method constructor <init>(Lio/branch/referral/BranchStrongMatchHelper;Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lio/branch/referral/BranchStrongMatchHelper$3;->this$0:Lio/branch/referral/BranchStrongMatchHelper;

    iput-object p2, p0, Lio/branch/referral/BranchStrongMatchHelper$3;->val$callback:Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 149
    iget-object v0, p0, Lio/branch/referral/BranchStrongMatchHelper$3;->val$callback:Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;

    invoke-interface {v0}, Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;->onStrongMatchCheckFinished()V

    return-void
.end method
