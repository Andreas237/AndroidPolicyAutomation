.class Lcom/newrelic/agent/android/crash/CrashReporter$2;
.super Ljava/lang/Object;
.source "CrashReporter.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/agent/android/crash/CrashReporter;->onHarvestConnected()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/agent/android/crash/CrashReporter;


# direct methods
.method constructor <init>(Lcom/newrelic/agent/android/crash/CrashReporter;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/newrelic/agent/android/crash/CrashReporter$2;->this$0:Lcom/newrelic/agent/android/crash/CrashReporter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 201
    invoke-virtual {p0}, Lcom/newrelic/agent/android/crash/CrashReporter$2;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/newrelic/agent/android/crash/CrashReporter$2;->this$0:Lcom/newrelic/agent/android/crash/CrashReporter;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/crash/CrashReporter;->reportSavedCrashes()V

    .line 205
    iget-object v0, p0, Lcom/newrelic/agent/android/crash/CrashReporter$2;->this$0:Lcom/newrelic/agent/android/crash/CrashReporter;

    invoke-static {v0}, Lcom/newrelic/agent/android/crash/CrashReporter;->access$100(Lcom/newrelic/agent/android/crash/CrashReporter;)V

    const/4 v0, 0x0

    return-object v0
.end method
