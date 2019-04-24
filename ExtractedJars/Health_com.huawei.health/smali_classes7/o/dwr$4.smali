.class Lo/dwr$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwr;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dwr;


# direct methods
.method constructor <init>(Lo/dwr;)V
    .locals 0

    .line 340
    iput-object p1, p0, Lo/dwr$4;->a:Lo/dwr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 5

    .line 343
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 344
    invoke-static {}, Lo/dwr;->z()Ljava/lang/String;

    move-result-object v0

    const-string v1, "obj is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    return-void

    .line 347
    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxc;->a(Ljava/lang/String;)I

    move-result v3

    .line 348
    invoke-static {}, Lo/dwr;->z()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getTotalSteps="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    const/16 v0, 0xbb8

    if-lt v3, v0, :cond_1

    .line 350
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 351
    const-string v0, "step"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    iget-object v0, p0, Lo/dwr$4;->a:Lo/dwr;

    invoke-static {v0}, Lo/dwr;->c(Lo/dwr;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    const v1, 0x33464

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/dwo;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 354
    :cond_1
    return-void
.end method
