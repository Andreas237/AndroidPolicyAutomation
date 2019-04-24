.class public Lio/gsonfire/gson/DateUnixtimeMillisTypeAdapter;
.super Lio/gsonfire/gson/DateUnixtimeTypeAdapter;
.source "DateUnixtimeMillisTypeAdapter.java"


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lio/gsonfire/gson/DateUnixtimeTypeAdapter;-><init>(Z)V

    return-void
.end method


# virtual methods
.method protected fromTimestamp(J)Ljava/util/Date;
    .locals 1

    .line 21
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    return-object v0
.end method

.method protected toTimestamp(Ljava/util/Date;)J
    .locals 2

    .line 16
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method
