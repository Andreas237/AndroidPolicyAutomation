.class Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$RequestStub;
.super Lnet/toddm/comm/Request;
.source "TestDefaultRetryPolicyProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RequestStub"
.end annotation


# instance fields
.field final synthetic this$0:Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;


# direct methods
.method public constructor <init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 123
    iput-object p1, p0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$RequestStub;->this$0:Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;

    .line 124
    new-instance v1, Ljava/net/URI;

    const-string p1, "http://www.toddm.net/"

    invoke-direct {v1, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v2, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lnet/toddm/comm/Request;-><init>(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;Z)V

    return-void
.end method

.method public constructor <init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 126
    iput-object p1, p0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$RequestStub;->this$0:Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;

    .line 127
    new-instance v1, Ljava/net/URI;

    const-string p1, "http://www.toddm.net/"

    invoke-direct {v1, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v2, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lnet/toddm/comm/Request;-><init>(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;Z)V

    return-void
.end method
