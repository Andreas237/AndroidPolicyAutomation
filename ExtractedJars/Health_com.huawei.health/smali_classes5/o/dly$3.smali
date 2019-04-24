.class Lo/dly$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dly;->b(DJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:D

.field final synthetic c:Lo/dly;

.field final synthetic d:Z


# direct methods
.method constructor <init>(Lo/dly;ZD)V
    .locals 0

    .line 198
    iput-object p1, p0, Lo/dly$3;->c:Lo/dly;

    iput-boolean p2, p0, Lo/dly$3;->d:Z

    iput-wide p3, p0, Lo/dly$3;->b:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 201
    move-object v0, p2

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    .line 202
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeUploadAcheiveWeight objData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-boolean v0, p0, Lo/dly$3;->d:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lo/dly$3;->b:D

    cmpg-double v0, v0, v4

    if-gtz v0, :cond_0

    .line 204
    iget-object v0, p0, Lo/dly$3;->c:Lo/dly;

    invoke-static {v0}, Lo/dly;->c(Lo/dly;)V

    .line 206
    :cond_0
    return-void
.end method
