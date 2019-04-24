.class public Lcom/huawei/nfc/util/DataUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static simpleDateFormat:Ljava/text/SimpleDateFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0}, Ljava/text/SimpleDateFormat;-><init>()V

    sput-object v0, Lcom/huawei/nfc/util/DataUtil;->simpleDateFormat:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static currentDateString(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 18
    if-nez p0, :cond_0

    .line 19
    const-string p0, "yyyy-MM-dd"

    .line 21
    :cond_0
    sget-object v0, Lcom/huawei/nfc/util/DataUtil;->simpleDateFormat:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->applyPattern(Ljava/lang/String;)V

    .line 22
    sget-object v2, Lcom/huawei/nfc/util/DataUtil;->simpleDateFormat:Ljava/text/SimpleDateFormat;

    monitor-enter v2

    .line 23
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/util/DataUtil;->simpleDateFormat:Ljava/text/SimpleDateFormat;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    .line 24
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public static isEmpty(Ljava/lang/String;)Z
    .locals 2

    .line 46
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 49
    :cond_1
    const-string v0, " "

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 50
    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    const-string v0, ""

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 51
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 53
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static parseDateString(Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Timestamp;
    .locals 4

    .line 29
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 30
    :cond_0
    const-string p1, "yyyy-MM-dd HH:mm:ss"

    .line 34
    :cond_1
    :try_start_0
    new-instance v0, Ljava/sql/Timestamp;

    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {v1, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 36
    :catch_0
    move-exception v3

    .line 38
    const-string v0, "DataUtil"

    invoke-virtual {v3}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cwy;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const/4 v0, 0x0

    return-object v0
.end method

.method public static toHex(IILjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    sub-int v2, p1, v0

    .line 71
    if-lez v2, :cond_0

    .line 72
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 73
    const/4 v0, 0x0

    invoke-virtual {v1, v0, p2}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toLV(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 58
    const-string v3, ""

    .line 59
    invoke-static {p0}, Lcom/huawei/nfc/util/DataUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 61
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v4, v0, 0x2

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    const/4 v2, 0x2

    invoke-static {v4, v2, v1}, Lcom/huawei/nfc/util/DataUtil;->toHex(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 64
    :cond_0
    return-object v3
.end method
