.class Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 524
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$9;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 532
    const-string v0, "PluginDevice_ClaimMeasureDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncDataStart onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 4

    .line 527
    const-string v0, "PluginDevice_ClaimMeasureDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncDataStart onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    return-void
.end method
