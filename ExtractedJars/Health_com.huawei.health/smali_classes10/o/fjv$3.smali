.class Lo/fjv$3;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjv;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/fjv;


# direct methods
.method constructor <init>(Lo/fjv;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lo/fjv$3;->a:Lo/fjv;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs d([Ljava/lang/Void;)Ljava/lang/Object;
    .locals 4

    .line 172
    invoke-static {}, Lo/fjv;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doInBackground ***"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lo/fjv$3;->a:Lo/fjv;

    invoke-static {v0}, Lo/fjv;->d(Lo/fjv;)V

    .line 174
    iget-object v0, p0, Lo/fjv$3;->a:Lo/fjv;

    invoke-static {v0}, Lo/fjv;->e(Lo/fjv;)V

    .line 175
    invoke-static {}, Lo/fjv;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStepsCaloriesMap mCalorieTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fjv$3;->a:Lo/fjv;

    invoke-static {v3}, Lo/fjv;->c(Lo/fjv;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    invoke-static {}, Lo/fjv;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStepsCaloriesMap mFitnessTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fjv$3;->a:Lo/fjv;

    invoke-static {v3}, Lo/fjv;->h(Lo/fjv;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lo/fjv$3;->a:Lo/fjv;

    invoke-static {v0}, Lo/fjv;->c(Lo/fjv;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fjv$3;->a:Lo/fjv;

    invoke-static {v0}, Lo/fjv;->h(Lo/fjv;)I

    move-result v0

    if-nez v0, :cond_0

    .line 178
    invoke-static {}, Lo/fjv;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCalorieTotalData  && mFitnessTotalData == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 180
    :cond_0
    invoke-static {}, Lo/fjv;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCalorieTotalData  sendStepsCaloriesMap"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget-object v0, p0, Lo/fjv$3;->a:Lo/fjv;

    invoke-virtual {v0}, Lo/fjv;->b()V

    .line 183
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 166
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/fjv$3;->d([Ljava/lang/Void;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 188
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .line 168
    return-void
.end method
