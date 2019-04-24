.class public Lo/dqg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static h:Z


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private c:Landroid/content/Context;

.field private d:Ljava/lang/String;

.field private e:Landroid/os/Handler;

.field private f:Landroid/content/pm/PackageInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    const/4 v0, 0x0

    sput-boolean v0, Lo/dqg;->h:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqg;->f:Landroid/content/pm/PackageInfo;

    .line 47
    iput-object p1, p0, Lo/dqg;->c:Landroid/content/Context;

    .line 48
    iput-object p2, p0, Lo/dqg;->d:Ljava/lang/String;

    .line 49
    iput-object p3, p0, Lo/dqg;->e:Landroid/os/Handler;

    .line 50
    iput-object p4, p0, Lo/dqg;->a:Ljava/lang/String;

    .line 51
    iput-object p5, p0, Lo/dqg;->b:Ljava/lang/String;

    .line 52
    return-void
.end method

.method private a(Landroid/os/Message;)Landroid/os/Message;
    .locals 1

    .line 119
    const/4 v0, 0x2

    iput v0, p1, Landroid/os/Message;->what:I

    .line 120
    return-object p1
.end method

.method public static a()Z
    .locals 1

    .line 31
    sget-boolean v0, Lo/dqg;->h:Z

    return v0
.end method

.method private b(Landroid/os/Message;Lo/doy;)V
    .locals 1

    .line 124
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->b(Lo/doy;)V

    .line 125
    invoke-static {p2}, Lo/dpm;->b(Lo/doy;)V

    .line 127
    invoke-static {}, Lo/dqg;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 128
    iget-object v0, p0, Lo/dqg;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 130
    :cond_0
    return-void
.end method

.method private c(Lo/doy;)V
    .locals 2

    .line 83
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 84
    if-eqz p1, :cond_0

    .line 85
    invoke-direct {p0, v1, p1}, Lo/dqg;->d(Landroid/os/Message;Lo/doy;)V

    goto :goto_0

    .line 87
    :cond_0
    const/4 v0, 0x0

    iput v0, v1, Landroid/os/Message;->what:I

    .line 88
    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lo/dqg;->b(Landroid/os/Message;Lo/doy;)V

    .line 90
    :goto_0
    return-void
.end method

.method private d(Landroid/content/Context;Ljava/lang/String;Lo/doy;)Lo/doy;
    .locals 16

    .line 136
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 137
    const/4 v5, 0x0

    .line 138
    const/4 v6, -0x1

    .line 140
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    :try_start_0
    invoke-static {v0, v1, v4}, Lo/dqd;->e(Landroid/content/Context;Ljava/lang/String;Ljava/io/OutputStream;)I

    move-result v0

    move v6, v0

    .line 141
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "retrieve filelist.xml: \n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-virtual {v4, v3}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    const/16 v0, 0xc8

    if-ne v6, v0, :cond_2

    .line 146
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get file list success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    .line 148
    const/4 v8, 0x0

    .line 149
    :goto_0
    array-length v0, v7

    if-ge v8, v0, :cond_1

    .line 150
    aget-byte v0, v7, v8

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_0

    .line 151
    goto :goto_1

    .line 149
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 154
    :cond_1
    :goto_1
    array-length v0, v7

    sub-int/2addr v0, v8

    new-array v9, v0, [B

    .line 155
    array-length v0, v7

    sub-int/2addr v0, v8

    const/4 v1, 0x0

    invoke-static {v7, v8, v9, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 156
    new-instance v10, Ljava/io/ByteArrayInputStream;

    invoke-direct {v10, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 157
    move-object/from16 v0, p3

    invoke-static {v10, v0}, Lo/dpx;->d(Ljava/io/InputStream;Lo/doy;)Lo/doy;

    move-result-object v5

    .line 160
    :cond_2
    :try_start_1
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 163
    goto/16 :goto_7

    .line 161
    :catch_0
    move-exception v7

    .line 162
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    goto/16 :goto_7

    .line 142
    :catch_1
    move-exception v7

    .line 143
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    const/16 v0, 0xc8

    if-ne v6, v0, :cond_5

    .line 146
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get file list success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    .line 148
    const/4 v8, 0x0

    .line 149
    :goto_2
    array-length v0, v7

    if-ge v8, v0, :cond_4

    .line 150
    aget-byte v0, v7, v8

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_3

    .line 151
    goto :goto_3

    .line 149
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 154
    :cond_4
    :goto_3
    array-length v0, v7

    sub-int/2addr v0, v8

    new-array v9, v0, [B

    .line 155
    array-length v0, v7

    sub-int/2addr v0, v8

    const/4 v1, 0x0

    invoke-static {v7, v8, v9, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 156
    new-instance v10, Ljava/io/ByteArrayInputStream;

    invoke-direct {v10, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 157
    move-object/from16 v0, p3

    invoke-static {v10, v0}, Lo/dpx;->d(Ljava/io/InputStream;Lo/doy;)Lo/doy;

    move-result-object v5

    .line 160
    :cond_5
    :try_start_3
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 163
    goto/16 :goto_7

    .line 161
    :catch_2
    move-exception v7

    .line 162
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    goto/16 :goto_7

    .line 145
    :catchall_0
    move-exception v11

    const/16 v0, 0xc8

    if-ne v6, v0, :cond_8

    .line 146
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get file list success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v12

    .line 148
    const/4 v13, 0x0

    .line 149
    :goto_4
    array-length v0, v12

    if-ge v13, v0, :cond_7

    .line 150
    aget-byte v0, v12, v13

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_6

    .line 151
    goto :goto_5

    .line 149
    :cond_6
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    .line 154
    :cond_7
    :goto_5
    array-length v0, v12

    sub-int/2addr v0, v13

    new-array v14, v0, [B

    .line 155
    array-length v0, v12

    sub-int/2addr v0, v13

    const/4 v1, 0x0

    invoke-static {v12, v13, v14, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 156
    new-instance v0, Ljava/io/ByteArrayInputStream;

    move-object v1, v14

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object v15, v0

    .line 157
    move-object/from16 v0, p3

    invoke-static {v15, v0}, Lo/dpx;->d(Ljava/io/InputStream;Lo/doy;)Lo/doy;

    move-result-object v5

    .line 160
    :cond_8
    :try_start_4
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 163
    goto :goto_6

    .line 161
    :catch_3
    move-exception v12

    .line 162
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :goto_6
    throw v11

    .line 165
    :goto_7
    return-object v5
.end method

.method private d(Landroid/os/Message;Lo/doy;)V
    .locals 8

    .line 93
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==ww==  new version buildNewVersionInfoXML applicationInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lo/doy;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object v4, p2, Lo/doy;->d:Ljava/lang/String;

    .line 95
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendJsonStreamToServer: applicationInfo.STATUS:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Lo/doy;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p2, Lo/doy;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "full/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "filelist.xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 97
    iget v0, p2, Lo/doy;->t:I

    if-nez v0, :cond_1

    .line 99
    iget-object v0, p0, Lo/dqg;->c:Landroid/content/Context;

    invoke-direct {p0, v0, v5, p2}, Lo/dqg;->d(Landroid/content/Context;Ljava/lang/String;Lo/doy;)Lo/doy;

    move-result-object v6

    .line 100
    if-nez v6, :cond_0

    .line 101
    const/4 v0, 0x0

    iput v0, p1, Landroid/os/Message;->what:I

    goto :goto_0

    .line 103
    :cond_0
    move-object p2, v6

    .line 104
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFileListXMLFromServer: applicationInfo.STATUS:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Lo/doy;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p2, Lo/doy;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "full/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p2, Lo/doy;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lo/doy;->w:Ljava/lang/String;

    .line 106
    invoke-static {p2}, Lo/dqd;->c(Lo/doy;)Lo/dow;

    move-result-object v7

    .line 107
    iput-object v4, v7, Lo/dow;->b:Ljava/lang/String;

    .line 108
    invoke-direct {p0, p1}, Lo/dqg;->a(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    .line 109
    iput-object v7, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 111
    :goto_0
    goto :goto_1

    .line 112
    :cond_1
    invoke-direct {p0, p1}, Lo/dqg;->a(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    .line 113
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "applicationInfo is NULL;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    :goto_1
    invoke-direct {p0, p1, p2}, Lo/dqg;->b(Landroid/os/Message;Lo/doy;)V

    .line 116
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 5

    .line 67
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 68
    invoke-static {p1}, Lo/dqa;->c(Ljava/lang/String;)Lo/doy;

    move-result-object v4

    .line 69
    invoke-direct {p0, v4}, Lo/dqg;->c(Lo/doy;)V

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 72
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 73
    invoke-static {}, Lo/dqg;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 74
    iget-object v0, p0, Lo/dqg;->e:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 75
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->b(Lo/doy;)V

    goto :goto_0

    .line 77
    :cond_1
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CancelCheckFlag is ture;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    :goto_0
    return-void
.end method


# virtual methods
.method public c(Landroid/content/pm/PackageInfo;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lo/dqg;->f:Landroid/content/pm/PackageInfo;

    .line 43
    return-void
.end method

.method public run()V
    .locals 8

    .line 55
    iget-object v0, p0, Lo/dqg;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->c(Ljava/lang/String;)V

    .line 56
    const/4 v5, 0x0

    .line 57
    iget-object v0, p0, Lo/dqg;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/dqg;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/dqg;->a:Ljava/lang/String;

    iget-object v3, p0, Lo/dqg;->f:Landroid/content/pm/PackageInfo;

    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iget-object v4, p0, Lo/dqg;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dpz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object v5

    .line 58
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dpz;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 59
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send json: \n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send json: \n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dqd;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 62
    const-string v0, "ScaleCheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "receive json:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-direct {p0, v7}, Lo/dqg;->e(Ljava/lang/String;)V

    .line 64
    return-void
.end method
