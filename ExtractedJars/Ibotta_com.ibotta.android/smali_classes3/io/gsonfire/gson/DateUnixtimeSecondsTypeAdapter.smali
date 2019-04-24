.class public final Lio/gsonfire/gson/DateUnixtimeSecondsTypeAdapter;
.super Lio/gsonfire/gson/DateUnixtimeTypeAdapter;
.source "DateUnixtimeSecondsTypeAdapter.java"


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lio/gsonfire/gson/DateUnixtimeTypeAdapter;-><init>(Z)V

    return-void
.end method


# virtual methods
.method protected fromTimestamp(J)Ljava/util/Date;
    .locals 3

    .line 21
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long p1, p1, v1

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    return-object v0
.end method

.method protected toTimestamp(Ljava/util/Date;)J
    .locals 4

    .line 16
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    return-wide v0
.end method
