.class Lcom/shopkick/app/presence/PresenceController$2;
.super Ljava/lang/Object;
.source "PresenceController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/presence/PresenceController;->updateLocationList(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/PresenceController;

.field final synthetic val$absolutePath:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/shopkick/app/presence/PresenceController;Ljava/lang/String;)V
    .locals 0

    .line 690
    iput-object p1, p0, Lcom/shopkick/app/presence/PresenceController$2;->this$0:Lcom/shopkick/app/presence/PresenceController;

    iput-object p2, p0, Lcom/shopkick/app/presence/PresenceController$2;->val$absolutePath:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 693
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController$2;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-static {v0}, Lcom/shopkick/app/presence/PresenceController;->access$000(Lcom/shopkick/app/presence/PresenceController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceController$2;->val$absolutePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->updateLocationList(Ljava/lang/String;)V

    .line 694
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController$2;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-static {v0}, Lcom/shopkick/app/presence/PresenceController;->access$000(Lcom/shopkick/app/presence/PresenceController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->updateDistances(Z)V

    .line 700
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController$2;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-static {v0}, Lcom/shopkick/app/presence/PresenceController;->access$000(Lcom/shopkick/app/presence/PresenceController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->getLocationListVersion()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 701
    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceController$2;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-static {v1}, Lcom/shopkick/app/presence/PresenceController;->access$000(Lcom/shopkick/app/presence/PresenceController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v1

    const/16 v2, 0x15

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->storePdEvent(ILjava/lang/String;Lcom/shopkick/app/location/SKLocation;)V

    .line 704
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController$2;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-static {v0}, Lcom/shopkick/app/presence/PresenceController;->access$000(Lcom/shopkick/app/presence/PresenceController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->triggerLocationFinder()V

    return-void
.end method
