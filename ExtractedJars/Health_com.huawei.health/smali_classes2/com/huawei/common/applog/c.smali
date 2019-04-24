.class public final Lcom/huawei/common/applog/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/common/applog/c$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "LogWrite"

.field private static b:I = 0x0

.field private static final c:Ljava/lang/String; = "%s: %s/%s: %s"

.field private static d:Ljava/io/BufferedWriter; = null

.field private static e:Z = false

.field private static f:Z = false

.field private static g:Ljava/lang/String; = null

.field private static h:Ljava/lang/String; = null

.field private static i:I = 0x0


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const/4 v0, 0x3

    sput v0, Lcom/huawei/common/applog/c;->b:I

    .line 24
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/common/applog/c;->d:Ljava/io/BufferedWriter;

    .line 25
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/common/applog/c;->e:Z

    .line 27
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/common/applog/c;->f:Z

    .line 28
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/common/applog/c;->g:Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/common/applog/c;->h:Ljava/lang/String;

    .line 32
    const v0, 0x32000

    sput v0, Lcom/huawei/common/applog/c;->i:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 5

    .line 165
    const-class v2, Lcom/huawei/common/applog/c;

    monitor-enter v2

    .line 166
    :try_start_0
    sget-object v0, Lcom/huawei/common/applog/c;->d:Ljava/io/BufferedWriter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 168
    :try_start_1
    sget-object v0, Lcom/huawei/common/applog/c;->d:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    goto :goto_0

    .line 169
    :catch_0
    move-exception v3

    .line 170
    const-string v0, "LogWrite"

    const-string v1, "shutdown IOException"

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    :cond_0
    :goto_0
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/common/applog/c;->d:Ljava/io/BufferedWriter;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 174
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 175
    :goto_1
    return-void
.end method

.method public static a(ILjava/lang/String;IZ)V
    .locals 3

    .line 51
    sput-boolean p3, Lcom/huawei/common/applog/c;->f:Z

    .line 54
    if-lez p0, :cond_0

    .line 55
    sput p0, Lcom/huawei/common/applog/c;->i:I

    .line 59
    :cond_0
    if-lez p2, :cond_2

    .line 61
    const/16 v0, 0x32

    if-le p2, v0, :cond_1

    .line 62
    const/16 p2, 0x32

    .line 64
    :cond_1
    sput p2, Lcom/huawei/common/applog/c;->b:I

    .line 67
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 68
    sput-object p1, Lcom/huawei/common/applog/c;->g:Ljava/lang/String;

    .line 69
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/common/applog/c;->e:Z

    goto :goto_0

    .line 71
    :cond_3
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/common/applog/c;->e:Z

    .line 73
    :goto_0
    sget-boolean v0, Lcom/huawei/common/applog/c;->e:Z

    if-eqz v0, :cond_5

    .line 74
    new-instance v1, Ljava/io/File;

    sget-object v0, Lcom/huawei/common/applog/c;->g:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    .line 76
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v2

    .line 77
    if-nez v2, :cond_4

    .line 78
    return-void

    .line 82
    :cond_4
    invoke-static {}, Lcom/huawei/common/applog/c;->b()Ljava/lang/String;

    move-result-object v2

    .line 83
    sget-object v0, Lcom/huawei/common/applog/c;->g:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/huawei/common/applog/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    :cond_5
    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 88
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    :cond_0
    const-string v0, "LogWrite"

    const-string v1, "createNewLogFile Exception"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    return-void

    .line 92
    :cond_1
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    .line 94
    if-eqz v4, :cond_2

    array-length v0, v4

    sget v1, Lcom/huawei/common/applog/c;->b:I

    if-lt v0, v1, :cond_2

    .line 96
    :try_start_0
    new-instance v0, Lcom/huawei/common/applog/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/common/applog/c$a;-><init>(Lcom/huawei/common/applog/d;)V

    invoke-static {v4, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    goto :goto_0

    .line 97
    :catch_0
    move-exception v5

    .line 98
    const-string v0, "LogWrite"

    const-string v1, "Arrays sort IllegalArgumentException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    :goto_0
    invoke-static {v4}, Lcom/huawei/common/applog/c;->a([Ljava/io/File;)Z

    .line 103
    :cond_2
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 105
    const-class v7, Lcom/huawei/common/applog/c;

    monitor-enter v7

    .line 107
    :try_start_1
    sget-object v0, Lcom/huawei/common/applog/c;->d:Ljava/io/BufferedWriter;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    .line 109
    :try_start_2
    sget-object v0, Lcom/huawei/common/applog/c;->d:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    goto :goto_1

    .line 110
    :catch_1
    move-exception v8

    .line 111
    const-string v0, "LogWrite"

    const-string v1, "createNewLogFile IOException"

    :try_start_3
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 115
    :cond_3
    :goto_1
    :try_start_4
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    const-string v2, "UTF-8"

    invoke-direct {v1, v6, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    sput-object v0, Lcom/huawei/common/applog/c;->d:Ljava/io/BufferedWriter;

    .line 116
    sput-object p1, Lcom/huawei/common/applog/c;->h:Ljava/lang/String;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 123
    goto :goto_2

    .line 117
    :catch_2
    move-exception v8

    .line 119
    :try_start_5
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 122
    goto :goto_2

    .line 120
    :catch_3
    move-exception v9

    .line 121
    const-string v0, "LogWrite"

    const-string v1, "createNewLogFile out.close Exception"

    :try_start_6
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 124
    :goto_2
    monitor-exit v7

    goto :goto_3

    :catchall_0
    move-exception v10

    monitor-exit v7

    throw v10

    .line 125
    :goto_3
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 9

    .line 178
    const-class v5, Lcom/huawei/common/applog/c;

    monitor-enter v5

    .line 180
    :try_start_0
    sget-object v0, Lcom/huawei/common/applog/c;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/huawei/common/applog/c;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 181
    :cond_0
    const-string v0, "LogWrite"

    const-string v1, "wtf Exception"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    monitor-exit v5

    return-void

    .line 184
    :cond_1
    :try_start_1
    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/huawei/common/applog/c;->g:Ljava/lang/String;

    sget-object v1, Lcom/huawei/common/applog/c;->h:Ljava/lang/String;

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v0

    sget v2, Lcom/huawei/common/applog/c;->i:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 186
    invoke-static {}, Lcom/huawei/common/applog/c;->b()Ljava/lang/String;

    move-result-object v7

    .line 187
    sget-object v0, Lcom/huawei/common/applog/c;->g:Ljava/lang/String;

    invoke-static {v0, v7}, Lcom/huawei/common/applog/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    goto :goto_0

    .line 190
    :cond_2
    sget-object v0, Lcom/huawei/common/applog/c;->d:Ljava/io/BufferedWriter;

    if-nez v0, :cond_3

    .line 191
    sget-object v0, Lcom/huawei/common/applog/c;->g:Ljava/lang/String;

    sget-object v1, Lcom/huawei/common/applog/c;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/common/applog/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    :cond_3
    :goto_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "%s: %s/%s: %s"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Lcom/huawei/common/applog/c;->c()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p0, v2, v3

    const/4 v3, 0x2

    aput-object p1, v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0xa

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 195
    invoke-static {p3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    .line 194
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 196
    sget-object v0, Lcom/huawei/common/applog/c;->d:Ljava/io/BufferedWriter;

    invoke-virtual {v0, v7}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 197
    sget-object v0, Lcom/huawei/common/applog/c;->d:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 200
    goto :goto_1

    .line 198
    :catch_0
    move-exception v6

    .line 199
    const-string v0, "LogWrite"

    const-string v1, "wtf IOException"

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 201
    :goto_1
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8

    .line 202
    :goto_2
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 234
    sget-boolean v0, Lcom/huawei/common/applog/c;->e:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/huawei/common/applog/c;->f:Z

    if-eqz v0, :cond_0

    .line 235
    const-string v0, "S"

    invoke-static {v0, p0, p1, p2}, Lcom/huawei/common/applog/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 237
    :cond_0
    return-void
.end method

.method private static a([Ljava/io/File;)Z
    .locals 1

    .line 128
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    array-length v0, p0

    if-lez v0, :cond_0

    .line 129
    const/4 v0, 0x0

    aget-object v0, p0, v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    return v0

    .line 131
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static b()Ljava/lang/String;
    .locals 7

    .line 157
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 158
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v4

    .line 159
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy_MM_dd_HH_mm_ss"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v0, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 160
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v6

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".log"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 135
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    :cond_0
    const-string v0, "LogWrite"

    const-string v1, "openLogFile Exception"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    return-void

    .line 139
    :cond_1
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    new-instance v4, Ljava/io/FileOutputStream;

    const/4 v0, 0x1

    invoke-direct {v4, v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 141
    const-class v5, Lcom/huawei/common/applog/c;

    monitor-enter v5

    .line 143
    :try_start_0
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    const-string v2, "UTF-8"

    invoke-direct {v1, v4, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    sput-object v0, Lcom/huawei/common/applog/c;->d:Ljava/io/BufferedWriter;

    .line 144
    sput-object p1, Lcom/huawei/common/applog/c;->h:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    goto :goto_0

    .line 145
    :catch_0
    move-exception v6

    .line 147
    :try_start_1
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 150
    goto :goto_0

    .line 148
    :catch_1
    move-exception v7

    .line 149
    const-string v0, "LogWrite"

    const-string v1, "openLogFile out.close Exception"

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8

    .line 153
    :goto_1
    return-void
.end method

.method private static c()Ljava/lang/String;
    .locals 5

    .line 205
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 206
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v4

    .line 207
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yy-MM-dd HH:mm:ss.SSS"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v0, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
