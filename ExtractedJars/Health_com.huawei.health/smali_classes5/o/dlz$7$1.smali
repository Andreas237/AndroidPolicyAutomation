.class Lo/dlz$7$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz$7;->c(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:[D

.field final synthetic e:Lo/dlz$7;


# direct methods
.method constructor <init>(Lo/dlz$7;[D)V
    .locals 0

    .line 652
    iput-object p1, p0, Lo/dlz$7$1;->e:Lo/dlz$7;

    iput-object p2, p0, Lo/dlz$7$1;->c:[D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 656
    move-object v0, p2

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 658
    iget-object v0, p0, Lo/dlz$7$1;->e:Lo/dlz$7;

    iget-object v0, v0, Lo/dlz$7;->c:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->d(Lo/dlz;)Lo/dly;

    move-result-object v0

    iget-object v1, p0, Lo/dlz$7$1;->e:Lo/dlz$7;

    iget-object v1, v1, Lo/dlz$7;->a:[J

    iget-object v2, p0, Lo/dlz$7$1;->c:[D

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dly;->e([J[DD)V

    .line 659
    return-void
.end method
