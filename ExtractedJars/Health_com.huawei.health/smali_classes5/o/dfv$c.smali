.class Lo/dfv$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dfv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:I

.field private c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 312
    iput p1, p0, Lo/dfv$c;->b:I

    .line 313
    iput-object p2, p0, Lo/dfv$c;->c:Ljava/lang/Object;

    .line 314
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 318
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "setDeviceFitnessGoal  onResponse!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 319
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceFitnessGoal  onResponse!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dfv$c;->c:Ljava/lang/Object;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    iget v0, p0, Lo/dfv$c;->b:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/dfv$c;->c:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    if-eqz v0, :cond_0

    .line 321
    iget-object v0, p0, Lo/dfv$c;->c:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 322
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 323
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 324
    invoke-static {v6}, Lo/dgb;->a(Ljava/util/List;)V

    .line 326
    :cond_0
    return-void
.end method
