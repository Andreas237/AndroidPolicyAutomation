.class Lo/ezk$c$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ezk$c;->c(Lo/eih;FLo/ezk$b$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ezk$c;

.field final synthetic b:F

.field final synthetic c:Lo/ezk$b$a;


# direct methods
.method constructor <init>(Lo/ezk$c;FLo/ezk$b$a;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lo/ezk$c$4;->a:Lo/ezk$c;

    iput p2, p0, Lo/ezk$c$4;->b:F

    iput-object p3, p0, Lo/ezk$c$4;->c:Lo/ezk$b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 7

    .line 228
    const/4 v2, 0x0

    .line 230
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    move-object v0, p1

    check-cast v0, Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 231
    move-object v3, p1

    check-cast v3, Landroid/util/SparseArray;

    .line 235
    iget-object v0, p0, Lo/ezk$c$4;->a:Lo/ezk$c;

    invoke-static {v0}, Lo/ezk$c;->c(Lo/ezk$c;)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 236
    move-object v4, v5

    check-cast v4, Ljava/util/List;

    .line 238
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 239
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 240
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getFloatValue()F

    move-result v0

    iget-object v1, p0, Lo/ezk$c$4;->a:Lo/ezk$c;

    invoke-static {v1}, Lo/ezk$c;->e(Lo/ezk$c;)F

    move-result v1

    mul-float v2, v0, v1

    .line 244
    :cond_0
    iget v0, p0, Lo/ezk$c$4;->b:F

    cmpg-float v0, v0, v2

    if-gez v0, :cond_1

    .line 245
    iget-object v0, p0, Lo/ezk$c$4;->c:Lo/ezk$b$a;

    invoke-interface {v0, v2}, Lo/ezk$b$a;->d(F)V

    .line 246
    return-void

    .line 248
    :cond_1
    iget-object v0, p0, Lo/ezk$c$4;->c:Lo/ezk$b$a;

    iget v1, p0, Lo/ezk$c$4;->b:F

    invoke-interface {v0, v1}, Lo/ezk$b$a;->d(F)V

    .line 249
    return-void
.end method
