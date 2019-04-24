.class public Lcom/huawei/openalliance/ad/utils/z;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/utils/z;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/utils/z;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/io/Serializable;
    .locals 7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, v4}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v3, v0

    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v5

    instance-of v0, v5, Ljava/io/Serializable;

    if-eqz v0, :cond_0

    move-object v0, v5

    check-cast v0, Ljava/io/Serializable;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v0

    :cond_0
    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_0
    move-exception v5

    :try_start_1
    sget-object v0, Lcom/huawei/openalliance/ad/utils/z;->a:Ljava/lang/String;

    const-string v1, "read file FileNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_1
    move-exception v5

    :try_start_2
    sget-object v0, Lcom/huawei/openalliance/ad/utils/z;->a:Ljava/lang/String;

    const-string v1, "read file ClassNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_2
    move-exception v5

    :try_start_3
    sget-object v0, Lcom/huawei/openalliance/ad/utils/z;->a:Ljava/lang/String;

    const-string v1, "read file IOException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v6

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    throw v6

    :goto_0
    return-object v2
.end method

.method public static a(Ljava/io/Serializable;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v3, v0

    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-direct {v0, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v4, v0

    invoke-virtual {v4, p0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/io/ObjectOutputStream;->flush()V

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v2, v0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_0
    move-exception v5

    :try_start_1
    sget-object v0, Lcom/huawei/openalliance/ad/utils/z;->a:Ljava/lang/String;

    const-string v1, "fail to get sequence"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v6

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    throw v6

    :goto_0
    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/l;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/io/Serializable;Ljava/lang/String;)Z
    .locals 7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/utils/z;->a:Ljava/lang/String;

    const-string v1, "writeObject, mkdir failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-direct {v0, v4}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v3, v0

    invoke-virtual {v3, p0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_0
    move-exception v5

    :try_start_1
    sget-object v0, Lcom/huawei/openalliance/ad/utils/z;->a:Ljava/lang/String;

    const-string v1, "write file FileNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_1
    move-exception v5

    :try_start_2
    sget-object v0, Lcom/huawei/openalliance/ad/utils/z;->a:Ljava/lang/String;

    const-string v1, "write file IOException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v6

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    throw v6

    :goto_0
    return v2
.end method

.method public static b(Ljava/lang/String;)Ljava/io/Serializable;
    .locals 7

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/l;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object v3, v0

    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, v3}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v4, v0

    invoke-virtual {v4}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v5

    instance-of v0, v5, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    move-object v0, v5

    check-cast v0, Ljava/io/Serializable;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v0

    :cond_1
    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_0
    move-exception v5

    :try_start_1
    sget-object v0, Lcom/huawei/openalliance/ad/utils/z;->a:Ljava/lang/String;

    const-string v1, "fail to get Serializable"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_1
    move-exception v5

    :try_start_2
    sget-object v0, Lcom/huawei/openalliance/ad/utils/z;->a:Ljava/lang/String;

    const-string v1, "fail to get Serializable"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_2
    move-exception v5

    :try_start_3
    sget-object v0, Lcom/huawei/openalliance/ad/utils/z;->a:Ljava/lang/String;

    const-string v1, "fail to get Serializable"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v6

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    throw v6

    :goto_0
    return-object v2
.end method
