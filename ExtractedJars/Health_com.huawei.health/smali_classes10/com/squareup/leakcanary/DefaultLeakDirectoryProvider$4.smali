.class Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider;->cleanupOldHeapDumps()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Ljava/io/File;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider;


# direct methods
.method constructor <init>(Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider$4;->this$0:Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/io/File;Ljava/io/File;)I
    .locals 3

    .line 200
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 198
    move-object v0, p1

    check-cast v0, Ljava/io/File;

    move-object v1, p2

    check-cast v1, Ljava/io/File;

    invoke-virtual {p0, v0, v1}, Lcom/squareup/leakcanary/DefaultLeakDirectoryProvider$4;->compare(Ljava/io/File;Ljava/io/File;)I

    move-result v0

    return v0
.end method
