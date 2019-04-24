.class Lo/bsq$34;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->d(JLjava/lang/String;Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bui;

.field final synthetic c:Lo/bsq;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/bsq;Ljava/lang/String;Lo/bui;)V
    .locals 0

    .line 3260
    iput-object p1, p0, Lo/bsq$34;->c:Lo/bsq;

    iput-object p2, p0, Lo/bsq$34;->d:Ljava/lang/String;

    iput-object p3, p0, Lo/bsq$34;->a:Lo/bui;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 12

    .line 3274
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoadFitnessAudioXMl onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3275
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoadFitnessAudioXMl onSuccess data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3277
    invoke-static {p1}, Lo/bso;->c(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v4

    .line 3278
    const-wide/16 v5, 0x0

    .line 3279
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 3280
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/model/LangFile;

    .line 3281
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/LangFile;->acquireLangName()Ljava/lang/String;

    move-result-object v9

    .line 3283
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    .line 3284
    invoke-static {}, Lo/bsm;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3285
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/LangFile;->acquireLangUrl()Ljava/lang/String;

    move-result-object v10

    .line 3286
    invoke-static {v9, v10}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 3287
    const/4 v0, 0x1

    invoke-static {v10, v0}, Lo/bsm;->b(Ljava/lang/String;Z)V

    .line 3291
    :cond_0
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/LangFile;->acquireVersion()J

    move-result-wide v10

    .line 3292
    cmp-long v0, v5, v10

    if-gez v0, :cond_1

    .line 3293
    move-wide v5, v10

    .line 3279
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 3297
    :cond_2
    invoke-static {}, Lo/bsm;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->t(Ljava/lang/String;)J

    move-result-wide v7

    .line 3299
    cmp-long v0, v5, v7

    if-lez v0, :cond_3

    .line 3300
    invoke-static {}, Lo/bsm;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5, v6}, Lo/bsm;->e(Ljava/lang/String;J)V

    .line 3304
    :cond_3
    iget-object v0, p0, Lo/bsq$34;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/bsm;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 3305
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "multiLanguageUrl = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3306
    iget-object v0, p0, Lo/bsq$34;->c:Lo/bsq;

    iget-object v1, p0, Lo/bsq$34;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bsq$34;->a:Lo/bui;

    invoke-static {v0, v9, v1, v2}, Lo/bsq;->a(Lo/bsq;Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    .line 3308
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 5

    .line 3263
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoadFitnessAudioXMl onFailure:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "errorCode="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "   errorInfo="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3264
    iget-object v0, p0, Lo/bsq$34;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/bsm;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 3265
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 3266
    iget-object v0, p0, Lo/bsq$34;->c:Lo/bsq;

    iget-object v1, p0, Lo/bsq$34;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bsq$34;->a:Lo/bui;

    invoke-static {v0, v4, v1, v2}, Lo/bsq;->a(Lo/bsq;Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    goto :goto_0

    .line 3268
    :cond_0
    iget-object v0, p0, Lo/bsq$34;->a:Lo/bui;

    invoke-virtual {v0, p1, p2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 3270
    :goto_0
    return-void
.end method
