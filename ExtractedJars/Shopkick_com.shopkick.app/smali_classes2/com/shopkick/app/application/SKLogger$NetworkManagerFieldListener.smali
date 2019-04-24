.class Lcom/shopkick/app/application/SKLogger$NetworkManagerFieldListener;
.super Ljava/lang/Object;
.source "SKLogger.java"

# interfaces
.implements Ljava/beans/PropertyChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/SKLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "NetworkManagerFieldListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/SKLogger;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/SKLogger;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/shopkick/app/application/SKLogger$NetworkManagerFieldListener;->this$0:Lcom/shopkick/app/application/SKLogger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public propertyChange(Ljava/beans/PropertyChangeEvent;)V
    .locals 1

    .line 96
    invoke-virtual {p1}, Ljava/beans/PropertyChangeEvent;->getSource()Ljava/lang/Object;

    move-result-object p1

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger$NetworkManagerFieldListener;->this$0:Lcom/shopkick/app/application/SKLogger;

    invoke-static {v0}, Lcom/shopkick/app/application/SKLogger;->access$000(Lcom/shopkick/app/application/SKLogger;)Lcom/shopkick/app/fetchers/network/NetworkManager;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/application/SKLogger$NetworkManagerFieldListener;->this$0:Lcom/shopkick/app/application/SKLogger;

    invoke-static {p1}, Lcom/shopkick/app/application/SKLogger;->access$000(Lcom/shopkick/app/application/SKLogger;)Lcom/shopkick/app/fetchers/network/NetworkManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/network/NetworkManager;->isFetching()Z

    move-result p1

    if-nez p1, :cond_0

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/application/SKLogger$NetworkManagerFieldListener;->this$0:Lcom/shopkick/app/application/SKLogger;

    invoke-static {p1}, Lcom/shopkick/app/application/SKLogger;->access$100(Lcom/shopkick/app/application/SKLogger;)V

    :cond_0
    return-void
.end method
