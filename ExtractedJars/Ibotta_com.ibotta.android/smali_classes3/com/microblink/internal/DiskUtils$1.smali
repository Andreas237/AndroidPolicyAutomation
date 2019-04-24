.class final Lcom/microblink/internal/DiskUtils$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/io/File;Ljava/io/File;)I
    .locals 7

    invoke-static {p1}, Lcom/microblink/internal/DiskUtils;->access$000(Ljava/io/File;)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p2}, Lcom/microblink/internal/DiskUtils;->access$000(Ljava/io/File;)Ljava/lang/Long;

    move-result-object p2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, -0x1

    if-nez p2, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-gez v6, :cond_2

    return v1

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    cmp-long v3, v1, p1

    if-gez v3, :cond_3

    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    invoke-virtual {p0, p1, p2}, Lcom/microblink/internal/DiskUtils$1;->compare(Ljava/io/File;Ljava/io/File;)I

    move-result p1

    return p1
.end method
