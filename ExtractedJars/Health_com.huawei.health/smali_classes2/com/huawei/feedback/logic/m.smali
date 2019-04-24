.class Lcom/huawei/feedback/logic/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/logic/j;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/logic/j;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/huawei/feedback/logic/m;->a:Lcom/huawei/feedback/logic/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 116
    const-string v0, "FeedbackSubmitTask"

    const-string v1, "A maximum of 500 feedback records can be saved. Please delete some records first."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    return-void
.end method
