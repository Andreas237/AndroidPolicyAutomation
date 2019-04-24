.class Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;
.super Ljava/lang/Object;
.source "DebugInfoDecoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LocalEntry"
.end annotation


# instance fields
.field public address:I

.field public isStart:Z

.field public nameIndex:I

.field public reg:I

.field public signatureIndex:I

.field public typeIndex:I


# direct methods
.method public constructor <init>(IZIIII)V
    .locals 0

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    iput p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->address:I

    .line 168
    iput-boolean p2, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    .line 169
    iput p3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    .line 170
    iput p4, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    .line 171
    iput p5, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->typeIndex:I

    .line 172
    iput p6, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->signatureIndex:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "[%x %s v%d %04x %04x %04x]"

    const/4 v1, 0x6

    .line 176
    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->address:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    if-eqz v2, :cond_0

    const-string/jumbo v2, "start"

    goto :goto_0

    :cond_0
    const-string v2, "end"

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    iget v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->typeIndex:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget v3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->signatureIndex:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
