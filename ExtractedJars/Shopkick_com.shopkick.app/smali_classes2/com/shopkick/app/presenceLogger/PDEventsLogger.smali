.class public Lcom/shopkick/app/presenceLogger/PDEventsLogger;
.super Ljava/lang/Object;
.source "PDEventsLogger.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;,
        Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;
    }
.end annotation


# static fields
.field public static final kInitialArraySize:I = 0xa


# instance fields
.field private debugMode:Z

.field private eventVectors:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;",
            ">;"
        }
    .end annotation
.end field

.field private events:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;",
            ">;"
        }
    .end annotation
.end field

.field private locations:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/shopkick/app/location/SKLocation;",
            ">;"
        }
    .end annotation
.end field

.field private logLevel:I

.field private presenceCodes:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private timeLimit:D


# direct methods
.method public constructor <init>(DIZ)V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-boolean p4, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->debugMode:Z

    .line 90
    iput-wide p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->timeLimit:D

    .line 91
    iput p3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->logLevel:I

    .line 92
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->presenceCodes:Ljava/util/LinkedList;

    .line 93
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->locations:Ljava/util/LinkedList;

    .line 94
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->eventVectors:Ljava/util/LinkedList;

    .line 95
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->events:Ljava/util/LinkedList;

    return-void
.end method

.method private evictOldEntries(J)V
    .locals 5

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->events:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;

    .line 207
    iget-wide v3, v3, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;->eventTime:J

    cmp-long v3, v3, p1

    if-gez v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 215
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->events:Ljava/util/LinkedList;

    invoke-virtual {p1, v1, v2}, Ljava/util/LinkedList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method


# virtual methods
.method public listToString(Ljava/util/LinkedList;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/LinkedList<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/lang/StringBuilder;"
        }
    .end annotation

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 184
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    invoke-virtual {p1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    if-eqz p4, :cond_0

    const-string v1, "\""

    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    :cond_0
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_1

    const-string p2, "\""

    .line 191
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string p2, ", "

    .line 193
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 195
    :cond_2
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public recordPdEvent(ILjava/lang/String;Lcom/shopkick/app/location/SKLocation;)V
    .locals 5

    .line 109
    iget-boolean v0, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->debugMode:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->logLevel:I

    if-lt p1, v0, :cond_0

    return-void

    .line 114
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 116
    iget-boolean v2, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->debugMode:Z

    if-nez v2, :cond_1

    .line 117
    iget-wide v2, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->timeLimit:D

    double-to-long v2, v2

    sub-long v2, v0, v2

    invoke-direct {p0, v2, v3}, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->evictOldEntries(J)V

    :cond_1
    const/4 v2, -0x1

    if-eqz p2, :cond_2

    .line 122
    iget-object v3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->presenceCodes:Ljava/util/LinkedList;

    invoke-virtual {v3, p2}, Ljava/util/LinkedList;->indexOf(Ljava/lang/Object;)I

    move-result v3

    if-ne v3, v2, :cond_3

    .line 124
    iget-object v3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->presenceCodes:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    move-result v3

    .line 125
    iget-object v4, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->presenceCodes:Ljava/util/LinkedList;

    invoke-virtual {v4, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move v3, v2

    :cond_3
    :goto_0
    if-eqz p3, :cond_4

    .line 131
    iget-object p2, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->locations:Ljava/util/LinkedList;

    invoke-virtual {p2, p3}, Ljava/util/LinkedList;->indexOf(Ljava/lang/Object;)I

    move-result p2

    if-ne p2, v2, :cond_5

    .line 133
    iget-object p2, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->locations:Ljava/util/LinkedList;

    invoke-virtual {p2}, Ljava/util/LinkedList;->size()I

    move-result p2

    .line 134
    iget-object v4, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->locations:Ljava/util/LinkedList;

    invoke-virtual {v4, p3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    move p2, v2

    .line 138
    :cond_5
    :goto_1
    new-instance p3, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;

    invoke-direct {p3, p0, p1, v3, p2}, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEventVector;-><init>(Lcom/shopkick/app/presenceLogger/PDEventsLogger;III)V

    .line 139
    iget-object p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->eventVectors:Ljava/util/LinkedList;

    invoke-virtual {p1, p3}, Ljava/util/LinkedList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ne p1, v2, :cond_6

    .line 141
    iget-object p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->eventVectors:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->size()I

    move-result p1

    .line 142
    iget-object p2, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->eventVectors:Ljava/util/LinkedList;

    invoke-virtual {p2, p3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 145
    :cond_6
    new-instance p2, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;

    invoke-direct {p2, p0, p1, v0, v1}, Lcom/shopkick/app/presenceLogger/PDEventsLogger$PDEvent;-><init>(Lcom/shopkick/app/presenceLogger/PDEventsLogger;IJ)V

    .line 146
    iget-object p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->events:Ljava/util/LinkedList;

    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public reset()V
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->presenceCodes:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->locations:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->eventVectors:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 179
    iget-object v0, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->events:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    return-void
.end method

.method public resetTimeLimitAndLogLevel(DI)V
    .locals 0

    .line 100
    iput-wide p1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->timeLimit:D

    .line 101
    iput p3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->logLevel:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 155
    iget-object v0, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->events:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->presenceCodes:Ljava/util/LinkedList;

    const-string v1, "\"presence_codes\": [ "

    const-string v2, "]"

    const/4 v3, 0x1

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->listToString(Ljava/util/LinkedList;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 160
    iget-object v1, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->locations:Ljava/util/LinkedList;

    const-string v2, "\"locations(coord,acc)\": [ "

    const-string v3, "]"

    const/4 v4, 0x0

    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->listToString(Ljava/util/LinkedList;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 161
    iget-object v2, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->eventVectors:Ljava/util/LinkedList;

    const-string v3, "\"event_vectors\": [ "

    const-string v5, "]"

    invoke-virtual {p0, v2, v3, v5, v4}, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->listToString(Ljava/util/LinkedList;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 162
    iget-object v3, p0, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->events:Ljava/util/LinkedList;

    const-string v5, "\"events\": [ "

    const-string v6, "]"

    invoke-virtual {p0, v3, v5, v6, v4}, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->listToString(Ljava/util/LinkedList;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 164
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "{"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "}"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
