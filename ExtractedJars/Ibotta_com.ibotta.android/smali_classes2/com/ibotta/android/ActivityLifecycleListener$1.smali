.class Lcom/ibotta/android/ActivityLifecycleListener$1;
.super Ljava/lang/Object;
.source "ActivityLifecycleListener.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/ActivityLifecycleListener;->runDelayedConfirmation(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/ActivityLifecycleListener;

.field final synthetic val$activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/ActivityLifecycleListener;Landroid/app/Activity;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/ibotta/android/ActivityLifecycleListener$1;->this$0:Lcom/ibotta/android/ActivityLifecycleListener;

    iput-object p2, p0, Lcom/ibotta/android/ActivityLifecycleListener$1;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener$1;->this$0:Lcom/ibotta/android/ActivityLifecycleListener;

    invoke-static {v0}, Lcom/ibotta/android/ActivityLifecycleListener;->access$000(Lcom/ibotta/android/ActivityLifecycleListener;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/ibotta/android/ActivityLifecycleListener;->access$100()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 111
    invoke-static {v0}, Lcom/ibotta/android/ActivityLifecycleListener;->access$102(Z)Z

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener$1;->this$0:Lcom/ibotta/android/ActivityLifecycleListener;

    iget-object v1, p0, Lcom/ibotta/android/ActivityLifecycleListener$1;->val$activity:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/ibotta/android/ActivityLifecycleListener;->access$200(Lcom/ibotta/android/ActivityLifecycleListener;Landroid/app/Activity;)V

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener$1;->this$0:Lcom/ibotta/android/ActivityLifecycleListener;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/ActivityLifecycleListener;->access$302(Lcom/ibotta/android/ActivityLifecycleListener;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    return-void
.end method
