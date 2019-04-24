.class public Lnet/toddm/comm/Priority;
.super Ljava/lang/Object;
.source "Priority.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/toddm/comm/Priority$StartingPriority;
    }
.end annotation


# instance fields
.field private final _createdTimestamp:J

.field protected _lastPromotionTimestamp:J

.field protected _priority:I

.field private final _startingPriority:Lnet/toddm/comm/Priority$StartingPriority;

.field private final _work:Lnet/toddm/comm/Work;


# direct methods
.method public constructor <init>(Lnet/toddm/comm/Work;Lnet/toddm/comm/Priority$StartingPriority;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 60
    iput-object p1, p0, Lnet/toddm/comm/Priority;->_work:Lnet/toddm/comm/Work;

    .line 61
    iput-object p2, p0, Lnet/toddm/comm/Priority;->_startingPriority:Lnet/toddm/comm/Priority$StartingPriority;

    .line 62
    invoke-virtual {p2}, Lnet/toddm/comm/Priority$StartingPriority;->getPriorityValue()I

    move-result p1

    iput p1, p0, Lnet/toddm/comm/Priority;->_priority:I

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lnet/toddm/comm/Priority;->_createdTimestamp:J

    .line 64
    iget-wide p1, p0, Lnet/toddm/comm/Priority;->_createdTimestamp:J

    iput-wide p1, p0, Lnet/toddm/comm/Priority;->_lastPromotionTimestamp:J

    return-void

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'startingPriority\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'work\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected getCreatedTimestamp()J
    .locals 2

    .line 77
    iget-wide v0, p0, Lnet/toddm/comm/Priority;->_createdTimestamp:J

    return-wide v0
.end method

.method protected getLastPromotionTimestamp()J
    .locals 2

    .line 80
    iget-wide v0, p0, Lnet/toddm/comm/Priority;->_lastPromotionTimestamp:J

    return-wide v0
.end method

.method public getStartingValue()Lnet/toddm/comm/Priority$StartingPriority;
    .locals 1

    .line 71
    iget-object v0, p0, Lnet/toddm/comm/Priority;->_startingPriority:Lnet/toddm/comm/Priority$StartingPriority;

    return-object v0
.end method

.method public getValue()I
    .locals 1

    .line 74
    iget v0, p0, Lnet/toddm/comm/Priority;->_priority:I

    return v0
.end method

.method public getWork()Lnet/toddm/comm/Work;
    .locals 1

    .line 68
    iget-object v0, p0, Lnet/toddm/comm/Priority;->_work:Lnet/toddm/comm/Work;

    return-object v0
.end method
