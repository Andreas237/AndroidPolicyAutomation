.class Lo/yv$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/zj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/yv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lo/yv;


# direct methods
.method public constructor <init>(Lo/yv;Ljava/lang/String;)V
    .locals 1

    .line 816
    iput-object p1, p0, Lo/yv$a;->e:Lo/yv;

    .line 815
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 785
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/yv$a;->d:Ljava/util/Map;

    .line 817
    iput-object p2, p0, Lo/yv$a;->c:Ljava/lang/String;

    .line 818
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 2

    .line 873
    iget-object v0, p0, Lo/yv$a;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 875
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onLocalQueryGrsFail code ->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 877
    const/16 v0, -0x259

    if-ne v0, p1, :cond_0

    .line 879
    const-string v0, "onLocalQueryGrsFail LocalConcant.LOAD_DATA_CONFIG_FAIL"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 880
    goto :goto_0

    .line 881
    :cond_0
    const/16 v0, -0x25a

    if-ne v0, p1, :cond_1

    .line 883
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onLocalQueryGrsFail LocalConcant.APP_SERVICE_NOT_EXIST"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 884
    goto :goto_0

    .line 885
    :cond_1
    const/16 v0, -0x25b

    if-ne v0, p1, :cond_2

    .line 887
    const-string v0, "onLocalQueryGrsFail LocalConcant.NOT_SUPPORT"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 889
    :cond_2
    :goto_0
    return-void
.end method

.method public c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 904
    iget-object v0, p0, Lo/yv$a;->d:Ljava/util/Map;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 7

    .line 824
    const-string v0, "onLocalQueryGrsSuccess."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 825
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 828
    iget-object v0, p0, Lo/yv$a;->e:Lo/yv;

    invoke-static {v0, p1}, Lo/yv;->c(Lo/yv;Ljava/lang/String;)V

    .line 834
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 835
    iget-object v0, p0, Lo/yv$a;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 836
    if-nez v3, :cond_0

    .line 837
    const-string v0, "onLocalQueryGrsSuccess serviceJSONObj null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 838
    return-void

    .line 841
    :cond_0
    :try_start_1
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    .line 843
    goto :goto_0

    .line 844
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 845
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 846
    iget-object v0, p0, Lo/yv$a;->d:Ljava/util/Map;

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 843
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-nez v0, :cond_1

    .line 853
    goto :goto_1

    .line 854
    :catch_0
    move-exception v2

    .line 856
    const-string v0, "onLocalQueryGrsSuccess JSONException: "

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 858
    iget-object v0, p0, Lo/yv$a;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 860
    goto :goto_1

    .line 863
    :cond_2
    const-string v0, "onLocalQueryGrsSuccess result is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->c(Ljava/lang/String;Z)V

    .line 865
    iget-object v0, p0, Lo/yv$a;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 867
    :goto_1
    return-void
.end method
