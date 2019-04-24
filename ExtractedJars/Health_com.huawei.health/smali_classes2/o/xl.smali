.class public Lo/xl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Ljava/lang/String;)J
    .locals 5

    .line 16
    const-wide/16 v2, 0x0

    .line 18
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    .line 21
    goto :goto_0

    .line 19
    :catch_0
    move-exception v4

    .line 20
    const-wide/16 v2, 0x0

    .line 22
    :goto_0
    return-wide v2
.end method
