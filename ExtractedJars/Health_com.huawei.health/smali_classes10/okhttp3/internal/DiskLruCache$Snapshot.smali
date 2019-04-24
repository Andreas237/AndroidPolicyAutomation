.class public final Lokhttp3/internal/DiskLruCache$Snapshot;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/DiskLruCache;
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

.field final synthetic this$0:Lokhttp3/internal/DiskLruCache;


# direct methods
.method private constructor <init>(Lokhttp3/internal/DiskLruCache;Ljava/lang/String;J[Lokio/Source;[J)V
    .locals 0

    .line 778
    iput-object p1, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 779
    iput-object p2, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->key:Ljava/lang/String;

    .line 780
    iput-wide p3, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->sequenceNumber:J

    .line 781
    iput-object p5, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->sources:[Lokio/Source;

    .line 782
    iput-object p6, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->lengths:[J

    .line 783
    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/internal/DiskLruCache;Ljava/lang/String;J[Lokio/Source;[JLokhttp3/internal/DiskLruCache$1;)V
    .locals 0

    .line 772
    invoke-direct/range {p0 .. p6}, Lokhttp3/internal/DiskLruCache$Snapshot;-><init>(Lokhttp3/internal/DiskLruCache;Ljava/lang/String;J[Lokio/Source;[J)V

    return-void
.end method

.method static synthetic access$2200(Lokhttp3/internal/DiskLruCache$Snapshot;)Ljava/lang/String;
    .locals 1

    .line 772
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->key:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 5

    .line 808
    iget-object v1, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->sources:[Lokio/Source;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 809
    invoke-static {v4}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 808
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 811
    :cond_0
    return-void
.end method

.method public edit()Lokhttp3/internal/DiskLruCache$Editor;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 794
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->this$0:Lokhttp3/internal/DiskLruCache;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->key:Ljava/lang/String;

    iget-wide v2, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->sequenceNumber:J

    invoke-static {v0, v1, v2, v3}, Lokhttp3/internal/DiskLruCache;->access$2300(Lokhttp3/internal/DiskLruCache;Ljava/lang/String;J)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    return-object v0
.end method

.method public getLength(I)J
    .locals 2

    .line 804
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->lengths:[J

    aget-wide v0, v0, p1

    return-wide v0
.end method

.method public getSource(I)Lokio/Source;
    .locals 1

    .line 799
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->sources:[Lokio/Source;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public key()Ljava/lang/String;
    .locals 1

    .line 786
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Snapshot;->key:Ljava/lang/String;

    return-object v0
.end method
