.class final Lcom/newrelic/agent/android/tracing/ActivityTrace$1;
.super Ljava/util/HashMap;
.source "ActivityTrace.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/tracing/ActivityTrace;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    .line 61
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "type"

    const-string v1, "ENVIRONMENT"

    .line 62
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/tracing/ActivityTrace$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
