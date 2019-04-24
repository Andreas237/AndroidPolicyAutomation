.class final Lo/bqh$2;
.super Lo/bqh;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bqh;->c(Ljava/lang/String;Ljava/io/File;)Lo/bqh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/io/File;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/bqh$2;->d:Ljava/lang/String;

    iput-object p2, p0, Lo/bqh$2;->e:Ljava/io/File;

    invoke-direct {p0}, Lo/bqh;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lo/bqh$2;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/io/OutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 128
    const/4 v2, 0x0

    .line 131
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lo/bqh$2;->e:Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    .line 132
    invoke-static {v2, p1}, Lo/bpe;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    invoke-static {v2}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 137
    goto :goto_0

    .line 136
    :catchall_0
    move-exception v3

    invoke-static {v2}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 137
    throw v3

    .line 138
    :goto_0
    return-void
.end method

.method public e()J
    .locals 2

    .line 117
    iget-object v0, p0, Lo/bqh$2;->e:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method
