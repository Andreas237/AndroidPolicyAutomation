.class public Lo/awq;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/awq$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Lcom/huawei/health/sns/model/user/User;>;"
    }
.end annotation


# instance fields
.field private a:Lo/awq$d;

.field private d:J


# direct methods
.method public constructor <init>(JLo/awq$d;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 44
    iput-wide p1, p0, Lo/awq;->d:J

    .line 45
    iput-object p3, p0, Lo/awq;->a:Lo/awq$d;

    .line 46
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Lcom/huawei/health/sns/model/user/User;
    .locals 4

    .line 51
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/awq;->d:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 52
    return-object v3
.end method

.method protected a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 1

    .line 58
    iget-object v0, p0, Lo/awq;->a:Lo/awq$d;

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lo/awq;->a:Lo/awq$d;

    invoke-interface {v0, p1}, Lo/awq$d;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 62
    :cond_0
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 15
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/awq;->a([Ljava/lang/Void;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 15
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {p0, v0}, Lo/awq;->a(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method
