.class public Lorg/ocpsoft/prettytime/units/JustNow;
.super Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;
.source "JustNow.java"

# interfaces
.implements Lorg/ocpsoft/prettytime/TimeUnit;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 25
    invoke-direct {p0}, Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;-><init>()V

    const-wide/32 v0, 0x493e0

    .line 26
    invoke-virtual {p0, v0, v1}, Lorg/ocpsoft/prettytime/units/JustNow;->setMaxQuantity(J)V

    return-void
.end method
