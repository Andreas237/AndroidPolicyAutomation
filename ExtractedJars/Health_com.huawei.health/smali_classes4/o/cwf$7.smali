.class Lo/cwf$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cwf;


# direct methods
.method constructor <init>(Lo/cwf;)V
    .locals 0

    .line 795
    iput-object p1, p0, Lo/cwf$7;->e:Lo/cwf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 798
    move-object v0, p2

    check-cast v0, [B

    move-object v4, v0

    check-cast v4, [B

    .line 799
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Alarm manager receive data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 800
    iget-object v0, p0, Lo/cwf$7;->e:Lo/cwf;

    invoke-static {v0, v4}, Lo/cwf;->a(Lo/cwf;[B)V

    .line 801
    return-void
.end method
