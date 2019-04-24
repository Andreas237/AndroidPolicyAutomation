.class Lo/ewt$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ewt;->b(JJILo/ewr$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Lo/ewt;

.field final synthetic e:Lo/ewr$c;


# direct methods
.method constructor <init>(Lo/ewt;Lo/ewr$c;[Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lo/ewt$5;->b:Lo/ewt;

    iput-object p2, p0, Lo/ewt$5;->e:Lo/ewr$c;

    iput-object p3, p0, Lo/ewt$5;->a:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 89
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 90
    :cond_0
    iget-object v0, p0, Lo/ewt$5;->e:Lo/ewr$c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ewr$c;->b(ILjava/util/List;)V

    .line 91
    return-void

    .line 93
    :cond_1
    const-string v0, "SCUI_FitnessSportIntensityIn"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessDataDetailByData aggregateHiHealthData onResult datas = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " errorCode"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " anchor"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 95
    iget-object v0, p0, Lo/ewt$5;->b:Lo/ewt;

    iget-object v1, p0, Lo/ewt$5;->a:[Ljava/lang/String;

    invoke-static {v0, p1, v4, v1}, Lo/ewt;->d(Lo/ewt;Ljava/util/List;Ljava/util/ArrayList;[Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lo/ewt$5;->e:Lo/ewr$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v4}, Lo/ewr$c;->b(ILjava/util/List;)V

    .line 97
    return-void
.end method
