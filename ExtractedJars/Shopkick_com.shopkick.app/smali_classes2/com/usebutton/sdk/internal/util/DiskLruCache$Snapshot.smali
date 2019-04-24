.class public final Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;
.super Ljava/lang/Object;
.source "DiskLruCache.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/util/DiskLruCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Snapshot"
.end annotation


# instance fields
.field private final ins:[Ljava/io/InputStream;

.field private final key:Ljava/lang/String;

.field private final sequenceNumber:J

.field final synthetic this$0:Lcom/usebutton/sdk/internal/util/DiskLruCache;


# direct methods
.method private constructor <init>(Lcom/usebutton/sdk/internal/util/DiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;)V
    .locals 0

    .line 722
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->this$0:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 723
    iput-object p2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->key:Ljava/lang/String;

    .line 724
    iput-wide p3, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->sequenceNumber:J

    .line 725
    iput-object p5, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->ins:[Ljava/io/InputStream;

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/internal/util/DiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;Lcom/usebutton/sdk/internal/util/DiskLruCache$1;)V
    .locals 0

    .line 717
    invoke-direct/range {p0 .. p5}, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;-><init>(Lcom/usebutton/sdk/internal/util/DiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 4

    .line 753
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->ins:[Ljava/io/InputStream;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 754
    invoke-static {v3}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->closeQuietly(Ljava/io/Closeable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public edit()Lcom/usebutton/sdk/internal/util/Editor;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 734
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->this$0:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->key:Ljava/lang/String;

    iget-wide v2, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->sequenceNumber:J

    invoke-static {v0, v1, v2, v3}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->access$600(Lcom/usebutton/sdk/internal/util/DiskLruCache;Ljava/lang/String;J)Lcom/usebutton/sdk/internal/util/Editor;

    move-result-object v0

    return-object v0
.end method

.method public getInputStream(I)Ljava/io/InputStream;
    .locals 1

    .line 741
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->ins:[Ljava/io/InputStream;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getString(I)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 748
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/util/DiskLruCache$Snapshot;->getInputStream(I)Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->inputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
