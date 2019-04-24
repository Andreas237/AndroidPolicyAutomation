.class public Lo/dqy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field d:Lo/drg;

.field e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/drb;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    const-class v0, Lo/dqy;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dqy;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dqy;->e:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/drb;>;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lo/dqy;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 8

    .line 19
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 20
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    .line 22
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 24
    :goto_0
    const-string v0, "PairedDeviceList"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 26
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 27
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v6

    .line 28
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_1

    .line 29
    new-instance v5, Lo/drb;

    invoke-direct {v5}, Lo/drb;-><init>()V

    .line 30
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/drb;->d(Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lo/dqy;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 34
    :cond_1
    new-instance v6, Lo/drg;

    invoke-direct {v6}, Lo/drg;-><init>()V

    .line 35
    const-string v0, "PrimaryDevice"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 36
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 37
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/drg;->b(Ljava/lang/String;)V

    .line 39
    :cond_2
    iput-object v6, p0, Lo/dqy;->d:Lo/drg;

    .line 40
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 41
    sget-object v0, Lo/dqy;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PrimaryDevice to json string = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :cond_3
    goto :goto_2

    .line 43
    :catch_0
    move-exception v4

    .line 44
    sget-object v0, Lo/dqy;->b:Ljava/lang/String;

    const-string v1, "Parse response information occured JSONException"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    :goto_2
    return-void
.end method

.method public e()Lo/drg;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/dqy;->d:Lo/drg;

    return-object v0
.end method
