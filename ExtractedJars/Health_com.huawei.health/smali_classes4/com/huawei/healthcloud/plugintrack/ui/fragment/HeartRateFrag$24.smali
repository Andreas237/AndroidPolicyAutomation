.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$24;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/cfd;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V
    .locals 0

    .line 738
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$24;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 738
    move-object v0, p1

    check-cast v0, Lo/cfd;

    move-object v1, p2

    check-cast v1, Lo/cfd;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$24;->e(Lo/cfd;Lo/cfd;)I

    move-result v0

    return v0
.end method

.method public e(Lo/cfd;Lo/cfd;)I
    .locals 2

    .line 741
    invoke-static {p1}, Lo/cgm;->a(Lo/cfd;)I

    move-result v0

    invoke-static {p2}, Lo/cgm;->a(Lo/cfd;)I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method
