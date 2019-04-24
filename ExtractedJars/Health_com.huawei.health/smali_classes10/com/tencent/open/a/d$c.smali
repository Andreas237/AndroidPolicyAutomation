.class public final Lcom/tencent/open/a/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public static a()Z
    .locals 2

    .line 167
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    .line 169
    const-string v0, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mounted_ro"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b()Lcom/tencent/open/a/d$d;
    .locals 1

    .line 178
    invoke-static {}, Lcom/tencent/open/a/d$c;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 179
    const/4 v0, 0x0

    return-object v0

    .line 182
    :cond_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/a/d$d;->b(Ljava/io/File;)Lcom/tencent/open/a/d$d;

    move-result-object v0

    return-object v0
.end method
