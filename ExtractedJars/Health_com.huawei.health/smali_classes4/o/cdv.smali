.class public Lo/cdv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static c(Landroid/content/Context;[Ljava/lang/String;)Z
    .locals 12

    .line 68
    const/4 v4, 0x1

    .line 70
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v5

    .line 73
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v6

    .line 76
    const-string v0, "Track_PermissionUtils"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHasLocationPermission "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " isHasStoragePermission "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 77
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 76
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_b

    .line 81
    move-object v7, p0

    check-cast v7, Landroid/app/Activity;

    .line 84
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_b

    .line 86
    const/4 v8, 0x1

    .line 88
    if-nez v6, :cond_2

    .line 89
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 90
    invoke-virtual {v7, v0}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    .line 93
    :cond_2
    :goto_0
    const/4 v9, 0x1

    .line 95
    if-nez v5, :cond_5

    .line 96
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 97
    invoke-virtual {v7, v0}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v9, 0x1

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    .line 102
    :cond_5
    :goto_1
    const/4 v10, 0x0

    .line 103
    const/4 v11, 0x0

    :goto_2
    array-length v0, p1

    if-ge v11, v0, :cond_7

    .line 104
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    aget-object v1, p1, v11

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 105
    const/4 v10, 0x1

    .line 106
    goto :goto_3

    .line 103
    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 110
    :cond_7
    :goto_3
    const-string v0, "Track_PermissionUtils"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "storagePermission "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " accessCoarseLocation "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 111
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " needCoarseLocation "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 112
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 110
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    if-eqz v10, :cond_a

    .line 117
    if-nez v8, :cond_8

    if-nez v9, :cond_8

    .line 119
    const/4 v4, 0x0

    .line 120
    const/4 v0, 0x0

    invoke-static {v7, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    goto :goto_4

    .line 121
    :cond_8
    if-nez v9, :cond_9

    .line 122
    const/4 v0, 0x1

    invoke-static {v7, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 123
    const/4 v4, 0x0

    goto :goto_4

    .line 124
    :cond_9
    if-nez v8, :cond_b

    .line 125
    invoke-static {v7}, Lo/ene;->q(Landroid/content/Context;)V

    .line 126
    const/4 v4, 0x0

    goto :goto_4

    .line 131
    :cond_a
    if-nez v8, :cond_b

    .line 132
    invoke-static {v7}, Lo/ene;->q(Landroid/content/Context;)V

    .line 133
    const/4 v4, 0x0

    .line 141
    :cond_b
    :goto_4
    return v4
.end method

.method public static d(Landroid/content/Context;[Ljava/lang/String;)I
    .locals 4

    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 32
    const-string v0, "Track_PermissionUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkPermission low version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    const/4 v0, 0x0

    return v0

    .line 37
    :cond_0
    if-eqz p0, :cond_1

    if-nez p1, :cond_2

    .line 38
    :cond_1
    const-string v0, "Track_PermissionUtils"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkPermission param not valied"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    const-string v2, " permission "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    const/4 v0, 0x1

    return v0

    .line 44
    :cond_2
    invoke-static {p0, p1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 45
    const-string v0, "Track_PermissionUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkPermission has permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    const/4 v0, 0x0

    return v0

    .line 50
    :cond_3
    invoke-static {p0, p1}, Lo/cdv;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 51
    const/16 v0, 0x8

    return v0

    .line 54
    :cond_4
    const/4 v0, 0x0

    return v0
.end method
