.class public Lcom/j256/ormlite/logger/LocalLog;
.super Ljava/lang/Object;
.source "LocalLog.java"

# interfaces
.implements Lcom/j256/ormlite/logger/Log;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/j256/ormlite/logger/LocalLog$PatternLevel;
    }
.end annotation


# static fields
.field private static final DEFAULT_LEVEL:Lcom/j256/ormlite/logger/Log$Level;

.field private static final classLevels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/j256/ormlite/logger/LocalLog$PatternLevel;",
            ">;"
        }
    .end annotation
.end field

.field private static final dateFormatThreadLocal:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/DateFormat;",
            ">;"
        }
    .end annotation
.end field

.field private static printStream:Ljava/io/PrintStream;


# instance fields
.field private final className:Ljava/lang/String;

.field private final level:Lcom/j256/ormlite/logger/Log$Level;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 47
    sget-object v0, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;

    sput-object v0, Lcom/j256/ormlite/logger/LocalLog;->DEFAULT_LEVEL:Lcom/j256/ormlite/logger/Log$Level;

    .line 48
    new-instance v0, Lcom/j256/ormlite/logger/LocalLog$1;

    invoke-direct {v0}, Lcom/j256/ormlite/logger/LocalLog$1;-><init>()V

    sput-object v0, Lcom/j256/ormlite/logger/LocalLog;->dateFormatThreadLocal:Ljava/lang/ThreadLocal;

    .line 61
    const-class v0, Lcom/j256/ormlite/logger/LocalLog;

    const-string v1, "/ormliteLocalLog.properties"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 62
    invoke-static {v0}, Lcom/j256/ormlite/logger/LocalLog;->readLevelResourceFile(Ljava/io/InputStream;)Ljava/util/List;

    move-result-object v0

    .line 63
    sput-object v0, Lcom/j256/ormlite/logger/LocalLog;->classLevels:Ljava/util/List;

    const-string v0, "com.j256.ormlite.logger.file"

    .line 69
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 70
    invoke-static {v0}, Lcom/j256/ormlite/logger/LocalLog;->openLogFile(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    invoke-static {p1}, Lcom/j256/ormlite/logger/LoggerFactory;->getSimpleClassName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/j256/ormlite/logger/LocalLog;->className:Ljava/lang/String;

    .line 78
    sget-object v0, Lcom/j256/ormlite/logger/LocalLog;->classLevels:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 79
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;

    .line 80
    iget-object v3, v2, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_0

    if-eqz v1, :cond_1

    .line 82
    iget-object v3, v2, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;->level:Lcom/j256/ormlite/logger/Log$Level;

    invoke-virtual {v3}, Lcom/j256/ormlite/logger/Log$Level;->ordinal()I

    move-result v3

    invoke-virtual {v1}, Lcom/j256/ormlite/logger/Log$Level;->ordinal()I

    move-result v4

    if-ge v3, v4, :cond_0

    .line 83
    :cond_1
    iget-object v1, v2, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;->level:Lcom/j256/ormlite/logger/Log$Level;

    goto :goto_0

    :cond_2
    if-nez v1, :cond_4

    const-string p1, "com.j256.ormlite.logger.level"

    .line 91
    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    .line 93
    sget-object v1, Lcom/j256/ormlite/logger/LocalLog;->DEFAULT_LEVEL:Lcom/j256/ormlite/logger/Log$Level;

    goto :goto_1

    .line 97
    :cond_3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/j256/ormlite/logger/Log$Level;->valueOf(Ljava/lang/String;)Lcom/j256/ormlite/logger/Log$Level;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 99
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Level \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' was not found"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 104
    :cond_4
    :goto_1
    iput-object v1, p0, Lcom/j256/ormlite/logger/LocalLog;->level:Lcom/j256/ormlite/logger/Log$Level;

    return-void
.end method

.method private static configureClassLevels(Ljava/io/InputStream;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            ")",
            "Ljava/util/List<",
            "Lcom/j256/ormlite/logger/LocalLog$PatternLevel;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 164
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 165
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 167
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    return-object p0

    .line 172
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x23

    if-ne v3, v4, :cond_2

    goto :goto_0

    :cond_2
    const-string v3, "="

    .line 175
    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 176
    array-length v4, v3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_3

    .line 177
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Line is not in the format of \'pattern = level\': "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 180
    :cond_3
    aget-object v1, v3, v2

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    const/4 v2, 0x1

    .line 183
    :try_start_0
    aget-object v4, v3, v2

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/j256/ormlite/logger/Log$Level;->valueOf(Ljava/lang/String;)Lcom/j256/ormlite/logger/Log$Level;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    new-instance v3, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;

    invoke-direct {v3, v1, v2}, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;-><init>(Ljava/util/regex/Pattern;Lcom/j256/ormlite/logger/Log$Level;)V

    invoke-interface {p0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 185
    :catch_0
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Level \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v3, v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' was not found"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static openLogFile(Ljava/lang/String;)V
    .locals 4

    if-nez p0, :cond_0

    .line 112
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    sput-object p0, Lcom/j256/ormlite/logger/LocalLog;->printStream:Ljava/io/PrintStream;

    goto :goto_0

    .line 115
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/PrintStream;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/PrintStream;-><init>(Ljava/io/File;)V

    sput-object v0, Lcom/j256/ormlite/logger/LocalLog;->printStream:Ljava/io/PrintStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    .line 117
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Log file "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " was not found"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private printMessage(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 194
    invoke-virtual {p0, p1}, Lcom/j256/ormlite/logger/LocalLog;->isLevelEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 197
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 198
    sget-object v1, Lcom/j256/ormlite/logger/LocalLog;->dateFormatThreadLocal:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/text/DateFormat;

    .line 199
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/j256/ormlite/logger/Log$Level;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    iget-object p1, p0, Lcom/j256/ormlite/logger/LocalLog;->className:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 202
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    sget-object p1, Lcom/j256/ormlite/logger/LocalLog;->printStream:Ljava/io/PrintStream;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    if-eqz p3, :cond_1

    .line 205
    sget-object p1, Lcom/j256/ormlite/logger/LocalLog;->printStream:Ljava/io/PrintStream;

    invoke-virtual {p3, p1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :cond_1
    return-void
.end method

.method static readLevelResourceFile(Ljava/io/InputStream;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            ")",
            "Ljava/util/List<",
            "Lcom/j256/ormlite/logger/LocalLog$PatternLevel;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 148
    :try_start_0
    invoke-static {p0}, Lcom/j256/ormlite/logger/LocalLog;->configureClassLevels(Ljava/io/InputStream;)Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 150
    :try_start_2
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IO exception reading the log properties file \'/ormliteLocalLog.properties\': "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 154
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :goto_0
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 157
    :catch_1
    throw v0

    :catch_2
    :cond_0
    :goto_1
    const/4 v0, 0x0

    :catch_3
    :goto_2
    return-object v0
.end method


# virtual methods
.method public isLevelEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/j256/ormlite/logger/LocalLog;->level:Lcom/j256/ormlite/logger/Log$Level;

    invoke-virtual {v0, p1}, Lcom/j256/ormlite/logger/Log$Level;->isEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z

    move-result p1

    return p1
.end method

.method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 127
    invoke-direct {p0, p1, p2, v0}, Lcom/j256/ormlite/logger/LocalLog;->printMessage(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 131
    invoke-direct {p0, p1, p2, p3}, Lcom/j256/ormlite/logger/LocalLog;->printMessage(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
