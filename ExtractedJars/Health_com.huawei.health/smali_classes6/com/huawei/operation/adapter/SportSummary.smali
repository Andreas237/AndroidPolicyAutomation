.class public Lcom/huawei/operation/adapter/SportSummary;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/adapter/SportSummary$SportUnit;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "SportSummary"


# instance fields
.field private date:I

.field private sportType:I

.field private sportUnit:Lcom/huawei/operation/adapter/SportSummary$SportUnit;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configDate(I)V
    .locals 0

    .line 25
    iput p1, p0, Lcom/huawei/operation/adapter/SportSummary;->date:I

    .line 26
    return-void
.end method

.method public configSportType(I)V
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/operation/adapter/SportSummary;->sportType:I

    .line 34
    return-void
.end method

.method public configSportUnit(Lcom/huawei/operation/adapter/SportSummary$SportUnit;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/operation/adapter/SportSummary;->sportUnit:Lcom/huawei/operation/adapter/SportSummary$SportUnit;

    .line 42
    return-void
.end method

.method public getDate()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/operation/adapter/SportSummary;->date:I

    return v0
.end method

.method public getSportType()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/huawei/operation/adapter/SportSummary;->sportType:I

    return v0
.end method

.method public getSportUnit()Lcom/huawei/operation/adapter/SportSummary$SportUnit;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/operation/adapter/SportSummary;->sportUnit:Lcom/huawei/operation/adapter/SportSummary$SportUnit;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 51
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 54
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/huawei/operation/adapter/SportSummary;->sportUnit:Lcom/huawei/operation/adapter/SportSummary$SportUnit;

    invoke-virtual {v0}, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 55
    const-string v0, "date"

    iget v1, p0, Lcom/huawei/operation/adapter/SportSummary;->date:I

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 56
    const-string v0, "sportType"

    iget v1, p0, Lcom/huawei/operation/adapter/SportSummary;->sportType:I

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 57
    const-string v0, "sportUnit"

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    goto :goto_0

    .line 58
    :catch_0
    move-exception v5

    .line 59
    const-string v0, "SportSummary"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportSummary toString error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
