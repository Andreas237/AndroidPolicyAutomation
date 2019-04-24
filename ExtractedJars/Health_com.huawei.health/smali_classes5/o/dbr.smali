.class public Lo/dbr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dbr$b;,
        Lo/dbr$e;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Landroid/content/Context;[Ljava/lang/String;)Lo/dbr$e;
    .locals 10

    .line 121
    const-string v0, "PermissionUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkPermissions::enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    array-length v0, p1

    if-gtz v0, :cond_0

    .line 123
    const-string v0, "PermissionUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkPermissions::permissions empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    sget-object v0, Lo/dbr$e;->d:Lo/dbr$e;

    return-object v0

    .line 129
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    .line 130
    sget-object v0, Lo/dbr$e;->a:Lo/dbr$e;

    return-object v0

    .line 134
    :cond_1
    invoke-static {p0, p1}, Lo/dbr;->e(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 135
    sget-object v0, Lo/dbr$e;->a:Lo/dbr$e;

    return-object v0

    .line 139
    :cond_2
    move-object v4, p1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    aget-object v7, v4, v6

    .line 141
    invoke-static {p0, v7}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v8

    .line 147
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0, v7}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v9

    .line 150
    if-nez v8, :cond_3

    if-nez v9, :cond_3

    .line 151
    sget-object v0, Lo/dbr$e;->c:Lo/dbr$e;

    return-object v0

    .line 139
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 156
    :cond_4
    sget-object v0, Lo/dbr$e;->d:Lo/dbr$e;

    return-object v0
.end method

.method public static c(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V
    .locals 4

    .line 214
    const-string v0, "PermissionUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter requestPermission(): activity = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",permissions"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 215
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",action = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 214
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lo/dbn;->b(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    .line 218
    invoke-static {p0, p1}, Lo/dbf;->d(Landroid/content/Context;[Ljava/lang/String;)V

    .line 219
    return-void
.end method

.method public static e(Landroid/content/Context;Lo/dbr$b;Lo/dbs;)V
    .locals 6

    .line 172
    const-string v0, "PermissionUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doActionWithPermissions::enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 174
    invoke-static {p1}, Lo/dbr;->e(Lo/dbr$b;)[Ljava/lang/String;

    move-result-object v4

    .line 175
    invoke-static {p0, v4}, Lo/dbr;->b(Landroid/content/Context;[Ljava/lang/String;)Lo/dbr$e;

    move-result-object v5

    .line 176
    sget-object v0, Lo/dbr$5;->e:[I

    invoke-virtual {v5}, Lo/dbr$e;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 178
    :pswitch_0
    invoke-virtual {p2}, Lo/dbs;->onGranted()V

    .line 179
    goto :goto_0

    .line 181
    :pswitch_1
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0, v4, p2}, Lo/dbr;->c(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    .line 182
    goto :goto_0

    .line 184
    :pswitch_2
    invoke-virtual {p2, p1}, Lo/dbs;->onForeverDenied(Lo/dbr$b;)V

    .line 187
    :goto_0
    goto :goto_1

    .line 188
    :cond_0
    const-string v0, "PermissionUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doActionWithPermissions only take Activity as context"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static e(Landroid/content/Context;[Ljava/lang/String;)Z
    .locals 8

    .line 198
    move-object v4, p1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 199
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p0, v7}, Lo/dbn;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 200
    const-string v0, "PermissionUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "permissions are not granted: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    const/4 v0, 0x0

    return v0

    .line 198
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 204
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private static e(Lo/dbr$b;)[Ljava/lang/String;
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 78
    const/4 v0, 0x0

    new-array v4, v0, [Ljava/lang/String;

    .line 79
    sget-object v0, Lo/dbr$5;->a:[I

    invoke-virtual {p0}, Lo/dbr$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 82
    :pswitch_0
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 86
    goto :goto_1

    .line 89
    :pswitch_1
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 93
    goto :goto_1

    .line 96
    :pswitch_2
    const/4 v0, 0x4

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x3

    aput-object v0, v4, v1

    .line 102
    goto :goto_1

    .line 104
    :goto_0
    const-string v0, "PermissionUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "permissionType unknow:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    :goto_1
    return-object v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
