.class public Lcom/ibotta/api/model/store/Event;
.super Ljava/lang/Object;
.source "Event.java"


# instance fields
.field private message:Ljava/lang/String;

.field private priority:Ljava/lang/Integer;

.field private radius:Ljava/lang/Float;

.field private reporting:Ljava/lang/Boolean;

.field private route:Ljava/lang/String;

.field private sendThroughAppboy:Ljava/lang/Boolean;

.field private serverMessage:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/api/model/store/Event;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getPriority()Ljava/lang/Integer;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/ibotta/api/model/store/Event;->priority:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRadius()Ljava/lang/Float;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/api/model/store/Event;->radius:Ljava/lang/Float;

    return-object v0
.end method

.method public getReporting()Ljava/lang/Boolean;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/model/store/Event;->reporting:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getRoute()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/model/store/Event;->route:Ljava/lang/String;

    return-object v0
.end method

.method public getSendThroughAppboy()Ljava/lang/Boolean;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/api/model/store/Event;->sendThroughAppboy:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getServerMessage()Ljava/lang/Boolean;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/model/store/Event;->serverMessage:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/api/model/store/Event;->message:Ljava/lang/String;

    return-void
.end method

.method public setPriority(Ljava/lang/Integer;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/model/store/Event;->priority:Ljava/lang/Integer;

    return-void
.end method

.method public setRadius(Ljava/lang/Float;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/api/model/store/Event;->radius:Ljava/lang/Float;

    return-void
.end method

.method public setReporting(Ljava/lang/Boolean;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/api/model/store/Event;->reporting:Ljava/lang/Boolean;

    return-void
.end method

.method public setRoute(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/api/model/store/Event;->route:Ljava/lang/String;

    return-void
.end method

.method public setSendThroughAppboy(Ljava/lang/Boolean;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/ibotta/api/model/store/Event;->sendThroughAppboy:Ljava/lang/Boolean;

    return-void
.end method

.method public setServerMessage(Ljava/lang/Boolean;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/api/model/store/Event;->serverMessage:Ljava/lang/Boolean;

    return-void
.end method
