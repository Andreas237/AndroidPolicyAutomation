.class final Lo/fir$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fir;->b(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hihealth/HiDataInsertOption;

.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;ILcom/huawei/hihealth/HiDataInsertOption;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lo/fir$1;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput p2, p0, Lo/fir$1;->d:I

    iput-object p3, p0, Lo/fir$1;->a:Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 5

    .line 177
    const-string v0, "Login_BPAndBSMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "insertHiHealthData errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    iget-object v0, p0, Lo/fir$1;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 179
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 180
    iget v0, p0, Lo/fir$1;->d:I

    add-int/lit8 v4, v0, -0x1

    .line 181
    const-string v0, "Login_BPAndBSMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "count = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    iget-object v0, p0, Lo/fir$1;->a:Lcom/huawei/hihealth/HiDataInsertOption;

    iget-object v1, p0, Lo/fir$1;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, v4}, Lo/fir;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V

    .line 184
    :cond_0
    return-void
.end method
