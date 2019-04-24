.class Lcom/shopkick/app/awards/AwardsManager$2;
.super Ljava/lang/Object;
.source "AwardsManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/awards/AwardsManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/awards/AwardsManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/awards/AwardsManager;)V
    .locals 0

    .line 1098
    iput-object p1, p0, Lcom/shopkick/app/awards/AwardsManager$2;->this$0:Lcom/shopkick/app/awards/AwardsManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1101
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager$2;->this$0:Lcom/shopkick/app/awards/AwardsManager;

    invoke-static {v0}, Lcom/shopkick/app/awards/AwardsManager;->access$100(Lcom/shopkick/app/awards/AwardsManager;)Lcom/shopkick/app/util/NotificationCenter;

    move-result-object v0

    const-string v1, "pending_requests_changed"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 1102
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager$2;->this$0:Lcom/shopkick/app/awards/AwardsManager;

    invoke-static {v0}, Lcom/shopkick/app/awards/AwardsManager;->access$200(Lcom/shopkick/app/awards/AwardsManager;)V

    return-void
.end method
