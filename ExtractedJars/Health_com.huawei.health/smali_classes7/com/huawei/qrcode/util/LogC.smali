.class public Lcom/huawei/qrcode/util/LogC;
.super Ljava/lang/Object;


# static fields
.field private static final CALL_LOG_LEVEL:I = 0x2

.field private static final CHECK_TIME_INTERVAL:J = 0x2710L

.field private static HWLog:Z = false

.field private static HWModuleLog:Z = false

.field private static LAST_HWModuleLog_Check_Time:J = 0x0L

.field private static final LOG_HWPAY_TAG:Ljava/lang/String; = "ScanQrcode"

.field private static lastPkgName:Ljava/lang/String; = null

.field private static final mPattern:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, ""

    sput-object v0, Lcom/huawei/qrcode/util/LogC;->lastPkgName:Ljava/lang/String;

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/huawei/qrcode/util/LogC;->LAST_HWModuleLog_Check_Time:J

    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/qrcode/util/LogC;->HWModuleLog:Z

    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/qrcode/util/LogC;->HWLog:Z

    const-string v0, "[0-9]*[a-z|A-Z]*[\u4e00-\u9fa5]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/util/LogC;->mPattern:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;Z)V
    .locals 6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move v4, p2

    move v5, p4

    const/4 v0, 0x3

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 6

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    move v5, p3

    const/4 v0, 0x3

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 6

    const-string v1, "ScanQrcode"

    move-object v2, p0

    move-object v3, p1

    move v5, p2

    const/4 v0, 0x3

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static d(Ljava/lang/String;Z)V
    .locals 6

    const-string v1, "ScanQrcode"

    move-object v2, p0

    move v5, p1

    const/4 v0, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;Z)V
    .locals 6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move v4, p2

    move v5, p4

    const/4 v0, 0x6

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 6

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    move v5, p3

    const/4 v0, 0x6

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 6

    const-string v1, "ScanQrcode"

    move-object v2, p0

    move-object v3, p1

    move v5, p2

    const/4 v0, 0x6

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static e(Ljava/lang/String;Z)V
    .locals 6

    const-string v1, "ScanQrcode"

    move-object v2, p0

    move v5, p1

    const/4 v0, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method private static formatLogWithStar(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, ""

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    :cond_0
    return-object p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    const-string v0, "*"

    return-object v0

    :cond_2
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x1

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v5, v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lcom/huawei/qrcode/util/LogC;->mPattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_4

    rem-int/lit8 v0, v6, 0x2

    if-nez v0, :cond_3

    const-string v4, "*"

    :cond_3
    add-int/lit8 v6, v6, 0x1

    :cond_4
    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;Z)V
    .locals 6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move v4, p2

    move v5, p4

    const/4 v0, 0x4

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 6

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    move v5, p3

    const/4 v0, 0x4

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 6

    const-string v1, "ScanQrcode"

    move-object v2, p0

    move-object v3, p1

    move v5, p2

    const/4 v0, 0x4

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static i(Ljava/lang/String;Z)V
    .locals 6

    const-string v1, "ScanQrcode"

    move-object v2, p0

    move v5, p1

    const/4 v0, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static init(Landroid/content/Context;)V
    .locals 6

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    const-string v0, "\\."

    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v0, v3

    if-lez v0, :cond_0

    const-class v4, Lcom/huawei/qrcode/util/LogC;

    monitor-enter v4

    :try_start_0
    array-length v0, v3

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v3, v0

    sput-object v0, Lcom/huawei/qrcode/util/LogC;->lastPkgName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    :cond_0
    :goto_0
    return-void
.end method

.method private static isLoggable(Ljava/lang/String;I)Z
    .locals 5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lcom/huawei/qrcode/util/LogC;->LAST_HWModuleLog_Check_Time:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/huawei/qrcode/util/LogC;->LAST_HWModuleLog_Check_Time:J

    :try_start_0
    const-class v0, Lcom/huawei/qrcode/util/LogC;

    const-string v1, "HWLog"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Lcom/huawei/qrcode/util/LogC;->HWLog:Z

    const-class v0, Lcom/huawei/qrcode/util/LogC;

    const-string v1, "HWModuleLog"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Lcom/huawei/qrcode/util/LogC;->HWModuleLog:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "can not getField"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Z)V

    :cond_0
    :goto_0
    const/4 v0, 0x4

    if-ge p1, v0, :cond_3

    sget-boolean v0, Lcom/huawei/qrcode/util/LogC;->HWLog:Z

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/huawei/qrcode/util/LogC;->HWModuleLog:Z

    if-eqz v0, :cond_2

    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_3
    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method public static logAddSomeStar(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x7

    if-gt v0, v1, :cond_1

    :cond_0
    move-object v2, p0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "***"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    return-object v2
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;Z)V
    .locals 6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move v4, p2

    move v5, p4

    const/4 v0, 0x2

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 6

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    move v5, p3

    const/4 v0, 0x2

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 6

    const-string v1, "ScanQrcode"

    move-object v2, p0

    move-object v3, p1

    move v5, p2

    const/4 v0, 0x2

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static v(Ljava/lang/String;Z)V
    .locals 6

    const-string v1, "ScanQrcode"

    move-object v2, p0

    move v5, p1

    const/4 v0, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;Z)V
    .locals 6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move v4, p2

    move v5, p4

    const/4 v0, 0x5

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 6

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    move v5, p3

    const/4 v0, 0x5

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 6

    const-string v1, "ScanQrcode"

    move-object v2, p0

    move-object v3, p1

    move v5, p2

    const/4 v0, 0x5

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method public static w(Ljava/lang/String;Z)V
    .locals 6

    const-string v1, "ScanQrcode"

    move-object v2, p0

    move v5, p1

    const/4 v0, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lcom/huawei/qrcode/util/LogC;->writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V

    return-void
.end method

.method private static declared-synchronized writeLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;IZ)V
    .locals 6

    const-class v5, Lcom/huawei/qrcode/util/LogC;

    monitor-enter v5

    :try_start_0
    invoke-static {p1, p0}, Lcom/huawei/qrcode/util/LogC;->isLoggable(Ljava/lang/String;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    monitor-exit v5

    return-void

    :cond_0
    :try_start_1
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    if-eqz p5, :cond_1

    invoke-static {p2}, Lcom/huawei/qrcode/util/LogC;->formatLogWithStar(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_1
    invoke-virtual {v3, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_0
    const-string v0, "["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v0, Landroid/util/AndroidException;

    invoke-direct {v0}, Landroid/util/AndroidException;-><init>()V

    invoke-virtual {v0}, Landroid/util/AndroidException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v4

    array-length v0, v4

    if-le v0, p4, :cond_2

    const-string v0, "("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    sget-object v1, Lcom/huawei/qrcode/util/LogC;->lastPkgName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    aget-object v1, v4, p4

    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    aget-object v1, v4, p4

    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_2
    const-string v0, "("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    sget-object v1, Lcom/huawei/qrcode/util/LogC;->lastPkgName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "/unknown source)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_1
    const/4 v0, 0x0

    if-eq v0, p3, :cond_3

    const/16 v0, 0xa

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-static {p3}, Lcom/huawei/qrcode/util/LogC;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    move-exception v3

    const-string v0, "can not writeLog RuntimeException"

    :try_start_2
    invoke-static {v0, v3}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_1
    move-exception v3

    const-string v0, "can not writeLog"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    monitor-exit v5

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v5

    throw p0
.end method
