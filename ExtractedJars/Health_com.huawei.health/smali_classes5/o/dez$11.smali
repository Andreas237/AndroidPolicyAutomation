.class Lo/dez$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dez;->c(IIZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic d:I

.field final synthetic e:Lo/dez;


# direct methods
.method constructor <init>(Lo/dez;II)V
    .locals 0

    .line 2578
    iput-object p1, p0, Lo/dez$11;->e:Lo/dez;

    iput p2, p0, Lo/dez$11;->d:I

    iput p3, p0, Lo/dez$11;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 2581
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 2582
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "heartRateRaiseRemind success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2583
    iget v0, p0, Lo/dez$11;->d:I

    iget v1, p0, Lo/dez$11;->b:I

    invoke-static {v0, v1}, Lo/dfj;->e(II)V

    .line 2585
    :cond_0
    return-void
.end method
