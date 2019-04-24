.class public Lo/dqc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static a:Z


# instance fields
.field private b:Ljava/lang/Boolean;

.field private c:Landroid/os/Handler;

.field private d:Ljava/lang/String;

.field private e:Landroid/content/Context;

.field private f:Ljava/lang/String;

.field private g:Landroid/content/pm/PackageInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const/4 v0, 0x0

    sput-boolean v0, Lo/dqc;->a:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Boolean;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqc;->g:Landroid/content/pm/PackageInfo;

    .line 43
    const-string v0, ""

    iput-object v0, p0, Lo/dqc;->f:Ljava/lang/String;

    .line 55
    iput-object p1, p0, Lo/dqc;->e:Landroid/content/Context;

    .line 56
    iput-object p2, p0, Lo/dqc;->d:Ljava/lang/String;

    .line 57
    iput-object p3, p0, Lo/dqc;->c:Landroid/os/Handler;

    .line 58
    iput-object p4, p0, Lo/dqc;->b:Ljava/lang/Boolean;

    .line 59
    return-void
.end method

.method private b(Landroid/os/Message;Lo/doy;)V
    .locals 4

    .line 147
    iget-object v0, p0, Lo/dqc;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(Lo/doy;)V

    .line 149
    invoke-static {p2}, Lo/dpm;->a(Lo/doy;)V

    goto/16 :goto_0

    .line 151
    :cond_0
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendApplicationMsg() packageName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dqc;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iget-object v0, p0, Lo/dqc;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dqc;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/dqc;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "aw70"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    .line 153
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendApplicationMsg() save AW70"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->c(Lo/doy;)V

    .line 155
    invoke-static {p2}, Lo/dpm;->c(Lo/doy;)V

    goto :goto_0

    .line 158
    :cond_1
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendApplicationMsg() save other device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->d(Lo/doy;)V

    .line 160
    invoke-static {p2}, Lo/dpm;->d(Lo/doy;)V

    .line 161
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lo/dqc;->f:Ljava/lang/String;

    invoke-virtual {v0, p2, v1}, Lo/dpb;->b(Lo/doy;Ljava/lang/String;)V

    .line 165
    :goto_0
    invoke-static {}, Lo/dqc;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 166
    iget-object v0, p0, Lo/dqc;->c:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 168
    :cond_2
    return-void
.end method

.method public static b(Z)V
    .locals 0

    .line 38
    sput-boolean p0, Lo/dqc;->a:Z

    .line 39
    return-void
.end method

.method private c(Landroid/os/Message;)Landroid/os/Message;
    .locals 1

    .line 138
    iget-object v0, p0, Lo/dqc;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    const/4 v0, 0x1

    iput v0, p1, Landroid/os/Message;->what:I

    goto :goto_0

    .line 141
    :cond_0
    const/4 v0, 0x2

    iput v0, p1, Landroid/os/Message;->what:I

    .line 143
    :goto_0
    return-object p1
.end method

.method private c(Landroid/os/Message;Lo/doy;)V
    .locals 8

    .line 112
    const-string v0, "CheckNewVersionThread"

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

    .line 113
    iget-object v4, p2, Lo/doy;->d:Ljava/lang/String;

    .line 114
    const-string v0, "CheckNewVersionThread"

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

    .line 115
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

    .line 116
    iget v0, p2, Lo/doy;->t:I

    if-nez v0, :cond_1

    .line 118
    iget-object v0, p0, Lo/dqc;->e:Landroid/content/Context;

    invoke-direct {p0, v0, v5, p2}, Lo/dqc;->e(Landroid/content/Context;Ljava/lang/String;Lo/doy;)Lo/doy;

    move-result-object v6

    .line 119
    if-nez v6, :cond_0

    .line 120
    const/4 v0, 0x0

    iput v0, p1, Landroid/os/Message;->what:I

    goto :goto_0

    .line 122
    :cond_0
    move-object p2, v6

    .line 123
    const-string v0, "CheckNewVersionThread"

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

    .line 124
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

    .line 125
    invoke-static {p2}, Lo/dqd;->c(Lo/doy;)Lo/dow;

    move-result-object v7

    .line 126
    iput-object v4, v7, Lo/dow;->b:Ljava/lang/String;

    .line 127
    invoke-direct {p0, p1}, Lo/dqc;->c(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    .line 128
    iput-object v7, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 130
    :goto_0
    goto :goto_1

    .line 131
    :cond_1
    invoke-direct {p0, p1}, Lo/dqc;->c(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    .line 132
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "applicationInfo is NULL;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    :goto_1
    invoke-direct {p0, p1, p2}, Lo/dqc;->b(Landroid/os/Message;Lo/doy;)V

    .line 135
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 5

    .line 82
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 83
    invoke-static {p1}, Lo/dqa;->c(Ljava/lang/String;)Lo/doy;

    move-result-object v4

    .line 84
    invoke-direct {p0, v4}, Lo/dqc;->c(Lo/doy;)V

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 88
    invoke-static {}, Lo/dqc;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 89
    iget-object v0, p0, Lo/dqc;->c:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 90
    iget-object v0, p0, Lo/dqc;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(Lo/doy;)V

    goto :goto_0

    .line 93
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->d(Lo/doy;)V

    goto :goto_0

    .line 96
    :cond_2
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CancelCheckFlag is ture;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    :goto_0
    return-void
.end method

.method private c(Lo/doy;)V
    .locals 2

    .line 102
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 103
    if-eqz p1, :cond_0

    .line 104
    invoke-direct {p0, v1, p1}, Lo/dqc;->c(Landroid/os/Message;Lo/doy;)V

    goto :goto_0

    .line 106
    :cond_0
    const/4 v0, 0x0

    iput v0, v1, Landroid/os/Message;->what:I

    .line 107
    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lo/dqc;->b(Landroid/os/Message;Lo/doy;)V

    .line 109
    :goto_0
    return-void
.end method

.method public static c()Z
    .locals 1

    .line 34
    sget-boolean v0, Lo/dqc;->a:Z

    return v0
.end method

.method private e(Landroid/content/Context;Ljava/lang/String;Lo/doy;)Lo/doy;
    .locals 16

    .line 173
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 174
    const/4 v5, 0x0

    .line 175
    const/4 v6, -0x1

    .line 177
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    :try_start_0
    invoke-static {v0, v1, v4}, Lo/dqd;->e(Landroid/content/Context;Ljava/lang/String;Ljava/io/OutputStream;)I

    move-result v0

    move v6, v0

    .line 178
    const-string v0, "CheckNewVersionThread"

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

    .line 182
    const/16 v0, 0xc8

    if-ne v6, v0, :cond_2

    .line 183
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get file list success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    .line 185
    const/4 v8, 0x0

    .line 186
    :goto_0
    array-length v0, v7

    if-ge v8, v0, :cond_1

    .line 187
    aget-byte v0, v7, v8

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_0

    .line 188
    goto :goto_1

    .line 186
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 191
    :cond_1
    :goto_1
    array-length v0, v7

    sub-int/2addr v0, v8

    new-array v9, v0, [B

    .line 192
    array-length v0, v7

    sub-int/2addr v0, v8

    const/4 v1, 0x0

    invoke-static {v7, v8, v9, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 193
    new-instance v10, Ljava/io/ByteArrayInputStream;

    invoke-direct {v10, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 194
    move-object/from16 v0, p3

    invoke-static {v10, v0}, Lo/dpx;->d(Ljava/io/InputStream;Lo/doy;)Lo/doy;

    move-result-object v5

    .line 197
    :cond_2
    :try_start_1
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 200
    goto/16 :goto_7

    .line 198
    :catch_0
    move-exception v7

    .line 199
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    goto/16 :goto_7

    .line 179
    :catch_1
    move-exception v7

    .line 180
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 182
    const/16 v0, 0xc8

    if-ne v6, v0, :cond_5

    .line 183
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get file list success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    .line 185
    const/4 v8, 0x0

    .line 186
    :goto_2
    array-length v0, v7

    if-ge v8, v0, :cond_4

    .line 187
    aget-byte v0, v7, v8

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_3

    .line 188
    goto :goto_3

    .line 186
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 191
    :cond_4
    :goto_3
    array-length v0, v7

    sub-int/2addr v0, v8

    new-array v9, v0, [B

    .line 192
    array-length v0, v7

    sub-int/2addr v0, v8

    const/4 v1, 0x0

    invoke-static {v7, v8, v9, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 193
    new-instance v10, Ljava/io/ByteArrayInputStream;

    invoke-direct {v10, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 194
    move-object/from16 v0, p3

    invoke-static {v10, v0}, Lo/dpx;->d(Ljava/io/InputStream;Lo/doy;)Lo/doy;

    move-result-object v5

    .line 197
    :cond_5
    :try_start_3
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 200
    goto/16 :goto_7

    .line 198
    :catch_2
    move-exception v7

    .line 199
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    goto/16 :goto_7

    .line 182
    :catchall_0
    move-exception v11

    const/16 v0, 0xc8

    if-ne v6, v0, :cond_8

    .line 183
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get file list success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v12

    .line 185
    const/4 v13, 0x0

    .line 186
    :goto_4
    array-length v0, v12

    if-ge v13, v0, :cond_7

    .line 187
    aget-byte v0, v12, v13

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_6

    .line 188
    goto :goto_5

    .line 186
    :cond_6
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    .line 191
    :cond_7
    :goto_5
    array-length v0, v12

    sub-int/2addr v0, v13

    new-array v14, v0, [B

    .line 192
    array-length v0, v12

    sub-int/2addr v0, v13

    const/4 v1, 0x0

    invoke-static {v12, v13, v14, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 193
    new-instance v0, Ljava/io/ByteArrayInputStream;

    move-object v1, v14

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object v15, v0

    .line 194
    move-object/from16 v0, p3

    invoke-static {v15, v0}, Lo/dpx;->d(Ljava/io/InputStream;Lo/doy;)Lo/doy;

    move-result-object v5

    .line 197
    :cond_8
    :try_start_4
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 200
    goto :goto_6

    .line 198
    :catch_3
    move-exception v12

    .line 199
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    :goto_6
    throw v11

    .line 202
    :goto_7
    return-object v5
.end method


# virtual methods
.method public d(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lo/dqc;->f:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public e(Landroid/content/pm/PackageInfo;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lo/dqc;->g:Landroid/content/pm/PackageInfo;

    .line 47
    return-void
.end method

.method public run()V
    .locals 7

    .line 62
    iget-object v0, p0, Lo/dqc;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dqc;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/dqc;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "aw70"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 63
    iget-object v0, p0, Lo/dqc;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 65
    :cond_0
    iget-object v0, p0, Lo/dqc;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->b(Ljava/lang/String;)V

    .line 67
    :goto_0
    const/4 v4, 0x0

    .line 68
    iget-object v0, p0, Lo/dqc;->g:Landroid/content/pm/PackageInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 69
    iget-object v0, p0, Lo/dqc;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/dqc;->g:Landroid/content/pm/PackageInfo;

    iget-object v2, p0, Lo/dqc;->f:Ljava/lang/String;

    iget-object v3, p0, Lo/dqc;->b:Ljava/lang/Boolean;

    invoke-static {v0, v1, v2, v3}, Lo/dpz;->b(Landroid/content/Context;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/io/OutputStream;

    move-result-object v4

    goto :goto_1

    .line 71
    :cond_1
    iget-object v0, p0, Lo/dqc;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/dqc;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/dqc;->b:Ljava/lang/Boolean;

    invoke-static {v0, v1, v2}, Lo/dpz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/io/OutputStream;

    move-result-object v4

    .line 73
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dpz;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 74
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send json: \n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send json: \n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dqd;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 77
    const-string v0, "CheckNewVersionThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "receive json:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    invoke-direct {p0, v6}, Lo/dqc;->c(Ljava/lang/String;)V

    .line 79
    return-void
.end method
