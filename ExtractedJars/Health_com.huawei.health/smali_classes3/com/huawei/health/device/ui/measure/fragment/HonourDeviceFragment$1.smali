.class Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->initListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 122
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Lo/agp;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/agp;->a(I)Lo/agy;

    move-result-object v4

    .line 123
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 124
    invoke-virtual {v4}, Lo/agy;->b()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 125
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-virtual {v4}, Lo/agy;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;Ljava/lang/String;)V

    .line 127
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iw:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    goto/16 :goto_0

    .line 128
    :cond_0
    invoke-virtual {v4}, Lo/agy;->b()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 130
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iz:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 131
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)V

    goto/16 :goto_0

    .line 132
    :cond_1
    invoke-virtual {v4}, Lo/agy;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 134
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ir:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 135
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-virtual {v4}, Lo/agy;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;Ljava/lang/String;)V

    goto :goto_0

    .line 136
    :cond_2
    invoke-virtual {v4}, Lo/agy;->b()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 138
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Lo/ago;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ago;->e(ILjava/lang/Object;)V

    goto :goto_0

    .line 139
    :cond_3
    invoke-virtual {v4}, Lo/agy;->b()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_4

    .line 141
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Lo/ago;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ago;->e(ILjava/lang/Object;)V

    goto :goto_0

    .line 142
    :cond_4
    invoke-virtual {v4}, Lo/agy;->b()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_5

    .line 143
    invoke-virtual {v4}, Lo/agy;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 144
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)V

    goto :goto_0

    .line 146
    :cond_5
    invoke-virtual {v4}, Lo/agy;->b()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_6

    .line 147
    invoke-virtual {v4}, Lo/agy;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 148
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)V

    .line 151
    :cond_6
    :goto_0
    return-void
.end method
