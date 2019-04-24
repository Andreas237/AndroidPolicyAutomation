.class public Lorg/ocpsoft/prettytime/units/Minute;
.super Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;
.source "Minute.java"

# interfaces
.implements Lorg/ocpsoft/prettytime/TimeUnit;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 25
    invoke-direct {p0}, Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;-><init>()V

    const-wide/32 v0, 0xea60

    .line 26
    invoke-virtual {p0, v0, v1}, Lorg/ocpsoft/prettytime/units/Minute;->setMillisPerUnit(J)V

    return-void
.end method
