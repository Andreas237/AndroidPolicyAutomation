.class public Lorg/ocpsoft/prettytime/units/Century;
.super Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;
.source "Century.java"

# interfaces
.implements Lorg/ocpsoft/prettytime/TimeUnit;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 25
    invoke-direct {p0}, Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;-><init>()V

    const-wide v0, 0x2debdefb0deL

    .line 26
    invoke-virtual {p0, v0, v1}, Lorg/ocpsoft/prettytime/units/Century;->setMillisPerUnit(J)V

    return-void
.end method
