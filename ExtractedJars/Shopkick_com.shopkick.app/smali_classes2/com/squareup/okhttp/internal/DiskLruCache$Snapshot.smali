.class public final Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
.super Ljava/lang/Object;
.source "DiskLruCache.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/DiskLruCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Snapshot"
.end annotation


# instance fields
.field private final key:Ljava/lang/String;

.field private final lengths:[J

.field private final sequenceNumber:J

.field private final sources:[Lokio/Source;

.field final synthetic this$0:Lcom/squareup/okhttp/internal/DiskLruCache;


# direct methods
.method private constructor <init>(Lcom/squareup/okhttp/internal/DiskLruCache;Ljava/lang/String;J[Lokio/Source;[J)V
    .locals 0

    .line 701
    iput-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 702
    iput-object p2, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->key:Ljava/lang/String;

    .line 703
    iput-wide p3, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->sequenceNumber:J

    .line 704
    iput-object p5, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->sources:[Lokio/Source;

    .line 705
    iput-object p6, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->lengths:[J

    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/okhttp/internal/DiskLruCache;Ljava/lang/String;J[Lokio/Source;[JLcom/squareup/okhttp/internal/DiskLruCache$1;)V
    .locals 0

    .line 695
    invoke-direct/range {p0 .. p6}, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;-><init>(Lcom/squareup/okhttp/internal/DiskLruCache;Ljava/lang/String;J[Lokio/Source;[J)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 4

    .line 733
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->sources:[Lokio/Source;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 734
    invoke-static {v3}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public edit()Lcom/squareup/okhttp/internal/DiskLruCache$Editor;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 714
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->key:Ljava/lang/String;

    iget-wide v2, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->sequenceNumber:J

    invoke-static {v0, v1, v2, v3}, Lcom/squareup/okhttp/internal/DiskLruCache;->access$1900(Lcom/squareup/okhttp/internal/DiskLruCache;Ljava/lang/String;J)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object v0

    return-object v0
.end method

.method public getLength(I)J
    .locals 3

    .line 729
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->lengths:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public getSource(I)Lokio/Source;
    .locals 1

    .line 719
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->sources:[Lokio/Source;

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

    .line 724
    invoke-virtual {p0, p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->getSource(I)Lokio/Source;

    move-result-object p1

    invoke-static {p1}, Lcom/squareup/okhttp/internal/DiskLruCache;->access$2000(Lokio/Source;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
