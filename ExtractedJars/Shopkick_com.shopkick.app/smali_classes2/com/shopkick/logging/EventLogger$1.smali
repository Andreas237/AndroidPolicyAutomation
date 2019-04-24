.class Lcom/shopkick/logging/EventLogger$1;
.super Ljava/lang/Object;
.source "EventLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/logging/EventLogger;

.field final synthetic val$message:Lcom/shopkick/logging/Message;


# direct methods
.method constructor <init>(Lcom/shopkick/logging/EventLogger;Lcom/shopkick/logging/Message;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/shopkick/logging/EventLogger$1;->this$0:Lcom/shopkick/logging/EventLogger;

    iput-object p2, p0, Lcom/shopkick/logging/EventLogger$1;->val$message:Lcom/shopkick/logging/Message;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 74
    iget-object v0, p0, Lcom/shopkick/logging/EventLogger$1;->this$0:Lcom/shopkick/logging/EventLogger;

    iget-object v1, p0, Lcom/shopkick/logging/EventLogger$1;->val$message:Lcom/shopkick/logging/Message;

    invoke-virtual {v0, v1}, Lcom/shopkick/logging/EventLogger;->log(Lcom/shopkick/logging/Message;)V

    return-void
.end method
