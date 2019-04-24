.class public Lcom/google/dexmaker/dx/util/ByteArray$MyDataInputStream;
.super Ljava/io/DataInputStream;
.source "ByteArray.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/util/ByteArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MyDataInputStream"
.end annotation


# instance fields
.field private final wrapped:Lcom/google/dexmaker/dx/util/ByteArray$MyInputStream;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/util/ByteArray$MyInputStream;)V
    .locals 0

    .line 356
    invoke-direct {p0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 358
    iput-object p1, p0, Lcom/google/dexmaker/dx/util/ByteArray$MyDataInputStream;->wrapped:Lcom/google/dexmaker/dx/util/ByteArray$MyInputStream;

    return-void
.end method
