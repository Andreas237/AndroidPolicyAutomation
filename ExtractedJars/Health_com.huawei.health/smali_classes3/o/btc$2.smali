.class Lo/btc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btc;->c(Ljava/lang/String;JFILjava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Z

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:J

.field final synthetic e:F

.field final synthetic f:Ljava/lang/String;

.field final synthetic k:Lo/btc;


# direct methods
.method constructor <init>(Lo/btc;Ljava/lang/String;JFIZLjava/lang/String;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lo/btc$2;->k:Lo/btc;

    iput-object p2, p0, Lo/btc$2;->c:Ljava/lang/String;

    iput-wide p3, p0, Lo/btc$2;->d:J

    iput p5, p0, Lo/btc$2;->e:F

    iput p6, p0, Lo/btc$2;->a:I

    iput-boolean p7, p0, Lo/btc$2;->b:Z

    iput-object p8, p0, Lo/btc$2;->f:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 138
    iget-object v0, p0, Lo/btc$2;->k:Lo/btc;

    iget-object v1, p0, Lo/btc$2;->c:Ljava/lang/String;

    iget-wide v2, p0, Lo/btc$2;->d:J

    iget v4, p0, Lo/btc$2;->e:F

    iget v5, p0, Lo/btc$2;->a:I

    invoke-virtual/range {v0 .. v5}, Lo/btc;->c(Ljava/lang/String;JFI)V

    .line 140
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 141
    const-string v0, "BUNLDE_FITNESS_DURATION"

    iget v1, p0, Lo/btc$2;->a:I

    int-to-long v1, v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 142
    iget-boolean v0, p0, Lo/btc$2;->b:Z

    if-eqz v0, :cond_0

    .line 143
    invoke-static {}, Lo/caa;->a()Lo/caa;

    move-result-object v0

    iget-object v1, p0, Lo/btc$2;->f:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2, v6}, Lo/caa;->c(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 145
    :cond_0
    return-void
.end method
