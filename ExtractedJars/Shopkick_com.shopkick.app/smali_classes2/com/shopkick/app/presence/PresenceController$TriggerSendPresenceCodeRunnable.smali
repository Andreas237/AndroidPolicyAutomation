.class Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;
.super Ljava/lang/Object;
.source "PresenceController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/PresenceController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TriggerSendPresenceCodeRunnable"
.end annotation


# instance fields
.field private controllerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/presence/PresenceController;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/presence/PresenceController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/presence/PresenceController;Lcom/shopkick/app/presence/PresenceController;)V
    .locals 0

    .line 845
    iput-object p1, p0, Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;->this$0:Lcom/shopkick/app/presence/PresenceController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 846
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;->controllerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 851
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;->controllerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/presence/PresenceController;

    if-eqz v0, :cond_0

    .line 853
    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->triggerSendPresenceCode()V

    :cond_0
    return-void
.end method
