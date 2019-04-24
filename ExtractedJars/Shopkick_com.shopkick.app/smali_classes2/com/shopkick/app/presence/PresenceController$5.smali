.class Lcom/shopkick/app/presence/PresenceController$5;
.super Ljava/lang/Object;
.source "PresenceController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/presence/PresenceController;->clearWalkinHistory()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/PresenceController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/presence/PresenceController;)V
    .locals 0

    .line 776
    iput-object p1, p0, Lcom/shopkick/app/presence/PresenceController$5;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 779
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController$5;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-static {v0}, Lcom/shopkick/app/presence/PresenceController;->access$000(Lcom/shopkick/app/presence/PresenceController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->clearWalkinHistory()V

    return-void
.end method
