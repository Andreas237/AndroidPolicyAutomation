.class Lcom/tencent/stat/common/l;
.super Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()I
    .locals 3

    :try_start_0
    new-instance v1, Ljava/io/File;

    const-string v0, "/sys/devices/system/cpu/"

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v0, Lcom/tencent/stat/common/m;

    invoke-direct {v0}, Lcom/tencent/stat/common/m;-><init>()V

    invoke-virtual {v1, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v2

    array-length v0, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x1

    return v0
.end method

.method static b()I
    .locals 9

    const/4 v2, 0x0

    const-string v3, ""

    const/4 v0, 0x2

    :try_start_0
    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "/system/bin/cat"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const-string v0, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"

    const/4 v1, 0x1

    aput-object v0, v5, v1

    new-instance v4, Ljava/lang/ProcessBuilder;

    invoke-direct {v4, v5}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v7

    const/16 v0, 0x18

    new-array v8, v0, [B

    :goto_0
    invoke-virtual {v7, v8}, Ljava/io/InputStream;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v8}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    :cond_1
    goto :goto_1

    :catch_0
    move-exception v3

    invoke-static {}, Lcom/tencent/stat/common/k;->g()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    :goto_1
    mul-int/lit16 v0, v2, 0x3e8

    return v0
.end method

.method static c()I
    .locals 9

    const/4 v2, 0x0

    const-string v3, ""

    const/4 v0, 0x2

    :try_start_0
    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "/system/bin/cat"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const-string v0, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"

    const/4 v1, 0x1

    aput-object v0, v5, v1

    new-instance v4, Ljava/lang/ProcessBuilder;

    invoke-direct {v4, v5}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v7

    const/16 v0, 0x18

    new-array v8, v0, [B

    :goto_0
    invoke-virtual {v7, v8}, Ljava/io/InputStream;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v8}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    :cond_1
    goto :goto_1

    :catch_0
    move-exception v3

    invoke-static {}, Lcom/tencent/stat/common/k;->g()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    :goto_1
    mul-int/lit16 v0, v2, 0x3e8

    return v0
.end method

.method static d()Ljava/lang/String;
    .locals 7

    :try_start_0
    new-instance v2, Ljava/io/FileReader;

    const-string v0, "/proc/cpuinfo"

    invoke-direct {v2, v0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/io/BufferedReader;

    invoke-direct {v3, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    const-string v0, ":\\s+"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    :goto_0
    array-length v0, v5

    if-ge v6, v0, :cond_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    const/4 v0, 0x1

    aget-object v0, v5, v0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v2

    invoke-static {}, Lcom/tencent/stat/common/k;->g()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    const-string v0, ""

    return-object v0
.end method
