.class Lo/eta$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/operation/https/HttpResCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eta;->b(Ljava/lang/String;Lo/etc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eta;

.field final synthetic d:Lo/etc;


# direct methods
.method constructor <init>(Lo/eta;Lo/etc;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lo/eta$5;->c:Lo/eta;

    iput-object p2, p0, Lo/eta$5;->d:Lo/etc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinished(ILjava/lang/String;)V
    .locals 4

    .line 204
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHistoryFromCloud resCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHistoryFromCloud result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    iget-object v0, p0, Lo/eta$5;->c:Lo/eta;

    iget-object v1, p0, Lo/eta$5;->d:Lo/etc;

    invoke-static {v0, p1, p2, v1}, Lo/eta;->b(Lo/eta;ILjava/lang/String;Lo/etc;)V

    .line 208
    return-void
.end method
