.class Lcom/shopkick/app/presence/AudioThreadController$1;
.super Ljava/lang/Object;
.source "AudioThreadController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/presence/AudioThreadController;->repostCallback(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/AudioThreadController;

.field final synthetic val$r:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/shopkick/app/presence/AudioThreadController;Ljava/lang/Runnable;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController$1;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    iput-object p2, p0, Lcom/shopkick/app/presence/AudioThreadController$1;->val$r:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$1;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-static {v0}, Lcom/shopkick/app/presence/AudioThreadController;->access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$1;->val$r:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->postBack(Ljava/lang/Runnable;)V

    return-void
.end method
