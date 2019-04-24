.class final Lcom/newrelic/agent/android/instrumentation/MetricCategory$1;
.super Ljava/util/HashMap;
.source "MetricCategory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/instrumentation/MetricCategory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Lcom/newrelic/agent/android/instrumentation/MetricCategory;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "onCreate"

    .line 17
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->VIEW_LOADING:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/instrumentation/MetricCategory$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
