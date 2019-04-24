.class public Lcom/huawei/feedback/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "FeedbackDetailActivity/StorageFileUtil"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    return-void
.end method

.method public static a()Ljava/security/SecureRandom;
    .locals 4

    .line 66
    const/4 v2, 0x0

    .line 68
    const-string v0, "SHA1PRNG"

    :try_start_0
    invoke-static {v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 71
    goto :goto_0

    .line 69
    :catch_0
    move-exception v3

    .line 70
    const-string v0, "FeedbackDetailActivity/StorageFileUtil"

    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    :goto_0
    if-nez v2, :cond_0

    .line 74
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    .line 77
    :cond_0
    invoke-virtual {v2}, Ljava/security/SecureRandom;->nextInt()I

    .line 78
    return-object v2
.end method

.method public static a(Ljava/io/File;)V
    .locals 5

    .line 27
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 28
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    return-void

    .line 32
    :cond_0
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_3

    .line 33
    const-string v0, "FeedbackDetailActivity/StorageFileUtil"

    aget-object v1, v2, v3

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    aget-object v0, v2, v3

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 37
    aget-object v0, v2, v3

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 40
    const-string v0, "FeedbackDetailActivity/StorageFileUtil"

    const-string v1, "file delete success!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 44
    :cond_1
    const-string v0, "FeedbackDetailActivity/StorageFileUtil"

    const-string v1, "file delete fail!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 49
    :cond_3
    return-void
.end method

.method public static a([B)V
    .locals 1

    .line 55
    invoke-static {}, Lcom/huawei/feedback/g;->a()Ljava/security/SecureRandom;

    move-result-object v0

    .line 56
    invoke-virtual {v0, p0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 57
    return-void
.end method

.method public static b()J
    .locals 10

    .line 92
    const-string v4, ""

    .line 93
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 94
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    .line 96
    :cond_0
    new-instance v5, Landroid/os/StatFs;

    invoke-direct {v5, v4}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v6, v0

    .line 98
    invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v8, v0

    .line 99
    const-string v0, "FeedbackDetailActivity/StorageFileUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "--Internal---availableBlocks * blockSize-->>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    mul-long v2, v8, v6

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    mul-long v0, v8, v6

    return-wide v0
.end method

.method public static c()J
    .locals 10

    .line 113
    invoke-static {}, Lcom/huawei/feedback/g;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v4

    .line 115
    new-instance v5, Landroid/os/StatFs;

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 116
    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v6, v0

    .line 117
    invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v8, v0

    .line 118
    const-string v0, "FeedbackDetailActivity/StorageFileUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "--External---availableBlocks * blockSize-->>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    mul-long v2, v8, v6

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    mul-long v0, v8, v6

    return-wide v0

    .line 122
    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public static d()Z
    .locals 2

    .line 132
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
