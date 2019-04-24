.class public Lcom/huawei/operation/OpAnalyticsImpl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ERROR:I = -0x1

.field private static final SUCCESS:I = 0x0

.field private static final TAG:Ljava/lang/String; = "OpAnalyticsImpl"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static onReport()V
    .locals 0

    .line 32
    invoke-static {}, Lo/cjz;->b()V

    .line 33
    return-void
.end method

.method public static setEvent(ILjava/lang/String;Ljava/util/LinkedHashMap;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Ljava/util/LinkedHashMap<Ljava/lang/String;Ljava/lang/String;>;)I"
        }
    .end annotation

    .line 22
    const-string v0, "OpAnalyticsImpl"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " eventId = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " content = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cxg;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-static {p0, p1, p2}, Lo/cjz;->d(ILjava/lang/String;Ljava/util/LinkedHashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    goto :goto_0

    .line 24
    :catch_0
    move-exception v3

    .line 25
    const-string v0, "OpAnalyticsImpl"

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cxg;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    const/4 v0, -0x1

    return v0

    .line 28
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
