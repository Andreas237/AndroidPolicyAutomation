.class public Lcom/huawei/hwCloudJs/service/a/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "SerializedObject"


# instance fields
.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/a/d;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/a/d;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v3, v0

    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, v3}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v2, v0

    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    invoke-static {v3}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    invoke-static {v2}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "SerializedObject"

    const-string v1, "read file error "

    :try_start_1
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v3}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    invoke-static {v2}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_1
    move-exception v5

    const-string v0, "SerializedObject"

    const-string v1, "read file error "

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v3}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    invoke-static {v2}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v6

    invoke-static {v3}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    invoke-static {v2}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    throw v6

    :goto_0
    return-object v4
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/a/d;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-direct {v0, v4}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v3, v0

    invoke-virtual {v3, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    invoke-static {v4}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "SerializedObject"

    const-string v1, "read file error "

    :try_start_1
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v4}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v6

    invoke-static {v4}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    throw v6

    :goto_0
    return v2
.end method

.method public b()J
    .locals 2

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/a/d;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    return-wide v0
.end method
