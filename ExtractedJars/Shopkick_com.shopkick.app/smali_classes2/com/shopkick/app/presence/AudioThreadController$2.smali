.class Lcom/shopkick/app/presence/AudioThreadController$2;
.super Ljava/lang/Object;
.source "AudioThreadController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/presence/AudioThreadController;->callCallback(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/AudioThreadController;

.field final synthetic val$callback:Ljava/util/concurrent/Callable;

.field final synthetic val$future:Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;


# direct methods
.method constructor <init>(Lcom/shopkick/app/presence/AudioThreadController;Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;Ljava/util/concurrent/Callable;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController$2;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    iput-object p2, p0, Lcom/shopkick/app/presence/AudioThreadController$2;->val$future:Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;

    iput-object p3, p0, Lcom/shopkick/app/presence/AudioThreadController$2;->val$callback:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 223
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$2;->val$future:Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;

    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController$2;->val$callback:Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
