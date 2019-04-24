.class public final Lcom/tencent/open/a/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public static a(Ljava/io/File;)Z
    .locals 6

    .line 109
    if-eqz p0, :cond_6

    .line 111
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 113
    invoke-virtual {p0}, Ljava/io/File;->deleteOnExit()V

    .line 115
    const/4 v0, 0x0

    return v0

    .line 117
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 121
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 122
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 123
    if-eqz v1, :cond_2

    array-length v0, v1

    if-nez v0, :cond_3

    .line 124
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 127
    :cond_3
    move-object v2, v1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_4

    aget-object v5, v2, v4

    .line 128
    invoke-static {v5}, Lcom/tencent/open/a/d$b;->a(Ljava/io/File;)Z

    .line 127
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 131
    :cond_4
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    return v0

    .line 135
    :cond_5
    const/4 v0, 0x0

    return v0

    .line 138
    :cond_6
    const/4 v0, 0x0

    return v0
.end method
