.class Lo/cwi$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cwi;


# direct methods
.method constructor <init>(Lo/cwi;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lo/cwi$4;->e:Lo/cwi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 177
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 178
    iget-object v0, p0, Lo/cwi$4;->e:Lo/cwi;

    move-object v1, p2

    check-cast v1, Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    invoke-static {v0, v1}, Lo/cwi;->e(Lo/cwi;Lcom/huawei/exercise/modle/RunPlanRecordInfo;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    goto :goto_0

    .line 180
    :cond_0
    iget-object v0, p0, Lo/cwi$4;->e:Lo/cwi;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cwi;->e(Lo/cwi;Lcom/huawei/exercise/modle/RunPlanRecordInfo;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    .line 182
    :goto_0
    iget-object v0, p0, Lo/cwi$4;->e:Lo/cwi;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cwi;->a(Lo/cwi;Z)Z

    .line 183
    return-void
.end method
