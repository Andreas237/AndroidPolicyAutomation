.class final Lo/fdm$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdm;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lcom/huawei/hihealth/HiDataInsertOption;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;ILcom/huawei/hihealth/HiDataInsertOption;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lo/fdm$5;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput p2, p0, Lo/fdm$5;->e:I

    iput-object p3, p0, Lo/fdm$5;->d:Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 5

    .line 90
    invoke-static {}, Lo/fdm;->a()Ljava/lang/String;

    move-result-object v0

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

    .line 91
    iget-object v0, p0, Lo/fdm$5;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 92
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 93
    iget v0, p0, Lo/fdm$5;->e:I

    add-int/lit8 v4, v0, -0x1

    .line 94
    invoke-static {}, Lo/fdm;->a()Ljava/lang/String;

    move-result-object v0

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

    .line 95
    iget-object v0, p0, Lo/fdm$5;->d:Lcom/huawei/hihealth/HiDataInsertOption;

    iget-object v1, p0, Lo/fdm$5;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, v4}, Lo/fdm;->e(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V

    .line 97
    :cond_0
    return-void
.end method
