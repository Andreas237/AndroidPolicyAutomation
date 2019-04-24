.class public Lo/bbx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/Context;

.field private c:Ljava/lang/Object;

.field private e:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bbx;->c:Ljava/lang/Object;

    .line 46
    iput-object p1, p0, Lo/bbx;->b:Landroid/content/Context;

    .line 47
    invoke-direct {p0}, Lo/bbx;->e()V

    .line 48
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 9

    .line 268
    const/4 v5, 0x0

    .line 269
    const/4 v6, 0x0

    .line 270
    const/4 v7, 0x0

    .line 271
    invoke-direct {p0}, Lo/bbx;->h()Ljava/lang/Object;

    move-result-object v5

    .line 272
    if-eqz v5, :cond_3

    .line 276
    :try_start_0
    iget-object v0, p0, Lo/bbx;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 278
    iget-object v0, p0, Lo/bbx;->b:Landroid/content/Context;

    const-string v1, "storage"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lo/bbx;->c:Ljava/lang/Object;

    .line 280
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getPath"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 281
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-virtual {v7}, Ljava/lang/String;->length()I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 283
    :cond_1
    return-object v6

    .line 286
    :cond_2
    :try_start_1
    iget-object v0, p0, Lo/bbx;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getVolumeState"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lo/bbx;->c:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    .line 287
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v6, v0

    .line 296
    goto :goto_0

    .line 289
    :catch_0
    move-exception v8

    .line 291
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getSdCardVolumeState() RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    goto :goto_0

    .line 293
    :catch_1
    move-exception v8

    .line 295
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getSdCardVolumeState() Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    :cond_3
    :goto_0
    return-object v6
.end method

.method private c(Ljava/lang/Object;)Z
    .locals 5

    .line 112
    const/4 v3, 0x0

    .line 114
    if-nez p1, :cond_0

    .line 116
    const-string v0, "SystemStorage"

    const-string v1, "storageVolume is null, failed in isVolumeRemoveble"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    return v3

    .line 122
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "isRemovable"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    move v3, v0

    .line 131
    goto :goto_0

    .line 124
    :catch_0
    move-exception v4

    .line 126
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.isVolumeRemoveble() RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    goto :goto_0

    .line 128
    :catch_1
    move-exception v4

    .line 130
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.isVolumeRemoveble() Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    :goto_0
    return v3
.end method

.method private d(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 83
    const/4 v3, 0x0

    .line 84
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 86
    const-string v0, ""

    return-object v0

    .line 91
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getPath"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v3, v0

    .line 100
    goto :goto_0

    .line 93
    :catch_0
    move-exception v4

    .line 95
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getVolumePath RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    goto :goto_0

    .line 97
    :catch_1
    move-exception v4

    .line 99
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getVolumePath Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    :goto_0
    return-object v3
.end method

.method private e()V
    .locals 4

    .line 57
    :try_start_0
    iget-object v0, p0, Lo/bbx;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 59
    iget-object v0, p0, Lo/bbx;->b:Landroid/content/Context;

    const-string v1, "storage"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lo/bbx;->c:Ljava/lang/Object;

    .line 61
    :cond_0
    iget-object v0, p0, Lo/bbx;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getVolumeList"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lo/bbx;->c:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 72
    goto :goto_0

    .line 65
    :catch_0
    move-exception v3

    .line 67
    const-string v0, "SystemStorage"

    const-string v1, "Storage_standard getStoragePathList RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    goto :goto_0

    .line 69
    :catch_1
    move-exception v3

    .line 71
    const-string v0, "SystemStorage"

    const-string v1, "Storage_standard getStoragePathList Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/Object;)Z
    .locals 6

    .line 143
    const/4 v3, 0x0

    .line 144
    const/4 v4, 0x0

    .line 147
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 149
    const-string v0, "SystemStorage"

    const-string v1, "null == storageVolume failed in isOtgVolume"

    :try_start_0
    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    :cond_0
    iget-object v0, p0, Lo/bbx;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 153
    iget-object v0, p0, Lo/bbx;->b:Landroid/content/Context;

    const-string v1, "storage"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lo/bbx;->c:Ljava/lang/Object;

    .line 155
    :cond_1
    iget-object v0, p0, Lo/bbx;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getOtgVolume"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lo/bbx;->c:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v4, v0

    .line 164
    goto :goto_0

    .line 157
    :catch_0
    move-exception v5

    .line 159
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getOtgVolume() RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    goto :goto_0

    .line 161
    :catch_1
    move-exception v5

    .line 163
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getOtgVolume() Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 167
    const/4 v3, 0x1

    .line 169
    :cond_2
    return v3
.end method

.method private h()Ljava/lang/Object;
    .locals 4

    .line 309
    const/4 v2, 0x0

    .line 310
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 312
    invoke-direct {p0}, Lo/bbx;->e()V

    .line 316
    :cond_0
    const/4 v3, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    array-length v0, v0

    if-ge v3, v0, :cond_2

    .line 318
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    aget-object v0, v0, v3

    invoke-direct {p0, v0}, Lo/bbx;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    aget-object v0, v0, v3

    invoke-direct {p0, v0}, Lo/bbx;->e(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 320
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    aget-object v0, v0, v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v2, v0

    .line 321
    goto :goto_1

    .line 316
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 332
    :cond_2
    :goto_1
    goto :goto_2

    .line 325
    :catch_0
    move-exception v3

    .line 327
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getSdCardVolume() RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    goto :goto_2

    .line 329
    :catch_1
    move-exception v3

    .line 331
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getSdCardVolume() Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    :goto_2
    return-object v2
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 4

    .line 179
    const/4 v2, 0x0

    .line 180
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 182
    return-object v2

    .line 187
    :cond_0
    const/4 v3, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    array-length v0, v0

    if-ge v3, v0, :cond_2

    .line 189
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    aget-object v0, v0, v3

    invoke-direct {p0, v0}, Lo/bbx;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 191
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    aget-object v0, v0, v3

    invoke-direct {p0, v0}, Lo/bbx;->d(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v2, v0

    .line 192
    goto :goto_1

    .line 187
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 203
    :cond_2
    :goto_1
    goto :goto_2

    .line 196
    :catch_0
    move-exception v3

    .line 198
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getInternelStorageDirectory() RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    goto :goto_2

    .line 200
    :catch_1
    move-exception v3

    .line 202
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getInternelStorageDirectory() Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    :goto_2
    return-object v2
.end method

.method public c()Ljava/lang/String;
    .locals 4

    .line 214
    const/4 v2, 0x0

    .line 215
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 217
    return-object v2

    .line 222
    :cond_0
    const/4 v3, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    array-length v0, v0

    if-ge v3, v0, :cond_2

    .line 224
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    aget-object v0, v0, v3

    invoke-direct {p0, v0}, Lo/bbx;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    aget-object v0, v0, v3

    invoke-direct {p0, v0}, Lo/bbx;->e(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 226
    iget-object v0, p0, Lo/bbx;->e:[Ljava/lang/Object;

    aget-object v0, v0, v3

    invoke-direct {p0, v0}, Lo/bbx;->d(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v2, v0

    .line 227
    goto :goto_1

    .line 222
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 238
    :cond_2
    :goto_1
    goto :goto_2

    .line 231
    :catch_0
    move-exception v3

    .line 233
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getSDcardStorageDirectory() RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    goto :goto_2

    .line 235
    :catch_1
    move-exception v3

    .line 237
    const-string v0, "SystemStorage"

    const-string v1, "Storage_Standard.getSDcardStorageDirectory() Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    :goto_2
    return-object v2
.end method

.method public d()Z
    .locals 2

    .line 249
    invoke-direct {p0}, Lo/bbx;->a()Ljava/lang/String;

    move-result-object v1

    .line 251
    if-eqz v1, :cond_0

    .line 253
    const-string v0, "mounted"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    const/4 v0, 0x1

    return v0

    .line 258
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
