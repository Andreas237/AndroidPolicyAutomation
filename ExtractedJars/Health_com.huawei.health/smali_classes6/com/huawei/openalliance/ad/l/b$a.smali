.class Lcom/huawei/openalliance/ad/l/b$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/net/http/b/b/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/l/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/openalliance/ad/net/http/b/b/d<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/l/b;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:J


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/l/b;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/huawei/openalliance/ad/l/b$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/openalliance/ad/l/b$a;->c:Ljava/lang/String;

    iput-wide p4, p0, Lcom/huawei/openalliance/ad/l/b$a;->d:J

    return-void
.end method


# virtual methods
.method public synthetic a(ILjava/io/InputStream;JLcom/huawei/openalliance/ad/net/http/b/a;)Ljava/lang/Object;
    .locals 1

    invoke-virtual/range {p0 .. p5}, Lcom/huawei/openalliance/ad/l/b$a;->b(ILjava/io/InputStream;JLcom/huawei/openalliance/ad/net/http/b/a;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(ILjava/io/InputStream;JLcom/huawei/openalliance/ad/net/http/b/a;)Ljava/lang/Boolean;
    .locals 18

    const/16 v0, 0xc8

    move/from16 v1, p1

    if-eq v0, v1, :cond_0

    const/16 v0, 0xce

    move/from16 v1, p1

    if-eq v0, v1, :cond_0

    const-string v0, "SourceFetcher"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadfailed, http.response.code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/l/b;->b(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/d/a/a;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/l/c;->e()Ljava/lang/String;

    move-result-object v1

    move/from16 v2, p1

    const-string v3, "error_http_code"

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v4}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/l/c;->g()Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v5, p0

    iget-wide v5, v5, Lcom/huawei/openalliance/ad/l/b$a;->d:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v6}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v6

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/l/c;->h()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v6

    invoke-interface/range {v0 .. v6}, Lcom/huawei/openalliance/ad/d/a/a;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/l/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    move-wide/from16 v1, p3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;J)V

    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/l/c;->d()J

    move-result-wide v7

    cmp-long v0, p3, v7

    if-lez v0, :cond_2

    const-string v0, "SourceFetcher"

    const-string v1, "fileSize is not under limit %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/l/b;->b(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/d/a/a;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/l/c;->e()Ljava/lang/String;

    move-result-object v1

    move/from16 v2, p1

    const-string v3, "fileSize_exceed_limit"

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v4}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/l/c;->g()Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v5, p0

    iget-wide v5, v5, Lcom/huawei/openalliance/ad/l/b$a;->d:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v6}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v6

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/l/c;->h()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v6

    invoke-interface/range {v0 .. v6}, Lcom/huawei/openalliance/ad/d/a/a;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v9, 0x0

    const/4 v10, 0x0

    new-instance v11, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".bak"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/io/BufferedInputStream;

    move-object/from16 v1, p2

    const/16 v2, 0x2000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v9, v0

    new-instance v0, Ljava/io/BufferedOutputStream;

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v2, 0x2000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    move-object v10, v0

    const/4 v13, 0x0

    const/16 v0, 0x2000

    new-array v14, v0, [B

    :goto_0
    invoke-virtual {v9, v14}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v0

    move v12, v0

    if-lez v0, :cond_4

    add-int/2addr v13, v12

    int-to-long v0, v13

    cmp-long v0, v0, v7

    if-lez v0, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/l/b;->b(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/d/a/a;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/l/c;->e()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v2}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/l/c;->g()Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lcom/huawei/openalliance/ad/l/b$a;->d:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v4}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/l/c;->h()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/huawei/openalliance/ad/d/a/a;->b(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    const-string v0, "SourceFetcher"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadUrlToStream error, downloaded size "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", over the limit"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v11}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;)Z

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v15

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->c:Ljava/lang/String;

    invoke-static {v0, v1, v9, v10, v11}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;Ljava/lang/String;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;Ljava/io/File;)V

    return-object v15

    :cond_3
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v10, v14, v0, v12}, Ljava/io/BufferedOutputStream;->write([BII)V

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v10}, Ljava/io/BufferedOutputStream;->flush()V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/l/c;->c()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/l/c;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v15, v11}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/l/b;->b(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/d/a/a;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/l/c;->e()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v2}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/l/c;->g()Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lcom/huawei/openalliance/ad/l/b$a;->d:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v4}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/l/c;->h()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/huawei/openalliance/ad/d/a/a;->b(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    const-string v0, "SourceFetcher"

    const-string v1, "downloadUrlToStream error, downloaded file hashcode is not right"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v11}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;)Z

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->c:Ljava/lang/String;

    invoke-static {v0, v1, v9, v10, v11}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;Ljava/lang/String;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;Ljava/io/File;)V

    return-object v16

    :cond_5
    :try_start_2
    new-instance v0, Ljava/io/File;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->c:Ljava/lang/String;

    invoke-static {v0, v1, v9, v10, v11}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;Ljava/lang/String;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;Ljava/io/File;)V

    return-object v16

    :cond_6
    move-object/from16 v0, p0

    :try_start_3
    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/l/b;->b(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/d/a/a;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/l/c;->e()Ljava/lang/String;

    move-result-object v1

    move/from16 v2, p1

    const-string v3, "rename_file_fail"

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v4}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/l/c;->g()Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v5, p0

    iget-wide v5, v5, Lcom/huawei/openalliance/ad/l/b$a;->d:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v6}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v6

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/l/c;->h()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v6

    invoke-interface/range {v0 .. v6}, Lcom/huawei/openalliance/ad/d/a/a;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->c:Ljava/lang/String;

    invoke-static {v0, v1, v9, v10, v11}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;Ljava/lang/String;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;Ljava/io/File;)V

    return-object v16

    :catch_0
    move-exception v12

    const-string v0, "SourceFetcher"

    const-string v1, "download file encounters IOException"

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/l/b;->b(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/d/a/a;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/l/c;->e()Ljava/lang/String;

    move-result-object v1

    move/from16 v2, p1

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v4}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/l/c;->g()Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v5, p0

    iget-wide v5, v5, Lcom/huawei/openalliance/ad/l/b$a;->d:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    invoke-static {v6}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v6

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/l/c;->h()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v6

    invoke-interface/range {v0 .. v6}, Lcom/huawei/openalliance/ad/d/a/a;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v13

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->c:Ljava/lang/String;

    invoke-static {v0, v1, v9, v10, v11}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;Ljava/lang/String;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;Ljava/io/File;)V

    return-object v13

    :catchall_0
    move-exception v17

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/l/b$a;->a:Lcom/huawei/openalliance/ad/l/b;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/l/b$a;->c:Ljava/lang/String;

    invoke-static {v0, v1, v9, v10, v11}, Lcom/huawei/openalliance/ad/l/b;->a(Lcom/huawei/openalliance/ad/l/b;Ljava/lang/String;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;Ljava/io/File;)V

    throw v17
.end method
