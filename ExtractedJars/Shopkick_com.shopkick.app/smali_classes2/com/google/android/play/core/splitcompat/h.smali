.class final Lcom/google/android/play/core/splitcompat/h;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/play/core/splitcompat/j;


# instance fields
.field private final synthetic a:Ljava/util/Set;

.field private final synthetic b:Lcom/google/android/play/core/splitcompat/p;

.field private final synthetic c:Ljava/util/zip/ZipFile;


# direct methods
.method constructor <init>(Ljava/util/Set;Lcom/google/android/play/core/splitcompat/p;Ljava/util/zip/ZipFile;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitcompat/h;->a:Ljava/util/Set;

    iput-object p2, p0, Lcom/google/android/play/core/splitcompat/h;->b:Lcom/google/android/play/core/splitcompat/p;

    iput-object p3, p0, Lcom/google/android/play/core/splitcompat/h;->c:Ljava/util/zip/ZipFile;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/play/core/splitcompat/k;Ljava/io/File;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitcompat/h;->a:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    if-nez p3, :cond_0

    const-string p3, "SplitCompat"

    const-string v0, "NativeLibraryExtractor: split \'%s\' has native library \'%s\' that does not exist; extracting from \'%s!%s\' to \'%s\'"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/play/core/splitcompat/h;->b:Lcom/google/android/play/core/splitcompat/p;

    invoke-virtual {v3}, Lcom/google/android/play/core/splitcompat/p;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p1, Lcom/google/android/play/core/splitcompat/k;->a:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/play/core/splitcompat/h;->b:Lcom/google/android/play/core/splitcompat/p;

    invoke-virtual {v3}, Lcom/google/android/play/core/splitcompat/p;->b()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p1, Lcom/google/android/play/core/splitcompat/k;->b:Ljava/util/zip/ZipEntry;

    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p3, p0, Lcom/google/android/play/core/splitcompat/h;->c:Ljava/util/zip/ZipFile;

    iget-object p1, p1, Lcom/google/android/play/core/splitcompat/k;->b:Ljava/util/zip/ZipEntry;

    invoke-static {p3, p1, p2}, Lcom/google/android/play/core/splitcompat/d;->a(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;)V

    :cond_0
    return-void
.end method
