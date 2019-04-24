.class public abstract Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;
.super Ljava/lang/Object;
.source "ResourcesTimeUnit.java"

# interfaces
.implements Lorg/ocpsoft/prettytime/TimeUnit;


# instance fields
.field private maxQuantity:J

.field private millisPerUnit:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 26
    iput-wide v0, p0, Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;->maxQuantity:J

    const-wide/16 v0, 0x1

    .line 27
    iput-wide v0, p0, Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;->millisPerUnit:J

    return-void
.end method


# virtual methods
.method public getMaxQuantity()J
    .locals 2

    .line 42
    iget-wide v0, p0, Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;->maxQuantity:J

    return-wide v0
.end method

.method public getMillisPerUnit()J
    .locals 2

    .line 53
    iget-wide v0, p0, Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;->millisPerUnit:J

    return-wide v0
.end method

.method public setMaxQuantity(J)V
    .locals 0

    .line 47
    iput-wide p1, p0, Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;->maxQuantity:J

    return-void
.end method

.method public setMillisPerUnit(J)V
    .locals 0

    .line 58
    iput-wide p1, p0, Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;->millisPerUnit:J

    return-void
.end method
