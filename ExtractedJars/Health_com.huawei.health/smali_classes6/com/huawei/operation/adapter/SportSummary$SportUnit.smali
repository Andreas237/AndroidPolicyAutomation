.class public Lcom/huawei/operation/adapter/SportSummary$SportUnit;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/adapter/SportSummary;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SportUnit"
.end annotation


# instance fields
.field private calorie:I

.field private distance:I

.field private steps:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configCalorie(I)V
    .locals 0

    .line 90
    iput p1, p0, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->calorie:I

    .line 91
    return-void
.end method

.method public configDistance(I)V
    .locals 0

    .line 82
    iput p1, p0, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->distance:I

    .line 83
    return-void
.end method

.method public configSteps(I)V
    .locals 0

    .line 74
    iput p1, p0, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->steps:I

    .line 75
    return-void
.end method

.method public getCalorie()I
    .locals 1

    .line 94
    iget v0, p0, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->calorie:I

    return v0
.end method

.method public getDistance()I
    .locals 1

    .line 86
    iget v0, p0, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->distance:I

    return v0
.end method

.method public getSteps()I
    .locals 1

    .line 78
    iget v0, p0, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->steps:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 100
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 102
    const-string v0, "steps"

    :try_start_0
    iget v1, p0, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->steps:I

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 103
    const-string v0, "distance"

    iget v1, p0, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->distance:I

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 104
    const-string v0, "calorie"

    iget v1, p0, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->calorie:I

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_0

    .line 105
    :catch_0
    move-exception v5

    .line 106
    const-string v0, "SportSummary"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportUnit toString error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
