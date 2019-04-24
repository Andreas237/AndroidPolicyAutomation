.class Lo/acx$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/dnurse/sdk/IMeasureDataResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/acx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/acx;


# direct methods
.method constructor <init>(Lo/acx;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/acx$4;->a:Lo/acx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMeasuring(II)V
    .locals 5

    .line 55
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DnurseMeasureController onMeasuring, status="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    iget-object v0, p0, Lo/acx$4;->a:Lo/acx;

    invoke-static {v0}, Lo/acx;->e(Lo/acx;)I

    move-result v0

    if-eq v0, p1, :cond_1

    .line 57
    iget-object v0, p0, Lo/acx$4;->a:Lo/acx;

    invoke-static {v0, p1}, Lo/acx;->e(Lo/acx;I)I

    .line 58
    iget-object v0, p0, Lo/acx$4;->a:Lo/acx;

    invoke-static {v0}, Lo/acx;->d(Lo/acx;)Lo/acl;

    move-result-object v0

    instance-of v0, v0, Lo/ach;

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lo/acx$4;->a:Lo/acx;

    invoke-static {v0}, Lo/acx;->d(Lo/acx;)Lo/acl;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ach;

    .line 60
    iget-object v0, p0, Lo/acx$4;->a:Lo/acx;

    invoke-static {v0}, Lo/acx;->c(Lo/acx;)Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->getDeviceSn()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/ach;->c(Ljava/lang/String;)V

    .line 62
    :cond_0
    iget-object v0, p0, Lo/acx$4;->a:Lo/acx;

    invoke-static {v0}, Lo/acx;->b(Lo/acx;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 63
    const/16 v0, 0x8

    if-eq p1, v0, :cond_1

    .line 64
    iget-object v0, p0, Lo/acx$4;->a:Lo/acx;

    invoke-static {v0}, Lo/acx;->b(Lo/acx;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/acx$4;->a:Lo/acx;

    invoke-static {v1}, Lo/acx;->d(Lo/acx;)Lo/acl;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 68
    :cond_1
    return-void
.end method

.method public onSuccess(Landroid/util/SparseArray;)V
    .locals 7

    .line 36
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureController onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Float;

    .line 38
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Calendar;

    .line 40
    new-instance v6, Lo/afy;

    invoke-direct {v6}, Lo/afy;-><init>()V

    .line 41
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v6, v0}, Lo/afy;->b(F)V

    .line 42
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/afy;->e(J)V

    .line 43
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/afy;->d(J)V

    .line 44
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/afy;->c(I)V

    .line 46
    iget-object v0, p0, Lo/acx$4;->a:Lo/acx;

    invoke-static {v0}, Lo/acx;->b(Lo/acx;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lo/acx$4;->a:Lo/acx;

    invoke-static {v0}, Lo/acx;->b(Lo/acx;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/acx$4;->a:Lo/acx;

    invoke-static {v1}, Lo/acx;->d(Lo/acx;)Lo/acl;

    move-result-object v1

    invoke-interface {v0, v1, v6}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 50
    :cond_0
    iget-object v0, p0, Lo/acx$4;->a:Lo/acx;

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lo/acx;->e(Lo/acx;I)I

    .line 51
    return-void
.end method
