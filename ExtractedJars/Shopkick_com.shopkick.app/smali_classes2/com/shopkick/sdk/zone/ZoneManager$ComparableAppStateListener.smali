.class Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;
.super Ljava/lang/Object;
.source "ZoneManager.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/AppStateListener;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/ZoneManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ComparableAppStateListener"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/shopkick/sdk/presence/AppStateListener;",
        "Ljava/lang/Comparable<",
        "Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/ZoneManager;


# direct methods
.method private constructor <init>(Lcom/shopkick/sdk/zone/ZoneManager;)V
    .locals 0

    .line 853
    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/sdk/zone/ZoneManager;Lcom/shopkick/sdk/zone/ZoneManager$1;)V
    .locals 0

    .line 853
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;-><init>(Lcom/shopkick/sdk/zone/ZoneManager;)V

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;)I
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 853
    check-cast p1, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;->compareTo(Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;)I

    move-result p1

    return p1
.end method

.method public onStateChange(Lcom/shopkick/sdk/presence/AppStateListener$FocusState;)V
    .locals 2

    .line 858
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-static {v0}, Lcom/shopkick/sdk/zone/ZoneManager;->access$400(Lcom/shopkick/sdk/zone/ZoneManager;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 859
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;->FOREGROUND:Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    invoke-virtual {p1, v1}, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 860
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lcom/shopkick/sdk/zone/ZoneManager;->access$500(Lcom/shopkick/sdk/zone/ZoneManager;Z)V

    goto :goto_0

    .line 862
    :cond_0
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/shopkick/sdk/zone/ZoneManager;->access$500(Lcom/shopkick/sdk/zone/ZoneManager;Z)V

    .line 864
    :goto_0
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-static {p1}, Lcom/shopkick/sdk/zone/ZoneManager;->access$700(Lcom/shopkick/sdk/zone/ZoneManager;)Lcom/shopkick/sdk/zone/DefaultZoneDetector;

    move-result-object p1

    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-static {v1}, Lcom/shopkick/sdk/zone/ZoneManager;->access$600(Lcom/shopkick/sdk/zone/ZoneManager;)Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/shopkick/sdk/zone/DefaultZoneDetector;->setRelevantZones(Ljava/util/Collection;)V

    .line 865
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 866
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-static {p1}, Lcom/shopkick/sdk/zone/ZoneManager;->access$800(Lcom/shopkick/sdk/zone/ZoneManager;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    .line 867
    :try_start_1
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-static {v0}, Lcom/shopkick/sdk/zone/ZoneManager;->access$900(Lcom/shopkick/sdk/zone/ZoneManager;)V

    .line 868
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 869
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$ComparableAppStateListener;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/sdk/zone/ZoneManager;->access$1000(Lcom/shopkick/sdk/zone/ZoneManager;Ljava/util/List;)V

    return-void

    :catchall_0
    move-exception v0

    .line 868
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception p1

    .line 865
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method
