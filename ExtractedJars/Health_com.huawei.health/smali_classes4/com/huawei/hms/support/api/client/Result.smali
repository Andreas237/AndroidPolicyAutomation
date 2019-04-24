.class public abstract Lcom/huawei/hms/support/api/client/Result;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/hms/support/api/client/Status;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    sget-object v0, Lcom/huawei/hms/support/api/client/Status;->FAILURE:Lcom/huawei/hms/support/api/client/Status;

    iput-object v0, p0, Lcom/huawei/hms/support/api/client/Result;->a:Lcom/huawei/hms/support/api/client/Status;

    return-void
.end method


# virtual methods
.method public getStatus()Lcom/huawei/hms/support/api/client/Status;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/hms/support/api/client/Result;->a:Lcom/huawei/hms/support/api/client/Status;

    return-object v0
.end method

.method public setStatus(Lcom/huawei/hms/support/api/client/Status;)V
    .locals 0

    .line 39
    if-nez p1, :cond_0

    .line 40
    return-void

    .line 43
    :cond_0
    iput-object p1, p0, Lcom/huawei/hms/support/api/client/Result;->a:Lcom/huawei/hms/support/api/client/Status;

    .line 44
    return-void
.end method
