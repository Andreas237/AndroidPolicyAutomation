.class Lcom/shopkick/app/application/SKLogger$1;
.super Ljava/lang/Object;
.source "SKLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/application/SKLogger;->startTimer(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/SKLogger;

.field final synthetic val$periodMillis:J


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/SKLogger;J)V
    .locals 0

    .line 333
    iput-object p1, p0, Lcom/shopkick/app/application/SKLogger$1;->this$0:Lcom/shopkick/app/application/SKLogger;

    iput-wide p2, p0, Lcom/shopkick/app/application/SKLogger$1;->val$periodMillis:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 335
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger$1;->this$0:Lcom/shopkick/app/application/SKLogger;

    invoke-static {v0}, Lcom/shopkick/app/application/SKLogger;->access$300(Lcom/shopkick/app/application/SKLogger;)V

    .line 336
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger$1;->this$0:Lcom/shopkick/app/application/SKLogger;

    invoke-static {v0}, Lcom/shopkick/app/application/SKLogger;->access$100(Lcom/shopkick/app/application/SKLogger;)V

    .line 337
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger$1;->this$0:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/application/SKLogger;->handler:Landroid/os/Handler;

    iget-wide v1, p0, Lcom/shopkick/app/application/SKLogger$1;->val$periodMillis:J

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
