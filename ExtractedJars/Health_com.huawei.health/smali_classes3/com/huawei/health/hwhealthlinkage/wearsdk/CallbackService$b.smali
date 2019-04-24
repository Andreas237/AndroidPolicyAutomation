.class Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 768
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 769
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->c:Ljava/lang/String;

    .line 770
    iput-object p2, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->a:Ljava/lang/String;

    .line 771
    iput-object p3, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 772
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 775
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 783
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 791
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method
