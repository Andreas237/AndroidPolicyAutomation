.class public Lorg/ocpsoft/prettytime/units/Week;
.super Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;
.source "Week.java"

# interfaces
.implements Lorg/ocpsoft/prettytime/TimeUnit;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 25
    invoke-direct {p0}, Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;-><init>()V

    const-wide/32 v0, 0x240c8400

    .line 26
    invoke-virtual {p0, v0, v1}, Lorg/ocpsoft/prettytime/units/Week;->setMillisPerUnit(J)V

    return-void
.end method
