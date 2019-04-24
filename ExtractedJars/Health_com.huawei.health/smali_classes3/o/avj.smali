.class public Lo/avj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Lo/avj;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/avj;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static b(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lo/avh;>;"
        }
    .end annotation

    .line 62
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 63
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/awj;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 64
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    return-object v2

    .line 69
    :cond_0
    const/4 v4, 0x0

    .line 72
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->decode([BI)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 77
    goto :goto_0

    .line 74
    :catch_0
    move-exception v5

    .line 76
    sget-object v0, Lo/avj;->d:Ljava/lang/String;

    const-string v1, "initPushMsgFromSp UnsupportedEncodingException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    :goto_0
    if-nez v4, :cond_1

    .line 81
    return-object v2

    .line 84
    :cond_1
    const/4 v5, 0x0

    .line 85
    const/4 v6, 0x0

    .line 88
    :try_start_1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object v5, v0

    .line 89
    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, v5}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v6, v0

    .line 91
    invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v7

    .line 92
    instance-of v0, v7, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 94
    move-object v0, v7

    check-cast v0, Ljava/util/List;
    :try_end_1
    .catch Ljava/io/OptionalDataException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v2, v0

    .line 111
    :cond_2
    invoke-static {v6}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 112
    invoke-static {v5}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 113
    goto :goto_1

    .line 97
    :catch_1
    move-exception v7

    .line 99
    :try_start_2
    sget-object v0, Lo/avj;->d:Ljava/lang/String;

    const-string v1, "initPushMsgFromSp OptionalDataException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    invoke-static {v6}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 112
    invoke-static {v5}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 113
    goto :goto_1

    .line 101
    :catch_2
    move-exception v7

    .line 103
    :try_start_3
    sget-object v0, Lo/avj;->d:Ljava/lang/String;

    const-string v1, "initPushMsgFromSp ClassNotFoundException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 111
    invoke-static {v6}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 112
    invoke-static {v5}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 113
    goto :goto_1

    .line 105
    :catch_3
    move-exception v7

    .line 107
    :try_start_4
    sget-object v0, Lo/avj;->d:Ljava/lang/String;

    const-string v1, "initPushMsgFromSp IOException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 111
    invoke-static {v6}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 112
    invoke-static {v5}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 113
    goto :goto_1

    .line 111
    :catchall_0
    move-exception v8

    invoke-static {v6}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 112
    invoke-static {v5}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 113
    throw v8

    .line 114
    :goto_1
    return-object v2
.end method

.method public static b(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/avh;>;)Ljava/util/List<Lo/avh;>;"
        }
    .end annotation

    .line 124
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 125
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 127
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 128
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/avh;

    .line 131
    invoke-virtual {v6}, Lo/avh;->d()J

    move-result-wide v0

    cmp-long v0, v3, v0

    if-lez v0, :cond_0

    .line 133
    invoke-interface {v2, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 135
    :cond_0
    goto :goto_0

    .line 137
    :cond_1
    return-object v2
.end method

.method static c(Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/avh;>;)V"
        }
    .end annotation

    .line 35
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 36
    const/4 v3, 0x0

    .line 39
    :try_start_0
    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-direct {v0, v2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v3, v0

    .line 41
    invoke-virtual {v3, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 43
    new-instance v4, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v4, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 44
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0, p0, v4}, Lo/awj;->e(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    invoke-static {v3}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 53
    invoke-static {v2}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 54
    goto :goto_0

    .line 46
    :catch_0
    move-exception v4

    .line 48
    :try_start_1
    sget-object v0, Lo/avj;->d:Ljava/lang/String;

    const-string v1, "savePushMsgToSharePref IOException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    invoke-static {v3}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 53
    invoke-static {v2}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 54
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v5

    invoke-static {v3}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 53
    invoke-static {v2}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 54
    throw v5

    .line 55
    :goto_0
    return-void
.end method
