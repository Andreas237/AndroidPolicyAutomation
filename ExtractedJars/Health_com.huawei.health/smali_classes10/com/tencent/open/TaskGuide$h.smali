.class Lcom/tencent/open/TaskGuide$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/TaskGuide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:[Lcom/tencent/open/TaskGuide$g;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 718
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Lorg/json/JSONObject;)Lcom/tencent/open/TaskGuide$h;
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 750
    if-nez p0, :cond_0

    .line 753
    const/4 v0, 0x0

    return-object v0

    .line 760
    :cond_0
    new-instance v7, Lcom/tencent/open/TaskGuide$h;

    invoke-direct {v7}, Lcom/tencent/open/TaskGuide$h;-><init>()V

    .line 761
    const-string v0, "task_info"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    .line 762
    const-string v0, "task_id"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/tencent/open/TaskGuide$h;->a:Ljava/lang/String;

    .line 763
    const-string v0, "task_desc"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/tencent/open/TaskGuide$h;->b:Ljava/lang/String;

    .line 764
    const-string v0, "step_info"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 765
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    .line 767
    if-lez v9, :cond_1

    .line 768
    new-array v0, v9, [Lcom/tencent/open/TaskGuide$g;

    iput-object v0, v7, Lcom/tencent/open/TaskGuide$h;->c:[Lcom/tencent/open/TaskGuide$g;

    .line 771
    :cond_1
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_2

    .line 772
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 773
    const-string v0, "step_no"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 774
    const-string v0, "status"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 775
    const/4 v14, 0x0

    .line 776
    const/4 v15, 0x0

    .line 778
    const-string v0, "step_desc"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 780
    const-string v0, "step_gift"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 784
    const-string v0, "end_time"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v16

    .line 786
    new-instance v0, Lcom/tencent/open/TaskGuide$g;

    move v1, v12

    move-object v2, v14

    move-object v3, v15

    move-wide/from16 v4, v16

    move v6, v13

    invoke-direct/range {v0 .. v6}, Lcom/tencent/open/TaskGuide$g;-><init>(ILjava/lang/String;Ljava/lang/String;JI)V

    move-object/from16 v18, v0

    .line 787
    iget-object v0, v7, Lcom/tencent/open/TaskGuide$h;->c:[Lcom/tencent/open/TaskGuide$g;

    aput-object v18, v0, v10

    .line 771
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 789
    :cond_2
    return-object v7
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 728
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$h;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/tencent/open/TaskGuide$h;->c:[Lcom/tencent/open/TaskGuide$g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/open/TaskGuide$h;->c:[Lcom/tencent/open/TaskGuide$g;

    array-length v0, v0

    if-lez v0, :cond_0

    .line 729
    const/4 v0, 0x1

    return v0

    .line 731
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
