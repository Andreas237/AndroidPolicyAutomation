.class Lcom/shopkick/app/util/NotificationCenter$NotificationCallbackTask;
.super Ljava/lang/Object;
.source "NotificationCenter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/NotificationCenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "NotificationCallbackTask"
.end annotation


# instance fields
.field private final args:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final event:Ljava/lang/String;

.field private final observerWeakRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/util/INotificationObserver;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/util/NotificationCenter;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/util/NotificationCenter;Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/util/INotificationObserver;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 224
    iput-object p1, p0, Lcom/shopkick/app/util/NotificationCenter$NotificationCallbackTask;->this$0:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 225
    iput-object p2, p0, Lcom/shopkick/app/util/NotificationCenter$NotificationCallbackTask;->observerWeakRef:Ljava/lang/ref/WeakReference;

    .line 226
    iput-object p3, p0, Lcom/shopkick/app/util/NotificationCenter$NotificationCallbackTask;->event:Ljava/lang/String;

    .line 227
    iput-object p4, p0, Lcom/shopkick/app/util/NotificationCenter$NotificationCallbackTask;->args:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 232
    iget-object v0, p0, Lcom/shopkick/app/util/NotificationCenter$NotificationCallbackTask;->observerWeakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/util/INotificationObserver;

    if-eqz v0, :cond_0

    .line 234
    iget-object v1, p0, Lcom/shopkick/app/util/NotificationCenter$NotificationCallbackTask;->event:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/util/NotificationCenter$NotificationCallbackTask;->args:Ljava/util/HashMap;

    invoke-interface {v0, v1, v2}, Lcom/shopkick/app/util/INotificationObserver;->onEvent(Ljava/lang/String;Ljava/util/HashMap;)V

    :cond_0
    return-void
.end method
