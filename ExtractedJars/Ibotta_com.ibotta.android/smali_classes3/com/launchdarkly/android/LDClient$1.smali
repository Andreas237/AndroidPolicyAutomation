.class final Lcom/launchdarkly/android/LDClient$1;
.super Ljava/lang/Object;
.source "LDClient.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/LDClient;->init(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;Lcom/launchdarkly/android/LDUser;)Ljava/util/concurrent/Future;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function<",
        "Ljava/util/List<",
        "Ljava/lang/Void;",
        ">;",
        "Lcom/launchdarkly/android/LDClient;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/util/List;)Lcom/launchdarkly/android/LDClient;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;)",
            "Lcom/launchdarkly/android/LDClient;"
        }
    .end annotation

    .line 183
    invoke-static {}, Lcom/launchdarkly/android/LDClient;->access$000()Ljava/util/Map;

    move-result-object p1

    const-string v0, "default"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/launchdarkly/android/LDClient;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 180
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/LDClient$1;->apply(Ljava/util/List;)Lcom/launchdarkly/android/LDClient;

    move-result-object p1

    return-object p1
.end method
