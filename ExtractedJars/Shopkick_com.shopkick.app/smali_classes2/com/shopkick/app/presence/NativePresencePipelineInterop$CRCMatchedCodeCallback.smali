.class public Lcom/shopkick/app/presence/NativePresencePipelineInterop$CRCMatchedCodeCallback;
.super Ljava/lang/Object;
.source "NativePresencePipelineInterop.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/NativePresencePipelineInterop;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "CRCMatchedCodeCallback"
.end annotation


# instance fields
.field private listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/presence/IPresenceListener;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/presence/NativePresencePipelineInterop;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/presence/NativePresencePipelineInterop;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/presence/IPresenceListener;",
            ">;)V"
        }
    .end annotation

    .line 702
    iput-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$CRCMatchedCodeCallback;->this$0:Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 703
    iput-object p2, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$CRCMatchedCodeCallback;->listeners:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 708
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop$CRCMatchedCodeCallback;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/presence/IPresenceListener;

    .line 709
    invoke-interface {v1}, Lcom/shopkick/app/presence/IPresenceListener;->crcMatchedCodeDetected()V

    goto :goto_0

    :cond_0
    return-void
.end method
