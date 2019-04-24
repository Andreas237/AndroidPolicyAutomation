.class public Lo/ezk$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ezk$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private b:I

.field private c:F

.field private d:Landroid/content/Context;

.field private e:F


# direct methods
.method public constructor <init>(Landroid/content/Context;FILo/eic;)V
    .locals 4

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    const/4 v0, 0x0

    iput v0, p0, Lo/ezk$c;->e:F

    .line 173
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/ezk$c;->c:F

    .line 176
    iput-object p1, p0, Lo/ezk$c;->d:Landroid/content/Context;

    .line 177
    iput p2, p0, Lo/ezk$c;->e:F

    .line 178
    iput p3, p0, Lo/ezk$c;->b:I

    .line 180
    const/high16 v3, 0x3f800000    # 1.0f

    .line 182
    invoke-virtual {p4}, Lo/eic;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    const v3, 0x3a83126f    # 0.001f

    .line 185
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 186
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v3, v0

    goto :goto_0

    .line 188
    :cond_0
    invoke-virtual {p4}, Lo/eic;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    const v3, 0x3dcccccd    # 0.1f

    .line 191
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 192
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v3, v0

    goto :goto_0

    .line 194
    :cond_1
    invoke-virtual {p4}, Lo/eic;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 195
    const v3, 0x3a83126f    # 0.001f

    .line 197
    :cond_2
    :goto_0
    iput v3, p0, Lo/ezk$c;->c:F

    .line 198
    return-void
.end method

.method static synthetic c(Lo/ezk$c;)I
    .locals 1

    .line 166
    iget v0, p0, Lo/ezk$c;->b:I

    return v0
.end method

.method static synthetic e(Lo/ezk$c;)F
    .locals 1

    .line 166
    iget v0, p0, Lo/ezk$c;->c:F

    return v0
.end method


# virtual methods
.method public a(Lo/eih;)Z
    .locals 1

    .line 202
    invoke-virtual {p1}, Lo/eih;->ac()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    const/4 v0, 0x1

    return v0

    .line 205
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c(Lo/eih;FLo/ezk$b$a;)V
    .locals 8

    .line 210
    invoke-virtual {p1}, Lo/eih;->ai()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    iget v0, p0, Lo/ezk$c;->e:F

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    .line 212
    iget v0, p0, Lo/ezk$c;->e:F

    invoke-interface {p3, v0}, Lo/ezk$b$a;->d(F)V

    .line 213
    return-void

    .line 215
    :cond_0
    invoke-interface {p3, p2}, Lo/ezk$b$a;->d(F)V

    .line 216
    return-void

    .line 219
    :cond_1
    new-instance v6, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 221
    invoke-virtual {p1}, Lo/eih;->Y()F

    move-result v0

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {p1}, Lo/eih;->ag()F

    move-result v2

    float-to-int v2, v2

    int-to-long v2, v2

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    sub-long/2addr v2, v4

    invoke-virtual {v6, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 222
    const/4 v0, 0x1

    new-array v7, v0, [I

    iget v0, p0, Lo/ezk$c;->b:I

    const/4 v1, 0x0

    aput v0, v7, v1

    .line 223
    invoke-virtual {v6, v7}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 225
    iget-object v0, p0, Lo/ezk$c;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/ezk$c$4;

    invoke-direct {v1, p0, p2, p3}, Lo/ezk$c$4;-><init>(Lo/ezk$c;FLo/ezk$b$a;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 256
    return-void
.end method
