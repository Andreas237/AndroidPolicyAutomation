.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V
    .locals 0

    .line 748
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$1;->b:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

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

    .line 752
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$1;->b:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/util/List;)V

    .line 754
    return-void
.end method
