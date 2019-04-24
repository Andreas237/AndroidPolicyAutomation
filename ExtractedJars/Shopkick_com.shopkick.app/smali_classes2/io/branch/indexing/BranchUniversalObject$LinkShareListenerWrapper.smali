.class Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;
.super Ljava/lang/Object;
.source "BranchUniversalObject.java"

# interfaces
.implements Lio/branch/referral/Branch$BranchLinkShareListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/indexing/BranchUniversalObject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LinkShareListenerWrapper"
.end annotation


# instance fields
.field private final linkProperties_:Lio/branch/referral/util/LinkProperties;

.field private final originalCallback_:Lio/branch/referral/Branch$BranchLinkShareListener;

.field private final shareLinkBuilder_:Lio/branch/referral/Branch$ShareLinkBuilder;

.field final synthetic this$0:Lio/branch/indexing/BranchUniversalObject;


# direct methods
.method constructor <init>(Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/Branch$BranchLinkShareListener;Lio/branch/referral/Branch$ShareLinkBuilder;Lio/branch/referral/util/LinkProperties;)V
    .locals 0

    .line 949
    iput-object p1, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->this$0:Lio/branch/indexing/BranchUniversalObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 950
    iput-object p2, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->originalCallback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    .line 951
    iput-object p3, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->shareLinkBuilder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 952
    iput-object p4, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->linkProperties_:Lio/branch/referral/util/LinkProperties;

    return-void
.end method


# virtual methods
.method public onChannelSelected(Ljava/lang/String;)V
    .locals 3

    .line 986
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->originalCallback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    if-eqz v0, :cond_0

    .line 987
    invoke-interface {v0, p1}, Lio/branch/referral/Branch$BranchLinkShareListener;->onChannelSelected(Ljava/lang/String;)V

    .line 989
    :cond_0
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->originalCallback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    instance-of v1, v0, Lio/branch/referral/Branch$ExtendedBranchLinkShareListener;

    if-eqz v1, :cond_1

    .line 990
    check-cast v0, Lio/branch/referral/Branch$ExtendedBranchLinkShareListener;

    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->this$0:Lio/branch/indexing/BranchUniversalObject;

    iget-object v2, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->linkProperties_:Lio/branch/referral/util/LinkProperties;

    invoke-interface {v0, p1, v1, v2}, Lio/branch/referral/Branch$ExtendedBranchLinkShareListener;->onChannelSelected(Ljava/lang/String;Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/util/LinkProperties;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 991
    iget-object p1, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->shareLinkBuilder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->this$0:Lio/branch/indexing/BranchUniversalObject;

    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getShortLinkBuilder()Lio/branch/referral/BranchShortLinkBuilder;

    move-result-object v1

    iget-object v2, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->linkProperties_:Lio/branch/referral/util/LinkProperties;

    invoke-static {v0, v1, v2}, Lio/branch/indexing/BranchUniversalObject;->access$100(Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/BranchShortLinkBuilder;Lio/branch/referral/util/LinkProperties;)Lio/branch/referral/BranchShortLinkBuilder;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/branch/referral/Branch$ShareLinkBuilder;->setShortLinkBuilderInternal(Lio/branch/referral/BranchShortLinkBuilder;)V

    :cond_1
    return-void
.end method

.method public onLinkShareResponse(Ljava/lang/String;Ljava/lang/String;Lio/branch/referral/BranchError;)V
    .locals 3

    .line 971
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-nez p3, :cond_0

    .line 973
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->SharedLink:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 975
    :cond_0
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ShareError:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lio/branch/referral/BranchError;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 978
    :goto_0
    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->this$0:Lio/branch/indexing/BranchUniversalObject;

    sget-object v2, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->SHARE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    invoke-virtual {v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lio/branch/indexing/BranchUniversalObject;->userCompletedAction(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 979
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->originalCallback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    if-eqz v0, :cond_1

    .line 980
    invoke-interface {v0, p1, p2, p3}, Lio/branch/referral/Branch$BranchLinkShareListener;->onLinkShareResponse(Ljava/lang/String;Ljava/lang/String;Lio/branch/referral/BranchError;)V

    :cond_1
    return-void
.end method

.method public onShareLinkDialogDismissed()V
    .locals 1

    .line 964
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->originalCallback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    if-eqz v0, :cond_0

    .line 965
    invoke-interface {v0}, Lio/branch/referral/Branch$BranchLinkShareListener;->onShareLinkDialogDismissed()V

    :cond_0
    return-void
.end method

.method public onShareLinkDialogLaunched()V
    .locals 1

    .line 957
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;->originalCallback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    if-eqz v0, :cond_0

    .line 958
    invoke-interface {v0}, Lio/branch/referral/Branch$BranchLinkShareListener;->onShareLinkDialogLaunched()V

    :cond_0
    return-void
.end method
