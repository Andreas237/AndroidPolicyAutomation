.class Lnet/toddm/comm/tests/TestWork$3;
.super Ljava/lang/Object;
.source "TestWork.java"

# interfaces
.implements Lnet/toddm/comm/DependentWorkListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/toddm/comm/tests/TestWork;->testDependentWorkCallbackCancelsCurrentWork()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/toddm/comm/tests/TestWork;

.field private final synthetic val$work1:Lnet/toddm/comm/SubmittableWork;

.field private final synthetic val$work2:Lnet/toddm/comm/SubmittableWork;


# direct methods
.method constructor <init>(Lnet/toddm/comm/tests/TestWork;Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/SubmittableWork;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/toddm/comm/tests/TestWork$3;->this$0:Lnet/toddm/comm/tests/TestWork;

    iput-object p2, p0, Lnet/toddm/comm/tests/TestWork$3;->val$work1:Lnet/toddm/comm/SubmittableWork;

    iput-object p3, p0, Lnet/toddm/comm/tests/TestWork$3;->val$work2:Lnet/toddm/comm/SubmittableWork;

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDependentWorkCompleted(Lnet/toddm/comm/Work;Lnet/toddm/comm/Work;)Z
    .locals 1

    .line 129
    iget-object v0, p0, Lnet/toddm/comm/tests/TestWork$3;->val$work1:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v0}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v0

    invoke-interface {p2}, Lnet/toddm/comm/Work;->getId()I

    move-result p2

    invoke-static {v0, p2}, Lnet/toddm/comm/tests/TestWork;->assertEquals(II)V

    .line 130
    iget-object p2, p0, Lnet/toddm/comm/tests/TestWork$3;->val$work2:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {p2}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result p2

    invoke-interface {p1}, Lnet/toddm/comm/Work;->getId()I

    move-result p1

    invoke-static {p2, p1}, Lnet/toddm/comm/tests/TestWork;->assertEquals(II)V

    const/4 p1, 0x0

    return p1
.end method
