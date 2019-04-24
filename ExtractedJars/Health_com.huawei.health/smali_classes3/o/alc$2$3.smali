.class Lo/alc$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alc$2;->onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/alc$2;


# direct methods
.method constructor <init>(Lo/alc$2;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/alc$2$3;->a:Lo/alc$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 68
    iget-object v0, p0, Lo/alc$2$3;->a:Lo/alc$2;

    iget-object v0, v0, Lo/alc$2;->a:Lo/alc;

    invoke-static {v0}, Lo/alc;->d(Lo/alc;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resigter single track data to read finish and onResponse enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 71
    iget-object v0, p0, Lo/alc$2$3;->a:Lo/alc$2;

    iget-object v0, v0, Lo/alc$2;->a:Lo/alc;

    invoke-static {v0}, Lo/alc;->d(Lo/alc;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "thie size of singleMovementRecords is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    iget-object v0, p0, Lo/alc$2$3;->a:Lo/alc$2;

    iget-object v0, v0, Lo/alc$2;->a:Lo/alc;

    invoke-virtual {v0, v4}, Lo/alc;->d(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v5

    .line 78
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 79
    iget-object v0, p0, Lo/alc$2$3;->a:Lo/alc$2;

    iget-object v0, v0, Lo/alc$2;->a:Lo/alc;

    invoke-static {v0}, Lo/alc;->d(Lo/alc;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no single run track record!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    return-void

    .line 82
    :cond_0
    iget-object v0, p0, Lo/alc$2$3;->a:Lo/alc$2;

    iget-object v0, v0, Lo/alc$2;->a:Lo/alc;

    invoke-virtual {v0, v5}, Lo/alc;->c(Ljava/util/ArrayList;)V

    .line 85
    return-void
.end method
