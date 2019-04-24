.class public Lcom/shopkick/app/util/ThriftHelper;
.super Ljava/lang/Object;
.source "ThriftHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInt(Ljava/lang/Integer;I)I
    .locals 0

    if-nez p0, :cond_0

    return p1

    .line 35
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static getLong(Ljava/lang/Long;J)J
    .locals 0

    if-nez p0, :cond_0

    return-wide p1

    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method
