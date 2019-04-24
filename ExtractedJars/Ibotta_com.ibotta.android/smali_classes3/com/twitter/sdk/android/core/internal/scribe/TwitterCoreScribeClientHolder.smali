.class public Lcom/twitter/sdk/android/core/internal/scribe/TwitterCoreScribeClientHolder;
.super Ljava/lang/Object;
.source "TwitterCoreScribeClientHolder.java"


# static fields
.field private static instance:Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;


# direct methods
.method public static getScribeClient()Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;
    .locals 1

    .line 38
    sget-object v0, Lcom/twitter/sdk/android/core/internal/scribe/TwitterCoreScribeClientHolder;->instance:Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;

    return-object v0
.end method

.method public static initialize(Lcom/twitter/sdk/android/core/TwitterCore;Ljava/util/List;Lio/fabric/sdk/android/services/common/IdManager;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/TwitterCore;",
            "Ljava/util/List<",
            "Lcom/twitter/sdk/android/core/SessionManager<",
            "+",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;>;",
            "Lio/fabric/sdk/android/services/common/IdManager;",
            ")V"
        }
    .end annotation

    .line 46
    new-instance v0, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;

    const-string v1, "TwitterCore"

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;-><init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/util/List;Lio/fabric/sdk/android/services/common/IdManager;)V

    sput-object v0, Lcom/twitter/sdk/android/core/internal/scribe/TwitterCoreScribeClientHolder;->instance:Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;

    return-void
.end method
