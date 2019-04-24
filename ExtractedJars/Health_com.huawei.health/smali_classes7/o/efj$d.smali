.class public Lo/efj$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/efj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field final synthetic b:Lo/efj;


# direct methods
.method public constructor <init>(Lo/efj;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lo/efj$d;->b:Lo/efj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()[F
    .locals 1

    .line 158
    iget-object v0, p0, Lo/efj$d;->b:Lo/efj;

    invoke-static {v0}, Lo/efj;->e(Lo/efj;)[F

    move-result-object v0

    return-object v0
.end method

.method public c()[F
    .locals 1

    .line 166
    iget-object v0, p0, Lo/efj$d;->b:Lo/efj;

    invoke-static {v0}, Lo/efj;->b(Lo/efj;)[F

    move-result-object v0

    return-object v0
.end method

.method public d()[F
    .locals 1

    .line 162
    iget-object v0, p0, Lo/efj$d;->b:Lo/efj;

    invoke-static {v0}, Lo/efj;->a(Lo/efj;)[F

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LoadResult{VertexXYZ=null? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/efj$d;->b:Lo/efj;

    invoke-static {v1}, Lo/efj;->e(Lo/efj;)[F

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", NormalVectorXYZ=null? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/efj$d;->b:Lo/efj;

    invoke-static {v1}, Lo/efj;->a(Lo/efj;)[F

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", TextureVertexST=null? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/efj$d;->b:Lo/efj;

    invoke-static {v1}, Lo/efj;->b(Lo/efj;)[F

    move-result-object v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
