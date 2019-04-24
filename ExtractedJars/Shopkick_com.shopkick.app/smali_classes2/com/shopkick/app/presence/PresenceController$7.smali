.class Lcom/shopkick/app/presence/PresenceController$7;
.super Ljava/lang/Object;
.source "PresenceController.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/presence/PresenceController;->getPdEvents()Ljava/lang/String;
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

    .line 810
    iput-object p1, p0, Lcom/shopkick/app/presence/PresenceController$7;->this$0:Lcom/shopkick/app/presence/PresenceController;

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

    .line 810
    invoke-virtual {p0}, Lcom/shopkick/app/presence/PresenceController$7;->call()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/String;
    .locals 1

    .line 813
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController$7;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-static {v0}, Lcom/shopkick/app/presence/PresenceController;->access$000(Lcom/shopkick/app/presence/PresenceController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->getPdEvents()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
