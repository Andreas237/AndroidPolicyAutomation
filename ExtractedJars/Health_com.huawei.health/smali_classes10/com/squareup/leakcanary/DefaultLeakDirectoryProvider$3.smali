.class Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider;->cleanupOldHeapDumps()V
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

    .line 189
    iput-object p1, p0, Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider$3;->this$0:Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .line 191
    const-string v0, ".hprof"

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
