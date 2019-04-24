.class Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment$5;
.super Lo/dbs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;)V
    .locals 0

    .line 556
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment$5;->d:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    invoke-direct {p0}, Lo/dbs;-><init>()V

    return-void
.end method


# virtual methods
.method public onDenied(Ljava/lang/String;)V
    .locals 4

    .line 564
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDenied()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    return-void
.end method

.method public onGranted()V
    .locals 4

    .line 559
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGranted()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    return-void
.end method
