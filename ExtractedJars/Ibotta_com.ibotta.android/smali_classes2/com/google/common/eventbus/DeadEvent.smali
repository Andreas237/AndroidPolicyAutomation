.class public Lcom/google/common/eventbus/DeadEvent;
.super Ljava/lang/Object;
.source "DeadEvent.java"


# annotations
.annotation build Lcom/google/common/annotations/Beta;
.end annotation


# instance fields
.field private final event:Ljava/lang/Object;

.field private final source:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/google/common/eventbus/DeadEvent;->source:Ljava/lang/Object;

    .line 45
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/google/common/eventbus/DeadEvent;->event:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getEvent()Ljava/lang/Object;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/google/common/eventbus/DeadEvent;->event:Ljava/lang/Object;

    return-object v0
.end method

.method public getSource()Ljava/lang/Object;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/google/common/eventbus/DeadEvent;->source:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 70
    invoke-static {p0}, Lcom/google/common/base/MoreObjects;->toStringHelper(Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;

    move-result-object v0

    const-string v1, "source"

    iget-object v2, p0, Lcom/google/common/eventbus/DeadEvent;->source:Ljava/lang/Object;

    .line 71
    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/MoreObjects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;

    move-result-object v0

    const-string v1, "event"

    iget-object v2, p0, Lcom/google/common/eventbus/DeadEvent;->event:Ljava/lang/Object;

    .line 72
    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/MoreObjects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;

    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/google/common/base/MoreObjects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
