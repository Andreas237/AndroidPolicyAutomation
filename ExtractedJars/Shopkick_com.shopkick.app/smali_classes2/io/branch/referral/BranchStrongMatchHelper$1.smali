.class Lio/branch/referral/BranchStrongMatchHelper$1;
.super Ljava/lang/Object;
.source "BranchStrongMatchHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/referral/BranchStrongMatchHelper;->checkForStrongMatch(Landroid/content/Context;Ljava/lang/String;Lio/branch/referral/DeviceInfo;Lio/branch/referral/PrefHelper;Lio/branch/referral/SystemObserver;Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;)V
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

    .line 85
    iput-object p1, p0, Lio/branch/referral/BranchStrongMatchHelper$1;->this$0:Lio/branch/referral/BranchStrongMatchHelper;

    iput-object p2, p0, Lio/branch/referral/BranchStrongMatchHelper$1;->val$callback:Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 88
    iget-object v0, p0, Lio/branch/referral/BranchStrongMatchHelper$1;->this$0:Lio/branch/referral/BranchStrongMatchHelper;

    iget-object v1, p0, Lio/branch/referral/BranchStrongMatchHelper$1;->val$callback:Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;

    iget-boolean v2, v0, Lio/branch/referral/BranchStrongMatchHelper;->isStrongMatchUrlLaunched:Z

    invoke-static {v0, v1, v2}, Lio/branch/referral/BranchStrongMatchHelper;->access$000(Lio/branch/referral/BranchStrongMatchHelper;Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;Z)V

    return-void
.end method
