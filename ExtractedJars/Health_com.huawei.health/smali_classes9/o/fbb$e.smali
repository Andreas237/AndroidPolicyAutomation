.class public Lo/fbb$e;
.super Lo/fbk;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fbb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private a:F

.field private c:Landroid/content/Context;

.field private d:F


# direct methods
.method public constructor <init>(Landroid/content/Context;JJ)V
    .locals 0

    .line 58
    invoke-direct {p0, p2, p3, p4, p5}, Lo/fbk;-><init>(JJ)V

    .line 59
    iput-object p1, p0, Lo/fbb$e;->c:Landroid/content/Context;

    .line 60
    return-void
.end method


# virtual methods
.method public b(F)V
    .locals 0

    .line 63
    iput p1, p0, Lo/fbb$e;->a:F

    .line 64
    return-void
.end method

.method public c(F)V
    .locals 0

    .line 67
    iput p1, p0, Lo/fbb$e;->d:F

    .line 68
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 5

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lo/fbb$e;->d:F

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fbb$e;->a:F

    float-to-double v1, v1

    .line 76
    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fbb$e;->c:Landroid/content/Context;

    .line 77
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 74
    return-object v0
.end method
