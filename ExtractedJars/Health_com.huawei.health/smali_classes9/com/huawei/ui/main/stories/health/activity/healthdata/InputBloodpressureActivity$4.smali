.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fes$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V
    .locals 0

    .line 227
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$4;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$4;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    int-to-double v1, p2

    const-wide/high16 v3, 0x403e000000000000L    # 30.0

    add-double/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;D)D

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$4;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/egb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$4;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 233
    return-void
.end method
