.class Lcom/huawei/hms/support/api/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/support/api/transport/DatagramTransport$a;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/support/api/c;


# direct methods
.method constructor <init>(Lcom/huawei/hms/support/api/c;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/huawei/hms/support/api/d;->a:Lcom/huawei/hms/support/api/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/huawei/hms/support/api/d;->a:Lcom/huawei/hms/support/api/c;

    invoke-static {v0, p1, p2}, Lcom/huawei/hms/support/api/c;->a(Lcom/huawei/hms/support/api/c;ILcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/hms/support/api/d;->a:Lcom/huawei/hms/support/api/c;

    invoke-static {v0}, Lcom/huawei/hms/support/api/c;->a(Lcom/huawei/hms/support/api/c;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 172
    return-void
.end method
