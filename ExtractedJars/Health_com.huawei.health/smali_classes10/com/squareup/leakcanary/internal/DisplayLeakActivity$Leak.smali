.class Lcom/squareup/leakcanary/internal/DisplayLeakActivity$Leak;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/leakcanary/internal/DisplayLeakActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Leak"
.end annotation


# instance fields
.field final heapDump:Lcom/squareup/leakcanary/HeapDump;

.field final result:Lcom/squareup/leakcanary/AnalysisResult;

.field final resultFile:Ljava/io/File;


# direct methods
.method constructor <init>(Lcom/squareup/leakcanary/HeapDump;Lcom/squareup/leakcanary/AnalysisResult;Ljava/io/File;)V
    .locals 0

    .line 417
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 418
    iput-object p1, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$Leak;->heapDump:Lcom/squareup/leakcanary/HeapDump;

    .line 419
    iput-object p2, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$Leak;->result:Lcom/squareup/leakcanary/AnalysisResult;

    .line 420
    iput-object p3, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$Leak;->resultFile:Ljava/io/File;

    .line 421
    return-void
.end method
