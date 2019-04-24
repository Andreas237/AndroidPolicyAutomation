.class final Lcom/squareup/leakcanary/LeakNode;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final exclusion:Lcom/squareup/leakcanary/Exclusion;

.field final instance:Lcom/squareup/haha/perflib/Instance;

.field final parent:Lcom/squareup/leakcanary/LeakNode;

.field final referenceName:Ljava/lang/String;

.field final referenceType:Lcom/squareup/leakcanary/LeakTraceElement$Type;


# direct methods
.method constructor <init>(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/haha/perflib/Instance;Lcom/squareup/leakcanary/LeakNode;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/squareup/leakcanary/LeakNode;->exclusion:Lcom/squareup/leakcanary/Exclusion;

    .line 31
    iput-object p2, p0, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    .line 32
    iput-object p3, p0, Lcom/squareup/leakcanary/LeakNode;->parent:Lcom/squareup/leakcanary/LeakNode;

    .line 33
    iput-object p4, p0, Lcom/squareup/leakcanary/LeakNode;->referenceName:Ljava/lang/String;

    .line 34
    iput-object p5, p0, Lcom/squareup/leakcanary/LeakNode;->referenceType:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    .line 35
    return-void
.end method
