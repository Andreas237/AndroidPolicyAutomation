.class public Lo/fkq;
.super Ljava/lang/Object;


# static fields
.field public static b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/fkq;->b:Ljava/util/Map;

    sget-object v0, Lo/fkq;->b:Ljava/util/Map;

    const-string v1, "channel_ch_earclub"

    const-string v2, "hwireader://{host}/openurl?url=http%3A%2F%2Fah2.zhangyue.com%2Fzybk%2Fchannel%2Findex%3Fkey%3Dch_hyearclub%26style%3D1&closeback=true&backfrom=true&from={from}&traceid={traceid}"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
