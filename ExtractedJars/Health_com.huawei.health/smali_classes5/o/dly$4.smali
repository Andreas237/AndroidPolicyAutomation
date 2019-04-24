.class Lo/dly$4;
.super Lo/dmd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dly;->d([JLo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dmd<Ljava/lang/Long;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/dly;

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/dly;Lo/egg;)V
    .locals 0

    .line 293
    iput-object p1, p0, Lo/dly$4;->b:Lo/dly;

    iput-object p2, p0, Lo/dly$4;->e:Lo/egg;

    invoke-direct {p0}, Lo/dmd;-><init>()V

    return-void
.end method


# virtual methods
.method protected b(ILjava/lang/Long;)Z
    .locals 4

    .line 296
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAchieveGoalFromCloud err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected c(Ljava/lang/Long;)Z
    .locals 4

    .line 302
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAchieveGoalFromCloud integer = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected d(Ljava/lang/Long;)V
    .locals 2

    .line 308
    iget-object v0, p0, Lo/dly$4;->e:Lo/egg;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 309
    return-void
.end method

.method protected synthetic d(ILjava/lang/Object;)Z
    .locals 1

    .line 293
    move-object v0, p2

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {p0, p1, v0}, Lo/dly$4;->b(ILjava/lang/Long;)Z

    move-result v0

    return v0
.end method

.method protected synthetic d(Ljava/lang/Object;)Z
    .locals 1

    .line 293
    move-object v0, p1

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {p0, v0}, Lo/dly$4;->c(Ljava/lang/Long;)Z

    move-result v0

    return v0
.end method

.method protected synthetic e(Ljava/lang/Object;)V
    .locals 1

    .line 293
    move-object v0, p1

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {p0, v0}, Lo/dly$4;->d(Ljava/lang/Long;)V

    return-void
.end method
