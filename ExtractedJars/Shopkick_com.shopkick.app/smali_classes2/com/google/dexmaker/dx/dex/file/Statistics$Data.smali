.class Lcom/google/dexmaker/dx/dex/file/Statistics$Data;
.super Ljava/lang/Object;
.source "Statistics.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/dex/file/Statistics;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Data"
.end annotation


# instance fields
.field private count:I

.field private largestSize:I

.field private final name:Ljava/lang/String;

.field private smallestSize:I

.field private totalSize:I


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/file/Item;Ljava/lang/String;)V
    .locals 0

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/Item;->writeSize()I

    move-result p1

    .line 136
    iput-object p2, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->name:Ljava/lang/String;

    const/4 p2, 0x1

    .line 137
    iput p2, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->count:I

    .line 138
    iput p1, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->totalSize:I

    .line 139
    iput p1, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->largestSize:I

    .line 140
    iput p1, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->smallestSize:I

    return-void
.end method

.method static synthetic access$000(Lcom/google/dexmaker/dx/dex/file/Statistics$Data;)Ljava/lang/String;
    .locals 0

    .line 111
    iget-object p0, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->name:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public add(Lcom/google/dexmaker/dx/dex/file/Item;)V
    .locals 1

    .line 149
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/Item;->writeSize()I

    move-result p1

    .line 151
    iget v0, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->count:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->count:I

    .line 152
    iget v0, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->totalSize:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->totalSize:I

    .line 154
    iget v0, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->largestSize:I

    if-le p1, v0, :cond_0

    .line 155
    iput p1, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->largestSize:I

    .line 158
    :cond_0
    iget v0, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->smallestSize:I

    if-ge p1, v0, :cond_1

    .line 159
    iput p1, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->smallestSize:I

    :cond_1
    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 4

    .line 178
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->count:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " item"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->count:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const-string v2, ""

    goto :goto_0

    :cond_0
    const-string v2, "s"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "; "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->totalSize:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " bytes total\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    iget v1, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->smallestSize:I

    iget v2, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->largestSize:I

    if-ne v1, v2, :cond_1

    .line 185
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "    "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->smallestSize:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " bytes/item\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 187
    :cond_1
    iget v1, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->totalSize:I

    iget v2, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->count:I

    div-int/2addr v1, v2

    .line 188
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->smallestSize:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ".."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->largestSize:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " bytes/item; average "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeAnnotation(Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 1

    .line 169
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/Statistics$Data;->toHuman()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(Ljava/lang/String;)V

    return-void
.end method
