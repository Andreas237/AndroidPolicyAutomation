.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;I)V
    .locals 0

    .line 1306
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iput p2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 1310
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1312
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/Date;

    move-result-object v10

    .line 1313
    goto :goto_1

    .line 1315
    :goto_0
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v10

    .line 1320
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    invoke-static {v0, v10, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/util/Date;I)V

    .line 1323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    const/16 v3, 0xc8

    invoke-static {v1, v10, v2, v3}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;II)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    .line 1324
    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    const/16 v4, 0xc9

    invoke-static {v2, v10, v3, v4}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;II)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    .line 1325
    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    const/16 v5, 0xca

    invoke-static {v3, v10, v4, v5}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;II)F

    move-result v3

    .line 1323
    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;FFF)V

    .line 1326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/acu;

    move-result-object v3

    const/16 v4, 0xc8

    invoke-static {v1, v10, v2, v4, v3}, Lo/fec;->c(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    .line 1327
    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/acu;

    move-result-object v4

    const/16 v5, 0xc9

    invoke-static {v2, v10, v3, v5, v4}, Lo/fec;->c(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    .line 1328
    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    iget-object v5, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/acu;

    move-result-object v5

    const/16 v6, 0xca

    invoke-static {v3, v10, v4, v6, v5}, Lo/fec;->c(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    .line 1329
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v4

    iget v5, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    iget-object v6, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/acu;

    move-result-object v6

    const/16 v7, 0xc8

    invoke-static {v4, v10, v5, v7, v6}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v4

    iget-object v5, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    .line 1330
    invoke-static {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v5

    iget v6, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/acu;

    move-result-object v7

    const/16 v8, 0xc9

    invoke-static {v5, v10, v6, v8, v7}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v5

    iget-object v6, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    .line 1331
    invoke-static {v6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v6

    iget v7, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->e:I

    iget-object v8, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/acu;

    move-result-object v8

    const/16 v9, 0xca

    invoke-static {v6, v10, v7, v9, v8}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v6

    .line 1326
    invoke-static/range {v0 .. v6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;FFFFFF)V

    .line 1332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Ljava/util/List;)V

    .line 1333
    return-void

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_0
    .end sparse-switch
.end method
