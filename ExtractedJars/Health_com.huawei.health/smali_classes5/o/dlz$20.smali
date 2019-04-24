.class Lo/dlz$20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->b(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dlz;

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/dlz;Lo/egg;)V
    .locals 0

    .line 378
    iput-object p1, p0, Lo/dlz$20;->a:Lo/dlz;

    iput-object p2, p0, Lo/dlz$20;->e:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 381
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWeightDeviceDialog judgeSuggestWeightDevice err_code ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    if-nez p1, :cond_0

    .line 383
    const-string v0, "\u4f53\u8102\u79f0"

    new-instance v1, Lo/dlz$20$4;

    invoke-direct {v1, p0}, Lo/dlz$20$4;-><init>(Lo/dlz$20;)V

    invoke-static {v0, v1}, Lo/dmn;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 403
    :cond_0
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWeightDeviceDialog err_code == none"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    iget-object v0, p0, Lo/dlz$20;->e:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 406
    :goto_0
    return-void
.end method
