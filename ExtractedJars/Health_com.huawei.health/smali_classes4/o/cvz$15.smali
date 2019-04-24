.class Lo/cvz$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->e(Lo/duh;Landroid/content/Context;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cvz;

.field final synthetic e:Lo/duh;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;)V
    .locals 0

    .line 299
    iput-object p1, p0, Lo/cvz$15;->a:Lo/cvz;

    iput-object p2, p0, Lo/cvz$15;->e:Lo/duh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 302
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 303
    :cond_0
    iget-object v0, p0, Lo/cvz$15;->e:Lo/duh;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/duh;->e(ILjava/lang/Object;)V

    goto :goto_0

    .line 305
    :cond_1
    iget-object v0, p0, Lo/cvz$15;->e:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 307
    :goto_0
    return-void
.end method
