.class Lo/ve$1;
.super Lo/eet$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ve;->a(Lo/vg;)Lo/eet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic d:Lo/vg;

.field final synthetic e:Lo/ve;


# direct methods
.method constructor <init>(Lo/ve;Lo/vg;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/ve$1;->e:Lo/ve;

    iput-object p2, p0, Lo/ve$1;->d:Lo/vg;

    .line 976
    invoke-direct {p0}, Lo/eet$a;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/systemserver/activityrecognition/HwActivityChangedEvent;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 982
    iget-object v0, p0, Lo/ve$1;->d:Lo/vg;

    iget-object v1, p0, Lo/ve$1;->e:Lo/ve;

    invoke-static {v1, p1}, Lo/ve;->b(Lo/ve;Lcom/huawei/systemserver/activityrecognition/HwActivityChangedEvent;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/vg;->a(Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;)V

    .line 983
    return-void
.end method

.method public d(Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 989
    iget-object v0, p0, Lo/ve$1;->d:Lo/vg;

    iget-object v1, p0, Lo/ve$1;->e:Lo/ve;

    invoke-static {v1, p1}, Lo/ve;->a(Lo/ve;Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/vg;->a(Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;)V

    .line 990
    return-void
.end method

.method public e(Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 996
    iget-object v0, p0, Lo/ve$1;->d:Lo/vg;

    iget-object v1, p0, Lo/ve$1;->e:Lo/ve;

    invoke-static {v1, p1}, Lo/ve;->a(Lo/ve;Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;)Lcom/huawei/android/location/activityrecognition/HwEnvironmentChangedEvent;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/vg;->a(Lcom/huawei/android/location/activityrecognition/HwEnvironmentChangedEvent;)V

    .line 997
    return-void
.end method
