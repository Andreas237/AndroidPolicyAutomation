.class Lio/branch/referral/Branch$1;
.super Ljava/lang/Object;
.source "Branch.java"

# interfaces
.implements Lio/branch/referral/DeferredAppLinkDataHandler$AppLinkFetchEvents;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/referral/Branch;->initializeSession(Lio/branch/referral/Branch$BranchReferralInitListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/referral/Branch;


# direct methods
.method constructor <init>(Lio/branch/referral/Branch;)V
    .locals 0

    .line 2336
    iput-object p1, p0, Lio/branch/referral/Branch$1;->this$0:Lio/branch/referral/Branch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAppLinkFetchFinished(Ljava/lang/String;)V
    .locals 2

    .line 2339
    iget-object v0, p0, Lio/branch/referral/Branch$1;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$100(Lio/branch/referral/Branch;)Lio/branch/referral/PrefHelper;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/branch/referral/PrefHelper;->setIsAppLinkTriggeredInit(Ljava/lang/Boolean;)V

    if-eqz p1, :cond_0

    .line 2341
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 2342
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2343
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2344
    iget-object v0, p0, Lio/branch/referral/Branch$1;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$100(Lio/branch/referral/Branch;)Lio/branch/referral/PrefHelper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/branch/referral/PrefHelper;->setLinkClickIdentifier(Ljava/lang/String;)V

    .line 2347
    :cond_0
    iget-object p1, p0, Lio/branch/referral/Branch$1;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$200(Lio/branch/referral/Branch;)Lio/branch/referral/ServerRequestQueue;

    move-result-object p1

    sget-object v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->FB_APP_LINK_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-virtual {p1, v0}, Lio/branch/referral/ServerRequestQueue;->unlockProcessWait(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    .line 2348
    iget-object p1, p0, Lio/branch/referral/Branch$1;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$300(Lio/branch/referral/Branch;)V

    return-void
.end method
