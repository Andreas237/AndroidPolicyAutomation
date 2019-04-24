.class Lo/bvp$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bvp;->b(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/bvp;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/bvp;Ljava/util/List;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lo/bvp$5;->b:Lo/bvp;

    iput-object p2, p0, Lo/bvp$5;->e:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 140
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-object v1, p2

    check-cast v1, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {p0, v0, v1}, Lo/bvp$5;->d(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)I

    move-result v0

    return v0
.end method

.method public d(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)I
    .locals 3

    .line 143
    iget-object v0, p0, Lo/bvp$5;->b:Lo/bvp;

    iget-object v1, p0, Lo/bvp$5;->e:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lo/bvp;->b(Lo/bvp;Ljava/util/List;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)I

    move-result v0

    iget-object v1, p0, Lo/bvp$5;->b:Lo/bvp;

    iget-object v2, p0, Lo/bvp$5;->e:Ljava/util/List;

    invoke-static {v1, v2, p2}, Lo/bvp;->b(Lo/bvp;Ljava/util/List;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method
