.class public Lo/dbh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(II)Z
    .locals 1

    .line 21
    const/16 v0, 0x17

    if-eq p0, v0, :cond_0

    const/16 v0, 0x18

    if-ne p0, v0, :cond_1

    .line 22
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    .line 23
    const/4 v0, 0x1

    return v0

    .line 27
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static e(I)Z
    .locals 1

    .line 13
    const/16 v0, 0x17

    if-eq p0, v0, :cond_0

    const/16 v0, 0x18

    if-ne p0, v0, :cond_1

    .line 14
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 17
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
