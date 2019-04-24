.class Lo/dlz$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dlz;


# direct methods
.method constructor <init>(Lo/dlz;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lo/dlz$4;->c:Lo/dlz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 486
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteSuggestVideo err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    if-nez p1, :cond_0

    .line 488
    iget-object v0, p0, Lo/dlz$4;->c:Lo/dlz;

    new-instance v1, Lo/dlz$4$5;

    invoke-direct {v1, p0}, Lo/dlz$4$5;-><init>(Lo/dlz$4;)V

    invoke-static {v0, v1}, Lo/dlz;->a(Lo/dlz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 496
    :cond_0
    const v0, 0x186a1

    if-ne p1, v0, :cond_1

    .line 497
    iget-object v0, p0, Lo/dlz$4;->c:Lo/dlz;

    iget-object v0, v0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x4e26

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 499
    :cond_1
    :goto_0
    return-void
.end method
