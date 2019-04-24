.class public Lcom/huawei/pluginmessagecenter/service/MessageObserverController;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static TAG:Ljava/lang/String;


# instance fields
.field private mObservers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/service/MessageObserver;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    const-string v0, "UIDV_MessageObserverController"

    sput-object v0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->mObservers:Ljava/util/List;

    .line 17
    return-void
.end method


# virtual methods
.method public addObservers(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V
    .locals 4

    .line 28
    if-nez p1, :cond_0

    .line 29
    sget-object v0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addObservers ==> observer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    return-void

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->mObservers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    return-void
.end method

.method public clear()V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->mObservers:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->mObservers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 75
    :cond_0
    return-void
.end method

.method public deleteObservers(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V
    .locals 4

    .line 42
    if-nez p1, :cond_0

    .line 43
    sget-object v0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteObservers ==> observer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    return-void

    .line 46
    :cond_0
    sget-object v0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteObservers ==> observer == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->mObservers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 48
    return-void
.end method

.method public notifyAllObservers(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
    .locals 6

    .line 56
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->mObservers:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->mObservers:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    .line 58
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 59
    sget-object v0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyAllObservers ==> observer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    goto :goto_1

    .line 62
    :cond_0
    sget-object v0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyAllObservers ==> observer == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-interface {v5, p1, p2}, Lcom/huawei/pluginmessagecenter/service/MessageObserver;->onChange(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V

    .line 64
    goto :goto_0

    .line 66
    :cond_1
    :goto_1
    return-void
.end method
