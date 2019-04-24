.class Lo/dmk$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dmk$2;->onCallBackSuccess(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dmk$2;


# direct methods
.method constructor <init>(Lo/dmk$2;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lo/dmk$2$3;->a:Lo/dmk$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 116
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFinished:resCode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " contentType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dmk$2$3;->a:Lo/dmk$2;

    iget v3, v3, Lo/dmk$2;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-object v0, p0, Lo/dmk$2$3;->a:Lo/dmk$2;

    iget-object v0, v0, Lo/dmk$2;->a:Lo/dmk;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lo/dmk$2$3;->a:Lo/dmk$2;

    iget v2, v2, Lo/dmk$2;->e:I

    iget-object v3, p0, Lo/dmk$2$3;->a:Lo/dmk$2;

    iget-object v3, v3, Lo/dmk$2;->c:Lo/dmd;

    invoke-static {v0, p1, v1, v2, v3}, Lo/dmk;->c(Lo/dmk;ILjava/lang/String;ILo/dmd;)V

    .line 119
    return-void
.end method
