.class Lcom/tencent/open/a/b$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FileFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/open/a/b;


# direct methods
.method constructor <init>(Lcom/tencent/open/a/b;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/tencent/open/a/b$2;->a:Lcom/tencent/open/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;)Z
    .locals 5

    .line 136
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    .line 139
    iget-object v0, p0, Lcom/tencent/open/a/b$2;->a:Lcom/tencent/open/a/b;

    invoke-virtual {v0}, Lcom/tencent/open/a/b;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    .line 141
    if-nez v3, :cond_0

    .line 143
    const/4 v0, 0x0

    return v0

    .line 147
    :cond_0
    invoke-static {p1}, Lcom/tencent/open/a/b;->d(Ljava/io/File;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 149
    :goto_0
    return v4
.end method
