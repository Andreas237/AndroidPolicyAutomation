.class Lcom/shopkick/app/presence/AudioThreadController$TriggerPresenceUpdate;
.super Ljava/lang/Object;
.source "AudioThreadController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/AudioThreadController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TriggerPresenceUpdate"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/AudioThreadController;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/presence/AudioThreadController;)V
    .locals 0

    .line 628
    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController$TriggerPresenceUpdate;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/presence/AudioThreadController;Lcom/shopkick/app/presence/AudioThreadController$1;)V
    .locals 0

    .line 628
    invoke-direct {p0, p1}, Lcom/shopkick/app/presence/AudioThreadController$TriggerPresenceUpdate;-><init>(Lcom/shopkick/app/presence/AudioThreadController;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 631
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$TriggerPresenceUpdate;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 632
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$TriggerPresenceUpdate;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->triggerLocationFinder()V

    :cond_0
    return-void
.end method
