.class Lo/ve$4;
.super Lo/vi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ve;->d(Lo/vg;)Lo/vi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic a:Lo/vg;

.field final synthetic c:Lo/ve;


# direct methods
.method constructor <init>(Lo/ve;Lo/vg;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/ve$4;->c:Lo/ve;

    iput-object p2, p0, Lo/ve$4;->a:Lo/vg;

    .line 837
    invoke-direct {p0}, Lo/vi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 842
    iget-object v0, p0, Lo/ve$4;->a:Lo/vg;

    invoke-interface {v0, p1}, Lo/vg;->a(Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;)V

    .line 843
    return-void
.end method
