.class Lnet/toddm/comm/tests/TestWork$1;
.super Ljava/util/HashMap;
.source "TestWork.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/toddm/comm/tests/TestWork;->testGetException()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x7dc8b1ad8a09a4feL


# instance fields
.field final synthetic this$0:Lnet/toddm/comm/tests/TestWork;


# direct methods
.method constructor <init>(Lnet/toddm/comm/tests/TestWork;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lnet/toddm/comm/tests/TestWork$1;->this$0:Lnet/toddm/comm/tests/TestWork;

    .line 45
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string p1, "connect_timeout_milliseconds"

    const/4 v0, 0x1

    .line 48
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lnet/toddm/comm/tests/TestWork$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "read_timeout_milliseconds"

    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/toddm/comm/tests/TestWork$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
