.class Lnet/toddm/comm/tests/TestWork$2;
.super Ljava/lang/Object;
.source "TestWork.java"

# interfaces
.implements Lnet/toddm/comm/DependentWorkListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/toddm/comm/tests/TestWork;->testDependentWorkCallbackAllowsCurrentWork()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/toddm/comm/tests/TestWork;

.field private final synthetic val$work1:Lnet/toddm/comm/SubmittableWork;

.field private final synthetic val$work2:Lnet/toddm/comm/SubmittableWork;

.field private final synthetic val$work3:Lnet/toddm/comm/SubmittableWork;

.field private final synthetic val$work4:Lnet/toddm/comm/SubmittableWork;


# direct methods
.method constructor <init>(Lnet/toddm/comm/tests/TestWork;Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/SubmittableWork;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/toddm/comm/tests/TestWork$2;->this$0:Lnet/toddm/comm/tests/TestWork;

    iput-object p2, p0, Lnet/toddm/comm/tests/TestWork$2;->val$work1:Lnet/toddm/comm/SubmittableWork;

    iput-object p3, p0, Lnet/toddm/comm/tests/TestWork$2;->val$work2:Lnet/toddm/comm/SubmittableWork;

    iput-object p4, p0, Lnet/toddm/comm/tests/TestWork$2;->val$work3:Lnet/toddm/comm/SubmittableWork;

    iput-object p5, p0, Lnet/toddm/comm/tests/TestWork$2;->val$work4:Lnet/toddm/comm/SubmittableWork;

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDependentWorkCompleted(Lnet/toddm/comm/Work;Lnet/toddm/comm/Work;)Z
    .locals 3

    .line 86
    invoke-interface {p2}, Lnet/toddm/comm/Work;->getId()I

    move-result v0

    iget-object v1, p0, Lnet/toddm/comm/tests/TestWork$2;->val$work1:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v1}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Lnet/toddm/comm/Work;->getId()I

    move-result v0

    iget-object v1, p0, Lnet/toddm/comm/tests/TestWork$2;->val$work2:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v1}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 87
    :cond_0
    invoke-interface {p2}, Lnet/toddm/comm/Work;->getId()I

    move-result v0

    iget-object v1, p0, Lnet/toddm/comm/tests/TestWork$2;->val$work2:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v1}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, Lnet/toddm/comm/Work;->getId()I

    move-result v0

    iget-object v1, p0, Lnet/toddm/comm/tests/TestWork$2;->val$work3:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v1}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 88
    :cond_1
    invoke-interface {p2}, Lnet/toddm/comm/Work;->getId()I

    move-result p2

    iget-object v0, p0, Lnet/toddm/comm/tests/TestWork$2;->val$work3:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v0}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v0

    if-ne p2, v0, :cond_3

    invoke-interface {p1}, Lnet/toddm/comm/Work;->getId()I

    move-result p1

    iget-object p2, p0, Lnet/toddm/comm/tests/TestWork$2;->val$work4:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {p2}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result p2

    if-eq p1, p2, :cond_2

    goto :goto_0

    :cond_2
    move p1, v2

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 85
    :goto_1
    invoke-static {p1}, Lnet/toddm/comm/tests/TestWork;->assertTrue(Z)V

    return v2
.end method
