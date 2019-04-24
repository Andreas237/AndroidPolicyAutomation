.class public Lo/fby;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(J)Ljava/lang/String;
    .locals 4

    .line 83
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 84
    invoke-virtual {v1, p0, p1}, Ljava/util/Date;->setTime(J)V

    .line 85
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "EE"

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 86
    invoke-virtual {v2, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    .line 87
    return-object v3
.end method
