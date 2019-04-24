.class Lcom/shopkick/app/presence/PresenceController$4;
.super Ljava/lang/Object;
.source "PresenceController.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/presence/PresenceController;->getWalkinHistory()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/PresenceController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/presence/PresenceController;)V
    .locals 0

    .line 762
    iput-object p1, p0, Lcom/shopkick/app/presence/PresenceController$4;->this$0:Lcom/shopkick/app/presence/PresenceController;

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

    .line 762
    invoke-virtual {p0}, Lcom/shopkick/app/presence/PresenceController$4;->call()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/String;
    .locals 1

    .line 765
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController$4;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-static {v0}, Lcom/shopkick/app/presence/PresenceController;->access$000(Lcom/shopkick/app/presence/PresenceController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->getWalkinHistory()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
