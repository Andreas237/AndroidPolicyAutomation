.class Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;
.super Lnet/toddm/comm/Response;
.source "TestDefaultRetryPolicyProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ResponseStub"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x6775d71832ed7895L


# instance fields
.field final synthetic this$0:Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;


# direct methods
.method public constructor <init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;ILjava/lang/Long;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 111
    iput-object p1, p0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;->this$0:Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;

    .line 112
    new-instance v6, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v6}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, p0

    move v3, p2

    invoke-direct/range {v0 .. v6}, Lnet/toddm/comm/Response;-><init>([BLjava/util/Map;IIILnet/toddm/cache/LoggingProvider;)V

    if-eqz p3, :cond_0

    .line 114
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 115
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    invoke-virtual {p0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;->getHeaders()Ljava/util/Map;

    move-result-object p2

    const-string p3, "Retry-After"

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
