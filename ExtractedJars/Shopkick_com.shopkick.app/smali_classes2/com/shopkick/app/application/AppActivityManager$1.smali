.class Lcom/shopkick/app/application/AppActivityManager$1;
.super Ljava/lang/Object;
.source "AppActivityManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/AppActivityManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/AppActivityManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/AppActivityManager;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/shopkick/app/application/AppActivityManager$1;->this$0:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/shopkick/app/application/AppActivityManager$1;->this$0:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->onAllAppActivitiesPaused()V

    return-void
.end method
