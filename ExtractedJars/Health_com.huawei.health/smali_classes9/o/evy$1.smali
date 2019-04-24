.class Lo/evy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evy;->a(Ljava/util/Date;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/evy;


# direct methods
.method constructor <init>(Lo/evy;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lo/evy$1;->e:Lo/evy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 14

    .line 211
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSuggestData err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "objData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    const/4 v0, 0x0

    if-ne v0, p1, :cond_4

    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_4

    .line 213
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestRecommendService err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    move-object/from16 v0, p2

    instance-of v0, v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;

    if-eqz v0, :cond_5

    .line 215
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSuggestData xxxx onResponse sucess objData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    move-object/from16 v7, p2

    check-cast v7, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;->getAd_num_0()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 218
    iget-object v0, p0, Lo/evy$1;->e:Lo/evy;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/evy;->d(Lo/evy;Ljava/lang/String;)Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    move-result-object v9

    .line 219
    const/4 v0, 0x0

    if-eq v0, v9, :cond_3

    .line 220
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepRecommendData.Category:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getCategory()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    invoke-virtual {v9}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getCategory()Ljava/lang/String;

    move-result-object v10

    .line 222
    const-string v0, "1"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 223
    invoke-virtual {v9}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getTitle()Ljava/lang/String;

    move-result-object v11

    .line 224
    invoke-virtual {v9}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getUrl()Ljava/lang/String;

    move-result-object v12

    .line 225
    invoke-virtual {v9}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getDescription()Ljava/lang/String;

    move-result-object v13

    .line 226
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpWebTitle :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",jumpWebUrl:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    invoke-static {}, Lo/evy;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    const v1, 0x13880

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    .line 228
    iget-object v0, p0, Lo/evy$1;->e:Lo/evy;

    invoke-static {v0}, Lo/evy;->e(Lo/evy;)Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->getSmartCardCoreSleepTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 229
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u79d1\u5b66\u7761\u7720\u6709\u914d\u7f6e\u65f6\u95f4:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/evy$1;->e:Lo/evy;

    invoke-static {v3}, Lo/evy;->e(Lo/evy;)Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->getSmartCardCoreSleepTime()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-object v0, p0, Lo/evy$1;->e:Lo/evy;

    move-object v1, v13

    move-object v2, v11

    move-object v3, v12

    iget-object v4, p0, Lo/evy$1;->e:Lo/evy;

    .line 231
    invoke-static {v4}, Lo/evy;->e(Lo/evy;)Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->getSmartCardCoreSleepTime()Ljava/lang/String;

    move-result-object v4

    .line 230
    const v5, 0x13881

    const/4 v6, 0x2

    invoke-static/range {v0 .. v6}, Lo/evy;->e(Lo/evy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    .line 235
    :cond_1
    goto :goto_1

    .line 236
    :cond_2
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSuggestData error code"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u4e0d\u662f\u97f3\u4e50"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    :goto_1
    goto :goto_2

    .line 240
    :cond_3
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSuggestData error code"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,\u6ca1\u6709\u79d1\u5b66\u7761\u7720\u5efa\u8bae\u503c"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    :goto_2
    goto :goto_3

    .line 243
    :cond_4
    invoke-static {}, Lo/evy;->k()I

    move-result v0

    if-ne v0, p1, :cond_5

    .line 245
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSuggestData error code"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u6ca1\u6709\u79d1\u5b66\u7761\u7720\u5efa\u8bae\u503c \u8fd4\u56de"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    :cond_5
    :goto_3
    return-void
.end method
