.class Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1$1;
.super Ljava/util/TimerTask;
.source "FTUEEarnTabOverlay1.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->setupStartFTUEEarnTabOverlay2Timer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;

.field final synthetic val$handler:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;Landroid/os/Handler;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1$1;->this$0:Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;

    iput-object p2, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1$1;->val$handler:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic lambda$run$94(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1$1;)V
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1$1;->this$0:Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;

    invoke-static {v0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;->access$000(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1$1;->val$handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEEarnTabOverlay1$1$-j0DqBtxGdyyJ7LszfyxjGO2hRs;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEEarnTabOverlay1$1$-j0DqBtxGdyyJ7LszfyxjGO2hRs;-><init>(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
