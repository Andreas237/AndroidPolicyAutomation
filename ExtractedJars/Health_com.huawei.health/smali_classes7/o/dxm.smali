.class public Lo/dxm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(J)I
    .locals 3

    .line 37
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 38
    invoke-virtual {v1, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 39
    const/16 v0, 0xb

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 40
    return v2
.end method

.method public static e(I)I
    .locals 1

    .line 22
    if-lez p0, :cond_0

    const/16 v0, 0x1e

    if-gt p0, v0, :cond_0

    .line 23
    const/4 v0, 0x1

    return v0

    .line 24
    :cond_0
    const/16 v0, 0x34

    if-ge p0, v0, :cond_1

    .line 25
    const/4 v0, 0x2

    return v0

    .line 26
    :cond_1
    const/16 v0, 0x68

    if-ge p0, v0, :cond_2

    .line 27
    const/4 v0, 0x3

    return v0

    .line 28
    :cond_2
    const/16 v0, 0x9c

    if-ge p0, v0, :cond_3

    .line 29
    const/4 v0, 0x4

    return v0

    .line 31
    :cond_3
    const/4 v0, 0x5

    return v0
.end method

.method public static e()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 44
    new-instance v1, Ljava/util/ArrayList;

    const/16 v0, 0x18

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    const/4 v2, 0x0

    :goto_0
    const/16 v0, 0x18

    if-ge v2, v0, :cond_0

    .line 46
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 45
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 48
    :cond_0
    return-object v1
.end method
