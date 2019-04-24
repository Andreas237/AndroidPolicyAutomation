.class public final Lo/bnx;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z
    .locals 5

    .line 204
    const/4 v2, 0x0

    .line 205
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 206
    if-eqz v3, :cond_1

    .line 208
    const/high16 v0, 0x10000

    invoke-virtual {v3, p1, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v4

    .line 209
    if-eqz v4, :cond_0

    const-string v0, "com.huawei.android.internal.app"

    iget-object v1, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 211
    const/4 v2, 0x1

    .line 213
    :cond_0
    if-nez v2, :cond_1

    invoke-static {p0, p2}, Lo/bnx;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 217
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    const/4 v0, 0x1

    return v0

    .line 225
    :cond_1
    goto :goto_0

    .line 222
    :catch_0
    move-exception v2

    .line 224
    const-string v0, "AppUtils"

    const-string v1, "start presetActivity error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    :goto_0
    :try_start_1
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 231
    const/4 v0, 0x1

    return v0

    .line 233
    :catch_1
    move-exception v2

    .line 235
    const-string v0, "AppUtils"

    const-string v1, "start DefaultActivity error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 178
    const/4 v3, 0x0

    .line 179
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 182
    const/16 v0, 0x80

    :try_start_0
    invoke-virtual {v4, p1, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 183
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 188
    goto :goto_0

    .line 185
    :catch_0
    move-exception v5

    .line 187
    const-string v0, "AppUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not found APK Name,target packageName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    :goto_0
    return-object v3
.end method

.method public static b(Landroid/content/ContextWrapper;Ljava/lang/String;)Z
    .locals 2

    .line 74
    invoke-static {p1, p0}, Lo/bnx;->c(Ljava/lang/String;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 75
    if-nez v1, :cond_0

    .line 77
    const/4 v0, 0x0

    return v0

    .line 81
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static c(Ljava/lang/String;Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 5

    .line 133
    const/4 v3, 0x0

    .line 136
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 137
    const/16 v0, 0x40

    invoke-virtual {v4, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 142
    goto :goto_0

    .line 139
    :catch_0
    move-exception v4

    .line 141
    const-string v0, "AppUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPackageInfo NameNotFoundException not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :goto_0
    return-object v3
.end method

.method public static c(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 6

    .line 154
    const/4 v1, 0x0

    .line 155
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v2

    .line 156
    invoke-static {p0, v2}, Lo/bnx;->c(Ljava/lang/String;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 157
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 158
    if-eqz v3, :cond_0

    iget-object v0, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v0, :cond_0

    .line 160
    iget-object v0, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0, v4}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 161
    if-eqz v5, :cond_0

    .line 163
    invoke-static {v5}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 166
    :cond_0
    return-object v1
.end method

.method public static d(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;I)Z
    .locals 5

    .line 252
    const-string v0, "AppUtils"

    const-string v1, "startDefaultActivityForResult"

    :try_start_0
    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    const/4 v2, 0x0

    .line 254
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 255
    if-eqz v3, :cond_1

    .line 257
    const/high16 v0, 0x10000

    invoke-virtual {v3, p1, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v4

    .line 258
    if-eqz v4, :cond_0

    const-string v0, "com.huawei.android.internal.app"

    iget-object v1, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 260
    const/4 v2, 0x1

    .line 262
    :cond_0
    if-nez v2, :cond_1

    invoke-static {p0, p2}, Lo/bnx;->b(Landroid/content/ContextWrapper;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 265
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 266
    invoke-virtual {p0, p1, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 267
    const/4 v0, 0x1

    return v0

    .line 274
    :cond_1
    goto :goto_0

    .line 271
    :catch_0
    move-exception v2

    .line 273
    const-string v0, "AppUtils"

    const-string v1, "start presetActivity error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    :goto_0
    :try_start_1
    invoke-virtual {p0, p1, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 280
    const/4 v0, 0x1

    return v0

    .line 282
    :catch_1
    move-exception v2

    .line 284
    const-string v0, "AppUtils"

    const-string v1, "start DefaultActivity error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/content/ContextWrapper;Ljava/lang/String;)I
    .locals 5

    .line 108
    const/4 v3, -0x1

    .line 111
    :try_start_0
    invoke-static {p1, p0}, Lo/bnx;->c(Ljava/lang/String;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v4

    .line 112
    if-eqz v4, :cond_0

    .line 114
    iget v0, v4, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v3, v0

    .line 120
    :cond_0
    goto :goto_0

    .line 117
    :catch_0
    move-exception v4

    .line 119
    const-string v0, "AppUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getVersion error, package is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    :goto_0
    return v3
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    .line 94
    invoke-static {p1, p0}, Lo/bnx;->c(Ljava/lang/String;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 95
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
