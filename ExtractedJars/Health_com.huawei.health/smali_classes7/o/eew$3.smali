.class Lo/eew$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eew;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eew;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/eew;Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lo/eew$3;->c:Lo/eew;

    iput-object p2, p0, Lo/eew$3;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 120
    iget-object v0, p0, Lo/eew$3;->c:Lo/eew;

    new-instance v1, Lo/efk;

    iget-object v2, p0, Lo/eew$3;->c:Lo/eew;

    iget-object v2, v2, Lo/eew;->d:Landroid/content/Context;

    iget-object v3, p0, Lo/eew$3;->d:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lo/efk;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, v0, Lo/eew;->i:Lo/efk;

    .line 121
    iget-object v0, p0, Lo/eew$3;->c:Lo/eew;

    iget-object v1, p0, Lo/eew$3;->c:Lo/eew;

    iget-object v1, v1, Lo/eew;->i:Lo/efk;

    invoke-virtual {v1}, Lo/efk;->a()I

    move-result v1

    iput v1, v0, Lo/eew;->g:I

    .line 122
    const-string v0, "Actor"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setMaterialFromAssets materialFile="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/eew$3;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mProgramID="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/eew$3;->c:Lo/eew;

    iget v2, v2, Lo/eew;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    return-void
.end method
