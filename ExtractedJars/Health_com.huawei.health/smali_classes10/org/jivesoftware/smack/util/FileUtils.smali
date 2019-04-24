.class public final Lorg/jivesoftware/smack/util/FileUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "FileUtils"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getClassLoaders()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/ClassLoader;>;"
        }
    .end annotation

    .line 73
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/ClassLoader;

    .line 74
    const-class v0, Lorg/jivesoftware/smack/util/FileUtils;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 75
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 78
    new-instance v3, Ljava/util/ArrayList;

    array-length v0, v2

    const/4 v0, 0x2

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    move-object v4, v2

    array-length v5, v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 80
    if-eqz v7, :cond_0

    .line 81
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 84
    :cond_1
    return-object v3
.end method

.method public static getStreamForUrl(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/io/InputStream;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 41
    invoke-static {p0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 44
    new-instance v0, Ljava/net/MalformedURLException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No protocol found in file URL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/MalformedURLException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 47
    :cond_0
    invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "classpath"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 49
    invoke-static {}, Lorg/jivesoftware/smack/util/FileUtils;->getClassLoaders()Ljava/util/List;

    move-result-object v4

    .line 50
    if-eqz p1, :cond_1

    .line 51
    const/4 v0, 0x0

    invoke-interface {v4, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 53
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/ClassLoader;

    .line 54
    invoke-virtual {v3}, Ljava/net/URI;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v7

    .line 56
    if-eqz v7, :cond_2

    .line 57
    return-object v7

    .line 59
    :cond_2
    goto :goto_0

    .line 60
    :cond_3
    goto :goto_1

    .line 62
    :cond_4
    invoke-virtual {v3}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    .line 64
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static readFile(Ljava/io/File;)Ljava/lang/String;
    .locals 3

    .line 122
    :try_start_0
    invoke-static {p0}, Lorg/jivesoftware/smack/util/FileUtils;->readFileOrThrow(Ljava/io/File;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 123
    :catch_0
    move-exception v2

    .line 124
    const-string v0, "FileUtils"

    const-string v1, "readFile FileNotFoundException"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    goto :goto_0

    .line 125
    :catch_1
    move-exception v2

    .line 126
    const-string v0, "FileUtils"

    const-string v1, "readFile IOException"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static readFileOrThrow(Ljava/io/File;)Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 98
    const/4 v2, 0x0

    .line 100
    :try_start_0
    new-instance v0, Ljava/io/FileReader;

    invoke-direct {v0, p0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    move-object v2, v0

    .line 101
    const/16 v0, 0x2000

    new-array v3, v0, [C

    .line 103
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    :goto_0
    invoke-virtual {v2, v3}, Ljava/io/Reader;->read([C)I

    move-result v0

    move v4, v0

    if-ltz v0, :cond_0

    .line 105
    const/4 v0, 0x0

    invoke-virtual {v5, v3, v0, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 107
    :cond_0
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    .line 111
    if-eqz v2, :cond_1

    .line 112
    :try_start_1
    invoke-virtual {v2}, Ljava/io/Reader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 116
    :cond_1
    goto :goto_1

    .line 114
    :catch_0
    move-exception v7

    .line 115
    const-string v0, "FileUtils"

    const-string v1, "reader close IOException"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    :goto_1
    return-object v6

    .line 110
    :catchall_0
    move-exception v8

    .line 111
    if-eqz v2, :cond_2

    .line 112
    :try_start_2
    invoke-virtual {v2}, Ljava/io/Reader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 116
    :cond_2
    goto :goto_2

    .line 114
    :catch_1
    move-exception v9

    .line 115
    const-string v0, "FileUtils"

    const-string v1, "reader close IOException"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    :goto_2
    throw v8
.end method

.method public static writeFile(Ljava/io/File;Ljava/lang/CharSequence;)Z
    .locals 3

    .line 147
    :try_start_0
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/util/FileUtils;->writeFileOrThrow(Ljava/io/File;Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    const/4 v0, 0x1

    return v0

    .line 150
    :catch_0
    move-exception v2

    .line 151
    const-string v0, "FileUtils"

    const-string v1, "writeFile IOException"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const/4 v0, 0x0

    return v0
.end method

.method public static writeFileOrThrow(Ljava/io/File;Ljava/lang/CharSequence;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 133
    new-instance v2, Ljava/io/FileWriter;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    .line 135
    :try_start_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 141
    goto :goto_1

    .line 139
    :catch_0
    move-exception v3

    .line 140
    const-string v0, "FileUtils"

    const-string v1, "writer.close IOException"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    goto :goto_1

    .line 137
    :catchall_0
    move-exception v4

    .line 138
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 141
    goto :goto_0

    .line 139
    :catch_1
    move-exception v5

    .line 140
    const-string v0, "FileUtils"

    const-string v1, "writer.close IOException"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    :goto_0
    throw v4

    .line 143
    :goto_1
    return-void
.end method
