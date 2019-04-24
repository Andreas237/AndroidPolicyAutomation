.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V
    .locals 0

    .line 770
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$5;->b:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

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

    .line 774
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$5;->b:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/util/List;)V

    .line 776
    return-void
.end method
