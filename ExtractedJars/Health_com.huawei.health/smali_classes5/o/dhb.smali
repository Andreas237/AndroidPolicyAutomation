.class public Lo/dhb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(ZID)D
    .locals 4

    .line 46
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 47
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    if-eqz p0, :cond_0

    .line 49
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 51
    :sswitch_0
    const/4 v0, 0x3

    invoke-static {p2, p3, v0}, Lo/cxh;->d(DI)D

    move-result-wide v2

    .line 52
    goto :goto_2

    :goto_0
    goto :goto_2

    .line 56
    :cond_0
    sparse-switch p1, :sswitch_data_1

    goto :goto_1

    .line 58
    :sswitch_1
    const/4 v0, 0x3

    invoke-static {p2, p3, v0}, Lo/cxh;->a(DI)D

    move-result-wide v2

    .line 59
    goto :goto_2

    :goto_1
    goto :goto_2

    .line 64
    :cond_1
    move-wide v2, p2

    .line 66
    :goto_2
    return-wide v2

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x3 -> :sswitch_1
    .end sparse-switch
.end method
