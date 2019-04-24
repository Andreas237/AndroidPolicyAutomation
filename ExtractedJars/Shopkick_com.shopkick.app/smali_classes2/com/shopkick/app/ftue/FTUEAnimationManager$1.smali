.class Lcom/shopkick/app/ftue/FTUEAnimationManager$1;
.super Ljava/util/TimerTask;
.source "FTUEAnimationManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/ftue/FTUEAnimationManager;->startTextViewAnimation(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

.field final synthetic val$handler:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;Landroid/os/Handler;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$1;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iput-object p2, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$1;->val$handler:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic lambda$run$77(Lcom/shopkick/app/ftue/FTUEAnimationManager$1;)V
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$1;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->access$000(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$1;->val$handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$1$Q7FEIVuEhmlj7ngpO87s_nTdgyo;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$1$Q7FEIVuEhmlj7ngpO87s_nTdgyo;-><init>(Lcom/shopkick/app/ftue/FTUEAnimationManager$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
