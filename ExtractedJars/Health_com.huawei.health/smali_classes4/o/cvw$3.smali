.class Lo/cvw$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cvw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cvw;


# direct methods
.method constructor <init>(Lo/cvw;)V
    .locals 0

    .line 523
    iput-object p1, p0, Lo/cvw$3;->a:Lo/cvw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 526
    move-object v0, p2

    check-cast v0, [B

    move-object v1, v0

    check-cast v1, [B

    .line 527
    iget-object v0, p0, Lo/cvw$3;->a:Lo/cvw;

    invoke-static {v0, v1}, Lo/cvw;->a(Lo/cvw;[B)V

    .line 528
    return-void
.end method
