.class Lcom/shopkick/app/store/StoreDetailsScreen$4;
.super Ljava/util/TimerTask;
.source "StoreDetailsScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/StoreDetailsScreen;->startFTUELesson2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

.field final synthetic val$handler:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/StoreDetailsScreen;Landroid/os/Handler;)V
    .locals 0

    .line 1535
    iput-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$4;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    iput-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen$4;->val$handler:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic lambda$run$241(Lcom/shopkick/app/store/StoreDetailsScreen$4;)V
    .locals 6

    .line 1539
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen$4;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-static {v0}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$600(Lcom/shopkick/app/store/StoreDetailsScreen;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/store/StoreDetailsScreen$4;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-static {v2}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$700(Lcom/shopkick/app/store/StoreDetailsScreen;)I

    move-result v2

    iget-object v3, p0, Lcom/shopkick/app/store/StoreDetailsScreen$4;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-static {v3}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$800(Lcom/shopkick/app/store/StoreDetailsScreen;)I

    move-result v3

    iget-object v4, p0, Lcom/shopkick/app/store/StoreDetailsScreen$4;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-static {v4}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$900(Lcom/shopkick/app/store/StoreDetailsScreen;)I

    move-result v4

    iget-object v5, p0, Lcom/shopkick/app/store/StoreDetailsScreen$4;->this$0:Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-static {v5}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$1000(Lcom/shopkick/app/store/StoreDetailsScreen;)I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/store/StoreDetailsScreen;->startStoreDetailsLesson(Ljava/lang/String;IIII)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1538
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen$4;->val$handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/store/-$$Lambda$StoreDetailsScreen$4$n_u6CIQ88u_TcupYu81um3H9ODs;

    invoke-direct {v1, p0}, Lcom/shopkick/app/store/-$$Lambda$StoreDetailsScreen$4$n_u6CIQ88u_TcupYu81um3H9ODs;-><init>(Lcom/shopkick/app/store/StoreDetailsScreen$4;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
