.class Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider;->clearLeakDirectory()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider;


# direct methods
.method constructor <init>(Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider$2;->this$0:Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .line 135
    const-string v0, "_pending.hprof"

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
