.class Lo/dlz$4$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz$4;->c(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dlz$4;


# direct methods
.method constructor <init>(Lo/dlz$4;)V
    .locals 0

    .line 488
    iput-object p1, p0, Lo/dlz$4$5;->b:Lo/dlz$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 491
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 492
    iget-object v0, p0, Lo/dlz$4$5;->b:Lo/dlz$4;

    iget-object v0, v0, Lo/dlz$4;->c:Lo/dlz;

    move-object v1, p2

    check-cast v1, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-static {v0, v1}, Lo/dlz;->a(Lo/dlz;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 494
    :cond_0
    return-void
.end method
