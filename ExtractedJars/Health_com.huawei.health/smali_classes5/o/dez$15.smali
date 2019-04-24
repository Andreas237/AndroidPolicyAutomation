.class Lo/dez$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dez;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic e:Lo/dez;


# direct methods
.method constructor <init>(Lo/dez;I)V
    .locals 0

    .line 2550
    iput-object p1, p0, Lo/dez$15;->e:Lo/dez;

    iput p2, p0, Lo/dez$15;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 2553
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 2554
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeContinueMeasureHeartRateStatus success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2556
    iget v0, p0, Lo/dez$15;->c:I

    invoke-static {v0}, Lo/dfj;->g(I)V

    .line 2558
    :cond_0
    return-void
.end method
