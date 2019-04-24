.class public Lcom/ibotta/android/tracking/proprietary/event/EventChain;
.super Ljava/lang/Object;
.source "EventChain.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/event/EventContributor;


# instance fields
.field private eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

.field private previous:Lcom/ibotta/android/tracking/proprietary/event/EventChain;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 3

    .line 79
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_1

    .line 83
    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->getEventContributor()Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 84
    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->getEventContributor()Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 86
    :cond_0
    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->getPrevious()Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object v1

    goto :goto_0

    .line 89
    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    .line 90
    invoke-interface {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/EventContributor;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public createLink(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)Lcom/ibotta/android/tracking/proprietary/event/EventChain;
    .locals 1

    .line 46
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    .line 48
    iput-object p1, v0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    .line 49
    iput-object p0, v0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->previous:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    return-object v0
.end method

.method public getEventContributor()Lcom/ibotta/android/tracking/proprietary/event/EventContributor;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    return-object v0
.end method

.method public getPrevious()Lcom/ibotta/android/tracking/proprietary/event/EventChain;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->previous:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    return-object v0
.end method

.method public setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    return-void
.end method

.method public setPrevious(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->previous:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 55
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_0

    .line 59
    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->getEventContributor()Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 60
    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->getPrevious()Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object v1

    goto :goto_0

    .line 63
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 64
    :goto_1
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 65
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    if-ne v3, v4, :cond_1

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    .line 66
    :goto_2
    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v5, :cond_2

    const-string v4, " -> "

    .line 70
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
