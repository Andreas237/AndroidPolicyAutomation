.class public Lo/efm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lo/efm;->d:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lo/efm;->a:Ljava/lang/String;

    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/efm;->e:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/efm;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lo/efm;->e:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/efm;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()V
    .locals 1

    .line 60
    iget-object v0, p0, Lo/efm;->e:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lo/efm;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efm;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 64
    :cond_0
    return-void
.end method

.method public e(Ljava/io/InputStream;)V
    .locals 8

    .line 27
    :try_start_0
    new-instance v3, Ljava/io/InputStreamReader;

    const-string v0, "utf-8"

    invoke-direct {v3, p1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 28
    new-instance v4, Ljava/io/BufferedReader;

    invoke-direct {v4, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 29
    const/4 v5, 0x0

    .line 30
    :goto_0
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 31
    const-string v0, "[ ]+"

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 32
    const/4 v0, 0x0

    aget-object v0, v6, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 33
    const-string v0, "vertex_source_file"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 34
    const/4 v0, 0x1

    aget-object v0, v6, v0

    iput-object v0, p0, Lo/efm;->d:Ljava/lang/String;

    goto :goto_1

    .line 35
    :cond_0
    const-string v0, "fragment_source_file"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 36
    const/4 v0, 0x1

    aget-object v0, v6, v0

    iput-object v0, p0, Lo/efm;->a:Ljava/lang/String;

    goto :goto_1

    .line 37
    :cond_1
    const-string v0, "attribute"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "uniform"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 38
    :cond_2
    iget-object v0, p0, Lo/efm;->e:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x2

    aget-object v1, v6, v1

    invoke-virtual {v0, v1, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :cond_3
    :goto_1
    goto :goto_0

    .line 44
    :cond_4
    goto :goto_2

    .line 41
    :catch_0
    move-exception v3

    .line 42
    const-string v0, "MaterialParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " load error e="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 45
    :goto_2
    return-void
.end method
