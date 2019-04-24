.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V
    .locals 1

    .line 687
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 688
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->e:Ljava/lang/ref/WeakReference;

    .line 689
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    .line 690
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 17

    .line 694
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 695
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fdj;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 696
    const/4 v13, 0x0

    .line 697
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 698
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "BI_Tag"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v13

    .line 700
    :cond_0
    sget-object v0, Lo/dae;->cW:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v14

    .line 701
    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 702
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 703
    const/4 v0, 0x1

    if-ne v13, v0, :cond_1

    .line 704
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 706
    :cond_1
    const-string v0, "type"

    const-string v1, "2"

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    :goto_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->v(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v14, v15, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 714
    const-string v0, "UIHLH_InputBloodpressureActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4f4e\u538b\u6570\u636e\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 715
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->I(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    .line 716
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fdj;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->v(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Landroid/content/Context;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->I(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)J

    move-result-wide v2

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->I(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)J

    move-result-wide v4

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v6}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->E(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$b;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lo/fdj;->a(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 717
    const-string v0, "UIHLH_InputBloodpressureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->I(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fdj;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->v(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Landroid/content/Context;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->G(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)J

    move-result-wide v2

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->G(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)J

    move-result-wide v4

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v6}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)D

    move-result-wide v6

    move-object/from16 v8, p0

    iget-object v8, v8, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)D

    move-result-wide v8

    move-object/from16 v10, p0

    iget-object v10, v10, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v10}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)D

    move-result-wide v10

    move-object/from16 v12, p0

    iget-object v12, v12, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v12}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->F(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$c;

    move-result-object v12

    invoke-virtual/range {v0 .. v12}, Lo/fdj;->d(Landroid/content/Context;JJDDDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 720
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;Z)Z

    .line 721
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v16

    .line 722
    const/4 v0, 0x2

    move-object/from16 v1, v16

    iput v0, v1, Landroid/os/Message;->what:I

    .line 723
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v16

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 726
    :cond_3
    return-void
.end method
