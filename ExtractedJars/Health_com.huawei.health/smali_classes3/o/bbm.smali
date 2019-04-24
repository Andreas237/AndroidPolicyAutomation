.class public final Lo/bbm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    const-class v0, Lo/bbm;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bbm;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lo/bbg;Ljava/lang/String;Ljava/io/File;)Z
    .locals 6

    .line 26
    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 28
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 40
    :cond_1
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bbg;->b(Ljava/lang/String;)V

    .line 42
    const/4 v3, 0x0

    .line 46
    :try_start_0
    invoke-static {p1}, Lo/bpy;->c(Ljava/lang/String;)Lo/bqg;

    move-result-object v0

    move-object v3, v0

    .line 48
    invoke-virtual {v3}, Lo/bqg;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 50
    sget-object v0, Lo/bbm;->b:Ljava/lang/String;

    const-string v1, "download success. begin write file."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-virtual {v3}, Lo/bqg;->a()Lo/bqi;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqi;->b()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v3}, Lo/bqg;->a()Lo/bqi;

    move-result-object v1

    invoke-virtual {v1}, Lo/bqi;->e()J

    move-result-wide v1

    invoke-static {v0, p2, v1, v2}, Lo/bot;->e(Ljava/io/InputStream;Ljava/io/File;J)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    .line 61
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 63
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bbg;->d(Ljava/lang/String;)V

    .line 51
    return v4

    .line 61
    :cond_2
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 63
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bbg;->d(Ljava/lang/String;)V

    .line 64
    goto :goto_0

    .line 54
    :catch_0
    move-exception v4

    .line 56
    :try_start_1
    sget-object v0, Lo/bbm;->b:Ljava/lang/String;

    const-string v1, "download file failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 63
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bbg;->d(Ljava/lang/String;)V

    .line 64
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v5

    invoke-static {v3}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 63
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bbg;->d(Ljava/lang/String;)V

    .line 64
    throw v5

    .line 66
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
