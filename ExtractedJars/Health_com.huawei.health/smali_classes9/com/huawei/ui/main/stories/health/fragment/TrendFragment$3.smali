.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V
    .locals 0

    .line 786
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 790
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/util/List;)V

    .line 792
    return-void
.end method
