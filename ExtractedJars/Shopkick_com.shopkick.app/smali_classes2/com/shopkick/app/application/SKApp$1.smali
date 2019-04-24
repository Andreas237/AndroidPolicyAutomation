.class Lcom/shopkick/app/application/SKApp$1;
.super Ljava/lang/Object;
.source "SKApp.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/application/SKApp;->setupApp()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/SKApp;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/SKApp;)V
    .locals 0

    .line 644
    iput-object p1, p0, Lcom/shopkick/app/application/SKApp$1;->this$0:Lcom/shopkick/app/application/SKApp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "ClientFlagsUpdated"

    if-ne p1, p2, :cond_0

    .line 648
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp$1;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object p1, p1, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/application/SKApp$1;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object p1, p1, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->diskCacheSize:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    .line 650
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp$1;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object p1, p1, Lcom/shopkick/app/application/SKApp;->skDiskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    iget-object p2, p0, Lcom/shopkick/app/application/SKApp$1;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object p2, p2, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->diskCacheSize:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/fetchers/image/SKDiskCache;->setMaxSize(J)V

    .line 651
    iget-object p1, p0, Lcom/shopkick/app/application/SKApp$1;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object p1, p1, Lcom/shopkick/app/application/SKApp;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    :cond_0
    return-void
.end method
