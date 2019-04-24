.class Lo/dly$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dly;->b(D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dly;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/dly;I)V
    .locals 0

    .line 101
    iput-object p1, p0, Lo/dly$2;->b:Lo/dly;

    iput p2, p0, Lo/dly$2;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 104
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 105
    iget-object v0, p0, Lo/dly$2;->b:Lo/dly;

    iget-object v0, v0, Lo/dly;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dly$2$5;

    invoke-direct {v1, p0}, Lo/dly$2$5;-><init>(Lo/dly$2;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 133
    :cond_0
    return-void
.end method
