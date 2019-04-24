.class Lo/eta$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/operation/https/HttpResCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eta;->b(IZLo/etc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic c:I

.field final synthetic d:Lo/eta;

.field final synthetic e:Lo/etc;


# direct methods
.method constructor <init>(Lo/eta;ILo/etc;J)V
    .locals 0

    .line 165
    iput-object p1, p0, Lo/eta$2;->d:Lo/eta;

    iput p2, p0, Lo/eta$2;->c:I

    iput-object p3, p0, Lo/eta$2;->e:Lo/etc;

    iput-wide p4, p0, Lo/eta$2;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinished(ILjava/lang/String;)V
    .locals 8

    .line 168
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getActivityFromCloud resCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getActivityFromCloud result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 171
    iget-object v0, p0, Lo/eta$2;->d:Lo/eta;

    iget v1, p0, Lo/eta$2;->c:I

    iget-object v2, p0, Lo/eta$2;->e:Lo/etc;

    invoke-static {v0, p1, p2, v1, v2}, Lo/eta;->b(Lo/eta;ILjava/lang/String;ILo/etc;)V

    .line 172
    iget-object v0, p0, Lo/eta$2;->d:Lo/eta;

    move v1, p1

    iget-wide v2, p0, Lo/eta$2;->a:J

    move-wide v4, v6

    invoke-static/range {v0 .. v5}, Lo/eta;->b(Lo/eta;IJJ)V

    .line 173
    return-void
.end method
