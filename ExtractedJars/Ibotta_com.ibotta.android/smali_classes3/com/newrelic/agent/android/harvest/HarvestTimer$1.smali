.class Lcom/newrelic/agent/android/harvest/HarvestTimer$1;
.super Ljava/lang/Object;
.source "HarvestTimer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/agent/android/harvest/HarvestTimer;->tickNow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/agent/android/harvest/HarvestTimer;

.field final synthetic val$timer:Lcom/newrelic/agent/android/harvest/HarvestTimer;


# direct methods
.method constructor <init>(Lcom/newrelic/agent/android/harvest/HarvestTimer;Lcom/newrelic/agent/android/harvest/HarvestTimer;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestTimer$1;->this$0:Lcom/newrelic/agent/android/harvest/HarvestTimer;

    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/HarvestTimer$1;->val$timer:Lcom/newrelic/agent/android/harvest/HarvestTimer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestTimer$1;->val$timer:Lcom/newrelic/agent/android/harvest/HarvestTimer;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestTimer;->tick()V

    return-void
.end method
