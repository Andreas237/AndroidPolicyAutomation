.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fes$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V
    .locals 0

    .line 295
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$4;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/List;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 298
    int-to-double v0, p2

    const-wide v2, 0x3fb999999999999aL    # 0.1

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double v4, v2, v0

    .line 300
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v6

    .line 301
    new-instance v7, Ljava/text/DecimalFormat;

    const-string v0, "##0.0"

    invoke-direct {v7, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 303
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$4;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-virtual {v7, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;D)D
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 306
    goto :goto_0

    .line 304
    :catch_0
    move-exception v8

    .line 305
    const-string v0, "UIHLH_InputBloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initView, ParseException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$4;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->o(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Lo/egb;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v4, v5, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 308
    return-void
.end method
