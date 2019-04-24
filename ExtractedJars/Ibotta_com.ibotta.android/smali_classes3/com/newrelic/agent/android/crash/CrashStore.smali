.class public interface abstract Lcom/newrelic/agent/android/crash/CrashStore;
.super Ljava/lang/Object;
.source "CrashStore.java"

# interfaces
.implements Lcom/newrelic/agent/android/payload/PayloadStore;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/newrelic/agent/android/payload/PayloadStore<",
        "Lcom/newrelic/agent/android/crash/Crash;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract clear()V
.end method

.method public abstract count()I
.end method

.method public abstract delete(Lcom/newrelic/agent/android/crash/Crash;)V
.end method

.method public abstract fetchAll()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/crash/Crash;",
            ">;"
        }
    .end annotation
.end method

.method public abstract store(Lcom/newrelic/agent/android/crash/Crash;)Z
.end method
