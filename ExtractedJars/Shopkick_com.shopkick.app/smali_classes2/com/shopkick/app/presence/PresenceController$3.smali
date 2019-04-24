.class Lcom/shopkick/app/presence/PresenceController$3;
.super Ljava/lang/Object;
.source "PresenceController.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/presence/PresenceController;->getLocationListVersion()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/PresenceController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/presence/PresenceController;)V
    .locals 0

    .line 713
    iput-object p1, p0, Lcom/shopkick/app/presence/PresenceController$3;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Integer;
    .locals 1

    .line 716
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController$3;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-static {v0}, Lcom/shopkick/app/presence/PresenceController;->access$000(Lcom/shopkick/app/presence/PresenceController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->getLocationListVersion()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 713
    invoke-virtual {p0}, Lcom/shopkick/app/presence/PresenceController$3;->call()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
