.class Lo/alc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alc;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/alc;


# direct methods
.method constructor <init>(Lo/alc;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lo/alc$2;->a:Lo/alc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 4

    .line 47
    iget-object v0, p0, Lo/alc$2;->a:Lo/alc;

    invoke-static {v0}, Lo/alc;->d(Lo/alc;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wear single run data onChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {}, Lo/alc;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1388

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 49
    return-void

    .line 51
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/alc;->c(J)J

    .line 53
    const/4 v0, 0x4

    if-eq v0, p1, :cond_1

    .line 54
    return-void

    .line 58
    :cond_1
    iget-object v0, p0, Lo/alc$2;->a:Lo/alc;

    new-instance v1, Lo/alc$2$3;

    invoke-direct {v1, p0}, Lo/alc$2$3;-><init>(Lo/alc$2;)V

    invoke-virtual {v0, v1}, Lo/alc;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 87
    return-void
.end method

.method public onResult(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 40
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    iget-object v0, p0, Lo/alc$2;->a:Lo/alc;

    invoke-static {v0}, Lo/alc;->d(Lo/alc;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register wear single run data success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    :cond_0
    return-void
.end method
