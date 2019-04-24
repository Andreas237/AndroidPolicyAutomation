.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:F

.field private d:F

.field private e:F


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1515
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;)V
    .locals 0

    .line 1515
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 1529
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->d:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public c()F
    .locals 1

    .line 1537
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->a:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public c(F)V
    .locals 1

    .line 1525
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->e:F

    .line 1526
    return-void
.end method

.method public d(F)V
    .locals 1

    .line 1533
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->d:F

    .line 1534
    return-void
.end method

.method public e()F
    .locals 1

    .line 1521
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->e:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public e(F)V
    .locals 1

    .line 1541
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->a:F

    .line 1542
    return-void
.end method
