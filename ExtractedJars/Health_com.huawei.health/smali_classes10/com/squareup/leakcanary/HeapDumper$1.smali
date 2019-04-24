.class final Lcom/squareup/leakcanary/HeapDumper$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/leakcanary/HeapDumper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/leakcanary/HeapDumper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dumpHeap()Ljava/io/File;
    .locals 1

    .line 24
    sget-object v0, Lcom/squareup/leakcanary/HeapDumper$1;->RETRY_LATER:Ljava/io/File;

    return-object v0
.end method
