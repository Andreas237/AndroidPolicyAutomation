.class Lcom/launchdarkly/android/StreamUpdateProcessor$2;
.super Ljava/lang/Object;
.source "StreamUpdateProcessor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/StreamUpdateProcessor;->stop()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/StreamUpdateProcessor;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$2;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$2;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-static {v0}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$900(Lcom/launchdarkly/android/StreamUpdateProcessor;)V

    return-void
.end method
